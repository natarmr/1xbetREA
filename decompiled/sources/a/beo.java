package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class beo implements zdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2460a;
    public final long b;
    public final tvw c;
    public final String d;
    public final a4x e;
    public final String f;
    public final a4x g;
    public final String h;
    public final a4x i;
    public final String j;
    public final u180 k;
    public final a4x l;

    public beo(String str, long j, tvw tvwVar, String str2, a4x a4xVar, String str3, a4x a4xVar2, String str4, a4x a4xVar3, String str5, u180 u180Var, a4x a4xVar4) {
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        a4xVar4.getClass();
        this.f2460a = str;
        this.b = j;
        this.c = tvwVar;
        this.d = str2;
        this.e = a4xVar;
        this.f = str3;
        this.g = a4xVar2;
        this.h = str4;
        this.i = a4xVar3;
        this.j = str5;
        this.k = u180Var;
        this.l = a4xVar4;
    }

    @Override // a.zdo
    public final String a() {
        return this.f2460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beo)) {
            return false;
        }
        beo beoVar = (beo) obj;
        return this.f2460a.equals(beoVar.f2460a) && this.b == beoVar.b && this.c.equals(beoVar.c) && Intrinsics.d(this.d, beoVar.d) && Intrinsics.d(this.e, beoVar.e) && this.f.equals(beoVar.f) && Intrinsics.d(this.g, beoVar.g) && this.h.equals(beoVar.h) && Intrinsics.d(this.i, beoVar.i) && this.j.equals(beoVar.j) && this.k.equals(beoVar.k) && Intrinsics.d(this.l, beoVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ua80.b(cs0.b(this.i, ua80.b(cs0.b(this.g, ua80.b(cs0.b(this.e, ua80.b((this.c.hashCode() + rw2.b(this.f2460a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31, this.f), 31), 31, this.h), 31), 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "EventItemUiModel(eventKey=", this.f2460a, ", gameId=");
        sbO.append(", iconBetUiModel=");
        sbO.append(this.c);
        sbO.append(", title=");
        sbO.append(this.d);
        sbO.append(", tagList=");
        sbO.append(this.e);
        sbO.append(", teamOne=");
        sbO.append(this.f);
        sbO.append(", teamOneImageList=");
        sbO.append(this.g);
        sbO.append(", teamSecond=");
        sbO.append(this.h);
        sbO.append(", teamSecondImageList=");
        sbO.append(this.i);
        sbO.append(", score=");
        sbO.append(this.j);
        sbO.append(", opponentCardModel=");
        sbO.append(this.k);
        sbO.append(", eventItemDescriptions=");
        sbO.append(this.l);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
