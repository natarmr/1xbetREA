package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z510 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43798a;
    public final String b;
    public final a4x c;
    public final float d;
    public final a4x e;
    public final boolean f;

    public z510(String str, String str2, a4x a4xVar, float f, a4x a4xVar2, boolean z) {
        str.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f43798a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = f;
        this.e = a4xVar2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z510)) {
            return false;
        }
        z510 z510Var = (z510) obj;
        return Intrinsics.d(this.f43798a, z510Var.f43798a) && this.b.equals(z510Var.b) && Intrinsics.d(this.c, z510Var.c) && Float.compare(this.d, z510Var.d) == 0 && Intrinsics.d(this.e, z510Var.e) && this.f == z510Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cs0.b(this.e, defpackage.c.a(cs0.b(this.c, ua80.b(this.f43798a.hashCode() * 31, 31, this.b), 31), this.d, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LolTeamStageUiModel(name=", this.f43798a, ", image=", this.b, ", heroes=");
        sbN.append(this.c);
        sbN.append(", goldCount=");
        sbN.append(this.d);
        sbN.append(", dragonsDead=");
        return rz4.m(sbN, this.e, ", allHeroesDead=", this.f, Separators.RPAREN);
    }
}
