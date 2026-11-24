package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f30444a;

    public rgm(zgm zgmVar) {
        this.f30444a = zgmVar;
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
        return this.f30444a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgm) && this.f30444a.equals(((rgm) obj).f30444a);
    }

    public final int hashCode() {
        return this.f30444a.hashCode();
    }

    public final String toString() {
        return "Hockey(indicatorType=" + this.f30444a + Separators.RPAREN;
    }
}
