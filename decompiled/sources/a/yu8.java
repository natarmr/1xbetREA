package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yu8 implements av8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f43255a;

    public yu8(mdm mdmVar) {
        mdmVar.getClass();
        this.f43255a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu8) && Intrinsics.d(this.f43255a, ((yu8) obj).f43255a);
    }

    public final int hashCode() {
        return this.f43255a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyContent(emptyConfig=", this.f43255a, Separators.RPAREN);
    }
}
