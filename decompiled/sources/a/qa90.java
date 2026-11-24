package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qa90 implements ta90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lun f28384a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final mdm e;

    public qa90(lun lunVar, boolean z, boolean z2, float f, mdm mdmVar) {
        this.f28384a = lunVar;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = mdmVar;
    }

    @Override // a.ta90
    public final boolean a() {
        return this.b;
    }

    @Override // a.ta90
    public final float b() {
        return this.d;
    }

    @Override // a.ta90
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa90)) {
            return false;
        }
        qa90 qa90Var = (qa90) obj;
        return this.f28384a.equals(qa90Var.f28384a) && this.b == qa90Var.b && this.c == qa90Var.c && Float.compare(this.d, qa90Var.d) == 0 && this.e.equals(qa90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + defpackage.c.a(brm0.e(Boolean.hashCode(this.b) * 31, 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(url=, extraHeaders=");
        sb.append(this.f28384a);
        sb.append(", reloadEnable=");
        sb.append(this.b);
        sb.append(", deposit=");
        sb.append(this.c);
        sb.append(", reloadButtonAlpha=");
        sb.append(this.d);
        sb.append(", errorConfig=");
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
