package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class uul0 implements wul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogScreen f36307a;
    public final bjk b;
    public final m7h0 c;

    public uul0(DialogScreen dialogScreen, bjk bjkVar, m7h0 m7h0Var) {
        this.f36307a = dialogScreen;
        this.b = bjkVar;
        this.c = m7h0Var;
    }

    @Override // a.wul0
    public final m7h0 a() {
        return this.f36307a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uul0)) {
            return false;
        }
        uul0 uul0Var = (uul0) obj;
        return this.f36307a.equals(uul0Var.f36307a) && this.b.equals(uul0Var.b) && Intrinsics.d(this.c, uul0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f36307a.hashCode() * 31)) * 31;
        m7h0 m7h0Var = this.c;
        return iHashCode + (m7h0Var == null ? 0 : m7h0Var.hashCode());
    }

    public final String toString() {
        return "DialogEntry(screen=" + this.f36307a + ", dialogParams=" + this.b + ", parent=" + this.c + Separators.RPAREN;
    }
}
