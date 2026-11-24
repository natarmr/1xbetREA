package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jym implements oym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17365a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final a4x e;
    public final kpm f;
    public final String g;
    public final boolean h;

    public jym(String str, String str2, c280 c280Var, c280 c280Var2, a4x a4xVar, kpm kpmVar, String str3, boolean z) {
        w6x.x(a4xVar, str, str2);
        this.f17365a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = a4xVar;
        this.f = kpmVar;
        this.g = str3;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jym)) {
            return false;
        }
        jym jymVar = (jym) obj;
        return Intrinsics.d(this.f17365a, jymVar.f17365a) && Intrinsics.d(this.b, jymVar.b) && this.c.equals(jymVar.c) && this.d.equals(jymVar.d) && Intrinsics.d(this.e, jymVar.e) && this.f.equals(jymVar.f) && this.g.equals(jymVar.g) && this.h == jymVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(dw9.c(this.f, cs0.b(this.e, hne.g(this.d, hne.g(this.c, ua80.b(this.f17365a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(firstOpponentLabel=", this.f17365a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", rouletteList=");
        sbN.append(this.e);
        sbN.append(", scoreModel=");
        sbN.append(this.f);
        sbN.append(", infoLabel=");
        return defpackage.c.c(this.g, ", supportRtl=", Separators.RPAREN, sbN, this.h);
    }
}
