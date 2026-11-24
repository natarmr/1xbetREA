package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx6 f29465a;
    public final String b;
    public final mke c;
    public final jx6 d;
    public final String e;

    public qx6(tx6 tx6Var, String str, mke mkeVar, jx6 jx6Var, String str2) {
        str.getClass();
        str2.getClass();
        this.f29465a = tx6Var;
        this.b = str;
        this.c = mkeVar;
        this.d = jx6Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx6)) {
            return false;
        }
        qx6 qx6Var = (qx6) obj;
        return this.f29465a.equals(qx6Var.f29465a) && Intrinsics.d(this.b, qx6Var.b) && this.c.equals(qx6Var.c) && this.d == qx6Var.d && Intrinsics.d(this.e, qx6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f29465a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldUiState(fieldValueUiState=");
        sb.append(this.f29465a);
        sb.append(", supportingTextState=");
        sb.append(this.b);
        sb.append(", controlsState=");
        sb.append(this.c);
        sb.append(", betFieldStyle=");
        sb.append(this.d);
        sb.append(", betCurrency=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
