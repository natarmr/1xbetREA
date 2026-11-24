package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oq00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25666a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ pu90 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ pu90 g;
    public final /* synthetic */ pu90 h;

    public /* synthetic */ oq00(pu90 pu90Var, pu90 pu90Var2, long j, int i, pu90 pu90Var3, pu90 pu90Var4, pu90 pu90Var5, byte b) {
        this.f25666a = b;
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = j;
        this.f = i;
        this.e = pu90Var3;
        this.g = pu90Var4;
        this.h = pu90Var5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iH;
        byte b = this.f25666a;
        pu90 pu90Var = this.h;
        pu90 pu90Var2 = this.g;
        pu90 pu90Var3 = this.e;
        int i = this.f;
        long j = this.d;
        pu90 pu90Var4 = this.c;
        pu90 pu90Var5 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                if (pu90Var5 != null) {
                    ou90Var.m(pu90Var5, 0, 0, 0.0f);
                }
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, (p4e.i(j) - pu90Var4.f27604a) / 2, (i - pu90Var4.b) / 2, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, (p4e.i(j) - pu90Var3.f27604a) / 2, ((i - pu90Var3.b) - (pu90Var2 != null ? pu90Var2.b : 0)) - (pu90Var != null ? pu90Var.b : 0), 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, (p4e.i(j) - pu90Var2.f27604a) / 2, (i - pu90Var2.b) - (pu90Var != null ? pu90Var.b : 0), 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, i - pu90Var.b, 0.0f);
                }
                break;
            case 1:
                ou90Var.getClass();
                if (pu90Var5 != null) {
                    ou90Var.m(pu90Var5, 0, 0, 0.0f);
                }
                if (pu90Var4 != null) {
                    int i2 = (p4e.i(j) - pu90Var4.f27604a) / 2;
                    zcl zclVar = qmk.f28987a;
                    ou90Var.m(pu90Var4, i2, ou90Var.T(72.0f), 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, (p4e.i(j) - pu90Var3.f27604a) / 2, ((i - pu90Var3.b) - (pu90Var2 != null ? pu90Var2.b : 0)) - (pu90Var != null ? pu90Var.b : 0), 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, (p4e.i(j) - pu90Var.f27604a) / 2, (i - pu90Var.b) - (pu90Var2 != null ? pu90Var2.b : 0), 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, i - pu90Var2.b, 0.0f);
                }
                break;
            case 2:
                ou90Var.getClass();
                if (pu90Var5 != null) {
                    ou90Var.m(pu90Var5, 0, 0, 0.0f);
                }
                if (pu90Var4 != null) {
                    int i3 = (p4e.i(j) - pu90Var4.f27604a) / 2;
                    zcl zclVar2 = qmk.f28987a;
                    ou90Var.m(pu90Var4, i3, ou90Var.T(72.0f), 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, (p4e.i(j) - pu90Var3.f27604a) / 2, (i - pu90Var3.b) - (pu90Var2 != null ? pu90Var2.b : 0), 0.0f);
                }
                if (pu90Var != null) {
                    int i4 = (p4e.i(j) - pu90Var.f27604a) / 2;
                    if (pu90Var3 != null) {
                        iH = ((i - (pu90Var2 != null ? pu90Var2.b : 0)) - pu90Var3.b) - pu90Var.b;
                    } else {
                        iH = (int) ((p4e.h(j) - pu90Var.b) * 0.85f);
                    }
                    ou90Var.m(pu90Var, i4, iH, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, i - pu90Var2.b, 0.0f);
                }
                break;
            case 3:
                ou90Var.getClass();
                if (pu90Var5 != null) {
                    ou90Var.m(pu90Var5, 0, 0, 0.0f);
                }
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, (p4e.i(j) - pu90Var4.f27604a) / 2, (i / 2) - pu90Var4.b, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, (p4e.i(j) - pu90Var3.f27604a) / 2, (i - pu90Var3.b) - (pu90Var2 != null ? pu90Var2.b : 0), 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, (p4e.i(j) - pu90Var.f27604a) / 2, i / 2, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, i - pu90Var2.b, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                if (pu90Var5 != null) {
                    ou90Var.m(pu90Var5, 0, 0, 0.0f);
                }
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, (p4e.i(j) - pu90Var4.f27604a) / 2, (i - pu90Var4.b) / 2, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, (p4e.i(j) - pu90Var3.f27604a) / 2, (i - pu90Var3.b) - (pu90Var2 != null ? pu90Var2.b : 0), 0.0f);
                }
                if (pu90Var != null) {
                    int i5 = (p4e.i(j) - pu90Var.f27604a) / 2;
                    zcl zclVar3 = qmk.f28987a;
                    ou90Var.m(pu90Var, i5, ou90Var.T(72.0f), 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, i - pu90Var2.b, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ oq00(pu90 pu90Var, pu90 pu90Var2, long j, pu90 pu90Var3, int i, pu90 pu90Var4, pu90 pu90Var5, byte b) {
        this.f25666a = b;
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = j;
        this.e = pu90Var3;
        this.f = i;
        this.g = pu90Var4;
        this.h = pu90Var5;
    }
}
