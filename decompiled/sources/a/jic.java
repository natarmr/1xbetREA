package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16567a;
    public final long b;

    public jic(long j, ArrayList arrayList) {
        this.f16567a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jic)) {
            return false;
        }
        jic jicVar = (jic) obj;
        return this.f16567a.equals(jicVar.f16567a) && this.b == jicVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f16567a.hashCode() * 31);
    }

    public final String toString() {
        return "ChooseSubGameState(subGames=" + this.f16567a + ", selectedSubGameId=" + this.b + Separators.RPAREN;
    }
}
