package a;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class x2a extends bnn0 implements Function1 {
    public final /* synthetic */ mie0 i;
    public final /* synthetic */ mie0 j;
    public final /* synthetic */ tw2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2a(mie0 mie0Var, mie0 mie0Var2, tw2 tw2Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = mie0Var;
        this.j = mie0Var2;
        this.k = tw2Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new x2a(this.i, this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((x2a) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
        this.i.f21842a = null;
        if (this.j.f21842a == null) {
            return null;
        }
        Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
        this.k.a();
        return new hw70(null, new az9(13), 1);
    }
}
