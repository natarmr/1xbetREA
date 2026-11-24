package a;

import android.util.Log;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hot0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13409a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hot0(Object obj, Object obj2, Object obj3, byte b) {
        this.f13409a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008c  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        byte b = this.f13409a;
        byte b2 = 1;
        byte b3 = 0;
        yje yjeVar = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                zii0 zii0Var = (zii0) obj3;
                yz9 yz9Var = (yz9) obj2;
                sev sevVar = (sev) obj;
                xii0 xii0Var = ((wii0) zii0Var.e.getValue()).c() ? (xii0) zii0Var.f.getValue() : null;
                if (xii0Var != null) {
                    int i2 = xii0Var.h;
                    if (i2 == 1) {
                        i = 1;
                    } else if (i2 == 0) {
                        i = 0;
                    } else {
                        if (i2 == 0 || i2 == 1) {
                            Log.e("CXCP", "Custom operating mode " + i2 + " conflicts with standard modes");
                            Unit.f46060a.getClass();
                            jf4.o("kotlin.Unit");
                            return null;
                        }
                        i = i2;
                    }
                } else {
                    i = 0;
                }
                return yz9Var.a(i, xii0Var, false, sevVar, null, (Map) zii0Var.c.getValue(), (Map) zii0Var.d.getValue());
            case 1:
                ((i1w0) obj2).d(new ast0((daf) obj3, (zuc0) obj, b2));
                return Unit.f46060a;
            case 2:
                x1 x1Var = (x1) obj3;
                x1Var.removeOnAttachStateChangeListener((sgu0) obj2);
                b8k0.J(x1Var).f45046a.remove((tgu0) obj);
                return Unit.f46060a;
            default:
                b6v b6vVar = (b6v) obj3;
                VirtualGameCategoryParams virtualGameCategoryParams = (VirtualGameCategoryParams) obj2;
                dqu0 dqu0Var = (dqu0) obj;
                return piz.O(new fnq(aoq.c(b6vVar.f2075a.b(), new a6v(null, b6vVar, virtualGameCategoryParams.f46574a, virtualGameCategoryParams.b)), new bqu0(dqu0Var, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(dqu0Var), dqu0Var.p.f22085a));
        }
    }
}
