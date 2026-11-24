package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z9m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44027a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z9m(mm40 mm40Var, int i, long j, long j2, sa50 sa50Var, int i2) {
        this.f44027a = (byte) 2;
        this.e = mm40Var;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.f = sa50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44027a;
        int i = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                ibc.P((String) obj4, this.b, this.c, (y9q0) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                hlm.d((mm40) obj4, this.b, this.c, (Function0) obj3, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                hlm.e((mm40) obj4, this.d, this.b, this.c, (sa50) obj3, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z9m(Object obj, long j, long j2, Object obj2, int i, byte b) {
        this.f44027a = b;
        this.e = obj;
        this.b = j;
        this.c = j2;
        this.f = obj2;
        this.d = i;
    }
}
