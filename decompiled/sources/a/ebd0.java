package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ebd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7514a;

    public ebd0(String str) {
        this.f7514a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebd0) && this.f7514a.equals(((ebd0) obj).f7514a);
    }

    public final int hashCode() {
        return this.f7514a.hashCode();
    }

    public final String toString() {
        return kng0.l("InfoWeb(url=", this.f7514a, Separators.RPAREN);
    }
}
