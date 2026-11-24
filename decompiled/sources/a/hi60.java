package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hi60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13099a;
    public final /* synthetic */ ki60 b;

    public /* synthetic */ hi60(ki60 ki60Var, byte b) {
        this.f13099a = b;
        this.b = ki60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13099a;
        ki60 ki60Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = ki60.q2;
                ComponentCallbacks2 application = ki60Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(qoq0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof qoq0)) {
                        ze3Var = null;
                    }
                    qoq0 qoq0Var = (qoq0) ze3Var;
                    if (qoq0Var != null) {
                        cgx0 cgx0Var = ki60Var.m2;
                        iiy[] iiyVarArr = ki60.r2;
                        return qoq0Var.a(ki60Var.n2.n(ki60Var, iiyVarArr[1]).intValue(), a4n0.f(ki60Var), cgx0Var.n(ki60Var, iiyVarArr[0]).booleanValue());
                    }
                }
                jf4.n(b1j.i(qoq0.class, "Cannot create dependency "));
                return null;
            case 1:
                return new q0h0((kxi) ((lxi) ki60Var.k2.getValue()).u.get());
            default:
                htz htzVar2 = ki60.q2;
                ki60Var.P0().x(zh60.f44377a);
                ki60Var.p2 = null;
                return Unit.f46060a;
        }
    }
}
