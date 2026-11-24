package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xxt extends bnn0 implements Function2 {
    public mie0 i;
    public boolean j;
    public final /* synthetic */ mie0 k;
    public final /* synthetic */ cmt l;
    public final /* synthetic */ List m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxt(mie0 mie0Var, cmt cmtVar, List list, long j, long j2, int i, yje yjeVar) {
        super(2, yjeVar);
        this.k = mie0Var;
        this.l = cmtVar;
        this.m = list;
        this.n = j;
        this.o = j2;
        this.p = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new xxt(this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xxt) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        mie0 mie0Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            oif0 oif0Var = (oif0) this.l.b;
            mie0 mie0Var2 = this.k;
            this.i = mie0Var2;
            this.j = true;
            Serializable serializableP = oif0Var.p(this.m, this.n, this.o, this.p, this);
            if (serializableP == wneVar) {
                return wneVar;
            }
            obj = serializableP;
            mie0Var = mie0Var2;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = this.i;
            z1x.P(obj);
        }
        mie0Var.f21842a = obj;
        return Unit.f46060a;
    }
}
