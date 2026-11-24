package org.xplatform.favorites.impl.data.workers;

import a.af3;
import a.b1j;
import a.b8k0;
import a.bbp;
import a.cbp;
import a.gle0;
import a.h760;
import a.jf4;
import a.k9h0;
import a.ng00;
import a.o5d0;
import a.qu;
import a.s64;
import a.sr00;
import a.t760;
import a.us00;
import a.wne;
import a.yje;
import a.z1x;
import a.z660;
import a.ze3;
import a.zje;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FavoriteLocalNotificationWorker extends CoroutineWorker {
    public final Context g;
    public final h760 h;
    public final s64 i;
    public final qu j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteLocalNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = context;
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bbp.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bbp bbpVar = (bbp) (ze3Var instanceof bbp ? ze3Var : null);
            if (bbpVar != null) {
                h760 h760Var = bbpVar.f2318a;
                s64 s64Var = bbpVar.b;
                qu quVar = bbpVar.c;
                h760Var.getClass();
                this.h = h760Var;
                this.i = s64Var;
                this.j = quVar;
                return;
            }
        }
        jf4.n(b1j.i(bbp.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) throws Throwable {
        cbp cbpVar;
        if (yjeVar instanceof cbp) {
            cbpVar = (cbp) yjeVar;
            int i = cbpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cbpVar.k = i - Integer.MIN_VALUE;
            } else {
                cbpVar = new cbp(this, (zje) yjeVar);
            }
        } else {
            cbpVar = new cbp(this, (zje) yjeVar);
        }
        Object obj = cbpVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cbpVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            Context context = this.g;
            us00 us00VarH = b8k0.H(context);
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(context.getString(R.string.deeplink_scheme) + "://open/favorite"));
            intent.setPackage(context.getPackageName());
            intent.addFlags(268435456);
            intent.putExtra("LOCAL_NOTIFICATION_TYPE", sr00.b);
            h760 h760Var = this.h;
            if (h760Var == null) {
                Intrinsics.h("notificationFeature");
                throw null;
            }
            t760 t760VarA = h760Var.a();
            gle0 gle0Var = k9h0.f17916a;
            String string = us00VarH.getString(R.string.app_name);
            string.getClass();
            String string2 = us00VarH.getString(R.string.favorites_notification_start_notification);
            string2.getClass();
            t760.a(t760VarA, intent, string, string2, 1073741824, null, null, "FAVORITES", 0, null, 944);
            cbpVar.k = 1;
            qu quVar = this.j;
            if (quVar == null) {
                Intrinsics.h("notificationAnalytics");
                throw null;
            }
            quVar.d(z660.FAVORITE_GAME_START);
            s64 s64Var = this.i;
            if (s64Var == null) {
                Intrinsics.h("notificationFatmanLogger");
                throw null;
            }
            Object objB = s64Var.b("favorite_game_start", cbpVar);
            if (objB != wneVar) {
                objB = Unit.f46060a;
            }
            if (objB == wneVar) {
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
