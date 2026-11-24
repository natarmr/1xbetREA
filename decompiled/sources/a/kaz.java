package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class kaz extends laz implements giy {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kaz(String str, Function0 function0) {
        super(function0);
        str.getClass();
        this.b = str;
    }

    @Override // a.iiy
    public final fiy d() {
        return ((giy) c()).d();
    }

    @Override // a.giy
    public final Object get(Object obj) {
        return ((giy) c()).get(obj);
    }

    @Override // a.qgy
    public final String getName() {
        return this.b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((giy) c()).invoke(obj);
    }
}
