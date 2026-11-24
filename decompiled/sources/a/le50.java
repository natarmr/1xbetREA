package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class le50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogScreen f19884a;
    public final bjk b;

    public le50(DialogScreen dialogScreen, bjk bjkVar) {
        dialogScreen.getClass();
        this.f19884a = dialogScreen;
        this.b = bjkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le50)) {
            return false;
        }
        le50 le50Var = (le50) obj;
        return Intrinsics.d(this.f19884a, le50Var.f19884a) && this.b.equals(le50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19884a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowDialog(screen=" + this.f19884a + ", dialogParams=" + this.b + Separators.RPAREN;
    }
}
