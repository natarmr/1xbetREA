package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37310a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zx7 e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ short g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vf00(String str, String str2, int i, zx7 zx7Var, int i2, int i3, byte b) {
        this.f37310a = b;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = zx7Var;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37310a;
        short s = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                yyw.y(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(s | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                hfm0.l(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(s | 1));
                break;
        }
        return Unit.f46060a;
    }
}
