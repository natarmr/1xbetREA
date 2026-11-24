package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class msm0 {
    public static final dsv0 a(float f) {
        return new dsv0(l1e0.c(f, 0.25f, 1.0f));
    }

    public static final void b(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-989176439);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            xcz xczVarA2 = ddz.a(0, 0, fetVar, 0, 3);
            sjj sjjVarA = wzk0.a(fetVar);
            boolean zG = fetVar.g(sjjVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new iuj(sjjVarA);
                fetVar.o0(objP);
            }
            iuj iujVar = (iuj) objP;
            boolean zG2 = fetVar.g(xczVarA) | fetVar.g(xczVarA2);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new szn0(xczVarA, xczVarA2, b);
                fetVar.o0(objP2);
            }
            ugdVar.O(fbh0.a(mm40Var, piz.P((Function1) objP2, fetVar), ma80.f21447a, false, iujVar, 44), xczVarA, xczVarA2, fetVar, 3072);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i, (byte) 10);
        }
    }

    public static final void c(mm40 mm40Var, xcz xczVar, xcz xczVar2, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        xczVar.getClass();
        xczVar2.getClass();
        fetVar.g0(-627182227);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            sjj sjjVarA = wzk0.a(fetVar);
            boolean zG = fetVar.g(sjjVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new iuj(sjjVarA);
                fetVar.o0(objP);
            }
            iuj iujVar = (iuj) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new szn0(xczVar, xczVar2, (byte) 2);
                fetVar.o0(objP2);
            }
            bch0 bch0VarP = piz.P((Function1) objP2, fetVar);
            ma80 ma80Var = ma80.f21447a;
            jm40 jm40Var = jm40.b;
            ugdVar.F(fbh0.a(jm40Var, bch0VarP, ma80Var, false, iujVar, 44), fetVar, Integer.valueOf((i2 >> 6) & 112));
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 14, i, (Object) mm40Var2, (Object) xczVar, (Object) xczVar2, (Object) ugdVar);
        }
    }

    public static final void d(yks0 yks0Var, Function0 function0, fet fetVar, int i) {
        yks0Var.getClass();
        function0.getClass();
        fetVar.g0(1578389276);
        int i2 = (fetVar.g(yks0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            rqm rqmVar = new rqm((vui0) new tui0(rsm0.w(yks0Var.b, 0, fetVar), null), (pui0) null, (pvi0) new kvi0(yks0Var.c, null, null), d4d.BACKGROUND, (tvi0) qvi0.f29388a, yks0Var.d, false, (e900) null, 394);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new xks0(function0, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function1 = (Function0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new xks0(function0, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarL, rqmVar, false, null, function1, null, (Function0) objP2, null, fetVar, 384, 168);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(yks0Var, function0, i, (byte) 10);
        }
    }

    public static final void e(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        fetVar.g0(-1899927217);
        byte b = 2;
        byte b2 = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(pz40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            byte b3 = 3;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new jxr0(pz40Var, b3);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new jxr0(pz40Var, b2);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = new Object[0];
            boolean z3 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new jxr0(pz40Var, (byte) 5);
                fetVar.o0(objP3);
            }
            z1x.m(mm40Var, null, gqw0.k, u1c.M(21470906, new c2s(l7m0VarY2, l7m0VarY, b), fetVar), u1c.M(-393855911, new qjr0(v3c.Y(objArr3, (Function0) objP3, fetVar), b3), fetVar), null, fetVar, (i2 & 14) | 28032, 34);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esw(mm40Var, pz40Var, i, (byte) 11);
        }
    }

    public static final void f(mm40 mm40Var, n1v0 n1v0Var, fet fetVar, int i) {
        byte b;
        boolean z;
        jm40 jm40Var;
        n1v0 n1v0Var2 = n1v0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-836833235);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(n1v0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            nw3 nw3Var = uc9.e;
            x5d x5dVarA = w5d.a(nw3Var, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            String str = n1v0Var2.f22771a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            long j = y3d.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, g1t0.j(), fetVar, 432, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD2, 0.0f, 16.0f, 0.0f, 8.0f, 5);
            b = 6;
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.j, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            n1v0Var2 = n1v0Var;
            if (n1v0Var2.d) {
                fetVar2.e0(1894968441);
                g(0, 4, fetVar2, null, n1v0Var2.b, n1v0Var2.c);
                z = false;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(1895124123);
                fetVar2.r(false);
            }
            if (n1v0Var2.f) {
                fetVar2.e0(1895187301);
                jm40Var = jm40Var2;
                g(0, 0, fetVar2, s5x0.N(jm40Var, 24.0f, 0.0f, 0.0f, 0.0f, 14), Integer.valueOf(R.drawable.ic_weather_windy), n1v0Var2.e);
                fetVar2.r(z);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(1895406843);
                fetVar2.r(z);
            }
            if (n1v0Var2.h) {
                fetVar2.e0(1895474051);
                g(0, 0, fetVar2, s5x0.N(jm40Var, 24.0f, 0.0f, 0.0f, 0.0f, 14), Integer.valueOf(R.drawable.ic_weather_pressure), n1v0Var2.g);
                fetVar2.r(z);
            } else {
                fetVar2.e0(1895695515);
                fetVar2.r(z);
            }
            if (n1v0Var2.j) {
                fetVar2.e0(1895762723);
                g(0, 0, fetVar2, s5x0.N(jm40Var, 24.0f, 0.0f, 0.0f, 0.0f, 14), Integer.valueOf(R.drawable.ic_weather_humidity), n1v0Var2.i);
                fetVar2.r(z);
            } else {
                fetVar2.e0(1895984187);
                fetVar2.r(z);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 6;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onu0(mm40Var, n1v0Var2, i, b);
        }
    }

    public static final void g(int i, int i2, fet fetVar, mm40 mm40Var, Integer num, String str) {
        int i3;
        mm40 mm40Var2;
        fet fetVar2;
        Unit unit;
        fet fetVar3 = fetVar;
        fetVar3.g0(690045951);
        int i4 = i | (fetVar3.g(num) ? 4 : 2) | (fetVar3.g(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (fetVar.g(mm40Var) ? 256 : 128);
        }
        int i6 = i3;
        if (fetVar3.U(i6 & 1, (i6 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var3 = i5 != 0 ? jm40Var : mm40Var;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            mm40 mm40Var4 = mm40Var3;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (num == null) {
                fetVar3.e0(1852087335);
                fetVar3.r(false);
                unit = null;
                fetVar2 = fetVar3;
            } else {
                fetVar3.e0(1852087336);
                dww.c(a8k0.F(num.intValue(), i6 & 14, fetVar3), null, o7k0.n(jm40Var, 24.0f), y3d.g, fetVar3, 3128, 0);
                fetVar2 = fetVar3;
                fetVar2.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar2.e0(1852331864);
                zq8.a(0, fetVar2, o7k0.n(jm40Var, 24.0f));
                fetVar2.r(false);
            } else {
                fetVar2.e0(1445217871);
                fetVar2.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            long j = y3d.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            fet fetVar4 = fetVar2;
            v8q0.a(str, mm40VarN2, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar4, ((i6 >> 3) & 14) | 384, 0, 131064);
            fetVar3 = fetVar4;
            fetVar3.r(true);
            mm40Var2 = mm40Var4;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) num, (Object) str, mm40Var2, i, i2, (byte) 20);
        }
    }

    public static final Object h(Task task, zje zjeVar) {
        if (!task.isComplete()) {
            n5a n5aVar = new n5a(1, pnx.b(zjeVar));
            n5aVar.r();
            task.addOnCompleteListener(bnk.c, new ani0(n5aVar));
            Object objP = n5aVar.p();
            wne wneVar = wne.f39444a;
            return objP;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0297  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:206:0x04f7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ArrayList i(ArrayList arrayList, List list, List list2, float f, qlh qlhVar, int i, ctf0 ctf0Var) {
        List list3;
        List list4;
        boolean z;
        int i2;
        float f2;
        boolean z2;
        char c;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        String str;
        List list5;
        String str2;
        zxr0 xxr0Var;
        i4 i4VarG0;
        ArrayList arrayList3 = arrayList;
        List list6 = list;
        List list7 = list2;
        list6.getClass();
        list7.getClass();
        ctf0Var.getClass();
        ArrayList arrayList4 = new ArrayList((arrayList3.size() * 2) - 1);
        ArrayList arrayListR = r3d.r(arrayList3);
        char c2 = '\n';
        int iA = wp20.a(r3d.q(arrayListR, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
        for (Object obj : arrayListR) {
            linkedHashMap2.put(((ojh) obj).f25359a, obj);
        }
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            List list8 = (List) arrayList3.get(i3);
            Map map = (Map) list6.get(i3);
            Map map2 = (Map) list7.get(i3);
            list8.getClass();
            map.getClass();
            map2.getClass();
            List listA0 = CollectionsKt.A0(list8, new swr0(map, (byte) 3));
            lc00 lc00VarB = kotlin.collections.a.b();
            zcl zclVar = qmk.f28987a;
            Iterator it = listA0.iterator();
            float f3 = 0.0f;
            while (true) {
                bzn0 bzn0Var = null;
                if (it.hasNext()) {
                    ojh ojhVar = (ojh) it.next();
                    String str3 = ojhVar.f25359a;
                    List list9 = ojhVar.f;
                    ycl yclVar = (ycl) map.get(str3);
                    if (yclVar != null) {
                        f2 = yclVar.f42389a;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f2 = 0.0f;
                    }
                    int i4 = size;
                    ycl yclVar2 = new ycl(f2);
                    zcl zclVar3 = qmk.f28987a;
                    Iterator it2 = it;
                    ycl yclVar3 = new ycl(0.0f);
                    if (yclVar2.compareTo(yclVar3) < 0) {
                        yclVar2 = yclVar3;
                    }
                    ycl yclVar4 = (ycl) map2.get(str3);
                    float fB = yclVar4 != null ? yclVar4.f42389a : lxr0.b(list9.size());
                    float f4 = yclVar2.f42389a;
                    ycl yclVar5 = new ycl(f4 - f3);
                    Map map3 = map;
                    ycl yclVar6 = new ycl(0.0f);
                    if (yclVar5.compareTo(yclVar6) < 0) {
                        yclVar5 = yclVar6;
                    }
                    float f5 = yclVar5.f42389a;
                    if (ycl.a(f5, 0.0f) > 0) {
                        lc00VarB.add(new fxr0(f5));
                    }
                    Map map4 = map2;
                    Set setL0 = i == 8 ? tx3.l0(new String[]{"2-0", "2-1"}) : tx3.l0(new String[]{"3-0", "3-1", "3-2"});
                    String str4 = ojhVar.b;
                    boolean zContains = setL0.contains(str4);
                    int i5 = i3;
                    ArrayList arrayList5 = arrayList4;
                    boolean zContains2 = (i == 8 ? tx3.l0(new String[]{"0-2", "1-2"}) : tx3.l0(new String[]{"0-3", "1-3", "2-3"})).contains(str4);
                    if (zContains || zContains2) {
                        z2 = zContains2;
                        c = '\n';
                        String str5 = (String) CollectionsKt.firstOrNull(zContains ? ojhVar.d : ojhVar.e);
                        ojh ojhVar2 = str5 != null ? (ojh) linkedHashMap2.get(str5) : null;
                        if (ojhVar2 == null) {
                            list5 = iun.f15405a;
                            linkedHashMap = linkedHashMap2;
                        } else {
                            List list10 = ojhVar2.f;
                            if (zContains) {
                                arrayList2 = new ArrayList();
                                Iterator it3 = list10.iterator();
                                while (it3.hasNext()) {
                                    Iterator it4 = it3;
                                    zjh zjhVar = (zjh) it3.next();
                                    mkh mkhVar = zjhVar.d;
                                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                    if (mkhVar.e) {
                                        str2 = mkhVar.c;
                                    } else {
                                        mkh mkhVar2 = zjhVar.e;
                                        str2 = mkhVar2.e ? mkhVar2.c : null;
                                    }
                                    if (str2 != null) {
                                        arrayList2.add(str2);
                                    }
                                    linkedHashMap2 = linkedHashMap3;
                                    it3 = it4;
                                }
                                linkedHashMap = linkedHashMap2;
                            } else {
                                linkedHashMap = linkedHashMap2;
                                arrayList2 = new ArrayList();
                                Iterator it5 = list10.iterator();
                                while (it5.hasNext()) {
                                    zjh zjhVar2 = (zjh) it5.next();
                                    mkh mkhVar3 = zjhVar2.d;
                                    Iterator it6 = it5;
                                    boolean z3 = mkhVar3.e;
                                    mkh mkhVar4 = zjhVar2.e;
                                    if (z3) {
                                        str = mkhVar4.c;
                                        if (StringsKt.W(str)) {
                                            str = null;
                                        }
                                    } else if (mkhVar4.e) {
                                        str = mkhVar3.c;
                                        if (StringsKt.W(str)) {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        arrayList2.add(str);
                                    }
                                    it5 = it6;
                                }
                            }
                            list5 = arrayList2;
                        }
                        if (i != 8) {
                            switch (str4.hashCode()) {
                                case 47574:
                                    if (str4.equals("0-3")) {
                                        bzn0Var = bzn0.f3478a;
                                    }
                                    break;
                                case 48535:
                                    if (str4.equals("1-3")) {
                                        bzn0Var = bzn0.b;
                                    }
                                    break;
                                case 49496:
                                    if (str4.equals("2-3")) {
                                        bzn0Var = bzn0.b;
                                    }
                                    break;
                                case 50454:
                                    if (str4.equals("3-0")) {
                                        bzn0Var = bzn0.f3478a;
                                    }
                                    break;
                                case 50455:
                                    if (str4.equals("3-1")) {
                                        bzn0Var = bzn0.b;
                                    }
                                    break;
                                case 50456:
                                    if (str4.equals("3-2")) {
                                        bzn0Var = bzn0.b;
                                    }
                                    break;
                            }
                        } else {
                            bzn0Var = bzn0.f3478a;
                        }
                        bzn0 bzn0Var2 = bzn0Var;
                        String str6 = (String) CollectionsKt.W(0, list5);
                        String str7 = str6 == null ? "" : str6;
                        String str8 = (String) CollectionsKt.W(1, list5);
                        String str9 = str8 == null ? "" : str8;
                        ayr0 ayr0Var = ayr0.c;
                        if (bzn0Var2 == bzn0.f3478a) {
                            xxr0Var = yxr0.f43438a;
                        } else {
                            String str10 = (String) CollectionsKt.W(2, list5);
                            if (str10 == null) {
                                str10 = "";
                            }
                            xxr0Var = new xxr0(str10);
                        }
                        i4VarG0 = dyb.g0(new byr0("", false, str7, str9, xxr0Var, ayr0Var));
                    } else {
                        ArrayList arrayList6 = new ArrayList(r3d.q(list9, 10));
                        Iterator it7 = list9.iterator();
                        int i6 = 0;
                        while (it7.hasNext()) {
                            Object next = it7.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            zjh zjhVar3 = (zjh) next;
                            String str11 = zjhVar3.f44481a;
                            boolean zD = Intrinsics.d(qlhVar.b, str11);
                            mkh mkhVar5 = zjhVar3.d;
                            String str12 = mkhVar5.c;
                            mkh mkhVar6 = zjhVar3.e;
                            boolean z4 = zContains2;
                            arrayList6.add(new byr0(str11, zD, str12, mkhVar6.c, zjhVar3.h == CyberTournamentBracketMatchStatusModel.c ? wxr0.f39944a : new vxr0(ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0))), mkhVar5.e ? ayr0.f1684a : mkhVar6.e ? ayr0.b : ayr0.c));
                            it7 = it7;
                            zContains2 = z4;
                            i6 = i7;
                        }
                        z2 = zContains2;
                        i4VarG0 = dyb.r0(arrayList6);
                        linkedHashMap = linkedHashMap2;
                        c = '\n';
                    }
                    rxr0 rxr0Var = new rxr0(str3, new cyr0(new uxr0(kotlin.text.c.r(twn.p("\\s", str4, ""), "-", Separators.COLON, false), (zContains || z2) ? gso0.f11839a : kso0.f18824a), i4VarG0, zContains ? txr0.f34716a : z2 ? txr0.b : txr0.c), fB);
                    lc00 lc00Var = lc00VarB;
                    lc00Var.add(rxr0Var);
                    f3 = f4 + fB;
                    lc00VarB = lc00Var;
                    c2 = c;
                    size = i4;
                    it = it2;
                    map = map3;
                    map2 = map4;
                    i3 = i5;
                    arrayList4 = arrayList5;
                    linkedHashMap2 = linkedHashMap;
                }
            }
            ArrayList arrayList7 = arrayList4;
            int i8 = size;
            char c3 = c2;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            int i9 = i3;
            lc00 lc00Var2 = lc00VarB;
            ycl yclVar7 = new ycl(f - f3);
            zcl zclVar4 = qmk.f28987a;
            ycl yclVar8 = new ycl(0.0f);
            if (yclVar7.compareTo(yclVar8) < 0) {
                yclVar7 = yclVar8;
            }
            float f6 = yclVar7.f42389a;
            if (ycl.a(f6, 0.0f) > 0) {
                lc00Var2.add(new fxr0(f6));
            }
            arrayList7.add(new rwr0(pr8.d, dyb.r0(kotlin.collections.a.a(lc00Var2))));
            if (i9 == arrayList.size() - 1) {
                list3 = list;
                list4 = list2;
                z = true;
            } else {
                List list11 = (List) arrayList.get(i9);
                list3 = list;
                Map map5 = (Map) list3.get(i9);
                list4 = list2;
                Map map6 = (Map) list4.get(i9);
                List<ojh> list12 = (List) arrayList.get(i9 + 1);
                list11.getClass();
                map5.getClass();
                map6.getClass();
                list12.getClass();
                lc00 lc00VarB2 = kotlin.collections.a.b();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (ojh ojhVar3 : list12) {
                    b5q b5qVar = new b5q(pgi0.h(CollectionsKt.I(ojhVar3.d), pxr0.f27767a));
                    while (b5qVar.hasNext()) {
                        hashSet.add((String) b5qVar.next());
                    }
                    b5q b5qVar2 = new b5q(pgi0.h(CollectionsKt.I(ojhVar3.e), qxr0.f29501a));
                    while (b5qVar2.hasNext()) {
                        hashSet2.add((String) b5qVar2.next());
                    }
                }
                Iterator it8 = list11.iterator();
                while (it8.hasNext()) {
                    String str13 = ((ojh) it8.next()).f25359a;
                    ycl yclVar9 = (ycl) map5.get(str13);
                    if (yclVar9 != null) {
                        float f7 = yclVar9.f42389a;
                        ycl yclVar10 = (ycl) map6.get(str13);
                        if (yclVar10 != null) {
                            float f8 = yclVar10.f42389a;
                            if (hashSet.contains(str13)) {
                                azn0 azn0Var = azn0.f1726a;
                                ycl yclVar11 = new ycl(((0.25f * f8) + f7) - 27.0f);
                                zcl zclVar5 = qmk.f28987a;
                                ycl yclVar12 = new ycl(0.0f);
                                if (yclVar11.compareTo(yclVar12) < 0) {
                                    yclVar11 = yclVar12;
                                }
                                lc00VarB2.add(new Pair(azn0Var, yclVar11));
                            }
                            if (hashSet2.contains(str13)) {
                                azn0 azn0Var2 = azn0.b;
                                ycl yclVar13 = new ycl(((f8 * 0.75f) + f7) - 27.0f);
                                zcl zclVar6 = qmk.f28987a;
                                ycl yclVar14 = new ycl(0.0f);
                                if (yclVar13.compareTo(yclVar14) < 0) {
                                    yclVar13 = yclVar14;
                                }
                                lc00VarB2.add(new Pair(azn0Var2, yclVar13));
                            }
                        } else {
                            it8 = it8;
                        }
                    } else {
                        it8 = it8;
                    }
                    it8 = it8;
                }
                List listA1 = CollectionsKt.A0(kotlin.collections.a.a(lc00VarB2), new tgo0((byte) 21));
                pr8 pr8Var = pr8.e;
                lc00 lc00VarB3 = kotlin.collections.a.b();
                zcl zclVar7 = qmk.f28987a;
                float f9 = 0.0f;
                int i10 = 0;
                for (Object obj2 : listA1) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        q3d.p();
                        throw null;
                    }
                    Pair pair = (Pair) obj2;
                    azn0 azn0Var3 = (azn0) pair.f46059a;
                    float f10 = ((ycl) pair.b).f42389a;
                    ycl yclVar15 = new ycl(f10 - f9);
                    zcl zclVar8 = qmk.f28987a;
                    ycl yclVar16 = new ycl(0.0f);
                    if (yclVar15.compareTo(yclVar16) < 0) {
                        yclVar15 = yclVar16;
                    }
                    float f11 = yclVar15.f42389a;
                    if (ycl.a(f11, 0.0f) > 0) {
                        lc00VarB3.add(new fxr0(f11));
                    }
                    int iOrdinal = azn0Var3.ordinal();
                    if (iOrdinal == 0) {
                        i2 = R.drawable.ic_swiss_arrow_green;
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        i2 = R.drawable.ic_swiss_arrow_red;
                    }
                    lc00VarB3.add(new oxr0(i2));
                    f9 = 54.0f + f10;
                    i10 = i11;
                }
                z = true;
                ycl yclVar17 = new ycl(f - f9);
                zcl zclVar9 = qmk.f28987a;
                ycl yclVar18 = new ycl(0.0f);
                if (yclVar17.compareTo(yclVar18) < 0) {
                    yclVar17 = yclVar18;
                }
                float f12 = yclVar17.f42389a;
                if (ycl.a(f12, 0.0f) > 0) {
                    lc00VarB3.add(new fxr0(f12));
                }
                arrayList7.add(new rwr0(pr8Var, dyb.r0(kotlin.collections.a.a(lc00VarB3))));
            }
            i3 = i9 + 1;
            arrayList4 = arrayList7;
            list6 = list3;
            list7 = list4;
            c2 = c3;
            size = i8;
            linkedHashMap2 = linkedHashMap4;
            arrayList3 = arrayList;
        }
        return arrayList4;
    }

    public static final boolean j(String str) {
        return new Regex("[0-9]").a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    public static nzs0 k(ArrayList arrayList, nzs0 nzs0Var, oiy oiyVar, ClassLoader classLoader) {
        oiy oiyVarH0;
        arrayList.getClass();
        classLoader.getClass();
        ArrayList<niy> arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hqy hqyVar = (hqy) it.next();
            dre0 dre0Var = oiyVar instanceof dre0 ? (dre0) oiyVar : null;
            if (dre0Var == null || (oiyVarH0 = fre0.h0(dre0Var)) == null) {
                oiyVarH0 = oiyVar;
            }
            String str = hqyVar.b;
            uiy uiyVarA0 = jwb.a0(hqyVar.d);
            j24.B.m(j24.f15764a[54], hqyVar);
            str.getClass();
            arrayList2.add(new niy(null, oiyVarH0, str, uiyVarA0));
        }
        rx3 rx3VarS0 = CollectionsKt.S0(arrayList);
        int iA = wp20.a(r3d.q(rx3VarS0, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it2 = rx3VarS0.iterator();
        while (true) {
            iil iilVar = (iil) it2;
            if (!iilVar.b.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            linkedHashMap.put(Integer.valueOf(((hqy) indexedValue.b).c), arrayList2.get(indexedValue.f46061a));
        }
        nzs0 nzs0Var2 = new nzs0(arrayList2, linkedHashMap, nzs0Var);
        int i = 0;
        for (niy niyVar : arrayList2) {
            int i2 = i + 1;
            ArrayList arrayList3 = ((hqy) arrayList.get(i)).e;
            ?? arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(jwb.Z((fqy) it3.next(), classLoader, nzs0Var2, null, 8));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = kotlin.collections.a.c(g4m0.b);
            }
            niyVar.getClass();
            arrayList4.getClass();
            niyVar.g = arrayList4;
            i = i2;
        }
        return nzs0Var2;
    }

    public static final String l(float f, ctf0 ctf0Var) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        if (f >= 1.0f) {
            return String.format(ctf0Var.b.a(R.string.lol_net_worth, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{decimalFormat.format(new BigDecimal(String.valueOf(f)))}, 1));
        }
        if (f > 0.0f) {
            return String.format(ctf0Var.b.a(R.string.lol_net_worth_less, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{1}, 1));
        }
        return f == 0.0f ? String.format(ctf0Var.b.a(R.string.lol_net_worth, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{0}, 1)) : "";
    }

    public static int[] m(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String n(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf(Separators.SLASH, i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String o(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM = m(str2);
        if (iArrM[0] != -1) {
            sb.append(str2);
            n(sb, iArrM[1], iArrM[2]);
            return sb.toString();
        }
        int[] iArrM2 = m(str);
        if (iArrM[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrM[1];
        if (i != 0) {
            int i2 = iArrM2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return n(sb, iArrM[1] + i2, i2 + iArrM[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrM2[1]);
            sb.append(str2);
            int i3 = iArrM2[1];
            return n(sb, i3, iArrM[2] + i3);
        }
        int i4 = iArrM2[0] + 2;
        int i5 = iArrM2[1];
        if (i4 >= i5 || i5 != iArrM2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrM2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return n(sb, iArrM2[1], i6 + iArrM[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrM2[1];
        return n(sb, i7, iArrM[2] + i7 + 1);
    }

    public static Uri p(String str, String str2) {
        return Uri.parse(o(str, str2));
    }

    public static final Object q(hmq0 hmq0Var, Function2 function2) {
        zvw.W(hmq0Var, true, new pwk(qcc.T(hmq0Var.e.getContext()).c(hmq0Var.f, hmq0Var, hmq0Var.d)));
        return ycm0.z(hmq0Var, false, hmq0Var, function2);
    }

    public static final czm r(d0t d0tVar) {
        f0t f0tVar = d0tVar.q;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        return new czm(qzb.s0(d0tVar), new c280(vsm0.s(f0tVar.f8731a, str), R.drawable.ic_glyph_placeholder_player), null);
    }

    public static final czm s(d0t d0tVar) {
        f0t f0tVar = d0tVar.r;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        return new czm(qzb.t0(d0tVar), new c280(vsm0.s(f0tVar.f8731a, str), R.drawable.ic_glyph_placeholder_player), null);
    }

    public static final Object t(long j, Function2 function2, zje zjeVar) {
        if (j <= 0) {
            throw new gmq0("Timed out immediately", null);
        }
        Object objQ = q(new hmq0(j, zjeVar), function2);
        wne wneVar = wne.f39444a;
        return objQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(long j, Function2 function2, zje zjeVar) {
        pmq0 pmq0Var;
        mie0 mie0Var;
        if (zjeVar instanceof pmq0) {
            pmq0Var = (pmq0) zjeVar;
            int i = pmq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmq0Var.k = i - Integer.MIN_VALUE;
            } else {
                pmq0Var = new pmq0(zjeVar);
            }
        } else {
            pmq0Var = new pmq0(zjeVar);
        }
        Object obj = pmq0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = pmq0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (j > 0) {
                mie0 mie0Var2 = new mie0();
                try {
                    pmq0Var.i = mie0Var2;
                    pmq0Var.k = 1;
                    hmq0 hmq0Var = new hmq0(j, pmq0Var);
                    mie0Var2.f21842a = hmq0Var;
                    Object objQ = q(hmq0Var, function2);
                    return objQ == wneVar ? wneVar : objQ;
                } catch (gmq0 e) {
                    e = e;
                    mie0Var = mie0Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mie0Var = pmq0Var.i;
        try {
            z1x.P(obj);
            return obj;
        } catch (gmq0 e2) {
            e = e2;
        }
        if (e.f11552a != mie0Var.f21842a) {
            throw e;
        }
        return null;
    }

    public static Status v(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] strArrSplit = str.split(Separators.COLON, 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? w((String) listAsList.get(0), (String) listAsList.get(1)) : w((String) listAsList.get(0), null);
    }

    public static Status w(String str, String str2) {
        int i;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i = 17038;
                break;
            case "INVALID_OOB_CODE":
                i = 17030;
                break;
            case "MISSING_EMAIL":
                i = 17034;
                break;
            case "INVALID_CODE":
                i = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i = 17214;
                break;
            case "TOKEN_EXPIRED":
                i = 17021;
                break;
            case "INVALID_TENANT_ID":
                i = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i = 17094;
                break;
            case "INVALID_CERT_HASH":
                i = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i = 17084;
                break;
            case "MISSING_PASSWORD":
                i = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i = 17056;
                break;
            case "WEAK_PASSWORD":
                i = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i = 17089;
                break;
            case "INVALID_SENDER":
                i = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i = 17095;
                break;
            case "EMAIL_EXISTS":
                i = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i = 17000;
                break;
            case "INVALID_PASSWORD":
                i = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i = 17202;
                break;
            case "SESSION_EXPIRED":
                i = 17051;
                break;
            case "MISSING_CODE":
                i = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i = 17201;
                break;
            case "USER_DISABLED":
                i = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i = 17073;
                break;
            default:
                i = 17499;
                break;
        }
        if (i == 17499) {
            return str2 != null ? new Status(i, kng0.l(str, Separators.COLON, str2), null, null) : new Status(i, str, null, null);
        }
        return new Status(i, str2, null, null);
    }
}
