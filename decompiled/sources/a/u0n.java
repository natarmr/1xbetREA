package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u0n implements x0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1n f34861a;
    public final a1n b;
    public final f2i c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final r0n i;
    public final xem j;

    public u0n(f2i f2iVar, xem xemVar, r0n r0nVar, a1n a1nVar, a1n a1nVar2, String str, String str2, String str3, String str4, String str5) {
        cs0.x(str, str2, str4, str5);
        this.f34861a = a1nVar;
        this.b = a1nVar2;
        this.c = f2iVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = r0nVar;
        this.j = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0n)) {
            return false;
        }
        u0n u0nVar = (u0n) obj;
        return this.f34861a.equals(u0nVar.f34861a) && this.b.equals(u0nVar.b) && Intrinsics.d(this.c, u0nVar.c) && Intrinsics.d(this.d, u0nVar.d) && Intrinsics.d(this.e, u0nVar.e) && this.f.equals(u0nVar.f) && Intrinsics.d(this.g, u0nVar.g) && Intrinsics.d(this.h, u0nVar.h) && this.i.equals(u0nVar.i) && this.j.equals(u0nVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f34861a.hashCode() * 31)) * 31;
        f2i f2iVar = this.c;
        return this.j.hashCode() + ((this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (f2iVar == null ? 0 : f2iVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V2(firstOpponentModel=");
        sb.append(this.f34861a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", broadcastIndicatorModel=");
        sb.append(this.c);
        sb.append(", tagLiveText=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        f140.v(sb, this.e, ", scoreGameTitle=", this.f, ", scoreSetTitle=");
        f140.v(sb, this.g, ", scoreResultTitle=", this.h, ", options=");
        sb.append(this.i);
        sb.append(", gameIndicator=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
