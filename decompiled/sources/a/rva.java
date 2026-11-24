package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rva implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31159a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ rva(mm40 mm40Var, ArrayList arrayList, int i, byte b) {
        this.f31159a = b;
        this.b = mm40Var;
        this.c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31159a;
        ArrayList arrayList = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                uva.a(mm40Var, arrayList, fetVar, x8x.L(7));
                break;
            default:
                yqm0.a(mm40Var, arrayList, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
