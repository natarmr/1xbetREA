package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.cyber.statistics_blocks.impl.navigation.CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w5t0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38600a;
    public final /* synthetic */ a6t0 b;

    public /* synthetic */ w5t0(a6t0 a6t0Var, byte b) {
        this.f38600a = b;
        this.b = a6t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:124:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:5: B:50:0x0107->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qgh qghVar;
        List list;
        Iterator it;
        List list2;
        Iterator it2;
        Object obj2;
        byte b = this.f38600a;
        int i = 0;
        a6t0 a6t0Var = this.b;
        switch (b) {
            case 0:
                a6t0Var.G(new r5t0(a6t0Var.v.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                qgh qghVar2 = a6t0Var.B;
                sip sipVar = sip.b;
                String str = ((s5t0) a6t0Var.D()).j.b;
                List list3 = ((s5t0) a6t0Var.D()).i;
                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Integer.valueOf(((t9m0) it3.next()).f33572a));
                }
                List<t9m0> list4 = ((s5t0) a6t0Var.D()).i;
                List list5 = ((s5t0) a6t0Var.D()).f;
                i6t0 i6t0Var = ((s5t0) a6t0Var.D()).c;
                rsp rspVar = ((s5t0) a6t0Var.D()).d;
                lov lovVar = ((s5t0) a6t0Var.D()).e;
                list5.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                ArrayList<vnb0> arrayList2 = new ArrayList();
                for (t9m0 t9m0Var : list4) {
                    Iterator it4 = vnb0.c.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (((vnb0) next).f37712a == t9m0Var) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    vnb0 vnb0Var = (vnb0) obj2;
                    if (vnb0Var != null) {
                        arrayList2.add(vnb0Var);
                    }
                }
                for (vnb0 vnb0Var2 : arrayList2) {
                    int iOrdinal = vnb0Var2.ordinal();
                    short s = vnb0Var2.f37712a.f33572a;
                    if (iOrdinal == 0) {
                        qghVar = qghVar2;
                        if (i6t0Var != null) {
                            long j = i6t0Var.f14260a;
                            long j2 = i6t0Var.b;
                            nsp nspVarD = jwb.D(rspVar, j);
                            nsp nspVarD2 = jwb.D(rspVar, j2);
                            if (((nspVarD == null || nspVarD2 == null || !jwb.Q(nspVarD.f24060a, nspVarD2.f24060a)) ? null : new Pair(nspVarD, nspVarD2)) == null) {
                                lc00VarB.add(Integer.valueOf(s));
                            }
                        } else {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            mxp mxpVar = (mxp) CollectionsKt.W(i, list5);
                            mxp mxpVar2 = (mxp) CollectionsKt.W(1, list5);
                            if (mxpVar == null || mxpVar2 == null || (!tdc.h0(mxpVar, mxpVar2) && !tdc.a0(mxpVar, mxpVar2) && !tdc.S(mxpVar, mxpVar2))) {
                                lc00VarB.add(Integer.valueOf(s));
                            }
                        } else {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            if (lovVar == null) {
                                lc00VarB.add(Integer.valueOf(s));
                            } else {
                                List list6 = lovVar.e;
                                if (list6 == null || !list6.isEmpty()) {
                                    Iterator it5 = list6.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            list = lovVar.f;
                                            if (list == null && list.isEmpty()) {
                                                list2 = lovVar.g;
                                                if (list2 == null) {
                                                    it2 = list2.iterator();
                                                    do {
                                                        if (!it2.hasNext()) {
                                                            lc00VarB.add(Integer.valueOf(s));
                                                        }
                                                    } while (!bww.P((n4t0) it2.next()));
                                                } else {
                                                    it2 = list2.iterator();
                                                    do {
                                                        if (!it2.hasNext()) {
                                                            lc00VarB.add(Integer.valueOf(s));
                                                        }
                                                    } while (!bww.P((n4t0) it2.next()));
                                                }
                                            } else {
                                                it = list.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        list2 = lovVar.g;
                                                        if (list2 == null && list2.isEmpty()) {
                                                            lc00VarB.add(Integer.valueOf(s));
                                                        } else {
                                                            it2 = list2.iterator();
                                                            do {
                                                                if (!it2.hasNext()) {
                                                                    lc00VarB.add(Integer.valueOf(s));
                                                                }
                                                            } while (!bww.P((n4t0) it2.next()));
                                                        }
                                                    } else if (bww.P((n4t0) it.next())) {
                                                    }
                                                }
                                            }
                                        } else if (bww.P((n4t0) it5.next())) {
                                        }
                                    }
                                } else {
                                    list = lovVar.f;
                                    if (list == null) {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                list2 = lovVar.g;
                                                if (list2 == null) {
                                                    it2 = list2.iterator();
                                                    do {
                                                        if (!it2.hasNext()) {
                                                            lc00VarB.add(Integer.valueOf(s));
                                                        }
                                                    } while (!bww.P((n4t0) it2.next()));
                                                } else {
                                                    it2 = list2.iterator();
                                                    do {
                                                        if (!it2.hasNext()) {
                                                            lc00VarB.add(Integer.valueOf(s));
                                                        }
                                                    } while (!bww.P((n4t0) it2.next()));
                                                }
                                            } else if (bww.P((n4t0) it.next())) {
                                            }
                                        }
                                    } else {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                list2 = lovVar.g;
                                                if (list2 == null) {
                                                    it2 = list2.iterator();
                                                    do {
                                                        if (!it2.hasNext()) {
                                                            lc00VarB.add(Integer.valueOf(s));
                                                        }
                                                    } while (!bww.P((n4t0) it2.next()));
                                                } else {
                                                    it2 = list2.iterator();
                                                    do {
                                                        if (!it2.hasNext()) {
                                                            lc00VarB.add(Integer.valueOf(s));
                                                        }
                                                    } while (!bww.P((n4t0) it2.next()));
                                                }
                                            } else if (bww.P((n4t0) it.next())) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        qghVar = qghVar2;
                    } else {
                        if (i6t0Var != null) {
                            long j3 = i6t0Var.f14260a;
                            qghVar = qghVar2;
                            long j4 = i6t0Var.b;
                            nsp nspVarA = b8k0.A(rspVar, j3);
                            nsp nspVarA2 = b8k0.A(rspVar, j4);
                            if (((nspVarA == null || nspVarA2 == null || !b8k0.P(nspVarA.f24060a, nspVarA2.f24060a)) ? null : new Pair(nspVarA, nspVarA2)) != null) {
                            }
                        } else {
                            qghVar = qghVar2;
                        }
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    qghVar2 = qghVar;
                    i = 0;
                }
                StatisticBlocksParams statisticBlocksParams = new StatisticBlocksParams(sipVar, dam0.b, 189L, -1L, str, arrayList, kotlin.collections.a.a(lc00VarB));
                qghVar2.getClass();
                k0w0Var.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams));
                return Unit.f46060a;
        }
    }
}
