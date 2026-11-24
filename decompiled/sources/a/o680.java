package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o680 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24721a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o680(int i, ugd ugdVar, ugd ugdVar2) {
        this.f24721a = (byte) 12;
        this.b = i;
        this.c = ugdVar;
        this.d = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        byte b = this.f24721a;
        int i = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                uvw.h((mm40) obj3, (j680) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                phu0.r((z780) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                pzw.l((mm40) obj3, (rd80) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ((kk80) obj3).e(i, obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                x9x.q((mm40) obj3, (mx80) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                p7x.o((y5d) obj3, (ctf0) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                o2e.S((o0a0) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                qxw.i((mm40) obj3, (f2a0) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                bww.k((a4x) obj3, (x0a0) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                bww.i((hfa0) obj3, (x0a0) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                mrv.w((uja0) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                ucx.B((mm40) obj3, (jlb0) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 12:
                ugd ugdVar = (ugd) obj3;
                ugd ugdVar2 = (ugd) obj4;
                c5n0 c5n0Var = (c5n0) obj;
                c5n0Var.getClass();
                long j = ((p4e) obj2).f26347a;
                int iD = 0;
                long jB = p4e.b(j, 0, 0, 0, 0, 10);
                zcl zclVar = qmk.f28987a;
                int iT = c5n0Var.T(8.0f);
                int i2 = i - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = i2 * iT;
                int i4 = p4e.i(j) - ((c5n0Var.T(48.0f) * i) + i3);
                int i5 = i4 < 0 ? 0 : i4;
                List listK = c5n0Var.k("LABEL_ID", new ugd(1460236794, true, new w(ugdVar, (byte) 24)));
                ArrayList arrayList = new ArrayList(r3d.q(listK, 10));
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pj30) it.next()).S(p4e.b(jB, 0, i5, 0, 0, 13)));
                    i = i;
                }
                int i6 = i;
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((pu90) it2.next()).f27604a);
                    while (it2.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((pu90) it2.next()).f27604a);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                int iIntValue = num != null ? num.intValue() : 0;
                int i7 = (p4e.i(j) - iIntValue) - i3;
                if (i6 > 0) {
                    zcl zclVar2 = qmk.f28987a;
                    iD = l1e0.d(i7 / i6, c5n0Var.T(48.0f), c5n0Var.T(144.0f));
                }
                int i8 = (iD * i6) + i3;
                long jB2 = p4e.b(jB, i8, i8, 0, 0, 12);
                List listK2 = c5n0Var.k("CONTENT_ID", new ugd(1591217749, true, new w(ugdVar2, (byte) 25)));
                ArrayList arrayList2 = new ArrayList(r3d.q(listK2, 10));
                Iterator it3 = listK2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((pj30) it3.next()).S(jB2));
                }
                int iH = p4e.h(j);
                return vj30.x(c5n0Var, p4e.i(j), iH, new xc6(iH, iIntValue, arrayList, arrayList2));
            case 13:
                ((Integer) obj2).getClass();
                bdx.w((mm40) obj3, (x7c0) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                bdx.x((mm40) obj3, (y7c0) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                f1t0.t((kac0) obj3, (Function1) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).intValue();
                f1t0.B((mac0) obj3, (Function1) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                f1t0.D((lac0) obj3, (Function1) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                wb.D(x8x.L(1 | i), (fet) obj, (oud0) obj4, (String) obj3);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).intValue();
                wb.s((qud0) obj3, (qdz) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                m8x.v((mm40) obj3, (muc0) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                d9x.v((mm40) obj3, (egg0) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                d9x.x((mm40) obj3, (fgg0) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                fww.q((flg0) obj4, (mm40) obj3, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                efx.p((mm40) obj3, (fos) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                bsr0.h((kec) obj3, (Function1) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                bsr0.I((pec) obj3, (Function1) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                g7x.p((mm40) obj3, (n580) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                o2e.D((g9z) obj3, (a1l0) obj4, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                g8x.e((t1l0) obj4, (mm40) obj3, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ o680(byte b, int i, mm40 mm40Var, Object obj) {
        this.f24721a = b;
        this.d = obj;
        this.c = mm40Var;
        this.b = i;
    }

    public /* synthetic */ o680(pec pecVar, Function1 function1, int i) {
        this.f24721a = (byte) 26;
        this.c = pecVar;
        this.d = function1;
        this.b = i;
    }

    public /* synthetic */ o680(z780 z780Var, Function1 function1, int i) {
        this.f24721a = (byte) 1;
        this.c = z780Var;
        this.d = function1;
        this.b = i;
    }

    public /* synthetic */ o680(kk80 kk80Var, int i, Object obj, int i2) {
        this.f24721a = (byte) 3;
        this.c = kk80Var;
        this.b = i;
        this.d = obj;
    }

    public /* synthetic */ o680(Object obj, Object obj2, int i, byte b) {
        this.f24721a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
