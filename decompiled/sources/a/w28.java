package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w28 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ z28 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w28(z28 z28Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z28Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        z28 z28Var = this.j;
        switch (b) {
            case 0:
                return new w28(z28Var, yjeVar, (byte) 0);
            default:
                return new w28(z28Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((w28) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w28) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        z28 z28Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bvc bvcVarA = jiu0.a(z28Var);
                x28 x28Var = x28.f40155a;
                mne mneVar = z28Var.g;
                yje yjeVar = null;
                sac.V(bvcVarA, x28Var, null, mneVar.f22085a, new w28(z28Var, yjeVar, (byte) 1), 10);
                c4m0 c4m0Var = z28Var.j;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    z28Var.j = sac.T(new fnq(z28Var.f.b(), new qv3(z28Var, yjeVar, (byte) 13), (byte) 4), d5c.S(jiu0.a(z28Var), mneVar.f22085a), y28.h);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = z28Var.h;
                String str = (String) z28Var.b.a("entered_email");
                if (str == null) {
                    str = "";
                }
                ol60Var.f(new s28(str));
                break;
        }
        return Unit.f46060a;
    }
}
