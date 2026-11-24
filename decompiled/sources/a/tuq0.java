package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tuq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34563a;

    public tuq0(boolean z) {
        this.f34563a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuq0) && this.f34563a == ((tuq0) obj).f34563a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34563a);
    }

    public final String toString() {
        return defpackage.c.d("TestToolsEnabledModel(enable=", Separators.RPAREN, this.f34563a);
    }
}
