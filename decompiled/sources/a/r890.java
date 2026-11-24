package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r890 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30015a;
    public final /* synthetic */ p990 b;

    public /* synthetic */ r890(p990 p990Var, byte b) {
        this.f30015a = b;
        this.b = p990Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30015a;
        p990 p990Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                p990Var.m.b(th, new ht80((byte) 15));
                break;
            case 1:
                th.getClass();
                p990Var.m.b(th, new xd80(p990Var, th, (byte) 9));
                break;
            case 2:
                th.getClass();
                p990Var.m.b(th, new ht80((byte) 11));
                break;
            case 3:
                th.getClass();
                p990Var.m.b(th, new ht80((byte) 14));
                break;
            case 4:
                th.getClass();
                p990Var.m.b(th, new ht80((byte) 12));
                break;
            default:
                th.getClass();
                p990Var.m.b(th, new ht80((byte) 13));
                break;
        }
        return Unit.f46060a;
    }
}
