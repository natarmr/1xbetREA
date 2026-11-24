package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rb2 implements tb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30162a;

    public /* synthetic */ rb2(String str) {
        this.f30162a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rb2) {
            return this.f30162a.equals(((rb2) obj).f30162a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30162a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchInput(value=", this.f30162a, Separators.RPAREN);
    }
}
