package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/amy;", "La/um40;", "La/zly;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class amy extends um40 {
    public final ghn b;
    public final Function1 c;

    public amy(ghn ghnVar, Function1 function1) {
        this.b = ghnVar;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amy)) {
            return false;
        }
        amy amyVar = (amy) obj;
        return this.b.equals(amyVar.b) && this.c.equals(amyVar.c);
    }

    @Override // a.um40
    public final lm40 f() {
        return new zly(this.b, this.c);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        zly zlyVar = (zly) lm40Var;
        zlyVar.getClass();
        zlyVar.o = this.b;
        zlyVar.p = this.c;
        if (zlyVar.n) {
            zlyVar.a1();
        }
    }

    public final int hashCode() {
        return (this.c.hashCode() + twn.a(300, this.b.hashCode() * 31, 31)) * 31;
    }

    public final String toString() {
        return "KeyboardShrinkNodeElement(softInputMode=null, easing=" + this.b + ", durationMillis=300, additionalShrink=" + this.c + ", keyboardState=null)";
    }
}
