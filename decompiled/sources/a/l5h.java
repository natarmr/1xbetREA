package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l5h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19455a;
    public final n0x b;
    public final String c;
    public final String d;
    public final m0x e;
    public final String f;
    public final long g;
    public final m0x h;
    public final String i;
    public final long j;

    public l5h(String str, n0x n0xVar, String str2, String str3, m0x m0xVar, String str4, long j, m0x m0xVar2, String str5, long j2) {
        str2.getClass();
        str3.getClass();
        this.f19455a = str;
        this.b = n0xVar;
        this.c = str2;
        this.d = str3;
        this.e = m0xVar;
        this.f = str4;
        this.g = j;
        this.h = m0xVar2;
        this.i = str5;
        this.j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5h)) {
            return false;
        }
        l5h l5hVar = (l5h) obj;
        if (!this.f19455a.equals(l5hVar.f19455a) || !this.b.equals(l5hVar.b) || !Intrinsics.d(this.c, l5hVar.c) || !Intrinsics.d(this.d, l5hVar.d) || !this.e.equals(l5hVar.e) || !this.f.equals(l5hVar.f)) {
            return false;
        }
        long j = l5hVar.g;
        int i = y3d.h;
        return h2t0.a(this.g, j) && this.h.equals(l5hVar.h) && this.i.equals(l5hVar.i) && h2t0.a(this.j, l5hVar.j);
    }

    public final int hashCode() {
        int iB = ua80.b(cs0.a(this.e, ua80.b(ua80.b(f140.f(this.b, this.f19455a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.j) + ua80.b(cs0.a(this.h, rw2.b(iB, 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        String strI = y3d.i(this.g);
        String strI2 = y3d.i(this.j);
        StringBuilder sb = new StringBuilder("CyberMapCollectionItemUiModel(id=");
        sb.append(this.f19455a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        f140.v(sb, this.c, ", subtitle=", this.d, ", firstIcon=");
        sb.append(this.e);
        sb.append(", firstPercent=");
        sb.append(this.f);
        sb.append(", firstTint=");
        sb.append(strI);
        sb.append(", secondIcon=");
        sb.append(this.h);
        sb.append(", secondPercent=");
        return ua80.m(sb, this.i, ", secondTint=", strI2, Separators.RPAREN);
    }
}
