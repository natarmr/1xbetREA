package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d0v0 implements i0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5284a;

    public d0v0(List list) {
        list.getClass();
        this.f5284a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0v0) && Intrinsics.d(this.f5284a, ((d0v0) obj).f5284a);
    }

    public final int hashCode() {
        return this.f5284a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f5284a, "ShowBonusAccountActionsDialog(bonusAccountUiModelUIModelList=", Separators.RPAREN);
    }
}
