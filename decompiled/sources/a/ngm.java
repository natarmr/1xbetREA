package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ngm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f23493a;

    public ngm(zgm zgmVar) {
        this.f23493a = zgmVar;
        zcl zclVar = qmk.f28987a;
    }

    @Override // a.xgm
    public final float a() {
        return 40.0f;
    }

    @Override // a.xgm
    public final float b() {
        return 0.0f;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f23493a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngm) && this.f23493a.equals(((ngm) obj).f23493a);
    }

    public final int hashCode() {
        return this.f23493a.hashCode();
    }

    public final String toString() {
        return "Hockey(indicatorType=" + this.f23493a + Separators.RPAREN;
    }
}
