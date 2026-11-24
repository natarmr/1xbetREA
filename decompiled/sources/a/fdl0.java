package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fdl0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9362a;
    public final String b;
    public final String c;
    public final boolean d;

    public fdl0(long j, String str, String str2, boolean z) {
        str.getClass();
        this.f9362a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdl0)) {
            return false;
        }
        fdl0 fdl0Var = (fdl0) obj;
        return this.f9362a == fdl0Var.f9362a && Intrinsics.d(this.b, fdl0Var.b) && this.c.equals(fdl0Var.c) && this.d == fdl0Var.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof fdl0) && (p6t0Var2 instanceof fdl0) && ((fdl0) p6t0Var).f9362a == ((fdl0) p6t0Var2).f9362a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(R.drawable.sport_new, ua80.b(ua80.b(Long.hashCode(this.f9362a) * 31, 31, this.b), 31, this.c), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof fdl0) && (p6t0Var2 instanceof fdl0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            k9x.G(linkedHashSet, new edl0(((fdl0) p6t0Var).d), new edl0(((fdl0) p6t0Var2).d));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("SelectedState(value=", Separators.RPAREN, this.d);
        StringBuilder sbO = axq.o(this.f9362a, "SportGameFilterSelectionUiModel(sportId=", ", sportName=", this.b);
        axq.s(R.drawable.sport_new, ", image=", this.c, ", placeholder=", sbO);
        return rw2.o(sbO, ", selected=", strD, Separators.RPAREN);
    }
}
