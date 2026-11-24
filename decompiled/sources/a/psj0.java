package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class psj0 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogScreen f27518a;
    public final boolean b;
    public final boolean c;

    public psj0(DialogScreen dialogScreen, boolean z, boolean z2) {
        dialogScreen.getClass();
        this.f27518a = dialogScreen;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psj0)) {
            return false;
        }
        psj0 psj0Var = (psj0) obj;
        return Intrinsics.d(this.f27518a, psj0Var.f27518a) && this.b == psj0Var.b && this.c == psj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f27518a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowDialog(screen=");
        sb.append(this.f27518a);
        sb.append(", isAllowingStateLoss=");
        sb.append(this.b);
        sb.append(", isShowMultipleDialog=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
