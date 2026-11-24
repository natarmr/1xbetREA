package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes2.dex */
public final class jxu0 implements sxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f17328a;

    public jxu0(DialogFields dialogFields) {
        this.f17328a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxu0) && this.f17328a.equals(((jxu0) obj).f17328a);
    }

    public final int hashCode() {
        return this.f17328a.hashCode();
    }

    public final String toString() {
        return "AccountActivationError(dialogFields=" + this.f17328a + Separators.RPAREN;
    }
}
