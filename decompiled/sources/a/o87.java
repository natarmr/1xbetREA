package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class o87 extends bnn0 implements Function2 {
    public mfu i;
    public f97 j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ f97 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o87(f97 f97Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = f97Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        o87 o87Var = new o87(this.m, yjeVar);
        o87Var.l = obj;
        return o87Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0299  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:109:0x0329  */
    /* JADX WARN: Code duplicated, block: B:111:0x032d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0355  */
    /* JADX WARN: Code duplicated, block: B:114:0x0359  */
    /* JADX WARN: Code duplicated, block: B:116:0x0389  */
    /* JADX WARN: Code duplicated, block: B:118:0x038d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0391  */
    /* JADX WARN: Code duplicated, block: B:121:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x03db  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:132:0x0421  */
    /* JADX WARN: Code duplicated, block: B:135:0x044e  */
    /* JADX WARN: Code duplicated, block: B:141:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:2: B:87:0x0224->B:148:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:41:0x0139  */
    /* JADX WARN: Code duplicated, block: B:46:0x0154  */
    /* JADX WARN: Code duplicated, block: B:47:0x0159  */
    /* JADX WARN: Code duplicated, block: B:49:0x0162  */
    /* JADX WARN: Code duplicated, block: B:54:0x0182  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6 A[LOOP:1: B:58:0x01a0->B:60:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0205  */
    /* JADX WARN: Code duplicated, block: B:86:0x0220  */
    /* JADX WARN: Code duplicated, block: B:89:0x022a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0236 A[EDGE_INSN: B:92:0x0236->B:93:0x0237 BREAK  A[LOOP:2: B:87:0x0224->B:148:?]] */
    /* JADX WARN: Code duplicated, block: B:95:0x023b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0247  */
    /* JADX WARN: Code duplicated, block: B:98:0x024b  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        mfu mfuVar;
        Object objS;
        f97 f97Var;
        long j;
        HistoryTypeModel historyTypeModel;
        wdj wdjVar;
        List list;
        List list2;
        String str;
        ywu ywuVar;
        rv00 rv00Var;
        pru pruVar;
        k7u k7uVar;
        ywu ywuVar2;
        long j2;
        long jN;
        boolean z;
        boolean z2;
        wdj wdjVar2;
        long j3;
        long jN2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Iterator it2;
        ArrayList arrayList4;
        Iterator it3;
        ArrayList arrayList5;
        Integer numO;
        Object next;
        ArrayList arrayList6;
        ArrayList arrayList7;
        long j4;
        long j5;
        lhf0 lhf0VarB;
        lhf0 lhf0Var;
        long timeInMillis;
        lhf0 lhf0Var2;
        ek80 ek80Var;
        p7m0 p7m0Var;
        Iterator it4;
        long j6;
        Calendar calendar;
        Calendar calendar2;
        f97 f97Var2 = this.m;
        mne mneVar = f97Var2.q;
        BetHistoryScreenModel betHistoryScreenModel = f97Var2.p;
        vne vneVar = (vne) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        if (b == 0) {
            z1x.P(obj);
            this.l = vneVar;
            this.k = (byte) 1;
            int i = f97.R0;
            if (f97Var2.V(this) != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f97Var = this.j;
            mfu mfuVar2 = this.i;
            z1x.P(obj);
            mfuVar = mfuVar2;
            objS = obj;
        }
        j = ((ql5) objS).f28916a;
        historyTypeModel = ((i77) f97Var2.D()).i;
        wdjVar = ((i77) f97Var2.D()).l;
        list = ((i77) f97Var2.D()).m;
        list2 = ((i77) f97Var2.D()).F;
        if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
            str = ((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).f;
        } else {
            str = null;
        }
        ywuVar = mfuVar.d;
        rv00Var = rv00.k;
        pruVar = mfuVar.c;
        k7uVar = mfuVar.b;
        betHistoryScreenModel.getClass();
        list.getClass();
        list2.getClass();
        if (historyTypeModel == HistoryTypeModel.UNSETTLED) {
            if (wdjVar instanceof tdj) {
                j2 = ((tdj) wdjVar).f33771a;
            } else {
                pruVar = pruVar;
                if (wdjVar instanceof udj) {
                    ywuVar2 = ywuVar;
                    jN = rv00.n(rv00Var, Calendar.getInstance().getTimeInMillis() - (((long) (pruVar.a().f32117a.b.d - 1)) * 86400000), 14) / 1000;
                } else {
                    ywuVar2 = ywuVar;
                    if (wdjVar instanceof vdj) {
                        jN = ((vdj) wdjVar).f37235a;
                    } else {
                        j2 = 0;
                    }
                }
                j2 = jN;
            }
            z = wdjVar instanceof vdj;
            if (z) {
                rdj rdjVar = rdj.f30294a;
                j6 = ((vdj) wdjVar).b;
                Date dateK = rdj.k(j6);
                z2 = z;
                Date date = new Date(System.currentTimeMillis());
                calendar = Calendar.getInstance();
                calendar.setTime(dateK);
                calendar2 = Calendar.getInstance();
                calendar2.setTime(date);
                j3 = j;
                if (calendar.get(1) != calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
                    jN2 = 0;
                    wdjVar2 = wdjVar;
                } else {
                    wdjVar2 = wdjVar;
                    jN2 = j6;
                }
            } else {
                z2 = z;
                wdjVar2 = wdjVar;
                j3 = j;
                jN2 = wdjVar2 instanceof tdj ? rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000 : 0L;
            }
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((h0w) obj2).b) {
                    arrayList.add(obj2);
                }
            }
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(xnm0.k((h0w) it.next())));
            }
            if (betHistoryScreenModel.getC() != k77.TABS_EXPANDABLE_CARDS || betHistoryScreenModel.getC() == k77.COMPACT_NO_EXPAND || betHistoryScreenModel.getC() == k77.TABS_AND_ACCORDEON) {
                arrayList3 = new ArrayList();
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    Iterator it5 = it2;
                    if (((un7) next).b) {
                        arrayList3.add(next);
                    }
                    it2 = it5;
                }
                arrayList4 = new ArrayList();
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    numO = zjb.O(((un7) it3.next()).f35947a);
                    if (numO != null) {
                        arrayList4.add(numO);
                    }
                }
                arrayList5 = arrayList4;
            } else {
                arrayList5 = null;
            }
            if (list.isEmpty()) {
                arrayList6 = null;
                break;
            }
            it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    arrayList6 = null;
                    break;
                }
                if (!((h0w) it4.next()).b) {
                    arrayList6 = arrayList2;
                    break;
                }
            }
            if (historyTypeModel == HistoryTypeModel.SALE) {
                lhf0VarB = mfuVar.i.a(j3, j2, str);
            } else {
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    lhf0Var2 = new lhf0(new gst(), new td6((Object) mfuVar.f21712a, (Object) new eb7(((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).f, k7uVar.f17841a.b().getId(), j3, j2, jN2, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList5), (yje) null, (byte) 29));
                } else {
                    arrayList7 = arrayList5;
                    j4 = jN2;
                    j5 = j2;
                    if (historyTypeModel == HistoryTypeModel.EVENTS) {
                        lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList7));
                    } else if (historyTypeModel == HistoryTypeModel.TOTO) {
                        String strValueOf = String.valueOf(k7uVar.f17841a.b().getId());
                        strValueOf.getClass();
                        lhf0Var2 = new lhf0(new xuz(), new id10(ywuVar2, j3, j5, j4, strValueOf, arrayList2, (yje) null));
                    } else if (historyTypeModel == HistoryTypeModel.AUTO) {
                        lhf0Var2 = new lhf0(new xuz(), new y32((Object) mfuVar.e, (Object) new ww4(j5, j4, j3, arrayList2, k7uVar.f17841a.b().getId()), (yje) null, (byte) 26));
                    } else if (historyTypeModel == HistoryTypeModel.UNSETTLED) {
                        lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, kotlin.collections.a.c(1), false, arrayList7));
                    } else {
                        if (historyTypeModel == HistoryTypeModel.JACKPOT) {
                            lhf0Var = new lhf0(new xuz(), new mor0(ywuVar2, j3, j5, j4, k7uVar.f17841a.b().getId(), pruVar.a().Y, arrayList2, null));
                        } else if (historyTypeModel == HistoryTypeModel.LOTTO) {
                            if (wdjVar2 instanceof tdj) {
                                timeInMillis = rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000;
                            } else if (wdjVar2.equals(udj.f35481a)) {
                                timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                            } else {
                                if (z2) {
                                    t9f.b();
                                    return null;
                                }
                                timeInMillis = ((vdj) wdjVar2).b;
                            }
                            lhf0Var = new lhf0(new gst(), new id10(mfuVar.g, arrayList6, j5, timeInMillis, mfuVar.h.a(), j3, (yje) null));
                        } else if (historyTypeModel == HistoryTypeModel.AGGREGATOR) {
                            lhf0Var = new lhf0(new gst(), new kz(mfuVar.f, new oc0(j5, j4, mfu.a(CollectionsKt.D0(list, 2)), pruVar.a().f32117a.b.h, mfu.a(CollectionsKt.E0(2, list))), null));
                        } else {
                            lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, false, arrayList7));
                        }
                        lhf0VarB = lhf0Var;
                    }
                }
                lhf0VarB = lhf0Var2;
            }
            f97Var.K0 = new ek80(lhf0VarB, jiu0.a(f97Var2), mneVar.b);
            ek80Var = f97Var2.K0;
            if (ek80Var != null && (p7m0Var = ek80Var.e) != null) {
                sac.T(new fnq(p7m0Var, new kv(f97Var2, null, (byte) 3), (byte) 4), d5c.S(vneVar, mneVar.f22085a), foe.h);
            }
            return Unit.f46060a;
        }
        j2 = 1325376;
        ywuVar2 = ywuVar;
        z = wdjVar instanceof vdj;
        if (z) {
            rdj rdjVar2 = rdj.f30294a;
            j6 = ((vdj) wdjVar).b;
            Date dateK2 = rdj.k(j6);
            z2 = z;
            Date date2 = new Date(System.currentTimeMillis());
            calendar = Calendar.getInstance();
            calendar.setTime(dateK2);
            calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            j3 = j;
            if (calendar.get(1) != calendar2.get(1)) {
                wdjVar2 = wdjVar;
                jN2 = j6;
            } else {
                wdjVar2 = wdjVar;
                jN2 = j6;
            }
        } else {
            z2 = z;
            wdjVar2 = wdjVar;
            j3 = j;
            jN2 = wdjVar2 instanceof tdj ? rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000 : 0L;
        }
        arrayList = new ArrayList();
        while (r12.hasNext()) {
            if (((h0w) obj2).b) {
                arrayList.add(obj2);
            }
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(xnm0.k((h0w) it.next())));
        }
        if (betHistoryScreenModel.getC() != k77.TABS_EXPANDABLE_CARDS) {
            arrayList3 = new ArrayList();
            it2 = list2.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                Iterator it6 = it2;
                if (((un7) next).b) {
                    arrayList3.add(next);
                }
                it2 = it6;
            }
            arrayList4 = new ArrayList();
            it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                numO = zjb.O(((un7) it3.next()).f35947a);
                if (numO != null) {
                    arrayList4.add(numO);
                }
            }
            arrayList5 = arrayList4;
        } else {
            arrayList3 = new ArrayList();
            it2 = list2.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                Iterator it7 = it2;
                if (((un7) next).b) {
                    arrayList3.add(next);
                }
                it2 = it7;
            }
            arrayList4 = new ArrayList();
            it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                numO = zjb.O(((un7) it3.next()).f35947a);
                if (numO != null) {
                    arrayList4.add(numO);
                }
            }
            arrayList5 = arrayList4;
        }
        if (list.isEmpty()) {
            arrayList6 = null;
            break;
        }
        it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                arrayList6 = null;
                break;
            }
            if (!((h0w) it4.next()).b) {
                arrayList6 = arrayList2;
                break;
            }
        }
        if (historyTypeModel == HistoryTypeModel.SALE) {
            lhf0VarB = mfuVar.i.a(j3, j2, str);
        } else {
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                lhf0Var2 = new lhf0(new gst(), new td6((Object) mfuVar.f21712a, (Object) new eb7(((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).f, k7uVar.f17841a.b().getId(), j3, j2, jN2, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList5), (yje) null, (byte) 29));
            } else {
                arrayList7 = arrayList5;
                j4 = jN2;
                j5 = j2;
                if (historyTypeModel == HistoryTypeModel.EVENTS) {
                    lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList7));
                } else if (historyTypeModel == HistoryTypeModel.TOTO) {
                    String strValueOf2 = String.valueOf(k7uVar.f17841a.b().getId());
                    strValueOf2.getClass();
                    lhf0Var2 = new lhf0(new xuz(), new id10(ywuVar2, j3, j5, j4, strValueOf2, arrayList2, (yje) null));
                } else if (historyTypeModel == HistoryTypeModel.AUTO) {
                    lhf0Var2 = new lhf0(new xuz(), new y32((Object) mfuVar.e, (Object) new ww4(j5, j4, j3, arrayList2, k7uVar.f17841a.b().getId()), (yje) null, (byte) 26));
                } else if (historyTypeModel == HistoryTypeModel.UNSETTLED) {
                    lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, kotlin.collections.a.c(1), false, arrayList7));
                } else {
                    if (historyTypeModel == HistoryTypeModel.JACKPOT) {
                        lhf0Var = new lhf0(new xuz(), new mor0(ywuVar2, j3, j5, j4, k7uVar.f17841a.b().getId(), pruVar.a().Y, arrayList2, null));
                    } else if (historyTypeModel == HistoryTypeModel.LOTTO) {
                        if (wdjVar2 instanceof tdj) {
                            timeInMillis = rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000;
                        } else if (wdjVar2.equals(udj.f35481a)) {
                            timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                        } else {
                            if (z2) {
                                t9f.b();
                                return null;
                            }
                            timeInMillis = ((vdj) wdjVar2).b;
                        }
                        lhf0Var = new lhf0(new gst(), new id10(mfuVar.g, arrayList6, j5, timeInMillis, mfuVar.h.a(), j3, (yje) null));
                    } else if (historyTypeModel == HistoryTypeModel.AGGREGATOR) {
                        lhf0Var = new lhf0(new gst(), new kz(mfuVar.f, new oc0(j5, j4, mfu.a(CollectionsKt.D0(list, 2)), pruVar.a().f32117a.b.h, mfu.a(CollectionsKt.E0(2, list))), null));
                    } else {
                        lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, false, arrayList7));
                    }
                    lhf0VarB = lhf0Var;
                }
            }
            lhf0VarB = lhf0Var2;
        }
        f97Var.K0 = new ek80(lhf0VarB, jiu0.a(f97Var2), mneVar.b);
        ek80Var = f97Var2.K0;
        if (ek80Var != null) {
            sac.T(new fnq(p7m0Var, new kv(f97Var2, null, (byte) 3), (byte) 4), d5c.S(vneVar, mneVar.f22085a), foe.h);
        }
        return Unit.f46060a;
        mfuVar = f97Var2.N;
        this.l = vneVar;
        this.i = mfuVar;
        this.j = f97Var2;
        this.k = (byte) 2;
        objS = f97Var2.S(this);
        if (objS != wneVar) {
            f97Var = f97Var2;
            j = ((ql5) objS).f28916a;
            historyTypeModel = ((i77) f97Var2.D()).i;
            wdjVar = ((i77) f97Var2.D()).l;
            list = ((i77) f97Var2.D()).m;
            list2 = ((i77) f97Var2.D()).F;
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                str = ((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).f;
            } else {
                str = null;
            }
            ywuVar = mfuVar.d;
            rv00Var = rv00.k;
            pruVar = mfuVar.c;
            k7uVar = mfuVar.b;
            betHistoryScreenModel.getClass();
            list.getClass();
            list2.getClass();
            if (historyTypeModel == HistoryTypeModel.UNSETTLED) {
                if (wdjVar instanceof tdj) {
                    j2 = ((tdj) wdjVar).f33771a;
                } else {
                    pruVar = pruVar;
                    if (wdjVar instanceof udj) {
                        ywuVar2 = ywuVar;
                        jN = rv00.n(rv00Var, Calendar.getInstance().getTimeInMillis() - (((long) (pruVar.a().f32117a.b.d - 1)) * 86400000), 14) / 1000;
                    } else {
                        ywuVar2 = ywuVar;
                        if (wdjVar instanceof vdj) {
                            jN = ((vdj) wdjVar).f37235a;
                        } else {
                            j2 = 0;
                        }
                    }
                    j2 = jN;
                }
                z = wdjVar instanceof vdj;
                if (z) {
                    rdj rdjVar3 = rdj.f30294a;
                    j6 = ((vdj) wdjVar).b;
                    Date dateK3 = rdj.k(j6);
                    z2 = z;
                    Date date3 = new Date(System.currentTimeMillis());
                    calendar = Calendar.getInstance();
                    calendar.setTime(dateK3);
                    calendar2 = Calendar.getInstance();
                    calendar2.setTime(date3);
                    j3 = j;
                    if (calendar.get(1) != calendar2.get(1)) {
                        wdjVar2 = wdjVar;
                        jN2 = j6;
                    } else {
                        wdjVar2 = wdjVar;
                        jN2 = j6;
                    }
                } else {
                    z2 = z;
                    wdjVar2 = wdjVar;
                    j3 = j;
                    jN2 = wdjVar2 instanceof tdj ? rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000 : 0L;
                }
                arrayList = new ArrayList();
                while (r12.hasNext()) {
                    if (((h0w) obj2).b) {
                        arrayList.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(xnm0.k((h0w) it.next())));
                }
                if (betHistoryScreenModel.getC() != k77.TABS_EXPANDABLE_CARDS) {
                    arrayList3 = new ArrayList();
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        Iterator it8 = it2;
                        if (((un7) next).b) {
                            arrayList3.add(next);
                        }
                        it2 = it8;
                    }
                    arrayList4 = new ArrayList();
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        numO = zjb.O(((un7) it3.next()).f35947a);
                        if (numO != null) {
                            arrayList4.add(numO);
                        }
                    }
                    arrayList5 = arrayList4;
                } else {
                    arrayList3 = new ArrayList();
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        Iterator it9 = it2;
                        if (((un7) next).b) {
                            arrayList3.add(next);
                        }
                        it2 = it9;
                    }
                    arrayList4 = new ArrayList();
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        numO = zjb.O(((un7) it3.next()).f35947a);
                        if (numO != null) {
                            arrayList4.add(numO);
                        }
                    }
                    arrayList5 = arrayList4;
                }
                if (list.isEmpty()) {
                    arrayList6 = null;
                    break;
                }
                it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        arrayList6 = null;
                        break;
                    }
                    if (!((h0w) it4.next()).b) {
                        arrayList6 = arrayList2;
                        break;
                    }
                }
                if (historyTypeModel == HistoryTypeModel.SALE) {
                    lhf0VarB = mfuVar.i.a(j3, j2, str);
                } else {
                    if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                        lhf0Var2 = new lhf0(new gst(), new td6((Object) mfuVar.f21712a, (Object) new eb7(((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).f, k7uVar.f17841a.b().getId(), j3, j2, jN2, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList5), (yje) null, (byte) 29));
                    } else {
                        arrayList7 = arrayList5;
                        j4 = jN2;
                        j5 = j2;
                        if (historyTypeModel == HistoryTypeModel.EVENTS) {
                            lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList7));
                        } else if (historyTypeModel == HistoryTypeModel.TOTO) {
                            String strValueOf3 = String.valueOf(k7uVar.f17841a.b().getId());
                            strValueOf3.getClass();
                            lhf0Var2 = new lhf0(new xuz(), new id10(ywuVar2, j3, j5, j4, strValueOf3, arrayList2, (yje) null));
                        } else if (historyTypeModel == HistoryTypeModel.AUTO) {
                            lhf0Var2 = new lhf0(new xuz(), new y32((Object) mfuVar.e, (Object) new ww4(j5, j4, j3, arrayList2, k7uVar.f17841a.b().getId()), (yje) null, (byte) 26));
                        } else if (historyTypeModel == HistoryTypeModel.UNSETTLED) {
                            lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, kotlin.collections.a.c(1), false, arrayList7));
                        } else {
                            if (historyTypeModel == HistoryTypeModel.JACKPOT) {
                                lhf0Var = new lhf0(new xuz(), new mor0(ywuVar2, j3, j5, j4, k7uVar.f17841a.b().getId(), pruVar.a().Y, arrayList2, null));
                            } else if (historyTypeModel == HistoryTypeModel.LOTTO) {
                                if (wdjVar2 instanceof tdj) {
                                    timeInMillis = rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000;
                                } else if (wdjVar2.equals(udj.f35481a)) {
                                    timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                                } else {
                                    if (z2) {
                                        t9f.b();
                                        return null;
                                    }
                                    timeInMillis = ((vdj) wdjVar2).b;
                                }
                                lhf0Var = new lhf0(new gst(), new id10(mfuVar.g, arrayList6, j5, timeInMillis, mfuVar.h.a(), j3, (yje) null));
                            } else if (historyTypeModel == HistoryTypeModel.AGGREGATOR) {
                                lhf0Var = new lhf0(new gst(), new kz(mfuVar.f, new oc0(j5, j4, mfu.a(CollectionsKt.D0(list, 2)), pruVar.a().f32117a.b.h, mfu.a(CollectionsKt.E0(2, list))), null));
                            } else {
                                lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, false, arrayList7));
                            }
                            lhf0VarB = lhf0Var;
                        }
                    }
                    lhf0VarB = lhf0Var2;
                }
                f97Var.K0 = new ek80(lhf0VarB, jiu0.a(f97Var2), mneVar.b);
                ek80Var = f97Var2.K0;
                if (ek80Var != null) {
                    sac.T(new fnq(p7m0Var, new kv(f97Var2, null, (byte) 3), (byte) 4), d5c.S(vneVar, mneVar.f22085a), foe.h);
                }
                return Unit.f46060a;
            }
            j2 = 1325376;
            ywuVar2 = ywuVar;
            z = wdjVar instanceof vdj;
            if (z) {
                rdj rdjVar4 = rdj.f30294a;
                j6 = ((vdj) wdjVar).b;
                Date dateK4 = rdj.k(j6);
                z2 = z;
                Date date4 = new Date(System.currentTimeMillis());
                calendar = Calendar.getInstance();
                calendar.setTime(dateK4);
                calendar2 = Calendar.getInstance();
                calendar2.setTime(date4);
                j3 = j;
                if (calendar.get(1) != calendar2.get(1)) {
                    wdjVar2 = wdjVar;
                    jN2 = j6;
                } else {
                    wdjVar2 = wdjVar;
                    jN2 = j6;
                }
            } else {
                z2 = z;
                wdjVar2 = wdjVar;
                j3 = j;
                jN2 = wdjVar2 instanceof tdj ? rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000 : 0L;
            }
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                if (((h0w) obj2).b) {
                    arrayList.add(obj2);
                }
            }
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(xnm0.k((h0w) it.next())));
            }
            if (betHistoryScreenModel.getC() != k77.TABS_EXPANDABLE_CARDS) {
                arrayList3 = new ArrayList();
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    Iterator it10 = it2;
                    if (((un7) next).b) {
                        arrayList3.add(next);
                    }
                    it2 = it10;
                }
                arrayList4 = new ArrayList();
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    numO = zjb.O(((un7) it3.next()).f35947a);
                    if (numO != null) {
                        arrayList4.add(numO);
                    }
                }
                arrayList5 = arrayList4;
            } else {
                arrayList3 = new ArrayList();
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    Iterator it11 = it2;
                    if (((un7) next).b) {
                        arrayList3.add(next);
                    }
                    it2 = it11;
                }
                arrayList4 = new ArrayList();
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    numO = zjb.O(((un7) it3.next()).f35947a);
                    if (numO != null) {
                        arrayList4.add(numO);
                    }
                }
                arrayList5 = arrayList4;
            }
            if (list.isEmpty()) {
                arrayList6 = null;
                break;
            }
            it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    arrayList6 = null;
                    break;
                }
                if (!((h0w) it4.next()).b) {
                    arrayList6 = arrayList2;
                    break;
                }
            }
            if (historyTypeModel == HistoryTypeModel.SALE) {
                lhf0VarB = mfuVar.i.a(j3, j2, str);
            } else {
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    lhf0Var2 = new lhf0(new gst(), new td6((Object) mfuVar.f21712a, (Object) new eb7(((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).f, k7uVar.f17841a.b().getId(), j3, j2, jN2, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList5), (yje) null, (byte) 29));
                } else {
                    arrayList7 = arrayList5;
                    j4 = jN2;
                    j5 = j2;
                    if (historyTypeModel == HistoryTypeModel.EVENTS) {
                        lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, !arrayList2.equals(kotlin.collections.a.c(5)), arrayList7));
                    } else if (historyTypeModel == HistoryTypeModel.TOTO) {
                        String strValueOf4 = String.valueOf(k7uVar.f17841a.b().getId());
                        strValueOf4.getClass();
                        lhf0Var2 = new lhf0(new xuz(), new id10(ywuVar2, j3, j5, j4, strValueOf4, arrayList2, (yje) null));
                    } else if (historyTypeModel == HistoryTypeModel.AUTO) {
                        lhf0Var2 = new lhf0(new xuz(), new y32((Object) mfuVar.e, (Object) new ww4(j5, j4, j3, arrayList2, k7uVar.f17841a.b().getId()), (yje) null, (byte) 26));
                    } else if (historyTypeModel == HistoryTypeModel.UNSETTLED) {
                        lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, kotlin.collections.a.c(1), false, arrayList7));
                    } else {
                        if (historyTypeModel == HistoryTypeModel.JACKPOT) {
                            lhf0Var = new lhf0(new xuz(), new mor0(ywuVar2, j3, j5, j4, k7uVar.f17841a.b().getId(), pruVar.a().Y, arrayList2, null));
                        } else if (historyTypeModel == HistoryTypeModel.LOTTO) {
                            if (wdjVar2 instanceof tdj) {
                                timeInMillis = rv00.n(rv00Var, ((tdj) wdjVar2).f33771a * 1000, 12) / 1000;
                            } else if (wdjVar2.equals(udj.f35481a)) {
                                timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                            } else {
                                if (z2) {
                                    t9f.b();
                                    return null;
                                }
                                timeInMillis = ((vdj) wdjVar2).b;
                            }
                            lhf0Var = new lhf0(new gst(), new id10(mfuVar.g, arrayList6, j5, timeInMillis, mfuVar.h.a(), j3, (yje) null));
                        } else if (historyTypeModel == HistoryTypeModel.AGGREGATOR) {
                            lhf0Var = new lhf0(new gst(), new kz(mfuVar.f, new oc0(j5, j4, mfu.a(CollectionsKt.D0(list, 2)), pruVar.a().f32117a.b.h, mfu.a(CollectionsKt.E0(2, list))), null));
                        } else {
                            lhf0VarB = mfuVar.b(new xa7(k7uVar.f17841a.b().getId(), j3, j5, j4, arrayList2, false, arrayList7));
                        }
                        lhf0VarB = lhf0Var;
                    }
                }
                lhf0VarB = lhf0Var2;
            }
            f97Var.K0 = new ek80(lhf0VarB, jiu0.a(f97Var2), mneVar.b);
            ek80Var = f97Var2.K0;
            if (ek80Var != null) {
                sac.T(new fnq(p7m0Var, new kv(f97Var2, null, (byte) 3), (byte) 4), d5c.S(vneVar, mneVar.f22085a), foe.h);
            }
            return Unit.f46060a;
        }
        return wneVar;
    }
}
