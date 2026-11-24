package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class thh implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33962a;
    public final a4x b;

    public thh(long j, a4x a4xVar) {
        a4xVar.getClass();
        this.f33962a = j;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thh)) {
            return false;
        }
        thh thhVar = (thh) obj;
        return this.f33962a == thhVar.f33962a && Intrinsics.d(this.b, thhVar.b);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return thh.class;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f33962a) * 31);
    }

    public final String toString() {
        return "CyberTeamsCardUiModel(subSportId=" + this.f33962a + ", cyberTeams=" + this.b + Separators.RPAREN;
    }
}
