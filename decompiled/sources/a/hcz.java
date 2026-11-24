package a;

import androidx.collection.MutableIntList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hcz extends androidx.compose.foundation.lazy.layout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz2 f12844a = new zz2((byte) 14);
    public MutableIntList b;

    public hcz(Function1 function1) {
        function1.invoke(this);
    }

    public static /* synthetic */ void e(hcz hczVar, String str, sgy sgyVar, xdr xdrVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            sgyVar = null;
        }
        hczVar.d(str, sgyVar, xdrVar);
    }

    public static /* synthetic */ void g(hcz hczVar, int i, Function1 function1, wtf0 wtf0Var, ydr ydrVar, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Function1 function2 = wtf0Var;
        if ((i2 & 4) != 0) {
            function2 = j9x.A;
        }
        hczVar.f(i, function1, function2, ydrVar);
    }

    public static void h(hcz hczVar, ugd ugdVar, int i) {
        String str = (i & 1) != 0 ? null : "TABLE_STICKY_HEADER_KEY";
        zz2 zz2Var = hczVar.f12844a;
        MutableIntList mutableIntList = hczVar.b;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList();
            hczVar.b = mutableIntList;
        }
        mutableIntList.a(zz2Var.f45232a);
        hczVar.d(str, null, new ugd(-1588696110, true, new z30((Object) ugdVar, zz2Var.f45232a, (byte) 4)));
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final zz2 b() {
        return this.f12844a;
    }

    public final void d(Object obj, Object obj2, xdr xdrVar) {
        byte b = 1;
        this.f12844a.a(1, new gcz(obj != null ? new ebz(obj, b) : null, new ebz(obj2, b), new ugd(-857469575, true, new csw((Object) xdrVar, (byte) 2))));
    }

    public final void f(int i, Function1 function1, Function1 function2, ydr ydrVar) {
        this.f12844a.a(i, new gcz(function1, function2, ydrVar));
    }
}
