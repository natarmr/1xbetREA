package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vbk0 implements dck0 {
    public static final ubk0 Companion = new ubk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37146a;

    public /* synthetic */ vbk0(int i, String str) {
        if (1 == (i & 1)) {
            this.f37146a = str;
        } else {
            m2x.I(i, 1, tbk0.f33668a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vbk0) && Intrinsics.d(this.f37146a, ((vbk0) obj).f37146a);
    }

    public final int hashCode() {
        return this.f37146a.hashCode();
    }

    public final String toString() {
        return kng0.l("FlashCallCodeDataRequest(codeType=", this.f37146a, Separators.RPAREN);
    }

    public vbk0(String str) {
        this.f37146a = str;
    }
}
