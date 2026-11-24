package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31319a;
    public final gzm b;

    public rym(String str, gzm gzmVar) {
        str.getClass();
        this.f31319a = str;
        this.b = gzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rym)) {
            return false;
        }
        rym rymVar = (rym) obj;
        return Intrinsics.d(this.f31319a, rymVar.f31319a) && this.b.equals(rymVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31319a.hashCode() * 31);
    }

    public final String toString() {
        return "Default(info=" + this.f31319a + ", timerModel=" + this.b + Separators.RPAREN;
    }
}
