package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28157a;
    public final a4x b;

    public q5m(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f28157a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5m)) {
            return false;
        }
        q5m q5mVar = (q5m) obj;
        return Intrinsics.d(this.f28157a, q5mVar.f28157a) && Intrinsics.d(this.b, q5mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28157a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("DsCyberGameHeaderMultiTeamsTeamUiModel(name=", this.f28157a, ", icons=", this.b, Separators.RPAREN);
    }
}
