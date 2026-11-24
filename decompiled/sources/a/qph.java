package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qph implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29118a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qph(byte b, int i, int i2, Object obj, Object obj2) {
        this.f29118a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29118a;
        byte b2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                obc.i((mm40) obj4, (pqh) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                acb.A((mm40) obj4, (aqh) obj3, b2, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                jeb.G((mm40) obj4, (hh80) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                jeb.r((mm40) obj4, (bhm) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                uzb.I((mm40) obj4, (hzc0) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                f1t0.q((mm40) obj4, (pan) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ieb.v((mm40) obj4, (s7p) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                wvb.x((l7m0) obj4, (Function1) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ucx.v((String) obj4, (String) obj3, b2, (fet) obj, x8x.L(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iL = x8x.L(b2 | 1);
                wb.t(iL, (fet) obj, (oud0) obj4, (String) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                g7x.n((mm40) obj4, (wui0) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qph(Object obj, Object obj2, int i, byte b) {
        this.f29118a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
