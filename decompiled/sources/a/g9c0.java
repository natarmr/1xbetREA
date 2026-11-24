package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g9c0 implements j9c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10907a;

    public g9c0(String str) {
        this.f10907a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9c0) && this.f10907a.equals(((g9c0) obj).f10907a);
    }

    public final int hashCode() {
        return this.f10907a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnValueChange(newValue=", this.f10907a, Separators.RPAREN);
    }
}
