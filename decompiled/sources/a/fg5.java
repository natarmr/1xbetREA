package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fg5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9476a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ fg5(mm40 mm40Var, String str, int i, Function0 function0, int i2) {
        this.f9476a = (byte) 0;
        this.b = mm40Var;
        this.c = str;
        this.e = i;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9476a;
        int i = this.e;
        Function0 function0 = this.d;
        String str = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                xia0.g(this.b, this.c, this.e, this.d, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rsr0.M(mm40Var, str, function0, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                hew0.B(mm40Var, str, function0, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                acb.x(mm40Var, str, function0, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                j120.G(mm40Var, str, function0, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zdx.h(mm40Var, str, function0, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fg5(mm40 mm40Var, String str, Function0 function0, int i, byte b) {
        this.f9476a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = function0;
        this.e = i;
    }
}
