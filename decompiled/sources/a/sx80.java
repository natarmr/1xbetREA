package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32964a;
    public final String b;
    public final n0x c;
    public final m0x d;

    public sx80(String str, String str2, n0x n0xVar, m0x m0xVar) {
        str.getClass();
        str2.getClass();
        this.f32964a = str;
        this.b = str2;
        this.c = n0xVar;
        this.d = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx80)) {
            return false;
        }
        sx80 sx80Var = (sx80) obj;
        return Intrinsics.d(this.f32964a, sx80Var.f32964a) && Intrinsics.d(this.b, sx80Var.b) && this.c.equals(sx80Var.c) && this.d.equals(sx80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.f(this.c, ua80.b(this.f32964a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PartnerTopInfoUiModel(teamName=", this.f32964a, ", teamInfo=", this.b, ", teamIcon=");
        sbN.append(this.c);
        sbN.append(", teamPlaceholder=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
