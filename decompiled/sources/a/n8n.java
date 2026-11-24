package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23099a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ x03 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;

    public /* synthetic */ n8n(boolean z, float f, long j, x03 x03Var, float f2, long j2, byte b) {
        this.f23099a = b;
        this.b = z;
        this.c = f;
        this.d = j;
        this.e = x03Var;
        this.f = f2;
        this.g = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23099a;
        long j = this.g;
        float f = this.f;
        x03 x03Var = this.e;
        long j2 = this.d;
        float f2 = this.c;
        boolean z = this.b;
        final byte b2 = 1;
        switch (b) {
            case 0:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                final w03 w03VarA = z03.a();
                jge0 jge0VarR = k9x.r(0L, pi9Var.f27033a.d());
                if (z) {
                    w03VarA.f(Float.intBitsToFloat((int) (jge0VarR.g() >> 32)) + f2, Float.intBitsToFloat((int) (jge0VarR.g() & 4294967295L)));
                    w03VarA.e(Float.intBitsToFloat((int) (jge0VarR.h() >> 32)), Float.intBitsToFloat((int) (jge0VarR.h() & 4294967295L)));
                    w03VarA.e(Float.intBitsToFloat((int) (jge0VarR.d() >> 32)) - f2, Float.intBitsToFloat((int) (jge0VarR.d() & 4294967295L)));
                    w03VarA.e(Float.intBitsToFloat((int) (jge0VarR.c() >> 32)), Float.intBitsToFloat((int) (jge0VarR.c() & 4294967295L)));
                } else {
                    w03VarA.f(Float.intBitsToFloat((int) (jge0VarR.g() >> 32)), Float.intBitsToFloat((int) (jge0VarR.g() & 4294967295L)));
                    w03VarA.e(Float.intBitsToFloat((int) (jge0VarR.h() >> 32)) - f2, Float.intBitsToFloat((int) (jge0VarR.h() & 4294967295L)));
                    w03VarA.e(Float.intBitsToFloat((int) (jge0VarR.d() >> 32)), Float.intBitsToFloat((int) (jge0VarR.d() & 4294967295L)));
                    w03VarA.e(Float.intBitsToFloat((int) (jge0VarR.c() >> 32)) + f2, Float.intBitsToFloat((int) (jge0VarR.c() & 4294967295L)));
                }
                w03VarA.c();
                final ucs0 ucs0VarD = saj.D();
                ucs0VarD.s(j2);
                ucs0VarD.v(x03Var);
                final ucs0 ucs0VarD2 = saj.D();
                ucs0VarD2.A(1);
                ucs0VarD2.z(f);
                ucs0VarD2.s(j);
                ucs0VarD2.v(x03Var);
                final byte b3 = 0;
                return pi9Var.b(new Function1() { // from class: a.o8n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b3;
                        ucs0 ucs0Var = ucs0VarD2;
                        ucs0 ucs0Var2 = ucs0VarD;
                        w03 w03Var = w03VarA;
                        g7z g7zVar = (g7z) obj2;
                        g7zVar.getClass();
                        switch (b4) {
                            case 0:
                                x5a x5aVarI = g7zVar.f10839a.b.i();
                                z1x.D(x5aVarI, new ne80(w03Var), ucs0Var2);
                                z1x.D(x5aVarI, new ne80(w03Var), ucs0Var);
                                break;
                            default:
                                x5a x5aVarI2 = g7zVar.f10839a.b.i();
                                z1x.D(x5aVarI2, new ne80(w03Var), ucs0Var2);
                                z1x.D(x5aVarI2, new ne80(w03Var), ucs0Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            default:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                final w03 w03VarA2 = z03.a();
                jge0 jge0VarR2 = k9x.r(0L, pi9Var2.f27033a.d());
                if (z) {
                    w03VarA2.f(Float.intBitsToFloat((int) (jge0VarR2.g() >> 32)) + f2, Float.intBitsToFloat((int) (jge0VarR2.g() & 4294967295L)));
                    w03VarA2.e(Float.intBitsToFloat((int) (jge0VarR2.h() >> 32)), Float.intBitsToFloat((int) (jge0VarR2.h() & 4294967295L)));
                    w03VarA2.e(Float.intBitsToFloat((int) (jge0VarR2.d() >> 32)) - f2, Float.intBitsToFloat((int) (jge0VarR2.d() & 4294967295L)));
                    w03VarA2.e(Float.intBitsToFloat((int) (jge0VarR2.c() >> 32)), Float.intBitsToFloat((int) (jge0VarR2.c() & 4294967295L)));
                } else {
                    w03VarA2.f(Float.intBitsToFloat((int) (jge0VarR2.g() >> 32)), Float.intBitsToFloat((int) (jge0VarR2.g() & 4294967295L)));
                    w03VarA2.e(Float.intBitsToFloat((int) (jge0VarR2.h() >> 32)) - f2, Float.intBitsToFloat((int) (jge0VarR2.h() & 4294967295L)));
                    w03VarA2.e(Float.intBitsToFloat((int) (jge0VarR2.d() >> 32)), Float.intBitsToFloat((int) (jge0VarR2.d() & 4294967295L)));
                    w03VarA2.e(Float.intBitsToFloat((int) (jge0VarR2.c() >> 32)) + f2, Float.intBitsToFloat((int) (jge0VarR2.c() & 4294967295L)));
                }
                w03VarA2.c();
                final ucs0 ucs0VarD3 = saj.D();
                ucs0VarD3.s(j2);
                ucs0VarD3.v(x03Var);
                final ucs0 ucs0VarD4 = saj.D();
                ucs0VarD4.A(1);
                ucs0VarD4.z(f);
                ucs0VarD4.s(j);
                ucs0VarD4.v(x03Var);
                return pi9Var2.b(new Function1() { // from class: a.o8n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b2;
                        ucs0 ucs0Var = ucs0VarD4;
                        ucs0 ucs0Var2 = ucs0VarD3;
                        w03 w03Var = w03VarA2;
                        g7z g7zVar = (g7z) obj2;
                        g7zVar.getClass();
                        switch (b4) {
                            case 0:
                                x5a x5aVarI = g7zVar.f10839a.b.i();
                                z1x.D(x5aVarI, new ne80(w03Var), ucs0Var2);
                                z1x.D(x5aVarI, new ne80(w03Var), ucs0Var);
                                break;
                            default:
                                x5a x5aVarI2 = g7zVar.f10839a.b.i();
                                z1x.D(x5aVarI2, new ne80(w03Var), ucs0Var2);
                                z1x.D(x5aVarI2, new ne80(w03Var), ucs0Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
        }
    }
}
