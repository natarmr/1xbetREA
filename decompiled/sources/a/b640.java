package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b640 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2035a;
    public final /* synthetic */ int b;
    public final /* synthetic */ gxb c;

    public /* synthetic */ b640(int i, gxb gxbVar, byte b) {
        this.f2035a = b;
        this.b = i;
        this.c = gxbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2035a;
        gxb gxbVar = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                int i2 = gxbVar.d;
                return s0x.A(i, i2, i2, false);
            case 1:
                int i3 = gxbVar.d;
                return s0x.A(i, i3, i3, false);
            case 2:
                int i4 = gxbVar.d;
                return s0x.A(i, i4, i4, false);
            case 3:
                int i5 = gxbVar.d;
                return s0x.A(i, i5, i5, false);
            default:
                int i6 = gxbVar.d;
                return s0x.A(i, i6, i6, false);
        }
    }
}
