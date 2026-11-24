package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.game.impl.game.navigation.AggregatorGameScreens$AggregatorPreloadGameScreen;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi;

/* JADX INFO: loaded from: classes5.dex */
public final class jdk0 implements kdk0, kyr0, mzs0, vgu0, qfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jdk0 f16332a = new jdk0();
    public static final jdk0 b = new jdk0();
    public static final jdk0 c = new jdk0();
    public static final jdk0 d = new jdk0();
    public static final jdk0 e = new jdk0();
    public static final jdk0 f = new jdk0();
    public static final jdk0 g = new jdk0();
    public static final pjv0 h = new pjv0();
    public static final jdk0 i = new jdk0();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static rh1 e(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1475966203:
                if (str.equals("brandSExtended")) {
                    return rh1.c;
                }
                break;
            case -1381030490:
                if (str.equals("brandM")) {
                    return rh1.d;
                }
                break;
            case -1381030484:
                if (str.equals("brandS")) {
                    return rh1.b;
                }
                break;
            case 778825983:
                if (str.equals("brandMExtended")) {
                    return rh1.e;
                }
                break;
        }
        return rh1.b;
    }

    public static AggregatorGameScreens$AggregatorPreloadGameScreen f(long j, String str, long j2, boolean z, long j3, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, String str2, boolean z7) {
        str.getClass();
        str2.getClass();
        return new AggregatorGameScreens$AggregatorPreloadGameScreen(j, str, j2, z, j3, z2, z3, i2, z4, z5, z6, str2, z7);
    }

    public static AggregatorProvidersFiltersUiModel g(List list, AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel, w3q... w3qVarArr) {
        list.getClass();
        aggregatorProvidersFiltersUiModel.getClass();
        long j = aggregatorProvidersFiltersUiModel.f46276a;
        List<FilterCategoryUiModel> list2 = aggregatorProvidersFiltersUiModel.b;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (FilterCategoryUiModel filterCategoryUiModel : list2) {
            String str = filterCategoryUiModel.f46277a;
            w3q w3qVar = filterCategoryUiModel.c;
            String str2 = filterCategoryUiModel.b;
            List<FilterItemUi> list3 = filterCategoryUiModel.d;
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
            for (FilterItemUi filterItemUi : list3) {
                arrayList2.add(filterItemUi.O((tx3.u(w3qVar, (w3q[]) Arrays.copyOf(w3qVarArr, w3qVarArr.length)) || (!list.isEmpty() && list.contains(filterItemUi.getF46281a()))) ? false : filterItemUi.getC()));
            }
            arrayList.add(new FilterCategoryUiModel(str, str2, w3qVar, arrayList2));
        }
        return new AggregatorProvidersFiltersUiModel(j, arrayList, aggregatorProvidersFiltersUiModel.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r1v17, types: [a.i3t0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.i3t0, java.lang.Object] */
    public void a(mm40 mm40Var, Fragment fragment, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        ?? r10;
        ?? r19;
        byte b2;
        ?? r11 = fetVar;
        function0.getClass();
        function1.getClass();
        r11.g0(1787655574);
        if ((i2 & 6) == 0) {
            i3 = (r11.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= r11.i(fragment) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= r11.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= r11.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= r11.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= r11.g(this) ? 131072 : 65536;
        }
        if (r11.U(i3 & 1, (74899 & i3) != 74898)) {
            Object objP = r11.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(jd4.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof jd4)) {
                        ze3Var = null;
                    }
                    jd4 jd4Var = (jd4) ze3Var;
                    if (jd4Var != null) {
                        i1w0 i1w0VarF = a4n0.f(fragment);
                        i1w0VarF.getClass();
                        epi0 epi0Var = jd4Var.M;
                        cad cadVar = jd4Var.f16312a;
                        b8u b8uVar = jd4Var.S;
                        zx10 zx10Var = jd4Var.e;
                        ok50 ok50Var = jd4Var.b;
                        pru pruVar = jd4Var.d;
                        pek pekVar = jd4Var.f;
                        fsd fsdVar = jd4Var.v;
                        pek0 pek0Var = jd4Var.g;
                        rl70 rl70Var = jd4Var.h;
                        dmt dmtVar = jd4Var.i;
                        jru jruVar = jd4Var.j;
                        bzt bztVar = jd4Var.k;
                        knf0 knf0Var = jd4Var.l;
                        wsf0 wsf0Var = jd4Var.z;
                        tgk tgkVar = jd4Var.m;
                        us3 us3Var = jd4Var.n;
                        wwb0 wwb0Var = jd4Var.o;
                        gii0 gii0Var = jd4Var.p;
                        btt0 btt0Var = jd4Var.q;
                        b3c0 b3c0Var = jd4Var.r;
                        vwb0 vwb0Var = jd4Var.s;
                        xwb0 xwb0Var = jd4Var.t;
                        gst0 gst0Var = jd4Var.u;
                        ii iiVar = jd4Var.D;
                        pp90 pp90Var = jd4Var.c;
                        ctf0 ctf0Var = jd4Var.w;
                        ojj ojjVar = jd4Var.x;
                        yox yoxVar = jd4Var.y;
                        cyh cyhVar = jd4Var.A;
                        qe50 qe50Var = jd4Var.B;
                        z4w0 z4w0Var = jd4Var.C;
                        kd30 kd30Var = jd4Var.E;
                        n4u n4uVar = jd4Var.F;
                        v6k v6kVar = jd4Var.G;
                        m1e m1eVar = jd4Var.H;
                        ieu ieuVar = jd4Var.I;
                        u8u u8uVar = jd4Var.J;
                        rpt rptVar = jd4Var.K;
                        bot botVar = jd4Var.L;
                        usd usdVar = jd4Var.N;
                        mi70 mi70Var = jd4Var.O;
                        svs0 svs0Var = jd4Var.P;
                        zn00 zn00Var = jd4Var.Q;
                        ilp0 ilp0Var = jd4Var.R;
                        kwd kwdVar = jd4Var.T;
                        sqx sqxVar = jd4Var.U;
                        cmt cmtVar = jd4Var.V;
                        pp90Var.getClass();
                        iiVar.getClass();
                        fsdVar.getClass();
                        knf0Var.getClass();
                        tgkVar.getClass();
                        us3Var.getClass();
                        wwb0Var.getClass();
                        gii0Var.getClass();
                        btt0Var.getClass();
                        b3c0Var.getClass();
                        vwb0Var.getClass();
                        xwb0Var.getClass();
                        gst0Var.getClass();
                        ctf0Var.getClass();
                        qe50Var.getClass();
                        m1eVar.getClass();
                        objP = new u8i(cadVar, ok50Var, pp90Var, yoxVar, wsf0Var, zx10Var, v6kVar, epi0Var, ilp0Var, b8uVar, i1w0VarF, iiVar, pruVar, pekVar, pek0Var, rl70Var, dmtVar, jruVar, bztVar, b3c0Var, ctf0Var, ojjVar, cyhVar, z4w0Var, kd30Var, n4uVar, m1eVar, ieuVar, u8uVar, cmtVar, rptVar, botVar, usdVar, mi70Var, svs0Var, zn00Var, kwdVar, sqxVar);
                        r11.o0(objP);
                    }
                }
                jf4.n(b1j.i(jd4.class, "Cannot create dependency "));
                return;
            }
            u8i u8iVar = (u8i) objP;
            sgy sgyVarB = sre0.f32672a.b(kc4.class);
            q0h0 q0h0Var = new q0h0((t8i) u8iVar.K.get());
            int i4 = kc4.Y;
            ?? r5 = (i3t0) n4c.X(sgyVarB, null, q0h0Var, r11, 14);
            pz40 pz40VarY = r5.y(r11);
            boolean zI = r11.i(r5);
            Object objP2 = r11.P();
            if (zI || objP2 == cl5Var) {
                ?? r110 = r5;
                objP2 = new j94(1, r110, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                r11.o0(objP2);
                r19 = r110;
            } else {
                r19 = r5;
            }
            Function1 function3 = (Function1) ((jhy) objP2);
            Boolean boolValueOf = Boolean.valueOf(((ob4) pz40VarY.getValue()).f24960a);
            boolean zG = ((i3 & 7168) == 2048) | r11.g(pz40VarY);
            Object objP3 = r11.P();
            if (zG || objP3 == cl5Var) {
                b2 = 0;
                objP3 = new ua4(function1, pz40VarY, null, b2);
                r11.o0(objP3);
            } else {
                b2 = 0;
            }
            m0x0.t(r11, boolValueOf, (Function2) objP3);
            int i5 = 458752 & i3;
            boolean z = (((i5 == 131072 ? (byte) 1 : b2) | (r11.i(fragment) ? 1 : 0)) == true ? 1 : 0) | (r11.i(u8iVar) ? 1 : 0) | (r11.g(function3) ? 1 : 0);
            Object objP4 = r11.P();
            if (z || objP4 == cl5Var) {
                objP4 = new on(this, fragment, u8iVar, function3);
                r11.o0(objP4);
            }
            int i6 = i3 >> 3;
            m0x0.o(fragment, (Function1) objP4, r11);
            boolean zG2 = r11.g(function3);
            Object objP5 = r11.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new zk2(function3, (byte) 20);
                r11.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean zG3 = r11.g(function3);
            Object objP6 = r11.P();
            if (zG3 || objP6 == cl5Var) {
                objP6 = new zk2(function3, (byte) 21);
                r11.o0(objP6);
            }
            v3c.A(function4, (Function0) objP6, null, r11, 0, 4);
            ahy.d(mm40Var, (ob4) pz40VarY.getValue(), function3, function2, fetVar, (i3 & 14) | (i6 & 7168));
            ?? r12 = fetVar;
            boolean zI2 = r12.i(fragment) | (i5 == 131072) | r12.i(u8iVar) | r12.g(function3) | ((i3 & 896) == 256);
            Object objP7 = r12.P();
            if (zI2 || objP7 == cl5Var) {
                dc0 dc0Var = new dc0(this, fragment, u8iVar, function3, function0);
                r12.o0(dc0Var);
                objP7 = dc0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP7, r12);
            boolean zI3 = r12.i(r19) | r12.i(fragment) | r12.e(3) | r12.g(pz40VarF);
            Object objP8 = r12.P();
            if (zI3 || objP8 == cl5Var) {
                ta4 ta4Var = new ta4(r19, fragment, pz40VarF, null, (byte) 0);
                r12.o0(ta4Var);
                objP8 = ta4Var;
            }
            m0x0.t(r12, fragment, (Function2) objP8);
            r10 = r12;
        } else {
            r11.X();
            r10 = r11;
        }
        yfe0 yfe0VarU = r10.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0(this, mm40Var, fragment, function0, function1, function2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public void b(final mm40 mm40Var, final float f2, float f3, long j, yjj0 yjj0Var, fet fetVar, final int i2, final int i3) {
        float f4;
        int i4;
        long jD;
        int i5;
        int i6;
        yjj0 yjj0Var2;
        int i7;
        int i8;
        boolean z;
        final float f5;
        final long j2;
        final yjj0 yjj0Var3;
        yfe0 yfe0VarU;
        float f6;
        fetVar.g0(-1895596205);
        int i9 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i9 |= fetVar.d(f2) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 = i9 | 384;
            f4 = f3;
        } else {
            f4 = f3;
            i4 = i9 | (fetVar.d(f4) ? 256 : 128);
        }
        if ((i3 & 8) == 0) {
            jD = j;
            int i11 = fetVar.f(jD) ? 2048 : 1024;
            i5 = i4 | i11;
            i6 = i3 & 16;
            if (i6 != 0) {
                i8 = i5 | 24576;
                yjj0Var2 = yjj0Var;
            } else {
                yjj0Var2 = yjj0Var;
                if (fetVar.g(yjj0Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i8 = i5 | i7;
            }
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i8 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0 || fetVar.B()) {
                    if (i10 != 0) {
                        f6 = ovb0.b;
                    } else {
                        f6 = f4;
                    }
                    if ((i3 & 8) != 0) {
                        jD = v4d.d(ovb0.f25917a, fetVar);
                    }
                    if (i6 != 0) {
                        yjj0Var2 = ovb0.c;
                    }
                } else {
                    fetVar.X();
                    f6 = f4;
                }
                fetVar.s();
                qxw.o(fetVar, i120.Q(o7k0.l(o7k0.h(mm40Var, f6), f2), jD, yjj0Var2));
                f5 = f6;
            } else {
                fetVar.X();
                f5 = f4;
            }
            j2 = jD;
            yjj0Var3 = yjj0Var2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ido0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.f14596a.b(mm40Var, f2, f5, j2, yjj0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        jD = j;
        i5 = i4 | i11;
        i6 = i3 & 16;
        if (i6 != 0) {
            i8 = i5 | 24576;
            yjj0Var2 = yjj0Var;
        } else {
            yjj0Var2 = yjj0Var;
            if (fetVar.g(yjj0Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i8 = i5 | i7;
        }
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i8 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    f6 = ovb0.b;
                } else {
                    f6 = f4;
                }
                if ((i3 & 8) != 0) {
                    jD = v4d.d(ovb0.f25917a, fetVar);
                }
                if (i6 != 0) {
                    yjj0Var2 = ovb0.c;
                }
            } else {
                if (i10 != 0) {
                    f6 = ovb0.b;
                } else {
                    f6 = f4;
                }
                if ((i3 & 8) != 0) {
                    jD = v4d.d(ovb0.f25917a, fetVar);
                }
                if (i6 != 0) {
                    yjj0Var2 = ovb0.c;
                }
            }
            fetVar.s();
            qxw.o(fetVar, i120.Q(o7k0.l(o7k0.h(mm40Var, f6), f2), jD, yjj0Var2));
            f5 = f6;
        } else {
            fetVar.X();
            f5 = f4;
        }
        j2 = jD;
        yjj0Var3 = yjj0Var2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ido0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f14596a.b(mm40Var, f2, f5, j2, yjj0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    @Override // a.mzs0
    public hzs0 c(are0 are0Var) {
        are0Var.getClass();
        return null;
    }

    @Override // a.vgu0
    public Function0 d(x1 x1Var) {
        sgu0 sgu0Var = new sgu0(x1Var, (byte) 0);
        x1Var.addOnAttachStateChangeListener(sgu0Var);
        return new yip0((Object) x1Var, (Object) sgu0Var, (byte) 29);
    }

    @Override // a.qfw0
    public boolean zzb(Class cls) {
        return mew0.class.isAssignableFrom(cls);
    }

    @Override // a.qfw0
    public cgw0 zzc(Class cls) {
        if (!mew0.class.isAssignableFrom(cls)) {
            jf4.o("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (cgw0) mew0.l(cls.asSubclass(mew0.class)).q(3);
        } catch (Exception e2) {
            e9d0.m("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }
}
