package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kqq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18734a;

    public kqq0(List list) {
        list.getClass();
        this.f18734a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqq0) && Intrinsics.d(this.f18734a, ((kqq0) obj).f18734a);
    }

    public final int hashCode() {
        return this.f18734a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f18734a, "TirageParametersModel(champWithGamesModel=", Separators.RPAREN);
    }
}
