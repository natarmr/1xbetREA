package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vrp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37911a;
    public final wrp b;
    public final wrp c;
    public final boolean d;

    public vrp(String str, wrp wrpVar, wrp wrpVar2, boolean z) {
        str.getClass();
        this.f37911a = str;
        this.b = wrpVar;
        this.c = wrpVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrp)) {
            return false;
        }
        vrp vrpVar = (vrp) obj;
        return Intrinsics.d(this.f37911a, vrpVar.f37911a) && this.b.equals(vrpVar.b) && this.c.equals(vrpVar.c) && this.d == vrpVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f37911a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FifaHalfStatisticsUiModel(title=" + this.f37911a + ", firstTeam=" + this.b + ", secondTeam=" + this.c + ", tablet=" + this.d + Separators.RPAREN;
    }
}
