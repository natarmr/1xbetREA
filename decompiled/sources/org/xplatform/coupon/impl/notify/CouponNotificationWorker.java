package org.xplatform.coupon.impl.notify;

import a.af3;
import a.b1j;
import a.ctf0;
import a.d5c;
import a.h760;
import a.jf4;
import a.jtb;
import a.n0f;
import a.ng00;
import a.o0f;
import a.o5d0;
import a.qu;
import a.s64;
import a.uqx;
import a.v6j0;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CouponNotificationWorker extends CoroutineWorker {
    public final Context g;
    public final h760 h;
    public final uqx i;
    public final ctf0 j;
    public final s64 k;
    public final qu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = context;
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o0f.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            o0f o0fVar = (o0f) (ze3Var instanceof o0f ? ze3Var : null);
            if (o0fVar != null) {
                h760 h760Var = o0fVar.f24422a;
                v6j0 v6j0Var = o0fVar.b;
                ctf0 ctf0Var = o0fVar.c;
                s64 s64Var = o0fVar.d;
                qu quVar = o0fVar.e;
                h760Var.getClass();
                v6j0Var.getClass();
                ctf0Var.getClass();
                this.h = h760Var;
                this.i = new uqx(v6j0Var, (byte) 1);
                this.j = ctf0Var;
                this.k = s64Var;
                this.l = quVar;
                return;
            }
        }
        jf4.n(b1j.i(o0f.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        n0f n0fVar;
        if (yjeVar instanceof n0f) {
            n0fVar = (n0f) yjeVar;
            int i = n0fVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n0fVar.k = i - Integer.MIN_VALUE;
            } else {
                n0fVar = new n0f(this, (zje) yjeVar);
            }
        } else {
            n0fVar = new n0f(this, (zje) yjeVar);
        }
        Object obj = n0fVar.i;
        wne wneVar = wne.f39444a;
        int i2 = n0fVar.k;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            jtb jtbVar = new jtb(this, yjeVar2, (byte) 28);
            n0fVar.k = 1;
            if (d5c.J(n0fVar, jtbVar) == wneVar) {
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
