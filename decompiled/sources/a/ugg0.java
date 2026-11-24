package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ugg0 extends cne {
    @Override // a.cne
    public final cne b(ene eneVar, ene eneVar2, ene eneVar3, ene eneVar4) {
        return new ugg0(eneVar, eneVar2, eneVar3, eneVar4);
    }

    @Override // a.cne
    public final x1x d(long j, float f, float f2, float f3, float f4, k6z k6zVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new oe80(k9x.r(0L, j));
        }
        jge0 jge0VarR = k9x.r(0L, j);
        k6z k6zVar2 = k6z.f17794a;
        float f5 = k6zVar == k6zVar2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        float f6 = k6zVar == k6zVar2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
        float f7 = k6zVar == k6zVar2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = k6zVar == k6zVar2 ? f4 : f3;
        return new pe80(r8x.u(jge0VarR, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugg0)) {
            return false;
        }
        ugg0 ugg0Var = (ugg0) obj;
        return Intrinsics.d(this.f4649a, ugg0Var.f4649a) && Intrinsics.d(this.b, ugg0Var.b) && Intrinsics.d(this.c, ugg0Var.c) && Intrinsics.d(this.d, ugg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f4649a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f4649a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + Separators.RPAREN;
    }
}
