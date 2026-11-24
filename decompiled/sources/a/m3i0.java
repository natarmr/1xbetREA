package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21116a;
    public final mfj b;
    public final mfj c;
    public final List d;

    public m3i0(int i, mfj mfjVar, mfj mfjVar2, List list) {
        list.getClass();
        this.f21116a = i;
        this.b = mfjVar;
        this.c = mfjVar2;
        this.d = list;
    }

    public static m3i0 a(m3i0 m3i0Var, int i, lfj lfjVar, mfj mfjVar, int i2) {
        if ((i2 & 1) != 0) {
            i = m3i0Var.f21116a;
        }
        mfj mfjVar2 = lfjVar;
        if ((i2 & 2) != 0) {
            mfjVar2 = m3i0Var.b;
        }
        if ((i2 & 4) != 0) {
            mfjVar = m3i0Var.c;
        }
        List list = m3i0Var.d;
        list.getClass();
        return new m3i0(i, mfjVar2, mfjVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3i0)) {
            return false;
        }
        m3i0 m3i0Var = (m3i0) obj;
        return this.f21116a == m3i0Var.f21116a && this.b.equals(m3i0Var.b) && this.c.equals(m3i0Var.c) && Intrinsics.d(this.d, m3i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f21116a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectTimeFilterState(selectedFilterId=" + this.f21116a + ", startDateValue=" + this.b + ", endDateValue=" + this.c + ", filterItems=" + this.d + Separators.RPAREN;
    }
}
