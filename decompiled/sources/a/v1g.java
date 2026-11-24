package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v1g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36627a;
    public final a4x b;
    public final long c;
    public final String d;

    public v1g(String str, i4 i4Var, long j, String str2) {
        str.getClass();
        i4Var.getClass();
        str2.getClass();
        this.f36627a = str;
        this.b = i4Var;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1g)) {
            return false;
        }
        v1g v1gVar = (v1g) obj;
        if (!Intrinsics.d(this.f36627a, v1gVar.f36627a) || !Intrinsics.d(this.b, v1gVar.b)) {
            return false;
        }
        long j = v1gVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && Intrinsics.d(this.d, v1gVar.d);
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f36627a.hashCode() * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.d.hashCode() + rw2.b(iB, 31, this.c);
    }

    public final String toString() {
        return ua80.m(kng0.u("CyberBakkaraOpponentUiModel(name=", this.f36627a, ", cardList=", this.b, ", backgroundColor="), y3d.i(this.c), ", score=", this.d, Separators.RPAREN);
    }
}
