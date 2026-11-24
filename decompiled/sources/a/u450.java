package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class u450 implements z450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f35029a;

    public u450(DialogFields dialogFields) {
        this.f35029a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u450) && this.f35029a.equals(((u450) obj).f35029a);
    }

    public final int hashCode() {
        return this.f35029a.hashCode();
    }

    public final String toString() {
        return "ShowCollectCashbackDialog(dialogFields=" + this.f35029a + Separators.RPAREN;
    }
}
