package org.xplatform.widget.impl.workers;

import a.af3;
import a.afp;
import a.aoq;
import a.b1j;
import a.bfp;
import a.bqv0;
import a.cqv0;
import a.dbi;
import a.g760;
import a.hfp;
import a.iun;
import a.jf4;
import a.lvq;
import a.ng00;
import a.ntb;
import a.o2v;
import a.o5d0;
import a.p6d;
import a.pwi;
import a.rmf0;
import a.rpt;
import a.tzi;
import a.utb;
import a.w4p0;
import a.wne;
import a.xvs;
import a.y8p;
import a.yje;
import a.z1x;
import a.ze3;
import a.zep;
import a.zje;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/widget/impl/workers/FavoritesGamesRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/ga3", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FavoritesGamesRequestWorker extends CoroutineWorker {
    public final rmf0 g;
    public final tzi h;
    public final pwi i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesGamesRequestWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bfp.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bfp bfpVar = (bfp) (ze3Var instanceof bfp ? ze3Var : null);
            if (bfpVar != null) {
                dbi dbiVar = (dbi) bfpVar.f2513a.f3330a;
                this.g = new rmf0(new w4p0(bfpVar.b.f35499a.t));
                this.h = dbiVar.s();
                this.i = dbiVar.r();
                return;
            }
        }
        jf4.n(b1j.i(bfp.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:30:0x0095, B:32:0x0099, B:34:0x009d, B:35:0x00b6, B:36:0x00b9), top: B:50:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:30:0x0095, B:32:0x0099, B:34:0x009d, B:35:0x00b6, B:36:0x00b9), top: B:50:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:30:0x0095, B:32:0x0099, B:34:0x009d, B:35:0x00b6, B:36:0x00b9), top: B:50:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        afp afpVar;
        Exception e;
        String str;
        List list;
        if (yjeVar instanceof afp) {
            afpVar = (afp) yjeVar;
            int i = afpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                afpVar.l = i - Integer.MIN_VALUE;
            } else {
                afpVar = new afp(this, (zje) yjeVar);
            }
        } else {
            afpVar = new afp(this, (zje) yjeVar);
        }
        Object obj = afpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = afpVar.l;
        rmf0 rmf0Var = this.g;
        byte b = 1;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            String strB = this.b.b.b("BUNDLE_REQUEST_ID");
            if (strB == null) {
                return ng00.a();
            }
            try {
                tzi tziVar = this.h;
                if (tziVar == null) {
                    Intrinsics.h("observeFavoriteLiveScenario");
                    throw null;
                }
                utb utbVarC = aoq.c(((rpt) tziVar.e).e(xvs.LIVE), new o2v((Object) tziVar, yjeVar2, (byte) 2));
                pwi pwiVar = this.i;
                if (pwiVar == null) {
                    Intrinsics.h("observeFavoriteLineScenario");
                    throw null;
                }
                p6d p6dVar = new p6d(utbVarC, aoq.c(((rpt) pwiVar.c).e(xvs.LINE), new o2v(pwiVar, yjeVar2, b)), new y8p(3, yjeVar2, b), b);
                afpVar.i = strB;
                afpVar.l = 1;
                Object objM = ntb.M(p6dVar, afpVar);
                if (objM == wneVar) {
                    return wneVar;
                }
                obj = objM;
                str = strB;
                list = (List) obj;
                if (list == null) {
                    list = iun.f15405a;
                }
                if (rmf0Var != null) {
                    Intrinsics.h("widgetSendFavoritesWorkerResponseToLocalDataSourceUseCase");
                    throw null;
                }
                hfp hfpVar = new hfp(str, new cqv0(list));
                zep zepVar = (zep) rmf0Var.f30742a.b;
                zepVar.getClass();
                zepVar.b.g(hfpVar);
            } catch (Exception e2) {
                e = e2;
                str = strB;
                e.printStackTrace();
                if (rmf0Var != null) {
                    Intrinsics.h("widgetSendFavoritesWorkerResponseToLocalDataSourceUseCase");
                    throw null;
                }
                hfp hfpVar2 = new hfp(str, new bqv0(e));
                zep zepVar2 = (zep) rmf0Var.f30742a.b;
                zepVar2.getClass();
                zepVar2.b.g(hfpVar2);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = afpVar.i;
            try {
                z1x.P(obj);
                list = (List) obj;
                if (list == null) {
                    list = iun.f15405a;
                }
                if (rmf0Var != null) {
                    Intrinsics.h("widgetSendFavoritesWorkerResponseToLocalDataSourceUseCase");
                    throw null;
                }
                hfp hfpVar3 = new hfp(str, new cqv0(list));
                zep zepVar3 = (zep) rmf0Var.f30742a.b;
                zepVar3.getClass();
                zepVar3.b.g(hfpVar3);
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                if (rmf0Var != null) {
                    Intrinsics.h("widgetSendFavoritesWorkerResponseToLocalDataSourceUseCase");
                    throw null;
                }
                hfp hfpVar4 = new hfp(str, new bqv0(e));
                zep zepVar4 = (zep) rmf0Var.f30742a.b;
                zepVar4.getClass();
                zepVar4.b.g(hfpVar4);
            }
        }
        return ng00.a();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d() {
        g760 g760Var = new g760(this.f25193a, "widget_favorite_update");
        g760Var.s.icon = R.drawable.ic_save;
        g760Var.j = -2;
        return new lvq(10001, g760Var.a(), 0);
    }
}
