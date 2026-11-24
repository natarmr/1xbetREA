package org.xplatform.services.mobile_services.impl.workers;

import a.af3;
import a.b1j;
import a.g760;
import a.h760;
import a.jf4;
import a.lp4;
import a.lvq;
import a.myb;
import a.o5d0;
import a.ojj;
import a.pr4;
import a.suk;
import a.x1x;
import a.ze3;
import a.zx10;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/services/mobile_services/impl/workers/AuthenticatorPushWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/ga3", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthenticatorPushWorker extends CoroutineWorker {
    public final Context g;
    public final suk h;
    public final myb i;
    public final h760 j;
    public final zx10 k;
    public final ojj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticatorPushWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = context;
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pr4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pr4 pr4Var = (pr4) (ze3Var instanceof pr4 ? ze3Var : null);
            if (pr4Var != null) {
                lp4 lp4Var = pr4Var.f27447a;
                h760 h760Var = pr4Var.b;
                zx10 zx10Var = pr4Var.c;
                ojj ojjVar = pr4Var.d;
                lp4Var.getClass();
                h760Var.getClass();
                suk sukVarP = lp4Var.p();
                x1x.x(sukVarP);
                this.h = sukVarP;
                myb mybVarI = lp4Var.i();
                x1x.x(mybVarI);
                this.i = mybVarI;
                this.j = h760Var;
                this.k = zx10Var;
                this.l = ojjVar;
                return;
            }
        }
        jf4.n(b1j.i(pr4.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016e, code lost:
    
        if (a.qjj.d0(r11, r0, r9) == r10) goto L64;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.yje r19) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.services.mobile_services.impl.workers.AuthenticatorPushWorker.c(a.yje):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d() {
        g760 g760Var = new g760(this.f25193a, "auth_push");
        g760Var.s.icon = R.drawable.ic_save;
        g760Var.j = -2;
        return new lvq(1, g760Var.a(), 0);
    }
}
