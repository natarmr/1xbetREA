package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22777a;
    public final /* synthetic */ pru b;
    public final /* synthetic */ ctf0 c;
    public final /* synthetic */ bzt d;

    public /* synthetic */ n20(pru pruVar, ctf0 ctf0Var, bzt bztVar, byte b) {
        this.f22777a = b;
        this.b = pruVar;
        this.c = ctf0Var;
        this.d = bztVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22777a;
        bzt bztVar = this.d;
        ctf0 ctf0Var = this.c;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                sff0 sff0VarA = pruVar.a();
                return new k20(ctf0Var.b.a(R.string.verification, Arrays.copyOf(new Object[0], 0)), cau0.b, e10.f7015a, sff0VarA.u0, bztVar.f3488a.a().p, sff0VarA.M1);
            default:
                sff0 sff0VarA2 = pruVar.a();
                return new ebu0(ctf0Var.b.a(R.string.verification, Arrays.copyOf(new Object[0], 0)), cau0.b, x9u0.f40526a, sff0VarA2.u0, bztVar.f3488a.a().p, sff0VarA2.M1);
        }
    }
}
