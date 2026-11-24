package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class enn implements hnn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f8103a;

    public final boolean equals(Object obj) {
        if (obj instanceof enn) {
            return this.f8103a.equals(((enn) obj).f8103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8103a.hashCode();
    }

    public final String toString() {
        return "ShowActionDialog(dialogFields=" + this.f8103a + Separators.RPAREN;
    }
}
