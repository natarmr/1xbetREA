package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ua90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35318a;
    public final /* synthetic */ db90 b;

    public /* synthetic */ ua90(db90 db90Var, byte b) {
        this.f35318a = b;
        this.b = db90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35318a;
        db90 db90Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                db90Var.A.b(th, new ht80((byte) 17));
                break;
            case 1:
                th.getClass();
                db90Var.A.b(th, new ht80((byte) 20));
                break;
            case 2:
                th.getClass();
                db90Var.A.b(th, new ht80((byte) 16));
                break;
            case 3:
                th.getClass();
                db90Var.A.b(th, new xd80(db90Var, th, (byte) 10));
                break;
            case 4:
                th.getClass();
                db90Var.A.b(th, new ht80((byte) 19));
                break;
            default:
                th.getClass();
                db90Var.A.b(th, new ht80((byte) 18));
                break;
        }
        return Unit.f46060a;
    }
}
