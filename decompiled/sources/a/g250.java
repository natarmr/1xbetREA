package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10546a;
    public final szh b;

    public g250(String str, szh szhVar) {
        str.getClass();
        this.f10546a = str;
        this.b = szhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g250)) {
            return false;
        }
        g250 g250Var = (g250) obj;
        return Intrinsics.d(this.f10546a, g250Var.f10546a) && this.b.equals(g250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f10546a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10546a.hashCode() * 31);
    }

    public final String toString() {
        return "SlotMachine(key=" + this.f10546a + ", model=" + this.b + Separators.RPAREN;
    }
}
