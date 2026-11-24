package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class epn implements hpn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f8197a;

    public epn(DialogFields dialogFields) {
        this.f8197a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epn) && this.f8197a.equals(((epn) obj).f8197a);
    }

    public final int hashCode() {
        return this.f8197a.hashCode();
    }

    public final String toString() {
        return "ShowActionDialog(dialogFields=" + this.f8197a + Separators.RPAREN;
    }
}
