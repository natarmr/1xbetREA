package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class hov implements jov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13412a;

    public hov(String str) {
        this.f13412a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hov) && this.f13412a.equals(((hov) obj).f13412a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_globe_empty) + (this.f13412a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.icon_globe_empty, "SecondTeamImage(url=", this.f13412a, ", placeHolder=", Separators.RPAREN);
    }
}
