package a;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class lhf0 implements ns2, zp2, nae0, n1x, zf60 {
    public static final ejx e = new ejx(0, -9223372036854775807L);
    public static final ejx f = new ejx(2, -9223372036854775807L);
    public static final ejx g = new ejx(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20053a;
    public final Object b;
    public Object c;
    public Object d;

    public lhf0(vwb0 vwb0Var, vby vbyVar) {
        Object g0g0Var;
        Object obj;
        this.f20053a = (byte) 18;
        vwb0Var.getClass();
        vbyVar.getClass();
        this.b = vwb0Var;
        this.c = vbyVar;
        String strC = vwb0Var.c("FAVORITE_GAMES_INFO_KEY", "");
        if (StringsKt.W(strC)) {
            obj = iun.f15405a;
        } else {
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = (List) vbyVar.b(new zw3(i8p.Companion.serializer(), (byte) 0), strC);
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            obj = (List) (g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var);
        }
        this.d = q7m0.a(obj);
    }

    public static Object D(dqk0 dqk0Var) {
        if (dqk0Var != null) {
            if (dqk0Var instanceof bqk0) {
                return null;
            }
            if (dqk0Var instanceof cqk0) {
                return ((cqk0) dqk0Var).f4798a;
            }
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r8.O(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r9 = r10;
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r8.c(r2, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object H(a.lhf0 r8, boolean r9, a.zje r10) {
        /*
            boolean r0 = r10 instanceof a.i06
            if (r0 == 0) goto L13
            r0 = r10
            a.i06 r0 = (a.i06) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.i06 r0 = new a.i06
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            goto L31
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r6
        L31:
            java.util.List r8 = r0.k
            a.fm80 r9 = r0.j
            a.z1x.P(r10)
            goto La9
        L3a:
            boolean r9 = r0.l
            a.fm80 r8 = r0.j
            a.lhf0 r2 = r0.i
            a.z1x.P(r10)
            r7 = r10
            r10 = r8
            r8 = r2
            r2 = r7
            goto L78
        L48:
            a.z1x.P(r10)
            java.lang.Object r10 = r8.b
            a.cyu r10 = (a.cyu) r10
            java.lang.Object r10 = r10.c
            a.p7m0 r10 = (a.p7m0) r10
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r8.c
            a.gm80 r2 = (a.gm80) r2
            if (r9 == 0) goto L61
            a.iun r10 = a.iun.f15405a
        L61:
            a.fm80 r10 = r2.b(r10)
            java.lang.Object r2 = r8.d
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.i = r8
            r0.j = r10
            r0.l = r9
            r0.o = r5
            java.lang.Object r2 = r2.invoke(r10, r0)
            if (r2 != r1) goto L78
            goto La8
        L78:
            java.util.List r2 = (java.util.List) r2
            if (r9 == 0) goto L94
            java.lang.Object r8 = r8.b
            a.cyu r8 = (a.cyu) r8
            r0.i = r6
            r0.j = r10
            r0.k = r2
            r0.l = r9
            r0.o = r4
            java.lang.Object r8 = r8.O(r2, r0)
            if (r8 != r1) goto L91
            goto La8
        L91:
            r9 = r10
            r8 = r2
            goto La9
        L94:
            java.lang.Object r8 = r8.b
            a.cyu r8 = (a.cyu) r8
            r0.i = r6
            r0.j = r10
            r0.k = r2
            r0.l = r9
            r0.o = r3
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L91
        La8:
            return r1
        La9:
            int r8 = r8.size()
            int r9 = r9.a()
            if (r8 >= r9) goto Lb4
            goto Lb5
        Lb4:
            r5 = 0
        Lb5:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lhf0.H(a.lhf0, boolean, a.zje):java.lang.Object");
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        v0t0[] v0t0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (v0t0VarArr = (v0t0[]) editable.getSpans(selectionStart, selectionEnd, v0t0.class)) != null && v0t0VarArr.length > 0) {
                for (v0t0 v0t0Var : v0t0VarArr) {
                    int spanStart = editable.getSpanStart(v0t0Var);
                    int spanEnd = editable.getSpanEnd(v0t0Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int c(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        Iterator it = new IntRange(2, i, 1).iterator();
        long jNextInt = 1;
        while (((kkx) it).c) {
            jNextInt *= (long) ((bkx) it).nextInt();
        }
        return (int) jNextInt;
    }

    public static LinkedHashMap o(int i, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<hf6> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((hf6) obj).e) {
                arrayList.add(obj);
            }
        }
        for (hf6 hf6Var : arrayList) {
            Integer numValueOf = Integer.valueOf(hf6Var.f12958a);
            int i2 = hf6Var.f12958a;
            List list2 = hf6Var.c;
            linkedHashMap.put(numValueOf, Integer.valueOf(i2 == i ? list2.size() - 1 : list2.size()));
        }
        return linkedHashMap;
    }

    public static boolean q(xsn xsnVar, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                v0t0[] v0t0VarArr = (v0t0[]) editable.getSpans(selectionStart, iMin, v0t0.class);
                if (v0t0VarArr != null && v0t0VarArr.length > 0) {
                    for (v0t0 v0t0Var : v0t0VarArr) {
                        int spanStart = editable.getSpanStart(v0t0Var);
                        int spanEnd = editable.getSpanEnd(v0t0Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    xsnVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    xsnVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public List A() {
        Object next;
        List listA0 = CollectionsKt.A0(((ert) this.b).a().d, new e3l((byte) 29));
        if (((j9c) this.c).a() != q4f.g) {
            return listA0;
        }
        int iA = ((hst) this.d).a();
        IntRange intRangeO = l1e0.o(2, iA);
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            int iC = c(iA) / (c(iA - iNextInt) * c(iNextInt));
            Iterator it2 = listA0.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((en7) next).c != iNextInt);
            en7 en7Var = (en7) next;
            arrayList.add(new en7(iA, iC, iNextInt, en7Var != null ? en7Var.d : 0.0d, false));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(zje zjeVar) {
        xj3 xj3Var;
        if (zjeVar instanceof xj3) {
            xj3Var = (xj3) zjeVar;
            int i = xj3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj3Var.k = i - Integer.MIN_VALUE;
            } else {
                xj3Var = new xj3(this, zjeVar);
            }
        } else {
            xj3Var = new xj3(this, zjeVar);
        }
        Object objW0 = xj3Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xj3Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            xj3Var.k = 1;
            objW0 = sj3.w0(xj3Var, ((uj3) this.d).f35759a, new pd(2, yjeVar, (byte) 13), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        return Boolean.valueOf(((Number) objW0).longValue() == 0);
    }

    public boolean C() {
        return ((jq00) this.c) != null;
    }

    public Object E(CharSequence charSequence, int i, int i2, int i3, boolean z, btn btnVar) {
        int i4;
        char c;
        dtn dtnVar = new dtn((td40) ((dgu) this.c).c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zA = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zA) {
                    td40 td40Var = (td40) dtnVar.c.f33748a.get(iCodePointAt);
                    if (dtnVar.f6664a == 2) {
                        if (td40Var != null) {
                            dtnVar.c = td40Var;
                            dtnVar.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                dtnVar.a();
                            } else if (iCodePointAt != 65039) {
                                td40 td40Var2 = dtnVar.c;
                                if (td40Var2.b != null) {
                                    if (dtnVar.f != 1) {
                                        dtnVar.d = td40Var2;
                                        dtnVar.a();
                                    } else if (dtnVar.b()) {
                                        dtnVar.d = dtnVar.c;
                                        dtnVar.a();
                                    } else {
                                        dtnVar.a();
                                    }
                                    c = 3;
                                } else {
                                    dtnVar.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (td40Var == null) {
                        dtnVar.a();
                        c = 1;
                    } else {
                        dtnVar.f6664a = (byte) 2;
                        dtnVar.c = td40Var;
                        dtnVar.f = 1;
                        c = 2;
                    }
                    dtnVar.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && r(charSequence, i4, iCharCount, dtnVar.d.b)) {
                            break;
                        }
                        zA = btnVar.a(charSequence, i4, iCharCount, dtnVar.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (dtnVar.f6664a == 2 && dtnVar.c.b != null && ((dtnVar.f > 1 || dtnVar.b()) && i5 < i3 && zA && (z || !r(charSequence, i4, iCharCount, dtnVar.c.b)))) {
            btnVar.a(charSequence, i4, iCharCount, dtnVar.c.b);
        }
        return btnVar.b();
    }

    public void F(lq00 lq00Var) {
        gff0 gff0Var = (gff0) this.b;
        jq00 jq00Var = (jq00) this.c;
        if (jq00Var != null) {
            jq00Var.a(true);
        }
        if (lq00Var != null) {
            gff0Var.execute(new mx2(lq00Var, (byte) 20));
        }
        gff0Var.b.accept(gff0Var.f11204a);
    }

    public void G(o52 o52Var) {
        a4a0 a4a0Var = (a4a0) ((HashMap) this.b).remove(o52Var);
        a4a0Var.getClass();
        wvj wvjVar = (wvj) ((xvj) this.d).n.get(a4a0Var);
        if (wvjVar != null) {
            synchronized (wvjVar) {
                wvjVar.d--;
            }
        }
    }

    public void I(Fragment fragment, iiy iiyVar, List list) {
        iiyVar.getClass();
        list.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        String str = (String) this.b;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list);
        this.d = arrayList;
        bundle.putParcelableArrayList(str, arrayList);
    }

    public void J(kq00 kq00Var, iq00 iq00Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.d = null;
        jq00 jq00Var = new jq00(this, looperMyLooper, kq00Var, iq00Var, i, SystemClock.elapsedRealtime());
        x0x.K(((jq00) this.c) == null);
        this.c = jq00Var;
        jq00Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable K(String str, zje zjeVar) {
        yj3 yj3Var;
        if (zjeVar instanceof yj3) {
            yj3Var = (yj3) zjeVar;
            int i = yj3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yj3Var.l = i - Integer.MIN_VALUE;
            } else {
                yj3Var = new yj3(this, zjeVar);
            }
        } else {
            yj3Var = new yj3(this, zjeVar);
        }
        Object objW0 = yj3Var.j;
        wne wneVar = wne.f39444a;
        int i2 = yj3Var.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            uj3 uj3Var = (uj3) this.d;
            yj3Var.i = str;
            yj3Var.l = 1;
            objW0 = sj3.w0(yj3Var, uj3Var.f35759a, new tj3(str, yjeVar, (byte) 0), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = yj3Var.i;
            z1x.P(objW0);
        }
        Iterable<pj3> iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (pj3 pj3Var : iterable) {
            arrayList.add(new qj3(str, pj3Var.f27069a, pj3Var.b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f A[LOOP:0: B:35:0x0099->B:37:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7 A[LOOP:1: B:39:0x00c1->B:41:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable L(String str, String str2, zje zjeVar) {
        zj3 zj3Var;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        Iterator it;
        if (zjeVar instanceof zj3) {
            zj3Var = (zj3) zjeVar;
            int i = zj3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                zj3Var.m = i - Integer.MIN_VALUE;
            } else {
                zj3Var = new zj3(this, zjeVar);
            }
        } else {
            zj3Var = new zj3(this, zjeVar);
        }
        Object objK = zj3Var.k;
        wne wneVar = wne.f39444a;
        int i2 = zj3Var.m;
        if (i2 == 0) {
            z1x.P(objK);
            zj3Var.i = str;
            zj3Var.m = 1;
            objK = K(str2, zj3Var);
            if (objK != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            str = zj3Var.i;
            z1x.P(objK);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = zj3Var.j;
            z1x.P(objK);
        }
        Iterable iterable = (Iterable) objK;
        int iA = wp20.a(r3d.q(iterable, 10));
        linkedHashMap2 = new LinkedHashMap(iA >= 16 ? iA : 16);
        for (Object obj : iterable) {
            linkedHashMap2.put(((qj3) obj).b, obj);
        }
        List listQ = zp20.q(xp20.j(linkedHashMap, linkedHashMap2));
        arrayList = new ArrayList(r3d.q(listQ, 10));
        it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add((qj3) ((Pair) it.next()).b);
        }
        return arrayList;
        Iterable iterable2 = (Iterable) objK;
        int iA2 = wp20.a(r3d.q(iterable2, 10));
        if (iA2 < 16) {
            iA2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA2);
        for (Object obj2 : iterable2) {
            linkedHashMap3.put(((qj3) obj2).b, obj2);
        }
        zj3Var.i = null;
        zj3Var.j = linkedHashMap3;
        zj3Var.m = 2;
        objK = K(str, zj3Var);
        if (objK != wneVar) {
            linkedHashMap = linkedHashMap3;
            Iterable iterable3 = (Iterable) objK;
            int iA3 = wp20.a(r3d.q(iterable3, 10));
            linkedHashMap2 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
            while (r10.hasNext()) {
                linkedHashMap2.put(((qj3) obj).b, obj);
            }
            List listQ2 = zp20.q(xp20.j(linkedHashMap, linkedHashMap2));
            arrayList = new ArrayList(r3d.q(listQ2, 10));
            it = listQ2.iterator();
            while (it.hasNext()) {
                arrayList.add((qj3) ((Pair) it.next()).b);
            }
            return arrayList;
        }
        return wneVar;
    }

    public void M(long j) {
        h97.x("sport_id", Long.valueOf(j), ((bn6) this.b).b, "bet_information_point_call");
        h97.r(j, ((je) this.d).f16351a, 3179L);
    }

    public void N(boolean z, long j) {
        ((s31) this.c).d(z, j);
        ((je) this.d).f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(z ? "off" : "on", (byte) 0)}), 3163L);
    }

    public void O(long j) {
        h97.x("sport_id", Long.valueOf(j), ((bn6) this.b).b, "bet_gameview_point_swap");
        h97.r(j, ((je) this.d).f16351a, 3177L);
    }

    public void P(String str) {
        ((bn6) this.b).q(str);
        ((je) this.d).r(str);
    }

    public void Q(List list) {
        list.getClass();
        vwb0 vwb0Var = (vwb0) this.b;
        vby vbyVar = (vby) this.c;
        vbyVar.getClass();
        vwb0Var.h("FAVORITE_GAMES_INFO_KEY", vbyVar.d(new zw3(i8p.Companion.serializer(), (byte) 0), list));
        p7m0 p7m0Var = (p7m0) this.d;
        p7m0Var.getClass();
        p7m0Var.o(null, list);
    }

    public void a() {
        jq00 jq00Var = (jq00) this.c;
        jq00Var.getClass();
        jq00Var.a(false);
    }

    @Override // a.ns2
    public void d(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|65|22|(1:25)|60) */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        r6 = r10;
        r10 = r11;
        r11 = r0;
        r0 = r2;
        r2 = r12;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if ((r12 instanceof a.zhi0) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r7.f != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (a.hic.C(r12) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        if (r10 > 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e9, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r10, "error (", "): ", r12));
        r0.j = r6;
        r0.i = r2;
        r0.k = r11;
        r0.l = r10;
        r0.o = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        if (a.qcc.O(3000, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0109, code lost:
    
        r10 = a.j0g0.b;
        r12 = new a.g0g0(r12);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0106 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable e(boolean r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lhf0.e(boolean, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable f(boolean z, zje zjeVar) {
        tf0 tf0Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof tf0) {
            tf0Var = (tf0) zjeVar;
            int i = tf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tf0Var.k = i - Integer.MIN_VALUE;
            } else {
                tf0Var = new tf0(this, zjeVar);
            }
        } else {
            tf0Var = new tf0(this, zjeVar);
        }
        Object objP = tf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = tf0Var.k;
        if (i2 == 0) {
            z1x.P(objP);
            khf0 khf0Var = (khf0) this.b;
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            tf0Var.k = 1;
            objP = khf0Var.p(iB, tf0Var, strC, z);
            if (objP == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objP);
        }
        wf0 wf0Var = (wf0) ((dx5) objP).a();
        xf0.T(wf0Var);
        return jar0.Y(wf0Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:70|25|(1:28)|60) */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        if (a.qcc.P(r11, r4) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        if (a.qcc.P(r11, r4) == r3) goto L60;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010d -> B:47:0x0104). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r19, a.zje r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lhf0.g(java.lang.String, a.zje):java.lang.Object");
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        Function1 function1 = (Function1) this.c;
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = ((ImageView) this.d).getContext().getResources();
        resources.getClass();
        function1.invoke(c3x.q(dywVar, resources));
    }

    @Override // a.zp2
    public void i(Bundle bundle) {
        synchronized (this.c) {
            try {
                rv00 rv00Var = rv00.s;
                rv00Var.D("Logging event _ae to Firebase Analytics with params " + bundle);
                this.d = new CountDownLatch(1);
                ((yqc) this.b).i(bundle);
                rv00Var.D("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.d).await(500L, TimeUnit.MILLISECONDS)) {
                        rv00Var.D("App exception callback received from Analytics listener.");
                    } else {
                        rv00Var.E("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, String str2, zje zjeVar) {
        vj3 vj3Var;
        if (zjeVar instanceof vj3) {
            vj3Var = (vj3) zjeVar;
            int i = vj3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj3Var.m = i - Integer.MIN_VALUE;
            } else {
                vj3Var = new vj3(this, zjeVar);
            }
        } else {
            vj3Var = new vj3(this, zjeVar);
        }
        Object objB = vj3Var.k;
        Object obj = wne.f39444a;
        int i2 = vj3Var.m;
        if (i2 == 0) {
            z1x.P(objB);
            vj3Var.i = str;
            vj3Var.j = str2;
            vj3Var.m = 1;
            objB = B(vj3Var);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objB);
                return objB;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = vj3Var.j;
        str = vj3Var.i;
        z1x.P(objB);
        if (((Boolean) objB).booleanValue()) {
            return iun.f15405a;
        }
        vj3Var.i = null;
        vj3Var.j = null;
        vj3Var.m = 2;
        Object objL = L(str, str2, vj3Var);
        return objL == obj ? obj : objL;
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ((Function1) this.b).invoke(r1oVar.c);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        View view2 = (View) this.b;
        view2.onApplyWindowInsets(xiv0Var.g());
        stl stlVar = (stl) this.c;
        View view3 = (View) this.d;
        view3.post(new pb90(view3, stlVar, xiv0Var, view2, (byte) 4));
        return xiv0.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum m(int i, zje zjeVar) {
        m4a m4aVar;
        int i2;
        boolean z;
        if (zjeVar instanceof m4a) {
            m4aVar = (m4a) zjeVar;
            int i3 = m4aVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m4aVar.l = i3 - Integer.MIN_VALUE;
            } else {
                m4aVar = new m4a(this, zjeVar);
            }
        } else {
            m4aVar = new m4a(this, zjeVar);
        }
        Object objD = m4aVar.j;
        wne wneVar = wne.f39444a;
        int i4 = m4aVar.l;
        if (i4 == 0) {
            z1x.P(objD);
            LinkedHashMap linkedHashMapO = o(i, ((oif0) this.d).n());
            if (linkedHashMapO.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = linkedHashMapO.entrySet().iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > 0) {
                        i2++;
                    }
                }
            }
            boolean z2 = i2 >= 2;
            chf0 chf0Var = (chf0) this.c;
            m4aVar.i = z2;
            m4aVar.l = 1;
            objD = chf0Var.D(m4aVar);
            if (objD == wneVar) {
                return wneVar;
            }
            z = z2;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = m4aVar.i;
            z1x.P(objD);
        }
        boolean z3 = ((Number) objD).longValue() > 3;
        if (z) {
            return !z3 ? u4k.c : u4k.f35053a;
        }
        return u4k.d;
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public List n(Fragment fragment, iiy iiyVar) {
        Object g0g0Var;
        fragment.getClass();
        iiyVar.getClass();
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = null;
        try {
            e0g0 e0g0Var = j0g0.b;
            Bundle bundle = fragment.g;
            g0g0Var = bundle != null ? bundle.getParcelableArrayList((String) this.b) : null;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        ArrayList arrayList3 = (ArrayList) g0g0Var;
        if (arrayList3 != null) {
            this.d = arrayList3;
            arrayList2 = arrayList3;
        }
        return arrayList2 != null ? arrayList2 : (List) this.c;
    }

    public boolean r(CharSequence charSequence, int i, int i2, u0t0 u0t0Var) {
        if ((u0t0Var.c & 3) == 0) {
            muj mujVar = (muj) this.d;
            nd40 nd40VarB = u0t0Var.b();
            int iA = nd40VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) nd40VarB.d).getShort(iA + nd40VarB.f15098a);
            }
            mujVar.getClass();
            ThreadLocal threadLocal = muj.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = mujVar.f22415a.hasGlyph(sb.toString());
            int i3 = u0t0Var.c & 4;
            u0t0Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (u0t0Var.c & 3) == 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r13 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.util.List r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lhf0.s(java.util.List, a.zje):java.lang.Object");
    }

    public jyb t(int i, int i2, bop0 bop0Var, boolean z) {
        Object next;
        d9a0 d9a0Var;
        byte b = bop0Var.f2946a;
        f8u f8uVar = (f8u) this.c;
        Iterator it = ((gs6) ((gdu) this.b).f11119a.c).f11814a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((mms) next).f22057a != i);
        mms mmsVar = (mms) next;
        if (mmsVar != null) {
            d9a0Var = mmsVar.i;
            if (i2 != d9a0Var.b) {
                d9a0Var = mmsVar.j;
            }
        } else {
            d9a0Var = d9a0.g;
        }
        jyb jybVarL = gl5.l(d9a0Var, f8uVar.a(bop0.FIRST), f8uVar.a(bop0.SECOND), bop0Var, z);
        int i3 = d9a0Var.b;
        if (!jybVarL.equals(ujn.f)) {
            return jybVarL;
        }
        gs6 gs6Var = (gs6) ((nt) this.d).f24073a.c;
        ArrayList<mms> arrayList = gs6Var.f11814a;
        ArrayList arrayList2 = new ArrayList();
        for (mms mmsVar2 : arrayList) {
            d9a0 d9a0VarA = mmsVar2.i;
            if (d9a0VarA.b == i3) {
                d9a0VarA = d9a0.a(d9a0VarA, b);
            }
            d9a0 d9a0Var2 = d9a0VarA;
            d9a0 d9a0VarA2 = mmsVar2.j;
            if (d9a0VarA2.b == i3) {
                d9a0VarA2 = d9a0.a(d9a0VarA2, b);
            }
            d9a0 d9a0Var3 = d9a0VarA2;
            int i4 = mmsVar2.f22057a;
            long j = mmsVar2.b;
            String str = mmsVar2.c;
            String str2 = mmsVar2.d;
            int i5 = mmsVar2.e;
            String str3 = mmsVar2.f;
            String str4 = mmsVar2.g;
            String str5 = mmsVar2.h;
            jyb jybVar = jybVarL;
            byte b2 = b;
            long j2 = mmsVar2.k;
            List list = mmsVar2.l;
            List list2 = mmsVar2.m;
            list.getClass();
            list2.getClass();
            arrayList2.add(new mms(i4, j, str, str2, i5, str3, str4, str5, d9a0Var2, d9a0Var3, j2, list, list2));
            jybVarL = jybVar;
            b = b2;
        }
        jyb jybVar2 = jybVarL;
        ArrayList arrayList3 = gs6Var.f11814a;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        return jybVar2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02be  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:127:0x0306  */
    /* JADX WARN: Code duplicated, block: B:128:0x0309  */
    /* JADX WARN: Code duplicated, block: B:133:0x032a A[LOOP:6: B:131:0x0324->B:133:0x032a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x034d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0362 A[LOOP:7: B:138:0x0357->B:140:0x0362, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0394 A[LOOP:8: B:142:0x038e->B:144:0x0394, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[LOOP:3: B:110:0x02b8->B:157:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0245  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public Serializable u(zje zjeVar) {
        szt sztVar;
        List list;
        List list2;
        ArrayList<qkt> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        int iA;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        iil iilVar;
        ArrayList arrayList4;
        Iterator it3;
        Iterator it4;
        Object next;
        p52 p52Var;
        boolean z;
        qkt qktVar;
        Iterator it5;
        k8u k8uVar;
        int i;
        String strH;
        BigDecimal bigDecimal;
        byte b = this.f20053a;
        int i2 = 0;
        Object obj = this.b;
        int i3 = 1;
        int i4 = 10;
        int i5 = 2;
        switch (b) {
            case 22:
                if (zjeVar instanceof szt) {
                    sztVar = (szt) zjeVar;
                    int i6 = sztVar.l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        sztVar.l = i6 - Integer.MIN_VALUE;
                    } else {
                        sztVar = new szt(this, zjeVar);
                    }
                } else {
                    sztVar = new szt(this, zjeVar);
                }
                Object objD = sztVar.j;
                wne wneVar = wne.f39444a;
                int i7 = sztVar.l;
                if (i7 == 0) {
                    z1x.P(objD);
                    sztVar.l = 1;
                    objD = ((bot) obj).f2951a.d(sztVar);
                    if (objD != wneVar) {
                    }
                    return wneVar;
                }
                if (i7 == 1) {
                    z1x.P(objD);
                } else {
                    if (i7 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = sztVar.i;
                    z1x.P(objD);
                }
                list2 = (List) objD;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    qktVar = (qkt) obj2;
                    if (list2 != null || !list2.isEmpty()) {
                        it5 = list2.iterator();
                        while (it5.hasNext()) {
                            if (qktVar.f28902a == ((p52) it5.next()).f26383a) {
                                arrayList.add(obj2);
                            }
                            break;
                        }
                    }
                }
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (qkt qktVar2 : arrayList) {
                    it4 = list2.iterator();
                    do {
                        if (it4.hasNext()) {
                            next = it4.next();
                        } else {
                            next = null;
                        }
                        p52Var = (p52) next;
                        if (p52Var != null) {
                            z = p52Var.e;
                        } else {
                            z = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z, 191));
                    } while (qktVar2.f28902a != ((p52) next).f26383a);
                    p52Var = (p52) next;
                    if (p52Var != null) {
                        z = p52Var.e;
                    } else {
                        z = false;
                    }
                    arrayList2.add(qkt.a(qktVar2, null, z, 191));
                }
                arrayList3 = new ArrayList(r3d.q(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new Integer(((p52) it.next()).f26383a));
                }
                rx3 rx3VarS0 = CollectionsKt.S0(arrayList3);
                iA = wp20.a(r3d.q(rx3VarS0, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                it2 = rx3VarS0.iterator();
                while (true) {
                    iilVar = (iil) it2;
                    if (iilVar.b.hasNext()) {
                        List listA0 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, (byte) 2));
                        arrayList4 = new ArrayList(r3d.q(listA0, 10));
                        it3 = listA0.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(jeb.a0((qkt) it3.next(), ((ntu) this.d).a()));
                        }
                        return arrayList4;
                    }
                    IndexedValue indexedValue = (IndexedValue) iilVar.next();
                    linkedHashMap.put(indexedValue.b, new Integer(indexedValue.f46061a));
                }
                List list3 = (List) objD;
                kpt kptVar = (kpt) this.c;
                sztVar.i = list3;
                sztVar.l = 2;
                Object objB = kptVar.f18690a.b(sztVar);
                if (objB != wneVar) {
                    list = list3;
                    objD = objB;
                    list2 = (List) objD;
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        qktVar = (qkt) obj2;
                        if (list2 != null) {
                        }
                        it5 = list2.iterator();
                        while (it5.hasNext()) {
                            if (qktVar.f28902a == ((p52) it5.next()).f26383a) {
                                arrayList.add(obj2);
                            }
                            break;
                        }
                    }
                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    while (r3.hasNext()) {
                        it4 = list2.iterator();
                        do {
                            if (it4.hasNext()) {
                                next = it4.next();
                            } else {
                                next = null;
                            }
                            p52Var = (p52) next;
                            if (p52Var != null) {
                                z = p52Var.e;
                            } else {
                                z = false;
                            }
                            arrayList2.add(qkt.a(qktVar2, null, z, 191));
                        } while (qktVar2.f28902a != ((p52) next).f26383a);
                        p52Var = (p52) next;
                        if (p52Var != null) {
                            z = p52Var.e;
                        } else {
                            z = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z, 191));
                    }
                    arrayList3 = new ArrayList(r3d.q(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new Integer(((p52) it.next()).f26383a));
                    }
                    rx3 rx3VarS1 = CollectionsKt.S0(arrayList3);
                    iA = wp20.a(r3d.q(rx3VarS1, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    it2 = rx3VarS1.iterator();
                    while (true) {
                        iilVar = (iil) it2;
                        if (iilVar.b.hasNext()) {
                            List listA1 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, (byte) 2));
                            arrayList4 = new ArrayList(r3d.q(listA1, 10));
                            it3 = listA1.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(jeb.a0((qkt) it3.next(), ((ntu) this.d).a()));
                            }
                            return arrayList4;
                        }
                        IndexedValue indexedValue2 = (IndexedValue) iilVar.next();
                        linkedHashMap.put(indexedValue2.b, new Integer(indexedValue2.f46061a));
                    }
                }
                return wneVar;
            default:
                if (zjeVar instanceof k8u) {
                    k8uVar = (k8u) zjeVar;
                    int i8 = k8uVar.l;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        k8uVar.l = i8 - Integer.MIN_VALUE;
                    } else {
                        k8uVar = new k8u(this, zjeVar);
                    }
                } else {
                    k8uVar = new k8u(this, zjeVar);
                }
                Object obj3 = k8uVar.j;
                wne wneVar2 = wne.f39444a;
                int i9 = k8uVar.l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        i = k8uVar.i;
                        z1x.P(obj3);
                    } else {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                z1x.P(obj3);
                int id = ((k7u) this.d).f17841a.b().getId();
                k8uVar.i = id;
                k8uVar.l = 1;
                Serializable serializableS = ((g45) obj).S(k8uVar);
                if (serializableS == wneVar2) {
                    return wneVar2;
                }
                i = id;
                obj3 = serializableS;
                Iterable iterable = (Iterable) obj3;
                ArrayList arrayList5 = new ArrayList(r3d.q(iterable, 10));
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    pu20 pu20Var = (pu20) it6.next();
                    List<gao> list4 = pu20Var.e;
                    ArrayList arrayList6 = new ArrayList(r3d.q(list4, i4));
                    for (gao gaoVar : list4) {
                        wyt wytVar = (wyt) this.c;
                        double d = gaoVar.c;
                        p3u0 p3u0Var = p3u0.e;
                        wytVar.getClass();
                        if (d <= 0.0d || d == 1.0d) {
                            strH = "-";
                        } else {
                            BigDecimal bigDecimalSubtract = BigDecimal.valueOf(d).subtract(BigDecimal.ONE);
                            jvn.f17210a.getClass();
                            int iOrdinal = pek.k(i).ordinal();
                            if (iOrdinal == 0) {
                                long jRound = d >= 2.0d ? Math.round((d - 1.0d) * 100.0d) : new BigDecimal("-100").divide(bigDecimalSubtract, i2, RoundingMode.HALF_UP).longValue();
                                strH = h97.h(jRound, jRound > 0 ? "+" : "");
                            } else if (iOrdinal == i3) {
                                int iIntValue = bigDecimalSubtract.multiply(new BigDecimal(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)).setScale(i2, RoundingMode.HALF_UP).intValue();
                                int iA2 = wyt.a(iIntValue, HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                                strH = String.format(Locale.ENGLISH, "%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue / iA2), Integer.valueOf(HwBuildEx.VersionCodes.CUR_DEVELOPMENT / iA2)}, i5));
                            } else if (iOrdinal == i5) {
                                pn40 pn40Var = pn40.f27267a;
                                strH = pn40.c(d, p3u0Var);
                            } else if (iOrdinal == 3) {
                                strH = (bigDecimalSubtract.signum() == 0 ? new BigDecimal(BigInteger.ZERO, i2) : bigDecimalSubtract.stripTrailingZeros()).toPlainString();
                                strH.getClass();
                            } else if (iOrdinal == 4) {
                                double dDoubleValue = d < 2.0d ? new BigDecimal("-1").divide(bigDecimalSubtract, 6, RoundingMode.HALF_UP).doubleValue() : d - 1.0d;
                                pn40 pn40Var2 = pn40.f27267a;
                                strH = pn40.o(dDoubleValue);
                            } else {
                                if (iOrdinal != 5) {
                                    t9f.b();
                                    return null;
                                }
                                if (d > 2.0d) {
                                    BigDecimal bigDecimalDivide = new BigDecimal("-1").divide(bigDecimalSubtract, i5, RoundingMode.HALF_UP);
                                    bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, i2) : bigDecimalDivide.stripTrailingZeros();
                                } else {
                                    bigDecimal = bigDecimalSubtract.signum() == 0 ? new BigDecimal(BigInteger.ZERO, i2) : bigDecimalSubtract.stripTrailingZeros();
                                }
                                strH = bigDecimal.toPlainString();
                                strH.getClass();
                            }
                        }
                        String str = strH;
                        int i10 = gaoVar.f10978a;
                        long j = gaoVar.b;
                        double d2 = gaoVar.c;
                        long j2 = gaoVar.d;
                        boolean z2 = gaoVar.e;
                        String str2 = gaoVar.g;
                        String str3 = gaoVar.h;
                        Iterator it7 = it6;
                        int i11 = gaoVar.i;
                        double d3 = gaoVar.j;
                        fao faoVar = gaoVar.k;
                        str3.getClass();
                        arrayList6.add(new gao(i10, j, d2, j2, z2, str, str2, str3, i11, d3, faoVar));
                        it6 = it7;
                        i = i;
                        i2 = 0;
                        i3 = 1;
                        i5 = 2;
                    }
                    arrayList5.add(new pu20(pu20Var.f27593a, pu20Var.b, pu20Var.c, pu20Var.d, arrayList6));
                    it6 = it6;
                    i = i;
                    i2 = 0;
                    i3 = 1;
                    i4 = 10;
                    i5 = 2;
                }
                return arrayList5;
        }
    }

    public Enum v(int i, zje zjeVar) {
        int iOrdinal = ((ave) ((g45) this.b).c).f1521a.ordinal();
        if (iOrdinal != 5) {
            return iOrdinal != 6 ? u4k.f35053a : m(i, zjeVar);
        }
        LinkedHashMap linkedHashMapO = o(i, ((oif0) this.d).n());
        int i2 = 0;
        if (!linkedHashMapO.isEmpty()) {
            Iterator it = linkedHashMapO.entrySet().iterator();
            while (it.hasNext()) {
                if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > 0) {
                    i2++;
                }
            }
        }
        return i2 >= 3 ? u4k.f35053a : u4k.b;
    }

    public Object w(long j, xvs xvsVar, h9n0 h9n0Var, zje zjeVar) {
        if (!((m1e) this.d).c()) {
            return Unit.f46060a;
        }
        yje yjeVar = null;
        yje yjeVar2 = null;
        Object objV = iom0.v(new sr((Object) this, j, (Object) xvsVar, yjeVar, (byte) 13), new sr((Object) this, j, (Object) h9n0Var, yjeVar, (byte) 14), new hhb0(this, yjeVar2, (byte) 5), new zt(this, j, (byte) 7), new tr((Object) this, j, yjeVar2, (byte) 12), lhf0.class, zjeVar);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0288  */
    /* JADX WARN: Code duplicated, block: B:103:0x028e  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:120:0x031e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0322  */
    /* JADX WARN: Code duplicated, block: B:123:0x0325  */
    /* JADX WARN: Code duplicated, block: B:126:0x032a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0345  */
    /* JADX WARN: Code duplicated, block: B:130:0x0348  */
    /* JADX WARN: Code duplicated, block: B:135:0x038d  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a5 A[LOOP:0: B:136:0x039f->B:138:0x03a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x03bb A[PHI: r0 r3 r4 r6
  0x03bb: PHI (r0v71 java.lang.Object) = (r0v65 java.lang.Object), (r0v3 java.lang.Object) binds: [B:143:0x03b8, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x03bb: PHI (r3v44 java.util.List) = (r3v42 java.util.List), (r3v46 java.util.List) binds: [B:143:0x03b8, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x03bb: PHI (r4v46 java.util.List) = (r4v43 java.util.List), (r4v48 java.util.List) binds: [B:143:0x03b8, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x03bb: PHI (r6v16 java.util.List) = (r6v14 java.util.List), (r6v17 java.util.List) binds: [B:143:0x03b8, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:184:0x043f  */
    /* JADX WARN: Code duplicated, block: B:219:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0132  */
    /* JADX WARN: Code duplicated, block: B:49:0x0174  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:55:0x0195  */
    /* JADX WARN: Code duplicated, block: B:57:0x0198  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x0235  */
    /* JADX WARN: Code duplicated, block: B:81:0x024a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0257  */
    /* JADX WARN: Code duplicated, block: B:84:0x025e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0266  */
    /* JADX WARN: Code duplicated, block: B:88:0x0269  */
    /* JADX WARN: Code duplicated, block: B:91:0x026f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0272  */
    /* JADX WARN: Code duplicated, block: B:95:0x0278  */
    /* JADX WARN: Code duplicated, block: B:96:0x027b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0281  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    public Object x(zje zjeVar) throws IOException {
        lgu lguVar;
        emu emuVar;
        ArrayList arrayList;
        List list;
        String str;
        BufferedReader bufferedReader;
        List list2;
        ArrayList arrayList2;
        Object obj;
        List list3;
        Iterator it;
        nas nasVarD0;
        List list4;
        boolean z;
        List list5;
        Object objK;
        List list6;
        List list7;
        Object objK2;
        List list8;
        List list9;
        String str2;
        BufferedReader bufferedReader2;
        List list10;
        ArrayList arrayList3;
        List list11;
        List list12;
        knf0 knf0Var;
        List list13;
        List list14;
        int i;
        Iterator it2;
        Long l;
        long jLongValue;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        boolean zBooleanValue;
        List<v3n0> list15;
        ?? arrayList4;
        Long l2;
        long jLongValue2;
        String str9;
        List list16;
        String str10;
        BufferedReader bufferedReader3;
        List list17;
        ArrayList arrayList5;
        Iterator it3;
        List list18;
        Serializable serializableQ;
        List list19;
        List list20;
        List list21;
        List list22;
        Serializable serializableQ2;
        List list23;
        List list24;
        List list25;
        List list26;
        List list27;
        byte b = this.f20053a;
        Object obj2 = this.b;
        switch (b) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (zjeVar instanceof lgu) {
                    lguVar = (lgu) zjeVar;
                    int i2 = lguVar.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lguVar.k = i2 - Integer.MIN_VALUE;
                    } else {
                        lguVar = new lgu(this, zjeVar);
                    }
                } else {
                    lguVar = new lgu(this, zjeVar);
                }
                Object objB = lguVar.i;
                Object obj3 = wne.f39444a;
                int i3 = lguVar.k;
                if (i3 == 0) {
                    z1x.P(objB);
                    ahu ahuVar = (ahu) this.c;
                    bm5 bm5Var = bm5.m;
                    lguVar.k = 1;
                    objB = ahuVar.b(bm5Var, lguVar);
                    if (objB != obj3) {
                    }
                    return obj3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        z1x.P(objB);
                        return objB;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
                ql5 ql5Var = (ql5) objB;
                ((ot) this.d).a(bm5.m, ql5Var);
                lguVar.k = 2;
                Object objA = ((ngu) obj2).a(ql5Var, lguVar);
                if (objA != obj3) {
                    return objA;
                }
                return obj3;
            default:
                uii uiiVar = (uii) this.c;
                v7i v7iVar = (v7i) this.d;
                cyu cyuVar = (cyu) obj2;
                vby vbyVar = (vby) cyuVar.b;
                us00 us00Var = (us00) cyuVar.f5196a;
                knf0 knf0Var2 = (knf0) cyuVar.c;
                if (zjeVar instanceof emu) {
                    emuVar = (emu) zjeVar;
                    int i4 = emuVar.r;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        emuVar.r = i4 - Integer.MIN_VALUE;
                    } else {
                        emuVar = new emu(this, zjeVar);
                    }
                } else {
                    emuVar = new emu(this, zjeVar);
                }
                Object obj4 = emuVar.p;
                Object kj60Var = wne.f39444a;
                boolean z2 = false;
                switch (emuVar.r) {
                    case 0:
                        z1x.P(obj4);
                        emuVar.r = 1;
                        InputStream inputStreamOpen = us00Var.getAssets().open(knf0Var2.e() ? "mocks/onboarding/liveBestGames_ru.json" : "mocks/onboarding/liveBestGames_en.json");
                        inputStreamOpen.getClass();
                        BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
                        try {
                            String strK = n8n0.k(bufferedReader4);
                            bufferedReader4.close();
                            vbyVar.getClass();
                            List list28 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(rt10.Companion.serializer(), (byte) 0)), strK)).b;
                            if (list28 != null) {
                                arrayList = new ArrayList();
                                Iterator it4 = list28.iterator();
                                while (it4.hasNext()) {
                                    nas nasVarD1 = ay3.d0((rt10) it4.next(), sip.c, 0L);
                                    if (nasVarD1 != null) {
                                        arrayList.add(nasVarD1);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            obj4 = arrayList == null ? iun.f15405a : arrayList;
                            if (obj4 != kj60Var) {
                                list = (List) obj4;
                                emuVar.i = list;
                                emuVar.r = 2;
                                if (knf0Var2.e()) {
                                    str = "mocks/onboarding/lineBestGames_ru.json";
                                } else {
                                    str = "mocks/onboarding/lineBestGames_en.json";
                                }
                                InputStream inputStreamOpen2 = us00Var.getAssets().open(str);
                                inputStreamOpen2.getClass();
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen2, Charsets.UTF_8), 8192);
                                try {
                                    String strK2 = n8n0.k(bufferedReader);
                                    bufferedReader.close();
                                    vbyVar.getClass();
                                    list2 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(rt10.Companion.serializer(), (byte) 0)), strK2)).b;
                                    if (list2 != null) {
                                        arrayList2 = new ArrayList();
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            nasVarD0 = ay3.d0((rt10) it.next(), sip.b, 0L);
                                            if (nasVarD0 != null) {
                                                arrayList2.add(nasVarD0);
                                            }
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 == null) {
                                        obj = iun.f15405a;
                                    } else {
                                        obj = arrayList2;
                                    }
                                    if (obj != kj60Var) {
                                        Object obj5 = obj;
                                        list3 = list;
                                        obj4 = obj5;
                                        list4 = (List) obj4;
                                        z = true;
                                        acu acuVarK = v7iVar.k(list3, true, false);
                                        list5 = null;
                                        emuVar.i = null;
                                        emuVar.j = list4;
                                        emuVar.r = 3;
                                        objK = ntb.K(acuVarK, emuVar);
                                        if (objK != kj60Var) {
                                            list6 = list4;
                                            obj4 = objK;
                                            list7 = (List) obj4;
                                            acu acuVarK2 = v7iVar.k(list6, z, false);
                                            emuVar.i = list5;
                                            emuVar.j = list5;
                                            emuVar.k = list7;
                                            emuVar.r = 4;
                                            objK2 = ntb.K(acuVarK2, emuVar);
                                            if (objK2 != kj60Var) {
                                                list8 = list7;
                                                obj4 = objK2;
                                                list9 = (List) obj4;
                                                emuVar.i = list5;
                                                emuVar.j = list5;
                                                emuVar.k = list8;
                                                emuVar.l = list9;
                                                emuVar.r = 5;
                                                if (knf0Var2.e()) {
                                                    str2 = "mocks/onboarding/sports_ru.json";
                                                } else {
                                                    str2 = "mocks/onboarding/sports_en.json";
                                                }
                                                InputStream inputStreamOpen3 = us00Var.getAssets().open(str2);
                                                inputStreamOpen3.getClass();
                                                bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen3, Charsets.UTF_8), 8192);
                                                try {
                                                    String strK3 = n8n0.k(bufferedReader2);
                                                    bufferedReader2.close();
                                                    vbyVar.getClass();
                                                    list10 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(tkl0.Companion.serializer(), (byte) 0)), strK3)).b;
                                                    if (list10 != null) {
                                                        i = 10;
                                                        arrayList3 = new ArrayList(r3d.q(list10, 10));
                                                        it2 = list10.iterator();
                                                        while (it2.hasNext()) {
                                                            tkl0 tkl0Var = (tkl0) it2.next();
                                                            tkl0Var.getClass();
                                                            l = tkl0Var.f34100a;
                                                            if (l != null) {
                                                                jLongValue = l.longValue();
                                                            } else {
                                                                jLongValue = 0;
                                                            }
                                                            str3 = tkl0Var.b;
                                                            if (str3 == null) {
                                                                str4 = "";
                                                            } else {
                                                                str4 = str3;
                                                            }
                                                            str5 = tkl0Var.c;
                                                            if (str5 == null) {
                                                                str6 = "";
                                                            } else {
                                                                str6 = str5;
                                                            }
                                                            str7 = tkl0Var.d;
                                                            if (str7 == null) {
                                                                str8 = "";
                                                            } else {
                                                                str8 = str7;
                                                            }
                                                            bool = tkl0Var.e;
                                                            if (bool != null) {
                                                                zBooleanValue = bool.booleanValue();
                                                            } else {
                                                                zBooleanValue = z2;
                                                            }
                                                            list15 = tkl0Var.f;
                                                            if (list15 != null) {
                                                                arrayList4 = new ArrayList(r3d.q(list15, i));
                                                                for (v3n0 v3n0Var : list15) {
                                                                    v3n0Var.getClass();
                                                                    List list29 = list9;
                                                                    l2 = v3n0Var.f36737a;
                                                                    if (l2 != null) {
                                                                        jLongValue2 = l2.longValue();
                                                                    } else {
                                                                        jLongValue2 = 0;
                                                                    }
                                                                    str9 = v3n0Var.b;
                                                                    if (str9 == null) {
                                                                        str9 = "";
                                                                    }
                                                                    arrayList4.add(new f3n0(jLongValue2, str9, t9x.C(v3n0Var.d, v3n0Var.c)));
                                                                    list9 = list29;
                                                                    it2 = it2;
                                                                    list8 = list8;
                                                                    knf0Var2 = knf0Var2;
                                                                }
                                                            } else {
                                                                arrayList4 = 0;
                                                            }
                                                            List list30 = list9;
                                                            List list31 = list8;
                                                            Iterator it5 = it2;
                                                            knf0 knf0Var3 = knf0Var2;
                                                            if (arrayList4 == 0) {
                                                                arrayList4 = iun.f15405a;
                                                            }
                                                            arrayList3.add(new ril0(jLongValue, str4, str6, str8, zBooleanValue, arrayList4, t9x.C(tkl0Var.h, tkl0Var.g)));
                                                            list9 = list30;
                                                            it2 = it5;
                                                            list8 = list31;
                                                            knf0Var2 = knf0Var3;
                                                            i = 10;
                                                            z2 = false;
                                                        }
                                                    } else {
                                                        arrayList3 = null;
                                                    }
                                                    list11 = list9;
                                                    list12 = list8;
                                                    knf0Var = knf0Var2;
                                                    if (arrayList3 == null) {
                                                        obj4 = iun.f15405a;
                                                    } else {
                                                        obj4 = arrayList3;
                                                    }
                                                    if (obj4 != kj60Var) {
                                                        list13 = list11;
                                                        list14 = list12;
                                                        list16 = (List) obj4;
                                                        emuVar.i = null;
                                                        emuVar.j = null;
                                                        emuVar.k = list14;
                                                        emuVar.l = list13;
                                                        emuVar.m = list16;
                                                        emuVar.r = 6;
                                                        if (knf0Var.e()) {
                                                            str10 = "mocks/onboarding/liveTopChamps_ru.json";
                                                        } else {
                                                            str10 = "mocks/onboarding/liveTopChamps_en.json";
                                                        }
                                                        InputStream inputStreamOpen4 = us00Var.getAssets().open(str10);
                                                        inputStreamOpen4.getClass();
                                                        bufferedReader3 = new BufferedReader(new InputStreamReader(inputStreamOpen4, Charsets.UTF_8), 8192);
                                                        try {
                                                            String strK4 = n8n0.k(bufferedReader3);
                                                            bufferedReader3.close();
                                                            vbyVar.getClass();
                                                            list17 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(pu10.Companion.serializer(), (byte) 0)), strK4)).b;
                                                            if (list17 != null) {
                                                                ArrayList arrayListH0 = sj3.H0(d7x.K(list17, list16, true));
                                                                arrayList5 = new ArrayList();
                                                                it3 = arrayListH0.iterator();
                                                                while (it3.hasNext()) {
                                                                    w3d.u(arrayList5, ((zlb) it3.next()).c);
                                                                }
                                                            } else {
                                                                arrayList5 = null;
                                                            }
                                                            if (arrayList5 == null) {
                                                                obj4 = iun.f15405a;
                                                            } else {
                                                                obj4 = arrayList5;
                                                            }
                                                            if (obj4 != kj60Var) {
                                                                list18 = (List) obj4;
                                                                emuVar.i = null;
                                                                emuVar.j = null;
                                                                emuVar.k = list14;
                                                                emuVar.l = list13;
                                                                emuVar.m = list16;
                                                                emuVar.n = list18;
                                                                emuVar.r = 7;
                                                                serializableQ = uiiVar.q(true, emuVar);
                                                                if (serializableQ != kj60Var) {
                                                                    List list32 = list16;
                                                                    list19 = list18;
                                                                    obj4 = serializableQ;
                                                                    list20 = list13;
                                                                    list21 = list32;
                                                                    list22 = (List) obj4;
                                                                    emuVar.i = null;
                                                                    emuVar.j = null;
                                                                    emuVar.k = list14;
                                                                    emuVar.l = list20;
                                                                    emuVar.m = list21;
                                                                    emuVar.n = list19;
                                                                    emuVar.o = list22;
                                                                    emuVar.r = 8;
                                                                    serializableQ2 = uiiVar.q(false, emuVar);
                                                                    if (serializableQ2 != kj60Var) {
                                                                        List list33 = list14;
                                                                        list23 = list22;
                                                                        obj4 = serializableQ2;
                                                                        list24 = list21;
                                                                        list25 = list20;
                                                                        list26 = list19;
                                                                        list27 = list33;
                                                                        kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            try {
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                bkb.E(bufferedReader3, th);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        bkb.E(bufferedReader2, th3);
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        bkb.E(bufferedReader, th5);
                                        throw th6;
                                    }
                                }
                            }
                            return kj60Var;
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                bkb.E(bufferedReader4, th7);
                                throw th8;
                            }
                        }
                    case 1:
                        z1x.P(obj4);
                        list = (List) obj4;
                        emuVar.i = list;
                        emuVar.r = 2;
                        if (knf0Var2.e()) {
                            str = "mocks/onboarding/lineBestGames_ru.json";
                        } else {
                            str = "mocks/onboarding/lineBestGames_en.json";
                        }
                        InputStream inputStreamOpen5 = us00Var.getAssets().open(str);
                        inputStreamOpen5.getClass();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen5, Charsets.UTF_8), 8192);
                        String strK5 = n8n0.k(bufferedReader);
                        bufferedReader.close();
                        vbyVar.getClass();
                        list2 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(rt10.Companion.serializer(), (byte) 0)), strK5)).b;
                        if (list2 != null) {
                            arrayList2 = new ArrayList();
                            it = list2.iterator();
                            while (it.hasNext()) {
                                nasVarD0 = ay3.d0((rt10) it.next(), sip.b, 0L);
                                if (nasVarD0 != null) {
                                    arrayList2.add(nasVarD0);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 == null) {
                            obj = iun.f15405a;
                        } else {
                            obj = arrayList2;
                        }
                        if (obj != kj60Var) {
                            Object obj6 = obj;
                            list3 = list;
                            obj4 = obj6;
                            list4 = (List) obj4;
                            z = true;
                            acu acuVarK3 = v7iVar.k(list3, true, false);
                            list5 = null;
                            emuVar.i = null;
                            emuVar.j = list4;
                            emuVar.r = 3;
                            objK = ntb.K(acuVarK3, emuVar);
                            if (objK != kj60Var) {
                                list6 = list4;
                                obj4 = objK;
                                list7 = (List) obj4;
                                acu acuVarK4 = v7iVar.k(list6, z, false);
                                emuVar.i = list5;
                                emuVar.j = list5;
                                emuVar.k = list7;
                                emuVar.r = 4;
                                objK2 = ntb.K(acuVarK4, emuVar);
                                if (objK2 != kj60Var) {
                                    list8 = list7;
                                    obj4 = objK2;
                                    list9 = (List) obj4;
                                    emuVar.i = list5;
                                    emuVar.j = list5;
                                    emuVar.k = list8;
                                    emuVar.l = list9;
                                    emuVar.r = 5;
                                    if (knf0Var2.e()) {
                                        str2 = "mocks/onboarding/sports_ru.json";
                                    } else {
                                        str2 = "mocks/onboarding/sports_en.json";
                                    }
                                    InputStream inputStreamOpen6 = us00Var.getAssets().open(str2);
                                    inputStreamOpen6.getClass();
                                    bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen6, Charsets.UTF_8), 8192);
                                    String strK6 = n8n0.k(bufferedReader2);
                                    bufferedReader2.close();
                                    vbyVar.getClass();
                                    list10 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(tkl0.Companion.serializer(), (byte) 0)), strK6)).b;
                                    if (list10 != null) {
                                        i = 10;
                                        arrayList3 = new ArrayList(r3d.q(list10, 10));
                                        it2 = list10.iterator();
                                        while (it2.hasNext()) {
                                            tkl0 tkl0Var2 = (tkl0) it2.next();
                                            tkl0Var2.getClass();
                                            l = tkl0Var2.f34100a;
                                            if (l != null) {
                                                jLongValue = l.longValue();
                                            } else {
                                                jLongValue = 0;
                                            }
                                            str3 = tkl0Var2.b;
                                            if (str3 == null) {
                                                str4 = "";
                                            } else {
                                                str4 = str3;
                                            }
                                            str5 = tkl0Var2.c;
                                            if (str5 == null) {
                                                str6 = "";
                                            } else {
                                                str6 = str5;
                                            }
                                            str7 = tkl0Var2.d;
                                            if (str7 == null) {
                                                str8 = "";
                                            } else {
                                                str8 = str7;
                                            }
                                            bool = tkl0Var2.e;
                                            if (bool != null) {
                                                zBooleanValue = bool.booleanValue();
                                            } else {
                                                zBooleanValue = z2;
                                            }
                                            list15 = tkl0Var2.f;
                                            if (list15 != null) {
                                                arrayList4 = new ArrayList(r3d.q(list15, i));
                                                while (r8.hasNext()) {
                                                    v3n0Var.getClass();
                                                    List list210 = list9;
                                                    l2 = v3n0Var.f36737a;
                                                    if (l2 != null) {
                                                        jLongValue2 = l2.longValue();
                                                    } else {
                                                        jLongValue2 = 0;
                                                    }
                                                    str9 = v3n0Var.b;
                                                    if (str9 == null) {
                                                        str9 = "";
                                                    }
                                                    arrayList4.add(new f3n0(jLongValue2, str9, t9x.C(v3n0Var.d, v3n0Var.c)));
                                                    list9 = list210;
                                                    it2 = it2;
                                                    list8 = list8;
                                                    knf0Var2 = knf0Var2;
                                                }
                                            } else {
                                                arrayList4 = 0;
                                            }
                                            List list34 = list9;
                                            List list35 = list8;
                                            Iterator it6 = it2;
                                            knf0 knf0Var4 = knf0Var2;
                                            if (arrayList4 == 0) {
                                                arrayList4 = iun.f15405a;
                                            }
                                            arrayList3.add(new ril0(jLongValue, str4, str6, str8, zBooleanValue, arrayList4, t9x.C(tkl0Var2.h, tkl0Var2.g)));
                                            list9 = list34;
                                            it2 = it6;
                                            list8 = list35;
                                            knf0Var2 = knf0Var4;
                                            i = 10;
                                            z2 = false;
                                        }
                                    } else {
                                        arrayList3 = null;
                                    }
                                    list11 = list9;
                                    list12 = list8;
                                    knf0Var = knf0Var2;
                                    if (arrayList3 == null) {
                                        obj4 = iun.f15405a;
                                    } else {
                                        obj4 = arrayList3;
                                    }
                                    if (obj4 != kj60Var) {
                                        list13 = list11;
                                        list14 = list12;
                                        list16 = (List) obj4;
                                        emuVar.i = null;
                                        emuVar.j = null;
                                        emuVar.k = list14;
                                        emuVar.l = list13;
                                        emuVar.m = list16;
                                        emuVar.r = 6;
                                        if (knf0Var.e()) {
                                            str10 = "mocks/onboarding/liveTopChamps_ru.json";
                                        } else {
                                            str10 = "mocks/onboarding/liveTopChamps_en.json";
                                        }
                                        InputStream inputStreamOpen7 = us00Var.getAssets().open(str10);
                                        inputStreamOpen7.getClass();
                                        bufferedReader3 = new BufferedReader(new InputStreamReader(inputStreamOpen7, Charsets.UTF_8), 8192);
                                        String strK7 = n8n0.k(bufferedReader3);
                                        bufferedReader3.close();
                                        vbyVar.getClass();
                                        list17 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(pu10.Companion.serializer(), (byte) 0)), strK7)).b;
                                        if (list17 != null) {
                                            ArrayList arrayListH1 = sj3.H0(d7x.K(list17, list16, true));
                                            arrayList5 = new ArrayList();
                                            it3 = arrayListH1.iterator();
                                            while (it3.hasNext()) {
                                                w3d.u(arrayList5, ((zlb) it3.next()).c);
                                            }
                                        } else {
                                            arrayList5 = null;
                                        }
                                        if (arrayList5 == null) {
                                            obj4 = iun.f15405a;
                                        } else {
                                            obj4 = arrayList5;
                                        }
                                        if (obj4 != kj60Var) {
                                            list18 = (List) obj4;
                                            emuVar.i = null;
                                            emuVar.j = null;
                                            emuVar.k = list14;
                                            emuVar.l = list13;
                                            emuVar.m = list16;
                                            emuVar.n = list18;
                                            emuVar.r = 7;
                                            serializableQ = uiiVar.q(true, emuVar);
                                            if (serializableQ != kj60Var) {
                                                List list36 = list16;
                                                list19 = list18;
                                                obj4 = serializableQ;
                                                list20 = list13;
                                                list21 = list36;
                                                list22 = (List) obj4;
                                                emuVar.i = null;
                                                emuVar.j = null;
                                                emuVar.k = list14;
                                                emuVar.l = list20;
                                                emuVar.m = list21;
                                                emuVar.n = list19;
                                                emuVar.o = list22;
                                                emuVar.r = 8;
                                                serializableQ2 = uiiVar.q(false, emuVar);
                                                if (serializableQ2 != kj60Var) {
                                                    List list37 = list14;
                                                    list23 = list22;
                                                    obj4 = serializableQ2;
                                                    list24 = list21;
                                                    list25 = list20;
                                                    list26 = list19;
                                                    list27 = list37;
                                                    kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return kj60Var;
                    case 2:
                        list3 = emuVar.i;
                        z1x.P(obj4);
                        list4 = (List) obj4;
                        z = true;
                        acu acuVarK5 = v7iVar.k(list3, true, false);
                        list5 = null;
                        emuVar.i = null;
                        emuVar.j = list4;
                        emuVar.r = 3;
                        objK = ntb.K(acuVarK5, emuVar);
                        if (objK != kj60Var) {
                            list6 = list4;
                            obj4 = objK;
                            list7 = (List) obj4;
                            acu acuVarK6 = v7iVar.k(list6, z, false);
                            emuVar.i = list5;
                            emuVar.j = list5;
                            emuVar.k = list7;
                            emuVar.r = 4;
                            objK2 = ntb.K(acuVarK6, emuVar);
                            if (objK2 != kj60Var) {
                                list8 = list7;
                                obj4 = objK2;
                                list9 = (List) obj4;
                                emuVar.i = list5;
                                emuVar.j = list5;
                                emuVar.k = list8;
                                emuVar.l = list9;
                                emuVar.r = 5;
                                if (knf0Var2.e()) {
                                    str2 = "mocks/onboarding/sports_ru.json";
                                } else {
                                    str2 = "mocks/onboarding/sports_en.json";
                                }
                                InputStream inputStreamOpen8 = us00Var.getAssets().open(str2);
                                inputStreamOpen8.getClass();
                                bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen8, Charsets.UTF_8), 8192);
                                String strK8 = n8n0.k(bufferedReader2);
                                bufferedReader2.close();
                                vbyVar.getClass();
                                list10 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(tkl0.Companion.serializer(), (byte) 0)), strK8)).b;
                                if (list10 != null) {
                                    i = 10;
                                    arrayList3 = new ArrayList(r3d.q(list10, 10));
                                    it2 = list10.iterator();
                                    while (it2.hasNext()) {
                                        tkl0 tkl0Var3 = (tkl0) it2.next();
                                        tkl0Var3.getClass();
                                        l = tkl0Var3.f34100a;
                                        if (l != null) {
                                            jLongValue = l.longValue();
                                        } else {
                                            jLongValue = 0;
                                        }
                                        str3 = tkl0Var3.b;
                                        if (str3 == null) {
                                            str4 = "";
                                        } else {
                                            str4 = str3;
                                        }
                                        str5 = tkl0Var3.c;
                                        if (str5 == null) {
                                            str6 = "";
                                        } else {
                                            str6 = str5;
                                        }
                                        str7 = tkl0Var3.d;
                                        if (str7 == null) {
                                            str8 = "";
                                        } else {
                                            str8 = str7;
                                        }
                                        bool = tkl0Var3.e;
                                        if (bool != null) {
                                            zBooleanValue = bool.booleanValue();
                                        } else {
                                            zBooleanValue = z2;
                                        }
                                        list15 = tkl0Var3.f;
                                        if (list15 != null) {
                                            arrayList4 = new ArrayList(r3d.q(list15, i));
                                            while (r8.hasNext()) {
                                                v3n0Var.getClass();
                                                List list211 = list9;
                                                l2 = v3n0Var.f36737a;
                                                if (l2 != null) {
                                                    jLongValue2 = l2.longValue();
                                                } else {
                                                    jLongValue2 = 0;
                                                }
                                                str9 = v3n0Var.b;
                                                if (str9 == null) {
                                                    str9 = "";
                                                }
                                                arrayList4.add(new f3n0(jLongValue2, str9, t9x.C(v3n0Var.d, v3n0Var.c)));
                                                list9 = list211;
                                                it2 = it2;
                                                list8 = list8;
                                                knf0Var2 = knf0Var2;
                                            }
                                        } else {
                                            arrayList4 = 0;
                                        }
                                        List list38 = list9;
                                        List list39 = list8;
                                        Iterator it7 = it2;
                                        knf0 knf0Var5 = knf0Var2;
                                        if (arrayList4 == 0) {
                                            arrayList4 = iun.f15405a;
                                        }
                                        arrayList3.add(new ril0(jLongValue, str4, str6, str8, zBooleanValue, arrayList4, t9x.C(tkl0Var3.h, tkl0Var3.g)));
                                        list9 = list38;
                                        it2 = it7;
                                        list8 = list39;
                                        knf0Var2 = knf0Var5;
                                        i = 10;
                                        z2 = false;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                list11 = list9;
                                list12 = list8;
                                knf0Var = knf0Var2;
                                if (arrayList3 == null) {
                                    obj4 = iun.f15405a;
                                } else {
                                    obj4 = arrayList3;
                                }
                                if (obj4 != kj60Var) {
                                    list13 = list11;
                                    list14 = list12;
                                    list16 = (List) obj4;
                                    emuVar.i = null;
                                    emuVar.j = null;
                                    emuVar.k = list14;
                                    emuVar.l = list13;
                                    emuVar.m = list16;
                                    emuVar.r = 6;
                                    if (knf0Var.e()) {
                                        str10 = "mocks/onboarding/liveTopChamps_ru.json";
                                    } else {
                                        str10 = "mocks/onboarding/liveTopChamps_en.json";
                                    }
                                    InputStream inputStreamOpen9 = us00Var.getAssets().open(str10);
                                    inputStreamOpen9.getClass();
                                    bufferedReader3 = new BufferedReader(new InputStreamReader(inputStreamOpen9, Charsets.UTF_8), 8192);
                                    String strK9 = n8n0.k(bufferedReader3);
                                    bufferedReader3.close();
                                    vbyVar.getClass();
                                    list17 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(pu10.Companion.serializer(), (byte) 0)), strK9)).b;
                                    if (list17 != null) {
                                        ArrayList arrayListH2 = sj3.H0(d7x.K(list17, list16, true));
                                        arrayList5 = new ArrayList();
                                        it3 = arrayListH2.iterator();
                                        while (it3.hasNext()) {
                                            w3d.u(arrayList5, ((zlb) it3.next()).c);
                                        }
                                    } else {
                                        arrayList5 = null;
                                    }
                                    if (arrayList5 == null) {
                                        obj4 = iun.f15405a;
                                    } else {
                                        obj4 = arrayList5;
                                    }
                                    if (obj4 != kj60Var) {
                                        list18 = (List) obj4;
                                        emuVar.i = null;
                                        emuVar.j = null;
                                        emuVar.k = list14;
                                        emuVar.l = list13;
                                        emuVar.m = list16;
                                        emuVar.n = list18;
                                        emuVar.r = 7;
                                        serializableQ = uiiVar.q(true, emuVar);
                                        if (serializableQ != kj60Var) {
                                            List list310 = list16;
                                            list19 = list18;
                                            obj4 = serializableQ;
                                            list20 = list13;
                                            list21 = list310;
                                            list22 = (List) obj4;
                                            emuVar.i = null;
                                            emuVar.j = null;
                                            emuVar.k = list14;
                                            emuVar.l = list20;
                                            emuVar.m = list21;
                                            emuVar.n = list19;
                                            emuVar.o = list22;
                                            emuVar.r = 8;
                                            serializableQ2 = uiiVar.q(false, emuVar);
                                            if (serializableQ2 != kj60Var) {
                                                List list311 = list14;
                                                list23 = list22;
                                                obj4 = serializableQ2;
                                                list24 = list21;
                                                list25 = list20;
                                                list26 = list19;
                                                list27 = list311;
                                                kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return kj60Var;
                    case 3:
                        list6 = emuVar.j;
                        z1x.P(obj4);
                        z = true;
                        list5 = null;
                        list7 = (List) obj4;
                        acu acuVarK7 = v7iVar.k(list6, z, false);
                        emuVar.i = list5;
                        emuVar.j = list5;
                        emuVar.k = list7;
                        emuVar.r = 4;
                        objK2 = ntb.K(acuVarK7, emuVar);
                        if (objK2 != kj60Var) {
                            list8 = list7;
                            obj4 = objK2;
                            list9 = (List) obj4;
                            emuVar.i = list5;
                            emuVar.j = list5;
                            emuVar.k = list8;
                            emuVar.l = list9;
                            emuVar.r = 5;
                            if (knf0Var2.e()) {
                                str2 = "mocks/onboarding/sports_ru.json";
                            } else {
                                str2 = "mocks/onboarding/sports_en.json";
                            }
                            InputStream inputStreamOpen10 = us00Var.getAssets().open(str2);
                            inputStreamOpen10.getClass();
                            bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen10, Charsets.UTF_8), 8192);
                            String strK10 = n8n0.k(bufferedReader2);
                            bufferedReader2.close();
                            vbyVar.getClass();
                            list10 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(tkl0.Companion.serializer(), (byte) 0)), strK10)).b;
                            if (list10 != null) {
                                i = 10;
                                arrayList3 = new ArrayList(r3d.q(list10, 10));
                                it2 = list10.iterator();
                                while (it2.hasNext()) {
                                    tkl0 tkl0Var4 = (tkl0) it2.next();
                                    tkl0Var4.getClass();
                                    l = tkl0Var4.f34100a;
                                    if (l != null) {
                                        jLongValue = l.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    str3 = tkl0Var4.b;
                                    if (str3 == null) {
                                        str4 = "";
                                    } else {
                                        str4 = str3;
                                    }
                                    str5 = tkl0Var4.c;
                                    if (str5 == null) {
                                        str6 = "";
                                    } else {
                                        str6 = str5;
                                    }
                                    str7 = tkl0Var4.d;
                                    if (str7 == null) {
                                        str8 = "";
                                    } else {
                                        str8 = str7;
                                    }
                                    bool = tkl0Var4.e;
                                    if (bool != null) {
                                        zBooleanValue = bool.booleanValue();
                                    } else {
                                        zBooleanValue = z2;
                                    }
                                    list15 = tkl0Var4.f;
                                    if (list15 != null) {
                                        arrayList4 = new ArrayList(r3d.q(list15, i));
                                        while (r8.hasNext()) {
                                            v3n0Var.getClass();
                                            List list212 = list9;
                                            l2 = v3n0Var.f36737a;
                                            if (l2 != null) {
                                                jLongValue2 = l2.longValue();
                                            } else {
                                                jLongValue2 = 0;
                                            }
                                            str9 = v3n0Var.b;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            arrayList4.add(new f3n0(jLongValue2, str9, t9x.C(v3n0Var.d, v3n0Var.c)));
                                            list9 = list212;
                                            it2 = it2;
                                            list8 = list8;
                                            knf0Var2 = knf0Var2;
                                        }
                                    } else {
                                        arrayList4 = 0;
                                    }
                                    List list312 = list9;
                                    List list313 = list8;
                                    Iterator it8 = it2;
                                    knf0 knf0Var6 = knf0Var2;
                                    if (arrayList4 == 0) {
                                        arrayList4 = iun.f15405a;
                                    }
                                    arrayList3.add(new ril0(jLongValue, str4, str6, str8, zBooleanValue, arrayList4, t9x.C(tkl0Var4.h, tkl0Var4.g)));
                                    list9 = list312;
                                    it2 = it8;
                                    list8 = list313;
                                    knf0Var2 = knf0Var6;
                                    i = 10;
                                    z2 = false;
                                }
                            } else {
                                arrayList3 = null;
                            }
                            list11 = list9;
                            list12 = list8;
                            knf0Var = knf0Var2;
                            if (arrayList3 == null) {
                                obj4 = iun.f15405a;
                            } else {
                                obj4 = arrayList3;
                            }
                            if (obj4 != kj60Var) {
                                list13 = list11;
                                list14 = list12;
                                list16 = (List) obj4;
                                emuVar.i = null;
                                emuVar.j = null;
                                emuVar.k = list14;
                                emuVar.l = list13;
                                emuVar.m = list16;
                                emuVar.r = 6;
                                if (knf0Var.e()) {
                                    str10 = "mocks/onboarding/liveTopChamps_ru.json";
                                } else {
                                    str10 = "mocks/onboarding/liveTopChamps_en.json";
                                }
                                InputStream inputStreamOpen11 = us00Var.getAssets().open(str10);
                                inputStreamOpen11.getClass();
                                bufferedReader3 = new BufferedReader(new InputStreamReader(inputStreamOpen11, Charsets.UTF_8), 8192);
                                String strK11 = n8n0.k(bufferedReader3);
                                bufferedReader3.close();
                                vbyVar.getClass();
                                list17 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(pu10.Companion.serializer(), (byte) 0)), strK11)).b;
                                if (list17 != null) {
                                    ArrayList arrayListH3 = sj3.H0(d7x.K(list17, list16, true));
                                    arrayList5 = new ArrayList();
                                    it3 = arrayListH3.iterator();
                                    while (it3.hasNext()) {
                                        w3d.u(arrayList5, ((zlb) it3.next()).c);
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                if (arrayList5 == null) {
                                    obj4 = iun.f15405a;
                                } else {
                                    obj4 = arrayList5;
                                }
                                if (obj4 != kj60Var) {
                                    list18 = (List) obj4;
                                    emuVar.i = null;
                                    emuVar.j = null;
                                    emuVar.k = list14;
                                    emuVar.l = list13;
                                    emuVar.m = list16;
                                    emuVar.n = list18;
                                    emuVar.r = 7;
                                    serializableQ = uiiVar.q(true, emuVar);
                                    if (serializableQ != kj60Var) {
                                        List list314 = list16;
                                        list19 = list18;
                                        obj4 = serializableQ;
                                        list20 = list13;
                                        list21 = list314;
                                        list22 = (List) obj4;
                                        emuVar.i = null;
                                        emuVar.j = null;
                                        emuVar.k = list14;
                                        emuVar.l = list20;
                                        emuVar.m = list21;
                                        emuVar.n = list19;
                                        emuVar.o = list22;
                                        emuVar.r = 8;
                                        serializableQ2 = uiiVar.q(false, emuVar);
                                        if (serializableQ2 != kj60Var) {
                                            List list315 = list14;
                                            list23 = list22;
                                            obj4 = serializableQ2;
                                            list24 = list21;
                                            list25 = list20;
                                            list26 = list19;
                                            list27 = list315;
                                            kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                                        }
                                    }
                                }
                            }
                        }
                        return kj60Var;
                    case 4:
                        list8 = emuVar.k;
                        z1x.P(obj4);
                        list5 = null;
                        list9 = (List) obj4;
                        emuVar.i = list5;
                        emuVar.j = list5;
                        emuVar.k = list8;
                        emuVar.l = list9;
                        emuVar.r = 5;
                        if (knf0Var2.e()) {
                            str2 = "mocks/onboarding/sports_ru.json";
                        } else {
                            str2 = "mocks/onboarding/sports_en.json";
                        }
                        InputStream inputStreamOpen12 = us00Var.getAssets().open(str2);
                        inputStreamOpen12.getClass();
                        bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen12, Charsets.UTF_8), 8192);
                        String strK12 = n8n0.k(bufferedReader2);
                        bufferedReader2.close();
                        vbyVar.getClass();
                        list10 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(tkl0.Companion.serializer(), (byte) 0)), strK12)).b;
                        if (list10 != null) {
                            i = 10;
                            arrayList3 = new ArrayList(r3d.q(list10, 10));
                            it2 = list10.iterator();
                            while (it2.hasNext()) {
                                tkl0 tkl0Var5 = (tkl0) it2.next();
                                tkl0Var5.getClass();
                                l = tkl0Var5.f34100a;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                str3 = tkl0Var5.b;
                                if (str3 == null) {
                                    str4 = "";
                                } else {
                                    str4 = str3;
                                }
                                str5 = tkl0Var5.c;
                                if (str5 == null) {
                                    str6 = "";
                                } else {
                                    str6 = str5;
                                }
                                str7 = tkl0Var5.d;
                                if (str7 == null) {
                                    str8 = "";
                                } else {
                                    str8 = str7;
                                }
                                bool = tkl0Var5.e;
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    zBooleanValue = z2;
                                }
                                list15 = tkl0Var5.f;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList(r3d.q(list15, i));
                                    while (r8.hasNext()) {
                                        v3n0Var.getClass();
                                        List list213 = list9;
                                        l2 = v3n0Var.f36737a;
                                        if (l2 != null) {
                                            jLongValue2 = l2.longValue();
                                        } else {
                                            jLongValue2 = 0;
                                        }
                                        str9 = v3n0Var.b;
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        arrayList4.add(new f3n0(jLongValue2, str9, t9x.C(v3n0Var.d, v3n0Var.c)));
                                        list9 = list213;
                                        it2 = it2;
                                        list8 = list8;
                                        knf0Var2 = knf0Var2;
                                    }
                                } else {
                                    arrayList4 = 0;
                                }
                                List list316 = list9;
                                List list317 = list8;
                                Iterator it9 = it2;
                                knf0 knf0Var7 = knf0Var2;
                                if (arrayList4 == 0) {
                                    arrayList4 = iun.f15405a;
                                }
                                arrayList3.add(new ril0(jLongValue, str4, str6, str8, zBooleanValue, arrayList4, t9x.C(tkl0Var5.h, tkl0Var5.g)));
                                list9 = list316;
                                it2 = it9;
                                list8 = list317;
                                knf0Var2 = knf0Var7;
                                i = 10;
                                z2 = false;
                            }
                        } else {
                            arrayList3 = null;
                        }
                        list11 = list9;
                        list12 = list8;
                        knf0Var = knf0Var2;
                        if (arrayList3 == null) {
                            obj4 = iun.f15405a;
                        } else {
                            obj4 = arrayList3;
                        }
                        if (obj4 != kj60Var) {
                            list13 = list11;
                            list14 = list12;
                            list16 = (List) obj4;
                            emuVar.i = null;
                            emuVar.j = null;
                            emuVar.k = list14;
                            emuVar.l = list13;
                            emuVar.m = list16;
                            emuVar.r = 6;
                            if (knf0Var.e()) {
                                str10 = "mocks/onboarding/liveTopChamps_ru.json";
                            } else {
                                str10 = "mocks/onboarding/liveTopChamps_en.json";
                            }
                            InputStream inputStreamOpen13 = us00Var.getAssets().open(str10);
                            inputStreamOpen13.getClass();
                            bufferedReader3 = new BufferedReader(new InputStreamReader(inputStreamOpen13, Charsets.UTF_8), 8192);
                            String strK13 = n8n0.k(bufferedReader3);
                            bufferedReader3.close();
                            vbyVar.getClass();
                            list17 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(pu10.Companion.serializer(), (byte) 0)), strK13)).b;
                            if (list17 != null) {
                                ArrayList arrayListH4 = sj3.H0(d7x.K(list17, list16, true));
                                arrayList5 = new ArrayList();
                                it3 = arrayListH4.iterator();
                                while (it3.hasNext()) {
                                    w3d.u(arrayList5, ((zlb) it3.next()).c);
                                }
                            } else {
                                arrayList5 = null;
                            }
                            if (arrayList5 == null) {
                                obj4 = iun.f15405a;
                            } else {
                                obj4 = arrayList5;
                            }
                            if (obj4 != kj60Var) {
                                list18 = (List) obj4;
                                emuVar.i = null;
                                emuVar.j = null;
                                emuVar.k = list14;
                                emuVar.l = list13;
                                emuVar.m = list16;
                                emuVar.n = list18;
                                emuVar.r = 7;
                                serializableQ = uiiVar.q(true, emuVar);
                                if (serializableQ != kj60Var) {
                                    List list318 = list16;
                                    list19 = list18;
                                    obj4 = serializableQ;
                                    list20 = list13;
                                    list21 = list318;
                                    list22 = (List) obj4;
                                    emuVar.i = null;
                                    emuVar.j = null;
                                    emuVar.k = list14;
                                    emuVar.l = list20;
                                    emuVar.m = list21;
                                    emuVar.n = list19;
                                    emuVar.o = list22;
                                    emuVar.r = 8;
                                    serializableQ2 = uiiVar.q(false, emuVar);
                                    if (serializableQ2 != kj60Var) {
                                        List list319 = list14;
                                        list23 = list22;
                                        obj4 = serializableQ2;
                                        list24 = list21;
                                        list25 = list20;
                                        list26 = list19;
                                        list27 = list319;
                                        kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                                    }
                                }
                            }
                        }
                        return kj60Var;
                    case 5:
                        List list40 = emuVar.l;
                        List list41 = emuVar.k;
                        z1x.P(obj4);
                        knf0Var = knf0Var2;
                        list14 = list41;
                        list13 = list40;
                        list16 = (List) obj4;
                        emuVar.i = null;
                        emuVar.j = null;
                        emuVar.k = list14;
                        emuVar.l = list13;
                        emuVar.m = list16;
                        emuVar.r = 6;
                        if (knf0Var.e()) {
                            str10 = "mocks/onboarding/liveTopChamps_ru.json";
                        } else {
                            str10 = "mocks/onboarding/liveTopChamps_en.json";
                        }
                        InputStream inputStreamOpen14 = us00Var.getAssets().open(str10);
                        inputStreamOpen14.getClass();
                        bufferedReader3 = new BufferedReader(new InputStreamReader(inputStreamOpen14, Charsets.UTF_8), 8192);
                        String strK14 = n8n0.k(bufferedReader3);
                        bufferedReader3.close();
                        vbyVar.getClass();
                        list17 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(pu10.Companion.serializer(), (byte) 0)), strK14)).b;
                        if (list17 != null) {
                            ArrayList arrayListH5 = sj3.H0(d7x.K(list17, list16, true));
                            arrayList5 = new ArrayList();
                            it3 = arrayListH5.iterator();
                            while (it3.hasNext()) {
                                w3d.u(arrayList5, ((zlb) it3.next()).c);
                            }
                        } else {
                            arrayList5 = null;
                        }
                        if (arrayList5 == null) {
                            obj4 = iun.f15405a;
                        } else {
                            obj4 = arrayList5;
                        }
                        if (obj4 != kj60Var) {
                            list18 = (List) obj4;
                            emuVar.i = null;
                            emuVar.j = null;
                            emuVar.k = list14;
                            emuVar.l = list13;
                            emuVar.m = list16;
                            emuVar.n = list18;
                            emuVar.r = 7;
                            serializableQ = uiiVar.q(true, emuVar);
                            if (serializableQ != kj60Var) {
                                List list3110 = list16;
                                list19 = list18;
                                obj4 = serializableQ;
                                list20 = list13;
                                list21 = list3110;
                                list22 = (List) obj4;
                                emuVar.i = null;
                                emuVar.j = null;
                                emuVar.k = list14;
                                emuVar.l = list20;
                                emuVar.m = list21;
                                emuVar.n = list19;
                                emuVar.o = list22;
                                emuVar.r = 8;
                                serializableQ2 = uiiVar.q(false, emuVar);
                                if (serializableQ2 != kj60Var) {
                                    List list3111 = list14;
                                    list23 = list22;
                                    obj4 = serializableQ2;
                                    list24 = list21;
                                    list25 = list20;
                                    list26 = list19;
                                    list27 = list3111;
                                    kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                                }
                            }
                        }
                        return kj60Var;
                    case 6:
                        list16 = emuVar.m;
                        list13 = emuVar.l;
                        list14 = emuVar.k;
                        z1x.P(obj4);
                        list18 = (List) obj4;
                        emuVar.i = null;
                        emuVar.j = null;
                        emuVar.k = list14;
                        emuVar.l = list13;
                        emuVar.m = list16;
                        emuVar.n = list18;
                        emuVar.r = 7;
                        serializableQ = uiiVar.q(true, emuVar);
                        if (serializableQ != kj60Var) {
                            List list3112 = list16;
                            list19 = list18;
                            obj4 = serializableQ;
                            list20 = list13;
                            list21 = list3112;
                            list22 = (List) obj4;
                            emuVar.i = null;
                            emuVar.j = null;
                            emuVar.k = list14;
                            emuVar.l = list20;
                            emuVar.m = list21;
                            emuVar.n = list19;
                            emuVar.o = list22;
                            emuVar.r = 8;
                            serializableQ2 = uiiVar.q(false, emuVar);
                            if (serializableQ2 != kj60Var) {
                                List list3113 = list14;
                                list23 = list22;
                                obj4 = serializableQ2;
                                list24 = list21;
                                list25 = list20;
                                list26 = list19;
                                list27 = list3113;
                                kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                            }
                        }
                        return kj60Var;
                    case 7:
                        list19 = emuVar.n;
                        list21 = emuVar.m;
                        list20 = emuVar.l;
                        list14 = emuVar.k;
                        z1x.P(obj4);
                        list22 = (List) obj4;
                        emuVar.i = null;
                        emuVar.j = null;
                        emuVar.k = list14;
                        emuVar.l = list20;
                        emuVar.m = list21;
                        emuVar.n = list19;
                        emuVar.o = list22;
                        emuVar.r = 8;
                        serializableQ2 = uiiVar.q(false, emuVar);
                        if (serializableQ2 != kj60Var) {
                            List list3114 = list14;
                            list23 = list22;
                            obj4 = serializableQ2;
                            list24 = list21;
                            list25 = list20;
                            list26 = list19;
                            list27 = list3114;
                            kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                        }
                        return kj60Var;
                    case 8:
                        List list42 = emuVar.o;
                        List list43 = emuVar.n;
                        List list44 = emuVar.m;
                        list25 = emuVar.l;
                        List list45 = emuVar.k;
                        z1x.P(obj4);
                        list26 = list43;
                        list24 = list44;
                        list27 = list45;
                        list23 = list42;
                        kj60Var = new kj60(list24, list27, list25, list26, list23, (List) obj4);
                        return kj60Var;
                    default:
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object y(zje zjeVar, String str, List list) {
        fnt fntVar;
        List list2;
        List list3;
        ArrayList arrayList;
        Iterator it;
        mlr mlrVar;
        Iterator it2;
        Object next;
        pxy pxyVar;
        long jCurrentTimeMillis;
        List<pxy> list4 = list;
        if (zjeVar instanceof fnt) {
            fntVar = (fnt) zjeVar;
            int i = fntVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fntVar.m = i - Integer.MIN_VALUE;
            } else {
                fntVar = new fnt(this, zjeVar);
            }
        } else {
            fntVar = new fnt(this, zjeVar);
        }
        fnt fntVar2 = fntVar;
        Object objD = fntVar2.k;
        wne wneVar = wne.f39444a;
        int i2 = fntVar2.m;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objD);
            dn0 dn0Var = (dn0) this.c;
            ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                axq.t(((pxy) it3.next()).f27779a, arrayList2);
            }
            Set setP0 = CollectionsKt.P0(arrayList2);
            boolean zA = ((j1q0) this.d).f15748a.a();
            fntVar2.i = list4;
            fntVar2.m = 1;
            objD = dn0Var.d(setP0, zA, str, false, true, fntVar2);
            if (objD != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            list4 = fntVar2.i;
            z1x.P(objD);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = fntVar2.j;
            list4 = fntVar2.i;
            z1x.P(objD);
        }
        list2 = list3;
        arrayList = new ArrayList(r3d.q(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
            mlrVar = (mlr) it.next();
            it2 = list4.iterator();
            do {
                if (it2.hasNext()) {
                    next = obj;
                    break;
                }
                next = it2.next();
            } while (((pxy) next).f27779a != mlrVar.f22006a);
            pxyVar = (pxy) next;
            if (pxyVar != null) {
                jCurrentTimeMillis = pxyVar.c;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            arrayList.add(new kxy(jCurrentTimeMillis, new js0(mlrVar.f22006a, mlrVar.c, mlrVar.b, mlrVar.l, mlrVar.m, mlrVar.n, mlrVar.f, mlrVar.g, mlrVar.e)));
            it = it;
            obj = null;
        }
        return CollectionsKt.A0(arrayList, new e3l((byte) 20));
        list2 = (List) objD;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            axq.t(((mlr) it4.next()).f22006a, arrayList4);
        }
        for (pxy pxyVar2 : list4) {
            if (!arrayList4.contains(new Long(pxyVar2.f27779a))) {
                axq.t(pxyVar2.f27779a, arrayList3);
            }
        }
        if (!arrayList3.isEmpty()) {
            svu svuVar = (svu) this.b;
            fntVar2.i = list4;
            fntVar2.j = list2;
            fntVar2.m = 2;
            if (svuVar.c(arrayList3, fntVar2) != wneVar) {
                list3 = list2;
                list2 = list3;
            }
            return wneVar;
        }
        arrayList = new ArrayList(r3d.q(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
            mlrVar = (mlr) it.next();
            it2 = list4.iterator();
            do {
                if (it2.hasNext()) {
                    next = obj;
                    break;
                }
                next = it2.next();
            } while (((pxy) next).f27779a != mlrVar.f22006a);
            pxyVar = (pxy) next;
            if (pxyVar != null) {
                jCurrentTimeMillis = pxyVar.c;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            arrayList.add(new kxy(jCurrentTimeMillis, new js0(mlrVar.f22006a, mlrVar.c, mlrVar.b, mlrVar.l, mlrVar.m, mlrVar.n, mlrVar.f, mlrVar.g, mlrVar.e)));
            it = it;
            obj = null;
        }
        return CollectionsKt.A0(arrayList, new e3l((byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object z(boolean z, String str, c3c0 c3c0Var, long j, zje zjeVar) {
        ksu ksuVar;
        boolean z2;
        String str2;
        c3c0 c3c0Var2;
        long j2;
        if (zjeVar instanceof ksu) {
            ksuVar = (ksu) zjeVar;
            int i = ksuVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ksuVar.o = i - Integer.MIN_VALUE;
            } else {
                ksuVar = new ksu(this, zjeVar);
            }
        } else {
            ksuVar = new ksu(this, zjeVar);
        }
        Object objX = ksuVar.m;
        wne wneVar = wne.f39444a;
        int i2 = ksuVar.o;
        if (i2 == 0) {
            z1x.P(objX);
            ehf0 ehf0Var = (ehf0) this.d;
            ksuVar.j = str;
            ksuVar.k = c3c0Var;
            ksuVar.i = z;
            ksuVar.l = j;
            ksuVar.o = 1;
            objX = ehf0Var.x(ksuVar);
            if (objX == wneVar) {
                return wneVar;
            }
            z2 = z;
            str2 = str;
            c3c0Var2 = c3c0Var;
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = ksuVar.l;
            z2 = ksuVar.i;
            c3c0 c3c0Var3 = ksuVar.k;
            String str3 = ksuVar.j;
            z1x.P(objX);
            c3c0Var2 = c3c0Var3;
            str2 = str3;
        }
        return aoq.c(((uzc) this.b).c(), new jsu(null, this, j2, z2, str2, c3c0Var2, (List) objX));
    }

    public lhf0(gdu gduVar, f8u f8uVar, nt ntVar, gl5 gl5Var) {
        this.f20053a = (byte) 2;
        this.b = gduVar;
        this.c = f8uVar;
        this.d = ntVar;
    }

    public lhf0(g45 g45Var, wyt wytVar, k7u k7uVar) {
        this.f20053a = (byte) 24;
        wytVar.getClass();
        k7uVar.getClass();
        this.b = g45Var;
        this.c = wytVar;
        this.d = k7uVar;
    }

    public /* synthetic */ lhf0(Object obj, Object obj2, Object obj3, byte b) {
        this.f20053a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public lhf0(svu svuVar, dn0 dn0Var, j1q0 j1q0Var) {
        this.f20053a = (byte) 20;
        j1q0Var.getClass();
        this.b = svuVar;
        this.c = dn0Var;
        this.d = j1q0Var;
    }

    public lhf0(m0o0 m0o0Var, kki kkiVar, m1e m1eVar) {
        this.f20053a = (byte) 0;
        m1eVar.getClass();
        this.b = m0o0Var;
        this.c = kkiVar;
        this.d = m1eVar;
    }

    public lhf0(gm80 gm80Var, Function2 function2) {
        this.f20053a = (byte) 5;
        this.b = new cyu((byte) 3);
        this.c = gm80Var;
        this.d = function2;
    }

    public lhf0(rrc rrcVar, us00 us00Var, knf0 knf0Var) {
        this.f20053a = (byte) 4;
        knf0Var.getClass();
        this.b = us00Var;
        this.c = knf0Var;
        this.d = ((OnexDatabase) rrcVar.b).i();
    }

    public lhf0(uzc uzcVar, gxu gxuVar, ehf0 ehf0Var) {
        this.f20053a = (byte) 28;
        uzcVar.getClass();
        this.b = uzcVar;
        this.c = gxuVar;
        this.d = ehf0Var;
    }

    public lhf0(mne mneVar, chf0 chf0Var, knf0 knf0Var) {
        this.f20053a = (byte) 9;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = chf0Var;
        this.d = knf0Var;
    }

    public lhf0(mne mneVar, ehf0 ehf0Var, knf0 knf0Var) {
        this.f20053a = (byte) 11;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = ehf0Var;
        this.d = knf0Var;
    }

    public lhf0(khf0 khf0Var, knf0 knf0Var, mne mneVar) {
        this.f20053a = (byte) 3;
        knf0Var.getClass();
        this.b = khf0Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public lhf0(yqc yqcVar) {
        this.f20053a = (byte) 6;
        this.c = new Object();
        this.b = yqcVar;
    }

    public lhf0(cad cadVar, ctf0 ctf0Var) {
        this.f20053a = (byte) 13;
        this.b = ctf0Var;
        this.c = cadVar;
        this.d = new yei(this, (byte) 3);
    }

    public lhf0(gii0 gii0Var, knf0 knf0Var, ntu ntuVar) {
        this.f20053a = (byte) 14;
        this.b = ntuVar;
        this.c = gii0Var;
        this.d = knf0Var;
    }

    public lhf0(dgu dguVar, xak xakVar, muj mujVar, Set set) {
        this.f20053a = (byte) 17;
        this.b = xakVar;
        this.c = dguVar;
        this.d = mujVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            E(str, 0, str.length(), 1, true, new fhn((byte) 5, str, false));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lhf0(String str, byte b) {
        this.f20053a = b;
        switch (b) {
            case 7:
                iun iunVar = iun.f15405a;
                iunVar.getClass();
                this.b = str;
                this.c = iunVar;
                break;
            default:
                String strConcat = "ExoPlayer:Loader:".concat(str);
                String str2 = vtt0.f38024a;
                this(new gff0(Executors.newSingleThreadExecutor(new pqd(strConcat, (byte) 1)), new hny((byte) 6)));
                break;
        }
    }

    public lhf0(gff0 gff0Var) {
        this.f20053a = (byte) 1;
        this.b = gff0Var;
    }

    public lhf0(xvj xvjVar, a4a0 a4a0Var) {
        this.f20053a = (byte) 15;
        this.d = xvjVar;
        this.b = new HashMap();
        this.c = a4a0Var;
    }
}
