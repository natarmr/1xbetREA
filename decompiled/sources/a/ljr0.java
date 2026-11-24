package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ljr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ njr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ljr0(njr0 njr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = njr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        njr0 njr0Var = this.j;
        switch (b) {
            case 0:
                return new ljr0(njr0Var, yjeVar, (byte) 0);
            case 1:
                return new ljr0(njr0Var, yjeVar, (byte) 1);
            case 2:
                return new ljr0(njr0Var, yjeVar, (byte) 2);
            case 3:
                return new ljr0(njr0Var, yjeVar, (byte) 3);
            default:
                return new ljr0(njr0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ljr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ljr0) create((Map) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ljr0) create((okr0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ljr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ljr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        gjr0 gjr0Var;
        byte b = this.i;
        boolean z = true;
        String str = null;
        Object[] objArr = 0;
        njr0 njr0Var = this.j;
        byte b2 = 0;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((g090) njr0Var.m.f41434a).m().equals(new okr0("", "", 0L, 0L, "", "", 0L, 0.0d, 0.0d, iun.f15405a))) {
                    p7m0 p7m0Var = njr0Var.G;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, cjr0.a((cjr0) value, null, null, true, 3)));
                    njr0Var.A(true);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xsu xsuVar = njr0Var.m;
                if (!((g090) xsuVar.f41434a).m().j.isEmpty()) {
                    p7m0 p7m0Var2 = njr0Var.G;
                    while (true) {
                        Object value4 = p7m0Var2.getValue();
                        cjr0 cjr0VarA = (cjr0) value4;
                        if (((cjr0) p7m0Var2.getValue()).b instanceof hjr0) {
                            Map mapS = ((rkr0) njr0Var.k.f10580a).s();
                            List list = ((g090) xsuVar.f41434a).m().j;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                w3d.u(arrayList, ((hir0) it.next()).c);
                            }
                            a4x a4xVarT = jtm0.t(arrayList, njr0Var.i.f4960a.r().c, mapS, njr0Var.x);
                            jjr0 jjr0Var = cjr0VarA.f4474a;
                            cjr0VarA = cjr0.a(cjr0VarA, jjr0.a(jjr0Var, mtr0.a(jjr0Var.b, str, str, mapS.isEmpty() ^ z, 7), 5), new hjr0(a4xVarT, njr0Var.l.a().f32117a.f, new smr0(w6x.n(mapS.size(), arrayList.size(), Separators.SLASH), mapS.size() == arrayList.size()), false), false, 4);
                        }
                        if (!p7m0Var2.m(value4, cjr0VarA)) {
                            z = true;
                            str = null;
                        }
                    }
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                Map mapS2 = ((rkr0) njr0Var.k.f10580a).s();
                List list2 = ((g090) njr0Var.m.f41434a).m().j;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    w3d.u(arrayList2, ((hir0) it2.next()).c);
                }
                a4x a4xVarT2 = jtm0.t(arrayList2, njr0Var.i.f4960a.r().c, mapS2, njr0Var.x);
                ijr0 djr0Var = a4xVarT2.isEmpty() ? new djr0(sa10.b(njr0Var.d, pb10.g, R.string.empty_tirage, 0, null, 28)) : new hjr0(a4xVarT2, njr0Var.l.a().f32117a.f, new smr0(w6x.n(mapS2.size(), arrayList2.size(), Separators.SLASH), mapS2.size() == arrayList2.size()), false);
                p7m0 p7m0Var3 = njr0Var.G;
                do {
                    value2 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value2, cjr0.a((cjr0) value2, njr0Var.y(djr0Var), djr0Var, false, 4)));
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = njr0Var.G;
                do {
                    value3 = p7m0Var4.getValue();
                    gjr0Var = gjr0.f11415a;
                } while (!p7m0Var4.m(value3, cjr0.a((cjr0) value3, njr0Var.y(gjr0Var), gjr0Var, false, 4)));
                njr0Var.D.a();
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                njr0 njr0Var2 = this.j;
                njr0Var2.getClass();
                sac.V(jiu0.a(njr0Var2), new ddr0(1, njr0Var2, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, njr0Var2.b.f22085a, new ljr0(njr0Var2, objArr == true ? 1 : 0, b2), 10);
                break;
        }
        return Unit.f46060a;
    }
}
