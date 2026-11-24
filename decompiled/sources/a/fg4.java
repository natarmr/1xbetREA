package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9474a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ fg4(byte b, l7m0 l7m0Var, boolean z) {
        this.f9474a = b;
        this.b = z;
        this.c = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9474a;
        l7m0 l7m0Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                pi9 pi9Var = (pi9) obj;
                rek0 rek0Var = ig4.O1;
                pi9Var.getClass();
                return pi9Var.a(new gg4(z ? CollectionsKt.t0(((lg4) l7m0Var.getValue()).f19989a) : ((lg4) l7m0Var.getValue()).f19989a, (byte) 0));
            case 1:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(z ? ((Number) l7m0Var.getValue()).floatValue() : 0.0f);
                return Unit.f46060a;
            case 2:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b(z ? ((Number) l7m0Var.getValue()).floatValue() : 1.0f);
                return Unit.f46060a;
            default:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.b(z ? 1.0f - ((Number) l7m0Var.getValue()).floatValue() : 0.0f);
                return Unit.f46060a;
        }
    }
}
