package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q2n0 implements t2n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rqm f28009a;
    public final m0n0 b;

    public q2n0(rqm rqmVar, m0n0 m0n0Var) {
        m0n0Var.getClass();
        this.f28009a = rqmVar;
        this.b = m0n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2n0)) {
            return false;
        }
        q2n0 q2n0Var = (q2n0) obj;
        return this.f28009a.equals(q2n0Var.f28009a) && Intrinsics.d(this.b, q2n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28009a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuCellItem(settingCellStyle=" + this.f28009a + ", subSectionItem=" + this.b + Separators.RPAREN;
    }
}
