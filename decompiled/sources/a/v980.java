package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class v980 extends bnn0 implements Function2 {
    public gnu i;
    public boolean j;
    public final /* synthetic */ aa80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v980(aa80 aa80Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = aa80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v980(this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        gnu gnuVar;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        aa80 aa80Var = this.k;
        if (!z) {
            z1x.P(obj);
            chf0 chf0Var = aa80Var.t;
            ((zg) chf0Var.b).f44322a.c("call_back_country_call");
            ((au0) chf0Var.c).f1455a.a(xun.f41520a, 10852L);
            gnu gnuVar2 = aa80Var.e;
            ali aliVar = aa80Var.f;
            this.i = gnuVar2;
            this.j = true;
            Object objR = aliVar.r(false, this);
            if (objR == wneVar) {
                return wneVar;
            }
            obj = objR;
            gnuVar = gnuVar2;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gnuVar = this.i;
            z1x.P(obj);
        }
        gnuVar.c((List) obj);
        p7m0 p7m0Var = aa80Var.A;
        a980 a980Var = ((d980) aa80Var.z.getValue()).d;
        u880 u880Var = new u880(new PickerParams.Phone(a980Var != null ? new Integer(a980Var.f465a) : null, true, true));
        p7m0Var.getClass();
        p7m0Var.o(null, u880Var);
        return Unit.f46060a;
    }
}
