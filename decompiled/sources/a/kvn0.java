package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kvn0 implements ovn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3q f18964a;

    public kvn0(b3q b3qVar) {
        b3qVar.getClass();
        this.f18964a = b3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvn0) && Intrinsics.d(this.f18964a, ((kvn0) obj).f18964a);
    }

    public final int hashCode() {
        return this.f18964a.hashCode();
    }

    public final String toString() {
        return "OnClickOnChamp(champ=" + this.f18964a + Separators.RPAREN;
    }
}
