package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class luo0 {
    public static final kuo0 Companion = new kuo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20683a;
    public final ard b;

    public /* synthetic */ luo0(int i, Integer num, ard ardVar) {
        if ((i & 1) == 0) {
            this.f20683a = null;
        } else {
            this.f20683a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ardVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luo0)) {
            return false;
        }
        luo0 luo0Var = (luo0) obj;
        return Intrinsics.d(this.f20683a, luo0Var.f20683a) && Intrinsics.d(this.b, luo0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f20683a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ard ardVar = this.b;
        return iHashCode + (ardVar != null ? ardVar.hashCode() : 0);
    }

    public final String toString() {
        return "TaskConditionResponse(conditionKind=" + this.f20683a + ", state=" + this.b + Separators.RPAREN;
    }
}
