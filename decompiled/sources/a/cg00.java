package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cg00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4290a;
    public final /* synthetic */ tdm0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ cg00(tdm0 tdm0Var, boolean z, int i, byte b) {
        this.f4290a = b;
        this.b = tdm0Var;
        this.c = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4290a;
        int i = this.d;
        boolean z = this.c;
        tdm0 tdm0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yyw.t(tdm0Var, z, fetVar, x8x.L(i | 1));
                break;
            default:
                hfm0.e(tdm0Var, z, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
