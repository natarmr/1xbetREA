package a;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class im4 extends x2t0 {
    public static final /* synthetic */ int u = 0;
    public final bzu h;
    public final tyu i;
    public final hcp0 j;
    public final fht0 k;
    public final sd60 l;
    public final po00 m;
    public final zx10 n;
    public final pzu o;
    public final sd60 p;
    public final f7u q;
    public final cu r;
    public final g2v s;
    public final uyn t;

    public im4(bzu bzuVar, tyu tyuVar, hcp0 hcp0Var, fht0 fht0Var, sd60 sd60Var, po00 po00Var, zx10 zx10Var, pzu pzuVar, sd60 sd60Var2, f7u f7uVar, cu cuVar, g2v g2vVar, uyn uynVar) {
        super(new a04((byte) 9));
        this.h = bzuVar;
        this.i = tyuVar;
        this.j = hcp0Var;
        this.k = fht0Var;
        this.l = sd60Var;
        this.m = po00Var;
        this.n = zx10Var;
        this.o = pzuVar;
        this.p = sd60Var2;
        this.q = f7uVar;
        this.r = cuVar;
        this.s = g2vVar;
        this.t = uynVar;
    }

    public static final um4 m(um4 um4Var) {
        um4Var.getClass();
        return um4.a(um4Var, false, false, false, 6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062 A[PHI: r1 r4 r8 r9 r10
  0x0062: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v1 java.lang.Object) binds: [B:31:0x00d5, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r4v8 java.lang.String) = (r4v6 java.lang.String), (r4v10 java.lang.String) binds: [B:31:0x00d5, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r8v5 kotlin.jvm.functions.Function2) = (r8v3 kotlin.jvm.functions.Function2), (r8v7 kotlin.jvm.functions.Function2) binds: [B:31:0x00d5, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r9v7 java.lang.String) = (r9v5 java.lang.String), (r9v9 java.lang.String) binds: [B:31:0x00d5, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r10v10 a.uu4) = (r10v8 a.uu4), (r10v15 a.uu4) binds: [B:31:0x00d5, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115 A[PHI: r1 r4 r8 r9 r10 r11
  0x0115: PHI (r1v15 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:38:0x0111, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r4v13 a.m2c0) = (r4v11 a.m2c0), (r4v14 a.m2c0) binds: [B:38:0x0111, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r8v10 java.lang.String) = (r8v8 java.lang.String), (r8v11 java.lang.String) binds: [B:38:0x0111, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r9v12 kotlin.jvm.functions.Function2) = (r9v10 kotlin.jvm.functions.Function2), (r9v13 kotlin.jvm.functions.Function2) binds: [B:38:0x0111, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r10v18 java.lang.String) = (r10v16 java.lang.String), (r10v19 java.lang.String) binds: [B:38:0x0111, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r11v5 a.uu4) = (r11v3 a.uu4), (r11v6 a.uu4) binds: [B:38:0x0111, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(uu4 uu4Var, String str, Function2 function2, String str2, zje zjeVar) {
        fm4 fm4Var;
        String str3;
        Function2 function3;
        String str4;
        uu4 uu4Var2;
        String str5;
        String str6;
        uu4 uu4Var3;
        m2c0 m2c0Var;
        String str7;
        Function2 function4;
        String str8;
        m2c0 m2c0Var2;
        fzs0 fzs0Var;
        Integer num;
        int iIntValue;
        jo20 jo20Var;
        boolean z;
        int iIntValue2;
        yni0 yni0Var;
        int i;
        m2c0 m2c0Var3;
        Function2 function5;
        uu4 uu4Var4;
        if (zjeVar instanceof fm4) {
            fm4Var = (fm4) zjeVar;
            int i2 = fm4Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fm4Var.p = i2 - Integer.MIN_VALUE;
            } else {
                fm4Var = new fm4(this, zjeVar);
            }
        } else {
            fm4Var = new fm4(this, zjeVar);
        }
        Object objG0 = fm4Var.n;
        wne wneVar = wne.f39444a;
        switch (fm4Var.p) {
            case 0:
                z1x.P(objG0);
                fm4Var.i = uu4Var;
                str3 = str;
                fm4Var.j = str3;
                function3 = function2;
                fm4Var.k = function3;
                str4 = str2;
                fm4Var.l = str4;
                fm4Var.p = 1;
                Object objD = this.m.f27309a.d(fm4Var);
                if (objD != wneVar) {
                    objD = Unit.f46060a;
                }
                if (objD != wneVar) {
                    uu4Var2 = uu4Var;
                    fm4Var.i = uu4Var2;
                    fm4Var.j = str3;
                    fm4Var.k = function3;
                    fm4Var.l = str4;
                    fm4Var.p = 2;
                    if (this.n.m(fm4Var) != wneVar) {
                        String str9 = str4;
                        str5 = str3;
                        str6 = str9;
                        fm4Var.i = uu4Var2;
                        fm4Var.j = str5;
                        fm4Var.k = function3;
                        fm4Var.l = str6;
                        fm4Var.p = 3;
                        objG0 = this.o.g0(uu4Var2 instanceof su4, fm4Var);
                        if (objG0 != wneVar) {
                            uu4Var3 = uu4Var2;
                            m2c0Var = (m2c0) objG0;
                            fm4Var.i = uu4Var3;
                            fm4Var.j = str5;
                            fm4Var.k = function3;
                            fm4Var.l = str6;
                            fm4Var.m = m2c0Var;
                            fm4Var.p = 4;
                            if (this.p.i("", fm4Var) != wneVar) {
                                str7 = str5;
                                function4 = function3;
                                str8 = str6;
                                m2c0Var2 = m2c0Var;
                                fm4Var.i = uu4Var3;
                                fm4Var.j = str7;
                                fm4Var.k = function4;
                                fm4Var.l = str8;
                                fm4Var.m = m2c0Var2;
                                fm4Var.p = 5;
                                objG0 = ((on4) this.t.f36498a).b.a(fm4Var);
                                if (objG0 != wneVar) {
                                    fzs0Var = (fzs0) objG0;
                                    long j = m2c0Var2.S;
                                    if (fzs0Var != null) {
                                        num = new Integer(fzs0Var.a());
                                    } else {
                                        num = null;
                                    }
                                    f7u f7uVar = this.q;
                                    f7uVar.getClass();
                                    str8.getClass();
                                    str7.getClass();
                                    y3v y3vVar = (y3v) f7uVar.b;
                                    String strValueOf = String.valueOf(j);
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    strValueOf.getClass();
                                    kt2 kt2Var = (kt2) y3vVar.b;
                                    jo20Var = new jo20();
                                    jo20Var.put("id_user", strValueOf);
                                    jo20Var.put("af_id", ((knf0) ((yk50) y3vVar.d).b).a());
                                    ((peg0) y3vVar.c).i();
                                    jo20Var.put("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC");
                                    if (str8.length() > 0) {
                                        jo20Var.put(Payload.TYPE, str8);
                                    }
                                    jo20Var.put("auth_notifications_shown", Integer.valueOf(iIntValue));
                                    if (iIntValue != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    jo20Var.put("opened_from_auth_notification", Boolean.valueOf(z));
                                    kt2Var.a("login_done", jo20Var.b());
                                    ik4 ik4Var = (ik4) f7uVar.d;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    s1p s1pVar = ik4Var.f14907a;
                                    yni0Var = new yni0();
                                    yni0Var.add(new i1p(iIntValue2, (byte) 2));
                                    if (iIntValue2 != 0) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    yni0Var.add(new i1p(i, (byte) 0));
                                    if (str8.length() > 0) {
                                        yni0Var.add(new j1p(str8, (byte) 0));
                                    }
                                    yni0Var.add(new j1p(str7, (byte) 2));
                                    s1pVar.a(cui0.a(yni0Var), 3040L);
                                    fm4Var.i = uu4Var3;
                                    fm4Var.j = null;
                                    fm4Var.k = function4;
                                    fm4Var.l = null;
                                    fm4Var.m = m2c0Var2;
                                    fm4Var.p = 6;
                                    if (this.r.l(fm4Var) != wneVar) {
                                        m2c0Var3 = m2c0Var2;
                                        function5 = function4;
                                        uu4Var4 = uu4Var3;
                                        function5.invoke(m2c0Var3, atm0.m(uu4Var4));
                                        return Unit.f46060a;
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 1:
                String str10 = fm4Var.l;
                function3 = fm4Var.k;
                String str11 = fm4Var.j;
                uu4Var2 = fm4Var.i;
                z1x.P(objG0);
                str4 = str10;
                str3 = str11;
                fm4Var.i = uu4Var2;
                fm4Var.j = str3;
                fm4Var.k = function3;
                fm4Var.l = str4;
                fm4Var.p = 2;
                if (this.n.m(fm4Var) != wneVar) {
                    String str12 = str4;
                    str5 = str3;
                    str6 = str12;
                    fm4Var.i = uu4Var2;
                    fm4Var.j = str5;
                    fm4Var.k = function3;
                    fm4Var.l = str6;
                    fm4Var.p = 3;
                    objG0 = this.o.g0(uu4Var2 instanceof su4, fm4Var);
                    if (objG0 != wneVar) {
                        uu4Var3 = uu4Var2;
                        m2c0Var = (m2c0) objG0;
                        fm4Var.i = uu4Var3;
                        fm4Var.j = str5;
                        fm4Var.k = function3;
                        fm4Var.l = str6;
                        fm4Var.m = m2c0Var;
                        fm4Var.p = 4;
                        if (this.p.i("", fm4Var) != wneVar) {
                            str7 = str5;
                            function4 = function3;
                            str8 = str6;
                            m2c0Var2 = m2c0Var;
                            fm4Var.i = uu4Var3;
                            fm4Var.j = str7;
                            fm4Var.k = function4;
                            fm4Var.l = str8;
                            fm4Var.m = m2c0Var2;
                            fm4Var.p = 5;
                            objG0 = ((on4) this.t.f36498a).b.a(fm4Var);
                            if (objG0 != wneVar) {
                                fzs0Var = (fzs0) objG0;
                                long j2 = m2c0Var2.S;
                                if (fzs0Var != null) {
                                    num = new Integer(fzs0Var.a());
                                } else {
                                    num = null;
                                }
                                f7u f7uVar2 = this.q;
                                f7uVar2.getClass();
                                str8.getClass();
                                str7.getClass();
                                y3v y3vVar2 = (y3v) f7uVar2.b;
                                String strValueOf2 = String.valueOf(j2);
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                strValueOf2.getClass();
                                kt2 kt2Var2 = (kt2) y3vVar2.b;
                                jo20Var = new jo20();
                                jo20Var.put("id_user", strValueOf2);
                                jo20Var.put("af_id", ((knf0) ((yk50) y3vVar2.d).b).a());
                                ((peg0) y3vVar2.c).i();
                                jo20Var.put("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC");
                                if (str8.length() > 0) {
                                    jo20Var.put(Payload.TYPE, str8);
                                }
                                jo20Var.put("auth_notifications_shown", Integer.valueOf(iIntValue));
                                if (iIntValue != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                jo20Var.put("opened_from_auth_notification", Boolean.valueOf(z));
                                kt2Var2.a("login_done", jo20Var.b());
                                ik4 ik4Var2 = (ik4) f7uVar2.d;
                                if (num != null) {
                                    iIntValue2 = num.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                s1p s1pVar2 = ik4Var2.f14907a;
                                yni0Var = new yni0();
                                yni0Var.add(new i1p(iIntValue2, (byte) 2));
                                if (iIntValue2 != 0) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                yni0Var.add(new i1p(i, (byte) 0));
                                if (str8.length() > 0) {
                                    yni0Var.add(new j1p(str8, (byte) 0));
                                }
                                yni0Var.add(new j1p(str7, (byte) 2));
                                s1pVar2.a(cui0.a(yni0Var), 3040L);
                                fm4Var.i = uu4Var3;
                                fm4Var.j = null;
                                fm4Var.k = function4;
                                fm4Var.l = null;
                                fm4Var.m = m2c0Var2;
                                fm4Var.p = 6;
                                if (this.r.l(fm4Var) != wneVar) {
                                    m2c0Var3 = m2c0Var2;
                                    function5 = function4;
                                    uu4Var4 = uu4Var3;
                                    function5.invoke(m2c0Var3, atm0.m(uu4Var4));
                                    return Unit.f46060a;
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 2:
                str6 = fm4Var.l;
                function3 = fm4Var.k;
                str5 = fm4Var.j;
                uu4Var2 = fm4Var.i;
                z1x.P(objG0);
                fm4Var.i = uu4Var2;
                fm4Var.j = str5;
                fm4Var.k = function3;
                fm4Var.l = str6;
                fm4Var.p = 3;
                objG0 = this.o.g0(uu4Var2 instanceof su4, fm4Var);
                if (objG0 != wneVar) {
                    uu4Var3 = uu4Var2;
                    m2c0Var = (m2c0) objG0;
                    fm4Var.i = uu4Var3;
                    fm4Var.j = str5;
                    fm4Var.k = function3;
                    fm4Var.l = str6;
                    fm4Var.m = m2c0Var;
                    fm4Var.p = 4;
                    if (this.p.i("", fm4Var) != wneVar) {
                        str7 = str5;
                        function4 = function3;
                        str8 = str6;
                        m2c0Var2 = m2c0Var;
                        fm4Var.i = uu4Var3;
                        fm4Var.j = str7;
                        fm4Var.k = function4;
                        fm4Var.l = str8;
                        fm4Var.m = m2c0Var2;
                        fm4Var.p = 5;
                        objG0 = ((on4) this.t.f36498a).b.a(fm4Var);
                        if (objG0 != wneVar) {
                            fzs0Var = (fzs0) objG0;
                            long j3 = m2c0Var2.S;
                            if (fzs0Var != null) {
                                num = new Integer(fzs0Var.a());
                            } else {
                                num = null;
                            }
                            f7u f7uVar3 = this.q;
                            f7uVar3.getClass();
                            str8.getClass();
                            str7.getClass();
                            y3v y3vVar3 = (y3v) f7uVar3.b;
                            String strValueOf3 = String.valueOf(j3);
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            strValueOf3.getClass();
                            kt2 kt2Var3 = (kt2) y3vVar3.b;
                            jo20Var = new jo20();
                            jo20Var.put("id_user", strValueOf3);
                            jo20Var.put("af_id", ((knf0) ((yk50) y3vVar3.d).b).a());
                            ((peg0) y3vVar3.c).i();
                            jo20Var.put("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC");
                            if (str8.length() > 0) {
                                jo20Var.put(Payload.TYPE, str8);
                            }
                            jo20Var.put("auth_notifications_shown", Integer.valueOf(iIntValue));
                            if (iIntValue != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jo20Var.put("opened_from_auth_notification", Boolean.valueOf(z));
                            kt2Var3.a("login_done", jo20Var.b());
                            ik4 ik4Var3 = (ik4) f7uVar3.d;
                            if (num != null) {
                                iIntValue2 = num.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            s1p s1pVar3 = ik4Var3.f14907a;
                            yni0Var = new yni0();
                            yni0Var.add(new i1p(iIntValue2, (byte) 2));
                            if (iIntValue2 != 0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            yni0Var.add(new i1p(i, (byte) 0));
                            if (str8.length() > 0) {
                                yni0Var.add(new j1p(str8, (byte) 0));
                            }
                            yni0Var.add(new j1p(str7, (byte) 2));
                            s1pVar3.a(cui0.a(yni0Var), 3040L);
                            fm4Var.i = uu4Var3;
                            fm4Var.j = null;
                            fm4Var.k = function4;
                            fm4Var.l = null;
                            fm4Var.m = m2c0Var2;
                            fm4Var.p = 6;
                            if (this.r.l(fm4Var) != wneVar) {
                                m2c0Var3 = m2c0Var2;
                                function5 = function4;
                                uu4Var4 = uu4Var3;
                                function5.invoke(m2c0Var3, atm0.m(uu4Var4));
                                return Unit.f46060a;
                            }
                        }
                    }
                }
                return wneVar;
            case 3:
                str6 = fm4Var.l;
                function3 = fm4Var.k;
                str5 = fm4Var.j;
                uu4Var2 = fm4Var.i;
                z1x.P(objG0);
                uu4Var3 = uu4Var2;
                m2c0Var = (m2c0) objG0;
                fm4Var.i = uu4Var3;
                fm4Var.j = str5;
                fm4Var.k = function3;
                fm4Var.l = str6;
                fm4Var.m = m2c0Var;
                fm4Var.p = 4;
                if (this.p.i("", fm4Var) != wneVar) {
                    str7 = str5;
                    function4 = function3;
                    str8 = str6;
                    m2c0Var2 = m2c0Var;
                    fm4Var.i = uu4Var3;
                    fm4Var.j = str7;
                    fm4Var.k = function4;
                    fm4Var.l = str8;
                    fm4Var.m = m2c0Var2;
                    fm4Var.p = 5;
                    objG0 = ((on4) this.t.f36498a).b.a(fm4Var);
                    if (objG0 != wneVar) {
                        fzs0Var = (fzs0) objG0;
                        long j4 = m2c0Var2.S;
                        if (fzs0Var != null) {
                            num = new Integer(fzs0Var.a());
                        } else {
                            num = null;
                        }
                        f7u f7uVar4 = this.q;
                        f7uVar4.getClass();
                        str8.getClass();
                        str7.getClass();
                        y3v y3vVar4 = (y3v) f7uVar4.b;
                        String strValueOf4 = String.valueOf(j4);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        strValueOf4.getClass();
                        kt2 kt2Var4 = (kt2) y3vVar4.b;
                        jo20Var = new jo20();
                        jo20Var.put("id_user", strValueOf4);
                        jo20Var.put("af_id", ((knf0) ((yk50) y3vVar4.d).b).a());
                        ((peg0) y3vVar4.c).i();
                        jo20Var.put("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC");
                        if (str8.length() > 0) {
                            jo20Var.put(Payload.TYPE, str8);
                        }
                        jo20Var.put("auth_notifications_shown", Integer.valueOf(iIntValue));
                        if (iIntValue != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jo20Var.put("opened_from_auth_notification", Boolean.valueOf(z));
                        kt2Var4.a("login_done", jo20Var.b());
                        ik4 ik4Var4 = (ik4) f7uVar4.d;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        s1p s1pVar4 = ik4Var4.f14907a;
                        yni0Var = new yni0();
                        yni0Var.add(new i1p(iIntValue2, (byte) 2));
                        if (iIntValue2 != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        yni0Var.add(new i1p(i, (byte) 0));
                        if (str8.length() > 0) {
                            yni0Var.add(new j1p(str8, (byte) 0));
                        }
                        yni0Var.add(new j1p(str7, (byte) 2));
                        s1pVar4.a(cui0.a(yni0Var), 3040L);
                        fm4Var.i = uu4Var3;
                        fm4Var.j = null;
                        fm4Var.k = function4;
                        fm4Var.l = null;
                        fm4Var.m = m2c0Var2;
                        fm4Var.p = 6;
                        if (this.r.l(fm4Var) != wneVar) {
                            m2c0Var3 = m2c0Var2;
                            function5 = function4;
                            uu4Var4 = uu4Var3;
                            function5.invoke(m2c0Var3, atm0.m(uu4Var4));
                            return Unit.f46060a;
                        }
                    }
                }
                return wneVar;
            case 4:
                m2c0Var2 = fm4Var.m;
                str8 = fm4Var.l;
                function4 = fm4Var.k;
                str7 = fm4Var.j;
                uu4Var3 = fm4Var.i;
                z1x.P(objG0);
                fm4Var.i = uu4Var3;
                fm4Var.j = str7;
                fm4Var.k = function4;
                fm4Var.l = str8;
                fm4Var.m = m2c0Var2;
                fm4Var.p = 5;
                objG0 = ((on4) this.t.f36498a).b.a(fm4Var);
                if (objG0 != wneVar) {
                    fzs0Var = (fzs0) objG0;
                    long j5 = m2c0Var2.S;
                    if (fzs0Var != null) {
                        num = new Integer(fzs0Var.a());
                    } else {
                        num = null;
                    }
                    f7u f7uVar5 = this.q;
                    f7uVar5.getClass();
                    str8.getClass();
                    str7.getClass();
                    y3v y3vVar5 = (y3v) f7uVar5.b;
                    String strValueOf5 = String.valueOf(j5);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    strValueOf5.getClass();
                    kt2 kt2Var5 = (kt2) y3vVar5.b;
                    jo20Var = new jo20();
                    jo20Var.put("id_user", strValueOf5);
                    jo20Var.put("af_id", ((knf0) ((yk50) y3vVar5.d).b).a());
                    ((peg0) y3vVar5.c).i();
                    jo20Var.put("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC");
                    if (str8.length() > 0) {
                        jo20Var.put(Payload.TYPE, str8);
                    }
                    jo20Var.put("auth_notifications_shown", Integer.valueOf(iIntValue));
                    if (iIntValue != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jo20Var.put("opened_from_auth_notification", Boolean.valueOf(z));
                    kt2Var5.a("login_done", jo20Var.b());
                    ik4 ik4Var5 = (ik4) f7uVar5.d;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    s1p s1pVar5 = ik4Var5.f14907a;
                    yni0Var = new yni0();
                    yni0Var.add(new i1p(iIntValue2, (byte) 2));
                    if (iIntValue2 != 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    yni0Var.add(new i1p(i, (byte) 0));
                    if (str8.length() > 0) {
                        yni0Var.add(new j1p(str8, (byte) 0));
                    }
                    yni0Var.add(new j1p(str7, (byte) 2));
                    s1pVar5.a(cui0.a(yni0Var), 3040L);
                    fm4Var.i = uu4Var3;
                    fm4Var.j = null;
                    fm4Var.k = function4;
                    fm4Var.l = null;
                    fm4Var.m = m2c0Var2;
                    fm4Var.p = 6;
                    if (this.r.l(fm4Var) != wneVar) {
                        m2c0Var3 = m2c0Var2;
                        function5 = function4;
                        uu4Var4 = uu4Var3;
                        function5.invoke(m2c0Var3, atm0.m(uu4Var4));
                        return Unit.f46060a;
                    }
                }
                return wneVar;
            case 5:
                m2c0Var2 = fm4Var.m;
                str8 = fm4Var.l;
                function4 = fm4Var.k;
                str7 = fm4Var.j;
                uu4Var3 = fm4Var.i;
                z1x.P(objG0);
                fzs0Var = (fzs0) objG0;
                long j6 = m2c0Var2.S;
                if (fzs0Var != null) {
                    num = new Integer(fzs0Var.a());
                } else {
                    num = null;
                }
                f7u f7uVar6 = this.q;
                f7uVar6.getClass();
                str8.getClass();
                str7.getClass();
                y3v y3vVar6 = (y3v) f7uVar6.b;
                String strValueOf6 = String.valueOf(j6);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                strValueOf6.getClass();
                kt2 kt2Var6 = (kt2) y3vVar6.b;
                jo20Var = new jo20();
                jo20Var.put("id_user", strValueOf6);
                jo20Var.put("af_id", ((knf0) ((yk50) y3vVar6.d).b).a());
                ((peg0) y3vVar6.c).i();
                jo20Var.put("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC");
                if (str8.length() > 0) {
                    jo20Var.put(Payload.TYPE, str8);
                }
                jo20Var.put("auth_notifications_shown", Integer.valueOf(iIntValue));
                if (iIntValue != 0) {
                    z = true;
                } else {
                    z = false;
                }
                jo20Var.put("opened_from_auth_notification", Boolean.valueOf(z));
                kt2Var6.a("login_done", jo20Var.b());
                ik4 ik4Var6 = (ik4) f7uVar6.d;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                s1p s1pVar6 = ik4Var6.f14907a;
                yni0Var = new yni0();
                yni0Var.add(new i1p(iIntValue2, (byte) 2));
                if (iIntValue2 != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                yni0Var.add(new i1p(i, (byte) 0));
                if (str8.length() > 0) {
                    yni0Var.add(new j1p(str8, (byte) 0));
                }
                yni0Var.add(new j1p(str7, (byte) 2));
                s1pVar6.a(cui0.a(yni0Var), 3040L);
                fm4Var.i = uu4Var3;
                fm4Var.j = null;
                fm4Var.k = function4;
                fm4Var.l = null;
                fm4Var.m = m2c0Var2;
                fm4Var.p = 6;
                if (this.r.l(fm4Var) != wneVar) {
                    m2c0Var3 = m2c0Var2;
                    function5 = function4;
                    uu4Var4 = uu4Var3;
                    function5.invoke(m2c0Var3, atm0.m(uu4Var4));
                    return Unit.f46060a;
                }
                return wneVar;
            case 6:
                m2c0Var3 = fm4Var.m;
                function5 = fm4Var.k;
                uu4Var4 = fm4Var.i;
                z1x.P(objG0);
                function5.invoke(m2c0Var3, atm0.m(uu4Var4));
                return Unit.f46060a;
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:108:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:121:0x0317  */
    /* JADX WARN: Code duplicated, block: B:123:0x031b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0363  */
    /* JADX WARN: Code duplicated, block: B:131:0x036b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0370  */
    /* JADX WARN: Code duplicated, block: B:136:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0150 A[PHI: r1
  0x0150: PHI (r1v51 java.lang.Object) = (r1v44 java.lang.Object), (r1v1 java.lang.Object) binds: [B:51:0x014c, B:21:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0201  */
    /* JADX WARN: Code duplicated, block: B:80:0x0205  */
    /* JADX WARN: Code duplicated, block: B:83:0x0246  */
    /* JADX WARN: Code duplicated, block: B:88:0x024f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0253  */
    /* JADX WARN: Code duplicated, block: B:93:0x029f  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a8  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ba, code lost:
    
        if (n(r0, r8) == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0365, code lost:
    
        if (r0 == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03bd, code lost:
    
        if (r0 == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (r0 == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
    
        if (r0 == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015a, code lost:
    
        if (n((a.kx00) r1, r8) == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b0, code lost:
    
        if (r0 == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fa, code lost:
    
        if (r0 == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0248, code lost:
    
        if (r0 == r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a1, code lost:
    
        if (r0 == r9) goto L138;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.xl4 r18, a.yje r19) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.im4.a(a.xl4, a.yje):java.lang.Object");
    }

    public final void k(m2c0 m2c0Var, String str) {
        if (((um4) d()).c) {
            boolean z = false;
            boolean z2 = m2c0Var.Z.length() == 0;
            int iOrdinal = m2c0Var.k.ordinal();
            if (iOrdinal != 2 && iOrdinal != 3) {
                z = true;
            }
            if (z2 || z) {
                g(km4.f18521a);
                return;
            }
        }
        g(new lm4(m2c0Var, str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Function1 function1, Function1 function2, zje zjeVar) {
        hm4 hm4Var;
        Object value;
        Object value2;
        Object value3;
        um4 um4Var;
        Object value4;
        if (zjeVar instanceof hm4) {
            hm4Var = (hm4) zjeVar;
            int i = hm4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hm4Var.l = i - Integer.MIN_VALUE;
            } else {
                hm4Var = new hm4(this, zjeVar);
            }
        } else {
            hm4Var = new hm4(this, zjeVar);
        }
        Object obj = hm4Var.j;
        Object obj2 = wne.f39444a;
        int i2 = hm4Var.l;
        ocj ocjVar = this.b;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                ocjVar.getClass();
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    um4Var = (um4) value3;
                    um4Var.getClass();
                } while (!p7m0Var.m(value3, um4.a(um4Var, true, false, false, 6)));
                hm4Var.i = function2;
                hm4Var.l = 1;
                if (function1.invoke(hm4Var) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function2 = hm4Var.i;
                z1x.P(obj);
            }
            ocjVar.getClass();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value4, m((um4) value4)));
        } catch (Throwable th) {
            try {
                if (th instanceof CancellationException) {
                    throw th;
                }
                function2.invoke(th);
                ocjVar.getClass();
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value2, m((um4) value2)));
            } catch (Throwable th2) {
                ocjVar.getClass();
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value, m((um4) value)));
                throw th2;
            }
        }
        return Unit.f46060a;
    }

    public final Object n(kx00 kx00Var, zje zjeVar) throws Exception {
        String strA;
        String str;
        hcp0 hcp0Var = this.j;
        hcp0Var.getClass();
        kx00Var.getClass();
        okt0 okt0Var = (okt0) hcp0Var.c;
        String str2 = kx00Var.b;
        str2.getClass();
        btt0 btt0Var = (btt0) okt0Var.f25422a;
        btt0Var.b(str2);
        String str3 = kx00Var.f19028a;
        str3.getClass();
        vwb0 vwb0Var = btt0Var.f3200a;
        vwb0Var.h("refresh_token", str3);
        vwb0Var.g("TOKEN_EXPIRE_TIME", TimeUnit.SECONDS.toMillis(kx00Var.c) + System.currentTimeMillis());
        ((gst0) hcp0Var.b).k(new krt0(kx00Var.d, false, false, 0.0d));
        long j = kx00Var.d;
        fht0 fht0Var = this.k;
        kt2 kt2Var = (kt2) ((nr) fht0Var.b).b;
        sv3 sv3Var = (sv3) ((wsf0) fht0Var.f9559a).b;
        owp0 owp0Var = (owp0) fht0Var.d;
        uwb0 uwb0Var = (uwb0) owp0Var.b;
        wwb0 wwb0Var = (wwb0) ((w4p0) fht0Var.c).b;
        wwb0Var.getClass();
        int i = ((SharedPreferences) wwb0Var.c.getValue()).getInt("USER_TEMPORARY_EN_SOCIAL", -1);
        String strA2 = wwb0Var.a("USER_TEMPORARY_PASS");
        if (i != -1) {
            owp0Var.a();
            if (i == 1) {
                str = "VK";
            } else if (i == 5) {
                str = Payload.RESPONSE_OK;
            } else if (i == 7) {
                str = "Yandex";
            } else if (i == 9) {
                str = "Mail";
            } else if (i == 11) {
                str = "Google";
            } else if (i == 13) {
                str = "XCom";
            } else if (i == 17) {
                str = "Telegram";
            } else if (i != 19) {
                str = i != 31 ? "Unknown" : "Discord";
            } else {
                str = "Apple_ID";
            }
            rv3 rv3Var = (rv3) sv3Var;
            rv3Var.e(j);
            rv3Var.g("login", RemoteMessageConst.FROM, str);
            kt2Var.b("up_user_login", "signed_in");
            ((SharedPreferences) wwb0Var.c.getValue()).edit().clear().apply();
        } else if (strA2.length() > 0) {
            owp0Var.a();
            Long lValueOf = Long.valueOf(j);
            if (j == 0) {
                lValueOf = null;
            }
            if (lValueOf == null || (strA = String.valueOf(lValueOf.longValue())) == null) {
                strA = wwb0Var.a("USER_TEMPORARY_LOGIN");
            }
            uwb0Var.c("USER_PASS_LOGIN", strA);
            owp0Var.i(strA2);
            uwb0Var.c("USER_PASS_PHONE_CODE", wwb0Var.a("USER_TEMPORARY_PASS_PHONE_CODE"));
            uwb0Var.c("USER_PASS_PHONE_BODY", wwb0Var.a("USER_TEMPORARY_PASS_PHONE_BODY"));
            rv3 rv3Var2 = (rv3) sv3Var;
            rv3Var2.e(j);
            rv3Var2.g("login", RemoteMessageConst.FROM, ParameterNames.PASSWORD);
            kt2Var.b("up_user_login", "signed_in");
            ((SharedPreferences) wwb0Var.c.getValue()).edit().clear().apply();
        }
        Object objH = this.l.h(zjeVar);
        return objH == wne.f39444a ? objH : Unit.f46060a;
    }
}
