package a;

import java.util.Arrays;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class thx implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ohx f33982a;
    public final boolean b;
    public final vef0 c;
    public final String d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;

    public thx(ohx ohxVar, boolean z, ctf0 ctf0Var, boolean z2) {
        ctf0Var.getClass();
        this.f33982a = ohxVar;
        this.b = z2;
        lsm0 lsm0Var = ctf0Var.b;
        this.c = new vef0(lsm0Var.a(R.string.no_available_bets_hint, Arrays.copyOf(new Object[0], 0)));
        this.d = lsm0Var.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
        n0o0 n0o0VarH = bkb.H(ohxVar.b);
        this.e = n0o0VarH;
        this.f = bkb.H(ohxVar.f);
        this.g = bkb.H(ohxVar.f25287a);
        this.h = maz.b(new yw9((fee) n0o0VarH.getValue(), new x9(z, (Object) this, (byte) 25), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        ohx ohxVar = (ohx) obj;
        mhx mhxVar = this.f33982a.e;
        ohxVar.getClass();
        fee feeVar = (fee) this.g.getValue();
        List list = ohxVar.f25287a;
        boolean z = ohxVar.g;
        feeVar.d(list);
        n0o0 n0o0Var = this.e;
        ((fee) n0o0Var.getValue()).d(ohxVar.b);
        ((fee) this.f.getValue()).d(ohxVar.f);
        boolean z2 = ohxVar.d;
        boolean z3 = this.b;
        if (z2) {
            return new qhx(mhxVar.f21819a, z3, z);
        }
        if (!((List) ((fee) n0o0Var.getValue()).c()).isEmpty()) {
            return new phx(mhxVar.f21819a, z3, dyb.o0((Iterable) ((fee) this.h.getValue()).b()), z);
        }
        l9s l9sVar = ohxVar.c;
        boolean z4 = l9sVar != null && l9sVar.e();
        long jA = l9sVar != null ? l9sVar.a() : -1L;
        long jB = l9sVar != null ? l9sVar.b() : -1L;
        long jC = l9sVar != null ? l9sVar.c() : -1L;
        long jD = l9sVar != null ? l9sVar.d() : -1L;
        tef0 tef0Var = tef0.f33818a;
        xuz xuzVar = pb10.c;
        return new rhx(mhxVar.f21819a, new RelatedParams(z4, jA, jC, jD, jB, tef0Var), this.c);
    }
}
