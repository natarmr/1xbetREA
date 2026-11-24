package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eza implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8662a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ eza(byte b, int i, mm40 mm40Var, String str, String str2, boolean z) {
        this.f8662a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8662a) {
            case 0:
                ((Integer) obj2).getClass();
                ro4.G(x8x.L(1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                knx.v(x8x.L(3073), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                vzb.p(x8x.L(7), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                ep20.b(x8x.L(1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
        }
        return Unit.f46060a;
    }
}
