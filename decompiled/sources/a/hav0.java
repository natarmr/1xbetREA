package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hav0 {
    public static final gav0 Companion = new gav0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12744a;

    public /* synthetic */ hav0(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f12744a = null;
        } else {
            this.f12744a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hav0) && Intrinsics.d(this.f12744a, ((hav0) obj).f12744a);
    }

    public final int hashCode() {
        Integer num = this.f12744a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return h97.j(this.f12744a, "WheelSectionResponse(bonusType=", Separators.RPAREN);
    }
}
