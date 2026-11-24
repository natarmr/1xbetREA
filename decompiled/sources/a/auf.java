package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class auf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1476a;
    public final int b;
    public final int c;

    public auf(String str, int i, int i2) {
        str.getClass();
        this.f1476a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auf)) {
            return false;
        }
        auf aufVar = (auf) obj;
        return Intrinsics.d(this.f1476a, aufVar.f1476a) && this.b == aufVar.b && this.c == aufVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f1476a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "CupheadRoundInformationStageUiModel(stageTitle=", this.f1476a, ", stageCount=", ", finishedStageCount="));
    }
}
