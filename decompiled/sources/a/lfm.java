package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lfm implements mfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19964a;
    public final cgm b;

    public lfm(String str, cgm cgmVar) {
        str.getClass();
        this.f19964a = str;
        this.b = cgmVar;
    }

    @Override // a.mfm
    public final dgm a() {
        return this.b;
    }

    @Override // a.mfm
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfm)) {
            return false;
        }
        lfm lfmVar = (lfm) obj;
        return Intrinsics.d(this.f19964a, lfmVar.f19964a) && this.b.equals(lfmVar.b);
    }

    @Override // a.mfm
    public final String getHeader() {
        return this.f19964a;
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(this.f19964a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "WithHeader(header=" + this.f19964a + ", isPopular=false, style=" + this.b + Separators.RPAREN;
    }
}
