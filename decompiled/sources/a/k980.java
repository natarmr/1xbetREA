package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k980 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17903a;
    public final /* synthetic */ aa80 b;

    public /* synthetic */ k980(aa80 aa80Var, byte b) {
        this.f17903a = b;
        this.b = aa80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f17903a;
        aa80 aa80Var = this.b;
        switch (b) {
            case 0:
                d7a d7aVar = (d7a) obj;
                d7aVar.getClass();
                p7m0 p7m0Var = aa80Var.A;
                s880 s880Var = new s880(d7aVar);
                p7m0Var.getClass();
                p7m0Var.o(null, s880Var);
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                p7m0 p7m0Var2 = aa80Var.z;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, d980.a((d980) value, false, null, null, null, null, true, false, 31)));
                break;
        }
        return Unit.f46060a;
    }
}
