package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class prm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27473a;
    public final lrm b;
    public final orm c;
    public final a4x d;
    public final boolean e;

    public prm(float f, lrm lrmVar, nrm nrmVar, a4x a4xVar, boolean z, int i) {
        lrmVar = (i & 8) != 0 ? irm.f15264a : lrmVar;
        orm ormVar = (i & 16) != 0 ? mrm.f22280a : nrmVar;
        a4xVar = (i & 32) != 0 ? null : a4xVar;
        z = (i & 128) != 0 ? true : z;
        this.f27473a = f;
        this.b = lrmVar;
        this.c = ormVar;
        this.d = a4xVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prm)) {
            return false;
        }
        prm prmVar = (prm) obj;
        return Float.compare(this.f27473a, prmVar.f27473a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(100.0f, 100.0f) == 0 && this.b.equals(prmVar.b) && this.c.equals(prmVar.c) && Intrinsics.d(this.d, prmVar.d) && this.e == prmVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f27473a) * 31, 0.0f, 31), 100.0f, 31)) * 31)) * 31;
        a4x a4xVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (a4xVar == null ? 0 : a4xVar.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsSliderUiModel(selectValue=");
        sb.append(this.f27473a);
        sb.append(", min=0.0, max=100.0, labels=");
        sb.append(this.b);
        sb.append(", stepIndicators=");
        sb.append(this.c);
        sb.append(", steps=");
        sb.append(this.d);
        sb.append(", customColors=null, isEnabled=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
