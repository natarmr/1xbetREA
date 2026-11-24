package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vx8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38188a;
    public final List b;
    public final long c;

    public vx8(long j, List list, boolean z) {
        list.getClass();
        this.f38188a = z;
        this.b = list;
        this.c = j;
    }

    public static vx8 a(vx8 vx8Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = vx8Var.f38188a;
        }
        List list = vx8Var.b;
        long j = (i & 4) != 0 ? vx8Var.c : 0L;
        list.getClass();
        return new vx8(j, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx8)) {
            return false;
        }
        vx8 vx8Var = (vx8) obj;
        return this.f38188a == vx8Var.f38188a && Intrinsics.d(this.b, vx8Var.b) && this.c == vx8Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + dw9.a(Boolean.hashCode(this.f38188a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipsState(isLoading=");
        sb.append(this.f38188a);
        sb.append(", partitions=");
        sb.append(this.b);
        sb.append(", selectedPartitionId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
