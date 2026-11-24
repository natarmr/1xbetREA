package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s5h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31652a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s5h(String str, int i, boolean z) {
        this.f31652a = (byte) 7;
        this.c = z;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31652a;
        String str = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                uzb.j(x8x.L(7), (fet) obj, str, z);
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                i120.F(x8x.L(1), (fet) obj, str, z);
                return Unit.f46060a;
            case 2:
                sg20 sg20Var = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var.getClass();
                ifc0 ifc0Var = sg20Var.f;
                return sg20.a(sg20Var, null, null, null, null, ifc0.a(ifc0Var, azc0.a(ifc0Var.f14680a, null, false, 47), plc0.a(ifc0Var.c, 0.0d, null, null, 0.0d, 0.0d, false, false, false, 127), false, str.length() > 0 && z, false, false, 106), false, false, false, 0, 2015);
            case 3:
                b820 b820Var = (b820) obj2;
                rvj0 rvj0Var = b820Var.d;
                return b820.a(b820Var, null, null, null, rvj0.a(rvj0Var, null, null, null, mnd0.a(rvj0Var.d, this.c, 0.0d, 0.0d, 0.0d, null, 62), this.b, 7), null, null, null, false, false, false, false, false, 8183);
            case 4:
                twi0 twi0Var = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var.getClass();
                return twi0.a(twi0Var, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, this.b, this.c, false, false, false, 0, false, false, 0, -50331649, 2097151);
            case 5:
                tcj0 tcj0Var = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var.getClass();
                return tcj0.a(tcj0Var, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, this.b, this.c, false, false, false, 0, false, null, false, false, 0, -50331649, 2097151);
            case 6:
                pfj0 pfj0Var = (pfj0) obj2;
                ((oyg0) obj).getClass();
                pfj0Var.getClass();
                return pfj0.a(pfj0Var, false, false, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, this.b, this.c, false, false, false, 0, false, false, 0, -25165825, 1048575);
            default:
                ((Integer) obj2).getClass();
                ju70.g(x8x.L(1), (fet) obj, str, z);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ s5h(byte b, String str, boolean z) {
        this.f31652a = b;
        this.b = str;
        this.c = z;
    }

    public /* synthetic */ s5h(String str, boolean z) {
        this.f31652a = (byte) 3;
        this.c = z;
        this.b = str;
    }

    public /* synthetic */ s5h(String str, boolean z, int i, byte b) {
        this.f31652a = b;
        this.b = str;
        this.c = z;
    }
}
