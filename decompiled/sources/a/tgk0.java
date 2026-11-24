package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tgk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33917a;

    public tgk0(boolean z) {
        this.f33917a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgk0) && this.f33917a == ((tgk0) obj).f33917a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33917a);
    }

    public final String toString() {
        return defpackage.c.d("SocialAccordionUiModel(isExpand=", Separators.RPAREN, this.f33917a);
    }
}
