package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class uup {
    public static final tup Companion = new tup();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qsp f36311a;
    public final qsp b;

    public /* synthetic */ uup(int i, qsp qspVar, qsp qspVar2) {
        if ((i & 1) == 0) {
            this.f36311a = null;
        } else {
            this.f36311a = qspVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qspVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uup)) {
            return false;
        }
        uup uupVar = (uup) obj;
        return Intrinsics.d(this.f36311a, uupVar.f36311a) && Intrinsics.d(this.b, uupVar.b);
    }

    public final int hashCode() {
        qsp qspVar = this.f36311a;
        int iHashCode = (qspVar == null ? 0 : qspVar.hashCode()) * 31;
        qsp qspVar2 = this.b;
        return iHashCode + (qspVar2 != null ? qspVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FightStatsResponse(red=" + this.f36311a + ", blue=" + this.b + Separators.RPAREN;
    }
}
