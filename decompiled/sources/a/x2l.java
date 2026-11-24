package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x2l extends a3l {
    public final String b;
    public final float c;
    public final float d;
    public final j6l e;

    /* JADX WARN: Illegal instructions before constructor call */
    public x2l(String str, float f, float f2, j6l j6lVar) {
        int i;
        str.getClass();
        int iOrdinal = j6lVar.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.dota_trone_radiant;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                throw null;
            }
            i = R.drawable.dota_trone_dire;
        }
        super(i);
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = j6lVar;
    }

    @Override // a.a3l
    public final String a() {
        return this.b;
    }

    @Override // a.a3l
    public final float b() {
        return this.c;
    }

    @Override // a.a3l
    public final float c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2l)) {
            return false;
        }
        x2l x2lVar = (x2l) obj;
        return Intrinsics.d(this.b, x2lVar.b) && Float.compare(this.c, x2lVar.c) == 0 && Float.compare(this.d, x2lVar.d) == 0 && this.e == x2lVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + defpackage.c.a(defpackage.c.a(this.b.hashCode() * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        return "DotaBuildingAncientsUiModel(buildingName=" + this.b + ", positionX=" + this.c + ", positionY=" + this.d + ", race=" + this.e + Separators.RPAREN;
    }
}
