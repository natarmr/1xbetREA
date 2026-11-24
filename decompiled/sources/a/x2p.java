package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zrm f40179a;
    public final long b;
    public final long c;
    public final long d;
    public final sgb e;
    public final long f;
    public final String g;
    public final int h;

    public x2p(zrm zrmVar, long j, long j2, long j3, sgb sgbVar, long j4, String str, int i) {
        sgbVar.getClass();
        this.f40179a = zrmVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = sgbVar;
        this.f = j4;
        this.g = str;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2p)) {
            return false;
        }
        x2p x2pVar = (x2p) obj;
        return this.f40179a.equals(x2pVar.f40179a) && this.b == x2pVar.b && this.c == x2pVar.c && this.d == x2pVar.d && Intrinsics.d(this.e, x2pVar.e) && this.f == x2pVar.f && this.g.equals(x2pVar.g) && this.h == x2pVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + ua80.b(rw2.b((this.e.hashCode() + rw2.b(rw2.b(rw2.b(this.f40179a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteAltChampsUiModel(style=");
        sb.append(this.f40179a);
        sb.append(", id=");
        sb.append(this.b);
        kng0.A(sb, ", sportId=", this.c, ", subSportId=");
        sb.append(this.d);
        sb.append(", champType=");
        sb.append(this.e);
        kng0.A(sb, ", globalChampId=", this.f, ", title=");
        return brm0.j(this.h, this.g, ", cyberType=", Separators.RPAREN, sb);
    }
}
