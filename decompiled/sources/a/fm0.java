package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fm0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9762a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ fm0(dn0 dn0Var, byte b) {
        this.f9762a = b;
        this.b = dn0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9762a;
        dn0 dn0Var = this.b;
        switch (b) {
            case 0:
                dn0Var.c.g = false;
                break;
            default:
                dn0Var.c.h = false;
                break;
        }
        return Unit.f46060a;
    }
}
