package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5665a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final wbs0 f;
    public final int g;

    public d8r0(boolean z, boolean z2, String str, String str2, String str3, wbs0 wbs0Var, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        wbs0Var.getClass();
        this.f5665a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = wbs0Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8r0)) {
            return false;
        }
        d8r0 d8r0Var = (d8r0) obj;
        return this.f5665a == d8r0Var.f5665a && this.b == d8r0Var.b && Intrinsics.d(this.c, d8r0Var.c) && Intrinsics.d(this.d, d8r0Var.d) && Intrinsics.d(this.e, d8r0Var.e) && this.f == d8r0Var.f && this.g == d8r0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((this.f.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f5665a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TopLaneUiModel(isTopLaneVisible=", ", isLive=", ", sportIconUrl=", this.f5665a, this.b);
        f140.v(sbQ, this.c, ", tagText=", this.d, ", dateTimeLabel=");
        sbQ.append(this.e);
        sbQ.append(", trackEventState=");
        sbQ.append(this.f);
        sbQ.append(", sportImagePlaceholder=");
        return rz4.j(this.g, Separators.RPAREN, sbQ);
    }
}
