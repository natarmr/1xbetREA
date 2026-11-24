package a;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class so00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ mp00 j;
    public final /* synthetic */ Context k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so00(mp00 mp00Var, Context context, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = mp00Var;
        this.k = context;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Context context = this.k;
        mp00 mp00Var = this.j;
        switch (b) {
            case 0:
                return new so00(mp00Var, context, yjeVar, (byte) 0);
            default:
                return new so00(mp00Var, context, yjeVar, (byte) 1);
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
        return ((so00) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Context context = this.k;
        mp00 mp00Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                for (String str : ((ip00) mp00Var).g) {
                    List list = u0d.f34849a;
                    u0d.r(context, str);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                String str2 = ((ip00) mp00Var).h;
                if (str2 != null) {
                    List list2 = u0d.f34849a;
                    u0d.r(context, str2);
                }
                break;
        }
        return Unit.f46060a;
    }
}
