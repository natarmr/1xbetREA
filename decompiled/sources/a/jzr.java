package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jzr implements qzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aus f17430a;
    public final boolean b;

    public jzr(aus ausVar, boolean z) {
        this.f17430a = ausVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzr)) {
            return false;
        }
        jzr jzrVar = (jzr) obj;
        return this.f17430a.equals(jzrVar.f17430a) && this.b == jzrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f17430a.hashCode() * 31);
    }

    public final String toString() {
        return "Description(subTitle=" + this.f17430a + ", timerVisible=" + this.b + Separators.RPAREN;
    }
}
