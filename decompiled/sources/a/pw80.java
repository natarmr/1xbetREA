package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pw80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27699a;
    public final String b;
    public final n0x c;
    public final m0x d;

    public pw80(String str, String str2, n0x n0xVar, m0x m0xVar) {
        str.getClass();
        this.f27699a = str;
        this.b = str2;
        this.c = n0xVar;
        this.d = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw80)) {
            return false;
        }
        pw80 pw80Var = (pw80) obj;
        return Intrinsics.d(this.f27699a, pw80Var.f27699a) && this.b.equals(pw80Var.b) && this.c.equals(pw80Var.c) && this.d.equals(pw80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.f(this.c, ua80.b(this.f27699a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PartnerBottomInfoAnnounceDateUiModel(dateTitleInfo=", this.f27699a, ", dateMatch=", this.b, ", disciplineIcon=");
        sbN.append(this.c);
        sbN.append(", disciplinePlaceholder=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
