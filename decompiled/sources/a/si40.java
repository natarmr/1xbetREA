package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class si40 implements p6t0, uxx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32246a;
    public final s2m b;
    public final p2m c;
    public final long d;
    public final a4x e;
    public final a4x f;

    public si40(String str, s2m s2mVar, p2m p2mVar, long j, i4 i4Var, i4 i4Var2) {
        str.getClass();
        i4Var.getClass();
        i4Var2.getClass();
        this.f32246a = str;
        this.b = s2mVar;
        this.c = p2mVar;
        this.d = j;
        this.e = i4Var;
        this.f = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si40)) {
            return false;
        }
        si40 si40Var = (si40) obj;
        if (!Intrinsics.d(this.f32246a, si40Var.f32246a) || !this.b.equals(si40Var.b) || !this.c.equals(si40Var.c)) {
            return false;
        }
        long j = si40Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && Intrinsics.d(this.e, si40Var.e) && Intrinsics.d(this.f, si40Var.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f32246a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f32246a.hashCode() * 31)) * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + cs0.b(this.e, rw2.b(iHashCode, 31, this.d), 31);
    }

    public final String toString() {
        return "MlbbGameTeamInfoUiModel(key=" + this.f32246a + ", teamBadge=" + this.b + ", sideBadge=" + this.c + ", accentColor=" + y3d.i(this.d) + ", heroes=" + this.e + ", stats=" + this.f + Separators.RPAREN;
    }
}
