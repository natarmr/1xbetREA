package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kq50 implements mq50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f18704a;

    public kq50(mdm mdmVar) {
        mdmVar.getClass();
        this.f18704a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq50) && Intrinsics.d(this.f18704a, ((kq50) obj).f18704a);
    }

    public final int hashCode() {
        return this.f18704a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f18704a, Separators.RPAREN);
    }
}
