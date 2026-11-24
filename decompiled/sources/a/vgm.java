package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygm f37388a;

    public vgm(ygm ygmVar) {
        this.f37388a = ygmVar;
        zcl zclVar = qmk.f28987a;
    }

    @Override // a.xgm
    public final float a() {
        return Float.NaN;
    }

    @Override // a.xgm
    public final float b() {
        return 0.0f;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f37388a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgm) && this.f37388a.equals(((vgm) obj).f37388a);
    }

    public final int hashCode() {
        return this.f37388a.f42592a.hashCode();
    }

    public final String toString() {
        return "Other(indicatorType=" + this.f37388a + Separators.RPAREN;
    }
}
