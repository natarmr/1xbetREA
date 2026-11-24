package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f40590a;

    public final boolean equals(Object obj) {
        if (obj instanceof xb80) {
            return this.f40590a.equals(((xb80) obj).f40590a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40590a.hashCode();
    }

    public final String toString() {
        return vqd.m("SportGamesDelegateAction(delegateAction=", this.f40590a, Separators.RPAREN);
    }
}
