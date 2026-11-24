package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class zj7 extends i3t0 {
    public static final /* synthetic */ int q = 0;
    public final z7u o;
    public final b8u p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj7(String str, final String str2, final double d, z7u z7uVar, mne mneVar, final vjp vjpVar, b8u b8uVar, ryu ryuVar, final luu luuVar, ctf0 ctf0Var) {
        Object value;
        super(null, new Function0() { // from class: a.yj7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listA = luuVar.f20692a.a();
                iun iunVar = iun.f15405a;
                return new uj7(null, listA, iunVar, iunVar, str2, d, vjpVar.d());
            }
        }, new ep4(ctf0Var, (byte) 2), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = z7uVar;
        this.p = b8uVar;
        a5w a5wVarA = ryuVar.a(str);
        sac.V(jiu0.a(this), null, null, mneVar.b, new ex1((Object) this, (Object) a5wVarA, (yje) null, (byte) 16), 11);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, uj7.a((uj7) value, a5wVarA, null, null, 126)));
    }
}
