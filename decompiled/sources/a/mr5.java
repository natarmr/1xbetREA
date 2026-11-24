package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mr5 implements or5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uvc f22252a;

    public mr5(uvc uvcVar) {
        uvcVar.getClass();
        this.f22252a = uvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr5) && Intrinsics.d(this.f22252a, ((mr5) obj).f22252a);
    }

    public final int hashCode() {
        return this.f22252a.hashCode();
    }

    public final String toString() {
        return "Cms(model=" + this.f22252a + Separators.RPAREN;
    }
}
