package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes5.dex */
public final class tqc0 implements yqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f34375a;

    public tqc0(DialogFields dialogFields) {
        this.f34375a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqc0) && this.f34375a.equals(((tqc0) obj).f34375a);
    }

    public final int hashCode() {
        return this.f34375a.hashCode();
    }

    public final String toString() {
        return "ShowChangeBalanceToPrimaryDialog(dialogFields=" + this.f34375a + Separators.RPAREN;
    }
}
