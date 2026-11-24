package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f18246a;

    public kgm(zgm zgmVar) {
        this.f18246a = zgmVar;
        zcl zclVar = qmk.f28987a;
    }

    @Override // a.xgm
    public final float a() {
        return 64.0f;
    }

    @Override // a.xgm
    public final float b() {
        return 0.0f;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f18246a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgm) && this.f18246a.equals(((kgm) obj).f18246a);
    }

    public final int hashCode() {
        return this.f18246a.hashCode();
    }

    public final String toString() {
        return "Cricket(indicatorType=" + this.f18246a + Separators.RPAREN;
    }
}
