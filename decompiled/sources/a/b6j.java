package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b6j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e6j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6j(e6j e6jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = e6jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        e6j e6jVar = this.k;
        switch (b) {
            case 0:
                b6j b6jVar = new b6j(e6jVar, yjeVar, (byte) 0);
                b6jVar.j = obj;
                return b6jVar;
            case 1:
                b6j b6jVar2 = new b6j(e6jVar, yjeVar, (byte) 1);
                b6jVar2.j = obj;
                return b6jVar2;
            default:
                b6j b6jVar3 = new b6j(e6jVar, yjeVar, (byte) 2);
                b6jVar3.j = obj;
                return b6jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((b6j) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((b6j) create((vmt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((b6j) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        e6j e6jVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                e6j.P(e6jVar, (Throwable) obj2);
                break;
            case 1:
                vmt0 vmt0Var = (vmt0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (vmt0Var instanceof smt0) {
                    c4m0 c4m0Var = e6jVar.K;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    Throwable th = ((smt0) vmt0Var).f32464a;
                    e6jVar.p.b(th, new igm(true, e6jVar, th));
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (((sw00) obj2).f32897a) {
                    int i = e6j.L;
                    sac.V(jiu0.a(e6jVar), new y5j(e6jVar, (byte) 2), null, e6jVar.q.b, new u88((Object) e6jVar, true, (yje) null, (byte) 11), 10);
                }
                break;
        }
        return Unit.f46060a;
    }
}
