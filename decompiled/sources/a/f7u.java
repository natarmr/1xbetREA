package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class f7u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9075a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public f7u(Context context) {
        this.f9075a = (byte) 24;
        this.b = context.getApplicationContext();
        this.c = l1x.o;
        this.d = null;
        this.e = new juo();
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zlb) it.next()).c);
        }
        return r3d.r(arrayList);
    }

    public static int g(RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (recyclerView2 = layoutManager.b) == null || !recyclerView2.h) {
            return 0;
        }
        return recyclerView.getPaddingLeft();
    }

    public static int h(RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (recyclerView2 = layoutManager.b) == null || !recyclerView2.h) {
            return 0;
        }
        return recyclerView.getPaddingTop();
    }

    public static zdx i(xqj0 xqj0Var, bom0 bom0Var) {
        boolean z = xqj0Var.m;
        long j = xqj0Var.f41323a;
        if ((!z && !(bom0Var instanceof znm0)) || tx3.l0(new Long[]{189L, 56L, 9L, 182L}).contains(Long.valueOf(j))) {
            return m3h0.b;
        }
        boolean z2 = j == 66;
        String str = xqj0Var.t;
        if (!z2) {
            str = null;
        }
        if (str == null) {
            str = xqj0Var.e;
        }
        String str2 = z2 ? xqj0Var.u : null;
        if (str2 == null) {
            str2 = xqj0Var.f;
        }
        return new l3h0(str, str2);
    }

    public static boolean y(ufp0 ufp0Var) {
        return StringsKt__StringsKt.split$default(ufp0Var.b, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1;
    }

    public void A() {
        i8i.D("option", "help", (kt2) ((y3v) this.b).b, "auth_login_pass_error_click");
        b1j.v("help", ((s64) this.c).f31684a, 11010L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(zje zjeVar) {
        mbx mbxVar;
        if (zjeVar instanceof mbx) {
            mbxVar = (mbx) zjeVar;
            int i = mbxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbxVar.k = i - Integer.MIN_VALUE;
            } else {
                mbxVar = new mbx(this, zjeVar);
            }
        } else {
            mbxVar = new mbx(this, zjeVar);
        }
        Object objJ = mbxVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mbxVar.k;
        if (i2 == 0) {
            z1x.P(objJ);
            lhf0 lhf0Var = (lhf0) this.d;
            String strC = ((knf0) this.c).c();
            mbxVar.k = 1;
            objJ = lhf0Var.j(strC, "en_GB", mbxVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        Iterable<qj3> iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (qj3 qj3Var : iterable) {
            arrayList.add(new Pair(qj3Var.b, qj3Var.c));
        }
        l4x l4xVarI = b8k0.I((us00) this.b);
        l4xVarI.getClass();
        l4x.c(arrayList, l4xVarI.f19431a);
        return Unit.f46060a;
    }

    public void C(boolean z) {
        s1p s1pVar = ((s64) this.c).f31684a;
        kt2 kt2Var = (kt2) ((y3v) this.b).b;
        if (z) {
            kt2Var.a("change_login_type", wp20.b(new Pair("option", "phone")));
            s1pVar.a(cui0.b(new j1p("phone", (byte) 0)), 3037L);
        } else {
            kt2Var.a("change_login_type", wp20.b(new Pair("option", "email_id_login")));
            s1pVar.a(cui0.b(new j1p("ID_login_email", (byte) 0)), 3037L);
        }
    }

    public void D() {
        ((je) this.e).f16351a.a(xun.f41520a, 3041L);
        ((kt2) ((y3v) this.b).b).c("login_lost_pass_call");
    }

    public void E(String str, boolean z) {
        s1p s1pVar = ((s64) this.c).f31684a;
        y3v y3vVar = (y3v) this.b;
        peg0 peg0Var = (peg0) y3vVar.c;
        yk50 yk50Var = (yk50) y3vVar.d;
        kt2 kt2Var = (kt2) y3vVar.b;
        if (z) {
            Pair pair = new Pair("option", "phone");
            Pair pair2 = new Pair("af_id", ((knf0) yk50Var.b).a());
            peg0Var.i();
            kt2Var.a("login_call", xp20.f(pair, pair2, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC")));
            s1pVar.a(tx3.l0(new k1p[]{new j1p("phone", (byte) 0), new j1p(str, (byte) 2)}), 3036L);
            return;
        }
        Pair pair3 = new Pair("option", "ID_login_email");
        Pair pair4 = new Pair("af_id", ((knf0) yk50Var.b).a());
        peg0Var.i();
        kt2Var.a("login_call", xp20.f(pair3, pair4, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC")));
        s1pVar.a(tx3.l0(new k1p[]{new j1p("ID_login_email", (byte) 0), new j1p(str, (byte) 2)}), 3036L);
    }

    public void F(String str) {
        y3v y3vVar = (y3v) this.b;
        kt2 kt2Var = (kt2) y3vVar.b;
        Pair pair = new Pair("social_media", "qr-scanner");
        Pair pair2 = new Pair("af_id", ((knf0) ((yk50) y3vVar.d).b).a());
        ((peg0) y3vVar.c).i();
        kt2Var.a("login_call", xp20.f(pair, pair2, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC")));
        ((s64) this.c).f31684a.a(tx3.l0(new k1p[]{new j1p("qr-scanner", (byte) 1), new j1p(str, (byte) 2)}), 3036L);
    }

    public void G(int i, String str) {
        y3v y3vVar = (y3v) this.b;
        String strF = zjb.F(i);
        kt2 kt2Var = (kt2) y3vVar.b;
        Pair pair = new Pair("social_media", strF);
        Pair pair2 = new Pair("af_id", ((knf0) ((yk50) y3vVar.d).b).a());
        ((peg0) y3vVar.c).i();
        kt2Var.a("login_call", xp20.f(pair, pair2, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC")));
        ((s64) this.c).f31684a.a(tx3.l0(new k1p[]{new j1p(zjb.F(i), (byte) 1), new j1p(str, (byte) 2)}), 3036L);
    }

    public void H(lh4 lh4Var) {
        s1p s1pVar = ((s64) this.c).f31684a;
        kt2 kt2Var = (kt2) ((y3v) this.b).b;
        lh4Var.getClass();
        if (lh4Var.equals(gh4.f11281a) || lh4Var.equals(ih4.f14763a) || lh4Var.equals(jh4.f16510a) || lh4Var.equals(kh4.f18271a)) {
            kt2Var.a("login_page_data_error", wp20.b(new Pair("field", "login")));
            s1pVar.a(cui0.b(new j1p("login", (byte) 0)), 3038L);
        } else if (!lh4Var.equals(hh4.f13044a)) {
            t9f.b();
        } else {
            kt2Var.a("login_page_data_error", wp20.b(new Pair("field", "pass")));
            s1pVar.a(cui0.b(new j1p("pass", (byte) 0)), 3038L);
        }
    }

    public qfw a() {
        Integer num = (Integer) this.b;
        if (num == null) {
            hny.o("key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            hny.o("tag size is not set");
            return null;
        }
        if (((h70) this.d) == null) {
            hny.o("hash type is not set");
            return null;
        }
        if (((pfw) this.e) == null) {
            hny.o("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.b));
        }
        Integer num2 = (Integer) this.c;
        int iIntValue = num2.intValue();
        h70 h70Var = (h70) this.d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (h70Var == h70.f) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (h70Var == h70.g) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (h70Var == h70.h) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (h70Var == h70.i) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (h70Var != h70.j) {
                hny.o("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new qfw(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (pfw) this.e, (h70) this.d);
    }

    public gbe0 b() {
        l1x l1xVar;
        ngd ngdVar;
        Context context = (Context) this.b;
        l1x l1xVar2 = (l1x) this.c;
        l1x l1xVar3 = new l1x(l1xVar2.f19280a, l1xVar2.b, l1xVar2.c, l1xVar2.d, l1xVar2.e, l1xVar2.f, l1xVar2.g, l1xVar2.h, l1xVar2.i, l1xVar2.j, l1xVar2.k, l1xVar2.l, l1xVar2.m, new luo(aac.f0(((juo) this.e).f17165a)));
        n0o0 n0o0VarB = maz.b(new kdw((byte) 20));
        n0o0 n0o0VarB2 = maz.b(new bdv(this, (byte) 29));
        n0o0 n0o0VarB3 = maz.b(new kdw((byte) 21));
        ngd ngdVar2 = (ngd) this.d;
        if (ngdVar2 == null) {
            iun iunVar = iun.f15405a;
            ngdVar = new ngd(iunVar, iunVar, iunVar, iunVar, iunVar);
            l1xVar = l1xVar3;
        } else {
            l1xVar = l1xVar3;
            ngdVar = ngdVar2;
        }
        return new gbe0(new dbe0(context, l1xVar, n0o0VarB, n0o0VarB2, n0o0VarB3, ngdVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(zje zjeVar) {
        jqu jquVar;
        int iIntValue;
        if (zjeVar instanceof jqu) {
            jquVar = (jqu) zjeVar;
            int i = jquVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jquVar.k = i - Integer.MIN_VALUE;
            } else {
                jquVar = new jqu(this, zjeVar);
            }
        } else {
            jquVar = new jqu(this, zjeVar);
        }
        Object objA = jquVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jquVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            iIntValue = 0;
            if (((gst0) this.e).a()) {
                b3c0 b3c0Var = (b3c0) this.d;
                jquVar.k = 1;
                objA = b3c0Var.a(false, jquVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iIntValue);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        iIntValue = intOrNull != null ? intOrNull.intValue() : 225;
        return new Integer(iIntValue);
    }

    public View e(RecyclerView recyclerView, View view) {
        boolean zE = htz.e(recyclerView);
        int i = zE ? -1 : 1;
        for (int childCount = zE ? recyclerView.getChildCount() - 1 : 0; childCount >= 0 && childCount <= recyclerView.getChildCount() - 1; childCount += i) {
            View childAt = recyclerView.getChildAt(childCount);
            childAt.getClass();
            int iD = htz.d(recyclerView);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            hhe0 hhe0Var = (hhe0) layoutParams;
            Rect rect = (Rect) this.d;
            sek.p(rect, view);
            int iU = RecyclerView.U(childAt);
            if (iU != -1 && ((ieu) this.c).c(recyclerView, iU) == view) {
                if (iD == 1) {
                    if (childAt.getTop() - ((ViewGroup.MarginLayoutParams) hhe0Var).topMargin < view.getBottom() + h(recyclerView) + rect.bottom + rect.top) {
                    }
                } else if (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) hhe0Var).leftMargin < view.getRight() + g(recyclerView) + rect.right + rect.left) {
                }
            }
            return childAt;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Serializable f(int i, zje zjeVar, boolean z) {
        mxv mxvVar;
        boolean z2;
        dx5 dx5Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof mxv) {
            mxvVar = (mxv) zjeVar;
            int i2 = mxvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mxvVar.l = i2 - Integer.MIN_VALUE;
            } else {
                mxvVar = new mxv(this, zjeVar);
            }
        } else {
            mxvVar = new mxv(this, zjeVar);
        }
        Object objB = mxvVar.j;
        wne wneVar = wne.f39444a;
        int i3 = mxvVar.l;
        if (i3 == 0) {
            z1x.P(objB);
            int iB = knf0Var.b();
            String strA = ((kuy) this.e).a();
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
            if (i != 0) {
                ulb.m0(linkedHashMap, i);
            }
            linkedHashMap.put("fcountry", Integer.valueOf(iB));
            linkedHashMap.put("gr", 1357);
            ulb.V(linkedHashMap, strA);
            tlb.a0(linkedHashMap);
            tlb.m0(22, linkedHashMap);
            tpv tpvVar = (tpv) ((hru) this.b).f13549a;
            if (z) {
                mxvVar.i = z;
                mxvVar.l = 1;
                objB = ((ylb) tpvVar.invoke()).a(linkedHashMap, mxvVar);
                if (objB != wneVar) {
                    z2 = z;
                    dx5Var = (dx5) objB;
                }
            } else {
                mxvVar.i = z;
                mxvVar.l = 2;
                objB = ((ylb) tpvVar.invoke()).b(linkedHashMap, mxvVar);
                if (objB != wneVar) {
                    z2 = z;
                    dx5Var = (dx5) objB;
                }
            }
            return wneVar;
        }
        if (i3 == 1) {
            z2 = mxvVar.i;
            z1x.P(objB);
            dx5Var = (dx5) objB;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = mxvVar.i;
            z1x.P(objB);
            dx5Var = (dx5) objB;
        }
        boolean z3 = z2;
        Iterable<xlb> iterable = (Iterable) dx5Var.a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (xlb xlbVar : iterable) {
            xlbVar.getClass();
            Long l = xlbVar.f41063a;
            if (l == null) {
                jf4.k(null);
                return null;
            }
            long jLongValue = l.longValue();
            Long l2 = xlbVar.b;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            String str = xlbVar.c;
            String str2 = str == null ? "" : str;
            String str3 = xlbVar.d;
            String str4 = str3 == null ? "" : str3;
            qud qudVar = boh.b;
            Integer num = xlbVar.e;
            qudVar.getClass();
            boh bohVarC = qud.c(num);
            Boolean bool = xlbVar.f;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            String str5 = xlbVar.g;
            String str6 = str5 == null ? "" : str5;
            String str7 = xlbVar.h;
            arrayList.add(new kxv(jLongValue, jLongValue2, str2, str4, bohVarC, zBooleanValue, str6, str7 == null ? "" : str7, z3, false));
        }
        lxv lxvVar = (lxv) this.c;
        lxvVar.getClass();
        if (z3) {
            lxvVar.f20834a.d(arrayList);
            return arrayList;
        }
        lxvVar.b.d(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r10 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.xqj0 r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.seu
            if (r0 == 0) goto L13
            r0 = r10
            a.seu r0 = (a.seu) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.seu r0 = new a.seu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            a.xqj0 r9 = r0.i
            a.z1x.P(r10)
            goto L68
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L33:
            a.xqj0 r9 = r0.i
            a.z1x.P(r10)
            goto L7d
        L39:
            a.z1x.P(r10)
            a.hrj0 r10 = r9.n
            long r6 = r9.s
            int r10 = r10.ordinal()
            if (r10 == 0) goto L72
            if (r10 == r5) goto L5d
            if (r10 == r4) goto L57
            r8 = 3
            if (r10 != r8) goto L53
            a.fdm0 r8 = new a.fdm0
            r8.<init>(r6)
            return r8
        L53:
            a.t9f.b()
            return r3
        L57:
            a.edm0 r8 = new a.edm0
            r8.<init>(r6)
            return r8
        L5d:
            r0.i = r9
            r0.l = r4
            java.lang.Object r10 = r8.k(r9, r0)
            if (r10 != r1) goto L68
            goto L7c
        L68:
            a.odm0 r10 = (a.odm0) r10
            long r8 = r9.s
            a.gdm0 r0 = new a.gdm0
            r0.<init>(r8, r10)
            return r0
        L72:
            r0.i = r9
            r0.l = r5
            java.lang.Object r10 = r8.k(r9, r0)
            if (r10 != r1) goto L7d
        L7c:
            return r1
        L7d:
            a.odm0 r10 = (a.odm0) r10
            long r8 = r9.s
            a.gdm0 r0 = new a.gdm0
            r0.<init>(r8, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f7u.j(a.xqj0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x0215  */
    /* JADX WARN: Code duplicated, block: B:120:0x0218  */
    /* JADX WARN: Code duplicated, block: B:122:0x021b  */
    /* JADX WARN: Code duplicated, block: B:123:0x021e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0228  */
    /* JADX WARN: Code duplicated, block: B:128:0x022c  */
    /* JADX WARN: Code duplicated, block: B:129:0x022f  */
    /* JADX WARN: Code duplicated, block: B:132:0x024b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0256  */
    /* JADX WARN: Code duplicated, block: B:136:0x025a  */
    /* JADX WARN: Code duplicated, block: B:137:0x025c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111 A[PHI: r2
  0x0111: PHI (r2v33 java.lang.String) = (r2v16 java.lang.String), (r2v34 java.lang.String) binds: [B:53:0x0117, B:50:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r3 == r5) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(a.xqj0 r23, a.zje r24) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f7u.k(a.xqj0, a.zje):java.lang.Object");
    }

    public utb l(long j, long j2, boolean z, boolean z2, boolean z3) {
        return aoq.c(kpb.k0(bkb.h0(z ? 8L : 30L, TimeUnit.SECONDS, new mo0(this, z, j, j2, (yje) null)), 3L, new eae(z, this, null)), new b9u((byte) 1, null, this, z2, z3));
    }

    public boolean m(int i, boolean z) {
        d6e d6eVar = (d6e) this.b;
        if (i < 0 || i >= d6eVar.d()) {
            return false;
        }
        long jC = d6eVar.C(i);
        if (jC >= 0) {
            int i2 = (z ? 1 : -1) + i;
            long jC2 = (i2 < 0 || i2 >= d6eVar.d()) ? -1L : d6eVar.C(i2);
            if (i == (z ? d6eVar.d() - 1 : 0) || jC != jC2) {
                return true;
            }
        }
        return false;
    }

    public zj2 n(String str) {
        str.getClass();
        nfm0 nfm0Var = ((zqu) this.b).f44824a;
        nfm0Var.getClass();
        ddm0 ddm0Var = nfm0Var.c;
        ddm0Var.getClass();
        return new zj2(new zj2(vtb.M(ddm0Var.c), ddm0Var, str, (byte) 20), this, str, (byte) 10);
    }

    public k06 o(long j, List list, List list2, String str, String str2, String str3) {
        list.getClass();
        list2.getClass();
        str3.getClass();
        sff0 sff0VarA = ((pru) this.e).a();
        abu abuVar = (abu) this.b;
        String strA = ((ntu) this.d).a();
        String strA2 = ((xoc) this.c).a(!list.isEmpty());
        boolean z = sff0VarA.b.N;
        strA.getClass();
        return new k06(new x860(16, false), new k31((n31) abuVar.c, z, list, j, list2, str3, ((j1q0) abuVar.b).f15748a.a(), str, str2, strA2, strA, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        r2 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a.cne0 p() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f7u.p():a.cne0");
    }

    public hko0 q() {
        String strB = ((mrc) this.c).b();
        int iA = ((mrc) this.d).a(strB);
        hnu hnuVar = (hnu) this.b;
        kjo0 kjo0VarA = ((t1u) this.e).a(iA, strB);
        eia0 eia0Var = (eia0) ((gxu) hnuVar.f13365a).b;
        eia0Var.getClass();
        hko0 hko0Var = (hko0) eia0Var.e.e.get(strB + iA + kjo0VarA);
        return hko0Var == null ? hko0.d : hko0Var;
    }

    public Serializable r(y32 y32Var) {
        ieu ieuVar = (ieu) this.b;
        zn00 zn00Var = (zn00) ((hru) this.d).f13549a;
        ((knf0) zn00Var.f44650a).getClass();
        String strM = twn.m(((us3) zn00Var.b).c().f11610a, "android_release_notes_1_");
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        int i = ((bzt) this.c).f3488a.a().f36976a;
        String strA = ((ntu) this.e).a();
        yje yjeVar = null;
        return ((pzu) ieuVar.b).n0(strM, lunVar, new tr((Object) ieuVar, 0L, yjeVar, (byte) 9), "", "225", i, "", new p23(2, yjeVar, (byte) 6), false, "", strA, y32Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object s(long j, zje zjeVar, boolean z) {
        xo00 xo00Var;
        mii0 mii0Var;
        long j2;
        int i;
        Integer intOrNull;
        mii0 mii0Var2;
        boolean z2;
        long j3;
        int i2;
        boolean z3;
        Object objD0;
        long j4 = j;
        boolean z4 = z;
        if (zjeVar instanceof xo00) {
            xo00Var = (xo00) zjeVar;
            int i3 = xo00Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xo00Var.q = i3 - Integer.MIN_VALUE;
            } else {
                xo00Var = new xo00(this, zjeVar);
            }
        } else {
            xo00Var = new xo00(this, zjeVar);
        }
        Object obj = xo00Var.o;
        wne wneVar = wne.f39444a;
        int i4 = xo00Var.q;
        if (i4 == 0) {
            z1x.P(obj);
            mii0Var = (mii0) this.b;
            int id = ((uzc) this.c).b().getId();
            if (((gst0) this.e).a()) {
                b3c0 b3c0Var = (b3c0) this.d;
                xo00Var.l = mii0Var;
                xo00Var.i = j4;
                xo00Var.k = z4;
                xo00Var.m = id;
                xo00Var.j = j4;
                xo00Var.n = z4;
                xo00Var.q = 1;
                Object objA = b3c0Var.a(false, xo00Var);
                if (objA != wneVar) {
                    j3 = j4;
                    i2 = id;
                    obj = objA;
                    z3 = z4;
                }
            } else {
                j2 = j4;
                i = id;
                intOrNull = null;
                mii0Var2 = mii0Var;
                z2 = z4;
                xo00Var.l = null;
                xo00Var.i = j4;
                xo00Var.k = z4;
                xo00Var.q = 2;
                objD0 = qjj.d0(((mne) mii0Var2.d).b, new gr6(mii0Var2, z2, i, j2, intOrNull, (yje) null), xo00Var);
                if (objD0 != wneVar) {
                    return objD0;
                }
            }
            return wneVar;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z3 = xo00Var.n;
        j4 = xo00Var.j;
        int i5 = xo00Var.m;
        boolean z5 = xo00Var.k;
        j3 = xo00Var.i;
        mii0Var = xo00Var.l;
        z1x.P(obj);
        i2 = i5;
        z4 = z5;
        j2 = j4;
        intOrNull = StringsKt.toIntOrNull(((m2c0) obj).c);
        i = i2;
        j4 = j3;
        mii0Var2 = mii0Var;
        z2 = z3;
        xo00Var.l = null;
        xo00Var.i = j4;
        xo00Var.k = z4;
        xo00Var.q = 2;
        objD0 = qjj.d0(((mne) mii0Var2.d).b, new gr6(mii0Var2, z2, i, j2, intOrNull, (yje) null), xo00Var);
        if (objD0 != wneVar) {
            return wneVar;
        }
        return objD0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public Object t(long j, boolean z, boolean z2, zje zjeVar) {
        eku ekuVar;
        List list;
        boolean z3;
        boolean z4;
        long j2;
        kku kkuVar;
        List list2;
        boolean z5;
        boolean z6;
        long j3;
        long j4 = j;
        boolean z7 = z;
        boolean z8 = z2;
        byte b = 22;
        switch (this.f9075a) {
            case 6:
                if (zjeVar instanceof eku) {
                    ekuVar = (eku) zjeVar;
                    int i = ekuVar.o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ekuVar.o = i - Integer.MIN_VALUE;
                    } else {
                        ekuVar = new eku(this, zjeVar);
                    }
                } else {
                    ekuVar = new eku(this, zjeVar);
                }
                Object objB = ekuVar.m;
                wne wneVar = wne.f39444a;
                int i2 = ekuVar.o;
                if (i2 == 0) {
                    z1x.P(objB);
                    zfo zfoVar = (zfo) this.e;
                    ekuVar.i = j4;
                    ekuVar.j = z7;
                    ekuVar.k = z8;
                    ekuVar.o = 1;
                    objB = zfoVar.b(ekuVar);
                    if (objB != wneVar) {
                    }
                    return wneVar;
                }
                if (i2 == 1) {
                    boolean z9 = ekuVar.k;
                    boolean z10 = ekuVar.j;
                    long j5 = ekuVar.i;
                    z1x.P(objB);
                    z8 = z9;
                    z7 = z10;
                    j4 = j5;
                } else {
                    if (i2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z11 = ekuVar.k;
                    z4 = ekuVar.j;
                    j2 = ekuVar.i;
                    list = ekuVar.l;
                    z1x.P(objB);
                    z3 = z11;
                }
                boolean z12 = z4;
                return new dku(new i89(((p530) this.b).f26386a.c(j2), b), this, j2, list, (List) objB, z12, z3, (byte) 0);
                List list3 = (List) objB;
                edo edoVar = (edo) this.d;
                ekuVar.l = list3;
                ekuVar.i = j4;
                ekuVar.j = z7;
                ekuVar.k = z8;
                ekuVar.o = 2;
                Object objB2 = edoVar.b(ekuVar);
                if (objB2 != wneVar) {
                    list = list3;
                    objB = objB2;
                    z3 = z8;
                    z4 = z7;
                    j2 = j4;
                    boolean z13 = z4;
                    return new dku(new i89(((p530) this.b).f26386a.c(j2), b), this, j2, list, (List) objB, z13, z3, (byte) 0);
                }
                return wneVar;
            default:
                if (zjeVar instanceof kku) {
                    kkuVar = (kku) zjeVar;
                    int i3 = kkuVar.o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kkuVar.o = i3 - Integer.MIN_VALUE;
                    } else {
                        kkuVar = new kku(this, zjeVar);
                    }
                } else {
                    kkuVar = new kku(this, zjeVar);
                }
                Object objB3 = kkuVar.m;
                wne wneVar2 = wne.f39444a;
                int i4 = kkuVar.o;
                if (i4 == 0) {
                    z1x.P(objB3);
                    zfo zfoVar2 = (zfo) this.e;
                    kkuVar.i = j4;
                    kkuVar.j = z7;
                    kkuVar.k = z8;
                    kkuVar.o = 1;
                    objB3 = zfoVar2.b(kkuVar);
                    if (objB3 != wneVar2) {
                    }
                    return wneVar2;
                }
                if (i4 == 1) {
                    boolean z14 = kkuVar.k;
                    boolean z15 = kkuVar.j;
                    long j6 = kkuVar.i;
                    z1x.P(objB3);
                    z8 = z14;
                    z7 = z15;
                    j4 = j6;
                } else {
                    if (i4 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z16 = kkuVar.k;
                    z6 = kkuVar.j;
                    j3 = kkuVar.i;
                    list2 = kkuVar.l;
                    z1x.P(objB3);
                    z5 = z16;
                }
                boolean z17 = z6;
                return new dku(new i89(((rr20) this.b).f30960a.b(j3), b), this, j3, list2, (List) objB3, z17, z5, (byte) 2);
                List list4 = (List) objB3;
                edo edoVar2 = (edo) this.d;
                kkuVar.l = list4;
                kkuVar.i = j4;
                kkuVar.j = z7;
                kkuVar.k = z8;
                kkuVar.o = 2;
                Object objB4 = edoVar2.b(kkuVar);
                if (objB4 != wneVar2) {
                    list2 = list4;
                    objB3 = objB4;
                    z5 = z8;
                    z6 = z7;
                    j3 = j4;
                    boolean z18 = z6;
                    return new dku(new i89(((rr20) this.b).f30960a.b(j3), b), this, j3, list2, (List) objB3, z18, z5, (byte) 2);
                }
                return wneVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(zje zjeVar) {
        v2v v2vVar;
        boolean z;
        lbu lbuVar;
        int iIntValue;
        Integer num;
        int i;
        lbu lbuVar2;
        Serializable serializableR;
        if (zjeVar instanceof v2v) {
            v2vVar = (v2v) zjeVar;
            int i2 = v2vVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2vVar.n = i2 - Integer.MIN_VALUE;
            } else {
                v2vVar = new v2v(this, zjeVar);
            }
        } else {
            v2vVar = new v2v(this, zjeVar);
        }
        Object obj = v2vVar.l;
        wne wneVar = wne.f39444a;
        int i3 = v2vVar.n;
        if (i3 == 0) {
            z1x.P(obj);
            boolean zA = ((iqt) this.b).f15225a.a();
            lbu lbuVar3 = (lbu) this.c;
            x0u x0uVar = (x0u) this.d;
            v2vVar.j = lbuVar3;
            v2vVar.i = zA;
            v2vVar.n = 1;
            Object objC = x0uVar.c(v2vVar);
            if (objC != wneVar) {
                z = zA;
                obj = objC;
                lbuVar = lbuVar3;
            }
            return wneVar;
        }
        if (i3 == 1) {
            z = v2vVar.i;
            lbuVar = v2vVar.j;
            z1x.P(obj);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = v2vVar.k;
            z = v2vVar.i;
            lbuVar2 = v2vVar.j;
            z1x.P(obj);
        }
        Integer num2 = new Integer((int) ((ql5) obj).e);
        iIntValue = i;
        num = num2;
        lbuVar = lbuVar2;
        v2vVar.j = null;
        v2vVar.i = z;
        v2vVar.n = 3;
        serializableR = ((h0q0) lbuVar.b).r(iIntValue, ((gst0) lbuVar.c).a(), num, v2vVar);
        if (serializableR == wneVar) {
            return wneVar;
        }
        return serializableR;
        iIntValue = ((Number) obj).intValue();
        if (z) {
            nou nouVar = (nou) this.e;
            v2vVar.j = lbuVar;
            v2vVar.i = z;
            v2vVar.k = iIntValue;
            v2vVar.n = 2;
            Serializable serializableA = nouVar.a(tl5.c, v2vVar);
            if (serializableA != wneVar) {
                obj = serializableA;
                i = iIntValue;
                lbuVar2 = lbuVar;
                Integer num3 = new Integer((int) ((ql5) obj).e);
                iIntValue = i;
                num = num3;
                lbuVar = lbuVar2;
                v2vVar.j = null;
                v2vVar.i = z;
                v2vVar.n = 3;
                serializableR = ((h0q0) lbuVar.b).r(iIntValue, ((gst0) lbuVar.c).a(), num, v2vVar);
                if (serializableR == wneVar) {
                    return serializableR;
                }
            }
        } else {
            num = null;
            v2vVar.j = null;
            v2vVar.i = z;
            v2vVar.n = 3;
            serializableR = ((h0q0) lbuVar.b).r(iIntValue, ((gst0) lbuVar.c).a(), num, v2vVar);
            if (serializableR == wneVar) {
                return serializableR;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object v(List list, ynb0 ynb0Var, int i, boolean z, boolean z2, zje zjeVar) {
        n4v n4vVar;
        svu svuVar;
        List listL0;
        cne0 cne0VarP;
        boolean z3;
        ynb0 ynb0Var2;
        boolean z4;
        int i2;
        int i3 = i;
        if (zjeVar instanceof n4v) {
            n4vVar = (n4v) zjeVar;
            int i4 = n4vVar.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                n4vVar.s = i4 - Integer.MIN_VALUE;
            } else {
                n4vVar = new n4v(this, zjeVar);
            }
        } else {
            n4vVar = new n4v(this, zjeVar);
        }
        Object obj = n4vVar.q;
        wne wneVar = wne.f39444a;
        int i5 = n4vVar.s;
        if (i5 == 0) {
            z1x.P(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : linkedHashSet) {
                if (obj2 instanceof s1q) {
                    arrayList.add(obj2);
                }
            }
            s1q s1qVar = (s1q) CollectionsKt.firstOrNull(arrayList);
            if (s1qVar != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                String strG = wxs0.g(jCurrentTimeMillis, s1qVar.b);
                linkedHashSet.remove(s1qVar);
                linkedHashSet.add(new t1q(jCurrentTimeMillis));
                linkedHashSet.add(new s1q(strG, s1qVar.f31470a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof j1q) {
                    arrayList2.add(obj3);
                }
            }
            ((l1f0) ((pmi0) this.c).f27236a).f19249a.getClass();
            svuVar = (svu) this.b;
            listL0 = CollectionsKt.L0(linkedHashSet);
            cne0VarP = ((f7u) this.e).p();
            umt umtVar = (umt) this.d;
            n4vVar.i = svuVar;
            n4vVar.j = listL0;
            n4vVar.k = cne0VarP;
            n4vVar.l = ynb0Var;
            n4vVar.m = i3;
            z3 = z;
            n4vVar.o = z3;
            n4vVar.p = z2;
            n4vVar.n = i3;
            n4vVar.s = 1;
            Object objA = umtVar.a(n4vVar);
            if (objA != wneVar) {
                ynb0Var2 = ynb0Var;
                z4 = z2;
                obj = objA;
                i2 = i3;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = n4vVar.n;
        boolean z5 = n4vVar.p;
        z3 = n4vVar.o;
        int i6 = n4vVar.m;
        ynb0 ynb0Var3 = n4vVar.l;
        cne0VarP = n4vVar.k;
        listL0 = n4vVar.j;
        svuVar = n4vVar.i;
        z1x.P(obj);
        z4 = z5;
        i3 = i6;
        ynb0Var2 = ynb0Var3;
        n4vVar.i = null;
        n4vVar.j = null;
        n4vVar.k = null;
        n4vVar.l = null;
        n4vVar.m = i3;
        n4vVar.o = z3;
        n4vVar.p = z4;
        n4vVar.s = 2;
        y1f0 y1f0Var = (y1f0) svuVar.f32888a;
        y1f0Var.getClass();
        Object objD0 = qjj.d0(y1f0Var.b.b, new w1f0(z4, y1f0Var, (String) obj, efx.R(listL0, cne0VarP, i2, q7f0.ONE_CLICK, z3), ynb0Var2, null, (byte) 2), n4vVar);
        return objD0 == wneVar ? wneVar : objD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(boolean z, boolean z2, zje zjeVar) {
        e7u e7uVar;
        boolean z3;
        boolean z4;
        List list;
        if (zjeVar instanceof e7u) {
            e7uVar = (e7u) zjeVar;
            int i = e7uVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7uVar.n = i - Integer.MIN_VALUE;
            } else {
                e7uVar = new e7u(this, zjeVar);
            }
        } else {
            e7uVar = new e7u(this, zjeVar);
        }
        Object objB = e7uVar.l;
        wne wneVar = wne.f39444a;
        int i2 = e7uVar.n;
        if (i2 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) this.e;
            e7uVar.i = z;
            e7uVar.j = z2;
            e7uVar.n = 1;
            objB = zfoVar.b(e7uVar);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z2 = e7uVar.j;
            z = e7uVar.i;
            z1x.P(objB);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = e7uVar.j;
            boolean z6 = e7uVar.i;
            List list2 = e7uVar.k;
            z1x.P(objB);
            z4 = z5;
            z3 = z6;
            list = list2;
        }
        return new d7u(new i89(((adn) this.b).f687a.f8893a, (byte) 22), this, list, (List) objB, z3, z4, (byte) 0);
        List list3 = (List) objB;
        edo edoVar = (edo) this.d;
        e7uVar.k = list3;
        e7uVar.i = z;
        e7uVar.j = z2;
        e7uVar.n = 2;
        Object objB2 = edoVar.b(e7uVar);
        if (objB2 != wneVar) {
            z3 = z;
            z4 = z2;
            list = list3;
            objB = objB2;
            return new d7u(new i89(((adn) this.b).f687a.f8893a, (byte) 22), this, list, (List) objB, z3, z4, (byte) 0);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public ArrayList x(boolean z) {
        boolean z2;
        ArrayList arrayListN0 = CollectionsKt.N0(((czt) this.b).f5239a.b().d);
        sff0 sff0VarA = ((pru) this.c).a();
        if (sff0VarA.B0) {
            r9u r9uVar = (r9u) this.e;
            ygp ygpVar = ygp.u;
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!sff0VarA.c.c) {
            arrayListN0.remove(fk60.CYBER_SPORT);
        }
        if (!sff0VarA.D0) {
            arrayListN0.remove(fk60.INSIGHTS);
        }
        if (!sff0VarA.I0) {
            arrayListN0.remove(fk60.SWIPE_X);
        }
        if (!z2 || !((iqt) this.d).f15225a.a()) {
            arrayListN0.remove(fk60.TEAM_BET);
        }
        if (sff0VarA.h1 != udl0.ADVANCED) {
            arrayListN0.remove(fk60.GAME_SCREEN);
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListN0) {
                int iOrdinal = ((fk60) obj).ordinal();
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                    switch (iOrdinal) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            break;
                        default:
                            switch (iOrdinal) {
                                case 17:
                                case 18:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                case 20:
                                case 21:
                                case 22:
                                    break;
                                default:
                                    arrayList.add(obj);
                                    break;
                            }
                            break;
                    }
                }
            }
            arrayListN0 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListN0) {
            fk60 fk60Var = (fk60) obj2;
            if (fk60Var != fk60.STATISTICS_RATING && fk60Var != fk60.POPULAR_OLD_OS && fk60Var != fk60.TOTO) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public void z() {
        i8i.D("option", "close", (kt2) ((y3v) this.b).b, "auth_login_pass_error_click");
        b1j.v("close", ((s64) this.c).f31684a, 11010L);
    }

    public /* synthetic */ f7u(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f9075a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ f7u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f9075a = b;
        this.b = obj;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public f7u(qgd qgdVar, j1q0 j1q0Var, ntu ntuVar, pru pruVar) {
        this.f9075a = (byte) 3;
        j1q0Var.getClass();
        this.b = qgdVar;
        this.c = j1q0Var;
        this.d = ntuVar;
        this.e = pruVar;
    }

    public f7u(sd60 sd60Var, xex xexVar, tv3 tv3Var, fsd fsdVar) {
        this.f9075a = (byte) 12;
        tv3Var.getClass();
        fsdVar.getClass();
        this.b = sd60Var;
        this.c = xexVar;
        this.d = tv3Var;
        this.e = fsdVar.a();
    }

    public f7u(mii0 mii0Var, uzc uzcVar, b3c0 b3c0Var, gst0 gst0Var) {
        this.f9075a = (byte) 28;
        b3c0Var.getClass();
        gst0Var.getClass();
        this.b = mii0Var;
        this.c = uzcVar;
        this.d = b3c0Var;
        this.e = gst0Var;
    }

    public f7u(us00 us00Var, knf0 knf0Var, lhf0 lhf0Var, hsj hsjVar) {
        this.f9075a = (byte) 25;
        knf0Var.getClass();
        this.b = us00Var;
        this.c = knf0Var;
        this.d = lhf0Var;
        this.e = hsjVar;
    }

    public f7u(d6e d6eVar, ieu ieuVar, htz htzVar, sek sekVar) {
        this.f9075a = (byte) 21;
        this.b = d6eVar;
        this.c = ieuVar;
        this.d = new Rect();
        this.e = new Rect();
    }

    public f7u(adn adnVar, j1q0 j1q0Var, edo edoVar, zfo zfoVar) {
        this.f9075a = (byte) 0;
        j1q0Var.getClass();
        edoVar.getClass();
        zfoVar.getClass();
        this.b = adnVar;
        this.c = j1q0Var;
        this.d = edoVar;
        this.e = zfoVar;
    }

    public f7u(rr20 rr20Var, edo edoVar, zfo zfoVar, j1q0 j1q0Var) {
        this.f9075a = (byte) 7;
        edoVar.getClass();
        zfoVar.getClass();
        j1q0Var.getClass();
        this.b = rr20Var;
        this.d = edoVar;
        this.e = zfoVar;
        this.c = j1q0Var;
    }

    public f7u(p530 p530Var, j1q0 j1q0Var, edo edoVar, zfo zfoVar) {
        this.f9075a = (byte) 6;
        j1q0Var.getClass();
        edoVar.getClass();
        zfoVar.getClass();
        this.b = p530Var;
        this.c = j1q0Var;
        this.d = edoVar;
        this.e = zfoVar;
    }

    public f7u(hru hruVar, lxv lxvVar, knf0 knf0Var, kuy kuyVar) {
        this.f9075a = (byte) 22;
        lxvVar.getClass();
        knf0Var.getClass();
        kuyVar.getClass();
        this.b = hruVar;
        this.c = lxvVar;
        this.d = knf0Var;
        this.e = kuyVar;
    }

    public f7u(cyu cyuVar, sjl0 sjl0Var, iqt iqtVar, pmi pmiVar) {
        this.f9075a = (byte) 16;
        sjl0Var.getClass();
        this.b = cyuVar;
        this.c = sjl0Var;
        this.d = iqtVar;
        this.e = pmiVar;
    }

    public f7u(w5z w5zVar, uzc uzcVar, uqe uqeVar, b3c0 b3c0Var, gst0 gst0Var) {
        this.f9075a = (byte) 11;
        b3c0Var.getClass();
        gst0Var.getClass();
        this.b = w5zVar;
        this.c = uzcVar;
        this.d = b3c0Var;
        this.e = gst0Var;
    }

    public f7u(gst0 gst0Var, uzc uzcVar, wdu wduVar, v7i v7iVar) {
        this.f9075a = (byte) 1;
        gst0Var.getClass();
        this.b = gst0Var;
        this.c = uzcVar;
        this.d = wduVar;
        this.e = v7iVar;
    }

    public /* synthetic */ f7u() {
        this.f9075a = (byte) 23;
    }

    public f7u(v7i v7iVar, mzs0 mzs0Var, a8z a8zVar) {
        this.f9075a = (byte) 27;
        mzs0Var.getClass();
        this.b = v7iVar;
        this.c = mzs0Var;
        this.d = a8zVar;
        this.e = new nvu(this, mzs0Var);
    }
}
