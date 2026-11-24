package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eoh implements foh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8139a;
    public final n0x b;
    public final String c;
    public final String d;
    public final String e;
    public final a4x f;
    public final f7v0 g;

    public eoh(long j, n0x n0xVar, String str, String str2, String str3, a4x a4xVar, f7v0 f7v0Var) {
        w6x.x(a4xVar, str, str3);
        this.f8139a = j;
        this.b = n0xVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = a4xVar;
        this.g = f7v0Var;
    }

    @Override // a.foh
    public final String a() {
        return this.c;
    }

    @Override // a.foh
    public final String b() {
        return this.d;
    }

    @Override // a.foh
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoh)) {
            return false;
        }
        eoh eohVar = (eoh) obj;
        return this.f8139a == eohVar.f8139a && this.b.equals(eohVar.b) && Intrinsics.d(this.c, eohVar.c) && this.d.equals(eohVar.d) && Intrinsics.d(this.e, eohVar.e) && Intrinsics.d(this.f, eohVar.f) && this.g == eohVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + cs0.b(this.f, ua80.b(ua80.b(ua80.b(f140.f(this.b, Long.hashCode(this.f8139a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interactive(id=");
        sb.append(this.f8139a);
        sb.append(", fighterPicture=");
        sb.append(this.b);
        f140.v(sb, ", categoryLabel=", this.c, ", fighterNameLabel=", this.d);
        sb.append(", championLabel=");
        sb.append(this.e);
        sb.append(", fightersPictures=");
        sb.append(this.f);
        sb.append(", weightClass=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
