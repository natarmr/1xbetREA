package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class fov implements jov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9902a;

    public fov(String str) {
        this.f9902a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fov) && this.f9902a.equals(((fov) obj).f9902a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_globe_empty) + (this.f9902a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.icon_globe_empty, "FirstTeamImage(url=", this.f9902a, ", placeHolder=", Separators.RPAREN);
    }
}
