package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fuq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10177a;

    public fuq0(boolean z) {
        this.f10177a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuq0) && this.f10177a == ((fuq0) obj).f10177a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10177a);
    }

    public final String toString() {
        return defpackage.c.d("LogNewEventParamsModel(enable=", Separators.RPAREN, this.f10177a);
    }
}
