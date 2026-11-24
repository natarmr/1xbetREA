package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class dm4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm4(im4 im4Var, uu4 uu4Var, String str, df2 df2Var, String str2, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 0;
        this.k = im4Var;
        this.l = uu4Var;
        this.m = str;
        this.o = df2Var;
        this.n = str2;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new dm4((im4) this.k, (uu4) this.l, (String) this.m, (df2) obj, (String) obj2, yjeVar);
            case 1:
                return new dm4((dt6) obj2, (ts6) obj, yjeVar, (byte) 1);
            case 2:
                return new dm4((mii0) this.k, (sip) this.l, (CyberGamesPage) this.m, (jo20) obj2, (List) obj, yjeVar);
            case 3:
                return new dm4((ln20) obj2, (tk20) obj, yjeVar, (byte) 3);
            case 4:
                return new dm4((nn20) obj2, (Function2) obj, yjeVar, (byte) 4);
            default:
                return new dm4((on20) obj2, (Function2) obj, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((dm4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        dt6 dt6Var;
        ts6 ts6Var;
        k050 k050Var;
        Object objI;
        ln20 ln20Var;
        tk20 tk20Var;
        k050 k050Var2;
        ?? r14;
        nn20 nn20Var;
        k050 k050Var3;
        ?? r15;
        on20 on20Var;
        k050 k050Var4;
        byte b = this.i;
        byte b2 = 3;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = im4.u;
                    if (((im4) this.k).i((uu4) this.l, (String) this.m, (df2) obj2, (String) obj3, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    dt6Var = (dt6) obj3;
                    k050 k050Var5 = dt6Var.c0;
                    ts6 ts6Var2 = (ts6) obj2;
                    this.k = k050Var5;
                    this.l = dt6Var;
                    this.m = ts6Var2;
                    this.j = true;
                    if (k050Var5.d(this) == wneVar2) {
                        return wneVar2;
                    }
                    ts6Var = ts6Var2;
                    k050Var = k050Var5;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ts6 ts6Var3 = (ts6) this.m;
                    dt6Var = (dt6) this.l;
                    k050Var = (k050) this.k;
                    z1x.P(obj);
                    ts6Var = ts6Var3;
                }
                try {
                    bby bbyVar = dt6Var.b0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    bby bbyVar2 = dt6Var.d0;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    dt6Var.b0 = sac.f0(jiu0.a(dt6Var), 500L, TimeUnit.MILLISECONDS, dt6Var.V.b, new ms6(dt6Var, (byte) 2), ts6Var, 32);
                    return Unit.f46060a;
                } finally {
                    k050Var.c(null);
                }
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    objI = ((bbw0) ((mii0) this.k).c).i((sip) this.l, (CyberGamesPage) this.m, (jo20) obj3, this);
                    if (objI == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) objI) {
                    web webVar = (web) obj4;
                    if (!list.isEmpty()) {
                        l26 l26Var = webVar.f39011a;
                        if (!CollectionsKt.L(list, l26Var != null ? l26Var.f19293a : null)) {
                            l26 l26Var2 = webVar.b;
                            if (CollectionsKt.L(list, l26Var2 != null ? l26Var2.f19293a : null)) {
                            }
                        }
                    }
                    arrayList.add(obj4);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList2, feb.h0((web) it.next()));
                }
                return arrayList2;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ln20Var = (ln20) obj3;
                    k050 k050Var6 = ln20Var.l0;
                    tk20 tk20Var2 = (tk20) obj2;
                    this.k = k050Var6;
                    this.l = ln20Var;
                    this.m = tk20Var2;
                    this.j = true;
                    if (k050Var6.d(this) == wneVar4) {
                        return wneVar4;
                    }
                    tk20Var = tk20Var2;
                    k050Var2 = k050Var6;
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tk20 tk20Var3 = (tk20) this.m;
                    ln20Var = (ln20) this.l;
                    k050Var2 = (k050) this.k;
                    z1x.P(obj);
                    tk20Var = tk20Var3;
                }
                try {
                    bby bbyVar3 = ln20Var.k0;
                    if (bbyVar3 != null) {
                        bbyVar3.cancel(null);
                    }
                    bby bbyVar4 = ln20Var.m0;
                    if (bbyVar4 != null) {
                        bbyVar4.cancel(null);
                    }
                    ln20Var.k0 = sac.f0(jiu0.a(ln20Var), 500L, TimeUnit.MILLISECONDS, ln20Var.E.b, new mh20(ln20Var, (byte) 5), tk20Var, 32);
                    return Unit.f46060a;
                } finally {
                    k050Var2.c(null);
                }
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    nn20 nn20Var2 = (nn20) obj3;
                    k050 k050Var7 = nn20Var2.X0;
                    wdr wdrVar = (Function2) obj2;
                    this.k = k050Var7;
                    this.l = nn20Var2;
                    this.m = (bnn0) wdrVar;
                    this.j = true;
                    if (k050Var7.d(this) == wneVar5) {
                        return wneVar5;
                    }
                    r14 = wdrVar;
                    nn20Var = nn20Var2;
                    k050Var3 = k050Var7;
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function2 = (Function2) ((bnn0) this.m);
                    nn20Var = (nn20) this.l;
                    k050Var3 = (k050) this.k;
                    z1x.P(obj);
                    r14 = function2;
                }
                try {
                    bby bbyVar5 = nn20Var.W0;
                    if (bbyVar5 != null) {
                        bbyVar5.cancel(null);
                    }
                    bby bbyVar6 = nn20Var.Y0;
                    if (bbyVar6 != null) {
                        bbyVar6.cancel(null);
                    }
                    nn20Var.W0 = sac.f0(jiu0.a(nn20Var), 500L, TimeUnit.MILLISECONDS, nn20Var.T.b, new rh20(nn20Var, b2), r14, 32);
                    return Unit.f46060a;
                } finally {
                    k050Var3.c(null);
                }
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    on20 on20Var2 = (on20) obj3;
                    k050 k050Var8 = on20Var2.i1;
                    wdr wdrVar2 = (Function2) obj2;
                    this.k = k050Var8;
                    this.l = on20Var2;
                    this.m = (bnn0) wdrVar2;
                    this.j = true;
                    if (k050Var8.d(this) == wneVar6) {
                        return wneVar6;
                    }
                    r15 = wdrVar2;
                    on20Var = on20Var2;
                    k050Var4 = k050Var8;
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function3 = (Function2) ((bnn0) this.m);
                    on20Var = (on20) this.l;
                    k050Var4 = (k050) this.k;
                    z1x.P(obj);
                    r15 = function3;
                }
                try {
                    bby bbyVar7 = on20Var.h1;
                    if (bbyVar7 != null) {
                        bbyVar7.cancel(null);
                    }
                    bby bbyVar8 = on20Var.j1;
                    if (bbyVar8 != null) {
                        bbyVar8.cancel(null);
                    }
                    on20Var.h1 = sac.f0(jiu0.a(on20Var), 500L, TimeUnit.MILLISECONDS, on20Var.E.b, new ih20(on20Var, b2), r15, 32);
                    return Unit.f46060a;
                } finally {
                    k050Var4.c(null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm4(mii0 mii0Var, sip sipVar, CyberGamesPage cyberGamesPage, jo20 jo20Var, List list, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 2;
        this.k = mii0Var;
        this.l = sipVar;
        this.m = cyberGamesPage;
        this.n = jo20Var;
        this.o = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dm4(i3t0 i3t0Var, Function2 function2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.n = i3t0Var;
        this.o = function2;
    }
}
