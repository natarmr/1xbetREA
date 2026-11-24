package a;

import android.content.Context;
import android.text.format.DateFormat;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLockScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class a220 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a220(boolean z, boolean z2, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.j = z;
        this.k = z2;
        this.l = pz40Var;
    }

    private final Object l(Object obj) {
        swi0 swi0Var = (swi0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            Context applicationContext = swi0Var.n0().getApplicationContext();
            applicationContext.getClass();
            this.j = true;
            rwj rwjVar = tvk.f34603a;
            obj = qjj.d0(dvj.c, new vc3(applicationContext, yjeVar, b), this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        gne0 gne0Var = swi0.X1;
        swi0Var.H0().x(new zxi0(dDoubleValue, this.k));
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        t1j0 t1j0Var = (t1j0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            Context applicationContext = t1j0Var.n0().getApplicationContext();
            applicationContext.getClass();
            this.j = true;
            rwj rwjVar = tvk.f34603a;
            obj = qjj.d0(dvj.c, new vc3(applicationContext, yjeVar, b), this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        zie0 zie0Var = t1j0.Y1;
        t1j0Var.I0().w(dDoubleValue, this.k);
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        boolean z = this.k;
        w5j0 w5j0Var = (w5j0) this.l;
        Object obj2 = wne.f39444a;
        boolean z2 = this.j;
        yje yjeVar = null;
        if (!z2) {
            z1x.P(obj);
            ugf0 ugf0Var = w5j0Var.y;
            this.j = true;
            etj etjVar = (etj) ugf0Var.f35622a;
            Object objD0 = qjj.d0(etjVar.c.b, new u88((Object) etjVar, z, yjeVar, (byte) 12), this);
            if (objD0 != obj2) {
                objD0 = Unit.f46060a;
            }
            if (objD0 != obj2) {
                objD0 = Unit.f46060a;
            }
            if (objD0 == obj2) {
                return obj2;
            }
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        w5j0Var.J(new w2j0(z));
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        qbj0 qbj0Var = (qbj0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            Context applicationContext = qbj0Var.n0().getApplicationContext();
            applicationContext.getClass();
            this.j = true;
            rwj rwjVar = tvk.f34603a;
            obj = qjj.d0(dvj.c, new vc3(applicationContext, yjeVar, b), this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        lme0 lme0Var = qbj0.Z1;
        qbj0Var.H0().x(new haj0(dDoubleValue, this.k));
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        ofj0 ofj0Var = (ofj0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            Context applicationContext = ofj0Var.n0().getApplicationContext();
            applicationContext.getClass();
            this.j = true;
            rwj rwjVar = tvk.f34603a;
            obj = qjj.d0(dvj.c, new vc3(applicationContext, yjeVar, b), this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        cge0 cge0Var = ofj0.X1;
        ofj0Var.H0().x(new zxi0(dDoubleValue, this.k));
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            qz40 qz40Var = (qz40) ((ncl0) this.l).T.getValue();
            Boolean boolValueOf = Boolean.valueOf(this.k);
            this.j = true;
            p7m0 p7m0Var = (p7m0) qz40Var;
            p7m0Var.getClass();
            p7m0Var.o(null, boolValueOf);
            if (Unit.f46060a == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj) throws Throwable {
        Object value;
        Object value2;
        zxl0 zxl0Var = (zxl0) this.l;
        ocj ocjVar = zxl0Var.i;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (this.k) {
                boolean z2 = ((txl0) zxl0Var.D()).c == null;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, txl0.a((txl0) value, z2, false, null, null, 12)));
            }
            svu svuVar = zxl0Var.p;
            xwl0 xwl0Var = zxl0Var.o;
            String str = xwl0Var.f41615a;
            String strValueOf = String.valueOf(xwl0Var.b);
            boolean z3 = zxl0Var.s.a().m0;
            this.j = true;
            obj = ((yuu) svuVar.f32888a).j(str, strValueOf, z3, true, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        xvl0 xvl0Var = (xvl0) obj;
        int i = zxl0.w;
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
        } while (!p7m0Var2.m(value2, txl0.a((txl0) value2, false, false, xvl0Var, null, 8)));
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new a220(obj2, this.k, yjeVar, (byte) 0);
            case 1:
                a220 a220Var = new a220((nn20) obj2, yjeVar, (byte) 1);
                a220Var.k = ((Boolean) obj).booleanValue();
                return a220Var;
            case 2:
                return new a220(this.j, this.k, (pz40) obj2, yjeVar);
            case 3:
                return new a220(obj2, this.k, yjeVar, (byte) 3);
            case 4:
                a220 a220Var2 = new a220((to70) obj2, yjeVar, (byte) 4);
                a220Var2.k = ((Boolean) obj).booleanValue();
                return a220Var2;
            case 5:
                return new a220(obj2, this.k, yjeVar, (byte) 5);
            case 6:
                return new a220(obj2, this.k, yjeVar, (byte) 6);
            case 7:
                return new a220(obj2, this.k, yjeVar, (byte) 7);
            case 8:
                return new a220(obj2, this.k, yjeVar, (byte) 8);
            case 9:
                a220 a220Var3 = new a220((pmb0) obj2, yjeVar, (byte) 9);
                a220Var3.k = ((Boolean) obj).booleanValue();
                return a220Var3;
            case 10:
                a220 a220Var4 = new a220((orb0) obj2, yjeVar, (byte) 10);
                a220Var4.k = ((Boolean) obj).booleanValue();
                return a220Var4;
            case 11:
                return new a220(obj2, this.k, yjeVar, (byte) 11);
            case 12:
                return new a220(obj2, this.k, yjeVar, (byte) 12);
            case 13:
                return new a220((lyc0) obj2, yjeVar, (byte) 13);
            case 14:
                return new a220((qyc0) obj2, yjeVar, (byte) 14);
            case 15:
                a220 a220Var5 = new a220((ijd0) obj2, yjeVar, (byte) 15);
                a220Var5.k = ((Boolean) obj).booleanValue();
                return a220Var5;
            case 16:
                a220 a220Var6 = new a220((fkd0) obj2, yjeVar, (byte) 16);
                a220Var6.k = ((Boolean) obj).booleanValue();
                return a220Var6;
            case 17:
                return new a220(this.k, obj2, yjeVar, (byte) 17);
            case 18:
                return new a220(this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new a220(obj2, this.k, yjeVar, (byte) 19);
            case 20:
                return new a220(this.k, obj2, yjeVar, (byte) 20);
            case 21:
                a220 a220Var7 = new a220((uri0) obj2, yjeVar, (byte) 21);
                a220Var7.k = ((Boolean) obj).booleanValue();
                return a220Var7;
            case 22:
                return new a220(obj2, this.k, yjeVar, (byte) 22);
            case 23:
                return new a220(obj2, this.k, yjeVar, (byte) 23);
            case 24:
                return new a220(obj2, this.k, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new a220(obj2, this.k, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new a220(obj2, this.k, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new a220(obj2, this.k, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new a220(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new a220(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a220) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((a220) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((a220) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((a220) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((a220) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((a220) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((a220) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:291:0x0712  */
    /* JADX WARN: Code duplicated, block: B:480:0x0b21  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        b820 b820Var;
        czc0 czc0VarA;
        Object objA;
        Object objA2;
        bby bbyVar;
        utb utbVarI;
        Object objA3;
        Object value2;
        boolean z;
        Object value3;
        olb0 olb0Var;
        Object value4;
        olb0 olb0Var2;
        Object value5;
        bec0 bec0Var;
        Object objA4;
        Object value6;
        boolean zA;
        Object objX;
        Object value7;
        Object value8;
        boolean zA2;
        Object objX2;
        Object value9;
        Object value10;
        Object objU;
        Object value11;
        String strG;
        Object value12;
        dfm0 dfm0Var;
        Object objN;
        Object value13;
        Object value14;
        Object objA5;
        Object objG;
        Object value15;
        Object value16;
        byte b = this.i;
        byte b2 = 4;
        gfe afeVar = yee.f42482a;
        dfe dfeVar = dfe.f5996a;
        byte b3 = 2;
        final byte b4 = 0;
        Object obj2 = this.l;
        final byte b5 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                w220 w220Var = (w220) obj2;
                sff0 sff0Var = w220Var.c1;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    cyu cyuVar = w220Var.Y;
                    this.j = true;
                    if (cyuVar.u(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (sff0Var.f.o) {
                    c4m0 c4m0Var = w220Var.q1;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        w220Var.q1 = sac.T(new fnq(((dzz) w220Var.c0.f41310a.b).f6965a, new r120(w220Var, yjeVar, b3), b2), jiu0.a(w220Var), new sax(b3, yjeVar, (byte) 8));
                    }
                    w220Var.z();
                }
                if (sff0Var.f.i && this.k && ((dzz) w220Var.X.f9921a.b).b) {
                    i1w0 i1w0VarS = w220Var.s.s();
                    k0w0 k0w0Var = new k0w0(i1w0VarS);
                    w220Var.d0.getClass();
                    k0w0Var.h(new ResponsibleGamblingScreens$DepositLockScreen());
                    ListIterator listIteratorO = b1j.o(i1w0VarS, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0VarS.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                nn20 nn20Var = (nn20) obj2;
                boolean z3 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (z3) {
                        int i = nn20.c1;
                        p7m0 p7m0Var = nn20Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            b820Var = (b820) value;
                            czc0 czc0Var = b820Var.e;
                            if (czc0Var != null) {
                                yyc0 yyc0Var = yyc0.f43460a;
                                czc0VarA = czc0.a(czc0Var, null, null, false, false, 29);
                            } else {
                                czc0VarA = null;
                            }
                        } while (!p7m0Var.m(value, b820.a(b820Var, null, null, null, null, czc0VarA, null, null, false, false, false, false, false, 8175)));
                        if (nn20Var.b1) {
                            int i2 = nn20.c1;
                            nn20Var.J0();
                            nn20Var.b1 = false;
                        } else {
                            f3c f3cVar = nn20Var.v;
                            this.k = z3;
                            this.j = true;
                            objA = f3cVar.a(this);
                            if (objA == wneVar2) {
                                return wneVar2;
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA = obj;
                m97.Companion.getClass();
                if (Intrinsics.d(objA, k97.a())) {
                    int i3 = nn20.c1;
                    nn20Var.J0();
                    nn20Var.b1 = false;
                }
                return Unit.f46060a;
            case 2:
                pz40 pz40Var = (pz40) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    pz40Var.setValue(Boolean.TRUE);
                } else if (this.k) {
                    pz40Var.setValue(Boolean.FALSE);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    boolean z6 = this.k;
                    this.j = true;
                    int i4 = o030.U;
                    if (((o030) obj2).o(z6, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                to70 to70Var = (to70) obj2;
                boolean z7 = this.k;
                wne wneVar5 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (!z7 && (bbyVar = to70Var.S) != null) {
                        bbyVar.cancel(null);
                    }
                    d2e d2eVar = to70Var.x;
                    this.k = z7;
                    this.j = true;
                    d2eVar.f5352a.a(z7);
                    if (z7) {
                        objA2 = d2eVar.b(this);
                        if (objA2 != wneVar5) {
                            objA2 = Unit.f46060a;
                        }
                    } else {
                        objA2 = d2eVar.a(this);
                        if (objA2 != wneVar5) {
                            objA2 = Unit.f46060a;
                        }
                    }
                    if (objA2 == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    boolean z10 = this.k;
                    this.j = true;
                    if (((ek80) obj2).b(z10, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    boolean z12 = this.k;
                    this.j = true;
                    if (((fk80) obj2).b(z12, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                j6b0 j6b0Var = (j6b0) obj2;
                pru pruVar = j6b0Var.x;
                wne wneVar8 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    long jF = ynq0.f(j6b0Var.A.a());
                    int iOrdinal = j6b0Var.t.ordinal();
                    if (iOrdinal == 0) {
                        qgd qgdVar = j6b0Var.q;
                        boolean z14 = this.k;
                        Boolean bool = ((c6b0) j6b0Var.D()).f;
                        utbVarI = qgdVar.I(z14, bool != null ? bool.booleanValue() : pruVar.a().J1, pruVar.a().O1);
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        ywq0 ywq0Var = j6b0Var.s;
                        boolean z15 = this.k;
                        Boolean bool2 = ((c6b0) j6b0Var.D()).f;
                        utbVarI = ywq0Var.q(jF, z15, bool2 != null ? bool2.booleanValue() : pruVar.a().J1, pruVar.a().O1);
                    }
                    g6b0 g6b0Var = new g6b0(j6b0Var, (byte) 0);
                    this.j = true;
                    if (utbVarI.c(g6b0Var, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                final kgb0 kgb0Var = (kgb0) obj2;
                mne mneVar = kgb0Var.p;
                wne wneVar9 = wne.f39444a;
                boolean z16 = this.j;
                yje yjeVar2 = null;
                if (!z16) {
                    z1x.P(obj);
                    if (!kgb0Var.t.c()) {
                        kgb0Var.N();
                        throw new el50(null);
                    }
                    jqc jqcVar = kgb0Var.I;
                    this.j = true;
                    objA3 = jqcVar.a(this);
                    if (objA3 == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                boolean zBooleanValue = ((Boolean) objA3).booleanValue();
                boolean zB = kgb0Var.J.b();
                ssa0 ssa0Var = new ssa0(kgb0Var, b2);
                final bgb0 bgb0Var = new bgb0(kgb0Var, (byte) 5);
                if (zBooleanValue && zB) {
                    e3c.n(kgb0Var.j0);
                    kgb0Var.j0 = sac.V(jiu0.a(kgb0Var), new Function1() { // from class: a.agb0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            byte b6 = b4;
                            bgb0 bgb0Var2 = bgb0Var;
                            kgb0 kgb0Var2 = kgb0Var;
                            Throwable th = (Throwable) obj3;
                            switch (b6) {
                                case 0:
                                    th.getClass();
                                    kgb0Var2.Q(th);
                                    bgb0Var2.invoke(th);
                                    break;
                                default:
                                    th.getClass();
                                    kgb0Var2.Q(th);
                                    bgb0Var2.invoke(th);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, null, mneVar.b, new o690((Object) kgb0Var, (Object) ssa0Var, yjeVar2, (byte) 15), 10);
                } else {
                    boolean z17 = this.k;
                    e3c.n(kgb0Var.j0);
                    kgb0Var.j0 = sac.V(jiu0.a(kgb0Var), new Function1() { // from class: a.agb0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            byte b6 = b5;
                            bgb0 bgb0Var2 = bgb0Var;
                            kgb0 kgb0Var2 = kgb0Var;
                            Throwable th = (Throwable) obj3;
                            switch (b6) {
                                case 0:
                                    th.getClass();
                                    kgb0Var2.Q(th);
                                    bgb0Var2.invoke(th);
                                    break;
                                default:
                                    th.getClass();
                                    kgb0Var2.Q(th);
                                    bgb0Var2.invoke(th);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, null, mneVar.b, new ys8((Object) kgb0Var, z17, (Object) ssa0Var, yjeVar2, (byte) 28), 10);
                }
                bby bbyVar2 = kgb0Var.c0;
                b5 = (bbyVar2 == null || !bbyVar2.isActive()) ? (byte) 0 : (byte) 1;
                hfe hfeVar = ((ufb0) kgb0Var.D()).i;
                xee xeeVar = hfeVar instanceof xee ? (xee) hfeVar : null;
                boolean z18 = (xeeVar != null ? xeeVar.f40742a : null) instanceof zhi0;
                if (b5 == 0 && !z18) {
                    if (!((ufb0) kgb0Var.D()).i.a()) {
                        p7m0 p7m0Var2 = kgb0Var.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            kgb0Var.f.getClass();
                        } while (!p7m0Var2.m(value2, ufb0.a((ufb0) value2, null, false, false, null, false, null, null, vee.f37282a, null, null, null, 3839)));
                    }
                    kgb0Var.c0 = sac.g0(jiu0.a(kgb0Var), "PopularOneXGamesViewModel.getBanners", mneVar.b, new bgb0(kgb0Var, b2), new dgb0(kgb0Var, yjeVar2, b4), 80);
                }
                return Unit.f46060a;
            case 9:
                pmb0 pmb0Var = (pmb0) obj2;
                oyg0 oyg0Var = pmb0Var.f;
                ocj ocjVar = pmb0Var.i;
                poq0 poq0Var = pmb0Var.B;
                boolean z19 = this.k;
                wne wneVar10 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    idb0 idb0Var = ((olb0) pmb0Var.D()).j;
                    boolean z21 = z19 && ((olb0) pmb0Var.D()).k.j && axq.z(((of6) pmb0Var.p0.f43005a).f25150a, "SHOW_BOTTOM_SHEET", true);
                    boolean zR = poq0Var.f27342a.d().r(fk60.POPULAR_OLD_OS);
                    if (pmb0Var.x.l()) {
                        r9u r9uVar = pmb0Var.q0;
                        ygp ygpVar = ygp.i;
                        r9uVar.getClass();
                        j1q0 j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        if (j1q0Var.f15748a.d(ygpVar)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    idb0 idb0VarA = idb0.a(idb0Var, z21, z, !z19 && ((olb0) pmb0Var.D()).j.c, zR, false, poq0Var.f27342a.d().r(fk60.POPULAR_OLD_DEVICE), 40);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        olb0Var = (olb0) value3;
                    } while (!p7m0Var3.m(value3, olb0.a(olb0Var, null, null, null, z19, z19 && olb0Var.k.i, null, 0L, 0L, false, idb0VarA, null, null, 7655)));
                    if (((olb0) pmb0Var.D()).k.e && ((olb0) pmb0Var.D()).k.o) {
                        boolean z22 = ((olb0) pmb0Var.D()).d;
                        c4m0 c4m0Var2 = pmb0Var.u0;
                        if (z22) {
                            e3c.n(c4m0Var2);
                        } else if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                            if (((olb0) pmb0Var.D()).g >= ((olb0) pmb0Var.D()).k.k) {
                                p7m0 p7m0Var4 = ocjVar.f25029a;
                                do {
                                    value4 = p7m0Var4.getValue();
                                    value4.getClass();
                                    olb0Var2 = (olb0) value4;
                                    oyg0Var.getClass();
                                } while (!p7m0Var4.m(value4, olb0.a(olb0Var2, null, null, null, false, false, null, 0L, 0L, false, c9x.J(olb0Var2.j, bdb0.f2391a, true), null, null, 7679)));
                            } else {
                                pmb0Var.u0 = i3t0.L(pmb0Var, bkb.h0(1L, TimeUnit.SECONDS, new imb0(pmb0Var, yjeVar, b4)), pmb0Var.A.f22085a, null, 2);
                            }
                        }
                    }
                    this.k = z19;
                    this.j = true;
                    if (pmb0Var.Q(this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                orb0 orb0Var = (orb0) obj2;
                boolean z23 = this.k;
                wne wneVar11 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    qoj0 qoj0Var = orb0Var.r;
                    Boolean boolValueOf = Boolean.valueOf(z23);
                    this.k = z23;
                    this.j = true;
                    if (qoj0Var.a(boolValueOf, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (!orb0Var.v && z23) {
                    orb0Var.w();
                }
                orb0Var.v = z23;
                return Unit.f46060a;
            case 11:
                sec0 sec0Var = (sec0) obj2;
                Object obj3 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    boolean z26 = this.k;
                    List list = sec0.E;
                    p7m0 p7m0Var5 = sec0Var.i.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                        bec0Var = (bec0) value5;
                    } while (!p7m0Var5.m(value5, bec0.a(bec0Var, null, null, null, !bec0Var.f && z26, false, false, false, false, null, false, null, 65511)));
                    vsg0 vsg0Var = new vsg0(new pec0(sec0Var, yjeVar, b4));
                    List list2 = sec0.E;
                    a1g a1gVarI0 = bkb.i0(vsg0Var, "PromoCodeListViewModel.loadData", 3, 0L, null, list2, null, 44);
                    gmq gmqVarI0 = ((bec0) sec0Var.D()).k ? bkb.i0(new vsg0(new pec0(sec0Var, yjeVar, b5)), "PromoCodeListViewModel.loadRecommendations", 3, 0L, null, list2, null, 44) : new eu4(iun.f15405a, (byte) 12);
                    jgb0 jgb0Var = new jgb0(3, yjeVar, b3);
                    z0c0 z0c0Var = new z0c0(sec0Var, (byte) 17);
                    this.j = true;
                    Object objJ = d5c.J(this, new s6d(gmqVarI0, a1gVarI0, z0c0Var, jgb0Var, null));
                    if (objJ != wne.f39444a) {
                        objJ = Unit.f46060a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                doc0 doc0Var = (doc0) obj2;
                p7m0 p7m0Var6 = doc0Var.t;
                wne wneVar12 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    if (doc0Var.p.k) {
                        if (this.k) {
                            p7m0Var6.getClass();
                            p7m0Var6.o(null, dfeVar);
                        }
                        wou wouVar = doc0Var.e;
                        this.j = true;
                        objA4 = wouVar.a(this);
                        if (objA4 == wneVar12) {
                            return wneVar12;
                        }
                    } else {
                        p7m0Var6.getClass();
                        p7m0Var6.o(null, afeVar);
                    }
                    return Unit.f46060a;
                }
                if (!z27) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA4 = obj;
                afe afeVar2 = new afe(x0x.f0((etc0) objA4));
                p7m0Var6.getClass();
                p7m0Var6.o(null, afeVar2);
                return Unit.f46060a;
            case 13:
                lyc0 lyc0Var = (lyc0) obj2;
                ArrayList arrayList = lyc0Var.D;
                ocj ocjVar2 = lyc0Var.i;
                wne wneVar13 = wne.f39444a;
                boolean z28 = this.k;
                if (!z28) {
                    z1x.P(obj);
                    int i5 = lyc0.E;
                    p7m0 p7m0Var7 = ocjVar2.f25029a;
                    do {
                        value6 = p7m0Var7.getValue();
                        value6.getClass();
                    } while (!p7m0Var7.m(value6, mmc0.a((mmc0) value6, null, dfeVar, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                    zA = lyc0Var.z.a();
                    fhj fhjVar = lyc0Var.s;
                    String strA = lyc0Var.x.a();
                    lyc0Var.y.f15225a.a();
                    this.j = zA;
                    this.k = true;
                    objX = fhjVar.x(strA, this);
                    if (objX == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z29 = this.j;
                    z1x.P(obj);
                    zA = z29;
                    objX = obj;
                }
                List list3 = (List) objX;
                if (list3.isEmpty() || zA) {
                    int i6 = lyc0.E;
                    p7m0 p7m0Var8 = ocjVar2.f25029a;
                    do {
                        value7 = p7m0Var8.getValue();
                        value7.getClass();
                    } while (!p7m0Var8.m(value7, mmc0.a((mmc0) value7, null, afeVar, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                } else {
                    arrayList.clear();
                    arrayList.addAll(list3);
                    p7m0 p7m0Var9 = ocjVar2.f25029a;
                    do {
                        value8 = p7m0Var9.getValue();
                        value8.getClass();
                    } while (!p7m0Var9.m(value8, mmc0.a((mmc0) value8, null, new afe(dyb.o0(list3)), null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                }
                return Unit.f46060a;
            case 14:
                qyc0 qyc0Var = (qyc0) obj2;
                p7m0 p7m0Var10 = qyc0Var.y;
                wne wneVar14 = wne.f39444a;
                boolean z30 = this.k;
                if (!z30) {
                    z1x.P(obj);
                    p7m0Var10.getClass();
                    p7m0Var10.o(null, dfeVar);
                    zA2 = qyc0Var.q.a();
                    fhj fhjVar2 = qyc0Var.g;
                    String strA2 = qyc0Var.m.a();
                    qyc0Var.o.f15225a.a();
                    this.j = zA2;
                    this.k = true;
                    objX2 = fhjVar2.x(strA2, this);
                    if (objX2 == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z31 = this.j;
                    z1x.P(obj);
                    zA2 = z31;
                    objX2 = obj;
                }
                List list4 = (List) objX2;
                if (!list4.isEmpty() && qyc0Var.t.f34278a && !zA2) {
                    afeVar = new afe(list4);
                }
                p7m0Var10.getClass();
                p7m0Var10.o(null, afeVar);
                return Unit.f46060a;
            case 15:
                ijd0 ijd0Var = (ijd0) obj2;
                p7m0 p7m0Var11 = ijd0Var.h;
                boolean z32 = this.k;
                wne wneVar15 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    do {
                        value9 = p7m0Var11.getValue();
                    } while (!p7m0Var11.m(value9, fjd0.a((fjd0) value9, null, z32, 1)));
                    if (z32 && ((fjd0) p7m0Var11.getValue()).f9635a.length() == 0) {
                        this.k = z32;
                        this.j = true;
                        if (ijd0Var.w(this) == wneVar15) {
                            return wneVar15;
                        }
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                fkd0 fkd0Var = (fkd0) obj2;
                p7m0 p7m0Var12 = fkd0Var.k;
                boolean z34 = this.k;
                wne wneVar16 = wne.f39444a;
                boolean z35 = this.j;
                if (!z35) {
                    z1x.P(obj);
                    do {
                        value10 = p7m0Var12.getValue();
                    } while (!p7m0Var12.m(value10, yjd0.a((yjd0) value10, null, z34, 61)));
                    if (z34 && ((yjd0) p7m0Var12.getValue()).f42735a.length() == 0) {
                        this.k = z34;
                        this.j = true;
                        if (fkd0Var.w(this) == wneVar16) {
                            return wneVar16;
                        }
                    }
                } else {
                    if (!z35) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                lrd0 lrd0Var = (lrd0) obj2;
                oyg0 oyg0Var2 = lrd0Var.f;
                ocj ocjVar3 = lrd0Var.i;
                wne wneVar17 = wne.f39444a;
                boolean z36 = this.j;
                if (!z36) {
                    z1x.P(obj);
                    if (this.k) {
                        int i7 = lrd0.E;
                        p7m0 p7m0Var13 = ocjVar3.f25029a;
                        do {
                            value11 = p7m0Var13.getValue();
                            value11.getClass();
                        } while (!p7m0Var13.m(value11, yqd0.a((yqd0) value11, true, false, false, null, null, null, null, null, null, null, false, 2044)));
                    }
                    f4u f4uVar = lrd0Var.q;
                    String str = lrd0Var.o;
                    this.j = true;
                    objU = ((n660) f4uVar.b).u(str, this);
                    if (objU == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z36) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objU = obj;
                }
                ktd0 ktd0Var = ((otd0) objU).b;
                List<psd0> list5 = ktd0Var.j;
                int i8 = lrd0.E;
                ArrayList arrayList2 = new ArrayList();
                for (psd0 psd0Var : list5) {
                    int i9 = psd0Var.f27511a;
                    if (i9 == 18) {
                        dfm0Var = vsd0.b;
                    } else if (i9 != 49) {
                        dfm0Var = i9 != 50 ? wsd0.b : tsd0.b;
                    } else {
                        dfm0Var = usd0.b;
                    }
                    j240 j240Var = !(dfm0Var instanceof wsd0) ? new j240(dfm0Var, psd0Var.b) : null;
                    if (j240Var != null) {
                        arrayList2.add(j240Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    p7m0 p7m0Var14 = ocjVar3.f25029a;
                    do {
                        value12 = p7m0Var14.getValue();
                        value12.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var14.m(value12, yqd0.a((yqd0) value12, false, false, true, null, null, null, null, null, null, null, false, 2042)));
                } else {
                    ctf0 ctf0Var = lrd0Var.v;
                    ctf0Var.getClass();
                    lsm0 lsm0Var = ctf0Var.b;
                    StringBuilder sb = new StringBuilder(lsm0Var.a(R.string.races_trace, Arrays.copyOf(new Object[0], 0)));
                    sb.append(": " + ktd0Var.c + ", ");
                    sb.append(lsm0Var.a(R.string.circle_length, Arrays.copyOf(new Object[0], 0)));
                    sb.append(": " + ktd0Var.g + ", ");
                    sb.append(lsm0Var.a(R.string.cicrles_count, Arrays.copyOf(new Object[0], 0)));
                    sb.append(": " + ktd0Var.h + ", ");
                    sb.append(lsm0Var.a(R.string.race_distance, Arrays.copyOf(new Object[0], 0)));
                    sb.append(": " + ktd0Var.i);
                    String string = sb.toString();
                    lho lhoVar = ktd0Var.e;
                    long j = ktd0Var.f;
                    boolean zIs24HourFormat = DateFormat.is24HourFormat(((tgk) ((n660) lrd0Var.s.b).c).f33916a);
                    if (pqd0.f27411a[lhoVar.ordinal()] == 1) {
                        strG = "";
                    } else {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 48);
                    }
                    lrd0Var.H(new dfc0((Object) arrayList2, (Object) ktd0Var, (Object) strG, (Object) string, (byte) 8));
                }
                return Unit.f46060a;
            case 18:
                a6e0 a6e0Var = (a6e0) obj2;
                ocj ocjVar4 = a6e0Var.i;
                wne wneVar18 = wne.f39444a;
                boolean z37 = this.j;
                if (!z37) {
                    z1x.P(obj);
                    if (this.k) {
                        int i10 = a6e0.v;
                        p7m0 p7m0Var15 = ocjVar4.f25029a;
                        do {
                            value13 = p7m0Var15.getValue();
                            value13.getClass();
                        } while (!p7m0Var15.m(value13, v5e0.a((v5e0) value13, true, 6)));
                    }
                    p4u p4uVar = a6e0Var.s;
                    String str2 = a6e0Var.r;
                    this.j = true;
                    objN = ((j910) p4uVar.f26374a).n(str2, this);
                    if (objN == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z37) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                List list6 = (List) objN;
                int i11 = a6e0.v;
                p7m0 p7m0Var16 = ocjVar4.f25029a;
                do {
                    value14 = p7m0Var16.getValue();
                    value14.getClass();
                    list6.getClass();
                } while (!p7m0Var16.m(value14, new v5e0(list6, false, false)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hde0 hde0Var = (hde0) obj2;
                wne wneVar19 = wne.f39444a;
                boolean z38 = this.j;
                if (!z38) {
                    z1x.P(obj);
                    p7m0 p7m0Var17 = hde0Var.j;
                    Boolean bool3 = Boolean.TRUE;
                    p7m0Var17.getClass();
                    p7m0Var17.o(null, bool3);
                    zbe0 zbe0Var = this.k ? zbe0.d : zbe0.f44112a;
                    this.j = true;
                    if (hde0Var.x(zbe0Var, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z38) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar20 = wne.f39444a;
                boolean z39 = this.j;
                if (!z39) {
                    z1x.P(obj);
                    qaf0 qaf0Var = new qaf0(i120.W(ydx.V(null, new kg2((byte) 7, this.k))), b5);
                    dp8 dp8Var = new dp8((rv2) obj2, b5);
                    this.j = true;
                    if (qaf0Var.c(dp8Var, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z39) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                uri0 uri0Var = (uri0) obj2;
                p7m0 p7m0Var18 = uri0Var.x;
                boolean z40 = this.k;
                wne wneVar21 = wne.f39444a;
                boolean z41 = this.j;
                if (!z41) {
                    z1x.P(obj);
                    uri0Var.C = z40;
                    if (z40) {
                        rri0 rri0Var = (rri0) p7m0Var18.getValue();
                        if ((rri0Var instanceof qri0) || ((rri0Var instanceof pri0) && ((pri0) rri0Var).b.isEmpty())) {
                            e0c e0cVar = uri0Var.v;
                            this.k = z40;
                            this.j = true;
                            objA5 = e0cVar.a(this);
                            if (objA5 == wneVar21) {
                                return wneVar21;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (p7m0Var18.getValue() instanceof qri0) {
                        pri0 pri0Var = new pri0(iun.f15405a, false);
                        p7m0Var18.getClass();
                        p7m0Var18.o(null, pri0Var);
                    }
                    return Unit.f46060a;
                }
                if (!z41) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA5 = obj;
                List list7 = (List) objA5;
                pri0 pri0Var2 = new pri0(list7, !list7.isEmpty());
                p7m0Var18.getClass();
                p7m0Var18.o(null, pri0Var2);
                return Unit.f46060a;
            case 22:
                return l(obj);
            case 23:
                return m(obj);
            case 24:
                return o(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return r(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return s(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return t(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return x(obj);
            default:
                ybm0 ybm0Var = (ybm0) obj2;
                ocj ocjVar5 = ybm0Var.i;
                wne wneVar22 = wne.f39444a;
                boolean z42 = this.j;
                if (!z42) {
                    z1x.P(obj);
                    if (this.k) {
                        int i12 = ybm0.D;
                        p7m0 p7m0Var19 = ocjVar5.f25029a;
                        do {
                            value15 = p7m0Var19.getValue();
                            value15.getClass();
                        } while (!p7m0Var19.m(value15, dcm0.a((dcm0) value15, true, false, null, null, null, 253)));
                    }
                    bwl bwlVar = ybm0Var.p;
                    String str3 = ybm0Var.q;
                    this.j = true;
                    objG = ((lhf0) bwlVar.f3330a).g(str3, this);
                    if (objG == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z42) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                sfb sfbVar = (sfb) objG;
                int i13 = ybm0.D;
                p7m0 p7m0Var20 = ocjVar5.f25029a;
                do {
                    value16 = p7m0Var20.getValue();
                    value16.getClass();
                } while (!p7m0Var20.m(value16, dcm0.a((dcm0) value16, false, false, sfbVar, null, null, 233)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a220(Object obj, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a220(boolean z, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a220(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }
}
