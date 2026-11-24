package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dxe implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6842a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dxe(mm40 mm40Var, hcm hcmVar, boolean z, Function1 function1, int i, int i2) {
        this.f6842a = (byte) 3;
        this.b = mm40Var;
        this.e = hcmVar;
        this.d = z;
        this.f = function1;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6842a;
        byte b2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(b2 | 1);
                plc.d(this.b, (j43) obj4, (k43) obj3, (fet) obj, iL, this.d ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(b2 | 1);
                ieb.m(this.b, (kjl) obj4, (Function0) obj3, (fet) obj, iL2, this.d ? 1 : 0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(b2 | 1);
                wha0.n(this.b, (y9q0) obj4, (y8n) obj3, (fet) obj, iL3, this.d ? 1 : 0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(3457);
                xbc.m(this.b, (hcm) obj4, this.d, (Function1) obj3, (fet) obj, iL4, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(b2 | 1);
                mm40 mm40Var = this.b;
                boolean z = this.d;
                nia0.x(mm40Var, (a2n) obj4, z, (Function1) obj3, (fet) obj, iL5);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dxe(mm40 mm40Var, a2n a2nVar, boolean z, Function1 function1, int i) {
        this.f6842a = (byte) 4;
        this.b = mm40Var;
        this.e = a2nVar;
        this.d = z;
        this.f = function1;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dxe(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f6842a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.c = i;
        this.d = i2;
    }
}
