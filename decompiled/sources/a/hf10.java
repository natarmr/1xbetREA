package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class hf10 implements kf10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f12952a;

    public hf10(DialogFields dialogFields) {
        this.f12952a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf10) && this.f12952a.equals(((hf10) obj).f12952a);
    }

    public final int hashCode() {
        return this.f12952a.hashCode();
    }

    public final String toString() {
        return "ShowApplyOperation(dialogFields=" + this.f12952a + Separators.RPAREN;
    }
}
