package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ugm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f35632a;

    public ugm(zgm zgmVar) {
        this.f35632a = zgmVar;
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
        return this.f35632a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugm) && this.f35632a.equals(((ugm) obj).f35632a);
    }

    public final int hashCode() {
        return this.f35632a.hashCode();
    }

    public final String toString() {
        return "Hockey(indicatorType=" + this.f35632a + Separators.RPAREN;
    }
}
