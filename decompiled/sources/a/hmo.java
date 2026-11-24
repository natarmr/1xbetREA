package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hmo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13319a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ short d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hmo(mm40 mm40Var, fak0 fak0Var, boolean z, Function1 function1, int i) {
        this.f13319a = (byte) 3;
        this.b = mm40Var;
        this.f = fak0Var;
        this.e = z;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13319a;
        short s = this.d;
        Object obj3 = this.c;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(s | 1);
                rcb.F(this.b, (kmo) obj4, (Function1) obj3, (fet) obj, iL, this.e ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(s | 1);
                vdb.D(this.b, (lmo) obj4, (Function1) obj3, (fet) obj, iL2, this.e ? 1 : 0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(s | 1);
                bdg0.a(this.b, (cdg0) obj4, (vcg0) obj3, (fet) obj, iL3, this.e ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(s | 1);
                mm40 mm40Var = this.b;
                boolean z = this.e;
                x8x.j(mm40Var, (fak0) obj4, z, (Function1) obj3, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hmo(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f13319a = b;
        this.b = mm40Var;
        this.f = obj;
        this.c = obj2;
        this.d = i;
        this.e = i2;
    }
}
