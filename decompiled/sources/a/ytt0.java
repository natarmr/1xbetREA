package a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ytt0 implements Continuation, OnCompleteListener, k4r, wzn0, d1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43237a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ytt0(Object obj, byte b) {
        this.f43237a = b;
        this.b = obj;
    }

    @Override // a.d1x
    public void e(e1x e1xVar) throws Exception {
        Object objC;
        g4w0 g4w0Var = (g4w0) this.b;
        try {
            b1x b1xVarB = e1xVar.b();
            if (b1xVarB != null) {
                fck0 fck0Var = g4w0Var.c;
                fck0Var.getClass();
                f0x f0xVarK0 = b1xVarB.K0();
                cy9 cy9Var = f0xVarK0 instanceof dy9 ? ((dy9) f0xVarK0).f6882a : null;
                if (cy9Var != null && ((cy9Var.m() == zx9.f || cy9Var.m() == zx9.d) && cy9Var.p() == yx9.e && cy9Var.o() == ay9.d)) {
                    synchronized (fck0Var.c) {
                        try {
                            objC = ((ArrayDeque) fck0Var.b).size() >= 3 ? fck0Var.c() : null;
                            ((ArrayDeque) fck0Var.b).addFirst(b1xVarB);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (objC != null) {
                        ((b1x) objC).close();
                        return;
                    }
                    return;
                }
                b1xVarB.close();
            }
        } catch (IllegalStateException unused) {
            if (l8x.g0()) {
                Log.e("CXCP", "Failed to acquire latest image");
            }
        }
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        ywu0 ywu0Var = (ywu0) this.b;
        sxs0 sxs0Var = ywu0.s2;
        str.getClass();
        if (bundle.getBoolean("CODE_CONFIRMED_RESULT")) {
            k3t0 k3t0VarP0 = ywu0Var.P0();
            String string = bundle.getString("CODE_CONFIRMED_MESSAGE");
            k3t0VarP0.x(new cwu0(string != null ? string : ""));
        } else {
            k3t0 k3t0VarP1 = ywu0Var.P0();
            String string2 = bundle.getString("CODE_CONFIRMATION_ERROR");
            k3t0VarP1.x(new dwu0(string2 != null ? string2 : ""));
        }
    }

    @Override // a.wzn0
    public Object k() {
        fht0 fht0Var = (fht0) this.b;
        Iterator it = ((Iterable) ((wpg0) fht0Var.b).d(new e9d0((byte) 20))).iterator();
        while (it.hasNext()) {
            ((y3v) fht0Var.c).v((q55) it.next(), 1, false);
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        byte b = this.f43237a;
        Object obj = this.b;
        switch (b) {
            case 1:
                qjj.P((Intent) obj);
                break;
            case 2:
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 3:
                ((nov0) obj).b.trySetResult(null);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }
}
