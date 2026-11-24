package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class brk extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ brk(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f3083a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean zB;
        boolean zB2;
        Object value;
        ArrayList arrayList;
        x93 x93Var;
        pbz pbzVar = null;
        Object[] objArr = 0;
        switch (this.f3083a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 1:
                Object objW = ((l0l) this.receiver).w((zy5) obj, (yje) obj2);
                return objW == wne.f39444a ? objW : Unit.f46060a;
            case 2:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 3:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 4:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 5:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 6:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 7:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 8:
                ((Function1) this.receiver).invoke(obj);
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
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                e0p e0pVar = (e0p) this.receiver;
                boolean z = th instanceof aii0;
                yzo yzoVar = yzo.f43524a;
                if (z) {
                    e0pVar.getClass();
                    aii0 aii0Var = (aii0) th;
                    int i = aii0Var.g;
                    if (i == 2) {
                        String message = aii0Var.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        e0pVar.w(new zzo(message));
                    } else if (i == i2o.IdentificationNotPassed.getErrorCode() || i == 103) {
                        e0pVar.w(new zzo(str));
                    } else {
                        e0pVar.w(yzoVar);
                    }
                } else {
                    e0pVar.w(yzoVar);
                }
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
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 20:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 21:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 22:
                iqq iqqVar = (iqq) obj;
                iqq iqqVar2 = (iqq) obj2;
                lqq lqqVar = (lqq) this.receiver;
                if (lqqVar.n && (zB = iqqVar2.b()) != iqqVar.b()) {
                    if (zB) {
                        mie0 mie0Var = new mie0();
                        c9x.B(lqqVar, new gmo(mie0Var, lqqVar, (byte) 13));
                        pbz pbzVar2 = (pbz) mie0Var.f21842a;
                        if (pbzVar2 != null) {
                            pbzVar2.a();
                            pbzVar = pbzVar2;
                        }
                        lqqVar.r = pbzVar;
                    } else {
                        pbz pbzVar3 = lqqVar.r;
                        if (pbzVar3 != null) {
                            pbzVar3.b();
                        }
                        lqqVar.r = null;
                    }
                }
                return Unit.f46060a;
            case 23:
                iqq iqqVar3 = (iqq) obj;
                iqq iqqVar4 = (iqq) obj2;
                uqq uqqVar = (uqq) this.receiver;
                if (uqqVar.n && (zB2 = iqqVar4.b()) != iqqVar3.b()) {
                    Function1 function1 = uqqVar.r;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(zB2));
                    }
                    if (zB2) {
                        qjj.W(uqqVar.N0(), null, yne.d, new hij(uqqVar, objArr == true ? 1 : 0, (byte) 27), 1);
                        mie0 mie0Var2 = new mie0();
                        c9x.B(uqqVar, new gmo(mie0Var2, uqqVar, (byte) 15));
                        pbz pbzVar4 = (pbz) mie0Var2.f21842a;
                        if (pbzVar4 != null) {
                            pbzVar4.a();
                        } else {
                            pbzVar4 = null;
                        }
                        uqqVar.t = pbzVar4;
                        j6z j6zVar = uqqVar.u;
                        if (j6zVar != null && j6zVar.h()) {
                            uqqVar.d1();
                        }
                    } else {
                        pbz pbzVar5 = uqqVar.t;
                        if (pbzVar5 != null) {
                            pbzVar5.b();
                        }
                        uqqVar.t = null;
                        uqqVar.d1();
                    }
                    s0x.S(uqqVar);
                    gy40 gy40Var = uqqVar.q;
                    if (gy40Var != null) {
                        qpq qpqVar = uqqVar.s;
                        if (zB2) {
                            if (qpqVar != null) {
                                uqqVar.c1(gy40Var, new rpq(qpqVar));
                                uqqVar.s = null;
                            }
                            qpq qpqVar2 = new qpq();
                            uqqVar.c1(gy40Var, qpqVar2);
                            uqqVar.s = qpqVar2;
                        } else if (qpqVar != null) {
                            uqqVar.c1(gy40Var, new rpq(qpqVar));
                            uqqVar.s = null;
                        }
                    }
                }
                return Unit.f46060a;
            case 24:
                nkr nkrVar = (nkr) obj;
                ejr ejrVar = (ejr) obj2;
                nkrVar.getClass();
                ejrVar.getClass();
                vkr vkrVar = (vkr) this.receiver;
                vkrVar.getClass();
                p7m0 p7m0Var = vkrVar.h;
                do {
                    value = p7m0Var.getValue();
                    List<p6t0> list = (List) value;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (p6t0 nkrVar2 : list) {
                        if (nkrVar2 instanceof nkr) {
                            nkr nkrVar3 = (nkr) nkrVar2;
                            String str2 = nkrVar3.b;
                            if (str2.equals(nkrVar.b) && nkrVar3.d != ejrVar) {
                                nkrVar2 = new nkr(nkrVar3.f23694a, str2, nkrVar3.c, ejrVar);
                            }
                        }
                        arrayList.add(nkrVar2);
                    }
                } while (!p7m0Var.m(value, arrayList));
                Iterable iterable = (Iterable) p7m0Var.getValue();
                ArrayList<nkr> arrayList2 = new ArrayList();
                for (Object obj3 : iterable) {
                    if (obj3 instanceof nkr) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                for (nkr nkrVar4 : arrayList2) {
                    int i2 = nkrVar4.f23694a;
                    String str3 = nkrVar4.b;
                    String str4 = nkrVar4.c;
                    int iOrdinal = nkrVar4.d.ordinal();
                    if (iOrdinal == 0) {
                        x93Var = x93.f40490a;
                    } else if (iOrdinal == 1) {
                        x93Var = x93.b;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        x93Var = x93.c;
                    }
                    arrayList3.add(new w93(i2, str3, str4, x93Var));
                }
                lef0 lef0Var = vkrVar.d;
                lef0Var.getClass();
                xio xioVar = (xio) ((pmi) lef0Var.f19899a).c;
                xioVar.getClass();
                xioVar.b = arrayList3;
                vkrVar.x();
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
