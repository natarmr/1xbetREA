package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class q4j extends bnn0 implements Function2 {
    public final /* synthetic */ cr i;
    public final /* synthetic */ ApplicationActivity j;
    public final /* synthetic */ String k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ bmh n;
    public final /* synthetic */ hie0 o;
    public final /* synthetic */ vne p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4j(cr crVar, ApplicationActivity applicationActivity, String str, int i, Function0 function0, bmh bmhVar, hie0 hie0Var, vne vneVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = crVar;
        this.j = applicationActivity;
        this.k = str;
        this.l = i;
        this.m = function0;
        this.n = bmhVar;
        this.o = hie0Var;
        this.p = vneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new q4j(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q4j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        cr crVar = this.i;
        wdk0 wdk0Var = (wdk0) crVar.j;
        pek0 pek0Var = pek0.f26859a;
        String string = ((us00) crVar.c).getString(this.l);
        string.getClass();
        wdk0.j(wdk0Var, new xdk0(pek0Var, this.k, null, new hdk0(string, this.m), jtv.x, null, 100), this.j, null, this.n, false, false, null, 116);
        this.o.f13108a = true;
        d5c.G(this.p, null);
        return Unit.f46060a;
    }
}
