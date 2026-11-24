package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class igm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14741a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ igm(t4m t4mVar, j4m j4mVar, boolean z, int i) {
        this.f14741a = (byte) 15;
        this.c = t4mVar;
        this.d = j4mVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b;
        boolean z2;
        Object value;
        nem nemVar;
        nem nemVar2;
        byte b2 = this.f14741a;
        jm40 jm40Var = jm40.b;
        yje yjeVar = null;
        boolean z3 = false;
        byte b3 = 1;
        boolean z4 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b2) {
            case 0:
                ljc ljcVar = jd8.n;
                xgm xgmVar = (xgm) obj3;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahm ahmVarC = xgmVar.c();
                    if (ahmVarC == null) {
                        z = false;
                    } else if (ahmVarC instanceof ygm) {
                        fetVar.e0(564467252);
                        zq8.a(0, fetVar, i120.Q(mm40Var.e(o7k0.c), ieb.X(((ygm) ahmVarC).f42592a, fetVar), ljcVar));
                        fetVar.r(false);
                    } else {
                        z = false;
                        if (ahmVarC instanceof zgm) {
                            fetVar.e0(564774369);
                            n0q n0qVar = o7k0.c;
                            mm40 mm40VarE = mm40Var.e(n0qVar);
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                            int iHashCode = Long.hashCode(fetVar.T);
                            bh90 bh90VarM = fetVar.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, x5dVarA, gqw0.x);
                            jpm0.o(fetVar, bh90VarM, gqw0.w);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC0, gqw0.v);
                            ugg0 ugg0VarC = z4 ? vgg0.c(0.0f, 8.0f, 0.0f, 0.0f, 13) : vgg0.c(8.0f, 0.0f, 0.0f, 0.0f, 14);
                            ugg0 ugg0VarC2 = z4 ? vgg0.c(0.0f, 0.0f, 8.0f, 0.0f, 11) : vgg0.c(0.0f, 0.0f, 0.0f, 8.0f, 7);
                            zgm zgmVar = (zgm) ahmVarC;
                            zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.c(o7k0.d(jm40Var, 1.0f), 0.5f), ugg0VarC), ieb.X(zgmVar.f44351a, fetVar), ljcVar));
                            zq8.a(0, fetVar, i120.Q(lgb.J(n0qVar, ugg0VarC2), ieb.X(zgmVar.b, fetVar), ljcVar));
                            fetVar.r(true);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(1126585508, fetVar, z);
                }
                fetVar.X();
                return Unit.f46060a;
            case 1:
                a01 a01Var = (a01) obj4;
                hz0 hz0Var = (hz0) obj2;
                a4x a4xVar = ((b9h0) ((g9h0) obj3)).f2209a;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : a4xVar) {
                    if (obj5 instanceof ly0) {
                        arrayList.add(obj5);
                    }
                }
                int i = 10;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ly0 ly0Var = (ly0) it.next();
                    List list = ((hz0) a01Var.D()).e;
                    vz0 vz0Var = vz0.f38275a;
                    List list2 = ly0Var.f20841a.c;
                    ArrayList<st0> arrayList3 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (obj6 instanceof st0) {
                            arrayList3.add(obj6);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, i));
                    boolean z5 = z3;
                    for (st0 st0Var : arrayList3) {
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        if (list == null || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    b = b3;
                                    z2 = z4;
                                    z5 = 0;
                                }
                                b = b3;
                                z2 = z4;
                                if (((mlr) it2.next()).f22006a == st0Var.f32750a) {
                                    z5 = b;
                                }
                                b3 = b;
                                z4 = z2 ? 1 : 0;
                            }
                        } else {
                            b = b3;
                            z2 = z4 ? 1 : 0;
                        }
                        mtr mtrVar = (mtr) vz0Var.invoke(boolValueOf, Boolean.valueOf(z5));
                        long j = st0Var.f32750a;
                        String str = st0Var.b;
                        String str2 = st0Var.c;
                        o0x o0xVar = st0Var.e;
                        o0x o0xVar2 = st0Var.f;
                        Iterator it3 = it;
                        Integer num = st0Var.g;
                        nur nurVar = st0Var.h;
                        str.getClass();
                        str2.getClass();
                        nurVar.getClass();
                        arrayList4.add(new st0(j, str, str2, mtrVar, o0xVar, o0xVar2, num, nurVar));
                        it = it3;
                        b3 = b;
                        z4 = z2;
                        z5 = 0;
                        break;
                    }
                    boolean z6 = z4 ? 1 : 0;
                    zll zllVar = ly0Var.f20841a;
                    arrayList2.add(new ly0(new zll(zllVar.f44585a, zllVar.b, arrayList4), ly0Var.b, ly0Var.c, ly0Var.d));
                    it = it;
                    i = 10;
                    z3 = false;
                }
                return hz0.a(hz0Var, null, new b9h0(dyb.o0(arrayList2)), null, null, true, 0, null, 989);
            case 2:
                ((Integer) obj2).getClass();
                tke.j((l7m0) obj3, z4, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                et8 et8Var = (et8) obj3;
                vne vneVar = (vne) obj4;
                dpa0 dpa0Var = (dpa0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                dpa0Var.getClass();
                dpa0Var.a();
                zr8 zr8Var = et8Var.b;
                if (zr8Var != null) {
                    zr8Var.a((int) fFloatValue, 0, true, z4);
                }
                qjj.W(vneVar, null, null, new qu2(et8Var, fFloatValue, yjeVar, b3), 3);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                kc5.J0((mm40) obj4, (uaa) obj3, (fet) obj, x8x.L(1), z4 ? 1 : 0);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                vic.j((mm40) obj4, (a9d) obj3, (fet) obj, x8x.L(1), z4 ? 1 : 0);
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                jcb.a((mm40) obj4, (f3w) obj3, (fet) obj, x8x.L(1), z4 ? 1 : 0);
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                jwb.g((mm40) obj4, (v2h) obj3, z4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                vdb.p((mm40) obj4, (vqh) obj3, z4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ruh ruhVar = (ruh) obj2;
                fvh fvhVar = (fvh) ((hvh) obj3);
                return ruh.a(ruhVar, null, false, false, false, String.valueOf(fvhVar.d), fvhVar.f10214a, ruhVar.j.length() > 0 ? w6x.q((String) obj4, ". ", fvhVar.c) : "", fvhVar.b, pzb.K(fvhVar.e, fvhVar.f, z4), fvhVar.g, 71);
            case 10:
                ((Integer) obj2).getClass();
                jar0.K((mm40) obj4, (p9n) obj3, (fet) obj, x8x.L(1), z4 ? 1 : 0);
                return Unit.f46060a;
            case 11:
                e6j e6jVar = (e6j) obj3;
                Throwable th = (Throwable) obj4;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof ConnectException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof zhi0)) {
                    th.printStackTrace();
                } else if (z4) {
                    e6jVar.G(new u5j(e6jVar.r.b.a(R.string.daily_task_update_error, Arrays.copyOf(new Object[0], 0))));
                } else {
                    p7m0 p7m0Var = e6jVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        e6jVar.f.getClass();
                    } while (!p7m0Var.m(value, w5j.a((w5j) value, f6j.f9013a, null, 95)));
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                thb.e((mm40) obj4, (oll) obj3, z4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                etl.c((mm40) obj4, (er5) obj3, (fet) obj, x8x.L(1), z4 ? 1 : 0);
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                vic.e((mm40) obj4, (y0m) obj3, (fet) obj, x8x.L(49), z4 ? 1 : 0);
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                q4m.a((t4m) obj3, (j4m) obj4, z4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                xkb.z((j8n) obj3, z4, (Function0) obj4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                n6m.c((mm40) obj4, (p6m) obj3, z4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 18:
                uba ubaVar = (uba) obj3;
                Function1 function1 = (Function1) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rcb.z(null, ubaVar.c(), this.b, function1, fetVar2, 0, 1);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                vdb.x((mm40) obj4, (oem) obj3, z4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                d6l0 d6l0Var = (d6l0) obj3;
                Function1 function2 = (Function1) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qzl qzlVarC = d6l0Var.c();
                    zcl zclVar = qmk.f28987a;
                    qbc.k(s5x0.L(jm40Var, 8.0f, 0.0f, 2), qzlVarC, false, this.b, function2, fetVar3, 384);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 21:
                k6l0 k6l0Var = (k6l0) obj3;
                Function1 function3 = (Function1) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qzl qzlVarC2 = k6l0Var.c();
                    zcl zclVar2 = qmk.f28987a;
                    qbc.k(s5x0.L(jm40Var, 8.0f, 0.0f, 2), qzlVarC2, true, this.b, function3, fetVar4, 384);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 22:
                tfa tfaVar = (tfa) obj3;
                Function1 function4 = (Function1) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    if (tfaVar instanceof ofa) {
                        nemVar = ((ofa) tfaVar).d;
                    } else if (tfaVar instanceof pfa) {
                        nemVar = ((pfa) tfaVar).d;
                    } else if (tfaVar instanceof qfa) {
                        nemVar = ((qfa) tfaVar).d;
                    } else if (tfaVar instanceof rfa) {
                        nemVar = ((rfa) tfaVar).d;
                    } else {
                        if (!(tfaVar instanceof sfa)) {
                            t9f.b();
                            return null;
                        }
                        nemVar = ((sfa) tfaVar).d;
                    }
                    rcb.z(null, nemVar, this.b, function4, fetVar5, 0, 1);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 23:
                zfa zfaVar = (zfa) obj3;
                Function1 function5 = (Function1) obj4;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    if (zfaVar instanceof ufa) {
                        nemVar2 = ((ufa) zfaVar).d;
                    } else if (zfaVar instanceof vfa) {
                        nemVar2 = ((vfa) zfaVar).d;
                    } else if (zfaVar instanceof wfa) {
                        nemVar2 = ((wfa) zfaVar).d;
                    } else if (zfaVar instanceof xfa) {
                        nemVar2 = ((xfa) zfaVar).d;
                    } else {
                        if (!(zfaVar instanceof yfa)) {
                            t9f.b();
                            return null;
                        }
                        nemVar2 = ((yfa) zfaVar).d;
                    }
                    rcb.z(null, nemVar2, this.b, function5, fetVar6, 0, 1);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                kkb.o((mm40) obj4, (v4o0) obj3, z4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                xkb.q((mm40) obj4, (i3o0) obj3, z4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                fbc.G((mm40) obj4, (b1n) obj3, z4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                ibc.D((mm40) obj4, (i2n) obj3, z4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                qbc.A((mm40) obj4, (m2n) obj3, z4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                vbc.K((mm40) obj4, (n2n) obj3, z4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ igm(byte b, int i, mm40 mm40Var, Object obj, boolean z) {
        this.f14741a = b;
        this.d = mm40Var;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ igm(mm40 mm40Var, Object obj, int i, int i2, byte b) {
        this.f14741a = b;
        this.d = mm40Var;
        this.c = obj;
        this.b = i2;
    }

    public /* synthetic */ igm(Object obj, Object obj2, boolean z, byte b) {
        this.f14741a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ igm(Object obj, boolean z, wdr wdrVar, int i, byte b) {
        this.f14741a = b;
        this.c = obj;
        this.b = z;
        this.d = wdrVar;
    }

    public /* synthetic */ igm(Object obj, boolean z, Object obj2, byte b) {
        this.f14741a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ igm(boolean z, e6j e6jVar, Throwable th) {
        this.f14741a = (byte) 11;
        this.b = z;
        this.c = e6jVar;
        this.d = th;
    }
}
