package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ca00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3985a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ca00(p53 p53Var, Function0 function0, int i, t6k t6kVar) {
        this.f3985a = (byte) 25;
        this.d = p53Var;
        this.e = function0;
        this.c = i;
        this.b = t6kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3985a;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                bb00 bb00Var = (bb00) obj5;
                ppj0 ppj0Var = (ppj0) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    a4x a4xVar = ((ynp0) bb00Var.e.get(i)).b;
                    boolean z = bb00Var.g;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new i1y(function1, (byte) 25);
                        fetVar.o0(objP);
                    }
                    j0x.i(n0qVar, a4xVar, ppj0Var, z, 0.0f, (Function1) objP, fetVar, 6, 16);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                hp4.a((mm40) obj5, (rno0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                kc5.F((mm40) obj5, (sno0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                j47.F((mm40) obj5, (tno0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                jd8.a((mm40) obj5, (uno0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ntr.a((mm40) obj5, (sgk0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                mrv.a((mm40) obj5, (tgk0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                cjx.a((mm40) obj5, (ugk0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                knx.a((Function1) obj3, (nwi0) obj5, (mm40) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                hmw0.c((mm40) obj5, (dx) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                hmw0.d((mm40) obj5, (xdr) obj4, (xdr) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                y0x0.a((mm40) obj5, (xy) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                kc5.D0(x8x.L(i | 1), (fet) obj, (mm40) obj5, (d280) obj3, (String) obj4);
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                ny9.a((mm40) obj5, (fc0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                ntr.t((mm40) obj5, (xzh) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                ntr.u((mm40) obj5, (yzh) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                mrv.g((mm40) obj5, (ayq0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                jd8.e((mm40) obj5, (tr1) obj4, (Function2) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                lv00.i((mm40) obj5, (tw1) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                ccq0.k((xcz) obj5, (abs0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).intValue();
                ccq0.D((mm40) obj5, (dbs0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                f1t0.b((mm40) obj5, (m52) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                f1t0.u((mm40) obj5, (ade) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                vbw0.s((mm40) obj5, (yce) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                eeq.x((ye60) obj5, (u12) obj4, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p53 p53Var = (p53) obj5;
                t6k t6kVar = (t6k) obj3;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                ((Function0) obj4).invoke();
                pj30 pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("ARROW_ICON_LAYOUT_ID", new ugd(-1398866462, true, new ry2((Object) p53Var.d, (Object) p53Var.b, (Object) p53Var.e, (byte) 3))));
                pu90 pu90VarS = pj30Var != null ? pj30Var.S(r4e.b(0, 0, 0, 0, 15)) : null;
                int i2 = pu90VarS != null ? pu90VarS.f27604a : 0;
                int i3 = pu90VarS != null ? pu90VarS.b : 0;
                String str = p53Var.f26385a.f28130a;
                t33 t33Var = (t33) p53Var.c.f38283a;
                long j = g1t0.d().f42262a.b;
                y9q0 y9q0VarD = g1t0.d();
                long j2 = p4eVar.f26347a;
                int i4 = p4e.i(j2);
                pj30 pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("CUR_DELTA_LAYOUT_ID", new ugd(391298480, true, new l53(y9q0VarD, j, str, t33Var, (byte) 0))));
                pu90 pu90VarS2 = pj30Var2 != null ? pj30Var2.S(r4e.b(0, i4, 0, 0, 13)) : null;
                int i5 = pu90VarS2 != null ? pu90VarS2.f27604a : 0;
                int i6 = pu90VarS2 != null ? pu90VarS2.b : 0;
                int iMax = Math.max(i3, i);
                zcl zclVar = qmk.f28987a;
                int iW0 = (((int) c5n0Var.w0(2.0f)) * 2) + iMax;
                return vj30.x(c5n0Var, p4e.i(j2), iW0, new df1(new o53(p4e.i(j2), iW0, pu90VarS2, pu90VarS, i5, i2, i6, i3, c5n0Var.getLayoutDirection()), t6kVar, (byte) 27));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ((v73) obj5).a((oms0) obj4, (j8m0) obj3, this.c, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).intValue();
                j2e.i(x8x.L(i | 1), (fet) obj, (a4x) obj5, (Function0) obj4, (Function1) obj3);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                x4d0.y((xo4) obj5, (Function1) obj3, (mm40) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                jd8.i((mm40) obj5, (String) obj4, (b15) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ca00(byte b, int i, Object obj, Object obj2, Function1 function1) {
        this.f3985a = b;
        this.d = obj;
        this.b = function1;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ ca00(v73 v73Var, oms0 oms0Var, j8m0 j8m0Var, int i, int i2) {
        this.f3985a = (byte) 26;
        this.d = v73Var;
        this.e = oms0Var;
        this.b = j8m0Var;
        this.c = i;
    }

    public /* synthetic */ ca00(bb00 bb00Var, int i, ppj0 ppj0Var, Function1 function1) {
        this.f3985a = (byte) 0;
        this.d = bb00Var;
        this.c = i;
        this.e = ppj0Var;
        this.b = function1;
    }

    public /* synthetic */ ca00(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f3985a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i;
    }

    public /* synthetic */ ca00(Function1 function1, nwi0 nwi0Var, mm40 mm40Var, int i) {
        this.f3985a = (byte) 8;
        this.b = function1;
        this.d = nwi0Var;
        this.e = mm40Var;
        this.c = i;
    }
}
