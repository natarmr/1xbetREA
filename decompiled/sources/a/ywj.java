package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ywj implements bch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f43372a;
    public final xwj b = new xwj(this);
    public final g050 c = new g050();
    public final pz40 d;
    public final pz40 e;
    public final pz40 f;

    public ywj(Function1 function1) {
        this.f43372a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.e.e(bool);
        this.e = androidx.compose.runtime.e.e(bool);
        this.f = androidx.compose.runtime.e.e(bool);
    }

    @Override // a.bch0
    public final boolean a() {
        return ((Boolean) ((hgk0) this.d).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final Object b(c050 c050Var, Function2 function2, yje yjeVar) {
        Object objJ = d5c.J(yjeVar, new xsj((Object) this, (Object) c050Var, (wdr) function2, (yje) null, (byte) 3));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    @Override // a.bch0
    public final float e(float f) {
        return ((Number) this.f43372a.invoke(Float.valueOf(f))).floatValue();
    }
}
