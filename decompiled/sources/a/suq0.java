package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class suq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32834a;

    public suq0(boolean z) {
        this.f32834a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suq0) && this.f32834a == ((suq0) obj).f32834a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32834a);
    }

    public final String toString() {
        return defpackage.c.d("TestServerTestGameModel(enable=", Separators.RPAREN, this.f32834a);
    }
}
