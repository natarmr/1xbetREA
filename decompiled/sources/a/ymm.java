package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ymm implements zmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42897a;
    public final o0x b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public final y3d f;

    public ymm(String str, o0x o0xVar, String str2, Integer num, y3d y3dVar) {
        str.getClass();
        str2.getClass();
        this.f42897a = str;
        this.b = o0xVar;
        this.c = str2;
        this.d = true;
        this.e = num;
        this.f = y3dVar;
    }

    @Override // a.zmm
    public final String a() {
        return this.c;
    }

    @Override // a.zmm
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymm)) {
            return false;
        }
        ymm ymmVar = (ymm) obj;
        return Intrinsics.d(this.f42897a, ymmVar.f42897a) && Intrinsics.d(this.b, ymmVar.b) && Intrinsics.d(this.c, ymmVar.c) && this.d == ymmVar.d && Intrinsics.d(this.e, ymmVar.e) && Intrinsics.d(this.f, ymmVar.f);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(w6x.d(this.b, this.f42897a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        int iHashCode = 0;
        Integer num = this.e;
        int iHashCode2 = (iE + (num == null ? 0 : num.hashCode())) * 31;
        y3d y3dVar = this.f;
        if (y3dVar != null) {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneCountry(code=");
        sb.append(this.f42897a);
        sb.append(", flagIcon=");
        sb.append(this.b);
        sb.append(", label=");
        brm0.C(this.c, ", enableChangeCode=", ", flagPlaceholderResId=", sb, this.d);
        sb.append(this.e);
        sb.append(", tintColor=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public /* synthetic */ ymm(String str, o0x o0xVar, String str2, y3d y3dVar, int i) {
        this(str, o0xVar, str2, (Integer) null, (i & 32) != 0 ? null : y3dVar);
    }
}
