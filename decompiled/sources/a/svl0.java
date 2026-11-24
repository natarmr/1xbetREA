package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class svl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32874a;
    public final /* synthetic */ u23 b;

    public /* synthetic */ svl0(h83 h83Var, u23 u23Var, byte b) {
        this.f32874a = b;
        this.b = u23Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32874a;
        u23 u23Var = this.b;
        String str = (String) obj;
        str.getClass();
        switch (b) {
            case 0:
                try {
                    e0g0 e0g0Var = j0g0.b;
                    u23Var.a(str);
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                }
                break;
            default:
                try {
                    e0g0 e0g0Var3 = j0g0.b;
                    u23Var.a(str);
                } catch (Throwable unused2) {
                    e0g0 e0g0Var4 = j0g0.b;
                }
                break;
        }
        return Unit.f46060a;
    }
}
