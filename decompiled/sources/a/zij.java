package a;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zij implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44441a;
    public final /* synthetic */ ymx b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ egk0 d;

    public /* synthetic */ zij(ymx ymxVar, Function0 function0, egk0 egk0Var, byte b) {
        this.f44441a = b;
        this.b = ymxVar;
        this.c = function0;
        this.d = egk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44441a;
        egk0 egk0Var = this.d;
        Function0 function0 = this.c;
        ymx ymxVar = this.b;
        switch (b) {
            case 0:
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (egk0Var.l() == 0 || jUptimeMillis - egk0Var.l() > ymxVar.f42912a) {
                    egk0Var.m(jUptimeMillis);
                    function0.invoke();
                }
                break;
            default:
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                if (egk0Var.l() == 0 || jUptimeMillis2 - egk0Var.l() > ymxVar.f42912a) {
                    egk0Var.m(jUptimeMillis2);
                    function0.invoke();
                }
                break;
        }
        return Unit.f46060a;
    }
}
