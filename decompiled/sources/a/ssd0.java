package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ssd0 {
    public static final rsd0 Companion = new rsd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f32721a;
    public final String b;

    public /* synthetic */ ssd0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f32721a = null;
        } else {
            this.f32721a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssd0)) {
            return false;
        }
        ssd0 ssd0Var = (ssd0) obj;
        return Intrinsics.d(this.f32721a, ssd0Var.f32721a) && Intrinsics.d(this.b, ssd0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f32721a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f32721a, "RacesMenuResponse(type=", ", name=", this.b, Separators.RPAREN);
    }
}
