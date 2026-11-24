package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cdh0 {
    public static final bdh0 Companion = new bdh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4162a;
    public final Integer b;

    public /* synthetic */ cdh0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f4162a = null;
        } else {
            this.f4162a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdh0)) {
            return false;
        }
        cdh0 cdh0Var = (cdh0) obj;
        return Intrinsics.d(this.f4162a, cdh0Var.f4162a) && Intrinsics.d(this.b, cdh0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f4162a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("SeaBattleCoordinatesResponse(x=", this.f4162a, ", y=", this.b, Separators.RPAREN);
    }
}
