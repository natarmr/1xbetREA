package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qfa0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28623a;
    public final /* synthetic */ hga0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ qfa0(hga0 hga0Var, int i, byte b) {
        this.f28623a = b;
        this.b = hga0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28623a;
        int i = this.c;
        hga0 hga0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                piz.q(hga0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                piz.r(hga0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
