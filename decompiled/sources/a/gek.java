package a;

import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class gek implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11160a;
    public final iek b;
    public final ary c;

    public /* synthetic */ gek(iek iekVar, ary aryVar, byte b) {
        this.f11160a = b;
        this.b = iekVar;
        this.c = aryVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11160a;
        ary aryVar = this.c;
        iek iekVar = this.b;
        switch (b) {
            case 0:
                hoc hocVarO = iekVar.f14637a.o();
                aryVar.getClass();
                return StringsKt.r0(hocVarO.b(aryVar.j(i4m0.C), iekVar), "Collection");
            default:
                return StringsKt.r0(iekVar.f14637a.o().b(aryVar.k("Array"), iekVar), "Array");
        }
    }
}
