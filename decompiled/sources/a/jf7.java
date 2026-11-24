package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jf7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16411a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jf7(qcq qcqVar, long j, long j2, String str) {
        this.d = qcqVar;
        this.b = j;
        this.c = j2;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16411a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                qcq qcqVar = (qcq) obj4;
                String str = (String) obj3;
                hf7 hf7Var = (hf7) obj2;
                ((oyg0) obj).getClass();
                hf7Var.getClass();
                xrz xrzVar = qcqVar.b;
                boolean z = qcqVar.e;
                boolean z2 = qcqVar.h == lrz.d;
                long j = (long) qcqVar.m;
                long j2 = (long) qcqVar.o;
                String str2 = qcqVar.c;
                str2.getClass();
                return hf7.a(hf7Var, xrzVar, new af7(z, z2, this.b, j, j2, this.c, str2), false, str, 20);
            default:
                ((Integer) obj2).getClass();
                g1x.j((mm40) obj4, (o2a0) obj3, this.b, this.c, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ jf7(mm40 mm40Var, o2a0 o2a0Var, long j, long j2, int i) {
        this.d = mm40Var;
        this.e = o2a0Var;
        this.b = j;
        this.c = j2;
    }
}
