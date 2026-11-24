package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18036a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kc0(nc0 nc0Var, lr5 lr5Var, int i, bvc bvcVar, Function1 function1) {
        this.f18036a = (byte) 0;
        this.c = nc0Var;
        this.d = lr5Var;
        this.b = i;
        this.e = bvcVar;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18036a;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.b(new a1w0(new lc0((byte) 0, this.b, (nc0) obj5, (lr5) obj4, (bvc) obj3, function1)));
                return Unit.f46060a;
            case 1:
                pu90 pu90Var = (pu90) obj5;
                pu90 pu90Var2 = (pu90) obj4;
                pu90 pu90Var3 = (pu90) obj3;
                pu90 pu90Var4 = (pu90) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, 0, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, 0, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, 0, 0, 0.0f);
                }
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, 0, i - pu90Var4.b, 0.0f);
                }
                return Unit.f46060a;
            case 2:
                jie0 jie0Var = (jie0) obj5;
                qah0 qah0Var = (qah0) obj4;
                pfk0 pfk0Var = (pfk0) obj2;
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                hgk0 hgk0Var = (hgk0) i73Var.e;
                float fFloatValue = ((Number) hgk0Var.getValue()).floatValue() - jie0Var.f16571a;
                float fA = qah0Var.a(fFloatValue);
                jie0Var.f16571a = ((Number) hgk0Var.getValue()).floatValue();
                ((jie0) obj3).f16571a = ((Number) i73Var.b()).floatValue();
                ucz uczVarD = pfk0Var.f26910a.d();
                if (uczVarD == null) {
                    i73Var.a();
                    return Unit.f46060a;
                }
                if (pfk0Var.e(i73Var, uczVarD, i, new gvj0(1, qah0Var, qah0.class, "scrollBy", "scrollBy(F)F", 0, (byte) 15)) || Math.abs(fFloatValue - fA) > 0.5f) {
                    i73Var.a();
                }
                return Unit.f46060a;
            default:
                nqq nqqVar = (nqq) obj4;
                jge0 jge0Var = (jge0) obj3;
                f8m f8mVar = (f8m) obj2;
                vx7 vx7Var = (vx7) obj;
                if (((nqq) obj5) != ((ypq) vcc.a0(nqqVar).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zB = k7n0.B(i, f8mVar, nqqVar, jge0Var);
                Boolean boolValueOf = Boolean.valueOf(zB);
                if (zB || !vx7Var.a()) {
                    return boolValueOf;
                }
                return null;
        }
    }

    public /* synthetic */ kc0(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f18036a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }

    public /* synthetic */ kc0(nqq nqqVar, nqq nqqVar2, jge0 jge0Var, int i, f8m f8mVar) {
        this.f18036a = (byte) 3;
        this.c = nqqVar;
        this.d = nqqVar2;
        this.e = jge0Var;
        this.b = i;
        this.f = f8mVar;
    }
}
