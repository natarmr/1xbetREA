package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ens extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8110a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ens(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f8110a = b;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x029d A[PHI: r11
  0x029d: PHI (r11v9 int) = (r11v1 int), (r11v3 int), (r11v7 int), (r11v7 int) binds: [B:121:0x029b, B:142:0x02e2, B:277:0x029d, B:278:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x029f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:241:0x010d A[EDGE_INSN: B:241:0x010d->B:45:0x010d BREAK  A[LOOP:2: B:39:0x00f8->B:43:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[LOOP:2: B:39:0x00f8->B:43:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0239  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int size;
        int size2;
        int i;
        int i2;
        int length;
        int iMin = 0;
        switch (this.f8110a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 1:
                Object objY = ((q3t) this.receiver).y((zy5) obj, (yje) obj2);
                return objY == wne.f39444a ? objY : Unit.f46060a;
            case 2:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 3:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 4:
                ((acf) this.receiver).getClass();
                return acf.a((String) obj, (String) obj2);
            case 5:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 6:
                List list = (List) obj;
                yje yjeVar = (yje) obj2;
                bev bevVar = (bev) this.receiver;
                bevVar.getClass();
                pdv pdvVar = pdv.c;
                pdv pdvVar2 = pdv.b;
                pdv pdvVar3 = pdv.f26824a;
                pdv pdvVar4 = pdv.d;
                if (list.size() != 1) {
                    size = list.size() - 1;
                    if (size >= 0) {
                        int i3 = -1;
                        while (true) {
                            int i4 = size - 1;
                            wdv wdvVar = (wdv) list.get(size);
                            if (!Intrinsics.d(wdvVar, pdvVar3) && !Intrinsics.d(wdvVar, pdvVar2) && !Intrinsics.d(wdvVar, pdvVar4) && !Intrinsics.d(wdvVar, pdvVar)) {
                                if ((wdvVar instanceof udv) && i3 < 0) {
                                    i3 = size;
                                }
                                if (i4 < 0) {
                                    size = i3;
                                } else {
                                    size = i4;
                                }
                            }
                        }
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        int size3 = list.size();
                        int i5 = -1;
                        int i6 = -1;
                        for (int i7 = 0; i7 < size3; i7++) {
                            wdv wdvVar2 = (wdv) list.get(i7);
                            if (wdvVar2 instanceof sdv) {
                                i5 = i7;
                            } else if (wdvVar2 instanceof rdv) {
                                i6 = i7;
                            } else if (!(wdvVar2 instanceof tdv)) {
                                if (i5 < 0) {
                                    size = i5;
                                } else if (i6 >= 0) {
                                    size = i6;
                                } else {
                                    if (bevVar.o == null && bevVar.n.b()) {
                                        int size4 = list.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size4) {
                                                wdv wdvVar3 = (wdv) list.get(i5);
                                                if (!(wdvVar3 instanceof qdv) && !(wdvVar3 instanceof vdv)) {
                                                    i5++;
                                                }
                                            } else {
                                                size2 = list.size();
                                                i5 = -1;
                                                while (i < size2) {
                                                    i5 = i;
                                                }
                                                if (i5 >= 0) {
                                                    size = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        size2 = list.size();
                                        i5 = -1;
                                        for (i = 0; i < size2 && (((wdv) list.get(i)) instanceof tdv); i++) {
                                            i5 = i;
                                        }
                                        if (i5 >= 0) {
                                            size = 0;
                                        }
                                    }
                                    size = i5;
                                }
                            }
                        }
                        if (i5 < 0) {
                            size = i5;
                        } else if (i6 >= 0) {
                            size = i6;
                        } else {
                            if (bevVar.o == null) {
                                size2 = list.size();
                                i5 = -1;
                                while (i < size2) {
                                    i5 = i;
                                }
                                if (i5 >= 0) {
                                    size = 0;
                                }
                            } else {
                                size2 = list.size();
                                i5 = -1;
                                while (i < size2) {
                                    i5 = i;
                                }
                                if (i5 >= 0) {
                                    size = 0;
                                }
                            }
                            size = i5;
                        }
                    }
                } else {
                    size = 0;
                }
                wdv wdvVar4 = (wdv) list.get(size);
                if (Intrinsics.d(wdvVar4, pdvVar2)) {
                    list.remove(size);
                } else {
                    if (Intrinsics.d(wdvVar4, pdvVar)) {
                        Object objN = bevVar.n(list, yjeVar);
                        return objN == wne.f39444a ? objN : Unit.f46060a;
                    }
                    if (Intrinsics.d(wdvVar4, pdvVar3)) {
                        ucs0 ucs0Var = bevVar.t;
                        if (ucs0Var != null) {
                            ucs0Var.d();
                        }
                        bevVar.o = null;
                        list.remove(size);
                        while (iMin < size) {
                            wdv wdvVar5 = (wdv) list.get(iMin);
                            if (!Intrinsics.d(wdvVar5, pdvVar4) && !Intrinsics.d(wdvVar5, pdvVar3) && !(wdvVar5 instanceof tdv) && !(wdvVar5 instanceof vdv)) {
                                if (wdvVar5 instanceof qdv) {
                                    bevVar.a(((qdv) wdvVar5).f28553a);
                                } else {
                                    iMin++;
                                }
                            }
                            list.remove(iMin);
                            size--;
                        }
                    } else if (Intrinsics.d(wdvVar4, pdvVar4)) {
                        ucs0 ucs0Var2 = bevVar.t;
                        if (ucs0Var2 != null) {
                            ucs0Var2.C();
                        }
                        bevVar.o = null;
                        list.remove(size);
                        while (iMin < size) {
                            wdv wdvVar6 = (wdv) list.get(iMin);
                            if (Intrinsics.d(wdvVar6, pdvVar4) || (wdvVar6 instanceof tdv)) {
                                list.remove(iMin);
                                size--;
                            } else {
                                iMin++;
                            }
                        }
                    } else {
                        if (wdvVar4 instanceof udv) {
                            Object objL = bevVar.l(list, size, (udv) wdvVar4, yjeVar);
                            return objL == wne.f39444a ? objL : Unit.f46060a;
                        }
                        if (wdvVar4 instanceof qdv) {
                            bevVar.e(list, size, (qdv) wdvVar4, true);
                        } else if (wdvVar4 instanceof vdv) {
                            bevVar.q(list, size, (vdv) wdvVar4);
                        } else if (wdvVar4 instanceof sdv) {
                            sdv sdvVar = (sdv) wdvVar4;
                            Map mapB = bevVar.c;
                            bevVar.p = sdvVar.f32050a;
                            Map map = sdvVar.b;
                            bevVar.q = map;
                            if (!map.isEmpty()) {
                                jo20 jo20Var = new jo20();
                                jo20Var.putAll(map);
                                jo20Var.putAll(mapB);
                                mapB = jo20Var.b();
                            }
                            bevVar.r = mapB;
                            list.remove(size);
                            while (iMin < size) {
                                if (((wdv) list.get(iMin)) instanceof sdv) {
                                    list.remove(iMin);
                                    size--;
                                } else {
                                    iMin++;
                                }
                            }
                            bevVar.r();
                        } else {
                            if (wdvVar4 instanceof rdv) {
                                throw null;
                            }
                            if (!(wdvVar4 instanceof tdv)) {
                                t9f.b();
                                return null;
                            }
                            bevVar.k(size, list, true);
                        }
                    }
                }
                return Unit.f46060a;
            case 7:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 8:
                Exception exc = (Exception) obj;
                List list2 = (List) obj2;
                exc.getClass();
                list2.getClass();
                naw nawVar = (naw) this.receiver;
                nawVar.getClass();
                rjo rjoVar = nawVar.q0;
                String string = list2.toString();
                rjoVar.getClass();
                string.getClass();
                if (string.length() > 0) {
                    tfq.a().b(string);
                }
                tfq.a().c(exc);
                return Unit.f46060a;
            case 9:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 10:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 11:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 12:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 13:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 14:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 15:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 16:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 17:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 18:
                ugi0 ugi0Var = (ugi0) obj;
                int iIntValue = ((Number) obj2).intValue();
                ugi0Var.getClass();
                ocy ocyVar = (ocy) this.receiver;
                ocyVar.getClass();
                boolean z = !ugi0Var.i(iIntValue) && ugi0Var.g(iIntValue).b();
                ocyVar.b = z;
                return Boolean.valueOf(z);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 20:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 21:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                mez mezVar = (mez) this.receiver;
                zz2 zz2Var = mezVar.e;
                int[] iArr = new int[iIntValue3];
                if (((fez) ((hgk0) mezVar.d).getValue()).j.q(iIntValue2)) {
                    qx3.o(iArr, iIntValue2, 0, 6);
                } else {
                    zz2Var.m(iIntValue2 + iIntValue3);
                    int iT = zz2Var.t(iIntValue2);
                    if (iT != -2 && iT != -1) {
                        if (iT < 0) {
                            adx.a("Expected positive lane number, got " + iT + " instead.");
                        }
                        iMin = Math.min(iT, iIntValue3);
                    }
                    int iO = iIntValue2;
                    for (int i8 = iMin - 1; -1 < i8; i8--) {
                        iO = zz2Var.o(iO, i8);
                        iArr[i8] = iO;
                        if (iO == -1) {
                            qx3.o(iArr, -1, i8, 2);
                            iArr[iMin] = iIntValue2;
                            for (i2 = iMin + 1; i2 < iIntValue3; i2++) {
                                iIntValue2++;
                                length = zz2Var.f45232a + ((int[]) zz2Var.b).length;
                                while (true) {
                                    if (iIntValue2 < length) {
                                        iIntValue2 = zz2Var.f45232a + ((int[]) zz2Var.b).length;
                                    }
                                    if (zz2Var.d(iIntValue2, i2)) {
                                    }
                                    iIntValue2++;
                                    break;
                                    break;
                                }
                                iArr[i2] = iIntValue2;
                            }
                        }
                    }
                    iArr[iMin] = iIntValue2;
                    while (i2 < iIntValue3) {
                        iIntValue2++;
                        length = zz2Var.f45232a + ((int[]) zz2Var.b).length;
                        while (true) {
                            if (iIntValue2 < length) {
                                iIntValue2 = zz2Var.f45232a + ((int[]) zz2Var.b).length;
                            }
                            if (zz2Var.d(iIntValue2, i2)) {
                            }
                            iIntValue2++;
                            break;
                            break;
                        }
                        iArr[i2] = iIntValue2;
                    }
                }
                return iArr;
            case 22:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 23:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 24:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            default:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
        }
    }
}
