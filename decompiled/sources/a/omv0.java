package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class omv0 implements rmv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f25522a;
    public final a4x b;

    public omv0(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f25522a = immVar;
        this.b = a4xVar;
    }

    @Override // a.rmv0
    public final imm a() {
        return this.f25522a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omv0)) {
            return false;
        }
        omv0 omv0Var = (omv0) obj;
        return this.f25522a.equals(omv0Var.f25522a) && Intrinsics.d(this.b, omv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25522a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(navigationBarModel=" + this.f25522a + ", statistic=" + this.b + Separators.RPAREN;
    }
}
