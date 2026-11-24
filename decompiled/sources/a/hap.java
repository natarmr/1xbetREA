package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f12735a = new zfn(new r4p((byte) 14), (byte) 0);

    public static final float a(dap dapVar, float f) {
        int iOrdinal = dapVar.ordinal();
        if (iOrdinal == 0) {
            return f;
        }
        if (iOrdinal == 1) {
            return -8.0f;
        }
        t9f.b();
        return 0.0f;
    }

    public static final mm40 b(w6n w6nVar, dap dapVar, k6z k6zVar) {
        Pair pair;
        w6nVar.getClass();
        dapVar.getClass();
        k6zVar.getClass();
        int iOrdinal = k6zVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            int iOrdinal2 = dapVar.ordinal();
            if (iOrdinal2 == 0) {
                dapVar = dap.b;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                dapVar = dap.f5761a;
            }
        }
        switch (w6nVar.ordinal()) {
            case 0:
                zcl zclVar = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 80.0f)), new ycl(76.0f));
                break;
            case 1:
                zcl zclVar2 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 64.0f)), new ycl(60.0f));
                break;
            case 2:
                zcl zclVar3 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 56.0f)), new ycl(52.0f));
                break;
            case 3:
                zcl zclVar4 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 48.0f)), new ycl(44.0f));
                break;
            case 4:
                zcl zclVar5 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 40.0f)), new ycl(36.0f));
                break;
            case 5:
                zcl zclVar6 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 32.0f)), new ycl(28.0f));
                break;
            case 6:
                zcl zclVar7 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 28.0f)), new ycl(24.0f));
                break;
            case 7:
                zcl zclVar8 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 24.0f)), new ycl(20.0f));
                break;
            case 8:
                zcl zclVar9 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 20.0f)), new ycl(16.0f));
                break;
            case 9:
                zcl zclVar10 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 16.0f)), new ycl(12.0f));
                break;
            case 10:
                zcl zclVar11 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 12.0f)), new ycl(8.0f));
                break;
            case 11:
                zcl zclVar12 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 8.0f)), new ycl(4.0f));
                break;
            case 12:
                zcl zclVar13 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 4.0f)), new ycl(0.0f));
                break;
            case 13:
                zcl zclVar14 = qmk.f28987a;
                pair = new Pair(new ycl(a(dapVar, 0.0f)), new ycl(-4.0f));
                break;
            default:
                t9f.b();
                return null;
        }
        return new jww(((ycl) pair.f46059a).f42389a, ((ycl) pair.b).f42389a);
    }
}
