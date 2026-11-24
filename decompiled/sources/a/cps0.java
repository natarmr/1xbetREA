package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.category_card_collection.DsCategoryCardCollection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cps0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4764a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cps0(Object obj, Object obj2, Object obj3, byte b) {
        this.f4764a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD = false;
        byte b = 1;
        switch (this.f4764a) {
            case 0:
                dps0 dps0Var = (dps0) this.b;
                ll50 ll50Var = (ll50) this.c;
                ts3 ts3Var = (ts3) this.d;
                dps0Var.getClass();
                md90 md90VarT = nd90.t();
                md90VarT.i();
                ((nd90) md90VarT.b).w(ll50Var);
                dps0Var.d(md90VarT, ts3Var);
                return;
            case 1:
                ((d930) this.b).b(((jpu0) this.c).f16919a, (DsCategoryCardCollection) this.d);
                return;
            case 2:
                okt0 okt0Var = (okt0) this.b;
                h6m0 h6m0Var = (h6m0) this.c;
                ezb0 ezb0Var = (ezb0) okt0Var.f25422a;
                ezb0Var.getClass();
                xov0 xov0Var = h6m0Var.f12537a;
                String str = xov0Var.f41241a;
                ArrayList arrayList = new ArrayList();
                ppv0 ppv0Var = (ppv0) ezb0Var.e.o(new l3k(ezb0Var, arrayList, str, b));
                byte b2 = 12;
                if (ppv0Var == null) {
                    wv00.f().j(ezb0.l, "Didn't find WorkSpec for id " + xov0Var);
                    ezb0Var.d.e.execute(new oh60(ezb0Var, xov0Var, b2));
                    return;
                }
                synchronized (ezb0Var.k) {
                    try {
                        synchronized (ezb0Var.k) {
                            zD = ezb0Var.c(str) != null;
                            break;
                        }
                        if (zD) {
                            Set set = (Set) ezb0Var.h.get(str);
                            if (((h6m0) set.iterator().next()).f12537a.b == xov0Var.b) {
                                set.add(h6m0Var);
                                wv00.f().a(ezb0.l, "Work " + xov0Var + " is already enqueued for processing");
                            } else {
                                ezb0Var.d.e.execute(new oh60(ezb0Var, xov0Var, b2));
                            }
                            return;
                        }
                        if (ppv0Var.t != xov0Var.b) {
                            ezb0Var.d.e.execute(new oh60(ezb0Var, xov0Var, b2));
                            return;
                        }
                        nqv0 nqv0Var = new nqv0(new qgd(ezb0Var.b, ezb0Var.c, ezb0Var.d, ezb0Var, ezb0Var.e, ppv0Var, arrayList));
                        lne lneVar = nqv0Var.d.b;
                        dby dbyVarG = zvw.g();
                        lneVar.getClass();
                        wu9 wu9VarN = q0x.N(kotlin.coroutines.e.c(lneVar, dbyVarG), new lqv0(nqv0Var, null, b));
                        wu9VarN.b.a(new b1(ezb0Var, wu9VarN, nqv0Var, (byte) 23), ezb0Var.d.e);
                        ezb0Var.g.put(str, nqv0Var);
                        HashSet hashSet = new HashSet();
                        hashSet.add(h6m0Var);
                        ezb0Var.h.put(str, hashSet);
                        wv00.f().a(ezb0.l, ezb0.class.getSimpleName() + ": processing " + xov0Var);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                tu9 tu9Var = (tu9) this.c;
                Function0 function0 = (Function0) this.d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    tu9Var.b(function0.invoke());
                    return;
                } catch (Throwable th2) {
                    tu9Var.d(th2);
                    return;
                }
            default:
                kqv0 kqv0Var = (kqv0) this.b;
                hie0 hie0Var = (hie0) this.c;
                nqv0 nqv0Var2 = (nqv0) this.d;
                if (!(kqv0Var instanceof hqv0)) {
                    if (kqv0Var instanceof gqv0) {
                        nqv0Var2.a(new kg00());
                        hie0Var.f13108a = false;
                        return;
                    } else {
                        if (kqv0Var instanceof iqv0) {
                            hie0Var.f13108a = nqv0Var2.d(((iqv0) kqv0Var).f15229a);
                            return;
                        }
                        if (!(kqv0Var instanceof jqv0)) {
                            t9f.b();
                            return;
                        }
                        if (((jqv0) kqv0Var).f16975a) {
                            zD = nqv0Var2.d(-256);
                        } else {
                            nqv0Var2.a(new kg00());
                        }
                        hie0Var.f13108a = zD;
                        return;
                    }
                }
                ng00 kg00Var = ((hqv0) kqv0Var).f13503a;
                upv0 upv0Var = nqv0Var2.h;
                String str2 = nqv0Var2.c;
                zov0 zov0VarD = upv0Var.d(str2);
                ipv0 ipv0VarX = nqv0Var2.g.x();
                ipv0VarX.getClass();
                kpb.h0(ipv0VarX.f15182a, false, true, new ka6(str2, (byte) 19));
                if (zov0VarD != null) {
                    if (zov0VarD == zov0.b) {
                        ppv0 ppv0Var2 = nqv0Var2.f23975a;
                        String str3 = nqv0Var2.k;
                        if (kg00Var instanceof mg00) {
                            wv00.f().g(oqv0.f25709a, "Worker result SUCCESS for ".concat(str3));
                            if (ppv0Var2.c()) {
                                nqv0Var2.c();
                            } else {
                                upv0Var.j(zov0.c, str2);
                                maj majVar = ((mg00) kg00Var).f21719a;
                                majVar.getClass();
                                kpb.h0(upv0Var.f36087a, false, true, new zfv0(majVar, str2, (byte) 9));
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                g7k g7kVar = nqv0Var2.i;
                                for (String str4 : g7kVar.a(str2)) {
                                    if (upv0Var.d(str4) == zov0.e && ((Boolean) kpb.h0(g7kVar.f10818a, true, false, new ka6(str4, (byte) 5))).booleanValue()) {
                                        wv00.f().g(oqv0.f25709a, "Setting status to enqueued for ".concat(str4));
                                        upv0Var.j(zov0.f44733a, str4);
                                        upv0Var.i(jCurrentTimeMillis, str4);
                                        nqv0Var2.m.add(str4);
                                    }
                                }
                            }
                        } else if (kg00Var instanceof lg00) {
                            wv00.f().g(oqv0.f25709a, "Worker result RETRY for ".concat(str3));
                            nqv0Var2.b(-256);
                            zD = true;
                        } else {
                            wv00.f().g(oqv0.f25709a, "Worker result FAILURE for ".concat(str3));
                            if (ppv0Var2.c()) {
                                nqv0Var2.c();
                            } else {
                                if (kg00Var == null) {
                                    kg00Var = new kg00();
                                }
                                nqv0Var2.f(kg00Var);
                            }
                        }
                    } else if (!zov0VarD.a()) {
                        nqv0Var2.b(-512);
                        zD = true;
                    }
                }
                hie0Var.f13108a = zD;
                return;
        }
    }
}
