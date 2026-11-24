package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2163a;
    public final String b;
    public final String c;

    public b8l(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f2163a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8l)) {
            return false;
        }
        b8l b8lVar = (b8l) obj;
        return Intrinsics.d(this.f2163a, b8lVar.f2163a) && this.b.equals(b8lVar.b) && Intrinsics.d(this.c, b8lVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_radiant_dot) + ua80.b(ua80.b(this.f2163a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return brm0.j(R.drawable.dota_radiant_dot, this.c, ", sideIcon=", Separators.RPAREN, b1j.n("RadiantTeam(name=", this.f2163a, ", icon=", this.b, ", sideTitle="));
    }
}
