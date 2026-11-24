package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sby {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f31961a;
    public final Object b;

    public sby(Integer num, Object obj) {
        this.f31961a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sby)) {
            return false;
        }
        sby sbyVar = (sby) obj;
        return this.f31961a.equals(sbyVar.f31961a) && Intrinsics.d(this.b, sbyVar.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f31961a.hashCode() * 31;
        Object obj = this.b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f31961a + ", right=" + this.b + Separators.RPAREN;
    }
}
