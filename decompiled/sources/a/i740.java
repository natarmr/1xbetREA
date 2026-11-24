package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i740 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14274a;
    public final String b;
    public final String c;
    public final j83 d;
    public final String e;
    public final int f;
    public final boolean g;
    public final t440 h;
    public final wul i;
    public final wul j;

    public i740(boolean z, String str, String str2, j83 j83Var, String str3, int i, boolean z2, t440 t440Var, wul wulVar, wul wulVar2) {
        this.f14274a = z;
        this.b = str;
        this.c = str2;
        this.d = j83Var;
        this.e = str3;
        this.f = i;
        this.g = z2;
        this.h = t440Var;
        this.i = wulVar;
        this.j = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i740)) {
            return false;
        }
        i740 i740Var = (i740) obj;
        return this.f14274a == i740Var.f14274a && this.b.equals(i740Var.b) && this.c.equals(i740Var.c) && this.d.equals(i740Var.d) && Intrinsics.d(this.e, i740Var.e) && this.f == i740Var.f && this.g == i740Var.g && this.h.equals(i740Var.h) && Intrinsics.d(this.i, i740Var.i) && Intrinsics.d(this.j, i740Var.j);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        int iF = brm0.f(this.d, ua80.b(ua80.b(Boolean.hashCode(this.f14274a) * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        int iHashCode = (this.h.hashCode() + brm0.e(twn.a(this.f, (iF + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g)) * 31;
        wul wulVar = this.i;
        int iHashCode2 = (iHashCode + (wulVar == null ? 0 : wulVar.hashCode())) * 31;
        wul wulVar2 = this.j;
        return iHashCode2 + (wulVar2 != null ? wulVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("MessageUiModel(isRead=", ", id=", this.b, this.f14274a, ", title=");
        sbQ.append(this.c);
        sbQ.append(", text=");
        sbQ.append((Object) this.d);
        sbQ.append(", imageUrl=");
        twn.w(this.f, this.e, ", date=", ", isMatchOfDays=", sbQ);
        sbQ.append(this.g);
        sbQ.append(", extension=");
        sbQ.append(this.h);
        sbQ.append(", activateButtonModel=");
        sbQ.append(this.i);
        sbQ.append(", copyPromoButtonModel=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
