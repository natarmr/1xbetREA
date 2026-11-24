package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ayo0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1678a;
    public final zxo0 b;
    public final zxo0 c;

    public ayo0(String str, zxo0 zxo0Var, zxo0 zxo0Var2) {
        str.getClass();
        this.f1678a = str;
        this.b = zxo0Var;
        this.c = zxo0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayo0)) {
            return false;
        }
        ayo0 ayo0Var = (ayo0) obj;
        return Intrinsics.d(this.f1678a, ayo0Var.f1678a) && this.b.equals(ayo0Var.b) && this.c.equals(ayo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f1678a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamAdvantageUiModel(title=" + this.f1678a + ", firstTeam=" + this.b + ", secondTeam=" + this.c + Separators.RPAREN;
    }
}
