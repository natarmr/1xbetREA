package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ee70 implements ge70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f7657a;

    public ee70(mdm mdmVar) {
        mdmVar.getClass();
        this.f7657a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee70) && Intrinsics.d(this.f7657a, ((ee70) obj).f7657a);
    }

    public final int hashCode() {
        return this.f7657a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyContent(emptyConfig=", this.f7657a, Separators.RPAREN);
    }
}
