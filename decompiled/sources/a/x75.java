package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x75 implements z75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40397a;

    public x75(mdm mdmVar) {
        mdmVar.getClass();
        this.f40397a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x75) && Intrinsics.d(this.f40397a, ((x75) obj).f40397a);
    }

    public final int hashCode() {
        return this.f40397a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyConfig=", this.f40397a, Separators.RPAREN);
    }
}
