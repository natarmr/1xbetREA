package a;

import android.util.Log;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class t3e extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33261a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3e(iqi iqiVar, dc0 dc0Var, dc0 dc0Var2) {
        super(0);
        bek bekVar = meq.b;
        this.b = iqiVar;
        this.c = dc0Var;
        this.d = dc0Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object g0g0Var;
        Object g0g0Var2;
        byte b = this.f33261a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj3;
                v3e v3eVar = (v3e) obj2;
                g3e g3eVar = v3eVar.f36728a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object objN = ((pj30) list.get(i)).n();
                    e3e e3eVar = objN instanceof e3e ? (e3e) objN : null;
                    if (e3eVar != null) {
                        u2e u2eVar = e3eVar.f7129a;
                        e3eVar.b.invoke(new t2e(u2eVar.b, g3eVar.b(u2eVar)));
                    }
                    v3eVar.f.add(e3eVar);
                }
                g3eVar.a((f7m0) obj);
                return Unit.f46060a;
            default:
                Object j0g0Var = ((j0g0) ((n0o0) ((iqi) obj3).b).getValue()).f15681a;
                if (!(j0g0Var instanceof g0g0)) {
                    e0g0 e0g0Var = j0g0.b;
                    bek bekVar = meq.b;
                    uii uiiVar = ((peq) j0g0Var).b;
                    try {
                        g0g0Var2 = new wgk(uiiVar.t().G(), ((liv) ((n0o0) uiiVar.d).getValue()).f20123a, ((tz2) ((n0o0) uiiVar.e).getValue()).f34785a, ((zm30) ((n0o0) uiiVar.f).getValue()).f44605a);
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                    }
                    j0g0Var = new j0g0(g0g0Var2);
                    break;
                }
                e0g0 e0g0Var3 = j0g0.b;
                boolean z = j0g0Var instanceof g0g0;
                if (!z) {
                    z1x.P(j0g0Var);
                    g0g0Var = ((j0g0) j0g0Var).f15681a;
                } else {
                    if (!z) {
                        t9f.b();
                        return null;
                    }
                    Throwable thA = j0g0.a(j0g0Var);
                    thA.getClass();
                    g0g0Var = new g0g0(thA);
                }
                dc0 dc0Var = (dc0) obj2;
                Throwable thA2 = j0g0.a(g0g0Var);
                if (thA2 == null) {
                    dc0Var.invoke(g0g0Var);
                } else {
                    ((dc0) obj).invoke(ken.f18160a);
                    Log.e("FingerprintJS", "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.", thA2);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3e(List list, v3e v3eVar, f7m0 f7m0Var) {
        super(0);
        this.b = list;
        this.c = v3eVar;
        this.d = f7m0Var;
    }
}
