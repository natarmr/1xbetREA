package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rxz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31286a;
    public final /* synthetic */ sxz b;

    public /* synthetic */ rxz(sxz sxzVar, byte b) {
        this.f31286a = b;
        this.b = sxzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31286a;
        sxz sxzVar = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = sxz.o2;
                ComponentCallbacks2 application = sxzVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(txz.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof txz)) {
                        ze3Var = null;
                    }
                    txz txzVar = (txz) ze3Var;
                    if (txzVar != null) {
                        uxz uxzVar = (uxz) sxzVar.m2.n(sxzVar, sxz.p2[0]);
                        wdk0 wdk0Var = txzVar.f34726a;
                        knf0 knf0Var = txzVar.b;
                        cad cadVar = txzVar.c;
                        gii0 gii0Var = txzVar.d;
                        ctf0 ctf0Var = txzVar.e;
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        return new rji(cadVar, ctf0Var, uxzVar);
                    }
                }
                jf4.n(b1j.i(txz.class, "Cannot create dependency "));
                return null;
            case 1:
                xuz xuzVar2 = sxz.o2;
                return new q0h0((qji) ((rji) sxzVar.k2.getValue()).d.get());
            default:
                xuz xuzVar3 = sxz.o2;
                ((k3t0) sxzVar.l2.getValue()).x(pxz.f27780a);
                return Unit.f46060a;
        }
    }
}
