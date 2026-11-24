package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f9p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9166a;
    public final /* synthetic */ h9p0 b;

    public /* synthetic */ f9p0(h9p0 h9p0Var, byte b) {
        this.f9166a = b;
        this.b = h9p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9166a;
        h9p0 h9p0Var = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                y2m0 y2m0Var = h9p0.V1;
                h9p0Var.G0().x(new a8p0(jLongValue));
                break;
            case 1:
                uid uidVar = (uid) obj;
                y2m0 y2m0Var2 = h9p0.V1;
                uidVar.getClass();
                h9p0Var.G0().x(new b8p0(uidVar));
                break;
            case 2:
                n8p0 n8p0Var = (n8p0) obj;
                y2m0 y2m0Var3 = h9p0.V1;
                n8p0Var.getClass();
                h9p0Var.G0().x(n8p0Var);
                break;
            default:
                bem bemVar = (bem) obj;
                y2m0 y2m0Var4 = h9p0.V1;
                bemVar.getClass();
                h9p0Var.G0().x(new c8p0(bemVar));
                break;
        }
        return Unit.f46060a;
    }
}
