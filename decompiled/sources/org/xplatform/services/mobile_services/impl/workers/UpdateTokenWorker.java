package org.xplatform.services.mobile_services.impl.workers;

import a.af3;
import a.b1j;
import a.ent0;
import a.fnt0;
import a.fsd;
import a.jf4;
import a.kj5;
import a.lp4;
import a.ng00;
import a.o5d0;
import a.sd60;
import a.uii;
import a.ujn;
import a.wne;
import a.yje;
import a.yox;
import a.z1x;
import a.ze3;
import a.zje;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/services/mobile_services/impl/workers/UpdateTokenWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UpdateTokenWorker extends CoroutineWorker {
    public final kj5 g;
    public final sd60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTokenWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fnt0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fnt0 fnt0Var = (fnt0) (ze3Var instanceof fnt0 ? ze3Var : null);
            if (fnt0Var != null) {
                yox yoxVar = fnt0Var.f9853a;
                lp4 lp4Var = fnt0Var.b;
                fsd fsdVar = fnt0Var.c;
                lp4Var.getClass();
                fsdVar.getClass();
                this.g = new kj5();
                this.h = ((uii) yoxVar.f43005a).I();
                return;
            }
        }
        jf4.n(b1j.i(fnt0.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        ent0 ent0Var;
        if (yjeVar instanceof ent0) {
            ent0Var = (ent0) yjeVar;
            int i = ent0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ent0Var.k = i - Integer.MIN_VALUE;
            } else {
                ent0Var = new ent0(this, (zje) yjeVar);
            }
        } else {
            ent0Var = new ent0(this, (zje) yjeVar);
        }
        Object obj = ent0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ent0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                String strB = this.b.b.b("KEY_TOKEN");
                if (strB == null) {
                    return ng00.a();
                }
                if (this.g == null) {
                    Intrinsics.h("checkUrlStandardUseCase");
                    throw null;
                }
                if (!"https://mob-experience.space".equals(ujn.h)) {
                    sd60 sd60Var = this.h;
                    if (sd60Var == null) {
                        Intrinsics.h("processNewPushTokenScenario");
                        throw null;
                    }
                    ent0Var.k = 1;
                    if (sd60Var.i(strB, ent0Var) == wneVar) {
                        return wneVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            return ng00.a();
        } catch (Exception e) {
            e.printStackTrace();
            return ng00.a();
        }
    }
}
