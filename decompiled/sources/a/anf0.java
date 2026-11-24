package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class anf0 implements enf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1149a;

    public anf0(a4x a4xVar) {
        a4xVar.getClass();
        this.f1149a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anf0) && Intrinsics.d(this.f1149a, ((anf0) obj).f1149a);
    }

    public final int hashCode() {
        return this.f1149a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f1149a, "Loaded(items=", Separators.RPAREN);
    }
}
