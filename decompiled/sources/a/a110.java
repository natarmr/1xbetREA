package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class a110 implements iqg {
    public static final z010 Companion = new z010();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4h f48a;

    static {
        o4h o4hVar = p4h.Companion;
    }

    public /* synthetic */ a110(int i, p4h p4hVar) {
        if ((i & 1) == 0) {
            this.f48a = null;
        } else {
            this.f48a = p4hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a110) && Intrinsics.d(this.f48a, ((a110) obj).f48a);
    }

    public final int hashCode() {
        p4h p4hVar = this.f48a;
        if (p4hVar == null) {
            return 0;
        }
        return p4hVar.hashCode();
    }

    public final String toString() {
        return "LolMainStatisticResponse(lolStatistic=" + this.f48a + Separators.RPAREN;
    }

    public a110() {
        this.f48a = null;
    }
}
