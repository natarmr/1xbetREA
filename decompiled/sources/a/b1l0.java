package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class b1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f1812a;

    public final boolean equals(Object obj) {
        if (obj instanceof b1l0) {
            return this.f1812a.equals(((b1l0) obj).f1812a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1812a.hashCode();
    }

    public final String toString() {
        return "AlertDialog(value=" + this.f1812a + Separators.RPAREN;
    }
}
