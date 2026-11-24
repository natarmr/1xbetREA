package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vpf {
    public static final upf Companion = new upf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37801a;

    public vpf(edy edyVar) {
        edyVar.getClass();
        this.f37801a = piz.L(edyVar, "map");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpf) && Intrinsics.d(this.f37801a, ((vpf) obj).f37801a);
    }

    public final int hashCode() {
        String str = this.f37801a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Cs2MatchStartedGameLogResponse(map=", this.f37801a, Separators.RPAREN);
    }

    public /* synthetic */ vpf(int i, String str) {
        if ((i & 1) == 0) {
            this.f37801a = null;
        } else {
            this.f37801a = str;
        }
    }
}
