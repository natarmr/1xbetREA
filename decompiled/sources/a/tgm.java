package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f33919a;

    public tgm(zgm zgmVar) {
        this.f33919a = zgmVar;
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
        return this.f33919a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgm) && this.f33919a.equals(((tgm) obj).f33919a);
    }

    public final int hashCode() {
        return this.f33919a.hashCode();
    }

    public final String toString() {
        return "Cricket(indicatorType=" + this.f33919a + Separators.RPAREN;
    }
}
