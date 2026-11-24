package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fqh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9973a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fqh(int i, long j, ow3 ow3Var, mm40 mm40Var, g8k0 g8k0Var) {
        this.b = mm40Var;
        this.e = g8k0Var;
        this.f = ow3Var;
        this.c = j;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9973a;
        byte b2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                plc.a(this.b, (a4x) obj4, (y9q0) obj3, this.c, this.d, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(b2 | 1);
                mm40 mm40Var = this.b;
                qcc.w(mm40Var, (g8k0) obj4, (ow3) obj3, this.c, (fet) obj, iL2);
                break;
            default:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(b2 | 1);
                long j = this.c;
                mm40 mm40Var2 = this.b;
                w7n0.l(iL3, j, fetVar, mm40Var2, (y9q0) obj3, (String) obj4);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fqh(mm40 mm40Var, a4x a4xVar, y9q0 y9q0Var, long j, int i, int i2) {
        this.b = mm40Var;
        this.e = a4xVar;
        this.f = y9q0Var;
        this.c = j;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fqh(String str, y9q0 y9q0Var, long j, mm40 mm40Var, int i) {
        this.e = str;
        this.f = y9q0Var;
        this.c = j;
        this.b = mm40Var;
        this.d = i;
    }
}
