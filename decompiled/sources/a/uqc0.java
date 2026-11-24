package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes5.dex */
public final class uqc0 implements yqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f36112a;

    public uqc0(DialogFields dialogFields) {
        this.f36112a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqc0) && this.f36112a.equals(((uqc0) obj).f36112a);
    }

    public final int hashCode() {
        return this.f36112a.hashCode();
    }

    public final String toString() {
        return "ShowErrorMessage(dialogFields=" + this.f36112a + Separators.RPAREN;
    }
}
