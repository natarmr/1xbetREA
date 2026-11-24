package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pi40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27027a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pi40(wj40 wj40Var) {
        this.f27027a = (byte) 1;
        this.b = wj40Var;
    }

    private final Object a(Object obj, Object obj2) {
        b160 b160Var = (b160) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        evz evzVar = b160.O1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarH0 = b160Var.H0();
            boolean zI = fetVar.i(b160Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                jw50 jw50Var = new jw50(1, b160Var, b160.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/screen/no_tabs_dashboard/models/NoTabsDashboardSideEffect;)V", 0, (byte) 5);
                fetVar.o0(jw50Var);
                objP = jw50Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(b160Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                p000 p000Var = new p000(k3t0VarH0, b160Var, pz40VarF, null, (byte) 22);
                fetVar.o0(p000Var);
                objP2 = p000Var;
            }
            m0x0.t(fetVar, b160Var, (Function2) objP2);
            mm40 mm40VarH = phu0.H(yyw.X(jm40.b, null, fetVar, 1), null, 1);
            pz40 pz40VarY = ((i3t0) b160Var.H0()).y(fetVar);
            bdz bdzVar = (bdz) b160Var.K1.getValue();
            k3t0 k3t0VarH1 = b160Var.H0();
            boolean zI3 = fetVar.i(k3t0VarH1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                jw50 jw50Var2 = new jw50(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                fetVar.o0(jw50Var2);
                objP3 = jw50Var2;
            }
            nia0.P(mm40VarH, pz40VarY, bdzVar, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        w560 w560Var = (w560) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        uuz uuzVar = w560.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = w560Var.G0();
            boolean zI = fetVar.i(w560Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new jw50(1, w560Var, w560.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/verification/nomapay/impl/presentation/models/NomaPaySideEffect;)V", 0, (byte) 11);
                fetVar.o0(objP);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(w560Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new p000(k3t0VarG0, w560Var, pz40VarF, null, (byte) 23);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, w560Var, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) w560Var.G0()).y(fetVar);
            boolean zI3 = fetVar.i(w560Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new b530((Object) w560Var, (byte) 28);
                fetVar.o0(objP3);
            }
            xia0.L(pz40VarY, (Function1) objP3, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        bj60 bj60Var = (bj60) this.b;
        a8z a8zVar = bj60Var.M1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        iiy[] iiyVarArr = bj60.O1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(bj60Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                jw50 jw50Var = new jw50(1, bj60Var, bj60.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/onboarding_section/impl/presentation/cyber/OnboardingCyberSectionsSideEffect;)V", 0, (byte) 15);
                fetVar.o0(jw50Var);
                objP = jw50Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(bj60Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                p000 p000Var = new p000(k3t0Var, bj60Var, pz40VarF, null, (byte) 24);
                fetVar.o0(p000Var);
                objP2 = p000Var;
            }
            m0x0.t(fetVar, bj60Var, (Function2) objP2);
            unh0.T((k3t0) a8zVar.getValue(), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        dm60 dm60Var = (dm60) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        wsz wszVar = dm60.P1;
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(dm60Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new am60(dm60Var, b);
                fetVar.o0(objP);
            }
            m0x0.o(unit, (Function1) objP, fetVar);
            k3t0 k3t0VarG0 = dm60Var.G0();
            boolean zI2 = fetVar.i(dm60Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                wzu0 wzu0Var = new wzu0(1, dm60Var, dm60.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/bonus_games/impl/core/presentation/games_list/models/BonusGamesSideEffect;)V", 0, (byte) 29);
                fetVar.o0(wzu0Var);
                objP2 = wzu0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar);
            boolean zI3 = fetVar.i(k3t0VarG0) | fetVar.i(dm60Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                p000 p000Var = new p000(k3t0VarG0, dm60Var, pz40VarF, null, (byte) 25);
                fetVar.o0(p000Var);
                objP3 = p000Var;
            }
            m0x0.t(fetVar, dm60Var, (Function2) objP3);
            pz40 pz40VarY = ((i3t0) dm60Var.G0()).y(fetVar);
            k3t0 k3t0VarG1 = dm60Var.G0();
            boolean zI4 = fetVar.i(k3t0VarG1);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                jw50 jw50Var = new jw50(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                fetVar.o0(jw50Var);
                objP4 = jw50Var;
            }
            ohq0.J(pz40VarY, (Function1) ((jhy) objP4), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        nn60 nn60Var = (nn60) this.b;
        String str = (String) obj2;
        ((Throwable) obj).getClass();
        str.getClass();
        ctf0 ctf0Var = nn60Var.v;
        nn60Var.g(new qn60(new DialogFields((CharSequence) ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) str, (CharSequence) ctf0Var.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x08e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x08e2 A[Catch: all -> 0x08ff, LOOP:0: B:249:0x08b0->B:259:0x08e2, LOOP_END, TryCatch #0 {, blocks: (B:246:0x089d, B:249:0x08b0, B:251:0x08bf, B:253:0x08c9, B:255:0x08d2, B:256:0x08da, B:259:0x08e2, B:260:0x08e5, B:262:0x08eb, B:264:0x08f1), top: B:383:0x089d }] */
    /* JADX WARN: Code duplicated, block: B:386:0x08e5 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ypj0 ypj0Var;
        byte b = 7;
        byte b2 = 3;
        byte b3 = 2;
        final byte b4 = 1;
        switch (this.f27027a) {
            case 0:
                ((Integer) obj2).getClass();
                bdx.d((oi40) this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                jm40 jm40Var = jm40.b;
                wj40 wj40Var = (wj40) this.b;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
                    mkd.c0.getClass();
                    pcy pcyVar = e7z.u1;
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
                    fetVar.e0(888125390);
                    Iterator<E> it = wj40Var.b.iterator();
                    while (it.hasNext()) {
                        dub.y(null, (l7m) it.next(), fetVar, 0);
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                ik40 ik40Var = (ik40) this.b;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                uuz uuzVar = ik40.S1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wk40 wk40Var = (wk40) ik40Var.O1.getValue();
                    g2v g2vVar = ik40Var.L1;
                    if (g2vVar == null) {
                        Intrinsics.h("lottieEmptyConfigurator");
                        throw null;
                    }
                    boolean zI = fetVar2.i(ik40Var);
                    Object objP = fetVar2.P();
                    if (zI || objP == ukd.f35823a) {
                        objP = new fk40(ik40Var, b4);
                        fetVar2.o0(objP);
                    }
                    o2e.G(g2vVar, wk40Var, (Function0) objP, fetVar2, 64);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ((tl40) this.b).a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 4:
                xpj0 xpj0Var = (xpj0) this.b;
                qkx qkxVar = (qkx) obj;
                float fH = p4e.h(((p4e) obj2).f26347a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(ypj0.f43033a, Float.valueOf(fH));
                float f = fH / 2.0f;
                if (((int) (qkxVar.f28908a & 4294967295L)) > f && !xpj0Var.f41272a) {
                    linkedHashMap.put(ypj0.c, Float.valueOf(f));
                }
                int i = (int) (qkxVar.f28908a & 4294967295L);
                if (i != 0) {
                    linkedHashMap.put(ypj0.b, Float.valueOf(Math.max(0.0f, fH - i)));
                }
                no20 no20Var = new no20(linkedHashMap);
                int iOrdinal = ((ypj0) ((zbk) xpj0Var.e.k).getValue()).ordinal();
                if (iOrdinal == 0) {
                    ypj0Var = ypj0.f43033a;
                } else if (iOrdinal == 1) {
                    ypj0Var = ypj0.b;
                    if (!linkedHashMap.containsKey(ypj0Var)) {
                        ypj0Var = ypj0.f43033a;
                    }
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    ypj0Var = ypj0.c;
                    if (!linkedHashMap.containsKey(ypj0Var)) {
                        ypj0Var = ypj0.b;
                        if (!linkedHashMap.containsKey(ypj0Var)) {
                            ypj0Var = ypj0.f43033a;
                        }
                    }
                }
                return new Pair(no20Var, ypj0Var);
            case 5:
                a8z a8zVar = ((en40) this.b).M1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                wsz wszVar = en40.N1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar3);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI2 = fetVar3.i(k3t0Var);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == ukd.f35823a) {
                        f340 f340Var = new f340(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar3.o0(f340Var);
                        objP2 = f340Var;
                    }
                    tke.E(pz40VarY, (Function1) ((jhy) objP2), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 6:
                yo40 yo40Var = (yo40) this.b;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                atz atzVar = yo40.P1;
                cl5 cl5Var = ukd.f35823a;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI3 = fetVar4.i(yo40Var);
                    Object objP3 = fetVar4.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new wo40(yo40Var, (byte) 3);
                        fetVar4.o0(objP3);
                    }
                    qcc.X(yo40Var, (Function0) objP3);
                    hp40 hp40Var = (hp40) ((i3t0) yo40Var.G0()).y(fetVar4).getValue();
                    k3t0 k3t0VarG0 = yo40Var.G0();
                    boolean zI4 = fetVar4.i(k3t0VarG0);
                    Object objP4 = fetVar4.P();
                    if (zI4 || objP4 == cl5Var) {
                        f340 f340Var2 = new f340(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar4.o0(f340Var2);
                        objP4 = f340Var2;
                    }
                    x8f.G(hp40Var, (Function1) ((jhy) objP4), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                ju40 ju40Var = (ju40) this.b;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fetVar5.F(ju40Var, fetVar5.m(), null, false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 8:
                vw40 vw40Var = (vw40) this.b;
                Set set = (Set) obj;
                mie0 mie0Var = new mie0();
                synchronized (vw40Var.b) {
                    hz40 hz40Var = vw40Var.c;
                    jl40 jl40Var = new jl40(set, vw40Var, mie0Var, b3);
                    zys0.e(1, jl40Var);
                    Object[] objArr = hz40Var.b;
                    long[] jArr = hz40Var.f13891a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        jl40Var.invoke(objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            } else if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    List list = (List) mie0Var.f21842a;
                    if (list != null) {
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((jbi0) list.get(i5)).f(Unit.f46060a);
                        }
                    }
                }
                return Unit.f46060a;
            case 9:
                u250 u250Var = (u250) this.b;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                wsz wszVar2 = u250.V1;
                cl5 cl5Var2 = ukd.f35823a;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    final x650 x650Var = (x650) ((i3t0) u250Var.G0()).y(fetVar6).getValue();
                    k3t0 k3t0VarG1 = u250Var.G0();
                    boolean zI5 = fetVar6.i(k3t0VarG1);
                    Object objP5 = fetVar6.P();
                    if (zI5 || objP5 == cl5Var2) {
                        objP5 = new f340(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar6.o0(objP5);
                    }
                    final Function1 function1 = (Function1) ((jhy) objP5);
                    x650Var.getClass();
                    n250 n250Var = x650Var.c;
                    function1.getClass();
                    clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar6), fetVar6, 24576);
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarE0 = o2e.e0(jm40Var2, "MY_AGGREGATOR_SCREEN");
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar6.k(zfnVar)).getBackgroundContent();
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarV = cjx.V(i120.Q(s5x0.N(i120.Q(mm40VarE0, backgroundContent, ljcVar), 0.0f, fbc.T(fetVar6), 0.0f, 0.0f, 13), ((ThemeColors) fetVar6.k(zfnVar)).getBackground(), ljcVar), cloVarB.e, null);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                    int iHashCode2 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM2 = fetVar6.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarV);
                    mkd.c0.getClass();
                    pcy pcyVar2 = e7z.u1;
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar2);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                    final byte b5 = false ? (byte) 1 : (byte) 0;
                    ahy.b(o2e.e0(jm40Var2, "MY_AGGREGATOR_NAVBAR"), cloVarB, n250Var instanceof m250, u1c.M(1380922302, new Function2() { // from class: a.i650
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b6 = b5;
                            Function1 function2 = function1;
                            x650 x650Var2 = x650Var;
                            switch (b6) {
                                case 0:
                                    fet fetVar7 = (fet) obj3;
                                    int iIntValue7 = ((Integer) obj4).intValue();
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        imm immVar = x650Var2.f40344a;
                                        boolean zG = fetVar7.g(function2);
                                        Object objP6 = fetVar7.P();
                                        cl5 cl5Var3 = ukd.f35823a;
                                        if (zG || objP6 == cl5Var3) {
                                            objP6 = new w250(function2, (byte) 9);
                                            fetVar7.o0(objP6);
                                        }
                                        Function0 function0 = (Function0) objP6;
                                        boolean zG2 = fetVar7.g(function2);
                                        Object objP7 = fetVar7.P();
                                        if (zG2 || objP7 == cl5Var3) {
                                            objP7 = new rp30(function2, (byte) 18);
                                            fetVar7.o0(objP7);
                                        }
                                        hlm.c(null, immVar, null, function0, null, (Function1) objP7, null, null, null, null, null, null, fetVar7, 0, 0, 4053);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                default:
                                    fet fetVar8 = (fet) obj3;
                                    int iIntValue8 = ((Integer) obj4).intValue();
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        bdx.m(o2e.e0(jm40.b, "TOP_CONTENT"), x650Var2.b, function2, fetVar8, 6);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar6), u1c.M(-750742785, new Function2() { // from class: a.i650
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b6 = b4;
                            Function1 function2 = function1;
                            x650 x650Var2 = x650Var;
                            switch (b6) {
                                case 0:
                                    fet fetVar7 = (fet) obj3;
                                    int iIntValue7 = ((Integer) obj4).intValue();
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        imm immVar = x650Var2.f40344a;
                                        boolean zG = fetVar7.g(function2);
                                        Object objP6 = fetVar7.P();
                                        cl5 cl5Var3 = ukd.f35823a;
                                        if (zG || objP6 == cl5Var3) {
                                            objP6 = new w250(function2, (byte) 9);
                                            fetVar7.o0(objP6);
                                        }
                                        Function0 function0 = (Function0) objP6;
                                        boolean zG2 = fetVar7.g(function2);
                                        Object objP7 = fetVar7.P();
                                        if (zG2 || objP7 == cl5Var3) {
                                            objP7 = new rp30(function2, (byte) 18);
                                            fetVar7.o0(objP7);
                                        }
                                        hlm.c(null, immVar, null, function0, null, (Function1) objP7, null, null, null, null, null, null, fetVar7, 0, 0, 4053);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                default:
                                    fet fetVar8 = (fet) obj3;
                                    int iIntValue8 = ((Integer) obj4).intValue();
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        bdx.m(o2e.e0(jm40.b, "TOP_CONTENT"), x650Var2.b, function2, fetVar8, 6);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar6), fetVar6, 27654, 0);
                    qjj.C(o2e.e0(jm40Var2, "MIDDLE_CONTENT"), n250Var, function1, fetVar6, 6);
                    fetVar6.r(true);
                    k3t0 k3t0VarG2 = u250Var.G0();
                    boolean zI6 = fetVar6.i(u250Var);
                    Object objP6 = fetVar6.P();
                    if (zI6 || objP6 == cl5Var2) {
                        f340 f340Var3 = new f340(1, u250Var, u250.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/my_aggregator/presentation/models/MyAggregatorSideEffect;)V", 0, (byte) 13);
                        fetVar6.o0(f340Var3);
                        objP6 = f340Var3;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar6);
                    boolean zI7 = fetVar6.i(k3t0VarG2) | fetVar6.i(u250Var) | fetVar6.e(3) | fetVar6.g(pz40VarF);
                    Object objP7 = fetVar6.P();
                    if (zI7 || objP7 == cl5Var2) {
                        p000 p000Var = new p000(k3t0VarG2, u250Var, pz40VarF, null, (byte) 13);
                        fetVar6.o0(p000Var);
                        objP7 = p000Var;
                    }
                    m0x0.t(fetVar6, u250Var, (Function2) objP7);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 10:
                o450 o450Var = (o450) this.b;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                atz atzVar2 = o450.V1;
                cl5 cl5Var3 = ukd.f35823a;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    float fT = fbc.T(fetVar7);
                    boolean zD = fetVar7.d(fT);
                    Object objP8 = fetVar7.P();
                    if (zD || objP8 == cl5Var3) {
                        objP8 = s5x0.u(0.0f, fT, 0.0f, 0.0f, 13);
                        fetVar7.o0(objP8);
                    }
                    hh80 hh80Var = (hh80) objP8;
                    final b550 b550Var = (b550) ydx.F(o450Var.G0().i1, fetVar7).getValue();
                    d650 d650VarG0 = o450Var.G0();
                    boolean zI8 = fetVar7.i(d650VarG0);
                    Object objP9 = fetVar7.P();
                    if (zI8 || objP9 == cl5Var3) {
                        f340 f340Var4 = new f340(1, d650VarG0, d650.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/my_aggregator/presentation/old/models/MyAggregatorOldAction;)V", 0, (byte) 14);
                        fetVar7.o0(f340Var4);
                        objP9 = f340Var4;
                    }
                    final Function1 function2 = (Function1) ((jhy) objP9);
                    hh80Var.getClass();
                    b550Var.getClass();
                    function2.getClass();
                    clo cloVarB2 = lyq0.b(ob3.d(0, 7, fetVar7), fetVar7, 24576);
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarV2 = cjx.V(i120.Q(s5x0.I(o2e.e0(jm40Var3, "MY_AGGREGATOR_SCREEN"), hh80Var), ((ThemeColors) fetVar7.k(zaq0.b)).getBackground(), jd8.n), cloVarB2.e, null);
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar7, 0);
                    int iHashCode3 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM3 = fetVar7.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar7, mm40VarV2);
                    mkd.c0.getClass();
                    pcy pcyVar3 = e7z.u1;
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar3);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC2, gqw0.v);
                    mm40 mm40VarE1 = o2e.e0(jm40Var3, "MY_AGGREGATOR_NAVBAR");
                    boolean z = b550Var.e;
                    final byte b6 = false ? (byte) 1 : (byte) 0;
                    ahy.b(mm40VarE1, cloVarB2, z, u1c.M(837286039, new Function2() { // from class: a.p450
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b7 = b6;
                            Function1 function3 = function2;
                            b550 b550Var2 = b550Var;
                            switch (b7) {
                                case 0:
                                    fet fetVar8 = (fet) obj3;
                                    int iIntValue8 = ((Integer) obj4).intValue();
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        zfn zfnVar2 = zaq0.b;
                                        imm immVar = new imm(new ilm(((ThemeColors) fetVar8.k(zfnVar2)).getSecondary()), new plm(b550Var2.f1985a, ((ThemeColors) fetVar8.k(zfnVar2)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, ((ThemeColors) fetVar8.k(zfnVar2)).getSecondary()))), ((ThemeColors) fetVar8.k(zfnVar2)).getBackgroundContent(), false, null);
                                        boolean zG = fetVar8.g(function3);
                                        Object objP10 = fetVar8.P();
                                        cl5 cl5Var4 = ukd.f35823a;
                                        if (zG || objP10 == cl5Var4) {
                                            objP10 = new w250(function3, (byte) 7);
                                            fetVar8.o0(objP10);
                                        }
                                        Function0 function0 = (Function0) objP10;
                                        boolean zG2 = fetVar8.g(function3);
                                        Object objP11 = fetVar8.P();
                                        if (zG2 || objP11 == cl5Var4) {
                                            objP11 = new rp30(function3, (byte) 17);
                                            fetVar8.o0(objP11);
                                        }
                                        hlm.c(null, immVar, null, function0, null, (Function1) objP11, null, null, null, null, null, null, fetVar8, 0, 0, 4053);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                                default:
                                    fet fetVar9 = (fet) obj3;
                                    int iIntValue9 = ((Integer) obj4).intValue();
                                    if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        eeq.N(o2e.e0(jm40.b, "TOP_CONTENT"), b550Var2.b, function3, fetVar9, 6);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar7), u1c.M(1495668918, new Function2() { // from class: a.p450
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b7 = b4;
                            Function1 function3 = function2;
                            b550 b550Var2 = b550Var;
                            switch (b7) {
                                case 0:
                                    fet fetVar8 = (fet) obj3;
                                    int iIntValue8 = ((Integer) obj4).intValue();
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        zfn zfnVar2 = zaq0.b;
                                        imm immVar = new imm(new ilm(((ThemeColors) fetVar8.k(zfnVar2)).getSecondary()), new plm(b550Var2.f1985a, ((ThemeColors) fetVar8.k(zfnVar2)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, ((ThemeColors) fetVar8.k(zfnVar2)).getSecondary()))), ((ThemeColors) fetVar8.k(zfnVar2)).getBackgroundContent(), false, null);
                                        boolean zG = fetVar8.g(function3);
                                        Object objP10 = fetVar8.P();
                                        cl5 cl5Var4 = ukd.f35823a;
                                        if (zG || objP10 == cl5Var4) {
                                            objP10 = new w250(function3, (byte) 7);
                                            fetVar8.o0(objP10);
                                        }
                                        Function0 function0 = (Function0) objP10;
                                        boolean zG2 = fetVar8.g(function3);
                                        Object objP11 = fetVar8.P();
                                        if (zG2 || objP11 == cl5Var4) {
                                            objP11 = new rp30(function3, (byte) 17);
                                            fetVar8.o0(objP11);
                                        }
                                        hlm.c(null, immVar, null, function0, null, (Function1) objP11, null, null, null, null, null, null, fetVar8, 0, 0, 4053);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                                default:
                                    fet fetVar9 = (fet) obj3;
                                    int iIntValue9 = ((Integer) obj4).intValue();
                                    if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        eeq.N(o2e.e0(jm40.b, "TOP_CONTENT"), b550Var2.b, function3, fetVar9, 6);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar7), fetVar7, 27654, 0);
                    eeq.z(o2e.e0(jm40Var3, "MIDDLE_CONTENT"), b550Var.c, b550Var.e, b550Var.d, function2, fetVar7, 6);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 11:
                p850 p850Var = (p850) this.b;
                Throwable th = (Throwable) obj;
                String strG = (String) obj2;
                th.getClass();
                strG.getClass();
                if (StringsKt.W(strG)) {
                    strG = jwb.G(th, p850Var.e0);
                }
                p850Var.G(new l650(strG));
                return Unit.f46060a;
            case 12:
                pf80 pf80Var = (pf80) this.b;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pf80Var.getContent().invoke(fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 13:
                y1h0 y1h0Var = (y1h0) this.b;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    y1h0Var.getContent().invoke(fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 14:
                a8z a8zVar2 = ((in50) this.b).Q1;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                atz atzVar3 = in50.R1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar10);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI9 = fetVar10.i(k3t0Var2);
                    Object objP10 = fetVar10.P();
                    if (zI9 || objP10 == ukd.f35823a) {
                        r750 r750Var = new r750(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                        fetVar10.o0(r750Var);
                        objP10 = r750Var;
                    }
                    gq80.y(pz40VarY2, (Function1) ((jhy) objP10), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 15:
                ngk0 ngk0Var = (ngk0) this.b;
                Integer num = (Integer) obj;
                num.intValue();
                ngk0Var.put(num, (String) obj2);
                return Unit.f46060a;
            case 16:
                os50 os50Var = (os50) this.b;
                ws50 ws50Var = (ws50) obj2;
                ((oyg0) obj).getClass();
                ws50Var.getClass();
                js50 js50Var = (js50) os50Var;
                Integer numValueOf = js50Var.b ? null : Integer.valueOf(js50Var.f17034a + 1);
                return ws50.a(ws50Var, false, numValueOf != null ? numValueOf.intValue() : 0, null, null, null, null, 125);
            case 17:
                a8z a8zVar3 = ((du50) this.b).N1;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                htz htzVar = du50.P1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar11);
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    boolean zI10 = fetVar11.i(k3t0Var3);
                    Object objP11 = fetVar11.P();
                    if (zI10 || objP11 == ukd.f35823a) {
                        r750 r750Var2 = new r750(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar11.o0(r750Var2);
                        objP11 = r750Var2;
                    }
                    q5x.n(pz40VarY3, (Function1) ((jhy) objP11), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 18:
                lu50 lu50Var = (lu50) this.b;
                a8z a8zVar4 = lu50Var.U1;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                uuz uuzVar2 = lu50.V1;
                cl5 cl5Var4 = ukd.f35823a;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar12);
                    ba50 ba50VarH = zdx.H(fetVar12);
                    boolean zI11 = fetVar12.i(lu50Var);
                    Object objP12 = fetVar12.P();
                    Object obj3 = objP12;
                    if (zI11 || objP12 == cl5Var4) {
                        ju50 ju50Var = new ju50(lu50Var, b3);
                        fetVar12.o0(ju50Var);
                        obj3 = ju50Var;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zI12 = fetVar12.i(lu50Var);
                    Object objP13 = fetVar12.P();
                    Object obj4 = objP13;
                    if (zI12 || objP13 == cl5Var4) {
                        ju50 ju50Var2 = new ju50(lu50Var, b2);
                        fetVar12.o0(ju50Var2);
                        obj4 = ju50Var2;
                    }
                    v3c.z(function0, (Function0) obj4, null, fetVar12, 0, 4);
                    k3t0 k3t0Var4 = (k3t0) a8zVar4.getValue();
                    boolean zI13 = fetVar12.i(lu50Var);
                    Object objP14 = fetVar12.P();
                    if (zI13 || objP14 == cl5Var4) {
                        wzu0 wzu0Var = new wzu0(1, lu50Var, lu50.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/news_main/NewsMainSideEffect;)V", 0, (byte) 28);
                        fetVar12.o0(wzu0Var);
                        objP14 = wzu0Var;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP14), fetVar12);
                    boolean zI14 = fetVar12.i(k3t0Var4) | fetVar12.i(lu50Var) | fetVar12.e(3) | fetVar12.g(pz40VarF2);
                    Object objP15 = fetVar12.P();
                    Object obj5 = objP15;
                    if (zI14 || objP15 == cl5Var4) {
                        p000 p000Var2 = new p000(k3t0Var4, lu50Var, pz40VarF2, null, (byte) 19);
                        fetVar12.o0(p000Var2);
                        obj5 = p000Var2;
                    }
                    m0x0.t(fetVar12, lu50Var, (Function2) obj5);
                    r8x.s(ba50VarH, u1c.M(-592573234, new mz7(lu50Var, pz40VarY4, b), fetVar12), fetVar12, 384);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uv50 uv50Var = (uv50) this.b;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                xuz xuzVar = uv50.U1;
                cl5 cl5Var5 = ukd.f35823a;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) uv50Var.G0()).y(fetVar13);
                    boolean zI15 = fetVar13.i(uv50Var);
                    Object objP16 = fetVar13.P();
                    Object obj6 = objP16;
                    if (zI15 || objP16 == cl5Var5) {
                        sv50 sv50Var = new sv50(uv50Var, b3);
                        fetVar13.o0(sv50Var);
                        obj6 = sv50Var;
                    }
                    Function0 function3 = (Function0) obj6;
                    boolean zI16 = fetVar13.i(uv50Var);
                    Object objP17 = fetVar13.P();
                    Object obj7 = objP17;
                    if (zI16 || objP17 == cl5Var5) {
                        sv50 sv50Var2 = new sv50(uv50Var, b2);
                        fetVar13.o0(sv50Var2);
                        obj7 = sv50Var2;
                    }
                    v3c.z(function3, (Function0) obj7, null, fetVar13, 0, 4);
                    w2d w2dVarW0 = uzb.w0(0, fetVar13);
                    Boolean boolValueOf = Boolean.valueOf(w2dVarW0.f38442a.a() == 1.0f);
                    boolean zI17 = fetVar13.i(uv50Var) | fetVar13.i(w2dVarW0);
                    Object objP18 = fetVar13.P();
                    yje yjeVar = null;
                    Object obj8 = objP18;
                    if (zI17 || objP18 == cl5Var5) {
                        xr10 xr10Var = new xr10(uv50Var, w2dVarW0, yjeVar, (byte) 26);
                        fetVar13.o0(xr10Var);
                        obj8 = xr10Var;
                    }
                    m0x0.t(fetVar13, boolValueOf, (Function2) obj8);
                    k3t0 k3t0VarG3 = uv50Var.G0();
                    boolean zI18 = fetVar13.i(uv50Var);
                    Object objP19 = fetVar13.P();
                    if (zI18 || objP19 == cl5Var5) {
                        r750 r750Var3 = new r750(1, uv50Var, uv50.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/news_pager/models/NewsPagerSideEffect;)V", 0, (byte) 24);
                        fetVar13.o0(r750Var3);
                        objP19 = r750Var3;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP19), fetVar13);
                    boolean zI19 = fetVar13.i(k3t0VarG3) | fetVar13.i(uv50Var) | fetVar13.e(3) | fetVar13.g(pz40VarF3);
                    Object objP20 = fetVar13.P();
                    if (zI19 || objP20 == cl5Var5) {
                        p000 p000Var3 = new p000(k3t0VarG3, uv50Var, pz40VarF3, null, (byte) 20);
                        fetVar13.o0(p000Var3);
                        objP20 = p000Var3;
                    }
                    m0x0.t(fetVar13, uv50Var, (Function2) objP20);
                    k3t0 k3t0VarG4 = uv50Var.G0();
                    boolean zI20 = fetVar13.i(k3t0VarG4);
                    Object objP21 = fetVar13.P();
                    if (zI20 || objP21 == cl5Var5) {
                        objP21 = new r750(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar13.o0(objP21);
                    }
                    gq80.H(uv50Var, pz40VarY5, w2dVarW0, uv50Var.getV1(), (Function1) ((jhy) objP21), fetVar13, 512);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 20:
                dw50 dw50Var = (dw50) this.b;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    fetVar14.X();
                } else if (dw50Var instanceof aw50) {
                    String str = dw50Var.c;
                    fetVar14.e0(1071345091);
                    jm40 jm40Var4 = jm40.b;
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar14.T);
                    bh90 bh90VarM4 = fetVar14.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar14, jm40Var4);
                    mkd.c0.getClass();
                    pcy pcyVar4 = e7z.u1;
                    fetVar14.i0();
                    if (fetVar14.S) {
                        fetVar14.l(pcyVar4);
                    } else {
                        fetVar14.r0();
                    }
                    jpm0.o(fetVar14, tj30VarC, gqw0.x);
                    jpm0.o(fetVar14, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar14, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar14);
                    jpm0.o(fetVar14, mm40VarC3, gqw0.v);
                    gq80.i(54, fetVar14, o7k0.d(jm40Var4, 1.0f), dw50Var.b);
                    if (str.length() > 0) {
                        fetVar14.e0(-1649895526);
                        gq80.W(6, fetVar14, null, str);
                        fetVar14.r(false);
                    } else {
                        fetVar14.e0(-1649805192);
                        fetVar14.r(false);
                    }
                    fetVar14.r(true);
                    fetVar14.r(false);
                } else {
                    fetVar14.e0(1071733335);
                    fetVar14.r(false);
                }
                return Unit.f46060a;
            case 21:
                m060 m060Var = (m060) this.b;
                a8z a8zVar5 = m060Var.N1;
                fet fetVar15 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                xuz xuzVar2 = m060.O1;
                cl5 cl5Var6 = ukd.f35823a;
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    k3t0 k3t0Var5 = (k3t0) a8zVar5.getValue();
                    boolean zI21 = fetVar15.i(m060Var);
                    Object objP22 = fetVar15.P();
                    if (zI21 || objP22 == cl5Var6) {
                        jw50 jw50Var = new jw50(1, m060Var, m060.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/screen/no_tabs_dashboard/models/NoTabsDashboardFiltersSideEffect;)V", 0, (byte) 2);
                        fetVar15.o0(jw50Var);
                        objP22 = jw50Var;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP22), fetVar15);
                    boolean zI22 = fetVar15.i(k3t0Var5) | fetVar15.i(m060Var) | fetVar15.e(3) | fetVar15.g(pz40VarF4);
                    Object objP23 = fetVar15.P();
                    if (zI22 || objP23 == cl5Var6) {
                        p000 p000Var4 = new p000(k3t0Var5, m060Var, pz40VarF4, null, (byte) 21);
                        fetVar15.o0(p000Var4);
                        objP23 = p000Var4;
                    }
                    m0x0.t(fetVar15, m060Var, (Function2) objP23);
                    r060 r060Var = (r060) ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar15).getValue();
                    k3t0 k3t0Var6 = (k3t0) a8zVar5.getValue();
                    boolean zI23 = fetVar15.i(k3t0Var6);
                    Object objP24 = fetVar15.P();
                    if (zI23 || objP24 == cl5Var6) {
                        jw50 jw50Var2 = new jw50(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar15.o0(jw50Var2);
                        objP24 = jw50Var2;
                    }
                    wha0.A(null, r060Var, (Function1) ((jhy) objP24), fetVar15, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 22:
                return a(obj, obj2);
            case 23:
                return b(obj, obj2);
            case 24:
                y560 y560Var = (y560) this.b;
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                y560Var.G(new m560(str2));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return c(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                oj60 oj60Var = (oj60) this.b;
                fet fetVar16 = (fet) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                iiy[] iiyVarArr = oj60.P1;
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    cjx.f(oj60Var.G0(), fetVar16, 8);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return g(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return h(obj, obj2);
            default:
                Exception exc = (Exception) this.b;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                exc.printStackTrace();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ pi40(Object obj, byte b) {
        this.f27027a = b;
        this.b = obj;
    }

    public /* synthetic */ pi40(Object obj, int i, byte b) {
        this.f27027a = b;
        this.b = obj;
    }
}
