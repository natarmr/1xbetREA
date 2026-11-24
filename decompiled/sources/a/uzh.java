package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class uzh implements wzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hnl f36534a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final a4x j;
    public final a4x k;
    public final boolean l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final byte q;
    public final ovl r;
    public final q7n s;
    public final tzh t;

    /* JADX WARN: Multi-variable type inference failed */
    public uzh(hnl hnlVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, a4x a4xVar, a4x a4xVar2, boolean z, String str9, String str10, String str11, String str12, int i, ovl ovlVar, q7n q7nVar, tzh tzhVar) {
        str.getClass();
        str6.getClass();
        this.f36534a = hnlVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = a4xVar;
        this.k = a4xVar2;
        this.l = z;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = str12;
        this.q = i;
        this.r = ovlVar;
        this.s = q7nVar;
        this.t = tzhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzh)) {
            return false;
        }
        uzh uzhVar = (uzh) obj;
        return this.f36534a.equals(uzhVar.f36534a) && Intrinsics.d(this.b, uzhVar.b) && this.c.equals(uzhVar.c) && this.d.equals(uzhVar.d) && this.e.equals(uzhVar.e) && this.f.equals(uzhVar.f) && Intrinsics.d(this.g, uzhVar.g) && Intrinsics.d(this.h, uzhVar.h) && Intrinsics.d(this.i, uzhVar.i) && Intrinsics.d(this.j, uzhVar.j) && Intrinsics.d(this.k, uzhVar.k) && this.l == uzhVar.l && Intrinsics.d(this.m, uzhVar.m) && Intrinsics.d(this.n, uzhVar.n) && Intrinsics.d(this.o, uzhVar.o) && Intrinsics.d(this.p, uzhVar.p) && this.q == uzhVar.q && this.r.equals(uzhVar.r) && this.s.equals(uzhVar.s) && this.t.equals(uzhVar.t);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f36534a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a4x a4xVar = this.j;
        int iHashCode3 = (iHashCode2 + (a4xVar == null ? 0 : a4xVar.hashCode())) * 31;
        a4x a4xVar2 = this.k;
        int iE = brm0.e((iHashCode3 + (a4xVar2 == null ? 0 : a4xVar2.hashCode())) * 31, 31, this.l);
        String str3 = this.m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        return Integer.hashCode(R.drawable.ic_glyph_quick_bet_inactive) + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + twn.a(this.q, (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(style=");
        sb.append(this.f36534a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tagName=");
        f140.v(sb, this.c, ", pictureUrl=", this.d, ", amount=");
        f140.v(sb, this.e, ", providersTitle=", this.f, ", gamesTitle=");
        f140.v(sb, this.g, ", firstLabelTitle=", this.h, ", secondLabelTitle=");
        cs0.B(sb, this.i, ", providersList=", this.j, ", gameList=");
        sb.append(this.k);
        sb.append(", isCloseButtonAdded=");
        sb.append(this.l);
        sb.append(", firstLabelValue=");
        f140.v(sb, this.m, ", secondLabelValue=", this.n, ", firstButtonText=");
        f140.v(sb, this.o, ", secondButtonText=", this.p, ", progress=");
        sb.append((int) this.q);
        sb.append(", dsCellWagerUiModel=");
        sb.append(this.r);
        sb.append(", dsTimerCellUiModel=");
        sb.append(this.s);
        sb.append(", separators=");
        sb.append(this.t);
        sb.append(", iconResId=");
        return rz4.j(R.drawable.ic_glyph_quick_bet_inactive, Separators.RPAREN, sb);
    }
}
