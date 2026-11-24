package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rpv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30904a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ rpv0(long j, String str, byte b) {
        this.f30904a = b;
        this.b = j;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.f30904a;
        String str = this.c;
        long j = this.b;
        qpg0 qpg0Var = (qpg0) obj;
        switch (b) {
            case 0:
                qpg0Var.getClass();
                xpg0 xpg0VarZ0 = qpg0Var.Z0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    xpg0VarZ0.o(1, j);
                    xpg0VarZ0.z(2, str);
                    xpg0VarZ0.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ0.close();
                }
            default:
                qpg0Var.getClass();
                xpg0 xpg0VarZ1 = qpg0Var.Z0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    xpg0VarZ1.o(1, j);
                    xpg0VarZ1.z(2, str);
                    xpg0VarZ1.W0();
                    return Integer.valueOf(s0x.R(qpg0Var));
                } finally {
                    xpg0VarZ1.close();
                }
        }
    }
}
