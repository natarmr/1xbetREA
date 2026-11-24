package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class vuo0 {
    public static final uuo0 Companion = new uuo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f38058a;
    public final yf8 b;
    public final mbe0 c;
    public final g8r d;

    public /* synthetic */ vuo0(int i, Integer num, yf8 yf8Var, mbe0 mbe0Var, g8r g8rVar) {
        if ((i & 1) == 0) {
            this.f38058a = null;
        } else {
            this.f38058a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = yf8Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = mbe0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = g8rVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuo0)) {
            return false;
        }
        vuo0 vuo0Var = (vuo0) obj;
        return Intrinsics.d(this.f38058a, vuo0Var.f38058a) && Intrinsics.d(this.b, vuo0Var.b) && Intrinsics.d(this.c, vuo0Var.c) && Intrinsics.d(this.d, vuo0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f38058a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        yf8 yf8Var = this.b;
        int iHashCode2 = (iHashCode + (yf8Var == null ? 0 : yf8Var.hashCode())) * 31;
        mbe0 mbe0Var = this.c;
        int iHashCode3 = (iHashCode2 + (mbe0Var == null ? 0 : mbe0Var.hashCode())) * 31;
        g8r g8rVar = this.d;
        return iHashCode3 + (g8rVar != null ? g8rVar.hashCode() : 0);
    }

    public final String toString() {
        return "TaskPrizeResponse(type=" + this.f38058a + ", bonus=" + this.b + ", realMoney=" + this.c + ", fs=" + this.d + Separators.RPAREN;
    }
}
