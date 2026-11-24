package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pd5 implements ud5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xyw f26791a;

    public pd5(xyw xywVar) {
        this.f26791a = xywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd5) && this.f26791a.equals(((pd5) obj).f26791a);
    }

    public final int hashCode() {
        return this.f26791a.hashCode();
    }

    public final String toString() {
        return "Image(imageBackgroundType=" + this.f26791a + Separators.RPAREN;
    }
}
