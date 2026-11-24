package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pnr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27302a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ mm40 e;
    public final /* synthetic */ y9q0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    public /* synthetic */ pnr0(String str, String str2, String str3, mm40 mm40Var, y9q0 y9q0Var, long j, int i, byte b) {
        this.f27302a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mm40Var;
        this.f = y9q0Var;
        this.g = j;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27302a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                j5n0.m(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                k5n0.j(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
