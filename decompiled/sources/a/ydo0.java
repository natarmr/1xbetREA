package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ydo0 implements zdo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f42449a;

    public ydo0(a4x a4xVar) {
        a4xVar.getClass();
        this.f42449a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydo0) && Intrinsics.d(this.f42449a, ((ydo0) obj).f42449a);
    }

    public final int hashCode() {
        return this.f42449a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f42449a, "Loading(items=", Separators.RPAREN);
    }
}
