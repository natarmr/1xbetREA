package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6987a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e0g(int i, int i2, mm40 mm40Var) {
        this.f6987a = (byte) 1;
        this.b = mm40Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6987a) {
            case 0:
                mm40 mm40Var = (mm40) this.b;
                ((Integer) obj2).getClass();
                ozb.F(x8x.L(this.c | 1), (fet) obj, mm40Var);
                break;
            case 1:
                mm40 mm40Var2 = (mm40) this.b;
                ((Integer) obj2).getClass();
                int iL = x8x.L(49);
                xvw.d(this.c, iL, (fet) obj, mm40Var2);
                break;
            case 2:
                mm40 mm40Var3 = (mm40) this.b;
                ((Integer) obj2).getClass();
                m2x.h(x8x.L(this.c | 1), (fet) obj, mm40Var3);
                break;
            case 3:
                mm40 mm40Var4 = (mm40) this.b;
                ((Integer) obj2).getClass();
                jtt0.d(x8x.L(this.c | 1), (fet) obj, mm40Var4);
                break;
            default:
                ((Integer) obj2).getClass();
                obb.B((String) this.b, (fet) obj, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e0g(Object obj, int i, byte b) {
        this.f6987a = b;
        this.b = obj;
        this.c = i;
    }
}
