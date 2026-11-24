package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import com.huawei.hms.android.HwBuildEx;
import java.io.EOFException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.IntConsumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oif0 implements n1x, egp {
    public static final bix0 e = new bix0();
    public static final dix0 f = new dix0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25308a;
    public Object b;
    public Object c;
    public Object d;

    public oif0(byte b) {
        this.f25308a = b;
        switch (b) {
            case 2:
                break;
            case 16:
                this.b = new clc((byte) 28);
                this.c = new clc((byte) 28);
                this.d = new clc((byte) 28);
                break;
            case 17:
                this.d = StandardCharsets.ISO_8859_1;
                this.b = new StringBuilder();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = null;
                break;
        }
    }

    public static int m(int i, int i2, p68 p68Var) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (p68Var.d(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(String str, zje zjeVar) {
        w4a w4aVar;
        if (zjeVar instanceof w4a) {
            w4aVar = (w4a) zjeVar;
            int i = w4aVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4aVar.l = i - Integer.MIN_VALUE;
            } else {
                w4aVar = new w4a(this, zjeVar);
            }
        } else {
            w4aVar = new w4a(this, zjeVar);
        }
        Object objG = w4aVar.j;
        Object obj = wne.f39444a;
        int i2 = w4aVar.l;
        if (i2 == 0) {
            z1x.P(objG);
            khf0 khf0Var = (khf0) this.c;
            bm5 bm5Var = bm5.c;
            w4aVar.i = str;
            w4aVar.l = 1;
            objG = khf0.G(khf0Var, bm5Var, w4aVar);
            if (objG != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objG);
                return objG;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = w4aVar.i;
        z1x.P(objG);
        String str2 = str;
        ql5 ql5Var = (ql5) objG;
        ((trm0) this.d).l(bm5.c, ql5Var);
        ehf0 ehf0Var = (ehf0) this.b;
        long j = ql5Var.f28916a;
        w4aVar.i = null;
        w4aVar.l = 2;
        gr00 gr00Var = (gr00) ehf0Var.b;
        Object objD0 = qjj.d0(((mne) gr00Var.f11760a).b, new xw4(gr00Var, ((gst0) ehf0Var.c).f11847a.a().f18785a, j, str2, null), w4aVar);
        return objD0 == obj ? obj : objD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (C(r11, r9, r10, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r9, java.lang.String r10, a.zje r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a.ywd
            if (r0 == 0) goto L13
            r0 = r11
            a.ywd r0 = (a.ywd) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.ywd r0 = new a.ywd
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r11)
            goto L63
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L31:
            java.lang.String r10 = r0.j
            java.lang.String r9 = r0.i
            a.z1x.P(r11)
            goto L4e
        L39:
            a.z1x.P(r11)
            java.lang.Object r11 = r8.c
            a.rou r11 = (a.rou) r11
            r0.i = r9
            r0.j = r10
            r0.m = r4
            r2 = 0
            java.lang.Object r11 = r11.a(r2, r0)
            if (r11 != r1) goto L4e
            goto L62
        L4e:
            a.m2c0 r11 = (a.m2c0) r11
            long r6 = r11.S
            java.lang.String r11 = java.lang.String.valueOf(r6)
            r0.i = r5
            r0.j = r5
            r0.m = r3
            java.lang.Object r8 = r8.C(r11, r9, r10, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oif0.B(java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Unit] */
    public Object C(String str, String str2, String str3, zje zjeVar) throws zhi0 {
        xwd xwdVar;
        if (zjeVar instanceof xwd) {
            xwdVar = (xwd) zjeVar;
            int i = xwdVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xwdVar.k = i - Integer.MIN_VALUE;
            } else {
                xwdVar = new xwd(this, zjeVar);
            }
        } else {
            xwdVar = new xwd(this, zjeVar);
        }
        Object obj = xwdVar.i;
        wne wneVar = wne.f39444a;
        int i2 = xwdVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                myb mybVar = (myb) this.b;
                xwdVar.k = 1;
                if (mybVar.a(str, str2, str3, xwdVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            this = Unit.f46060a;
            return this;
        } catch (zhi0 e2) {
            if (e2.c == i2o.OnlyOperatorCanEditParticipants) {
                ((eqx) this.d).b();
            }
            throw e2;
        }
    }

    public boolean D(int i) {
        int i2;
        int i3 = i + 1;
        p68 p68Var = (p68) this.b;
        if (i3 <= p68Var.b) {
            for (int i4 = 0; i4 < 5 && (i2 = i4 + i) < p68Var.b; i4++) {
                if (i4 == 2) {
                    if (p68Var.d(i + 2)) {
                    }
                } else if (!p68Var.d(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean E() {
        return !(((mlk0) ((clc) this.b).b).isEmpty() && ((mlk0) ((clc) this.d).b).isEmpty() && ((mlk0) ((clc) this.c).b).isEmpty());
    }

    public Object F(hf6 hf6Var, zje zjeVar) {
        Object objA = ((lye) this.b).m.a(hf6Var, zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public Object G(zje zjeVar) {
        qoj0 qoj0Var = ((lye) this.b).l;
        Unit unit = Unit.f46060a;
        Object objA = qoj0Var.a(unit, zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = unit;
        }
        return objA == wneVar ? objA : unit;
    }

    public void H(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.b = Integer.valueOf(i);
    }

    public void I(List list) {
        Object next;
        g0f g0fVar;
        m0f m0fVar = (m0f) this.c;
        list.getClass();
        if (((ave) this.d).f1521a != q4f.m) {
            lye lyeVar = (lye) this.b;
            lyeVar.getClass();
            lyeVar.f20858a = g0f.a(lyeVar.f20858a, 0L, list, 0.0d, null, 0.0d, 0L, 0.0d, 0.0d, false, 0.0d, false, 0, null, false, 0, null, null, 0.0d, 0.0d, false, 1048573);
            return;
        }
        ArrayList arrayList = m0fVar.f20951a;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hf6 hf6Var = (hf6) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                List list2 = ((g0f) next).b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (hf6Var.f12958a == ((hf6) it3.next()).f12958a) {
                            break;
                        }
                    }
                }
            }
            g0f g0fVar2 = (g0f) next;
            if (g0fVar2 == null) {
                iun iunVar = iun.f15405a;
                g0fVar = new g0f(0L, iunVar, 0.0d, iunVar, 0.0d, 0L, 0.0d, 0.0d, false, 0.0d, false, 0, "", false, 0, "", iunVar, 0.0d, 0.0d, false);
            } else {
                g0fVar = g0fVar2;
            }
            arrayList2.add(g0f.a(g0fVar, 0L, kotlin.collections.a.c(hf6Var), 0.0d, null, 0.0d, 0L, 0.0d, 0.0d, false, 0.0d, false, 0, null, false, 0, null, null, 0.0d, 0.0d, false, 1048573));
        }
        ArrayList arrayList3 = m0fVar.f20951a;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
    }

    public dnt0 J() {
        ilp0 ilp0Var = new ilp0(new roi0((rbq0) this.b));
        v6j0 v6j0Var = (v6j0) this.c;
        return new dnt0(ilp0Var, new tqx(v6j0Var, (byte) 0), new m8u(v6j0Var, (byte) 1), new q4a(v6j0Var, (byte) 1), (wyu) this.d);
    }

    public void a(e7z e7zVar, eox eoxVar) {
        clc clcVar = (clc) this.b;
        clc clcVar2 = (clc) this.c;
        clc clcVar3 = (clc) this.d;
        int iOrdinal = eoxVar.ordinal();
        if (iOrdinal == 0) {
            clcVar.b(e7zVar);
            clcVar3.b(e7zVar);
            return;
        }
        if (iOrdinal == 1) {
            clcVar2.b(e7zVar);
            clcVar3.b(e7zVar);
            return;
        }
        if (iOrdinal == 2) {
            if (e7zVar.i != null) {
                clcVar3.b(e7zVar);
                return;
            } else {
                clcVar.b(e7zVar);
                return;
            }
        }
        if (iOrdinal != 3) {
            t9f.b();
        } else if (e7zVar.i != null) {
            clcVar3.b(e7zVar);
        } else {
            clcVar2.b(e7zVar);
        }
    }

    public void b(char c) {
        ((StringBuilder) this.b).append((char) (c & 255));
    }

    public void c(int i) throws bwq {
        j();
        uvb uvbVarA = uvb.a(i);
        if (uvbVarA == null) {
            throw bwq.a();
        }
        this.d = Charset.forName(uvbVarA.name());
    }

    public q50 d() {
        Integer num = (Integer) this.b;
        if (num == null) {
            hny.o("key size not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            hny.o("tag size not set");
            return null;
        }
        if (((p50) this.d) != null) {
            return new q50(num.intValue(), ((Integer) this.c).intValue(), (p50) this.d);
        }
        hny.o("variant not set");
        return null;
    }

    public Object e(zje zjeVar) {
        ((m0f) this.c).f20951a.clear();
        lye lyeVar = (lye) this.b;
        lyeVar.f20858a = g0f.a(lyeVar.f20858a, 0L, iun.f15405a, 0.0d, null, 0.0d, 0L, 0.0d, 0.0d, false, 0.0d, false, 0, null, false, 0, null, null, 0.0d, 0.0d, false, 1048573);
        qoj0 qoj0Var = lyeVar.l;
        Unit unit = Unit.f46060a;
        Object objA = qoj0Var.a(unit, zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = unit;
        }
        return objA == wneVar ? objA : unit;
    }

    public boolean f(e7z e7zVar) {
        return !(e7zVar.i == null) && (((mlk0) ((clc) this.b).b).contains(e7zVar) || ((mlk0) ((clc) this.c).b).contains(e7zVar));
    }

    public String g(int i, StringBuilder sb) throws bwq, o660 {
        String str = null;
        while (true) {
            lkj lkjVarI = i(i, str);
            String strA = yqp.a(lkjVarI.e);
            if (strA != null) {
                sb.append(strA);
            }
            String strValueOf = lkjVarI.g ? String.valueOf(lkjVarI.f) : null;
            int i2 = lkjVarI.b;
            if (i == i2) {
                return sb.toString();
            }
            i = i2;
            str = strValueOf;
        }
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = ((Context) this.c).getResources();
        resources.getClass();
        Drawable drawableQ = c3x.q(dywVar, resources);
        Function1 function1 = (Function1) this.d;
        BitmapDrawable bitmapDrawable = drawableQ instanceof BitmapDrawable ? (BitmapDrawable) drawableQ : null;
        function1.invoke(bitmapDrawable != null ? bitmapDrawable.getBitmap() : null);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0228  */
    /* JADX WARN: Code duplicated, block: B:141:0x0230  */
    /* JADX WARN: Code duplicated, block: B:142:0x0235  */
    /* JADX WARN: Code duplicated, block: B:204:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x032a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    public lkj i(int i, String str) throws bwq {
        boolean zD;
        s88 s88Var;
        byte b;
        boolean z;
        mkj mkjVar;
        s88 s88Var2;
        byte b2;
        int i2;
        int i3;
        int i4;
        int iM;
        int iM2;
        int iM3;
        char c;
        kkj kkjVar;
        kkj kkjVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM4;
        int iM5;
        char c2;
        kkj kkjVar3;
        kkj kkjVar4;
        p68 p68Var = (p68) this.b;
        eld0 eld0Var = (eld0) this.c;
        StringBuilder sb = (StringBuilder) this.d;
        sb.setLength(0);
        if (str != null) {
            sb.append(str);
        }
        eld0Var.b = i;
        do {
            int i9 = eld0Var.b;
            int i10 = eld0Var.c;
            int i11 = 16;
            if (i10 != 2) {
                if (i10 == 3) {
                    while (true) {
                        int i12 = eld0Var.b;
                        if (i12 + 5 <= p68Var.b && (((iM = m(i12, 5, p68Var)) >= 5 && iM < i11) || (i12 + 7 <= p68Var.b && (((iM2 = m(i12, 7, p68Var)) >= 64 && iM2 < 116) || (i12 + 8 <= p68Var.b && (iM3 = m(i12, 8, p68Var)) >= 232 && iM3 < 253))))) {
                            int i13 = eld0Var.b;
                            int iM6 = m(i13, 5, p68Var);
                            if (iM6 == 15) {
                                kkjVar2 = new kkj('$', i13 + 5);
                            } else {
                                if (iM6 < 5 || iM6 >= 15) {
                                    int iM7 = m(i13, 7, p68Var);
                                    if (iM7 >= 64 && iM7 < 90) {
                                        kkjVar = new kkj((char) (iM7 + 1), i13 + 7);
                                    } else if (iM7 < 90 || iM7 >= 116) {
                                        switch (m(i13, 8, p68Var)) {
                                            case 232:
                                                c = '!';
                                                break;
                                            case 233:
                                                c = '\"';
                                                break;
                                            case 234:
                                                c = '%';
                                                break;
                                            case 235:
                                                c = '&';
                                                break;
                                            case 236:
                                                c = '\'';
                                                break;
                                            case 237:
                                                c = '(';
                                                break;
                                            case 238:
                                                c = ')';
                                                break;
                                            case 239:
                                                c = '*';
                                                break;
                                            case 240:
                                                c = '+';
                                                break;
                                            case 241:
                                                c = ',';
                                                break;
                                            case 242:
                                                c = '-';
                                                break;
                                            case 243:
                                                c = '.';
                                                break;
                                            case 244:
                                                c = '/';
                                                break;
                                            case 245:
                                                c = ':';
                                                break;
                                            case 246:
                                                c = ';';
                                                break;
                                            case 247:
                                                c = '<';
                                                break;
                                            case 248:
                                                c = '=';
                                                break;
                                            case 249:
                                                c = '>';
                                                break;
                                            case 250:
                                                c = '?';
                                                break;
                                            case 251:
                                                c = '_';
                                                break;
                                            case 252:
                                                c = ' ';
                                                break;
                                            default:
                                                throw bwq.a();
                                        }
                                        kkjVar = new kkj(c, i13 + 8);
                                    } else {
                                        kkjVar = new kkj((char) (iM7 + 7), i13 + 7);
                                    }
                                } else {
                                    kkjVar = new kkj((char) (iM6 + 43), i13 + 5);
                                }
                                kkjVar2 = kkjVar;
                            }
                            int i14 = kkjVar2.b;
                            eld0Var.b = i14;
                            char c3 = kkjVar2.e;
                            if (c3 == '$') {
                                s88Var = new s88((Object) new lkj(i14, sb.toString()), true, (byte) 0);
                            } else {
                                sb.append(c3);
                                i11 = 16;
                            }
                        } else {
                            int i15 = eld0Var.b;
                            int i16 = i15 + 3;
                            if (i16 <= p68Var.b) {
                                while (true) {
                                    if (i15 >= i16) {
                                        eld0Var.b += 3;
                                        eld0Var.c = 1;
                                    } else if (!p68Var.d(i15)) {
                                        i15++;
                                    } else if (D(eld0Var.b)) {
                                        i2 = eld0Var.b;
                                        i3 = i2 + 5;
                                        i4 = p68Var.b;
                                        if (i3 < i4) {
                                            eld0Var.b = i2 + 5;
                                        } else {
                                            eld0Var.b = i4;
                                        }
                                        eld0Var.c = 2;
                                    }
                                }
                            } else if (D(eld0Var.b)) {
                                i2 = eld0Var.b;
                                i3 = i2 + 5;
                                i4 = p68Var.b;
                                if (i3 < i4) {
                                    eld0Var.b = i2 + 5;
                                } else {
                                    eld0Var.b = i4;
                                }
                                eld0Var.c = 2;
                            }
                            s88Var = new s88((byte) 0);
                        }
                    }
                    z = s88Var.b;
                } else {
                    while (true) {
                        int i17 = eld0Var.b;
                        int i18 = i17 + 7;
                        int i19 = p68Var.b;
                        if (i18 > i19) {
                            zD = i17 + 4 <= i19;
                        } else {
                            int i20 = i17;
                            while (true) {
                                int i21 = i17 + 3;
                                if (i20 >= i21) {
                                    zD = p68Var.d(i21);
                                } else if (!p68Var.d(i20)) {
                                    i20++;
                                }
                            }
                        }
                        int i22 = eld0Var.b;
                        int i23 = p68Var.b;
                        if (zD) {
                            int i24 = i22 + 7;
                            if (i24 > i23) {
                                int iM8 = m(i22, 4, p68Var);
                                int i25 = p68Var.b;
                                mkjVar = iM8 == 0 ? new mkj(i25, 10, 10) : new mkj(i25, iM8 - 1, 10);
                            } else {
                                int iM9 = m(i22, 7, p68Var) - 8;
                                mkjVar = new mkj(i24, iM9 / 11, iM9 % 11);
                            }
                            int i26 = mkjVar.b;
                            eld0Var.b = i26;
                            int i27 = mkjVar.f;
                            int i28 = mkjVar.e;
                            if (i28 == 10) {
                                lkj lkjVar = i27 == 10 ? new lkj(i26, sb.toString()) : new lkj(i26, i27, sb.toString());
                                b2 = 0;
                                s88Var2 = new s88((Object) lkjVar, true, b2);
                            } else {
                                b2 = 0;
                                boolean z2 = true;
                                sb.append(i28);
                                if (i27 == 10) {
                                    s88Var2 = new s88(new lkj(eld0Var.b, sb.toString()), z2, b2);
                                } else {
                                    sb.append(i27);
                                }
                            }
                            s88Var = s88Var2;
                            b = b2;
                        } else {
                            if (i22 + 1 <= i23) {
                                int i29 = 0;
                                while (true) {
                                    if (i29 < 4) {
                                        int i30 = i29 + i22;
                                        if (i30 < p68Var.b) {
                                            if (!p68Var.d(i30)) {
                                                i29++;
                                            }
                                        }
                                    }
                                    eld0Var.c = 2;
                                    eld0Var.b += 4;
                                }
                            }
                            b = 0;
                            s88Var = new s88((byte) 0);
                        }
                    }
                    z = s88Var.b;
                }
                i5 = eld0Var.b;
                if (i9 != i5 && !z) {
                }
                lkj lkjVar2 = (lkj) s88Var.c;
                return (lkjVar2 == null && lkjVar2.g) ? new lkj(i5, lkjVar2.f, sb.toString()) : new lkj(i5, sb.toString());
            }
            while (true) {
                int i31 = eld0Var.b;
                if (i31 + 5 <= p68Var.b && (((iM4 = m(i31, 5, p68Var)) >= 5 && iM4 < 16) || (i31 + 6 <= p68Var.b && (iM5 = m(i31, 6, p68Var)) >= 16 && iM5 < 63))) {
                    int i32 = eld0Var.b;
                    int iM10 = m(i32, 5, p68Var);
                    if (iM10 == 15) {
                        kkjVar4 = new kkj('$', i32 + 5);
                    } else {
                        if (iM10 < 5 || iM10 >= 15) {
                            int iM11 = m(i32, 6, p68Var);
                            if (iM11 < 32 || iM11 >= 58) {
                                switch (iM11) {
                                    case 58:
                                        c2 = '*';
                                        break;
                                    case 59:
                                        c2 = ',';
                                        break;
                                    case 60:
                                        c2 = '-';
                                        break;
                                    case 61:
                                        c2 = '.';
                                        break;
                                    case 62:
                                        c2 = '/';
                                        break;
                                    default:
                                        jf4.n(twn.m(iM11, "Decoding invalid alphanumeric value: "));
                                        return null;
                                }
                                kkjVar3 = new kkj(c2, i32 + 6);
                            } else {
                                kkjVar3 = new kkj((char) (iM11 + 33), i32 + 6);
                            }
                        } else {
                            kkjVar3 = new kkj((char) (iM10 + 43), i32 + 5);
                        }
                        kkjVar4 = kkjVar3;
                    }
                    int i33 = kkjVar4.b;
                    eld0Var.b = i33;
                    char c4 = kkjVar4.e;
                    if (c4 == '$') {
                        s88Var = new s88((Object) new lkj(i33, sb.toString()), true, (byte) 0);
                    } else {
                        sb.append(c4);
                    }
                } else {
                    int i34 = eld0Var.b;
                    int i35 = i34 + 3;
                    if (i35 <= p68Var.b) {
                        while (true) {
                            if (i34 >= i35) {
                                eld0Var.b += 3;
                                eld0Var.c = 1;
                            } else if (!p68Var.d(i34)) {
                                i34++;
                            } else if (D(eld0Var.b)) {
                                i6 = eld0Var.b;
                                i7 = i6 + 5;
                                i8 = p68Var.b;
                                if (i7 < i8) {
                                    eld0Var.b = i6 + 5;
                                } else {
                                    eld0Var.b = i8;
                                }
                                eld0Var.c = 3;
                            }
                        }
                    } else if (D(eld0Var.b)) {
                        i6 = eld0Var.b;
                        i7 = i6 + 5;
                        i8 = p68Var.b;
                        if (i7 < i8) {
                            eld0Var.b = i6 + 5;
                        } else {
                            eld0Var.b = i8;
                        }
                        eld0Var.c = 3;
                    }
                    s88Var = new s88((byte) 0);
                }
            }
            z = s88Var.b;
            b = 0;
            i5 = eld0Var.b;
            if (i9 != i5) {
            }
            lkj lkjVar3 = (lkj) s88Var.c;
            if (lkjVar3 == null) {
            }
        } while (!z);
        lkj lkjVar4 = (lkj) s88Var.c;
        if (lkjVar4 == null) {
        }
    }

    public void j() {
        Charset charset = (Charset) this.d;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        boolean zEquals = charset.equals(charset2);
        StringBuilder sb = (StringBuilder) this.b;
        if (zEquals) {
            if (sb.length() > 0) {
                StringBuilder sb2 = (StringBuilder) this.c;
                StringBuilder sb3 = (StringBuilder) this.b;
                if (sb2 == null) {
                    this.c = sb3;
                    this.b = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) sb3);
                    this.b = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (sb.length() > 0) {
            byte[] bytes = ((StringBuilder) this.b).toString().getBytes(charset2);
            this.b = new StringBuilder();
            StringBuilder sb4 = (StringBuilder) this.c;
            Charset charset3 = (Charset) this.d;
            if (sb4 == null) {
                this.c = new StringBuilder(new String(bytes, charset3));
            } else {
                sb4.append(new String(bytes, charset3));
            }
        }
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        r1oVar.c.printStackTrace();
        ((Function1) this.b).invoke(null);
    }

    @Override // a.egp
    public boolean l(xii0 xii0Var) {
        ux9 ux9Var = new ux9();
        p7d p7dVar = new p7d();
        c1a c1aVar = (c1a) this.b;
        fhn fhnVar = new fhn(((ow9) c1aVar).f25959a, (byte) 3);
        i2a i2aVar = (i2a) this.d;
        yz9 yz9Var = new yz9(ux9Var, p7dVar, fhnVar, i2aVar, new h4w0(), new soq(i2aVar.a()), c1aVar, null, null);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return ((Boolean) eeq.U(kotlin.coroutines.g.f46065a, new j0l((Object) this, (Object) yz9Var.a(0, xii0Var, true, null, null, lunVar, lunVar), (yje) null, (byte) 22))).booleanValue();
    }

    public List n() {
        if (((ave) this.d).f1521a != q4f.m) {
            return ((lye) this.b).f20858a.b;
        }
        ArrayList arrayList = ((m0f) this.c).f20951a;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g0f) it.next()).b);
        }
        return r3d.r(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Serializable o(zje zjeVar) {
        dk8 dk8Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof dk8) {
            dk8Var = (dk8) zjeVar;
            int i = dk8Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk8Var.k = i - Integer.MIN_VALUE;
            } else {
                dk8Var = new dk8(this, zjeVar);
            }
        } else {
            dk8Var = new dk8(this, zjeVar);
        }
        dk8 dk8Var2 = dk8Var;
        Object objC = dk8Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = dk8Var2.k;
        if (i2 == 0) {
            z1x.P(objC);
            r7v r7vVar = (r7v) this.c;
            String strA = ((btt0) this.b).a();
            String strC = knf0Var.c();
            dk8Var2.k = 1;
            objC = ((yk8) ((zm) r7vVar.f29996a).invoke()).c(strA, strC, 1, 1357, 22, dk8Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        Iterable<ik8> iterable = (Iterable) ((q16) objC).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (ik8 ik8Var : iterable) {
            ik8Var.getClass();
            Integer num = ik8Var.f14912a;
            if (num == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue = num.intValue();
            String str = ik8Var.b;
            String str2 = str == null ? "" : str;
            Integer num2 = ik8Var.c;
            int iIntValue2 = 0;
            int iIntValue3 = num2 != null ? num2.intValue() : 0;
            Double d = ik8Var.d;
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            Double d2 = ik8Var.e;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Double d3 = ik8Var.f;
            double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
            Double d4 = ik8Var.g;
            double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
            Long l = ik8Var.h;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str3 = ik8Var.i;
            String str4 = str3 == null ? "" : str3;
            Integer num3 = ik8Var.j;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            }
            arrayList.add(new ak8(iIntValue, str2, iIntValue3, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, jLongValue, str4, iIntValue2));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0247  */
    /* JADX WARN: Code duplicated, block: B:110:0x0251  */
    /* JADX WARN: Code duplicated, block: B:113:0x0269 A[LOOP:5: B:111:0x0263->B:113:0x0269, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x027b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0294  */
    /* JADX WARN: Code duplicated, block: B:124:0x0298  */
    /* JADX WARN: Code duplicated, block: B:126:0x029e  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:154:0x030c  */
    /* JADX WARN: Code duplicated, block: B:160:0x032f  */
    /* JADX WARN: Code duplicated, block: B:162:0x033f  */
    /* JADX WARN: Code duplicated, block: B:167:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0105  */
    /* JADX WARN: Code duplicated, block: B:32:0x0116  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:39:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0174  */
    /* JADX WARN: Code duplicated, block: B:47:0x0188  */
    /* JADX WARN: Code duplicated, block: B:48:0x018b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0206  */
    /* JADX WARN: Code duplicated, block: B:86:0x020b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0212  */
    /* JADX WARN: Code duplicated, block: B:92:0x021e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0223  */
    /* JADX WARN: Code duplicated, block: B:95:0x0227  */
    /* JADX WARN: Code duplicated, block: B:96:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Iterable, java.util.List] */
    public Serializable p(List list, long j, long j2, int i, zje zjeVar) {
        omb ombVar;
        List list2;
        long j3;
        long j4;
        dx5 dx5Var;
        List list3;
        List list4;
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        LinkedHashMap linkedHashMap2;
        HashMap map;
        ArrayList arrayList2;
        Object arrayList3;
        String str;
        String str2;
        Long l;
        List<wmb> list5;
        Long l2;
        String str3;
        ?? arrayList4;
        ?? r20;
        LinkedHashSet linkedHashSet;
        Iterator it2;
        kdb kdbVar;
        Pair pair;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        String str4;
        wmb wmbVar;
        Long l3;
        long jLongValue4;
        Long lValueOf;
        Object arrayList5;
        Iterator it3;
        Object next;
        ril0 ril0Var;
        String str5;
        ldb ldbVar;
        long jLongValue5;
        Long l4;
        long jLongValue6;
        String str6;
        Integer num;
        String str7;
        String strValueOf;
        Long l5;
        mdb mdbVar;
        long jLongValue7;
        String str8;
        Long l6;
        Long l7;
        long jLongValue8;
        String str9;
        String str10;
        Integer num2;
        String str11;
        String strValueOf2;
        List list6;
        Long l8;
        Object arrayList6;
        int i2 = i;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof omb) {
            ombVar = (omb) zjeVar;
            int i3 = ombVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ombVar.p = i3 - Integer.MIN_VALUE;
            } else {
                ombVar = new omb(this, zjeVar);
            }
        } else {
            ombVar = new omb(this, zjeVar);
        }
        Object objA = ombVar.n;
        wne wneVar = wne.f39444a;
        int i4 = ombVar.p;
        if (i4 == 0) {
            z1x.P(objA);
            String strC = knf0Var.c();
            list.getClass();
            do20 do20Var = (do20) this.b;
            jo20 jo20Var = new jo20();
            jo20Var.put("sportIds", CollectionsKt.b0(list, null, null, null, null, 63));
            jo20Var.put("dateFrom", String.valueOf(j));
            jo20Var.put("dateTo", String.valueOf(j2));
            jo20Var.put("lng", strC);
            jo20Var.put("ref", String.valueOf(1));
            jo20Var.put("gr", String.valueOf(1357));
            if (i2 != -1) {
                jo20Var.put("cyberType", String.valueOf(i2));
            }
            jo20 jo20VarB = jo20Var.b();
            list2 = list;
            ombVar.i = list2;
            j3 = j;
            ombVar.k = j3;
            j4 = j2;
            ombVar.l = j4;
            ombVar.m = i2;
            ombVar.p = 1;
            objA = ((ymb) ((sza) do20Var.f6397a).invoke()).a(jo20VarB, ombVar);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i4 == 1) {
            i2 = ombVar.m;
            long j5 = ombVar.l;
            long j6 = ombVar.k;
            List list7 = ombVar.i;
            z1x.P(objA);
            j4 = j5;
            j3 = j6;
            list2 = list7;
        } else {
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dx5Var = ombVar.j;
            list3 = ombVar.i;
            z1x.P(objA);
        }
        list4 = (List) objA;
        dx5Var.getClass();
        list4.getClass();
        list3.getClass();
        iterable = ((xmb) dx5Var.a()).b;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        linkedHashMap = new LinkedHashMap();
        for (Object obj : iterable) {
            l8 = ((smb) obj).d;
            arrayList6 = linkedHashMap.get(l8);
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                linkedHashMap.put(l8, arrayList6);
            }
            ((List) arrayList6).add(obj);
        }
        arrayList = new ArrayList();
        it = list3.iterator();
        while (it.hasNext()) {
            list6 = (List) linkedHashMap.get(Long.valueOf(((Number) it.next()).longValue()));
            if (list6 != null) {
                arrayList.add(list6);
            }
        }
        ArrayList<smb> arrayListR = r3d.r(arrayList);
        linkedHashMap2 = new LinkedHashMap();
        map = new HashMap();
        for (smb smbVar : arrayListR) {
            str = smbVar.b;
            str2 = smbVar.c;
            l = smbVar.f32436a;
            list5 = smbVar.g;
            l2 = smbVar.d;
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (list5 != null) {
                arrayList4 = new ArrayList();
                for (wmb wmbVar2 : list5) {
                    l5 = wmbVar2.f39397a;
                    if (l5 != null) {
                        jLongValue7 = l5.longValue();
                        str8 = wmbVar2.b;
                        if (str8 == null && (l6 = wmbVar2.d) != null) {
                            long jLongValue9 = l6.longValue();
                            l7 = wmbVar2.e;
                            if (l7 != null) {
                                jLongValue8 = l7.longValue();
                            } else {
                                jLongValue8 = 0;
                            }
                            str9 = wmbVar2.c;
                            if (str9 == null) {
                                str10 = "";
                            } else {
                                str10 = str9;
                            }
                            num2 = wmbVar2.f;
                            if (num2 != null || (strValueOf2 = String.valueOf(num2.intValue())) == null) {
                                str11 = "0";
                            } else {
                                str11 = strValueOf2;
                            }
                            mdbVar = new mdb(jLongValue7, str8, jLongValue9, jLongValue8, str3, str10, str11, false);
                        } else {
                            mdbVar = null;
                        }
                    } else {
                        mdbVar = null;
                    }
                    if (mdbVar != null) {
                        arrayList4.add(mdbVar);
                    }
                }
            } else {
                arrayList4 = iun.f15405a;
            }
            r20 = arrayList4;
            if (r20.isEmpty()) {
                if (l != null) {
                    jLongValue5 = l.longValue();
                    if (str == null && l2 != null) {
                        long jLongValue10 = l2.longValue();
                        l4 = smbVar.e;
                        if (l4 != null) {
                            jLongValue6 = l4.longValue();
                        } else {
                            jLongValue6 = 0;
                        }
                        if (str2 == null) {
                            str6 = "";
                        } else {
                            str6 = str2;
                        }
                        num = smbVar.f;
                        if (num != null || (strValueOf = String.valueOf(num.intValue())) == null) {
                            str7 = "0";
                        } else {
                            str7 = strValueOf;
                        }
                        ldbVar = new ldb(jLongValue5, str, jLongValue10, jLongValue6, str6, str7);
                    } else {
                        ldbVar = null;
                    }
                } else {
                    ldbVar = null;
                }
                if (ldbVar == null && l2 != null) {
                    pair = new Pair(ldbVar, l2);
                } else {
                    pair = null;
                }
            } else {
                ((mdb) CollectionsKt.d0(r20)).h = true;
                linkedHashSet = new LinkedHashSet();
                it2 = r20.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((mdb) it2.next()).f21587a));
                }
                if (l != null) {
                    jLongValue = l.longValue();
                    if (list5 != null || (wmbVar = (wmb) CollectionsKt.firstOrNull(list5)) == null || (l3 = wmbVar.e) == null) {
                        jLongValue2 = 0;
                    } else {
                        jLongValue2 = l3.longValue();
                    }
                    if (l2 != null) {
                        jLongValue3 = l2.longValue();
                        if (str == null) {
                            kdbVar = null;
                        } else {
                            if (str2 == null) {
                                str4 = "";
                            } else {
                                str4 = str2;
                            }
                            kdbVar = new kdb(jLongValue, str, jLongValue3, jLongValue2, str4, String.valueOf(linkedHashSet.size()), r20, false);
                        }
                    } else {
                        kdbVar = null;
                    }
                } else {
                    kdbVar = null;
                }
                if (kdbVar == null && l2 != null) {
                    pair = new Pair(kdbVar, l2);
                } else {
                    pair = null;
                }
            }
            if (pair != null) {
                odb odbVar = (odb) pair.f46059a;
                jLongValue4 = ((Number) pair.b).longValue();
                if (!linkedHashMap2.containsKey(Long.valueOf(jLongValue4))) {
                    it3 = list4.iterator();
                    do {
                        if (it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (((ril0) next).f30549a != jLongValue4);
                    ril0Var = (ril0) next;
                    if (ril0Var != null || (str5 = ril0Var.b) == null) {
                        str5 = "";
                    }
                    linkedHashMap2.put(Long.valueOf(jLongValue4), str5);
                }
                lValueOf = Long.valueOf(jLongValue4);
                arrayList5 = map.get(lValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    map.put(lValueOf, arrayList5);
                }
                ((List) arrayList5).add(odbVar);
            }
        }
        arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            arrayList3 = map.get(entry.getKey());
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
            }
            List list8 = (List) arrayList3;
            list8.add(0, new ndb(((Number) entry.getKey()).longValue(), (String) entry.getValue()));
            ((odb) CollectionsKt.d0(list8)).getClass();
            w3d.u(arrayList2, (Iterable) arrayList3);
        }
        return arrayList2;
        dx5 dx5Var2 = (dx5) objA;
        sjl0 sjl0Var = (sjl0) this.d;
        ombVar.i = list2;
        ombVar.j = dx5Var2;
        ombVar.k = j3;
        ombVar.l = j4;
        ombVar.m = i2;
        ombVar.p = 2;
        Serializable serializableD = sjl0Var.d(ombVar);
        if (serializableD != wneVar) {
            objA = serializableD;
            dx5Var = dx5Var2;
            list3 = list2;
            list4 = (List) objA;
            dx5Var.getClass();
            list4.getClass();
            list3.getClass();
            iterable = ((xmb) dx5Var.a()).b;
            if (iterable == null) {
                iterable = iun.f15405a;
            }
            linkedHashMap = new LinkedHashMap();
            while (r0.hasNext()) {
                l8 = ((smb) obj).d;
                arrayList6 = linkedHashMap.get(l8);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap.put(l8, arrayList6);
                }
                ((List) arrayList6).add(obj);
            }
            arrayList = new ArrayList();
            it = list3.iterator();
            while (it.hasNext()) {
                list6 = (List) linkedHashMap.get(Long.valueOf(((Number) it.next()).longValue()));
                if (list6 != null) {
                    arrayList.add(list6);
                }
            }
            ArrayList<smb> arrayListR2 = r3d.r(arrayList);
            linkedHashMap2 = new LinkedHashMap();
            map = new HashMap();
            while (r0.hasNext()) {
                str = smbVar.b;
                str2 = smbVar.c;
                l = smbVar.f32436a;
                list5 = smbVar.g;
                l2 = smbVar.d;
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (list5 != null) {
                    arrayList4 = new ArrayList();
                    while (r16.hasNext()) {
                        l5 = wmbVar2.f39397a;
                        if (l5 != null) {
                            jLongValue7 = l5.longValue();
                            str8 = wmbVar2.b;
                            if (str8 == null) {
                                mdbVar = null;
                            } else {
                                long jLongValue11 = l6.longValue();
                                l7 = wmbVar2.e;
                                if (l7 != null) {
                                    jLongValue8 = l7.longValue();
                                } else {
                                    jLongValue8 = 0;
                                }
                                str9 = wmbVar2.c;
                                if (str9 == null) {
                                    str10 = "";
                                } else {
                                    str10 = str9;
                                }
                                num2 = wmbVar2.f;
                                if (num2 != null) {
                                    str11 = "0";
                                } else {
                                    str11 = "0";
                                }
                                mdbVar = new mdb(jLongValue7, str8, jLongValue11, jLongValue8, str3, str10, str11, false);
                            }
                        } else {
                            mdbVar = null;
                        }
                        if (mdbVar != null) {
                            arrayList4.add(mdbVar);
                        }
                    }
                } else {
                    arrayList4 = iun.f15405a;
                }
                r20 = arrayList4;
                if (r20.isEmpty()) {
                    if (l != null) {
                        jLongValue5 = l.longValue();
                        if (str == null) {
                            ldbVar = null;
                        } else {
                            long jLongValue12 = l2.longValue();
                            l4 = smbVar.e;
                            if (l4 != null) {
                                jLongValue6 = l4.longValue();
                            } else {
                                jLongValue6 = 0;
                            }
                            if (str2 == null) {
                                str6 = "";
                            } else {
                                str6 = str2;
                            }
                            num = smbVar.f;
                            if (num != null) {
                                str7 = "0";
                            } else {
                                str7 = "0";
                            }
                            ldbVar = new ldb(jLongValue5, str, jLongValue12, jLongValue6, str6, str7);
                        }
                    } else {
                        ldbVar = null;
                    }
                    if (ldbVar == null) {
                        pair = null;
                    } else {
                        pair = new Pair(ldbVar, l2);
                    }
                } else {
                    ((mdb) CollectionsKt.d0(r20)).h = true;
                    linkedHashSet = new LinkedHashSet();
                    it2 = r20.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(Long.valueOf(((mdb) it2.next()).f21587a));
                    }
                    if (l != null) {
                        jLongValue = l.longValue();
                        if (list5 != null) {
                            jLongValue2 = 0;
                        } else {
                            jLongValue2 = 0;
                        }
                        if (l2 != null) {
                            jLongValue3 = l2.longValue();
                            if (str == null) {
                                kdbVar = null;
                            } else {
                                if (str2 == null) {
                                    str4 = "";
                                } else {
                                    str4 = str2;
                                }
                                kdbVar = new kdb(jLongValue, str, jLongValue3, jLongValue2, str4, String.valueOf(linkedHashSet.size()), r20, false);
                            }
                        } else {
                            kdbVar = null;
                        }
                    } else {
                        kdbVar = null;
                    }
                    if (kdbVar == null) {
                        pair = null;
                    } else {
                        pair = new Pair(kdbVar, l2);
                    }
                }
                if (pair != null) {
                    odb odbVar2 = (odb) pair.f46059a;
                    jLongValue4 = ((Number) pair.b).longValue();
                    if (!linkedHashMap2.containsKey(Long.valueOf(jLongValue4))) {
                        it3 = list4.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((ril0) next).f30549a != jLongValue4);
                        ril0Var = (ril0) next;
                        if (ril0Var != null) {
                            str5 = "";
                        } else {
                            str5 = "";
                        }
                        linkedHashMap2.put(Long.valueOf(jLongValue4), str5);
                    }
                    lValueOf = Long.valueOf(jLongValue4);
                    arrayList5 = map.get(lValueOf);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        map.put(lValueOf, arrayList5);
                    }
                    ((List) arrayList5).add(odbVar2);
                }
            }
            arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                arrayList3 = map.get(entry.getKey());
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                List list9 = (List) arrayList3;
                list9.add(0, new ndb(((Number) entry.getKey()).longValue(), (String) entry.getValue()));
                ((odb) CollectionsKt.d0(list9)).getClass();
                w3d.u(arrayList2, (Iterable) arrayList3);
            }
            return arrayList2;
        }
        return wneVar;
    }

    public long q() {
        guj gujVar = (guj) this.d;
        if (gujVar != null) {
            return gujVar.d;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r8 == r10) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(int r9, a.zje r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oif0.r(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public void s(jbj jbjVar, Uri uri, Map map, long j, long j2, y3c0 y3c0Var) throws net0 {
        fuo fuoVar;
        guj gujVar = new guj(jbjVar, j, j2);
        this.d = gujVar;
        if (((fuo) this.c) != null) {
            return;
        }
        fuo[] fuoVarArrD = ((iuo) this.b).d(uri, map);
        u3x u3xVarM = b4x.m(fuoVarArrD.length);
        boolean z = true;
        byte b = 0;
        if (fuoVarArrD.length == 1) {
            fuoVar = fuoVarArrD[0];
            this.c = fuoVar;
        } else {
            for (fuo fuoVar2 : fuoVarArrD) {
                try {
                    if (fuoVar2.c(gujVar)) {
                        this.c = fuoVar2;
                        gujVar.f = 0;
                        break;
                    }
                    u3xVarM.c(fuoVar2.f());
                    boolean z2 = ((fuo) this.c) != null || gujVar.d == j;
                    x0x.K(z2);
                    gujVar.f = 0;
                } catch (EOFException unused) {
                    if (((fuo) this.c) != null || gujVar.d == j) {
                    }
                } catch (Throwable th) {
                    if (((fuo) this.c) == null && gujVar.d != j) {
                        z = false;
                    }
                    x0x.K(z);
                    gujVar.f = 0;
                    throw th;
                }
                x0x.K(z2);
                gujVar.f = 0;
            }
            fuo fuoVar3 = (fuo) this.c;
            if (fuoVar3 == null) {
                String str = "None of the available extractors (" + new pfw(", ").b(x0x.j0(b4x.q(fuoVarArrD), new sd9(b))) + ") could read the stream.";
                uri.getClass();
                throw new net0(str, u3xVarM.g());
            }
            fuoVar = fuoVar3;
        }
        fuoVar.e(y3c0Var);
    }

    public int t() {
        es esVar = (es) this.b;
        vqc vqcVar = (vqc) this.d;
        q4f q4fVarE = vqcVar.e();
        if (yzt.f43531a[q4fVarE.ordinal()] != 1) {
            return q4fVarE.a();
        }
        int i = ((en7) ((aln) ((bwl) this.c).f3330a).b.getValue()).c;
        int size = esVar.i().size();
        if (2 > i || i >= size) {
            i = 2;
        }
        return vqd.a(i, 100, vqcVar.e().a() * HwBuildEx.VersionCodes.CUR_DEVELOPMENT, esVar.i().size());
    }

    public String toString() {
        switch (this.f25308a) {
            case 17:
                j();
                StringBuilder sb = (StringBuilder) this.c;
                return sb == null ? "" : sb.toString();
            default:
                return super.toString();
        }
    }

    public long u() {
        Long l = (Long) ((b8h0) ((hru) this.c).f13549a).f2157a.b.getValue();
        if (l != null) {
            return l.longValue();
        }
        uvm0 uvm0Var = (uvm0) CollectionsKt.firstOrNull(((ntt) this.b).a());
        long j = uvm0Var != null ? uvm0Var.f36357a : -1L;
        ((b8h0) ((eyg0) this.d).b).f2157a.b.o(null, Long.valueOf(j));
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7 A[EDGE_INSN: B:69:0x00e7->B:48:0x00e7 BREAK  A[LOOP:2: B:40:0x00c0->B:47:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[LOOP:3: B:52:0x00f2->B:75:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable v(zje zjeVar) {
        mmu mmuVar;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        boolean z2;
        Iterator it2;
        rq60 rq60Var;
        if (zjeVar instanceof mmu) {
            mmuVar = (mmu) zjeVar;
            int i = mmuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                mmuVar.l = i - Integer.MIN_VALUE;
            } else {
                mmuVar = new mmu(this, zjeVar);
            }
        } else {
            mmuVar = new mmu(this, zjeVar);
        }
        Object objA = mmuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = mmuVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            scu scuVar = (scu) this.d;
            long jA = s470.LUCKY_WHEEL.a();
            String strA = ((ntu) this.c).a();
            mmuVar.l = 1;
            objA = scuVar.a(jA, mmuVar, strA);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = mmuVar.i;
            z1x.P(objA);
        }
        arrayList = new ArrayList();
        for (Object obj : (Iterable) objA) {
            if (((tq60) obj).b == d270.CASHBACK) {
                arrayList.add(obj);
            }
        }
        arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            tq60 tq60Var = (tq60) obj2;
            if (!z || tq60Var.b != d270.LUCKY_WHEEL) {
                arrayList2.add(obj2);
            }
        }
        arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        it = arrayList2.iterator();
        while (true) {
            z2 = false;
            if (it.hasNext()) {
                break;
            }
            tq60 tq60Var2 = (tq60) it.next();
            d270 d270Var = tq60Var2.b;
            rq60Var = tq60Var2.f34367a;
            if (!rq60Var.d && d270Var == d270.LUCKY_WHEEL) {
                z2 = true;
            }
            arrayList3.add(new q170(d270Var, z2, rq60Var.b, rq60Var.c));
        }
        if (arrayList3.isEmpty()) {
            return arrayList3;
        }
        it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (((q170) it2.next()).f27939a == d270.BONUS) {
                return CollectionsKt.r0(arrayList3, new q170(d270.BONUS_INFO, false, "", ""));
            }
        }
        return arrayList3;
        boolean z3 = ((pbv) objA).q;
        ipu ipuVar = (ipu) this.b;
        mmuVar.i = z3;
        mmuVar.l = 2;
        Object objA2 = ipuVar.a(mmuVar);
        if (objA2 != wneVar) {
            objA = objA2;
            z = z3;
            arrayList = new ArrayList();
            while (r9.hasNext()) {
                if (((tq60) obj).b == d270.CASHBACK) {
                    arrayList.add(obj);
                }
            }
            arrayList2 = new ArrayList();
            while (r0.hasNext()) {
                tq60 tq60Var3 = (tq60) obj2;
                if (!z) {
                }
                arrayList2.add(obj2);
            }
            arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            it = arrayList2.iterator();
            while (true) {
                z2 = false;
                if (it.hasNext()) {
                    break;
                    break;
                }
                tq60 tq60Var4 = (tq60) it.next();
                d270 d270Var2 = tq60Var4.b;
                rq60Var = tq60Var4.f34367a;
                if (!rq60Var.d) {
                }
                arrayList3.add(new q170(d270Var2, z2, rq60Var.b, rq60Var.c));
            }
            if (arrayList3.isEmpty()) {
                return arrayList3;
            }
            it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((q170) it2.next()).f27939a == d270.BONUS) {
                    return CollectionsKt.r0(arrayList3, new q170(d270.BONUS_INFO, false, "", ""));
                }
            }
            return arrayList3;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(long j, zje zjeVar) {
        vtt vttVar;
        String str;
        if (zjeVar instanceof vtt) {
            vttVar = (vtt) zjeVar;
            int i = vttVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vttVar.l = i - Integer.MIN_VALUE;
            } else {
                vttVar = new vtt(this, zjeVar);
            }
        } else {
            vttVar = new vtt(this, zjeVar);
        }
        Object objX = vttVar.j;
        wne wneVar = wne.f39444a;
        int i2 = vttVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objX);
            fhj fhjVar = (fhj) this.b;
            String strA = ((ntu) this.c).a();
            ((iqt) this.d).f15225a.a();
            vttVar.i = j;
            vttVar.l = 1;
            objX = fhjVar.x(strA, vttVar);
            if (objX == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = vttVar.i;
            z1x.P(objX);
        }
        for (Object obj2 : (Iterable) objX) {
            if (((pe8) obj2).f26839a == j) {
                obj = obj2;
                break;
            }
        }
        pe8 pe8Var = (pe8) obj;
        return (pe8Var == null || (str = pe8Var.b) == null) ? "" : str;
    }

    public Object x(long j, boolean z, bnn0 bnn0Var) throws Throwable {
        if (!((m1e) this.d).c()) {
            return Unit.f46060a;
        }
        yje yjeVar = null;
        Object objV = ipm0.v(new nif0(this, j, yjeVar, (byte) 0), new nif0(this, j, yjeVar, (byte) 1), new olb(z, (Object) this, yjeVar, (byte) 2), new zt(this, j, (byte) 8), new tr((Object) this, j, yjeVar, (byte) 13), oif0.class, bnn0Var);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(mi0 mi0Var, zje zjeVar) throws g2 {
        fhu fhuVar;
        Object g0g0Var;
        String str;
        Object objC;
        Throwable th;
        Object g0g0Var2;
        if (zjeVar instanceof fhu) {
            fhuVar = (fhu) zjeVar;
            int i = fhuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fhuVar.m = i - Integer.MIN_VALUE;
            } else {
                fhuVar = new fhu(this, zjeVar);
            }
        } else {
            fhuVar = new fhu(this, zjeVar);
        }
        Object obj = fhuVar.k;
        wne wneVar = wne.f39444a;
        int i2 = fhuVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = String.valueOf(((x1u) this.d).a());
            } catch (Throwable th2) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th2);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = null;
            }
            str = (String) g0g0Var;
            try {
                x0u x0uVar = (x0u) this.c;
                fhuVar.i = mi0Var;
                fhuVar.j = str;
                fhuVar.m = 1;
                objC = x0uVar.c(fhuVar);
                if (objC == wneVar) {
                }
            } catch (Throwable th3) {
                th = th3;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var2 = new g0g0(th);
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str2 = fhuVar.j;
        mi0 mi0Var2 = fhuVar.i;
        try {
            z1x.P(obj);
            str = str2;
            mi0Var = mi0Var2;
            objC = obj;
        } catch (Throwable th4) {
            str = str2;
            mi0Var = mi0Var2;
            th = th4;
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var2 = new g0g0(th);
        }
        g0g0Var2 = new Integer(((Number) objC).intValue());
        e0g0 e0g0Var5 = j0g0.b;
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = null;
        }
        Integer num = (Integer) g0g0Var2;
        e1u e1uVar = (e1u) this.b;
        if (str == null) {
            str = "";
        }
        fhuVar.i = null;
        fhuVar.j = null;
        fhuVar.m = 2;
        Serializable serializableV = ((mii0) e1uVar.b).v(mi0Var, str, num, fhuVar);
        return serializableV == wneVar ? wneVar : serializableV;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r10 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0167, code lost:
    
        if (r9.e(r0) == r4) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(a.zje r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oif0.z(a.zje):java.lang.Object");
    }

    public /* synthetic */ oif0(Object obj, Object obj2, Object obj3, byte b) {
        this.f25308a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public oif0(m1e m1eVar, nvu nvuVar, y3v y3vVar) {
        this.f25308a = (byte) 0;
        m1eVar.getClass();
        this.b = y3vVar;
        this.c = nvuVar;
        this.d = m1eVar;
    }

    public oif0(dn0 dn0Var, xoc xocVar, j1q0 j1q0Var) {
        this.f25308a = (byte) 3;
        j1q0Var.getClass();
        this.b = dn0Var;
        this.c = xocVar;
        this.d = j1q0Var;
    }

    public oif0(ino inoVar, goo gooVar, kym0 kym0Var) {
        this.f25308a = (byte) 21;
        inoVar.getClass();
        gooVar.getClass();
        kym0Var.getClass();
        this.b = inoVar;
        this.c = gooVar;
        this.d = kym0Var;
    }

    public oif0(clc clcVar, knf0 knf0Var, mne mneVar) {
        this.f25308a = (byte) 13;
        knf0Var.getClass();
        this.b = clcVar;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public oif0(lye lyeVar, m0f m0fVar, ave aveVar) {
        this.f25308a = (byte) 5;
        lyeVar.getClass();
        m0fVar.getClass();
        aveVar.getClass();
        this.b = lyeVar;
        this.c = m0fVar;
        this.d = aveVar;
    }

    public oif0(btt0 btt0Var, r7v r7vVar, knf0 knf0Var) {
        this.f25308a = (byte) 6;
        btt0Var.getClass();
        knf0Var.getClass();
        this.b = btt0Var;
        this.c = r7vVar;
        this.d = knf0Var;
    }

    public oif0(do20 do20Var, nmb nmbVar, knf0 knf0Var, sjl0 sjl0Var) {
        this.f25308a = (byte) 9;
        nmbVar.getClass();
        knf0Var.getClass();
        sjl0Var.getClass();
        this.b = do20Var;
        this.c = knf0Var;
        this.d = sjl0Var;
    }

    public oif0(int i) {
        this.f25308a = (byte) 17;
        this.d = StandardCharsets.ISO_8859_1;
        this.b = new StringBuilder(i);
    }

    public oif0(p68 p68Var) {
        this.f25308a = (byte) 20;
        eld0 eld0Var = new eld0((byte) 2);
        eld0Var.b = 0;
        eld0Var.c = 1;
        this.c = eld0Var;
        this.d = new StringBuilder();
        this.b = p68Var;
    }

    public oif0(iuo iuoVar) {
        this.f25308a = (byte) 7;
        this.b = iuoVar;
    }

    public oif0(p12 p12Var, ilp0 ilp0Var, i1w0 i1w0Var) {
        this.f25308a = (byte) 14;
        this.b = i1w0Var;
        this.c = ilp0Var;
        this.d = new tii(this, (byte) 16);
    }

    public oif0(v6j0 v6j0Var, rbq0 rbq0Var, wyu wyuVar) {
        this.f25308a = (byte) 15;
        this.b = rbq0Var;
        this.c = v6j0Var;
        this.d = wyuVar;
    }

    public oif0(l44 l44Var) {
        this.f25308a = (byte) 4;
        this.d = l44Var;
        Handler handlerN = vtt0.n(null);
        this.b = handlerN;
        k44 k44Var = new k44(this);
        this.c = k44Var;
        l44Var.f19386a.registerStreamEventCallback(new j44(handlerN, (byte) 0), k44Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.tlo, java.lang.Object] */
    public oif0(ulo uloVar, Context context) {
        this.f25308a = (byte) 18;
        this.d = uloVar;
        this.b = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: a.tlo
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                ulo uloVar2 = (ulo) this.f34155a.d;
                if (uloVar2.h0) {
                    return;
                }
                uloVar2.M(1, 19, Integer.valueOf(i));
            }
        };
        this.c = r0;
        context.registerDeviceIdChangeListener(new ex2(uloVar.v.a(uloVar.t, null), (byte) 1), r0);
    }
}
