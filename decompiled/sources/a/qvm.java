package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qvm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29392a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zum e;
    public final /* synthetic */ int f;

    public /* synthetic */ qvm(mm40 mm40Var, String str, String str2, zum zumVar, int i, byte b) {
        this.f29392a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = zumVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29392a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dub.G(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jwb.t(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
