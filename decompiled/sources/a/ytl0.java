package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ytl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43224a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pz40 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ long i;

    public /* synthetic */ ytl0(xdr xdrVar, xdr xdrVar2, pz40 pz40Var, float f, boolean z, pz40 pz40Var2, float f2, long j, byte b) {
        this.f43224a = b;
        this.b = xdrVar;
        this.c = xdrVar2;
        this.d = pz40Var;
        this.e = f;
        this.f = z;
        this.g = pz40Var2;
        this.h = f2;
        this.i = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43224a;
        float f = this.e;
        pz40 pz40Var = this.d;
        xdr xdrVar = this.c;
        xdr xdrVar2 = this.b;
        mm40 mm40VarL = jm40.b;
        switch (b) {
            case 0:
                if (xdrVar2 != null || xdrVar != null || pz40Var.getValue() != null) {
                    final byte b2 = 0;
                    final boolean z = this.f;
                    final pz40 pz40Var2 = this.g;
                    final float f2 = this.h;
                    final long j = this.i;
                    mm40 mm40VarL2 = rq8.L(mm40VarL, new Function1() { // from class: a.dul0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b3 = b2;
                            float f3 = f2;
                            pz40 pz40Var3 = pz40Var2;
                            boolean z2 = z;
                            switch (b3) {
                                case 0:
                                    pi9 pi9Var = (pi9) obj;
                                    pi9Var.getClass();
                                    zcl zclVar = qmk.f28987a;
                                    final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(pi9Var.getDensity() * 1.0f)) << 32) | (((long) Float.floatToRawIntBits(pi9Var.getDensity() * 56.0f)) & 4294967295L);
                                    final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(z2 ? Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(ycl.a(((ycl) pz40Var3.getValue()).f42389a, 96.0f) >= 0 ? pi9Var.getDensity() * 32.0f : pi9Var.getDensity() * f3)) & 4294967295L);
                                    float density = pi9Var.getDensity() * 2.0f;
                                    final long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L);
                                    final byte b4 = 0;
                                    final long j2 = j;
                                    return pi9Var.b(new Function1() { // from class: a.eul0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (b4) {
                                                case 0:
                                                    g7z g7zVar = (g7z) obj2;
                                                    g7zVar.getClass();
                                                    fhl.o0(g7zVar, j2, jFloatToRawIntBits2, jFloatToRawIntBits, jFloatToRawIntBits3, null, 240);
                                                    g7zVar.a();
                                                    break;
                                                default:
                                                    g7z g7zVar2 = (g7z) obj2;
                                                    g7zVar2.getClass();
                                                    fhl.o0(g7zVar2, j2, jFloatToRawIntBits2, jFloatToRawIntBits, jFloatToRawIntBits3, null, 240);
                                                    g7zVar2.a();
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    });
                                default:
                                    pi9 pi9Var2 = (pi9) obj;
                                    pi9Var2.getClass();
                                    zcl zclVar2 = qmk.f28987a;
                                    final long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(pi9Var2.getDensity() * 1.0f)) << 32) | (((long) Float.floatToRawIntBits(pi9Var2.getDensity() * 56.0f)) & 4294967295L);
                                    final long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(z2 ? Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(ycl.a(((ycl) pz40Var3.getValue()).f42389a, 96.0f) >= 0 ? pi9Var2.getDensity() * 32.0f : pi9Var2.getDensity() * f3)) & 4294967295L);
                                    float density2 = pi9Var2.getDensity() * 2.0f;
                                    final long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(density2)) << 32) | (((long) Float.floatToRawIntBits(density2)) & 4294967295L);
                                    final byte b5 = 1;
                                    final long j3 = j;
                                    return pi9Var2.b(new Function1() { // from class: a.eul0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (b5) {
                                                case 0:
                                                    g7z g7zVar = (g7z) obj2;
                                                    g7zVar.getClass();
                                                    fhl.o0(g7zVar, j3, jFloatToRawIntBits5, jFloatToRawIntBits4, jFloatToRawIntBits6, null, 240);
                                                    g7zVar.a();
                                                    break;
                                                default:
                                                    g7z g7zVar2 = (g7z) obj2;
                                                    g7zVar2.getClass();
                                                    fhl.o0(g7zVar2, j3, jFloatToRawIntBits5, jFloatToRawIntBits4, jFloatToRawIntBits6, null, 240);
                                                    g7zVar2.a();
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    });
                            }
                        }
                    });
                    zcl zclVar = qmk.f28987a;
                    mm40VarL = s5x0.L(mm40VarL2, 8.0f, 0.0f, 2);
                }
                return mrv.k0(o7k0.s(mm40VarL, f), "TOTAL_CONTENT_ID");
            default:
                if (xdrVar2 != null || xdrVar != null || pz40Var.getValue() != null) {
                    final byte b3 = 1;
                    final boolean z2 = this.f;
                    final pz40 pz40Var3 = this.g;
                    final float f3 = this.h;
                    final long j2 = this.i;
                    mm40 mm40VarL3 = rq8.L(mm40VarL, new Function1() { // from class: a.dul0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b3;
                            float f4 = f3;
                            pz40 pz40Var4 = pz40Var3;
                            boolean z3 = z2;
                            switch (b4) {
                                case 0:
                                    pi9 pi9Var = (pi9) obj;
                                    pi9Var.getClass();
                                    zcl zclVar2 = qmk.f28987a;
                                    final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(pi9Var.getDensity() * 1.0f)) << 32) | (((long) Float.floatToRawIntBits(pi9Var.getDensity() * 56.0f)) & 4294967295L);
                                    final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(z3 ? Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(ycl.a(((ycl) pz40Var4.getValue()).f42389a, 96.0f) >= 0 ? pi9Var.getDensity() * 32.0f : pi9Var.getDensity() * f4)) & 4294967295L);
                                    float density = pi9Var.getDensity() * 2.0f;
                                    final long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L);
                                    final byte b5 = 0;
                                    final long j3 = j2;
                                    return pi9Var.b(new Function1() { // from class: a.eul0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (b5) {
                                                case 0:
                                                    g7z g7zVar = (g7z) obj2;
                                                    g7zVar.getClass();
                                                    fhl.o0(g7zVar, j3, jFloatToRawIntBits2, jFloatToRawIntBits, jFloatToRawIntBits3, null, 240);
                                                    g7zVar.a();
                                                    break;
                                                default:
                                                    g7z g7zVar2 = (g7z) obj2;
                                                    g7zVar2.getClass();
                                                    fhl.o0(g7zVar2, j3, jFloatToRawIntBits2, jFloatToRawIntBits, jFloatToRawIntBits3, null, 240);
                                                    g7zVar2.a();
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    });
                                default:
                                    pi9 pi9Var2 = (pi9) obj;
                                    pi9Var2.getClass();
                                    zcl zclVar3 = qmk.f28987a;
                                    final long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(pi9Var2.getDensity() * 1.0f)) << 32) | (((long) Float.floatToRawIntBits(pi9Var2.getDensity() * 56.0f)) & 4294967295L);
                                    final long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(z3 ? Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(ycl.a(((ycl) pz40Var4.getValue()).f42389a, 96.0f) >= 0 ? pi9Var2.getDensity() * 32.0f : pi9Var2.getDensity() * f4)) & 4294967295L);
                                    float density2 = pi9Var2.getDensity() * 2.0f;
                                    final long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(density2)) << 32) | (((long) Float.floatToRawIntBits(density2)) & 4294967295L);
                                    final byte b6 = 1;
                                    final long j4 = j2;
                                    return pi9Var2.b(new Function1() { // from class: a.eul0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (b6) {
                                                case 0:
                                                    g7z g7zVar = (g7z) obj2;
                                                    g7zVar.getClass();
                                                    fhl.o0(g7zVar, j4, jFloatToRawIntBits5, jFloatToRawIntBits4, jFloatToRawIntBits6, null, 240);
                                                    g7zVar.a();
                                                    break;
                                                default:
                                                    g7z g7zVar2 = (g7z) obj2;
                                                    g7zVar2.getClass();
                                                    fhl.o0(g7zVar2, j4, jFloatToRawIntBits5, jFloatToRawIntBits4, jFloatToRawIntBits6, null, 240);
                                                    g7zVar2.a();
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    });
                            }
                        }
                    });
                    zcl zclVar2 = qmk.f28987a;
                    mm40VarL = s5x0.L(mm40VarL3, 8.0f, 0.0f, 2);
                }
                return mrv.k0(o7k0.s(mm40VarL, f), "TOTAL_CONTENT_ID");
        }
    }
}
