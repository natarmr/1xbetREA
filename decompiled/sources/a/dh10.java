package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public final class dh10 implements fh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f6072a;

    public dh10(DialogFields dialogFields) {
        this.f6072a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh10) && this.f6072a.equals(((dh10) obj).f6072a);
    }

    public final int hashCode() {
        return this.f6072a.hashCode();
    }

    public final String toString() {
        return "ShowOperationError(dialogFields=" + this.f6072a + Separators.RPAREN;
    }
}
