package a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uw50 extends w46 {
    public final duj b;
    public final p7m0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public uw50(vzg0 vzg0Var, jtj jtjVar, mne mneVar, b8u b8uVar, x4u x4uVar, qxg0 qxg0Var, lbu lbuVar, hnu hnuVar, i1w0 i1w0Var, duj dujVar, ctf0 ctf0Var, gw60 gw60Var, hs60 hs60Var) {
        this.d = vzg0Var;
        this.e = jtjVar;
        this.f = lbuVar;
        this.g = hnuVar;
        this.b = dujVar;
        this.h = ctf0Var;
        iun iunVar = iun.f15405a;
        p7m0 p7m0VarA = q7m0.a(new wy60(0, R.id.rbByPopular, R.id.rbAny, 0, iunVar));
        this.c = p7m0VarA;
        this.i = iunVar;
        byte b = ((my60) ((uyn) x4uVar.f40284a).f36498a).f22591a;
        byte b2 = 1;
        int i = R.id.rbByPopular;
        if (b != 0) {
            if (b == 1) {
                i = R.id.rbByCoefToMax;
            } else if (b == 2) {
                i = R.id.rbByCoefToMin;
            } else if (b == 3) {
                i = R.id.rbByAlpha;
            }
        }
        wy60 wy60VarA = wy60.a((wy60) p7m0VarA.getValue(), 0, null, i, 0, 0, 27);
        yje yjeVar = null;
        p7m0VarA.o(null, wy60VarA);
        int i2 = b8uVar.c().f28665a;
        int i3 = R.id.rbAny;
        if (i2 != 0) {
            if (i2 == 2) {
                i3 = R.id.rbFrom2;
            } else if (i2 == 5) {
                i3 = R.id.rbFrom10;
            } else if (i2 == 50) {
                i3 = R.id.rbFrom100;
            }
        }
        p7m0VarA.o(null, wy60.a((wy60) p7m0VarA.getValue(), 0, null, 0, i3, 0, 23));
        sac.V(jiu0.a(this), new cd60((Object) this, (byte) 11), null, mneVar.b, new er60(this, yjeVar, b2), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(zje zjeVar) {
        xy60 xy60Var;
        if (zjeVar instanceof xy60) {
            xy60Var = (xy60) zjeVar;
            int i = xy60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xy60Var.k = i - Integer.MIN_VALUE;
            } else {
                xy60Var = new xy60(this, zjeVar);
            }
        } else {
            xy60Var = new xy60(this, zjeVar);
        }
        Object objL = xy60Var.i;
        Object obj = wne.f39444a;
        int i2 = xy60Var.k;
        if (i2 == 0) {
            z1x.P(objL);
            jtj jtjVar = (jtj) this.e;
            xy60Var.k = 1;
            objL = jtj.l(jtjVar, xy60Var);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objL);
        }
        List list = (List) objL;
        Integer num = (Integer) ((vzg0) this.d).a("GAME_FILTER_TYPE");
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 0) {
            iIntValue = ((hnu) this.g).b();
        }
        int i3 = iIntValue;
        ArrayList<f8b> arrayList = new ArrayList();
        for (Object obj2 : list) {
            String strValueOf = String.valueOf(((f8b) obj2).f9097a);
            nek nekVar = y4t.c;
            if (!Intrinsics.d(strValueOf, "160291")) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (f8b f8bVar : arrayList) {
            arrayList2.add(new Pair(String.valueOf(f8bVar.f9097a), f8bVar.b));
        }
        Pair pair = new Pair("0", ((ctf0) this.h).f(R.string.all, new Object[0]));
        p7m0 p7m0Var = this.c;
        wy60 wy60VarA = wy60.a((wy60) p7m0Var.getValue(), i3, CollectionsKt.q0(kotlin.collections.a.c(pair), arrayList2), 0, 0, 0, 28);
        p7m0Var.getClass();
        p7m0Var.o(null, wy60VarA);
        return Unit.f46060a;
    }

    public uw50(ws5 ws5Var, mne mneVar, qu quVar, zrt zrtVar, lyt lytVar, yo4 yo4Var, x20 x20Var, m1e m1eVar, i1w0 i1w0Var, duj dujVar, sa10 sa10Var, pru pruVar, wv70 wv70Var) {
        m1eVar.getClass();
        this.d = ws5Var;
        this.e = mneVar;
        this.f = zrtVar;
        this.g = lytVar;
        this.b = dujVar;
        this.h = sa10Var;
        this.i = pruVar;
        i99 i99Var = i99.f14377a;
        new LinkedBlockingDeque();
        maz.b(new th50((byte) 24));
        roj0.a(0, Integer.MAX_VALUE, i99Var);
        this.c = q7m0.a(tw50.f34632a);
        yje yjeVar = null;
        slb.U(new fnq(new dnq(m1eVar.b(), new ko0((Object) this, yjeVar, (byte) 27), (byte) 1), new w620((Object) this, yjeVar, (byte) 23), (byte) 4), d5c.S(jiu0.a(this), mneVar.b));
    }
}
