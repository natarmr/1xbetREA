package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final class xg0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(xot0 xot0Var, Map map, crd crdVar, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 21;
        oot0 oot0Var = oot0.f25610a;
        this.k = xot0Var;
        this.l = map;
        this.m = crdVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.m;
        switch (b) {
            case 0:
                return new xg0((eh0) this.k, (vh0) this.l, (q91) obj, yjeVar, (byte) 0);
            case 1:
                return new xg0((qv2) this.k, this.l, (ydr) obj, yjeVar, (byte) 1);
            case 2:
                return new xg0((rv2) this.k, this.l, (ydr) obj, yjeVar, (byte) 2);
            case 3:
                return new xg0((tdg0) this.k, (spg0) this.l, (String) obj, yjeVar, (byte) 3);
            case 4:
                return new xg0((i3t0) obj, yjeVar, (byte) 4);
            case 5:
                return new xg0((kd7) this.k, (a5w) this.l, (ql5) obj, yjeVar, (byte) 5);
            case 6:
                return new xg0((cu) this.k, (sip) this.l, (jo20) obj, yjeVar, (byte) 6);
            case 7:
                return new xg0((i3t0) obj, yjeVar, (byte) 7);
            case 8:
                return new xg0((atk) this.k, (npn) this.l, (xah) obj, yjeVar, (byte) 8);
            case 9:
                return new xg0((nr) this.k, (sip) this.l, (jo20) obj, yjeVar, (byte) 9);
            case 10:
                return new xg0((nnp) this.k, (ygs) this.l, (imp) obj, yjeVar, (byte) 10);
            case 11:
                return new xg0((nnp) this.k, (ygs) this.l, (jmp) obj, yjeVar, (byte) 11);
            case 12:
                return new xg0((a6u) this.k, (sip) this.l, (jo20) obj, yjeVar, (byte) 12);
            case 13:
                return new xg0((ukw) this.k, (npn) this.l, (xah) obj, yjeVar, (byte) 13);
            case 14:
                return new xg0((ieu) this.k, (rh6) this.l, (List) obj, yjeVar, (byte) 14);
            case 15:
                return new xg0((i3t0) obj, yjeVar, (byte) 15);
            case 16:
                return new xg0((i3t0) obj, yjeVar, (byte) 16);
            case 17:
                return new xg0((nn20) this.k, (m97) this.l, (m97) obj, yjeVar, (byte) 17);
            case 18:
                return new xg0((mz80) this.k, (dhs0) this.l, (Function2) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new xg0((mk50) this.l, (w3m0) obj, yjeVar);
            case 20:
                return new xg0((ouu) this.k, (sip) this.l, (jo20) obj, yjeVar, (byte) 20);
            case 21:
                xot0 xot0Var = (xot0) this.k;
                oot0 oot0Var = oot0.f25610a;
                return new xg0(xot0Var, (Map) this.l, (crd) obj, yjeVar);
            case 22:
                return new xg0((xot0) this.k, (hx9) this.l, (Map) obj, yjeVar, (byte) 22);
            default:
                nru0 nru0Var = (nru0) this.k;
                bek bekVar = sip.f32274a;
                return new xg0(nru0Var, (CyberGamesPage.Virtual) this.l, (jo20) obj, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
        }
        return ((xg0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x0311 A[LOOP:3: B:139:0x0308->B:141:0x0311, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:411:0x031b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [a.wne] */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        File databasePath;
        String absolutePath;
        v88 v88Var;
        Object objG;
        i1w0 i1w0Var;
        Object objK;
        sff0 sff0VarA;
        Object objC;
        List list;
        Object value;
        Object objX;
        Object objM;
        Object objA;
        v88 v88Var2;
        Object objG2;
        i1w0 i1w0Var2;
        v88 v88Var3;
        Object objG3;
        i1w0 i1w0Var3;
        Object objQ0;
        Object objB;
        u0m0 u0m0Var;
        FragmentScreen cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
        i1w0 i1w0Var4;
        CopyOnWriteArrayList copyOnWriteArrayListQ;
        ListIterator listIteratorO;
        paw pawVar;
        Object objF;
        Object objA2;
        ?? arrayList;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        f5h f5hVar;
        e2g e2gVar;
        byte b = this.i;
        int i = 10;
        boolean z = false;
        z = false;
        z = false;
        Object obj2 = this.m;
        ?? r11 = 0;
        ?? r12 = 0;
        ?? r13 = 0;
        switch (b) {
            case 0:
                vh0 vh0Var = (vh0) this.l;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    eh0 eh0Var = (eh0) this.k;
                    mlr mlrVar = new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200);
                    long j = vh0Var.g;
                    String str = vh0Var.b;
                    this.j = true;
                    if (eh0Var.S(mlr.a(mlrVar, j, vh0Var.h, 0L, str, vh0Var.i, vh0Var.j, false, 255964), eh0.O(vh0Var.f37408a), vh0Var.f37408a, "banner_spec", (q91) obj2, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                qv2 qv2Var = (qv2) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    qv2Var.x(this.l);
                    iv2 iv2Var = new iv2(qv2Var, (byte) 3);
                    y51 y51Var = new y51(obj2, (Object) qv2Var, (yje) (r11 == true ? 1 : 0), (byte) 24);
                    this.j = true;
                    if (s5x0.P(iv2Var, y51Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                Object obj3 = this.l;
                rv2 rv2Var = (rv2) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ((hgk0) rv2Var.h).setValue(obj3);
                    st2 st2Var = new st2(rv2Var, (byte) 6);
                    y51 y51Var2 = new y51(obj2, (Object) rv2Var, (yje) (r12 == true ? 1 : 0), (byte) 25);
                    this.j = true;
                    if (dv2.e(st2Var, y51Var2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                xd2 xd2Var = rv2Var.f31150a;
                rv2Var.j.a(rv2Var.d().d(obj3), rv2Var.g.l());
                ((hgk0) rv2Var.d).setValue(obj3);
                ((hgk0) rv2Var.c).setValue(obj3);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (z5) {
                    if (z5) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                tdg0 tdg0Var = (tdg0) this.k;
                spg0 spg0Var = (spg0) this.l;
                String str2 = (String) obj2;
                this.j = true;
                if (!str2.equals(":memory:") && (databasePath = ((us00) tdg0Var.c.h).getDatabasePath(str2)) != null && (absolutePath = databasePath.getAbsolutePath()) != null) {
                    str2 = absolutePath;
                }
                if (!tdg0Var.f33768a && !tdg0Var.b && !str2.equals(":memory:")) {
                    z = true;
                }
                yjo yjoVar = new yjo(str2, z);
                Object objH0 = vdx.h0(yjoVar.f42750a, new e26(yjoVar, new hie0(), null, tdg0Var, spg0Var, str2, str2), this);
                return objH0 == wneVar4 ? wneVar4 : objH0;
            case 4:
                dt6 dt6Var = (dt6) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    v88Var = dt6Var.I;
                    i1w0 i1w0Var5 = dt6Var.W;
                    khf0 khf0Var = dt6Var.B;
                    bm5 bm5Var = bm5.k;
                    this.k = v88Var;
                    this.l = i1w0Var5;
                    this.j = true;
                    objG = khf0.G(khf0Var, bm5Var, this);
                    if (objG == wneVar5) {
                        return wneVar5;
                    }
                    i1w0Var = i1w0Var5;
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var = (i1w0) this.l;
                    v88Var = (v88) this.k;
                    z1x.P(obj);
                    objG = obj;
                }
                ql5 ql5Var = (ql5) objG;
                dt6Var.D.l(bm5.k, ql5Var);
                v88.b(v88Var, i1w0Var, ql5Var.f28916a, 2);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    kd7 kd7Var = (kd7) this.k;
                    xw30 xw30Var = kd7Var.d0;
                    fv30 fv30Var = new fv30((a5w) this.l, (ql5) obj2, kd7Var.p.f46385a);
                    this.j = true;
                    xw30Var.getClass();
                    if (xw30Var.a(fv30Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    this.j = true;
                    objK = ((bbw0) ((cu) this.k).c).k((sip) this.l, (jo20) obj2, this);
                    if (objK == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((Iterable) objK).iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList2, d5c.c0((g4t) it.next()));
                }
                return arrayList2;
            case 7:
                dch dchVar = (dch) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    sff0VarA = dchVar.v.a();
                    List listA = dchVar.y.f20692a.a();
                    j3c j3cVar = dchVar.z;
                    this.k = sff0VarA;
                    this.l = listA;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar8) {
                        return wneVar8;
                    }
                    list = listA;
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = (List) this.l;
                    sff0VarA = (sff0) this.k;
                    z1x.P(obj);
                    objC = obj;
                    list = list2;
                }
                wcb wcbVar = (wcb) objC;
                boolean zJ = dchVar.x.j();
                p7m0 p7m0Var = dchVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ubh.a((ubh) value, null, false, null, null, zJ, sff0VarA.J, sff0VarA.g.y, list, wcbVar, 15)));
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    atk atkVar = (atk) this.k;
                    npn npnVar = (npn) this.l;
                    boolean z11 = ((xah) obj2).m;
                    this.j = true;
                    int i2 = atk.J;
                    if (atkVar.W(npnVar, z11, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z12 = this.j;
                if (z12) {
                    if (z12) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                this.j = true;
                Serializable serializableM = ((nr) this.k).m(jCurrentTimeMillis, this, (sip) this.l, (jo20) obj2);
                return serializableM == wneVar10 ? wneVar10 : serializableM;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    nnp nnpVar = (nnp) this.k;
                    ygs ygsVar = (ygs) this.l;
                    imp impVar = (imp) obj2;
                    long j2 = impVar.c;
                    wgl0 wgl0Var = impVar.d;
                    this.j = true;
                    int i3 = nnp.a0;
                    if (wgl0Var.equals(ugl0.f35631a)) {
                        objX = nnpVar.X(ygsVar, this);
                        if (objX != wneVar11) {
                            objX = Unit.f46060a;
                        }
                    } else if (wgl0Var instanceof vgl0) {
                        BetZip betZipN = nnp.N(ygsVar, j2, ((vgl0) wgl0Var).f37387a);
                        if (betZipN == null) {
                            objX = Unit.f46060a;
                        } else {
                            m0k0 m0k0VarX = q0x.X(ygsVar);
                            m97 m97VarG0 = p8a.g0(betZipN, nnpVar.w.f45221a.a(), ygsVar.B);
                            if (nnpVar.H.a().f32117a.g) {
                                objX = nnpVar.M(ygsVar, betZipN, ctc.f4929a, this);
                                if (objX != wneVar11) {
                                    objX = Unit.f46060a;
                                }
                            } else {
                                nnpVar.G(new ump(new pjd(new gs2(), m97VarG0, m0k0VarX)));
                                objX = Unit.f46060a;
                            }
                        }
                    } else {
                        if (!wgl0Var.equals(ugl0.b)) {
                            t9f.b();
                            return null;
                        }
                        objX = nnpVar.X(ygsVar, this);
                        if (objX != wneVar11) {
                            objX = Unit.f46060a;
                        }
                    }
                    if (objX == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    nnp nnpVar2 = (nnp) this.k;
                    ygs ygsVar2 = (ygs) this.l;
                    jmp jmpVar = (jmp) obj2;
                    long j3 = jmpVar.c;
                    xgl0 xgl0Var = jmpVar.d;
                    this.j = true;
                    BetZip betZipN2 = nnp.N(ygsVar2, j3, xgl0Var);
                    if (betZipN2 == null || (objM = nnpVar2.M(ygsVar2, betZipN2, ctc.b, this)) != wneVar12) {
                        objM = Unit.f46060a;
                    }
                    if (objM == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z15 = this.j;
                if (z15) {
                    if (z15) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                this.j = true;
                Object objG4 = ((a6u) this.k).g(jCurrentTimeMillis2, this, (sip) this.l, (jo20) obj2);
                return objG4 == wneVar13 ? wneVar13 : objG4;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    ukw ukwVar = (ukw) this.k;
                    npn npnVar2 = (npn) this.l;
                    boolean z17 = ((xah) obj2).m;
                    this.j = true;
                    int i4 = ukw.X;
                    if (ukwVar.Y(npnVar2, z17, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    ieu ieuVar = (ieu) this.k;
                    rh6 rh6Var = (rh6) this.l;
                    this.j = true;
                    objA = ieuVar.a(rh6Var.f30475a, rh6Var.b, rh6Var.f, rh6Var.g, (List) obj2, this);
                    if (objA == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = ((j0g0) obj).f15681a;
                }
                return new j0g0(objA);
            case 15:
                nn20 nn20Var = (nn20) obj2;
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    v88Var2 = nn20Var.Z;
                    i1w0 i1w0Var6 = nn20Var.Y;
                    khf0 khf0Var2 = nn20Var.s;
                    bm5 bm5Var2 = bm5.b;
                    this.k = v88Var2;
                    this.l = i1w0Var6;
                    this.j = true;
                    objG2 = khf0.G(khf0Var2, bm5Var2, this);
                    if (objG2 == wneVar16) {
                        return wneVar16;
                    }
                    i1w0Var2 = i1w0Var6;
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var2 = (i1w0) this.l;
                    v88Var2 = (v88) this.k;
                    z1x.P(obj);
                    objG2 = obj;
                }
                ql5 ql5Var2 = (ql5) objG2;
                nn20Var.V.a(bm5.b, ql5Var2);
                v88.b(v88Var2, i1w0Var2, ql5Var2.f28916a, 2);
                return Unit.f46060a;
            case 16:
                on20 on20Var = (on20) obj2;
                wne wneVar17 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    v88Var3 = on20Var.K;
                    i1w0 i1w0Var7 = on20Var.J;
                    khf0 khf0Var3 = on20Var.r;
                    bm5 bm5Var3 = bm5.i;
                    this.k = v88Var3;
                    this.l = i1w0Var7;
                    this.j = true;
                    objG3 = khf0.G(khf0Var3, bm5Var3, this);
                    if (objG3 == wneVar17) {
                        return wneVar17;
                    }
                    i1w0Var3 = i1w0Var7;
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var3 = (i1w0) this.l;
                    v88Var3 = (v88) this.k;
                    z1x.P(obj);
                    objG3 = obj;
                }
                ql5 ql5Var3 = (ql5) objG3;
                on20Var.G.a(bm5.i, ql5Var3);
                v88.b(v88Var3, i1w0Var3, ql5Var3.f28916a, 2);
                return Unit.f46060a;
            case 17:
                m97 m97Var = (m97) obj2;
                m97 m97Var2 = (m97) this.l;
                nn20 nn20Var2 = (nn20) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    this.j = true;
                    int i5 = nn20.c1;
                    objQ0 = nn20Var2.q0(m97Var2, this);
                    if (objQ0 == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objQ0 = obj;
                }
                if (((Boolean) objQ0).booleanValue()) {
                    int i6 = nn20.c1;
                    String str3 = m97Var2.m;
                    String str4 = m97Var != null ? m97Var.m : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    czc czcVar = czc.d;
                    j43 j43VarY = nn20.Y(str3, str4, czcVar);
                    String str5 = m97Var2.z;
                    String str6 = m97Var != null ? m97Var.z : null;
                    nn20Var2.H(new rm20(new g680(j43VarY, nn20.Y(str5, str6 != null ? str6 : "", czcVar)), z ? (byte) 1 : (byte) 0));
                } else {
                    k110 k110Var = new k110(nn20Var2, m97Var2, m97Var);
                    int i7 = nn20.c1;
                    nn20Var2.H(k110Var);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    this.j = true;
                    Object objE = ((mz80) this.k).e((dhs0) this.l, (Function2) obj2, this);
                    return objE == wneVar19 ? wneVar19 : objE;
                }
                if (z22) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                w3m0 w3m0Var = (w3m0) obj2;
                wne wneVar20 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    u0m0 u0m0Var2 = (u0m0) CollectionsKt.firstOrNull(((mk50) this.l).l);
                    if (u0m0Var2 == null) {
                        return Unit.f46060a;
                    }
                    lho lhoVar = u0m0Var2.i;
                    if ((lhoVar == lho.GAME_STATUS_LINE || lhoVar == lho.GAME_STATUS_LIVE) && u0m0Var2.k != 0) {
                        h3c h3cVar = w3m0Var.G;
                        long j4 = w3m0Var.p;
                        this.k = u0m0Var2;
                        this.j = true;
                        objB = h3cVar.b(j4, this);
                        if (objB == wneVar20) {
                            return wneVar20;
                        }
                        u0m0Var = u0m0Var2;
                    } else {
                        gr00 gr00Var = w3m0Var.E;
                        CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(u0m0Var2.f34860a, w3m0Var.q, 0, (int) w3m0Var.r, "", "", "", "", -1L, "");
                        gr00Var.getClass();
                        cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1 = new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var);
                    }
                    i1w0Var4 = w3m0Var.u;
                    copyOnWriteArrayListQ = b1j.q(i1w0Var4);
                    if (cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1)));
                    }
                    listIteratorO = b1j.o(i1w0Var4, copyOnWriteArrayListQ, 0);
                    while (true) {
                        pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            return Unit.f46060a;
                        }
                        i1w0Var4.a((oe50) pawVar.next());
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u0m0Var = (u0m0) this.k;
                    z1x.P(obj);
                    objB = obj;
                }
                cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1 = w3m0Var.D.h(new GameScreenGeneralParams(u0m0Var.k, 0L, w3m0Var.p, w3m0Var.q, ((Boolean) objB).booleanValue(), 0L, u0m0Var.i == lho.GAME_STATUS_LIVE, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN));
                i1w0Var4 = w3m0Var.u;
                copyOnWriteArrayListQ = b1j.q(i1w0Var4);
                if (cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1)));
                }
                listIteratorO = b1j.o(i1w0Var4, copyOnWriteArrayListQ, 0);
                while (true) {
                    pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var4.a((oe50) pawVar.next());
                }
                break;
            case 20:
                sip sipVar = (sip) this.l;
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    this.j = true;
                    objF = ((dpi0) ((ouu) this.k).b).f(sipVar, (jo20) obj2, this);
                    if (objF == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                Iterable<f5h> iterable = (Iterable) objF;
                ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                for (f5h f5hVar2 : iterable) {
                    f5hVar2.getClass();
                    arrayList3.add(pzb.E(f5hVar2, sipVar, 0L, 0L));
                }
                return arrayList3;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (z25) {
                    if (z25) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                odd oddVar = xot0.l;
                Object objQ = ((xot0) this.k).q(oot0.b, (Map) this.l, (crd) obj2, this);
                return objQ == wneVar22 ? wneVar22 : objQ;
            case 22:
                xot0 xot0Var = (xot0) this.k;
                wne wneVar23 = wne.f39444a;
                boolean z26 = this.j;
                if (z26) {
                    if (z26) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
                }
                LinkedHashMap linkedHashMap = xot0Var.k;
                oot0 oot0Var = oot0.c;
                odd oddVar2 = xot0.l;
                hx9 hx9Var = (hx9) this.l;
                bbw0 bbw0Var = new bbw0((byte) 16);
                bbw0Var.o(hx9Var);
                linkedHashMap.put(oot0Var, new rot0(bbw0Var, xp20.p((Map) obj2), (onf0) (r13 == true ? 1 : 0), 12));
                rot0 rot0VarO = xot0.o(xot0Var.k);
                this.j = true;
                Object objR = xot0Var.r(rot0VarO, null, this);
                return objR == wneVar23 ? wneVar23 : objR;
            default:
                ?? arrayList4 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    this.j = true;
                    objA2 = ((nru0) this.k).f24023a.a(sip.c, (CyberGamesPage.Virtual) this.l, (jo20) obj2, this);
                    if (objA2 != arrayList4) {
                    }
                    return arrayList4;
                }
                if (!z27) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                Iterable<l7r0> iterable2 = (Iterable) objA2;
                sip sipVar2 = sip.c;
                arrayList4 = new ArrayList(r3d.q(iterable2, 10));
                for (l7r0 l7r0Var : iterable2) {
                    l26 l26Var = l7r0Var.f19574a;
                    l26 l26Var2 = l7r0Var.b;
                    List<f5h> list3 = l7r0Var.c;
                    String str7 = l26Var != null ? l26Var.b : null;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = (list3 == null || (f5hVar = (f5h) CollectionsKt.firstOrNull(list3)) == null || (e2gVar = f5hVar.z) == null) ? null : e2gVar.c;
                    if (str9 == null) {
                        str9 = "";
                    }
                    long jLongValue = -1;
                    if (list3 != null) {
                        arrayList = new ArrayList(r3d.q(list3, i));
                        for (f5h f5hVar3 : list3) {
                            long jLongValue2 = (l26Var == null || (l4 = l26Var.f19293a) == null) ? -1L : l4.longValue();
                            long jLongValue3 = (l26Var2 == null || (l3 = l26Var2.f19293a) == null) ? -1L : l3.longValue();
                            f5hVar3.getClass();
                            arrayList.add(pzb.E(f5hVar3, sipVar2, jLongValue2, jLongValue3));
                        }
                    } else {
                        arrayList = iun.f15405a;
                    }
                    long jLongValue4 = (l26Var == null || (l2 = l26Var.f19293a) == null) ? -1L : l2.longValue();
                    if (l26Var2 != null && (l = l26Var2.f19293a) != null) {
                        jLongValue = l.longValue();
                    }
                    long j5 = jLongValue;
                    StringBuilder sb = new StringBuilder(ujn.h);
                    if (str9.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
                        sb.setLength(0);
                        sb.append(str9);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(str9, '/'));
                    }
                    arrayList4.add(new b4r0(jLongValue4, j5, str8, sb.toString(), arrayList));
                    i = 10;
                }
                return arrayList4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg0(i3t0 i3t0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.m = i3t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(mk50 mk50Var, w3m0 w3m0Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 19;
        this.l = mk50Var;
        this.m = w3m0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(nru0 nru0Var, CyberGamesPage.Virtual virtual, jo20 jo20Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 23;
        bek bekVar = sip.f32274a;
        this.k = nru0Var;
        this.l = virtual;
        this.m = jo20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
