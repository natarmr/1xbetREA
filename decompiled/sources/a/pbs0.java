package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pbs0 {
    public static final obs0 Companion = new obs0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final acs0 f26723a;
    public final m97 b;

    public /* synthetic */ pbs0(int i, acs0 acs0Var, m97 m97Var) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, nbs0.f23256a.getDescriptor());
            throw null;
        }
        this.f26723a = acs0Var;
        this.b = m97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbs0)) {
            return false;
        }
        pbs0 pbs0Var = (pbs0) obj;
        return Intrinsics.d(this.f26723a, pbs0Var.f26723a) && Intrinsics.d(this.b, pbs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26723a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackCoefItem(game=" + this.f26723a + ", betInfo=" + this.b + Separators.RPAREN;
    }

    public pbs0(acs0 acs0Var, m97 m97Var) {
        acs0Var.getClass();
        m97Var.getClass();
        this.f26723a = acs0Var;
        this.b = m97Var;
    }
}
