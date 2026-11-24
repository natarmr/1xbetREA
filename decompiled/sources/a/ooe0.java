package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ooe0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25592a;
    public final /* synthetic */ woe0 b;

    public /* synthetic */ ooe0(woe0 woe0Var, byte b) {
        this.f25592a = b;
        this.b = woe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25592a;
        yje yjeVar = null;
        woe0 woe0Var = this.b;
        switch (b) {
            case 0:
                gne0 gne0Var = woe0.S1;
                pzu pzuVar = woe0Var.H0().e;
                i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                k0w0VarI.c(jh70.i((jh70) pzuVar.e, ((pru) pzuVar.f).a().V0));
                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            case 1:
                gne0 gne0Var2 = woe0.S1;
                zoe0 zoe0VarH0 = woe0Var.H0();
                i8i.D("action", "decline", zoe0VarH0.j.f42966a, "promo_referal_data_error");
                b1j.v("decline", zoe0VarH0.n.f40143a, 3326L);
                return Unit.f46060a;
            case 2:
                fiu0 fiu0Var = woe0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                gne0 gne0Var3 = woe0.S1;
                zoe0 zoe0VarH1 = woe0Var.H0();
                i8i.D("screen", "referal_deposit_error", zoe0VarH1.i.f14765a, "deposit_call");
                l7k l7kVar = zoe0VarH1.l;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("referal_deposit_error", zoe0VarH1.m.g());
                sac.V(jiu0.a(zoe0VarH1), new d8e0(1, zoe0VarH1.k, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, null, new d7a0(zoe0VarH1, yjeVar, (byte) 21), 14);
                return Unit.f46060a;
            case 4:
                gne0 gne0Var4 = woe0.S1;
                zoe0 zoe0VarH2 = woe0Var.H0();
                i8i.D("action", "decline", zoe0VarH2.j.f42966a, "promo_referal_deposit_error");
                b1j.v("decline", zoe0VarH2.n.f40143a, 3327L);
                return Unit.f46060a;
            default:
                gne0 gne0Var5 = woe0.S1;
                zoe0 zoe0VarH3 = woe0Var.H0();
                i8i.D("action", "fill", zoe0VarH3.j.f42966a, "promo_referal_data_error");
                b1j.v("fill", zoe0VarH3.n.f40143a, 3326L);
                pzu pzuVar2 = zoe0VarH3.e;
                i1w0 i1w0VarC2 = ((oeg0) pzuVar2.f27863a).c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC2);
                FragmentScreen fragmentScreenJ = jh70.j((jh70) pzuVar2.c, false);
                if (fragmentScreenJ instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                }
                ListIterator listIteratorO2 = b1j.o(i1w0VarC2, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
                break;
        }
    }
}
