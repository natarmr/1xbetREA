package a;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class inj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j700 f15077a;
    public final int b;
    public final long c;
    public final Set d;
    public final Set e;
    public final boolean f;

    public inj(j700 j700Var, int i, long j, Set set, Set set2, boolean z) {
        set.getClass();
        set2.getClass();
        this.f15077a = j700Var;
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
        if (!(obj instanceof inj)) {
            return false;
        }
        inj injVar = (inj) obj;
        return this.f15077a == injVar.f15077a && this.b == injVar.b && this.c == injVar.c && Intrinsics.d(this.d, injVar.d) && Intrinsics.d(this.e, injVar.e) && this.f == injVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(ohs0.g(this.e, ohs0.g(this.d, rw2.b(twn.a(this.b, this.f15077a.hashCode() * 31, 31), 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        return "LineLiveSport(lineLiveScreenType=" + this.f15077a + ", cyberType=" + this.b + ", subSportId=" + this.c + ", sportIds=" + this.d + ", champIds=" + this.e + ", cyber=" + this.f + ", hasBackStack=false)";
    }
}
