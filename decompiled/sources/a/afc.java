package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class afc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f771a;

    public afc(List list) {
        list.getClass();
        this.f771a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afc) && Intrinsics.d(this.f771a, ((afc) obj).f771a);
    }

    public final int hashCode() {
        return this.f771a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f771a, "ChooseCredsState(models=", Separators.RPAREN);
    }
}
