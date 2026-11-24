package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b110 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1786a;
    public final z510 b;
    public final z510 c;
    public final o0x d;
    public final int e;
    public final int f;

    public b110(i4 i4Var, z510 z510Var, z510 z510Var2, o0x o0xVar, int i, int i2) {
        i4Var.getClass();
        this.f1786a = i4Var;
        this.b = z510Var;
        this.c = z510Var2;
        this.d = o0xVar;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b110)) {
            return false;
        }
        b110 b110Var = (b110) obj;
        return Intrinsics.d(this.f1786a, b110Var.f1786a) && this.b.equals(b110Var.b) && this.c.equals(b110Var.c) && this.d.equals(b110Var.d) && this.e == b110Var.e && this.f == b110Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, w6x.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f1786a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LolMapUiModel(buildings=");
        sb.append(this.f1786a);
        sb.append(", radiantTeamStatistic=");
        sb.append(this.b);
        sb.append(", direTeamStatistic=");
        sb.append(this.c);
        sb.append(", mapImg=");
        sb.append(this.d);
        sb.append(", baronMapIcon=");
        return w6x.o(this.e, this.f, ", dragonMapIcon=", Separators.RPAREN, sb);
    }
}
