package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c3b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3666a;
    public final /* synthetic */ v3b0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ c3b0(v3b0 v3b0Var, String str, byte b) {
        this.f3666a = b;
        this.b = v3b0Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3666a;
        String str = this.c;
        v3b0 v3b0Var = this.b;
        switch (b) {
            case 0:
                v3b0Var.V();
                v3b0Var.Q.remove(str);
                break;
            case 1:
                v3b0Var.V();
                v3b0Var.Q.remove(str);
                break;
            case 2:
                v3b0Var.V();
                v3b0Var.Q.remove(str);
                break;
            case 3:
                v3b0Var.V();
                v3b0Var.Q.remove(str);
                break;
            default:
                v3b0Var.Q.remove(str);
                break;
        }
        return Unit.f46060a;
    }
}
