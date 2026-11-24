package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dhn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugn0 f6100a;
    public final a4x b;
    public final chn0 c;

    public dhn0(ugn0 ugn0Var, a4x a4xVar, chn0 chn0Var) {
        a4xVar.getClass();
        this.f6100a = ugn0Var;
        this.b = a4xVar;
        this.c = chn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhn0)) {
            return false;
        }
        dhn0 dhn0Var = (dhn0) obj;
        return Intrinsics.d(this.f6100a, dhn0Var.f6100a) && Intrinsics.d(this.b, dhn0Var.b) && this.c == dhn0Var.c;
    }

    public final int hashCode() {
        ugn0 ugn0Var = this.f6100a;
        return this.c.hashCode() + cs0.b(this.b, (ugn0Var == null ? 0 : ugn0Var.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "SuccessBetInfoUiModel(header=" + this.f6100a + ", rows=" + this.b + ", style=" + this.c + Separators.RPAREN;
    }
}
