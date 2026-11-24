package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39503a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;

    public /* synthetic */ wol(mm40 mm40Var, float f, float f2, int i, byte b) {
        this.f39503a = b;
        this.b = mm40Var;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39503a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                pzb.k(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 1:
                uzb.r(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 2:
                u1c.f(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 3:
                v3c.m(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                n4c.i(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
