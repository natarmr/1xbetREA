package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tsw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hbb f34483a;
    public final String b;
    public final pfw c;
    public final sqw0 d;

    public tsw0(hbb hbbVar, String str, pfw pfwVar, sqw0 sqw0Var) {
        this.f34483a = hbbVar;
        this.b = str;
        this.c = pfwVar;
        this.d = sqw0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.f34483a != hbb.o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tsw0) {
            tsw0 tsw0Var = (tsw0) obj;
            return tsw0Var.c == this.c && tsw0Var.d.equals(this.d) && tsw0Var.b.equals(this.b) && tsw0Var.f34483a == this.f34483a;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(tsw0.class, this.b, this.c, this.d, this.f34483a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        return ua80.m(b1j.n("LegacyKmsEnvelopeAead Parameters (kekUri: ", this.b, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: "), String.valueOf(this.d), ", variant: ", String.valueOf(this.f34483a), Separators.RPAREN);
    }
}
