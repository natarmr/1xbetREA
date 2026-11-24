package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class g110 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10487a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public g110(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, boolean z, boolean z2) {
        brm0.B(str2, str5, str6);
        this.f10487a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = str7;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g110)) {
            return false;
        }
        g110 g110Var = (g110) obj;
        return this.f10487a.equals(g110Var.f10487a) && Intrinsics.d(this.b, g110Var.b) && this.c.equals(g110Var.c) && this.d.equals(g110Var.d) && Intrinsics.d(this.e, g110Var.e) && Intrinsics.d(this.f, g110Var.f) && this.g == g110Var.g && this.h.equals(g110Var.h) && this.i == g110Var.i && this.j == g110Var.j;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f10487a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + brm0.e(ua80.b(twn.a(this.g, ua80.b(ua80.b(ua80.b(twn.a(R.drawable.lol_popular_champions_placeholder, ua80.b(ua80.b(this.f10487a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LolPopularChampionContentUiModel(key=");
        sb.append((Object) this.f10487a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", icon=");
        twn.w(R.drawable.lol_popular_champions_placeholder, this.c, ", placeHolderIcon=", ", name=", sb);
        f140.v(sb, this.d, ", tier=", this.e, ", picks=");
        twn.w(this.g, this.f, ", role=", ", winRate=", sb);
        brm0.C(this.h, ", isFirstItem=", ", isLastItem=", sb, this.i);
        return rw2.p(sb, this.j, Separators.RPAREN);
    }
}
