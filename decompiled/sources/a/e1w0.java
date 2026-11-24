package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class e1w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogScreen f7058a;

    public e1w0(DialogScreen dialogScreen) {
        dialogScreen.getClass();
        this.f7058a = dialogScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1w0) && Intrinsics.d(this.f7058a, ((e1w0) obj).f7058a);
    }

    public final int hashCode() {
        return this.f7058a.hashCode();
    }

    public final String toString() {
        return "Show(dialog=" + this.f7058a + Separators.RPAREN;
    }
}
