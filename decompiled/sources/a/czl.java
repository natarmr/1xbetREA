package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class czl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5230a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ czl(float f, long j, Object obj, ugd ugdVar, int i, byte b) {
        this.f5230a = b;
        this.b = f;
        this.c = j;
        this.f = obj;
        this.d = ugdVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5230a;
        int i = this.e;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                float f = this.b;
                long j = this.c;
                mbc.c(f, j, (bzl) obj3, this.d, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                float f2 = this.b;
                long j2 = this.c;
                nip.a(f2, j2, (e2d) obj3, this.d, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
