package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class une0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35957a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final String g;

    public une0(String str, double d, String str2, String str3, String str4, ArrayList arrayList, String str5) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f35957a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = arrayList;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof une0)) {
            return false;
        }
        une0 une0Var = (une0) obj;
        return Intrinsics.d(this.f35957a, une0Var.f35957a) && Double.compare(this.b, une0Var.b) == 0 && Intrinsics.d(this.c, une0Var.c) && Intrinsics.d(this.d, une0Var.d) && Intrinsics.d(this.e, une0Var.e) && this.f.equals(une0Var.f) && Intrinsics.d(this.g, une0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.g(this.f, ua80.b(ua80.b(ua80.b(brm0.d(this.b, this.f35957a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralNetworkUiModel(userBalanceWithCurrency=");
        sb.append(this.f35957a);
        sb.append(", userBalanceValue=");
        sb.append(this.b);
        f140.v(sb, ", userFullBalance=", this.c, ", userHoldBalance=", this.d);
        sb.append(", referralUrl=");
        sb.append(this.e);
        sb.append(", referralUsers=");
        sb.append(this.f);
        return rw2.o(sb, ", currentData=", this.g, Separators.RPAREN);
    }
}
