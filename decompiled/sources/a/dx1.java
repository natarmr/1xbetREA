package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dx1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6824a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ dx1(long j, String str, Function0 function0, int i) {
        this.f6824a = (byte) 3;
        this.c = j;
        this.b = str;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6824a) {
            case 0:
                ((Integer) obj2).getClass();
                fx1.d(x8x.L(1), this.c, (fet) obj, this.b, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j120.F(x8x.L(1), this.c, (fet) obj, this.b, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ix1.b(x8x.L(1), this.c, (fet) obj, this.b, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                lgb.f(x8x.L(1), this.c, (fet) obj, this.b, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ dx1(String str, long j, Function0 function0, int i, byte b) {
        this.f6824a = b;
        this.b = str;
        this.c = j;
        this.d = function0;
    }
}
