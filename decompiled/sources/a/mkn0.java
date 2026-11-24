package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final class mkn0 extends w46 {
    public c4m0 A;
    public bby B;
    public bby C;
    public c4m0 D;
    public boolean E;
    public boolean F;
    public final i1w0 b;
    public final mne c;
    public final iw20 d;
    public final wgu e;
    public final iqt f;
    public final dgu g;
    public final s31 h;
    public final usd i;
    public final ou9 j;
    public final a6k0 k;
    public final ys70 l;
    public final nmt0 m;
    public final ntu n;
    public final lyg0 o;
    public final m1e p;
    public final e41 q;
    public final gle0 r;
    public final yfu s;
    public final duj t;
    public final r9u u;
    public final n0o0 v;
    public final p7m0 w;
    public final qoj0 x;
    public final p7m0 y;
    public final ol60 z;

    public mkn0(vzg0 vzg0Var, SupportMenuScreenParams supportMenuScreenParams, String str, i1w0 i1w0Var, mne mneVar, iw20 iw20Var, wgu wguVar, iqt iqtVar, dgu dguVar, jcl jclVar, s31 s31Var, usd usdVar, ou9 ou9Var, a6k0 a6k0Var, ys70 ys70Var, nmt0 nmt0Var, ntu ntuVar, lyg0 lyg0Var, m1e m1eVar, e41 e41Var, gle0 gle0Var, yfu yfuVar, duj dujVar, r9u r9uVar) {
        str.getClass();
        wguVar.getClass();
        ys70Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        this.b = i1w0Var;
        this.c = mneVar;
        this.d = iw20Var;
        this.e = wguVar;
        this.f = iqtVar;
        this.g = dguVar;
        this.h = s31Var;
        this.i = usdVar;
        this.j = ou9Var;
        this.k = a6k0Var;
        this.l = ys70Var;
        this.m = nmt0Var;
        this.n = ntuVar;
        this.o = lyg0Var;
        this.p = m1eVar;
        this.q = e41Var;
        this.r = gle0Var;
        this.s = yfuVar;
        this.t = dujVar;
        this.u = r9uVar;
        this.v = maz.b(new jfm0(this, (byte) 13));
        this.w = q7m0.a(new qjn0(iun.f15405a, false));
        yje yjeVar = null;
        this.x = roj0.b(1, 0, null, 6);
        this.y = q7m0.a(0);
        ol60 ol60Var = new ol60(3);
        this.z = ol60Var;
        this.F = true;
        ol60Var.f(bkn0.f2757a);
        pjn0 pjn0Var = (pjn0) vzg0Var.a("NAVIGATION_PATH_KEY");
        int iOrdinal = (pjn0Var == null ? supportMenuScreenParams.b : pjn0Var).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                B();
            } else if (iOrdinal == 2) {
                A(true);
            } else if (iOrdinal == 3) {
                s31Var.a();
                it2 it2Var = it2.LINKING_PHONE;
                e41Var.b("сallback", "support");
                SupportMenuScreenParams.AdditionalParams additionalParams = supportMenuScreenParams.c;
                i1w0Var.d(new akn0(this, new wo9(true, bs10.HISTORY, additionalParams instanceof SupportMenuScreenParams.AdditionalParams.CallbackParams ? ((SupportMenuScreenParams.AdditionalParams.CallbackParams) additionalParams).f47111a : -1L), (byte) 1));
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    throw null;
                }
                s31Var.b(it2.SUPPORT);
                e41Var.b("сhat", "support");
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                FragmentScreen fragmentScreenB = usdVar.b();
                if (fragmentScreenB instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            }
        }
        vzg0Var.e("NAVIGATION_PATH_KEY", pjn0.f27099a);
        sac.T(new fnq(jclVar.a(), new bh0(this, yjeVar, (byte) 24), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new tri0(2, yjeVar, (byte) 17));
    }

    public final void A(boolean z) {
        this.h.a();
        e41 e41Var = this.q;
        e41Var.getClass();
        it2 it2Var = it2.LINKING_PHONE;
        e41Var.b("сallback", "support");
        this.b.d(new akn0(this, new wo9(z, bs10.CALL, -1L), (byte) 0));
    }

    public final void B() {
        if (this.F) {
            kt2 kt2Var = this.h.f31532a;
            Pair pair = new Pair("point", "onlinecall");
            it2 it2Var = it2.LINKING_PHONE;
            kt2Var.a("acc_support_call", xp20.f(pair, new Pair("screen", "support")));
            e41 e41Var = this.q;
            e41Var.getClass();
            e41Var.b("onlinecall", "support");
            v3c.N(this.C);
            this.C = sac.V(jiu0.a(this), new ndn0(1, this, mkn0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, this.c.f22085a, new z8b0(this, null, (byte) 25), 10);
        }
    }

    public final sff0 w() {
        return (sff0) this.v.getValue();
    }

    public final boolean x() {
        ygp ygpVar = ygp.j;
        r9u r9uVar = this.u;
        r9uVar.getClass();
        return r9uVar.f30104a.a(ygpVar) && w().D && w().C;
    }

    public final boolean y() {
        sff0 sff0VarW = w();
        return !sff0VarW.E.contains(this.e.a()) && sff0VarW.C && this.E;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) {
        kkn0 kkn0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (zjeVar instanceof kkn0) {
            kkn0Var = (kkn0) zjeVar;
            int i = kkn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkn0Var.k = i - Integer.MIN_VALUE;
            } else {
                kkn0Var = new kkn0(this, zjeVar);
            }
        } else {
            kkn0Var = new kkn0(this, zjeVar);
        }
        Object objA = kkn0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kkn0Var.k;
        p7m0 p7m0Var = this.w;
        byte b = 1;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, qjn0.a((qjn0) value2, null, true, 1)));
                a6k0 a6k0Var = this.k;
                kkn0Var.k = 1;
                objA = a6k0Var.a(kkn0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            List list = (List) objA;
            if (!list.isEmpty()) {
                this.o.a(list);
                this.b.d(new zjn0(this, b));
            }
            do {
                value3 = p7m0Var.getValue();
            } while (!p7m0Var.m(value3, qjn0.a((qjn0) value3, null, false, 1)));
            do {
                value4 = p7m0Var.getValue();
            } while (!p7m0Var.m(value4, qjn0.a((qjn0) value4, null, false, 1)));
            return Unit.f46060a;
        } catch (Throwable th) {
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, qjn0.a((qjn0) value, null, false, 1)));
            throw th;
        }
    }
}
