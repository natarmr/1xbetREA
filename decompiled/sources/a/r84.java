package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r84 implements f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f30007a;

    public r84(a4x a4xVar) {
        a4xVar.getClass();
        this.f30007a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r84) && Intrinsics.d(this.f30007a, ((r84) obj).f30007a);
    }

    public final int hashCode() {
        return this.f30007a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f30007a, "AuthHistorySessionsListUiModel(authHistorySessionItemModels=", Separators.RPAREN);
    }
}
