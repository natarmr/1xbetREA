package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class poh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27329a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ poh(mm40 mm40Var, String str, int i, byte b) {
        this.f27329a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27329a;
        byte b2 = this.d;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                u1c.r(b2, x8x.L(1), fetVar, mm40Var, str);
                break;
            case 1:
                f7k.v(b2, x8x.L(7), fetVar, mm40Var, str);
                break;
            case 2:
                dub.R(b2, x8x.L(7), fetVar, mm40Var, str);
                break;
            case 3:
                r7x.c(x8x.L(b2 | 1), fetVar, mm40Var, str);
                break;
            default:
                eal0.a(x8x.L(b2 | 1), fetVar, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ poh(mm40 mm40Var, String str, int i, int i2, byte b) {
        this.f27329a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i;
    }
}
