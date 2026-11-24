package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ul8 implements vl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35859a;
    public final imm b;
    public final boolean c;
    public final ijl d;
    public final jjl e;
    public final gjl f;
    public final bgi0 g;
    public final long h;
    public final boolean i;
    public final mdm j;

    public ul8(long j, imm immVar, boolean z, ijl ijlVar, jjl jjlVar, gjl gjlVar, bgi0 bgi0Var, long j2, boolean z2, mdm mdmVar) {
        immVar.getClass();
        ijlVar.getClass();
        jjlVar.getClass();
        gjlVar.getClass();
        bgi0Var.getClass();
        mdmVar.getClass();
        this.f35859a = j;
        this.b = immVar;
        this.c = z;
        this.d = ijlVar;
        this.e = jjlVar;
        this.f = gjlVar;
        this.g = bgi0Var;
        this.h = j2;
        this.i = z2;
        this.j = mdmVar;
    }

    @Override // a.vl8
    public final imm a() {
        return this.b;
    }

    @Override // a.vl8
    public final ijl c() {
        return this.d;
    }

    @Override // a.vl8
    public final jjl d() {
        return this.e;
    }

    @Override // a.vl8
    public final gjl e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul8)) {
            return false;
        }
        ul8 ul8Var = (ul8) obj;
        long j = ul8Var.f35859a;
        int i = y3d.h;
        return h2t0.a(this.f35859a, j) && Intrinsics.d(this.b, ul8Var.b) && this.c == ul8Var.c && this.d == ul8Var.d && Intrinsics.d(this.e, ul8Var.e) && this.f == ul8Var.f && Intrinsics.d(this.g, ul8Var.g) && h2t0.a(this.h, ul8Var.h) && this.i == ul8Var.i && Intrinsics.d(this.j, ul8Var.j);
    }

    @Override // a.vl8
    public final boolean f() {
        return this.i;
    }

    @Override // a.vl8
    public final boolean g() {
        return this.c;
    }

    @Override // a.vl8
    public final long h() {
        return this.h;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.j.hashCode() + brm0.e(rw2.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(h97.a(this.b, Long.hashCode(this.f35859a) * 31, 31), 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i);
    }

    @Override // a.vl8
    public final long i() {
        return this.f35859a;
    }

    @Override // a.vl8
    public final bgi0 j() {
        return this.g;
    }

    public final String toString() {
        return "Error(screenBgColor=" + y3d.i(this.f35859a) + ", navBarUiModel=" + this.b + ", accountSelectionVisible=" + this.c + ", accountSelectionStyle=" + this.d + ", accountSelectionUiModel=" + this.e + ", accountSelectionColorMode=" + this.f + ", topContentSeparatorStyle=" + this.g + ", systemBarsColor=" + y3d.i(this.h) + ", tabBarVisible=" + this.i + ", config=" + this.j + Separators.RPAREN;
    }
}
