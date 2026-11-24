package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zyg0 {
    public static final yyg0 Companion = new yyg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45204a;
    public final hae0 b;

    public /* synthetic */ zyg0(int i, hae0 hae0Var, String str) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, xyg0.f41704a.getDescriptor());
            throw null;
        }
        this.f45204a = str;
        this.b = hae0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyg0)) {
            return false;
        }
        zyg0 zyg0Var = (zyg0) obj;
        return Intrinsics.d(this.f45204a, zyg0Var.f45204a) && this.b == zyg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45204a.hashCode() * 31);
    }

    public final String toString() {
        return "SaveUserReactionRequest(taskId=" + this.f45204a + ", reaction=" + this.b + Separators.RPAREN;
    }

    public zyg0(String str, hae0 hae0Var) {
        str.getClass();
        hae0Var.getClass();
        this.f45204a = str;
        this.b = hae0Var;
    }
}
