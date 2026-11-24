package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cv90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5020a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ short e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cv90(mm40 mm40Var, mdm mdmVar, Function0 function0, int i, byte b) {
        this.f5020a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5020a;
        short s = this.e;
        Function0 function0 = this.d;
        mdm mdmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                bdx.c(mm40Var, mdmVar, function0, fetVar, x8x.L(s | 1));
                break;
            default:
                vdx.b(mm40Var, mdmVar, function0, fetVar, x8x.L(s | 1));
                break;
        }
        return Unit.f46060a;
    }
}
