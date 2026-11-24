package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fsn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10073a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ y9q0 f;
    public final /* synthetic */ y9q0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ fsn(mm40 mm40Var, String str, String str2, long j, y9q0 y9q0Var, y9q0 y9q0Var2, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = y9q0Var;
        this.g = y9q0Var2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10073a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                lmc.r(x8x.L(i | 1), this.e, (fet) obj, this.b, this.f, this.g, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                m8x.d(x8x.L(i | 1), this.e, (fet) obj, this.b, this.f, this.g, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fsn(mm40 mm40Var, String str, String str2, y9q0 y9q0Var, y9q0 y9q0Var2, long j, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.f = y9q0Var;
        this.g = y9q0Var2;
        this.e = j;
        this.h = i;
    }
}
