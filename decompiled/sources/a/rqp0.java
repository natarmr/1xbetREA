package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rqp0 implements uqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30943a;

    public rqp0(String str) {
        str.getClass();
        this.f30943a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqp0) && Intrinsics.d(this.f30943a, ((rqp0) obj).f30943a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return rqp0.class;
    }

    public final int hashCode() {
        return this.f30943a.hashCode();
    }

    public final String toString() {
        return kng0.l("EmptyGamesUiModel(text=", this.f30943a, Separators.RPAREN);
    }
}
