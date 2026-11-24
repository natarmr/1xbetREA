package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class t9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f33563a;
    public final Function0 b;
    public final boolean c;

    public t9h0(Function0 function0, Function0 function1, boolean z) {
        this.f33563a = function0;
        this.b = function1;
        this.c = z;
    }

    public final String toString() {
        Object objInvoke = this.f33563a.invoke();
        Object objInvoke2 = this.b.invoke();
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(objInvoke);
        sb.append(", maxValue=");
        sb.append(objInvoke2);
        sb.append(", reverseScrolling=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
