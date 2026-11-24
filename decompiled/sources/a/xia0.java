package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.net.Uri;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.io.EOFException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f40936a = new ugd(954879418, false, new qbd((byte) 29));
    public static final ugd b = new ugd(1918065384, false, new chd(0));
    public static final ugd c = new ugd(626044814, false, new fhd(0));
    public static final ugd d = new ugd(45271329, false, new lhd(13));
    public static final ugd e = new ugd(-2116571792, false, new qhd(9));

    public static final void A(mm40 mm40Var, String str, n0x n0xVar, boolean z, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1144717533);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(n0xVar) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarF = phu0.F(mm40Var, null, (d6x) fetVar2.k(a6x.f338a), false, null, function0, fetVar, (i2 & 14) | ((i2 << 3) & 458752), 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 48.0f), vgg0.f37379a);
            mz3 mz3VarT = lv00.T(n0xVar, new m0x(R.drawable.ic_aggregator_180_180, null, 6), null, null, fetVar, (i2 >> 6) & 14, 12);
            pge pgeVar = gqw0.A;
            j0x.b(mz3VarT, null, mm40VarJ, null, pgeVar, 0.0f, null, fetVar, 24624, 104);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            long jE = z ? cs0.e(fetVar, -1329499488, fetVar, false) : rz4.c(fetVar, -1329498492, fetVar, false);
            afn0.v(fetVar).getClass();
            v8q0.a(str, mm40VarN, jE, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i2 >> 3) & 14, 24960, 110584);
            if (z) {
                fetVar.e0(1735418234);
                j0x.b(lv00.T(new m0x(R.drawable.active_tab_indicator, null, 6), null, null, null, fetVar, 0, 14), null, s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(1735758800);
                qxw.o(fetVar2, o7k0.e(jm40Var, 5.0f));
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hp0(mm40Var, str, n0xVar, z, function0, i, (byte) 1);
        }
    }

    public static final void B(final mm40 mm40Var, final String str, final m0x m0xVar, final long j, final long j2, final boolean z, final Function0 function0, fet fetVar, final int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1706036893);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(m0xVar) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024) | (fetVar2.f(j2) ? 16384 : 8192) | (fetVar2.h(z) ? 131072 : 65536) | (fetVar2.i(function0) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = i2 >> 3;
            mm40 mm40VarF = phu0.F(mm40Var, null, (d6x) fetVar2.k(a6x.f338a), false, null, function0, fetVar, (i2 & 14) | (i3 & 458752), 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 48.0f), j, vgg0.a(360.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            j0x.b(lv00.T(m0xVar, new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6), null, null, fetVar, (i2 >> 6) & 14, 12), null, jr8Var.b(mm40VarN, zx7Var), null, gqw0.A, 0.0f, new m78(j2, 5), fetVar, 24624, 40);
            if (z) {
                fetVar.e0(989484123);
                thb.f(jr8Var.b(jm40Var, gqw0.c), new lf5(3, null), fetVar, 48, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(989651337);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN2, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, i3 & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(str, m0xVar, j, j2, z, function0, i) { // from class: a.lp0
                public final /* synthetic */ String b;
                public final /* synthetic */ m0x c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Function0 g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    xia0.B(this.f20416a, this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.fet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r5v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.ugd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void C(int i, fet fetVar, final a4x a4xVar, mm40 mm40Var, Function2 function2) {
        mm40 mm40Var2;
        ?? r5;
        Object obj;
        Object obj2;
        float f;
        Object obj3;
        final SnapshotStateList snapshotStateList;
        float f2;
        final i050 i050Var;
        final vne vneVar;
        final float f3;
        final pz40 pz40Var;
        final rcq0 rcq0Var;
        final agk0 agk0Var;
        ?? r3;
        final float f4;
        a4x a4xVar2;
        uts0 uts0Var;
        SnapshotStateList snapshotStateList2;
        t33 t33Var;
        Object obj4;
        jm40 jm40Var;
        boolean z;
        boolean z2;
        ?? r6;
        ?? r7;
        int i2;
        Object objB;
        Object obj5;
        jm40 jm40Var2;
        mm40 mm40Var3;
        Object w53Var;
        zx7 zx7Var;
        i050 i050Var2;
        pz40 pz40Var2;
        int i3;
        pz40 pz40Var3;
        uts0 uts0Var2;
        rcq0 rcq0Var2;
        float f5;
        ?? r8 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        ?? r9 = hew0.f12945a;
        zx7 zx7Var2 = gqw0.f11754a;
        Float fValueOf = Float.valueOf(0.0f);
        r8.g0(-1616932325);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= r8.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= r8.i(r9) ? 2048 : 1024;
        }
        if (r8.U(i4 & 1, (i4 & 1171) != 1170)) {
            float f6 = ((Configuration) r8.k(dy2.f6873a)).screenWidthDp;
            Object objP = r8.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj6 = objP;
            if (objP == cl5Var) {
                rcq0 rcq0Var3 = new rcq0();
                r8.o0(rcq0Var3);
                obj6 = rcq0Var3;
            }
            rcq0 rcq0Var4 = (rcq0) obj6;
            Object objP2 = r8.P();
            if (objP2 == cl5Var) {
                zsf zsfVar = new zsf(0.42f, 0.0f, 0.58f, 1.0f);
                r8.o0(zsfVar);
                obj = zsfVar;
            } else {
                obj = objP2;
            }
            zsf zsfVar2 = (zsf) obj;
            Object objP3 = r8.P();
            if (objP3 == cl5Var) {
                uts0 uts0VarM0 = ro4.m0(500, 0, zsfVar2, 2);
                r8.o0(uts0VarM0);
                obj2 = uts0VarM0;
            } else {
                obj2 = objP3;
            }
            uts0 uts0Var3 = (uts0) obj2;
            Object objP4 = r8.P();
            Object obj7 = objP4;
            if (objP4 == cl5Var) {
                vne vneVarI = m0x0.I(kotlin.coroutines.g.f46065a, r8);
                r8.o0(vneVarI);
                obj7 = vneVarI;
            }
            vne vneVar2 = (vne) obj7;
            w6k w6kVar = (w6k) r8.k(bmd.h);
            Object objP5 = r8.P();
            Object obj8 = objP5;
            if (objP5 == cl5Var) {
                pz40 pz40VarE = androidx.compose.runtime.e.e(olx.f25479a);
                r8.o0(pz40VarE);
                obj8 = pz40VarE;
            }
            pz40 pz40Var4 = (pz40) obj8;
            Object objP6 = r8.P();
            Object obj9 = objP6;
            if (objP6 == cl5Var) {
                k050 k050Var = new k050();
                r8.o0(k050Var);
                obj9 = k050Var;
            }
            i050 i050Var3 = (i050) obj9;
            Object objP7 = r8.P();
            if (objP7 == cl5Var) {
                f = 0.0f;
                agk0 agk0VarA = androidx.compose.runtime.e.a(0.0f);
                r8.o0(agk0VarA);
                obj3 = agk0VarA;
            } else {
                f = 0.0f;
                obj3 = objP7;
            }
            agk0 agk0Var2 = (agk0) obj3;
            Object objP8 = r8.P();
            Object obj10 = objP8;
            if (objP8 == cl5Var) {
                agk0 agk0VarA2 = androidx.compose.runtime.e.a(f);
                r8.o0(agk0VarA2);
                obj10 = agk0VarA2;
            }
            agk0 agk0Var3 = (agk0) obj10;
            Object objP9 = r8.P();
            Object obj11 = objP9;
            if (objP9 == cl5Var) {
                t33 t33VarC = xf0.c(f);
                r8.o0(t33VarC);
                obj11 = t33VarC;
            }
            t33 t33Var2 = (t33) obj11;
            Object objP10 = r8.P();
            if (objP10 == cl5Var) {
                Float[] fArr = {fValueOf, fValueOf, fValueOf, fValueOf, fValueOf};
                SnapshotStateList snapshotStateList3 = new SnapshotStateList();
                snapshotStateList3.addAll(tx3.g0(fArr));
                r8.o0(snapshotStateList3);
                objP10 = snapshotStateList3;
            }
            SnapshotStateList snapshotStateList4 = (SnapshotStateList) objP10;
            Object objP11 = r8.P();
            Object obj12 = objP11;
            if (objP11 == cl5Var) {
                Float fValueOf2 = Float.valueOf(w6kVar.w0(f6));
                r8.o0(fValueOf2);
                obj12 = fValueOf2;
            }
            final float fFloatValue = ((Number) obj12).floatValue();
            Object objP12 = r8.P();
            Object objJ = objP12;
            if (objP12 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                if (ycl.a(f6, 560.0f) >= 0) {
                    f5 = 320.0f;
                } else {
                    f5 = ycl.a(f6, 360.0f) >= 0 ? 280.0f : 256.0f;
                }
                objJ = twn.j(f5, r8);
            }
            ycl yclVar = (ycl) objJ;
            float f7 = yclVar.f42389a;
            Object objP13 = r8.P();
            Object obj13 = objP13;
            if (objP13 == cl5Var) {
                Float fValueOf3 = Float.valueOf(w6kVar.w0(f7));
                r8.o0(fValueOf3);
                obj13 = fValueOf3;
            }
            float fFloatValue2 = ((Number) obj13).floatValue();
            Object objP14 = r8.P();
            Object obj14 = objP14;
            if (objP14 == cl5Var) {
                Float fValueOf4 = Float.valueOf(0.55f * fFloatValue2);
                r8.o0(fValueOf4);
                obj14 = fValueOf4;
            }
            float fFloatValue3 = ((Number) obj14).floatValue();
            Unit unit = Unit.f46060a;
            Object objP15 = r8.P();
            Object obj15 = objP15;
            if (objP15 == cl5Var) {
                z53 z53Var = new z53(fFloatValue, snapshotStateList4, fFloatValue2, null);
                r8.o0(z53Var);
                obj15 = z53Var;
            }
            m0x0.t(r8, unit, (Function2) obj15);
            int i5 = i4 & 112;
            boolean zI = (i5 == 32 || ((i4 & 64) != 0 && fetVar.i(a4xVar))) | r8.i(vneVar2) | r8.i(i050Var3);
            Object objP16 = r8.P();
            if (zI || objP16 == cl5Var) {
                snapshotStateList = snapshotStateList4;
                f2 = f7;
                i050Var = i050Var3;
                vneVar = vneVar2;
                f3 = fFloatValue2;
                pz40Var = pz40Var4;
                rcq0Var = rcq0Var4;
                agk0Var = agk0Var2;
                r3 = 0;
                Function1 function1 = new Function1() { // from class: a.u53
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj16) {
                        float fFloatValue4 = ((Float) obj16).floatValue();
                        a4x a4xVar3 = a4xVar;
                        if (a4xVar3.size() <= 1) {
                            return Unit.f46060a;
                        }
                        qjj.W(vneVar, null, null, new g63(fFloatValue, i050Var, fFloatValue4, f3, snapshotStateList, rcq0Var, a4xVar3, pz40Var, agk0Var, null), 3);
                        return Unit.f46060a;
                    }
                };
                f4 = fFloatValue;
                r8.o0(function1);
                objP16 = function1;
            } else {
                f4 = fFloatValue;
                f2 = f7;
                i050Var = i050Var3;
                vneVar = vneVar2;
                f3 = fFloatValue2;
                pz40Var = pz40Var4;
                rcq0Var = rcq0Var4;
                agk0Var = agk0Var2;
                r3 = 0;
                snapshotStateList = snapshotStateList4;
            }
            wel welVarB = uel.b((Function1) objP16, r8);
            ma80 ma80Var = ma80.b;
            Object objP17 = r8.P();
            Object obj16 = objP17;
            if (objP17 == cl5Var) {
                a63 a63Var = new a63(pz40Var, null, r3);
                r8.o0(a63Var);
                obj16 = a63Var;
            }
            xdr xdrVar = (xdr) obj16;
            int i6 = ((i5 == 32 || ((i4 & 64) != 0 && fetVar.i(a4xVar))) ? 1 : r3) | (r8.i(t33Var2) ? 1 : 0) | (r8.i(i050Var) ? 1 : 0);
            Object objP18 = r8.P();
            if (i6 != 0 || objP18 == cl5Var) {
                a4xVar2 = a4xVar;
                pz40 pz40Var5 = pz40Var;
                agk0 agk0Var4 = agk0Var;
                uts0Var = uts0Var3;
                i050 i050Var4 = i050Var;
                snapshotStateList2 = snapshotStateList;
                t33Var = t33Var2;
                b63 b63Var = new b63(a4xVar2, pz40Var5, agk0Var4, fFloatValue3, f3, t33Var, uts0Var, i050Var4, snapshotStateList2, agk0Var3, null);
                i050Var = i050Var4;
                pz40Var = pz40Var5;
                r8.o0(b63Var);
                objP18 = b63Var;
            } else {
                a4xVar2 = a4xVar;
                snapshotStateList2 = snapshotStateList;
                uts0Var = uts0Var3;
                t33Var = t33Var2;
            }
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarA = uel.a(jm40Var3, welVarB, ma80Var, false, false, xdrVar, (xdr) objP18, 156);
            uts0 uts0Var4 = uts0Var;
            jm40 jm40Var4 = jm40Var3;
            tj30 tj30VarC = zq8.c(zx7Var2, r3);
            int iHashCode = Long.hashCode(r8.T);
            bh90 bh90VarM = r8.m();
            mm40 mm40VarC0 = kbc.c0(r8, mm40VarA);
            mkd.c0.getClass();
            r8.i0();
            zx7 zx7Var3 = zx7Var2;
            boolean z3 = r8.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                r8.l(pcyVar);
            } else {
                r8.r0();
            }
            pz40 pz40Var6 = pz40Var;
            shd shdVar5 = shdVar4;
            jpm0.o(r8, tj30VarC, shdVar5);
            shd shdVar6 = shdVar3;
            jpm0.o(r8, bh90VarM, shdVar6);
            shd shdVar7 = shdVar2;
            vqd.u(iHashCode, r8, shdVar7, r8);
            shd shdVar8 = shdVar;
            jpm0.o(r8, mm40VarC0, shdVar8);
            zcl zclVar2 = qmk.f28987a;
            int i7 = i4;
            mm40 mm40VarE = o7k0.e(jm40Var4, 320.0f);
            boolean zI2 = r8.i(t33Var);
            Object objP19 = r8.P();
            if (zI2 || objP19 == cl5Var) {
                e63 e63Var = new e63(f3, snapshotStateList2, t33Var, (byte) 0);
                r8.o0(e63Var);
                obj4 = e63Var;
            } else {
                obj4 = objP19;
            }
            tj30 tj30Var = (tj30) obj4;
            final float f8 = f3;
            int iHashCode2 = Long.hashCode(r8.T);
            bh90 bh90VarM2 = r8.m();
            mm40 mm40VarC1 = kbc.c0(r8, mm40VarE);
            r8.i0();
            final t33 t33Var3 = t33Var;
            if (r8.S) {
                r8.l(pcyVar);
            } else {
                r8.r0();
            }
            jpm0.o(r8, tj30Var, shdVar5);
            jpm0.o(r8, bh90VarM2, shdVar6);
            vqd.u(iHashCode2, r8, shdVar7, r8);
            jpm0.o(r8, mm40VarC1, shdVar8);
            boolean z4 = true;
            if (a4xVar2.size() > 1) {
                r8.e0(1291943241);
                int i8 = 0;
                while (i8 < 5) {
                    boolean zD = r8.d(((Number) t33Var3.d()).floatValue()) | r8.e(i8);
                    Object objP20 = r8.P();
                    if (zD || objP20 == cl5Var) {
                        final int i9 = i8;
                        final SnapshotStateList snapshotStateList5 = snapshotStateList2;
                        i2 = i9;
                        objB = jgk0.b(new Function0() { // from class: a.v53
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(1.0f - (Math.abs(((((Number) t33Var3.d()).floatValue() + ((Number) snapshotStateList5.get(i9)).floatValue()) - (f4 / 2.0f)) / f8) * 0.2f));
                            }
                        });
                        r8.o0(objB);
                    } else {
                        i2 = i8;
                        objB = objP20;
                    }
                    l7m0 l7m0Var = (l7m0) objB;
                    boolean zD2 = r8.d(((Number) l7m0Var.getValue()).floatValue());
                    Object objP21 = r8.P();
                    Object obj17 = objP21;
                    if (zD2 || objP21 == cl5Var) {
                        float fFloatValue4 = ((Number) l7m0Var.getValue()).floatValue();
                        Boolean boolValueOf = Boolean.valueOf(0.7f <= fFloatValue4 && fFloatValue4 <= 0.85f);
                        r8.o0(boolValueOf);
                        obj17 = boolValueOf;
                    }
                    boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                    boolean zD3 = r8.d(((Number) l7m0Var.getValue()).floatValue());
                    pcy pcyVar2 = pcyVar;
                    Object objP22 = r8.P();
                    Object obj18 = objP22;
                    if (zD3 || objP22 == cl5Var) {
                        Boolean boolValueOf2 = Boolean.valueOf(((Number) l7m0Var.getValue()).floatValue() > 0.9f);
                        r8.o0(boolValueOf2);
                        obj18 = boolValueOf2;
                    }
                    boolean zBooleanValue2 = ((Boolean) obj18).booleanValue();
                    f8 = f8;
                    rcq0 rcq0Var5 = rcq0Var;
                    boolean zE = r8.e(rcq0Var5.f30253a.l()) | r8.e(i2);
                    Object objP23 = r8.P();
                    Object obj19 = objP23;
                    if (zE || objP23 == cl5Var) {
                        int iL = rcq0Var5.f30253a.l() + (i2 - (snapshotStateList2.size() / 2));
                        int size = a4xVar2.size();
                        int i10 = iL % size;
                        if (i10 < 0) {
                            i10 += size;
                        }
                        cgk0 cgk0VarB = androidx.compose.runtime.e.b(i10);
                        r8.o0(cgk0VarB);
                        obj19 = cgk0VarB;
                    }
                    cgk0 cgk0Var = (cgk0) obj19;
                    shd shdVar9 = shdVar8;
                    boolean zE2 = r8.e(cgk0Var.l()) | (i5 == 32 || ((i7 & 64) != 0 && fetVar.g(a4xVar)));
                    Object objP24 = r8.P();
                    Object obj20 = objP24;
                    if (zE2 || objP24 == cl5Var) {
                        pz40 pz40VarE2 = androidx.compose.runtime.e.e(a4xVar2.get(cgk0Var.l()));
                        r8.o0(pz40VarE2);
                        obj20 = pz40VarE2;
                    }
                    pz40 pz40Var7 = (pz40) obj20;
                    zcl zclVar3 = qmk.f28987a;
                    float f9 = f2;
                    mm40 mm40VarP = o7k0.p(jm40Var4, f9, 320.0f);
                    boolean zG = r8.g(l7m0Var);
                    Object objP25 = r8.P();
                    if (zG || objP25 == cl5Var) {
                        yd1 yd1Var = new yd1(l7m0Var, (byte) 15);
                        r8.o0(yd1Var);
                        obj5 = yd1Var;
                    } else {
                        obj5 = objP25;
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarP, (Function1) obj5);
                    if (zBooleanValue2) {
                        r8.e0(1910435698);
                        zfn zfnVar = m8m0.f21378a;
                        jm40Var2 = jm40Var4;
                        mm40 mm40VarU = bww.U(jm40Var2, 16.0f, null, ((StaticColors) r8.k(zfnVar)).m70getBlack200d7_KjU(), ((StaticColors) r8.k(zfnVar)).m70getBlack200d7_KjU(), 6);
                        r8.r(false);
                        mm40Var3 = mm40VarU;
                    } else {
                        jm40Var2 = jm40Var4;
                        r8.e0(1910771335);
                        r8.r(false);
                        mm40Var3 = jm40Var2;
                    }
                    mm40 mm40VarE2 = mm40VarT.e(mm40Var3);
                    vne vneVar3 = vneVar;
                    i050 i050Var5 = i050Var;
                    boolean zH = r8.h(zBooleanValue) | r8.i(vneVar3) | r8.e(i2) | r8.i(i050Var5) | (i5 == 32 || ((i7 & 64) != 0 && fetVar.i(a4xVar))) | r8.i(t33Var3) | r8.h(zBooleanValue2);
                    int i11 = i7;
                    int i12 = i5;
                    boolean zG2 = ((i11 & 896) == 256) | zH | r8.g(pz40Var7);
                    Object objP26 = r8.P();
                    if (zG2 || objP26 == cl5Var) {
                        zx7Var = zx7Var3;
                        uts0 uts0Var5 = uts0Var4;
                        i050Var2 = i050Var5;
                        t33 t33Var4 = t33Var3;
                        SnapshotStateList snapshotStateList6 = snapshotStateList2;
                        pz40 pz40Var8 = pz40Var6;
                        w53Var = new w53(zBooleanValue, pz40Var8, vneVar3, zBooleanValue2, function2, pz40Var7, snapshotStateList6, i2, f8, i050Var2, t33Var4, uts0Var5, f4, rcq0Var5, a4xVar, (byte) 0);
                        int i13 = i2;
                        pz40Var2 = pz40Var8;
                        vneVar3 = vneVar3;
                        i3 = i13;
                        pz40Var3 = pz40Var7;
                        t33Var3 = t33Var4;
                        uts0Var2 = uts0Var5;
                        snapshotStateList2 = snapshotStateList6;
                        rcq0Var2 = rcq0Var5;
                        r8.o0(w53Var);
                    } else {
                        zx7Var = zx7Var3;
                        pz40Var3 = pz40Var7;
                        w53Var = objP26;
                        rcq0Var2 = rcq0Var5;
                        uts0Var2 = uts0Var4;
                        i050Var2 = i050Var5;
                        i3 = i2;
                        pz40Var2 = pz40Var6;
                    }
                    mm40 mm40VarY = y860.Y(mm40VarE2, false, null, null, (Function0) w53Var, 15);
                    uts0 uts0Var6 = uts0Var2;
                    vneVar = vneVar3;
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(r8.T);
                    bh90 bh90VarM3 = r8.m();
                    mm40 mm40VarC2 = kbc.c0(r8, mm40VarY);
                    mkd.c0.getClass();
                    r8.i0();
                    zx7 zx7Var4 = zx7Var;
                    if (r8.S) {
                        r8.l(pcyVar2);
                    } else {
                        r8.r0();
                    }
                    jpm0.o(r8, tj30VarC2, shdVar5);
                    jpm0.o(r8, bh90VarM3, shdVar6);
                    vqd.u(iHashCode3, r8, shdVar7, r8);
                    jpm0.o(r8, mm40VarC2, shdVar9);
                    r9.O(pz40Var3.getValue(), Integer.valueOf(cgk0Var.l()), yclVar, r8, Integer.valueOf(384 | (i11 & 7168)));
                    r8.r(true);
                    a4xVar2 = a4xVar;
                    z4 = true;
                    i8 = i3 + 1;
                    t33Var3 = t33Var3;
                    rcq0Var = rcq0Var2;
                    pz40Var6 = pz40Var2;
                    i050Var = i050Var2;
                    shdVar7 = shdVar7;
                    shdVar8 = shdVar9;
                    f2 = f9;
                    jm40Var4 = jm40Var2;
                    zx7Var3 = zx7Var4;
                    cl5Var = cl5Var;
                    shdVar6 = shdVar6;
                    shdVar5 = shdVar5;
                    uts0Var4 = uts0Var6;
                    i5 = i12;
                    i7 = i11;
                    pcyVar = pcyVar2;
                }
                r8.r(false);
                z2 = z4;
                jm40Var = jm40Var4;
                r7 = r8;
            } else {
                float f10 = f2;
                r8.e0(1297750223);
                boolean z5 = i5 == 32 || ((i7 & 64) != 0 && fetVar.g(a4xVar));
                Object objP27 = r8.P();
                Object obj21 = objP27;
                if (z5 || objP27 == cl5Var) {
                    vpl vplVar = (vpl) CollectionsKt.f0(a4xVar);
                    r8.o0(vplVar);
                    obj21 = vplVar;
                }
                vpl vplVar2 = (vpl) obj21;
                if (vplVar2 == null) {
                    r8.e0(1297857296);
                    r8.r(false);
                    z2 = true;
                    z = false;
                    jm40Var = jm40Var4;
                    r6 = r8;
                } else {
                    r8.e0(1297857297);
                    mm40 mm40VarP2 = o7k0.p(jm40Var4, f10, 320.0f);
                    boolean zI3 = ((i7 & 896) == 256) | r8.i(vplVar2);
                    Object objP28 = r8.P();
                    Object obj22 = objP28;
                    if (zI3 || objP28 == cl5Var) {
                        x53 x53Var = new x53(function2, vplVar2, (byte) 0);
                        r8.o0(x53Var);
                        obj22 = x53Var;
                    }
                    jm40Var = jm40Var4;
                    z = false;
                    z2 = true;
                    mm40 mm40VarF = phu0.F(mm40VarP2, null, null, false, null, (Function0) obj22, fetVar, 0, 15);
                    fet fetVar2 = fetVar;
                    tj30 tj30VarC3 = zq8.c(zx7Var3, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarF);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, shdVar5);
                    jpm0.o(fetVar2, bh90VarM4, shdVar6);
                    vqd.u(iHashCode4, fetVar2, shdVar7, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar8);
                    r26.O(vplVar2, Integer.valueOf(a4xVar.size() - 1), r28, fetVar2, Integer.valueOf(384 | (i7 & 7168)));
                    fetVar2.r(true);
                    fetVar2.r(false);
                    r6 = fetVar2;
                }
                r6.r(z);
                r7 = r6;
            }
            r7.r(z2);
            r7.r(z2);
            mm40Var2 = jm40Var;
            r5 = r7;
        } else {
            r8.X();
            mm40Var2 = mm40Var;
            r5 = r8;
        }
        yfe0 yfe0VarU = r5.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y53(mm40Var2, a4xVar, function2, i);
        }
    }

    public static final void D(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(410854656);
        byte b2 = 16;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (((frz) l7m0Var.getValue()).d) {
            fetVar.e0(-885474597);
            j(((frz) l7m0Var.getValue()).e, function1, fetVar, i2 & 112);
            fetVar.r(false);
        } else {
            fetVar.e0(-885544285);
            q(l7m0Var, function1, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, b2);
        }
    }

    public static final void E(hh80 hh80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        fetVar.g0(962959202);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hh80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            frz frzVar = (frz) l7m0Var2.getValue();
            if (frzVar.c) {
                fetVar.e0(1985831594);
                H(0, fetVar);
            } else {
                fetVar.e0(1431244960);
            }
            fetVar.r(false);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, hh80Var.d(), 0.0f, 0.0f, 13);
            boolean zG = ((i2 & 14) == 4) | fetVar.g(frzVar) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new k9v((Object) frzVar, (Object) hh80Var, (Object) function1, (byte) 18);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new soz(hh80Var, l7m0Var, function1, i, (byte) 3);
        }
    }

    public static final void F(mm40 mm40Var, String str, ugd ugdVar, fet fetVar) {
        zfn zfnVar = m8m0.f21378a;
        long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m126getWhite200d7_KjU();
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarQ = i120.Q(mm40Var, jM126getWhite200d7_KjU, vgg0.a(12.0f));
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = r71.n;
            fetVar.o0(objP);
        }
        tj30 tj30Var = (tj30) objP;
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
        mkd.c0.getClass();
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(e7z.u1);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, tj30Var, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        ugdVar.invoke(fetVar, 6);
        String strL = ttm0.L(11, str);
        pz40 pz40Var = s6t0.f31722a;
        v8q0.a(strL, null, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24576, 114682);
        fetVar.r(true);
    }

    public static final void G(mm40 mm40Var, ftr ftrVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1378118334);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ftrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            d9z d9zVarA = f9z.a(fetVar);
            int i3 = i2 & 896;
            boolean zG = fetVar.g(d9zVarA) | (i3 == 256);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new pd0(d9zVarA, function1, null, (byte) 3);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5), fetVar);
            boolean z = ((i2 & 112) == 32) | (i3 == 256) | ((i2 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new gdr0(ftrVar, function1, function2);
                fetVar.o0(objP2);
            }
            uzb.z(n0qVar, ch80VarG, d9zVarA, false, (Function2) objP2, fetVar, 0, 8);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(mm40Var2, (Object) ftrVar, function1, function2, i, (byte) 20);
        }
    }

    public static final void H(int i, fet fetVar) {
        fetVar.g0(-1577774778);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarE = k7n0.H(jm40.b, 2.0f).e(o7k0.c);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new pcy((byte) 27);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarE, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hvy(i, (byte) 23);
        }
    }

    public static final void I(hh80 hh80Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-68929220);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hh80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 3;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(s5x0.I(k7n0.H(jm40Var, 2.0f).e(o7k0.c), hh80Var), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new th50((byte) 17);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 14);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(jm40Var, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(hh80Var, i, b2);
        }
    }

    public static final void J(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-1570069706);
        int i2 = i | 6;
        byte b2 = 5;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5), fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new i9v0((byte) 18);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            uzb.z(n0qVar, ch80VarG, null, false, (Function2) objP, fetVar2, 24576, 12);
            mm40Var = jm40.b;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tsu0(mm40Var, i, b2);
        }
    }

    public static final void K(hh80 hh80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(773302544);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hh80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new t560(l7m0Var, function1);
                fetVar.o0(objP);
            }
            t560 t560Var = (t560) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new s560();
                fetVar.o0(objP2);
            }
            s560 s560Var = (s560) objP2;
            if (((q560) l7m0Var.getValue()).c.length() > 0) {
                fetVar.e0(-748093025);
                n0q n0qVar = o7k0.c;
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                mm40 mm40VarI = s5x0.I(n0qVar, hh80Var);
                boolean zI = ((i2 & 112) == 32) | fetVar.i(t560Var) | fetVar.i(s560Var);
                Object objP3 = fetVar.P();
                if (zI || objP3 == cl5Var) {
                    objP3 = new jl40((Object) l7m0Var, (Object) t560Var, (Object) s560Var, (byte) 10);
                    fetVar.o0(objP3);
                }
                dwi0.b((Function1) objP3, mm40VarI, null, fetVar, 0, 4);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(-746660174);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new soz(hh80Var, l7m0Var, function1, i, (byte) 4);
        }
    }

    public static final void L(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1386383300);
        byte b2 = 4;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            m8x.y(o7k0.c, u1c.M(-1958368256, new r560(new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.identification, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null), function1, b3), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), 0L, null, u1c.M(-1735130101, new dqz(l7m0Var, function1, b2), fetVar), fetVar, 805306422, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, (byte) 24);
        }
    }

    public static final void M(mm40 mm40Var, n0x n0xVar, m0x m0xVar, fet fetVar, int i) {
        fetVar.g0(-718669331);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(n0xVar) ? 32 : 16) | (fetVar.g(m0xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ap5();
                fetVar.o0(objP);
            }
            ap5 ap5Var = (ap5) objP;
            fetVar.e0(848519717);
            k1x k1xVar = new k1x(context);
            k1xVar.c = Integer.valueOf(m0xVar.f20977a);
            mz3 mz3VarX = l7x.X(k1xVar.a(), null, null, fetVar, 0, 30);
            fetVar.r(false);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarE, vgg0.a(20.0f));
            k1x k1xVar2 = new k1x(context);
            k1xVar2.c = n0xVar.a();
            kuo kuoVar = q1x.f27974a;
            q1x.b(k1xVar2, tx3.g0(new lls0[]{ap5Var}));
            k7x.b(k1xVar2.a(), null, mm40VarJ, mz3VarX, mz3VarX, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, n0xVar, m0xVar, i, (byte) 26);
        }
    }

    public static final void N(mm40 mm40Var, l0b0 l0b0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1285001328);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l0b0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            rdo0 rdo0Var = (rdo0) fetVar.k(sdo0.f32043a);
            boolean zG = fetVar.g(xczVarA) | fetVar.g(rdo0Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new fkg(xczVarA, rdo0Var, null, b2);
                fetVar.o0(objP);
            }
            pvm0.e((Function2) objP, fetVar, 0);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = k7x.S(o2e.e0(jm40Var, "POPULAR_AGGREGATOR_TAB_COLUMN").e(o7k0.c), xczVarA);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new zga0((Object) l0b0Var, (Object) function1, (byte) 17);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40Var;
            b8k0.e(mm40VarS, xczVarA, ch80VarG, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, l0b0Var, function1, i, (byte) 14);
        }
    }

    public static final void O(mm40 mm40Var, m0b0 m0b0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        fetVar.g0(1461646896);
        if ((i & 48) == 0) {
            i2 = (fetVar.g(m0b0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 145) != 144)) {
            float fT = knm0.t(1, fetVar, false);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, fT, 7);
            mdm mdmVar = m0b0Var.f20946a;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new wta0(function1, (byte) 13);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, m0b0Var, function1, i, (byte) 15);
        }
    }

    public static final void P(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        l7m0Var.getClass();
        fetVar.g0(938077019);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wta0(function1, (byte) 11);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wta0(function1, (byte) 12);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            n0b0 n0b0Var = (n0b0) l7m0Var.getValue();
            if (n0b0Var != null) {
                if (n0b0Var instanceof l0b0) {
                    fetVar.e0(-1498826784);
                    N(null, (l0b0) n0b0Var, function1, fetVar, i3);
                    fetVar.r(false);
                } else if (n0b0Var instanceof m0b0) {
                    fetVar.e0(-1498605692);
                    O(null, (m0b0) n0b0Var, function1, fetVar, i3);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(1198574084, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 29);
        }
    }

    public static final void Q(mm40 mm40Var, qza0 qza0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1674289649);
        int i2 = i | 6 | (fetVar.g(qza0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wta0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new rpa0(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ru80(function1, (byte) 2);
                fetVar.o0(objP3);
            }
            piz.t(mm40VarN, qza0Var, function0, function2, (Function2) objP3, fetVar, i2 & 112);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, qza0Var, function1, i, (byte) 19);
        }
    }

    public static final void R(a4x a4xVar, boolean z, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        a4x a4xVar2;
        int i2;
        int i3;
        boolean z2;
        int i4;
        xcz xczVar2 = xczVar;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        xczVar2.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-1551670130);
        if ((i & 6) == 0) {
            a4xVar2 = a4xVar;
            i2 = (fetVar2.g(a4xVar2) ? 4 : 2) | i;
        } else {
            a4xVar2 = a4xVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(xczVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(qdzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            h5m h5mVarL = zjb.L(1, fetVar2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : a4xVar2) {
                if (obj instanceof zog) {
                    arrayList.add(obj);
                }
            }
            zog zogVar = (zog) CollectionsKt.firstOrNull(arrayList);
            float f = xfn.a(fetVar2).c;
            mm40 mm40VarV = cjx.V(o7k0.c, h5mVarL.e, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarV);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            m5m m5mVar = zogVar != null ? zogVar.b : null;
            if (m5mVar == null) {
                m5mVar = null;
            }
            b6m b6mVar = m5mVar != null ? m5mVar.f21226a.i : null;
            cl5 cl5Var = ukd.f35823a;
            if (b6mVar != null) {
                fetVar2.e0(273848593);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40.b, f, 4.0f, f, 0.0f, 8);
                m5m m5mVar2 = zogVar.b;
                int i5 = i2 & 57344;
                boolean z3 = i5 == 16384;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    objP = new a9g0(function1, (byte) 4);
                    fetVar2.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean z4 = i5 == 16384;
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new dng0(function1, (byte) 8);
                    fetVar2.o0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                boolean zG = (i5 == 16384) | fetVar2.g(zogVar);
                Object objP3 = fetVar2.P();
                if (zG || objP3 == cl5Var) {
                    objP3 = new mk40(function1, zogVar, (byte) 1);
                    fetVar2.o0(objP3);
                }
                Function0 function3 = (Function0) objP3;
                boolean z5 = i5 == 16384;
                Object objP4 = fetVar2.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new a9g0(function1, (byte) 11);
                    fetVar2.o0(objP4);
                }
                Function1 function4 = (Function1) objP4;
                boolean z6 = i5 == 16384;
                Object objP5 = fetVar2.P();
                if (z6 || objP5 == cl5Var) {
                    objP5 = new a9g0(function1, (byte) 12);
                    fetVar2.o0(objP5);
                }
                i3 = i2;
                i4 = 32;
                z2 = false;
                j5m.a(mm40VarN, m5mVar2, h5mVarL, function2, function0, function3, null, function4, (Function1) objP5, fetVar, 0, 64);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                i3 = i2;
                z2 = false;
                i4 = 32;
                fetVar2.e0(275029662);
                fetVar2.r(false);
            }
            mm40 mm40VarI = hne.i(1.0f, true, "LOL_LAZY_COLUMN");
            zcl zclVar2 = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(f, 0.0f, r20, 28.0f, 2);
            int i6 = i3 & 896;
            boolean zG2 = ((i3 & 112) == i4 ? true : z2) | ((i3 & 14) == 4 ? true : z2) | (i6 == 256 ? true : z2) | ((i3 & 7168) == 2048 ? true : z2) | fetVar2.g(m5mVar) | ((i3 & 57344) == 16384 ? true : z2);
            Object objP6 = fetVar2.P();
            if (zG2 || objP6 == cl5Var) {
                xah0 xah0Var = new xah0(a4xVar, z, xczVar, qdzVar, m5mVar, function1, (byte) 0);
                fetVar2.o0(xah0Var);
                objP6 = xah0Var;
            }
            b8k0.e(mm40VarI, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP6, fetVar2, (i3 >> 3) & 112, Response.SERVER_TIMEOUT);
            xczVar2 = xczVar;
            fetVar2.r(true);
            Unit unit = Unit.f46060a;
            boolean z7 = i6 == 256 ? true : z2;
            Object objP7 = fetVar2.P();
            if (z7 || objP7 == cl5Var) {
                objP7 = new wi6(xczVar2, null, (byte) 12);
                fetVar2.o0(objP7);
            }
            m0x0.t(fetVar2, unit, (Function2) objP7);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yah0(a4xVar, z, xczVar2, qdzVar, function1, i, (byte) 0);
        }
    }

    public static final void S(mm40 mm40Var, float f, fet fetVar, int i) {
        fetVar.g0(-2007878606);
        byte b2 = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.s(mm40Var, w6kVar.r0(Math.min((int) (iB * f), w6kVar.T(400.0f)))), 114.0f), vgg0.a(20.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esl(mm40Var, f, i, b2);
        }
    }

    public static final void T(int i, fet fetVar) {
        fetVar.g0(-448465311);
        if (fetVar.U(i & 1, i != 0)) {
            e900 e900VarJ = yyw.J(fetVar);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarC, background, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            xkb.f(s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 12.0f, 12.0f, 2), e900VarJ, 7, false, fetVar, 3456, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuq(i, (byte) 2);
        }
    }

    public static final void U(int i, fet fetVar) {
        fetVar.g0(1594236818);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(jm40Var, 56.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            qxw.o(fetVar, pkd.l(mm40VarE.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), vgg0.a(12.0f), 0L, fetVar, 2));
            qxw.o(fetVar, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarE2 = o7k0.e(jm40Var, 56.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            qxw.o(fetVar, pkd.l(mm40VarE2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), vgg0.a(12.0f), 0L, fetVar, 2));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hhd(i, (byte) 15);
        }
    }

    public static final void V(int i, fet fetVar) {
        fetVar.g0(1447670260);
        if (fetVar.U(i & 1, i != 0)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.J(jm40Var, 8.0f), 40.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, pkd.l(mm40VarN, ugg0Var, 0L, fetVar, 2));
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            qxw.o(fetVar, pkd.l(o7k0.e(o7k0.s(jm40Var, 64.0f), 12.0f), ugg0Var, 0L, fetVar, 2));
            qxw.o(fetVar, pkd.l(o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 128.0f), 20.0f), ugg0Var, 0L, fetVar, 2));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hhd(i, (byte) 16);
        }
    }

    public static final void W(mm40 mm40Var, gbm0 gbm0Var, jbm0 jbm0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        gbm0Var.getClass();
        jbm0Var.getClass();
        fetVar2.g0(-1252172380);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(gbm0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
            long j = ((y3d) jbm0Var.a(fetVar).getValue()).f41946a;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            n0q n0qVar = o7k0.c;
            f(6, fetVar2, n0qVar, gbm0Var.d);
            mm40 mm40VarL = s5x0.L(n0qVar, 16.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            zhg0 zhg0Var = zhg0.f44392a;
            jm40 jm40Var = jm40.b;
            oja0.N(zhg0Var.a(1.0f, jm40Var, true), 5, gbm0Var.f11021a, jbm0Var, fetVar2, 3072);
            fetVar2 = fetVar;
            oja0.N(zhg0Var.a(1.0f, jm40Var, true), 3, gbm0Var.b, jbm0Var, fetVar2, 3072);
            oja0.N(zhg0Var.a(1.0f, jm40Var, true), 6, gbm0Var.c, jbm0Var, fetVar2, 3072);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, gbm0Var, jbm0Var, i, (byte) 29);
        }
    }

    public static final void X(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(896101734);
        int i2 = (fetVar.g(str) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, o2e.e0(mm40Var, "DS_CYBER_BANNER_CHAMPIONSHIP_TEXT"), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.w, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void Y(final mm40 mm40Var, final String str, final boolean z, final boolean z2, final Function0 function0, final Function0 function1, xdr xdrVar, ugd ugdVar, final ugd ugdVar2, ugd ugdVar3, fet fetVar, final int i, final int i2) {
        xdr xdrVar2;
        boolean z3;
        ugd ugdVar4;
        ugd ugdVar5;
        final xdr xdrVar3;
        yfe0 yfe0VarU;
        xdr xdrVar4;
        oyq0 oyq0VarD;
        xcz xczVarA;
        boolean z4;
        boolean z5;
        boolean z6;
        xcz xczVar;
        oyq0 oyq0Var;
        Object hlq0Var;
        boolean z7;
        boolean zG;
        Object objP;
        mm40Var.getClass();
        str.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(26181345);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        }
        int i4 = i3 | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                xdrVar2 = xdrVar;
                i4 |= fetVar.i(xdrVar2) ? 1048576 : 524288;
            }
            if ((306783379 & i4) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i5 != 0) {
                    xdrVar4 = epv0.f;
                } else {
                    xdrVar4 = xdrVar2;
                }
                oyq0VarD = ob3.d(0, 7, fetVar);
                clo cloVarB = lyq0.b(oyq0VarD, fetVar, 24576);
                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                Boolean boolValueOf = Boolean.valueOf(z);
                if ((i4 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean zG2 = z4 | fetVar.g(xczVarA) | fetVar.g(oyq0VarD);
                if ((57344 & i4) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | zG2;
                Object objP2 = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (!z6 || objP2 == cl5Var) {
                    xczVar = xczVarA;
                    oyq0Var = oyq0VarD;
                    hlq0Var = new hlq0(z, xczVar, oyq0Var, function0, (yje) null);
                    fetVar.o0(hlq0Var);
                } else {
                    oyq0Var = oyq0VarD;
                    hlq0Var = objP2;
                    xczVar = xczVarA;
                }
                m0x0.t(fetVar, boolValueOf, (Function2) hlq0Var);
                mm40 mm40VarE = mm40Var.e(o7k0.c);
                zcl zclVar = qmk.f28987a;
                ciq ciqVarN = i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14);
                long backgroundDark = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundDark();
                if ((i4 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zG = fetVar.g(oyq0Var) | z7;
                objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new rd7(z2, (Object) oyq0Var, (byte) 22);
                    fetVar.o0(objP);
                }
                ugdVar4 = ugdVar;
                ugdVar5 = ugdVar3;
                zcm0.d(mm40VarE, cloVarB, backgroundDark, ciqVarN, (Function0) objP, u1c.M(-1747304065, new kqj0(ugdVar4, (byte) 3), fetVar), u1c.M(800645440, new txf(str, function1, (byte) 3), fetVar), u1c.M(-946372351, new xh20((Object) ugdVar2, z2, (byte) 23), fetVar), u1c.M(1601577154, new cvy(xdrVar4, (byte) 2), fetVar), u1c.M(2120152198, new qb((Object) ugdVar5, (Object) cloVarB, (Object) xczVar, (byte) 12), fetVar), fetVar, 920322048);
                xdrVar3 = xdrVar4;
            } else {
                ugdVar4 = ugdVar;
                ugdVar5 = ugdVar3;
                fetVar.X();
                xdrVar3 = xdrVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final ugd ugdVar6 = ugdVar5;
                final ugd ugdVar7 = ugdVar4;
                yfe0VarU.d = new Function2() { // from class: a.tmr0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xia0.Y(mm40Var, str, z, z2, function0, function1, xdrVar3, ugdVar7, ugdVar2, ugdVar6, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 1572864;
        xdrVar2 = xdrVar;
        if ((306783379 & i4) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i4 & 1, z3)) {
            if (i5 != 0) {
                xdrVar4 = epv0.f;
            } else {
                xdrVar4 = xdrVar2;
            }
            oyq0VarD = ob3.d(0, 7, fetVar);
            clo cloVarB2 = lyq0.b(oyq0VarD, fetVar, 24576);
            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            if ((i4 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zG3 = z4 | fetVar.g(xczVarA) | fetVar.g(oyq0VarD);
            if ((57344 & i4) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | zG3;
            Object objP3 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z6) {
                xczVar = xczVarA;
                oyq0Var = oyq0VarD;
                hlq0Var = new hlq0(z, xczVar, oyq0Var, function0, (yje) null);
                fetVar.o0(hlq0Var);
            } else {
                xczVar = xczVarA;
                oyq0Var = oyq0VarD;
                hlq0Var = new hlq0(z, xczVar, oyq0Var, function0, (yje) null);
                fetVar.o0(hlq0Var);
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) hlq0Var);
            mm40 mm40VarE2 = mm40Var.e(o7k0.c);
            zcl zclVar2 = qmk.f28987a;
            ciq ciqVarN2 = i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14);
            long backgroundDark2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundDark();
            if ((i4 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            zG = fetVar.g(oyq0Var) | z7;
            objP = fetVar.P();
            if (zG) {
                objP = new rd7(z2, (Object) oyq0Var, (byte) 22);
                fetVar.o0(objP);
            } else {
                objP = new rd7(z2, (Object) oyq0Var, (byte) 22);
                fetVar.o0(objP);
            }
            ugdVar4 = ugdVar;
            ugdVar5 = ugdVar3;
            zcm0.d(mm40VarE2, cloVarB2, backgroundDark2, ciqVarN2, (Function0) objP, u1c.M(-1747304065, new kqj0(ugdVar4, (byte) 3), fetVar), u1c.M(800645440, new txf(str, function1, (byte) 3), fetVar), u1c.M(-946372351, new xh20((Object) ugdVar2, z2, (byte) 23), fetVar), u1c.M(1601577154, new cvy(xdrVar4, (byte) 2), fetVar), u1c.M(2120152198, new qb((Object) ugdVar5, (Object) cloVarB2, (Object) xczVar, (byte) 12), fetVar), fetVar, 920322048);
            xdrVar3 = xdrVar4;
        } else {
            ugdVar4 = ugdVar;
            ugdVar5 = ugdVar3;
            fetVar.X();
            xdrVar3 = xdrVar2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar8 = ugdVar5;
            final ugd ugdVar9 = ugdVar4;
            yfe0VarU.d = new Function2() { // from class: a.tmr0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xia0.Y(mm40Var, str, z, z2, function0, function1, xdrVar3, ugdVar9, ugdVar2, ugdVar8, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void Z(mm40 mm40Var, hzv0 hzv0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        hzv0Var.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1419176491);
        int i2 = i | 6 | (fetVar.g(hzv0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40Var2 = jm40.b;
            mm40 mm40VarE = s5x0.N(i120.Q(mm40Var2, background, ljcVar), xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10).e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (hzv0Var instanceof gzv0) {
                fetVar.e0(623311081);
                mdm mdmVar = ((gzv0) hzv0Var).f12202a;
                boolean z = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new szu0(function1, (byte) 12);
                    fetVar.o0(objP);
                }
                v(null, mdmVar, (Function1) objP, fetVar, 0);
                fetVar.r(false);
            } else if (hzv0Var instanceof dzv0) {
                fetVar.e0(623317397);
                v(null, ((dzv0) hzv0Var).f6961a, function1, fetVar, i2 & 896);
                fetVar.r(false);
            } else if (hzv0Var.equals(fzv0.f10430a)) {
                fetVar.e0(623321981);
                J(0, fetVar, null);
                fetVar.r(false);
            } else if (hzv0Var instanceof ezv0) {
                fetVar.e0(623324053);
                G(null, ((ezv0) hzv0Var).f8690a, function1, function2, fetVar, i2 & 8064);
                fetVar.r(false);
            } else {
                if (!(hzv0Var instanceof czv0)) {
                    throw b1j.f(623309447, fetVar, false);
                }
                fetVar.e0(2143382611);
                u(null, ((czv0) hzv0Var).f5243a, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 28, i, mm40Var2, hzv0Var, function1, function2);
        }
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(644324287);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            V(0, fetVar);
            U(0, fetVar);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, b2);
        }
    }

    public static final LinkedHashMap a0(int i, int i2, long j, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cfView", String.valueOf(i));
        if (str != null) {
            linkedHashMap.put("country", str);
        }
        linkedHashMap.put("fcountry", String.valueOf(i2));
        linkedHashMap.put("gr", String.valueOf(1357));
        linkedHashMap.put("lng", str2);
        linkedHashMap.put("ref", String.valueOf(1));
        if (j != -1) {
            linkedHashMap.put("userId", String.valueOf(j));
        }
        linkedHashMap.put("whence", String.valueOf(22));
        return linkedHashMap;
    }

    public static final void b(int i, pp0 pp0Var, fet fetVar, mm40 mm40Var, lh80 lh80Var, Function0 function0, Function1 function1) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        yx7 yx7Var = gqw0.k;
        pp0Var.getClass();
        function1.getClass();
        fetVar2.g0(-261805019);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(lh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            float f = lh80Var.c;
            float f2 = lh80Var.e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, f, 0.0f, f2, 5);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN2 = s5x0.N(o7k0.e(mm40VarN, 80.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (pp0Var instanceof np0) {
                fetVar2.e0(-42023860);
                np0 np0Var = (np0) pp0Var;
                hp4.d(xczVarA, vneVar, np0Var.f23889a.f10362a, np0Var.b && np0Var.d, np0Var.e, fetVar, 0);
                qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
                lh80 lh80VarU = s5x0.u(s5x0.B(lh80Var, k6zVar), 0.0f, s5x0.A(lh80Var, k6zVar), 0.0f, 10);
                boolean z2 = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new on((Object) pp0Var, (Object) function0, (Object) function1, (byte) 5);
                    fetVar.o0(objP2);
                }
                Function1 function2 = (Function1) objP2;
                z = true;
                b8k0.f(null, xczVarA, lh80VarU, false, qw3Var, yx7Var, null, false, null, function2, fetVar, 196608, 457);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-39743810);
                qw3 qw3Var2 = new qw3(12.0f, true, new jf4((byte) 14));
                lh80 lh80VarU2 = s5x0.u(s5x0.B(lh80Var, k6zVar), 0.0f, s5x0.A(lh80Var, k6zVar), 0.0f, 10);
                Object objP3 = fetVar2.P();
                if (objP3 == cl5Var) {
                    objP3 = new eo0((byte) 3);
                    fetVar2.o0(objP3);
                }
                b8k0.f(null, null, lh80VarU2, false, qw3Var2, yx7Var, null, false, null, (Function1) objP3, fetVar, 805502976, 459);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            mbc.o(agi0.f827a, null, false, fetVar2, 6, 6);
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so0(mm40Var2, pp0Var, lh80Var, function1, function0, i, (byte) 2);
        }
    }

    public static ol50 b0(zae0 zae0Var) throws EOFException {
        int i = Integer.parseInt(zae0Var.A(Long.MAX_VALUE));
        long j = Long.parseLong(zae0Var.A(Long.MAX_VALUE));
        long j2 = Long.parseLong(zae0Var.A(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = Integer.parseInt(zae0Var.A(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strA = zae0Var.A(Long.MAX_VALUE);
            int iU = StringsKt.U(':', 0, 6, strA);
            if (iU == -1) {
                c99.s("Unexpected header: ".concat(strA));
                return null;
            }
            String string = StringsKt.u0(strA.substring(0, iU)).toString();
            String strSubstring = strA.substring(iU + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new ol50(i, j, j2, new al50(xp20.n(linkedHashMap)), null, null);
    }

    public static final void c(mm40 mm40Var, l7m0 l7m0Var, float f, float f2, fu1 fu1Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        Float f3;
        shd shdVar;
        shd shdVar2;
        cl5 cl5Var;
        a4x a4xVar;
        String str;
        fet fetVar3;
        l7m0 l7m0Var2;
        jr8 jr8Var;
        jm40 jm40Var;
        shd shdVar3;
        shd shdVar4;
        zx7 zx7Var;
        boolean z;
        boolean z2;
        Float fValueOf = Float.valueOf(1.0f);
        pge pgeVar = gqw0.A;
        Float fValueOf2 = Float.valueOf(0.0f);
        fu1Var.getClass();
        String str2 = fu1Var.c;
        String str3 = fu1Var.b;
        function0.getClass();
        fetVar.g0(-749876072);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(fu1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 74899) != 74898)) {
            Object[] objArr = {l7m0Var.getValue()};
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objP = fetVar.P();
            byte b2 = 5;
            cl5 cl5Var2 = ukd.f35823a;
            if (z3 || objP == cl5Var2) {
                objP = new jb(l7m0Var, b2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = lgb.K(o7k0.e(mm40Var, (((Number) l7m0Var.getValue()).floatValue() * (-172.0f)) + 228.0f + f));
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            a4x a4xVar2 = fu1Var.d;
            if (str2.length() == 0) {
                fetVar.e0(1581195163);
                f3 = fValueOf2;
                shdVar2 = shdVar8;
                shdVar = shdVar7;
                cl5Var = cl5Var2;
                a4xVar = a4xVar2;
                str = str3;
                j0x.b(a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, o7k0.c, null, pgeVar, 0.0f, null, fetVar, 25016, 104);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                f3 = fValueOf2;
                shdVar = shdVar7;
                shdVar2 = shdVar8;
                cl5Var = cl5Var2;
                a4xVar = a4xVar2;
                str = str3;
                fetVar.e0(1581474783);
                k7x.b(Uri.parse(str2), null, o7k0.c, a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, null, null, null, pgeVar, null, fetVar, 299440, 6, 31680);
                fetVar3 = fetVar;
                fetVar3.r(false);
            }
            zx7 zx7Var3 = gqw0.b;
            jr8 jr8Var2 = jr8.f16991a;
            jm40 jm40Var2 = jm40.b;
            shd shdVar9 = shdVar;
            zq8.a(0, fetVar3, i120.P(o7k0.e(o7k0.d(jr8Var2.b(jm40Var2, zx7Var3), 1.0f), 80.0f), yk5.o(new Pair[]{new Pair(f3, new y3d(afn0.p(fetVar3).m71getBlack300d7_KjU())), new Pair(fValueOf, new y3d(afn0.p(fetVar3).m121getTransparent0d7_KjU()))}), null, 6));
            zx7 zx7Var4 = gqw0.h;
            mm40 mm40VarP = i120.P(o7k0.e(o7k0.d(jr8Var2.b(jm40Var2, zx7Var4), 1.0f), 108.0f), yk5.o(new Pair[]{new Pair(f3, new y3d(y3d.c(0.0f, afn0.m(fetVar3).getBackgroundContent()))), new Pair(Float.valueOf(0.45f), new y3d(afn0.m(fetVar3).getBackgroundContent())), new Pair(fValueOf, new y3d(afn0.m(fetVar).getBackgroundContent()))}), null, 6);
            fet fetVar4 = fetVar;
            zq8.a(0, fetVar4, mm40VarP);
            if (str.length() > 0) {
                fetVar4.e0(1583105135);
                mm40 mm40VarB = jr8Var2.b(jm40Var2, gqw0.g);
                boolean z5 = i4 == 32;
                Object objP2 = fetVar4.P();
                if (z5 || objP2 == cl5Var) {
                    l7m0Var2 = l7m0Var;
                    objP2 = new yd1(l7m0Var2, (byte) 4);
                    fetVar4.o0(objP2);
                } else {
                    l7m0Var2 = l7m0Var;
                }
                mm40 mm40VarN = s5x0.N(s5x0.L(i4w0.T(mm40VarB, (Function1) objP2), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2 + 12.0f, 7);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                int iHashCode2 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM2 = fetVar4.m();
                mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarN);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(pcyVar);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, x5dVarA, shdVar5);
                shdVar3 = shdVar6;
                jpm0.o(fetVar4, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar4, shdVar9, fetVar4);
                shd shdVar10 = shdVar2;
                jpm0.o(fetVar4, mm40VarC1, shdVar10);
                if (a4xVar.isEmpty()) {
                    fetVar4.e0(-2140012616);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-2140292267);
                    i120.e(0, fetVar4, a4xVar, s5x0.N(o7k0.d(jm40Var2, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7));
                    fetVar4.r(false);
                }
                afn0.v(fetVar4).getClass();
                y9q0 y9q0VarP = g1t0.p();
                long textPrimary = afn0.m(fetVar4).getTextPrimary();
                String str4 = str;
                zx7Var = zx7Var3;
                shdVar2 = shdVar10;
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
                shdVar4 = shdVar9;
                v8q0.a(str4, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarP, fetVar, 0, 24960, 110586);
                str = str4;
                fetVar4 = fetVar;
                z = true;
                fetVar4.r(true);
                fetVar4.r(false);
            } else {
                l7m0Var2 = l7m0Var;
                jr8Var = jr8Var2;
                jm40Var = jm40Var2;
                shdVar3 = shdVar6;
                shdVar4 = shdVar9;
                zx7Var = zx7Var3;
                z = true;
                fetVar4.e0(1584090160);
                fetVar4.r(false);
            }
            mm40 mm40VarB2 = jr8Var.b(jm40Var, zx7Var2);
            boolean z6 = r20 == 32 ? z : false;
            Object objP3 = fetVar4.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new yd1(l7m0Var2, (byte) 5);
                fetVar4.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(mm40VarB2, (Function1) objP3);
            jm40 jm40Var3 = jm40Var;
            jr8 jr8Var3 = jr8Var;
            shd shdVar11 = shdVar3;
            cl5 cl5Var3 = cl5Var;
            zx7 zx7Var5 = zx7Var;
            mm40 mm40VarN2 = s5x0.N(mm40VarT, 0.0f, f, 0.0f, 0.0f, 13);
            long jM121getTransparent0d7_KjU = afn0.p(fetVar4).m121getTransparent0d7_KjU();
            jlm jlmVar = jlm.f16723a;
            mlm mlmVar = mlm.f21997a;
            fmm fmmVar = fmm.f9790a;
            int i5 = (i3 >> 6) & 7168;
            fet fetVar5 = fetVar4;
            hlm.c(mm40VarN2, new imm(jlmVar, mlmVar, fmmVar, jM121getTransparent0d7_KjU, false, null), null, function0, null, null, null, null, null, null, null, null, fetVar5, i5, 0, 4084);
            fetVar2 = fetVar5;
            if (((Number) l7m0VarY.getValue()).floatValue() > 0.0f) {
                fetVar2.e0(1584909583);
                mm40 mm40VarB3 = jr8Var3.b(jm40Var3, zx7Var5);
                boolean zG = fetVar2.g(l7m0VarY);
                Object objP4 = fetVar2.P();
                if (zG || objP4 == cl5Var3) {
                    objP4 = new yd1(l7m0VarY, (byte) 6);
                    fetVar2.o0(objP4);
                }
                mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(i4w0.T(mm40VarB3, (Function1) objP4), 1.0f), f + 56.0f), afn0.m(fetVar2).getBackgroundContent(), jd8.n);
                tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(r22);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar5);
                jpm0.o(fetVar2, bh90VarM3, shdVar11);
                vqd.u(iHashCode3, fetVar2, shdVar4, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar2);
                hlm.c(jr8Var3.b(jm40Var3, zx7Var4), new imm(new ilm(afn0.m(fetVar2).getSecondary()), new plm(str, afn0.m(fetVar2).getSecondary(), fa50.f9191a), fmmVar, afn0.m(fetVar2).getBackgroundContent(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar2, i5, 0, 4084);
                fetVar2 = fetVar2;
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z2 = true;
                fetVar2.e0(1586232880);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cu1(mm40Var, l7m0Var, f, f2, fu1Var, function0, i, (byte) 0);
        }
    }

    public static final kq90 c0(qkt qktVar, boolean z) {
        String string;
        qktVar.getClass();
        int i = qktVar.f28902a;
        boolean z2 = qktVar.g;
        String strQ = w6x.q(qktVar.c, Separators.SP, qktVar.b);
        String str = qktVar.b;
        if (z) {
            StringBuilder sb = new StringBuilder(ujn.h);
            String str2 = qktVar.f;
            str2.getClass();
            if (str2.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                sb.setLength(0);
                sb.append(str2);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str2, '/'));
            }
            string = sb.toString();
        } else {
            string = "";
        }
        return new kq90(i, qktVar.e, qktVar.h, strQ, str, string, qktVar.c, qktVar.d, z2);
    }

    public static final void d(mm40 mm40Var, o02 o02Var, Function1 function1, fet fetVar, int i) {
        o02Var.getClass();
        function1.getClass();
        fetVar.g0(-1352137393);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o02Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) fetVar.k(dy2.b);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            rqm rqmVar = o02Var.b;
            boolean zI = ((i2 & 896) == 256) | ((i2 & 112) == 32) | fetVar.i(context);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new l02(function1, o02Var, context, (byte) 0);
                fetVar.o0(objP);
            }
            obc.q(mm40VarD, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, o02Var, function1, i, (byte) 26);
        }
    }

    public static final ru6 d0(m97 m97Var, int i) {
        m97Var.getClass();
        String plainString = new BigDecimal(String.valueOf(m97Var.l)).toPlainString();
        plainString.getClass();
        double d2 = m97Var.l;
        long j = m97Var.f21398a;
        tqt tqtVar = uoy.b;
        int i2 = m97Var.b;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(i2);
        double d3 = m97Var.k;
        long j2 = m97Var.f;
        long j3 = m97Var.h;
        zfa0 zfa0Var = m97Var.w;
        double d4 = m97Var.y;
        return new ru6(-1L, plainString, d2, j, uoyVarJ, d3, j2, j3, zfa0Var, i, Double.valueOf(d4), m97Var.z);
    }

    public static final void e(a4x a4xVar, Function2 function2, fet fetVar, int i) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(-503700820);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function2) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 << 3;
            C((i3 & 896) | (i3 & 112) | 3072, fetVar, a4xVar, null, function2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x(a4xVar, function2, i, b2);
        }
    }

    public static final bi90 e0(wi10 wi10Var) {
        long jW0 = ibc.w0(wi10Var.c - System.currentTimeMillis(), bfn.MILLISECONDS);
        uen uenVar = wen.b;
        long jL = wen.l(jW0, bfn.HOURS);
        yni0 yni0Var = new yni0();
        if (jL >= 12) {
            yni0Var.add(rol.f30844a);
        }
        yni0Var.add(rol.b);
        yni0Var.add(rol.c);
        yni0Var.add(rol.d);
        return dyb.t0(cui0.a(yni0Var));
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2;
        String str2;
        fetVar.g0(-1058958413);
        int i2 = (fetVar.g(str) ? 32 : 16) | i;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            str2 = str;
            fetVar2.X();
        } else {
            if (str.length() == 0) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new n040(mm40Var, str, i, (byte) 21);
                    return;
                }
                return;
            }
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            fetVar2 = fetVar;
            str2 = str;
            k7x.a(str2, null, h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), gqw0.A, null, fetVar2, ((i2 >> 3) & 14) | 1572912, 1976);
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new n040(mm40Var, str2, i, (byte) 22);
        }
    }

    public static void f0(ol50 ol50Var, yae0 yae0Var) {
        yae0Var.i0(ol50Var.f25436a);
        yae0Var.writeByte(10);
        yae0Var.i0(ol50Var.b);
        yae0Var.writeByte(10);
        yae0Var.i0(ol50Var.c);
        yae0Var.writeByte(10);
        Set<Map.Entry> setEntrySet = ol50Var.d.f1052a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        yae0Var.i0(size);
        yae0Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                yae0Var.D((String) entry.getKey());
                yae0Var.D(Separators.COLON);
                yae0Var.D(str);
                yae0Var.writeByte(10);
            }
        }
    }

    public static final void g(mm40 mm40Var, String str, int i, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        function0.getClass();
        fetVar2.g0(-1814293725);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            rqm rqmVar = new rqm((vui0) new tui0(str, null), (pui0) new oui0(Integer.valueOf(i), (y3d) null, new m0x(i, null, 6), (y3d) null, 26), (pvi0) null, (d4d) null, (tvi0) null, wui0.c, false, (e900) null, 444);
            boolean z = (i3 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new tq(function0, (byte) 12);
                fetVar2.o0(objP);
            }
            mm40Var2 = jm40Var;
            obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 233);
            mm40 mm40VarB = jr8.f16991a.b(mm40Var2, gqw0.g);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            vtb.t(o7k0.d(s5x0.L(mm40VarB, 12.0f, 0.0f, 2), 1.0f), qqm.b, null, 0L, fetVar2, 48, 12);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fg5(mm40Var2, str, i, function0, i2);
        }
    }

    public static final void h(mm40 mm40Var, dza0 dza0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1625561441);
        int i2 = i | 6 | (fetVar.g(dza0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
            a4x a4xVar = dza0Var.b;
            boolean z = false;
            lq5 lq5Var = dza0Var.f6934a;
            boolean z2 = dza0Var.c;
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ru80(function1, b2);
                fetVar.o0(objP);
            }
            etl.e(mm40VarL, a4xVar, lq5Var, z2, null, 0.0f, 0, null, (Function2) objP, fetVar, 0, 240);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, dza0Var, function1, i, (byte) 20);
        }
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(175017249);
        int i2 = i | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar2);
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            boolean zG = fetVar2.g(w2dVarW0);
            Object objP = fetVar2.P();
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = cjx.V(jm40Var, w2dVarW0, null);
                fetVar2.o0(objP);
            }
            mm40 mm40Var2 = (mm40) objP;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new to6(function1, (byte) 15);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new to6(function1, (byte) 16);
                fetVar2.o0(objP3);
            }
            v3c.z(function0, (Function0) objP3, null, fetVar2, 0, 4);
            Object[] objArr = new Object[0];
            int i4 = i2 & 112;
            boolean z3 = i4 == 32;
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = new we4(l7m0Var, (byte) 25);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP4, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z4 = i4 == 32;
            Object objP5 = fetVar2.P();
            byte b4 = 26;
            if (z4 || objP5 == cl5Var) {
                objP5 = new we4(l7m0Var, b4);
                fetVar2.o0(objP5);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP5, fetVar2);
            Object[] objArr3 = new Object[0];
            boolean z5 = i4 == 32;
            Object objP6 = fetVar2.P();
            if (z5 || objP6 == cl5Var) {
                objP6 = new we4(l7m0Var, (byte) 27);
                fetVar2.o0(objP6);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP6, fetVar2);
            Object[] objArr4 = new Object[0];
            boolean z6 = i4 == 32;
            Object objP7 = fetVar2.P();
            if (z6 || objP7 == cl5Var) {
                objP7 = new we4(l7m0Var, (byte) 28);
                fetVar2.o0(objP7);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP7, fetVar2);
            Object[] objArr5 = new Object[0];
            boolean z7 = i4 == 32;
            Object objP8 = fetVar2.P();
            if (z7 || objP8 == cl5Var) {
                objP8 = new we4(l7m0Var, (byte) 29);
                fetVar2.o0(objP8);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP8, fetVar2);
            Object[] objArr6 = new Object[0];
            boolean z8 = i4 == 32;
            Object objP9 = fetVar2.P();
            if (z8 || objP9 == cl5Var) {
                objP9 = new kk7(l7m0Var, b2);
                fetVar2.o0(objP9);
            }
            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP9, fetVar2);
            Object[] objArr7 = new Object[0];
            boolean z9 = i4 == 32;
            Object objP10 = fetVar2.P();
            if (z9 || objP10 == cl5Var) {
                objP10 = new kk7(l7m0Var, b3);
                fetVar2.o0(objP10);
            }
            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP10, fetVar2);
            Object[] objArr8 = new Object[0];
            boolean z10 = i4 == 32;
            Object objP11 = fetVar2.P();
            if (z10 || objP11 == cl5Var) {
                objP11 = new kk7(l7m0Var, (byte) 3);
                fetVar2.o0(objP11);
            }
            l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP11, fetVar2);
            Object[] objArr9 = new Object[0];
            boolean z11 = i4 == 32;
            Object objP12 = fetVar2.P();
            if (z11 || objP12 == cl5Var) {
                objP12 = new kk7(l7m0Var, (byte) 2);
                fetVar2.o0(objP12);
            }
            l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP12, fetVar2);
            Object[] objArr10 = new Object[0];
            boolean z12 = i4 == 32;
            Object objP13 = fetVar2.P();
            if (z12 || objP13 == cl5Var) {
                objP13 = new kk7(l7m0Var, (byte) 4);
                fetVar2.o0(objP13);
            }
            l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP13, fetVar2);
            Object[] objArr11 = new Object[0];
            boolean z13 = i4 == 32;
            Object objP14 = fetVar2.P();
            if (z13 || objP14 == cl5Var) {
                objP14 = new kk7(l7m0Var, (byte) 5);
                fetVar2.o0(objP14);
            }
            l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP14, fetVar2);
            Object[] objArr12 = new Object[0];
            boolean z14 = i4 == 32;
            Object objP15 = fetVar2.P();
            if (z14 || objP15 == cl5Var) {
                objP15 = new kk7(l7m0Var, (byte) 6);
                fetVar2.o0(objP15);
            }
            l7m0 l7m0VarY12 = v3c.Y(objArr12, (Function0) objP15, fetVar2);
            Object[] objArr13 = new Object[0];
            boolean z15 = i4 == 32;
            Object objP16 = fetVar2.P();
            if (z15 || objP16 == cl5Var) {
                objP16 = new kk7(l7m0Var, (byte) 7);
                fetVar2.o0(objP16);
            }
            l7m0 l7m0VarY13 = v3c.Y(objArr13, (Function0) objP16, fetVar2);
            Object objP17 = fetVar2.P();
            if (objP17 == cl5Var) {
                objP17 = ((yvg0) l7m0Var.getValue()).n;
                fetVar2.o0(objP17);
            }
            l7m0 l7m0Var2 = (l7m0) objP17;
            Object objP18 = fetVar2.P();
            if (objP18 == cl5Var) {
                objP18 = jgk0.b(new ok7(w2dVarW0, (byte) 0));
                fetVar2.o0(objP18);
            }
            v2n0.c(mm40Var, w2dVarW0, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), 0.0f, u1c.M(-1021301376, new pk7(w2dVarW0, l7m0VarY2, l7m0VarY4, (l7m0) objP18, function1, l7m0VarY6, l7m0VarY13), fetVar), u1c.M(-1326935905, new o71(function1, l7m0VarY3), fetVar), u1c.M(226062427, new qk7(mm40Var2, function1, xczVarA, l7m0VarY5, l7m0VarY10, l7m0VarY12, l7m0VarY11, l7m0VarY7, l7m0VarY9, l7m0VarY8, l7m0VarY2, l7m0Var2), fetVar), fetVar, 1797190, 0);
            fetVar2 = fetVar;
            if (((Boolean) ((l7m0) l7m0VarY.getValue()).getValue()).booleanValue()) {
                fetVar2.e0(-141627052);
                n0q n0qVar = o7k0.c;
                Object objP19 = fetVar2.P();
                if (objP19 == cl5Var) {
                    objP19 = new t07((byte) 26);
                    fetVar2.o0(objP19);
                }
                mm40 mm40VarY = y860.Y(n0qVar, false, null, null, (Function0) objP19, 14);
                zfn zfnVar = m8m0.f21378a;
                mm40 mm40VarQ = i120.Q(mm40VarY, ((StaticColors) fetVar2.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                kpb.j(jr8.f16991a.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar2, 0, 0);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-141214783);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 8);
        }
    }

    public static final void j(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(203567639);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 116.0f, 7);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new pcy((byte) 28);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, ((i2 << 3) & 112) | 3072, 4);
            k(jr8.f16991a.b(jm40Var, gqw0.h), u1c.M(-385924734, new gn(function1, (byte) 23), fetVar), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, (byte) 12);
        }
    }

    public static final void k(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(700740322);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.d(i120.Q(qcc.F(mm40Var, jM62getBlack0d7_KjU, 20.0f, 8.0f, 0.0f, 0.4f, 88), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), 1.0f), null, false, 3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ua80.p(54, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gn8(mm40Var, ugdVar, i, b2);
        }
    }

    public static final void l(boolean z, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1538788088);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 5;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            k(o7k0.d(jm40.b, 1.0f), u1c.M(-1744140579, new ldc(z, function1, b2), fetVar), fetVar, 54);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i, b2);
        }
    }

    public static final void m(mm40 mm40Var, final oda odaVar, Function2 function2, fet fetVar, int i) {
        function2.getClass();
        fetVar.g0(-1942837133);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(odaVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            uc9.h(mm40Var, u1c.M(-558682203, new ydr() { // from class: a.zca
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    byte b4 = b2;
                    oda odaVar2 = odaVar;
                    mm40 mm40Var2 = (mm40) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                    switch (b4) {
                        case 0:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.m(mm40Var2, odaVar2.f25066a, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.l(mm40Var2, odaVar2.b, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1827352282, new ec30(odaVar, function2, (byte) 12), fetVar), u1c.M(1198944935, new ydr() { // from class: a.zca
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    byte b4 = b3;
                    oda odaVar2 = odaVar;
                    mm40 mm40Var2 = (mm40) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                    switch (b4) {
                        case 0:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.m(mm40Var2, odaVar2.f25066a, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.l(mm40Var2, odaVar2.b, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i2 & 14) | 28032, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, odaVar, function2, i, (byte) 19);
        }
    }

    public static final void n(mm40 mm40Var, eza0 eza0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1534199593);
        int i2 = i | 6 | (fetVar2.g(eza0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = s5x0.N(jm40Var, xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10);
            mm40Var2 = jm40Var;
            jjm jjmVar = eza0Var.f8663a;
            kjm kjmVar = kjm.f18392a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wta0(function1, (byte) 14);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarN2, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            bvl bvlVar = eza0Var.b;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new rpa0(function1, (byte) 12);
                fetVar2.o0(objP2);
            }
            ju70.p(mm40VarD, bvlVar, null, 0.0f, (Function1) objP2, fetVar2, 6, 12);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, eza0Var, function1, i, (byte) 22);
        }
    }

    public static final void o(List list, fet fetVar, int i) {
        list.getClass();
        fetVar.g0(1314462834);
        byte b2 = 2;
        int i2 = (fetVar.g(list) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new gg4(list, b2);
                fetVar.o0(objP);
            }
            p8a.k(n0qVar, (Function1) objP, fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bo0(list, i, (byte) 10);
        }
    }

    public static final void p(final y2m y2mVar, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, Function1 function5, fet fetVar, int i) {
        int i2;
        final byte b2;
        boolean z;
        String str;
        final Function1 function6 = function5;
        fetVar.g0(-1400909876);
        jm40 jm40Var = jm40.b;
        int i3 = (fetVar.g(jm40Var) ? 4 : 2) | i | (fetVar.g(y2mVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i & 24576) == 0) {
            i2 = i4 | (fetVar.i(function3) ? 16384 : 8192);
        } else {
            i2 = i4;
        }
        if ((i & 196608) == 0) {
            i2 |= fetVar.i(function4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= fetVar.i(function6) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (i2 & 599187) != 599186)) {
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            y2mVar.getClass();
            boolean zE = fetVar.e(iB) | fetVar.d(0.9f);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zE || objP == obj) {
                objP = new a2g(iB);
                fetVar.o0(objP);
            }
            a2g a2gVar = (a2g) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(jm40Var, 114.0f), vgg0.a(20.0f));
            int i5 = i2 & 112;
            boolean z2 = ((i2 & 896) == 256) | (i5 == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                b2 = 0;
                objP2 = new Function0() { // from class: a.x2m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        y2m y2mVar2 = y2mVar;
                        Function1 function7 = function1;
                        switch (b3) {
                            case 0:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            case 1:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            case 2:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            case 3:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            default:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                b2 = 0;
            }
            int i6 = i2;
            mm40 mm40VarE0 = o2e.e0(phu0.F(mm40VarJ, null, null, false, null, (Function0) objP2, fetVar, 0, 15), "DS_CYBER_BANNER_CHAMPIONSHIP");
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, a2gVar, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE1 = o2e.e0(mrv.k0(jm40Var, z8k0.f43971a), "DS_CYBER_BANNER_CHAMPIONSHIP_IMAGE");
            boolean z3 = i5 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj) {
                objP3 = new edl(y2mVar, (byte) 14);
                fetVar.o0(objP3);
            }
            M(pai0.a(mm40VarE1, false, (Function1) objP3), y2mVar.c, y2mVar.d, fetVar, 0);
            o0x o0xVar = y2mVar.l;
            if (o0xVar == null) {
                fetVar.e0(-2082243836);
                fetVar.r(false);
            } else {
                fetVar.e0(-2082243835);
                mm40 mm40VarE2 = o2e.e0(mrv.k0(jm40Var, n8k0.f23094a), "DS_CYBER_BANNER_CHAMPIONSHIP_DISCIPLINE_BUTTON");
                boolean z4 = ((i6 & 7168) == 2048) | (i5 == 32);
                Object objP4 = fetVar.P();
                if (z4 || objP4 == obj) {
                    final byte b3 = 1;
                    objP4 = new Function0() { // from class: a.x2m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            y2m y2mVar2 = y2mVar;
                            Function1 function7 = function2;
                            switch (b4) {
                                case 0:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 1:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 2:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 3:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                default:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP4);
                }
                s(mm40VarE2, o0xVar, (Function0) objP4, fetVar, 6);
                fetVar.r(false);
            }
            if (y2mVar.f) {
                fetVar.e0(-2081819600);
                mm40 mm40VarK0 = mrv.k0(jm40Var, y8k0.f42200a);
                boolean z5 = ((57344 & i6) == 16384) | (i5 == 32);
                Object objP5 = fetVar.P();
                if (z5 || objP5 == obj) {
                    final byte b4 = 2;
                    objP5 = new Function0() { // from class: a.x2m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            y2m y2mVar2 = y2mVar;
                            Function1 function7 = function3;
                            switch (b5) {
                                case 0:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 1:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 2:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 3:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                default:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP5);
                }
                str = "DS_CYBER_BANNER_CHAMPIONSHIP_LIVELINE_BUTTON";
                z = false;
                F(o2e.e0(phu0.F(mm40VarK0, null, null, false, null, (Function0) objP5, fetVar, 0, 15), str), y2mVar.h, m0x0.d, fetVar);
                fetVar.r(false);
            } else {
                z = false;
                str = "DS_CYBER_BANNER_CHAMPIONSHIP_LIVELINE_BUTTON";
                fetVar.e0(-2081220897);
                fetVar.r(false);
            }
            if (y2mVar.g) {
                fetVar.e0(-2081154092);
                mm40 mm40VarK1 = mrv.k0(jm40Var, x8k0.f40466a);
                boolean z6 = (i5 == 32 ? true : z) | ((458752 & i6) == 131072 ? true : z);
                Object objP6 = fetVar.P();
                if (z6 || objP6 == obj) {
                    final byte b5 = 3;
                    objP6 = new Function0() { // from class: a.x2m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b6 = b5;
                            y2m y2mVar2 = y2mVar;
                            Function1 function7 = function4;
                            switch (b6) {
                                case 0:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 1:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 2:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                case 3:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                                default:
                                    function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP6);
                }
                F(o2e.e0(phu0.F(mm40VarK1, null, null, false, null, (Function0) objP6, fetVar, 0, 15), str), y2mVar.i, m0x0.e, fetVar);
                fetVar.r(z);
            } else {
                fetVar.e0(-2080374721);
                fetVar.r(z);
            }
            X(6, fetVar, mrv.k0(jm40Var, k9k0.f17919a), y2mVar.b);
            mm40 mm40VarE3 = o2e.e0(mrv.k0(jm40Var, o8k0.f24834a), "DS_CYBER_BANNER_CHAMPIONSHIP_FAVORITE_BUTTON");
            boolean z7 = y2mVar.e;
            boolean z8 = (i6 & 3670016) == 1048576 ? true : z;
            if (i5 == 32) {
                z = true;
            }
            boolean z9 = z8 | z;
            Object objP7 = fetVar.P();
            if (z9 || objP7 == obj) {
                function6 = function5;
                final byte b6 = 4;
                objP7 = new Function0() { // from class: a.x2m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b7 = b6;
                        y2m y2mVar2 = y2mVar;
                        Function1 function7 = function6;
                        switch (b7) {
                            case 0:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            case 1:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            case 2:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            case 3:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                            default:
                                function7.invoke(Long.valueOf(y2mVar2.f41911a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP7);
            } else {
                function6 = function5;
            }
            w(6, fetVar, mm40VarE3, (Function0) objP7, z7);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0(y2mVar, function1, function2, function3, function4, function6, i);
        }
    }

    public static final void q(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-70585248);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(-438615772, new x6s(function1, (byte) 10), fetVar), u1c.M(263318821, new p7y(l7m0Var, function1, (byte) 17), fetVar), null, null, 0, background, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(-610457105, new dqz(l7m0Var, function1, b2), fetVar), fetVar, 805306806, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final void r(mm40 mm40Var, kzh kzhVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        int i3;
        shd shdVar;
        ?? r0;
        float f;
        fet fetVar3;
        Function0 function2;
        kzh kzhVar2 = kzhVar;
        fet fetVar4 = fetVar;
        String str = kzhVar2.j;
        pge pgeVar = gqw0.A;
        function0.getClass();
        function1.getClass();
        fetVar4.g0(362598190);
        if ((i & 6) == 0) {
            i2 = (fetVar4.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar4.g(kzhVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar4.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar4.i(function1) ? 2048 : 1024;
        }
        if (fetVar4.U(i2 & 1, (i2 & 1171) != 1170)) {
            String str2 = kzhVar2.f19153a;
            boolean zG = fetVar4.g(str);
            Object objP = fetVar4.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new wul(lul.e, oe9.d, new ue9(str), true, false, true);
                fetVar4.o0(objP);
            }
            wul wulVar = (wul) objP;
            boolean zG2 = fetVar4.g(str2);
            Object objP2 = fetVar4.P();
            if (zG2 || objP2 == obj) {
                objP2 = new hjm(str2 == null ? "" : str2, null, null, null, null, null, false, null, null, false, null, null, 8190);
                fetVar4.o0(objP2);
            }
            hjm hjmVar = (hjm) objP2;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarD);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z = fetVar4.S;
            Function0 function3 = e7z.u1;
            if (z) {
                fetVar4.l(function3);
            } else {
                fetVar4.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar4);
            jpm0.n(fetVar4);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar5);
            boolean zW = StringsKt.W(hjmVar.f13167a);
            jm40 jm40Var = jm40.b;
            if (zW) {
                i3 = i2;
                fet fetVar5 = fetVar4;
                shdVar = shdVar4;
                r0 = 0;
                f = 1.0f;
                fetVar5.e0(-1897521302);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                fetVar4.e0(-1897777889);
                zcl zclVar = qmk.f28987a;
                shdVar = shdVar4;
                i3 = i2;
                r0 = 0;
                f = 1.0f;
                nkb.h(s5x0.L(o7k0.e(jm40Var, 40.0f), 8.0f, 0.0f, 2), hjmVar, kjm.f18392a, null, null, null, fetVar, 384, 56);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(mm40VarD2, 128.0f), vgg0.a(16.0f));
            ((hi0) fetVar3.k(ii0.f14805a)).getClass();
            long j = hi0.n;
            mm40 mm40VarQ = i120.Q(mm40VarJ, j, jd8.n);
            Object objP3 = fetVar3.P();
            if (objP3 == obj) {
                objP3 = dw9.j(fetVar3);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, (gy40) objP3, null, false, null, function1, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, r0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarW);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(function3);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, r24);
            jpm0.o(fetVar3, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar3, shdVar, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar5);
            n0x n0xVar = kzhVar.l;
            fetVar3.e0(1442786850);
            j0x.b(lv00.T(n0xVar, null, null, null, fetVar, 48, 12), null, yyw.V(jr8.f16991a.b(lgb.J(o7k0.e(o7k0.s(jm40Var, 256.0f), 128.0f), vgg0.c(0.0f, 16.0f, 0.0f, 0.0f, 13)), gqw0.c), fetVar3.k(bmd.n) == k6z.b ? 1 : r0), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
            fetVar.r(r0);
            wvb.A(null, hi0.p, j, fetVar, 6);
            mm40 mm40VarM = s5x0.M(o7k0.c, 16.0f, 12.0f, 16.0f, 8.0f);
            nw3 nw3Var = uc9.g;
            x5d x5dVarA2 = w5d.a(nw3Var, xx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                function2 = function3;
                fetVar.l(function2);
            } else {
                function2 = function3;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, r24);
            jpm0.o(fetVar, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar, shdVar, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar5);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar, r0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, r24);
            jpm0.o(fetVar, bh90VarM4, shdVar3);
            vqd.u(iHashCode4, fetVar, shdVar, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar5);
            mm40 mm40VarD3 = o7k0.d(o7k0.g(jm40Var, 20.0f, 0.0f, 2), 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarD3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, r24);
            jpm0.o(fetVar, bh90VarM5, shdVar3);
            vqd.u(iHashCode5, fetVar, shdVar, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar5);
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new thd((byte) 8);
                fetVar.o0(objP4);
            }
            mm40 mm40VarN = s5x0.N(knx.Q(jm40Var, (xdr) objP4), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            long j2 = qmk.q;
            long j3 = qmk.s;
            long j4 = qmk.n;
            n05 n05Var = new n05(j2, j3, j4);
            String str3 = kzhVar.c;
            y9q0 y9q0VarJ = g1t0.j();
            zfn zfnVar = m8m0.f21378a;
            Function0 function4 = function2;
            shd shdVar6 = shdVar;
            v8q0.a(str3, mm40VarN, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ, fetVar, 0, 24960, 110576);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function4);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar2);
            jpm0.o(fetVar, bh90VarM6, shdVar3);
            vqd.u(iHashCode6, fetVar, shdVar6, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar5);
            j0x.b(a8k0.F(R.drawable.ic_glyph_history, 0, fetVar), null, s5x0.N(o7k0.n(jm40Var, 20.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
            kzhVar2 = kzhVar;
            String str4 = kzhVar2.b;
            j6n.h(str4 == null ? "" : str4, gso0.f11839a, jm40Var, 0, 0, fetVar, 432, 24);
            fetVar.r(true);
            fetVar.r(true);
            v8q0.a(kzhVar2.f, s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.p, j2, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 2, null, g1t0.g(), fetVar, 0, 221568, 77808);
            fetVar.r(true);
            qzb.n(o7k0.d(jm40Var, 1.0f), wulVar, function0, fetVar, (i3 & 896) | 6, 0);
            fet fetVar7 = fetVar;
            ohs0.x(fetVar7, true, true, true);
            fetVar2 = fetVar7;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 28, i, (Object) mm40Var, (Object) kzhVar2, (Object) function0, (Object) function1);
        }
    }

    public static final void s(mm40 mm40Var, o0x o0xVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(572056842);
        int i2 = i | (fetVar.g(o0xVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(phu0.F(o7k0.n(mm40Var, 36.0f), null, null, false, null, function0, fetVar, (i2 << 9) & 458752, 15), ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU(), vgg0.a(12.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_cyber_gamepad, 0, fetVar);
            k7x.b(o0xVar.a(), null, o7k0.n(jm40.b, 18.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, o0xVar, function0, i, (byte) 25);
        }
    }

    public static final void t(a3m a3mVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, fet fetVar, int i) {
        a3mVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        if (a3mVar instanceof y2m) {
            fetVar.e0(792300150);
            p((y2m) a3mVar, function1, function2, function3, function4, function5, fetVar, i & 4194302);
            fetVar.r(false);
        } else {
            if (!(a3mVar instanceof z2m)) {
                throw b1j.f(-1359917595, fetVar, false);
            }
            fetVar.e0(792681884);
            S(jm40.b, ((z2m) a3mVar).f43676a, fetVar, 0);
            fetVar.r(false);
        }
    }

    public static final void u(mm40 mm40Var, mdm mdmVar, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-793760915);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE = ufx.E(fetVar, o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, i2 & 112, 13);
            fetVar2.r(true);
            mm40Var = jm40.b;
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rdb(mm40Var, mdmVar2, i, (byte) 6);
        }
    }

    public static final void v(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1321489893);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE = ufx.E(fetVar, o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i2 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var2, mdmVar, function1, i, (byte) 11);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        fetVar.g0(2122079011);
        int i2 = (fetVar.h(z) ? 32 : 16) | i | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(phu0.F(o7k0.n(mm40Var, 36.0f), null, null, false, null, function0, fetVar, (i2 << 9) & 458752, 15), ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU(), vgg0.a(12.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive;
            mm40 mm40VarN = o7k0.n(jm40.b, 18.0f);
            r2x r2xVarT = jpm0.t(i3, 6, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            dww.b(r2xVarT, null, mm40VarN, StaticColors.INSTANCE.m123getWhite0d7_KjU(), fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5a(mm40Var, z, function0, i, (byte) 1);
        }
    }

    public static final void x(final dk5 dk5Var, fet fetVar, int i) {
        dk5Var.getClass();
        fetVar.g0(468772745);
        int i2 = (fetVar.i(dk5Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            final pz40 pz40VarQ = gkb.Q(vtb.N(dk5Var.h0), null, fetVar, 0, 7);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            final cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            final cgk0 cgk0Var2 = (cgk0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(l4b.ALL);
                fetVar.o0(objP3);
            }
            final pz40 pz40Var = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP4);
            }
            final cgk0 cgk0Var3 = (cgk0) objP4;
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            boolean z2 = cgk0Var.l() == 0;
            final boolean z3 = cgk0Var3.l() == 1;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean z4 = cgk0Var2.l() == 1;
            boolean z5 = (i2 & 14) == 4 || fetVar.i(dk5Var);
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new kad(cgk0Var2, dk5Var, (byte) 1);
                fetVar.o0(objP5);
            }
            final boolean z6 = z2;
            mom.c(n0qVar, z4, womVarF, null, false, null, (Function0) objP5, null, u1c.M(-1959562864, new xdr() { // from class: a.bbr
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ir8) obj).getClass();
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                        pk5 pk5Var = (pk5) pz40VarQ.getValue();
                        boolean z7 = z3;
                        jkm jkmVar = null;
                        if (pk5Var != null) {
                            if (pk5Var instanceof nk5) {
                                jkmVar = ((nk5) pk5Var).f23666a;
                            } else if ((pk5Var instanceof mk5) && z7) {
                                jkmVar = ((mk5) pk5Var).d;
                            }
                        }
                        jkm jkmVar2 = jkmVar;
                        boolean z8 = pk5Var instanceof mk5;
                        dk5 dk5Var2 = dk5Var;
                        cl5 cl5Var2 = ukd.f35823a;
                        if (z8) {
                            fetVar2.e0(-141227262);
                            hdz hdzVarA = kdz.a(((mk5) pk5Var).f, fetVar2);
                            mva mvaVar = hdzVarA.e().f12569a;
                            if (mvaVar != null) {
                                boolean z9 = mvaVar instanceof zo00;
                                cgk0 cgk0Var4 = cgk0Var3;
                                cgk0 cgk0Var5 = cgk0Var;
                                cgk0 cgk0Var6 = cgk0Var2;
                                if (z9) {
                                    cgk0Var4.m(1);
                                    cgk0Var5.m(1);
                                    cgk0Var6.m(0);
                                    dk5Var2.J(((zo00) mvaVar).b);
                                } else if (mvaVar instanceof bp00) {
                                    cgk0Var4.m(0);
                                    cgk0Var5.m(1);
                                    cgk0Var6.m(0);
                                }
                            }
                            mva mvaVar2 = hdzVarA.e().c;
                            if (mvaVar2 instanceof zo00) {
                                dk5Var2.I(((zo00) mvaVar2).b);
                            }
                            if (z6 || z7) {
                                fetVar2.e0(-139661390);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(-140077503);
                                l4b l4bVar = (l4b) pz40Var.getValue();
                                boolean zI = fetVar2.i(dk5Var2);
                                Object objP6 = fetVar2.P();
                                if (zI || objP6 == cl5Var2) {
                                    objP6 = new fj5(dk5Var2, (byte) 3);
                                    fetVar2.o0(objP6);
                                }
                                oja0.x(null, hdzVarA, l4bVar, (Function1) objP6, fetVar2, 64);
                                fetVar2.r(false);
                            }
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-139643534);
                            fetVar2.r(false);
                        }
                        boolean zI2 = fetVar2.i(dk5Var2);
                        Object objP7 = fetVar2.P();
                        if (zI2 || objP7 == cl5Var2) {
                            wej wejVar = new wej(0, dk5Var2, dk5.class, "onRefreshAfterError", "onRefreshAfterError()V", 0, (byte) 18);
                            fetVar2.o0(wejVar);
                            objP7 = wejVar;
                        }
                        oja0.v(jkmVar2, 0.0f, (Function0) ((jhy) objP7), fetVar2, 0);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 100663302, 184);
            fetVar.r(true);
            if (z6) {
                fetVar.e0(-886193269);
                T(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-886154829);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gj5(dk5Var, i, (byte) 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(mm40 mm40Var, final mza0 mza0Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        final byte b2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-110994705);
        int i2 = i | 6 | (fetVar2.g(mza0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b3 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = s5x0.N(jm40Var, xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10);
            mm40Var2 = jm40Var;
            jjm jjmVar = mza0Var.c;
            kjm kjmVar = kjm.f18392a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new plb0(function1, mza0Var, b3);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarN2, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            bml bmlVar = mza0Var.d;
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar2).c, 0.0f, xfn.a(fetVar2).c, 0.0f, 10);
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                b2 = 0;
                objP2 = new Function1() { // from class: a.qlb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        mza0 mza0Var2 = mza0Var;
                        Function1 function2 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b4) {
                            case 0:
                                st0Var.getClass();
                                function2.invoke(new uya0(st0Var.f32750a, mza0Var2.b, mza0Var2.f22644a, st0Var.g));
                                break;
                            default:
                                st0Var.getClass();
                                fxb.D(ivb0.b, new ck60(function2, st0Var, mza0Var2, (byte) 10)).a();
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP2);
            } else {
                b2 = 0;
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = (i3 == 256 ? (byte) 1 : b2) | (i4 == 32 ? (byte) 1 : b2);
            Object objP3 = fetVar2.P();
            if (z4 != 0 || objP3 == cl5Var) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                objP3 = new Function1() { // from class: a.qlb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = c2;
                        mza0 mza0Var2 = mza0Var;
                        Function1 function3 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b4) {
                            case 0:
                                st0Var.getClass();
                                function3.invoke(new uya0(st0Var.f32750a, mza0Var2.b, mza0Var2.f22644a, st0Var.g));
                                break;
                            default:
                                st0Var.getClass();
                                fxb.D(ivb0.b, new ck60(function3, st0Var, mza0Var2, (byte) 10)).a();
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            } else {
                z = true;
            }
            ckb.f(mm40VarD, bmlVar, null, lh80VarU, null, null, function2, (Function1) objP3, fetVar2, 6, 52);
            fetVar2.r(z);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, mza0Var, function1, i, (byte) 21);
        }
    }

    public static final void z(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-857914974);
        int i2 = i | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pm80 pm80VarF = a8k0.F(R.drawable.default_background, 0, fetVar);
            pge pgeVar = gqw0.A;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new vpj0(function0, (byte) 12);
                fetVar.o0(objP);
            }
            k7x.b(str, null, mm40Var, pm80VarF, pm80VarF, null, null, null, (Function1) objP, null, pgeVar, null, fetVar, ((i2 >> 3) & 14) | 37296, 6, 31456);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i, (byte) 8);
        }
    }
}
