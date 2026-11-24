package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mz60 {
    public static final mz60 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22638a;
    public final a570 b;
    public final hcs c;
    public final hds d;
    public final boolean e;
    public final boolean f;

    static {
        z470 z470Var = new z470(0L);
        hcs hcsVar = hcs.NONE;
        hds.Companion.getClass();
        g = new mz60("", z470Var, hcsVar, dds.a(), false, true);
    }

    public mz60(String str, a570 a570Var, hcs hcsVar, hds hdsVar, boolean z, boolean z2) {
        str.getClass();
        a570Var.getClass();
        hcsVar.getClass();
        hdsVar.getClass();
        this.f22638a = str;
        this.b = a570Var;
        this.c = hcsVar;
        this.d = hdsVar;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz60)) {
            return false;
        }
        mz60 mz60Var = (mz60) obj;
        return Intrinsics.d(this.f22638a, mz60Var.f22638a) && Intrinsics.d(this.b, mz60Var.b) && this.c == mz60Var.c && Intrinsics.d(this.d, mz60Var.d) && this.e == mz60Var.e && this.f == mz60Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f22638a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesItem(gameName=");
        sb.append(this.f22638a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", gameFlag=");
        sb.append(this.c);
        sb.append(", imageInfo=");
        sb.append(this.d);
        sb.append(", underMaintenance=");
        return ohs0.p(", enable=", Separators.RPAREN, sb, this.e, this.f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mz60(pbv pbvVar, String str) {
        this(pbvVar.c, pbvVar.e, pbvVar.d, pbvVar.n, pbvVar.p, pbvVar.q);
        pbvVar.getClass();
        str.getClass();
    }
}
