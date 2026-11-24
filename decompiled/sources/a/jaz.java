package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class jaz extends laz implements eiy {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaz(String str, Function0 function0) {
        super(function0);
        str.getClass();
        this.b = str;
    }

    @Override // a.iiy
    public final diy d() {
        return ((eiy) c()).d();
    }

    @Override // a.eiy
    public final Object get() {
        return ((eiy) c()).get();
    }

    @Override // a.qgy
    public final String getName() {
        return this.b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((eiy) c()).invoke();
    }
}
