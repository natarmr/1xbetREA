package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class r1j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u1j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1j(u1j u1jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = u1jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u1j u1jVar = this.k;
        switch (b) {
            case 0:
                r1j r1jVar = new r1j(u1jVar, yjeVar, (byte) 0);
                r1jVar.j = obj;
                return r1jVar;
            case 1:
                r1j r1jVar2 = new r1j(u1jVar, yjeVar, (byte) 1);
                r1jVar2.j = obj;
                return r1jVar2;
            default:
                r1j r1jVar3 = new r1j(u1jVar, yjeVar, (byte) 2);
                r1jVar3.j = obj;
                return r1jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r1j) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r1j) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r1j) create((vmt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        n85 n85Var;
        p7m0 p7m0Var;
        Object value;
        byte b = this.i;
        y1j y1jVar = y1j.f41857a;
        byte b2 = 0;
        Object obj2 = null;
        Object[] objArr = 0;
        u1j u1jVar = this.k;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                for (Object obj4 : (List) obj3) {
                    n85 n85Var2 = (n85) obj4;
                    if (n85Var2.g == wuo0.b && n85Var2.f()) {
                        obj2 = obj4;
                        n85Var = (n85) obj2;
                        if (n85Var != null) {
                            int i = u1j.z;
                            p7m0Var = u1jVar.i.f25029a;
                            do {
                                value = p7m0Var.getValue();
                                value.getClass();
                            } while (!p7m0Var.m(value, b2j.a((b2j) value, n85Var, false, 2)));
                        }
                        if (n85Var == null) {
                            int i2 = u1j.z;
                            u1jVar.G(y1jVar);
                        }
                        ((q7d0) u1jVar.p.f12451a.f30839a).d("DAILY_EVENTS_DIALOG_SHOWN", true);
                        break;
                    }
                }
                n85Var = (n85) obj2;
                if (n85Var != null) {
                    int i3 = u1j.z;
                    p7m0Var = u1jVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, b2j.a((b2j) value, n85Var, false, 2)));
                }
                if (n85Var == null) {
                    int i4 = u1j.z;
                    u1jVar.G(y1jVar);
                }
                ((q7d0) u1jVar.p.f12451a.f30839a).d("DAILY_EVENTS_DIALOG_SHOWN", true);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                u1jVar.q.b((Throwable) obj3, new zuh((byte) 9));
                break;
            default:
                vmt0 vmt0Var = (vmt0) obj3;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (vmt0Var != null) {
                    if (vmt0Var instanceof smt0) {
                        c4m0 c4m0Var = u1jVar.x;
                        if (c4m0Var != null) {
                            c4m0Var.cancel(null);
                        }
                        sac.V(jiu0.a(u1jVar), s1j.f31458a, null, u1jVar.r.b, new t1j(u1jVar, objArr == true ? 1 : 0, b2), 10);
                    } else if (vmt0Var instanceof rmt0) {
                        int i5 = u1j.z;
                        u1jVar.G(y1jVar);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
