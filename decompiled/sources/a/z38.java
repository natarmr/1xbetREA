package a;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class z38 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ d48 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z38(d48 d48Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = d48Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d48 d48Var = this.j;
        switch (b) {
            case 0:
                return new z38(d48Var, yjeVar, (byte) 0);
            case 1:
                return new z38(d48Var, yjeVar, (byte) 1);
            default:
                return new z38(d48Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((z38) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((z38) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z38) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        d48 d48Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                d48 d48Var2 = this.j;
                c4m0 c4m0Var = d48Var2.H;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    d48Var2.H = sac.T(new fnq(d48Var2.w.b(), new qv3(d48Var2, null, (byte) 14), (byte) 4), d5c.S(jiu0.a(d48Var2), d48Var2.d.f22085a), new c48(2, d48Var2, d48.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 4, (byte) 0));
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                d48Var.C.f(new q38(d48Var.x.b.a(R.string.error_not_recognize_phone, Arrays.copyOf(new Object[0], 0))));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = d48Var.B;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, v38.a((v38) value, null, null, false, false, new SpannableStringBuilder(d48Var.x.b.a(R.string.add_phone_number_more_info, Arrays.copyOf(new Object[0], 0))), 191)));
                break;
        }
        return Unit.f46060a;
    }
}
