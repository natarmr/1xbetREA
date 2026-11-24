package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class frp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10030a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public frp0(String str, boolean z, boolean z2, boolean z3) {
        this.f10030a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frp0)) {
            return false;
        }
        frp0 frp0Var = (frp0) obj;
        return this.f10030a == frp0Var.f10030a && this.b == frp0Var.b && this.c.equals(frp0Var.c) && this.d == frp0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(brm0.e(Boolean.hashCode(this.f10030a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", menuEnabled=", Separators.RPAREN, f140.q("SelectedTeamsUiState(btnDiscardActive=", ", btnApplyActive=", ", selectedText=", this.f10030a, this.b), this.d);
    }
}
