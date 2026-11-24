package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r4k0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29839a;
    public final /* synthetic */ s4k0 b;

    public /* synthetic */ r4k0(s4k0 s4k0Var, byte b) {
        this.f29839a = b;
        this.b = s4k0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29839a;
        s4k0 s4k0Var = this.b;
        switch (b) {
            case 0:
                s4k0Var.e = "";
                break;
            default:
                s4k0Var.d = "";
                break;
        }
        return Unit.f46060a;
    }
}
