package a;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pr0 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27440a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public pr0(ExoPlayer exoPlayer, jeu0 jeu0Var, lwk lwkVar) {
        this.f27440a = (byte) 26;
        this.b = exoPlayer;
        this.c = jeu0Var;
    }

    @Override // a.kwk
    public final void a() {
        my90 my90Var;
        Window window;
        byte b = this.f27440a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity != null && activity.isChangingConfigurations()) {
                    ((pz40) obj).setValue(Boolean.TRUE);
                    break;
                }
                break;
            case 1:
                ((clz) obj2).x().f((g02) obj);
                break;
            case 2:
                ((rb5) obj2).b((uhd) obj);
                break;
            case 3:
                ((View) obj2).removeOnLayoutChangeListener((vv5) obj);
                break;
            case 4:
                ((ulo) ((ExoPlayer) obj2)).G((l69) obj);
                break;
            case 5:
                ((ulo) ((ExoPlayer) obj2)).G((m69) obj);
                break;
            case 6:
                ((elf) obj2).y((ilf) obj);
                break;
            case 7:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((mr3) obj);
                break;
            case 8:
                ((z6h) obj2).a(new y6h(1, (i3t0) obj, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1));
                break;
            case 9:
                if (((Boolean) ((pz40) obj).getValue()).booleanValue()) {
                    ((pz40) obj2).setValue(Boolean.TRUE);
                }
                break;
            case 10:
                obj.getClass();
                ((i3m) obj2).f14104a.remove(obj);
                break;
            case 11:
                ((z7x) obj2).f43942a.j((x7x) obj);
                break;
            case 12:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener((thq) obj);
                }
                break;
            case 13:
                ((ldz) obj2).c.k(obj);
                break;
            case 14:
                ((clz) obj2).x().f((sfd) obj);
                break;
            case 15:
                ((yjd) obj2).h();
                ((gf50) obj).e = null;
                break;
            case 16:
                d9z d9zVar = (d9z) obj2;
                ((Function1) ((pz40) obj).getValue()).invoke(new dp60(d9zVar.h(), d9zVar.i()));
                break;
            case 17:
                rba0 rba0Var = (rba0) obj2;
                if (rba0Var != null && (my90Var = (my90) obj) != null) {
                    ((ulo) my90Var).G(rba0Var);
                    break;
                }
                break;
            case 18:
                ((rb5) obj2).b((ckd) obj);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((clz) obj2).x().f((co) obj);
                break;
            case 20:
                ((ekf0) obj2).p.remove(obj);
                break;
            case 21:
                pz40 pz40Var = (pz40) obj;
                jub0 jub0Var = (jub0) pz40Var.getValue();
                if (jub0Var != null) {
                    iub0 iub0Var = new iub0(jub0Var);
                    gy40 gy40Var = (gy40) obj2;
                    if (gy40Var != null) {
                        gy40Var.b(iub0Var);
                    }
                    pz40Var.setValue(null);
                }
                break;
            case 22:
                ((e9q0) obj2).c.remove((Function1) obj);
                break;
            case 23:
                ((oms0) obj2).k.remove((oms0) obj);
                break;
            case 24:
                oms0 oms0Var = (oms0) obj2;
                oms0Var.getClass();
                uls0 uls0Var = (uls0) ((hgk0) ((vls0) obj).b).getValue();
                if (uls0Var != null) {
                    oms0Var.j.remove(uls0Var.f35890a);
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((oms0) obj2).j.remove((cms0) obj);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                ((ulo) exoPlayer).G((jeu0) obj);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    ((ulo) exoPlayer).F();
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                    return;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Activity activity2 = (Activity) obj2;
                if (activity2 != null && (window = activity2.getWindow()) != null) {
                    Integer num = (Integer) obj;
                    window.setSoftInputMode(num != null ? num.intValue() : 48);
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                djv0 djv0Var = (djv0) obj2;
                View view = (View) obj;
                int i = djv0Var.u - 1;
                djv0Var.u = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    igu0.c(view, null);
                    div0.a(view, null);
                    view.removeOnAttachStateChangeListener(djv0Var.v);
                }
                break;
            default:
                ((View) obj2).getViewTreeObserver().removeOnWindowFocusChangeListener((wly) obj);
                break;
        }
    }

    public /* synthetic */ pr0(Object obj, Object obj2, byte b) {
        this.f27440a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ pr0(pz40 pz40Var, Object obj, byte b) {
        this.f27440a = b;
        this.c = pz40Var;
        this.b = obj;
    }
}
