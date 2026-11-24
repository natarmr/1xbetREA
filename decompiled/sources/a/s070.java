package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s070 implements j170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f31400a;

    public s070(pat patVar) {
        patVar.getClass();
        this.f31400a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s070) && Intrinsics.d(this.f31400a, ((s070) obj).f31400a);
    }

    public final int hashCode() {
        return this.f31400a.hashCode();
    }

    public final String toString() {
        return "OnActionsStateChange(state=" + this.f31400a + Separators.RPAREN;
    }
}
