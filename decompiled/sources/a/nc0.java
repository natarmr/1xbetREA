package a;

import android.net.Uri;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;
import org.xplatform.client1.features.appactivity.AppScreens$PromoWebAggregatorFragmentScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;
import org.xplatform.ufc.api.last_fights.LastFightsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class nc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23267a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;
    public Object n;

    public nc0(htz htzVar, mne mneVar, gii0 gii0Var, btt0 btt0Var, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, ii iiVar, njo njoVar, wgu wguVar) {
        this.d = gii0Var;
        this.e = njoVar;
        this.f = btt0Var;
        this.g = wguVar;
        this.c = ctf0Var;
        this.h = i1w0Var;
        this.i = dujVar;
        this.f23267a = mneVar;
        byte b = 23;
        this.b = mbl.b(new dci(this, 3, b));
        this.j = mbl.b(new dci(this, 2, b));
        this.k = mbl.b(new dci(this, 1, b));
        this.l = mbl.b(new dci(this, 4, b));
        this.m = mbl.b(new dci(this, 5, b));
        this.n = n0k0.a(new dci(this, 0, b));
    }

    public Object A(k9s k9sVar, zlv zlvVar) {
        Long l = k9sVar.I;
        if (((sff0) this.n).m0 || l == null) {
            return Unit.f46060a;
        }
        Object objJ = d5c.J(zlvVar, new hgv((Object) this, l, (l9s) k9sVar, (yje) null, (byte) 5));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    public lhf0 a() {
        khf0 khf0Var = new khf0((gii0) this.d, (x2c0) this.e);
        knf0 knf0Var = (knf0) this.f;
        mne mneVarH = ((psc) ((cad) this.g).b).h();
        x1x.x(mneVarH);
        return new lhf0(khf0Var, knf0Var, mneVarH);
    }

    public peg0 b() {
        return new peg0((Object) new wsf0((ctf0) this.c), (byte) 6);
    }

    public boolean c() {
        List listL;
        List listA;
        rpt rptVar = (rpt) this.i;
        List listL2 = rptVar.l(true);
        return (listL2 == null || listL2.isEmpty()) && ((listL = rptVar.l(false)) == null || listL.isEmpty()) && ((listA = ((i9u) this.b).a()) == null || listA.isEmpty());
    }

    public uii d() {
        return new uii((phj) this.i, new xr((gii0) this.b, (byte) 29), ((cih) ((vqc) this.j).b).a(), (edo) this.k, (zfo) this.c, (knf0) this.l);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object e(s77 s77Var, String str, String str2, zje zjeVar) {
        nfu nfuVar;
        boolean z;
        tnm0 tnm0Var = (tnm0) ((ugf0) this.g).f35622a;
        if (zjeVar instanceof nfu) {
            nfuVar = (nfu) zjeVar;
            int i = nfuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfuVar.k = i - Integer.MIN_VALUE;
            } else {
                nfuVar = new nfu(this, zjeVar);
            }
        } else {
            nfuVar = new nfu(this, zjeVar);
        }
        Object objD0 = nfuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = nfuVar.k;
        if (i2 == 0) {
            z1x.P(objD0);
            u21 u21Var = tnm0Var.d;
            rrd rrdVar = (rrd) this.d;
            long jS = s(s77Var);
            long jB = ((l77) this.f).b(s77Var, true) / 1000;
            int i3 = u21Var.b.f36661a;
            boolean z2 = k().f32117a.b.h;
            r21 r21Var = u21Var.c;
            nfuVar.k = 1;
            objD0 = qjj.d0(((mne) rrdVar.b).b, new b6w(rrdVar, jS, jB, i3, str2, r21Var, s77Var, str, z2, null), nfuVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objD0) {
            n3w n3wVar = (n3w) obj;
            v21 v21Var = n3wVar.h1;
            r21 r21Var2 = n3wVar.i1;
            tnm0Var.getClass();
            int iOrdinal = tnm0Var.d.b.ordinal();
            boolean z3 = false;
            if (iOrdinal == 0) {
                z = false;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        if (v21Var != v21.LIVE_AGGREGATOR) {
                            z = false;
                        }
                    } else if (v21Var != v21.SLOTS) {
                        z = false;
                    }
                }
                z = true;
            }
            int iOrdinal2 = tnm0Var.d.c.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    z3 = true;
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return null;
                    }
                    if (r21Var2 == r21.FREE_SPINS) {
                        z3 = true;
                    }
                } else if (r21Var2 == r21.REAL_MONEY) {
                    z3 = true;
                }
            }
            if (z && z3) {
                arrayList.add(obj);
            }
        }
        return new gbr(arrayList, GeneralBetInfoModel.h);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x019b  */
    /* JADX WARN: Code duplicated, block: B:35:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object f(sys0 sys0Var, s77 s77Var, zje zjeVar) {
        ofu ofuVar;
        sys0 sys0Var2;
        s77 s77Var2;
        Object obj;
        List listA;
        int id;
        gr00 gr00Var;
        Object obj2;
        Object obj3;
        long j;
        String str;
        long j2;
        boolean z;
        long j3;
        List list;
        Object objB;
        Object obj4;
        long j4;
        String str2;
        List list2;
        int i;
        s77 s77Var3;
        List list3;
        long j5;
        Object obj5;
        boolean z2;
        j1q0 j1q0Var = (j1q0) this.m;
        if (zjeVar instanceof ofu) {
            ofuVar = (ofu) zjeVar;
            int i2 = ofuVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ofuVar.w = i2 - Integer.MIN_VALUE;
            } else {
                ofuVar = new ofu(this, zjeVar);
            }
        } else {
            ofuVar = new ofu(this, zjeVar);
        }
        Object objD0 = ofuVar.u;
        Object obj6 = wne.f39444a;
        int i3 = ofuVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                s77 s77Var4 = ofuVar.j;
                sys0 sys0Var3 = ofuVar.i;
                z1x.P(objD0);
                s77Var2 = s77Var4;
                sys0Var2 = sys0Var3;
                obj = objD0;
            } else if (i3 == 2) {
                boolean z3 = ofuVar.t;
                int i4 = ofuVar.s;
                long j6 = ofuVar.r;
                long j7 = ofuVar.q;
                long j8 = ofuVar.p;
                s77 s77Var5 = ofuVar.n;
                String str3 = ofuVar.m;
                List list4 = ofuVar.l;
                gr00 gr00Var2 = ofuVar.k;
                z1x.P(objD0);
                obj3 = obj6;
                str = str3;
                obj2 = objD0;
                z = z3;
                j2 = j6;
                listA = list4;
                j = j7;
                id = i4;
                s77Var2 = s77Var5;
                gr00Var = gr00Var2;
                j3 = j8;
                list = (List) obj2;
                zfo zfoVar = (zfo) this.i;
                ofuVar.i = null;
                ofuVar.j = null;
                ofuVar.k = gr00Var;
                ofuVar.l = listA;
                ofuVar.m = str;
                ofuVar.n = s77Var2;
                ofuVar.o = list;
                ofuVar.p = j3;
                ofuVar.q = j;
                ofuVar.r = j2;
                ofuVar.s = id;
                ofuVar.t = z;
                ofuVar.w = 3;
                objB = zfoVar.b(ofuVar);
                obj4 = obj3;
                if (objB == obj4) {
                    return obj4;
                }
                j4 = j2;
                str2 = str;
                list2 = listA;
                i = id;
                s77Var3 = s77Var2;
                list3 = list;
                j5 = j;
                obj5 = objB;
                boolean z4 = z;
                long j9 = j3;
                List list5 = (List) obj5;
                boolean zJ = j1q0Var.f15748a.j();
                boolean z5 = k().J1;
                if (j1q0Var.f15748a.f()) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                ofuVar.i = null;
                ofuVar.j = null;
                ofuVar.k = null;
                ofuVar.l = null;
                ofuVar.m = null;
                ofuVar.n = null;
                ofuVar.o = null;
                ofuVar.w = 4;
                objD0 = qjj.d0(((mne) gr00Var.f11760a).b, new yw4(gr00Var, i, j4, list2, j9, j5, s77Var3, str2, z4, list3, list5, zJ, z5, z2, null), ofuVar);
                if (objD0 == obj4) {
                    return obj4;
                }
            } else if (i3 == 3) {
                z = ofuVar.t;
                int i5 = ofuVar.s;
                long j10 = ofuVar.r;
                long j11 = ofuVar.q;
                j3 = ofuVar.p;
                List list6 = ofuVar.o;
                s77 s77Var6 = ofuVar.n;
                String str4 = ofuVar.m;
                List list7 = ofuVar.l;
                gr00 gr00Var3 = ofuVar.k;
                z1x.P(objD0);
                list2 = list7;
                i = i5;
                str2 = str4;
                s77Var3 = s77Var6;
                j4 = j10;
                j5 = j11;
                list3 = list6;
                gr00Var = gr00Var3;
                obj4 = obj6;
                obj5 = objD0;
                boolean z6 = z;
                long j12 = j3;
                List list8 = (List) obj5;
                boolean zJ2 = j1q0Var.f15748a.j();
                boolean z7 = k().J1;
                if (j1q0Var.f15748a.f() || k().O1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ofuVar.i = null;
                ofuVar.j = null;
                ofuVar.k = null;
                ofuVar.l = null;
                ofuVar.m = null;
                ofuVar.n = null;
                ofuVar.o = null;
                ofuVar.w = 4;
                objD0 = qjj.d0(((mne) gr00Var.f11760a).b, new yw4(gr00Var, i, j4, list2, j12, j5, s77Var3, str2, z6, list3, list8, zJ2, z7, z2, null), ofuVar);
                if (objD0 == obj4) {
                    return obj4;
                }
            } else {
                if (i3 != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            return new gbr((List) objD0, GeneralBetInfoModel.h);
        }
        z1x.P(objD0);
        ofuVar.i = sys0Var;
        ofuVar.j = s77Var;
        ofuVar.w = 1;
        Object objG = g(ofuVar);
        if (objG == obj6) {
            return obj6;
        }
        sys0Var2 = sys0Var;
        s77Var2 = s77Var;
        obj = objG;
        ql5 ql5Var = (ql5) obj;
        gm7 gm7Var = k().f32117a.f12063a;
        q57 q57Var = k().f32117a.b;
        gr00 gr00Var4 = (gr00) this.e;
        long jS = s(s77Var2);
        long jB = ((l77) this.f).b(s77Var2, true) / 1000;
        long j13 = ql5Var.f28916a;
        ugf0 ugf0Var = (ugf0) this.g;
        boolean z8 = gm7Var.m;
        boolean z9 = gm7Var.n;
        boolean z10 = gm7Var.q;
        sys0Var2.getClass();
        listA = ((tnm0) ugf0Var.f35622a).a(sys0Var2, s77Var2, z8, z9, z10);
        String str5 = ql5Var.f;
        id = ((uzc) this.h).b().getId();
        boolean z11 = q57Var.h;
        edo edoVar = (edo) this.b;
        ofuVar.i = null;
        ofuVar.j = null;
        gr00Var = gr00Var4;
        ofuVar.k = gr00Var;
        ofuVar.l = listA;
        ofuVar.m = str5;
        ofuVar.n = s77Var2;
        ofuVar.p = jS;
        ofuVar.q = jB;
        ofuVar.r = j13;
        ofuVar.s = id;
        ofuVar.t = z11;
        ofuVar.w = 2;
        Object objB2 = edoVar.b(ofuVar);
        if (objB2 == obj6) {
            return obj6;
        }
        obj2 = objB2;
        obj3 = obj6;
        j = jB;
        str = str5;
        j2 = j13;
        z = z11;
        j3 = jS;
        list = (List) obj2;
        zfo zfoVar2 = (zfo) this.i;
        ofuVar.i = null;
        ofuVar.j = null;
        ofuVar.k = gr00Var;
        ofuVar.l = listA;
        ofuVar.m = str;
        ofuVar.n = s77Var2;
        ofuVar.o = list;
        ofuVar.p = j3;
        ofuVar.q = j;
        ofuVar.r = j2;
        ofuVar.s = id;
        ofuVar.t = z;
        ofuVar.w = 3;
        objB = zfoVar2.b(ofuVar);
        obj4 = obj3;
        if (objB == obj4) {
            return obj4;
        }
        j4 = j2;
        str2 = str;
        list2 = listA;
        i = id;
        s77Var3 = s77Var2;
        list3 = list;
        j5 = j;
        obj5 = objB;
        boolean z12 = z;
        long j14 = j3;
        List list9 = (List) obj5;
        boolean zJ3 = j1q0Var.f15748a.j();
        boolean z13 = k().J1;
        if (j1q0Var.f15748a.f()) {
            z2 = true;
        } else {
            z2 = true;
        }
        ofuVar.i = null;
        ofuVar.j = null;
        ofuVar.k = null;
        ofuVar.l = null;
        ofuVar.m = null;
        ofuVar.n = null;
        ofuVar.o = null;
        ofuVar.w = 4;
        objD0 = qjj.d0(((mne) gr00Var.f11760a).b, new yw4(gr00Var, i, j4, list2, j14, j5, s77Var3, str2, z12, list3, list9, zJ3, z13, z2, null), ofuVar);
        if (objD0 == obj4) {
            return obj4;
        }
        return new gbr((List) objD0, GeneralBetInfoModel.h);
    }

    public Object g(zje zjeVar) {
        return qjj.d0(((mne) this.f23267a).b, new gkr(this, null, (byte) 14), zjeVar);
    }

    public hsj h() {
        return new hsj(a(), (j1q0) this.f23267a);
    }

    public dnq i(long j, sip sipVar, ypl0 ypl0Var) {
        yje yjeVar = null;
        byte b = 10;
        return new dnq(aoq.c(aoq.c(new vsg0(new o3s(this, sipVar, yjeVar, b)), new gxt(null, this, j, sipVar, (byte) 2)), new fe0(yjeVar, ypl0Var, this, b)), new rl2(3, yjeVar, (byte) 27), (byte) 1);
    }

    public wsf0 j() {
        return new wsf0((dn0) ((n5d0) this.n).get());
    }

    public sff0 k() {
        return (sff0) ((n0o0) this.n).getValue();
    }

    public Uri l(String str) {
        return Uri.parse(((ctf0) this.c).b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)) + "://" + str);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x035e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0364  */
    /* JADX WARN: Code duplicated, block: B:32:0x0371  */
    /* JADX WARN: Code duplicated, block: B:35:0x03de  */
    /* JADX WARN: Code duplicated, block: B:39:0x0449  */
    /* JADX WARN: Code duplicated, block: B:43:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0509  */
    /* JADX WARN: Code duplicated, block: B:55:0x0555  */
    /* JADX WARN: Code duplicated, block: B:59:0x05df  */
    /* JADX WARN: Code duplicated, block: B:63:0x0658  */
    /* JADX WARN: Code duplicated, block: B:67:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x070e  */
    /* JADX WARN: Code duplicated, block: B:74:0x071a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0756  */
    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX WARN: Code duplicated, block: B:83:0x076a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0775  */
    /* JADX WARN: Code duplicated, block: B:91:0x077d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x054d, code lost:
    
        if (r1 == r4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(a.s77 r60, java.lang.String r61, java.lang.String r62, boolean r63, java.lang.String r64, a.zje r65) {
        /*
            Method dump skipped, instruction units count: 1956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nc0.m(a.s77, java.lang.String, java.lang.String, boolean, java.lang.String, a.zje):java.lang.Object");
    }

    public iqi n() {
        return new iqi(a(), (j1q0) this.f23267a);
    }

    public jtj o() {
        dn0 dn0Var = (dn0) ((n5d0) this.n).get();
        mne mneVarH = ((psc) ((cad) this.g).b).h();
        x1x.x(mneVarH);
        return new jtj(dn0Var, mneVarH);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x0113  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object p(sys0 sys0Var, s77 s77Var, zje zjeVar) {
        qfu qfuVar;
        sys0 sys0Var2;
        s77 s77Var2;
        Object objG;
        sys0 sys0Var3;
        s77 s77Var3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ivo0 ivo0Var;
        ivo0 ivo0Var2;
        if (zjeVar instanceof qfu) {
            qfuVar = (qfu) zjeVar;
            int i = qfuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qfuVar.m = i - Integer.MIN_VALUE;
            } else {
                qfuVar = new qfu(this, zjeVar);
            }
        } else {
            qfuVar = new qfu(this, zjeVar);
        }
        Object obj = qfuVar.k;
        Object obj2 = wne.f39444a;
        int i2 = qfuVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            sys0Var2 = sys0Var;
            qfuVar.i = sys0Var2;
            s77Var2 = s77Var;
            qfuVar.j = s77Var2;
            qfuVar.m = 1;
            objG = g(qfuVar);
            if (objG != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            s77Var2 = qfuVar.j;
            sys0 sys0Var4 = qfuVar.i;
            z1x.P(obj);
            objG = obj;
            sys0Var2 = sys0Var4;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s77Var3 = qfuVar.j;
            sys0Var3 = qfuVar.i;
            z1x.P(obj);
        }
        Iterable<n3w> iterable = (Iterable) obj;
        arrayList = new ArrayList(r3d.q(iterable, 10));
        for (n3w n3wVarD : iterable) {
            ivo0Var = n3wVarD.z1.f;
            ivo0Var2 = ivo0.c;
            if (!Intrinsics.d(ivo0Var, ivo0Var2)) {
                hxu hxuVar = n3wVarD.z1;
                n3wVarD = n3w.d(n3wVarD, null, 0.0d, null, null, 0L, null, 0.0d, hxuVar.f.b, null, null, null, false, null, hxu.a(hxuVar, ivo0Var2, 0.0d, 95), null, -32769, -1048577);
            }
            arrayList.add(n3wVarD);
        }
        arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((ugf0) this.g).h0(sys0Var3, s77Var3, ((n3w) obj3).l)) {
                arrayList2.add(obj3);
            }
        }
        return new gbr(arrayList2, GeneralBetInfoModel.h);
        rrd rrdVar = (rrd) this.d;
        long jS = s(s77Var2);
        long jB = ((l77) this.f).b(s77Var2, true) / 1000;
        long j = ((ql5) objG).f28916a;
        int id = ((uzc) this.h).b().getId();
        int i3 = k().Y;
        qfuVar.i = sys0Var2;
        qfuVar.j = s77Var2;
        qfuVar.m = 2;
        Object objD0 = qjj.d0(((mne) rrdVar.b).b, new g6w(rrdVar, j, jS, jB, id, i3, null), qfuVar);
        if (objD0 != obj2) {
            sys0Var3 = sys0Var2;
            obj = objD0;
            s77Var3 = s77Var2;
            Iterable<n3w> iterable2 = (Iterable) obj;
            arrayList = new ArrayList(r3d.q(iterable2, 10));
            while (r1.hasNext()) {
                ivo0Var = n3wVarD.z1.f;
                ivo0Var2 = ivo0.c;
                if (!Intrinsics.d(ivo0Var, ivo0Var2)) {
                    hxu hxuVar2 = n3wVarD.z1;
                    n3wVarD = n3w.d(n3wVarD, null, 0.0d, null, null, 0L, null, 0.0d, hxuVar2.f.b, null, null, null, false, null, hxu.a(hxuVar2, ivo0Var2, 0.0d, 95), null, -32769, -1048577);
                }
                arrayList.add(n3wVarD);
            }
            arrayList2 = new ArrayList();
            while (r4.hasNext()) {
                if (((ugf0) this.g).h0(sys0Var3, s77Var3, ((n3w) obj3).l)) {
                    arrayList2.add(obj3);
                }
            }
            return new gbr(arrayList2, GeneralBetInfoModel.h);
        }
        return obj2;
    }

    public hsj q() {
        return new hsj((j1q0) this.f23267a, new n31(new xzp((gii0) this.d, (x2c0) this.e), (knf0) this.f, (j51) this.h, (x2c0) this.e, (btt0) this.j));
    }

    public dq00 r() {
        return new dq00(new std(), (wdk0) this.f23267a, (ii) this.h);
    }

    public long s(s77 s77Var) {
        return ((l77) this.f).a(s77Var) / 1000;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object t(sys0 sys0Var, s77 s77Var, zje zjeVar) {
        rfu rfuVar;
        sys0 sys0Var2;
        s77 s77Var2;
        Object objG;
        sys0 sys0Var3;
        s77 s77Var3;
        ArrayList arrayList;
        if (zjeVar instanceof rfu) {
            rfuVar = (rfu) zjeVar;
            int i = rfuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rfuVar.m = i - Integer.MIN_VALUE;
            } else {
                rfuVar = new rfu(this, zjeVar);
            }
        } else {
            rfuVar = new rfu(this, zjeVar);
        }
        Object obj = rfuVar.k;
        Object obj2 = wne.f39444a;
        int i2 = rfuVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            sys0Var2 = sys0Var;
            rfuVar.i = sys0Var2;
            s77Var2 = s77Var;
            rfuVar.j = s77Var2;
            rfuVar.m = 1;
            objG = g(rfuVar);
            if (objG != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            s77Var2 = rfuVar.j;
            sys0 sys0Var4 = rfuVar.i;
            z1x.P(obj);
            objG = obj;
            sys0Var2 = sys0Var4;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s77Var3 = rfuVar.j;
            sys0Var3 = rfuVar.i;
            z1x.P(obj);
        }
        arrayList = new ArrayList();
        for (Object obj3 : (List) obj) {
            if (((ugf0) this.g).h0(sys0Var3, s77Var3, ((n3w) obj3).l)) {
                arrayList.add(obj3);
            }
        }
        return new gbr(arrayList, GeneralBetInfoModel.h);
        ql5 ql5Var = (ql5) objG;
        rrd rrdVar = (rrd) this.d;
        long jS = s(s77Var2);
        long jB = ((l77) this.f).b(s77Var2, true) / 1000;
        ((ort) this.j).b();
        long j = ql5Var.f28916a;
        String str = ql5Var.f;
        int id = ((uzc) this.h).b().getId();
        rfuVar.i = sys0Var2;
        rfuVar.j = s77Var2;
        rfuVar.m = 2;
        Object objD0 = qjj.d0(((mne) rrdVar.b).b, new h6w(rrdVar, j, jS, jB, id, str, null), rfuVar);
        if (objD0 != obj2) {
            sys0Var3 = sys0Var2;
            obj = objD0;
            s77Var3 = s77Var2;
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (((ugf0) this.g).h0(sys0Var3, s77Var3, ((n3w) obj3).l)) {
                    arrayList.add(obj3);
                }
            }
            return new gbr(arrayList, GeneralBetInfoModel.h);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(k9s k9sVar, long j, zje zjeVar) {
        ylv ylvVar;
        if (zjeVar instanceof ylv) {
            ylvVar = (ylv) zjeVar;
            int i = ylvVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ylvVar.l = i - Integer.MIN_VALUE;
            } else {
                ylvVar = new ylv(this, zjeVar);
            }
        } else {
            ylvVar = new ylv(this, zjeVar);
        }
        Object obj = ylvVar.j;
        wne wneVar = wne.f39444a;
        int i2 = ylvVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            rbu rbuVar = (rbu) this.c;
            rbuVar.f30207a.a(new s5s(j, k9sVar.z, k9sVar.B));
            g090 g090Var = (g090) this.f;
            ylvVar.i = k9sVar;
            ylvVar.l = 1;
            if (g090Var.p(k9sVar, ylvVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k9sVar = ylvVar.i;
            z1x.P(obj);
        }
        ((pv00) this.d).n(xcm0.t(k9sVar));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object v(long j, long j2, Date date, int i, zje zjeVar) {
        t3v t3vVar;
        Date date2;
        byte b;
        long j3;
        long j4;
        t3v t3vVar2;
        char c;
        int i2;
        Date date3;
        long j5;
        long j6;
        char c2;
        ypl0 ypl0Var;
        int i3;
        long j7;
        Date date4;
        long j8;
        byte b2;
        if (zjeVar instanceof t3v) {
            t3vVar = (t3v) zjeVar;
            int i4 = t3vVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t3vVar.q = i4 - Integer.MIN_VALUE;
            } else {
                t3vVar = new t3v(this, zjeVar);
            }
        } else {
            t3vVar = new t3v(this, zjeVar);
        }
        Object objX = t3vVar.o;
        wne wneVar = wne.f39444a;
        int i5 = t3vVar.q;
        int i6 = 3;
        if (i5 == 0) {
            z1x.P(objX);
            pmi pmiVar = (pmi) this.k;
            t3vVar.k = date;
            t3vVar.i = j;
            t3vVar.j = j2;
            t3vVar.m = i;
            t3vVar.q = 1;
            objX = pmiVar.x(t3vVar);
            if (objX != wneVar) {
                date2 = date;
                b = i;
                j3 = j;
                j4 = j2;
            }
            return wneVar;
        }
        if (i5 == 1) {
            byte b3 = t3vVar.m;
            j4 = t3vVar.j;
            j3 = t3vVar.i;
            date2 = t3vVar.k;
            z1x.P(objX);
            b = b3;
        } else {
            if (i5 == 2) {
                i2 = t3vVar.n;
                char c3 = t3vVar.m;
                j4 = t3vVar.j;
                j3 = t3vVar.i;
                date2 = t3vVar.k;
                z1x.P(objX);
                c = c3;
                t3vVar2 = t3vVar;
                date3 = date2;
                j5 = j3;
                j6 = j4;
                c2 = c;
                ypl0Var = (ypl0) objX;
                a7q a7qVar = (a7q) this.f23267a;
                t3vVar2.k = date3;
                t3vVar2.l = ypl0Var;
                t3vVar2.i = j5;
                t3vVar2.j = j6;
                t3vVar2.m = c2 == true ? (byte) 1 : (byte) 0;
                t3vVar2.n = i2;
                t3vVar2.q = 3;
                objX = ((cyu) a7qVar.f384a).k(j5, t3vVar2);
                if (objX != wneVar) {
                    i3 = i2;
                    j7 = j6;
                    date4 = date3;
                    j8 = j5;
                    b2 = c2 == true ? 1 : 0;
                }
                return wneVar;
            }
            if (i5 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = t3vVar.n;
            byte b4 = t3vVar.m;
            long j9 = t3vVar.j;
            long j10 = t3vVar.i;
            ypl0Var = t3vVar.l;
            Date date5 = t3vVar.k;
            z1x.P(objX);
            b2 = b4;
            j7 = j9;
            date4 = date5;
            i3 = i7;
            j8 = j10;
        }
        ypl0 ypl0Var2 = ypl0Var;
        qgg qggVar = (qgg) objX;
        yje yjeVar = null;
        vsg0 vsg0Var = new vsg0(new n1((Object) this, j7, yjeVar, (byte) 16));
        vsg0 vsg0Var2 = new vsg0(new o3s(this, yjeVar, (byte) 11));
        dnq dnqVarI = i(j8, sip.c, ypl0Var2);
        dnq dnqVarI2 = i(j8, sip.b, ypl0Var2);
        vsg0 vsg0Var3 = new vsg0(new jc1(this, j8, j7, null, (byte) 5));
        byte b5 = 4;
        byte b6 = 1;
        a1g a1gVarF0 = dub.f0(dnqVarI, dnqVarI2, new dnq(new ak9(vsg0Var3, b5), new rl2(i6, yjeVar, (byte) 28), b6), new ipt(b5, yjeVar, b6));
        int i8 = i3;
        byte b7 = b2;
        return dub.e0(a1gVarF0, vsg0Var, vsg0Var2, aoq.c(new vsg0(new j3v(this, j8, i8, b7 == true ? 1 : 0, date4, null)), new m3v(null, this, j8, i8, b7 == true ? 1 : 0)), new u3v(this, j8, ypl0Var2, qggVar, null));
        int iIntValue = ((Number) objX).intValue();
        j3c j3cVar = (j3c) this.d;
        t3vVar.k = date2;
        t3vVar.i = j3;
        t3vVar.j = j4;
        t3vVar.m = b;
        t3vVar.n = iIntValue;
        t3vVar.q = 2;
        t3v t3vVar3 = t3vVar;
        Object objA = j3cVar.a(40L, j4, t3vVar3);
        t3vVar2 = t3vVar3;
        if (objA != wneVar) {
            c = b;
            i2 = iIntValue;
            objX = objA;
            date3 = date2;
            j5 = j3;
            j6 = j4;
            c2 = c;
            ypl0Var = (ypl0) objX;
            a7q a7qVar2 = (a7q) this.f23267a;
            t3vVar2.k = date3;
            t3vVar2.l = ypl0Var;
            t3vVar2.i = j5;
            t3vVar2.j = j6;
            t3vVar2.m = c2 == true ? (byte) 1 : (byte) 0;
            t3vVar2.n = i2;
            t3vVar2.q = 3;
            objX = ((cyu) a7qVar2.f384a).k(j5, t3vVar2);
            if (objX != wneVar) {
                i3 = i2;
                j7 = j6;
                date4 = date3;
                j8 = j5;
                b2 = c2 == true ? 1 : 0;
                ypl0 ypl0Var3 = ypl0Var;
                qgg qggVar2 = (qgg) objX;
                yje yjeVar2 = null;
                vsg0 vsg0Var4 = new vsg0(new n1((Object) this, j7, yjeVar2, (byte) 16));
                vsg0 vsg0Var5 = new vsg0(new o3s(this, yjeVar2, (byte) 11));
                dnq dnqVarI3 = i(j8, sip.c, ypl0Var3);
                dnq dnqVarI4 = i(j8, sip.b, ypl0Var3);
                vsg0 vsg0Var6 = new vsg0(new jc1(this, j8, j7, null, (byte) 5));
                byte b8 = 4;
                byte b9 = 1;
                a1g a1gVarF1 = dub.f0(dnqVarI3, dnqVarI4, new dnq(new ak9(vsg0Var6, b8), new rl2(i6, yjeVar2, (byte) 28), b9), new ipt(b8, yjeVar2, b9));
                int i9 = i3;
                byte b10 = b2;
                return dub.e0(a1gVarF1, vsg0Var4, vsg0Var5, aoq.c(new vsg0(new j3v(this, j8, i9, b10 == true ? 1 : 0, date4, null)), new m3v(null, this, j8, i9, b10 == true ? 1 : 0)), new u3v(this, j8, ypl0Var3, qggVar2, null));
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d9 A[PHI: r0 r2
  0x00d9: PHI (r0v3 a.q5z) = (r0v1 a.q5z), (r0v4 a.q5z) binds: [B:34:0x00d5, B:18:0x0080] A[DONT_GENERATE, DONT_INLINE]
  0x00d9: PHI (r2v3 long) = (r2v1 long), (r2v7 long) binds: [B:34:0x00d5, B:18:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:57:0x016b A[PHI: r0 r2
  0x016b: PHI (r0v14 a.q5z) = (r0v11 a.q5z), (r0v15 a.q5z) binds: [B:55:0x0168, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x016b: PHI (r2v10 long) = (r2v8 long), (r2v11 long) binds: [B:55:0x0168, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:63:0x018a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:66:0x018f A[PHI: r0 r2
  0x018f: PHI (r0v16 a.q5z) = (r0v14 a.q5z), (r0v17 a.q5z) binds: [B:64:0x018c, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r2v12 long) = (r2v10 long), (r2v13 long) binds: [B:64:0x018c, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2 A[PHI: r0 r2
  0x01a2: PHI (r0v18 a.q5z) = (r0v16 a.q5z), (r0v26 a.q5z) binds: [B:67:0x019f, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x01a2: PHI (r2v14 long) = (r2v12 long), (r2v18 long) binds: [B:67:0x019f, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cb A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (r1 == r10) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cd, code lost:
    
        if (r0 == r10) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(long r17, a.q5z r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nc0.w(long, a.q5z, a.zje):java.lang.Object");
    }

    public pzu x() {
        return new pzu(new abu((gii0) this.f23267a, (byte) 25), (dzz) this.h, (xio) this.i, (czz) this.b, (btt0) this.j, (knf0) this.k);
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01fb  */
    public void y(lr5 lr5Var, int i, String str, bvc bvcVar, Function1 function1) {
        bvc bvcVar2;
        Function1 function2;
        nc0 nc0Var;
        lr5 lr5Var2;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        bby bbyVar;
        h03 h03Var = (h03) this.e;
        mne mneVar = (mne) this.f23267a;
        oeg0 oeg0Var = (oeg0) this.d;
        lr5Var.getClass();
        String strU = phu0.U(lr5Var);
        String str2 = lr5Var.i;
        boolean z = lr5Var.j;
        String str3 = lr5Var.h;
        yje yjeVar = null;
        if (!phu0.P(lr5Var) || strU.length() <= 0) {
            boolean z2 = str3.length() > 0 && !StringsKt.O(str3, String.valueOf(lr5Var.f20512a), false);
            if (!(lr5Var.l instanceof mr5)) {
                z2 = z && z2;
            }
            if (!z2) {
                if (z && str2.length() > 0) {
                    i1w0 i1w0VarC = oeg0Var.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                    FragmentScreen fragmentScreenZ = h03Var.z(str2);
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
                        } else {
                            i1w0VarC.a((oe50) pawVar.next());
                        }
                    }
                } else if (lr5Var.k == oo5.ACTION_ONE_X_GAME) {
                    i1w0 i1w0VarC2 = oeg0Var.c();
                    function2 = function1;
                    lr5Var2 = lr5Var;
                    nc0Var = this;
                    i1w0VarC2.d(new kc0(this, lr5Var2, i, bvcVar, function2));
                    bvcVar2 = bvcVar;
                } else {
                    bvcVar2 = bvcVar;
                    function2 = function1;
                    nc0Var = this;
                    lr5Var2 = lr5Var;
                    nc0Var.z(lr5Var2, i, bvcVar2, function2);
                }
                bbyVar = (bby) nc0Var.m;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                nc0Var.m = sac.V(bvcVar2, new t90(1, function2, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 6), null, mneVar.b, new oa(nc0Var, lr5Var2, yjeVar, (byte) 6), 10);
            }
            grj grjVar = (grj) this.h;
            Uri uriL = l(str3);
            String queryParameter = uriL.getQueryParameter(Payload.TYPE);
            if (queryParameter != null) {
                lowerCase = queryParameter.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            String queryParameter2 = uriL.getQueryParameter("subtype");
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
                Uri uriL2 = l(str3);
                String queryParameter3 = uriL2.getQueryParameter("subtype");
                if (queryParameter3 != null) {
                    lowerCase3 = queryParameter3.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                } else {
                    lowerCase3 = null;
                }
                if (lowerCase3 == null) {
                    lowerCase3 = "";
                }
                String queryParameter4 = uriL2.getQueryParameter(RemoteMessageConst.Notification.URL);
                String strY0 = queryParameter4 != null ? queryParameter4 : "";
                if (lowerCase3.equals("promo")) {
                    strY0 = StringsKt.y0(StringsKt.d0("/promo-frame/", StringsKt.d0("/promo-frame/mobile-app/", strY0)), '/');
                }
                if (strY0.length() != 0) {
                    i1w0 i1w0VarC3 = oeg0Var.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC3);
                    FragmentScreen appScreens$PromoWebAggregatorFragmentScreen = new AppScreens$PromoWebAggregatorFragmentScreen(strY0);
                    if (appScreens$PromoWebAggregatorFragmentScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) appScreens$PromoWebAggregatorFragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(appScreens$PromoWebAggregatorFragmentScreen)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0VarC3, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (!pawVar2.hasNext()) {
                            break;
                        } else {
                            i1w0VarC3.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    grjVar.b(str3);
                }
            } else {
                grjVar.b(str3);
            }
            bvcVar2 = bvcVar;
        } else {
            Long lT0 = StringsKt.t0(strU);
            long jLongValue = lT0 != null ? lT0.longValue() : Long.MIN_VALUE;
            bby bbyVar2 = (bby) this.n;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bvcVar2 = bvcVar;
            this.n = sac.V(bvcVar2, new t90(1, function1, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 5), null, mneVar.b, new ir((Object) this, jLongValue, (Object) str, (yje) null, (byte) 2), 10);
        }
        function2 = function1;
        nc0Var = this;
        lr5Var2 = lr5Var;
        bbyVar = (bby) nc0Var.m;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        nc0Var.m = sac.V(bvcVar2, new t90(1, function2, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 6), null, mneVar.b, new oa(nc0Var, lr5Var2, yjeVar, (byte) 6), 10);
    }

    public void z(lr5 lr5Var, int i, bvc bvcVar, Function1 function1) {
        or5 or5Var = lr5Var.l;
        if (or5Var != null) {
            if (or5Var instanceof nr5) {
                kr5 kr5Var = ((nr5) or5Var).f23986a;
                bby bbyVar = (bby) this.l;
                yje yjeVar = null;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.l = sac.V(bvcVar, new t90(1, function1, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 7), null, ((mne) this.f23267a).b, new mc0((Object) this, (Object) kr5Var, i, yjeVar, (byte) 0), 10);
                return;
            }
            if (or5Var instanceof mr5) {
                uvc uvcVar = ((mr5) or5Var).f22252a;
                i1w0 i1w0VarC = ((oeg0) this.d).c();
                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                k0w0VarI.h(new PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1(uvcVar.f36341a, i, mvc.CMS_CODE_LIVE_CASINO, false));
                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                }
            }
        }
        t9f.b();
    }

    public nc0(pv00 pv00Var, ntt nttVar, g090 g090Var, fck0 fck0Var, afm0 afm0Var, glt0 glt0Var, qbu qbuVar, drm0 drm0Var, viu viuVar, ntu ntuVar, rbu rbuVar, pru pruVar, owp0 owp0Var, epi0 epi0Var) {
        this.d = pv00Var;
        this.e = nttVar;
        this.f = g090Var;
        this.g = fck0Var;
        this.f23267a = afm0Var;
        this.h = glt0Var;
        this.i = qbuVar;
        this.b = drm0Var;
        this.j = viuVar;
        this.k = ntuVar;
        this.c = rbuVar;
        this.l = owp0Var;
        this.m = epi0Var;
        this.n = pruVar.a();
    }

    public nc0(oeg0 oeg0Var, h03 h03Var, pw70 pw70Var, uzc0 uzc0Var, mne mneVar, grj grjVar, jlx jlxVar, pru pruVar, qyg0 qyg0Var, pyg0 pyg0Var, ctf0 ctf0Var) {
        oeg0Var.getClass();
        pw70Var.getClass();
        ctf0Var.getClass();
        this.d = oeg0Var;
        this.e = h03Var;
        this.f = pw70Var;
        this.g = uzc0Var;
        this.f23267a = mneVar;
        this.h = grjVar;
        this.i = jlxVar;
        this.b = pruVar;
        this.j = qyg0Var;
        this.k = pyg0Var;
        this.c = ctf0Var;
    }

    public nc0(rtu rtuVar, ieu ieuVar, k7u k7uVar, rpt rptVar, n4u n4uVar, w8u w8uVar, rpt rptVar2, i9u i9uVar, v7i v7iVar, s4v s4vVar, viu viuVar, r9u r9uVar, j9u j9uVar, pru pruVar) {
        this.d = rtuVar;
        this.e = ieuVar;
        this.f = k7uVar;
        this.g = rptVar;
        this.f23267a = n4uVar;
        this.h = w8uVar;
        this.i = rptVar2;
        this.b = i9uVar;
        this.j = v7iVar;
        this.k = s4vVar;
        this.c = viuVar;
        this.l = r9uVar;
        this.m = j9uVar;
        this.n = maz.b(new b6u(pruVar, (byte) 22));
    }

    public nc0(pru pruVar, j3c j3cVar, rtu rtuVar, edu eduVar, v7i v7iVar, a7q a7qVar, q8u q8uVar, pyu pyuVar, b8u b8uVar, uyn uynVar, pmi pmiVar, rpt rptVar, svu svuVar, pmi0 pmi0Var) {
        this.d = j3cVar;
        this.e = rtuVar;
        this.f = eduVar;
        this.g = v7iVar;
        this.f23267a = a7qVar;
        this.h = q8uVar;
        this.i = pyuVar;
        this.b = b8uVar;
        this.j = uynVar;
        this.k = pmiVar;
        this.c = rptVar;
        this.l = svuVar;
        this.m = pmi0Var;
        this.n = maz.b(new b6u(pruVar, (byte) 11));
    }

    public nc0(cad cadVar, String str, i1w0 i1w0Var, ocl oclVar, gii0 gii0Var, m1e m1eVar, knf0 knf0Var, duj dujVar, ctf0 ctf0Var, typ0 typ0Var, kuy kuyVar) {
        this.d = str;
        this.e = i1w0Var;
        this.f = m1eVar;
        this.g = dujVar;
        this.f23267a = oclVar;
        this.c = ctf0Var;
        this.h = cadVar;
        this.i = gii0Var;
        this.b = knf0Var;
        this.j = typ0Var;
        this.k = kuyVar;
        byte b = 20;
        this.l = mbl.b(new psi(this, 2, b));
        this.m = mbl.b(new psi(this, 1, b));
        this.n = n0k0.a(new psi(this, 0, b));
    }

    public nc0(dvz dvzVar, peg0 peg0Var, cad cadVar, i1w0 i1w0Var, btt0 btt0Var, gii0 gii0Var, knf0 knf0Var, duj dujVar, ctf0 ctf0Var, ii iiVar) {
        this.d = cadVar;
        this.e = dvzVar;
        this.f = gii0Var;
        this.g = btt0Var;
        this.f23267a = knf0Var;
        this.c = ctf0Var;
        this.h = i1w0Var;
        this.i = dujVar;
        this.b = peg0Var;
        byte b = 2;
        this.j = mbl.b(new dci(this, 3, b));
        this.k = mbl.b(new dci(this, b, b));
        this.l = mbl.b(new dci(this, 1, b));
        this.m = mbl.b(new dci(this, 4, b));
        this.n = new dci(this, 0, b);
    }

    public nc0(cad cadVar, d1p d1pVar, String str, i1w0 i1w0Var, Integer num, knf0 knf0Var, gii0 gii0Var, ctf0 ctf0Var, g2v g2vVar, igm0 igm0Var, yo4 yo4Var) {
        this.d = num;
        this.c = ctf0Var;
        this.e = cadVar;
        this.f = gii0Var;
        this.g = knf0Var;
        this.f23267a = igm0Var;
        this.h = i1w0Var;
        this.i = yo4Var;
        this.b = d1pVar;
        this.j = str;
        this.k = g2vVar;
        byte b = 1;
        this.l = n0k0.a(new nyi(this, b, b));
        this.m = n0k0.a(new nyi(this, 2, b));
        this.n = n0k0.a(new nyi(this, 0, b));
    }

    public nc0(w000 w000Var, yox yoxVar, cad cadVar, ii iiVar, btt0 btt0Var, gii0 gii0Var, knf0 knf0Var, i1w0 i1w0Var, duj dujVar, us00 us00Var, ctf0 ctf0Var) {
        this.d = yoxVar;
        this.e = w000Var;
        this.f = gii0Var;
        this.g = btt0Var;
        this.f23267a = knf0Var;
        this.h = us00Var;
        this.i = i1w0Var;
        this.c = ctf0Var;
        this.b = cadVar;
        this.j = dujVar;
        byte b = 14;
        this.k = mbl.b(new rii(this, 3, b));
        this.l = mbl.b(new rii(this, 2, b));
        this.m = mbl.b(new rii(this, 1, b));
        this.n = new rii(this, 0, b);
    }

    public nc0(gtz gtzVar, cad cadVar, ii iiVar, btt0 btt0Var, gii0 gii0Var, knf0 knf0Var, us00 us00Var, i1w0 i1w0Var, duj dujVar, bzt bztVar) {
        this.d = gtzVar;
        this.e = gii0Var;
        this.f = knf0Var;
        this.g = btt0Var;
        this.f23267a = us00Var;
        this.h = cadVar;
        this.i = i1w0Var;
        this.b = dujVar;
        this.j = bztVar;
        byte b = 6;
        this.k = mbl.b(new rii(this, 3, b));
        this.c = mbl.b(new rii(this, 2, b));
        this.l = mbl.b(new rii(this, 1, b));
        this.m = mbl.b(new rii(this, 4, b));
        this.n = new rii(this, 0, b);
    }

    public nc0(htz htzVar, cad cadVar, pv00 pv00Var, btt0 btt0Var, gii0 gii0Var, i1w0 i1w0Var, duj dujVar, ctf0 ctf0Var, kwz kwzVar, njo njoVar) {
        this.d = htzVar;
        this.e = gii0Var;
        this.f = kwzVar;
        this.g = njoVar;
        this.f23267a = btt0Var;
        this.c = ctf0Var;
        this.h = pv00Var;
        this.i = i1w0Var;
        this.b = cadVar;
        this.j = dujVar;
        byte b = 25;
        this.k = mbl.b(new omi(this, 3, b));
        this.l = mbl.b(new omi(this, 2, b));
        this.m = mbl.b(new omi(this, 1, b));
        this.n = new omi(this, 0, b);
    }

    public nc0(rrd rrdVar, gr00 gr00Var, l77 l77Var, ugf0 ugf0Var, uzc uzcVar, zfo zfoVar, edo edoVar, ort ortVar, khf0 khf0Var, trm0 trm0Var, mne mneVar, ocl oclVar, j1q0 j1q0Var, pru pruVar) {
        l77Var.getClass();
        zfoVar.getClass();
        edoVar.getClass();
        j1q0Var.getClass();
        this.d = rrdVar;
        this.e = gr00Var;
        this.f = l77Var;
        this.g = ugf0Var;
        this.h = uzcVar;
        this.i = zfoVar;
        this.b = edoVar;
        this.j = ortVar;
        this.k = khf0Var;
        this.c = trm0Var;
        this.f23267a = mneVar;
        this.l = oclVar;
        this.m = j1q0Var;
        this.n = maz.b(new b6u(pruVar, (byte) 2));
    }

    public nc0(cad cadVar, kki kkiVar, duj dujVar, gii0 gii0Var, String str, m1e m1eVar, ctf0 ctf0Var, i1w0 i1w0Var, Boolean bool, ocl oclVar, knf0 knf0Var, vjp vjpVar, r9u r9uVar) {
        this.d = dujVar;
        this.e = cadVar;
        this.f = gii0Var;
        this.g = knf0Var;
        this.f23267a = m1eVar;
        this.h = i1w0Var;
        this.i = kkiVar;
        this.b = oclVar;
        this.c = ctf0Var;
        this.j = bool;
        this.k = vjpVar;
        this.l = str;
        this.m = r9uVar;
        this.n = new pai(this, (byte) 29);
    }

    public nc0(cad cadVar, kki kkiVar, String str, i1w0 i1w0Var, gii0 gii0Var, duj dujVar, m1e m1eVar, Long l, ocl oclVar, knf0 knf0Var, vjp vjpVar, r9u r9uVar, ctf0 ctf0Var) {
        this.d = i1w0Var;
        this.e = str;
        this.f = knf0Var;
        this.g = gii0Var;
        this.f23267a = dujVar;
        this.h = kkiVar;
        this.i = oclVar;
        this.b = vjpVar;
        this.j = cadVar;
        this.k = m1eVar;
        this.l = l;
        this.m = r9uVar;
        this.c = ctf0Var;
        this.n = new yxi(this, (byte) 13);
    }

    public nc0(bzt bztVar, mne mneVar, pru pruVar, rpt rptVar, lhf0 lhf0Var, czt cztVar, rou rouVar, cyh cyhVar, btt0 btt0Var, zg zgVar, rjo rjoVar, duj dujVar, ag3 ag3Var, z4w0 z4w0Var, ntu ntuVar, kpt kptVar, bot botVar, m1e m1eVar, ctf0 ctf0Var, gii0 gii0Var) {
        btt0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        gii0Var.getClass();
        this.d = bztVar;
        this.f23267a = mneVar;
        this.b = pruVar;
        this.e = rptVar;
        this.f = rouVar;
        this.g = cyhVar;
        this.h = zgVar;
        this.i = rjoVar;
        this.j = dujVar;
        this.k = ag3Var;
        this.l = z4w0Var;
        this.m = ntuVar;
        this.n = m1eVar;
        this.c = ctf0Var;
    }

    public nc0(svs0 svs0Var, mne mneVar, btt0 btt0Var, knf0 knf0Var, gii0 gii0Var, rou rouVar, ytt yttVar, gsb gsbVar, i1w0 i1w0Var, ii iiVar, duj dujVar, ctf0 ctf0Var) {
        this.d = rouVar;
        this.e = yttVar;
        this.f = btt0Var;
        this.g = gii0Var;
        this.h = knf0Var;
        this.i = gsbVar;
        this.b = i1w0Var;
        this.j = dujVar;
        this.f23267a = mneVar;
        this.c = ctf0Var;
        byte b = 3;
        this.k = mbl.b(new nyi(this, b, b));
        this.l = mbl.b(new nyi(this, 2, b));
        this.m = mbl.b(new nyi(this, 1, b));
        this.n = new nyi(this, 0, b);
    }

    public nc0(cad cadVar, kki kkiVar, duj dujVar, gii0 gii0Var, String str, m1e m1eVar, i1w0 i1w0Var, Long l, ocl oclVar, knf0 knf0Var, ctf0 ctf0Var, vjp vjpVar, r9u r9uVar) {
        this.d = dujVar;
        this.e = cadVar;
        this.f = gii0Var;
        this.g = knf0Var;
        this.f23267a = m1eVar;
        this.h = i1w0Var;
        this.c = ctf0Var;
        this.i = kkiVar;
        this.b = oclVar;
        this.j = vjpVar;
        this.k = str;
        this.l = l;
        this.m = r9uVar;
        this.n = new pai(this, (byte) 28);
    }

    public nc0(iip iipVar, cad cadVar, epi0 epi0Var, ugf0 ugf0Var, i1w0 i1w0Var, LastFightsParams lastFightsParams, ctf0 ctf0Var, wdk0 wdk0Var, gii0 gii0Var, kys0 kys0Var, m1e m1eVar, pru pruVar, g2v g2vVar, knf0 knf0Var) {
        this.d = i1w0Var;
        this.e = lastFightsParams;
        this.c = ctf0Var;
        this.f = kys0Var;
        this.g = m1eVar;
        this.b = pruVar;
        this.f23267a = g2vVar;
        this.h = epi0Var;
        this.i = iipVar;
        this.j = ugf0Var;
        this.k = knf0Var;
        this.l = gii0Var;
        this.m = cadVar;
        this.n = new tii(this, (byte) 18);
    }

    public nc0(iw20 iw20Var, wsf0 wsf0Var, ii iiVar, xio xioVar, czz czzVar, m1e m1eVar, sa10 sa10Var, vd1 vd1Var, duj dujVar, dzz dzzVar, btt0 btt0Var, ctf0 ctf0Var, gii0 gii0Var, knf0 knf0Var) {
        this.d = iw20Var;
        this.e = m1eVar;
        this.f = sa10Var;
        this.g = vd1Var;
        this.c = ctf0Var;
        this.f23267a = gii0Var;
        this.h = dzzVar;
        this.i = xioVar;
        this.b = czzVar;
        this.j = btt0Var;
        this.k = knf0Var;
        this.l = wsf0Var;
        this.m = dujVar;
        this.n = n0k0.a(new tii(this, (byte) 21));
    }

    public nc0(pyg pygVar, duj dujVar, mne mneVar, CyberMainDisciplinesParams cyberMainDisciplinesParams, pru pruVar, kt2 kt2Var, m1e m1eVar, poq0 poq0Var, lbu lbuVar, cyu cyuVar, zr1 zr1Var, wdk0 wdk0Var, hvt hvtVar, ctf0 ctf0Var) {
        this.d = cyberMainDisciplinesParams;
        this.e = lbuVar;
        this.f = pygVar;
        this.b = pruVar;
        this.g = hvtVar;
        this.h = poq0Var;
        this.i = kt2Var;
        this.j = m1eVar;
        this.k = dujVar;
        this.f23267a = mneVar;
        this.l = cyuVar;
        this.m = zr1Var;
        this.c = ctf0Var;
        this.n = new uci(this, (byte) 25);
    }

    public nc0(cad cadVar, sue sueVar, vqc vqcVar, ii iiVar, oeg0 oeg0Var, edo edoVar, zfo zfoVar, gst0 gst0Var, gii0 gii0Var, ouu ouuVar, knf0 knf0Var, phj phjVar, wdk0 wdk0Var, j1q0 j1q0Var) {
        this.d = oeg0Var;
        this.e = sueVar;
        this.f = cadVar;
        this.g = ouuVar;
        this.f23267a = wdk0Var;
        this.h = iiVar;
        this.i = phjVar;
        this.b = gii0Var;
        this.j = vqcVar;
        this.k = edoVar;
        this.c = zfoVar;
        this.l = knf0Var;
        this.m = j1q0Var;
        this.n = gst0Var;
    }

    public nc0(d1p d1pVar, sxs0 sxs0Var, oeg0 oeg0Var, uf3 uf3Var, pbt pbtVar, kt2 kt2Var, p4u p4uVar, xcc xccVar, ls lsVar, z4u z4uVar, gst0 gst0Var, ntu ntuVar, khf0 khf0Var, jdu jduVar, lbu lbuVar) {
        this.e = jduVar;
        this.f = ntuVar;
        this.g = khf0Var;
        this.f23267a = uf3Var;
        this.h = kt2Var;
        this.i = p4uVar;
        this.b = xccVar;
        this.j = lsVar;
        this.d = oeg0Var;
        this.k = z4uVar;
        this.c = pbtVar;
        this.l = gst0Var;
        this.m = lbuVar;
        this.n = d1pVar;
    }

    public nc0(cad cadVar, gii0 gii0Var, gst0 gst0Var, h0q0 h0q0Var, btt0 btt0Var, xk0 xk0Var, ctf0 ctf0Var, j51 j51Var, knf0 knf0Var, ntu ntuVar, j1q0 j1q0Var, x2c0 x2c0Var, pru pruVar) {
        this.d = gii0Var;
        this.e = x2c0Var;
        this.f = knf0Var;
        this.g = cadVar;
        this.f23267a = j1q0Var;
        this.h = j51Var;
        this.i = xk0Var;
        this.j = btt0Var;
        this.k = ntuVar;
        this.b = pruVar;
        this.c = ctf0Var;
        this.l = gst0Var;
        this.m = h0q0Var;
        this.n = mbl.b(new t5i(this, (byte) 12));
    }
}
