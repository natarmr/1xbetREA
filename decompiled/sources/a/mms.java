package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22057a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final d9a0 i;
    public final d9a0 j;
    public final long k;
    public final List l;
    public final List m;

    public mms(int i, long j, String str, String str2, int i2, String str3, String str4, String str5, d9a0 d9a0Var, d9a0 d9a0Var2, long j2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22057a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = d9a0Var;
        this.j = d9a0Var2;
        this.k = j2;
        this.l = list;
        this.m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mms)) {
            return false;
        }
        mms mmsVar = (mms) obj;
        return this.f22057a == mmsVar.f22057a && this.b == mmsVar.b && this.c.equals(mmsVar.c) && this.d.equals(mmsVar.d) && this.e == mmsVar.e && this.f.equals(mmsVar.f) && this.g.equals(mmsVar.g) && this.h.equals(mmsVar.h) && this.i.equals(mmsVar.i) && this.j.equals(mmsVar.j) && this.k == mmsVar.k && Intrinsics.d(this.l, mmsVar.l) && Intrinsics.d(this.m, mmsVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + dw9.a(rw2.b((this.j.hashCode() + ((this.i.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.e, ua80.b(ua80.b(rw2.b(Integer.hashCode(this.f22057a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f22057a, this.b, "GameModel(gameId=", ", sportId=");
        f140.v(sbQ, ", sportName=", this.c, ", champ=", this.d);
        w6x.w(this.e, ", startTime=", ", rateFirst=", this.f, sbQ);
        f140.v(sbQ, ", rateSecond=", this.g, ", rateDraw=", this.h);
        sbQ.append(", firstPlayer=");
        sbQ.append(this.i);
        sbQ.append(", secondPlayer=");
        sbQ.append(this.j);
        kng0.A(sbQ, ", date=", this.k, ", teamOneImageList=");
        return kng0.n(", teamTwoImageList=", Separators.RPAREN, sbQ, this.l, this.m);
    }
}
