package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kyo {
    public static final gyo Companion = new gyo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jyo f19115a;
    public final String b;

    public /* synthetic */ kyo(int i, jyo jyoVar, String str) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, fyo.f10368a.getDescriptor());
            throw null;
        }
        this.f19115a = jyoVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyo)) {
            return false;
        }
        kyo kyoVar = (kyo) obj;
        return Intrinsics.d(this.f19115a, kyoVar.f19115a) && Intrinsics.d(this.b, kyoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f19115a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FastChangePasswordRequest(data=" + this.f19115a + ", verifyToken=" + this.b + Separators.RPAREN;
    }

    public kyo(jyo jyoVar, String str) {
        this.f19115a = jyoVar;
        this.b = str;
    }
}
