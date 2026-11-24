package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class x2n0 extends bnn0 implements Function2 {
    public fnu i;
    public String j;
    public boolean k;
    public final /* synthetic */ a3n0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2n0(a3n0 a3n0Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = a3n0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new x2n0(this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        fnu fnuVar;
        String str;
        wne wneVar = wne.f39444a;
        boolean z = this.k;
        a3n0 a3n0Var = this.l;
        if (!z) {
            z1x.P(obj);
            fnu fnuVar2 = a3n0Var.z;
            String strA = a3n0Var.A.a();
            bot botVar = a3n0Var.B;
            this.i = fnuVar2;
            this.j = strA;
            this.k = true;
            Serializable serializableD = botVar.f2951a.d(this);
            if (serializableD == wneVar) {
                return wneVar;
            }
            obj = serializableD;
            fnuVar = fnuVar2;
            str = strA;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.j;
            fnuVar = this.i;
            z1x.P(obj);
        }
        fnuVar.c(str, (List) obj);
        a3n0Var.G(new u0n0(new PickerParams.Country(new Integer(a3n0Var.L.f4842a))));
        ctf0.e(a3n0Var.p, a3n0Var.L.b, new Object[0]);
        return Unit.f46060a;
    }
}
