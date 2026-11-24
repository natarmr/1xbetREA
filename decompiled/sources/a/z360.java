package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z360 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43706a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mm40 d;

    public /* synthetic */ z360(mm40 mm40Var, boolean z, boolean z2, int i) {
        this.d = mm40Var;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43706a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                u7x.g(x8x.L(1), fetVar, this.d, this.b, this.c);
                break;
            default:
                xdx.s(x8x.L(1), fetVar, this.d, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z360(boolean z, boolean z2, mm40 mm40Var, int i) {
        this.b = z;
        this.c = z2;
        this.d = mm40Var;
    }
}
