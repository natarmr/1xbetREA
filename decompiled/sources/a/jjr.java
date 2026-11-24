package a;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class jjr extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ ljr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjr(ljr ljrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ljrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ljr ljrVar = this.k;
        switch (b) {
            case 0:
                jjr jjrVar = new jjr(ljrVar, yjeVar, (byte) 0);
                jjrVar.j = ((Boolean) obj).booleanValue();
                return jjrVar;
            default:
                jjr jjrVar2 = new jjr(ljrVar, yjeVar, (byte) 1);
                jjrVar2.j = ((Boolean) obj).booleanValue();
                return jjrVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((jjr) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ljr ljrVar = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr = ljr.Q1;
                ((FrameLayout) ljrVar.G0().c.b).setVisibility(z ? 0 : 8);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr2 = ljr.Q1;
                ljrVar.G0().b.setEnabled(z);
                break;
        }
        return Unit.f46060a;
    }
}
