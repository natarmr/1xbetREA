package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sme implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32440a;
    public final /* synthetic */ k7q0 b;

    public /* synthetic */ sme(k7q0 k7q0Var, byte b) {
        this.f32440a = b;
        this.b = k7q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jge0 jge0Var;
        j6z j6zVarC;
        char c;
        float fIntBitsToFloat;
        j6z j6zVarC2;
        j6z j6zVarC3;
        j6z j6zVarC4;
        j6z j6zVarC5;
        byte b = this.f32440a;
        k7q0 k7q0Var = this.b;
        switch (b) {
            case 0:
                return new ty2(k7q0Var, (byte) 8);
            case 1:
                k7q0Var.s();
                return Unit.f46060a;
            default:
                j6z j6zVar = (j6z) obj;
                djz djzVar = k7q0Var.d;
                jge0 jge0Var2 = jge0.e;
                if (djzVar == null) {
                    jge0Var = jge0Var2;
                } else {
                    if (djzVar.p) {
                        djzVar = null;
                    }
                    if (djzVar != null) {
                        qe60 qe60Var = k7q0Var.b;
                        long j = k7q0Var.l().b;
                        int i = o9q0.c;
                        int iS = qe60Var.s((int) (j >> 32));
                        int iS2 = k7q0Var.b.s((int) (k7q0Var.l().b & 4294967295L));
                        djz djzVar2 = k7q0Var.d;
                        long jY = 0;
                        long jY2 = (djzVar2 == null || (j6zVarC5 = djzVar2.c()) == null) ? 0L : j6zVarC5.Y(k7q0Var.j(true));
                        djz djzVar3 = k7q0Var.d;
                        if (djzVar3 != null && (j6zVarC4 = djzVar3.c()) != null) {
                            jY = j6zVarC4.Y(k7q0Var.j(false));
                        }
                        djz djzVar4 = k7q0Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (djzVar4 == null || (j6zVarC3 = djzVar4.c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            b9q0 b9q0VarD = djzVar.d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (j6zVarC3.Y((((long) Float.floatToRawIntBits(b9q0VarD != null ? b9q0VarD.f2224a.c(iS).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        djz djzVar5 = k7q0Var.d;
                        if (djzVar5 != null && (j6zVarC2 = djzVar5.c()) != null) {
                            b9q0 b9q0VarD2 = djzVar.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6zVarC2.Y((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(b9q0VarD2 != null ? b9q0VarD2.f2224a.c(iS2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i2 = (int) (jY2 >> c);
                        int i3 = (int) (jY >> c);
                        jge0Var = new jge0(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), (((w6k) djzVar.f6209a.d).getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jY2 & 4294967295L)), Float.intBitsToFloat((int) (jY & 4294967295L))));
                    } else {
                        jge0Var = jge0Var2;
                    }
                }
                djz djzVar6 = k7q0Var.d;
                if (djzVar6 == null || (j6zVarC = djzVar6.c()) == null) {
                    return null;
                }
                return (j6zVarC.h() && j6zVar.h()) ? k9x.r(j6zVar.C(k7x.C(j6zVarC).R(jge0Var.g())), jge0Var.f()) : jge0Var2;
        }
    }
}
