package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public final class if10 implements kf10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f14664a;

    public if10(DialogFields dialogFields) {
        this.f14664a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if10) && this.f14664a.equals(((if10) obj).f14664a);
    }

    public final int hashCode() {
        return this.f14664a.hashCode();
    }

    public final String toString() {
        return "ShowOperationError(dialogFields=" + this.f14664a + Separators.RPAREN;
    }
}
