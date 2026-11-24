package a;

import java.io.Serializable;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hcu extends bnn0 implements Function2 {
    public mie0 i;
    public boolean j;
    public final /* synthetic */ mie0 k;
    public final /* synthetic */ cmt l;
    public final /* synthetic */ Set m;
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcu(mie0 mie0Var, cmt cmtVar, Set set, int i, long j, long j2, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.k = mie0Var;
        this.l = cmtVar;
        this.m = set;
        this.n = i;
        this.o = j;
        this.p = j2;
        this.q = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new hcu(this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hcu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        mie0 mie0Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            hsj hsjVar = (hsj) this.l.b;
            mie0 mie0Var2 = this.k;
            this.i = mie0Var2;
            this.j = true;
            Serializable serializableH = hsjVar.h(this.m, this.n, this.o, this.p, this.q, this);
            if (serializableH == wneVar) {
                return wneVar;
            }
            obj = serializableH;
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
