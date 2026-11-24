package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g3e extends d3e {
    public clc b;
    public int c;
    public final ArrayList d;

    public g3e() {
        super(null);
        this.c = 0;
        this.d = new ArrayList();
    }

    public static mm40 d(mm40 mm40Var, u2e u2eVar, Function1 function1) {
        return mm40Var.e(new f3e(u2eVar, function1));
    }

    public final u2e e() {
        int i = this.c;
        this.c = i + 1;
        ArrayList arrayList = this.d;
        u2e u2eVar = (u2e) CollectionsKt.W(i, arrayList);
        if (u2eVar != null) {
            return u2eVar;
        }
        u2e u2eVar2 = new u2e(Integer.valueOf(this.c));
        arrayList.add(u2eVar2);
        return u2eVar2;
    }

    public final clc f() {
        clc clcVar = this.b;
        if (clcVar != null) {
            return clcVar;
        }
        clc clcVar2 = new clc((Object) this, (byte) 12);
        this.b = clcVar2;
        return clcVar2;
    }

    public final void g() {
        this.f5398a.e.clear();
        this.c = 0;
    }
}
