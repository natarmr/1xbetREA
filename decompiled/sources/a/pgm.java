package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f26961a;
    public final float b;

    public pgm(zgm zgmVar, float f, int i) {
        if ((i & 2) != 0) {
            zcl zclVar = qmk.f28987a;
            f = 16.0f;
        }
        zcl zclVar2 = qmk.f28987a;
        this.f26961a = zgmVar;
        this.b = f;
    }

    @Override // a.xgm
    public final float a() {
        return 32.0f;
    }

    @Override // a.xgm
    public final float b() {
        return this.b;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f26961a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgm)) {
            return false;
        }
        pgm pgmVar = (pgm) obj;
        return this.f26961a.equals(pgmVar.f26961a) && ycl.b(this.b, pgmVar.b) && ycl.b(32.0f, 32.0f);
    }

    public final int hashCode() {
        return Float.hashCode(32.0f) + defpackage.c.a(this.f26961a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strC2 = ycl.c(32.0f);
        StringBuilder sb = new StringBuilder("WithCaption(indicatorType=");
        sb.append(this.f26961a);
        sb.append(", paddingTop=");
        sb.append(strC);
        sb.append(", height=");
        return axq.n(sb, strC2, Separators.RPAREN);
    }
}
