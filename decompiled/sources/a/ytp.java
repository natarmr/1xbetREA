package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ytp implements ztp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43231a;
    public final String b;
    public final String c;

    public ytp(String str, String str2, String str3) {
        str.getClass();
        this.f43231a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytp)) {
            return false;
        }
        ytp ytpVar = (ytp) obj;
        return Intrinsics.d(this.f43231a, ytpVar.f43231a) && this.b.equals(ytpVar.b) && this.c.equals(ytpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f43231a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("FightStatisticItemUiModel(parameterTitle=", this.f43231a, ", teamOneParameter=", this.b, ", teamTwoParameter="), this.c, Separators.RPAREN);
    }
}
