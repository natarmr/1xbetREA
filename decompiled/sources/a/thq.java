package a;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class thq implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33974a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public /* synthetic */ thq(uhq uhqVar, View view) {
        this.f33974a = (byte) 0;
        this.c = uhqVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        pfx pfxVarI;
        byte b = this.f33974a;
        float f = 0.0f;
        boolean zU = false;
        Object obj = this.c;
        View view = this.b;
        switch (b) {
            case 0:
                view.getViewTreeObserver().removeOnDrawListener((uhq) obj);
                break;
            case 1:
                nly nlyVar = (nly) obj;
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                zU = xiv0VarA != null ? xiv0VarA.f40966a.u(8) : false;
                if (xiv0VarA != null && (pfxVarI = xiv0VarA.f40966a.i(8)) != null) {
                    f = pfxVarI.d;
                }
                nlyVar.a1(f, zU);
                break;
            default:
                pz40 pz40Var = (pz40) obj;
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA2 = jgu0.a(view);
                if (xiv0VarA2 != null) {
                    uiv0 uiv0Var = xiv0VarA2.f40966a;
                    boolean zU2 = uiv0Var.u(8);
                    float f2 = uiv0Var.i(8).d;
                    if (zU2 && view.hasWindowFocus()) {
                        zU = true;
                    }
                    tly tlyVar = new tly(zU ? f2 : 0.0f, zU);
                    if (!Intrinsics.d(pz40Var.getValue(), tlyVar)) {
                        pz40Var.setValue(tlyVar);
                    }
                }
                break;
        }
    }

    public /* synthetic */ thq(byte b, View view, Object obj) {
        this.f33974a = b;
        this.b = view;
        this.c = obj;
    }
}
