package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q330 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28031a;
    public final /* synthetic */ v330 b;

    public /* synthetic */ q330(v330 v330Var, byte b) {
        this.f28031a = b;
        this.b = v330Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28031a;
        e330 e330Var = e330.f7116a;
        v330 v330Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = v330.Q1;
                ComponentCallbacks2 application = v330Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(w330.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof w330)) {
                        ze3Var = null;
                    }
                    w330 w330Var = (w330) ze3Var;
                    if (w330Var != null) {
                        i1w0 i1w0VarF = a4n0.f(v330Var);
                        i1w0VarF.getClass();
                        cad cadVar = w330Var.b;
                        ctf0 ctf0Var = w330Var.f38481a;
                        q7d0 q7d0Var = w330Var.c;
                        zfo zfoVar = w330Var.d;
                        edo edoVar = w330Var.e;
                        k7u k7uVar = w330Var.f;
                        wyt wytVar = w330Var.g;
                        v230 v230Var = w330Var.h;
                        ii iiVar = w330Var.i;
                        j1q0 j1q0Var = w330Var.j;
                        r9u r9uVar = w330Var.k;
                        pru pruVar = w330Var.l;
                        ctf0Var.getClass();
                        q7d0Var.getClass();
                        zfoVar.getClass();
                        edoVar.getClass();
                        k7uVar.getClass();
                        wytVar.getClass();
                        v230Var.getClass();
                        iiVar.getClass();
                        j1q0Var.getClass();
                        r9uVar.getClass();
                        return new dli(cadVar, ctf0Var, i1w0VarF, zfoVar, edoVar, k7uVar, wytVar, v230Var, iiVar, r9uVar, pruVar);
                    }
                }
                jf4.n(b1j.i(w330.class, "Cannot create dependency "));
                return null;
            case 1:
                xuz xuzVar2 = v330.Q1;
                v330Var.G0().x(e330Var);
                return Unit.f46060a;
            case 2:
                xuz xuzVar3 = v330.Q1;
                fiu0 fiu0Var = v330Var.O1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                xuz xuzVar4 = v330.Q1;
                v330Var.G0().x(i330.f14079a);
                return Unit.f46060a;
            case 4:
                xuz xuzVar5 = v330.Q1;
                v330Var.G0().x(h330.f12366a);
                return Unit.f46060a;
            default:
                xuz xuzVar6 = v330.Q1;
                v330Var.G0().x(e330Var);
                return Unit.f46060a;
        }
    }
}
