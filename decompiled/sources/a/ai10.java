package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ai10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f903a;
    public final String b;
    public final String c;
    public final th10 d;
    public final ArrayList e;

    public ai10(int i, String str, String str2, th10 th10Var, ArrayList arrayList) {
        str.getClass();
        this.f903a = i;
        this.b = str;
        this.c = str2;
        this.d = th10Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai10)) {
            return false;
        }
        ai10 ai10Var = (ai10) obj;
        return this.f903a == ai10Var.f903a && Intrinsics.d(this.b, ai10Var.b) && this.c.equals(ai10Var.c) && this.d.equals(ai10Var.d) && this.e.equals(ai10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f903a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f903a, "LoyaltyProgramInfoModel(id=", ", name=", this.b, ", placeholderLevelIconUrl=");
        sbR.append(this.c);
        sbR.append(", currencyModel=");
        sbR.append(this.d);
        sbR.append(", levels=");
        return rz4.n(sbR, this.e, Separators.RPAREN);
    }
}
