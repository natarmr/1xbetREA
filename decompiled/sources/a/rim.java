package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rim implements tim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30550a;
    public final String b;
    public final lnm c;
    public final lnm d;
    public final String e;
    public final x6n f;
    public final y6n g;
    public final ggm h;
    public final boolean i;

    public rim(String str, String str2, lnm lnmVar, lnm lnmVar2, String str3, x6n x6nVar, y6n y6nVar, ggm ggmVar, boolean z) {
        str.getClass();
        str3.getClass();
        this.f30550a = str;
        this.b = str2;
        this.c = lnmVar;
        this.d = lnmVar2;
        this.e = str3;
        this.f = x6nVar;
        this.g = y6nVar;
        this.h = ggmVar;
        this.i = z;
    }

    @Override // a.tim
    public final y6n a() {
        return this.g;
    }

    @Override // a.tim
    public final ggm b() {
        return this.h;
    }

    @Override // a.tim
    public final String c() {
        return this.f30550a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rim)) {
            return false;
        }
        rim rimVar = (rim) obj;
        return Intrinsics.d(this.f30550a, rimVar.f30550a) && this.b.equals(rimVar.b) && this.c.equals(rimVar.c) && Intrinsics.d(this.d, rimVar.d) && Intrinsics.d(this.e, rimVar.e) && Intrinsics.d(this.f, rimVar.f) && this.g == rimVar.g && this.h == rimVar.h && this.i == rimVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ua80.b(this.f30550a.hashCode() * 31, 31, this.b)) * 31;
        lnm lnmVar = this.d;
        int iB = ua80.b((iHashCode + (lnmVar == null ? 0 : lnmVar.hashCode())) * 31, 31, this.e);
        x6n x6nVar = this.f;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((iB + (x6nVar != null ? x6nVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("WithPlayers(eventTime=", this.f30550a, ", actionImgUrl=", this.b, ", player=");
        sbN.append(this.c);
        sbN.append(", assistant=");
        sbN.append(this.d);
        sbN.append(", eventNote=");
        sbN.append(this.e);
        sbN.append(", team=");
        sbN.append(this.f);
        sbN.append(", teamPosition=");
        sbN.append(this.g);
        sbN.append(", eventPositionInSection=");
        sbN.append(this.h);
        sbN.append(", typeIsChange=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
