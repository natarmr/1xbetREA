package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygm f21750a;

    public mgm(ygm ygmVar) {
        this.f21750a = ygmVar;
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
        return this.f21750a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgm) && this.f21750a.equals(((mgm) obj).f21750a);
    }

    public final int hashCode() {
        return this.f21750a.f42592a.hashCode();
    }

    public final String toString() {
        return "Other(indicatorType=" + this.f21750a + Separators.RPAREN;
    }
}
