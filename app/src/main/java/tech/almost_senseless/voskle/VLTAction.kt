package tech.almost_senseless.voskle

import tech.almost_senseless.voskle.data.Languages
import tech.almost_senseless.voskle.vosklib.VoskHub

sealed class VLTAction{
    data class UpdateTranscript(val text: String): VLTAction()
    data class UpdateLastLine(val text: String): VLTAction()
    data class SetLanguage(val language: Languages): VLTAction()
    data class SetRecordingStatus(val status: Boolean): VLTAction()
    data class SetModelStatus(val status: Boolean): VLTAction()
    data class SetLanguagePickerState(val expanded: Boolean): VLTAction()
    data class ShowSettingsDialog(val display: Boolean): VLTAction()
    data class ShowPermissionsDialog(val display: Boolean): VLTAction()
    object ClearTranscript: VLTAction()
    data class SetTranscriptFontRatio(val ratio: Float): VLTAction()
    data class ShowDownloadConfirmation(val display: Boolean): VLTAction()
    data class DownloadModel(val downloadFunction: (VLTViewModel, String) -> Unit, val modelPath: String): VLTAction()
    data class ShowDownloadSuccess(val display: Boolean): VLTAction()
    data class SetError(val error: ErrorKind): VLTAction()
    object DismissError: VLTAction()
    data class ToggleAutoscroll(val autoscroll: Boolean): VLTAction()
    data class RegisterVoskHub(val voskHub: VoskHub): VLTAction()
    data class UpdateFetchState(val state: FetchState): VLTAction()
}
