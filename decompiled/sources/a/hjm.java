package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hjm implements jjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f13167a;
    public final pjm b;
    public final y3d c;
    public final o0x d;
    public final y3d e;
    public final o0x f;
    public final boolean g;
    public final CharSequence h;
    public final sso0 i;
    public final boolean j;
    public final xe9 k;
    public final Integer l;
    public final Integer m;

    public hjm(CharSequence charSequence, pjm pjmVar, y3d y3dVar, o0x o0xVar, y3d y3dVar2, m0x m0xVar, boolean z, CharSequence charSequence2, sso0 sso0Var, boolean z2, ue9 ue9Var, Integer num, int i) {
        pjmVar = (i & 2) != 0 ? new mjm(127) : pjmVar;
        y3dVar = (i & 4) != 0 ? null : y3dVar;
        o0xVar = (i & 8) != 0 ? null : o0xVar;
        y3dVar2 = (i & 16) != 0 ? null : y3dVar2;
        m0xVar = (i & 32) != 0 ? null : m0xVar;
        z = (i & 64) != 0 ? false : z;
        charSequence2 = (i & 128) != 0 ? null : charSequence2;
        sso0Var = (i & 256) != 0 ? null : sso0Var;
        z2 = (i & 512) != 0 ? true : z2;
        ue9Var = (i & 1024) != 0 ? null : ue9Var;
        num = (i & 4096) != 0 ? null : num;
        charSequence.getClass();
        this.f13167a = charSequence;
        this.b = pjmVar;
        this.c = y3dVar;
        this.d = o0xVar;
        this.e = y3dVar2;
        this.f = m0xVar;
        this.g = z;
        this.h = charSequence2;
        this.i = sso0Var;
        this.j = z2;
        this.k = ue9Var;
        this.l = null;
        this.m = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjm)) {
            return false;
        }
        hjm hjmVar = (hjm) obj;
        return Intrinsics.d(this.f13167a, hjmVar.f13167a) && this.b.equals(hjmVar.b) && Intrinsics.d(this.c, hjmVar.c) && Intrinsics.d(this.d, hjmVar.d) && Intrinsics.d(this.e, hjmVar.e) && Intrinsics.d(this.f, hjmVar.f) && this.g == hjmVar.g && Intrinsics.d(this.h, hjmVar.h) && Intrinsics.d(this.i, hjmVar.i) && this.j == hjmVar.j && Intrinsics.d(this.k, hjmVar.k) && Intrinsics.d(this.l, hjmVar.l) && Intrinsics.d(this.m, hjmVar.m);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = (this.b.hashCode() + (this.f13167a.hashCode() * 31)) * 31;
        y3d y3dVar = this.c;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode3 + iHashCode) * 31;
        o0x o0xVar = this.d;
        int iHashCode4 = (i + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31;
        y3d y3dVar2 = this.e;
        if (y3dVar2 == null) {
            iHashCode2 = 0;
        } else {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        int i2 = (iHashCode4 + iHashCode2) * 31;
        o0x o0xVar2 = this.f;
        int iE = brm0.e((i2 + (o0xVar2 == null ? 0 : o0xVar2.hashCode())) * 31, 31, this.g);
        CharSequence charSequence = this.h;
        int iHashCode5 = (iE + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        sso0 sso0Var = this.i;
        int iE2 = brm0.e((iHashCode5 + (sso0Var == null ? 0 : sso0Var.hashCode())) * 31, 31, this.j);
        xe9 xe9Var = this.k;
        int iHashCode6 = (iE2 + (xe9Var == null ? 0 : xe9Var.hashCode())) * 31;
        Integer num = this.l;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.m;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(label=");
        sb.append((Object) this.f13167a);
        sb.append(", headerStyle=");
        sb.append(this.b);
        sb.append(", labelColor=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", iconTint=");
        sb.append(this.e);
        sb.append(", placeHolder=");
        sb.append(this.f);
        sb.append(", showBadge=");
        sb.append(this.g);
        sb.append(", tag=");
        sb.append((Object) this.h);
        sb.append(", tagStyle=");
        sb.append(this.i);
        sb.append(", shouldTintIcon=");
        sb.append(this.j);
        sb.append(", buttonStyle=");
        sb.append(this.k);
        sb.append(", buttonIconResId=");
        sb.append(this.l);
        sb.append(", counterValue=");
        return dw9.q(sb, this.m, Separators.RPAREN);
    }
}
