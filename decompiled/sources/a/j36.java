package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class j36 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p36 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j36(p36 p36Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = p36Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        p36 p36Var = this.l;
        switch (b) {
            case 0:
                j36 j36Var = new j36(p36Var, yjeVar, (byte) 0);
                j36Var.k = obj;
                return j36Var;
            default:
                j36 j36Var2 = new j36(p36Var, yjeVar, (byte) 1);
                j36Var2.k = obj;
                return j36Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((j36) create((o1d0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j36) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        p36 p36Var = this.l;
        switch (b) {
            case 0:
                o1d0 o1d0Var = (o1d0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    o1d0Var.getClass();
                    boolean z2 = o1d0Var instanceof n1d0;
                    p36Var.j = z2;
                    bby bbyVar = p36Var.m;
                    if (z2) {
                        if (bbyVar != null) {
                            zvw.G(bbyVar, "PROPHYLAXIS_CANCEL");
                        }
                        qoj0 qoj0Var = p36Var.k;
                        n1d0 n1d0Var = (n1d0) o1d0Var;
                        e56 e56Var = new e56(n1d0Var.b, n1d0Var.c);
                        this.k = null;
                        this.j = true;
                        if (qoj0Var.a(e56Var, this) == wneVar) {
                            return wneVar;
                        }
                    } else if (bbyVar == null || !bbyVar.isActive()) {
                        p36Var.f();
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                List list = (List) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    p36Var.l = new Long(System.currentTimeMillis());
                    Object b56Var = list.isEmpty() ? c56.f3755a : new b56(list);
                    qoj0 qoj0Var2 = p36Var.k;
                    this.k = null;
                    this.j = true;
                    if (qoj0Var2.a(b56Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
