package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bem0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2457a;
    public final /* synthetic */ wem0 b;

    public /* synthetic */ bem0(wem0 wem0Var, int i, byte b) {
        this.f2457a = b;
        this.b = wem0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2457a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                cem0.e(this.b, fetVar, x8x.L(1));
                break;
            default:
                cem0.c(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
