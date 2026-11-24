package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gsv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11849a;
    public final hjm b;

    public gsv(hjm hjmVar, String str) {
        str.getClass();
        this.f11849a = str;
        this.b = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsv)) {
            return false;
        }
        gsv gsvVar = (gsv) obj;
        return Intrinsics.d(this.f11849a, gsvVar.f11849a) && this.b.equals(gsvVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f11849a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11849a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderUiItem(key=" + this.f11849a + ", model=" + this.b + Separators.RPAREN;
    }
}
