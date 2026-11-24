package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f28692a;

    public qgm(zgm zgmVar) {
        this.f28692a = zgmVar;
        zcl zclVar = qmk.f28987a;
    }

    @Override // a.xgm
    public final float a() {
        return 52.0f;
    }

    @Override // a.xgm
    public final float b() {
        return 0.0f;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f28692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgm) && this.f28692a.equals(((qgm) obj).f28692a);
    }

    public final int hashCode() {
        return this.f28692a.hashCode();
    }

    public final String toString() {
        return "Cricket(indicatorType=" + this.f28692a + Separators.RPAREN;
    }
}
