package org.xplatform.localtimedif.impl.presentation.localtimediffworker;

import a.af3;
import a.b1j;
import a.dpi0;
import a.drm0;
import a.es00;
import a.gii0;
import a.is00;
import a.jf4;
import a.js00;
import a.kaw;
import a.ls00;
import a.ng00;
import a.o5d0;
import a.qjj;
import a.wne;
import a.yje;
import a.z1x;
import a.ze3;
import a.zje;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/localtimedif/impl/presentation/localtimediffworker/LocalTimeDiffWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/r7x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LocalTimeDiffWorker extends CoroutineWorker {
    public final drm0 g;
    public final dpi0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTimeDiffWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(js00.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            js00 js00Var = (js00) (ze3Var instanceof js00 ? ze3Var : null);
            if (js00Var != null) {
                ls00 ls00Var = js00Var.f17027a;
                es00 es00Var = js00Var.b;
                gii0 gii0Var = js00Var.c;
                drm0 drm0Var = js00Var.d;
                dpi0 dpi0Var = js00Var.e;
                ls00Var.getClass();
                es00Var.getClass();
                gii0Var.getClass();
                this.g = drm0Var;
                this.h = dpi0Var;
                return;
            }
        }
        jf4.n(b1j.i(js00.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        is00 is00Var;
        if (yjeVar instanceof is00) {
            is00Var = (is00) yjeVar;
            int i = is00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                is00Var.k = i - Integer.MIN_VALUE;
            } else {
                is00Var = new is00(this, (zje) yjeVar);
            }
        } else {
            is00Var = new is00(this, (zje) yjeVar);
        }
        Object obj = is00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = is00Var.k;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            CoroutineContext context = is00Var.getContext();
            kaw kawVar = new kaw(this, yjeVar2, (byte) 25);
            is00Var.k = 1;
            if (qjj.d0(context, kawVar, is00Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return ng00.a();
    }
}
