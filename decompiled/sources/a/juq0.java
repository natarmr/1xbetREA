package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class juq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17170a;

    public juq0(boolean z) {
        this.f17170a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof juq0) && this.f17170a == ((juq0) obj).f17170a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17170a);
    }

    public final String toString() {
        return defpackage.c.d("OnlyTestBannersModel(enable=", Separators.RPAREN, this.f17170a);
    }
}
