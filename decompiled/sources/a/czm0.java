package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.subgames.impl.presentation.models.SelectedTabState;

/* JADX INFO: loaded from: classes6.dex */
public final class czm0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ dzm0 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czm0(dzm0 dzm0Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.j = dzm0Var;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new czm0(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((czm0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        dzm0 dzm0Var = this.j;
        if (!z) {
            z1x.P(obj);
            p7m0 p7m0Var = dzm0Var.n;
            this.i = true;
            obj = ntb.M(p7m0Var, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        owm0 owm0Var = (owm0) obj;
        if (owm0Var != null) {
            mwm0 mwm0Var = owm0Var instanceof mwm0 ? (mwm0) owm0Var : null;
            if (mwm0Var != null) {
                Iterator it = mwm0Var.c.iterator();
                int i = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    j = this.k;
                    if (!zHasNext) {
                        i = -1;
                        break;
                    }
                    if (((swm0) it.next()).b() == j) {
                        break;
                    }
                    i++;
                }
                p7m0 p7m0Var2 = dzm0Var.m;
                SelectedTabState.Position position = new SelectedTabState.Position(i);
                p7m0Var2.getClass();
                p7m0Var2.o(null, position);
                vmr vmrVar = dzm0Var.k;
                long j2 = dzm0Var.c.d;
                vmrVar.f37684a.p(j2, j);
                vmrVar.b.f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j2), new i1p((byte) 0, j)}), 3184L);
            }
        }
        return Unit.f46060a;
    }
}
