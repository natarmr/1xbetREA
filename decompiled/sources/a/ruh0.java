package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ruh0 implements tuh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f31128a;

    public ruh0(jkm jkmVar) {
        jkmVar.getClass();
        this.f31128a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruh0) && Intrinsics.d(this.f31128a, ((ruh0) obj).f31128a);
    }

    public final int hashCode() {
        return this.f31128a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f31128a, Separators.RPAREN);
    }
}
