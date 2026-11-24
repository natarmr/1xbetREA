package org.xplatform.aggregator.daily_tasks.impl.workers;

import a.af3;
import a.b1j;
import a.bby;
import a.cr;
import a.iqt;
import a.jf4;
import a.m0j;
import a.mne;
import a.ng00;
import a.o4j;
import a.o5d0;
import a.pru;
import a.sac;
import a.sje;
import a.t4j;
import a.u4j;
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
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskFinishingNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DailyTaskFinishingNotificationWorker extends CoroutineWorker {
    public final cr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyTaskFinishingNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o4j.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            o4j o4jVar = (o4j) (ze3Var instanceof o4j ? ze3Var : null);
            if (o4jVar != null) {
                this.g = o4jVar.f24638a;
                return;
            }
        }
        jf4.n(b1j.i(o4j.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        m0j m0jVar;
        Unit unit;
        if (yjeVar instanceof m0j) {
            m0jVar = (m0j) yjeVar;
            int i = m0jVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0jVar.k = i - Integer.MIN_VALUE;
            } else {
                m0jVar = new m0j(this, (zje) yjeVar);
            }
        } else {
            m0jVar = new m0j(this, (zje) yjeVar);
        }
        Object obj = m0jVar.i;
        wne wneVar = wne.f39444a;
        int i2 = m0jVar.k;
        yje yjeVar2 = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            int i3 = calendar.get(11);
            if (19 <= i3 && i3 < 24) {
                cr crVar = this.g;
                if (crVar == null) {
                    Intrinsics.h("dailyTasksNotificationProvider");
                    throw null;
                }
                m0jVar.k = 1;
                if (((pru) crVar.b).a().b.z && ((iqt) crVar.l).f15225a.a()) {
                    bby bbyVar = (bby) crVar.r;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    crVar.r = sac.V((sje) crVar.o, u4j.f35051a, null, ((mne) crVar.n).b, new t4j(crVar, yjeVar2, b), 10);
                    unit = Unit.f46060a;
                } else {
                    unit = Unit.f46060a;
                }
                if (unit == wneVar) {
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
    }
}
