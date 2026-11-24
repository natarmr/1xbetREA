package a;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w2a extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mie0 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2a(mie0 mie0Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mie0Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        mie0 mie0Var = this.k;
        switch (b) {
            case 0:
                w2a w2aVar = new w2a(mie0Var, str, yjeVar, (byte) 0);
                w2aVar.j = obj;
                return w2aVar;
            default:
                w2a w2aVar2 = new w2a(mie0Var, str, yjeVar, (byte) 1);
                w2aVar2.j = obj;
                return w2aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hw70 hw70Var = (hw70) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((w2a) create(hw70Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mie0 mie0Var = this.k;
        String str = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                hw70 hw70Var = (hw70) this.j;
                Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) g0a.b(str)) + " returned");
                mie0Var.f21842a = null;
                return hw70Var;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hw70 hw70Var2 = (hw70) this.j;
                Log.d("CXCP", "tryOpenCamera: " + ((Object) g0a.b(str)) + " opened");
                mie0Var.f21842a = null;
                return hw70Var2;
        }
    }
}
