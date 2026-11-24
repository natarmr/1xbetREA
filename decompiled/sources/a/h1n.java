package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12292a;
    public final c280 b;

    public h1n(c280 c280Var, String str) {
        str.getClass();
        this.f12292a = str;
        this.b = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1n)) {
            return false;
        }
        h1n h1nVar = (h1n) obj;
        return Intrinsics.d(this.f12292a, h1nVar.f12292a) && this.b.equals(h1nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12292a.hashCode() * 31);
    }

    public final String toString() {
        return "Default(opponentLabel=" + this.f12292a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
