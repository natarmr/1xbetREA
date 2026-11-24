package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
public final class rgq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30450a;
    public final TimeOfDay23 b;
    public final TimeOfDay23 c;
    public final Function2 d;

    public rgq0(boolean z, TimeOfDay23 timeOfDay23, TimeOfDay23 timeOfDay24, Function2 function2) {
        function2.getClass();
        this.f30450a = z;
        this.b = timeOfDay23;
        this.c = timeOfDay24;
        this.d = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgq0)) {
            return false;
        }
        rgq0 rgq0Var = (rgq0) obj;
        return this.f30450a == rgq0Var.f30450a && Intrinsics.d(this.b, rgq0Var.b) && Intrinsics.d(this.c, rgq0Var.c) && Intrinsics.d(this.d, rgq0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f30450a) * 31, 31, true);
        TimeOfDay23 timeOfDay23 = this.b;
        int iHashCode = (iE + (timeOfDay23 == null ? 0 : timeOfDay23.hashCode())) * 31;
        TimeOfDay23 timeOfDay24 = this.c;
        return this.d.hashCode() + ((iHashCode + (timeOfDay24 != null ? timeOfDay24.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TimeBehavior(infinityHour=" + this.f30450a + ", infinityMinute=true, minTime=" + this.b + ", maxTime=" + this.c + ", onTimeChangedFinal=" + this.d + Separators.RPAREN;
    }
}
