package a;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg00 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30410a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg00(Object obj, byte b) {
        this.f30410a = b;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        byte b = this.f30410a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vg00 vg00Var = (vg00) obj;
                tg00 tg00Var = vg00Var.c;
                tg00Var.getClass();
                for (ug00 ug00Var : vg00Var.d) {
                    if (!ug00Var.d && ug00Var.c) {
                        jjq jjqVarE = ug00Var.b.e();
                        ug00Var.b = new s88((byte) 6);
                        ug00Var.c = false;
                        tg00Var.b(ug00Var.f35600a, jjqVarE);
                    }
                    q9o0 q9o0Var = vg00Var.b;
                    q9o0Var.getClass();
                    if (q9o0Var.f28360a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                tzi tziVar = (tzi) obj;
                int i = message.what;
                if (i == 1) {
                    ((cum0) tziVar.h).a();
                } else if (i == 2) {
                    ((dum0) tziVar.i).a();
                } else if (i == 3) {
                    ((eum0) tziVar.j).a();
                } else {
                    if (i != 4) {
                        return false;
                    }
                    ((fum0) tziVar.k).a();
                }
                return true;
        }
    }
}
