package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class smi0 {
    public static final rmi0 Companion = new rmi0();
    public static final a8z[] c = {maz.a(wez.f39042a, new gei0((byte) 11)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final umi0 f32448a;
    public final boolean b;

    public /* synthetic */ smi0(int i, umi0 umi0Var, boolean z) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, qmi0.f28984a.getDescriptor());
            throw null;
        }
        this.f32448a = umi0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smi0)) {
            return false;
        }
        smi0 smi0Var = (smi0) obj;
        return this.f32448a == smi0Var.f32448a && this.b == smi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f32448a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionTimerStatusModel(type=" + this.f32448a + ", enabled=" + this.b + Separators.RPAREN;
    }

    public smi0(umi0 umi0Var, boolean z) {
        this.f32448a = umi0Var;
        this.b = z;
    }
}
