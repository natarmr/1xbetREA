package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r8j {
    public static final q8j Companion = new q8j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30029a;
    public final h4a0 b;
    public final h4a0 c;
    public final p9j d;
    public final l9j e;

    public /* synthetic */ r8j(int i, Integer num, h4a0 h4a0Var, h4a0 h4a0Var2, p9j p9jVar, l9j l9jVar) {
        if ((i & 1) == 0) {
            this.f30029a = null;
        } else {
            this.f30029a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = h4a0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = h4a0Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = p9jVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l9jVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8j)) {
            return false;
        }
        r8j r8jVar = (r8j) obj;
        return Intrinsics.d(this.f30029a, r8jVar.f30029a) && Intrinsics.d(this.b, r8jVar.b) && Intrinsics.d(this.c, r8jVar.c) && this.d == r8jVar.d && this.e == r8jVar.e;
    }

    public final int hashCode() {
        Integer num = this.f30029a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        h4a0 h4a0Var = this.b;
        int iHashCode2 = (iHashCode + (h4a0Var == null ? 0 : h4a0Var.hashCode())) * 31;
        h4a0 h4a0Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (h4a0Var2 == null ? 0 : h4a0Var2.hashCode())) * 31;
        p9j p9jVar = this.d;
        int iHashCode4 = (iHashCode3 + (p9jVar == null ? 0 : p9jVar.hashCode())) * 31;
        l9j l9jVar = this.e;
        return iHashCode4 + (l9jVar != null ? l9jVar.hashCode() : 0);
    }

    public final String toString() {
        return "DartsLiveResponse(roundNumber=" + this.f30029a + ", firstPlayerInfo=" + this.b + ", secondPlayerInfo=" + this.c + ", winner=" + this.d + ", move=" + this.e + Separators.RPAREN;
    }
}
