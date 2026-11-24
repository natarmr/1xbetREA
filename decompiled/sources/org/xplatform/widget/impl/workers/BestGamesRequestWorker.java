package org.xplatform.widget.impl.workers;

import a.af3;
import a.b1j;
import a.bqv0;
import a.c3c0;
import a.cqv0;
import a.fht0;
import a.g760;
import a.jf4;
import a.lvq;
import a.maj;
import a.nb6;
import a.ng00;
import a.nmt0;
import a.o5d0;
import a.rtu;
import a.rzi;
import a.tb6;
import a.ub6;
import a.vb6;
import a.wne;
import a.yje;
import a.z1x;
import a.ze3;
import a.zje;
import a.zlt0;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/ga3", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BestGamesRequestWorker extends CoroutineWorker {
    public final nmt0 g;
    public final zlt0 h;
    public final rtu i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BestGamesRequestWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ub6.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ub6 ub6Var = (ub6) (ze3Var instanceof ub6 ? ze3Var : null);
            if (ub6Var != null) {
                rzi rziVar = ub6Var.f35364a.f35499a;
                rtu rtuVar = ub6Var.b;
                this.g = new nmt0(new fht0(rziVar.e, rziVar.f, rziVar.g, rziVar.h));
                this.h = new zlt0((Object) new fht0(rziVar.e, rziVar.f, rziVar.g, rziVar.h), (byte) 6);
                this.i = rtuVar;
                return;
            }
        }
        jf4.n(b1j.i(ub6.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b6 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:13:0x002f, B:53:0x00b2, B:55:0x00b6, B:56:0x00d1, B:57:0x00d4), top: B:86:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:13:0x002f, B:53:0x00b2, B:55:0x00b6, B:56:0x00d1, B:57:0x00d4), top: B:86:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        tb6 tb6Var;
        String strB;
        boolean z;
        Exception e;
        String str;
        c3c0 c3c0Var;
        List list;
        if (yjeVar instanceof tb6) {
            tb6Var = (tb6) yjeVar;
            int i = tb6Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tb6Var.m = i - Integer.MIN_VALUE;
            } else {
                tb6Var = new tb6(this, (zje) yjeVar);
            }
        } else {
            tb6Var = new tb6(this, (zje) yjeVar);
        }
        Object objC = tb6Var.k;
        wne wneVar = wne.f39444a;
        int i2 = tb6Var.m;
        nmt0 nmt0Var = this.g;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                WorkerParameters workerParameters = this.b;
                strB = workerParameters.b.b("BUNDLE_REQUEST_ID");
                if (strB == null) {
                    return ng00.a();
                }
                maj majVar = workerParameters.b;
                majVar.getClass();
                Object obj = Boolean.FALSE;
                Object obj2 = majVar.f21460a.get("BUNDLE_LIVE_TYPE");
                if (obj2 instanceof Boolean) {
                    obj = obj2;
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                try {
                    rtu rtuVar = this.i;
                    if (rtuVar == null) {
                        Intrinsics.h("getShortProfileScenario");
                        throw null;
                    }
                    try {
                        tb6Var.i = strB;
                        tb6Var.j = zBooleanValue;
                        tb6Var.m = 1;
                        Object objA = rtuVar.a(false, 0, tb6Var);
                        if (objA != wneVar) {
                            z = zBooleanValue;
                            objC = objA;
                        }
                        return wneVar;
                    } catch (Exception e2) {
                        e = e2;
                        str = strB;
                        e.printStackTrace();
                        if (nmt0Var == null) {
                            Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                            throw null;
                        }
                        vb6 vb6Var = new vb6(str, new bqv0(e));
                        nb6 nb6Var = (nb6) ((fht0) nmt0Var.f23789a).b;
                        nb6Var.getClass();
                        nb6Var.b.g(vb6Var);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                e = e;
                str = strB;
                e.printStackTrace();
                if (nmt0Var == null) {
                    Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                    throw null;
                }
                vb6 vb6Var2 = new vb6(str, new bqv0(e));
                nb6 nb6Var2 = (nb6) ((fht0) nmt0Var.f23789a).b;
                nb6Var2.getClass();
                nb6Var2.b.g(vb6Var2);
                return ng00.a();
            }
            if (i2 == 1) {
                boolean z2 = tb6Var.j;
                String str2 = tb6Var.i;
                try {
                    z1x.P(objC);
                    z = z2;
                    strB = str2;
                } catch (Exception e4) {
                    e = e4;
                    str = str2;
                    e.printStackTrace();
                    if (nmt0Var == null) {
                        Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                        throw null;
                    }
                    vb6 vb6Var3 = new vb6(str, new bqv0(e));
                    nb6 nb6Var3 = (nb6) ((fht0) nmt0Var.f23789a).b;
                    nb6Var3.getClass();
                    nb6Var3.b.g(vb6Var3);
                }
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = tb6Var.i;
                try {
                    z1x.P(objC);
                    list = (List) objC;
                    if (nmt0Var != null) {
                        Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                        throw null;
                    }
                    vb6 vb6Var4 = new vb6(str, new cqv0(list));
                    nb6 nb6Var4 = (nb6) ((fht0) nmt0Var.f23789a).b;
                    nb6Var4.getClass();
                    nb6Var4.b.g(vb6Var4);
                    return ng00.a();
                } catch (Exception e5) {
                    e = e5;
                    e.printStackTrace();
                    if (nmt0Var == null) {
                        Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                        throw null;
                    }
                    vb6 vb6Var5 = new vb6(str, new bqv0(e));
                    nb6 nb6Var5 = (nb6) ((fht0) nmt0Var.f23789a).b;
                    nb6Var5.getClass();
                    nb6Var5.b.g(vb6Var5);
                }
            }
            e.printStackTrace();
            if (nmt0Var == null) {
                Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                throw null;
            }
            vb6 vb6Var6 = new vb6(str, new bqv0(e));
            nb6 nb6Var6 = (nb6) ((fht0) nmt0Var.f23789a).b;
            nb6Var6.getClass();
            nb6Var6.b.g(vb6Var6);
            return ng00.a();
            zlt0 zlt0Var = this.h;
            if (zlt0Var == null) {
                Intrinsics.h("widgetGetTopGamesUseCase");
                throw null;
            }
            tb6Var.i = strB;
            tb6Var.j = z;
            tb6Var.m = 2;
            try {
                fht0 fht0Var = (fht0) zlt0Var.b;
                objC = z ? fht0Var.c(c3c0Var, tb6Var) : fht0Var.b(c3c0Var, tb6Var);
                if (objC != wneVar) {
                    str = strB;
                    list = (List) objC;
                    if (nmt0Var != null) {
                        Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                        throw null;
                    }
                    vb6 vb6Var7 = new vb6(str, new cqv0(list));
                    nb6 nb6Var7 = (nb6) ((fht0) nmt0Var.f23789a).b;
                    nb6Var7.getClass();
                    nb6Var7.b.g(vb6Var7);
                    return ng00.a();
                }
                return wneVar;
            } catch (Exception e6) {
                e = e6;
                e = e;
                str = strB;
                e.printStackTrace();
                if (nmt0Var == null) {
                    Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
                    throw null;
                }
                vb6 vb6Var8 = new vb6(str, new bqv0(e));
                nb6 nb6Var8 = (nb6) ((fht0) nmt0Var.f23789a).b;
                nb6Var8.getClass();
                nb6Var8.b.g(vb6Var8);
            }
        } catch (Exception e7) {
            e = e7;
        }
        c3c0Var = (c3c0) objC;
        e = e;
        str = strB;
        e.printStackTrace();
        if (nmt0Var == null) {
            Intrinsics.h("widgetSendWorkerResponseToLocalDataSourceUseCase");
            throw null;
        }
        vb6 vb6Var9 = new vb6(str, new bqv0(e));
        nb6 nb6Var9 = (nb6) ((fht0) nmt0Var.f23789a).b;
        nb6Var9.getClass();
        nb6Var9.b.g(vb6Var9);
        return ng00.a();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d() {
        g760 g760Var = new g760(this.f25193a, "widget_best_update");
        g760Var.s.icon = R.drawable.ic_save;
        g760Var.j = -2;
        return new lvq(10002, g760Var.a(), 0);
    }
}
