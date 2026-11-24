package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31897a;

    public sar(List list) {
        list.getClass();
        this.f31897a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sar) && Intrinsics.d(this.f31897a, ((sar) obj).f31897a);
    }

    public final int hashCode() {
        return this.f31897a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31897a, "FullDescriptionUiModel(fullDescriptionList=", Separators.RPAREN);
    }
}
