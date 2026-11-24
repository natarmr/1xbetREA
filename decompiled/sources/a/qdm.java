package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f28541a;
    public final float b;
    public final float c;
    public final d4d d;
    public final float e;
    public final float f;

    public qdm(d4d d4dVar, float f, float f2, d4d d4dVar2, float f3, float f4) {
        d4dVar.getClass();
        d4dVar2.getClass();
        this.f28541a = d4dVar;
        this.b = f;
        this.c = f2;
        this.d = d4dVar2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdm)) {
            return false;
        }
        qdm qdmVar = (qdm) obj;
        return this.f28541a == qdmVar.f28541a && ycl.b(this.b, qdmVar.b) && ycl.b(this.c, qdmVar.c) && this.d == qdmVar.d && ycl.b(this.e, qdmVar.e) && ycl.b(this.f, qdmVar.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + defpackage.c.a(dw9.b(this.d, defpackage.c.a(defpackage.c.a(this.f28541a.hashCode() * 31, this.b, 31), this.c, 31), 31), this.e, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strC2 = ycl.c(this.c);
        String strC3 = ycl.c(this.e);
        String strC4 = ycl.c(this.f);
        StringBuilder sb = new StringBuilder("DsEventCardAccordionConfig(accordionBtnColorKey=");
        sb.append(this.f28541a);
        sb.append(", accordionContainerWidth=");
        sb.append(strC);
        sb.append(", accordionContainerHeight=");
        sb.append(strC2);
        sb.append(", accordionBackgroundColorKey=");
        sb.append(this.d);
        sb.append(", accordionStartPadding=");
        return ua80.m(sb, strC3, ", accordionEndPadding=", strC4, Separators.RPAREN);
    }
}
