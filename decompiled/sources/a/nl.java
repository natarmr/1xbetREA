package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nl {
    public static final ml Companion = new ml();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll f23704a;

    public /* synthetic */ nl(int i, ll llVar) {
        if ((i & 1) == 0) {
            this.f23704a = null;
        } else {
            this.f23704a = llVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl) && Intrinsics.d(this.f23704a, ((nl) obj).f23704a);
    }

    public final int hashCode() {
        ll llVar = this.f23704a;
        if (llVar == null) {
            return 0;
        }
        return llVar.hashCode();
    }

    public final String toString() {
        return "ActiveBonusSumResponse(data=" + this.f23704a + Separators.RPAREN;
    }
}
