package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sgk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32166a;

    public sgk0(boolean z) {
        this.f32166a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgk0) && this.f32166a == ((sgk0) obj).f32166a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32166a);
    }

    public final String toString() {
        return defpackage.c.d("SocialAccordionUiModel(isExpand=", Separators.RPAREN, this.f32166a);
    }
}
