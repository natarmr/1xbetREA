package org.xplatform.betting.core.tax;

import a.af3;
import a.ali;
import a.b1j;
import a.drm0;
import a.dvj;
import a.g760;
import a.gc1;
import a.gst0;
import a.jf4;
import a.lvq;
import a.mwo0;
import a.ng00;
import a.o5d0;
import a.qjj;
import a.rou;
import a.rwj;
import a.rxu;
import a.tvk;
import a.uwo0;
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
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/betting/core/tax/TaxStatusWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/ga3", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TaxStatusWorker extends CoroutineWorker {
    public final rxu g;
    public final rou h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxStatusWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mwo0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mwo0 mwo0Var = (mwo0) (ze3Var instanceof mwo0 ? ze3Var : null);
            if (mwo0Var != null) {
                gst0 gst0Var = mwo0Var.f22515a;
                drm0 drm0Var = mwo0Var.b;
                rou rouVar = mwo0Var.c;
                gst0Var.getClass();
                this.g = ((ali) drm0Var.f6568a).A();
                this.h = rouVar;
                return;
            }
        }
        jf4.n(b1j.i(mwo0.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        uwo0 uwo0Var;
        if (yjeVar instanceof uwo0) {
            uwo0Var = (uwo0) yjeVar;
            int i = uwo0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uwo0Var.k = i - Integer.MIN_VALUE;
            } else {
                uwo0Var = new uwo0(this, (zje) yjeVar);
            }
        } else {
            uwo0Var = new uwo0(this, (zje) yjeVar);
        }
        Object obj = uwo0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = uwo0Var.k;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            rwj rwjVar = tvk.f34603a;
            dvj dvjVar = dvj.c;
            gc1 gc1Var = new gc1((Object) this, yjeVar2, (byte) 25);
            uwo0Var.k = 1;
            if (qjj.d0(dvjVar, gc1Var, uwo0Var) == wneVar) {
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

    @Override // androidx.work.CoroutineWorker
    public final Object d() {
        g760 g760Var = new g760(this.f25193a, "tax_status");
        g760Var.s.icon = R.drawable.ic_save;
        g760Var.j = -2;
        return new lvq(1, g760Var.a(), 0);
    }
}
