package a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class spn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ tpn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spn0(tpn0 tpn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tpn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tpn0 tpn0Var = this.k;
        switch (b) {
            case 0:
                return new spn0(tpn0Var, yjeVar, (byte) 0);
            default:
                return new spn0(tpn0Var, yjeVar, (byte) 1);
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
        return ((spn0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        tpn0 tpn0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ywu ywuVar = tpn0Var.b;
                    this.j = true;
                    obj = ((zwu) ywuVar.c).a(((wyu) ywuVar.b).a(), ((wgu) ywuVar.d).a());
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
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str = (String) obj2;
                    int i3 = h97.A(tpn0Var.k, uaq0.f35345a) ? R.attr.uikitBackgroundLight60 : R.attr.uikitStaticTransparent;
                    Integer num = (Integer) CollectionsKt.W(i, tpn0Var.l);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) CollectionsKt.W(i, tpn0Var.m);
                    arrayList.add(new uk60(i3, iIntValue, num2 != null ? num2.intValue() : 0, str));
                    i = i2;
                }
                tpn0Var.p = kotlin.collections.a.c(CollectionsKt.d0(arrayList));
                p7m0 p7m0Var = tpn0Var.n;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, rpn0.a((rpn0) value, 0, tpn0Var.p, 0, 0, 0, tpn0Var.j.j() ? 0.8f : 1.0f, 61)));
                return Unit.f46060a;
            default:
                p7m0 p7m0Var2 = tpn0Var.n;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    tpn0Var.o.f(qpn0.f29129a);
                    i1w0 i1w0Var = tpn0Var.e;
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI.b(t0w0.f33140a);
                    k0w0VarI.h(m6m0.i(tpn0Var.f));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        } else if (Unit.f46060a == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                tpn0Var.g.f31532a.a("swipex_onboard_action", xp20.f(new Pair("option", twn.m(((rpn0) p7m0Var2.getValue()).d + 1, "onboard")), new Pair("action", "miss")));
                tpn0Var.i.f7161a.a(tx3.l0(new k1p[]{new j1p(twn.m(((rpn0) p7m0Var2.getValue()).d + 1, "onboard"), (byte) 0), new j1p("miss", (byte) 1)}), 3124L);
                return Unit.f46060a;
        }
    }
}
