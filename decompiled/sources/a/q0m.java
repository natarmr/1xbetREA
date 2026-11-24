package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q0m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27906a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q0m(int i, long j, ope opeVar, mm40 mm40Var, int i2) {
        this.b = i;
        this.c = j;
        this.e = opeVar;
        this.f = mm40Var;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27906a;
        int i = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                int i2 = this.b;
                long j = this.c;
                tdc.v(i2, j, (ope) obj4, (mm40) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iL2 = x8x.L(i | 1);
                int i3 = this.b;
                kbc.z(i3, (uam) obj4, (a4x) obj3, this.c, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                int i4 = this.b;
                long j2 = this.c;
                l8x.l((fpe) obj4, i4, j2, (mm40) obj3, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ q0m(int i, uam uamVar, a4x a4xVar, long j, int i2) {
        this.b = i;
        this.e = uamVar;
        this.f = a4xVar;
        this.c = j;
        this.d = i2;
    }

    public /* synthetic */ q0m(fpe fpeVar, int i, long j, mm40 mm40Var, int i2) {
        this.e = fpeVar;
        this.b = i;
        this.c = j;
        this.f = mm40Var;
        this.d = i2;
    }
}
