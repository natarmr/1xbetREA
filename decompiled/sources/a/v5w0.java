package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v5w0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36846a;
    public final /* synthetic */ kii0 b;

    public /* synthetic */ v5w0(kii0 kii0Var, byte b) {
        this.f36846a = b;
        this.b = kii0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36846a;
        kii0 kii0Var = this.b;
        switch (b) {
            case 0:
                return (w4w0) ((lii0) kii0Var).f20108a.b(sre0.f32672a.b(w4w0.class));
            case 1:
                return (w4w0) ((lii0) kii0Var).a(sre0.f32672a.b(w4w0.class));
            default:
                return (uyk) ((lii0) kii0Var).a(sre0.f32672a.b(uyk.class));
        }
    }
}
