package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ayj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1672a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ayj(mm40 mm40Var, String str, String str2, long j, Function1 function1, Function0 function0, int i, int i2) {
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.h = function1;
        this.i = function0;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1672a) {
            case 0:
                ((Integer) obj2).getClass();
                mbc.k(this.c, this.d, this.g, this.b, (y9q0) this.h, (y9q0) this.i, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dtb.m(this.b, this.c, this.d, this.e, (Function1) this.h, (Function0) this.i, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ayj(String str, String str2, int i, mm40 mm40Var, y9q0 y9q0Var, y9q0 y9q0Var2, long j, int i2) {
        this.c = str;
        this.d = str2;
        this.g = i;
        this.b = mm40Var;
        this.h = y9q0Var;
        this.i = y9q0Var2;
        this.e = j;
        this.f = i2;
    }
}
