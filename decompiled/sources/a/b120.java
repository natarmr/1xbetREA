package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b120 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1787a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b120(db30 db30Var) {
        this.f1787a = (byte) 15;
        this.b = db30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object pcVar;
        clz clzVar;
        byte b = this.f1787a;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        byte b3 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                l800 l800Var = (l800) obj3;
                v020 v020Var = (v020) obj2;
                return v020.a(v020Var, false, false, 0L, false, 0, null, null, null, null, null, null, null, na00.a(v020Var.o, l800Var, 0, 0L, 0L, false, false, 0L, 462), null, null, null, null, null, null, null, 8372223);
            case 1:
                xqj0 xqj0Var = (xqj0) obj3;
                v020 v020Var2 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var2.getClass();
                return v020.a(v020Var2, false, false, 0L, false, 0, xqj0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388479);
            case 2:
                mh20 mh20Var = ((k820) obj3).d;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                rek0 rek0Var = rek0.b;
                th.getClass();
                str.getClass();
                if ((th instanceof zhi0) && CollectionsKt.L(k820.e, ((zhi0) th).c)) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mh20Var.invoke(new zb20(new xdk0(rek0Var, message, null, null, null, null, 124)));
                    mh20Var.invoke(eb20.f7499a);
                } else {
                    mh20Var.invoke(new zb20(new xdk0(rek0Var, str, null, null, null, null, 124)));
                }
                return Unit.f46060a;
            case 3:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                return a820.a(a820Var, txe.a(a820Var.b, 0L, 0, new fao0((en7) obj3), null, null, false, null, 123), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
            case 4:
                l520 l520Var = (l520) obj3;
                a820 a820Var2 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var2.getClass();
                return a820.a(a820Var2, null, null, null, null, null, null, null, false, null, a820Var2.i ? ((c420) l520Var).f3705a : 0.0f, false, null, 0, false, false, false, 261119);
            case 5:
                jye jyeVar = (jye) obj3;
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                ly6 ly6Var = b820Var.f2138a;
                htv htvVar = ly6Var.b;
                boolean z = htvVar.f13653a;
                boolean z2 = htvVar.b;
                String str2 = htvVar.c;
                int i = htvVar.d;
                String str3 = htvVar.e;
                str2.getClass();
                str3.getClass();
                return b820.a(b820Var, ly6.a(ly6Var, new htv(z, z2, str2, i, str3, jyeVar), null, null, null, 125), null, null, null, null, null, null, false, false, false, false, false, 8190);
            case 6:
                q4f q4fVar = (q4f) obj3;
                a820 a820Var3 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var3.getClass();
                pvj0 pvj0Var = a820Var3.e;
                bx6 bx6Var = pvj0Var.f27665a;
                return a820.a(a820Var3, null, null, null, pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(bx6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, q4fVar != q4f.h, false, false, false, false, false, 65023), false, 5), null, null, null, null, false, 62), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 7:
                a820 a820Var4 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var4.getClass();
                xm5 xm5Var = a820Var4.d;
                return a820.a(a820Var4, null, null, xm5.a(xm5Var, null, false, null, new h40(xm5Var.d.f12411a, (f40) obj3), 7), null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262135);
            case 8:
                hnd0 hnd0Var = (hnd0) obj3;
                a820 a820Var5 = (a820) obj2;
                pvj0 pvj0Var2 = a820Var5.e;
                return a820.a(a820Var5, null, null, null, pvj0.a(pvj0Var2, null, null, null, nnd0.a(pvj0Var2.d, false, hnd0Var.b, hnd0Var.c, hnd0Var.d, true, 33), null, false, 55), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 9:
                a820 a820Var6 = (a820) obj2;
                return a820.a(a820Var6, null, null, xm5.a(a820Var6.d, null, false, null, new h40(((a40) obj3).f198a, f40.d), 7), null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262135);
            case 10:
                aq20 aq20Var = (aq20) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                    zcl zclVar = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarN = s5x0.N(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.e0(-2117399130);
                    Iterator<E> it = aq20Var.f1277a.iterator();
                    while (it.hasNext()) {
                        cfx0.p((jp20) it.next(), fetVar, 0);
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 11:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                byte b4 = 1;
                function1.invoke(new c830((l830) obj3, b4));
                function2.invoke(new n230(b4));
                return Unit.f46060a;
            case 12:
                View view = (View) obj;
                View view2 = (View) obj2;
                int i2 = MatchInfoContainerView.t1;
                view.getClass();
                view2.getClass();
                ((MatchInfoContainerView) obj3).D(view, view2, null);
                return Unit.f46060a;
            case 13:
                a8z a8zVar = ((yb30) obj3).P1;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                htz htzVar = yb30.R1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar2);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar2.i(k3t0Var);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        du20 du20Var = new du20(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                        fetVar2.o0(du20Var);
                        objP = du20Var;
                    }
                    aad.s(pz40VarY, (Function1) ((jhy) objP), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 14:
                a8z a8zVar2 = ((zc30) obj3).P1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                uuz uuzVar = zc30.R1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar3);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI2 = fetVar3.i(k3t0Var2);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == cl5Var) {
                        du20 du20Var2 = new du20(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar3.o0(du20Var2);
                        objP2 = du20Var2;
                    }
                    azw.j(pz40VarY2, (Function1) ((jhy) objP2), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 15:
                db30 db30Var = (db30) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar4, 54);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarD2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    if (db30Var instanceof za30) {
                        fetVar4.e0(-1855515853);
                        ucx.q((za30) db30Var, fetVar4, 6);
                        fetVar4.r(false);
                    } else if (db30Var instanceof ab30) {
                        fetVar4.e0(-1855513420);
                        ucx.t((ab30) db30Var, fetVar4, 0);
                        fetVar4.r(false);
                    } else if (db30Var instanceof bb30) {
                        fetVar4.e0(-1855510923);
                        ucx.Q((bb30) db30Var, fetVar4, 6);
                        fetVar4.r(false);
                    } else {
                        if (!(db30Var instanceof cb30)) {
                            throw b1j.f(-1855517844, fetVar4, false);
                        }
                        fetVar4.e0(-1855508527);
                        ucx.R((cb30) db30Var, fetVar4, 6);
                        fetVar4.r(false);
                    }
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ucx.t((ab30) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                ucx.R((cb30) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                ucx.Q((bb30) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                ucx.q((za30) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 20:
                bz30 bz30Var = (bz30) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                wsz wszVar = bz30.P1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k3t0 k3t0VarH0 = bz30Var.H0();
                    boolean zI3 = fetVar5.i(bz30Var);
                    Object objP3 = fetVar5.P();
                    if (zI3 || objP3 == cl5Var) {
                        du20 du20Var3 = new du20(1, bz30Var, bz30.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/main_menu/impl/presentation/menu/models/MenuSideEffect;)V", 0, (byte) 28);
                        fetVar5.o0(du20Var3);
                        objP3 = du20Var3;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP3), fetVar5);
                    boolean zI4 = fetVar5.i(k3t0VarH0) | fetVar5.i(bz30Var) | fetVar5.e(3) | fetVar5.g(pz40VarF);
                    Object objP4 = fetVar5.P();
                    if (zI4 || objP4 == cl5Var) {
                        p000 p000Var = new p000(k3t0VarH0, bz30Var, pz40VarF, null, (byte) 10);
                        fetVar5.o0(p000Var);
                        objP4 = p000Var;
                    }
                    m0x0.t(fetVar5, bz30Var, (Function2) objP4);
                    l240 l240Var = (l240) ((i3t0) bz30Var.H0()).y(fetVar5).getValue();
                    k3t0 k3t0VarH1 = bz30Var.H0();
                    boolean zI5 = fetVar5.i(k3t0VarH1);
                    Object objP5 = fetVar5.P();
                    if (zI5 || objP5 == cl5Var) {
                        du20 du20Var4 = new du20(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar5.o0(du20Var4);
                        objP5 = du20Var4;
                    }
                    p8a.y(null, l240Var, (Function1) ((jhy) objP5), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 21:
                iz30 iz30Var = (iz30) obj3;
                d140 d140Var = (d140) obj2;
                ((oyg0) obj).getClass();
                d140Var.getClass();
                List list = d140Var.x;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((iz30) obj4) != iz30Var) {
                        arrayList.add(obj4);
                    }
                }
                return d140.a(d140Var, false, false, false, null, null, null, null, null, null, false, false, null, false, null, null, null, null, arrayList, null, 1040187391);
            case 22:
                r040 r040Var = (r040) obj3;
                oyg0 oyg0Var = (oyg0) obj;
                d140 d140Var2 = (d140) obj2;
                oyg0Var.getClass();
                d140Var2.getClass();
                LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(d140Var2.r);
                if (linkedHashSetO0.contains(r040Var)) {
                    linkedHashSetO0.remove(r040Var);
                } else {
                    linkedHashSetO0.add(r040Var);
                }
                Set setP0 = CollectionsKt.P0(linkedHashSetO0);
                q7x.F(oyg0Var, setP0, "EXPANDED_SECTIONS");
                return d140.a(d140Var2, false, false, false, null, null, null, null, null, null, false, false, null, false, null, setP0, null, null, null, null, 1073479679);
            case 23:
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                ((j340) obj3).G(new y040(str4));
                return Unit.f46060a;
            case 24:
                f840 f840Var = (f840) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                atz atzVar = f840.O1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    k3t0 k3t0VarH2 = f840Var.H0();
                    boolean zI6 = fetVar6.i(f840Var);
                    Object objP6 = fetVar6.P();
                    if (zI6 || objP6 == cl5Var) {
                        f340 f340Var = new f340(1, f840Var, f840.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/messages/presentation/fragments/messages/models/MessagesSideEffect;)V", 0, (byte) 6);
                        fetVar6.o0(f340Var);
                        objP6 = f340Var;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar6);
                    boolean zI7 = fetVar6.i(k3t0VarH2) | fetVar6.i(f840Var) | fetVar6.e(3) | fetVar6.g(pz40VarF2);
                    Object objP7 = fetVar6.P();
                    if (zI7 || objP7 == cl5Var) {
                        p000 p000Var2 = new p000(k3t0VarH2, f840Var, pz40VarF2, null, (byte) 11);
                        fetVar6.o0(p000Var2);
                        objP7 = p000Var2;
                    }
                    m0x0.t(fetVar6, f840Var, (Function2) objP7);
                    pz40 pz40VarY3 = ((i3t0) f840Var.H0()).y(fetVar6);
                    mm40 mm40VarQ = i120.Q(yyw.X(jm40Var, null, fetVar6, 1), ((ThemeColors) fetVar6.k(zaq0.b)).getBackground(), jd8.n);
                    k3t0 k3t0VarH3 = f840Var.H0();
                    boolean zI8 = fetVar6.i(k3t0VarH3);
                    Object objP8 = fetVar6.P();
                    if (zI8 || objP8 == cl5Var) {
                        f340 f340Var2 = new f340(1, k3t0VarH3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar6.o0(f340Var2);
                        objP8 = f340Var2;
                    }
                    q8a.v(0, fetVar6, mm40VarQ, pz40VarY3, (Function1) ((jhy) objP8));
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                m940 m940Var = (m940) obj3;
                Throwable th2 = (Throwable) obj;
                String strA = (String) obj2;
                th2.getClass();
                strA.getClass();
                if (!(th2 instanceof zhi0)) {
                    strA = m940Var.z.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                }
                m940Var.G(new y840(strA));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                c3x.f((ba40) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qa40 qa40Var = (qa40) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarD3, 0.0f, 8.0f, 0.0f, 12.0f, 5);
                    thg0 thg0VarA2 = shg0.a(uc9.e, gqw0.k, fetVar7, 54);
                    int iHashCode3 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM3 = fetVar7.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar7, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC2, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    pa40 pa40Var = qa40Var.c;
                    pa40 pa40Var2 = qa40Var.d;
                    byte b5 = qa40Var.e;
                    b5x.k(x7zVar, pa40Var, fetVar7, 0);
                    if (b5 > 0) {
                        fetVar7.e0(1609722635);
                        p8n.b(jm40Var2, new x8n(new t8n(((ThemeColors) fetVar7.k(zaq0.b)).getPrimary()), b5, pa40Var.d), qa40Var.f, fetVar7, 6, 0);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(1610201213);
                        fetVar7.r(false);
                    }
                    n4c.l(s5x0.L(jm40Var2, 4.0f, 0.0f, 2), new kpm(opm.f25648a, new hpm(0L, 3), d5c.O(pa40Var.c, pa40Var2.c, false, false, new hpm(0L, 3))), qa40Var.f, fetVar7, 0);
                    if (b5 > 0) {
                        fetVar7.e0(1611017257);
                        p8n.b(jm40Var2, new x8n(new u8n(((ThemeColors) fetVar7.k(zaq0.b)).getPrimary()), b5, pa40Var2.d), qa40Var.f, fetVar7, 6, 0);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(1611497757);
                        fetVar7.r(false);
                    }
                    if (1.0f <= 0) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    b5x.k(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), pa40Var2, fetVar7, 0);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lb40 lb40Var = (lb40) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                htz htzVar2 = lb40.P1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zI9 = fetVar8.i(lb40Var);
                    Object objP9 = fetVar8.P();
                    if (zI9 || objP9 == cl5Var) {
                        objP9 = new ib40(lb40Var, b2);
                        fetVar8.o0(objP9);
                    }
                    Function0 function0 = (Function0) objP9;
                    boolean zI10 = fetVar8.i(lb40Var);
                    Object objP10 = fetVar8.P();
                    if (zI10 || objP10 == cl5Var) {
                        objP10 = new ib40(lb40Var, (byte) 3);
                        fetVar8.o0(objP10);
                    }
                    v3c.z(function0, (Function0) objP10, null, fetVar8, 0, 4);
                    pz40 pz40VarY4 = ((i3t0) lb40Var.G0()).y(fetVar8);
                    boolean zI11 = fetVar8.i(lb40Var);
                    Object objP11 = fetVar8.P();
                    if (zI11 || objP11 == cl5Var) {
                        objP11 = new jb40(lb40Var, b3);
                        fetVar8.o0(objP11);
                    }
                    zgc.z(pz40VarY4, (Function1) objP11, fetVar8, 0);
                    k3t0 k3t0VarG0 = lb40Var.G0();
                    boolean zI12 = fetVar8.i(lb40Var);
                    Object objP12 = fetVar8.P();
                    if (zI12 || objP12 == cl5Var) {
                        objP12 = new jb40(lb40Var, b2);
                        fetVar8.o0(objP12);
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) objP12, fetVar8);
                    boolean zI13 = fetVar8.i(k3t0VarG0) | fetVar8.i(lb40Var) | fetVar8.e(3) | fetVar8.g(pz40VarF3);
                    Object objP13 = fetVar8.P();
                    if (zI13 || objP13 == cl5Var) {
                        p000 p000Var3 = new p000(k3t0VarG0, lb40Var, pz40VarF3, null, (byte) 12);
                        fetVar8.o0(p000Var3);
                        objP13 = p000Var3;
                    }
                    m0x0.t(fetVar8, lb40Var, (Function2) objP13);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            default:
                ai40 ai40Var = (ai40) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                atz atzVar2 = ai40.b2;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    gl40 gl40Var = (gl40) ((i3t0) ai40Var.H0()).y(fetVar9).getValue();
                    sek sekVar = ai40Var.M1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar = ai40Var.N1;
                    if (bekVar == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(ai40Var.G0().f46517a, ai40Var.G0().c, ai40Var.G0().e, ai40Var.G0().d, ai40Var.G0().b);
                    xex xexVar = ai40Var.S1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(ai40Var.G0().f46517a, ai40Var.G0().c, ai40Var.G0().b, ai40Var.G0().e, 36L, ai40Var.G0().i, new lq2(), ai40Var.G0().f, ai40.class.getSimpleName());
                    qdz qdzVar = ai40Var.Z1;
                    k3t0 k3t0VarH4 = ai40Var.H0();
                    boolean zI14 = fetVar9.i(k3t0VarH4);
                    Object objP14 = fetVar9.P();
                    if (zI14 || objP14 == cl5Var) {
                        objP14 = new f340(1, k3t0VarH4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar9.o0(objP14);
                    }
                    ucx.p(gl40Var, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, qdzVar, (Function1) ((jhy) objP14), fetVar9, 0);
                    k3t0 k3t0VarH5 = ai40Var.H0();
                    boolean zI15 = fetVar9.i(ai40Var);
                    Object objP15 = fetVar9.P();
                    if (zI15 || objP15 == cl5Var) {
                        objP15 = new yh40(ai40Var, (byte) 0);
                        fetVar9.o0(objP15);
                    }
                    clz clzVar2 = (clz) fetVar9.k(or00.f25714a);
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) objP15, fetVar9);
                    boolean zI16 = fetVar9.i(k3t0VarH5) | fetVar9.i(clzVar2) | fetVar9.e(3) | fetVar9.g(pz40VarF4);
                    Object objP16 = fetVar9.P();
                    if (zI16 || objP16 == cl5Var) {
                        clzVar = clzVar2;
                        pcVar = new pc(k3t0VarH5, clzVar, pz40VarF4, null, (byte) 25);
                        fetVar9.o0(pcVar);
                    } else {
                        pcVar = objP16;
                        clzVar = clzVar2;
                    }
                    m0x0.t(fetVar9, clzVar, (Function2) pcVar);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ b120(Object obj, byte b) {
        this.f1787a = b;
        this.b = obj;
    }

    public /* synthetic */ b120(Object obj, int i, byte b) {
        this.f1787a = b;
        this.b = obj;
    }
}
