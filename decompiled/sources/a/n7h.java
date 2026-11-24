package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n7h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23040a = 0;
    public final /* synthetic */ r9u b;
    public final /* synthetic */ ctf0 c;

    public /* synthetic */ n7h(r9u r9uVar, ctf0 ctf0Var) {
        this.b = r9uVar;
        this.c = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23040a;
        ctf0 ctf0Var = this.c;
        r9u r9uVar = this.b;
        switch (b) {
            case 0:
                ((g7h) obj).getClass();
                String strA = ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new l7h(ctf0Var, strA, j1q0Var.f15748a.d(ygpVar));
            default:
                ohx ohxVar = (ohx) obj;
                ohxVar.getClass();
                ygp ygpVar2 = ygp.c;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                m1q0 m1q0Var = j1q0Var2.f15748a;
                return new thx(ohxVar, m1q0Var.d(ygpVar2), ctf0Var, m1q0Var.d(ygp.o1));
        }
    }

    public /* synthetic */ n7h(ctf0 ctf0Var, r9u r9uVar) {
        this.c = ctf0Var;
        this.b = r9uVar;
    }
}
