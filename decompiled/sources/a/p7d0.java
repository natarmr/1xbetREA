package a;

import android.media.RingtoneManager;
import android.os.Trace;
import android.provider.Settings;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p7d0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26501a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p7d0(Object obj, byte b) {
        this.f26501a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26501a;
        Object obj = this.b;
        switch (b) {
            case 0:
                q7d0 q7d0Var = (q7d0) obj;
                return q7d0Var.f28244a.getSharedPreferences(q7d0Var.b, 0);
            case 1:
                return Float.valueOf(((ilq) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            case 2:
                xi70 xi70Var = sdd0.i2;
                return new ko60((sdd0) obj, (byte) 11);
            case 3:
                ned0 ned0Var = (ned0) obj;
                String path = RingtoneManager.getDefaultUri(2).getPath();
                if (path == null && (path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath()) == null) {
                    path = "";
                }
                ned0Var.x(new ged0(((xr) ned0Var.e.f30901a).i() == rl40.GMS, path, ned0Var.q.c(path)));
                return Unit.f46060a;
            case 4:
                return (gkd0) ((gii0) ((z220) obj).c).b(sre0.f32672a.b(gkd0.class));
            case 5:
                return ((OnexDatabase) ((rrc) ((ywu) obj).b).b).s();
            case 6:
                jh70 jh70Var = xqd0.S1;
                fiu0 fiu0Var = ((xqd0) obj).P1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 7:
                wqi wqiVar = ((srd0) obj).K1;
                if (wqiVar != null) {
                    return new q0h0(wqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 8:
                return (ysd0) ((gii0) ((j910) obj).b).b(sre0.f32672a.b(ysd0.class));
            case 9:
                return (itd0) ((gii0) ((kd30) obj).f18086a).b(sre0.f32672a.b(itd0.class));
            case 10:
                xqi xqiVar = ((uud0) obj).L1;
                if (xqiVar != null) {
                    return new q0h0(xqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 11:
                return (vud0) ((gii0) ((nw20) obj).f24215a).b(sre0.f32672a.b(vud0.class));
            case 12:
                bsf bsfVar = (bsf) obj;
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) bsfVar.m.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.n.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.p.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) bsfVar.o.getValue()).b(), lc00VarB);
            case 13:
                return (q1e0) ((gii0) ((dq00) obj).b).b(sre0.f32672a.b(q1e0.class));
            case 14:
                mi70 mi70Var = o2e0.b2;
                fiu0 fiu0Var2 = ((o2e0) obj).Y1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 15:
                xi70 xi70Var2 = i4e0.P1;
                fiu0 fiu0Var3 = ((i4e0) obj).K1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 16:
                i1w0 i1w0Var = ((t4e0) obj).q;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 17:
                return (z4e0) ((gii0) ((g090) obj).f10448a).b(sre0.f32672a.b(z4e0.class));
            case 18:
                jh70 jh70Var2 = s5e0.P1;
                fiu0 fiu0Var4 = ((s5e0) obj).L1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                nh70 nh70Var = k7e0.S1;
                fiu0 fiu0Var5 = ((k7e0) obj).P1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 20:
                return (l7e0) ((n7e0) obj).b.b(sre0.f32672a.b(l7e0.class));
            case 21:
                return (p7e0) ((gii0) ((zn00) obj).f44650a).b(sre0.f32672a.b(p7e0.class));
            case 22:
                mi70 mi70Var2 = f8e0.Q1;
                fiu0 fiu0Var6 = ((f8e0) obj).N1;
                if (fiu0Var6 != null) {
                    return fiu0Var6;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 23:
                List list = RealWebSocket.x;
                ((RealWebSocket) obj).h();
                return Unit.f46060a;
            case 24:
                List list2 = RealWebSocket.x;
                _UtilCommonKt.b((WebSocketWriter) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                iiy[] iiyVarArr = ice0.c2;
                kxq kxqVarB = ((ice0) obj).B();
                if (kxqVarB != null) {
                    kxqVarB.finishAffinity();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                mce0 mce0Var = (mce0) obj;
                iiy[] iiyVarArr2 = mce0.e2;
                i1w0 i1w0VarF = a4n0.f(mce0Var);
                eri eriVar = mce0Var.c2;
                if (eriVar != null) {
                    return new ry3(i1w0VarF, eriVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fl70 fl70Var = xce0.N1;
                fiu0 fiu0Var7 = ((xce0) obj).K1;
                if (fiu0Var7 != null) {
                    return fiu0Var7;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                p7m0 p7m0Var = ((nde0) obj).g;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
            default:
                oge0 oge0Var = (oge0) obj;
                oge0Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    oge0Var.a();
                    return Unit.f46060a;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
