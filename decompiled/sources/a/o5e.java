package a;

import android.gov.nist.core.Separators;
import org.xplatform.consultantchat.presentation.dialogs.file.model.FileBottomDialogResult;

/* JADX INFO: loaded from: classes3.dex */
public final class o5e implements s5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileBottomDialogResult f24683a;

    public o5e(FileBottomDialogResult fileBottomDialogResult) {
        this.f24683a = fileBottomDialogResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5e) && this.f24683a.equals(((o5e) obj).f24683a);
    }

    public final int hashCode() {
        return this.f24683a.hashCode();
    }

    public final String toString() {
        return "SendResult(result=" + this.f24683a + Separators.RPAREN;
    }
}
