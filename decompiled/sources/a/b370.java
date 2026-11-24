package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b370 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f1889a;
    public final pat b;

    public b370(pat patVar, pat patVar2) {
        patVar.getClass();
        patVar2.getClass();
        this.f1889a = patVar;
        this.b = patVar2;
    }

    public static b370 a(pat patVar, pat patVar2) {
        patVar.getClass();
        patVar2.getClass();
        return new b370(patVar, patVar2);
    }

    public static /* synthetic */ b370 b(b370 b370Var, pat patVar, pat patVar2, int i) {
        if ((i & 1) != 0) {
            patVar = b370Var.f1889a;
        }
        if ((i & 2) != 0) {
            patVar2 = b370Var.b;
        }
        b370Var.getClass();
        return a(patVar, patVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b370)) {
            return false;
        }
        b370 b370Var = (b370) obj;
        return Intrinsics.d(this.f1889a, b370Var.f1889a) && Intrinsics.d(this.b, b370Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1889a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesSharedState(actionsState=" + this.f1889a + ", previewState=" + this.b + Separators.RPAREN;
    }
}
