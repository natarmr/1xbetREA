package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jhh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16525a;
    public final a4x b;

    public jhh(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f16525a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhh)) {
            return false;
        }
        jhh jhhVar = (jhh) obj;
        return Intrinsics.d(this.f16525a, jhhVar.f16525a) && Intrinsics.d(this.b, jhhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16525a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("CyberTeamOtherTeamsUiModel(headerTitle=", this.f16525a, ", otherTeamCell=", this.b, Separators.RPAREN);
    }
}
