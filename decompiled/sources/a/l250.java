package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l250 implements n250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f19292a;

    public l250(i4 i4Var) {
        i4Var.getClass();
        this.f19292a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l250) && Intrinsics.d(this.f19292a, ((l250) obj).f19292a);
    }

    public final int hashCode() {
        return this.f19292a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f19292a, "Content(contentItemsUiModels=", Separators.RPAREN);
    }
}
