package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41495a;

    public xu50(List list) {
        list.getClass();
        this.f41495a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu50) && Intrinsics.d(this.f41495a, ((xu50) obj).f41495a);
    }

    public final int hashCode() {
        return this.f41495a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f41495a, "NewsModel(teamNewsModels=", Separators.RPAREN);
    }
}
