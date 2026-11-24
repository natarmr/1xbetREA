package a;

import android.javax.sip.message.Response;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f38508a;
    public static final uts0 b;
    public static final uts0 c;
    public static final pzn d;
    public static final alo e;

    static {
        zsf zsfVar = new zsf(0.0f, 0.0f, 0.25f, 1.0f);
        f38508a = ro4.m0(300, 0, zsfVar, 2);
        b = ro4.m0(300, 0, zsfVar, 2);
        c = ro4.m0(Response.BUSY_EVERYWHERE, 0, zsfVar, 2);
        zsf zsfVar2 = ihn.f14788a;
        byte b2 = 19;
        d = kzn.j(ro4.m0(300, 0, zsfVar2, 2), new or3(b2));
        e = kzn.l(ro4.m0(300, 0, zsfVar2, 2), new or3(b2));
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final mm40 mm40Var, final x3m x3mVar, final i3m i3mVar, final gy40 gy40Var, final boolean z, final boolean z2, final Float f, final Float f2, final boolean z3, final Function0 function0, final ugd ugdVar, fet fetVar, final int i) {
        int i2;
        fet fetVar2;
        Float f3;
        Object vtjVar;
        Object obj;
        t33 t33Var;
        int i3;
        Float f4;
        float f5;
        float f6;
        boolean z4;
        x3m x3mVar2;
        Object objB;
        Object oflVar;
        agk0 agk0Var;
        afk0 afk0Var;
        Float f7;
        l7m0 l7m0Var;
        t33 t33Var2;
        final x3m x3mVar3;
        boolean z5;
        agk0 agk0Var2;
        Object obj2;
        yje yjeVar;
        byte b2;
        Object obj3;
        final float f8;
        float fFloatValue;
        fetVar.g0(519518316);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(x3mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(i3mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(gy40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.g(f2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.h(z3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= fetVar.i(function0) ? 536870912 : 268435456;
        }
        int i4 = i2;
        if (fetVar.U(i4 & 1, (i4 & 306783379) != 306783378)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            float f9 = j3m.f15841a;
            float f10 = j3m.b;
            float f11 = j3m.c;
            float f12 = j3m.d;
            androidx.compose.runtime.d dVar = zaq0.b;
            final long background = ((ThemeColors) fetVar.k(dVar)).getBackground();
            final long separator = ((ThemeColors) fetVar.k(dVar)).getSeparator();
            final ugg0 ugg0Var = j3m.i;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            Object objP = fetVar.P();
            Object obj4 = ukd.f35823a;
            Object obj5 = objP;
            if (objP == obj4) {
                if (f2 == null) {
                    fFloatValue = 0.0f;
                } else {
                    Float f13 = !Float.isNaN(f2.floatValue()) ? f2 : null;
                    if (f13 != null) {
                        fFloatValue = f13.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                }
                Object objA = androidx.compose.runtime.e.a(fFloatValue);
                fetVar.o0(objA);
                obj5 = objA;
            }
            agk0 agk0Var3 = (agk0) obj5;
            float fW0 = w6kVar.w0(f9);
            float fW1 = w6kVar.w0(f10);
            float fW2 = w6kVar.w0(f11);
            float fW3 = w6kVar.w0(f12);
            Object objP2 = fetVar.P();
            Object obj6 = objP2;
            if (objP2 == obj4) {
                Object objC = xf0.c(0.0f);
                fetVar.o0(objC);
                obj6 = objC;
            }
            t33 t33Var3 = (t33) obj6;
            final pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            float fL = agk0Var3.l() - fW0;
            if (fL < 0.0f) {
                fL = 0.0f;
            }
            float fW4 = w6kVar.w0(((ycl) ((hgk0) i3mVar.c).getValue()).f42389a);
            float fL2 = i3mVar.b.l();
            Float fValueOf = Float.valueOf(fL2);
            if (Float.isNaN(fL2)) {
                fValueOf = null;
            }
            float fC = fValueOf != null ? l1e0.c(fValueOf.floatValue() + fW4, 0.0f, fL) : 0.0f;
            Float fH0 = CollectionsKt.h0(i3mVar.f14104a.d);
            final float fC2 = fH0 != null ? l1e0.c(fH0.floatValue() + fW1, fC, fL) : (fC + fL) / 2.0f;
            boolean z6 = z && fL - fC2 >= fW2;
            boolean z7 = (f == null || Float.isNaN(f.floatValue())) ? false : true;
            if (f == null) {
                f3 = null;
            } else {
                Float f14 = !Float.isNaN(f.floatValue()) ? f : null;
                if (f14 == null || f2 == null || agk0Var3.l() <= 0.0f || Math.abs(agk0Var3.l() - f2.floatValue()) >= 1.0f) {
                    f3 = null;
                } else {
                    f3 = f14;
                }
            }
            Object objP3 = fetVar.P();
            Object obj7 = objP3;
            if (objP3 == obj4) {
                Object objB2 = jgk0.b(new lrk(x3mVar, i3mVar, (byte) 17));
                fetVar.o0(objB2);
                obj7 = objB2;
            }
            l7m0 l7m0Var2 = (l7m0) obj7;
            Object objP4 = fetVar.P();
            Object obj8 = objP4;
            if (objP4 == obj4) {
                Object objE = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objE);
                obj8 = objE;
            }
            pz40 pz40Var = (pz40) obj8;
            boolean zD = fetVar.d(fL) | fetVar.d(fC2) | fetVar.d(fC) | fetVar.h(z6);
            Object objP5 = fetVar.P();
            if (zD || objP5 == obj4) {
                if (z6) {
                    pel pelVar = new pel();
                    pelVar.a(y3m.f41958a, fL);
                    pelVar.a(y3m.b, fC2);
                    pelVar.a(y3m.c, fC);
                    float[] fArr = pelVar.b;
                    ArrayList arrayList = pelVar.f26860a;
                    int size = arrayList.size();
                    nx3.a(size, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    fArrCopyOfRange.getClass();
                    vtjVar = new vtj(arrayList, fArrCopyOfRange);
                } else {
                    pel pelVar2 = new pel();
                    pelVar2.a(y3m.f41958a, fL);
                    pelVar2.a(y3m.c, fC);
                    float[] fArr2 = pelVar2.b;
                    ArrayList arrayList2 = pelVar2.f26860a;
                    int size2 = arrayList2.size();
                    nx3.a(size2, fArr2.length);
                    float[] fArrCopyOfRange2 = Arrays.copyOfRange(fArr2, 0, size2);
                    fArrCopyOfRange2.getClass();
                    vtjVar = new vtj(arrayList2, fArrCopyOfRange2);
                }
                objP5 = vtjVar;
                fetVar.o0(objP5);
            } else {
                l7m0Var2 = l7m0Var2;
                pz40Var = pz40Var;
            }
            vtj vtjVar2 = (vtj) objP5;
            uts0 uts0Var = nu2.f24127a;
            rv2 rv2Var = x3mVar.d;
            Object objP6 = fetVar.P();
            Object obj9 = objP6;
            if (objP6 == obj4) {
                Object xjlVar = new xjl((byte) 16);
                fetVar.o0(xjlVar);
                obj9 = xjlVar;
            }
            afk0 afk0VarA = nu2.a(rv2Var, (Function1) obj9, ro4.m0(300, 0, null, 6), fetVar, 3504);
            int i5 = (i4 & 112) ^ 48;
            boolean zD2 = fetVar.d(fL) | fetVar.d(fC2) | fetVar.d(fC) | fetVar.h(z6) | fetVar.d(fW1) | fetVar.g(f3) | ((i5 > 32 && fetVar.g(x3mVar)) || (i4 & 48) == 32);
            Object objP7 = fetVar.P();
            if (zD2 || objP7 == obj4) {
                final boolean z8 = z6;
                final float f15 = fC;
                obj = obj4;
                final float f16 = fL;
                t33Var = t33Var3;
                i3 = 131072;
                final Float f17 = f3;
                final pz40 pz40Var2 = pz40Var;
                Function0 function1 = new Function0() { // from class: a.q3m
                    /* JADX WARN: Code duplicated, block: B:11:0x002f A[PHI: r2
  0x002f: PHI (r2v9 java.lang.Float) = (r2v2 java.lang.Float), (r2v11 java.lang.Float) binds: [B:16:0x0046, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
                    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
                    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
                    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
                    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
                    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float fL3;
                        int iOrdinal;
                        float fFloatValue2;
                        x3m x3mVar4 = x3mVar;
                        rv2 rv2Var2 = x3mVar4.d;
                        Float fValueOf2 = f17;
                        float f18 = f16;
                        float f19 = fC2;
                        float f20 = f15;
                        if (fValueOf2 == null) {
                            fL3 = rv2Var2.f.l();
                            fValueOf2 = Float.valueOf(fL3);
                            if (Float.isNaN(fL3)) {
                                fValueOf2 = null;
                            }
                            if (fValueOf2 != null) {
                                fFloatValue2 = fValueOf2.floatValue();
                            } else {
                                iOrdinal = x3mVar4.c().ordinal();
                                if (iOrdinal != 0) {
                                    fFloatValue2 = f18;
                                } else if (iOrdinal != 1) {
                                    fFloatValue2 = f19;
                                } else {
                                    if (iOrdinal == 2) {
                                        t9f.b();
                                        return null;
                                    }
                                    fFloatValue2 = f20;
                                }
                            }
                        } else {
                            if (((Boolean) pz40Var2.getValue()).booleanValue() || x3mVar4.c() != ((y3m) rv2Var2.e.getValue())) {
                                fValueOf2 = null;
                            }
                            if (fValueOf2 != null) {
                                fFloatValue2 = fValueOf2.floatValue();
                            } else {
                                fL3 = rv2Var2.f.l();
                                fValueOf2 = Float.valueOf(fL3);
                                if (Float.isNaN(fL3)) {
                                    fValueOf2 = null;
                                }
                                if (fValueOf2 != null) {
                                    fFloatValue2 = fValueOf2.floatValue();
                                } else {
                                    iOrdinal = x3mVar4.c().ordinal();
                                    if (iOrdinal != 0) {
                                        fFloatValue2 = f18;
                                    } else if (iOrdinal != 1) {
                                        fFloatValue2 = f19;
                                    } else {
                                        if (iOrdinal == 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        fFloatValue2 = f20;
                                    }
                                }
                            }
                        }
                        if (!z8 && x3mVar4.c() != y3m.b) {
                            f19 = f20;
                        }
                        float f21 = f18 - f19;
                        return Float.valueOf(f21 > 0.001f ? l1e0.c((f18 - fFloatValue2) / f21, 0.0f, 1.0f) : 1.0f);
                    }
                };
                f4 = f17;
                f5 = f15;
                f6 = f16;
                z4 = z8;
                x3mVar2 = x3mVar;
                objB = jgk0.b(function1);
                fetVar.o0(objB);
            } else {
                f5 = fC;
                objB = objP7;
                t33Var = t33Var3;
                z4 = z6;
                obj = obj4;
                f4 = f3;
                i3 = 131072;
                x3mVar2 = x3mVar;
                f6 = fL;
            }
            final l7m0 l7m0Var3 = (l7m0) objB;
            Object objP8 = fetVar.P();
            Object obj10 = objP8;
            if (objP8 == obj) {
                Object uz40Var = new uz40(Boolean.valueOf(z7 && z2));
                fetVar.o0(uz40Var);
                obj10 = uz40Var;
            }
            uz40 uz40Var2 = (uz40) obj10;
            Object objP9 = fetVar.P();
            Object obj11 = objP9;
            if (objP9 == obj) {
                Object objI = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objI);
                obj11 = objI;
            }
            final vne vneVar = (vne) obj11;
            Float fValueOf2 = Float.valueOf(agk0Var3.l());
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean bool = (Boolean) l7m0Var2.getValue();
            bool.getClass();
            boolean zI = ((i4 & 458752) == i3) | fetVar.i(uz40Var2);
            Object objP10 = fetVar.P();
            if (zI || objP10 == obj) {
                agk0Var = agk0Var3;
                afk0Var = afk0VarA;
                f7 = fValueOf2;
                l7m0Var = l7m0Var2;
                t33Var2 = t33Var;
                oflVar = new ofl(z2, uz40Var2, agk0Var, l7m0Var, (yje) null);
                fetVar.o0(oflVar);
            } else {
                f7 = fValueOf2;
                oflVar = objP10;
                agk0Var = agk0Var3;
                afk0Var = afk0VarA;
                l7m0Var = l7m0Var2;
                t33Var2 = t33Var;
            }
            m0x0.u(f7, boolValueOf, bool, (Function2) oflVar, fetVar);
            boolean zI2 = ((i5 > 32 && fetVar.g(x3mVar2)) || (i4 & 48) == 32) | fetVar.i(vtjVar2) | fetVar.h(z4);
            Object objP11 = fetVar.P();
            if (zI2 || objP11 == obj) {
                x3mVar3 = x3mVar2;
                agk0 agk0Var4 = agk0Var;
                z5 = z4;
                Object c36Var = new c36(x3mVar3, vtjVar2, z5, agk0Var4, l7m0Var, pz40Var);
                agk0Var2 = agk0Var4;
                fetVar.o0(c36Var);
                obj2 = c36Var;
            } else {
                agk0Var2 = agk0Var;
                x3mVar3 = x3mVar2;
                z5 = z4;
                obj2 = objP11;
            }
            m0x0.D((Function0) obj2, fetVar);
            Boolean boolValueOf2 = Boolean.valueOf(x3mVar3.d());
            boolean z9 = (i5 > 32 && fetVar.g(x3mVar3)) || (i4 & 48) == 32;
            Object objP12 = fetVar.P();
            if (z9 || objP12 == obj) {
                yjeVar = null;
                b2 = 1;
                Object d3gVar = new d3g(x3mVar3, yjeVar, b2);
                fetVar.o0(d3gVar);
                obj3 = d3gVar;
            } else {
                yjeVar = null;
                b2 = 1;
                obj3 = objP12;
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) obj3);
            Boolean boolValueOf3 = Boolean.valueOf(z5);
            y3m y3mVarC = x3mVar3.c();
            int i6 = (((i5 <= 32 || !fetVar.g(x3mVar3)) && (i4 & 48) != 32) ? (byte) 0 : b2) | (fetVar.h(z5) ? 1 : 0);
            Object objP13 = fetVar.P();
            Object obj12 = objP13;
            if (i6 != 0 || objP13 == obj) {
                Object u88Var = new u88((Object) x3mVar3, z5, yjeVar, (byte) 14);
                fetVar.o0(u88Var);
                obj12 = u88Var;
            }
            m0x0.v(boolValueOf3, y3mVarC, (Function2) obj12, fetVar);
            Object[] objArr = {Boolean.valueOf(z3), Float.valueOf(f6), Float.valueOf(fW3), x3mVar3};
            final t33 t33Var4 = t33Var2;
            boolean z10 = (((((i4 & 234881024) == 67108864 ? b2 : (byte) 0) | (((i5 <= 32 || !fetVar.g(x3mVar3)) && (i4 & 48) != 32) ? (byte) 0 : b2)) | (fetVar.d(f6) ? 1 : 0)) == true ? 1 : 0) | (fetVar.i(t33Var4) ? 1 : 0) | (fetVar.d(fW3) ? 1 : 0);
            Object objP14 = fetVar.P();
            if (z10 || objP14 == obj) {
                f8 = f6;
                Object s3mVar = new s3m(x3mVar3, z3, f8, t33Var4, fW3, null);
                fetVar.o0(s3mVar);
                objP14 = s3mVar;
            } else {
                f8 = f6;
            }
            m0x0.w(objArr, (Function2) objP14, fetVar);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            byte b3 = ((i5 <= 32 || !fetVar.g(x3mVar3)) && (i4 & 48) != 32) ? (byte) 0 : b2;
            Object objP15 = fetVar.P();
            Object obj13 = objP15;
            if (b3 != 0 || objP15 == obj) {
                Object dplVar = new dpl((Object) x3mVar3, (Object) agk0Var2, (byte) 6);
                fetVar.o0(dplVar);
                obj13 = dplVar;
            }
            mm40 mm40VarY = fre0.Y(mm40VarE, (Function1) obj13);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            final agk0 agk0Var5 = agk0Var2;
            final float f18 = fC2;
            final float f19 = f5;
            final Float f20 = f4;
            final afk0 afk0Var2 = afk0Var;
            final pz40 pz40Var3 = pz40Var;
            fet fetVar3 = fetVar;
            b34.g(uz40Var2, null, d, e, null, u1c.M(-1974975926, new xdr() { // from class: a.r3m
                @Override // a.xdr
                public final Object F(Object obj14, Object obj15, Object obj16) {
                    cl5 cl5Var;
                    fet fetVar4 = (fet) obj15;
                    int iIntValue = ((Integer) obj16).intValue();
                    ((u63) obj14).getClass();
                    byte b4 = 0;
                    if (fetVar4.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                        jm40 jm40Var = jm40.b;
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        final Float f21 = f20;
                        boolean zG = fetVar4.g(f21);
                        final x3m x3mVar4 = x3mVar3;
                        boolean zG2 = zG | fetVar4.g(x3mVar4);
                        final float f22 = f8;
                        boolean zD3 = zG2 | fetVar4.d(f22);
                        final float f23 = f18;
                        boolean zD4 = zD3 | fetVar4.d(f23);
                        final float f24 = f19;
                        boolean zD5 = zD4 | fetVar4.d(f24);
                        final t33 t33Var5 = t33Var4;
                        boolean zI3 = zD5 | fetVar4.i(t33Var5);
                        Object objP16 = fetVar4.P();
                        cl5 cl5Var2 = ukd.f35823a;
                        if (zI3 || objP16 == cl5Var2) {
                            final pz40 pz40Var4 = pz40Var3;
                            final agk0 agk0Var6 = agk0Var5;
                            cl5Var = cl5Var2;
                            xdr xdrVar = new xdr() { // from class: a.m3m
                                /* JADX WARN: Code duplicated, block: B:11:0x0035 A[PHI: r2
  0x0035: PHI (r2v5 java.lang.Float) = (r2v2 java.lang.Float), (r2v7 java.lang.Float) binds: [B:16:0x004c, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:12:0x003a  */
                                /* JADX WARN: Code duplicated, block: B:15:0x004b  */
                                /* JADX WARN: Code duplicated, block: B:18:0x004f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x0059  */
                                /* JADX WARN: Code duplicated, block: B:22:0x005c  */
                                /* JADX WARN: Code duplicated, block: B:24:0x005f  */
                                /* JADX WARN: Code duplicated, block: B:25:0x0062  */
                                /* JADX WARN: Code duplicated, block: B:27:0x0066  */
                                /* JADX WARN: Code duplicated, block: B:28:0x0069  */
                                @Override // a.xdr
                                public final Object F(Object obj17, Object obj18, Object obj19) {
                                    float fL3;
                                    int iOrdinal;
                                    float fFloatValue2;
                                    x3m x3mVar5 = x3mVar4;
                                    rv2 rv2Var2 = x3mVar5.d;
                                    vj30 vj30Var = (vj30) obj17;
                                    pj30 pj30Var = (pj30) obj18;
                                    p4e p4eVar = (p4e) obj19;
                                    vj30Var.getClass();
                                    pj30Var.getClass();
                                    Float fValueOf3 = f21;
                                    if (fValueOf3 == null) {
                                        fL3 = rv2Var2.f.l();
                                        fValueOf3 = Float.valueOf(fL3);
                                        if (Float.isNaN(fL3)) {
                                            fValueOf3 = null;
                                        }
                                        if (fValueOf3 != null) {
                                            fFloatValue2 = fValueOf3.floatValue();
                                        } else {
                                            iOrdinal = x3mVar5.c().ordinal();
                                            if (iOrdinal != 0) {
                                                fFloatValue2 = f22;
                                            } else if (iOrdinal != 1) {
                                                fFloatValue2 = f23;
                                            } else {
                                                if (iOrdinal == 2) {
                                                    t9f.b();
                                                    return null;
                                                }
                                                fFloatValue2 = f24;
                                            }
                                        }
                                    } else {
                                        if (((Boolean) pz40Var4.getValue()).booleanValue() || x3mVar5.c() != ((y3m) rv2Var2.e.getValue())) {
                                            fValueOf3 = null;
                                        }
                                        if (fValueOf3 != null) {
                                            fFloatValue2 = fValueOf3.floatValue();
                                        } else {
                                            fL3 = rv2Var2.f.l();
                                            fValueOf3 = Float.valueOf(fL3);
                                            if (Float.isNaN(fL3)) {
                                                fValueOf3 = null;
                                            }
                                            if (fValueOf3 != null) {
                                                fFloatValue2 = fValueOf3.floatValue();
                                            } else {
                                                iOrdinal = x3mVar5.c().ordinal();
                                                if (iOrdinal != 0) {
                                                    fFloatValue2 = f22;
                                                } else if (iOrdinal != 1) {
                                                    fFloatValue2 = f23;
                                                } else {
                                                    if (iOrdinal == 2) {
                                                        t9f.b();
                                                        return null;
                                                    }
                                                    fFloatValue2 = f24;
                                                }
                                            }
                                        }
                                    }
                                    float fFloatValue3 = ((Number) t33Var5.d()).floatValue() + (agk0Var6.l() - fFloatValue2);
                                    if (fFloatValue3 < 0.0f) {
                                        fFloatValue3 = 0.0f;
                                    }
                                    int i7 = (int) fFloatValue3;
                                    pu90 pu90VarS = pj30Var.S(p4e.b(p4eVar.f26347a, 0, 0, i7, i7, 3));
                                    return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new y1(pu90VarS, (byte) 29));
                                }
                            };
                            fetVar4.o0(xdrVar);
                            objP16 = xdrVar;
                        } else {
                            cl5Var = cl5Var2;
                        }
                        mm40 mm40VarQ = knx.Q(mm40VarD, (xdr) objP16);
                        boolean z11 = z3;
                        Boolean boolValueOf4 = Boolean.valueOf(z11);
                        boolean zH = fetVar4.h(z11);
                        pz40 pz40Var5 = pz40VarF;
                        boolean zG3 = zH | fetVar4.g(pz40Var5);
                        Object objP17 = fetVar4.P();
                        if (zG3 || objP17 == cl5Var) {
                            objP17 = new u3m(z11, pz40Var5, b4);
                            fetVar4.o0(objP17);
                        }
                        mm40 mm40VarA = fnn0.a(mm40VarQ, boolValueOf4, (PointerInputEventHandler) objP17);
                        rv2 rv2Var2 = x3mVar4.d;
                        ma80 ma80Var = ma80.f21447a;
                        mm40 mm40VarA2 = dv2.a(mm40VarA, rv2Var2, true, gy40Var, afk0Var2, 16);
                        long j = background;
                        yjj0 yjj0Var = ugg0Var;
                        mm40 mm40VarJ = lgb.J(i120.Q(mm40VarA2, j, yjj0Var), yjj0Var);
                        zx7 zx7Var = gqw0.f11754a;
                        tj30 tj30VarC2 = zq8.c(zx7Var, false);
                        int iHashCode2 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM2 = fetVar4.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarJ);
                        mkd.c0.getClass();
                        fetVar4.i0();
                        boolean z12 = fetVar4.S;
                        pcy pcyVar = e7z.u1;
                        if (z12) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        shd shdVar = gqw0.x;
                        jpm0.o(fetVar4, tj30VarC2, shdVar);
                        shd shdVar2 = gqw0.w;
                        jpm0.o(fetVar4, bh90VarM2, shdVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        shd shdVar3 = gqw0.y;
                        jpm0.o(fetVar4, numValueOf, shdVar3);
                        jpm0.n(fetVar4);
                        shd shdVar4 = gqw0.v;
                        jpm0.o(fetVar4, mm40VarC1, shdVar4);
                        mm40 mm40VarE0 = o2e.e0(o7k0.c, "DS_CYBER_BOTTOM_SHEET_COLUMN");
                        boolean zG4 = fetVar4.g(x3mVar4);
                        vne vneVar2 = vneVar;
                        boolean zI4 = zG4 | fetVar4.i(vneVar2);
                        Object objP18 = fetVar4.P();
                        if (zI4 || objP18 == cl5Var) {
                            objP18 = new n3m(x3mVar4, vneVar2);
                            fetVar4.o0(objP18);
                        }
                        mm40 mm40VarA3 = pai0.a(mm40VarE0, false, (Function1) objP18);
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                        int iHashCode3 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM3 = fetVar4.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarA3);
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, x5dVarA, shdVar);
                        jpm0.o(fetVar4, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
                        jpm0.o(fetVar4, mm40VarC2, shdVar4);
                        mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, j3m.g, 0.0f, 0.0f, 13);
                        tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                        int iHashCode4 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM4 = fetVar4.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarN);
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC3, shdVar);
                        jpm0.o(fetVar4, bh90VarM4, shdVar2);
                        vqd.u(iHashCode4, fetVar4, shdVar3, fetVar4);
                        jpm0.o(fetVar4, mm40VarC3, shdVar4);
                        zq8.a(0, fetVar4, i120.Q(o7k0.e(o7k0.s(jm40Var, j3m.e), j3m.f), separator, j3m.h));
                        fetVar4.r(true);
                        mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
                        tj30 tj30VarC4 = zq8.c(zx7Var, false);
                        int iHashCode5 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM5 = fetVar4.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar4, mm40VarH);
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC4, shdVar);
                        jpm0.o(fetVar4, bh90VarM5, shdVar2);
                        vqd.u(iHashCode5, fetVar4, shdVar3, fetVar4);
                        jpm0.o(fetVar4, mm40VarC4, shdVar4);
                        w3m.b(l7m0Var3, ugdVar, fetVar4, 6);
                        ohs0.x(fetVar4, true, true, true);
                    } else {
                        fetVar4.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar3, 200064, 18);
            fetVar3.r(b2);
            fetVar2 = fetVar3;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.l3m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).getClass();
                    w3m.a(mm40Var, x3mVar, i3mVar, gy40Var, z, z2, f, f2, z3, function0, ugdVar, (fet) obj14, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(l7m0 l7m0Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(888773125);
        byte b2 = 16;
        int i2 = (fetVar.g(l7m0Var) ? 32 : 16) | i | (fetVar.i(ugdVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new plh(l7m0Var, b2);
                fetVar.o0(objP);
            }
            ugdVar.j(jr8.f16991a, (Function0) objP, fetVar, Integer.valueOf(i2 & 910));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(l7m0Var, ugdVar, i, (byte) 28);
        }
    }

    public static final x3m c(y3m y3mVar, fet fetVar, int i) {
        if ((i & 1) != 0) {
            y3mVar = y3m.f41958a;
        }
        boolean zE = fetVar.e(y3mVar.ordinal());
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            objP = new x3m(y3mVar);
            fetVar.o0(objP);
        }
        return (x3m) objP;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ef -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final void d(a.t33 r11, float r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w3m.d(a.t33, float, a.zje):void");
    }
}
