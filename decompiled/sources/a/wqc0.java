package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes5.dex */
public final class wqc0 implements yqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f39584a;

    public wqc0(DialogFields dialogFields) {
        this.f39584a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqc0) && this.f39584a.equals(((wqc0) obj).f39584a);
    }

    public final int hashCode() {
        return this.f39584a.hashCode();
    }

    public final String toString() {
        return "ShowPromoBoughtForGameMessage(dialogFields=" + this.f39584a + Separators.RPAREN;
    }
}
