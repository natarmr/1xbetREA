package a;

import android.net.Uri;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.AppScreens$PromoWebAggregatorFragmentScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class jc0 extends x2t0 {
    public final /* synthetic */ byte h = 0;
    public final oeg0 i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(oeg0 oeg0Var, h03 h03Var, uzc0 uzc0Var, grj grjVar, pru pruVar, ctf0 ctf0Var) {
        super(new hc0(pruVar, (byte) 0));
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.i = oeg0Var;
        this.j = h03Var;
        this.k = uzc0Var;
        this.l = grjVar;
        this.m = ctf0Var;
    }

    @Override // a.j3t0
    public final /* bridge */ /* synthetic */ Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                return j((sq5) obj, bnn0Var);
            default:
                return k((yfj) obj, bnn0Var);
        }
    }

    public Uri i(String str) {
        return Uri.parse(((ctf0) this.m).b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)) + "://" + str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(sq5 sq5Var, zje zjeVar) {
        ic0 ic0Var;
        String lowerCase;
        String lowerCase2;
        if (zjeVar instanceof ic0) {
            ic0Var = (ic0) zjeVar;
            int i = ic0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ic0Var.l = i - Integer.MIN_VALUE;
            } else {
                ic0Var = new ic0(this, zjeVar);
            }
        } else {
            ic0Var = new ic0(this, zjeVar);
        }
        Object obj = ic0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ic0Var.l;
        String lowerCase3 = null;
        if (i2 == 0) {
            z1x.P(obj);
            ic0Var.i = sq5Var;
            ic0Var.l = 1;
            if (x2t0.f(this, sq5Var, ic0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sq5Var = ic0Var.i;
            z1x.P(obj);
        }
        if (sq5Var instanceof rq5) {
            rq5 rq5Var = (rq5) sq5Var;
            lr5 lr5Var = rq5Var.f30915a;
            int i3 = rq5Var.b;
            boolean z = rq5Var.c;
            h03 h03Var = (h03) this.j;
            String strU = phu0.U(lr5Var);
            String str = lr5Var.i;
            boolean z2 = lr5Var.j;
            or5 or5Var = lr5Var.l;
            int i4 = lr5Var.f20512a;
            String str2 = lr5Var.h;
            if (!phu0.P(lr5Var) || strU.length() <= 0) {
                boolean z3 = str2.length() > 0 && !StringsKt.O(str2, String.valueOf(i4), false);
                if (!(or5Var instanceof mr5)) {
                    z3 = z2 && z3;
                }
                oeg0 oeg0Var = this.i;
                if (!z3) {
                    if (z2 && str.length() > 0) {
                        i1w0 i1w0VarC = oeg0Var.c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                        FragmentScreen fragmentScreenZ = h03Var.z(str);
                        if (fragmentScreenZ instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenZ)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenZ)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (!pawVar.hasNext()) {
                                break;
                            }
                            i1w0VarC.a((oe50) pawVar.next());
                        }
                    } else {
                        if (or5Var != null) {
                            if (or5Var instanceof nr5) {
                                g(new uq5(((nr5) or5Var).f23986a, i3, z));
                            } else if (or5Var instanceof mr5) {
                                oeg0Var.c().d(new gc0(this, ((mr5) or5Var).f22252a, i3, z));
                            }
                        }
                        t9f.b();
                        return null;
                    }
                } else {
                    grj grjVar = (grj) this.l;
                    Uri uriI = i(str2);
                    String queryParameter = uriI.getQueryParameter(Payload.TYPE);
                    if (queryParameter != null) {
                        lowerCase = queryParameter.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase == null) {
                        lowerCase = "";
                    }
                    String queryParameter2 = uriI.getQueryParameter("subtype");
                    if (queryParameter2 != null) {
                        lowerCase2 = queryParameter2.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    } else {
                        lowerCase2 = null;
                    }
                    if (lowerCase2 == null) {
                        lowerCase2 = "";
                    }
                    if (lowerCase.equals("iframe") && lowerCase2.equals("casinopromo")) {
                        Uri uriI2 = i(str2);
                        String queryParameter3 = uriI2.getQueryParameter("subtype");
                        if (queryParameter3 != null) {
                            lowerCase3 = queryParameter3.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                        }
                        if (lowerCase3 == null) {
                            lowerCase3 = "";
                        }
                        String queryParameter4 = uriI2.getQueryParameter(RemoteMessageConst.Notification.URL);
                        String strY0 = queryParameter4 != null ? queryParameter4 : "";
                        if (lowerCase3.equals("promo")) {
                            strY0 = StringsKt.y0(StringsKt.d0("/promo-frame/", StringsKt.d0("/promo-frame/mobile-app/", strY0)), '/');
                        }
                        if (strY0.length() != 0) {
                            i1w0 i1w0VarC2 = oeg0Var.c();
                            i1w0VarC2.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                            h03Var.getClass();
                            FragmentScreen appScreens$PromoWebAggregatorFragmentScreen = new AppScreens$PromoWebAggregatorFragmentScreen(strY0);
                            if (appScreens$PromoWebAggregatorFragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) appScreens$PromoWebAggregatorFragmentScreen)));
                            } else {
                                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(appScreens$PromoWebAggregatorFragmentScreen)));
                            }
                            ListIterator listIteratorO2 = b1j.o(i1w0VarC2, copyOnWriteArrayList, 0);
                            while (true) {
                                paw pawVar2 = (paw) listIteratorO2;
                                if (!pawVar2.hasNext()) {
                                    break;
                                }
                                i1w0VarC2.a((oe50) pawVar2.next());
                            }
                        } else {
                            grjVar.a(str2);
                        }
                    } else {
                        grjVar.a(str2);
                    }
                }
            } else {
                Long lT0 = StringsKt.t0(strU);
                g(new tq5(lT0 != null ? lT0.longValue() : Long.MIN_VALUE));
            }
            g(new vq5(i4));
        } else {
            if (!Intrinsics.d(sq5Var, qq5.f29150a)) {
                t9f.b();
                return null;
            }
            e();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (m(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (l(r8, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(a.yfj r8, a.zje r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jc0.k(a.yfj, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
    
        if (r3.B(r9, r8, r13, r10) == r4) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(long r18, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jc0.l(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object m(zje zjeVar) {
        bgj bgjVar;
        if (zjeVar instanceof bgj) {
            bgjVar = (bgj) zjeVar;
            int i = bgjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgjVar.k = i - Integer.MIN_VALUE;
            } else {
                bgjVar = new bgj(this, zjeVar);
            }
        } else {
            bgjVar = new bgj(this, zjeVar);
        }
        bgj bgjVar2 = bgjVar;
        Object obj = bgjVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = bgjVar2.k;
        if (i2 == 0) {
            z1x.P(obj);
            List list = ((hgj) d()).b;
            qhj qhjVar = (qhj) CollectionsKt.firstOrNull(list);
            boolean z = qhjVar != null ? qhjVar.A : false;
            gbi gbiVar = (gbi) this.k;
            Object obj2 = null;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(vfc.M((qhj) it.next(), z));
            }
            gwe gweVar = gwe.DAY_EXPRESS;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((qhj) next).s != 0) {
                    obj2 = next;
                    break;
                }
            }
            qhj qhjVar2 = (qhj) obj2;
            long j = qhjVar2 != null ? qhjVar2.s : 0L;
            bgjVar2.k = 1;
            if (gbiVar.B(arrayList, gweVar, j, bgjVar2) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        g(fgj.f9495a);
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(oeg0 oeg0Var, znt zntVar, gbi gbiVar, std stdVar, ouu ouuVar) {
        super(new bmh((byte) 27));
        oeg0Var.getClass();
        this.i = oeg0Var;
        this.j = zntVar;
        this.k = gbiVar;
        this.l = stdVar;
        this.m = ouuVar;
    }
}
