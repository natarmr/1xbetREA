package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ywc0 implements bxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd50 f43365a;

    public ywc0(hd50 hd50Var) {
        hd50Var.getClass();
        this.f43365a = hd50Var;
    }

    @Override // a.bxc0
    public final hd50 a() {
        return this.f43365a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywc0) && Intrinsics.d(this.f43365a, ((ywc0) obj).f43365a);
    }

    public final int hashCode() {
        return this.f43365a.f12854a.hashCode();
    }

    public final String toString() {
        return "Content(navigationBarUiState=" + this.f43365a + Separators.RPAREN;
    }
}
