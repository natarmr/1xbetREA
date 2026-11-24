package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class avk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f1530a;
    public final List b;

    public avk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f1530a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avk0)) {
            return false;
        }
        avk0 avk0Var = (avk0) obj;
        return this.f1530a.equals(avk0Var.f1530a) && Intrinsics.d(this.b, avk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1530a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabSocialNetsStateModel(contentStatus=", this.f1530a, ", content=", this.b, Separators.RPAREN);
    }
}
