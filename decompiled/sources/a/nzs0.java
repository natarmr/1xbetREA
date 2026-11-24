package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nzs0 {
    public static final nzs0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24388a;
    public final Map b;
    public final nzs0 c;

    static {
        iun iunVar = iun.f15405a;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        d = new nzs0(iunVar, lunVar, null);
    }

    public nzs0(List list, Map map, nzs0 nzs0Var) {
        this.f24388a = list;
        this.b = map;
        this.c = nzs0Var;
    }

    public final miy a(int i) {
        miy miyVar = (miy) this.b.get(Integer.valueOf(i));
        if (miyVar != null) {
            return miyVar;
        }
        nzs0 nzs0Var = this.c;
        if (nzs0Var != null) {
            return nzs0Var.a(i);
        }
        return null;
    }
}
