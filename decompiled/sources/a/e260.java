package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e260 implements f260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f7070a;

    public e260(mdm mdmVar) {
        mdmVar.getClass();
        this.f7070a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e260) && Intrinsics.d(this.f7070a, ((e260) obj).f7070a);
    }

    public final int hashCode() {
        return this.f7070a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f7070a, Separators.RPAREN);
    }
}
