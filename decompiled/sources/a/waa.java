package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class waa implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f38816a;
    public final j83 b;
    public final ddp0 c;
    public final ddp0 d;
    public final qal0 e;
    public final String f;
    public final uaa g;
    public final uaa h;
    public final uaa i;
    public final j83 j;

    public waa(j83 j83Var, j83 j83Var2, ddp0 ddp0Var, ddp0 ddp0Var2, qal0 qal0Var, String str, uaa uaaVar, uaa uaaVar2, uaa uaaVar3, j83 j83Var3) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f38816a = j83Var;
        this.b = j83Var2;
        this.c = ddp0Var;
        this.d = ddp0Var2;
        this.e = qal0Var;
        this.f = str;
        this.g = uaaVar;
        this.h = uaaVar2;
        this.i = uaaVar3;
        this.j = j83Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waa)) {
            return false;
        }
        waa waaVar = (waa) obj;
        dja djaVar = dja.PENALTY;
        return this.f38816a.equals(waaVar.f38816a) && this.b.equals(waaVar.b) && this.c.equals(waaVar.c) && this.d.equals(waaVar.d) && Intrinsics.d(this.e, waaVar.e) && Intrinsics.d(this.f, waaVar.f) && this.g.equals(waaVar.g) && this.h.equals(waaVar.h) && this.i.equals(waaVar.i) && this.j.equals(waaVar.j);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.ACTIVE_ZONES;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + brm0.f(this.b, brm0.f(this.f38816a, dja.ACTIVE_ZONES.hashCode() * 31, 31), 31)) * 31)) * 31;
        qal0 qal0Var = this.e;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ua80.b((iHashCode + (qal0Var == null ? 0 : qal0Var.hashCode())) * 31, 31, this.f)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardActiveZonesUiModel(type=" + dja.ACTIVE_ZONES + ", topInfo=" + ((Object) this.f38816a) + ", score=" + ((Object) this.b) + ", teamOne=" + this.c + ", teamTwo=" + this.d + ", matchTimer=" + this.e + ", activeZonesTitle=" + this.f + ", leftZoneActivity=" + this.g + ", centralZoneActivity=" + this.h + ", rightZoneActivity=" + this.i + ", bottomInfo=" + ((Object) this.j) + Separators.RPAREN;
    }
}
