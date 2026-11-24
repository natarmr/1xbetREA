package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rwk implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gmq f31220a;
    public final Function1 b;
    public final Function2 c;

    public rwk(gmq gmqVar, Function1 function1, Function2 function2) {
        this.f31220a = gmqVar;
        this.b = function1;
        this.c = function2;
    }

    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = k860.f17859a;
        Object objC = this.f31220a.c(new yj2((Object) this, (Serializable) mie0Var, kmqVar, (byte) 7), yjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }
}
