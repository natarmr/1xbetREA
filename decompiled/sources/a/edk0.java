package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class edk0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7622a;
    public final /* synthetic */ Object b;

    public /* synthetic */ edk0(Object obj, byte b) {
        this.f7622a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        Object tmj0Var;
        mm40 mm40Var;
        apl0 apl0Var = (apl0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        gle0 gle0Var = apl0.P1;
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            kpl0 kpl0Var = (kpl0) ((i3t0) apl0Var.H0()).y(fetVar).getValue();
            k3t0 k3t0VarH0 = apl0Var.H0();
            boolean zI = fetVar.i(apl0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new xol0(apl0Var, b);
                fetVar.o0(objP);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
            boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(apl0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                mm40Var = null;
                tmj0Var = new tmj0(k3t0VarH0, apl0Var, pz40VarF, null, (byte) 1);
                fetVar.o0(tmj0Var);
            } else {
                tmj0Var = objP2;
                mm40Var = null;
            }
            m0x0.t(fetVar, apl0Var, (Function2) tmj0Var);
            k3t0 k3t0VarH1 = apl0Var.H0();
            boolean zI3 = fetVar.i(k3t0VarH1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                kcl0 kcl0Var = new kcl0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                fetVar.o0(kcl0Var);
                objP3 = kcl0Var;
            }
            j120.D(mm40Var, kpl0Var, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        url0 url0Var = (url0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        cge0 cge0Var = url0.R1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = url0Var.G0();
            boolean zI = fetVar.i(url0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                kcl0 kcl0Var = new kcl0(1, url0Var, url0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/sport_filter/presentation/models/SportsFilterSideEffect;)V", 0, (byte) 3);
                fetVar.o0(kcl0Var);
                objP = kcl0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(url0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                tmj0 tmj0Var = new tmj0(k3t0VarG0, url0Var, pz40VarF, null, (byte) 2);
                fetVar.o0(tmj0Var);
                objP2 = tmj0Var;
            }
            m0x0.t(fetVar, url0Var, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) url0Var.G0()).y(fetVar);
            k3t0 k3t0VarG1 = url0Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                kcl0 kcl0Var2 = new kcl0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                fetVar.o0(kcl0Var2);
                objP3 = kcl0Var2;
            }
            o050.E(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        vsl0 vsl0Var = (vsl0) this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        th.getClass();
        str.getClass();
        th.printStackTrace();
        vsl0Var.G(new jsl0(str));
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        z1x.c((a9x) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        ovl0 ovl0Var = (ovl0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        gne0 gne0Var = ovl0.R1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ovl0Var.G0()).y(fetVar);
            k3t0 k3t0VarG0 = ovl0Var.G0();
            boolean zI = fetVar.i(k3t0VarG0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                kcl0 kcl0Var = new kcl0(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                fetVar.o0(kcl0Var);
                objP = kcl0Var;
            }
            gq80.U(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        hvl0 hvl0Var = (hvl0) this.b;
        txl0 txl0Var = (txl0) obj2;
        ((oyg0) obj).getClass();
        txl0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(txl0Var.d);
        String str = ((gvl0) hvl0Var).f11981a;
        Boolean bool = (Boolean) linkedHashMap.get(str);
        linkedHashMap.put(str, Boolean.valueOf(!(bool != null ? bool.booleanValue() : true)));
        return txl0.a(txl0Var, false, false, null, linkedHashMap, 7);
    }

    private final Object l(Object obj, Object obj2) {
        ryl0 ryl0Var = (ryl0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        zie0 zie0Var = ryl0.U1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ryl0Var.G0()).y(fetVar);
            j2m0 j2m0Var = ryl0Var.L1;
            if (j2m0Var == null) {
                Intrinsics.h("stageTableDelegate");
                throw null;
            }
            k3t0 k3t0VarG0 = ryl0Var.G0();
            boolean zI = fetVar.i(k3t0VarG0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new kcl0(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                fetVar.o0(objP);
            }
            wha0.D(pz40VarY, j2m0Var, (Function1) ((jhy) objP), fetVar, 64);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        x8x.k((o4m0) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2) {
        ubm0 ubm0Var = (ubm0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        y2m0 y2m0Var = ubm0.R1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ubm0Var.G0()).y(fetVar);
            k3t0 k3t0VarG0 = ubm0Var.G0();
            boolean zI = fetVar.i(ubm0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                kcl0 kcl0Var = new kcl0(1, ubm0Var, ubm0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/statistic/champ_statistic/presentation/models/StatisticChampSideEffect;)V", 0, (byte) 17);
                fetVar.o0(kcl0Var);
                objP = kcl0Var;
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                kc70 kc70Var = new kc70(k3t0VarG0, clzVar, pz40VarF, null, (byte) 17);
                fetVar.o0(kc70Var);
                objP2 = kc70Var;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP2);
            k3t0 k3t0VarG1 = ubm0Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new kcl0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                fetVar.o0(objP3);
            }
            bcm0.b(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        idm0.b((ngm0) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        dem0.d((ogm0) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2) {
        hqm0 hqm0Var = (hqm0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        s9m0 s9m0Var = hqm0.V1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                ilm ilmVar = new ilm(secondary);
                String strH = hqm0Var.H(R.string.cyber_games_stock);
                strH.getClass();
                imm immVar = new imm(ilmVar, new plm(strH, secondary, fa50.f9191a), fmm.f9790a, backgroundContent, true, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            rqm0 rqm0VarI0 = hqm0Var.I0();
            boolean zI = fetVar.i(rqm0VarI0);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new lph0(0, rqm0VarI0, rqm0.class, "onBackClick", "onBackClick()V", 0, (byte) 25);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarD, immVar2, null, (Function0) ((jhy) objP2), null, null, null, null, null, null, null, null, fetVar, 54, 0, 4084);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        pvm0.d((mgs) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2) {
        d7b d7bVar = (d7b) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            tfx.e(null, ((a7b) d7bVar).f358a, true, fetVar, 384, 1);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2) {
        gym0 gym0Var = (gym0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            xbc.w(0, fetVar);
            gym0Var.b.a(udl0.CLASSIC, fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Collection collectionQ0;
        l1q0 l1q0Var;
        byte b = this.f7622a;
        byte b2 = 10;
        jm40 jm40Var = jm40.b;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                ((fdk0) obj3).G(new zck0(false, "", str));
                return Unit.f46060a;
            case 1:
                pgk0 pgk0Var = (pgk0) obj3;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = pgk0Var.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        collectionQ0 = collection;
                    } else if (obj4 instanceof Set) {
                        collectionQ0 = q3d.j(obj4, collection);
                    } else {
                        if (!(obj4 instanceof List)) {
                            ykd.b("Unexpected notification");
                            csj.b();
                            return null;
                        }
                        collectionQ0 = CollectionsKt.q0((Collection) obj4, kotlin.collections.a.c(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj4, collectionQ0)) {
                            if (pgk0Var.c()) {
                                pgk0Var.f26959a.invoke(new goi0(pgk0Var, (byte) 10));
                            }
                            return Unit.f46060a;
                        }
                    } while (atomicReference.get() == obj4);
                }
                break;
            case 2:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                p7m0 p7m0Var = ((cjk0) obj3).n;
                xik0 xik0Var = new xik0(str2);
                p7m0Var.getClass();
                p7m0Var.o(null, xik0Var);
                return Unit.f46060a;
            case 3:
                tpk0 tpk0Var = (tpk0) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                th.printStackTrace();
                long j = ((jpk0) tpk0Var.D()).h.b;
                if (j == 1) {
                    roi0 roi0Var = tpk0Var.M;
                    bqk0 bqk0Var = new bqk0(th);
                    l6l l6lVar = (l6l) roi0Var.f30839a;
                    l6lVar.getClass();
                    l6lVar.f19511a.f22948a.o(null, bqk0Var);
                } else if (j == 2) {
                    ugf0 ugf0Var = tpk0Var.L;
                    bqk0 bqk0Var2 = new bqk0(th);
                    f310 f310Var = (f310) ugf0Var.f35622a;
                    f310Var.getClass();
                    f310Var.f8839a.f40047a.o(null, bqk0Var2);
                } else if (j == 46) {
                    o470 o470Var = tpk0Var.K;
                    bqk0 bqk0Var3 = new bqk0(th);
                    oh9 oh9Var = (oh9) o470Var.f24619a;
                    oh9Var.getClass();
                    oh9Var.f25256a.f23522a.o(null, bqk0Var3);
                }
                return Unit.f46060a;
            case 4:
                usk0 usk0Var = (usk0) obj3;
                dvk0 dvk0Var = (dvk0) obj2;
                ((oyg0) obj).getClass();
                dvk0Var.getClass();
                lpp0 lpp0Var = dvk0Var.j;
                if (usk0Var instanceof xrk0) {
                    xrk0 xrk0Var = (xrk0) usk0Var;
                    return dvk0.a(dvk0Var, false, null, null, sdt.a(dvk0Var.d, xrk0Var.f41376a, xrk0Var.b, xrk0Var.c, xrk0Var.d, xrk0Var.e, null, 32), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741815);
                }
                if (usk0Var.equals(isk0.f15308a)) {
                    return dvk0.a(dvk0Var, false, null, null, null, ptk0.f27569a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741791);
                }
                if (usk0Var.equals(osk0.f25787a)) {
                    return dvk0.a(dvk0Var, false, null, null, null, null, cvk0.f5034a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741759);
                }
                if (usk0Var.equals(rsk0.f31036a)) {
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, gvk0.f11979a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741695);
                }
                if (usk0Var instanceof psk0) {
                    psk0 psk0Var = (psk0) usk0Var;
                    btk0 btk0Var = psk0Var.f27520a;
                    List list = psk0Var.b;
                    list.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, new evk0(btk0Var, list), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741567);
                }
                if (usk0Var instanceof ksk0) {
                    ksk0 ksk0Var = (ksk0) usk0Var;
                    btk0 btk0Var2 = ksk0Var.f18818a;
                    List list2 = ksk0Var.b;
                    list2.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, new rtk0(btk0Var2, list2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073739775);
                }
                if (usk0Var instanceof esk0) {
                    esk0 esk0Var = (esk0) usk0Var;
                    btk0 btk0Var3 = esk0Var.f8333a;
                    List list3 = esk0Var.b;
                    list3.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, lpp0.a(lpp0Var, new wpp0(btk0Var3, list3), null, null, 6), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741311);
                }
                if (usk0Var instanceof dsk0) {
                    dsk0 dsk0Var = (dsk0) usk0Var;
                    btk0 btk0Var4 = dsk0Var.f6615a;
                    List list4 = dsk0Var.b;
                    list4.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, lpp0.a(lpp0Var, null, new vpp0(btk0Var4, list4), null, 5), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741311);
                }
                if (usk0Var instanceof csk0) {
                    csk0 csk0Var = (csk0) usk0Var;
                    btk0 btk0Var5 = csk0Var.f4894a;
                    List list5 = csk0Var.b;
                    Set set = csk0Var.c;
                    list5.getClass();
                    set.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, lpp0.a(lpp0Var, null, null, new opp0(btk0Var5, list5, set), 3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741311);
                }
                if (usk0Var instanceof nsk0) {
                    nsk0 nsk0Var = (nsk0) usk0Var;
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, bvk0.a(dvk0Var.n, nsk0Var.f24054a, nsk0Var.b, null, 4), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073733631);
                }
                if (usk0Var instanceof qsk0) {
                    qsk0 qsk0Var = (qsk0) usk0Var;
                    btk0 btk0Var6 = qsk0Var.f29263a;
                    List list6 = qsk0Var.b;
                    List list7 = qsk0Var.d;
                    List list8 = qsk0Var.c;
                    list6.getClass();
                    list7.getClass();
                    list8.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, new fvk0(btk0Var6, list6, list7, list8), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073737727);
                }
                if (usk0Var instanceof ssk0) {
                    ssk0 ssk0Var = (ssk0) usk0Var;
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, pvk0.a(dvk0Var.k, ssk0Var.f32731a, ssk0Var.b, null, 4), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740799);
                }
                if (usk0Var instanceof hsk0) {
                    hsk0 hsk0Var = (hsk0) usk0Var;
                    btk0 btk0Var7 = hsk0Var.f13589a;
                    List list9 = hsk0Var.b;
                    list9.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, new otk0(btk0Var7, list9), null, null, null, null, null, null, null, null, null, null, null, null, null, 1073725439);
                }
                if (usk0Var instanceof tsk0) {
                    tsk0 tsk0Var = (tsk0) usk0Var;
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, jwk0.a(dvk0Var.p, tsk0Var.f34465a, tsk0Var.b, 0, 4), null, null, null, null, null, null, null, null, null, null, null, null, 1073709055);
                }
                if (usk0Var instanceof wrk0) {
                    wrk0 wrk0Var = (wrk0) usk0Var;
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new gqk0(wrk0Var.f39648a, wrk0Var.b), null, null, null, null, null, null, null, null, null, null, null, 1073676287);
                }
                if (usk0Var instanceof bsk0) {
                    bsk0 bsk0Var = (bsk0) usk0Var;
                    btk0 btk0Var8 = bsk0Var.f3134a;
                    List list10 = bsk0Var.b;
                    list10.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new gtk0(btk0Var8, list10), null, null, null, null, null, null, null, null, null, null, 1073610751);
                }
                if (usk0Var instanceof fsk0) {
                    fsk0 fsk0Var = (fsk0) usk0Var;
                    btk0 btk0Var9 = fsk0Var.f10069a;
                    List list11 = fsk0Var.b;
                    list11.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ltk0(btk0Var9, list11), null, null, null, null, null, null, null, null, null, 1073479679);
                }
                if (usk0Var instanceof jsk0) {
                    jsk0 jsk0Var = (jsk0) usk0Var;
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new qtk0(jsk0Var.f17057a, new ixb0(jsk0Var.b, false)), null, null, null, null, null, null, null, 1072693247);
                }
                if (usk0Var instanceof gsk0) {
                    gsk0 gsk0Var = (gsk0) usk0Var;
                    btk0 btk0Var10 = gsk0Var.f11835a;
                    List list12 = gsk0Var.b;
                    list12.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ntk0(btk0Var10, list12), null, null, null, null, null, null, 1071644671);
                }
                if (usk0Var instanceof zrk0) {
                    zrk0 zrk0Var = (zrk0) usk0Var;
                    btk0 btk0Var11 = zrk0Var.f44859a;
                    List list13 = zrk0Var.b;
                    list13.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new dtk0(btk0Var11, list13), null, null, null, null, null, 1069547519);
                }
                if (usk0Var instanceof ask0) {
                    ask0 ask0Var = (ask0) usk0Var;
                    btk0 btk0Var12 = ask0Var.f1396a;
                    List list14 = ask0Var.b;
                    list14.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new etk0(btk0Var12, list14), null, null, null, null, null, null, null, null, 1073217535);
                }
                if (usk0Var instanceof msk0) {
                    msk0 msk0Var = (msk0) usk0Var;
                    btk0 btk0Var13 = msk0Var.f22325a;
                    List list15 = msk0Var.b;
                    list15.getClass();
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new avk0(btk0Var13, list15), null, null, null, null, 1065353215);
                }
                if (usk0Var instanceof yrk0) {
                    yrk0 yrk0Var = (yrk0) usk0Var;
                    return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ctk0.a(dvk0Var.y, yrk0Var.f43126a, yrk0Var.b, 0, 4), null, null, null, 1056964607);
                }
                if (!(usk0Var instanceof lsk0)) {
                    t9f.b();
                    return null;
                }
                lsk0 lsk0Var = (lsk0) usk0Var;
                btk0 btk0Var14 = lsk0Var.f20584a;
                List list16 = lsk0Var.b;
                list16.getClass();
                return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new stk0(btk0Var14, list16), null, null, 1040187391);
            case 5:
                ktk0 ktk0Var = (ktk0) obj3;
                dvk0 dvk0Var2 = (dvk0) obj2;
                return dvk0.a(dvk0Var2, false, xl9.a(dvk0Var2.b, null, ktk0Var.f18871a, 1), a9l0.a(dvk0Var2.c, null, ktk0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741817);
            case 6:
                x0l0 x0l0Var = (x0l0) obj3;
                a8z a8zVar = x0l0Var.M1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                        fetVar.o0(objP);
                    }
                    vne vneVar = (vne) objP;
                    boolean zI = fetVar.i(x0l0Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        gvj0 gvj0Var = new gvj0(1, x0l0Var, x0l0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/coinplay_sport_cashback_impl/presentation/model/SportCashbackSideEffect;)V", 0, (byte) 28);
                        fetVar.o0(gvj0Var);
                        objP2 = gvj0Var;
                    }
                    Function1 function1 = (Function1) ((jhy) objP2);
                    Unit unit = Unit.f46060a;
                    boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new ggc0(vneVar, k3t0Var, function1, b2);
                        fetVar.o0(objP3);
                    }
                    m0x0.o(unit, (Function1) objP3, fetVar);
                    i1l0 i1l0Var = (i1l0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI3 = fetVar.i(k3t0Var2);
                    Object objP4 = fetVar.P();
                    if (zI3 || objP4 == cl5Var) {
                        gvj0 gvj0Var2 = new gvj0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar.o0(gvj0Var2);
                        objP4 = gvj0Var2;
                    }
                    o2e.P(i1l0Var, (Function1) ((jhy) objP4), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 7:
                usm usmVar = (usm) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objA = usmVar.b.a();
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
                    pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
                    m78 m78Var = new m78(((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), 5);
                    pge pgeVar = gqw0.A;
                    zcl zclVar = qmk.f28987a;
                    k7x.b(objA, null, o7k0.s(o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 24.0f), 24.0f), pm80VarF, pm80VarF2, null, null, null, null, null, pgeVar, m78Var, fetVar2, 36912, 6, 27616);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 8:
                ttm ttmVar = (ttm) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tlb.l(null, ttmVar.i, ttmVar.j, ttmVar.k, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), fetVar3, 0, 1);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 9:
                vtm vtmVar = (vtm) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    jwm jwmVar = vtmVar.i;
                    jwm jwmVar2 = vtmVar.j;
                    long secondary = ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary();
                    zcl zclVar2 = qmk.f28987a;
                    tlb.l(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), null, jwmVar, jwmVar2, secondary, fetVar4, 48, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 10:
                j83 j83Var = (j83) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 144.0f, 1);
                    ((g1t0) fetVar5.k(j1t0.e)).getClass();
                    aad.d(j83Var, mm40VarU, y9q0.a(g1t0.i(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), null, 2, false, 1, 0, null, new n05(idm0.t(10), idm0.t(16), idm0.t(1)), fetVar5, 1597440, 0, 936);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                g1x.m((x9l0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 12:
                lal0 lal0Var = (lal0) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    eal0.a(0, fetVar6, o7k0.g(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f, 0.0f, 2), lal0Var.f19711a);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                mal0 mal0Var = (mal0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    eal0.a(0, fetVar7, o7k0.g(s5x0.N(mm40VarD2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f, 0.0f, 2), mal0Var.f21463a);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                return a(obj, obj2);
            case 15:
                return b(obj, obj2);
            case 16:
                return c(obj, obj2);
            case 17:
                return g(obj, obj2);
            case 18:
                return h(obj, obj2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return i(obj, obj2);
            case 20:
                return l(obj, obj2);
            case 21:
                return m(obj, obj2);
            case 22:
                return o(obj, obj2);
            case 23:
                return p(obj, obj2);
            case 24:
                return r(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return s(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return u(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return v(obj, obj2);
            default:
                a0n0 a0n0Var = (a0n0) obj3;
                w0n0 w0n0Var = (w0n0) obj2;
                ((oyg0) obj).getClass();
                w0n0Var.getClass();
                l1q0 l1q0Var2 = w0n0Var.b;
                if (l1q0Var2 != null) {
                    boolean z = !a0n0Var.b;
                    boolean z2 = l1q0Var2.f19269a;
                    boolean z3 = l1q0Var2.b;
                    boolean z4 = l1q0Var2.c;
                    boolean z5 = l1q0Var2.d;
                    boolean z6 = l1q0Var2.e;
                    boolean z7 = l1q0Var2.f;
                    boolean z8 = l1q0Var2.g;
                    boolean z9 = l1q0Var2.h;
                    String str3 = l1q0Var2.i;
                    String str4 = l1q0Var2.j;
                    boolean z10 = l1q0Var2.k;
                    cre creVar = l1q0Var2.l;
                    String str5 = l1q0Var2.m;
                    boolean z11 = l1q0Var2.n;
                    boolean z12 = l1q0Var2.o;
                    boolean z13 = l1q0Var2.p;
                    boolean z14 = l1q0Var2.q;
                    boolean z15 = l1q0Var2.r;
                    boolean z16 = l1q0Var2.s;
                    boolean z17 = l1q0Var2.t;
                    boolean z18 = l1q0Var2.u;
                    boolean z19 = l1q0Var2.v;
                    String str6 = l1q0Var2.w;
                    boolean z20 = l1q0Var2.x;
                    boolean z21 = l1q0Var2.y;
                    boolean z22 = l1q0Var2.z;
                    boolean z23 = l1q0Var2.A;
                    str4.getClass();
                    creVar.getClass();
                    l1q0Var = new l1q0(z2, z3, z4, z5, z6, z7, z8, z9, str3, str4, z10, creVar, str5, z11, z12, z13, z14, z15, z16, z17, z18, z19, str6, z20, z21, z22, z23, z);
                } else {
                    l1q0Var = null;
                }
                return w0n0.a(w0n0Var, l1q0Var, null, null, null, false, 0, null, 253);
        }
    }

    public /* synthetic */ edk0(Object obj, int i, byte b) {
        this.f7622a = b;
        this.b = obj;
    }
}
