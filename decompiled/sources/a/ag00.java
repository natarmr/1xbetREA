package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ag00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f805a;
    public final /* synthetic */ udm0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ ag00(udm0 udm0Var, boolean z, int i, byte b) {
        this.f805a = b;
        this.b = udm0Var;
        this.c = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f805a;
        int i = this.d;
        boolean z = this.c;
        udm0 udm0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yyw.z(udm0Var, z, fetVar, x8x.L(i | 1));
                break;
            default:
                hfm0.p(udm0Var, z, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
