package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rh5 implements vh5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30473a;

    public rh5(String str) {
        str.getClass();
        this.f30473a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh5) && Intrinsics.d(this.f30473a, ((rh5) obj).f30473a);
    }

    public final int hashCode() {
        return this.f30473a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnNavigateForward(navigatePath=", this.f30473a, Separators.RPAREN);
    }
}
