package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ir50 implements kr50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f15240a;

    public ir50(mdm mdmVar) {
        mdmVar.getClass();
        this.f15240a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir50) && Intrinsics.d(this.f15240a, ((ir50) obj).f15240a);
    }

    public final int hashCode() {
        return this.f15240a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f15240a, Separators.RPAREN);
    }
}
