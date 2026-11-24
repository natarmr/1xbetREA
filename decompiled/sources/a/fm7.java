package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_menu.model.HistoryMenuItemUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class fm7 extends i3t0 {
    public static final /* synthetic */ int p0 = 0;
    public final rrc A;
    public final fvt0 B;
    public final iqi C;
    public final h03 D;
    public final nsc E;
    public final vpt F;
    public final hru G;
    public final ntu H;
    public final yiu I;
    public final upt J;
    public final k9u K;
    public final lsn L;
    public final ocl M;
    public final k7u N;
    public final b8u O;
    public final o470 P;
    public final ot Q;
    public final gbi R;
    public final jru S;
    public final obe T;
    public final pmi0 U;
    public final znt V;
    public final o470 W;
    public final khf0 X;
    public final nsc Y;
    public final chf0 Z;
    public final nj7 a0;
    public final z7u b0;
    public final jtj c0;
    public final ryu d0;
    public final f47 e0;
    public final a3u f0;
    public final n660 g0;
    public final x1u h0;
    public final i1w0 i0;
    public ek80 j0;
    public bby k0;
    public bby l0;
    public bby m0;
    public c4m0 n0;
    public final BetHistoryScreenModel o;
    public bby o0;
    public final mne p;
    public final pru q;
    public final htt r;
    public final jrt s;
    public final duj t;
    public final ctf0 u;
    public final p37 v;
    public final art w;
    public final luu x;
    public final b8u y;
    public final r9u z;

    public fm7(BetHistoryScreenModel betHistoryScreenModel, mne mneVar, pru pruVar, htt httVar, jrt jrtVar, duj dujVar, ctf0 ctf0Var, p37 p37Var, art artVar, luu luuVar, b8u b8uVar, r9u r9uVar, rrc rrcVar, fvt0 fvt0Var, iqi iqiVar, h03 h03Var, nsc nscVar, vpt vptVar, hru hruVar, ntu ntuVar, yiu yiuVar, upt uptVar, k9u k9uVar, lsn lsnVar, ocl oclVar, k7u k7uVar, b8u b8uVar2, o470 o470Var, ot otVar, gbi gbiVar, m1e m1eVar, jru jruVar, obe obeVar, pmi0 pmi0Var, jrt jrtVar2, znt zntVar, o470 o470Var2, khf0 khf0Var, nsc nscVar2, chf0 chf0Var, nj7 nj7Var, z7u z7uVar, jtj jtjVar, ryu ryuVar, f47 f47Var, a3u a3uVar, n660 n660Var, x1u x1uVar, ocl oclVar2, i1w0 i1w0Var) {
        httVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        k7uVar.getClass();
        m1eVar.getClass();
        ng0 ng0Var = new ng0(pruVar, ctf0Var, yiuVar, r9uVar, betHistoryScreenModel);
        on onVar = new on((Object) ctf0Var, (Object) oclVar2, (Object) betHistoryScreenModel, (byte) 27);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, ng0Var, onVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = betHistoryScreenModel;
        this.p = mneVar;
        this.q = pruVar;
        this.r = httVar;
        this.s = jrtVar;
        this.t = dujVar;
        this.u = ctf0Var;
        this.v = p37Var;
        this.w = artVar;
        this.x = luuVar;
        this.y = b8uVar;
        this.z = r9uVar;
        this.A = rrcVar;
        this.B = fvt0Var;
        this.C = iqiVar;
        this.D = h03Var;
        this.E = nscVar;
        this.F = vptVar;
        this.G = hruVar;
        this.H = ntuVar;
        this.I = yiuVar;
        this.J = uptVar;
        this.K = k9uVar;
        this.L = lsnVar;
        this.M = oclVar;
        this.N = k7uVar;
        this.O = b8uVar2;
        this.P = o470Var;
        this.Q = otVar;
        this.R = gbiVar;
        this.S = jruVar;
        this.T = obeVar;
        this.U = pmi0Var;
        this.V = zntVar;
        this.W = o470Var2;
        this.X = khf0Var;
        this.Y = nscVar2;
        this.Z = chf0Var;
        this.a0 = nj7Var;
        this.b0 = z7uVar;
        this.c0 = jtjVar;
        this.d0 = ryuVar;
        this.e0 = f47Var;
        this.f0 = a3uVar;
        this.g0 = n660Var;
        this.h0 = x1uVar;
        this.i0 = i1w0Var;
        yje yjeVar = null;
        sac.V(jiu0.a(this), new ql7(this, (byte) 8), null, null, new wl7(this, yjeVar, (byte) 0), 14);
        long jN = rv00.n(rv00.k, Calendar.getInstance().getTimeInMillis() - (((long) (pruVar.a().f32117a.b.d - 1)) * 86400000), 14) / 1000;
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            long j = jN;
            if (p7m0Var.m(value, jk7.a((jk7) value, false, false, j, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554427))) {
                slb.U(new fnq(i120.W(new dnq(m1eVar.b(), new rj((Object) this, yjeVar, (byte) 6), (byte) 1)), new wl7(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), rwjVar));
                return;
            }
            jN = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable M(zje zjeVar) {
        tl7 tl7Var;
        Object value;
        if (zjeVar instanceof tl7) {
            tl7Var = (tl7) zjeVar;
            int i = tl7Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tl7Var.k = i - Integer.MIN_VALUE;
            } else {
                tl7Var = new tl7(this, zjeVar);
            }
        } else {
            tl7Var = new tl7(this, zjeVar);
        }
        Object objG = tl7Var.i;
        wne wneVar = wne.f39444a;
        int i2 = tl7Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            bm5 bm5Var = bm5.c;
            tl7Var.k = 1;
            objG = khf0.G(this.X, bm5Var, tl7Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        ql5 ql5Var = (ql5) objG;
        if (ql5Var.i.a()) {
            return ql5Var;
        }
        ql5 ql5Var2 = ((jk7) D()).f;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (ql5Var2 == null || ql5Var.f28916a != ql5Var2.f28916a) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, jk7.a((jk7) value, false, false, 0L, false, ql5Var, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554399)));
            T();
            return ql5Var;
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        while (true) {
            Object value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0 oyg0Var2 = oyg0Var;
            oyg0Var2.getClass();
            if (p7m0Var2.m(value2, jk7.a((jk7) value2, false, false, 0L, false, ql5Var, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554399))) {
                return ql5Var;
            }
            oyg0Var = oyg0Var2;
        }
    }

    public final Serializable N(zje zjeVar) {
        ql5 ql5Var = ((jk7) D()).f;
        if (ql5Var != null) {
            return ql5Var;
        }
        return this.s.a(this.o.getF46388a(), zjeVar);
    }

    public final void O() {
        bby bbyVar = this.l0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.l0 = sac.V(jiu0.a(this), new ql7(this, (byte) 3), null, this.p.f22085a, new ul7(this, null), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P(zje zjeVar) {
        vl7 vl7Var;
        List listA;
        boolean zD;
        List list;
        boolean z;
        boolean z2;
        List list2;
        Serializable serializableA;
        List list3;
        boolean z3;
        boolean z4;
        List list4;
        List list5;
        Map map;
        boolean z5;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof vl7) {
            vl7Var = (vl7) zjeVar;
            int i = vl7Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                vl7Var.p = i - Integer.MIN_VALUE;
            } else {
                vl7Var = new vl7(this, zjeVar);
            }
        } else {
            vl7Var = new vl7(this, zjeVar);
        }
        Object objB = vl7Var.n;
        wne wneVar = wne.f39444a;
        int i2 = vl7Var.p;
        boolean z6 = true;
        if (i2 == 0) {
            z1x.P(objB);
            listA = this.x.f20692a.a();
            ygp ygpVar = ygp.c;
            r9u r9uVar = this.z;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            zD = j1q0Var.f15748a.d(ygpVar);
            vl7Var.i = listA;
            vl7Var.l = zD;
            vl7Var.p = 1;
            objB = ((zfo) this.O.f2175a).b(vl7Var);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            zD = vl7Var.l;
            listA = vl7Var.i;
            z1x.P(objB);
        } else {
            if (i2 == 2) {
                z2 = vl7Var.m;
                z = vl7Var.l;
                List list6 = vl7Var.j;
                List list7 = vl7Var.i;
                z1x.P(objB);
                list = list6;
                listA = list7;
                list2 = (List) objB;
                vl7Var.i = listA;
                vl7Var.j = list;
                vl7Var.k = list2;
                vl7Var.l = z;
                vl7Var.m = z2;
                vl7Var.p = 3;
                serializableA = this.f0.a(vl7Var);
                if (serializableA != wneVar) {
                    list3 = list2;
                    objB = serializableA;
                    z3 = z2;
                    z4 = z;
                    list4 = listA;
                    list5 = list;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z7 = vl7Var.m;
            boolean z8 = vl7Var.l;
            List list8 = vl7Var.k;
            List list9 = vl7Var.j;
            List list10 = vl7Var.i;
            z1x.P(objB);
            list4 = list10;
            z3 = z7;
            z4 = z8;
            list3 = list8;
            list5 = list9;
        }
        map = (Map) objB;
        if (!this.I.a() && !this.q.a().O1) {
            z6 = false;
        }
        z5 = z6;
        p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, jk7.a((jk7) value, false, false, 0L, false, null, false, false, null, list4, z4, list5, z3, false, null, list3, false, map, false, null, z5, 15451135)));
        return Unit.f46060a;
        List list11 = (List) objB;
        boolean zJ = this.H.f24118a.f15748a.j();
        vl7Var.i = listA;
        vl7Var.j = list11;
        vl7Var.l = zD;
        vl7Var.m = zJ;
        vl7Var.p = 2;
        List listJ = this.M.j();
        if (listJ != wneVar) {
            list = list11;
            objB = listJ;
            z = zD;
            z2 = zJ;
            list2 = (List) objB;
            vl7Var.i = listA;
            vl7Var.j = list;
            vl7Var.k = list2;
            vl7Var.l = z;
            vl7Var.m = z2;
            vl7Var.p = 3;
            serializableA = this.f0.a(vl7Var);
            if (serializableA != wneVar) {
                list3 = list2;
                objB = serializableA;
                z3 = z2;
                z4 = z;
                list4 = listA;
                list5 = list;
                map = (Map) objB;
                if (!this.I.a()) {
                    z6 = false;
                }
                z5 = z6;
                p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, jk7.a((jk7) value, false, false, 0L, false, null, false, false, null, list4, z4, list5, z3, false, null, list3, false, map, false, null, z5, 15451135)));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    public final kzv Q(String str) {
        Object next;
        Iterator it = ((jk7) D()).j.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((kzv) next).f19169a.equals(str)) {
                return (kzv) next;
            }
        }
        next = null;
        return (kzv) next;
    }

    public final n3w R(String str) {
        kzv kzvVarQ = Q(str);
        if (kzvVarQ == null) {
            return null;
        }
        String str2 = null;
        HistoryTypeModel historyTypeModel = HistoryTypeModel.EVENTS;
        ql5 ql5Var = ((jk7) D()).f;
        if (ql5Var != null) {
            str2 = ql5Var.f;
        }
        if (str2 == null) {
            str2 = "";
        }
        List list = ((jk7) D()).s;
        Long lT0 = StringsKt.t0(str);
        return ckb.f0(kzvVarQ, historyTypeModel, str2, list.contains(Long.valueOf(lT0 != null ? lT0.longValue() : 0L)), this.q.a().f32117a.b.h, ((jk7) D()).l, ((jk7) D()).m, ((jk7) D()).n, ((jk7) D()).r, ((jk7) D()).x, ((jk7) D()).y);
    }

    public final HashMap S(List list) {
        HashMap map = new HashMap();
        BetHistoryScreenModel betHistoryScreenModel = this.o;
        if (betHistoryScreenModel.getC() == k77.COMPACT_NO_EXPAND || betHistoryScreenModel.getC() == k77.NO_TABS_EXPANDABLE_CARDS) {
            f8w f8wVarA = i8w.a(betHistoryScreenModel);
            gx7 gx7Var = this.q.a().f32117a;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a5w a5wVar = (a5w) it.next();
                String strD = a5wVar.d();
                HistoryTypeModel b = ((jk7) D()).d.getB();
                ql5 ql5Var = ((jk7) D()).f;
                boolean zA = ql5Var != null ? ql5Var.i.a() : false;
                this.w.getClass();
                map.put(strD, art.e(a5wVar, f8wVarA, b, zA, gx7Var));
            }
        }
        return map;
    }

    public final void T() {
        bby bbyVar;
        ek80 ek80Var = this.j0;
        if (ek80Var != null && (bbyVar = ek80Var.d) != null) {
            bbyVar.cancel(null);
        }
        e3c.n(this.l0);
        O();
    }

    public final void U() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, jk7.a((jk7) value, false, false, 0L, false, null, false, false, null, null, false, null, false, false, null, null, true, null, false, null, false, 33030143)));
        bby bbyVar = this.m0;
        yje yjeVar = null;
        if (bbyVar != null) {
            byte b = 1;
            if (bbyVar.isActive() && !((jk7) D()).b) {
                sac.V(jiu0.a(this), null, null, null, new wl7(this, yjeVar, b), 15);
                return;
            }
        }
        this.m0 = sac.V(jiu0.a(this), new ql7(this, (byte) 2), null, this.p.b, new xl7(this, yjeVar, (byte) 0), 10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0061  */
    public final void V(String str) {
        ctf0 ctf0Var;
        List list;
        Object next;
        HistoryMenuItemUiModel historyMenuItemUiModelV;
        kzv kzvVarQ = Q(str);
        if (kzvVarQ == null) {
            return;
        }
        String str2 = kzvVarQ.f19169a;
        BetHistoryScreenModel betHistoryScreenModel = this.o;
        f8w f8wVarA = i8w.a(betHistoryScreenModel);
        HistoryTypeModel historyTypeModel = HistoryTypeModel.SALE;
        ql5 ql5Var = ((jk7) D()).f;
        if (ql5Var != null) {
            boolean zA = ql5Var.i.a();
            gx7 gx7Var = this.q.a().f32117a;
            this.w.getClass();
            List listE = art.e(kzvVarQ, f8wVarA, historyTypeModel, zA, gx7Var);
            ArrayList arrayList = new ArrayList(r3d.q(listE, 10));
            Iterator it = ((ArrayList) listE).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ctf0Var = this.u;
                if (!zHasNext) {
                    break;
                } else {
                    arrayList.add(kkb.V((HistoryMenuItem) it.next(), ctf0Var));
                }
            }
            if (kzvVarQ.g == i0w.b || (list = (List) ((jk7) D()).w.get(str2)) == null) {
                historyMenuItemUiModelV = null;
            } else {
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int iOrdinal = ((HistoryMenuItem) next).ordinal();
                        do {
                            Object next2 = it2.next();
                            int iOrdinal2 = ((HistoryMenuItem) next2).ordinal();
                            if (iOrdinal > iOrdinal2) {
                                next = next2;
                                iOrdinal = iOrdinal2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                HistoryMenuItem historyMenuItem = (HistoryMenuItem) next;
                if (historyMenuItem != null) {
                    historyMenuItemUiModelV = kkb.V(historyMenuItem, ctf0Var);
                } else {
                    historyMenuItemUiModelV = null;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((HistoryMenuItemUiModel) obj).c != (historyMenuItemUiModelV != null ? historyMenuItemUiModelV.c : null)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((HistoryMenuItemUiModel) obj2).c != HistoryMenuItem.c || betHistoryScreenModel.getC() != k77.NO_TABS_EXPANDABLE_CARDS) {
                    arrayList3.add(obj2);
                }
            }
            G(new fl7(str2, arrayList3));
        }
    }

    public final void W(String str) {
        n3w n3wVarR;
        kzv kzvVarQ = Q(str);
        if (kzvVarQ == null || (n3wVarR = R(str)) == null) {
            return;
        }
        this.a0.a(r6w.k, xkb.N(n3wVarR), xkb.f0(n3wVarR));
        this.d0.b(kzvVarQ);
        ql5 ql5Var = ((jk7) D()).f;
        String str2 = ql5Var != null ? ql5Var.f : null;
        if (str2 == null) {
            str2 = "";
        }
        G(new hl7(kzvVarQ.m, str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a9 -> B:33:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object X(java.lang.String r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fm7.X(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r11 == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Y(java.lang.String r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.em7
            if (r0 == 0) goto L14
            r0 = r11
            a.em7 r0 = (a.em7) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.n = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            a.em7 r0 = new a.em7
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.l
            a.wne r0 = a.wne.f39444a
            int r1 = r5.n
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r11)
            goto L7a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r4
        L33:
            int r10 = r5.k
            java.lang.String r1 = r5.j
            a.lsn r3 = r5.i
            a.z1x.P(r11)
            r6 = r1
            goto L62
        L3e:
            a.z1x.P(r11)
            a.k7u r11 = r9.N
            a.uzc r11 = r11.f17841a
            a.jvn r11 = r11.b()
            int r11 = r11.getId()
            a.lsn r1 = r9.L
            r5.i = r1
            r5.j = r10
            r5.k = r11
            r5.n = r3
            java.io.Serializable r3 = r9.N(r5)
            if (r3 != r0) goto L5e
            goto L79
        L5e:
            r6 = r10
            r10 = r11
            r11 = r3
            r3 = r1
        L62:
            a.ql5 r11 = (a.ql5) r11
            long r7 = r11.f28916a
            r5.i = r4
            r5.j = r4
            r5.n = r2
            java.lang.Object r11 = r3.f20589a
            r1 = r11
            a.nr r1 = (a.nr) r1
            r2 = r10
            r3 = r7
            java.lang.Object r11 = r1.g(r2, r3, r5, r6)
            if (r11 != r0) goto L7a
        L79:
            return r0
        L7a:
            r11.getClass()
            a.kzv r11 = (a.kzv) r11
            java.lang.Object r9 = r9.D()
            a.jk7 r9 = (a.jk7) r9
            java.util.List r9 = r9.j
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = a.r3d.q(r9, r0)
            r10.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L96:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r9.next()
            a.kzv r0 = (a.kzv) r0
            java.lang.String r1 = r0.f19169a
            java.lang.String r2 = r11.f19169a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lad
            r0 = r11
        Lad:
            r10.add(r0)
            goto L96
        Lb1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fm7.Y(java.lang.String, a.zje):java.io.Serializable");
    }

    public final void Z(String str, boolean z) {
        sac.V(jiu0.a(this), new ql7(this, (byte) 5), null, this.p.b, new lv(z, (Object) this, (Object) str, (yje) null, (byte) 3), 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        ql5 ql5Var;
        Object value2;
        Object value3;
        sys0 sys0Var;
        BetHistoryScreenModel betHistoryScreenModelA;
        Object value4;
        ek80 ek80Var;
        Object i0kVar;
        bby bbyVar;
        mj7 mj7Var = (mj7) obj;
        mj7Var.getClass();
        boolean z = mj7Var instanceof li7;
        BetHistoryScreenModel betHistoryScreenModel = this.o;
        mne mneVar = this.p;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        if (z) {
            li7 li7Var = (li7) mj7Var;
            if (li7Var.equals(hi7.f13100a)) {
                ek80 ek80Var2 = this.j0;
                if (ek80Var2 != null && (bbyVar = ek80Var2.d) != null) {
                    bbyVar.cancel(null);
                }
                e3c.n(this.l0);
                i3t0.A(this, this.e0, c0k.f3528a, null, null, 6);
            }
            if (li7Var.equals(ji7.f16561a)) {
                ql5 ql5Var2 = ((jk7) D()).f;
                if (ql5Var2 != null) {
                    i3t0.A(this, this.e0, new l0k(ql5Var2.f28916a), null, null, 6);
                    return;
                }
                return;
            }
            if (li7Var.equals(ki7.f18323a)) {
                sac.V(jiu0.a(this), new ql7(this, (byte) 10), null, mneVar.b, new bm7(this, null), 10);
                return;
            }
            if (!li7Var.equals(ii7.f14816a)) {
                t9f.b();
                return;
            }
            if (betHistoryScreenModel != null) {
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    BetHistoryScreenModel.BetChampHistory betChampHistory = (BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel;
                    i0kVar = new j0k(Integer.parseInt(betChampHistory.f), betChampHistory.e);
                } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                    HistoryTypeModel historyTypeModel = ((BetHistoryScreenModel.BetHistory) betHistoryScreenModel).b;
                    historyTypeModel.getClass();
                    i0kVar = new i0k(historyTypeModel);
                }
                i3t0.A(this, this.e0, i0kVar, null, null, 6);
                return;
            }
            t9f.b();
            return;
        }
        byte b = 0;
        if (mj7Var instanceof wi7) {
            if (((jk7) D()).t || (ek80Var = this.j0) == null) {
                return;
            }
            ek80Var.a(false);
            return;
        }
        boolean z2 = mj7Var instanceof dj7;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        byte b2 = 1;
        if (z2) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, jk7.a((jk7) value4, false, false, 0L, true, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554415)));
            bby bbyVar2 = this.m0;
            if (bbyVar2 == null || !bbyVar2.isActive() || ((jk7) D()).b) {
                this.m0 = sac.V(jiu0.a(this), null, null, mneVar.b, new xl7(this, objArr14 == true ? 1 : 0, b2), 11);
                return;
            } else {
                sac.V(jiu0.a(this), null, null, mneVar.b, new wl7(this, objArr15 == true ? 1 : 0, (byte) 3), 11);
                return;
            }
        }
        if (mj7Var instanceof oi7) {
            G(zk7.f44515a);
            return;
        }
        boolean z3 = mj7Var instanceof ui7;
        ryu ryuVar = this.d0;
        r9u r9uVar = this.z;
        if (z3) {
            String str = ((ui7) mj7Var).f35717a;
            ygp ygpVar = ygp.p;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (!j1q0Var.f15748a.d(ygpVar)) {
                n3w n3wVarR = R(str);
                if (n3wVarR == null) {
                    return;
                }
                i3t0.A(this, this.v, new i1k(n3wVarR, HistoryTypeModel.SALE), null, null, 6);
                ql5 ql5Var3 = ((jk7) D()).f;
                long j = ql5Var3 != null ? ql5Var3.f28916a : 0L;
                betHistoryScreenModel.getClass();
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    sys0Var = sys0.c;
                } else {
                    if (!(betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory)) {
                        t9f.b();
                        return;
                    }
                    sys0Var = sys0.f33037a;
                }
                i3t0.A(this, this.e0, new g0k(n3wVarR, j, sys0Var), null, null, 6);
                return;
            }
            kzv kzvVarQ = Q(str);
            if (kzvVarQ != null) {
                ryuVar.b(kzvVarQ);
                i3t0.A(this, this.v, new h1k(kzvVarQ, HistoryTypeModel.SALE, ((jk7) D()).r), null, null, 6);
            }
            if (betHistoryScreenModel != null) {
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    BetHistoryScreenModel.BetChampHistory betChampHistory2 = (BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel;
                    ql5 ql5Var4 = ((jk7) D()).f;
                    betHistoryScreenModelA = BetHistoryScreenModel.BetChampHistory.a(betChampHistory2, ql5Var4 != null ? ql5Var4.f28916a : betChampHistory2.f46387a, null, 62);
                } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                    BetHistoryScreenModel.BetHistory betHistory = (BetHistoryScreenModel.BetHistory) betHistoryScreenModel;
                    ql5 ql5Var5 = ((jk7) D()).f;
                    betHistoryScreenModelA = BetHistoryScreenModel.BetHistory.a(betHistory, ql5Var5 != null ? ql5Var5.f28916a : betHistory.f46388a, null, 14);
                }
                i3t0.A(this, this.e0, new f0k(str, betHistoryScreenModelA), null, null, 6);
                return;
            }
            t9f.b();
            return;
        }
        if (mj7Var instanceof zi7) {
            sac.V(jiu0.a(this), null, null, mneVar.b, new am7(this, ((zi7) mj7Var).f44428a, objArr13 == true ? 1 : 0, b), 11);
            return;
        }
        if (mj7Var instanceof yi7) {
            V(((yi7) mj7Var).f42673a);
            return;
        }
        if (mj7Var instanceof hj7) {
            W(((hj7) mj7Var).f13147a);
            return;
        }
        boolean z4 = mj7Var instanceof ej7;
        byte b3 = 7;
        nj7 nj7Var = this.a0;
        if (z4) {
            String str2 = ((ej7) mj7Var).f7893a;
            nj7Var.d();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, jk7.a((jk7) value3, false, false, 0L, false, null, false, false, null, null, false, null, false, true, null, null, false, null, false, null, false, 33488895)));
            sac.i0(jiu0.a(this), fm7.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, q3d.j(oqt0.class, lai0.class), null, new xb2((Object) this, (Object) str2, (yje) (objArr12 == true ? 1 : 0), b3), null, mneVar.b, new ql7(this, str2), null, 596);
            return;
        }
        if (mj7Var instanceof gj7) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, jk7.a((jk7) value2, false, false, 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33030143)));
            return;
        }
        if (mj7Var instanceof fj7) {
            fj7 fj7Var = (fj7) mj7Var;
            Z(fj7Var.f9623a, fj7Var.b);
            return;
        }
        if (mj7Var instanceof mi7) {
            String str3 = ((mi7) mj7Var).f21830a;
            n3w n3wVarR2 = R(str3);
            if (n3wVarR2 == null) {
                return;
            }
            sac.V(jiu0.a(this), new ql7(this, (byte) 13), null, mneVar.b, new n1((byte) 3, (yje) (objArr11 == true ? 1 : 0), (Serializable) n3wVarR2, (Object) this, (Object) str3), 10);
            return;
        }
        if (!(mj7Var instanceof vi7)) {
            if (mj7Var instanceof ij7) {
                sac.V(jiu0.a(this), new ql7(this, (byte) 0), null, null, new xw5(this, mj7Var, objArr5 == true ? 1 : 0, (byte) 21), 14);
                return;
            }
            if (mj7Var instanceof si7) {
                Z(((si7) mj7Var).f32249a, true);
                return;
            }
            if (mj7Var.equals(qi7.f28776a)) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, jk7.a((jk7) value, false, false, 0L, true, null, false, false, null, null, false, null, false, false, null, null, true, null, false, null, false, 33030127)));
                T();
                return;
            }
            byte b4 = 4;
            if (mj7Var.equals(ni7.f23569a)) {
                this.J.a(true);
                this.K.a(true);
                long j2 = ((ev7) this.Y.f24044a.d).b;
                if (j2 == -1) {
                    return;
                }
                if (!this.F.a()) {
                    G(cl7.f4542a);
                    return;
                } else {
                    sac.V(jiu0.a(this), new ql7(this, (byte) 4), null, mneVar.b, new ex1((Object) this, (Object) String.valueOf(j2), (yje) (objArr4 == true ? 1 : 0), (byte) 17), 10);
                    return;
                }
            }
            if (mj7Var.equals(xi7.f40931a)) {
                e3c.n(this.l0);
                O();
                return;
            }
            if (mj7Var.equals(ri7.f30526a)) {
                E();
                return;
            }
            if (mj7Var.equals(jj7.f16608a)) {
                this.o0 = sac.V(jiu0.a(this), null, null, mneVar.b, new wl7(this, objArr3 == true ? 1 : 0, b4), 11);
                bby bbyVar3 = this.k0;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                this.k0 = sac.V(jiu0.a(this), new ql7(this, (byte) 6), null, mneVar.b, new yl7(this, objArr2 == true ? 1 : 0, b2), 10);
                c4m0 c4m0Var = this.n0;
                if (c4m0Var != null) {
                    e3c.n(c4m0Var);
                }
                this.n0 = sac.T(new fnq(xkb.V(((fme) ((zas0) this.S.b).b).f9776a), new yl7(this, objArr == true ? 1 : 0, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), dm7.h);
                return;
            }
            if (mj7Var.equals(cj7.f4446a)) {
                e3c.n(this.o0);
                bby bbyVar4 = this.k0;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(null);
                }
                c4m0 c4m0Var2 = this.n0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                    return;
                }
                return;
            }
            if (!mj7Var.equals(lj7.f20137a)) {
                if (mj7Var.equals(pi7.f27030a)) {
                    pmi0.i(this.U);
                    return;
                } else if (mj7Var.equals(bj7.f2691a)) {
                    i3t0.A(this, this.v, new l1k(r6w.k), null, null, 6);
                    return;
                } else {
                    if (mj7Var.equals(aj7.f960a)) {
                        i3t0.A(this, this.v, new k1k(r6w.k), null, null, 6);
                        return;
                    }
                    return;
                }
            }
            qkt0 qkt0Var = (qkt0) ztb.b(((fme) this.T.f24973a.b).f9776a.j());
            if (qkt0Var == null) {
                U();
                return;
            }
            String str4 = qkt0Var.f28903a;
            if (str4 != null) {
                Z(str4, true);
                return;
            }
            bby bbyVar5 = this.m0;
            if (bbyVar5 != null) {
                bbyVar5.cancel(null);
            }
            U();
            return;
        }
        vi7 vi7Var = (vi7) mj7Var;
        HistoryMenuItem historyMenuItem = vi7Var.f37464a;
        String str5 = vi7Var.b;
        HistoryTypeModel historyTypeModel2 = HistoryTypeModel.SALE;
        n3w n3wVarR3 = R(str5);
        i3t0.A(this, this.v, new x0k(historyMenuItem, historyTypeModel2, n3wVarR3 != null ? n3wVarR3.l : e4f.b), null, null, 6);
        int iOrdinal = historyMenuItem.ordinal();
        ctf0 ctf0Var = this.u;
        switch (iOrdinal) {
            case 0:
                sac.V(jiu0.a(this), null, null, mneVar.b, new am7(this, str5, objArr6 == true ? 1 : 0, b), 11);
                break;
            case 1:
                G(new el7(ctf0Var.b.a(R.string.history_coupon_number_with_dot, Arrays.copyOf(new Object[]{str5}, 1)), str5));
                break;
            case 2:
                G(new tk7(ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str5}, 1)), str5));
                break;
            case 3:
                sac.V(jiu0.a(this), new ql7(this, (byte) 7), null, mneVar.b, new am7(this, str5, objArr7 == true ? 1 : 0, b2), 10);
                break;
            case 4:
                n3w n3wVarR4 = R(str5);
                if (n3wVarR4 != null) {
                    this.P.f(n3wVarR4);
                    ql5 ql5Var6 = ((jk7) D()).f;
                    if (ql5Var6 != null) {
                        i3t0.A(this, this.e0, new d0k(ql5Var6.f28916a), null, null, 6);
                    }
                    break;
                }
                break;
            case 5:
                n3w n3wVarR5 = R(str5);
                if (n3wVarR5 != null) {
                    if (n3wVarR5.Y) {
                        str5.getClass();
                        G(new uk7(str5));
                    } else if (!((jk7) D()).p) {
                        ql5 ql5Var7 = ((jk7) D()).f;
                        if (ql5Var7 != null) {
                            i3t0.A(this, this.e0, new b0k(n3wVarR5, ql5Var7.f28916a, false), null, null, 6);
                        }
                    } else {
                        kzv kzvVarQ2 = Q(str5);
                        if (kzvVarQ2 != null) {
                            ryuVar.b(kzvVarQ2);
                        }
                        ql5 ql5Var8 = ((jk7) D()).f;
                        if (ql5Var8 != null) {
                            i3t0.A(this, this.e0, new a0k(str5, ql5Var8.f28916a, false, betHistoryScreenModel.getB()), null, null, 6);
                        }
                    }
                    break;
                }
                break;
            case 6:
                n3w n3wVarR6 = R(str5);
                if (n3wVarR6 != null) {
                    nj7Var.a(r6w.j, xkb.N(n3wVarR6), xkb.f0(n3wVarR6));
                    if (((jk7) D()).p) {
                        kzv kzvVarQ3 = Q(str5);
                        if (Intrinsics.c(kzvVarQ3 != null ? Double.valueOf(kzvVarQ3.c0) : null, 0.0d) || !((jk7) D()).o) {
                            W(str5);
                        }
                    }
                    if (!((jk7) D()).p) {
                        ql5 ql5Var9 = ((jk7) D()).f;
                        if (ql5Var9 != null) {
                            i3t0.A(this, this.e0, new p0k(n3wVarR6, ql5Var9.f28916a), null, null, 6);
                        }
                    } else {
                        kzv kzvVarQ4 = Q(str5);
                        if (kzvVarQ4 != null) {
                            ryuVar.b(kzvVarQ4);
                        }
                        ql5 ql5Var10 = ((jk7) D()).f;
                        if (ql5Var10 != null) {
                            i3t0.A(this, this.e0, new o0k(str5, ql5Var10.f28916a, betHistoryScreenModel.getB()), null, null, 6);
                        }
                    }
                    break;
                }
                break;
            case 7:
                sac.V(jiu0.a(this), new ql7(this, (byte) 1), null, mneVar.b, new wn2((i3t0) this, str5, (yje) (objArr8 == true ? 1 : 0), (byte) 7), 10);
                break;
            case 8:
                str5.getClass();
                i3t0.A(this, this.e0, new r0k(str5), null, null, 6);
                break;
            case 9:
                n3w n3wVarR7 = R(str5);
                if (n3wVarR7 != null && (ql5Var = ((jk7) D()).f) != null) {
                    ygp ygpVar2 = ygp.j1;
                    r9uVar.getClass();
                    j1q0 j1q0Var2 = r9uVar.f30104a;
                    j1q0Var2.getClass();
                    if (!j1q0Var2.f15748a.d(ygpVar2)) {
                        i3t0.A(this, this.e0, new t0k(new xfs0(n3wVarR7.o, n3wVarR7.m, n3wVarR7.n, 0, ql5Var.f28916a, n3wVarR7.j, n3wVarR7.f22868a, n3wVarR7.b, n3wVarR7.m1, n3wVarR7.f, ql5Var.f)), null, null, 6);
                    } else {
                        kzv kzvVarQ5 = Q(str5);
                        if (kzvVarQ5 != null) {
                            ryuVar.b(kzvVarQ5);
                        }
                        i3t0.A(this, this.e0, new s0k(n3wVarR7.f22868a, ql5Var.f28916a), null, null, 6);
                    }
                }
                break;
            case 10:
                sac.V(jiu0.a(this), new ql7(this, (byte) 11), null, mneVar.b, new zl7(this, str5, objArr9 == true ? 1 : 0, b2), 10);
                break;
            case 11:
                sac.V(jiu0.a(this), new ql7(this, (byte) 12), null, mneVar.f22085a, new zl7(this, str5, objArr10 == true ? 1 : 0, b), 10);
                break;
            case 12:
                V(str5);
                break;
            default:
                t9f.b();
                break;
        }
    }
}
