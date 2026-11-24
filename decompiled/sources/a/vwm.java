package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38158a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vwm(mm40 mm40Var, int i, long j, boolean z, Function0 function0, int i2, int i3) {
        this.f38158a = (byte) 2;
        this.b = mm40Var;
        this.f = i;
        this.d = j;
        this.e = z;
        this.c = function0;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38158a) {
            case 0:
                ((Integer) obj2).getClass();
                aac.F(this.b, (String) this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ebc.S(this.b, (String) this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                bfb.F(this.b, this.f, this.d, this.e, (Function0) this.c, (fet) obj, iL, this.g);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vwm(mm40 mm40Var, String str, long j, boolean z, int i, int i2, byte b) {
        this.f38158a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = j;
        this.e = z;
        this.f = i;
        this.g = i2;
    }
}
