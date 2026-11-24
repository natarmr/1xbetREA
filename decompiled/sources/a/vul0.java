package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vul0 implements wul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f38054a;

    public vul0(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.f38054a = m7h0Var;
    }

    @Override // a.wul0
    public final m7h0 a() {
        return this.f38054a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vul0) && Intrinsics.d(this.f38054a, ((vul0) obj).f38054a);
    }

    public final int hashCode() {
        return this.f38054a.hashCode();
    }

    public final String toString() {
        return "ScreenEntry(screen=" + this.f38054a + Separators.RPAREN;
    }
}
