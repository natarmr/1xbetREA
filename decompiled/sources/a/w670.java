package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w670 implements y670 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5v0 f38614a;

    public w670(c5v0 c5v0Var) {
        c5v0Var.getClass();
        this.f38614a = c5v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w670) && Intrinsics.d(this.f38614a, ((w670) obj).f38614a);
    }

    public final int hashCode() {
        return this.f38614a.hashCode();
    }

    public final String toString() {
        return "OnWebViewInitialized(webViewHolder=" + this.f38614a + Separators.RPAREN;
    }
}
