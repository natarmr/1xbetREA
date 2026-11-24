package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class otk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f25833a;
    public final List b;

    public otk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f25833a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otk0)) {
            return false;
        }
        otk0 otk0Var = (otk0) obj;
        return this.f25833a.equals(otk0Var.f25833a) && Intrinsics.d(this.b, otk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25833a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabMedalTableStateModel(contentStatus=", this.f25833a, ", content=", this.b, Separators.RPAREN);
    }
}
