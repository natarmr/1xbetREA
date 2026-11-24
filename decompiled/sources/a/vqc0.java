package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes5.dex */
public final class vqc0 implements yqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f37851a;

    public vqc0(DialogFields dialogFields) {
        this.f37851a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqc0) && this.f37851a.equals(((vqc0) obj).f37851a);
    }

    public final int hashCode() {
        return this.f37851a.hashCode();
    }

    public final String toString() {
        return "ShowNewPromoBoughtForGameMessage(dialogFields=" + this.f37851a + Separators.RPAREN;
    }
}
