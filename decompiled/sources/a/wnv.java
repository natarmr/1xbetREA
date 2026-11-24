package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wnv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39466a;

    public wnv(String str) {
        this.f39466a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnv) && this.f39466a.equals(((wnv) obj).f39466a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_globe_empty) + (this.f39466a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.icon_globe_empty, "SecondTeamImage(url=", this.f39466a, ", placeHolder=", Separators.RPAREN);
    }
}
