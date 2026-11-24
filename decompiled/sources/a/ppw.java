package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ppw {
    public static final opw Companion = new opw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrw f27391a;
    public final Integer b;

    static {
        mrw mrwVar = nrw.Companion;
    }

    public /* synthetic */ ppw(int i, nrw nrwVar, Integer num) {
        if ((i & 1) == 0) {
            this.f27391a = null;
        } else {
            this.f27391a = nrwVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppw)) {
            return false;
        }
        ppw ppwVar = (ppw) obj;
        return Intrinsics.d(this.f27391a, ppwVar.f27391a) && Intrinsics.d(this.b, ppwVar.b);
    }

    public final int hashCode() {
        nrw nrwVar = this.f27391a;
        int iHashCode = (nrwVar == null ? 0 : nrwVar.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "HorsesMenuResponse(horsesResponse=" + this.f27391a + ", sportId=" + this.b + Separators.RPAREN;
    }
}
