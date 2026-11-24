package a;

import android.gov.nist.core.Separators;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f39 f19897a;
    public final n5a b;

    public lee(f39 f39Var, n5a n5aVar) {
        this.f19897a = f39Var;
        this.b = n5aVar;
    }

    public final String toString() {
        n5a n5aVar = this.b;
        rne rneVar = (rne) n5aVar.e.get(rne.c);
        String str = rneVar != null ? rneVar.b : null;
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        string.getClass();
        return "Request@" + string + (str != null ? kng0.l("[", str, "](") : Separators.LPAREN) + "currentBounds()=" + this.f19897a.invoke() + ", continuation=" + n5aVar + Separators.RPAREN;
    }
}
