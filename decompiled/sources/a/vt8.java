package a;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vt8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37992a;
    public final /* synthetic */ Window b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vt8(Window window, boolean z, byte b) {
        this.f37992a = b;
        this.b = window;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ycm0 ziv0Var;
        ycm0 ziv0Var2;
        byte b = this.f37992a;
        int i = R.attr.uikitStaticTransparent;
        byte b2 = 1;
        boolean z = this.c;
        Window window = this.b;
        switch (b) {
            case 0:
                ((ilz) obj).getClass();
                if (window != null) {
                    if (z) {
                        i = R.attr.uikitBackgroundContent;
                    }
                    ofm0.x(window, i, null, 6);
                }
                return new pa2((byte) 3);
            case 1:
                ((ilz) obj).getClass();
                if (window != null) {
                    if (z) {
                        i = R.attr.uikitBackgroundContent;
                    }
                    ofm0.x(window, i, null, 6);
                }
                return new pa2((byte) 4);
            case 2:
                ((lwk) obj).getClass();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.dimAmount = 0.0f;
                    attributes.flags &= -3;
                    attributes.windowAnimations = 0;
                    window.setAttributes(attributes);
                    WeakHashMap weakHashMap = exv0.f8598a;
                    Object obj2 = weakHashMap.get(window);
                    if (obj2 == null) {
                        ani0 ani0Var = new ani0(window.getDecorView());
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 35) {
                            ziv0Var2 = new bjv0(window, ani0Var);
                        } else if (i2 >= 30) {
                            ziv0Var2 = new ajv0(window, ani0Var);
                        } else {
                            ziv0Var2 = i2 >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                        }
                        dxv0 dxv0Var = new dxv0(ziv0Var2.u(), ziv0Var2.t());
                        weakHashMap.put(window, dxv0Var);
                        obj2 = dxv0Var;
                    }
                    ((dxv0) obj2).c++;
                    ani0 ani0Var2 = new ani0(window.getDecorView());
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 35) {
                        ziv0Var = new bjv0(window, ani0Var2);
                    } else if (i3 >= 30) {
                        ziv0Var = new ajv0(window, ani0Var2);
                    } else {
                        ziv0Var = i3 >= 26 ? new ziv0(window, ani0Var2) : new yiv0(window, ani0Var2);
                    }
                    ziv0Var.w(z);
                    ziv0Var.v(z);
                }
                return new taf0(window, b2);
            default:
                ((lwk) obj).getClass();
                if (window != null && z) {
                    WeakHashMap weakHashMap2 = nkk0.f23685a;
                    int i4 = a8k0.A() ? 16 : 48;
                    window.getClass();
                    WeakHashMap weakHashMap3 = nkk0.f23685a;
                    Object mkk0Var = weakHashMap3.get(window);
                    if (mkk0Var == null) {
                        mkk0Var = new mkk0(window.getAttributes().softInputMode);
                        weakHashMap3.put(window, mkk0Var);
                    }
                    ((mkk0) mkk0Var).b++;
                    window.setSoftInputMode(i4);
                }
                return new uwv0(window, z);
        }
    }
}
