package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f20007a;
    public final ogg b;

    public lgg(a4x a4xVar, ogg oggVar) {
        a4xVar.getClass();
        this.f20007a = a4xVar;
        this.b = oggVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgg)) {
            return false;
        }
        lgg lggVar = (lgg) obj;
        return Intrinsics.d(this.f20007a, lggVar.f20007a) && this.b.equals(lggVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20007a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampsContentStateUiModel(champsItems=" + this.f20007a + ", state=" + this.b + Separators.RPAREN;
    }
}
