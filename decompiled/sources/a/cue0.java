package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cue0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4983a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ cue0(mm40 mm40Var, ArrayList arrayList, Function1 function1, int i, byte b) {
        this.f4983a = b;
        this.b = mm40Var;
        this.c = arrayList;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4983a;
        Function1 function1 = this.d;
        ArrayList arrayList = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                azw.r(mm40Var, arrayList, function1, fetVar, x8x.L(1));
                break;
            default:
                pzw.n(mm40Var, arrayList, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
