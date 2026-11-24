package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dh20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6074a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ long g;

    public /* synthetic */ dh20(iil0 iil0Var, l7m0 l7m0Var, l7m0 l7m0Var2, long j, long j2, long j3) {
        this.f6074a = (byte) 2;
        this.c = iil0Var;
        this.e = l7m0Var;
        this.f = l7m0Var2;
        this.b = j;
        this.d = j2;
        this.g = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6074a;
        long j = this.g;
        long j2 = this.d;
        long j3 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j3));
                n1gVar.a(((mn20) obj4).h);
                n1gVar.c = j2;
                n1gVar.c((l1g) obj3);
                n1gVar.d = (j1g) obj2;
                n1gVar.b = j;
                return Unit.f46060a;
            case 1:
                n1g n1gVar2 = (n1g) obj;
                n1gVar2.getClass();
                n1gVar2.b(String.valueOf(j3));
                n1gVar2.a(((mn20) obj4).h);
                n1gVar2.c = j2;
                n1gVar2.c((l1g) obj3);
                n1gVar2.d = (j1g) obj2;
                n1gVar2.b = j;
                return Unit.f46060a;
            default:
                iil0 iil0Var = (iil0) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                long j4 = this.g;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fW0 = fhlVar.w0(iil0Var.f14834a);
                float fW1 = fhlVar.w0(iil0Var.b);
                float fW2 = fhlVar.w0(iil0Var.c);
                float fW3 = fhlVar.w0(iil0Var.d);
                w03 w03VarA = z03.a();
                w03.b(w03VarA, new wfg0(0.0f, 0.0f, Float.intBitsToFloat((int) (fhlVar.d() >> 32)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)), (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L), (((long) Float.floatToRawIntBits(fW3)) << 32) | (((long) Float.floatToRawIntBits(fW3)) & 4294967295L)));
                fhl.C0(fhlVar, w03VarA, ((Boolean) ((l7m0) obj2).getValue()).booleanValue() ? j2 : j3, 0.0f, null, 60);
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    zcl zclVar = qmk.f28987a;
                    float fW4 = fhlVar.w0(2.0f);
                    nr nrVarA0 = fhlVar.A0();
                    long jP = nrVarA0.p();
                    nrVarA0.i().l();
                    try {
                        ((fvt0) nrVarA0.b).i(w03VarA);
                        float f = fW4 / 2.0f;
                        fhl.Q(fhlVar, j4, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - f)) & 4294967295L), fW4, 0, null, 496);
                    } finally {
                        defpackage.c.g(nrVarA0, jP);
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dh20(long j, mn20 mn20Var, long j2, l1g l1gVar, j1g j1gVar, long j3, byte b) {
        this.f6074a = b;
        this.b = j;
        this.c = mn20Var;
        this.d = j2;
        this.e = l1gVar;
        this.f = j1gVar;
        this.g = j3;
    }
}
