package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public final class rhr0 implements xhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f30504a;

    public rhr0(DialogFields dialogFields) {
        this.f30504a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhr0) && this.f30504a.equals(((rhr0) obj).f30504a);
    }

    public final int hashCode() {
        return this.f30504a.hashCode();
    }

    public final String toString() {
        return "ShowActionDialog(dialogFields=" + this.f30504a + Separators.RPAREN;
    }
}
