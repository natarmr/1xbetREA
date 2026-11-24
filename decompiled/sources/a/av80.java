package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class av80 implements cv80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f1514a;

    public av80(mdm mdmVar) {
        mdmVar.getClass();
        this.f1514a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av80) && Intrinsics.d(this.f1514a, ((av80) obj).f1514a);
    }

    public final int hashCode() {
        return this.f1514a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyConfig=", this.f1514a, Separators.RPAREN);
    }
}
