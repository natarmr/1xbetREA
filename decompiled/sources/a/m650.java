package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class m650 implements o650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f21252a;

    public m650(DialogFields dialogFields) {
        this.f21252a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m650) && this.f21252a.equals(((m650) obj).f21252a);
    }

    public final int hashCode() {
        return this.f21252a.hashCode();
    }

    public final String toString() {
        return "ShowFavoriteError(dialogFields=" + this.f21252a + Separators.RPAREN;
    }
}
