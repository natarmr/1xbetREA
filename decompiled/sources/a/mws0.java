package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22521a;
    public final d280 b;
    public final d280 c;
    public final String d;
    public final String e;

    public mws0(String str, d280 d280Var, d280 d280Var2, String str2, String str3) {
        str3.getClass();
        this.f22521a = str;
        this.b = d280Var;
        this.c = d280Var2;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mws0)) {
            return false;
        }
        mws0 mws0Var = (mws0) obj;
        return this.f22521a.equals(mws0Var.f22521a) && this.b.equals(mws0Var.b) && this.c.equals(mws0Var.c) && this.d.equals(mws0Var.d) && Intrinsics.d(this.e, mws0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.e(this.c, twn.e(this.b, this.f22521a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponentsCompactLineEventCardModel(teamOneName=");
        sb.append(this.f22521a);
        sb.append(", teamOneLogo=");
        sb.append(this.b);
        sb.append(", teamTwoLogo=");
        sb.append(this.c);
        sb.append(", teamTwoName=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
