package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public final class jf10 implements kf10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f16403a;

    public jf10(DialogFields dialogFields) {
        this.f16403a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf10) && this.f16403a.equals(((jf10) obj).f16403a);
    }

    public final int hashCode() {
        return this.f16403a.hashCode();
    }

    public final String toString() {
        return "ShowOperationSuccess(dialogFields=" + this.f16403a + Separators.RPAREN;
    }
}
