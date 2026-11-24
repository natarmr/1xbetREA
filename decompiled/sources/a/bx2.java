package a;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bx2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3355a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ bx2(AndroidComposeView androidComposeView, byte b) {
        this.f3355a = b;
        this.b = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3355a;
        int i = 0;
        AndroidComposeView androidComposeView = this.b;
        switch (b) {
            case 0:
                p33 p33Var = androidComposeView.q1;
                if (p33Var != null) {
                    int childCount = p33Var.getChildCount();
                    while (i < childCount) {
                        View childAt = p33Var.getChildAt(i);
                        k33 k33Var = childAt instanceof k33 ? (k33) childAt : null;
                        if (k33Var != null && k33Var.isLayoutRequested()) {
                            k33Var.layout(k33Var.getLeft(), k33Var.getTop(), k33Var.getRight(), k33Var.getBottom());
                        }
                        i++;
                    }
                }
                return Unit.f46060a;
            case 1:
                Class cls = AndroidComposeView.j2;
                if (Build.VERSION.SDK_INT > 28 && androidComposeView.isAttachedToWindow()) {
                    if (AndroidComposeView.n2 == null) {
                        d12 d12Var = new d12((byte) 1);
                        AndroidComposeView.n2 = d12Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (AndroidComposeView.j2 == null) {
                                AndroidComposeView.j2 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = AndroidComposeView.l2;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls2 = AndroidComposeView.j2;
                                declaredMethod = cls2 != null ? cls2.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                AndroidComposeView.l2 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, d12Var);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    vy40 vy40Var = AndroidComposeView.m2;
                    synchronized (vy40Var) {
                        vy40Var.a(androidComposeView);
                    }
                }
                return Unit.f46060a;
            case 2:
                Class cls3 = AndroidComposeView.j2;
                Boolean bool = (Boolean) ((hgk0) androidComposeView.isAttached).getValue();
                bool.getClass();
                return bool;
            case 3:
                Class cls4 = AndroidComposeView.j2;
                ss00 ss00VarC = ss00.c(androidComposeView.getConfiguration().getLocales());
                if (ss00VarC.b()) {
                    ss00VarC = ss00.c(LocaleList.getDefault());
                }
                ts00 ts00Var = ss00VarC.f32705a;
                int size = ts00Var.f34441a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale locale = ts00Var.f34441a.get(i);
                    locale.getClass();
                    arrayList.add(new qs00(locale));
                    i++;
                }
                return new rs00(arrayList);
            default:
                MotionEvent motionEvent = androidComposeView.N1;
                if (motionEvent != null) {
                    boolean zContains = q3d.j(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = androidComposeView.N1;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        androidComposeView.O1 = SystemClock.uptimeMillis();
                        androidComposeView.post(androidComposeView.W1);
                    }
                }
                androidComposeView.c2.invoke();
                return Unit.f46060a;
        }
    }
}
