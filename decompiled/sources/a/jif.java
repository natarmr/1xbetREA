package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jif {
    public static final iif Companion = new iif();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16572a;

    public jif(edy edyVar) {
        edyVar.getClass();
        this.f16572a = piz.L(edyVar, "player");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jif) && Intrinsics.d(this.f16572a, ((jif) obj).f16572a);
    }

    public final int hashCode() {
        String str = this.f16572a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Cs2BombDefusedGameLogResponse(player=", this.f16572a, Separators.RPAREN);
    }

    public /* synthetic */ jif(int i, String str) {
        if ((i & 1) == 0) {
            this.f16572a = null;
        } else {
            this.f16572a = str;
        }
    }
}
