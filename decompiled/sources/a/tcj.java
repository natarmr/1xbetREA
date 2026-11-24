package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final class tcj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f33721a;
    public final SimpleDate b;
    public final Function1 c;

    public tcj(SimpleDate simpleDate, SimpleDate simpleDate2, Function1 function1, int i) {
        simpleDate = (i & 1) != 0 ? null : simpleDate;
        simpleDate2 = (i & 2) != 0 ? null : simpleDate2;
        function1 = (i & 16) != 0 ? new x2i((byte) 13) : function1;
        function1.getClass();
        this.f33721a = simpleDate;
        this.b = simpleDate2;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcj)) {
            return false;
        }
        tcj tcjVar = (tcj) obj;
        return Intrinsics.d(this.f33721a, tcjVar.f33721a) && Intrinsics.d(this.b, tcjVar.b) && this.c.equals(tcjVar.c);
    }

    public final int hashCode() {
        SimpleDate simpleDate = this.f33721a;
        int iHashCode = (simpleDate == null ? 0 : simpleDate.hashCode()) * 31;
        SimpleDate simpleDate2 = this.b;
        return this.c.hashCode() + brm0.e(brm0.e((iHashCode + (simpleDate2 != null ? simpleDate2.hashCode() : 0)) * 31, 31, true), 31, true);
    }

    public final String toString() {
        return "DateBehavior(minDate=" + this.f33721a + ", maxDate=" + this.b + ", isInfinityMonths=true, isInfinityDays=true, onDateChangedFinal=" + this.c + Separators.RPAREN;
    }
}
