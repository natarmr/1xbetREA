package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t1j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ u1j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1j(u1j u1jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = u1jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u1j u1jVar = this.j;
        switch (b) {
            case 0:
                return new t1j(u1jVar, yjeVar, (byte) 0);
            default:
                return new t1j(u1jVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((t1j) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        u1j u1jVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                u1jVar.G(new z1j(u1jVar.o.b.a(R.string.daily_task_update_error, Arrays.copyOf(new Object[0], 0))));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                n85 n85Var = ((b2j) u1jVar.D()).f1853a;
                if (n85Var != null) {
                    u1jVar.u.f1961a.c("dchallenge_popup_participate");
                    u1jVar.v.f16351a.a(xun.f41520a, 10929L);
                    u1jVar.s.b(wuo0.c.getId(), n85Var.e);
                    c4m0 c4m0Var = u1jVar.x;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        u1jVar.x = sac.T(new fnq(u1jVar.t.f(), new r1j(u1jVar, null, (byte) 2), (byte) 4), d5c.S(jiu0.a(u1jVar), u1jVar.r.c), new f1e(2, null, (byte) 12));
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
