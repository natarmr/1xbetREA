package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class snv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32513a;

    public snv(String str) {
        this.f32513a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snv) && this.f32513a.equals(((snv) obj).f32513a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_globe_empty) + (this.f32513a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.icon_globe_empty, "FirstTeamImage(url=", this.f32513a, ", placeHolder=", Separators.RPAREN);
    }
}
