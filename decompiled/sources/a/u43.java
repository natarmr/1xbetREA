package a;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class u43 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35025a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u43(Object obj, Object obj2, Object obj3, byte b) {
        this.f35025a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // a.kwk
    public final void a() {
        glz glzVarX;
        boolean zIsTerminated;
        byte b = this.f35025a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((SnapshotStateList) obj3).remove(obj2);
                ((i53) obj).d.l(obj2);
                break;
            case 1:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener((mr3) obj2);
                }
                WeakHashMap weakHashMap = rgu0.f30456a;
                div0.a((View) obj, null);
                break;
            case 2:
                ((clz) obj3).x().f((wb3) obj2);
                dlz dlzVar = (dlz) ((mie0) obj).f21842a;
                if (dlzVar != null) {
                    dlzVar.a();
                }
                break;
            case 3:
                ((clz) obj3).x().f((wb3) obj2);
                olz olzVar = (olz) ((mie0) obj).f21842a;
                if (olzVar != null) {
                    olzVar.a();
                }
                break;
            case 4:
                cjv0 cjv0Var = (cjv0) obj;
                Window window = (Window) obj3;
                if (window != null) {
                    k9o0 k9o0Var = (k9o0) ((a8z) obj2).getValue();
                    Integer num = k9o0Var.f17924a;
                    Integer num2 = k9o0Var.b;
                    if (num != null && num2 != null) {
                        window.setStatusBarColor(num.intValue());
                        window.setNavigationBarColor(num2.intValue());
                        if (cjv0Var != null) {
                            Boolean bool = k9o0Var.c;
                            if (bool != null) {
                                cjv0Var.b(bool.booleanValue());
                            }
                            Boolean bool2 = k9o0Var.d;
                            if (bool2 != null) {
                                cjv0Var.f4478a.v(bool2.booleanValue());
                            }
                        }
                        break;
                    }
                }
                break;
            case 5:
                androidx.fragment.app.e eVarC = ((Fragment) obj3).C();
                eVarC.getClass();
                d9x.J(eVarC, (roq0) obj2, (lme0) obj);
                break;
            case 6:
                clz clzVar = (clz) obj3;
                if (clzVar != null && (glzVarX = clzVar.x()) != null) {
                    glzVarX.f((g02) obj2);
                }
                wjd wjdVar = (wjd) obj;
                kkz kkzVar = kkz.ON_DESTROY;
                wjdVar.getClass();
                wjdVar.b = kkzVar.a();
                wjdVar.a();
                break;
            case 7:
                AutoCloseable autoCloseable = (uiu0) obj3;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (!(autoCloseable instanceof ExecutorService)) {
                    e9d0.o();
                } else {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                if (((glz) obj2).i.compareTo(lkz.c) >= 0) {
                    xiu0 xiu0Var = (xiu0) obj;
                    viu0 viu0Var = (viu0) xiu0Var.a().b.g(rek0.h);
                    if (viu0Var == null || viu0Var.c <= 0) {
                        xiu0Var.a().v();
                    }
                }
                break;
            case 8:
                czg0 czg0Var = (czg0) obj3;
                izg0 izg0Var = (izg0) obj;
                if (czg0Var.b.l(obj2) == izg0Var) {
                    Map map = czg0Var.f5222a;
                    Map mapE = izg0Var.e();
                    if (!mapE.isEmpty()) {
                        map.put(obj2, mapE);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
            case 9:
                yx5 yx5Var = (yx5) obj2;
                ((ujd) obj3).getClass();
                ujd.a(yx5Var);
                ((dcv0) obj).getClass();
                androidx.fragment.app.e eVarC2 = yx5Var.C();
                eVarC2.g("WHO_WIN_REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG");
                eVarC2.g("WHO_WIN_REQUEST_REPLACE_COUPON_KEY");
                eVarC2.g("REQUEST_ALREADY_COUPON_DIALOG_KEY");
                eVarC2.g("REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEYFIRST");
                eVarC2.g("REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEYSECOND");
                break;
            case 10:
                RecyclerView recyclerView = (RecyclerView) ((pz40) obj3).getValue();
                if (recyclerView != null) {
                    ((d930) obj2).c(((jpu0) obj).f16919a, recyclerView);
                }
                break;
            default:
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) obj3;
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnGlobalLayoutListener((mr3) obj2);
                }
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                div0.a((View) obj, null);
                break;
        }
    }
}
