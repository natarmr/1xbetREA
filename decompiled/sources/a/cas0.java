package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cas0 implements fas0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu1 f4028a;
    public final boolean b;

    public cas0(gu1 gu1Var, boolean z) {
        gu1Var.getClass();
        this.f4028a = gu1Var;
        this.b = z;
    }

    public static cas0 a(cas0 cas0Var, gu1 gu1Var, boolean z, int i) {
        if ((i & 1) != 0) {
            gu1Var = cas0Var.f4028a;
        }
        if ((i & 2) != 0) {
            z = cas0Var.b;
        }
        gu1Var.getClass();
        return new cas0(gu1Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cas0)) {
            return false;
        }
        cas0 cas0Var = (cas0) obj;
        return Intrinsics.d(this.f4028a, cas0Var.f4028a) && this.b == cas0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f4028a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(tournamentFullInfoModel=" + this.f4028a + ", isButtonLoading=" + this.b + Separators.RPAREN;
    }
}
