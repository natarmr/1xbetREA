package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ytu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f43238a;
    public final rtu0 b;

    public ytu0(imm immVar, rtu0 rtu0Var) {
        immVar.getClass();
        this.f43238a = immVar;
        this.b = rtu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytu0)) {
            return false;
        }
        ytu0 ytu0Var = (ytu0) obj;
        return Intrinsics.d(this.f43238a, ytu0Var.f43238a) && this.b.equals(ytu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43238a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualSportRulesUiState(navBar=" + this.f43238a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
