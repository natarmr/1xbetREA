package a;

import androidx.fragment.app.Fragment;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ku90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18902a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ku90(a4x a4xVar, Map map, int i, ftp0 ftp0Var, Function1 function1) {
        this.f18902a = (byte) 10;
        this.b = a4xVar;
        this.f = map;
        this.e = i;
        this.c = ftp0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18902a;
        int i = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                k9x.m((mm40) obj6, (oea0) obj5, (l7m0) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o050.A((mm40) obj6, (l7m0) obj3, (Function1) obj4, (Function0) obj5, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gq80.M((mm40) obj6, (v2b0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                n2x.a((mm40) obj6, (a4x) obj5, (hh80) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                n7x.k((mm40) obj6, this.e, (a4x) obj5, (aoo0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((cge0) obj5).a((mm40) obj6, (Fragment) obj3, (Function0) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                l7x.x((mm40) obj6, (pz40) obj5, (lh80) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((gle0) obj6).b((y4h) obj5, (c5h) obj3, (x6f) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                ohq0.S((l7m0) obj3, (l7m0) obj6, (Function1) obj4, (Function1) obj5, (fet) obj, x8x.L(i | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                nnw0.x((ir8) obj6, (xcz) obj5, (z77) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 10:
                a4x a4xVar = (a4x) obj6;
                Map map = (Map) obj5;
                ftp0 ftp0Var = (ftp0) obj3;
                Function1 function1 = (Function1) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (a4xVar.isEmpty()) {
                    fetVar.e0(-814929166);
                    q8a.m(ftp0Var.e, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-815711606);
                    fetVar.e0(1774803259);
                    Integer numValueOf = Integer.valueOf(i);
                    Object obj7 = map.get(numValueOf);
                    cl5 cl5Var = ukd.f35823a;
                    if (obj7 == null) {
                        Object[] objArr = new Object[0];
                        v0h0 v0h0Var = xcz.y;
                        Object objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new mhp0((byte) 20);
                            fetVar.o0(objP);
                        }
                        obj7 = (xcz) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 384);
                        map.put(numValueOf, obj7);
                    }
                    xcz xczVar = (xcz) obj7;
                    fetVar.r(false);
                    a4x a4xVar2 = (a4x) ftp0Var.c.get(i);
                    boolean zG = fetVar.g(function1) | fetVar.e(i);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new fsp0(function1, i);
                        fetVar.o0(objP2);
                    }
                    gnm0.e(a4xVar2, xczVar, (Function1) objP2, fetVar, 0);
                    fetVar.r(false);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                etm0.g((mm40) obj6, (krq0) obj5, (y9q0) obj3, (y9q0) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                etm0.e((mm40) obj6, (jrq0) obj5, (y9q0) obj3, (y9q0) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                ltt0.f((awr0) obj6, (Function1) obj4, (Function1) obj5, (xdr) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                msm0.c((mm40) obj6, (xcz) obj5, (xcz) obj3, (ugd) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                gq80.Q((mm40) obj6, (List) obj5, (skb0) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ewm0.i((smr0) obj5, (Function0) obj3, (Function0) obj4, (mm40) obj6, (fet) obj, x8x.L(i | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                hhm0.b((mm40) obj6, (pwr0) obj5, (k6z) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                iom0.f((vxu0) obj6, (cqq) obj5, (s6q0) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                ewm0.d((mm40) obj6, (ywv0) obj5, this.e, (ugd) obj3, (Function2) obj4, (fet) obj, x8x.L(3079));
                break;
            default:
                ((Integer) obj2).getClass();
                xia0.G((mm40) obj6, (ftr) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ku90(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f18902a = b;
        this.b = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = i;
    }

    public /* synthetic */ ku90(mm40 mm40Var, int i, a4x a4xVar, aoo0 aoo0Var, Function1 function1, int i2) {
        this.f18902a = (byte) 4;
        this.b = mm40Var;
        this.e = i;
        this.f = a4xVar;
        this.c = aoo0Var;
        this.d = function1;
    }

    public /* synthetic */ ku90(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, Function0 function0, int i) {
        this.f18902a = (byte) 1;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = function1;
        this.f = function0;
        this.e = i;
    }

    public /* synthetic */ ku90(mm40 mm40Var, ywv0 ywv0Var, int i, ugd ugdVar, Function2 function2, int i2) {
        this.f18902a = (byte) 19;
        this.b = mm40Var;
        this.f = ywv0Var;
        this.e = i;
        this.c = ugdVar;
        this.d = function2;
    }

    public /* synthetic */ ku90(mm40 mm40Var, Object obj, Function1 function1, Function1 function2, int i, byte b) {
        this.f18902a = b;
        this.b = mm40Var;
        this.f = obj;
        this.d = function1;
        this.c = function2;
        this.e = i;
    }

    public /* synthetic */ ku90(cge0 cge0Var, mm40 mm40Var, Fragment fragment, Function0 function0, int i) {
        this.f18902a = (byte) 5;
        this.f = cge0Var;
        this.b = mm40Var;
        this.c = fragment;
        this.d = function0;
        this.e = i;
    }

    public /* synthetic */ ku90(l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, Function1 function2, int i) {
        this.f18902a = (byte) 8;
        this.c = l7m0Var;
        this.b = l7m0Var2;
        this.d = function1;
        this.f = function2;
        this.e = i;
    }

    public /* synthetic */ ku90(smr0 smr0Var, Function0 function0, Function0 function1, mm40 mm40Var, int i) {
        this.f18902a = (byte) 16;
        this.f = smr0Var;
        this.c = function0;
        this.d = function1;
        this.b = mm40Var;
        this.e = i;
    }

    public /* synthetic */ ku90(awr0 awr0Var, Function1 function1, Function1 function2, xdr xdrVar, int i) {
        this.f18902a = (byte) 13;
        this.b = awr0Var;
        this.d = function1;
        this.f = function2;
        this.c = xdrVar;
        this.e = i;
    }
}
