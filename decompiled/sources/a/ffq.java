package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ffq {
    public static final efq Companion = new efq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pxw f9458a;
    public final String b;

    public /* synthetic */ ffq(int i, pxw pxwVar, String str) {
        if ((i & 1) == 0) {
            this.f9458a = null;
        } else {
            this.f9458a = pxwVar;
        }
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
        if (!(obj instanceof ffq)) {
            return false;
        }
        ffq ffqVar = (ffq) obj;
        return Intrinsics.d(this.f9458a, ffqVar.f9458a) && Intrinsics.d(this.b, ffqVar.b);
    }

    public final int hashCode() {
        pxw pxwVar = this.f9458a;
        int iHashCode = (pxwVar == null ? 0 : pxwVar.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Firebase(identities=" + this.f9458a + ", signInProvider=" + this.b + Separators.RPAREN;
    }
}
