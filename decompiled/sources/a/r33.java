package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r33 extends bnn0 implements Function1 {
    public l73 i;
    public hie0 j;
    public boolean k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ z63 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Function1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r33(t33 t33Var, Object obj, z63 z63Var, long j, Function1 function1, yje yjeVar) {
        super(1, yjeVar);
        this.l = t33Var;
        this.m = obj;
        this.n = z63Var;
        this.o = j;
        this.p = function1;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new r33(this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r33) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        l73 l73Var;
        hie0 hie0Var;
        z63 z63Var = this.n;
        t33 t33Var = this.l;
        l73 l73Var2 = t33Var.c;
        wne wneVar = wne.f39444a;
        boolean z = this.k;
        try {
            if (!z) {
                z1x.P(obj);
                l73Var2.c = (t73) t33Var.f33246a.f20832a.invoke(this.m);
                ((hgk0) t33Var.e).setValue(z63Var.g());
                ((hgk0) t33Var.d).setValue(Boolean.TRUE);
                l73 l73Var3 = new l73(l73Var2.f19537a, ((hgk0) l73Var2.b).getValue(), fre0.L(l73Var2.c), l73Var2.d, Long.MIN_VALUE, l73Var2.f);
                hie0 hie0Var2 = new hie0();
                long j = this.o;
                dc0 dc0Var = new dc0((Object) t33Var, (Object) l73Var3, (Object) this.p, (Object) hie0Var2, (byte) 5);
                this.i = l73Var3;
                this.j = hie0Var2;
                this.k = true;
                if (hhm0.m(l73Var3, z63Var, j, dc0Var, this) == wneVar) {
                    return wneVar;
                }
                l73Var = l73Var3;
                hie0Var = hie0Var2;
            } else {
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hie0Var = this.j;
                l73Var = this.i;
                z1x.P(obj);
            }
            b73 b73Var = hie0Var.f13108a ? b73.f2083a : b73.b;
            t33Var.c();
            return new h73(l73Var, b73Var);
        } catch (CancellationException e) {
            t33Var.c();
            throw e;
        }
    }
}
