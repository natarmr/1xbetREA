package a;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rly implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30720a;
    public final /* synthetic */ View b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ rly(View view, pz40 pz40Var, byte b) {
        this.f30720a = b;
        this.b = view;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        agd agdVar;
        byte b = this.f30720a;
        pz40 pz40Var = this.c;
        View view = this.b;
        lwk lwkVar = (lwk) obj;
        switch (b) {
            case 0:
                lwkVar.getClass();
                View rootView = view.getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                thq thqVar = new thq((byte) 2, rootView, pz40Var);
                viewTreeObserver.addOnGlobalLayoutListener(thqVar);
                return new pr0(viewTreeObserver, thqVar, (byte) 12);
            case 1:
                lwkVar.getClass();
                mie0 mie0Var = new mie0();
                Context context = view.getContext();
                agdVar = context instanceof agd ? (agd) context : null;
                mie0Var.f21842a = agdVar;
                if (agdVar != null) {
                    Window window = agdVar.getWindow();
                    pz40Var.setValue(Integer.valueOf(window.getAttributes().softInputMode));
                    window.setSoftInputMode(a8k0.A() ? 16 : 48);
                }
                return new as10(mie0Var, pz40Var, (byte) 0);
            case 2:
                lwkVar.getClass();
                mie0 mie0Var2 = new mie0();
                Context context2 = view.getContext();
                agdVar = context2 instanceof agd ? (agd) context2 : null;
                mie0Var2.f21842a = agdVar;
                if (agdVar != null) {
                    Window window2 = agdVar.getWindow();
                    pz40Var.setValue(Integer.valueOf(window2.getAttributes().softInputMode));
                    window2.setSoftInputMode(Build.VERSION.SDK_INT < 30 ? 16 : 48);
                }
                return new as10(mie0Var2, pz40Var, (byte) 1);
            default:
                lwkVar.getClass();
                View rootView2 = view.getRootView();
                hie0 hie0Var = new hie0();
                jie0 jie0Var = new jie0();
                pz40 pz40Var2 = this.c;
                mr3 mr3Var = new mr3((byte) 2, hie0Var, jie0Var, rootView2, pz40Var2);
                tr3 tr3Var = new tr3((byte) 1, hie0Var, jie0Var, rootView2, pz40Var2);
                ViewTreeObserver viewTreeObserver2 = rootView2.getViewTreeObserver();
                viewTreeObserver2.addOnGlobalLayoutListener(mr3Var);
                WeakHashMap weakHashMap = rgu0.f30456a;
                div0.a(rootView2, tr3Var);
                return new u43(viewTreeObserver2, mr3Var, rootView2, (byte) 11);
        }
    }
}
