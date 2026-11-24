package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.virtualrecommended.VirtualRecommendedEventsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class k6s0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6s0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new k6s0((n6s0) obj2, yjeVar, (byte) 0);
            case 1:
                return new k6s0((l7s0) obj2, yjeVar, (byte) 1);
            case 2:
                return new k6s0((vfs0) obj2, yjeVar, (byte) 2);
            case 3:
                k6s0 k6s0Var = new k6s0((nps0) obj2, yjeVar, (byte) 3);
                k6s0Var.j = ((Boolean) obj).booleanValue();
                return k6s0Var;
            case 4:
                return new k6s0((jrs0) obj2, yjeVar, (byte) 4);
            case 5:
                return new k6s0((krs0) obj2, yjeVar, (byte) 5);
            case 6:
                k6s0 k6s0Var2 = new k6s0((tts0) obj2, yjeVar, (byte) 6);
                k6s0Var2.j = ((Boolean) obj).booleanValue();
                return k6s0Var2;
            case 7:
                k6s0 k6s0Var3 = new k6s0((Context) obj2, yjeVar, (byte) 7);
                k6s0Var3.j = ((Boolean) obj).booleanValue();
                return k6s0Var3;
            case 8:
                k6s0 k6s0Var4 = new k6s0((dat0) obj2, yjeVar, (byte) 8);
                k6s0Var4.j = ((Boolean) obj).booleanValue();
                return k6s0Var4;
            case 9:
                k6s0 k6s0Var5 = new k6s0((yat0) obj2, yjeVar, (byte) 9);
                k6s0Var5.j = ((Boolean) obj).booleanValue();
                return k6s0Var5;
            case 10:
                k6s0 k6s0Var6 = new k6s0((wbt0) obj2, yjeVar, (byte) 10);
                k6s0Var6.j = ((Boolean) obj).booleanValue();
                return k6s0Var6;
            case 11:
                k6s0 k6s0Var7 = new k6s0((jdt0) obj2, yjeVar, (byte) 11);
                k6s0Var7.j = ((Boolean) obj).booleanValue();
                return k6s0Var7;
            case 12:
                return new k6s0((List) obj2, yjeVar, (byte) 12);
            case 13:
                return new k6s0((daf) obj2, yjeVar, (byte) 13);
            case 14:
                return new k6s0((tzt0) obj2, yjeVar, (byte) 14);
            case 15:
                return new k6s0((g7u0) obj2, yjeVar, (byte) 15);
            case 16:
                return new k6s0((i9u0) obj2, yjeVar, (byte) 16);
            case 17:
                return new k6s0((q9u0) obj2, yjeVar, (byte) 17);
            case 18:
                k6s0 k6s0Var8 = new k6s0((jru0) obj2, yjeVar, (byte) 18);
                k6s0Var8.j = ((Boolean) obj).booleanValue();
                return k6s0Var8;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new k6s0((esu0) obj2, yjeVar, (byte) 19);
            case 20:
                k6s0 k6s0Var9 = new k6s0((ztu0) obj2, yjeVar, (byte) 20);
                k6s0Var9.j = ((Boolean) obj).booleanValue();
                return k6s0Var9;
            case 21:
                return new k6s0((hng) obj2, yjeVar, (byte) 21);
            case 22:
                k6s0 k6s0Var10 = new k6s0((u0v0) obj2, yjeVar, (byte) 22);
                k6s0Var10.j = ((Boolean) obj).booleanValue();
                return k6s0Var10;
            case 23:
                k6s0 k6s0Var11 = new k6s0((d7v0) obj2, yjeVar, (byte) 23);
                k6s0Var11.j = ((Boolean) obj).booleanValue();
                return k6s0Var11;
            case 24:
                k6s0 k6s0Var12 = new k6s0((c8v0) obj2, yjeVar, (byte) 24);
                k6s0Var12.j = ((Boolean) obj).booleanValue();
                return k6s0Var12;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new k6s0((kfv0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new k6s0((mgv0) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                k6s0 k6s0Var13 = new k6s0((emv0) obj2, yjeVar, (byte) 27);
                k6s0Var13.j = ((Boolean) obj).booleanValue();
                return k6s0Var13;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new k6s0((etv0) obj2, yjeVar, (byte) 28);
            default:
                return new k6s0((bby) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((k6s0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((k6s0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((k6s0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((k6s0) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((k6s0) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((k6s0) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((k6s0) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((k6s0) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((k6s0) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((k6s0) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((k6s0) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((k6s0) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((k6s0) create(bool13, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k6s0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        Object objU;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        List list;
        Object value5;
        Object objB;
        Object objA;
        Object objA2;
        Object value6;
        Object objV;
        Object value7;
        Object objV2;
        Object value8;
        Object objA3;
        Object value9;
        Unit unit;
        Object value10;
        Object objK;
        Object value11;
        Object value12;
        Object objK2;
        Object value13;
        byte b = 26;
        byte b2 = 14;
        byte b3 = 2;
        int i = 10;
        byte b4 = 3;
        boolean z = false;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (this.i) {
            case 0:
                n6s0 n6s0Var = (n6s0) this.k;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    o7s0 o7s0VarA = n6s0Var.x.a(((e6s0) n6s0Var.D()).f7303a);
                    mmq0 mmq0Var = new mmq0(n6s0Var, (byte) 29);
                    this.j = true;
                    if (o7s0VarA.c(mmq0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                l7s0 l7s0Var = (l7s0) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    o7s0 o7s0VarA2 = l7s0Var.w.a(((e7s0) l7s0Var.D()).b);
                    x6s0 x6s0Var = new x6s0(l7s0Var, (byte) 1);
                    this.j = true;
                    if (o7s0VarA2.c(x6s0Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                vfs0 vfs0Var = (vfs0) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    abu abuVar = vfs0Var.b;
                    long j = vfs0Var.h;
                    String str = vfs0Var.i;
                    this.j = true;
                    objU = abuVar.u(j, this, str);
                    if (objU == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objU = obj;
                }
                List list2 = (List) objU;
                if (list2.isEmpty()) {
                    sa10.b(vfs0Var.e, pb10.f, R.string.transaction_not_found, 0, null, 28);
                } else {
                    boolean zH = vfs0Var.g.h();
                    p7m0 p7m0Var = vfs0Var.l;
                    ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        l7w l7wVar = (l7w) it.next();
                        double d = vfs0Var.j;
                        l7wVar.getClass();
                        long j2 = l7wVar.f19580a;
                        double d2 = l7wVar.b;
                        Iterator it2 = it;
                        double d3 = l7wVar.c;
                        int iIndexOf = list2.indexOf(l7wVar);
                        ArrayList arrayList2 = new ArrayList();
                        Throwable th2 = th;
                        int i2 = 0;
                        for (Object obj2 : list2) {
                            List list3 = list2;
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw th2;
                            }
                            if (i2 <= iIndexOf) {
                                arrayList2.add(obj2);
                            }
                            list2 = list3;
                            i2 = i3;
                        }
                        List list4 = list2;
                        Iterator it3 = arrayList2.iterator();
                        double d4 = 0.0d;
                        while (it3.hasNext()) {
                            d4 += ((l7w) it3.next()).b;
                            d3 = d3;
                        }
                        arrayList.add(new m7w(j2, d2, d3, d - d4, zH));
                        it = it2;
                        th = th2;
                        list2 = list4;
                    }
                    rfs0 rfs0Var = new rfs0(arrayList, zH);
                    p7m0Var.getClass();
                    p7m0Var.o(th, rfs0Var);
                }
                return Unit.f46060a;
            case 3:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                nps0 nps0Var = (nps0) this.k;
                iiy[] iiyVarArr = nps0.O1;
                dqs0 dqs0Var = nps0Var.G0().c.f46443a;
                if (dqs0Var != null) {
                    dqs0Var.b(z5);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    jrs0 jrs0Var = (jrs0) this.k;
                    this.j = true;
                    if (jrs0Var.l(this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    krs0 krs0Var = (krs0) this.k;
                    this.j = true;
                    if (krs0Var.i(this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                boolean z8 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                tts0 tts0Var = (tts0) this.k;
                if (z8) {
                    int i4 = tts0.w;
                    tts0Var.M();
                } else {
                    int i5 = tts0.w;
                    p7m0 p7m0Var2 = tts0Var.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, fts0.a((fts0) value, null, 0L, true, null, 247)));
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                boolean z9 = this.j;
                Context context = (Context) this.k;
                String str2 = vg80.f37370a;
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                vg80.a(packageManager, new ComponentName(context, (Class<?>) RescheduleReceiver.class), z9, tg80.f33897a);
                return Unit.f46060a;
            case 8:
                boolean z10 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                dat0 dat0Var = (dat0) this.k;
                int i6 = dat0.y;
                bby bbyVar = dat0Var.w;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                dat0Var.w = i3t0.K(dat0Var, null, new lcr0(dat0Var, b), new jtr0((Object) dat0Var, (yje) (objArr == true ? 1 : 0), (byte) 1), 1);
                p7m0 p7m0Var3 = dat0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, aat0.a((aat0) value2, z10, null, 2)));
                return Unit.f46060a;
            case 9:
                boolean z11 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                yat0 yat0Var = (yat0) this.k;
                int i7 = yat0.w;
                p7m0 p7m0Var4 = yat0Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                } while (!p7m0Var4.m(value3, new wat0(((wat0) value3).b, z11)));
                bby bbyVar2 = yat0Var.u;
                if (bbyVar2 != null) {
                    e3c.n(bbyVar2);
                }
                yat0Var.u = i3t0.K(yat0Var, null, null, new jtr0((Object) yat0Var, (yje) (objArr2 == true ? 1 : 0), b3), 3);
                return Unit.f46060a;
            case 10:
                wbt0 wbt0Var = (wbt0) this.k;
                boolean z12 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (z12) {
                    int i8 = wbt0.E;
                    bby bbyVar3 = wbt0Var.B;
                    if (bbyVar3 != null) {
                        e3c.n(bbyVar3);
                    }
                    j0g0 j0g0Var = ((ubt0) wbt0Var.D()).c;
                    if (j0g0Var != null) {
                        Object obj3 = j0g0Var.f15681a;
                        if (obj3 instanceof g0g0) {
                            obj3 = null;
                        }
                        list = (List) obj3;
                    } else {
                        list = null;
                    }
                    if (list == null || list.isEmpty()) {
                        wbt0Var.B = i3t0.K(wbt0Var, null, null, new jtr0((Object) wbt0Var, (yje) (objArr3 == true ? 1 : 0), b4), 3);
                    }
                    bby bbyVar4 = wbt0Var.C;
                    if (bbyVar4 != null) {
                        e3c.n(bbyVar4);
                    }
                    wbt0Var.C = i3t0.K(wbt0Var, null, null, new bu(wbt0Var, objArr4 == true ? 1 : 0, (byte) 25), 3);
                }
                int i9 = wbt0.E;
                p7m0 p7m0Var5 = wbt0Var.i.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                } while (!p7m0Var5.m(value4, ubt0.a((ubt0) value4, z12, null, null, null, 126)));
                return Unit.f46060a;
            case 11:
                boolean z13 = this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                jdt0 jdt0Var = (jdt0) this.k;
                int i10 = jdt0.N;
                p7m0 p7m0Var6 = jdt0Var.i.f25029a;
                do {
                    value5 = p7m0Var6.getValue();
                    value5.getClass();
                } while (!p7m0Var6.m(value5, cdt0.a((cdt0) value5, z13, null, 0, null, null, 4094)));
                e3c.n(jdt0Var.K);
                jdt0Var.K = i3t0.K(jdt0Var, null, null, new bu(jdt0Var, objArr5 == true ? 1 : 0, b), 3);
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (z14) {
                    if (z14) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                List list5 = (List) this.k;
                ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ro4.c0(((hzj) it4.next()).c()));
                }
                gd00 gd00Var = new gd00(new ArrayList(arrayList3), false, bnk.a());
                this.j = true;
                Object objZ = s0x.z(gd00Var, this);
                return objZ == wneVar13 ? wneVar13 : objZ;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    ahu ahuVar = (ahu) ((daf) this.k).k;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                return new Long(((ql5) objB).f28916a);
            case 14:
                tzt0 tzt0Var = (tzt0) this.k;
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    h3c h3cVar = tzt0Var.q;
                    this.j = true;
                    objA = h3cVar.a(40L, 27L, this);
                    if (objA == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                tzt0Var.p.c().d(new xis0(tzt0Var, (String) objA, b2));
                return Unit.f46060a;
            case 15:
                g7u0 g7u0Var = (g7u0) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    xsu xsuVar = g7u0Var.d;
                    int i11 = g7u0Var.b;
                    this.j = true;
                    objA2 = ((ggm0) xsuVar.f41434a).a(i11, this);
                    if (objA2 == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                Iterable<wwl0> iterable = (Iterable) objA2;
                ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                for (wwl0 wwl0Var : iterable) {
                    ctf0 ctf0Var = g7u0Var.c;
                    wwl0Var.getClass();
                    String str3 = wwl0Var.c;
                    ctf0Var.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    String str4 = wwl0Var.e;
                    String str5 = wwl0Var.d;
                    if (str3.length() > 0) {
                        arrayList5.add(ctf0Var.f(R.string.stadium_capacity_title_v2, str3));
                    }
                    if (str5.length() > 0) {
                        arrayList5.add(ctf0Var.f(R.string.stadium_open_title_v2, str5));
                    }
                    if (str4.length() > 0) {
                        arrayList5.add(ctf0Var.f(R.string.stadium_architector_title_v2, str4));
                    }
                    arrayList4.add(new r6u0(wwl0Var.f39890a, wwl0Var.b, arrayList5));
                }
                p7m0 p7m0Var7 = g7u0Var.j;
                do {
                    value6 = p7m0Var7.getValue();
                } while (!p7m0Var7.m(value6, u6u0.a((u6u0) value6, arrayList4, false, false, 2)));
                return Unit.f46060a;
            case 16:
                i9u0 i9u0Var = (i9u0) this.k;
                wne wneVar17 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    u8u u8uVar = i9u0Var.c;
                    this.j = true;
                    objV = u8uVar.v(this);
                    if (objV == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                Iterable<c8u0> iterable2 = (Iterable) objV;
                ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, 10));
                for (c8u0 c8u0Var : iterable2) {
                    c8u0Var.getClass();
                    String str6 = c8u0Var.d;
                    arrayList6.add(new g8u0(c8u0Var.f3933a, c8u0Var.b, c8u0Var.c, str6, StringsKt.O(str6, "/glyph/", false) || str6.length() == 0, c8u0Var.e, c8u0Var.f));
                }
                boolean zIsEmpty = arrayList6.isEmpty();
                p7m0 p7m0Var8 = i9u0Var.g;
                if (zIsEmpty) {
                    g9u0 g9u0Var = new g9u0(i9u0Var.i);
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, g9u0Var);
                } else {
                    f9u0 f9u0Var = new f9u0(arrayList6);
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, f9u0Var);
                }
                return Unit.f46060a;
            case 17:
                q9u0 q9u0Var = (q9u0) this.k;
                ocj ocjVar = q9u0Var.i;
                wne wneVar18 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    int i12 = q9u0.v;
                    p7m0 p7m0Var9 = ocjVar.f25029a;
                    do {
                        value7 = p7m0Var9.getValue();
                        value7.getClass();
                    } while (!p7m0Var9.m(value7, n9u0.a((n9u0) value7, null, o8u0.f24851a, 5)));
                    u8u u8uVar2 = q9u0Var.p;
                    this.j = true;
                    objV2 = u8uVar2.v(this);
                    if (objV2 == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV2 = obj;
                }
                List list6 = (List) objV2;
                int i13 = q9u0.v;
                p7m0 p7m0Var10 = ocjVar.f25029a;
                do {
                    value8 = p7m0Var10.getValue();
                    value8.getClass();
                } while (!p7m0Var10.m(value8, n9u0.a((n9u0) value8, list6, o8u0.b, 4)));
                return Unit.f46060a;
            case 18:
                jru0 jru0Var = (jru0) this.k;
                boolean z20 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (z20) {
                    int i14 = jru0.y;
                    bby bbyVar5 = jru0Var.x;
                    if (bbyVar5 == null || !bbyVar5.isActive()) {
                        jru0Var.x = sac.V(jiu0.a(jru0Var), null, null, jru0Var.p.b, new iru0(jru0Var, null), 11);
                    }
                }
                int i15 = jru0.y;
                p7m0 p7m0Var11 = jru0Var.i.f25029a;
                while (true) {
                    Object value14 = p7m0Var11.getValue();
                    value14.getClass();
                    boolean z21 = z20;
                    if (p7m0Var11.m(value14, fru0.a((fru0) value14, null, null, false, z20, 7))) {
                        return Unit.f46060a;
                    }
                    z20 = z21;
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                esu0 esu0Var = (esu0) this.k;
                VirtualRecommendedEventsParams virtualRecommendedEventsParams = esu0Var.b;
                wne wneVar20 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    r2u r2uVar = esu0Var.e;
                    List list7 = virtualRecommendedEventsParams.f46575a;
                    this.j = true;
                    objA3 = r2uVar.a(list7, this);
                    if (objA3 == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                List list8 = (List) objA3;
                if (list8.isEmpty()) {
                    esu0Var.w();
                } else {
                    p7m0 p7m0Var12 = esu0Var.k;
                    while (true) {
                        Object value15 = p7m0Var12.getValue();
                        List list9 = virtualRecommendedEventsParams.f46575a;
                        boolean z23 = esu0Var.j;
                        list9.getClass();
                        int iA = wp20.a(r3d.q(list8, i));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (Object obj4 : list8) {
                            linkedHashMap.put(Long.valueOf(((ypl0) obj4).f43037a), obj4);
                        }
                        ArrayList<ypl0> arrayList7 = new ArrayList();
                        Iterator it5 = list9.iterator();
                        while (it5.hasNext()) {
                            ypl0 ypl0Var = (ypl0) linkedHashMap.get(Long.valueOf(((Number) it5.next()).longValue()));
                            if (ypl0Var != null) {
                                arrayList7.add(ypl0Var);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, i));
                        for (ypl0 ypl0Var2 : arrayList7) {
                            ypl0Var2.getClass();
                            String str7 = z23 ? "Tablet" : "";
                            long j3 = ypl0Var2.f43037a;
                            String str8 = ypl0Var2.b;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            esu0 esu0Var2 = esu0Var;
                            VirtualRecommendedEventsParams virtualRecommendedEventsParams2 = virtualRecommendedEventsParams;
                            String str9 = "static/img/ImgDefault/Esports/virtualRecommendedGame/" + ypl0Var2.f43037a + str7 + ".png";
                            if (str9.length() == 0) {
                                sb.setLength(0);
                            } else {
                                int i16 = 0;
                                if (StringsKt.O(str9, ujn.h, false)) {
                                    sb.setLength(i16);
                                    sb.append(str9);
                                } else if (kotlin.text.c.x(str9, "https://", false)) {
                                    i16 = 0;
                                    sb.setLength(i16);
                                    sb.append(str9);
                                } else {
                                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str9, '/'));
                                }
                            }
                            arrayList8.add(new pnu0(z23 ? R.drawable.cybergames_tablet_champ_placeholder : R.drawable.cybergames_champ_placeholder, j3, sb.toString(), str8));
                            esu0Var = esu0Var2;
                            virtualRecommendedEventsParams = virtualRecommendedEventsParams2;
                        }
                        esu0 esu0Var3 = esu0Var;
                        VirtualRecommendedEventsParams virtualRecommendedEventsParams3 = virtualRecommendedEventsParams;
                        if (!p7m0Var12.m(value15, new lch(arrayList8))) {
                            esu0Var = esu0Var3;
                            virtualRecommendedEventsParams = virtualRecommendedEventsParams3;
                            i = 10;
                        }
                    }
                }
                return Unit.f46060a;
            case 20:
                boolean z24 = this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                ztu0 ztu0Var = (ztu0) this.k;
                int i17 = ztu0.w;
                p7m0 p7m0Var13 = ztu0Var.i.f25029a;
                do {
                    value9 = p7m0Var13.getValue();
                    value9.getClass();
                } while (!p7m0Var13.m(value9, wtu0.a((wtu0) value9, z24, 0L, null, 14)));
                if (z24) {
                    e3c.n(ztu0Var.u);
                    ztu0Var.u = i3t0.K(ztu0Var, null, null, new jtr0((Object) ztu0Var, (yje) (objArr6 == true ? 1 : 0), (byte) 9), 3);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(1000L, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                hng hngVar = (hng) this.k;
                synchronized (hngVar.e) {
                    if (hngVar.b || hngVar.f13350a != 0) {
                        unit = Unit.f46060a;
                    } else {
                        hngVar.f = null;
                        hngVar.b = true;
                        ((mc) ((hng) this.k).d).invoke();
                        unit = Unit.f46060a;
                    }
                }
                return unit;
            case 22:
                boolean z26 = this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                ((u0v0) this.k).x(new dzu0(z26));
                return Unit.f46060a;
            case 23:
                boolean z27 = this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                d7v0 d7v0Var = (d7v0) this.k;
                if (d7v0Var.p) {
                    return Unit.f46060a;
                }
                if (!z27) {
                    d7v0Var.y(new t6v0(sa10.b(d7v0Var.j, pb10.g, R.string.data_retrieval_error, 0, null, 28)));
                } else if (z27) {
                    d7v0Var.w();
                }
                return Unit.f46060a;
            case 24:
                boolean z28 = this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                c8v0 c8v0Var = (c8v0) this.k;
                int i18 = c8v0.v;
                p7m0 p7m0Var14 = c8v0Var.i.f25029a;
                do {
                    value10 = p7m0Var14.getValue();
                    value10.getClass();
                } while (!p7m0Var14.m(value10, new z7v0(((z7v0) value10).f43939a, z28)));
                if (z28) {
                    bby bbyVar6 = c8v0Var.u;
                    if (bbyVar6 != null) {
                        bbyVar6.cancel(null);
                    }
                    c8v0Var.u = i3t0.K(c8v0Var, null, null, new jtr0((Object) c8v0Var, (yje) (objArr7 == true ? 1 : 0), (byte) 11), 3);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                kfv0 kfv0Var = (kfv0) this.k;
                wne wneVar26 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    lbu lbuVar = kfv0Var.q;
                    this.j = true;
                    objK = lbu.k(lbuVar, 0, this, 3);
                    if (objK == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                List<pbv> list10 = (List) objK;
                for (pbv pbvVar : list10) {
                    if (pbvVar.l && !pbvVar.p) {
                        ArrayList arrayListM0 = CollectionsKt.m0(list10, pbvVar);
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj5 : arrayListM0) {
                            if (((pbv) obj5).l) {
                                arrayList9.add(obj5);
                            }
                        }
                        List listD0 = CollectionsKt.D0(arrayList9, 20);
                        int i19 = kfv0.t;
                        p7m0 p7m0Var15 = kfv0Var.i.f25029a;
                        do {
                            value11 = p7m0Var15.getValue();
                            value11.getClass();
                            listD0.getClass();
                        } while (!p7m0Var15.m(value11, new hfv0(pbvVar, listD0)));
                        return Unit.f46060a;
                    }
                }
                v4i0.o("Collection contains no element matching the predicate.");
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                mgv0 mgv0Var = (mgv0) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    int i20 = mgv0.w;
                    p7m0 p7m0Var16 = mgv0Var.i.f25029a;
                    do {
                        value12 = p7m0Var16.getValue();
                        value12.getClass();
                    } while (!p7m0Var16.m(value12, dgv0.a((dgv0) value12, true, null, false, null, 14)));
                    lbu lbuVar2 = mgv0Var.q;
                    this.j = true;
                    objK2 = lbu.k(lbuVar2, 0, this, 3);
                    if (objK2 == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK2 = obj;
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : (Iterable) objK2) {
                    if (((pbv) obj6).l) {
                        arrayList10.add(obj6);
                    }
                }
                p7m0 p7m0Var17 = mgv0Var.u;
                do {
                    value13 = p7m0Var17.getValue();
                } while (!p7m0Var17.m(value13, arrayList10));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                emv0 emv0Var = (emv0) this.k;
                boolean z31 = this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                Object[] objArr8 = !z31 && ((vlv0) emv0Var.D()).e;
                if (z31 && (((vlv0) emv0Var.D()).f || ((vlv0) emv0Var.D()).g)) {
                    z = true;
                }
                if (objArr8 != false || z) {
                    int i21 = emv0.A;
                    emv0Var.M();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                etv0 etv0Var = (etv0) this.k;
                wne wneVar29 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new jmv0(etv0Var, (byte) 6));
                    owu0 owu0Var = new owu0(etv0Var, b2);
                    this.j = true;
                    if (vsg0VarV.c(owu0Var, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    bby bbyVar7 = (bby) this.k;
                    this.j = true;
                    if (bbyVar7.join(this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
