package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g610 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10741a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public g610(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        brm0.B(str, str5, str6);
        this.f10741a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g610)) {
            return false;
        }
        g610 g610Var = (g610) obj;
        return this.f10741a == g610Var.f10741a && Intrinsics.d(this.b, g610Var.b) && this.c.equals(g610Var.c) && this.d.equals(g610Var.d) && this.e.equals(g610Var.e) && Intrinsics.d(this.f, g610Var.f) && Intrinsics.d(this.g, g610Var.g);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.h;
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f10741a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("LolTopPlayerUiModel(isLastItem=", ", playerIndexNumber=", this.b, this.f10741a, ", playerIconUrl=");
        f140.v(sbQ, this.c, ", playerName=", this.d, ", teamIconUrl=");
        f140.v(sbQ, this.e, ", gamesNumber=", this.f, ", kda=");
        return axq.n(sbQ, this.g, Separators.RPAREN);
    }
}
