package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z2j implements d3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6w f43671a;

    public z2j(z6w z6wVar) {
        z6wVar.getClass();
        this.f43671a = z6wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2j) && Intrinsics.d(this.f43671a, ((z2j) obj).f43671a);
    }

    public final int hashCode() {
        return this.f43671a.hashCode();
    }

    public final String toString() {
        return "Done(history=" + this.f43671a + Separators.RPAREN;
    }
}
