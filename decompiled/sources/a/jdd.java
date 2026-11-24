package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jdd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16323a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;

    public /* synthetic */ jdd(mm40 mm40Var, String str, String str2, Function2 function2, Function2 function3, int i, byte b) {
        this.f16323a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = function2;
        this.f = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16323a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                fxb.d(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                dyb.d(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
