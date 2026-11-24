package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pft {
    public static final oft Companion = new oft();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zom0 f26922a;

    public /* synthetic */ pft(int i, zom0 zom0Var) {
        if ((i & 1) == 0) {
            this.f26922a = null;
        } else {
            this.f26922a = zom0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pft) && Intrinsics.d(this.f26922a, ((pft) obj).f26922a);
    }

    public final int hashCode() {
        zom0 zom0Var = this.f26922a;
        if (zom0Var == null) {
            return 0;
        }
        return zom0Var.hashCode();
    }

    public final String toString() {
        return "GemsOdysseyResultResponse(stepInfo=" + this.f26922a + Separators.RPAREN;
    }
}
