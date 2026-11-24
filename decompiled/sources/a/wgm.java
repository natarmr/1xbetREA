package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f39123a;

    public wgm(zgm zgmVar) {
        this.f39123a = zgmVar;
        zcl zclVar = qmk.f28987a;
    }

    @Override // a.xgm
    public final float a() {
        return 52.0f;
    }

    @Override // a.xgm
    public final float b() {
        return 16.0f;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f39123a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgm) && this.f39123a.equals(((wgm) obj).f39123a);
    }

    public final int hashCode() {
        return this.f39123a.hashCode();
    }

    public final String toString() {
        return "Tennis(indicatorType=" + this.f39123a + Separators.RPAREN;
    }
}
