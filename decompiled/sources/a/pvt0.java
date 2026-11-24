package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class pvt0 extends vvt0 {
    public final /* synthetic */ rvt0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvt0(rvt0 rvt0Var) {
        super("users.get");
        this.d = rvt0Var;
    }

    @Override // a.vvt0
    public final Object a(JSONObject jSONObject) {
        jSONObject.getClass();
        vby vbyVar = this.d.e2;
        if (vbyVar == null) {
            Intrinsics.h("json");
            throw null;
        }
        String string = jSONObject.toString();
        string.getClass();
        List list = ((dwt0) vbyVar.b(dwt0.Companion.serializer(), string)).f6815a;
        if (list == null) {
            list = iun.f15405a;
        }
        return (awt0) CollectionsKt.U(list);
    }
}
