package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class suv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vuv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ suv(vuv vuvVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vuvVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vuv vuvVar = this.k;
        switch (b) {
            case 0:
                suv suvVar = new suv(vuvVar, yjeVar, (byte) 0);
                suvVar.j = obj;
                return suvVar;
            case 1:
                suv suvVar2 = new suv(vuvVar, yjeVar, (byte) 1);
                suvVar2.j = obj;
                return suvVar2;
            default:
                suv suvVar3 = new suv(vuvVar, yjeVar, (byte) 2);
                suvVar3.j = obj;
                return suvVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((suv) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((suv) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((suv) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        bby bbyVar;
        Object value3;
        lgp0 lgp0Var;
        Iterator it;
        int i;
        ztv ztvVar;
        double d;
        Object value4;
        byte b = this.i;
        int i2 = 0;
        Object[] objArr = 0;
        vuv vuvVar = this.k;
        boolean z = true;
        switch (b) {
            case 0:
                yje yjeVar = null;
                vuv vuvVar2 = this.k;
                ocj ocjVar = vuvVar2.i;
                mne mneVar = vuvVar2.r;
                hdm0 hdm0Var = (hdm0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z2 = hdm0Var instanceof gdm0;
                if (z2 && !(((gdm0) hdm0Var).b.a() instanceof znm0)) {
                    sac.f0(jiu0.a(vuvVar2), 30L, TimeUnit.SECONDS, mneVar.b, null, new quv(vuvVar2, yjeVar, (byte) 1), 40);
                }
                if (z2) {
                    zdm0 zdm0VarX = aem0.x(hdm0Var, vuvVar2.w.a(), vuvVar2.q);
                    odm0 odm0Var = ((gdm0) hdm0Var).b;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                    } while (!p7m0Var.m(value2, guv.a((guv) value2, odm0Var.a() instanceof znm0, false, null, zdm0VarX, null, 46)));
                    if (odm0Var instanceof mdm0) {
                        mdm0 mdm0Var = (mdm0) odm0Var;
                        String str = mdm0Var.c.f37345a;
                        boolean z3 = mdm0Var.g instanceof znm0;
                        bby bbyVar2 = vuvVar2.D;
                        if (!z3) {
                            if (bbyVar2 != null) {
                                bbyVar2.cancel(null);
                            }
                            if (((auv) vuvVar2.z.f40761a.b).f1497a.d().isEmpty() && ((bbyVar = vuvVar2.D) == null || !bbyVar.isActive())) {
                                vuvVar2.D = sac.V(jiu0.a(vuvVar2), new vft(1, vuvVar2, vuv.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, mneVar.f22085a, new puv(vuvVar2, str, null, (byte) 1), 10);
                            }
                        } else if (bbyVar2 == null || !bbyVar2.isActive()) {
                            vuvVar2.D = sac.Z(jiu0.a(vuvVar2), ibc.w0(90L, bfn.SECONDS), mneVar.b, new vft(1, vuvVar2, vuv.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), new puv(vuvVar2, str, null, objArr == true ? 1 : 0));
                        }
                    }
                }
                if (hdm0Var instanceof fdm0) {
                    int i3 = vuv.E;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, guv.a((guv) value, false, true, null, null, null, 57)));
                }
                return Unit.f46060a;
            case 1:
                List list = (List) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i4 = 10;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    mep0 mep0Var = (mep0) next;
                    if (i2 != 0) {
                        lgp0Var = i2 != z ? null : lgp0.b;
                    } else {
                        lgp0Var = lgp0.f20019a;
                    }
                    if (lgp0Var != null) {
                        mep0Var.getClass();
                        String str2 = mep0Var.f21659a;
                        ArrayList arrayList2 = mep0Var.f;
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, i4));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            y3a0 y3a0Var = (y3a0) it3.next();
                            y3a0Var.getClass();
                            String str3 = y3a0Var.b;
                            String str4 = y3a0Var.f41942a;
                            int i6 = y3a0Var.c;
                            int i7 = y3a0Var.d;
                            String str5 = y3a0Var.e;
                            bre breVar = y3a0Var.f;
                            String str6 = y3a0Var.g;
                            Iterator it4 = it2;
                            List list2 = y3a0Var.h;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                noa0 noa0Var = (noa0) it5.next();
                                noa0Var.getClass();
                                Iterator it6 = it3;
                                int i8 = i5;
                                double d2 = noa0Var.b;
                                double d3 = noa0Var.f23859a;
                                Iterator it7 = it5;
                                int iOrdinal = lgp0Var.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        d = (100.0d - d3) / 100.0d;
                                    } else {
                                        jf4.n("undefined team");
                                    }
                                    return null;
                                }
                                d = d3 / 100.0d;
                                d2 = 100.0d - d2;
                                double d4 = d2 / 100.0d;
                                if (0.0d > d || d > 1.0d) {
                                    jf4.o("Value should be within a range 0.0 to 1.0");
                                } else if (0.0d > d4 || d4 > 1.0d) {
                                    jf4.o("Value should be within a range 0.0 to 1.0");
                                } else {
                                    arrayList4.add(new abj((float) d, (float) d4));
                                    i5 = i8;
                                    it5 = it7;
                                    it3 = it6;
                                }
                                return null;
                            }
                            Iterator it8 = it3;
                            int i9 = i5;
                            int i10 = y3a0Var.d;
                            arrayList3.add(new z3a0(str4, str3, i6, i7, str5, breVar, str6, arrayList4, true, i10 != 0 ? dw9.m(i10, ". ", str3) : str3));
                            i5 = i9;
                            it2 = it4;
                            it3 = it8;
                        }
                        it = it2;
                        i = i5;
                        i4 i4VarR0 = dyb.r0(arrayList3);
                        ztvVar = new ztv(new nep0(oep0.f25136a[lgp0Var.ordinal()] == 1 ? R.drawable.ic_arrow_team_right_direction : R.drawable.ic_arrow_team_left_direction, i4VarR0, str2), lgp0Var, vuv.M(i4VarR0));
                    } else {
                        it = it2;
                        i = i5;
                        ztvVar = null;
                    }
                    arrayList.add(ztvVar);
                    i2 = i;
                    it2 = it;
                    z = true;
                    i4 = 10;
                }
                ArrayList arrayListS = CollectionsKt.S(arrayList);
                int i11 = vuv.E;
                p7m0 p7m0Var3 = vuvVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, guv.a((guv) value3, false, false, arrayListS, null, null, 49)));
                return Unit.f46060a;
            default:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = vuvVar.x.s(vuvVar.o, vuvVar.p, uaq0Var, 0L);
                p7m0 p7m0Var4 = vuvVar.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, guv.a((guv) value4, false, false, null, null, nc5VarS, 31)));
                return Unit.f46060a;
        }
    }
}
