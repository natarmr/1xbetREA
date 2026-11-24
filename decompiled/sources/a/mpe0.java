package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mpe0 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ppe0 f22176a;

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        zie0 zie0Var = ppe0.S1;
        str.getClass();
        if (str.equals("RESULT_KEY_DATE_TIME_CALENDAR_REQUEST")) {
            long j = bundle.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE", 0L);
            long j2 = bundle.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE", 0L);
            tpe0 tpe0VarH0 = this.f22176a.H0();
            p7m0 p7m0Var = tpe0VarH0.j;
            Boolean bool = Boolean.TRUE;
            p7m0Var.getClass();
            p7m0Var.o(null, bool);
            p7m0 p7m0Var2 = tpe0VarH0.i;
            vpe0 vpe0Var = vpe0.b;
            p7m0Var2.getClass();
            p7m0Var2.o(null, vpe0Var);
            sac.V(jiu0.a(tpe0VarH0), new rpe0(tpe0VarH0, (byte) 1), null, null, new upp(tpe0VarH0, j, j2, null), 14);
        }
    }
}
