package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class z2l extends a3l {
    public final boolean b;
    public final String c;
    public final float d;
    public final float e;
    public final j6l f;

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    /* JADX WARN: Illegal instructions before constructor call */
    public z2l(boolean z, String str, float f, float f2, j6l j6lVar) {
        int i;
        str.getClass();
        j6l j6lVar2 = j6l.f15993a;
        if (j6lVar == j6lVar2 && z) {
            i = R.drawable.dota_tower_radiant_active;
        } else if (j6lVar != j6lVar2 || z) {
            j6l j6lVar3 = j6l.b;
            if (j6lVar == j6lVar3 && z) {
                i = R.drawable.dota_tower_dire_active;
            } else if (j6lVar != j6lVar3 || z) {
                i = 0;
            } else {
                i = R.drawable.dota_tower_inactive;
            }
        } else {
            i = R.drawable.dota_tower_inactive;
        }
        super(i);
        this.b = z;
        this.c = str;
        this.d = f;
        this.e = f2;
        this.f = j6lVar;
    }

    @Override // a.a3l
    public final String a() {
        return this.c;
    }

    @Override // a.a3l
    public final float b() {
        return this.d;
    }

    @Override // a.a3l
    public final float c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2l)) {
            return false;
        }
        z2l z2lVar = (z2l) obj;
        return this.b == z2lVar.b && Intrinsics.d(this.c, z2lVar.c) && Float.compare(this.d, z2lVar.d) == 0 && Float.compare(this.e, z2lVar.e) == 0 && this.f == z2lVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + defpackage.c.a(defpackage.c.a(ua80.b(Boolean.hashCode(this.b) * 31, 31, this.c), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("DotaBuildingTowerUiModel(active=", ", buildingName=", this.c, this.b, ", positionX=");
        vqd.v(sbQ, this.d, ", positionY=", this.e, ", race=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
