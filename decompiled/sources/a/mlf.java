package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mlf extends slf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21987a;
    public final wpf b;
    public final String c;
    public final wpf d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final wpf l;
    public final String m;
    public final wpf n;
    public final int o;
    public final int p;

    public mlf(String str, wpf wpfVar, String str2, wpf wpfVar2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, wpf wpfVar3, String str5, wpf wpfVar4, int i, int i2) {
        this.f21987a = str;
        this.b = wpfVar;
        this.c = str2;
        this.d = wpfVar2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = str4;
        this.l = wpfVar3;
        this.m = str5;
        this.n = wpfVar4;
        this.o = i;
        this.p = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlf)) {
            return false;
        }
        mlf mlfVar = (mlf) obj;
        return this.f21987a.equals(mlfVar.f21987a) && this.b == mlfVar.b && this.c.equals(mlfVar.c) && this.d == mlfVar.d && this.e.equals(mlfVar.e) && this.f == mlfVar.f && this.g == mlfVar.g && this.h == mlfVar.h && this.i == mlfVar.i && this.j == mlfVar.j && this.k.equals(mlfVar.k) && this.l == mlfVar.l && this.m.equals(mlfVar.m) && this.n == mlfVar.n && this.o == mlfVar.o && this.p == mlfVar.p;
    }

    public final int hashCode() {
        return Integer.hashCode(this.p) + twn.a(this.o, (this.n.hashCode() + ua80.b((this.l.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b((this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f21987a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2KillGameLogModel(killer=");
        sb.append(this.f21987a);
        sb.append(", killerSide=");
        sb.append(this.b);
        sb.append(", victim=");
        sb.append(this.c);
        sb.append(", victimSide=");
        sb.append(this.d);
        sb.append(", weapon=");
        brm0.C(this.e, ", headShot=", ", penetrated=", sb, this.f);
        ua80.u(", throughSmoke=", ", noScope=", sb, this.g, this.h);
        ua80.u(", killerBlind=", ", assister=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", assisterSide=");
        sb.append(this.l);
        sb.append(", flasher=");
        sb.append(this.m);
        sb.append(", flasherSide=");
        sb.append(this.n);
        sb.append(", killXPosition=");
        return w6x.o(this.o, this.p, ", killYPosition=", Separators.RPAREN, sb);
    }
}
