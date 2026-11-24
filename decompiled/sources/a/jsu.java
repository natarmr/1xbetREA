package a;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class jsu extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lhf0 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ c3c0 p;
    public final /* synthetic */ List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(yje yjeVar, lhf0 lhf0Var, long j, boolean z, String str, c3c0 c3c0Var, List list) {
        super(3, yjeVar);
        this.l = lhf0Var;
        this.m = j;
        this.n = z;
        this.o = str;
        this.p = c3c0Var;
        this.q = list;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        jsu jsuVar = new jsu((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q);
        jsuVar.j = (kmq) obj;
        jsuVar.k = obj2;
        return jsuVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = this.j;
        Object obj2 = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            jvn jvnVar = (jvn) obj2;
            gxu gxuVar = (gxu) this.l.c;
            String str = this.o;
            str.getClass();
            c3c0 c3c0Var = this.p;
            c3c0Var.getClass();
            jvnVar.getClass();
            this.q.getClass();
            vsg0 vsg0VarH0 = bkb.h0(30000L, TimeUnit.MILLISECONDS, new al6(gxuVar, c3c0Var, str, jvnVar, this.n, this.m, (yje) null));
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, vsg0VarH0, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
