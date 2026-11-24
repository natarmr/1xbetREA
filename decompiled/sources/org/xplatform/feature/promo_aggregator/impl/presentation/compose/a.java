package org.xplatform.feature.promo_aggregator.impl.presentation.compose;

import a.b1j;
import a.b4j;
import a.bnn0;
import a.fuj0;
import a.i8i;
import a.iac0;
import a.ix0;
import a.jf4;
import a.mi60;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import a.zhi0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ b j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.j = bVar;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new a(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        String str = this.k;
        b bVar = this.j;
        if (!z) {
            z1x.P(obj);
            fuj0 fuj0Var = bVar.q;
            this.i = true;
            obj = fuj0Var.y(str, this);
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
        mi60 mi60Var = new mi60((byte) 1, str, (List) obj);
        int i = b.Q;
        bVar.H(mi60Var);
        bVar.p.e("CONTENT_STATE_KEY", ((iac0) bVar.D()).b);
        b4j b4jVar = bVar.v;
        b4jVar.getClass();
        str.getClass();
        i8i.D("promocode", str, b4jVar.f1961a, "promocode_activate_done");
        ix0 ix0Var = bVar.w;
        ix0Var.getClass();
        b1j.v(str, ix0Var.f15516a, 3092L);
        return Unit.f46060a;
    }
}
