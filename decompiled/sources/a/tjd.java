package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34041a;
    public final ms2 b;
    public final List c;
    public final m0k0 d;
    public final m97 e;

    static {
        k97 k97Var = m97.Companion;
    }

    public tjd(String str, ms2 ms2Var, List list, m0k0 m0k0Var, m97 m97Var) {
        list.getClass();
        this.f34041a = str;
        this.b = ms2Var;
        this.c = list;
        this.d = m0k0Var;
        this.e = m97Var;
    }

    public static tjd a(tjd tjdVar, String str, ms2 ms2Var, List list, m0k0 m0k0Var, m97 m97Var, int i) {
        if ((i & 1) != 0) {
            str = tjdVar.f34041a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            ms2Var = tjdVar.b;
        }
        ms2 ms2Var2 = ms2Var;
        if ((i & 4) != 0) {
            list = tjdVar.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            m0k0Var = tjdVar.d;
        }
        m0k0 m0k0Var2 = m0k0Var;
        if ((i & 16) != 0) {
            m97Var = tjdVar.e;
        }
        str2.getClass();
        ms2Var2.getClass();
        list2.getClass();
        return new tjd(str2, ms2Var2, list2, m0k0Var2, m97Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjd)) {
            return false;
        }
        tjd tjdVar = (tjd) obj;
        return this.f34041a.equals(tjdVar.f34041a) && this.b.equals(tjdVar.b) && Intrinsics.d(this.c, tjdVar.c) && this.d.equals(tjdVar.d) && this.e.equals(tjdVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f34041a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "ComposeGameCardDelegateState(screen=" + this.f34041a + ", entryPoint=" + this.b + ", gameList=" + this.c + ", singleBetGame=" + this.d + ", betInfo=" + this.e + Separators.RPAREN;
    }
}
