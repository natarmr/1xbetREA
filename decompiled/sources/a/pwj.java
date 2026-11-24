package a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pwj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27714a;
    public final dwj b;

    public pwj(Context context) {
        this.f27714a = context;
        this.b = new dwj(context, (byte) 0);
    }

    public final j16[] a(Handler handler, qlo qloVar, qlo qloVar2, qlo qloVar3, qlo qloVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = this.f27714a;
        vm30 vm30Var = new vm30(context);
        dwj dwjVar = this.b;
        vm30Var.c = dwjVar;
        vm30Var.d = (short) 5000;
        vm30Var.e = handler;
        vm30Var.f = qloVar;
        vm30Var.g = (byte) 50;
        x0x.K(!vm30Var.b);
        Handler handler2 = vm30Var.e;
        x0x.K((handler2 == null && vm30Var.f == null) || !(handler2 == null || vm30Var.f == null));
        vm30Var.b = true;
        arrayList.add(new xm30(vm30Var));
        lsj lsjVar = new lsj();
        lsjVar.b = context;
        lsjVar.c = q24.f;
        x0x.K(!lsjVar.f20581a);
        lsjVar.f20581a = true;
        if (((khf0) lsjVar.d) == null) {
            lsjVar.d = new khf0(new u34[0]);
        }
        n44 n44Var = (n44) lsjVar.f;
        fhj fhjVar = (fhj) lsjVar.g;
        if (n44Var == null) {
            if (fhjVar == null) {
                lsjVar.g = new fhj(context, (byte) 1);
            }
            if (((m2a) lsjVar.e) == null) {
                lsjVar.e = m2a.j;
            }
            mii0 mii0Var = new mii0(context);
            q24 q24Var = context != null ? null : (q24) lsjVar.c;
            Context context2 = (Context) mii0Var.b;
            if (context2 == null) {
                mii0Var.e = q24Var;
            }
            fhj fhjVar2 = (fhj) lsjVar.g;
            mii0Var.c = fhjVar2;
            mii0Var.d = (m2a) lsjVar.e;
            if (fhjVar2 == null) {
                mii0Var.c = new fhj(context2, (byte) 1);
            }
            lsjVar.f = new n44(mii0Var);
        } else {
            x0x.K(fhjVar == null);
            x0x.K(((m2a) lsjVar.e) == null);
        }
        arrayList.add(new fm30(this.f27714a, dwjVar, handler, qloVar2, new osj(lsjVar)));
        arrayList.add(new r9q0(qloVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new sd40(qloVar4, looper));
        }
        arrayList.add(new e1a());
        arrayList.add(new j1x(new wsf0(context)));
        return (j16[]) arrayList.toArray(new j16[0]);
    }
}
