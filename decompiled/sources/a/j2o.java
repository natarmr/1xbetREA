package a;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class j2o implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2o f15790a = new j2o();
    public static final ewb0 b = x2x.j("ErrorsCode", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        i2o i2oVar;
        String strZ = rkjVar.z();
        Iterator it = i2o.P4.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            i2oVar = (i2o) next;
            if (Intrinsics.d(i2oVar.f14059a, strZ)) {
                break;
            }
        } while (!i2oVar.b.contains(strZ));
        i2o i2oVar2 = (i2o) next;
        return i2oVar2 == null ? i2o.Error : i2oVar2;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i2o i2oVar = (i2o) obj;
        i2oVar.getClass();
        String str = i2oVar.f14059a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
