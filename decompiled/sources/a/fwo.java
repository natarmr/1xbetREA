package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10268a;
    public final cfq b;

    public fwo(float f, cfq cfqVar) {
        this.f10268a = f;
        this.b = cfqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwo)) {
            return false;
        }
        fwo fwoVar = (fwo) obj;
        return Float.compare(this.f10268a, fwoVar.f10268a) == 0 && Intrinsics.d(this.b, fwoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f10268a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f10268a + ", animationSpec=" + this.b + Separators.RPAREN;
    }
}
