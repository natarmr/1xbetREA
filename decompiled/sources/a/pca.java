package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pca implements mca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpp0 f26749a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;

    public pca(rpp0 rpp0Var, String str, String str2, boolean z, String str3, String str4, String str5, long j, String str6, String str7, String str8) {
        str4.getClass();
        str5.getClass();
        this.f26749a = rpp0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pca)) {
            return false;
        }
        pca pcaVar = (pca) obj;
        return this.f26749a.equals(pcaVar.f26749a) && this.b.equals(pcaVar.b) && this.c.equals(pcaVar.c) && this.d == pcaVar.d && this.e.equals(pcaVar.e) && Intrinsics.d(this.f, pcaVar.f) && Intrinsics.d(this.g, pcaVar.g) && this.h == pcaVar.h && this.i.equals(pcaVar.i) && this.j.equals(pcaVar.j) && this.k.equals(pcaVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(this.f26749a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCommonCricketLiveModel(teamsInfoModel=");
        sb.append(this.f26749a);
        sb.append(", teamOneImageUrl=");
        sb.append(this.b);
        sb.append(", teamTwoImageUrl=");
        brm0.C(this.c, ", finished=", ", matchFormat=", sb, this.d);
        f140.v(sb, this.e, ", vid=", this.f, ", dopInfo=");
        defpackage.c.i(sb, this.h, this.g, ", sportId=");
        f140.v(sb, ", tournamentStage=", this.i, ", seriesScore=", this.j);
        return rw2.o(sb, ", locationCountry=", this.k, Separators.RPAREN);
    }
}
