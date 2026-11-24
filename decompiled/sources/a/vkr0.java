package a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class vkr0 implements rkr0, dfn0, jgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37588a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public vkr0(wut0 wut0Var) {
        this.f37588a = (byte) 7;
        this.b = wut0Var;
        this.c = maz.b(new avt0(this, (byte) 1));
        new ReentrantLock(true);
        ilp0 ilp0Var = new ilp0();
        ilp0Var.f14992a = new AtomicReference();
        this.d = ilp0Var;
        this.e = wut0Var.c;
        this.f = maz.b(new avt0(this, (byte) 0));
        maz.b(new vut0((Object) this, (byte) 24));
    }

    public static vkr0 C(String str, sjw0 sjw0Var, hbb hbbVar, lpw0 lpw0Var, Integer num) throws GeneralSecurityException {
        lpw0 lpw0Var2 = lpw0.e;
        if (num != null && lpw0Var.equals(lpw0Var2)) {
            hny.o("Cannot set idRequirement for OutputPrefixType RAW");
            return null;
        }
        if (num == null && !lpw0Var.equals(lpw0Var2)) {
            hny.o("Cannot have null idRequirement unless OutputPrefixType is RAW");
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("typeURL " + str + " contains non-ascii character at position " + i);
            }
        }
        return new vkr0((Object) str, (Object) sjw0Var, (Object) hbbVar, (Object) lpw0Var, (Object) num, (byte) 14);
    }

    public static void u(vlu0 vlu0Var) {
        ipj0 sharedValues = ConstraintLayout.getSharedValues();
        int i = vlu0Var.u;
        bzs0 bzs0Var = new bzs0((byte) 8);
        HashMap map = sharedValues.f15167a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(bzs0Var));
    }

    public void A(List list) {
        list.getClass();
        kf60 kf60VarM = m();
        kf60VarM.getClass();
        kf60VarM.a(list.toString());
        kf60VarM.c = maz.b(new sz2(list, (byte) 18));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object B(float f, zje zjeVar) {
        huv0 huv0Var;
        h0q0 h0q0Var = (h0q0) this.b;
        trm0 trm0Var = (trm0) this.d;
        if (zjeVar instanceof huv0) {
            huv0Var = (huv0) zjeVar;
            int i = huv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                huv0Var.k = i - Integer.MIN_VALUE;
            } else {
                huv0Var = new huv0(this, zjeVar);
            }
        } else {
            huv0Var = new huv0(this, zjeVar);
        }
        huv0 huv0Var2 = huv0Var;
        Object obj = huv0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = huv0Var2.k;
        Object next = null;
        if (i2 == 0) {
            z1x.P(obj);
            ((hgk0) ((pz40) ((mkt0) this.c).b)).setValue(Boolean.FALSE);
            float fFloatValue = 0.0f;
            List listJ = q3d.j(Float.valueOf(-trm0Var.e()), Float.valueOf(0.0f), Float.valueOf(trm0Var.e()));
            float fFloatValue2 = ((Number) ((t33) this.f).d()).floatValue();
            h0q0Var.m().getClass();
            if (f < -400.0f) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listJ) {
                    if (((Number) obj2).floatValue() < fFloatValue2 - 0.5f) {
                        arrayList.add(obj2);
                    }
                }
                Float fH0 = CollectionsKt.h0(arrayList);
                fFloatValue = fH0 != null ? fH0.floatValue() : ((Number) CollectionsKt.U(listJ)).floatValue();
            } else {
                h0q0Var.m().getClass();
                if (f > 400.0f) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : listJ) {
                        if (((Number) obj3).floatValue() > fFloatValue2 + 0.5f) {
                            arrayList2.add(obj3);
                        }
                    }
                    Float fK0 = CollectionsKt.k0(arrayList2);
                    fFloatValue = fK0 != null ? fK0.floatValue() : ((Number) CollectionsKt.d0(listJ)).floatValue();
                } else {
                    Iterator it = listJ.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            float fAbs = Math.abs(((Number) next).floatValue() - fFloatValue2);
                            do {
                                Object next2 = it.next();
                                float fAbs2 = Math.abs(((Number) next2).floatValue() - fFloatValue2);
                                if (Float.compare(fAbs, fAbs2) > 0) {
                                    next = next2;
                                    fAbs = fAbs2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    Float f2 = (Float) next;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    }
                }
            }
            t33 t33Var = (t33) this.f;
            Float f3 = new Float(fFloatValue);
            nul0 nul0Var = vwv0.f38173a;
            huv0Var2.k = 1;
            if (t33.a(t33Var, f3, nul0Var, null, null, huv0Var2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.dfn0
    public int a(long j) {
        long[] jArr = (long[]) this.c;
        int iB = vtt0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // a.rkr0
    public bn7 b() {
        return ((gkr0) this.d).a();
    }

    @Override // a.rkr0
    public List c() {
        return ((gkr0) this.d).c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:100|29|94|30|102|31|32|98|33|(4:36|92|37|38)|82) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:36|92|37|38) */
    /* JADX WARN: Code duplicated, block: B:100:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:68:0x0168  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0198  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
    
        if (r0 == r5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0111, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        r19 = r10;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0121, code lost:
    
        r19 = r10;
        r9 = r13;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012c, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0137 -> B:28:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x016a -> B:70:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0172 -> B:70:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01b1 -> B:28:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01c1 -> B:70:0x016f). Please report as a decompilation issue!!! */
    @Override // a.rkr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(a.yje r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vkr0.d(a.yje):java.lang.Object");
    }

    @Override // a.dfn0
    public List e(long j) {
        bss0 bss0Var = (bss0) this.b;
        Map map = (Map) this.d;
        HashMap map2 = (HashMap) this.e;
        HashMap map3 = (HashMap) this.f;
        ArrayList<Pair> arrayList = new ArrayList();
        bss0Var.g(j, bss0Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        bss0Var.i(j, false, bss0Var.h, treeMap);
        bss0Var.h(j, map, map2, bss0Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                dss0 dss0Var = (dss0) map2.get(pair.first);
                dss0Var.getClass();
                arrayList2.add(new ctf(null, null, null, bitmapDecodeByteArray, dss0Var.c, 0, dss0Var.e, dss0Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, dss0Var.f, dss0Var.g, false, -16777216, dss0Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            dss0 dss0Var2 = (dss0) map2.get(entry.getKey());
            dss0Var2.getClass();
            btf btfVar = (btf) entry.getValue();
            CharSequence charSequence = btfVar.f3180a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (l6k l6kVar : (l6k[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), l6k.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(l6kVar), spannableStringBuilder.getSpanEnd(l6kVar), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = dss0Var2.c;
            int i9 = dss0Var2.d;
            btfVar.e = f;
            btfVar.f = i9;
            btfVar.g = dss0Var2.e;
            btfVar.h = dss0Var2.b;
            btfVar.l = dss0Var2.f;
            float f2 = dss0Var2.i;
            int i10 = dss0Var2.h;
            btfVar.k = f2;
            btfVar.j = i10;
            btfVar.p = dss0Var2.j;
            arrayList2.add(btfVar.a());
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // a.rkr0
    public Object f(long j, zje zjeVar, String str) {
        ukr0 ukr0Var;
        gkr0 gkr0Var = (gkr0) this.d;
        if (zjeVar instanceof ukr0) {
            ukr0Var = (ukr0) zjeVar;
            int i = ukr0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukr0Var.k = i - Integer.MIN_VALUE;
            } else {
                ukr0Var = new ukr0(this, zjeVar);
            }
        } else {
            ukr0Var = new ukr0(this, zjeVar);
        }
        Object objD = ukr0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ukr0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            owp0 owp0Var = (owp0) this.c;
            String strA = ((btt0) this.b).a();
            Long l = new Long(j);
            Integer num = new Integer(gkr0Var.b().f20312a);
            okr0 okr0Var = (okr0) gkr0Var.b.getValue();
            Long l2 = new Long(okr0Var != null ? okr0Var.c : 0L);
            Map mapA = ((sd80) this.e).a();
            ArrayList arrayList = new ArrayList(mapA.size());
            Iterator it = mapA.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(jtt0.t((Map.Entry) it.next()));
            }
            zkr0 zkr0Var = new zkr0(l, num, l2, arrayList, new Double(0.0d), str);
            ukr0Var.k = 1;
            objD = ((gir0) ((lkr0) owp0Var.b).invoke()).d(strA, zkr0Var, ukr0Var);
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
        return epv0.Z((nu) ((dx5) objD).a());
    }

    @Override // a.rkr0
    public void g() {
        gkr0 gkr0Var = (gkr0) this.d;
        gkr0Var.f11458a.n(null);
        gkr0Var.b.n(null);
        ((sd80) this.e).f32021a.g(new HashMap());
    }

    @Override // a.rkr0
    public Object h(bnn0 bnn0Var) {
        Object objA = ((sd80) this.e).f32021a.a(new HashMap(), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    @Override // a.rkr0
    public Unit i(int i, bnn0 bnn0Var) {
        Unit unitD = ((gkr0) this.d).d(i);
        return unitD == wne.f39444a ? unitD : Unit.f46060a;
    }

    @Override // a.dfn0
    public long j(int i) {
        return ((long[]) this.c)[i];
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:103|27|97|28|93|29|30|105|31|95|32|(4:35|101|36|37)|84) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:35|101|36|37) */
    /* JADX WARN: Code duplicated, block: B:103:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:89:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0131, code lost:
    
        if (r0 == r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0139, code lost:
    
        r21 = r8;
        r8 = r5;
        r4 = r21;
        r9 = r0;
        r0 = r6;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0144, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
    
        r10 = r9;
        r9 = r0;
        r0 = r5;
        r4 = r13;
        r13 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0150, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0151, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0155, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0167 -> B:59:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01f1 -> B:86:0x01f6). Please report as a decompilation issue!!! */
    @Override // a.rkr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r24, java.lang.String r25, int r26, a.yje r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vkr0.k(java.lang.String, java.lang.String, int, a.yje):java.lang.Object");
    }

    @Override // a.dfn0
    public int l() {
        return ((long[]) this.c).length;
    }

    public kf60 m() {
        return (kf60) ((n0o0) this.f).getValue();
    }

    @Override // a.rkr0
    public Object n(HashMap map, bnn0 bnn0Var) {
        Object objA = ((sd80) this.e).f32021a.a(map, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(zje zjeVar) {
        sdv0 sdv0Var;
        if (zjeVar instanceof sdv0) {
            sdv0Var = (sdv0) zjeVar;
            int i = sdv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdv0Var.k = i - Integer.MIN_VALUE;
            } else {
                sdv0Var = new sdv0(this, zjeVar);
            }
        } else {
            sdv0Var = new sdv0(this, zjeVar);
        }
        Object objM = sdv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = sdv0Var.k;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objM);
            tzi tziVar = (tzi) this.e;
            utb utbVarC = aoq.c(((rpt) tziVar.e).e(xvs.LIVE), new o2v((Object) tziVar, yjeVar, (byte) 2));
            pwi pwiVar = (pwi) this.f;
            p6d p6dVar = new p6d(utbVarC, aoq.c(((rpt) pwiVar.c).e(xvs.LINE), new o2v(pwiVar, yjeVar, b)), new y8p(3, yjeVar, (byte) 14), b);
            sdv0Var.k = 1;
            objM = ntb.M(p6dVar, sdv0Var);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        List list = (List) objM;
        return list == null ? iun.f15405a : list;
    }

    @Override // a.rkr0
    public void p() {
        ((gkr0) this.d).b.n(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Serializable q(String str, s77 s77Var, String str2, boolean z, long j, zje zjeVar) {
        qit0 qit0Var;
        String str3;
        boolean z2;
        boolean z3;
        h0q0 h0q0Var;
        sff0 sff0Var;
        int i;
        s77 s77Var2;
        boolean z4;
        String str4;
        boolean z5;
        long j2;
        long j3 = j;
        if (zjeVar instanceof qit0) {
            qit0Var = (qit0) zjeVar;
            int i2 = qit0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qit0Var.v = i2 - Integer.MIN_VALUE;
            } else {
                qit0Var = new qit0(this, zjeVar);
            }
        } else {
            qit0Var = new qit0(this, zjeVar);
        }
        Object objV = qit0Var.t;
        wne wneVar = wne.f39444a;
        int i3 = qit0Var.v;
        if (i3 != 0) {
            if (i3 == 1) {
                boolean z6 = qit0Var.p;
                long j4 = qit0Var.r;
                int i4 = qit0Var.s;
                boolean z7 = qit0Var.o;
                long j5 = qit0Var.q;
                z2 = qit0Var.n;
                h0q0 h0q0Var2 = qit0Var.m;
                String str5 = qit0Var.l;
                s77 s77Var3 = qit0Var.k;
                str3 = qit0Var.j;
                sff0Var = qit0Var.i;
                z1x.P(objV);
                h0q0Var = h0q0Var2;
                z4 = z7;
                i = i4;
                j2 = j4;
                str4 = str5;
                s77Var2 = s77Var3;
                j3 = j5;
                z5 = z6;
                z3 = true;
            } else {
                if (i3 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objV);
            }
            return (n3w) objV;
        }
        z1x.P(objV);
        sff0 sff0VarA = ((pru) this.d).a();
        h0q0 h0q0Var3 = (h0q0) this.b;
        int iA = ((rpt) this.c).a();
        boolean z8 = sff0VarA.f32117a.b.h;
        ocl oclVar = (ocl) this.f;
        qit0Var.i = sff0VarA;
        str3 = str2;
        qit0Var.j = str3;
        qit0Var.k = s77Var;
        qit0Var.l = str;
        qit0Var.m = h0q0Var3;
        qit0Var.n = z;
        qit0Var.q = j3;
        qit0Var.o = z8;
        qit0Var.s = iA;
        qit0Var.r = j3;
        qit0Var.p = z;
        qit0Var.v = 1;
        List listJ = oclVar.j();
        if (listJ == wneVar) {
            return wneVar;
        }
        z2 = z;
        z3 = true;
        h0q0Var = h0q0Var3;
        sff0Var = sff0VarA;
        i = iA;
        objV = listJ;
        s77Var2 = s77Var;
        z4 = z8;
        str4 = str;
        z5 = z2;
        j2 = j3;
        List list = (List) objV;
        boolean z9 = sff0Var.J1;
        boolean z10 = (((yiu) this.e).a() || sff0Var.O1) ? z3 : false;
        qit0Var.i = null;
        qit0Var.j = null;
        qit0Var.k = null;
        qit0Var.l = null;
        qit0Var.m = null;
        qit0Var.n = z2;
        qit0Var.q = j3;
        qit0Var.v = 2;
        objV = h0q0Var.v(str4, s77Var2, str3, z5, j2, i, z4, list, z9, z10, qit0Var);
        if (objV == wneVar) {
            return wneVar;
        }
        return (n3w) objV;
    }

    @Override // a.rkr0
    public lmr0 r() {
        return ((gkr0) this.d).b();
    }

    @Override // a.rkr0
    public Map s() {
        return ((sd80) this.e).a();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public Object t(zje zjeVar) {
        xht0 xht0Var;
        Object g0g0Var;
        long j;
        long j2;
        long j3;
        List list;
        cit0 cit0Var;
        vb9 vb9Var;
        List list2;
        blt0 blt0Var;
        tdv0 tdv0Var;
        boolean z = true;
        yje yjeVar = null;
        switch (this.f37588a) {
            case 4:
                if (zjeVar instanceof xht0) {
                    xht0Var = (xht0) zjeVar;
                    int i = xht0Var.n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xht0Var.n = i - Integer.MIN_VALUE;
                    } else {
                        xht0Var = new xht0(this, zjeVar);
                    }
                } else {
                    xht0Var = new xht0(this, zjeVar);
                }
                xht0 xht0Var2 = xht0Var;
                Object objP = xht0Var2.l;
                wne wneVar = wne.f39444a;
                int i2 = xht0Var2.n;
                if (i2 == 0) {
                    z1x.P(objP);
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        g0g0Var = new Long(((x1u) this.c).a());
                        break;
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Object l = new Long(-1L);
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = l;
                    }
                    long jLongValue = ((Number) g0g0Var).longValue();
                    long jA = jLongValue != -1 ? xru.a((xru) this.d) : 0L;
                    znt zntVar = (znt) this.e;
                    xht0Var2.i = jLongValue;
                    xht0Var2.j = jA;
                    xht0Var2.n = 1;
                    objP = zntVar.f44690a.p(xht0Var2);
                    if (objP != wneVar) {
                        j = jLongValue;
                        j2 = jA;
                    }
                    return wneVar;
                }
                if (i2 == 1) {
                    long j4 = xht0Var2.j;
                    j = xht0Var2.i;
                    z1x.P(objP);
                    j2 = j4;
                } else {
                    if (i2 == 2) {
                        long j5 = xht0Var2.j;
                        j3 = xht0Var2.i;
                        z1x.P(objP);
                        j2 = j5;
                        list = (List) objP;
                        cit0Var = (cit0) CollectionsKt.firstOrNull(list);
                        if (cit0Var != null || (vb9Var = cit0Var.g0) == null) {
                            return list;
                        }
                        g3v g3vVar = (g3v) this.f;
                        xht0Var2.k = list;
                        xht0Var2.i = j3;
                        xht0Var2.j = j2;
                        xht0Var2.n = 3;
                        if (g3vVar.a(vb9Var, xht0Var2) != wneVar) {
                            list2 = list;
                        }
                        return wneVar;
                    }
                    if (i2 != 3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = xht0Var2.k;
                    z1x.P(objP);
                }
                return list2;
                List list3 = (List) objP;
                fht0 fht0Var = (fht0) this.b;
                q4f q4fVar = q4f.l;
                xht0Var2.i = j;
                xht0Var2.j = j2;
                xht0Var2.n = 2;
                long j6 = j;
                objP = fht0Var.i(j6, j2, list3, q4fVar, false, xht0Var2);
                if (objP != wneVar) {
                    j3 = j6;
                    list = (List) objP;
                    cit0Var = (cit0) CollectionsKt.firstOrNull(list);
                    if (cit0Var != null) {
                    }
                    return list;
                }
                return wneVar;
            case 5:
            default:
                if (zjeVar instanceof tdv0) {
                    tdv0Var = (tdv0) zjeVar;
                    int i3 = tdv0Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tdv0Var.k = i3 - Integer.MIN_VALUE;
                    } else {
                        tdv0Var = new tdv0(this, zjeVar);
                    }
                } else {
                    tdv0Var = new tdv0(this, zjeVar);
                }
                Object obj = tdv0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = tdv0Var.k;
                if (i4 == 0) {
                    z1x.P(obj);
                    yzn0 yzn0Var = (yzn0) this.b;
                    tdv0Var.k = 1;
                    if (yzn0Var.l(tdv0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return bkb.h0(60L, TimeUnit.SECONDS, new vmq0(this, yjeVar, (byte) 6));
            case 6:
                if (zjeVar instanceof blt0) {
                    blt0Var = (blt0) zjeVar;
                    int i5 = blt0Var.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        blt0Var.k = i5 - Integer.MIN_VALUE;
                    } else {
                        blt0Var = new blt0(this, zjeVar);
                    }
                } else {
                    blt0Var = new blt0(this, zjeVar);
                }
                Object objA = blt0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = blt0Var.k;
                if (i6 == 0) {
                    z1x.P(objA);
                    kwz kwzVar = ((e5a) this.f).f7224a.c;
                    kwzVar.getClass();
                    kwzVar.h = System.currentTimeMillis();
                    mhu mhuVar = (mhu) this.b;
                    String strA = ((wgu) this.d).a();
                    ucq ucqVar = ((pru) this.c).a().f;
                    blt0Var.k = 1;
                    objA = mhuVar.a(strA, ucqVar, blt0Var);
                    if (objA == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objA);
                }
                List<qcq> list4 = ((lzz) objA).f20926a;
                if (list4 == null || !list4.isEmpty()) {
                    for (qcq qcqVar : list4) {
                        xrz xrzVar = qcqVar.b;
                        if (xrzVar == q8k.DEPOSIT_LIMIT_1_DAY || xrzVar == q8k.DEPOSIT_LIMIT_7_DAY || xrzVar == q8k.DEPOSIT_LIMIT_30_DAY) {
                            if (qcqVar.n) {
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                ((fqu) this.e).f9992a.c.c = z;
                return Unit.f46060a;
        }
    }

    public String toString() {
        String str;
        switch (this.f37588a) {
            case 8:
                String str2 = (String) this.f;
                StringBuilder sb = new StringBuilder("since ");
                sb.append((wbu0) this.b);
                sb.append(' ');
                sb.append((nbk) this.d);
                Integer num = (Integer) this.e;
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(str2 != null ? ": ".concat(str2) : "");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object v(long j, Long l, Long l2, String str, int i, LinkedHashMap linkedHashMap, zje zjeVar) throws Throwable {
        ahs0 ahs0Var;
        Object value;
        ArrayList arrayListN0;
        if (zjeVar instanceof ahs0) {
            ahs0Var = (ahs0) zjeVar;
            int i2 = ahs0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ahs0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ahs0Var = new ahs0(this, zjeVar);
            }
        } else {
            ahs0Var = new ahs0(this, zjeVar);
        }
        ahs0 ahs0Var2 = ahs0Var;
        Object objY = ahs0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = ahs0Var2.k;
        if (i3 == 0) {
            z1x.P(objY);
            ahs0Var2.k = 1;
            objY = y(j, l, l2, str, false, i, linkedHashMap, ahs0Var2);
            if (objY == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objY);
        }
        List list = (List) objY;
        oo ooVar = (oo) this.c;
        ooVar.getClass();
        list.getClass();
        p7m0 p7m0Var = ooVar.f25569a;
        do {
            value = p7m0Var.getValue();
            arrayListN0 = CollectionsKt.N0((List) value);
            arrayListN0.addAll(list);
        } while (!p7m0Var.m(value, arrayListN0));
        return objY;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object w(long j, Long l, Long l2, String str, int i, LinkedHashMap linkedHashMap, zje zjeVar) throws Throwable {
        bhs0 bhs0Var;
        Object value;
        ArrayList arrayListN0;
        if (zjeVar instanceof bhs0) {
            bhs0Var = (bhs0) zjeVar;
            int i2 = bhs0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bhs0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                bhs0Var = new bhs0(this, zjeVar);
            }
        } else {
            bhs0Var = new bhs0(this, zjeVar);
        }
        bhs0 bhs0Var2 = bhs0Var;
        Object objY = bhs0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = bhs0Var2.k;
        if (i3 == 0) {
            z1x.P(objY);
            bhs0Var2.k = 1;
            objY = y(j, l, l2, str, true, i, linkedHashMap, bhs0Var2);
            if (objY == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objY);
        }
        List list = (List) objY;
        hw3 hw3Var = (hw3) this.d;
        hw3Var.getClass();
        list.getClass();
        p7m0 p7m0Var = hw3Var.f13752a;
        do {
            value = p7m0Var.getValue();
            Collection collection = (List) value;
            if (collection == null) {
                collection = iun.f15405a;
            }
            arrayListN0 = CollectionsKt.N0(collection);
            arrayListN0.addAll(list);
        } while (!p7m0Var.m(value, arrayListN0));
        return objY;
    }

    public void x() {
        vne vneVar = (vne) this.c;
        pz40 pz40Var = (pz40) this.d;
        if (vneVar == null || pz40Var == null) {
            return;
        }
        qjj.W(vneVar, null, null, new wbl0(this, pz40Var, null, (byte) 18), 3);
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((jkd0) this.b, (jkd0) this.c, (jkd0) this.d, (jkd0) this.e, (jkd0) this.f, pzuVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(3:(1:(3:13|14|106)(2:15|16))(2:17|132)|92|(27:27|122|28|120|29|30|31|32|33|34|35|36|116|37|38|130|39|40|41|42|126|43|44|124|45|46|(2:48|104)(1:49))(1:(2:111|112)(1:113)))(4:18|114|19|20))(2:25|(27:27|122|28|120|29|30|31|32|33|34|35|36|116|37|38|130|39|40|41|42|126|43|44|124|45|46|(2:48|104)(1:49))(1:(2:111|112)(1:113)))|21|118|50|51|128|52|(3:55|134|53)|133|59) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:27|122|28|120|29|30|31|32|33|34|35|36|116|37|38|130|39|40|41|42|126|43|44|124|45|46|(2:48|104)(1:49)) */
    /* JADX WARN: Code duplicated, block: B:102:0x030a  */
    /* JADX WARN: Code duplicated, block: B:105:0x033a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0359  */
    /* JADX WARN: Code duplicated, block: B:109:0x037f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0396 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0398  */
    /* JADX WARN: Code duplicated, block: B:113:0x039e  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x018f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0192  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c1 A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #7 {all -> 0x01cf, blocks: (B:52:0x01b0, B:53:0x01bb, B:55:0x01c1), top: B:128:0x01b0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x024d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x026b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0274  */
    /* JADX WARN: Code duplicated, block: B:84:0x0276  */
    /* JADX WARN: Code duplicated, block: B:87:0x027b  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:93:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x0303  */
    /* JADX WARN: Code duplicated, block: B:99:0x0305  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d0, code lost:
    
        r1 = r0;
        r28 = r2;
        r2 = r6;
        r6 = r22;
        r7 = r23;
        r0 = r3;
        r33 = r15;
        r29 = r8;
        r8 = r11;
        r9 = r14;
        r11 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ee, code lost:
    
        r21 = r2;
        r19 = r4;
        r22 = r6;
        r23 = r7;
        r24 = r8;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fb, code lost:
    
        r9 = r10;
        r5 = r34;
        r1 = r0;
        r28 = r28;
        r4 = r21;
        r6 = r22;
        r7 = r23;
        r8 = r24;
        r11 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020e, code lost:
    
        r0 = r33;
        r33 = r35;
        r14 = r12;
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0216, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0217, code lost:
    
        r19 = r4;
        r9 = r10;
        r5 = r34;
        r1 = r0;
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        r33 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0233, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0234, code lost:
    
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0238, code lost:
    
        r21 = r2;
        r19 = r4;
        r22 = r6;
        r23 = r7;
        r24 = r8;
        r27 = r11;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x033a -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0267 -> B:26:0x0121). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable y(long r33, java.lang.Long r35, java.lang.Long r36, java.lang.String r37, boolean r38, int r39, java.util.Map r40, a.zje r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vkr0.y(long, java.lang.Long, java.lang.Long, java.lang.String, boolean, int, java.util.Map, a.zje):java.io.Serializable");
    }

    public void z(p35 p35Var, fps0 fps0Var) {
        eps0 eps0Var = (eps0) this.f;
        q55 q55Var = (q55) this.b;
        String str = (String) this.c;
        if (str == null) {
            hny.u("Null transportName");
            return;
        }
        ols0 ols0Var = (ols0) this.e;
        if (ols0Var == null) {
            hny.u("Null transformer");
            return;
        }
        gwn gwnVar = (gwn) this.d;
        swj swjVar = eps0Var.c;
        q55 q55VarB = q55Var.b(p35Var.b);
        ru ruVar = new ru();
        ruVar.f = new HashMap();
        ruVar.d = Long.valueOf(eps0Var.f8202a.getTime());
        ruVar.e = Long.valueOf(eps0Var.b.getTime());
        ruVar.f31100a = str;
        ruVar.c = new zvn(gwnVar, (byte[]) ols0Var.mo11apply(p35Var.f26283a));
        ruVar.b = null;
        t45 t45Var = p35Var.c;
        if (t45Var != null) {
            ruVar.g = t45Var.f33302a;
        }
        swjVar.b.execute(new qx9((Object) swjVar, (Object) q55VarB, (Object) fps0Var, (Object) ruVar.b(), (byte) 2));
    }

    public /* synthetic */ vkr0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f37588a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public vkr0(buv0 buv0Var) {
        this.f37588a = (byte) 11;
        this.b = buv0Var;
        this.f = new k050();
    }

    public vkr0(mhu mhuVar, pru pruVar, wgu wguVar, fqu fquVar, e5a e5aVar) {
        this.f37588a = (byte) 6;
        mhuVar.getClass();
        wguVar.getClass();
        this.b = mhuVar;
        this.c = pruVar;
        this.d = wguVar;
        this.e = fquVar;
        this.f = e5aVar;
    }

    public vkr0(h0q0 h0q0Var, mkt0 mkt0Var) {
        this.f37588a = (byte) 12;
        this.b = h0q0Var;
        this.c = mkt0Var;
        this.d = new trm0((byte) 16);
        this.e = new hcp0(new jmv0(this, (byte) 7));
        this.f = xf0.c(0.0f);
    }

    public vkr0(oo ooVar, hw3 hw3Var, trm0 trm0Var, btt0 btt0Var, kuy kuyVar) {
        this.f37588a = (byte) 1;
        ooVar.getClass();
        hw3Var.getClass();
        btt0Var.getClass();
        kuyVar.getClass();
        this.c = ooVar;
        this.d = hw3Var;
        this.e = trm0Var;
        this.b = btt0Var;
        this.f = kuyVar;
    }

    public vkr0(mne mneVar, btt0 btt0Var, owp0 owp0Var, gkr0 gkr0Var, sd80 sd80Var, knf0 knf0Var) {
        this.f37588a = (byte) 0;
        btt0Var.getClass();
        gkr0Var.getClass();
        sd80Var.getClass();
        knf0Var.getClass();
        this.b = btt0Var;
        this.c = owp0Var;
        this.d = gkr0Var;
        this.e = sd80Var;
        this.f = knf0Var;
    }

    public vkr0(wbu0 wbu0Var, l4d0 l4d0Var, nbk nbkVar, Integer num, String str) {
        this.f37588a = (byte) 8;
        l4d0Var.getClass();
        this.b = wbu0Var;
        this.c = l4d0Var;
        this.d = nbkVar;
        this.e = num;
        this.f = str;
    }

    public vkr0(bss0 bss0Var, HashMap map, HashMap map2, HashMap map3) {
        this.f37588a = (byte) 3;
        this.b = bss0Var;
        this.e = map2;
        this.f = map3;
        this.d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        bss0Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public vkr0(MotionLayout motionLayout) {
        this.f37588a = (byte) 9;
        this.c = new ArrayList();
        this.f = new ArrayList();
        this.b = motionLayout;
    }

    public /* synthetic */ vkr0() {
        this.f37588a = (byte) 13;
    }
}
