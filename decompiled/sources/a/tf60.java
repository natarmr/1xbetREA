package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33853a;

    public tf60(String str) {
        this.f33853a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tf60) && this.f33853a.equals(((tf60) obj).f33853a);
    }

    public final int hashCode() {
        return this.f33853a.hashCode();
    }

    public final String toString() {
        return kng0.l("OldDeviceTipModel(imagePath=", this.f33853a, Separators.RPAREN);
    }
}
