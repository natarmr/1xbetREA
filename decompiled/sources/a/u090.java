package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u090 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34845a;
    public final /* synthetic */ b190 b;

    public /* synthetic */ u090(b190 b190Var, byte b) {
        this.f34845a = b;
        this.b = b190Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34845a;
        b190 b190Var = this.b;
        switch (b) {
            case 0:
                jni jniVar = b190Var.M1;
                if (jniVar != null) {
                    return new t0h0(jniVar, a4n0.f(b190Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                fl70 fl70Var = b190.V1;
                b190Var.H0().x();
                return Unit.f46060a;
            default:
                fl70 fl70Var2 = b190.V1;
                b190Var.H0().x();
                return Unit.f46060a;
        }
    }
}
