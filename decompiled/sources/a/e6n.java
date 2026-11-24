package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e6n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7293a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ e6n(int i, String str) {
        this.f7293a = (byte) 4;
        this.c = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.f7293a;
        String str = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                DsTag dsTag = new DsTag(context, null, 6, 0);
                dsTag.setText(str);
                dsTag.setStyle(i);
                return dsTag;
            case 1:
                DsTag dsTag2 = (DsTag) obj;
                dsTag2.getClass();
                dsTag2.setText(str);
                dsTag2.setStyle(i);
                return Unit.f46060a;
            case 2:
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    xpg0VarZ0.z(1, str);
                    xpg0VarZ0.o(2, i);
                    return xpg0VarZ0.W0() ? new r9o0(xpg0VarZ0.J0(g1x.t(xpg0VarZ0, "work_spec_id")), (int) xpg0VarZ0.getLong(g1x.t(xpg0VarZ0, "generation")), (int) xpg0VarZ0.getLong(g1x.t(xpg0VarZ0, "system_id"))) : null;
                } finally {
                    xpg0VarZ0.close();
                }
            case 3:
                qpg0 qpg0Var2 = (qpg0) obj;
                qpg0Var2.getClass();
                xpg0 xpg0VarZ1 = qpg0Var2.Z0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    xpg0VarZ1.z(1, str);
                    xpg0VarZ1.o(2, i);
                    xpg0VarZ1.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ1.close();
                }
            default:
                qpg0 qpg0Var3 = (qpg0) obj;
                qpg0Var3.getClass();
                xpg0 xpg0VarZ2 = qpg0Var3.Z0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    xpg0VarZ2.o(1, i);
                    xpg0VarZ2.z(2, str);
                    xpg0VarZ2.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ2.close();
                }
        }
    }

    public /* synthetic */ e6n(byte b, int i, String str) {
        this.f7293a = b;
        this.b = str;
        this.c = i;
    }
}
