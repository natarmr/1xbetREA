package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fsm0 implements f83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10072a;

    public /* synthetic */ fsm0(String str) {
        this.f10072a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fsm0) {
            return Intrinsics.d(this.f10072a, ((fsm0) obj).f10072a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10072a.hashCode();
    }

    public final String toString() {
        return kng0.l("StringAnnotation(value=", this.f10072a, Separators.RPAREN);
    }
}
