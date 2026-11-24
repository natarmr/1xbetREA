package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bt90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3172a;
    public final /* synthetic */ et90 b;

    public /* synthetic */ bt90(et90 et90Var, byte b) {
        this.f3172a = b;
        this.b = et90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3172a;
        et90 et90Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = et90.j2;
                ComponentCallbacks2 application = et90Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(zs90.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof zs90)) {
                        ze3Var = null;
                    }
                    zs90 zs90Var = (zs90) ze3Var;
                    if (zs90Var != null) {
                        nr00 nr00Var = zs90Var.f44896a;
                        ii iiVar = zs90Var.b;
                        ctf0 ctf0Var = zs90Var.c;
                        iiVar.getClass();
                        ctf0Var.getClass();
                        return new vni(nr00Var, iiVar, ctf0Var);
                    }
                }
                jf4.n(b1j.i(zs90.class, "Cannot create dependency "));
                return null;
            case 1:
                mi70 mi70Var2 = et90.j2;
                return new fiu0(Collections.singletonMap(kt90.class, ((vni) et90Var.e2.getValue()).d));
            default:
                mi70 mi70Var3 = et90.j2;
                vcc.f0(i120.U(), et90Var, et90Var.h2.n(et90Var, et90.k2[1]));
                et90Var.x0();
                return Unit.f46060a;
        }
    }
}
