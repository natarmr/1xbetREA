package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class e4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7186a;

    public e4k0(String str) {
        this.f7186a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4k0) && this.f7186a.equals(((e4k0) obj).f7186a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_globe_empty) + (this.f7186a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.icon_globe_empty, "EnemyTeamImage(url=", this.f7186a, ", teamPlaceHolder=", Separators.RPAREN);
    }
}
