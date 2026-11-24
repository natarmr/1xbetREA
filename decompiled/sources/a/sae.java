package a;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sae extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ aa40 j;
    public final /* synthetic */ j4v0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sae(aa40 aa40Var, j4v0 j4v0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = aa40Var;
        this.k = j4v0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j4v0 j4v0Var = this.k;
        aa40 aa40Var = this.j;
        switch (b) {
            case 0:
                return new sae(aa40Var, j4v0Var, yjeVar, (byte) 0);
            default:
                return new sae(aa40Var, j4v0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((sae) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws IOException {
        byte b = this.i;
        j4v0 j4v0Var = this.k;
        aa40 aa40Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(j4v0.Companion.serializer(edy.Companion.serializer()), j4v0Var));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(j4v0.Companion.serializer(edy.Companion.serializer()), j4v0Var));
                break;
        }
        return Unit.f46060a;
    }
}
