package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a0n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;

    public /* synthetic */ a0n(mm40 mm40Var, String str, int i, String str2, String str3, int i2) {
        this.f33a = (byte) 3;
        this.b = mm40Var;
        this.c = str;
        this.f = i;
        this.d = str2;
        this.e = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wwb.w(x8x.L(i | 1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                d5c.x(x8x.L(i | 1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                aac.G(x8x.L(i | 1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                thb.n(this.f, iL, (fet) obj, this.b, this.c, this.d, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                ucx.l(x8x.L(i | 1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ a0n(mm40 mm40Var, String str, String str2, String str3, int i, byte b) {
        this.f33a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
    }
}
