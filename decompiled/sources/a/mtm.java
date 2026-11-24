package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mtm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22377a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a4x d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;

    public /* synthetic */ mtm(mm40 mm40Var, String str, a4x a4xVar, String str2, boolean z, int i, byte b) {
        this.f22377a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = a4xVar;
        this.e = str2;
        this.f = z;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22377a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nkb.s(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                uzb.G(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vzb.s(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wzb.E(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
