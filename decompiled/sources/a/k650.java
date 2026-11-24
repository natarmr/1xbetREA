package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class k650 implements o650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f17751a;

    public k650(DialogFields dialogFields) {
        this.f17751a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k650) && this.f17751a.equals(((k650) obj).f17751a);
    }

    public final int hashCode() {
        return this.f17751a.hashCode();
    }

    public final String toString() {
        return "ShowCollectCashbackDialog(dialogFields=" + this.f17751a + Separators.RPAREN;
    }
}
