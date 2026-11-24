package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ogm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f25227a;

    public ogm(zgm zgmVar) {
        this.f25227a = zgmVar;
        zcl zclVar = qmk.f28987a;
    }

    @Override // a.xgm
    public final float a() {
        return 32.0f;
    }

    @Override // a.xgm
    public final float b() {
        return 0.0f;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f25227a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogm) && this.f25227a.equals(((ogm) obj).f25227a);
    }

    public final int hashCode() {
        return this.f25227a.hashCode();
    }

    public final String toString() {
        return "Other(indicatorType=" + this.f25227a + Separators.RPAREN;
    }
}
