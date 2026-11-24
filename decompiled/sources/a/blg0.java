package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class blg0 {
    public static final alg0 Companion = new alg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2794a;
    public final rns0 b;

    static {
        qns0 qns0Var = rns0.Companion;
    }

    public /* synthetic */ blg0(int i, String str, rns0 rns0Var) {
        if ((i & 1) == 0) {
            this.f2794a = null;
        } else {
            this.f2794a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = rns0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blg0)) {
            return false;
        }
        blg0 blg0Var = (blg0) obj;
        return Intrinsics.d(this.f2794a, blg0Var.f2794a) && Intrinsics.d(this.b, blg0Var.b);
    }

    public final int hashCode() {
        String str = this.f2794a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        rns0 rns0Var = this.b;
        return iHashCode + (rns0Var != null ? rns0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RuleTranslationResponse(key=" + this.f2794a + ", value=" + this.b + Separators.RPAREN;
    }
}
