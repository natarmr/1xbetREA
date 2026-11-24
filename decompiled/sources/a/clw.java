package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class clw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4579a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ggm d;
    public final /* synthetic */ v3n e;
    public final /* synthetic */ int f;

    public /* synthetic */ clw(mm40 mm40Var, String str, ggm ggmVar, v3n v3nVar, int i, byte b) {
        this.f4579a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = ggmVar;
        this.e = v3nVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4579a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ebc.w(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zsm0.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
