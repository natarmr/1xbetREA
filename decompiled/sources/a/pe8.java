package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pe8 implements Serializable {
    public static final oe8 Companion = new oe8();
    public static final a8z[] n = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new os7(28)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26839a;
    public final String b;
    public final int c;
    public final hcs d;
    public final a570 e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final hds j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public /* synthetic */ pe8(int i, long j, String str, int i2, hcs hcsVar, a570 a570Var, String str2, boolean z, boolean z2, List list, hds hdsVar, boolean z3, boolean z4, boolean z5) {
        if (2047 != (i & 2047)) {
            m2x.I(i, 2047, ne8.f23372a.getDescriptor());
            throw null;
        }
        this.f26839a = j;
        this.b = str;
        this.c = i2;
        this.d = hcsVar;
        this.e = a570Var;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = list;
        this.j = hdsVar;
        this.k = z3;
        this.l = (i & 2048) == 0 ? true : z4;
        this.m = (i & 4096) == 0 ? false : z5;
    }

    public static pe8 a(pe8 pe8Var, boolean z, boolean z2, int i) {
        long j = pe8Var.f26839a;
        String str = pe8Var.b;
        int i2 = pe8Var.c;
        hcs hcsVar = pe8Var.d;
        a570 a570Var = pe8Var.e;
        String str2 = pe8Var.f;
        boolean z3 = pe8Var.g;
        boolean z4 = pe8Var.h;
        List list = pe8Var.i;
        hds hdsVar = pe8Var.j;
        boolean z5 = (i & 2048) != 0 ? pe8Var.l : z2;
        boolean z6 = pe8Var.m;
        pe8Var.getClass();
        str.getClass();
        hcsVar.getClass();
        a570Var.getClass();
        str2.getClass();
        list.getClass();
        hdsVar.getClass();
        return new pe8(j, str, i2, hcsVar, a570Var, str2, z3, z4, list, hdsVar, z, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe8)) {
            return false;
        }
        pe8 pe8Var = (pe8) obj;
        return this.f26839a == pe8Var.f26839a && Intrinsics.d(this.b, pe8Var.b) && this.c == pe8Var.c && this.d == pe8Var.d && Intrinsics.d(this.e, pe8Var.e) && Intrinsics.d(this.f, pe8Var.f) && this.g == pe8Var.g && this.h == pe8Var.h && Intrinsics.d(this.i, pe8Var.i) && Intrinsics.d(this.j, pe8Var.j) && this.k == pe8Var.k && this.l == pe8Var.l && this.m == pe8Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(brm0.e((this.j.hashCode() + dw9.a(brm0.e(brm0.e(ua80.b((this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, ua80.b(Long.hashCode(this.f26839a) * 31, 31, this.b), 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26839a, "BonusGamePreviewResult(id=", ", gameName=", this.b);
        sbO.append(", gameNameId=");
        sbO.append(this.c);
        sbO.append(", gameFlag=");
        sbO.append(this.d);
        sbO.append(", gameType=");
        sbO.append(this.e);
        sbO.append(", maxCoef=");
        sbO.append(this.f);
        w6x.A(", isGameWithCashback=", ", forceIFrame=", sbO, this.g, this.h);
        sbO.append(", categories=");
        sbO.append(this.i);
        sbO.append(", imageInfo=");
        sbO.append(this.j);
        w6x.A(", underMaintenance=", ", enable=", sbO, this.k, this.l);
        return f140.n(sbO, ", fullScreenEnable=", this.m, Separators.RPAREN);
    }

    public pe8(long j, String str, int i, hcs hcsVar, a570 a570Var, String str2, boolean z, boolean z2, List list, hds hdsVar, boolean z3, boolean z4, boolean z5) {
        list.getClass();
        this.f26839a = j;
        this.b = str;
        this.c = i;
        this.d = hcsVar;
        this.e = a570Var;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = list;
        this.j = hdsVar;
        this.k = z3;
        this.l = z4;
        this.m = z5;
    }
}
