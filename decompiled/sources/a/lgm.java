package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f20016a;

    public lgm(zgm zgmVar) {
        this.f20016a = zgmVar;
        zcl zclVar = qmk.f28987a;
    }

    @Override // a.xgm
    public final float a() {
        return 68.0f;
    }

    @Override // a.xgm
    public final float b() {
        return 0.0f;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f20016a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgm) && this.f20016a.equals(((lgm) obj).f20016a);
    }

    public final int hashCode() {
        return this.f20016a.hashCode();
    }

    public final String toString() {
        return "Hockey(indicatorType=" + this.f20016a + Separators.RPAREN;
    }
}
