package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cuq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4999a;

    public cuq0(boolean z) {
        this.f4999a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuq0) && this.f4999a == ((cuq0) obj).f4999a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4999a);
    }

    public final String toString() {
        return defpackage.c.d("DynamicThemeSwitchingEnableModel(enable=", Separators.RPAREN, this.f4999a);
    }
}
