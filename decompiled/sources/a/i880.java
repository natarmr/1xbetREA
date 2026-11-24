package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class i880 extends bnn0 implements Function2 {
    public gnu i;
    public boolean j;
    public final /* synthetic */ n880 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i880(n880 n880Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = n880Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new i880(this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i880) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        gnu gnuVar;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        n880 n880Var = this.k;
        if (!z) {
            z1x.P(obj);
            chf0 chf0Var = n880Var.F;
            ((zg) chf0Var.b).f44322a.c("call_back_country_call");
            ((au0) chf0Var.c).f1455a.a(xun.f41520a, 10852L);
            gnu gnuVar2 = n880Var.r;
            ali aliVar = n880Var.s;
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
        n880Var.G(new v780(new PickerParams.Phone(((y780) n880Var.D()).f, true, true)));
        return Unit.f46060a;
    }
}
