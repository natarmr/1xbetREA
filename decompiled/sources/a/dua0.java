package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dua0 implements fua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knb f6691a;

    public dua0(knb knbVar) {
        knbVar.getClass();
        this.f6691a = knbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dua0) && Intrinsics.d(this.f6691a, ((dua0) obj).f6691a);
    }

    public final int hashCode() {
        return this.f6691a.hashCode();
    }

    public final String toString() {
        return "Loaded(champsWithTabs=" + this.f6691a + Separators.RPAREN;
    }
}
