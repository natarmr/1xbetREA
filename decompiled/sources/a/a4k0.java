package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f228a;

    public a4k0(hjm hjmVar) {
        this.f228a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4k0) && Intrinsics.d(this.f228a, ((a4k0) obj).f228a);
    }

    public final int hashCode() {
        jjm jjmVar = this.f228a;
        if (jjmVar == null) {
            return 0;
        }
        return jjmVar.hashCode();
    }

    public final String toString() {
        return "SingleStageUiState(header=" + this.f228a + Separators.RPAREN;
    }
}
