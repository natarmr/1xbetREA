package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ltu0 {
    public static final ktu0 Companion = new ktu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctu0 f20643a;
    public final itu0 b;
    public final itu0 c;

    public /* synthetic */ ltu0(int i, ctu0 ctu0Var, itu0 itu0Var, itu0 itu0Var2) {
        if ((i & 1) == 0) {
            this.f20643a = null;
        } else {
            this.f20643a = ctu0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = itu0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = itu0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltu0)) {
            return false;
        }
        ltu0 ltu0Var = (ltu0) obj;
        return Intrinsics.d(this.f20643a, ltu0Var.f20643a) && Intrinsics.d(this.b, ltu0Var.b) && Intrinsics.d(this.c, ltu0Var.c);
    }

    public final int hashCode() {
        ctu0 ctu0Var = this.f20643a;
        int iHashCode = (ctu0Var == null ? 0 : ctu0Var.hashCode()) * 31;
        itu0 itu0Var = this.b;
        int iHashCode2 = (iHashCode + (itu0Var == null ? 0 : itu0Var.hashCode())) * 31;
        itu0 itu0Var2 = this.c;
        return iHashCode2 + (itu0Var2 != null ? itu0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ValueContent(main=" + this.f20643a + ", markets=" + this.b + ", remark=" + this.c + Separators.RPAREN;
    }
}
