package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zqq implements arq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44817a;

    public zqq(float f) {
        this.f44817a = f;
    }

    @Override // a.arq
    public final float a() {
        return this.f44817a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqq) && Float.compare(this.f44817a, ((zqq) obj).f44817a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f44817a);
    }

    public final String toString() {
        return rw2.j(this.f44817a, "HalfOpened(ratio=", Separators.RPAREN);
    }
}
