package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class owv0 implements i2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nwv0 f25985a;
    public final Function1 b;
    public final kvv0 c;
    public final wzu0 d;

    public owv0(nwv0 nwv0Var, Function1 function1, kvv0 kvv0Var, wzu0 wzu0Var) {
        this.f25985a = nwv0Var;
        this.b = function1;
        this.c = kvv0Var;
        this.d = wzu0Var;
    }

    @Override // a.i2h0
    public final y1h0 a(o470 o470Var, List list) {
        list.getClass();
        ob50 ob50Var = (ob50) CollectionsKt.f0(list);
        if (ob50Var != null) {
            Object obj = ob50Var.b;
            Object obj2 = ob50Var.c.get("XBottomSheetMetadataKey");
            if (obj2 == null) {
                obj2 = null;
            }
            lwv0 lwv0Var = (lwv0) obj2;
            if (lwv0Var != null) {
                if (!Intrinsics.d(this.b.invoke(lwv0Var), this.c)) {
                    return new guv0(obj);
                }
                obj.getClass();
                nwv0 nwv0Var = this.f25985a;
                LinkedHashMap linkedHashMap = nwv0Var.f24254a;
                mwv0 mwv0Var = (mwv0) linkedHashMap.get(obj);
                if (mwv0Var == null) {
                    mwv0Var = new mwv0();
                    linkedHashMap.put(obj, mwv0Var);
                    nwv0Var.b.add(mwv0Var);
                }
                mwv0 mwv0Var2 = mwv0Var;
                ugu0 ugu0Var = new ugu0(this.d, lwv0Var, (byte) 9);
                List listP = CollectionsKt.P(1, list);
                return new txv0(ob50Var.b, ob50Var, listP, listP, mwv0Var2, nwv0Var, ugu0Var);
            }
        }
        return null;
    }
}
