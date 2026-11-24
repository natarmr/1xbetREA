package a;

import android.gov.nist.core.Separators;
import android.javax.sip.header.WarningHeader;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class epp extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ epp(Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
    }

    private final Object l(Object obj) throws Throwable {
        Object value;
        Object objG;
        Object value2;
        xja0 xja0Var = (xja0) this.k;
        String str = xja0Var.o;
        boolean z = xja0Var.p;
        vzg0 vzg0Var = xja0Var.q;
        oyg0 oyg0Var = xja0Var.f;
        ocj ocjVar = xja0Var.i;
        wne wneVar = wne.f39444a;
        boolean z2 = this.j;
        if (!z2) {
            z1x.P(obj);
            if (!z) {
                ((bca0) ((w5z) xja0Var.s.b).c).f2347a = null;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, rja0.a((rja0) value, null, false, 0, false, true, false, false, null, false, WarningHeader.MISCELLANEOUS_WARNING)));
            n4u n4uVar = xja0Var.r;
            this.j = true;
            objG = ((w5z) n4uVar.b).G(str, this);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objG = obj;
        }
        cca0 cca0Var = (cca0) objG;
        boolean z3 = !z;
        if (!z) {
            ufp0 ufp0Var = (ufp0) CollectionsKt.W(((rja0) xja0Var.D()).c, cca0Var.b);
            str = ufp0Var != null ? ufp0Var.f35586a : null;
            if (str == null) {
                str = "";
            }
        }
        vzg0Var.e("KEY_IS_SINGLE_PLAYER", Boolean.valueOf(z));
        vzg0Var.e("KEY_IS_PAIR", Boolean.valueOf(z3));
        vzg0Var.e("KEY_SINGLE_PLAYER_ID", str);
        if (cca0Var.b.isEmpty()) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, rja0.a((rja0) value2, null, false, 0, false, false, false, true, null, false, WarningHeader.MISCELLANEOUS_WARNING)));
        } else {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            while (true) {
                Object value3 = p7m0Var3.getValue();
                value3.getClass();
                String str2 = str;
                if (p7m0Var3.m(value3, rja0.a((rja0) value3, cca0Var, z3, 0, !z3, false, false, false, str2, false, 260))) {
                    break;
                }
                str = str2;
            }
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) throws Throwable {
        Object value;
        cma0 cma0Var = (cma0) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            bwl bwlVar = cma0Var.q;
            String str = cma0Var.o;
            this.j = true;
            Object objB = ((gxu) bwlVar.f3330a).b(str, this);
            if (objB != wneVar) {
                objB = Unit.f46060a;
            }
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        lla0 lla0Var = (lla0) cma0Var.D();
        boolean zG = cma0Var.z.G();
        List list = ((eia0) cma0Var.r.f33185a.b).e.b;
        String strB = cma0Var.s.b();
        List list2 = ((eia0) cma0Var.u.f22263a.b).e.c;
        fhj fhjVar = cma0Var.v;
        lla0 lla0VarA = lla0.a(lla0Var, null, null, list, strB, list2, ((mrc) fhjVar.f9543a).a(((mrc) fhjVar.b).b()), cma0Var.x.q(), zG, false, false, false, 519);
        p7m0 p7m0Var = cma0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, lla0VarA));
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        Object value;
        Object value2;
        dna0 dna0Var = (dna0) this.k;
        ocj ocjVar = dna0Var.i;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            f4u f4uVar = dna0Var.r;
            String str = dna0Var.o;
            this.j = true;
            z220 z220Var = (z220) f4uVar.b;
            obj = qjj.d0(((mne) z220Var.b).b, new oed(z220Var, str, null, (byte) 15, false), this);
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
        fja0 fja0Var = (fja0) obj;
        if (Intrinsics.d(fja0Var, fja0.e)) {
            int i = dna0.E;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
            } while (!p7m0Var.m(value2, pma0.a((pma0) value2, null, null, null, null, 0, false, false, false, 119)));
        } else {
            int i2 = dna0.E;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
            } while (!p7m0Var2.m(value, pma0.a((pma0) value, null, null, fja0Var, null, 0, false, false, false, 119)));
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        rua0 rua0Var = (rua0) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            gmq gmqVarB = rua0Var.w.b();
            pua0 pua0Var = new pua0(rua0Var, b);
            this.j = true;
            if (gmqVarB.c(pua0Var, this) == wneVar) {
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

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.k;
        switch (b) {
            case 0:
                return new epp((fpp) obj, yjeVar, (byte) 0);
            case 1:
                return new epp((pup) obj, yjeVar, (byte) 1);
            case 2:
                return new epp((typ) obj, yjeVar, (byte) 2);
            case 3:
                return new epp((k4s) obj, yjeVar, (byte) 3);
            case 4:
                return new epp((uhs) obj, yjeVar, (byte) 4);
            case 5:
                return new epp((nkt) obj, yjeVar, (byte) 5);
            case 6:
                return new epp((nr) obj, yjeVar, (byte) 6);
            case 7:
                return new epp((lsn) obj, yjeVar, (byte) 7);
            case 8:
                return new epp((pew) obj, yjeVar, (byte) 8);
            case 9:
                return new epp((tkw) obj, yjeVar, (byte) 9);
            case 10:
                return new epp((dix) obj, yjeVar, (byte) 10);
            case 11:
                return new epp((f8y) obj, yjeVar, (byte) 11);
            case 12:
                return new epp((cxz) obj, yjeVar, (byte) 12);
            case 13:
                return new epp((w400) obj, yjeVar, (byte) 13);
            case 14:
                return new epp((sf10) obj, yjeVar, (byte) 14);
            case 15:
                return new epp((ph10) obj, yjeVar, (byte) 15);
            case 16:
                return new epp((w220) obj, yjeVar, (byte) 16);
            case 17:
                return new epp((bd40) obj, yjeVar, (byte) 17);
            case 18:
                return new epp((ws70) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new epp((v580) obj, yjeVar, (byte) 19);
            case 20:
                return new epp((Function1) obj, yjeVar, (byte) 20);
            case 21:
                return new epp((b3a0) obj, yjeVar, (byte) 21);
            case 22:
                return new epp((u3a0) obj, yjeVar, (byte) 22);
            case 23:
                return new epp((mea0) obj, yjeVar, (byte) 23);
            case 24:
                return new epp((iha0) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new epp((xja0) obj, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new epp((cma0) obj, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new epp((dna0) obj, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new epp((rua0) obj, yjeVar, (byte) 28);
            default:
                return new epp((gva0) obj, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((epp) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0339  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r44v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objA;
        Object value2;
        Object objD0;
        Object objF;
        ?? arrayList;
        String str;
        int i;
        ?? arrayList2;
        ArrayList arrayList3;
        int i2;
        ?? arrayList4;
        ?? arrayList5;
        String str2;
        Object objP;
        Object objW;
        Object value3;
        Object objA2;
        Object value4;
        Object value5;
        Object objA3;
        Object value6;
        Object value7;
        Object objA4;
        Object value8;
        Object value9;
        Object value10;
        Object objA5;
        Object value11;
        Object value12;
        Object objJ;
        Object value13;
        Object value14;
        Object value15;
        Object obj2;
        String strA;
        String str3;
        Object value16;
        Object value17;
        Object objD1;
        Object value18;
        Object objG;
        Object value19;
        Object objInvoke;
        byte b = this.i;
        String str4 = "";
        int i3 = 10;
        byte b2 = 4;
        byte b3 = 2;
        Object obj3 = this.k;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    spc spcVar = ((fpp) obj3).H;
                    this.j = true;
                    if (spcVar.a(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = pup.C;
                p7m0 p7m0Var = ((pup) obj3).i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hup.a((hup) value, null, null, stp.f32782a, 11)));
                return Unit.f46060a;
            case 2:
                typ typVar = (typ) obj3;
                wne wneVar3 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    j3c j3cVar = typVar.y;
                    this.j = true;
                    objA = j3cVar.a(189L, -1L, this);
                    if (objA == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ypl0 ypl0Var = (ypl0) objA;
                int i5 = typ.E;
                p7m0 p7m0Var2 = typVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, kxp.a((kxp) value2, false, null, 0L, ypl0Var, 127)));
                return Unit.f46060a;
            case 3:
                k4s k4sVar = (k4s) obj3;
                wne wneVar4 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    vpu vpuVar = k4sVar.N;
                    this.j = true;
                    if (vpuVar.b(false, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                gwr gwrVar = new gwr((byte) 29);
                int i6 = k4s.c0;
                k4sVar.H(gwrVar);
                k4sVar.G(w2s.f38466a);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    spc spcVar2 = ((uhs) obj3).B;
                    this.j = true;
                    if (spcVar2.a(this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z10 = this.j;
                if (z10) {
                    if (z10) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ieu ieuVar = ((nkt) obj3).d;
                this.j = true;
                Object objI = ieuVar.i(this);
                return objI == wneVar6 ? wneVar6 : objI;
            case 6:
                wne wneVar7 = wne.f39444a;
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
                pmi pmiVar = (pmi) ((nr) obj3).b;
                this.j = true;
                Object objD2 = qjj.d0(((mne) pmiVar.e).b, new wlk(pmiVar, null, (byte) 0), this);
                return objD2 == wneVar7 ? wneVar7 : objD2;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    pmi pmiVar2 = (pmi) ((lsn) obj3).f20589a;
                    this.j = true;
                    objD0 = qjj.d0(((mne) pmiVar2.e).b, new wlk(pmiVar2, null, b3), this);
                    if (objD0 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                return new lvf((List) objD0);
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z13 = this.j;
                if (z13) {
                    if (z13) {
                        z1x.P(obj);
                        objF = obj;
                    } else {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                z1x.P(obj);
                svu svuVar = ((pew) obj3).f26871a;
                this.j = true;
                objF = svuVar.f(this);
                if (objF == wneVar9) {
                    return wneVar9;
                }
                sew sewVar = (sew) objF;
                sewVar.getClass();
                String str5 = sewVar.f32092a;
                if (str5 == null) {
                    str5 = "";
                }
                List<ycw> list = sewVar.b;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (ycw ycwVar : list) {
                        ycwVar.getClass();
                        Long l = ycwVar.f42403a;
                        long jLongValue = l != null ? l.longValue() : -1L;
                        String str6 = ycwVar.b;
                        if (str6 == null) {
                            str6 = str4;
                        }
                        List<ndw> list2 = ycwVar.c;
                        if (list2 != null) {
                            arrayList2 = new ArrayList(r3d.q(list2, i3));
                            for (ndw ndwVar : list2) {
                                ndwVar.getClass();
                                Long l2 = ndwVar.f23354a;
                                long jLongValue2 = l2 != null ? l2.longValue() : -1L;
                                String str7 = ndwVar.b;
                                String str8 = str7 == null ? str4 : str7;
                                Long l3 = ndwVar.c;
                                long jLongValue3 = l3 != null ? l3.longValue() : -1L;
                                Long l4 = ndwVar.d;
                                long jLongValue4 = l4 != null ? l4.longValue() : -1L;
                                String strC0 = dub.c0(ndwVar.e);
                                String strC1 = dub.c0(ndwVar.f);
                                List<rdw> list3 = ndwVar.g;
                                if (list3 != null) {
                                    arrayList3 = new ArrayList(r3d.q(list3, i3));
                                    for (rdw rdwVar : list3) {
                                        rdwVar.getClass();
                                        Long l5 = rdwVar.f30308a;
                                        long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                                        String str9 = rdwVar.b;
                                        String str10 = str9 == null ? str4 : str9;
                                        String strC2 = dub.c0(rdwVar.c);
                                        Long l6 = rdwVar.d;
                                        long jLongValue6 = l6 != null ? l6.longValue() : -1L;
                                        Integer num = rdwVar.e;
                                        int iIntValue = num != null ? num.intValue() : 0;
                                        List<vdw> list4 = rdwVar.f;
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(r3d.q(list4, i3));
                                            for (vdw vdwVar : list4) {
                                                vdwVar.getClass();
                                                String str11 = vdwVar.b;
                                                if (str11 == null) {
                                                    str11 = str4;
                                                }
                                                String str12 = vdwVar.f37252a;
                                                if (str12 == null) {
                                                    str12 = str4;
                                                    str2 = str12;
                                                } else {
                                                    str2 = str4;
                                                }
                                                arrayList5.add(new sdw(str12, str11));
                                                str4 = str2;
                                            }
                                        } else {
                                            arrayList5 = 0;
                                        }
                                        String str13 = str4;
                                        if (arrayList5 == 0) {
                                            arrayList5 = iun.f15405a;
                                        }
                                        arrayList3.add(new odw(iIntValue, jLongValue5, jLongValue6, str10, strC2, arrayList5));
                                        str4 = str13;
                                        i3 = 10;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                String str14 = str4;
                                List list5 = arrayList3;
                                if (arrayList3 == null) {
                                    list5 = iun.f15405a;
                                }
                                List list6 = list5;
                                List<zdw> list7 = ndwVar.h;
                                if (list7 != null) {
                                    i2 = 10;
                                    arrayList4 = new ArrayList(r3d.q(list7, 10));
                                    for (zdw zdwVar : list7) {
                                        zdwVar.getClass();
                                        Long l7 = zdwVar.f44227a;
                                        long jLongValue7 = l7 != null ? l7.longValue() : -1L;
                                        String str15 = zdwVar.b;
                                        String str16 = str15 == null ? str14 : str15;
                                        String strC3 = dub.c0(zdwVar.c);
                                        Long l8 = zdwVar.d;
                                        long jLongValue8 = l8 != null ? l8.longValue() : -1L;
                                        Integer num2 = zdwVar.e;
                                        int iIntValue2 = -1;
                                        int iIntValue3 = num2 != null ? num2.intValue() : -1;
                                        Integer num3 = zdwVar.f;
                                        if (num3 != null) {
                                            iIntValue2 = num3.intValue();
                                        }
                                        arrayList4.add(new wdw(iIntValue3, iIntValue2, jLongValue7, jLongValue8, str16, strC3));
                                    }
                                } else {
                                    i2 = 10;
                                    arrayList4 = 0;
                                }
                                if (arrayList4 == 0) {
                                    arrayList4 = iun.f15405a;
                                }
                                arrayList2.add(new jdw(jLongValue2, str8, jLongValue3, jLongValue4, strC0, strC1, list6, arrayList4));
                                i3 = i2;
                                str4 = str14;
                            }
                            str = str4;
                            i = i3;
                        } else {
                            str = str4;
                            i = i3;
                            arrayList2 = iun.f15405a;
                        }
                        arrayList.add(new vcw(jLongValue, str6, arrayList2));
                        i3 = i;
                        str4 = str;
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                Cnew cnew = new Cnew(str5, arrayList);
                if (str5.length() != 0 || !arrayList.isEmpty()) {
                    return cnew;
                }
                jf4.k(null);
                return null;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    hjd hjdVar = ((tkw) obj3).q;
                    cid cidVar = new cid("", new ls2());
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(cidVar, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                dix dixVar = (dix) obj3;
                wne wneVar11 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    xzp xzpVar = dixVar.q;
                    boolean z16 = ((ohx) dixVar.D()).e.b;
                    this.j = true;
                    objP = xzpVar.P(z16, this);
                    if (objP == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objP = obj;
                }
                yje yjeVar = null;
                sac.T(new fnq((gmq) objP, new fhq(dixVar, yjeVar, (byte) 17), b2), jiu0.a(dixVar), new aix(dixVar, yjeVar, (byte) 1));
                return Unit.f46060a;
            case 11:
                f8y f8yVar = (f8y) obj3;
                wne wneVar12 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    abu abuVar = f8yVar.u;
                    this.j = true;
                    objW = abuVar.w(this);
                    if (objW == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW = obj;
                }
                if (!((Boolean) objW).booleanValue()) {
                    int i7 = f8y.y;
                    f8yVar.G(t7y.f33490a);
                }
                return Unit.f46060a;
            case 12:
                cxz cxzVar = (cxz) obj3;
                ocj ocjVar = cxzVar.i;
                wne wneVar13 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    int i8 = cxz.x;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, uwz.a((uwz) value3, null, null, 0, true, false, 4087)));
                    mhu mhuVar = cxzVar.o;
                    String strA2 = cxzVar.p.a();
                    ucq ucqVar = cxzVar.u.a().f;
                    this.j = true;
                    objA2 = mhuVar.a(strA2, ucqVar, this);
                    if (objA2 == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                lzz lzzVar = (lzz) objA2;
                int i9 = cxz.x;
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, uwz.a((uwz) value4, lzzVar.f20926a, lzzVar.b, 0, false, false, 4068)));
                return Unit.f46060a;
            case 13:
                w400 w400Var = (w400) obj3;
                ocj ocjVar2 = w400Var.i;
                wne wneVar14 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    int i10 = w400.x;
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                    } while (!p7m0Var5.m(value5, l400.a((l400) value5, null, null, 0, true, false, 1015)));
                    shu shuVar = w400Var.o;
                    String strA3 = w400Var.p.a();
                    ucq ucqVar2 = w400Var.t.a().f;
                    this.j = true;
                    objA3 = shuVar.a(strA3, ucqVar2, this);
                    if (objA3 == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                fzz fzzVar = (fzz) objA3;
                int i11 = w400.x;
                p7m0 p7m0Var6 = ocjVar2.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, l400.a((l400) value6, fzzVar.f10434a, fzzVar.b, 0, false, false, 996)));
                return Unit.f46060a;
            case 14:
                sf10 sf10Var = (sf10) obj3;
                zg zgVar = sf10Var.v;
                au0 au0Var = sf10Var.w;
                ctf0 ctf0Var = sf10Var.t;
                ocj ocjVar3 = sf10Var.i;
                wne wneVar15 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    y1p y1pVar = y1p.MAIN;
                    au0Var.getClass();
                    b1j.v("cashback", au0Var.f1455a, 3316L);
                    i8i.D("screen", "cashback", zgVar.f44322a, "promo_VIP_cashback_withdraw");
                    p7m0 p7m0Var7 = ocjVar3.f25029a;
                    do {
                        value7 = p7m0Var7.getValue();
                        value7.getClass();
                    } while (!p7m0Var7.m(value7, lf10.a((lf10) value7, null, true, 127)));
                    lrc lrcVar = sf10Var.r;
                    String str17 = ((lf10) sf10Var.D()).c;
                    this.j = true;
                    objA4 = ((qi10) lrcVar.b).a(str17, this);
                    if (objA4 == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                ri10 ri10Var = (ri10) objA4;
                we10 we10Var = ((lf10) sf10Var.D()).d;
                if (we10Var instanceof ue10) {
                    yh10 yh10Var = ((ue10) we10Var).f35505a;
                    ue10 ue10Var = new ue10(yh10.a(yh10Var, wi10.a(yh10Var.c, ri10Var.f30517a, ri10Var.b, ri10Var.c, ri10Var.e)));
                    p7m0 p7m0Var8 = ocjVar3.f25029a;
                    do {
                        value9 = p7m0Var8.getValue();
                        value9.getClass();
                    } while (!p7m0Var8.m(value9, lf10.a((lf10) value9, ue10Var, false, 239)));
                }
                au0Var.f1455a.a(xun.f41520a, 3317L);
                zgVar.f44322a.c("promo_VIP_cashback_done");
                p7m0 p7m0Var9 = ocjVar3.f25029a;
                do {
                    value8 = p7m0Var9.getValue();
                    value8.getClass();
                } while (!p7m0Var9.m(value8, lf10.a((lf10) value8, null, false, 127)));
                String strA4 = ctf0Var.b.a(R.string.success, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var = pn40.f27267a;
                sf10Var.G(new jf10(new DialogFields((CharSequence) strA4, (CharSequence) ctf0Var.b.a(R.string.loyalty_program_cashback_claim_success_description_v2, Arrays.copyOf(new Object[]{kng0.l(pn40.c(ri10Var.d, p3u0.c), Separators.SP, ri10Var.e.f33941a)}, 1)), (CharSequence) ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1528)));
                return Unit.f46060a;
            case 15:
                ph10 ph10Var = (ph10) obj3;
                zg zgVar2 = ph10Var.v;
                au0 au0Var2 = ph10Var.w;
                ctf0 ctf0Var2 = ph10Var.t;
                ocj ocjVar4 = ph10Var.i;
                wne wneVar16 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    y1p y1pVar2 = y1p.MAIN;
                    au0Var2.getClass();
                    b1j.v("cashback", au0Var2.f1455a, 3316L);
                    i8i.D("screen", "cashback", zgVar2.f44322a, "promo_VIP_cashback_withdraw");
                    p7m0 p7m0Var10 = ocjVar4.f25029a;
                    do {
                        value10 = p7m0Var10.getValue();
                        value10.getClass();
                    } while (!p7m0Var10.m(value10, gh10.a((gh10) value10, null, true, 127)));
                    lrc lrcVar2 = ph10Var.r;
                    String str18 = ((gh10) ph10Var.D()).c;
                    this.j = true;
                    objA5 = ((qi10) lrcVar2.b).a(str18, this);
                    if (objA5 == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA5 = obj;
                }
                ri10 ri10Var2 = (ri10) objA5;
                jg10 jg10Var = ((gh10) ph10Var.D()).d;
                if (jg10Var instanceof hg10) {
                    yh10 yh10Var2 = ((hg10) jg10Var).f12997a;
                    hg10 hg10Var = new hg10(yh10.a(yh10Var2, wi10.a(yh10Var2.c, ri10Var2.f30517a, ri10Var2.b, ri10Var2.c, ri10Var2.e)));
                    p7m0 p7m0Var11 = ocjVar4.f25029a;
                    do {
                        value12 = p7m0Var11.getValue();
                        value12.getClass();
                    } while (!p7m0Var11.m(value12, gh10.a((gh10) value12, hg10Var, false, 239)));
                }
                au0Var2.f1455a.a(xun.f41520a, 3317L);
                zgVar2.f44322a.c("promo_VIP_cashback_done");
                p7m0 p7m0Var12 = ocjVar4.f25029a;
                do {
                    value11 = p7m0Var12.getValue();
                    value11.getClass();
                } while (!p7m0Var12.m(value11, gh10.a((gh10) value11, null, false, 127)));
                String strA5 = ctf0Var2.b.a(R.string.success, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var2 = pn40.f27267a;
                ph10Var.G(new eh10(new DialogFields((CharSequence) strA5, (CharSequence) ctf0Var2.b.a(R.string.loyalty_program_cashback_claim_success_description_v2, Arrays.copyOf(new Object[]{kng0.l(pn40.c(ri10Var2.d, p3u0.c), Separators.SP, ri10Var2.e.f33941a)}, 1)), (CharSequence) ctf0Var2.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1528)));
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    psc pscVar = ((w220) obj3).D;
                    this.j = true;
                    Object objW0 = sj3.w0(this, ((rcm0) ((he1) ((nw20) pscVar.b).b).f12898a.getValue()).f30246a, new tri0(b3, z ? 1 : 0, (byte) 13), false, true);
                    Object obj4 = objW0;
                    if (objW0 != wneVar17) {
                        obj4 = Unit.f46060a;
                    }
                    if (obj4 != wneVar17) {
                        obj4 = Unit.f46060a;
                    }
                    if (obj4 != wneVar17) {
                        obj4 = Unit.f46060a;
                    }
                    if (obj4 != wneVar17) {
                        obj4 = Unit.f46060a;
                    }
                    if (obj4 == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                bd40 bd40Var = (bd40) obj3;
                oyg0 oyg0Var = bd40Var.f;
                ocj ocjVar5 = bd40Var.i;
                wne wneVar18 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    p4u p4uVar = bd40Var.u;
                    this.j = true;
                    objJ = ((z220) p4uVar.f26374a).j(10, this);
                    if (objJ == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objJ = obj;
                }
                List list8 = (List) objJ;
                if (list8.isEmpty()) {
                    int i12 = bd40.x;
                    p7m0 p7m0Var13 = ocjVar5.f25029a;
                    do {
                        value13 = p7m0Var13.getValue();
                        value13.getClass();
                        e0g0 e0g0Var = j0g0.b;
                    } while (!p7m0Var13.m(value13, yc40.a((yc40) value13, null, null, new j0g0(iun.f15405a), false, 59)));
                } else {
                    int i13 = bd40.x;
                    p7m0 p7m0Var14 = ocjVar5.f25029a;
                    do {
                        value15 = p7m0Var14.getValue();
                        value15.getClass();
                    } while (!p7m0Var14.m(value15, yc40.a((yc40) value15, null, list8, null, false, 61)));
                }
                xb40 xb40Var = (xb40) CollectionsKt.firstOrNull(list8);
                if (xb40Var != null && ((yc40) bd40Var.D()).f42368a == xb40.f40583a && ((yc40) bd40Var.D()).f42368a != xb40Var) {
                    p7m0 p7m0Var15 = ocjVar5.f25029a;
                    do {
                        value14 = p7m0Var15.getValue();
                        value14.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var15.m(value14, yc40.a((yc40) value14, xb40Var, null, null, false, 62)));
                    bd40Var.N(xb40Var);
                }
                return Unit.f46060a;
            case 18:
                ws70 ws70Var = (ws70) obj3;
                wne wneVar19 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    zpu zpuVar = ws70Var.p;
                    String str19 = ws70Var.q;
                    int i14 = ((us70) ws70Var.D()).f36198a;
                    String str20 = ((us70) ws70Var.D()).b;
                    if (StringsKt.W(str20)) {
                        str20 = null;
                    }
                    this.j = true;
                    Object objN = zpuVar.n(i14, this, str19, str20);
                    if (objN == wneVar19) {
                        return wneVar19;
                    }
                    obj2 = objN;
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj2 = ((j0g0) obj).f15681a;
                }
                e0g0 e0g0Var2 = j0g0.b;
                if (!(obj2 instanceof g0g0)) {
                    int i15 = ws70.r;
                    ws70Var.G(rs70.f31018a);
                }
                Throwable thA = j0g0.a(obj2);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        strA = ws70Var.o.b.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = StringsKt.W(message) ? null : message;
                        if (strA == null) {
                            strA = ws70Var.o.b.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                        }
                    }
                    qs70 qs70Var = new qs70(strA);
                    int i16 = ws70.r;
                    ws70Var.G(qs70Var);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                v580 v580Var = (v580) obj3;
                v480 v480Var = v580Var.o;
                wne wneVar20 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    ove oveVar = v580Var.r;
                    i3m0 i3m0Var = v480Var.e;
                    if (i3m0Var.equals(e3m0.f7145a)) {
                        str3 = "group_stage";
                    } else if (i3m0Var.equals(f3m0.f8871a)) {
                        str3 = "final";
                    } else {
                        if (!i3m0Var.equals(g3m0.f10617a)) {
                            t9f.b();
                            return null;
                        }
                        str3 = "playoff";
                    }
                    dbv0 dbv0Var = new dbv0(str3, new cs2(v480Var.f36764a));
                    this.j = true;
                    if (oveVar.r(dbv0Var, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    this.j = true;
                    if (((Function1) obj3).invoke(this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                b3a0 b3a0Var = (b3a0) obj3;
                wne wneVar22 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    vpu vpuVar2 = b3a0Var.r;
                    this.j = true;
                    if (vpuVar2.b(false, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i17 = b3a0.x;
                p7m0 p7m0Var16 = b3a0Var.i.f25029a;
                do {
                    value16 = p7m0Var16.getValue();
                    value16.getClass();
                } while (!p7m0Var16.m(value16, p2a0.a((p2a0) value16, false, null, null, false, 61)));
                b3a0Var.G(j2a0.f15772a);
                return Unit.f46060a;
            case 22:
                u3a0 u3a0Var = (u3a0) obj3;
                oyg0 oyg0Var2 = u3a0Var.f;
                ocj ocjVar6 = u3a0Var.i;
                wne wneVar23 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    int i18 = u3a0.u;
                    p7m0 p7m0Var17 = ocjVar6.f25029a;
                    do {
                        value17 = p7m0Var17.getValue();
                        value17.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var17.m(value17, n3a0.a((n3a0) value17, null, 0, 0, 0, true, false, 15)));
                    ivn ivnVar = u3a0Var.q;
                    String str21 = u3a0Var.o;
                    this.j = true;
                    nr nrVar = (nr) ivnVar.f15453a;
                    objD1 = qjj.d0(((mne) nrVar.d).b, new oed(nrVar, str21, z2 ? 1 : 0, b2), this);
                    if (objD1 == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD1 = obj;
                }
                vgn vgnVar = (vgn) objD1;
                int i19 = u3a0.u;
                p7m0 p7m0Var18 = ocjVar6.f25029a;
                while (true) {
                    Object value20 = p7m0Var18.getValue();
                    value20.getClass();
                    vgn vgnVar2 = vgnVar;
                    if (p7m0Var18.m(value20, n3a0.a((n3a0) value20, vgnVar, 0, 0, 0, false, false, 14))) {
                        return Unit.f46060a;
                    }
                    vgnVar = vgnVar2;
                }
                break;
            case 23:
                mea0 mea0Var = (mea0) obj3;
                wne wneVar24 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    u8u u8uVar = mea0Var.p;
                    long j = ((zda0) mea0Var.D()).f44203a.f46566a;
                    String str22 = ((zda0) mea0Var.D()).f44203a.b;
                    u8uVar.getClass();
                    str22.getClass();
                    dnq dnqVar = new dnq(aoq.a(((m1e) u8uVar.b).b(), new ir((Object) u8uVar, j, (Object) str22, (yje) null, (byte) 14)), new rl2(3, z4 ? 1 : 0, (byte) 23), (byte) 1);
                    s980 s980Var = new s980(mea0Var, z3 ? 1 : 0, (byte) 20);
                    this.j = true;
                    Object objC = dnqVar.c(new vnq(h660.f12515a, s980Var, (byte) 2), this);
                    if (objC != wneVar24) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar24) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                iha0 iha0Var = (iha0) obj3;
                oyg0 oyg0Var3 = iha0Var.f;
                ocj ocjVar7 = iha0Var.i;
                wne wneVar25 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    ((bca0) ((w5z) iha0Var.q.b).c).f2347a = null;
                    p7m0 p7m0Var19 = ocjVar7.f25029a;
                    do {
                        value18 = p7m0Var19.getValue();
                        value18.getClass();
                        oyg0Var3.getClass();
                    } while (!p7m0Var19.m(value18, dha0.a((dha0) value18, null, true, false, false, 1)));
                    n4u n4uVar = iha0Var.p;
                    String str23 = iha0Var.o;
                    this.j = true;
                    objG = ((w5z) n4uVar.b).G(str23, this);
                    if (objG == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                cca0 cca0Var = (cca0) objG;
                if (cca0Var.b.isEmpty()) {
                    int i20 = iha0.t;
                    p7m0 p7m0Var20 = ocjVar7.f25029a;
                    do {
                        value19 = p7m0Var20.getValue();
                        value19.getClass();
                        oyg0Var3.getClass();
                    } while (!p7m0Var20.m(value19, dha0.a((dha0) value19, null, false, true, false, 1)));
                } else {
                    int i21 = iha0.t;
                    p7m0 p7m0Var21 = ocjVar7.f25029a;
                    while (true) {
                        Object value21 = p7m0Var21.getValue();
                        value21.getClass();
                        cca0 cca0Var2 = cca0Var;
                        if (!p7m0Var21.m(value21, dha0.a((dha0) value21, cca0Var, false, false, false, 12))) {
                            cca0Var = cca0Var2;
                        }
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return l(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return m(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return o(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return r(obj);
            default:
                gva0 gva0Var = (gva0) obj3;
                wne wneVar26 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    Function1 function1 = gva0Var.b;
                    this.j = true;
                    objInvoke = function1.invoke(this);
                    if (objInvoke == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objInvoke = obj;
                }
                qpg0 qpg0Var = (qpg0) objInvoke;
                qpg0Var.getClass();
                return new f2e(qpg0Var);
        }
    }
}
