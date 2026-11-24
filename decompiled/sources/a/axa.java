package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class axa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0b f1614a;
    public final String b;
    public final o0x c;
    public final boolean d;
    public final boolean e;

    public axa(y0b y0bVar, String str, o0x o0xVar, boolean z, boolean z2) {
        str.getClass();
        this.f1614a = y0bVar;
        this.b = str;
        this.c = o0xVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axa)) {
            return false;
        }
        axa axaVar = (axa) obj;
        return this.f1614a == axaVar.f1614a && Intrinsics.d(this.b, axaVar.b) && this.c.equals(axaVar.c) && this.d == axaVar.d && this.e == axaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(w6x.d(this.c, ua80.b(this.f1614a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashbackCellUiModel(cashbackType=");
        sb.append(this.f1614a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", isActive=");
        sb.append(this.d);
        sb.append(", isSelectable=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
