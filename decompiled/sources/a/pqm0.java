package a;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class pqm0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rqm0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pqm0(rqm0 rqm0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rqm0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rqm0 rqm0Var = this.k;
        switch (b) {
            case 0:
                return new pqm0(rqm0Var, yjeVar, (byte) 0);
            default:
                pqm0 pqm0Var = new pqm0(rqm0Var, yjeVar, (byte) 1);
                pqm0Var.j = ((Boolean) obj).booleanValue();
                return pqm0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pqm0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pqm0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List listC;
        byte b = this.i;
        final rqm0 rqm0Var = this.k;
        yje yjeVar = null;
        final byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    q7d0 q7d0Var = ((dih) rqm0Var.l.f30901a).f6138a.f4414a;
                    Set<String> set = xun.f41520a;
                    q7d0Var.getClass();
                    set.getClass();
                    Set<String> stringSet = q7d0Var.a().getStringSet("CYBER_PROMO_IDS", set);
                    if (stringSet != null) {
                        set = stringSet;
                    }
                    List listL0 = CollectionsKt.L0(set);
                    h2c h2cVar = new h2c(((or30) rqm0Var.m.f13740a.f1850a.c).f25719a, (byte) 16);
                    r980 r980Var = new r980(rqm0Var, listL0, (byte) 27);
                    this.j = true;
                    Object objC = h2cVar.c(new uap(r980Var, (byte) 12), this);
                    if (objC != wne.f39444a) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
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
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    int iOrdinal = rqm0Var.q.a().c.o.ordinal();
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        CyberGamesPage cyberGamesPage = rqm0Var.b;
                        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
                            listC = q3d.j(45, 46);
                        } else {
                            listC = Intrinsics.d(cyberGamesPage, CyberGamesPage.Virtual.INSTANCE) ? kotlin.collections.a.c(86) : kotlin.collections.a.c(46);
                        }
                        sac.V(jiu0.a(rqm0Var), new Function1() { // from class: a.mqm0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b3 = b2;
                                rqm0 rqm0Var2 = rqm0Var;
                                Throwable th = (Throwable) obj2;
                                switch (b3) {
                                    case 0:
                                        th.getClass();
                                        rqm0Var2.e.a(th);
                                        rqm0Var2.x();
                                        break;
                                    default:
                                        th.getClass();
                                        rqm0Var2.x();
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, null, null, new qqm0(rqm0Var, listC, null), 14);
                    } else {
                        bby bbyVar = rqm0Var.u;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        final byte b3 = 0;
                        rqm0Var.u = sac.V(jiu0.a(rqm0Var), new Function1() { // from class: a.mqm0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b4 = b3;
                                rqm0 rqm0Var2 = rqm0Var;
                                Throwable th = (Throwable) obj2;
                                switch (b4) {
                                    case 0:
                                        th.getClass();
                                        rqm0Var2.e.a(th);
                                        rqm0Var2.x();
                                        break;
                                    default:
                                        th.getClass();
                                        rqm0Var2.x();
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, null, rqm0Var.j.f22085a, new pqm0(rqm0Var, yjeVar, b3), 10);
                    }
                } else {
                    rqm0Var.x();
                }
                return Unit.f46060a;
        }
    }
}
