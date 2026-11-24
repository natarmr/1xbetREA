package a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesFragmentScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4436a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cj(boolean z, boolean z2, Function1 function1) {
        this.f4436a = (byte) 2;
        this.b = z;
        this.c = z2;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity;
        View decorView;
        byte b = this.f4436a;
        boolean z = false;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                bjk bjkVar = cfx0.o;
                FragmentScreen fragmentScreen = (FragmentScreen) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                if (z3) {
                    ((c8d) k0w0Var.m(fragmentScreen).f14945a).f3908a = new v7d(z2, bjkVar, bjkVar);
                } else {
                    ((c8d) k0w0Var.h(fragmentScreen).f14945a).f3908a = new v7d(z2, bjkVar, bjkVar);
                }
                return Unit.f46060a;
            case 1:
                abi0 abi0Var = (abi0) obj;
                long jA = ((ye60) obj2).a();
                abi0Var.b(h5i0.f12481a, new g5i0(z3 ? blv.b : blv.c, jA, z2 ? f5i0.f8963a : f5i0.c, (9223372034707292159L & jA) != 9205357640488583168L));
                return Unit.f46060a;
            case 2:
                Function1 function1 = (Function1) obj2;
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                int action = motionEvent.getAction();
                if (action == 0) {
                    z = z3;
                } else if (action == 1) {
                    if (z2) {
                        function1.invoke(u5q0.f35109a);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                View view = (View) obj2;
                ilz ilzVar = (ilz) obj;
                ilzVar.getClass();
                Context context = view.getContext();
                context.getClass();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        context.getClass();
                    }
                }
                Window window = activity != null ? activity.getWindow() : null;
                q7y q7yVar = new q7y(window, view, this.b, this.c, (byte) 0);
                llo lloVar = new llo(window, q7yVar, (byte) 11);
                q7yVar.run();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.post(lloVar);
                }
                return new s7y(ilzVar, window, lloVar, q7yVar);
            case 4:
                ba50 ba50Var = (ba50) obj2;
                nlz nlzVar = (nlz) obj;
                nlzVar.getClass();
                ba50Var.a(z3);
                return new gb50(nlzVar, ba50Var, z2);
            case 5:
                k6z k6zVar = (k6z) obj2;
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.w((k6zVar != k6z.f17794a ? !z3 : z3) ? -1.0f : 1.0f);
                uag0Var.y(z2 ? -1.0f : 1.0f);
                return Unit.f46060a;
            default:
                GamesSectionScreens$OneXGamesFragmentScreen gamesSectionScreens$OneXGamesFragmentScreen = (GamesSectionScreens$OneXGamesFragmentScreen) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.c(null);
                if (z3) {
                    c8d c8dVar = (c8d) k0w0Var2.h(gamesSectionScreens$OneXGamesFragmentScreen).f14945a;
                    bjk bjkVar2 = cfx0.o;
                    nqd nqdVar = new nqd((byte) 2);
                    nqdVar.b = z2;
                    c8dVar.f3908a = new v7d(true, bjkVar2, nqdVar.d());
                } else {
                    k0w0Var2.h(gamesSectionScreens$OneXGamesFragmentScreen);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cj(boolean z, FragmentScreen fragmentScreen, boolean z2, byte b) {
        this.f4436a = b;
        this.b = z;
        this.d = fragmentScreen;
        this.c = z2;
    }

    public /* synthetic */ cj(byte b, Object obj, boolean z, boolean z2) {
        this.f4436a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }
}
