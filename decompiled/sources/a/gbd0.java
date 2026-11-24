package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gbd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j700 f11013a;
    public final int b;
    public final long c;
    public final Set d;
    public final Set e;
    public final boolean f;

    public gbd0(j700 j700Var, int i, long j, Set set, Set set2, boolean z) {
        set.getClass();
        set2.getClass();
        this.f11013a = j700Var;
        this.b = i;
        this.c = j;
        this.d = set;
        this.e = set2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbd0)) {
            return false;
        }
        gbd0 gbd0Var = (gbd0) obj;
        return this.f11013a == gbd0Var.f11013a && this.b == gbd0Var.b && this.c == gbd0Var.c && Intrinsics.d(this.d, gbd0Var.d) && Intrinsics.d(this.e, gbd0Var.e) && this.f == gbd0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ohs0.g(this.e, ohs0.g(this.d, rw2.b(twn.a(this.b, this.f11013a.hashCode() * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        return "LineLiveSport(lineLiveScreenType=" + this.f11013a + ", cyberType=" + this.b + ", subSportId=" + this.c + ", sportIds=" + this.d + ", champIds=" + this.e + ", cyber=" + this.f + Separators.RPAREN;
    }
}
