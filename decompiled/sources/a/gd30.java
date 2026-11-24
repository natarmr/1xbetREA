package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gd30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11088a;
    public final /* synthetic */ fqj0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gd30(fqj0 fqj0Var, boolean z, int i, byte b) {
        this.f11088a = b;
        this.b = fqj0Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11088a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                pzw.u(this.b, this.c, fetVar, x8x.L(49));
                break;
            default:
                hp4.m(this.b, this.c, fetVar, x8x.L(49));
                break;
        }
        return Unit.f46060a;
    }
}
