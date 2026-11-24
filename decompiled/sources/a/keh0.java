package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class keh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18154a;
    public final /* synthetic */ leh0 b;

    public /* synthetic */ keh0(leh0 leh0Var, byte b) {
        this.f18154a = b;
        this.b = leh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18154a;
        leh0 leh0Var = this.b;
        cmc cmcVar = (cmc) obj;
        switch (b) {
            case 0:
                cmcVar.getClass();
                mrv.o0(jsm0.f17060a);
                ewb0 ewb0Var = ysm0.b;
                iun iunVar = iun.f15405a;
                cmcVar.a(Payload.TYPE, ewb0Var, iunVar);
                cmcVar.a("value", x2x.G("kotlinx.serialization.Sealed<" + leh0Var.f19902a.J() + '>', ygi0.b, new ugi0[0], new keh0(leh0Var, (byte) 1)), iunVar);
                List list = leh0Var.b;
                list.getClass();
                cmcVar.b = list;
                break;
            default:
                cmcVar.getClass();
                for (Map.Entry entry : leh0Var.e.entrySet()) {
                    cmcVar.a((String) entry.getKey(), ((jiy) entry.getValue()).getDescriptor(), iun.f15405a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
