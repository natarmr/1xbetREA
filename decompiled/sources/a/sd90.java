package a;

import android.app.Application;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class sd90 extends jbs0 {
    public final mmn b;
    public final yyb0 c;

    public sd90(dvn dvnVar, mmn mmnVar) {
        yyb0 yyb0Var;
        this.b = mmnVar;
        if (dvnVar.b) {
            yyb0Var = dvn.d;
        } else {
            int iMyPid = Process.myPid();
            String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : ua80.e(iMyPid, "Process pid(", Separators.RPAREN);
            synchronized (dvnVar.f6752a) {
                if (!dvnVar.b) {
                    dvn.d = new yyb0(dvnVar, iMyPid, processName);
                    dvnVar.b = true;
                }
            }
            yyb0Var = dvn.d;
        }
        this.c = yyb0Var;
    }
}
