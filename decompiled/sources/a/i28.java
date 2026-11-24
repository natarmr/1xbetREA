package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class i28 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j28 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i28(j28 j28Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j28Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j28 j28Var = this.k;
        switch (b) {
            case 0:
                i28 i28Var = new i28(j28Var, yjeVar, (byte) 0);
                i28Var.j = obj;
                return i28Var;
            default:
                i28 i28Var2 = new i28(j28Var, yjeVar, (byte) 1);
                i28Var2.j = obj;
                return i28Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i28) create((u28) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((i28) create((v28) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        j28 j28Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                u28 u28Var = (u28) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (u28Var != null) {
                    if (u28Var instanceof t28) {
                        kj5 kj5Var = j28.R1;
                        j28Var.G0().d.setErrorText(j28Var.H(R.string.error_email_check_input));
                        j28Var.G0().d.f(true);
                    } else if (u28Var instanceof q28) {
                        kj5 kj5Var2 = j28.R1;
                        j28Var.G0().d.setErrorText(null);
                        j28Var.G0().d.f(false);
                    } else if (u28Var instanceof r28) {
                        j120.Y(j28Var);
                    } else if (u28Var instanceof s28) {
                        kj5 kj5Var3 = j28.R1;
                        j28Var.G0().d.setText(((s28) u28Var).f31491a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                v28 v28Var = (v28) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kj5 kj5Var4 = j28.R1;
                j28Var.G0().e.setVisibility(v28Var.f36671a ? 0 : 8);
                j28Var.G0().b.setFirstButtonEnabled(v28Var.c);
                return Unit.f46060a;
        }
    }
}
