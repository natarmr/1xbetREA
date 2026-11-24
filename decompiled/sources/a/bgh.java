package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bgh {
    public static final agh Companion = new agh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2556a;
    public final Long b;

    public /* synthetic */ bgh(int i, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f2556a = null;
        } else {
            this.f2556a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgh)) {
            return false;
        }
        bgh bghVar = (bgh) obj;
        return Intrinsics.d(this.f2556a, bghVar.f2556a) && Intrinsics.d(this.b, bghVar.b);
    }

    public final int hashCode() {
        Integer num = this.f2556a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "CyberStatisticDotaGameStatusResponse(status=" + this.f2556a + ", startGameTime=" + this.b + Separators.RPAREN;
    }
}
