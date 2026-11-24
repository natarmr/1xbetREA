package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class qqm0 extends bnn0 implements Function2 {
    public List i;
    public ArrayList j;
    public byte k;
    public final /* synthetic */ rqm0 l;
    public final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqm0(rqm0 rqm0Var, List list, yje yjeVar) {
        super(2, yjeVar);
        this.l = rqm0Var;
        this.m = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qqm0(this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qqm0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        qqm0 qqm0Var;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        rqm0 rqm0Var = this.l;
        if (b != 0) {
            if (b == 1) {
                List list2 = this.i;
                z1x.P(obj);
                qqm0Var = this;
                list = list2;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList2 = this.j;
                list = this.i;
                z1x.P(obj);
            }
            arrayList = arrayList2;
            rqm0Var.y(dqm0.G(arrayList, list));
            return Unit.f46060a;
        }
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
        q8u q8uVar = rqm0Var.o;
        this.i = listL0;
        this.k = (byte) 1;
        qqm0Var = this;
        Object objA = q8uVar.a(this.m, true, Long.MAX_VALUE, qqm0Var);
        if (objA != wneVar) {
            obj = objA;
            list = listL0;
        }
        return wneVar;
        arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            List list3 = ((uog) obj2).p;
            if (list3 == null || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (rz4.C(((Number) it.next()).intValue(), qqm0Var.m)) {
                        arrayList.add(obj2);
                        break;
                    }
                }
            }
        }
        if (Intrinsics.d(rqm0Var.b, CyberGamesPage.Real.INSTANCE)) {
            cyg0 cyg0Var = rqm0Var.p;
            qqm0Var.i = list;
            qqm0Var.j = arrayList;
            qqm0Var.k = (byte) 2;
            ((or30) cyg0Var.f5173a.f1850a.c).d(arrayList);
            Unit unit = Unit.f46060a;
            wne wneVar2 = wne.f39444a;
            if (unit != wneVar) {
                arrayList2 = arrayList;
                arrayList = arrayList2;
            }
            return wneVar;
        }
        rqm0Var.y(dqm0.G(arrayList, list));
        return Unit.f46060a;
    }
}
