package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yd50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjk f42417a;

    public yd50(bjk bjkVar) {
        bjkVar.getClass();
        this.f42417a = bjkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd50) && Intrinsics.d(this.f42417a, ((yd50) obj).f42417a);
    }

    public final int hashCode() {
        return this.f42417a.hashCode();
    }

    public final String toString() {
        return "DismissCurrentDialog(dialogParams=" + this.f42417a + Separators.RPAREN;
    }
}
