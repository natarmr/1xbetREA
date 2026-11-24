package a;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class w1t0 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ a4x j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ w6k m;
    public final /* synthetic */ float n;
    public final /* synthetic */ pz40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1t0(a4x a4xVar, pz40 pz40Var, Context context, w6k w6kVar, float f, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = a4xVar;
        this.k = pz40Var;
        this.l = context;
        this.m = w6kVar;
        this.n = f;
        this.o = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        w1t0 w1t0Var = new w1t0(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
        w1t0Var.i = obj;
        return w1t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        w1t0 w1t0Var = this;
        vne vneVar = (vne) w1t0Var.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        a4x a4xVar = w1t0Var.j;
        if (a4xVar.isEmpty() || !((Boolean) w1t0Var.k.getValue()).booleanValue()) {
            return Unit.f46060a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kie0 kie0Var = new kie0();
        Iterator it = a4xVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            rwj rwjVar = tvk.f34603a;
            qjj.W(vneVar, dvj.c, null, new v1t0((o0x) next, w1t0Var.l, w1t0Var.m, w1t0Var.n, linkedHashMap, i, kie0Var, a4xVar, w1t0Var.o, w1t0Var.k, null), 2);
            w1t0Var = this;
            it = it;
            i = i2;
        }
        return Unit.f46060a;
    }
}
