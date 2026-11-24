package a;

import android.os.Build;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class w620 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w620(boolean z, kn20 kn20Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.j = z;
        this.k = kn20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                w620 w620Var = new w620(obj2, yjeVar, (byte) 0);
                w620Var.j = ((Boolean) obj).booleanValue();
                return w620Var;
            case 1:
                w620 w620Var2 = new w620(obj2, yjeVar, (byte) 1);
                w620Var2.j = ((Boolean) obj).booleanValue();
                return w620Var2;
            case 2:
                w620 w620Var3 = new w620(obj2, yjeVar, (byte) 2);
                w620Var3.j = ((Boolean) obj).booleanValue();
                return w620Var3;
            case 3:
                return new w620(this.j, (kn20) obj2, yjeVar);
            case 4:
                w620 w620Var4 = new w620(obj2, yjeVar, (byte) 4);
                w620Var4.j = ((Boolean) obj).booleanValue();
                return w620Var4;
            case 5:
                w620 w620Var5 = new w620(obj2, yjeVar, (byte) 5);
                w620Var5.j = ((Boolean) obj).booleanValue();
                return w620Var5;
            case 6:
                w620 w620Var6 = new w620(obj2, yjeVar, (byte) 6);
                w620Var6.j = ((Boolean) obj).booleanValue();
                return w620Var6;
            case 7:
                w620 w620Var7 = new w620(obj2, yjeVar, (byte) 7);
                w620Var7.j = ((Boolean) obj).booleanValue();
                return w620Var7;
            case 8:
                return new w620(obj2, yjeVar, (byte) 8);
            case 9:
                return new w620(obj2, yjeVar, (byte) 9);
            case 10:
                w620 w620Var8 = new w620(obj2, yjeVar, (byte) 10);
                w620Var8.j = ((Boolean) obj).booleanValue();
                return w620Var8;
            case 11:
                return new w620(obj2, yjeVar, (byte) 11);
            case 12:
                w620 w620Var9 = new w620(obj2, yjeVar, (byte) 12);
                w620Var9.j = ((Boolean) obj).booleanValue();
                return w620Var9;
            case 13:
                return new w620(obj2, yjeVar, (byte) 13);
            case 14:
                return new w620(obj2, yjeVar, (byte) 14);
            case 15:
                return new w620(obj2, yjeVar, (byte) 15);
            case 16:
                w620 w620Var10 = new w620(obj2, yjeVar, (byte) 16);
                w620Var10.j = ((Boolean) obj).booleanValue();
                return w620Var10;
            case 17:
                w620 w620Var11 = new w620(obj2, yjeVar, (byte) 17);
                w620Var11.j = ((Boolean) obj).booleanValue();
                return w620Var11;
            case 18:
                w620 w620Var12 = new w620(obj2, yjeVar, (byte) 18);
                w620Var12.j = ((Boolean) obj).booleanValue();
                return w620Var12;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                w620 w620Var13 = new w620(obj2, yjeVar, (byte) 19);
                w620Var13.j = ((Boolean) obj).booleanValue();
                return w620Var13;
            case 20:
                w620 w620Var14 = new w620(obj2, yjeVar, (byte) 20);
                w620Var14.j = ((Boolean) obj).booleanValue();
                return w620Var14;
            case 21:
                w620 w620Var15 = new w620(obj2, yjeVar, (byte) 21);
                w620Var15.j = ((Boolean) obj).booleanValue();
                return w620Var15;
            case 22:
                w620 w620Var16 = new w620(obj2, yjeVar, (byte) 22);
                w620Var16.j = ((Boolean) obj).booleanValue();
                return w620Var16;
            case 23:
                return new w620(obj2, yjeVar, (byte) 23);
            case 24:
                return new w620(obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new w620(obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new w620(obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new w620(obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new w620(obj2, yjeVar, (byte) 28);
            default:
                return new w620(obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((w620) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((w620) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((w620) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((w620) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((w620) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((w620) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((w620) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((w620) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((w620) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((w620) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((w620) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((w620) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((w620) create(bool13, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                return ((w620) create(bool14, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                Boolean bool15 = (Boolean) obj;
                bool15.booleanValue();
                return ((w620) create(bool15, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                Boolean bool16 = (Boolean) obj;
                bool16.booleanValue();
                return ((w620) create(bool16, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                Boolean bool17 = (Boolean) obj;
                bool17.booleanValue();
                return ((w620) create(bool17, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                Boolean bool18 = (Boolean) obj;
                bool18.booleanValue();
                return ((w620) create(bool18, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object objC;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        gmq eu4Var;
        byte b;
        byte b2;
        gmq gmqVarE;
        boolean z;
        gmq gmqVarE2;
        Object value13;
        Object objB;
        byte b3 = this.i;
        int i = 3;
        yje yjeVar = null;
        byte b4 = 1;
        byte b5 = 7;
        Object obj2 = this.k;
        switch (b3) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    xuz xuzVar = a720.x2;
                    ((a720) obj2).Y0().E();
                }
                return Unit.f46060a;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    List<Fragment> listP = ((i820) obj2).C().c.p();
                    listP.getClass();
                    for (Fragment fragment : listP) {
                        if (fragment instanceof km7) {
                            ((km7) fragment).l();
                        }
                    }
                }
                return Unit.f46060a;
            case 2:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = ((x920) obj2).A;
                eg5 eg5Var = new eg5(z4);
                p7m0Var.getClass();
                p7m0Var.o(null, eg5Var);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                kn20 kn20Var = (kn20) obj2;
                if (this.j) {
                    lbu lbuVar = kn20Var.c;
                    FinBetInfoModel finBetInfoModel = kn20Var.b;
                    sff0 sff0Var = kn20Var.g;
                    boolean zJ = lbuVar.j();
                    boolean z5 = !zJ && sff0Var.l.g;
                    List listZ = tx3.z(new y6q[]{new x6q(finBetInfoModel), z5 ? new w6q(finBetInfoModel) : null});
                    p7m0 p7m0Var2 = kn20Var.j;
                    ki20 ki20Var = new ki20(listZ, z5, !zJ && sff0Var.f32117a.f12063a.i, ((ArrayList) listZ).size() > 1);
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, ki20Var);
                } else {
                    p7m0 p7m0Var3 = kn20Var.j;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, li20.f20084a);
                }
                return Unit.f46060a;
            case 4:
                boolean z6 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                dy20 dy20Var = (dy20) obj2;
                if (z6) {
                    dy20Var.y(true);
                } else if (dy20Var.s.getValue() instanceof rx20) {
                    dy20Var.z();
                }
                return Unit.f46060a;
            case 5:
                boolean z7 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                uz20 uz20Var = (uz20) obj2;
                ocj ocjVar = uz20Var.i;
                if (z7) {
                    int i2 = uz20.R;
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var4.getValue();
                        value2.getClass();
                    } while (!p7m0Var4.m(value2, dz20.a((dz20) value2, null, null, null, null, null, null, true, null, null, null, false, 3967)));
                } else {
                    uz20Var.D.b("");
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value = p7m0Var5.getValue();
                        value.getClass();
                    } while (!p7m0Var5.m(value, dz20.a((dz20) value, null, null, null, null, null, null, false, "", null, null, false, 3711)));
                }
                return Unit.f46060a;
            case 6:
                boolean z8 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (z8) {
                    ((b630) obj2).y0();
                }
                return Unit.f46060a;
            case 7:
                boolean z9 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (z9) {
                    ((i630) obj2).y0();
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    yqc yqcVar = ((l830) obj2).y;
                    this.j = true;
                    Object objA = ((p530) yqcVar.b).f26386a.a(this);
                    if (objA != wneVar9) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar9) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (z11) {
                    if (z11) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ak30 ak30Var = ((zj30) obj2).f44467a;
                this.j = true;
                Object objA2 = ak30Var.a(this);
                return objA2 == wneVar10 ? wneVar10 : objA2;
            case 10:
                zk30 zk30Var = (zk30) obj2;
                p7m0 p7m0Var6 = zk30Var.n;
                boolean z12 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (z12 && ((nk30) p7m0Var6.getValue()).d.isEmpty()) {
                    zk30Var.w(false);
                } else if (!z12 && ((nk30) p7m0Var6.getValue()).d.isEmpty()) {
                    zk30Var.y();
                }
                do {
                    value3 = p7m0Var6.getValue();
                } while (!p7m0Var6.m(value3, nk30.a((nk30) value3, null, null, null, null, null, false, z12, false, 191)));
                return Unit.f46060a;
            case 11:
                ns30 ns30Var = (ns30) obj2;
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (z13) {
                    if (z13) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0VarA = ns30Var.h.a();
                jz6 jz6Var = new jz6(ns30Var, b5);
                this.j = true;
                qoj0VarA.c(jz6Var, this);
                return wneVar12;
            case 12:
                boolean z14 = this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                bd40 bd40Var = (bd40) obj2;
                int i3 = bd40.x;
                p7m0 p7m0Var7 = bd40Var.i.f25029a;
                do {
                    value4 = p7m0Var7.getValue();
                    value4.getClass();
                } while (!p7m0Var7.m(value4, yc40.a((yc40) value4, null, null, null, z14, 47)));
                if (z14) {
                    i3t0.K(bd40Var, null, null, new epp(bd40Var, null, (byte) 17), 3);
                }
                return Unit.f46060a;
            case 13:
                ql40 ql40Var = (ql40) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    x4u x4uVar = ql40Var.e;
                    String str = Build.MODEL;
                    str.getClass();
                    this.j = true;
                    objC = ((edu) ((n4u) x4uVar.f40284a).b).c(str, this);
                    if (objC == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                bhk bhkVar = (bhk) objC;
                String str2 = bhkVar.f2611a;
                String str3 = bhkVar.b;
                if (str2.length() > 0 && str3.length() > 0) {
                    tgk tgkVar = (tgk) ((rrc) ql40Var.f.f1155a).b;
                    tgkVar.getClass();
                    q7d0 q7d0Var = tgkVar.b;
                    q7d0Var.g("RETAIL_BRANDING_DEVICE", str2);
                    q7d0Var.g("MARKETING_NAME_DEVICE", str3);
                    tgkVar.c = new Pair(str2, str3);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    t33 t33Var = ((vl40) obj2).e;
                    Float f = new Float(0.0f);
                    this.j = true;
                    if (t33.a(t33Var, f, null, null, null, this, 14) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z17 = this.j;
                if (z17) {
                    if (z17) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                q99 q99Var = ((iu40) obj2).g;
                this.j = true;
                Object objJ = d5c.J(this, new j940((Object) q99Var, (yje) null, (byte) 23));
                return objJ == wneVar16 ? wneVar16 : objJ;
            case 16:
                ip50 ip50Var = (ip50) obj2;
                boolean z18 = this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                if (z18 || !((yo50) ip50Var.D()).e.isEmpty() || !((yo50) ip50Var.D()).d.isEmpty()) {
                    if (!((yo50) ip50Var.D()).e.isEmpty() || !((yo50) ip50Var.D()).d.isEmpty()) {
                        return Unit.f46060a;
                    }
                    ip50Var.O();
                    return Unit.f46060a;
                }
                p7m0 p7m0Var8 = ip50Var.i.f25029a;
                do {
                    value5 = p7m0Var8.getValue();
                    value5.getClass();
                    int i4 = ip50.G;
                } while (!p7m0Var8.m(value5, yo50.a((yo50) value5, false, 0, false, null, null, ip50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 62)));
                return Unit.f46060a;
            case 17:
                xp50 xp50Var = (xp50) obj2;
                boolean z19 = this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                if (z19 || !((np50) xp50Var.D()).c.isEmpty() || !((np50) xp50Var.D()).b.isEmpty()) {
                    if (!((np50) xp50Var.D()).c.isEmpty() || !((np50) xp50Var.D()).b.isEmpty()) {
                        return Unit.f46060a;
                    }
                    xp50Var.O();
                    return Unit.f46060a;
                }
                p7m0 p7m0Var9 = xp50Var.i.f25029a;
                do {
                    value6 = p7m0Var9.getValue();
                    value6.getClass();
                    int i5 = xp50.G;
                } while (!p7m0Var9.m(value6, np50.a((np50) value6, false, null, null, xp50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 14)));
                return Unit.f46060a;
            case 18:
                sq50 sq50Var = (sq50) obj2;
                oyg0 oyg0Var = sq50Var.f;
                ocj ocjVar2 = sq50Var.i;
                boolean z20 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (!z20 && ((iq50) sq50Var.D()).c.isEmpty() && ((iq50) sq50Var.D()).b.isEmpty()) {
                    p7m0 p7m0Var10 = ocjVar2.f25029a;
                    do {
                        value8 = p7m0Var10.getValue();
                        value8.getClass();
                        int i6 = sq50.B;
                    } while (!p7m0Var10.m(value8, iq50.a((iq50) value8, false, null, null, sq50Var.N(), 14)));
                    return Unit.f46060a;
                }
                if (!((iq50) sq50Var.D()).c.isEmpty() || !((iq50) sq50Var.D()).b.isEmpty()) {
                    return Unit.f46060a;
                }
                bby bbyVar = sq50Var.A;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var11 = ocjVar2.f25029a;
                    do {
                        value7 = p7m0Var11.getValue();
                        value7.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var11.m(value7, iq50.a((iq50) value7, true, null, null, null, 30)));
                    sq50Var.A = sac.g0(jiu0.a(sq50Var), sq50.class.getName().concat(".loadBanners"), sq50Var.w.b, new r750(1, sq50Var, sq50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), new oq50(sq50Var, null, (byte) 0), 80);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qr50 qr50Var = (qr50) obj2;
                oyg0 oyg0Var2 = qr50Var.f;
                ocj ocjVar3 = qr50Var.i;
                boolean z21 = this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                if (!z21 && ((gr50) qr50Var.D()).d.isEmpty() && ((gr50) qr50Var.D()).c.isEmpty()) {
                    p7m0 p7m0Var12 = ocjVar3.f25029a;
                    do {
                        value10 = p7m0Var12.getValue();
                        value10.getClass();
                        int i7 = qr50.F;
                    } while (!p7m0Var12.m(value10, gr50.a((gr50) value10, false, 0, null, null, qr50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 30)));
                    return Unit.f46060a;
                }
                if (!((gr50) qr50Var.D()).d.isEmpty() || !((gr50) qr50Var.D()).c.isEmpty()) {
                    return Unit.f46060a;
                }
                bby bbyVar2 = qr50Var.E;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    p7m0 p7m0Var13 = ocjVar3.f25029a;
                    do {
                        value9 = p7m0Var13.getValue();
                        value9.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var13.m(value9, gr50.a((gr50) value9, true, 0, null, null, null, 62)));
                    qr50Var.E = sac.g0(jiu0.a(qr50Var), qr50.class.getName().concat(".loadBanners"), qr50Var.t.b, new r750(1, qr50Var, qr50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), new mr50(qr50Var, null, (byte) 0), 80);
                }
                return Unit.f46060a;
            case 20:
                gt50 gt50Var = (gt50) obj2;
                boolean z22 = this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                if (z22 || !((ws50) gt50Var.D()).e.isEmpty() || !((ws50) gt50Var.D()).d.isEmpty()) {
                    if (!((ws50) gt50Var.D()).e.isEmpty() || !((ws50) gt50Var.D()).d.isEmpty()) {
                        return Unit.f46060a;
                    }
                    gt50Var.O();
                    return Unit.f46060a;
                }
                p7m0 p7m0Var14 = gt50Var.i.f25029a;
                do {
                    value11 = p7m0Var14.getValue();
                    value11.getClass();
                    int i8 = gt50.G;
                } while (!p7m0Var14.m(value11, ws50.a((ws50) value11, false, 0, null, null, null, gt50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 62)));
                return Unit.f46060a;
            case 21:
                ut50 ut50Var = (ut50) obj2;
                p7m0 p7m0Var15 = ut50Var.u;
                boolean z23 = this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                if (!z23 && !(p7m0Var15.getValue() instanceof lt50)) {
                    mt50 mt50Var = new mt50(sa10.b(ut50Var.n, pb10.g, R.string.data_retrieval_error, 0, null, 28), true);
                    p7m0Var15.getClass();
                    p7m0Var15.o(null, mt50Var);
                    return Unit.f46060a;
                }
                if (p7m0Var15.getValue() instanceof lt50) {
                    return Unit.f46060a;
                }
                bby bbyVar3 = ut50Var.s;
                if (bbyVar3 == null || !bbyVar3.isActive()) {
                    p7m0Var15.getClass();
                    p7m0Var15.o(null, nt50.f24079a);
                    ut50Var.s = sac.i0(jiu0.a(ut50Var), ut50.class.getName().concat(".loadBanners"), 5, 3L, kotlin.collections.a.c(oqt0.class), null, new e3p(ut50Var, null, (byte) 20), null, ut50Var.g.b, new b530((Object) ut50Var, (byte) 24), null, 592);
                }
                return Unit.f46060a;
            case 22:
                boolean z24 = this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                wu50 wu50Var = (wu50) obj2;
                wu50Var.L = z24;
                if (z24 && ((qu50) wu50Var.D()).f29332a.isEmpty()) {
                    wu50Var.O();
                } else if (z24 && Intrinsics.d(((qu50) wu50Var.D()).f29332a, kotlin.collections.a.c(kr5.B))) {
                    wu50Var.O();
                } else if (!z24 && ((qu50) wu50Var.D()).f29332a.isEmpty()) {
                    p7m0 p7m0Var16 = wu50Var.i.f25029a;
                    do {
                        value12 = p7m0Var16.getValue();
                        value12.getClass();
                    } while (!p7m0Var16.m(value12, qu50.a((qu50) value12, kotlin.collections.a.c(kr5.B), null, null, 0, false, 60)));
                    wu50Var.P(lb10.b);
                }
                return Unit.f46060a;
            case 23:
                uw50 uw50Var = (uw50) obj2;
                wne wneVar24 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    p7m0 p7m0Var17 = uw50Var.c;
                    this.j = true;
                    p7m0Var17.getClass();
                    p7m0Var17.o(null, tw50.f34632a);
                    if (Unit.f46060a == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                sac.V(jiu0.a(uw50Var), new b530((Object) uw50Var, (byte) 26), null, ((mne) uw50Var.e).b, new e3p(uw50Var, null, (byte) 22), 10);
                return Unit.f46060a;
            case 24:
                x060 x060Var = (x060) obj2;
                rpt rptVar = x060Var.y;
                wne wneVar25 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    sff0 sff0VarA = x060Var.s.a();
                    boolean z27 = sff0VarA.d.b;
                    hl1 hl1Var = sff0VarA.b;
                    f61 f61Var = hl1Var.f13233a;
                    a1t a1tVarB = x060Var.w.b();
                    a1t a1tVarA = x060Var.x.a();
                    gmq gmqVarE3 = rptVar.e(xvs.LIVE);
                    gmq gmqVarE4 = rptVar.e(xvs.LINE);
                    gmq gmqVarB = x060Var.F.b(false);
                    if (z27) {
                        eu4Var = new dnq(new u060(x060Var.z.p(false), (byte) 0), new oz0(i, yjeVar, (byte) 26), (byte) 1);
                        b = 12;
                    } else {
                        b = 12;
                        eu4Var = new eu4(iun.f15405a, b);
                    }
                    gmq dnqVar = (f61Var.b || f61Var.f8987a) ? new dnq(x060Var.A.i(x060Var.B.a(), x060Var.C.f25751a.a(), hl1Var.N), new oz0(3, yjeVar, (byte) 25), (byte) 1) : new eu4(iun.f15405a, b);
                    ont ontVar = x060Var.D;
                    boolean z28 = f61Var.b;
                    boolean z29 = f61Var.f8987a;
                    svu svuVar = ontVar.f25564a;
                    txy txyVar = txy.SPORT_LINE;
                    ewt ewtVarE = svuVar.e(4);
                    ewt ewtVarE2 = svuVar.e(0);
                    if (z27) {
                        b2 = 12;
                        gmqVarE = svuVar.e(2);
                    } else {
                        b2 = 12;
                        gmqVarE = new eu4(iun.f15405a, b2);
                    }
                    if (z28 || z29) {
                        z = true;
                        gmqVarE2 = svuVar.e(1);
                    } else {
                        gmqVarE2 = new eu4(iun.f15405a, b2);
                        z = true;
                    }
                    a1g a1gVarE0 = dub.e0(ewtVarE, ewtVarE2, gmqVarE, gmqVarE2, new cot(5, null, (byte) 0));
                    gmq[] gmqVarArr = new gmq[8];
                    gmqVarArr[0] = a1tVarB;
                    gmqVarArr[z ? 1 : 0] = a1tVarA;
                    gmqVarArr[2] = gmqVarE3;
                    gmqVarArr[3] = gmqVarE4;
                    gmqVarArr[4] = gmqVarB;
                    gmqVarArr[5] = eu4Var;
                    gmqVarArr[6] = dnqVar;
                    gmqVarArr[7] = a1gVarE0;
                    pxt pxtVar = new pxt(gmqVarArr, (byte) 3);
                    kb40 kb40Var = new kb40(x060Var, (byte) 18);
                    this.j = true;
                    if (pxtVar.c(kb40Var, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                y560 y560Var = (y560) obj2;
                wne wneVar26 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    int i9 = y560.w;
                    p7m0 p7m0Var18 = y560Var.i.f25029a;
                    do {
                        value13 = p7m0Var18.getValue();
                        value13.getClass();
                    } while (!p7m0Var18.m(value13, p560.a((p560) value13, true, null, null, 28)));
                    this.j = true;
                    if (qcc.O(1000L, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i10 = y560.w;
                y560Var.r.d(new x560(y560Var, b4));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    t33 t33Var2 = ((ve60) obj2).b;
                    Float f2 = new Float(0.0f);
                    this.j = true;
                    if (t33Var2.f(this, f2) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hl60 hl60Var = (hl60) obj2;
                wne wneVar28 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    this.j = true;
                    if (hl60Var.B(this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (hl60Var.m) {
                    hl60Var.A();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gl60 gl60Var = (gl60) obj2;
                wne wneVar29 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    ih5 ih5Var = gl60Var.y;
                    k7k k7kVar = k7k.NoMoneyGames;
                    j7k[] j7kVarArr = j7k.f16044a;
                    ih5Var.getClass();
                    ih5Var.f14765a.a("deposit_call", xp20.f(new Pair("screen", "popular_new_sport"), new Pair("element", "sport_onboarding")));
                    l7k l7kVar = gl60Var.x;
                    y1p y1pVar = y1p.MAIN;
                    c1p[] c1pVarArr = c1p.f3584a;
                    l7kVar.getClass();
                    l7kVar.f19563a.a(tx3.l0(new k1p[]{new j1p("popular_new_sport", (byte) 0), new j1p("sport_onboarding", (byte) 1)}), 3043L);
                    ahu ahuVar = gl60Var.r;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                gl60Var.u.d(new qi4((Object) gl60Var, ((ql5) objB).f28916a, (byte) 11));
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z34 = this.j;
                if (!z34) {
                    z1x.P(obj);
                    fq fqVar = ((yn60) obj2).b;
                    this.j = true;
                    if (fqVar.f(yy5.f43451a, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z34) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w620(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
