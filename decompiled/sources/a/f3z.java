package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f3z extends bnn0 implements Function2 {
    public kzj i;
    public Object j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ieu m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ are p;
    public final /* synthetic */ List q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3z(long j, long j2, yje yjeVar, are areVar, ieu ieuVar, List list, boolean z) {
        super(2, yjeVar);
        this.m = ieuVar;
        this.n = j;
        this.o = z;
        this.p = areVar;
        this.q = list;
        this.r = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        List list = this.q;
        f3z f3zVar = new f3z(this.n, this.r, yjeVar, this.p, this.m, list, this.o);
        f3zVar.l = obj;
        return f3zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f3z) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kzj kzjVarM;
        Object objQ;
        Object obj2;
        vne vneVar = (vne) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        if (b != 0) {
            if (b == 1) {
                kzjVarM = this.i;
                z1x.P(obj);
                objQ = obj;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.j;
                z1x.P(obj);
            }
            return new j0g0(obj2);
        }
        z1x.P(obj);
        ieu ieuVar = this.m;
        kzj kzjVarM2 = qjj.M(vneVar, null, new lv1(ieuVar, this.n, this.o, this.p, null, (byte) 3), 3);
        kzjVarM = qjj.M(vneVar, null, new e3z(this.n, this.r, null, this.p, ieuVar, this.q, this.o), 3);
        this.l = null;
        this.i = kzjVarM;
        this.k = (byte) 1;
        objQ = kzjVarM2.q(this);
        if (objQ != wneVar) {
        }
        return wneVar;
        Object obj3 = ((j0g0) objQ).f15681a;
        this.l = null;
        this.i = null;
        this.j = obj3;
        this.k = (byte) 2;
        if (kzjVarM.await(this) != wneVar) {
            obj2 = obj3;
            return new j0g0(obj2);
        }
        return wneVar;
    }
}
