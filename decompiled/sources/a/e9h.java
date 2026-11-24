package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e9h {
    public static final d9h Companion = new d9h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7420a;
    public final Long b;

    public /* synthetic */ e9h(int i, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f7420a = null;
        } else {
            this.f7420a = num;
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
        if (!(obj instanceof e9h)) {
            return false;
        }
        e9h e9hVar = (e9h) obj;
        return Intrinsics.d(this.f7420a, e9hVar.f7420a) && Intrinsics.d(this.b, e9hVar.b);
    }

    public final int hashCode() {
        Integer num = this.f7420a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "CyberMlbbGameStatusResponse(gameStatus=" + this.f7420a + ", gameDuration=" + this.b + Separators.RPAREN;
    }
}
