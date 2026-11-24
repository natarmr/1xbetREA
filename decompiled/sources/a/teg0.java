package a;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class teg0 extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33819a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teg0(sbx0 sbx0Var, Context context) {
        super(context, 3);
        this.b = sbx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int rotation;
        List listL0;
        switch (this.f33819a) {
            case 0:
                sbx0 sbx0Var = (sbx0) this.b;
                WindowManager windowManager = (WindowManager) sbx0Var.c;
                yk50 yk50Var = (yk50) sbx0Var.e;
                if (windowManager == null || yk50Var == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == sbx0Var.b) {
                    return;
                }
                sbx0Var.b = rotation;
                ((BarcodeView) yk50Var.b).c.postDelayed(new w1((Object) yk50Var, (byte) 23), 250L);
                return;
            default:
                if (i == -1) {
                    return;
                }
                veg0 veg0Var = (veg0) this.b;
                int i2 = 1;
                if (veg0Var.d == -1) {
                    if (i >= 0 && i < 45) {
                        i2 = 0;
                    } else if (45 <= i && i < 135) {
                        i2 = 3;
                    } else if (135 <= i && i < 225) {
                        i2 = 2;
                    } else if (225 > i || i >= 315) {
                        i2 = 0;
                    }
                } else if ((i >= 0 && i < 40) || (320 <= i && i < 360)) {
                    i2 = 0;
                } else if (50 <= i && i < 130) {
                    i2 = 3;
                } else if (140 <= i && i < 220) {
                    i2 = 2;
                } else if (230 > i || i >= 310) {
                    i2 = veg0Var.d;
                }
                veg0 veg0Var2 = (veg0) this.b;
                if (veg0Var2.d != i2) {
                    veg0Var2.d = i2;
                    synchronized (veg0Var2.f37287a) {
                        listL0 = CollectionsKt.L0(veg0Var2.c.values());
                    }
                    Iterator it = listL0.iterator();
                    while (it.hasNext()) {
                        ((ueg0) it.next()).a(i2);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teg0(Context context, veg0 veg0Var) {
        super(context);
        this.b = veg0Var;
    }
}
