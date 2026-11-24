package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45216a;
    public final c280 b;

    public zyp(c280 c280Var, String str) {
        str.getClass();
        this.f45216a = str;
        this.b = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyp)) {
            return false;
        }
        zyp zypVar = (zyp) obj;
        return Intrinsics.d(this.f45216a, zypVar.f45216a) && this.b.equals(zypVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45216a.hashCode() * 31);
    }

    public final String toString() {
        return "FightingOpponent(name=" + this.f45216a + ", icon=" + this.b + Separators.RPAREN;
    }
}
