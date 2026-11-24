package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class mya implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22593a = 0;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final Object j;
    public final Object k;

    /* JADX WARN: Code duplicated, block: B:10:0x0066  */
    public mya(pks0 pks0Var, g2v g2vVar, ctf0 ctf0Var) {
        Object obj;
        ctf0Var.getClass();
        this.j = pks0Var;
        this.k = g2vVar;
        this.b = ctf0Var;
        this.c = bkb.H(Long.valueOf(pks0Var.f27151a.f46565a));
        this.d = bkb.H(pks0Var.f);
        this.e = bkb.H(Boolean.valueOf(pks0Var.g));
        this.f = bkb.H(pks0Var.i);
        this.g = bkb.H(pks0Var.k);
        byte b = 20;
        this.h = maz.b(new yw9(null, new caz(this, (byte) 23), (byte) 20));
        j0g0 j0g0Var = pks0Var.e;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            obj = obj == null ? iun.f15405a : obj;
        }
        this.i = maz.b(new yw9(obj, new lcr0(this, b), (byte) 20));
    }

    public String a(int i) {
        ctf0 ctf0Var = this.b;
        if (i == 2) {
            return ctf0Var.b.a(R.string.save, Arrays.copyOf(new Object[0], 0));
        }
        return ctf0Var.b.a(R.string.select, Arrays.copyOf(new Object[0], 0)) + Separators.SP + i + "/2";
    }

    public fee b() {
        return (fee) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0109 A[Catch: all -> 0x013d, TryCatch #0 {all -> 0x013d, blocks: (B:8:0x00f0, B:10:0x00fc, B:14:0x0105, B:17:0x010b, B:19:0x012f, B:22:0x0136, B:25:0x013f, B:16:0x0109), top: B:203:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x02f6 A[LOOP:1: B:69:0x02f0->B:71:0x02f6, LOOP_END] */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        x9n r9nVar;
        Integer num;
        x9n q9nVar;
        Object u6bVar;
        a4x a4xVarO0;
        ArrayList arrayList;
        udl0 udl0Var;
        boolean z;
        ArrayList arrayList2;
        ArrayList arrayList3;
        lc00 lc00VarB;
        Iterable iterableA;
        Iterator it;
        jks0 jks0Var;
        Object obj2;
        byte b = this.f22593a;
        n0o0 n0o0Var = this.d;
        n0o0 n0o0Var2 = this.i;
        Object obj3 = this.j;
        n0o0 n0o0Var3 = this.h;
        n0o0 n0o0Var4 = this.g;
        n0o0 n0o0Var5 = this.f;
        n0o0 n0o0Var6 = this.e;
        n0o0 n0o0Var7 = this.c;
        Object obj4 = this.k;
        switch (b) {
            case 0:
                boolean z2 = true;
                ocl oclVar = (ocl) obj3;
                kya kyaVar = (kya) obj;
                kyaVar.getClass();
                ((fee) n0o0Var7.getValue()).d(kyaVar.f19097a);
                b().d(kyaVar.c);
                ((fee) n0o0Var6.getValue()).d(kyaVar.d);
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(kyaVar.e));
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(kyaVar.h));
                ((fee) n0o0Var3.getValue()).d(kyaVar.j);
                if (((fee) n0o0Var3.getValue()).c() != null) {
                    return new oya((bya) ((fee) n0o0Var2.getValue()).b(), (String) ((fee) n0o0Var6.getValue()).c(), (String) obj4, a(((bi90) b().c()).d.e), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 0L, 0L, 862));
                }
                if (((Boolean) ((fee) n0o0Var5.getValue()).c()).booleanValue()) {
                    return new pya((bya) ((fee) n0o0Var2.getValue()).b(), (String) ((fee) n0o0Var6.getValue()).c(), (String) obj4, a(((bi90) b().c()).d.e));
                }
                bya byaVar = (bya) ((fee) n0o0Var2.getValue()).b();
                String str = (String) ((fee) n0o0Var6.getValue()).c();
                String str2 = (String) obj4;
                String strA = a(((bi90) b().c()).d.e);
                Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                Iterable<pbv> iterable = (Iterable) ((fee) n0o0Var7.getValue()).c();
                ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                for (pbv pbvVar : iterable) {
                    bi90 bi90Var = (bi90) b().c();
                    long j = pbvVar.f26728a;
                    hds hdsVar = pbvVar.n;
                    boolean zContainsKey = bi90Var.d.containsKey(Long.valueOf(j));
                    boolean z3 = (zContainsKey || ((bi90) b().c()).d.e < 2) ? z2 : false;
                    n0x n0xVar = new n0x(hdsVar.f12884a);
                    n0x n0xVar2 = new n0x(azw.R(hdsVar.f12884a));
                    String str3 = str;
                    String str4 = strA;
                    long j2 = pbvVar.f26728a;
                    if (pbvVar.p) {
                        num = numValueOf;
                        r9nVar = new t9n(n0xVar, n0xVar2, num, null, null);
                    } else {
                        Integer num2 = numValueOf;
                        if (zContainsKey) {
                            q9nVar = new q9n(n0xVar, n0xVar2, true, num2, z3, null, 224);
                            num = num2;
                        } else {
                            r9nVar = new r9n(n0xVar, n0xVar2, false, num2, z3, null, 224);
                            num = num2;
                        }
                        arrayList4.add(new l9n(j2, q9nVar, new h9n(pbvVar.c)));
                        str = str3;
                        strA = str4;
                        numValueOf = num;
                        z2 = true;
                    }
                    q9nVar = r9nVar;
                    arrayList4.add(new l9n(j2, q9nVar, new h9n(pbvVar.c)));
                    str = str3;
                    strA = str4;
                    numValueOf = num;
                    z2 = true;
                }
                return new nya(byaVar, str, str2, strA, new ftr(dyb.o0(arrayList4)), ((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue() ? ocl.b(oclVar, pb10.e, null, 0, 0, R.string.nothing_found, 0, 0L, 0L, 990) : null, ((bi90) b().c()).d.e == 2);
            case 1:
                r6b r6bVar = (r6b) obj;
                g2v g2vVar = (g2v) obj3;
                r6bVar.getClass();
                fee feeVar = (fee) n0o0Var7.getValue();
                js20 js20Var = r6bVar.f;
                boolean z4 = r6bVar.q;
                String str5 = r6bVar.p;
                boolean z5 = r6bVar.n;
                udl0 udl0Var2 = r6bVar.l.f22988a;
                feeVar.d(js20Var);
                ((fee) n0o0Var.getValue()).d(r6bVar.i);
                ((fee) n0o0Var6.getValue()).d(r6bVar.m);
                ((fee) n0o0Var4.getValue()).d(r6bVar.d);
                fee feeVar2 = (fee) n0o0Var3.getValue();
                Map map = r6bVar.b;
                feeVar2.d(map);
                ((fee) n0o0Var2.getValue()).d(r6bVar.c);
                ((fee) ((n0o0) obj4).getValue()).d(r6bVar.f29927a);
                ((fee) n0o0Var5.getValue()).d(r6bVar.o);
                js20 js20Var2 = (js20) ((fee) n0o0Var7.getValue()).c();
                if (js20Var2 != null) {
                    if (js20Var2 instanceof is20) {
                        List<h8b> list = (List) ((fee) n0o0Var4.getValue()).b();
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (h8b h8bVar : list) {
                                if (StringsKt.W(str5)) {
                                    udl0Var = udl0Var2;
                                } else {
                                    udl0Var = udl0Var2;
                                    if (!StringsKt.O(h8bVar.f12618a, str5, true)) {
                                        z = false;
                                    }
                                    if (z) {
                                        arrayList3 = h8bVar.c;
                                    } else {
                                        ArrayList arrayList5 = h8bVar.c;
                                        arrayList2 = new ArrayList();
                                        for (Object obj5 : arrayList5) {
                                            if (StringsKt.O(((k4b) obj5).f17659a, str5, true)) {
                                                arrayList2.add(obj5);
                                            }
                                        }
                                        arrayList3 = arrayList2;
                                    }
                                    if (z && arrayList3.isEmpty()) {
                                        iterableA = iun.f15405a;
                                    } else {
                                        lc00VarB = kotlin.collections.a.b();
                                        lc00VarB.add(h8bVar.b);
                                        if (h8bVar.b.c) {
                                            it = arrayList3.iterator();
                                            while (it.hasNext()) {
                                                lc00VarB.addAll(((k4b) it.next()).b);
                                            }
                                        }
                                        lc00VarB.add(h8bVar.d);
                                        iterableA = kotlin.collections.a.a(lc00VarB);
                                    }
                                    w3d.u(arrayList, iterableA);
                                    udl0Var2 = udl0Var;
                                }
                                z = true;
                                if (z) {
                                    arrayList3 = h8bVar.c;
                                } else {
                                    ArrayList arrayList6 = h8bVar.c;
                                    arrayList2 = new ArrayList();
                                    while (r5.hasNext()) {
                                        if (StringsKt.O(((k4b) obj5).f17659a, str5, true)) {
                                            arrayList2.add(obj5);
                                        }
                                    }
                                    arrayList3 = arrayList2;
                                }
                                if (z) {
                                    lc00VarB = kotlin.collections.a.b();
                                    lc00VarB.add(h8bVar.b);
                                    if (h8bVar.b.c) {
                                        it = arrayList3.iterator();
                                        while (it.hasNext()) {
                                            lc00VarB.addAll(((k4b) it.next()).b);
                                        }
                                    }
                                    lc00VarB.add(h8bVar.d);
                                    iterableA = kotlin.collections.a.a(lc00VarB);
                                } else {
                                    lc00VarB = kotlin.collections.a.b();
                                    lc00VarB.add(h8bVar.b);
                                    if (h8bVar.b.c) {
                                        it = arrayList3.iterator();
                                        while (it.hasNext()) {
                                            lc00VarB.addAll(((k4b) it.next()).b);
                                        }
                                    }
                                    lc00VarB.add(h8bVar.d);
                                    iterableA = kotlin.collections.a.a(lc00VarB);
                                }
                                w3d.u(arrayList, iterableA);
                                udl0Var2 = udl0Var;
                            }
                        } else {
                            arrayList = null;
                        }
                        udl0 udl0Var3 = udl0Var2;
                        RelatedParams relatedParamsB = r6bVar.b();
                        if (arrayList != null) {
                            return arrayList.isEmpty() ? z4 ? new v6b(udl0Var3, z5, g2v.b(g2vVar, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)) : new t6b(udl0Var3, z5, relatedParamsB) : new s6b(dyb.o0(arrayList), udl0Var3, z5);
                        }
                        u6bVar = new u6b(udl0Var3, z5);
                    } else if (js20Var2 instanceof gs20) {
                        xvm0 xvm0Var = (xvm0) ((fee) n0o0Var.getValue()).c();
                        cx7 cx7Var = (cx7) map.get(Long.valueOf(((xvm0) ((fee) n0o0Var.getValue()).c()).getId()));
                        List list2 = (List) ((fee) n0o0Var3.getValue()).b();
                        List listH = list2 != null ? h8x.H(str5, list2) : null;
                        fee feeVar3 = (fee) n0o0Var2.getValue();
                        List list3 = (List) ((fee) n0o0Var2.getValue()).b();
                        if (list3 == null) {
                            list3 = null;
                        } else if (!StringsKt.W(str5)) {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj6 : list3) {
                                zgx zgxVar = (zgx) obj6;
                                if (zgxVar == null) {
                                    t9f.b();
                                } else if (StringsKt.O(zgxVar.f44365a.c, str5, true)) {
                                    arrayList7.add(obj6);
                                }
                            }
                            list3 = arrayList7;
                        }
                        RelatedParams relatedParamsB2 = r6bVar.b();
                        xvm0Var.getClass();
                        feeVar3.getClass();
                        ctf0 ctf0Var = this.b;
                        ctf0Var.getClass();
                        if (xvm0Var instanceof svm0) {
                            if (((List) feeVar3.c()) == null) {
                                u6bVar = new a7b(udl0Var2, z5);
                            } else {
                                if (list3 == null || list3.isEmpty()) {
                                    return z4 ? new c7b(udl0Var2, g2v.b(g2vVar, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)) : new b7b(udl0Var2, relatedParamsB2);
                                }
                                u6bVar = new y6b(dyb.o0(list3), udl0Var2, z5);
                            }
                        } else if ((xvm0Var instanceof tvm0) || (xvm0Var instanceof wvm0)) {
                            if (cx7Var instanceof uw7) {
                                return new x6b(udl0Var2, ctf0Var.b.a(R.string.no_bets_for_selected_event_v2, Arrays.copyOf(new Object[]{Long.valueOf(((uw7) cx7Var).f36380a)}, 1)));
                            }
                            if (cx7Var instanceof ww7) {
                                if ((listH == null || listH.isEmpty() || (listH.size() == 1 && (listH.get(0) instanceof vwv))) && z4) {
                                    return new c7b(udl0Var2, g2v.b(g2vVar, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                                }
                                if (listH == null || (a4xVarO0 = dyb.o0(listH)) == null) {
                                    a4xVarO0 = lak0.c;
                                }
                                u6bVar = new z6b(a4xVarO0, udl0Var2, z5);
                            } else {
                                if (Intrinsics.d(cx7Var, yw7.f43357a)) {
                                    return new b7b(udl0Var2, relatedParamsB2);
                                }
                                if (Intrinsics.d(cx7Var, ax7.f1610a) || cx7Var == null) {
                                    u6bVar = new a7b(udl0Var2, z5);
                                } else {
                                    t9f.b();
                                }
                            }
                        } else {
                            if (xvm0Var instanceof rvm0) {
                                return new b7b(udl0Var2, relatedParamsB2);
                            }
                            t9f.b();
                        }
                    } else {
                        if (js20Var2 instanceof hs20) {
                            u6bVar = new u6b(udl0Var2, z5);
                        }
                        t9f.b();
                    }
                    return u6bVar;
                }
                t9f.b();
                return null;
            default:
                pks0 pks0Var = (pks0) obj;
                pks0Var.getClass();
                fee feeVar4 = (fee) n0o0Var7.getValue();
                feeVar4.getClass();
                pz40 pz40VarA = feeVar4.a();
                ((Long) feeVar4.a().getValue()).getClass();
                pz40VarA.setValue(Long.valueOf(pks0Var.b));
                fee feeVar5 = (fee) n0o0Var.getValue();
                feeVar5.getClass();
                pz40 pz40VarA2 = feeVar5.a();
                pz40VarA2.setValue(pks0Var.f);
                fee feeVar6 = (fee) n0o0Var6.getValue();
                feeVar6.getClass();
                pz40 pz40VarA3 = feeVar6.a();
                ((Boolean) feeVar6.a().getValue()).getClass();
                pz40VarA3.setValue(Boolean.valueOf(pks0Var.g));
                fee feeVar7 = (fee) n0o0Var5.getValue();
                feeVar7.getClass();
                pz40 pz40VarA4 = feeVar7.a();
                ((String) feeVar7.a().getValue()).getClass();
                pz40VarA4.setValue(pks0Var.i);
                fee feeVar8 = (fee) n0o0Var4.getValue();
                feeVar8.getClass();
                pz40 pz40VarA5 = feeVar8.a();
                ((TransferTimeFilterUiModel) feeVar8.a().getValue()).getClass();
                pz40VarA5.setValue(pks0Var.k);
                zbk zbkVar = ((fee) n0o0Var3.getValue()).e;
                j0g0 j0g0Var = pks0Var.e;
                g2v g2vVar2 = (g2v) obj4;
                long j3 = ((pks0) obj3).f27151a.b;
                long jLongValue = ((Number) ((fee) n0o0Var7.getValue()).c()).longValue();
                gks0 gks0Var = gks0.f11459a;
                if (j0g0Var != null) {
                    Object g0g0Var = j0g0Var.f15681a;
                    if (!(g0g0Var instanceof g0g0)) {
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            List list4 = (List) g0g0Var;
                            fee feeVar9 = (fee) n0o0Var2.getValue();
                            if (j0g0Var != null) {
                                Object obj7 = j0g0Var.f15681a;
                                obj2 = (List) (obj7 instanceof g0g0 ? null : obj7);
                                if (obj2 == null) {
                                    obj2 = iun.f15405a;
                                }
                            } else {
                                obj2 = iun.f15405a;
                            }
                            feeVar9.d(obj2);
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                            a4x a4xVarO1 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                            g0g0Var = (list4.isEmpty() || a4xVarO1.isEmpty()) ? new jks0(new hks0(jLongValue, g2v.b(g2vVar2, ozb.N(j3, jLongValue), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990))) : new jks0(gks0Var, a4xVarO1, false);
                        } catch (Throwable th) {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                    }
                    if (j0g0.a(g0g0Var) != null) {
                        g0g0Var = new jks0(new hks0(jLongValue, g2v.b(g2vVar2, ozb.N(j3, jLongValue), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
                    }
                    jks0Var = (jks0) g0g0Var;
                } else {
                    cdm cdmVar = cdm.f4167a;
                    jks0Var = new jks0(gks0Var, dyb.g0(new hhs0("TRANSFERS_SKELETON_KEY_1", cdmVar), new hhs0("TRANSFERS_SKELETON_KEY_2", cdmVar), new hhs0("TRANSFERS_SKELETON_KEY_3", cdmVar), new hhs0("TRANSFERS_SKELETON_KEY_4", cdmVar), new hhs0("TRANSFERS_SKELETON_KEY_5", cdmVar), new hhs0("TRANSFERS_SKELETON_KEY_6", cdmVar)), true);
                }
                return new bls0(zbkVar, jks0Var, pks0Var.h);
        }
    }

    public mya(r6b r6bVar, boolean z, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.j = g2vVar;
        this.c = bkb.H(r6bVar.f);
        this.d = bkb.H(r6bVar.i);
        this.e = bkb.H(r6bVar.m);
        this.f = bkb.H(r6bVar.o);
        this.g = maz.b(new yw9(r6bVar.d, new f7b(this, z, r6bVar, (byte) 0), (byte) 20));
        this.h = maz.b(new yw9(r6bVar.b, new f7b(this, z, r6bVar, (byte) 1), (byte) 20));
        this.i = maz.b(new yw9(r6bVar.c, new f7b(z, this, r6bVar), (byte) 20));
        this.k = bkb.H(r6bVar.f29927a);
    }

    public mya(kya kyaVar, ctf0 ctf0Var, ocl oclVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.j = oclVar;
        this.c = bkb.H(kyaVar.f19097a);
        this.d = bkb.H(kyaVar.c);
        n0o0 n0o0VarH = bkb.H(kyaVar.d);
        this.e = n0o0VarH;
        this.f = bkb.H(Boolean.valueOf(kyaVar.e));
        this.g = bkb.H(Boolean.valueOf(kyaVar.h));
        this.h = bkb.H(kyaVar.j);
        this.k = ctf0Var.b.a(R.string.clear, Arrays.copyOf(new Object[0], 0));
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new lya(this, (byte) 0));
    }
}
