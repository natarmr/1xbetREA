package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j4q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15897a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j4q(mm40 mm40Var, String str, String str2, Function0 function0, int i, int i2) {
        this.f15897a = (byte) 0;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.f = function0;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15897a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                eeq.G(this.b, this.c, this.d, this.f, (fet) obj, iL, this.e ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                xvw.n(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                bww.q(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ j4q(mm40 mm40Var, String str, String str2, boolean z, Function0 function0, int i, byte b) {
        this.f15897a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = function0;
    }
}
