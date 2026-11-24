package a;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.zzao;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;

/* JADX INFO: loaded from: classes.dex */
public final class fht0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9559a;
    public Object b;
    public Object c;
    public Object d;

    public fht0(knf0 knf0Var, nb6 nb6Var, uzc uzcVar, gii0 gii0Var) {
        knf0Var.getClass();
        nb6Var.getClass();
        uzcVar.getClass();
        gii0Var.getClass();
        this.f9559a = knf0Var;
        this.b = nb6Var;
        this.c = uzcVar;
        this.d = new lkr0(gii0Var, (byte) 23);
    }

    public void A() {
        this.c = 16;
    }

    public float a(lxv0 lxv0Var) {
        lxv0Var.getClass();
        cvv0 cvv0VarF = f();
        if (cvv0VarF != null) {
            return ktt0.g(cvv0VarF, lxv0Var);
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable b(c3c0 c3c0Var, zje zjeVar) {
        fev0 fev0Var;
        knf0 knf0Var = (knf0) this.f9559a;
        if (zjeVar instanceof fev0) {
            fev0Var = (fev0) zjeVar;
            int i = fev0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fev0Var.k = i - Integer.MIN_VALUE;
            } else {
                fev0Var = new fev0(this, zjeVar);
            }
        } else {
            fev0Var = new fev0(this, zjeVar);
        }
        Object objB = fev0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fev0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            int i3 = c3c0Var.f3668a;
            boolean z = c3c0Var.b;
            long j = c3c0Var.c;
            TreeMap treeMapV0 = b34.v0(new ob6(knf0Var.b(), i3, z, ((uzc) this.c).b().getId(), j, knf0Var.c()));
            q8r0 q8r0Var = (q8r0) ((lkr0) this.d).invoke();
            fev0Var.k = 1;
            objB = q8r0Var.b(treeMapV0, fev0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        Iterable iterable = (Iterable) ((dx5) objB).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nas nasVarD0 = ay3.d0((rt10) it.next(), sip.b, 0L);
            if (nasVarD0 != null) {
                arrayList.add(nasVarD0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable c(c3c0 c3c0Var, zje zjeVar) {
        gev0 gev0Var;
        knf0 knf0Var = (knf0) this.f9559a;
        if (zjeVar instanceof gev0) {
            gev0Var = (gev0) zjeVar;
            int i = gev0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gev0Var.k = i - Integer.MIN_VALUE;
            } else {
                gev0Var = new gev0(this, zjeVar);
            }
        } else {
            gev0Var = new gev0(this, zjeVar);
        }
        Object objA = gev0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gev0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            int i3 = c3c0Var.f3668a;
            boolean z = c3c0Var.b;
            long j = c3c0Var.c;
            TreeMap treeMapV0 = b34.v0(new ob6(knf0Var.b(), i3, z, ((uzc) this.c).b().getId(), j, knf0Var.c()));
            q8r0 q8r0Var = (q8r0) ((lkr0) this.d).invoke();
            gev0Var.k = 1;
            objA = q8r0Var.a(treeMapV0, gev0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nas nasVarD0 = ay3.d0((rt10) it.next(), sip.c, 0L);
            if (nasVarD0 != null) {
                arrayList.add(nasVarD0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(zje zjeVar) {
        cjt0 cjt0Var;
        if (zjeVar instanceof cjt0) {
            cjt0Var = (cjt0) zjeVar;
            int i = cjt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cjt0Var.k = i - Integer.MIN_VALUE;
            } else {
                cjt0Var = new cjt0(this, zjeVar);
            }
        } else {
            cjt0Var = new cjt0(this, zjeVar);
        }
        Object objA = cjt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = cjt0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (!((gst0) this.c).a()) {
                return null;
            }
            b3c0 b3c0Var = (b3c0) this.d;
            cjt0Var.k = 1;
            objA = b3c0Var.a(false, cjt0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return StringsKt.toIntOrNull(((m2c0) objA).c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object e(zje zjeVar) {
        dht0 dht0Var;
        double d;
        ave aveVar = (ave) ((g45) this.f9559a).c;
        etj etjVar = (etj) this.d;
        if (zjeVar instanceof dht0) {
            dht0Var = (dht0) zjeVar;
            int i = dht0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dht0Var.k = i - Integer.MIN_VALUE;
            } else {
                dht0Var = new dht0(this, zjeVar);
            }
        } else {
            dht0Var = new dht0(this, zjeVar);
        }
        Object objA = dht0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dht0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (etjVar.f8378a.m()) {
                ql5 ql5Var = ((xre) this.b).f41366a.c;
                if (ql5Var != null) {
                    d = aveVar.g;
                    if (d == 0.0d) {
                        dht0Var.k = 1;
                        objA = etjVar.a(ql5Var, dht0Var);
                        if (objA == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    d = aveVar.e;
                }
            } else {
                d = aveVar.g;
            }
            return new Double(d);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        d = ((c3j0) objA).b;
        return new Double(d);
    }

    public cvv0 f() {
        return (cvv0) ((hgk0) ((pz40) this.c)).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Serializable g(int i, zje zjeVar) {
        j9u0 j9u0Var;
        List<f8u0> list;
        ArrayList arrayList;
        Integer num;
        mbu0 mbu0VarA;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String string;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        StringBuilder sb;
        vwb0 vwb0Var = (vwb0) this.c;
        if (zjeVar instanceof j9u0) {
            j9u0Var = (j9u0) zjeVar;
            int i2 = j9u0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j9u0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                j9u0Var = new j9u0(this, zjeVar);
            }
        } else {
            j9u0Var = new j9u0(this, zjeVar);
        }
        Object objO = j9u0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = j9u0Var.k;
        if (i3 == 0) {
            z1x.P(objO);
            list = iun.f15405a;
            if (Calendar.getInstance().getTimeInMillis() - vwb0.a(vwb0Var, "VERIFICATION_OPTION_EXPIRATION_CACHE_DATA_KEY") < 0) {
                try {
                    String strC = vwb0Var.c("VERIFICATION_OPTION_CACHE_DATA_KEY", "");
                    if (strC.length() != 0) {
                        vby vbyVar = (vby) this.f9559a;
                        vbyVar.getClass();
                        list = (List) vbyVar.b(new zw3(f8u0.Companion.serializer(), (byte) 0), strC);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (list.isEmpty()) {
                j9u0Var.k = 1;
                objO = o(i, j9u0Var);
                if (objO == wneVar) {
                    return wneVar;
                }
            }
            arrayList = new ArrayList(r3d.q(list, 10));
            for (f8u0 f8u0Var : list) {
                f8u0Var.getClass();
                num = f8u0Var.f9126a;
                if (num != null) {
                    svs0 svs0Var = mbu0.b;
                    int iIntValue = num.intValue();
                    svs0Var.getClass();
                    mbu0VarA = svs0.a(iIntValue);
                } else {
                    mbu0VarA = mbu0.UNKNOWN;
                }
                mbu0 mbu0Var = mbu0VarA;
                str = f8u0Var.b;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                str3 = f8u0Var.c;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = f8u0Var.d;
                if (str5 != null) {
                    sb = new StringBuilder(ujn.h);
                    if (str5.length() == 0) {
                        sb.setLength(0);
                    } else if (!StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                        sb.setLength(0);
                        sb.append(str5);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(str5, '/'));
                    }
                    string = sb.toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    str6 = "";
                } else {
                    str6 = string;
                }
                str7 = f8u0Var.e;
                if (str7 == null) {
                    str8 = "";
                } else {
                    str8 = str7;
                }
                str9 = f8u0Var.f;
                if (str9 == null) {
                    str10 = "";
                } else {
                    str10 = str9;
                }
                arrayList.add(new c8u0(mbu0Var, str2, str4, str6, str8, str10));
            }
            return arrayList;
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objO);
        list = (List) objO;
        arrayList = new ArrayList(r3d.q(list, 10));
        while (r1.hasNext()) {
            f8u0Var.getClass();
            num = f8u0Var.f9126a;
            if (num != null) {
                svs0 svs0Var2 = mbu0.b;
                int iIntValue2 = num.intValue();
                svs0Var2.getClass();
                mbu0VarA = svs0.a(iIntValue2);
            } else {
                mbu0VarA = mbu0.UNKNOWN;
            }
            mbu0 mbu0Var2 = mbu0VarA;
            str = f8u0Var.b;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            str3 = f8u0Var.c;
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            str5 = f8u0Var.d;
            if (str5 != null) {
                sb = new StringBuilder(ujn.h);
                if (str5.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str5, ujn.h, false)) {
                    sb.setLength(0);
                    sb.append(str5);
                } else {
                    sb.setLength(0);
                    sb.append(str5);
                }
                string = sb.toString();
            } else {
                string = null;
            }
            if (string == null) {
                str6 = "";
            } else {
                str6 = string;
            }
            str7 = f8u0Var.e;
            if (str7 == null) {
                str8 = "";
            } else {
                str8 = str7;
            }
            str9 = f8u0Var.f;
            if (str9 == null) {
                str10 = "";
            } else {
                str10 = str9;
            }
            arrayList.add(new c8u0(mbu0Var2, str2, str4, str6, str8, str10));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object h(long j, long j2, List list, int i, int i2, zje zjeVar) {
        ejt0 ejt0Var;
        g45 g45Var;
        long j3;
        long j4;
        long j5;
        int i3;
        int i4;
        boolean z;
        int i5;
        List list2;
        long j6;
        int i6;
        byte b;
        byte b2 = i2;
        uzc uzcVar = (uzc) this.b;
        if (zjeVar instanceof ejt0) {
            ejt0Var = (ejt0) zjeVar;
            int i7 = ejt0Var.w;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ejt0Var.w = i7 - Integer.MIN_VALUE;
            } else {
                ejt0Var = new ejt0(this, zjeVar);
            }
        } else {
            ejt0Var = new ejt0(this, zjeVar);
        }
        Object obj = ejt0Var.u;
        Object obj2 = wne.f39444a;
        int i8 = ejt0Var.w;
        if (i8 == 0) {
            z1x.P(obj);
            g45 g45Var2 = (g45) this.f9559a;
            int id = uzcVar.b().getId();
            boolean zA = uzcVar.a();
            ejt0Var.m = g45Var2;
            ejt0Var.n = list;
            ejt0Var.i = j;
            ejt0Var.j = j2;
            ejt0Var.o = i;
            ejt0Var.p = b2;
            ejt0Var.k = j;
            ejt0Var.l = j2;
            ejt0Var.q = i;
            ejt0Var.r = id;
            ejt0Var.t = zA;
            ejt0Var.s = b2;
            ejt0Var.w = 1;
            Object objD = d(ejt0Var);
            if (objD != obj2) {
                obj = objD;
                g45Var = g45Var2;
                j3 = j;
                j4 = j2;
                j5 = j4;
                i3 = i;
                i4 = b2;
                z = zA;
                i5 = id;
                list2 = list;
                j6 = j3;
                i6 = i3;
                b = b2;
            }
        }
        if (i8 != 1) {
            if (i8 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i9 = ejt0Var.s;
        boolean z2 = ejt0Var.t;
        int i10 = ejt0Var.r;
        int i11 = ejt0Var.q;
        long j7 = ejt0Var.l;
        long j8 = ejt0Var.k;
        byte b3 = ejt0Var.p;
        i6 = ejt0Var.o;
        j4 = ejt0Var.j;
        j6 = ejt0Var.i;
        List list3 = ejt0Var.n;
        g45Var = ejt0Var.m;
        z1x.P(obj);
        j3 = j8;
        i4 = i9;
        z = z2;
        i5 = i10;
        i3 = i11;
        j5 = j7;
        list2 = list3;
        b = b3;
        ejt0Var.m = null;
        ejt0Var.n = null;
        ejt0Var.i = j6;
        ejt0Var.j = j4;
        ejt0Var.o = i6;
        ejt0Var.p = b;
        ejt0Var.w = 2;
        Object objD0 = qjj.d0(((mne) g45Var.i).b, new g1f(list2, (Integer) obj, g45Var, j3, j5, i3, i5, i4, z, null), ejt0Var);
        return objD0 == obj2 ? obj2 : objD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (r6 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(long r30, long r32, java.util.List r34, a.q4f r35, boolean r36, a.zje r37) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fht0.i(long, long, java.util.List, a.q4f, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object j(long j, long j2, List list, List list2, long j3, q4f q4fVar, int i, boolean z, boolean z2, boolean z3, Boolean bool, String str, int i2, boolean z4, zje zjeVar) {
        djt0 djt0Var;
        boolean z5;
        boolean z6;
        int i3;
        Boolean bool2;
        String str2;
        String str3;
        g45 g45Var;
        boolean z7;
        boolean z8;
        long j4;
        List list3;
        long j5;
        List list4;
        Object obj;
        boolean z9;
        int i4;
        long j6;
        boolean z10;
        byte b;
        uzc uzcVar = (uzc) this.b;
        if (zjeVar instanceof djt0) {
            djt0Var = (djt0) zjeVar;
            int i5 = djt0Var.Y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                djt0Var.Y = i5 - Integer.MIN_VALUE;
            } else {
                djt0Var = new djt0(this, zjeVar);
            }
        } else {
            djt0Var = new djt0(this, zjeVar);
        }
        Object objK0 = djt0Var.A;
        Object obj2 = wne.f39444a;
        int i6 = djt0Var.Y;
        if (i6 != 0) {
            if (i6 == 1) {
                boolean z11 = djt0Var.z;
                boolean z12 = djt0Var.y;
                int i7 = djt0Var.t;
                boolean z13 = djt0Var.x;
                byte b2 = djt0Var.s;
                boolean z14 = djt0Var.w;
                boolean z15 = djt0Var.v;
                boolean z16 = djt0Var.u;
                int i8 = djt0Var.r;
                long j7 = djt0Var.k;
                long j8 = djt0Var.j;
                long j9 = djt0Var.i;
                z8 = z11;
                str3 = djt0Var.q;
                g45 g45Var2 = djt0Var.p;
                String str4 = djt0Var.o;
                Boolean bool3 = djt0Var.n;
                List list5 = djt0Var.m;
                List list6 = djt0Var.l;
                z1x.P(objK0);
                z7 = z12;
                z6 = z14;
                str2 = str4;
                bool2 = bool3;
                list4 = list6;
                z10 = z15;
                obj = objK0;
                z5 = z16;
                j4 = j7;
                b = b2;
                list3 = list5;
                g45Var = g45Var2;
                i3 = i7;
                z9 = z13;
                i4 = i8;
                j6 = j8;
                j5 = j9;
            } else {
                if (i6 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objK0);
            }
            return kotlin.collections.a.c((cit0) objK0);
        }
        z1x.P(objK0);
        if (list.isEmpty()) {
            return kotlin.collections.a.c(knm0.j());
        }
        g45 g45Var3 = (g45) this.f9559a;
        int id = uzcVar.b().getId();
        q4f q4fVar2 = q4f.e;
        String str5 = q4fVar == q4fVar2 ? "1" : "";
        boolean zContains = q3d.j(q4fVar2, q4f.g, q4f.h).contains(q4fVar);
        boolean zA = uzcVar.a();
        djt0Var.l = list;
        djt0Var.m = list2;
        djt0Var.n = bool;
        djt0Var.o = str;
        djt0Var.p = g45Var3;
        djt0Var.q = str5;
        djt0Var.i = j;
        String str6 = str5;
        djt0Var.j = j2;
        djt0Var.k = j3;
        djt0Var.r = i;
        z5 = z;
        djt0Var.u = z5;
        djt0Var.v = z2;
        djt0Var.w = z3;
        djt0Var.s = i2;
        djt0Var.x = z4;
        djt0Var.t = id;
        djt0Var.y = zContains;
        djt0Var.z = zA;
        djt0Var.Y = 1;
        Object objD = d(djt0Var);
        if (objD == obj2) {
            return obj2;
        }
        z6 = z3;
        i3 = id;
        bool2 = bool;
        str2 = str;
        str3 = str6;
        g45Var = g45Var3;
        z7 = zContains;
        z8 = zA;
        j4 = j3;
        list3 = list2;
        j5 = j;
        list4 = list;
        obj = objD;
        z9 = z4;
        i4 = i;
        j6 = j2;
        z10 = z2;
        b = i2;
        djt0Var.l = null;
        djt0Var.m = null;
        djt0Var.n = null;
        djt0Var.o = null;
        djt0Var.p = null;
        djt0Var.q = null;
        djt0Var.i = j5;
        djt0Var.j = j6;
        djt0Var.k = j4;
        djt0Var.r = i4;
        djt0Var.u = z5;
        djt0Var.v = z10;
        djt0Var.w = z6;
        djt0Var.s = b;
        djt0Var.x = z9;
        djt0Var.Y = 2;
        int i9 = i3;
        objK0 = g45Var.k0(j5, j6, i4, j4, list4, i9, str3, list3, z5, z7, z8, z10, z6, bool2, str2, b == true ? 1 : 0, (Integer) obj, z9, djt0Var);
        if (objK0 == obj2) {
            return obj2;
        }
        return kotlin.collections.a.c((cit0) objK0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object k(long j, q4f q4fVar, zje zjeVar) {
        eht0 eht0Var;
        List<hf6> listN;
        mie0 mie0Var;
        ArrayList arrayList;
        int i;
        List list;
        mie0 mie0Var2;
        int i2;
        mie0 mie0Var3;
        double d;
        ArrayList arrayList2;
        List list2;
        int i3;
        int i4;
        mie0 mie0Var4;
        q4f q4fVar2 = q4fVar;
        oif0 oif0Var = (oif0) this.c;
        if (zjeVar instanceof eht0) {
            eht0Var = (eht0) zjeVar;
            int i5 = eht0Var.s;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eht0Var.s = i5 - Integer.MIN_VALUE;
            } else {
                eht0Var = new eht0(this, zjeVar);
            }
        } else {
            eht0Var = new eht0(this, zjeVar);
        }
        Object obj = eht0Var.q;
        Object obj2 = wne.f39444a;
        int i6 = eht0Var.s;
        if (i6 == 0) {
            z1x.P(obj);
            listN = oif0Var.n();
            mie0Var = new mie0();
            hf6 hf6Var = (hf6) CollectionsKt.f0(listN);
            if (hf6Var != null) {
                int i7 = hf6Var.b;
                int i8 = hf6Var.f12958a;
                arrayList = new ArrayList();
                if (hf6Var.c.isEmpty()) {
                    hf6 hf6VarA = hf6.a(hf6Var, i8 + 1, i7 + 1, null, 0.0d, 28);
                    mie0Var.f21842a = hf6.a(hf6Var, 0, 0, cs0.u(j), 0.0d, 27);
                    for (hf6 hf6Var2 : listN) {
                        if (hf6Var2.f12958a == i8) {
                            hf6Var2 = (hf6) mie0Var.f21842a;
                        }
                        arrayList.add(hf6Var2);
                    }
                    arrayList.add(hf6VarA);
                } else {
                    i = i8 + 1;
                    int i9 = i7 + 1;
                    List listU = cs0.u(j);
                    if (q4fVar2 == q4f.m) {
                        eht0Var.i = q4fVar2;
                        eht0Var.j = listN;
                        eht0Var.k = mie0Var;
                        eht0Var.l = arrayList;
                        eht0Var.m = listU;
                        eht0Var.n = mie0Var;
                        eht0Var.o = i9;
                        eht0Var.p = i;
                        eht0Var.s = 1;
                        Object objE = e(eht0Var);
                        if (objE == obj2) {
                            return obj2;
                        }
                        i4 = i9;
                        obj = objE;
                        mie0Var4 = mie0Var;
                        list = listU;
                    } else {
                        list = listU;
                        mie0Var2 = mie0Var;
                        i2 = i9;
                        mie0Var3 = mie0Var2;
                        d = 0.0d;
                        arrayList2 = arrayList;
                        list2 = listN;
                        i3 = i;
                    }
                    mie0Var3.f21842a = new hf6(i3, i2, list, d, false);
                    arrayList2.addAll(list2);
                    arrayList2.add(mie0Var2.f21842a);
                    arrayList = arrayList2;
                }
                oif0Var.I(arrayList);
            }
            ((g45) this.f9559a).g0(q4fVar2);
            return Unit.f46060a;
        }
        if (i6 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i10 = eht0Var.p;
        i4 = eht0Var.o;
        mie0Var = eht0Var.n;
        list = eht0Var.m;
        ArrayList arrayList3 = eht0Var.l;
        mie0 mie0Var5 = eht0Var.k;
        listN = eht0Var.j;
        q4f q4fVar3 = eht0Var.i;
        z1x.P(obj);
        i = i10;
        q4fVar2 = q4fVar3;
        mie0Var4 = mie0Var5;
        arrayList = arrayList3;
        double dDoubleValue = ((Number) obj).doubleValue();
        mie0Var3 = mie0Var;
        i2 = i4;
        d = dDoubleValue;
        mie0Var2 = mie0Var4;
        list2 = listN;
        i3 = i;
        arrayList2 = arrayList;
        mie0Var3.f21842a = new hf6(i3, i2, list, d, false);
        arrayList2.addAll(list2);
        arrayList2.add(mie0Var2.f21842a);
        arrayList = arrayList2;
        oif0Var.I(arrayList);
        ((g45) this.f9559a).g0(q4fVar2);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object l(ql5 ql5Var, jg7 jg7Var, xuf xufVar, StepInputConfigModel stepInputConfigModel, double d, zje zjeVar) {
        skt0 skt0Var;
        xuf xufVar2;
        Object objG;
        StepInputConfigModel stepInputConfigModel2;
        if (zjeVar instanceof skt0) {
            skt0Var = (skt0) zjeVar;
            int i = skt0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                skt0Var.m = i - Integer.MIN_VALUE;
            } else {
                skt0Var = new skt0(this, zjeVar);
            }
        } else {
            skt0Var = new skt0(this, zjeVar);
        }
        Object obj = skt0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = skt0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            ieu ieuVar = (ieu) this.f9559a;
            long jB = ((ort) this.b).b();
            long j = ql5Var.f28916a;
            byte b = ((vyt) this.c).a().f8665a;
            ArrayList arrayListA = ((drt) this.d).a();
            xufVar2 = xufVar;
            skt0Var.i = xufVar2;
            skt0Var.j = stepInputConfigModel;
            skt0Var.m = 1;
            objG = ((dgu) ieuVar.b).g(jg7Var, jB, j, 95L, d, "", b, arrayListA, ((rpt) ieuVar.c).a(), skt0Var);
            if (objG == wneVar) {
                return wneVar;
            }
            stepInputConfigModel2 = stepInputConfigModel;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            StepInputConfigModel stepInputConfigModel3 = skt0Var.j;
            xuf xufVar3 = skt0Var.i;
            z1x.P(obj);
            stepInputConfigModel2 = stepInputConfigModel3;
            xufVar2 = xufVar3;
            objG = obj;
        }
        return StepInputConfigModel.a(stepInputConfigModel2, 0.0d, 0.0d, 0.0d, xufVar2.i, ((Number) objG).doubleValue(), 0L, null, false, false, false, 4071);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object m(kka kkaVar, boolean z, boolean z2, zje zjeVar) {
        elt0 elt0Var;
        krt0 krt0VarA;
        Object objB;
        boolean z3;
        n3h0 n3h0Var;
        Iterator it;
        Object next;
        qj00 qj00Var;
        int i;
        teo teoVar;
        if (zjeVar instanceof elt0) {
            elt0Var = (elt0) zjeVar;
            int i2 = elt0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                elt0Var.o = i2 - Integer.MIN_VALUE;
            } else {
                elt0Var = new elt0(this, zjeVar);
            }
        } else {
            elt0Var = new elt0(this, zjeVar);
        }
        elt0 elt0Var2 = elt0Var;
        Object objN = elt0Var2.m;
        wne wneVar = wne.f39444a;
        int i3 = elt0Var2.o;
        if (i3 == 0) {
            z1x.P(objN);
            krt0VarA = ((gst0) this.b).f11847a.a();
            b3c0 b3c0Var = (b3c0) this.c;
            elt0Var2.i = kkaVar;
            elt0Var2.j = krt0VarA;
            elt0Var2.k = z;
            elt0Var2.l = z2;
            elt0Var2.o = 1;
            objB = b3c0Var.b(elt0Var2);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            z2 = elt0Var2.l;
            z = elt0Var2.k;
            krt0 krt0Var = elt0Var2.j;
            kka kkaVar2 = elt0Var2.i;
            z1x.P(objN);
            krt0VarA = krt0Var;
            kkaVar = kkaVar2;
            objB = objN;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = elt0Var2.k;
            kkaVar = elt0Var2.i;
            z1x.P(objN);
        }
        uj00 uj00Var = (uj00) objN;
        List list = uj00Var.c;
        n3h0Var = uj00Var.d;
        it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            qj00 qj00Var2 = (qj00) next;
            i = qj00Var2.f28815a;
            teoVar = kkaVar.j;
            if (i != teoVar.f33830a && qj00Var2.f == teoVar.d && qj00Var2.b == teoVar.c.f3953a) {
                break;
            }
        }
        qj00Var = (qj00) next;
        if (qj00Var == null) {
            return kkaVar;
        }
        return kka.a(kkaVar, teo.a(kkaVar.j, qj00Var.c, z3 ? new Double(kkaVar.j.e) : null, qj00Var.d), new v5h0(kotlin.text.c.r(n3h0Var.f22851a, "-", " : ", false), n3h0Var.b), n3h0Var.c, 19967);
        boolean z4 = z2;
        z220 z220Var = (z220) this.f9559a;
        int i4 = kkaVar.f18426a;
        int id = ((uzc) this.d).b().getId();
        int i5 = (int) krt0VarA.f18785a;
        String str = ((m2c0) objB).c;
        int i6 = kkaVar.j.i;
        boolean z5 = krt0VarA.c;
        elt0Var2.i = kkaVar;
        elt0Var2.j = null;
        elt0Var2.k = z;
        elt0Var2.l = z4;
        elt0Var2.o = 2;
        objN = z220Var.n(i4, id, i5, str, i6, z5, z4, elt0Var2);
        if (objN != wneVar) {
            z3 = z;
            uj00 uj00Var2 = (uj00) objN;
            List list2 = uj00Var2.c;
            n3h0Var = uj00Var2.d;
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                qj00 qj00Var3 = (qj00) next;
                i = qj00Var3.f28815a;
                teoVar = kkaVar.j;
                if (i != teoVar.f33830a) {
                }
            }
            qj00Var = (qj00) next;
            if (qj00Var == null) {
                return kkaVar;
            }
            if (z3) {
            }
            return kka.a(kkaVar, teo.a(kkaVar.j, qj00Var.c, z3 ? new Double(kkaVar.j.e) : null, qj00Var.d), new v5h0(kotlin.text.c.r(n3h0Var.f22851a, "-", " : ", false), n3h0Var.b), n3h0Var.c, 19967);
        }
        return wneVar;
    }

    public void n(q4f q4fVar) {
        q4fVar.getClass();
        if (q4fVar != q4f.e) {
            p7m0 p7m0Var = ((aln) ((bwl) this.b).f3330a).b;
            en7 en7Var = new en7(0, 0, 0, 0.0d, false);
            p7m0Var.getClass();
            p7m0Var.o(null, en7Var);
        }
        ((jnn) ((lrc) ((do20) this.d).f6397a).b).b.n(null);
        ((dqc) this.c).a();
        ((vqc) this.f9559a).m(q4fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(int i, zje zjeVar) {
        k9u0 k9u0Var;
        if (zjeVar instanceof k9u0) {
            k9u0Var = (k9u0) zjeVar;
            int i2 = k9u0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k9u0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                k9u0Var = new k9u0(this, zjeVar);
            }
        } else {
            k9u0Var = new k9u0(this, zjeVar);
        }
        Object objA = k9u0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = k9u0Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            rkt0 rkt0Var = (rkt0) this.d;
            String strA = ((btt0) this.b).a();
            k9u0Var.k = 1;
            objA = ((n8u0) ((lkr0) rkt0Var.b).invoke()).a(strA, "application/vnd.xenvelop+json", i, k9u0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = (List) ((dx5) objA).a();
        vwb0 vwb0Var = (vwb0) this.c;
        if (!list.isEmpty()) {
            vby vbyVar = (vby) this.f9559a;
            vbyVar.getClass();
            vwb0Var.h("VERIFICATION_OPTION_CACHE_DATA_KEY", vbyVar.d(new zw3(f8u0.Companion.serializer(), (byte) 0), list));
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, 1);
            vwb0Var.g("VERIFICATION_OPTION_EXPIRATION_CACHE_DATA_KEY", calendar.getTimeInMillis());
        }
        return list;
    }

    public void p() {
        int iD;
        zlt0 zlt0Var = (zlt0) this.b;
        w4p0 w4p0Var = (w4p0) this.f9559a;
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        int i = R.id.accessibilityActionPageLeft;
        rgu0.l(viewPager2, R.id.accessibilityActionPageLeft);
        rgu0.i(viewPager2, 0);
        rgu0.l(viewPager2, R.id.accessibilityActionPageRight);
        rgu0.i(viewPager2, 0);
        rgu0.l(viewPager2, R.id.accessibilityActionPageUp);
        rgu0.i(viewPager2, 0);
        rgu0.l(viewPager2, R.id.accessibilityActionPageDown);
        rgu0.i(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iD = viewPager2.getAdapter().d()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.d < iD - 1) {
                rgu0.m(viewPager2, new d7(R.id.accessibilityActionPageDown, (String) null), w4p0Var);
            }
            if (viewPager2.d > 0) {
                rgu0.m(viewPager2, new d7(R.id.accessibilityActionPageUp, (String) null), zlt0Var);
                return;
            }
            return;
        }
        boolean zB = viewPager2.b();
        int i2 = zB ? 16908360 : 16908361;
        if (zB) {
            i = 16908361;
        }
        if (viewPager2.d < iD - 1) {
            rgu0.m(viewPager2, new d7(i2, (String) null), w4p0Var);
        }
        if (viewPager2.d > 0) {
            rgu0.m(viewPager2, new d7(i, (String) null), zlt0Var);
        }
    }

    public jlw0 q(h0q0 h0q0Var, qyw0... qyw0VarArr) {
        jlw0 jlw0VarU = jlw0.V0;
        for (qyw0 qyw0Var : qyw0VarArr) {
            jlw0VarU = mym0.u(qyw0Var);
            pvm0.N((h0q0) this.c);
            if ((jlw0VarU instanceof plw0) || (jlw0VarU instanceof xkw0)) {
                jlw0VarU = ((okt0) this.f9559a).s(h0q0Var, jlw0VarU);
            }
        }
        return jlw0VarU;
    }

    public jrw0 r() throws GeneralSecurityException {
        Integer num = (Integer) this.f9559a;
        if (num == null) {
            hny.o("Key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            hny.o("IV size is not set");
            return null;
        }
        if (((drq) this.d) == null) {
            hny.o("Variant is not set");
            return null;
        }
        if (((Integer) this.c) != null) {
            return new jrw0(num.intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (drq) this.d);
        }
        hny.o("Tag size is not set");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle s() {
        wvw0 wvw0Var = (wvw0) this.d;
        kxw0 kxw0Var = (kxw0) wvw0Var.b;
        if (((Bundle) this.c) == null) {
            String string = wvw0Var.q1().getString((String) this.f9559a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                miw0.a();
                                                if (kxw0Var.d.x1(null, btw0.P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                uuw0 uuw0Var = kxw0Var.f;
                                                kxw0.g(uuw0Var);
                                                uuw0Var.g.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            miw0.a();
                                            if (kxw0Var.d.x1(null, btw0.P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            uuw0 uuw0Var2 = kxw0Var.f;
                                            kxw0.g(uuw0Var2);
                                            uuw0Var2.g.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        uuw0 uuw0Var3 = kxw0Var.f;
                                        kxw0.g(uuw0Var3);
                                        uuw0Var3.g.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    uuw0 uuw0Var4 = kxw0Var.f;
                                    kxw0.g(uuw0Var4);
                                    uuw0Var4.g.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                uuw0 uuw0Var5 = kxw0Var.f;
                                kxw0.g(uuw0Var5);
                                uuw0Var5.g.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            uuw0 uuw0Var6 = kxw0Var.f;
                            kxw0.g(uuw0Var6);
                            uuw0Var6.g.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    uuw0 uuw0Var7 = kxw0Var.f;
                    kxw0.g(uuw0Var7);
                    uuw0Var7.g.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.c) == null) {
                this.c = (Bundle) this.b;
            }
        }
        Bundle bundle2 = (Bundle) this.c;
        s0x.H(bundle2);
        return new Bundle(bundle2);
    }

    public zzad t(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzaf zzafVarA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(com.google.firebase.auth.internal.zzz.m(jSONArray3.getString(i)));
            }
            zzad zzadVar = new zzad(nfq.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzadVar.f45652a = zzaia.m(string);
            }
            if (!z) {
                zzadVar.h = Boolean.FALSE;
            }
            zzadVar.g = str;
            if (jSONObject.has("userMetadata") && (zzafVarA = zzaf.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzadVar.i = zzafVarA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? PhoneMultiFactorInfo.p(jSONObject2) : Objects.equals(strOptString, "totp") ? TotpMultiFactorInfo.p(jSONObject2) : null);
                }
                zzadVar.s(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(zzao.o(new JSONObject(jSONArray.getString(i3))));
                }
                zzadVar.m = arrayList3;
            }
            return zzadVar;
        } catch (kcw0 e) {
            e = e;
            Log.wtf((String) ((zz2) this.d).b, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            Log.wtf((String) ((zz2) this.d).b, e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.wtf((String) ((zz2) this.d).b, e);
            return null;
        } catch (JSONException e4) {
            e = e4;
            Log.wtf((String) ((zz2) this.d).b, e);
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zcw0 zcw0Var;
        zcw0 zcw0Var2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f9559a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.b;
        String str = (String) this.c;
        ikt0 ikt0Var = (ikt0) this.d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        s0x.H(exception);
        SparseArray sparseArray = jfw0.f16450a;
        if (!(exception instanceof rfq ? ((rfq) exception).b.endsWith("MISSING_RECAPTCHA_TOKEN") : false)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            zcw0Var = firebaseAuth.j;
        }
        if (zcw0Var == null) {
            nfq nfqVar = firebaseAuth.f45644a;
            kys0 kys0Var = new kys0((byte) 26);
            zcw0 zcw0Var3 = new zcw0();
            zcw0Var3.f44186a = new Object();
            zcw0Var3.b = new HashMap();
            zcw0Var3.d = nfqVar;
            zcw0Var3.e = firebaseAuth;
            zcw0Var3.f = kys0Var;
            synchronized (firebaseAuth) {
                firebaseAuth.j = zcw0Var3;
            }
        }
        synchronized (firebaseAuth) {
            zcw0Var2 = firebaseAuth.j;
        }
        return zcw0Var2.c(str, Boolean.FALSE, recaptchaAction).continueWithTask(ikt0Var).continueWithTask(new h0q0(str, zcw0Var2, recaptchaAction, ikt0Var));
    }

    public void u(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public void v(String str, String str2) {
        String strEncodeToString;
        trm0 trm0VarQ = trm0.q((Context) this.f9559a, (String) this.b);
        trm0VarQ.getClass();
        s0x.H(str2);
        ok50 ok50Var = (ok50) trm0VarQ.c;
        String str3 = null;
        if (ok50Var == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (ok50Var) {
                    try {
                        fck0 fck0VarP = ((ok50) trm0VarQ.c).p();
                        a4n0.p();
                        strEncodeToString = Base64.encodeToString(((tmw0) fck0VarP.u(lqw0.f20502a, tmw0.class)).c(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                str3 = strEncodeToString;
            } catch (GeneralSecurityException e) {
                f140.r("Exception encountered while encrypting bytes:\n", e.getMessage(), "FirebearStorageCryptoHelper");
            }
        }
        if (str3 != null) {
            ((SharedPreferences) this.c).edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }

    public void w(HttpURLConnection httpURLConnection) {
        ktv ktvVar;
        String str;
        nfq nfqVar = (nfq) this.d;
        String strN = ohs0.n((String) this.c, "/FirebaseCore-Android");
        fuj0 fuj0Var = (fuj0) this.b;
        if (fuj0Var == null) {
            fuj0Var = new fuj0((Context) this.f9559a, (byte) 24);
            this.b = fuj0Var;
        }
        httpURLConnection.setRequestProperty("X-Android-Package", (String) fuj0Var.f10166a);
        httpURLConnection.setRequestProperty("X-Android-Cert", (String) ((fuj0) this.b).b);
        httpURLConnection.setRequestProperty("Accept-Language", wgm0.z());
        httpURLConnection.setRequestProperty("X-Client-Version", strN);
        httpURLConnection.setRequestProperty("X-Firebase-Locale", null);
        nfqVar.a();
        httpURLConnection.setRequestProperty("X-Firebase-GMPID", nfqVar.c.b);
        zdw0 zdw0Var = (zdw0) nfqVar.b(zdw0.class);
        if (zdw0Var == null || (ktvVar = (ktv) zdw0Var.c.get()) == null) {
            str = null;
        } else {
            try {
                quj qujVar = (quj) ktvVar;
                str = (String) Tasks.await(!tnq0.n(qujVar.b) ? Tasks.forResult("") : Tasks.call(qujVar.e, new puj(qujVar, (byte) 0)));
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e.getMessage());
                str = null;
            }
        }
        httpURLConnection.setRequestProperty("X-Firebase-Client", str);
        zdw0 zdw0Var2 = (zdw0) nfqVar.b(zdw0.class);
        if (zdw0Var2 != null && zdw0Var2.b.get() != null) {
            hny.b();
        } else {
            if (TextUtils.isEmpty(null)) {
                return;
            }
            httpURLConnection.setRequestProperty("X-Firebase-AppCheck", null);
        }
    }

    public void x(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f9559a = Integer.valueOf(i);
    }

    public void y(Bundle bundle) {
        wvw0 wvw0Var = (wvw0) this.d;
        kxw0 kxw0Var = (kxw0) wvw0Var.b;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor editorEdit = wvw0Var.q1().edit();
        int size = bundle2.size();
        String str = (String) this.f9559a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        miw0.a();
                        if (kxw0Var.d.x1(null, btw0.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                uuw0 uuw0Var = kxw0Var.f;
                                kxw0.g(uuw0Var);
                                uuw0Var.g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                uuw0 uuw0Var2 = kxw0Var.f;
                                kxw0.g(uuw0Var2);
                                uuw0Var2.g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        uuw0 uuw0Var3 = kxw0Var.f;
                        kxw0.g(uuw0Var3);
                        uuw0Var3.g.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.c = bundle2;
    }

    public String z(String str) {
        String str2;
        String string = ((SharedPreferences) this.c).getString(str, null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        trm0 trm0VarQ = trm0.q((Context) this.f9559a, (String) this.b);
        String strSubstring = string.substring(10);
        trm0VarQ.getClass();
        ok50 ok50Var = (ok50) trm0VarQ.c;
        if (ok50Var == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (ok50Var) {
                fck0 fck0VarP = ((ok50) trm0VarQ.c).p();
                a4n0.p();
                str2 = new String(((tmw0) fck0VarP.u(lqw0.f20502a, tmw0.class)).b(Base64.decode(strSubstring, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e) {
            f140.r("Exception encountered while decrypting bytes:\n", e.getMessage(), "FirebearStorageCryptoHelper");
            return null;
        }
    }

    public fht0(wvw0 wvw0Var, String str) {
        this.d = wvw0Var;
        s0x.E(str);
        this.f9559a = str;
        this.b = new Bundle();
    }

    public fht0(z220 z220Var, gst0 gst0Var, b3c0 b3c0Var, uzc uzcVar) {
        gst0Var.getClass();
        b3c0Var.getClass();
        this.f9559a = z220Var;
        this.b = gst0Var;
        this.c = b3c0Var;
        this.d = uzcVar;
    }

    public fht0(g45 g45Var, xre xreVar, oif0 oif0Var, etj etjVar) {
        etjVar.getClass();
        this.f9559a = g45Var;
        this.b = xreVar;
        this.c = oif0Var;
        this.d = etjVar;
    }

    public fht0(g45 g45Var, uzc uzcVar, gst0 gst0Var, b3c0 b3c0Var) {
        gst0Var.getClass();
        b3c0Var.getClass();
        this.f9559a = g45Var;
        this.b = uzcVar;
        this.c = gst0Var;
        this.d = b3c0Var;
    }

    public fht0(vby vbyVar, btt0 btt0Var, vwb0 vwb0Var, rkt0 rkt0Var) {
        vbyVar.getClass();
        btt0Var.getClass();
        vwb0Var.getClass();
        this.f9559a = vbyVar;
        this.b = btt0Var;
        this.c = vwb0Var;
        this.d = rkt0Var;
    }

    public /* synthetic */ fht0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f9559a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public fht0(Context context, nfq nfqVar, String str) {
        s0x.H(context);
        this.f9559a = context;
        s0x.H(nfqVar);
        this.d = nfqVar;
        this.c = "Android/Fallback/".concat(str);
    }
}
