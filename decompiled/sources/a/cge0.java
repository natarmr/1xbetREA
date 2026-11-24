package a;

import android.content.ComponentCallbacks2;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.statistic.stadium.impl.stadium.screen.StadiumScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class cge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4308a;

    public cge0(tqt tqtVar) {
        this.f4308a = (byte) 22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v36, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v19, types: [a.i3t0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.fragment.app.Fragment] */
    public static void b(mm40 mm40Var, Fragment fragment, RelatedParams relatedParams, fet fetVar) {
        odf0 odf0Var;
        String str;
        Object obj;
        Object enmVar;
        ujd ujdVar;
        Fragment fragment2;
        byte b;
        fet fetVar2;
        RelatedParams relatedParams2 = relatedParams;
        mm40Var.getClass();
        fragment.getClass();
        relatedParams2.getClass();
        fetVar.e0(-492467061);
        boolean zG = fetVar.g(fragment);
        Object objP = fetVar.P();
        char c = 2;
        Object obj2 = ukd.f35823a;
        if (zG || objP == obj2) {
            ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
            af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(ydf0.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                if (!(ze3Var instanceof ydf0)) {
                    ze3Var = null;
                }
                ydf0 ydf0Var = (ydf0) ze3Var;
                if (ydf0Var != null) {
                    i1w0 i1w0VarF = a4n0.f(fragment);
                    int iOrdinal = relatedParams2.f.ordinal();
                    if (iOrdinal == 0) {
                        ?? r7 = fragment;
                        while (true) {
                            if (r7 == 0) {
                                jf4.n("Can't find feature provider!");
                                return;
                            } else if (r7 instanceof odf0) {
                                odf0Var = (odf0) r7;
                                break;
                            } else {
                                relatedParams2 = relatedParams;
                                c = c;
                                r7 = r7.y;
                            }
                        }
                    } else if (iOrdinal == 1) {
                        ?? r8 = fragment;
                        while (true) {
                            if (r8 == 0) {
                                jf4.n("Can't find feature provider!");
                                return;
                            } else {
                                if (r8 instanceof odf0) {
                                    odf0Var = (odf0) r8;
                                    break;
                                }
                                r8 = r8.y;
                            }
                        }
                    } else {
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            t9f.b();
                            return;
                        }
                        odf0Var = null;
                    }
                    i1w0VarF.getClass();
                    d1p d1pVar = ydf0Var.u;
                    cad cadVar = ydf0Var.f;
                    pdf0 pdf0VarB = odf0Var != null ? odf0Var.b() : ydf0Var.f42434a;
                    ugf0 ugf0Var = ydf0Var.b;
                    pdf0 pdf0Var = pdf0VarB;
                    itr itrVar = ydf0Var.c;
                    iip iipVar = ydf0Var.d;
                    lsn lsnVar = ydf0Var.v;
                    b3c0 b3c0Var = ydf0Var.i;
                    nr00 nr00Var = ydf0Var.e;
                    vqc vqcVar = ydf0Var.w;
                    btt0 btt0Var = ydf0Var.j;
                    gst0 gst0Var = ydf0Var.k;
                    y78 y78Var = ydf0Var.g;
                    m1e m1eVar = ydf0Var.h;
                    zfo zfoVar = ydf0Var.m;
                    edo edoVar = ydf0Var.n;
                    pru pruVar = ydf0Var.o;
                    lbu lbuVar = ydf0Var.p;
                    ctf0 ctf0Var = ydf0Var.q;
                    b4j b4jVar = ydf0Var.r;
                    uqe uqeVar = ydf0Var.s;
                    sjl0 sjl0Var = ydf0Var.t;
                    rtu rtuVar = ydf0Var.x;
                    ieu ieuVar = ydf0Var.y;
                    bzt bztVar = ydf0Var.l;
                    r9u r9uVar = ydf0Var.z;
                    iipVar.getClass();
                    itrVar.getClass();
                    d1pVar.getClass();
                    b3c0Var.getClass();
                    btt0Var.getClass();
                    gst0Var.getClass();
                    m1eVar.getClass();
                    zfoVar.getClass();
                    edoVar.getClass();
                    ctf0Var.getClass();
                    sjl0Var.getClass();
                    r9uVar.getClass();
                    str = null;
                    obj = obj2;
                    objP = new tri(ugf0Var, pdf0Var, cadVar, itrVar, iipVar, nr00Var, d1pVar, lsnVar, vqcVar, relatedParams2, bztVar, b3c0Var, gst0Var, y78Var, m1eVar, pruVar, lbuVar, ctf0Var, b4jVar, uqeVar, rtuVar, ieuVar, r9uVar);
                    fetVar.o0(objP);
                }
            }
            jf4.n(b1j.i(ydf0.class, "Cannot create dependency "));
            return;
        }
        obj = obj2;
        str = null;
        tri triVar = (tri) objP;
        boolean zG2 = fetVar.g(triVar);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == obj) {
            objP2 = triVar.b.d();
            x1x.x(objP2);
            fetVar.o0(objP2);
        }
        ujd ujdVar2 = (ujd) objP2;
        q0h0 q0h0Var = new q0h0((sri) triVar.x.get());
        sgy sgyVarB = sre0.f32672a.b(hef0.class);
        int i = hef0.C;
        k3t0 k3t0VarX = n4c.X(sgyVarB, str, q0h0Var, fetVar, 14);
        boolean zI = fetVar.i(ujdVar2) | fetVar.i(fragment) | fetVar.g(relatedParams2) | fetVar.i(k3t0VarX);
        Object objP3 = fetVar.P();
        if (zI || objP3 == obj) {
            ujdVar = ujdVar2;
            fragment2 = fragment;
            b = 2;
            fetVar2 = fetVar;
            enmVar = new enm((Object) ujdVar, (Object) fragment2, (Object) relatedParams2, (Object) k3t0VarX, (byte) 27);
            fetVar2.o0(enmVar);
        } else {
            ujdVar = ujdVar2;
            fragment2 = fragment;
            b = 2;
            fetVar2 = fetVar;
            enmVar = objP3;
        }
        m0x0.o(fragment2, (Function1) enmVar, fetVar2);
        Unit unit = Unit.f46060a;
        boolean zI2 = fetVar2.i(k3t0VarX);
        Object objP4 = fetVar2.P();
        if (zI2 || objP4 == obj) {
            objP4 = new w480(k3t0VarX, str, b);
            fetVar2.o0(objP4);
        }
        m0x0.t(fetVar2, unit, (Function2) objP4);
        Object objP5 = fetVar2.P();
        if (objP5 == obj) {
            objP5 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
            fetVar2.o0(objP5);
        }
        vne vneVar = (vne) objP5;
        boolean zI3 = fetVar2.i(ujdVar) | fetVar2.i(fragment2) | fetVar2.i(k3t0VarX);
        Object objP6 = fetVar2.P();
        if (zI3 || objP6 == obj) {
            objP6 = new cbh(ujdVar, fragment2, k3t0VarX, b);
            fetVar2.o0(objP6);
        }
        Function1 function1 = (Function1) objP6;
        boolean zI4 = fetVar2.i(vneVar) | fetVar2.i(k3t0VarX) | fetVar2.g(function1) | fetVar2.g(str);
        Object objP7 = fetVar2.P();
        if (zI4 || objP7 == obj) {
            objP7 = new ggc0(vneVar, k3t0VarX, function1, (byte) 5);
            fetVar2.o0(objP7);
        }
        m0x0.o(unit, (Function1) objP7, fetVar2);
        boolean zI5 = fetVar2.i(k3t0VarX);
        Object objP8 = fetVar2.P();
        if (zI5 || objP8 == obj) {
            objP8 = new dbh(k3t0VarX, (byte) 18);
            fetVar2.o0(objP8);
        }
        Function0 function0 = (Function0) objP8;
        boolean zI6 = fetVar2.i(k3t0VarX);
        Object objP9 = fetVar2.P();
        if (zI6 || objP9 == obj) {
            objP9 = new dbh(k3t0VarX, (byte) 19);
            fetVar2.o0(objP9);
        }
        ?? r3 = fetVar2;
        v3c.A(function0, (Function0) objP9, null, r3, 0, 4);
        ?? r4 = (i3t0) k3t0VarX;
        def0 def0Var = (def0) r4.y(r3).getValue();
        boolean zI7 = r3.i(r4);
        Object objP10 = r3.P();
        if (zI7 || objP10 == obj) {
            qye0 qye0Var = new qye0(1, r4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
            r3.o0(qye0Var);
            objP10 = qye0Var;
        }
        o2e.M(mm40Var, def0Var, (Function1) ((jhy) objP10), r3, 0);
        r3.r(false);
    }

    public static tnk0 c(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? tnk0.e : f(view.getVisibility());
    }

    public static tnk0 f(int i) {
        if (i == 0) {
            return tnk0.c;
        }
        if (i == 4) {
            return tnk0.e;
        }
        if (i == 8) {
            return tnk0.d;
        }
        jf4.o(twn.m(i, "Unknown visibility "));
        return null;
    }

    public static StadiumScreen g(String str, long j, boolean z) {
        return new StadiumScreen(str, j, z ? R.string.statistic_home_arena : R.string.statistic_arena);
    }

    public static aue0 h(Integer num) {
        Object next;
        c0o c0oVar = aue0.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!Intrinsics.d(((aue0) next).f1475a, num));
        aue0 aue0Var = (aue0) next;
        return aue0Var == null ? aue0.c : aue0Var;
    }

    public static mrh0 i(int i) {
        if (i == 0) {
            return mrh0.b;
        }
        if (i == 1) {
            return mrh0.c;
        }
        if (i == 2) {
            return mrh0.d;
        }
        if (i != 3) {
            return i != 4 ? mrh0.b : mrh0.f;
        }
        return mrh0.e;
    }

    public void a(mm40 mm40Var, Fragment fragment, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(-1318611308);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(fragment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(c8f0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof c8f0)) {
                        ze3Var = null;
                    }
                    c8f0 c8f0Var = (c8f0) ze3Var;
                    if (c8f0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(fragment);
                        i1w0VarF.getClass();
                        cad cadVar = c8f0Var.f3911a;
                        nr00 nr00Var = c8f0Var.c;
                        ctf0 ctf0Var = c8f0Var.d;
                        knf0 knf0Var = c8f0Var.e;
                        gii0 gii0Var = c8f0Var.f;
                        pru pruVar = c8f0Var.g;
                        je jeVar = c8f0Var.h;
                        s64 s64Var = c8f0Var.i;
                        kt2 kt2Var = c8f0Var.j;
                        bzt bztVar = c8f0Var.k;
                        rqt rqtVarF = c8f0Var.b.f();
                        dmt dmtVar = c8f0Var.l;
                        ctf0Var.getClass();
                        knf0Var.getClass();
                        gii0Var.getClass();
                        kt2Var.getClass();
                        objP = new nri(cadVar, nr00Var, ctf0Var, i1w0VarF, pruVar, jeVar, s64Var, kt2Var, bztVar, rqtVarF, dmtVar);
                        fetVar.o0(objP);
                    }
                }
                jf4.n(b1j.i(c8f0.class, "Cannot create dependency "));
                return;
            }
            sgy sgyVarB = sre0.f32672a.b(b8f0.class);
            q0h0 q0h0Var = new q0h0((mri) ((nri) objP).l.get());
            int i3 = b8f0.u;
            i3t0 i3t0Var = (i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            pz40 pz40VarY = i3t0Var.y(fetVar);
            boolean z = ((z7f0) pz40VarY.getValue()).f43917a;
            String str = ((z7f0) pz40VarY.getValue()).b;
            v7f0 v7f0Var = ((z7f0) pz40VarY.getValue()).c;
            boolean zI = fetVar.i(i3t0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new vi6(i3t0Var, (byte) 12);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(i3t0Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                objP3 = new ui6(i3t0Var, (byte) 10);
                fetVar.o0(objP3);
            }
            p8a.D(mm40Var, z, str, v7f0Var, function1, (Function0) objP3, fetVar, i2 & 14);
            boolean zI3 = ((i2 & 896) == 256) | fetVar.i(i3t0Var);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == obj) {
                objP4 = new xwe0(function0, i3t0Var, (byte) 19);
                fetVar.o0(objP4);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar);
            boolean zI4 = fetVar.i(i3t0Var) | fetVar.i(fragment) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP5 = fetVar.P();
            if (zI4 || objP5 == obj) {
                Object ta4Var = new ta4(i3t0Var, fragment, pz40VarF, null, (byte) 3);
                fetVar.o0(ta4Var);
                objP5 = ta4Var;
            }
            m0x0.t(fetVar, fragment, (Function2) objP5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(this, mm40Var, fragment, function0, i);
        }
    }

    public wsy d(o8y o8yVar, kp9 kp9Var, boolean z, f7u f7uVar, x83 x83Var, pys0 pys0Var, boolean z2, Function1 function1) {
        huj0 huj0Var = new huj0(kp9Var, z, f7uVar, x83Var, false);
        wsy wsyVar = (wsy) function1.invoke(o8yVar);
        Collection collectionK = o8yVar.k();
        collectionK.getClass();
        Collection<mp9> collection = collectionK;
        ArrayList arrayList = new ArrayList(r3d.q(collection, 10));
        for (mp9 mp9Var : collection) {
            mp9Var.getClass();
            arrayList.add((wsy) function1.invoke(mp9Var));
        }
        return (wsy) tqt.b(wsyVar.j0(), huj0Var.L(wsyVar, arrayList, pys0Var, z2), 0, huj0Var.p).c;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0296  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [a.kp9] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r24v0, types: [a.cge0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.kp9, a.mp9, a.vjj] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.o8y] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38 */
    public ArrayList e(f7u f7uVar, Collection collection) {
        g93 annotations;
        wsy type;
        ksb0 ksb0Var;
        Pair pair;
        int i;
        List list;
        g0d0 g0d0Var;
        b180 b180Var = b180.Z;
        f7uVar.getClass();
        collection.getClass();
        Collection<??> collection2 = collection;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(r3d.q(collection2, 10));
        for (?? A0 : collection2) {
            if (!(A0 instanceof o8y)) {
                i = i2;
            } else if (A0.l() == 2 && A0.o1().k().size() == 1) {
                i = 10;
            } else {
                foc focVarB0 = feb.b0(A0);
                if (focVarB0 == null) {
                    annotations = ((p4) A0).getAnnotations();
                } else {
                    l9z l9zVar = focVarB0 instanceof l9z ? (l9z) focVarB0 : null;
                    List list2 = l9zVar != null ? (List) l9zVar.k.getValue() : null;
                    if (list2 == null || list2.isEmpty()) {
                        annotations = ((p4) A0).getAnnotations();
                    } else {
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, i2));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new i9z(f7uVar, (cqe0) it.next(), true));
                        }
                        ArrayList arrayListO0 = CollectionsKt.o0(((p4) A0).getAnnotations(), arrayList2);
                        annotations = arrayListO0.isEmpty() ? ujn.c : new i93(arrayListO0, (byte) 0);
                    }
                }
                f7u f7uVarI = f7k.I(f7uVar, annotations);
                ?? r12 = (!(A0 instanceof x9y) || (g0d0Var = ((f0d0) A0).x) == null || g0d0Var.f) ? A0 : g0d0Var;
                if (A0.F() != null) {
                    mer merVar = r12 instanceof mer ? (mer) r12 : null;
                    k3u0 k3u0Var = merVar != null ? (k3u0) merVar.u(u9y.h1) : null;
                    type = d((o8y) A0, k3u0Var, false, k3u0Var != null ? f7k.I(f7uVarI, k3u0Var.getAnnotations()) : f7uVarI, x83.VALUE_PARAMETER, null, false, b180.A);
                } else {
                    type = null;
                }
                u9y u9yVar = A0 instanceof u9y ? (u9y) A0 : null;
                if (u9yVar != null) {
                    vjj vjjVarJ = u9yVar.j();
                    vjjVarJ.getClass();
                    wm40 wm40Var = (wm40) vjjVarJ;
                    String strW = m7x.w(u9yVar, 3);
                    String str = bay.f2281a;
                    qlc qlcVarH = bay.h(rek.g(wm40Var).f32934a);
                    ksb0Var = (ksb0) jsb0.d.get((qlcVarH != null ? rey.b(qlcVarH) : lmc.F(wm40Var, hfk0.f)) + '.' + strW);
                    if (ksb0Var != null) {
                        String str2 = ksb0Var.c;
                        if (str2 != null && !kotlin.text.c.x(str2, "2.", false)) {
                            jf4.n("Check failed.");
                            return null;
                        }
                        if (str2 != null) {
                            ksb0Var = ksb0Var.d;
                        }
                    } else {
                        ksb0Var = null;
                    }
                } else {
                    ksb0Var = null;
                }
                if (ksb0Var != null) {
                    ksb0Var.b.size();
                    ((u9y) A0).z().size();
                }
                boolean z = ((w0) ((cgx0) ((v7i) f7uVar.b).b).d).invoke(v9y.f37057a) == zlf0.STRICT && (A0 instanceof mer) && Intrinsics.d(A0.u(u9y.i1), Boolean.TRUE);
                List<k3u0> listZ = r12.z();
                listZ.getClass();
                ArrayList arrayList3 = new ArrayList(r3d.q(listZ, i2));
                for (k3u0 k3u0Var2 : listZ) {
                    arrayList3.add(d((o8y) A0, k3u0Var2, false, k3u0Var2 != null ? f7k.I(f7uVarI, k3u0Var2.getAnnotations()) : f7uVarI, x83.VALUE_PARAMETER, (ksb0Var == null || (list = ksb0Var.b) == null) ? null : (pys0) CollectionsKt.W(k3u0Var2.g, list), z, new caz(k3u0Var2, (byte) 17)));
                }
                d0d0 d0d0Var = A0 instanceof d0d0 ? (d0d0) A0 : null;
                o8y o8yVar = (o8y) A0;
                wsy wsyVarD = d(o8yVar, r12, true, f7uVarI, (d0d0Var == null || !gfx.J(d0d0Var)) ? x83.METHOD_RETURN_TYPE : x83.FIELD, ksb0Var != null ? ksb0Var.f18806a : null, false, b180.B);
                wsy returnType = A0.getReturnType();
                returnType.getClass();
                if (e0t0.c(returnType, b180Var, null)) {
                    pair = new Pair(y0x0.h, new mbk());
                } else {
                    c8z c8zVarF = A0.F();
                    if (c8zVarF != null ? e0t0.c(c8zVarF.getType(), b180Var, null) : false) {
                        pair = new Pair(y0x0.h, new mbk());
                    } else {
                        List listZ2 = A0.z();
                        listZ2.getClass();
                        if (!listZ2.isEmpty()) {
                            Iterator it2 = listZ2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    wsy type2 = ((k3u0) it2.next()).getType();
                                    type2.getClass();
                                    if (e0t0.c(type2, b180Var, null)) {
                                        pair = new Pair(y0x0.h, new mbk());
                                    }
                                }
                            }
                        }
                        pair = null;
                    }
                }
                if (type == null && wsyVarD == null) {
                    if (!arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((wsy) it3.next()) != null) {
                                }
                            } else if (pair != null) {
                                i = 10;
                            }
                        }
                    } else if (pair != null) {
                        i = 10;
                    }
                }
                if (type == null) {
                    c8z c8zVarF2 = A0.F();
                    type = c8zVarF2 != null ? c8zVarF2.getType() : null;
                }
                i = 10;
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                int i3 = 0;
                for (Object obj : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    wsy type3 = (wsy) obj;
                    if (type3 == null) {
                        type3 = ((k3u0) A0.z().get(i3)).getType();
                        type3.getClass();
                    }
                    arrayList4.add(type3);
                    i3 = i4;
                }
                if (wsyVarD == null) {
                    wsyVarD = A0.getReturnType();
                    wsyVarD.getClass();
                }
                A0 = o8yVar.a0(type, arrayList4, wsyVarD, pair);
            }
            arrayList.add(A0);
            i2 = i;
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f4308a) {
            case 13:
                String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                string.getClass();
                return b1j.k("CreationExtras.Key@", string, Separators.LESS_THAN, sre0.f32672a.b(Bundle.class).J(), Separators.GREATER_THAN);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ cge0(byte b) {
        this.f4308a = b;
    }
}
