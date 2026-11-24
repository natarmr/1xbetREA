package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ojg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25357a;

    public ojg(byte b) {
        switch (b) {
            case 1:
                this.f25357a = new LinkedHashMap();
                break;
            case 2:
                this.f25357a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f25357a = new LinkedHashMap();
                break;
        }
    }

    public void a(sgy sgyVar, Function1 function1) {
        sgyVar.getClass();
        LinkedHashMap linkedHashMap = this.f25357a;
        if (linkedHashMap.containsKey(sgyVar)) {
            c99.s(kng0.l("A `initializer` with the same `clazz` has already been added: ", sgyVar.v(), Separators.DOT));
        } else {
            linkedHashMap.put(sgyVar, new iiu0(sgyVar, function1));
        }
    }

    public qbx b() {
        Collection collectionValues = this.f25357a.values();
        collectionValues.getClass();
        iiu0[] iiu0VarArr = (iiu0[]) collectionValues.toArray(new iiu0[0]);
        return new qbx((iiu0[]) Arrays.copyOf(iiu0VarArr, iiu0VarArr.length));
    }
}
