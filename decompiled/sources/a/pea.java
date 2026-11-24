package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pea implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26842a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ String d;

    public /* synthetic */ pea(mm40 mm40Var, String str, a4x a4xVar, int i) {
        this.f26842a = (byte) 5;
        this.b = mm40Var;
        this.d = str;
        this.c = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26842a;
        String str = this.d;
        a4x a4xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fre0.j(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
            case 1:
                ohq0.o(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
            case 2:
                dub.e(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
            case 3:
                wvb.b(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
            case 4:
                jwb.a(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
            case 5:
                ckb.c(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
            case 6:
                m2x.k(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
            default:
                c3x.o(x8x.L(1), fetVar, a4xVar, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pea(mm40 mm40Var, a4x a4xVar, String str, int i, byte b) {
        this.f26842a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = str;
    }
}
