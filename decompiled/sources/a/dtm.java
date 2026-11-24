package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dtm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6662a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ kpm e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ dtm(mm40 mm40Var, kpm kpmVar, String str, String str2, boolean z, int i) {
        this.b = mm40Var;
        this.e = kpmVar;
        this.c = str;
        this.d = str2;
        this.f = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6662a) {
            case 0:
                ((Integer) obj2).getClass();
                hkb.a(x8x.L(1), this.e, (fet) obj, this.b, this.c, this.d, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                ibc.a(x8x.L(1), this.e, (fet) obj, this.b, this.c, this.d, this.f);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ dtm(mm40 mm40Var, String str, String str2, kpm kpmVar, boolean z, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = kpmVar;
        this.f = z;
    }
}
