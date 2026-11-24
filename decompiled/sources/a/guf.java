package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class guf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11925a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fuf c;

    public /* synthetic */ guf(mm40 mm40Var, fuf fufVar, int i, byte b) {
        this.f11925a = b;
        this.b = mm40Var;
        this.c = fufVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11925a;
        fuf fufVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                nkb.d(mm40Var, fufVar, fetVar, x8x.L(1));
                break;
            default:
                xkb.h(mm40Var, fufVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
