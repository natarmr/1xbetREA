package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jws0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17270a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ y3d e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jws0(mm40 mm40Var, String str, boolean z, y3d y3dVar, int i, int i2, byte b) {
        this.f17270a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = z;
        this.e = y3dVar;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17270a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                afn0.d(this.b, this.c, this.d, this.e, (fet) obj, iL, this.f ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                ghm0.e(this.b, this.c, this.d, this.e, (fet) obj, iL2, this.f ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }
}
