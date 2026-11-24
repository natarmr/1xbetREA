package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eur implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8436a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ wbs0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ eur(mm40 mm40Var, wbs0 wbs0Var, Function0 function0, int i, byte b) {
        this.f8436a = b;
        this.b = mm40Var;
        this.c = wbs0Var;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8436a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fur.e(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                wgm0.n(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
