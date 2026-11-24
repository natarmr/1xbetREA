package a;

import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class vu50 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ wu50 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu50(wu50 wu50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = wu50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wu50 wu50Var = this.j;
        switch (b) {
            case 0:
                return new vu50(wu50Var, yjeVar, (byte) 0);
            default:
                return new vu50(wu50Var, yjeVar, (byte) 1);
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
        return ((vu50) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wu50 wu50Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mne mneVar = wu50Var.C;
                kr5 kr5Var = (kr5) ((qu50) wu50Var.D()).f29332a.get(((qu50) wu50Var.D()).e);
                yo4 yo4Var = wu50Var.y;
                int i = kr5Var.b;
                String str = kr5Var.w;
                String str2 = kr5Var.d;
                yo4Var.getClass();
                yo4Var.f42966a.a("news_promo_call", xp20.f(new Pair("promo_id", String.valueOf(i)), new Pair("translate_id", str2)));
                x20 x20Var = wu50Var.x;
                int i2 = kr5Var.b;
                x20Var.getClass();
                byte b2 = 1;
                x20Var.f40143a.a(tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new j1p(str2, (byte) 0)}), 3001L);
                String str3 = kr5Var.v;
                if (str3.length() > 0) {
                    wu50Var.E.a(str3);
                } else if (str.length() > 0) {
                    i1w0 i1w0Var = wu50Var.D;
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    ((h6i) wu50Var.z.f24171a).c();
                    k0w0VarI.h(new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    yje yjeVar = null;
                    if ((kr5Var.d() && kr5Var.n == oo5.ACTION_ONE_X_GAME) || kr5Var.d()) {
                        sac.V(jiu0.a(wu50Var), new b530(wu50Var, (byte) 25), null, mneVar.b, new vu50(wu50Var, yjeVar, b2), 10);
                    }
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                wu50Var.F.a(wu50Var.G.b((kr5) ((qu50) wu50Var.D()).f29332a.get(((qu50) wu50Var.D()).e), wu50Var.r));
                break;
        }
        return Unit.f46060a;
    }
}
