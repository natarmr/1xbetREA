package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xh9 implements th9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f40878a;

    @Override // a.th9
    public final boolean a(drg0 drg0Var) {
        Iterator it = this.f40878a.iterator();
        while (it.hasNext()) {
            if (u3u0.m((ci9) it.next(), drg0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return dw9.r(new StringBuilder("not("), this.f40878a, Separators.RPAREN);
    }
}
