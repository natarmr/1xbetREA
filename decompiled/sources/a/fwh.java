package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fwh implements hwh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zvh f10259a;
    public final boolean b;
    public final mdm c;

    public fwh(zvh zvhVar, boolean z, mdm mdmVar) {
        this.f10259a = zvhVar;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.hwh
    public final boolean a() {
        return this.b;
    }

    @Override // a.hwh
    public final zvh b() {
        return this.f10259a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwh)) {
            return false;
        }
        fwh fwhVar = (fwh) obj;
        return this.f10259a.equals(fwhVar.f10259a) && this.b == fwhVar.b && this.c.equals(fwhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f10259a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(cyclingPlayerStatisticsHeaderUiModel=");
        sb.append(this.f10259a);
        sb.append(", headerIsLoaded=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
