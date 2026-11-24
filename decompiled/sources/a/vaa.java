package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vaa implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mpm f37076a;
    public final kdp0 b;
    public final kdp0 c;
    public final String d;
    public final taa e;
    public final taa f;
    public final taa g;
    public final j83 h;

    public vaa(mpm mpmVar, kdp0 kdp0Var, kdp0 kdp0Var2, String str, taa taaVar, taa taaVar2, taa taaVar3, j83 j83Var) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f37076a = mpmVar;
        this.b = kdp0Var;
        this.c = kdp0Var2;
        this.d = str;
        this.e = taaVar;
        this.f = taaVar2;
        this.g = taaVar3;
        this.h = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaa)) {
            return false;
        }
        vaa vaaVar = (vaa) obj;
        dja djaVar = dja.PENALTY;
        return this.f37076a.equals(vaaVar.f37076a) && this.b.equals(vaaVar.b) && this.c.equals(vaaVar.c) && Intrinsics.d(this.d, vaaVar.d) && this.e.equals(vaaVar.e) && this.f.equals(vaaVar.f) && this.g.equals(vaaVar.g) && this.h.equals(vaaVar.h);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.ACTIVE_ZONES;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + ohs0.e(this.f37076a, dja.ACTIVE_ZONES.hashCode() * 31, 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardActiveZonesUiModel(type=" + dja.ACTIVE_ZONES + ", score=" + this.f37076a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", activeZonesTitle=" + this.d + ", leftZoneActivity=" + this.e + ", centralZoneActivity=" + this.f + ", rightZoneActivity=" + this.g + ", bottomInfo=" + ((Object) this.h) + Separators.RPAREN;
    }
}
