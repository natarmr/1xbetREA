package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class znb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44668a;
    public final /* synthetic */ gob b;

    public /* synthetic */ znb(gob gobVar, byte b) {
        this.f44668a = b;
        this.b = gobVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f44668a;
        gob gobVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                p7m0 p7m0Var = gobVar.u;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new aob(gobVar.t)));
                break;
            default:
                th.getClass();
                p7m0 p7m0Var2 = gobVar.u;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, new aob(gobVar.t)));
                break;
        }
        return Unit.f46060a;
    }
}
