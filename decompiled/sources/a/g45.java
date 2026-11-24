package a;

import a.bkb;
import a.fmq0;
import a.hfx;
import a.t99;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal._HeadersCommonKt;
import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.widget.impl.presentation.quickavailable.widget.MySectionsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class g45 implements hg5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10647a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public g45(f6i f6iVar, h950 h950Var, vjj vjjVar, roi0 roi0Var, xbu0 xbu0Var, e28 e28Var, hfk hfkVar, qgd qgdVar, List list) {
        h950Var.getClass();
        vjjVar.getClass();
        e28Var.getClass();
        list.getClass();
        this.f10647a = f6iVar;
        this.b = h950Var;
        this.c = vjjVar;
        this.d = roi0Var;
        this.e = xbu0Var;
        this.f = e28Var;
        this.g = hfkVar;
        this.h = new qgd(this, qgdVar, list, "Deserializer for \"" + vjjVar.getName() + '\"', hfkVar != null ? hfkVar.b() : "[container not found]");
        this.i = new xq30(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(1:(1:(3:13|114|(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44))(1:(2:119|120)(1:121)))(2:14|15))(5:16|17|100|150|(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44))(1:(2:119|120)(1:121))))(4:18|134|19|20))(2:23|(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44))(1:(2:119|120)(1:121)))|144|45|46|132|47|(9:50|51|148|52|53|126|54|55|48)|152|62) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:50|51|148|52|53|126|54|55|48) */
    /* JADX WARN: Code duplicated, block: B:101:0x032a  */
    /* JADX WARN: Code duplicated, block: B:102:0x034f  */
    /* JADX WARN: Code duplicated, block: B:104:0x035d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0366  */
    /* JADX WARN: Code duplicated, block: B:107:0x0368  */
    /* JADX WARN: Code duplicated, block: B:110:0x036d  */
    /* JADX WARN: Code duplicated, block: B:113:0x039e  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:117:0x03de  */
    /* JADX WARN: Code duplicated, block: B:118:0x03fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0402  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x014d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d8 A[Catch: all -> 0x022a, TRY_LEAVE, TryCatch #5 {all -> 0x022a, blocks: (B:47:0x01c7, B:48:0x01d2, B:50:0x01d8), top: B:132:0x01c7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:98:0x0304  */
    /* JADX WARN: Code duplicated, block: B:99:0x0307  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0205, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0206, code lost:
    
        r2 = r5;
        r1 = r6;
        r6 = r17;
        r5 = r0;
        r0 = r12;
        r12 = r16;
        r16 = r9;
        r9 = r14;
        r14 = r20;
        r20 = r4;
        r4 = r8;
        r8 = r13;
        r13 = r3;
        r3 = r7;
        r7 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x021e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021f, code lost:
    
        r7 = r29;
        r11 = r30;
        r13 = r31;
        r16 = r32;
        r22 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x022a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022b, code lost:
    
        r22 = r16;
        r16 = r13;
        r13 = r22;
        r22 = r11;
        r11 = r7;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0238, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0239, code lost:
    
        r22 = r16;
        r16 = r13;
        r13 = r22;
        r22 = r11;
        r11 = r7;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0244, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0245, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0249, code lost:
    
        r5 = r28;
        r20 = r30;
        r6 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0250, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0252, code lost:
    
        r1 = r6;
        r11 = r10;
        r6 = r17;
        r16 = r35;
        r23 = r5;
        r5 = r0;
        r0 = r12;
        r12 = r9;
        r9 = r14;
        r14 = r20;
        r20 = r4;
        r4 = r2;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0266, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0267, code lost:
    
        r20 = r5;
        r6 = r11;
        r4 = r19;
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0270, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0273, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0274, code lost:
    
        r20 = r5;
        r6 = r11;
        r2 = r17;
        r4 = r19;
        r5 = r28;
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0280, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0281, code lost:
    
        r35 = r1;
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028c, code lost:
    
        r17 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x028f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0290, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0299, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x029a, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x032a -> B:24:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x039e -> B:114:0x03a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable A(int r28, long r29, java.util.List r31, java.util.List r32, boolean r33, boolean r34, boolean r35, java.lang.String r36, a.zje r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g45.A(int, long, java.util.List, java.util.List, boolean, boolean, boolean, java.lang.String, a.zje):java.io.Serializable");
    }

    public iv10 B(long j) {
        iv10 iv10Var = (iv10) ((ave) this.c).k.get(Long.valueOf(j));
        return iv10Var == null ? l7x.H() : iv10Var;
    }

    public Pair C() {
        lye lyeVar = (lye) this.f10647a;
        return new Pair(Long.valueOf(lyeVar.i), Integer.valueOf(lyeVar.j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object D(zje zjeVar) {
        p7e p7eVar;
        i7e i7eVar = (i7e) this.c;
        if (zjeVar instanceof p7e) {
            p7eVar = (p7e) zjeVar;
            int i = p7eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7eVar.k = i - Integer.MIN_VALUE;
            } else {
                p7eVar = new p7e(this, zjeVar);
            }
        } else {
            p7eVar = new p7e(this, zjeVar);
        }
        Object objD = p7eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = p7eVar.k;
        if (i2 == 0) {
            z1x.P(objD);
            l14 l14Var = i7eVar.e;
            if (l14Var == null || l14Var.f19230a.getTime() < System.currentTimeMillis()) {
                l14Var = null;
            }
            if (l14Var != null) {
                return l14Var;
            }
            vae vaeVar = (vae) this.b;
            p7eVar.k = 1;
            objD = vaeVar.d(p7eVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        f14 f14Var = (f14) objD;
        f14Var.getClass();
        Long l = f14Var.f8747a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        Date date = new Date(TimeUnit.SECONDS.toMillis(l.longValue()));
        List<d0g0> list = f14Var.b;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (d0g0 d0g0Var : list) {
            String str = d0g0Var.f5266a;
            if (str == null) {
                jf4.k(null);
                return null;
            }
            Long l2 = d0g0Var.b;
            if (l2 == null) {
                jf4.k(null);
                return null;
            }
            arrayList.add(new a0g0(str, l2.longValue()));
        }
        l14 l14Var2 = new l14(date, arrayList);
        i7eVar.getClass();
        i7eVar.e = l14Var2;
        return l14Var2;
    }

    public nou E() {
        return new nou(e(), (gst0) this.d);
    }

    public xru F() {
        return new xru(e());
    }

    public khf0 G() {
        return new khf0((Object) new f6k(d0()), (Object) y(), (Object) new urt(e()), (byte) 29);
    }

    public hru H() {
        return new hru(d0());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(a.zje r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.t7e
            if (r0 == 0) goto L13
            r0 = r7
            a.t7e r0 = (a.t7e) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.t7e r0 = new a.t7e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r7)
            goto L71
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L31:
            a.z1x.P(r7)
            goto L5b
        L35:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.f10647a
            a.k7e r7 = (a.k7e) r7
            a.j7e r7 = r7.b
            if (r10 == 0) goto L5e
            java.lang.Object r10 = r6.g
            a.btt0 r10 = (a.btt0) r10
            java.lang.String r10 = r10.a()
            a.jo20 r9 = r6.v(r9, r10)
            r0.k = r4
            java.lang.Object r7 = r7.invoke()
            a.u8e r7 = (a.u8e) r7
            java.lang.Object r7 = r7.b(r8, r9, r0)
            if (r7 != r1) goto L5b
            goto L70
        L5b:
            a.dx5 r7 = (a.dx5) r7
            goto L73
        L5e:
            a.jo20 r9 = r6.v(r5, r5)
            r0.k = r3
            java.lang.Object r7 = r7.invoke()
            a.u8e r7 = (a.u8e) r7
            java.lang.Object r7 = r7.b(r8, r9, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            a.dx5 r7 = (a.dx5) r7
        L73:
            java.lang.Object r7 = r7.a()
            a.jji0 r7 = (a.jji0) r7
            a.yji0 r8 = new a.yji0
            java.lang.Integer r7 = r7.f16619a
            if (r7 == 0) goto L97
            int r7 = r7.intValue()
            long r9 = java.lang.System.currentTimeMillis()
            r8.<init>(r7, r9)
            java.lang.Object r6 = r6.c
            a.i7e r6 = (a.i7e) r6
            a.p7m0 r6 = r6.f
            r6.getClass()
            r6.o(r5, r8)
            return r8
        L97:
            a.jf4.k(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g45.I(a.zje, java.lang.String, java.lang.String, boolean):java.lang.Object");
    }

    public rus J() {
        oeg0 oeg0Var = (oeg0) this.f;
        daf dafVar = (daf) ((roi0) this.g).f30839a;
        zfm0 zfm0VarZ = dafVar.Z();
        esg0 esg0Var = (esg0) this.f10647a;
        gr00 gr00Var = (gr00) esg0Var.d;
        pv00 pv00VarT = dafVar.t();
        bn6 bn6Var = (bn6) esg0Var.e;
        je jeVar = (je) esg0Var.f;
        luu luuVarW = ((daf) ((ugf0) this.h).f35622a).w();
        x1x.x(luuVarW);
        return new rus(oeg0Var, zfm0VarZ, gr00Var, pv00VarT, bn6Var, jeVar, luuVarW);
    }

    public oll0 K() {
        return new oll0((wdk0) this.i);
    }

    public iwm0 L(long j) {
        iwm0 iwm0Var = (iwm0) ((ave) this.c).l.get(Long.valueOf(j));
        return iwm0Var == null ? new iwm0("", new cso(new ldx(0.0d, 0, 0, ""), new ndf(new wcv0("", ""))), iun.f15405a, new nbr(0, 0), new jzm0("", ""), 0) : iwm0Var;
    }

    public mrt M() {
        return new mrt(e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object N(File file, zje zjeVar) {
        h8e h8eVar;
        if (zjeVar instanceof h8e) {
            h8eVar = (h8e) zjeVar;
            int i = h8eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8eVar.k = i - Integer.MIN_VALUE;
            } else {
                h8eVar = new h8e(this, zjeVar);
            }
        } else {
            h8eVar = new h8e(this, zjeVar);
        }
        Object objH = h8eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = h8eVar.k;
        if (i2 == 0) {
            z1x.P(objH);
            String strC0 = sj3.c0(file);
            vae vaeVar = (vae) this.b;
            long length = file.length();
            h8eVar.k = 1;
            objH = vaeVar.h(length, h8eVar, strC0);
            if (objH == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objH);
        }
        String str = ((mcl) objH).f21558a;
        if (str != null) {
            return str;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012d -> B:62:0x0172). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object O(a.pei0 r12, a.gxb r13, a.zje r14) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g45.O(a.pei0, a.gxb, a.zje):java.lang.Object");
    }

    public mrt P() {
        return new mrt(e());
    }

    public g2v Q() {
        return new g2v(d0());
    }

    public void R(MySectionsWidget mySectionsWidget) {
        mySectionsWidget.c = new ih5((kt2) this.d, (byte) 5);
        mySectionsWidget.d = (pru) this.c;
        mySectionsWidget.e = (au0) this.e;
        mySectionsWidget.f = new yfu(new iw20(new y3v((vwb0) this.f10647a, (vby) this.b)));
        mySectionsWidget.g = (ctf0) this.f;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[LOOP:0: B:35:0x00a4->B:37:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x015b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0168  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x021c  */
    /* JADX WARN: Code duplicated, block: B:90:0x022c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
    /* JADX WARN: Code duplicated, block: B:96:0x024e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0250  */
    /* JADX WARN: Code duplicated, block: B:98:0x0253  */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01b2, please report this as an issue */
    public Serializable S(zje zjeVar) {
        l8u l8uVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        Iterator it;
        long jLongValue;
        xco xcoVar;
        String str;
        String str2;
        boolean zContains;
        ArrayList arrayList2;
        Iterator it2;
        ArrayList arrayList3;
        long size;
        long jLongValue2;
        Map map;
        double dDoubleValue;
        Map map2;
        BigDecimal bigDecimal;
        Set set;
        boolean z;
        Map map3;
        fao faoVar;
        fao faoVar2;
        ArrayList arrayList4;
        ueo ueoVar;
        gao gaoVar;
        Double d;
        if (zjeVar instanceof l8u) {
            l8uVar = (l8u) zjeVar;
            int i = l8uVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8uVar.l = i - Integer.MIN_VALUE;
            } else {
                l8uVar = new l8u(this, zjeVar);
            }
        } else {
            l8uVar = new l8u(this, zjeVar);
        }
        Object objB = l8uVar.j;
        wne wneVar = wne.f39444a;
        int i2 = l8uVar.l;
        String str3 = null;
        boolean z2 = true;
        if (i2 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) this.f10647a;
            l8uVar.l = 1;
            objB = zfoVar.b(l8uVar);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objB);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = l8uVar.i;
            z1x.P(objB);
        }
        Iterable iterable = (Iterable) objB;
        int iA = wp20.a(r3d.q(iterable, 10));
        linkedHashMap2 = new LinkedHashMap(iA >= 16 ? iA : 16);
        for (Object obj : iterable) {
            linkedHashMap2.put(new Long(((xco) obj).f40655a), obj);
        }
        Map map4 = (Map) this.e;
        arrayList = new ArrayList(map4.size());
        it = map4.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jLongValue = ((Number) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            xcoVar = (xco) linkedHashMap2.get(Long.valueOf(jLongValue));
            if (xcoVar != null) {
                str = xcoVar.b;
            } else {
                str = str3;
            }
            if (str == null) {
                str = "";
            }
            str2 = str;
            zContains = ((Set) this.d).contains(Long.valueOf(jLongValue));
            arrayList2 = new ArrayList();
            it2 = list.iterator();
            while (it2.hasNext()) {
                jLongValue2 = ((Number) it2.next()).longValue();
                map = (Map) ((Map) this.f).get(Long.valueOf(jLongValue));
                if (map != null || (d = (Double) map.get(Long.valueOf(jLongValue2))) == null) {
                    dDoubleValue = 1.0d;
                } else {
                    dDoubleValue = d.doubleValue();
                }
                map2 = (Map) ((Map) this.i).get(Long.valueOf(jLongValue));
                if (map2 != null) {
                    bigDecimal = (BigDecimal) map2.get(Long.valueOf(jLongValue2));
                } else {
                    bigDecimal = null;
                }
                set = (Set) ((Map) this.g).get(Long.valueOf(jLongValue));
                if (set == null && set.contains(Long.valueOf(jLongValue2)) == z2) {
                    z = z2;
                } else {
                    z = false;
                }
                map3 = (Map) ((Map) this.h).get(Long.valueOf(jLongValue));
                if (map3 != null || (faoVar = (fao) map3.get(Long.valueOf(jLongValue2))) == null) {
                    faoVar = fao.f9218a;
                }
                faoVar2 = faoVar;
                if (zContains) {
                    arrayList4 = arrayList2;
                    gaoVar = new gao((int) jLongValue2, jLongValue2, dDoubleValue, jLongValue, z, String.valueOf(dDoubleValue), str2, String.valueOf(bigDecimal != null ? bigDecimal.intValue() : 0), 0, bigDecimal != null ? bigDecimal.doubleValue() : 0.0d, faoVar2);
                } else {
                    arrayList4 = arrayList2;
                    ueoVar = (ueo) linkedHashMap.get(Long.valueOf(jLongValue2));
                    if (ueoVar == null) {
                        gaoVar = null;
                    } else {
                        int i3 = (int) jLongValue2;
                        String strValueOf = String.valueOf(dDoubleValue);
                        int i4 = ueoVar.c;
                        String str4 = ueoVar.b;
                        iun iunVar = iun.f15405a;
                        gaoVar = new gao(i3, jLongValue2, dDoubleValue, jLongValue, z, strValueOf, str2, dii0.a(str4, iunVar, iunVar, Integer.valueOf(i4), false, bigDecimal, null, null, jLongValue2, nt20.c, false, false), ueoVar.c, bigDecimal != null ? bigDecimal.doubleValue() : 0.0d, faoVar2);
                    }
                }
                if (gaoVar != null) {
                    arrayList4.add(gaoVar);
                }
                arrayList2 = arrayList4;
                it = it;
                z2 = true;
            }
            Iterator it3 = it;
            arrayList3 = arrayList2;
            if (((Set) this.c).contains(Long.valueOf(jLongValue))) {
                size = arrayList3.size();
            } else if (xcoVar != null) {
                size = xcoVar.d;
            } else {
                size = 1;
            }
            arrayList.add(new pu20(jLongValue, str2, size, zContains, arrayList3));
            it = it3;
            str3 = null;
            z2 = true;
        }
        return arrayList;
        Iterable iterable2 = (Iterable) objB;
        int iA2 = wp20.a(r3d.q(iterable2, 10));
        if (iA2 < 16) {
            iA2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA2);
        for (Object obj2 : iterable2) {
            linkedHashMap3.put(new Long(((ueo) obj2).f35538a), obj2);
        }
        edo edoVar = (edo) this.b;
        l8uVar.i = linkedHashMap3;
        l8uVar.l = 2;
        objB = edoVar.b(l8uVar);
        if (objB != wneVar) {
            linkedHashMap = linkedHashMap3;
            Iterable iterable3 = (Iterable) objB;
            int iA3 = wp20.a(r3d.q(iterable3, 10));
            linkedHashMap2 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
            while (r1.hasNext()) {
                linkedHashMap2.put(new Long(((xco) obj).f40655a), obj);
            }
            Map map5 = (Map) this.e;
            arrayList = new ArrayList(map5.size());
            it = map5.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                jLongValue = ((Number) entry2.getKey()).longValue();
                List list2 = (List) entry2.getValue();
                xcoVar = (xco) linkedHashMap2.get(Long.valueOf(jLongValue));
                if (xcoVar != null) {
                    str = xcoVar.b;
                } else {
                    str = str3;
                }
                if (str == null) {
                    str = "";
                }
                str2 = str;
                zContains = ((Set) this.d).contains(Long.valueOf(jLongValue));
                arrayList2 = new ArrayList();
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    jLongValue2 = ((Number) it2.next()).longValue();
                    map = (Map) ((Map) this.f).get(Long.valueOf(jLongValue));
                    if (map != null) {
                        dDoubleValue = 1.0d;
                    } else {
                        dDoubleValue = 1.0d;
                    }
                    map2 = (Map) ((Map) this.i).get(Long.valueOf(jLongValue));
                    if (map2 != null) {
                        bigDecimal = (BigDecimal) map2.get(Long.valueOf(jLongValue2));
                    } else {
                        bigDecimal = null;
                    }
                    set = (Set) ((Map) this.g).get(Long.valueOf(jLongValue));
                    if (set == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    map3 = (Map) ((Map) this.h).get(Long.valueOf(jLongValue));
                    if (map3 != null) {
                        faoVar = fao.f9218a;
                    } else {
                        faoVar = fao.f9218a;
                    }
                    faoVar2 = faoVar;
                    if (zContains) {
                        arrayList4 = arrayList2;
                        gaoVar = new gao((int) jLongValue2, jLongValue2, dDoubleValue, jLongValue, z, String.valueOf(dDoubleValue), str2, String.valueOf(bigDecimal != null ? bigDecimal.intValue() : 0), 0, bigDecimal != null ? bigDecimal.doubleValue() : 0.0d, faoVar2);
                    } else {
                        arrayList4 = arrayList2;
                        ueoVar = (ueo) linkedHashMap.get(Long.valueOf(jLongValue2));
                        if (ueoVar == null) {
                            gaoVar = null;
                        } else {
                            int i5 = (int) jLongValue2;
                            String strValueOf2 = String.valueOf(dDoubleValue);
                            int i6 = ueoVar.c;
                            String str5 = ueoVar.b;
                            iun iunVar2 = iun.f15405a;
                            gaoVar = new gao(i5, jLongValue2, dDoubleValue, jLongValue, z, strValueOf2, str2, dii0.a(str5, iunVar2, iunVar2, Integer.valueOf(i6), false, bigDecimal, null, null, jLongValue2, nt20.c, false, false), ueoVar.c, bigDecimal != null ? bigDecimal.doubleValue() : 0.0d, faoVar2);
                        }
                    }
                    if (gaoVar != null) {
                        arrayList4.add(gaoVar);
                    }
                    arrayList2 = arrayList4;
                    it = it;
                    z2 = true;
                }
                Iterator it4 = it;
                arrayList3 = arrayList2;
                if (((Set) this.c).contains(Long.valueOf(jLongValue))) {
                    size = arrayList3.size();
                } else if (xcoVar != null) {
                    size = xcoVar.d;
                } else {
                    size = 1;
                }
                arrayList.add(new pu20(jLongValue, str2, size, zContains, arrayList3));
                it = it4;
                str3 = null;
                z2 = true;
            }
            return arrayList;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object T(long j, boolean z, int i, long j2, boolean z2, zje zjeVar) {
        j7u j7uVar;
        pru pruVar = (pru) this.b;
        if (zjeVar instanceof j7u) {
            j7uVar = (j7u) zjeVar;
            int i2 = j7uVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j7uVar.k = i2 - Integer.MIN_VALUE;
            } else {
                j7uVar = new j7u(this, zjeVar);
            }
        } else {
            j7uVar = new j7u(this, zjeVar);
        }
        Object objH0 = j7uVar.i;
        wne wneVar = wne.f39444a;
        int i3 = j7uVar.k;
        yje yjeVar = null;
        byte b = 1;
        if (i3 == 0) {
            z1x.P(objH0);
            u8u u8uVar = (u8u) this.f10647a;
            boolean z3 = pruVar.a().h;
            byte b2 = pruVar.a().I1.f26017a;
            String strA = ((wgu) this.d).a();
            j7uVar.k = 1;
            cu cuVar = (cu) u8uVar.c;
            int id = ((uzc) u8uVar.b).b().getId();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (z3) {
                objH0 = bkb.h0(z ? 8L : 30L, timeUnit, new bpn(id, cuVar, i, j, strA, z2, j2, b2, z, null));
            } else {
                objH0 = bkb.h0(z ? 8L : 30L, timeUnit, new apn(cuVar, j, z, i, z2, j2, strA, null));
            }
            if (objH0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objH0);
        }
        return new p6d(aoq.c((gmq) objH0, new sot(yjeVar, (Object) this, (byte) 5)), ((nku) this.i).a(), new wx4((Object) this, yjeVar, (byte) 15), b);
    }

    public pzu U() {
        return new pzu(new abu((gii0) this.d, (byte) 25), (dzz) this.e, (xio) this.f, (czz) this.g, (btt0) this.h, (knf0) this.i);
    }

    public HashMap V(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            try {
                map2.put(entry.getKey(), m2x.R((oei0) entry.getValue()));
            } catch (Exception unused) {
                ((i7e) this.c).d((String) entry.getKey());
            }
        }
        return map2;
    }

    public Object W(q4f q4fVar, zje zjeVar) {
        lye lyeVar = (lye) this.f10647a;
        en7 en7Var = new en7(0, 0, 0, 0.0d, false);
        lyeVar.g = null;
        lyeVar.n.o(null, en7Var);
        Object objA = ((ave) this.c).o.a(q4fVar, zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public void X(en7 en7Var) {
        lye lyeVar = (lye) this.f10647a;
        lyeVar.g = null;
        lyeVar.n.o(null, en7Var);
    }

    public b8u Y() {
        return new b8u(d0());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0152, code lost:
    
        if (r4 == r11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016e, code lost:
    
        if (r4 == r11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a7, code lost:
    
        if (r0.j(r2, r10) == r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Z(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, a.rl40 r22, java.lang.String r23, java.lang.String r24, boolean r25, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g45.Z(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, a.rl40, java.lang.String, java.lang.String, boolean, a.zje):java.lang.Object");
    }

    @Override // a.hg5
    public ilt0 a() {
        return new ilt0(e());
    }

    public void a0(int i) {
        Object value;
        int iIntValue;
        p7m0 p7m0Var = ((i7e) this.c).j;
        do {
            value = p7m0Var.getValue();
            iIntValue = ((Number) value).intValue();
            if (i > iIntValue) {
                iIntValue = i;
            }
        } while (!p7m0Var.m(value, Integer.valueOf(iIntValue)));
    }

    public sp b() {
        return new sp(e());
    }

    public void b0(String str) {
        str.getClass();
        ((i7e) this.c).d(str);
    }

    public Unit c(a640 a640Var) {
        p7m0 p7m0Var = ((i7e) this.c).k;
        Collection collection = (List) p7m0Var.getValue();
        if (collection == null) {
            collection = iun.f15405a;
        }
        ArrayList arrayListN0 = CollectionsKt.N0(collection);
        arrayListN0.add(a640Var);
        p7m0Var.o(null, arrayListN0);
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }

    public h4k c0() {
        return new h4k(e());
    }

    public void d(String str, rei0 rei0Var) {
        oei0 kei0Var;
        b8d b8dVar;
        str.getClass();
        rei0Var.getClass();
        if (rei0Var instanceof qei0) {
            qei0 qei0Var = (qei0) rei0Var;
            h8d h8dVar = qei0Var.b;
            String str2 = qei0Var.f28586a;
            Date date = qei0Var.c;
            String str3 = qei0Var.d;
            if (Intrinsics.d(h8dVar, h8d.b)) {
                b8dVar = null;
            } else {
                h8dVar.getClass();
                j8d j8dVar = j8d.f16077a;
                b8dVar = new b8d(h8dVar.f12619a);
            }
            kei0Var = new nei0(str2, b8dVar, date, str3, Boolean.valueOf(qei0Var.e));
        } else {
            if (!(rei0Var instanceof pei0)) {
                t9f.b();
                return;
            }
            pei0 pei0Var = (pei0) rei0Var;
            String str4 = pei0Var.f26855a;
            List list = pei0Var.b;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((File) it.next()).getAbsolutePath());
            }
            kei0Var = new kei0(str4, arrayList, pei0Var.c, pei0Var.d, Boolean.valueOf(pei0Var.e));
        }
        i7e i7eVar = (i7e) this.c;
        i7eVar.getClass();
        p7m0 p7m0Var = i7eVar.g;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        if (linkedHashMapP.put(str, kei0Var) == null) {
            i7eVar.b.g("PREF_KEY_SEND_MESSAGES", i7eVar.c.d(new inv(ysm0.f43175a, oei0.Companion.serializer(), (byte) 1), linkedHashMapP));
            p7m0Var.o(null, linkedHashMapP);
        }
    }

    public pv00 d0() {
        return new pv00((o7h0) this.i);
    }

    public rrd e() {
        tg5 tg5Var = (tg5) this.f10647a;
        bbw0 bbw0Var = new bbw0((gii0) this.b, (byte) 9);
        knf0 knf0Var = (knf0) this.c;
        gst0 gst0Var = (gst0) this.d;
        vwb0 vwb0Var = (vwb0) this.e;
        btt0 btt0Var = (btt0) this.f;
        mne mneVarH = ((psc) ((cad) this.g).b).h();
        x1x.x(mneVarH);
        return new rrd(tg5Var, bbw0Var, knf0Var, gst0Var, vwb0Var, btt0Var, mneVarH, (rrc) this.h);
    }

    public Object e0(String str, int i, gc1 gc1Var) {
        vae vaeVar = (vae) this.b;
        vaeVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jdy jdyVarC = ncy.c(str);
        jdyVarC.getClass();
        jdy jdyVarB = ncy.b(new Integer(i));
        jdyVarB.getClass();
        j4v0 j4v0Var = new j4v0(new edy(linkedHashMap), "ReadMessages");
        aa40 aa40VarG = vaeVar.g();
        rwj rwjVar = tvk.f34603a;
        Object objD0 = qjj.d0(dvj.c, new sae(aa40VarG, j4v0Var, null, (byte) 0), gc1Var);
        wne wneVar = wne.f39444a;
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wneVar ? objD0 : Unit.f46060a;
    }

    public u4a f() {
        return new u4a(e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object f0(rei0 rei0Var, zje zjeVar) throws Throwable {
        s8e s8eVar;
        rei0 rei0Var2;
        i050 i050Var;
        Throwable th;
        i050 i050Var2;
        gxb gxbVar;
        byte b;
        wei0 wei0Var;
        Object objL;
        rei0 rei0Var3;
        Object ptf0Var;
        vae vaeVar = (vae) this.b;
        if (zjeVar instanceof s8e) {
            s8eVar = (s8e) zjeVar;
            int i = s8eVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                s8eVar.n = i - Integer.MIN_VALUE;
            } else {
                s8eVar = new s8e(this, zjeVar);
            }
        } else {
            s8eVar = new s8e(this, zjeVar);
        }
        Object objO = s8eVar.l;
        Object obj = wne.f39444a;
        int i2 = s8eVar.n;
        try {
            try {
                if (i2 == 0) {
                    z1x.P(objO);
                    k050 k050Var = vaeVar.e;
                    s8eVar.i = rei0Var;
                    s8eVar.j = k050Var;
                    s8eVar.n = 1;
                    if (k050Var.d(s8eVar) != obj) {
                        rei0Var2 = rei0Var;
                        i050Var = k050Var;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i050Var2 = s8eVar.j;
                        try {
                            z1x.P(objO);
                            ptf0Var = (qtf0) objO;
                            i050Var2.c(null);
                            return ptf0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            i050Var2.c(null);
                            throw th;
                        }
                    }
                    gxb gxbVar2 = s8eVar.k;
                    i050 i050Var3 = s8eVar.j;
                    rei0Var3 = s8eVar.i;
                    try {
                        z1x.P(objO);
                        gxbVar = gxbVar2;
                        i050Var = i050Var3;
                        objL = objO;
                        ptf0Var = new ptf0(s0x.b0((n640) objL, gxbVar, ((qei0) rei0Var3).d, (vby) this.i));
                        i050Var2 = i050Var;
                        i050Var2.c(null);
                        return ptf0Var;
                    } catch (Throwable th3) {
                        th = th3;
                        i050Var2 = i050Var3;
                        i050Var2.c(null);
                        throw th;
                    }
                }
                i050Var = s8eVar.j;
                rei0Var2 = s8eVar.i;
                z1x.P(objO);
                gxbVar = (gxb) ((i7e) this.c).i.getValue();
                if (Intrinsics.d(gxbVar, gxb.k)) {
                    throw new IllegalArgumentException();
                }
                if (rei0Var2 == null) {
                    b = -1;
                } else if (rei0Var2 instanceof qei0) {
                    b = 0;
                } else {
                    b = rei0Var2 instanceof pei0 ? (byte) 1 : (byte) -2;
                }
                if (b == 0) {
                    String str = ((qei0) rei0Var2).f28586a;
                    if (Intrinsics.d(((qei0) rei0Var2).b, h8d.b)) {
                        wei0Var = null;
                    } else {
                        ((qei0) rei0Var2).b.getClass();
                        j8d j8dVar = j8d.f16077a;
                        wei0Var = new wei0(((qei0) rei0Var2).b.f12619a);
                    }
                    yei0 yei0Var = new yei0(str, wei0Var);
                    s8eVar.i = rei0Var2;
                    s8eVar.j = i050Var;
                    s8eVar.k = gxbVar;
                    s8eVar.n = 2;
                    objL = vaeVar.l(yei0Var, s8eVar);
                    if (objL != obj) {
                        rei0Var3 = rei0Var2;
                        ptf0Var = new ptf0(s0x.b0((n640) objL, gxbVar, ((qei0) rei0Var3).d, (vby) this.i));
                        i050Var2 = i050Var;
                        i050Var2.c(null);
                        return ptf0Var;
                    }
                } else {
                    if (b != 1) {
                        throw new m460();
                    }
                    s8eVar.i = null;
                    s8eVar.j = i050Var;
                    s8eVar.k = null;
                    s8eVar.n = 3;
                    objO = O((pei0) rei0Var2, gxbVar, s8eVar);
                    if (objO != obj) {
                        i050Var2 = i050Var;
                        ptf0Var = (qtf0) objO;
                        i050Var2.c(null);
                        return ptf0Var;
                    }
                }
                return obj;
            } catch (Throwable th4) {
                i050 i050Var4 = i050Var;
                th = th4;
                i050Var2 = i050Var4;
                i050Var2.c(null);
                throw th;
            }
        } catch (Exception e) {
            return new ntf0(e);
        }
    }

    public xex g() {
        return new xex(new iqt((gst0) this.d), y());
    }

    public void g0(q4f q4fVar) {
        q4fVar.getClass();
        ave aveVar = (ave) this.c;
        aveVar.getClass();
        q4fVar.getClass();
        aveVar.f1521a = q4fVar;
    }

    public g45 h(vjj vjjVar, List list, h950 h950Var, roi0 roi0Var, xbu0 xbu0Var, e28 e28Var) {
        list.getClass();
        h950Var.getClass();
        e28Var.getClass();
        f6i f6iVar = (f6i) this.f10647a;
        int i = e28Var.b;
        if ((i != 1 || e28Var.c < 4) && i <= 1) {
            xbu0Var = (xbu0) this.e;
        }
        return new g45(f6iVar, h950Var, vjjVar, roi0Var, xbu0Var, e28Var, (hfk) this.g, (qgd) this.h, list);
    }

    public void h0(long j) {
        lye lyeVar = (lye) this.f10647a;
        lyeVar.f20858a = g0f.a(lyeVar.f20858a, 0L, null, 0.0d, null, 0.0d, j, 0.0d, 0.0d, false, 0.0d, false, 0, null, false, 0, null, null, 0.0d, 0.0d, false, 1048543);
    }

    public roi0 i0() {
        return new roi0(new of6((q7d0) this.f10647a, (byte) 2));
    }

    public bbw0 j() {
        return new bbw0((Object) e(), (byte) 28);
    }

    public void j0(gxb gxbVar) {
        i7e i7eVar = (i7e) this.c;
        i7eVar.getClass();
        p7m0 p7m0Var = i7eVar.i;
        p7m0Var.getClass();
        p7m0Var.o(null, gxbVar);
    }

    public xr k() {
        mne mneVarH = ((psc) ((cad) this.g).b).h();
        x1x.x(mneVarH);
        rrc rrcVar = (rrc) this.h;
        xr xrVar = new xr();
        xrVar.f41344a = mneVarH;
        xrVar.b = ((OnexDatabase) rrcVar.b).l();
        return xrVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(1:(1:(1:(2:15|16)(2:17|18))(2:19|147))(2:20|197))(4:21|187|22|23)|161|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(52:189|30|31|191|32|33|165|34|35|169|36|37|173|38|39|179|40|41|171|42|43|159|44|45|195|46|47|183|48|49|163|50|51|177|52|53|175|54|55|167|56|57|193|58|59|185|60|61|181|62|63|(2:65|157)(1:66)) */
    /* JADX WARN: Code duplicated, block: B:119:0x0508 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x050a  */
    /* JADX WARN: Code duplicated, block: B:121:0x053d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0546  */
    /* JADX WARN: Code duplicated, block: B:124:0x0549  */
    /* JADX WARN: Code duplicated, block: B:127:0x054f  */
    /* JADX WARN: Code duplicated, block: B:130:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:132:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:135:0x0642  */
    /* JADX WARN: Code duplicated, block: B:137:0x0662  */
    /* JADX WARN: Code duplicated, block: B:139:0x066b  */
    /* JADX WARN: Code duplicated, block: B:140:0x066e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0674  */
    /* JADX WARN: Code duplicated, block: B:145:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:146:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x0707  */
    /* JADX WARN: Code duplicated, block: B:149:0x073e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0770  */
    /* JADX WARN: Code duplicated, block: B:152:0x0774  */
    /* JADX WARN: Code duplicated, block: B:154:0x077b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x043f, code lost:
    
        r27 = r2;
        r2 = r15;
        r15 = r21;
        r21 = r22;
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0448, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0449, code lost:
    
        r16 = r19;
        r19 = r1;
        r1 = r16;
        r16 = r29;
        r29 = r28;
        r28 = r16;
        r17 = r51;
        r16 = r53;
        r18 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x045d, code lost:
    
        r20 = r26 == true ? 1 : 0;
        r25 = r27;
        r26 = 1;
        r27 = r2;
        r2 = r15;
        r15 = r21;
        r21 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x046e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x046f, code lost:
    
        r16 = r15;
        r15 = r1;
        r19 = r25;
        r25 = r27;
        r2 = r16;
        r28 = r29;
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0489, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x048a, code lost:
    
        r16 = r21;
        r21 = r1;
        r1 = r19;
        r19 = r25;
        r25 = r27;
        r27 = r2;
        r2 = r15;
        r15 = r16;
        r16 = r29;
        r29 = r28;
        r28 = r16;
        r17 = r51;
        r16 = r53;
        r34 = r20;
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04a8, code lost:
    
        r28 = r29;
        r18 = r1;
        r19 = r25;
        r20 = r26 == true ? 1 : 0;
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04c4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04c5, code lost:
    
        r28 = r29;
        r16 = r53;
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04cf, code lost:
    
        r1 = r19;
        r18 = r24;
        r19 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04d9, code lost:
    
        r16 = r29;
        r29 = r28;
        r28 = r16;
        r17 = r51;
        r16 = r53;
        r34 = r20;
        r18 = r24;
        r20 = r26 == true ? 1 : 0;
        r26 = 1;
        r24 = r13;
        r13 = r1;
        r1 = r19;
        r19 = r25;
        r25 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04f7, code lost:
    
        r28 = r29;
        r17 = r51;
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0303, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0304, code lost:
    
        r51 = r0;
        r0 = r9;
        r38 = r15;
        r40 = r18;
        r41 = r19;
        r42 = r20;
        r39 = r21;
        r43 = r25;
        r52 = r28;
        r19 = r1;
        r20 = r10;
        r1 = r14;
        r14 = r32;
        r11 = r3;
        r9 = r7;
        r3 = r27;
        r7 = r2;
        r8 = r4;
        r2 = r16;
        r16 = r17;
        r4 = r24;
        r24 = r30;
        r17 = r13;
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0330, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0331, code lost:
    
        r1 = r35;
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0334, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0335, code lost:
    
        r3 = r1;
        r27 = r27;
        r4 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x033b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x033c, code lost:
    
        r17 = r51;
        r16 = r53;
        r34 = r1;
        r29 = r2;
        r2 = r15;
        r1 = r19;
        r15 = r21;
        r21 = r22;
        r18 = r24;
        r19 = r1;
        r20 = r26 ? 1 : 0;
        r26 = 1;
        r25 = r1;
        r24 = r13;
        r13 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x035a, code lost:
    
        r51 = r0;
        r0 = r2;
        r38 = r15;
        r2 = r16;
        r16 = r17;
        r40 = r18;
        r41 = r19;
        r42 = r20;
        r39 = r21;
        r43 = r25;
        r52 = r28;
        r19 = r1;
        r20 = r10;
        r17 = r13;
        r1 = r14;
        r13 = r29;
        r14 = r32;
        r11 = r9;
        r9 = r7;
        r7 = r3;
        r8 = r4;
        r4 = r24;
        r3 = r27;
        r24 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0386, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0387, code lost:
    
        r29 = r2;
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x039a, code lost:
    
        r24 = r13;
        r1 = r19;
        r19 = r1;
        r13 = r52;
        r25 = r1;
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03a4, code lost:
    
        r47 = r3;
        r3 = r5;
        r4 = r6;
        r5 = r47;
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03ab, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03ac, code lost:
    
        r28 = r1;
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03b4, code lost:
    
        r2 = r15;
        r1 = r19;
        r34 = r20;
        r15 = r21;
        r21 = r22;
        r19 = r1;
        r20 = r26 ? 1 : 0;
        r26 = 1;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03c7, code lost:
    
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03c9, code lost:
    
        r13 = r52;
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03cc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03cd, code lost:
    
        r29 = r28;
        r26 = 1;
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03e4, code lost:
    
        r16 = r29;
        r29 = r28;
        r28 = r16;
        r30 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03f1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03f2, code lost:
    
        r16 = r29;
        r29 = r28;
        r28 = r16;
        r32 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0400, code lost:
    
        r25 = r1;
        r19 = r1;
        r28 = r29;
        r2 = r15;
        r15 = r21;
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0419, code lost:
    
        r21 = r22;
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x041b, code lost:
    
        r20 = r26;
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0422, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0423, code lost:
    
        r28 = r29;
        r18 = r24;
        r26 = 1;
        r20 = r1 ? 1 : 0;
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x043d, code lost:
    
        r13 = r52;
        r20 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v41 */
    /* JADX WARN: Type inference failed for: r20v42 */
    /* JADX WARN: Type inference failed for: r20v43 */
    /* JADX WARN: Type inference failed for: r20v44 */
    /* JADX WARN: Type inference failed for: r20v45 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v42 */
    /* JADX WARN: Type inference failed for: r26v43 */
    /* JADX WARN: Type inference failed for: r26v44 */
    /* JADX WARN: Type inference failed for: r26v45 */
    /* JADX WARN: Type inference failed for: r26v46 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v27 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r69v0, types: [byte, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x050a -> B:29:0x024f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x06cf -> B:147:0x06ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k0(long r51, long r53, int r55, long r56, java.util.List r58, int r59, java.lang.String r60, java.util.List r61, boolean r62, boolean r63, boolean r64, boolean r65, boolean r66, java.lang.Boolean r67, java.lang.String r68, int r69, java.lang.Integer r70, boolean r71, a.zje r72) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g45.k0(long, long, int, long, java.util.List, int, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.String, int, java.lang.Integer, boolean, a.zje):java.lang.Object");
    }

    public f6k l() {
        return new f6k(d0());
    }

    public Unit l0(List list) {
        ((i7e) this.c).k.n(list);
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f5, code lost:
    
        if (r0 == r3) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(a.rcl r10, a.zje r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g45.m(a.rcl, a.zje):java.lang.Object");
    }

    public nvu m0() {
        return new nvu(new ilt0(e()), new trm0(new ot(d0()), new jyg0(e()), (byte) 11), G(), (byte) 28);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, zje zjeVar) {
        m7e m7eVar;
        if (zjeVar instanceof m7e) {
            m7eVar = (m7e) zjeVar;
            int i = m7eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7eVar.k = i - Integer.MIN_VALUE;
            } else {
                m7eVar = new m7e(this, zjeVar);
            }
        } else {
            m7eVar = new m7e(this, zjeVar);
        }
        Object objA = m7eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = m7eVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            k7e k7eVar = (k7e) this.f10647a;
            m7eVar.k = 1;
            objA = ((f6e) k7eVar.f17815a.b(sre0.f32672a.b(f6e.class), 0L)).a(str, m7eVar);
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
        ResponseBody responseBody = (ResponseBody) objA;
        return new icl(responseBody.a(), responseBody.getC());
    }

    public trm0 n0() {
        return new trm0(e(), (gst0) this.d);
    }

    public a7q o() {
        return new a7q(k());
    }

    public hcp0 o0() {
        return new hcp0(e(), (gst0) this.d);
    }

    public mrt p() {
        return new mrt(e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p0(String str, final File file, zje zjeVar) {
        t8e t8eVar;
        final MediaType mediaTypeA;
        if (zjeVar instanceof t8e) {
            t8eVar = (t8e) zjeVar;
            int i = t8eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8eVar.k = i - Integer.MIN_VALUE;
            } else {
                t8eVar = new t8e(this, zjeVar);
            }
        } else {
            t8eVar = new t8e(this, zjeVar);
        }
        Object objA = t8eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = t8eVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strC0 = sj3.c0(file);
            k7e k7eVar = (k7e) this.f10647a;
            t8eVar.k = 1;
            Regex regex = MediaType.e;
            try {
                mediaTypeA = MediaType.Companion.a(strC0);
            } catch (IllegalArgumentException unused) {
                mediaTypeA = null;
            }
            int i3 = RequestBody.f46110a;
            RequestBody requestBody = new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public final long a() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: b, reason: from getter */
                public final MediaType getB() {
                    return mediaTypeA;
                }

                @Override // okhttp3.RequestBody
                public final void d(t99 t99Var) throws IOException {
                    File file2 = file;
                    file2.getClass();
                    hfx hfxVar = new hfx(new FileInputStream(file2), fmq0.d);
                    try {
                        t99Var.P(hfxVar);
                        hfxVar.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bkb.E(hfxVar, th);
                            throw th2;
                        }
                    }
                }
            };
            String name = file.getName();
            StringBuilder sbR = brm0.r("form-data; name=");
            MediaType mediaType = MultipartBody.f;
            MultipartBody.Companion.a("file", sbR);
            if (name != null) {
                sbR.append("; filename=");
                MultipartBody.Companion.a(name, sbR);
            }
            String string = sbR.toString();
            Headers.Builder builder = new Headers.Builder();
            builder.c("Content-Disposition", string);
            objA = ((u8e) k7eVar.b.invoke()).a(str, MultipartBody.Part.Companion.a(_HeadersCommonKt.b(builder), requestBody), "application/vnd.xenvelop+json", t8eVar);
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
        String str2 = ((glu) ((dx5) objA).a()).f11513a;
        if (str2 != null) {
            return str2;
        }
        jf4.k(null);
        return null;
    }

    public nrt q() {
        return new nrt(e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable r(int i, int i2, int i3, zje zjeVar) {
        n7e n7eVar;
        gxb gxbVar;
        a640 a640VarB0;
        i7e i7eVar = (i7e) this.c;
        if (zjeVar instanceof n7e) {
            n7eVar = (n7e) zjeVar;
            int i4 = n7eVar.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                n7eVar.l = i4 - Integer.MIN_VALUE;
            } else {
                n7eVar = new n7e(this, zjeVar);
            }
        } else {
            n7eVar = new n7e(this, zjeVar);
        }
        Object obj = n7eVar.j;
        wne wneVar = wne.f39444a;
        int i5 = n7eVar.l;
        if (i5 == 0) {
            z1x.P(obj);
            gxb gxbVar2 = (gxb) i7eVar.i.getValue();
            if (Intrinsics.d(gxbVar2, gxb.k)) {
                e9d0.o();
                return null;
            }
            vae vaeVar = (vae) this.b;
            n7eVar.i = gxbVar2;
            n7eVar.l = 1;
            Object objC = vaeVar.c(i, i2, i3, n7eVar);
            if (objC == wneVar) {
                return wneVar;
            }
            obj = objC;
            gxbVar = gxbVar2;
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gxbVar = n7eVar.i;
            z1x.P(obj);
        }
        p840 p840Var = (p840) obj;
        List list = p840Var.b;
        if (list != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zsm0.L((kst0) it.next()));
            }
            i7eVar.a(arrayList);
        }
        List list2 = p840Var.f26537a;
        if (list2 == null) {
            return iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            try {
                a640VarB0 = s0x.b0((n640) it2.next(), gxbVar, null, (vby) this.i);
            } catch (Exception unused) {
                a640VarB0 = null;
            }
            if (a640VarB0 != null) {
                arrayList2.add(a640VarB0);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object s(zje zjeVar) {
        o7e o7eVar;
        long j;
        Integer num;
        if (zjeVar instanceof o7e) {
            o7eVar = (o7e) zjeVar;
            int i = o7eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7eVar.k = i - Integer.MIN_VALUE;
            } else {
                o7eVar = new o7e(this, zjeVar);
            }
        } else {
            o7eVar = new o7e(this, zjeVar);
        }
        Object objB = o7eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = o7eVar.k;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objB);
            vae vaeVar = (vae) this.b;
            o7eVar.k = 1;
            objB = vaeVar.b(o7eVar);
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
        cyb cybVar = (cyb) objB;
        cybVar.getClass();
        cxb cxbVar = cybVar.f5165a;
        if (cxbVar == null) {
            jf4.k(null);
            return null;
        }
        List list = cybVar.b;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zsm0.L((kst0) it.next()));
        }
        String str = cxbVar.f5115a;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        Boolean bool = cxbVar.b;
        if (bool == null) {
            jf4.k(null);
            return null;
        }
        boolean zBooleanValue = bool.booleanValue();
        Integer num2 = cxbVar.c;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = cxbVar.d;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        Integer num4 = cxbVar.e;
        int iIntValue3 = num4 != null ? num4.intValue() : 0;
        List list2 = cxbVar.h;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        Boolean bool2 = cxbVar.g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Long l = cxbVar.f;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            j = jLongValue;
        } else {
            j = 0;
        }
        v9k0 v9k0Var = j != 0 ? new v9k0(null, TimeUnit.SECONDS.toMillis(j)) : null;
        n640 n640Var = cxbVar.i;
        vxy vxyVar = vxy.c;
        if (n640Var != null && (num = n640Var.f22978a) != null) {
            int iIntValue4 = num.intValue();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    xrt0 xrt0Var = (xrt0) it2.next();
                    if (Intrinsics.d(xrt0Var.a(), n640Var.c) && (xrt0Var instanceof srt0)) {
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            vxyVar = new vxy(iIntValue4, z);
        }
        return new gxb(str, zBooleanValue, iIntValue, iIntValue2, iIntValue3, v9k0Var, zBooleanValue2, list3, arrayList, vxyVar);
    }

    public m0u t() {
        return new m0u(k());
    }

    public q0u u() {
        return new q0u(k());
    }

    public jo20 v(String str, String str2) {
        jo20 jo20Var = new jo20();
        knf0 knf0Var = (knf0) this.e;
        jo20Var.put("X-Language", knf0Var.c());
        i7e i7eVar = (i7e) this.c;
        jo20Var.put("AppGuid", i7eVar.c());
        jo20Var.put("Accept", "application/vnd.xenvelop+json");
        jo20Var.put("x-whence", String.valueOf(22));
        jo20Var.put("x-referral", String.valueOf(1));
        jo20Var.put("x-group", String.valueOf(1357));
        us3 us3Var = (us3) this.h;
        us3Var.getClass();
        jo20Var.put("x-bundleid", "org.xbet.client1");
        jo20Var.put("x-fcountry", String.valueOf(knf0Var.b()));
        ((tgk) this.f).getClass();
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        jo20Var.put("x-devicemanufacturer", str3);
        jo20Var.put("x-devicemodel", tgk.c());
        String strA = knf0Var.a();
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        AtomicLong atomicLong = i7eVar.d;
        atomicLong.getClass();
        jo20Var.put("x-request-guid", String.format(locale, "%s_%s_%s_%s_%s_%s", Arrays.copyOf(new Object[]{1, strA, lValueOf, Long.valueOf(atomicLong.getAndAdd(1L)), Integer.valueOf(us3Var.c().f11610a), Integer.valueOf(new Random().nextInt())}, 6)));
        if (str2 != null) {
            jo20Var.put("X-Auth", str2);
        }
        if (str != null) {
            jo20Var.put("x-country", str);
        }
        return jo20Var.b();
    }

    public sp w() {
        return new sp(e());
    }

    public phf0 x() {
        return new phf0(new kc60((gst0) this.d), new u4a(e()), y());
    }

    public ahu y() {
        return new ahu(e(), (gst0) this.d);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(1:(1:(3:13|114|(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44))(1:(2:119|120)(1:121)))(2:14|15))(5:16|17|100|150|(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44))(1:(2:119|120)(1:121))))(4:18|134|19|20))(2:23|(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44))(1:(2:119|120)(1:121)))|144|45|46|132|47|(9:50|51|148|52|53|126|54|55|48)|152|62) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:25|146|26|138|27|28|122|29|30|142|31|32|136|33|34|128|35|140|36|37|130|38|39|124|40|41|(2:43|112)(1:44)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:50|51|148|52|53|126|54|55|48) */
    /* JADX WARN: Code duplicated, block: B:101:0x032a  */
    /* JADX WARN: Code duplicated, block: B:102:0x034f  */
    /* JADX WARN: Code duplicated, block: B:104:0x035d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0366  */
    /* JADX WARN: Code duplicated, block: B:107:0x0368  */
    /* JADX WARN: Code duplicated, block: B:110:0x036d  */
    /* JADX WARN: Code duplicated, block: B:113:0x039e  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:117:0x03de  */
    /* JADX WARN: Code duplicated, block: B:118:0x03fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0402  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x014d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d8 A[Catch: all -> 0x022a, TRY_LEAVE, TryCatch #5 {all -> 0x022a, blocks: (B:47:0x01c7, B:48:0x01d2, B:50:0x01d8), top: B:132:0x01c7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:98:0x0304  */
    /* JADX WARN: Code duplicated, block: B:99:0x0307  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0205, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0206, code lost:
    
        r2 = r5;
        r1 = r6;
        r6 = r17;
        r5 = r0;
        r0 = r12;
        r12 = r16;
        r16 = r9;
        r9 = r14;
        r14 = r20;
        r20 = r4;
        r4 = r8;
        r8 = r13;
        r13 = r3;
        r3 = r7;
        r7 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x021e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021f, code lost:
    
        r7 = r29;
        r11 = r30;
        r13 = r31;
        r16 = r32;
        r22 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x022a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022b, code lost:
    
        r22 = r16;
        r16 = r13;
        r13 = r22;
        r22 = r11;
        r11 = r7;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0238, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0239, code lost:
    
        r22 = r16;
        r16 = r13;
        r13 = r22;
        r22 = r11;
        r11 = r7;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0244, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0245, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0249, code lost:
    
        r5 = r28;
        r20 = r30;
        r6 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0250, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0252, code lost:
    
        r1 = r6;
        r11 = r10;
        r6 = r17;
        r16 = r35;
        r23 = r5;
        r5 = r0;
        r0 = r12;
        r12 = r9;
        r9 = r14;
        r14 = r20;
        r20 = r4;
        r4 = r2;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0266, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0267, code lost:
    
        r20 = r5;
        r6 = r11;
        r4 = r19;
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0270, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0273, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0274, code lost:
    
        r20 = r5;
        r6 = r11;
        r2 = r17;
        r4 = r19;
        r5 = r28;
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0280, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0281, code lost:
    
        r35 = r1;
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028c, code lost:
    
        r17 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x028f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0290, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0299, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x029a, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x032a -> B:24:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x039e -> B:114:0x03a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable z(int r28, long r29, java.util.List r31, java.util.List r32, boolean r33, boolean r34, boolean r35, java.lang.String r36, a.zje r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g45.z(int, long, java.util.List, java.util.List, boolean, boolean, boolean, java.lang.String, a.zje):java.io.Serializable");
    }

    public g45(lye lyeVar, m0f m0fVar, ave aveVar, ehf0 ehf0Var, vwb0 vwb0Var, q7d0 q7d0Var, us3 us3Var, knf0 knf0Var, mne mneVar) {
        lyeVar.getClass();
        m0fVar.getClass();
        aveVar.getClass();
        vwb0Var.getClass();
        q7d0Var.getClass();
        us3Var.getClass();
        knf0Var.getClass();
        this.f10647a = lyeVar;
        this.b = m0fVar;
        this.c = aveVar;
        this.d = ehf0Var;
        this.e = vwb0Var;
        this.f = q7d0Var;
        this.g = us3Var;
        this.h = knf0Var;
        this.i = mneVar;
    }
}
