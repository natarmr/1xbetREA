package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fm implements hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9761a;
    public final zrm b;

    public fm(String str, zrm zrmVar) {
        this.f9761a = str;
        this.b = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        return this.f9761a.equals(fmVar.f9761a) && this.b.equals(fmVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f9761a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9761a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(key=" + this.f9761a + ", dsSportCellStyle=" + this.b + Separators.RPAREN;
    }
}
