package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qzj extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ rzj j;
    public final /* synthetic */ List k;
    public final /* synthetic */ List l;
    public final /* synthetic */ List m;
    public final /* synthetic */ vt00 n;
    public final /* synthetic */ z40 o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzj(rzj rzjVar, yje yjeVar, List list, List list2, List list3, vt00 vt00Var, z40 z40Var, long j) {
        super(2, yjeVar);
        this.j = rzjVar;
        this.k = list;
        this.l = list2;
        this.m = list3;
        this.n = vt00Var;
        this.o = z40Var;
        this.p = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qzj(this.j, yjeVar, this.k, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qzj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        jzj jzjVarL = this.j.n().l(this.k, this.l, this.m, this.n, this.o, this.p);
        this.i = true;
        Object objQ = ((odd) jzjVarL).q(this);
        return objQ == wneVar ? wneVar : objQ;
    }
}
