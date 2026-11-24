package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpe f33758a;
    public final String b;

    public tda(rpe rpeVar, String str) {
        str.getClass();
        this.f33758a = rpeVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tda)) {
            return false;
        }
        tda tdaVar = (tda) obj;
        return this.f33758a.equals(tdaVar.f33758a) && Intrinsics.d(this.b, tdaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f33758a.f30883a) * 31);
    }

    public final String toString() {
        return "CardCounterModel(value=" + this.f33758a + ", currency=" + this.b + Separators.RPAREN;
    }
}
