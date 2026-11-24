package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33473a;
    public final String b;
    public final String c;

    public t7l(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f33473a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7l)) {
            return false;
        }
        t7l t7lVar = (t7l) obj;
        return Intrinsics.d(this.f33473a, t7lVar.f33473a) && this.b.equals(t7lVar.b) && Intrinsics.d(this.c, t7lVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_dire_dot) + ua80.b(ua80.b(this.f33473a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return brm0.j(R.drawable.dota_dire_dot, this.c, ", sideIcon=", Separators.RPAREN, b1j.n("DireTeam(name=", this.f33473a, ", icon=", this.b, ", sideTitle="));
    }
}
