package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38729a;
    public final n0x b;
    public final v8m c;

    public w8m(String str, n0x n0xVar, v8m v8mVar) {
        str.getClass();
        this.f38729a = str;
        this.b = n0xVar;
        this.c = v8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8m)) {
            return false;
        }
        w8m w8mVar = (w8m) obj;
        return Intrinsics.d(this.f38729a, w8mVar.f38729a) && this.b.equals(w8mVar.b) && this.c == w8mVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f140.f(this.b, this.f38729a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DsCyberLeaderBoardParticipantUiModel(name=" + this.f38729a + ", image=" + this.b + ", participantType=" + this.c + Separators.RPAREN;
    }
}
