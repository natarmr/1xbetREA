package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xdp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40706a;
    public final /* synthetic */ bep b;

    public /* synthetic */ xdp(bep bepVar, byte b) {
        this.f40706a = b;
        this.b = bepVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f40706a;
        bep bepVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(bepVar.F.q(new hr1(0L, 3)));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(bepVar.F.q(new fr1(new fs80(bepVar.B.b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)), nw80.b.getId(), kotlin.collections.a.c(17L), null, 0L, false, 120), null, 2)));
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                if (bepVar.D.c()) {
                    bepVar.G(new hp1(bepVar.B.b.a(iIntValue, Arrays.copyOf(new Object[0], 0))));
                } else {
                    p7m0 p7m0Var = bepVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        bepVar.f.getClass();
                    } while (!p7m0Var.m(value, e2p.a((e2p) value, false, false, false, true, false, false, null, null, null, false, 65337)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
