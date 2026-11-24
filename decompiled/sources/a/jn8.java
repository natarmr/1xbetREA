package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f16801a;

    static {
        byte b = 24;
        byte b2 = 23;
        byte b3 = 25;
        byte b4 = 26;
        f16801a = xp20.f(new Pair(v5l0.LARGE_CARD_LARGE_SPORT_ICON, new hum0(new nk7((byte) 22), new wgd((byte) 4), new wgd((byte) 5), new ahd(b))), new Pair(v5l0.SMALL_CARD_NO_TEAM_LOGO, new hum0(new nk7(b2), new wgd((byte) 6), new wgd((byte) 7), new ahd(b3))), new Pair(v5l0.MEDIUM_CARD_SMALL_TEAM_LOGO, new hum0(new nk7(b), new wgd((byte) 8), new wgd((byte) 9), new ahd(b4))), new Pair(v5l0.LARGE_CARD_WATERMARK, new hum0(new nk7(b3), new wgd((byte) 10), new wgd((byte) 11), new ahd((byte) 27))), new Pair(v5l0.LARGE_CARD_LARGE_TEAM_LOGO, new hum0(new nk7(b4), new wgd((byte) 12), new wgd((byte) 13), new ahd(b2))));
    }

    public static final nem a(d0t d0tVar, v5l0 v5l0Var, ctf0 ctf0Var, m5l0 m5l0Var) {
        int i;
        int i2;
        String str;
        xfm tfmVar;
        d0tVar.getClass();
        long j = d0tVar.f5282a;
        v5l0Var.getClass();
        ctf0Var.getClass();
        m5l0Var.getClass();
        Object obj = null;
        if (m5l0Var instanceof i5l0) {
            bhl0 bhl0Var = new bhl0(ctf0Var.b.a(R.string.all_markets, Arrays.copyOf(new Object[0], 0)));
            qil0 dil0Var = new dil0((y9q0) null, (y9q0) null, new zgl0(), 7);
            int iOrdinal = v5l0Var.ordinal();
            if (iOrdinal == 0) {
                dil0Var = new gil0(0, null, null, new zgl0(), 7);
            } else if (iOrdinal == 1) {
                dil0Var = new oil0((y9q0) null, (y9q0) null, new zgl0(), 7);
            } else if (iOrdinal == 2) {
                dil0Var = new kil0(null, null, new zgl0(), 15);
            } else if (iOrdinal != 3 && iOrdinal != 4) {
                t9f.b();
                return null;
            }
            return new jem(j, dil0Var, bhl0Var);
        }
        if (m5l0Var instanceof j5l0) {
            boolean z = ((j5l0) m5l0Var).f15938a;
            lc00 lc00VarB = b(d0tVar, v5l0Var, 10, true);
            a4x a4xVarO0 = dyb.o0(CollectionsKt.D0(lc00VarB, 1));
            if (z) {
                a4xVarO0 = dyb.o0(lc00VarB);
            }
            BetGroupZip betGroupZip = (BetGroupZip) CollectionsKt.firstOrNull(d0tVar.K);
            if (betGroupZip == null || (str = betGroupZip.c) == null) {
                str = "";
            }
            int iOrdinal2 = v5l0Var.ordinal();
            if (iOrdinal2 == 0) {
                tfmVar = new tfm();
            } else if (iOrdinal2 == 1) {
                tfmVar = new ufm();
            } else if (iOrdinal2 == 2) {
                tfmVar = new vfm();
            } else {
                if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                    t9f.b();
                    return null;
                }
                tfmVar = new wfm();
            }
            return new kem(j, a4xVarO0, new jfm(str, tfmVar, z));
        }
        if (!(m5l0Var instanceof k5l0)) {
            if (m5l0Var instanceof l5l0) {
                return new mem(j, dyb.o0(b(d0tVar, v5l0Var, 1, false)));
            }
            t9f.b();
            return null;
        }
        lc00 lc00VarB2 = b(d0tVar, v5l0Var, 10, false);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = lc00VarB2.listIterator(0);
        int i3 = 0;
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                break;
            }
            ifm ifmVar = (ifm) pawVar.next();
            if (ifmVar != null) {
                if (ifmVar instanceof cfm) {
                    i2 = 2;
                } else if (ifmVar instanceof hfm) {
                    i2 = 1;
                }
                int i4 = i2 + i3;
                if (i4 > 10) {
                    break;
                }
                arrayList.add(ifmVar);
                i3 = i4;
            }
            t9f.b();
            return null;
        }
        ListIterator listIterator2 = lc00VarB2.listIterator(0);
        int i5 = 0;
        while (true) {
            paw pawVar2 = (paw) listIterator2;
            if (!pawVar2.hasNext()) {
                if (i3 < i5) {
                    k4n k4nVar = (k4n) CollectionsKt.d0(((ifm) dw9.l(1, arrayList)).c());
                    if (k4nVar instanceof d4n) {
                        ArrayList arrayListR0 = CollectionsKt.r0(CollectionsKt.P(1, ((d4n) k4nVar).a()), dhl0.f6096a);
                        Object obj2 = f16801a.get(v5l0Var);
                        obj2.getClass();
                        hum0 hum0Var = (hum0) obj2;
                        d4n d4nVar = (d4n) hum0Var.f13689a.invoke(dyb.o0(arrayListR0));
                        ifm ifmVar2 = (ifm) CollectionsKt.d0(arrayList);
                        if (ifmVar2 != null) {
                            if (ifmVar2 instanceof cfm) {
                                mfm header = ((cfm) ifmVar2).getHeader();
                                if (header instanceof lfm) {
                                    obj = (cfm) hum0Var.c.j(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), header, dyb.g0(d4nVar));
                                }
                            } else if (ifmVar2 instanceof hfm) {
                                obj = (ifm) hum0Var.d.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), dyb.g0(d4nVar));
                            }
                            if (obj != null) {
                                arrayList.set(arrayList.size() - 1, obj);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                return new lem(j, dyb.o0(arrayList));
            }
            ifm ifmVar3 = (ifm) pawVar2.next();
            if (ifmVar3 == null) {
                break;
            }
            if (!(ifmVar3 instanceof cfm)) {
                if (!(ifmVar3 instanceof hfm)) {
                    break;
                }
                i = 1;
            } else {
                i = 2;
            }
            i5 += i;
        }
        t9f.b();
        return null;
    }

    public static final lc00 b(d0t d0tVar, v5l0 v5l0Var, int i, boolean z) {
        lc00 lc00VarB = kotlin.collections.a.b();
        a4x a4xVarC = c(d0tVar.K, v5l0Var, "", d0tVar.f5282a, i, z);
        lc00VarB.addAll(a4xVarC);
        int size = i - a4xVarC.size();
        if (size > 0) {
            int size2 = size;
            for (d0t d0tVar2 : d0tVar.k) {
                if (size2 > 0) {
                    a4x a4xVarC2 = c(d0tVar2.K, v5l0Var, d0tVar2.i, d0tVar2.f5282a, size2, z);
                    lc00VarB.addAll(a4xVarC2);
                    size2 -= a4xVarC2.size();
                }
            }
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final a4x c(List list, v5l0 v5l0Var, String str, long j, int i, boolean z) {
        Iterator it;
        int i2;
        boolean z2;
        long j2;
        List listO0;
        String str2;
        k0d k0dVar;
        Object chl0Var;
        ifm ifmVar;
        cgm yfmVar;
        sfm ofmVar;
        lc00 lc00VarB = kotlin.collections.a.b();
        Object obj = f16801a.get(v5l0Var);
        obj.getClass();
        hum0 hum0Var = (hum0) obj;
        xdr xdrVar = hum0Var.d;
        Function1 function1 = hum0Var.f13689a;
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            BetGroupZip betGroupZip = (BetGroupZip) next;
            if (lc00VarB.b() < i) {
                boolean z3 = i3 == 0;
                List list2 = betGroupZip.f;
                String str3 = betGroupZip.c;
                a4x a4xVar = null;
                long j3 = betGroupZip.b;
                int i5 = betGroupZip.e;
                if (i5 > 3) {
                    i5 = 3;
                }
                ArrayList arrayList = new ArrayList();
                if (i5 == 0) {
                    listO0 = lak0.c;
                    it = it2;
                    z2 = z3;
                    i2 = i4;
                    j2 = j3;
                } else {
                    for (List list3 : CollectionsKt.K(list2, i5)) {
                        Iterator it3 = it2;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                        Iterator it4 = list3.iterator();
                        while (it4.hasNext()) {
                            BetZip betZip = (BetZip) it4.next();
                            Iterator it5 = it4;
                            boolean z4 = z3;
                            String strM = ju70.M(betZip, false);
                            if (betZip.t.length() == 0 && (strM.length() == 0 || strM.equals("0"))) {
                                chl0Var = a4xVar;
                            } else {
                                String str4 = betZip.t;
                                izc izcVar = betZip.v;
                                boolean z5 = betZip.f;
                                int iOrdinal = izcVar.ordinal();
                                if (iOrdinal != 0) {
                                    str2 = strM;
                                    if (iOrdinal == 1) {
                                        k0dVar = k0d.d;
                                    } else {
                                        if (iOrdinal != 2) {
                                            t9f.b();
                                            return a4xVar;
                                        }
                                        k0dVar = k0d.f17460a;
                                    }
                                } else {
                                    str2 = strM;
                                    k0dVar = k0d.c;
                                }
                                if (z5) {
                                    k0dVar = k0d.b;
                                }
                                chl0Var = new chl0(str4, str2, k0dVar, a65.f301a, betZip.y, betZip.w, betZip.h1, false, new xgl0(betZip.f46426a, betZip.d, betZip.b, betZip.t, 0, 0L, 0, 0L, false));
                            }
                            arrayList2.add(chl0Var);
                            it4 = it5;
                            z3 = z4;
                            i4 = i4;
                            j3 = j3;
                        }
                        boolean z6 = z3;
                        int i6 = i4;
                        long j4 = j3;
                        if (arrayList2.size() < i5) {
                            int size = i5 - arrayList2.size();
                            ArrayList arrayList3 = new ArrayList(size);
                            int i7 = 0;
                            while (i7 < size) {
                                arrayList3.add(a4xVar);
                                i7++;
                                a4xVar = null;
                            }
                            arrayList2 = CollectionsKt.q0(arrayList2, arrayList3);
                        }
                        arrayList.add(function1.invoke(dyb.o0(arrayList2)));
                        it2 = it3;
                        z3 = z6;
                        i4 = i6;
                        j3 = j4;
                        a4xVar = null;
                    }
                    it = it2;
                    z2 = z3;
                    i2 = i4;
                    j2 = j3;
                    listO0 = dyb.o0(arrayList);
                }
                if (!listO0.isEmpty()) {
                    int i8 = 0;
                    for (Object obj2 : listO0) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            q3d.p();
                            throw null;
                        }
                        d4n d4nVar = (d4n) obj2;
                        if (lc00VarB.b() < i) {
                            if (z && z2) {
                                ifmVar = (ifm) xdrVar.F(Long.valueOf(j), Long.valueOf(j2), dyb.g0(d4nVar));
                            } else {
                                if (str.length() > 0 && i8 == 0) {
                                    int iOrdinal2 = v5l0Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        ofmVar = new ofm();
                                    } else if (iOrdinal2 == 1) {
                                        ofmVar = new pfm();
                                    } else if (iOrdinal2 == 2) {
                                        ofmVar = new qfm();
                                    } else {
                                        if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                                            t9f.b();
                                            return null;
                                        }
                                        ofmVar = new rfm();
                                    }
                                    ifmVar = (ifm) hum0Var.b.j(Long.valueOf(j), Long.valueOf(j2), new kfm(str3, ofmVar, str), dyb.g0(d4nVar));
                                } else if (str3.length() <= 0 || i8 != 0) {
                                    ifmVar = (ifm) xdrVar.F(Long.valueOf(j), Long.valueOf(j2), dyb.g0(d4nVar));
                                } else {
                                    int iOrdinal3 = v5l0Var.ordinal();
                                    if (iOrdinal3 == 0) {
                                        yfmVar = new yfm();
                                    } else if (iOrdinal3 == 1) {
                                        yfmVar = new zfm();
                                    } else if (iOrdinal3 == 2) {
                                        yfmVar = new agm();
                                    } else {
                                        if (iOrdinal3 != 3 && iOrdinal3 != 4) {
                                            t9f.b();
                                            return null;
                                        }
                                        yfmVar = new bgm();
                                    }
                                    ifmVar = (ifm) hum0Var.c.j(Long.valueOf(j), Long.valueOf(j2), new lfm(str3, yfmVar), dyb.g0(d4nVar));
                                }
                                lc00VarB.add(ifmVar);
                            }
                            lc00VarB.add(ifmVar);
                        }
                        i8 = i9;
                    }
                }
            } else {
                it = it2;
                i2 = i4;
            }
            it2 = it;
            i3 = i2;
        }
        return dyb.o0(kotlin.collections.a.a(lc00VarB));
    }
}
