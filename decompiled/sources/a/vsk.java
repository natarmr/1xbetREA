package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class vsk extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ atk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsk(atk atkVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = atkVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vsk(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vsk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            atk atkVar = this.j;
            ugf0 ugf0Var = atkVar.v;
            boolean zD = Intrinsics.d(atkVar.o.b, CyberGamesPage.Virtual.INSTANCE);
            this.i = true;
            ((t2g) ugf0Var.f35622a).f33214a.f31500a.o(null, Boolean.valueOf(zD));
            if (Unit.f46060a == wneVar) {
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
