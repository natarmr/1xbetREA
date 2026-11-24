package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tr10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34403a;
    public final imm b;
    public final sr10 c;

    public tr10(i4 i4Var, imm immVar, sr10 sr10Var) {
        i4Var.getClass();
        this.f34403a = i4Var;
        this.b = immVar;
        this.c = sr10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr10)) {
            return false;
        }
        tr10 tr10Var = (tr10) obj;
        return Intrinsics.d(this.f34403a, tr10Var.f34403a) && this.b.equals(tr10Var.b) && this.c == tr10Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + h97.a(this.b, this.f34403a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MainCallBackUiState(headerSegments=" + this.f34403a + ", navigationBarUiModel=" + this.b + ", selectedTab=" + this.c + Separators.RPAREN;
    }
}
