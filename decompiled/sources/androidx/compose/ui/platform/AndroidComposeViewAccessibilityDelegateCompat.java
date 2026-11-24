package androidx.compose.ui.platform;

import a.a9q0;
import a.bbi0;
import a.cs0;
import a.dy40;
import a.e7z;
import a.ey40;
import a.f3k;
import a.fy40;
import a.gkx;
import a.gnk0;
import a.hkx;
import a.hny;
import a.hz40;
import a.iz40;
import a.j83;
import a.jge0;
import a.k7;
import a.k7x;
import a.lm40;
import a.lx3;
import a.m51;
import a.m6;
import a.mai0;
import a.mc;
import a.mkx;
import a.nai0;
import a.ne60;
import a.ne80;
import a.o9q0;
import a.oe80;
import a.ok50;
import a.p6;
import a.p8a;
import a.pah0;
import a.pe80;
import a.phu0;
import a.pkx;
import a.px2;
import a.q99;
import a.qai0;
import a.qf00;
import a.qx2;
import a.qx3;
import a.r6;
import a.rdx;
import a.rx2;
import a.s460;
import a.sx2;
import a.t9f;
import a.t9h0;
import a.tai0;
import a.uai0;
import a.ucg0;
import a.ux2;
import a.v1h0;
import a.v4i0;
import a.vai0;
import a.vcc;
import a.vtb;
import a.w03;
import a.w1;
import a.wdr;
import a.wfg0;
import a.x1x;
import a.xai0;
import a.xd2;
import a.xdr;
import a.xz40;
import a.yjj0;
import a.ywu;
import a.yzj;
import a.zai0;
import a.zjx;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "La/p6;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "a/sx2", "a/rx2", "a/ny9", "a/qx2", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat extends p6 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final MutableIntList o1;
    public final fy40 A;
    public final dy40 B;
    public final dy40 Y;
    public final String Z;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final px2 f;
    public final String f1;
    public final AccessibilityManager g;
    public final ywu g1;
    public long h;
    public final ey40 h1;
    public List i;
    public uai0 i1;
    public final rx2 j;
    public boolean j1;
    public int k;
    public final dy40 k1;
    public int l;
    public final w1 l1;
    public k7 m;
    public final ArrayList m1;
    public k7 n;
    public final px2 n1;
    public boolean o;
    public final ey40 p;
    public final ey40 q;
    public final gnk0 r;
    public final gnk0 s;
    public int t;
    public Integer u;
    public final lx3 v;
    public final q99 w;
    public boolean x;
    public sx2 y;
    public ey40 z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        MutableIntList mutableIntList = IntListKt.f45341a;
        MutableIntList mutableIntList2 = new MutableIntList(32);
        int i = mutableIntList2.b;
        if (i < 0) {
            v4i0.m("");
            return;
        }
        int i2 = i + 32;
        mutableIntList2.b(i2);
        int[] iArr2 = mutableIntList2.f45342a;
        int i3 = mutableIntList2.b;
        if (i != i3) {
            qx3.d(i2, i, i3, iArr2, iArr2);
        }
        qx3.h(i, 0, 12, iArr, iArr2);
        mutableIntList2.b += 32;
        o1 = mutableIntList2;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        byte b = 0;
        this.f = new px2(this, b);
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.g = (AccessibilityManager) systemService;
        this.h = 100L;
        new Handler(Looper.getMainLooper());
        this.j = new rx2(this, b);
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.p = new ey40();
        this.q = new ey40();
        this.r = new gnk0(0);
        this.s = new gnk0(0);
        this.t = -1;
        this.v = new lx3(0);
        this.w = vtb.d(1, null, null, 6);
        this.x = true;
        ey40 ey40Var = hkx.f13229a;
        ey40Var.getClass();
        this.z = ey40Var;
        this.A = new fy40();
        this.B = new dy40();
        this.Y = new dy40();
        this.Z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.g1 = new ywu((byte) 29);
        this.h1 = new ey40();
        this.i1 = new uai0(androidComposeView.getSemanticsOwner().a(), ey40Var);
        int i = zjx.f44502a;
        this.k1 = new dy40();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.l1 = new w1((Object) this, (byte) 2);
        this.m1 = new ArrayList();
        this.n1 = new px2(this, (byte) 1);
    }

    public static /* synthetic */ void E(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.D(i, i2, num, null);
    }

    public static Rect L(x1x x1xVar, float f, float f2) {
        if (!(x1xVar instanceof oe80) && !(x1xVar instanceof pe80)) {
            return null;
        }
        jge0 jge0VarC = x1xVar.C();
        return new Rect((int) (jge0VarC.f16474a + f), (int) (jge0VarC.b + f2), (int) (jge0VarC.c + f), (int) (jge0VarC.d + f2));
    }

    public static float[] N(x1x x1xVar) {
        if (!(x1xVar instanceof pe80)) {
            return null;
        }
        wfg0 wfg0Var = ((pe80) x1xVar).f26840a;
        long j = wfg0Var.h;
        long j2 = wfg0Var.g;
        long j3 = wfg0Var.f;
        long j4 = wfg0Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(x1x x1xVar, float f, float f2) {
        if (x1xVar instanceof ne80) {
            ne80 ne80Var = (ne80) x1xVar;
            jge0 jge0VarL = ne80Var.C().l(f, f2);
            Region region = new Region(new Rect((int) (jge0VarL.f16474a + 0.0f), (int) (jge0VarL.b + 0.0f), (int) (jge0VarL.c + 0.0f), (int) (jge0VarL.d + 0.0f)));
            Region region2 = new Region();
            w03 w03Var = ne80Var.f23373a;
            if (w03Var instanceof w03) {
                Path path = w03Var.f38329a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            v4i0.p("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(tai0 tai0Var) {
        j83 j83Var;
        if (tai0Var != null) {
            nai0 nai0Var = tai0Var.d;
            hz40 hz40Var = nai0Var.f23193a;
            zai0 zai0Var = xai0.f40557a;
            if (hz40Var.c(zai0Var)) {
                return qf00.a((List) nai0Var.c(zai0Var), Separators.COMMA, null, 62);
            }
            zai0 zai0Var2 = xai0.G;
            if (hz40Var.c(zai0Var2)) {
                Object objG = hz40Var.g(zai0Var2);
                if (objG == null) {
                    objG = null;
                }
                j83 j83Var2 = (j83) objG;
                if (j83Var2 != null) {
                    return j83Var2.b;
                }
            } else {
                Object objG2 = hz40Var.g(xai0.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (j83Var = (j83) CollectionsKt.firstOrNull(list)) != null) {
                    return j83Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean x(t9h0 t9h0Var, float f) {
        Function0 function0 = t9h0Var.f33563a;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) t9h0Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(t9h0 t9h0Var) {
        Function0 function0 = t9h0Var.f33563a;
        boolean z = t9h0Var.c;
        if (((Number) function0.invoke()).floatValue() <= 0.0f || z) {
            return ((Number) function0.invoke()).floatValue() < ((Number) t9h0Var.b.invoke()).floatValue() && z;
        }
        return true;
    }

    public static final boolean z(t9h0 t9h0Var) {
        Function0 function0 = t9h0Var.f33563a;
        boolean z = t9h0Var.c;
        if (((Number) function0.invoke()).floatValue() >= ((Number) t9h0Var.b.invoke()).floatValue() || z) {
            return ((Number) function0.invoke()).floatValue() > 0.0f && z;
        }
        return true;
    }

    public final int A(int i) {
        if (i == this.d.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(tai0 tai0Var, uai0 uai0Var) {
        int[] iArr = pkx.f27156a;
        fy40 fy40Var = new fy40();
        List listI = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
        e7z e7zVar = tai0Var.c;
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            tai0 tai0Var2 = (tai0) listI.get(i);
            gkx gkxVarS = s();
            int i2 = tai0Var2.f;
            if (gkxVarS.a(i2)) {
                if (!uai0Var.b.c(i2)) {
                    w(e7zVar);
                    return;
                }
                fy40Var.a(i2);
            }
        }
        fy40 fy40Var2 = uai0Var.b;
        int[] iArr2 = fy40Var2.b;
        long[] jArr = fy40Var2.f10343a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !fy40Var.c(iArr2[(i3 << 3) + i5])) {
                            w(e7zVar);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listI2 = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            tai0 tai0Var3 = (tai0) listI2.get(i6);
            uai0 uai0Var2 = (uai0) this.h1.b(tai0Var3.f);
            if (uai0Var2 != null && s().a(tai0Var3.f)) {
                B(tai0Var3, uai0Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.o = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.o = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(qf00.a(list, Separators.COMMA, null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        sx2 sx2Var = this.y;
        if (sx2Var != null) {
            tai0 tai0Var = (tai0) sx2Var.f;
            if (i != tai0Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - sx2Var.b <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(tai0Var.f), 131072);
                accessibilityEventO.setFromIndex(sx2Var.d);
                accessibilityEventO.setToIndex(sx2Var.e);
                accessibilityEventO.setAction(sx2Var.f32952a);
                accessibilityEventO.setMovementGranularity(sx2Var.c);
                accessibilityEventO.getText().add(t(tai0Var));
                C(accessibilityEventO);
            }
        }
        this.y = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0254  */
    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:105:0x0292  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02de  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:130:0x0308  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0312  */
    /* JADX WARN: Code duplicated, block: B:138:0x031f A[LOOP:4: B:133:0x030e->B:138:0x031f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x032d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0341 A[LOOP:5: B:141:0x0329->B:146:0x0341, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0367  */
    /* JADX WARN: Code duplicated, block: B:158:0x0372  */
    /* JADX WARN: Code duplicated, block: B:163:0x039a  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:172:0x03df  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:175:0x0401  */
    /* JADX WARN: Code duplicated, block: B:177:0x0407  */
    /* JADX WARN: Code duplicated, block: B:186:0x044f  */
    /* JADX WARN: Code duplicated, block: B:190:0x045e  */
    /* JADX WARN: Code duplicated, block: B:255:0x053e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0551 A[LOOP:6: B:254:0x053c->B:258:0x0551, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x0562  */
    /* JADX WARN: Code duplicated, block: B:265:0x056f  */
    /* JADX WARN: Code duplicated, block: B:269:0x057d  */
    /* JADX WARN: Code duplicated, block: B:295:0x065f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0328 A[EDGE_INSN: B:318:0x0328->B:140:0x0328 BREAK  A[LOOP:4: B:133:0x030e->B:138:0x031f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0346 A[EDGE_INSN: B:319:0x0346->B:148:0x0346 BREAK  A[LOOP:5: B:141:0x0329->B:146:0x0341], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x021b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0243  */
    /* JADX WARN: Code duplicated, block: B:96:0x024b  */
    /* JADX WARN: Code duplicated, block: B:98:0x024f  */
    public final void H(gkx gkxVar) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        nai0 nai0Var;
        tai0 tai0Var;
        int i8;
        int i9;
        int i10;
        int i11;
        hz40 hz40Var;
        e7z e7zVar;
        int i12;
        nai0 nai0Var2;
        long j;
        int i13;
        int i14;
        Integer num5;
        pah0 pah0Var;
        boolean z;
        zai0 zai0Var;
        int i15;
        zai0 zai0Var2;
        zai0 zai0Var3;
        String str;
        zai0 zai0Var4;
        int size;
        int i16;
        pah0 pah0Var2;
        Object objG;
        Object objG2;
        wdr wdrVar;
        int i17;
        int i18;
        Object objG3;
        j83 j83Var;
        String str2;
        Object objG4;
        j83 j83Var2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceP;
        int length;
        int length2;
        int i19;
        Integer num6;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zC;
        boolean z2;
        boolean z3;
        AccessibilityEvent accessibilityEventP;
        Object objG6;
        ucg0 ucg0Var;
        Object objG7;
        AccessibilityEvent accessibilityEventO;
        Object objG8;
        String strA;
        Object objG9;
        List list;
        String strA2;
        String str3;
        boolean zC2;
        int i24;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        gkx gkxVar2 = gkxVar;
        Integer num7 = 64;
        ArrayList arrayList5 = androidComposeViewAccessibilityDelegateCompat.m1;
        ArrayList arrayList6 = new ArrayList(arrayList5);
        arrayList5.clear();
        int[] iArr3 = gkxVar2.b;
        long[] jArr3 = gkxVar2.f11466a;
        int i25 = 2;
        int length3 = jArr3.length - 2;
        int i26 = 0;
        Integer num8 = 0;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j2 = jArr3[i27];
            int i28 = i25;
            int i29 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j3 = j2;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j3 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        uai0 uai0Var = (uai0) androidComposeViewAccessibilityDelegateCompat.h1.b(i33);
                        if (uai0Var == null) {
                            i3 = i32;
                            num3 = num7;
                            arrayList3 = arrayList6;
                            arrayList4 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i31;
                            i5 = i26;
                            i6 = i27;
                            num4 = num8;
                            i7 = i30;
                        } else {
                            nai0 nai0Var3 = uai0Var.f35330a;
                            hz40 hz40Var2 = nai0Var3.f23193a;
                            vai0 vai0Var = (vai0) gkxVar2.b(i33);
                            int i34 = i30;
                            tai0 tai0Var2 = vai0Var != null ? vai0Var.f37089a : null;
                            if (tai0Var2 == null) {
                                throw cs0.g("no value for specified key");
                            }
                            e7z e7zVar2 = tai0Var2.c;
                            nai0 nai0Var4 = tai0Var2.d;
                            iArr2 = iArr3;
                            int i35 = tai0Var2.f;
                            jArr2 = jArr3;
                            hz40 hz40Var3 = nai0Var4.f23193a;
                            i6 = i27;
                            Object[] objArr = hz40Var3.b;
                            Object[] objArr2 = hz40Var3.c;
                            long[] jArr4 = hz40Var3.f13891a;
                            i3 = i32;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                e7z e7zVar3 = e7zVar2;
                                i4 = i31;
                                int i36 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i36];
                                    tai0 tai0Var3 = tai0Var2;
                                    int i37 = i36;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j4 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length4;
                                                Object obj2 = objArr2[i40];
                                                nai0Var2 = nai0Var3;
                                                zai0 zai0Var5 = (zai0) obj;
                                                j = j4;
                                                zai0 zai0Var6 = xai0.v;
                                                if (Intrinsics.d(zai0Var5, zai0Var6) || Intrinsics.d(zai0Var5, xai0.w)) {
                                                    int size2 = arrayList6.size();
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size2) {
                                                            pah0Var = null;
                                                            break;
                                                        }
                                                        int i43 = size2;
                                                        if (((pah0) arrayList6.get(i42)).f26654a == i33) {
                                                            pah0Var = (pah0) arrayList6.get(i42);
                                                            break;
                                                        } else {
                                                            i42++;
                                                            size2 = i43;
                                                        }
                                                    }
                                                    if (pah0Var != null) {
                                                        z = false;
                                                    } else {
                                                        pah0Var = new pah0(i33, arrayList5);
                                                        z = true;
                                                    }
                                                    arrayList5.add(pah0Var);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    zai0Var = xai0.d;
                                                    if (Intrinsics.d(zai0Var5, zai0Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zC2 = hz40Var2.c(zai0Var);
                                                        i24 = i34;
                                                        if (zC2) {
                                                            androidComposeViewAccessibilityDelegateCompat.F(i33, i24, str3);
                                                        }
                                                    } else {
                                                        i15 = i34;
                                                        if (Intrinsics.d(zai0Var5, xai0.b)) {
                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num7, i15);
                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, i15);
                                                        } else if (Intrinsics.d(zai0Var5, xai0.L)) {
                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, 8192, 8);
                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                        } else if (Intrinsics.d(zai0Var5, xai0.O)) {
                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, 3072, 8);
                                                        } else if (Intrinsics.d(zai0Var5, xai0.c)) {
                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num7, 8);
                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                        } else {
                                                            zai0Var2 = xai0.K;
                                                            arrayList6 = arrayList6;
                                                            if (Intrinsics.d(zai0Var5, zai0Var2)) {
                                                                objG6 = hz40Var3.g(xai0.z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                ucg0Var = (ucg0) objG6;
                                                                if (ucg0Var == null && ucg0Var.f35427a == 4) {
                                                                    objG7 = hz40Var3.g(zai0Var2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (Intrinsics.d(objG7, Boolean.TRUE)) {
                                                                        accessibilityEventO = androidComposeViewAccessibilityDelegateCompat.o(androidComposeViewAccessibilityDelegateCompat.A(i33), 4);
                                                                        tai0Var3 = tai0Var3;
                                                                        e7zVar3 = e7zVar3;
                                                                        tai0 tai0Var4 = new tai0(tai0Var3.f33613a, true, e7zVar3, nai0Var4);
                                                                        objG8 = tai0Var4.k().f23193a.g(xai0.f40557a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list2 = (List) objG8;
                                                                        strA = list2 != null ? qf00.a(list2, Separators.COMMA, null, 62) : null;
                                                                        objG9 = tai0Var4.k().f23193a.g(xai0.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        list = (List) objG9;
                                                                        if (list != null) {
                                                                            strA2 = qf00.a(list, Separators.COMMA, null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventO.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventO.getText().add(strA2);
                                                                        }
                                                                        androidComposeViewAccessibilityDelegateCompat.C(accessibilityEventO);
                                                                    } else {
                                                                        e7zVar3 = e7zVar3;
                                                                        tai0Var3 = tai0Var3;
                                                                        E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    e7zVar3 = e7zVar3;
                                                                    tai0Var3 = tai0Var3;
                                                                    E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num7, 8);
                                                                    E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                                }
                                                                num5 = num8;
                                                                i14 = i33;
                                                                hz40Var2 = hz40Var2;
                                                                num7 = num7;
                                                                arrayList5 = arrayList5;
                                                                i13 = i41;
                                                            } else {
                                                                arrayList5 = arrayList5;
                                                                e7zVar3 = e7zVar3;
                                                                tai0Var3 = tai0Var3;
                                                                i38 = i38;
                                                                if (Intrinsics.d(zai0Var5, xai0.f40557a)) {
                                                                    int iA = androidComposeViewAccessibilityDelegateCompat.A(i33);
                                                                    obj2.getClass();
                                                                    androidComposeViewAccessibilityDelegateCompat.D(iA, 2048, 4, (List) obj2);
                                                                    num5 = num8;
                                                                    i14 = i33;
                                                                    hz40Var2 = hz40Var2;
                                                                    num7 = num7;
                                                                } else {
                                                                    zai0Var3 = xai0.G;
                                                                    str = "";
                                                                    if (Intrinsics.d(zai0Var5, zai0Var3)) {
                                                                        if (hz40Var3.c(mai0.k)) {
                                                                            objG4 = hz40Var2.g(zai0Var3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            j83Var2 = (j83) objG4;
                                                                            if (j83Var2 == null) {
                                                                                j83Var2 = "";
                                                                            }
                                                                            objG5 = hz40Var3.g(zai0Var3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (j83) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceP = P(charSequence);
                                                                            length = j83Var2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i19 = length2;
                                                                            } else {
                                                                                i19 = length;
                                                                            }
                                                                            num6 = num8;
                                                                            i20 = 0;
                                                                            while (true) {
                                                                                num7 = num7;
                                                                                if (i20 < i19) {
                                                                                    i21 = length;
                                                                                    break;
                                                                                }
                                                                                i21 = length;
                                                                                if (j83Var2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                length = i21;
                                                                                num7 = num7;
                                                                            }
                                                                            i22 = 0;
                                                                            while (true) {
                                                                                if (i22 < i19 - i20) {
                                                                                    i23 = i22;
                                                                                    break;
                                                                                }
                                                                                i23 = i22;
                                                                                if (j83Var2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                    break;
                                                                                } else {
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                            }
                                                                            int i44 = (i21 - i23) - i20;
                                                                            int i45 = (length2 - i23) - i20;
                                                                            zai0 zai0Var7 = xai0.N;
                                                                            boolean zC3 = hz40Var2.c(zai0Var7);
                                                                            boolean zC4 = hz40Var3.c(zai0Var7);
                                                                            zC = hz40Var2.c(xai0.G);
                                                                            if (zC || zC3 || !zC4) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (zC || !zC3 || zC4) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (!z2 || z3) {
                                                                                i14 = i33;
                                                                                num8 = num6;
                                                                                accessibilityEventP = androidComposeViewAccessibilityDelegateCompat.p(androidComposeViewAccessibilityDelegateCompat.A(i33), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                            } else {
                                                                                accessibilityEventP = androidComposeViewAccessibilityDelegateCompat.o(androidComposeViewAccessibilityDelegateCompat.A(i33), 16);
                                                                                accessibilityEventP.setFromIndex(i20);
                                                                                accessibilityEventP.setRemovedCount(i44);
                                                                                accessibilityEventP.setAddedCount(i45);
                                                                                accessibilityEventP.setBeforeText(j83Var2);
                                                                                accessibilityEventP.getText().add(charSequenceP);
                                                                                i14 = i33;
                                                                                num8 = num6;
                                                                            }
                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                qx2.b(tai0Var3, accessibilityEventP);
                                                                            }
                                                                            androidComposeViewAccessibilityDelegateCompat.C(accessibilityEventP);
                                                                            if (z2 || z3) {
                                                                                long j5 = ((o9q0) nai0Var4.c(xai0.H)).f24893a;
                                                                                accessibilityEventP.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventP.setToIndex((int) (j5 & 4294967295L));
                                                                                androidComposeViewAccessibilityDelegateCompat.C(accessibilityEventP);
                                                                            }
                                                                        } else {
                                                                            i14 = i33;
                                                                            hz40Var2 = hz40Var2;
                                                                            num7 = num7;
                                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i14), 2048, Integer.valueOf(i28), 8);
                                                                        }
                                                                        num5 = num8;
                                                                    } else {
                                                                        i14 = i33;
                                                                        hz40Var2 = hz40Var2;
                                                                        num7 = num7;
                                                                        i13 = i41;
                                                                        zai0Var4 = xai0.H;
                                                                        if (Intrinsics.d(zai0Var5, zai0Var4)) {
                                                                            objG3 = hz40Var3.g(zai0Var3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            j83Var = (j83) objG3;
                                                                            if (j83Var != null && (str2 = j83Var.b) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((o9q0) nai0Var4.c(zai0Var4)).f24893a;
                                                                            num5 = num8;
                                                                            androidComposeViewAccessibilityDelegateCompat = this;
                                                                            androidComposeViewAccessibilityDelegateCompat.C(androidComposeViewAccessibilityDelegateCompat.p(androidComposeViewAccessibilityDelegateCompat.A(i14), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                            androidComposeViewAccessibilityDelegateCompat.G(i35);
                                                                        } else {
                                                                            num5 = num8;
                                                                            if (!Intrinsics.d(zai0Var5, zai0Var6) || Intrinsics.d(zai0Var5, xai0.w)) {
                                                                                androidComposeViewAccessibilityDelegateCompat.w(e7zVar3);
                                                                                size = arrayList5.size();
                                                                                i16 = 0;
                                                                                while (true) {
                                                                                    if (i16 >= size) {
                                                                                        arrayList5 = arrayList5;
                                                                                        pah0Var2 = null;
                                                                                        break;
                                                                                    }
                                                                                    arrayList5 = arrayList5;
                                                                                    if (((pah0) arrayList5.get(i16)).f26654a == i14) {
                                                                                        pah0Var2 = (pah0) arrayList5.get(i16);
                                                                                        break;
                                                                                    } else {
                                                                                        i16++;
                                                                                        arrayList5 = arrayList5;
                                                                                    }
                                                                                }
                                                                                pah0Var2.getClass();
                                                                                objG = hz40Var3.g(zai0Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                pah0Var2.e = (t9h0) objG;
                                                                                objG2 = hz40Var3.g(xai0.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                pah0Var2.f = (t9h0) objG2;
                                                                                if (pah0Var2.b.contains(pah0Var2)) {
                                                                                    androidComposeViewAccessibilityDelegateCompat.d.getSnapshotObserver().f7752a.d(pah0Var2, androidComposeViewAccessibilityDelegateCompat.n1, new mc((Object) pah0Var2, (Object) androidComposeViewAccessibilityDelegateCompat, (byte) 23));
                                                                                }
                                                                            } else if (Intrinsics.d(zai0Var5, xai0.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i18 = 8;
                                                                                    androidComposeViewAccessibilityDelegateCompat.C(androidComposeViewAccessibilityDelegateCompat.o(androidComposeViewAccessibilityDelegateCompat.A(i35), 8));
                                                                                } else {
                                                                                    i18 = 8;
                                                                                }
                                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i35), 2048, num5, i18);
                                                                            } else {
                                                                                zai0 zai0Var8 = mai0.x;
                                                                                if (Intrinsics.d(zai0Var5, zai0Var8)) {
                                                                                    List list3 = (List) nai0Var4.c(zai0Var8);
                                                                                    Object objG10 = hz40Var2.g(zai0Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        iz40 iz40Var = v1h0.f36630a;
                                                                                        iz40 iz40Var2 = new iz40();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            hny.b();
                                                                                            return;
                                                                                        }
                                                                                        iz40 iz40Var3 = new iz40();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            hny.b();
                                                                                            return;
                                                                                        }
                                                                                        i17 = (i10 == 0 && iz40Var2.equals(iz40Var3)) ? 0 : 1;
                                                                                    } else {
                                                                                        i17 = (i10 == 0 && list3.isEmpty()) ? 0 : 1;
                                                                                    }
                                                                                    i10 = i17;
                                                                                } else if (i10 == 0 && (obj2 instanceof m6)) {
                                                                                    m6 m6Var = (m6) obj2;
                                                                                    Object objG11 = hz40Var2.g(zai0Var5);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (m6Var != objG11) {
                                                                                        if (objG11 instanceof m6) {
                                                                                            String str4 = m6Var.f21241a;
                                                                                            m6 m6Var2 = (m6) objG11;
                                                                                            wdr wdrVar2 = m6Var2.b;
                                                                                            if (Intrinsics.d(str4, m6Var2.f21241a) && (((wdrVar = m6Var.b) != null || wdrVar2 == null) && (wdrVar == null || wdrVar2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        i10 = 1;
                                                                                    }
                                                                                    i10 = 0;
                                                                                } else {
                                                                                    i10 = 1;
                                                                                }
                                                                                arrayList5 = arrayList5;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i13 = i41;
                                                            }
                                                        }
                                                    }
                                                    i13 = i41;
                                                } else {
                                                    Object objG12 = hz40Var2.g(zai0Var5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (!Intrinsics.d(obj2, objG12)) {
                                                        zai0Var = xai0.d;
                                                        if (Intrinsics.d(zai0Var5, zai0Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zC2 = hz40Var2.c(zai0Var);
                                                            i24 = i34;
                                                            if (zC2) {
                                                                androidComposeViewAccessibilityDelegateCompat.F(i33, i24, str3);
                                                            }
                                                        } else {
                                                            i15 = i34;
                                                            if (Intrinsics.d(zai0Var5, xai0.b)) {
                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num7, i15);
                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, i15);
                                                            } else if (Intrinsics.d(zai0Var5, xai0.L)) {
                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, 8192, 8);
                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                            } else if (Intrinsics.d(zai0Var5, xai0.O)) {
                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, 3072, 8);
                                                            } else if (Intrinsics.d(zai0Var5, xai0.c)) {
                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num7, 8);
                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                            } else {
                                                                zai0Var2 = xai0.K;
                                                                arrayList6 = arrayList6;
                                                                if (Intrinsics.d(zai0Var5, zai0Var2)) {
                                                                    objG6 = hz40Var3.g(xai0.z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    ucg0Var = (ucg0) objG6;
                                                                    if (ucg0Var == null) {
                                                                        e7zVar3 = e7zVar3;
                                                                        tai0Var3 = tai0Var3;
                                                                        E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num7, 8);
                                                                        E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                                    } else {
                                                                        objG7 = hz40Var3.g(zai0Var2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        if (Intrinsics.d(objG7, Boolean.TRUE)) {
                                                                            accessibilityEventO = androidComposeViewAccessibilityDelegateCompat.o(androidComposeViewAccessibilityDelegateCompat.A(i33), 4);
                                                                            tai0Var3 = tai0Var3;
                                                                            e7zVar3 = e7zVar3;
                                                                            tai0 tai0Var5 = new tai0(tai0Var3.f33613a, true, e7zVar3, nai0Var4);
                                                                            objG8 = tai0Var5.k().f23193a.g(xai0.f40557a);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            List list5 = (List) objG8;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objG9 = tai0Var5.k().f23193a.g(xai0.C);
                                                                            if (objG9 == null) {
                                                                                objG9 = null;
                                                                            }
                                                                            list = (List) objG9;
                                                                            if (list != null) {
                                                                                strA2 = qf00.a(list, Separators.COMMA, null, 62);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventO.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventO.getText().add(strA2);
                                                                            }
                                                                            androidComposeViewAccessibilityDelegateCompat.C(accessibilityEventO);
                                                                        } else {
                                                                            e7zVar3 = e7zVar3;
                                                                            tai0Var3 = tai0Var3;
                                                                            E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i33), 2048, num8, 8);
                                                                        }
                                                                    }
                                                                    num5 = num8;
                                                                    i14 = i33;
                                                                    hz40Var2 = hz40Var2;
                                                                    num7 = num7;
                                                                    arrayList5 = arrayList5;
                                                                    i13 = i41;
                                                                } else {
                                                                    arrayList5 = arrayList5;
                                                                    e7zVar3 = e7zVar3;
                                                                    tai0Var3 = tai0Var3;
                                                                    i38 = i38;
                                                                    if (Intrinsics.d(zai0Var5, xai0.f40557a)) {
                                                                        int iA2 = androidComposeViewAccessibilityDelegateCompat.A(i33);
                                                                        obj2.getClass();
                                                                        androidComposeViewAccessibilityDelegateCompat.D(iA2, 2048, 4, (List) obj2);
                                                                        num5 = num8;
                                                                        i14 = i33;
                                                                        hz40Var2 = hz40Var2;
                                                                        num7 = num7;
                                                                    } else {
                                                                        zai0Var3 = xai0.G;
                                                                        str = "";
                                                                        if (Intrinsics.d(zai0Var5, zai0Var3)) {
                                                                            if (hz40Var3.c(mai0.k)) {
                                                                                objG4 = hz40Var2.g(zai0Var3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                j83Var2 = (j83) objG4;
                                                                                if (j83Var2 == null) {
                                                                                    j83Var2 = "";
                                                                                }
                                                                                objG5 = hz40Var3.g(zai0Var3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (j83) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceP = P(charSequence);
                                                                                length = j83Var2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i19 = length2;
                                                                                } else {
                                                                                    i19 = length;
                                                                                }
                                                                                num6 = num8;
                                                                                i20 = 0;
                                                                                while (true) {
                                                                                    num7 = num7;
                                                                                    if (i20 < i19) {
                                                                                        i21 = length;
                                                                                        break;
                                                                                    }
                                                                                    i21 = length;
                                                                                    if (j83Var2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i20++;
                                                                                        length = i21;
                                                                                        num7 = num7;
                                                                                    }
                                                                                }
                                                                                i22 = 0;
                                                                                while (true) {
                                                                                    if (i22 < i19 - i20) {
                                                                                        i23 = i22;
                                                                                        break;
                                                                                    }
                                                                                    i23 = i22;
                                                                                    if (j83Var2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                                int i46 = (i21 - i23) - i20;
                                                                                int i47 = (length2 - i23) - i20;
                                                                                zai0 zai0Var9 = xai0.N;
                                                                                boolean zC5 = hz40Var2.c(zai0Var9);
                                                                                boolean zC6 = hz40Var3.c(zai0Var9);
                                                                                zC = hz40Var2.c(xai0.G);
                                                                                if (zC) {
                                                                                    z2 = false;
                                                                                } else {
                                                                                    z2 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (z2) {
                                                                                    i14 = i33;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = androidComposeViewAccessibilityDelegateCompat.p(androidComposeViewAccessibilityDelegateCompat.A(i33), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                } else {
                                                                                    i14 = i33;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = androidComposeViewAccessibilityDelegateCompat.p(androidComposeViewAccessibilityDelegateCompat.A(i33), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                }
                                                                                accessibilityEventP.setClassName("android.widget.EditText");
                                                                                if (Build.VERSION.SDK_INT >= 37) {
                                                                                    qx2.b(tai0Var3, accessibilityEventP);
                                                                                }
                                                                                androidComposeViewAccessibilityDelegateCompat.C(accessibilityEventP);
                                                                                if (z2) {
                                                                                    long j7 = ((o9q0) nai0Var4.c(xai0.H)).f24893a;
                                                                                    accessibilityEventP.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j7 & 4294967295L));
                                                                                    androidComposeViewAccessibilityDelegateCompat.C(accessibilityEventP);
                                                                                } else {
                                                                                    long j8 = ((o9q0) nai0Var4.c(xai0.H)).f24893a;
                                                                                    accessibilityEventP.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j8 & 4294967295L));
                                                                                    androidComposeViewAccessibilityDelegateCompat.C(accessibilityEventP);
                                                                                }
                                                                            } else {
                                                                                i14 = i33;
                                                                                hz40Var2 = hz40Var2;
                                                                                num7 = num7;
                                                                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i14), 2048, Integer.valueOf(i28), 8);
                                                                            }
                                                                            num5 = num8;
                                                                        } else {
                                                                            i14 = i33;
                                                                            hz40Var2 = hz40Var2;
                                                                            num7 = num7;
                                                                            i13 = i41;
                                                                            zai0Var4 = xai0.H;
                                                                            if (Intrinsics.d(zai0Var5, zai0Var4)) {
                                                                                objG3 = hz40Var3.g(zai0Var3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                j83Var = (j83) objG3;
                                                                                if (j83Var != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((o9q0) nai0Var4.c(zai0Var4)).f24893a;
                                                                                num5 = num8;
                                                                                androidComposeViewAccessibilityDelegateCompat = this;
                                                                                androidComposeViewAccessibilityDelegateCompat.C(androidComposeViewAccessibilityDelegateCompat.p(androidComposeViewAccessibilityDelegateCompat.A(i14), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                                androidComposeViewAccessibilityDelegateCompat.G(i35);
                                                                            } else {
                                                                                num5 = num8;
                                                                                if (Intrinsics.d(zai0Var5, zai0Var6)) {
                                                                                    androidComposeViewAccessibilityDelegateCompat.w(e7zVar3);
                                                                                    size = arrayList5.size();
                                                                                    i16 = 0;
                                                                                    while (true) {
                                                                                        if (i16 >= size) {
                                                                                            arrayList5 = arrayList5;
                                                                                            pah0Var2 = null;
                                                                                            break;
                                                                                        }
                                                                                        arrayList5 = arrayList5;
                                                                                        if (((pah0) arrayList5.get(i16)).f26654a == i14) {
                                                                                            pah0Var2 = (pah0) arrayList5.get(i16);
                                                                                            break;
                                                                                        } else {
                                                                                            i16++;
                                                                                            arrayList5 = arrayList5;
                                                                                        }
                                                                                    }
                                                                                    pah0Var2.getClass();
                                                                                    objG = hz40Var3.g(zai0Var6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    pah0Var2.e = (t9h0) objG;
                                                                                    objG2 = hz40Var3.g(xai0.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    pah0Var2.f = (t9h0) objG2;
                                                                                    if (pah0Var2.b.contains(pah0Var2)) {
                                                                                        androidComposeViewAccessibilityDelegateCompat.d.getSnapshotObserver().f7752a.d(pah0Var2, androidComposeViewAccessibilityDelegateCompat.n1, new mc((Object) pah0Var2, (Object) androidComposeViewAccessibilityDelegateCompat, (byte) 23));
                                                                                    }
                                                                                } else {
                                                                                    androidComposeViewAccessibilityDelegateCompat.w(e7zVar3);
                                                                                    size = arrayList5.size();
                                                                                    i16 = 0;
                                                                                    while (true) {
                                                                                        if (i16 >= size) {
                                                                                            arrayList5 = arrayList5;
                                                                                            pah0Var2 = null;
                                                                                            break;
                                                                                        }
                                                                                        arrayList5 = arrayList5;
                                                                                        if (((pah0) arrayList5.get(i16)).f26654a == i14) {
                                                                                            pah0Var2 = (pah0) arrayList5.get(i16);
                                                                                            break;
                                                                                        } else {
                                                                                            i16++;
                                                                                            arrayList5 = arrayList5;
                                                                                        }
                                                                                    }
                                                                                    pah0Var2.getClass();
                                                                                    objG = hz40Var3.g(zai0Var6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    pah0Var2.e = (t9h0) objG;
                                                                                    objG2 = hz40Var3.g(xai0.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    pah0Var2.f = (t9h0) objG2;
                                                                                    if (pah0Var2.b.contains(pah0Var2)) {
                                                                                        androidComposeViewAccessibilityDelegateCompat.d.getSnapshotObserver().f7752a.d(pah0Var2, androidComposeViewAccessibilityDelegateCompat.n1, new mc((Object) pah0Var2, (Object) androidComposeViewAccessibilityDelegateCompat, (byte) 23));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i13 = i41;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i13 = i41;
                                                }
                                                i34 = 8;
                                                i33 = i14;
                                                hz40Var2 = hz40Var2;
                                                e7zVar3 = e7zVar3;
                                                i38 = i38;
                                                arrayList5 = arrayList5;
                                                i39++;
                                                tai0Var3 = tai0Var3;
                                                nai0Var3 = nai0Var2;
                                                j4 = j >> 8;
                                                length4 = i13;
                                                num8 = num5;
                                                arrayList6 = arrayList6;
                                                num7 = num7;
                                            } else {
                                                nai0Var2 = nai0Var3;
                                                j = j4;
                                                i39 = i39;
                                                i13 = length4;
                                            }
                                            num5 = num8;
                                            i14 = i33;
                                            i38 = i38;
                                            hz40Var2 = hz40Var2;
                                            i34 = 8;
                                            i33 = i14;
                                            hz40Var2 = hz40Var2;
                                            e7zVar3 = e7zVar3;
                                            i38 = i38;
                                            arrayList5 = arrayList5;
                                            i39++;
                                            tai0Var3 = tai0Var3;
                                            nai0Var3 = nai0Var2;
                                            j4 = j >> 8;
                                            length4 = i13;
                                            num8 = num5;
                                            arrayList6 = arrayList6;
                                            num7 = num7;
                                        }
                                        nai0Var = nai0Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList5;
                                        int i48 = i38;
                                        e7zVar = e7zVar3;
                                        tai0Var = tai0Var3;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num8;
                                        i9 = i33;
                                        hz40Var = hz40Var2;
                                        i5 = 0;
                                        if (i48 != i34) {
                                            break;
                                        }
                                    } else {
                                        nai0Var = nai0Var3;
                                        hz40Var = hz40Var2;
                                        num3 = num7;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList5;
                                        e7zVar = e7zVar3;
                                        tai0Var = tai0Var3;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num8;
                                        i9 = i33;
                                        i5 = 0;
                                    }
                                    if (i37 == i12) {
                                        break;
                                    }
                                    num8 = num4;
                                    i33 = i9;
                                    hz40Var2 = hz40Var;
                                    e7zVar3 = e7zVar;
                                    arrayList6 = arrayList3;
                                    i34 = 8;
                                    i36 = i37 + 1;
                                    arrayList5 = arrayList4;
                                    length4 = i12;
                                    tai0Var2 = tai0Var;
                                    nai0Var3 = nai0Var;
                                    num7 = num3;
                                }
                            } else {
                                nai0Var = nai0Var3;
                                num3 = num7;
                                arrayList3 = arrayList6;
                                arrayList4 = arrayList5;
                                i4 = i31;
                                tai0Var = tai0Var2;
                                i8 = 1;
                                num4 = num8;
                                i9 = i33;
                                i5 = 0;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = nai0Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    } else {
                                        if (!tai0Var.k().f23193a.c((zai0) ((Map.Entry) it.next()).getKey())) {
                                            i11 = i8;
                                            break;
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                i7 = 8;
                                E(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.A(i9), 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    } else {
                        i3 = i32;
                        num3 = num7;
                        arrayList3 = arrayList6;
                        arrayList4 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i31;
                        i5 = i26;
                        i6 = i27;
                        num4 = num8;
                        i7 = i30;
                    }
                    j3 >>= i7;
                    i32 = i3 + 1;
                    gkxVar2 = gkxVar;
                    i26 = i5;
                    arrayList5 = arrayList4;
                    num8 = num4;
                    i30 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i6;
                    i31 = i4;
                    arrayList6 = arrayList3;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                int i49 = i27;
                num2 = num8;
                if (i31 != i30) {
                    return;
                } else {
                    i2 = i49;
                }
            } else {
                num = num7;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                num2 = num8;
                i2 = i27;
            }
            if (i2 == i29) {
                return;
            }
            i27 = i2 + 1;
            gkxVar2 = gkxVar;
            length3 = i29;
            i26 = i;
            arrayList5 = arrayList2;
            num8 = num2;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList6 = arrayList;
            num7 = num;
        }
    }

    public final void I(e7z e7zVar, fy40 fy40Var) {
        nai0 nai0VarX;
        if (e7zVar.I() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(e7zVar)) {
            e7z e7zVar2 = null;
            if (!e7zVar.h1.j(8)) {
                e7zVar = e7zVar.v();
                while (true) {
                    if (e7zVar == null) {
                        e7zVar = null;
                        break;
                    } else if (e7zVar.h1.j(8)) {
                        break;
                    } else {
                        e7zVar = e7zVar.v();
                    }
                }
            }
            if (e7zVar == null || (nai0VarX = e7zVar.x()) == null) {
                return;
            }
            if (!nai0VarX.c) {
                for (e7z e7zVarV = e7zVar.v(); e7zVarV != null; e7zVarV = e7zVarV.v()) {
                    nai0 nai0VarX2 = e7zVarV.x();
                    if (nai0VarX2 != null && nai0VarX2.c) {
                        e7zVar2 = e7zVarV;
                        break;
                    }
                }
                if (e7zVar2 != null) {
                    e7zVar = e7zVar2;
                }
            }
            int i = e7zVar.b;
            if (fy40Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(e7z e7zVar) {
        if (e7zVar.I() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(e7zVar)) {
            int i = e7zVar.b;
            t9h0 t9h0Var = (t9h0) this.p.b(i);
            t9h0 t9h0Var2 = (t9h0) this.q.b(i);
            if (t9h0Var == null && t9h0Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (t9h0Var != null) {
                accessibilityEventO.setScrollX((int) ((Number) t9h0Var.f33563a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) t9h0Var.b.invoke()).floatValue());
            }
            if (t9h0Var2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) t9h0Var2.f33563a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) t9h0Var2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(tai0 tai0Var, int i, int i2, boolean z) {
        String strT;
        nai0 nai0Var = tai0Var.d;
        int i3 = tai0Var.f;
        zai0 zai0Var = mai0.j;
        if (nai0Var.f23193a.c(zai0Var) && p8a.P(tai0Var)) {
            xdr xdrVar = (xdr) ((m6) tai0Var.d.c(zai0Var)).b;
            if (xdrVar != null) {
                return ((Boolean) xdrVar.F(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.t) && (strT = t(tai0Var)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.t = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        AndroidComposeView androidComposeView = this.d;
        long jR = androidComposeView.r(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jR2 = androidComposeView.r((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jR >> 32);
        int i2 = (int) (jR2 >> 32);
        int i3 = (int) (jR & 4294967295L);
        int i4 = (int) (jR2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        uai0 uai0Var;
        fy40 fy40Var = new fy40();
        fy40 fy40Var2 = this.A;
        int[] iArr = fy40Var2.b;
        long[] jArr3 = fy40Var2.f10343a;
        int length = jArr3.length - 2;
        ey40 ey40Var = this.h1;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            vai0 vai0Var = (vai0) s().b(i6);
                            Object obj = null;
                            tai0 tai0Var = vai0Var != null ? vai0Var.f37089a : null;
                            if (tai0Var != null) {
                                if (!tai0Var.d.f23193a.c(xai0.d)) {
                                    fy40Var.a(i6);
                                    uai0Var = (uai0) ey40Var.b(i6);
                                    if (uai0Var != null) {
                                        Object objG = uai0Var.f35330a.f23193a.g(xai0.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(i6, 32, obj);
                                }
                            } else {
                                fy40Var.a(i6);
                                uai0Var = (uai0) ey40Var.b(i6);
                                if (uai0Var != null) {
                                    Object objG2 = uai0Var.f35330a.f23193a.g(xai0.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = fy40Var.b;
        long[] jArr4 = fy40Var.f10343a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10);
                            int i11 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
                            int i12 = i11 ^ (i11 >>> 16);
                            int i13 = i12 & 127;
                            int i14 = fy40Var2.c;
                            int i15 = (i12 >>> 7) & i14;
                            i = i2;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = fy40Var2.f10343a;
                                int i17 = i15 >> 3;
                                jArr2 = jArr4;
                                int i18 = (i15 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                int i19 = i14;
                                long j8 = (((long) i13) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
                                    int i20 = i19;
                                    if (fy40Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i19 = i20;
                                }
                                int i21 = i19;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i16 += 8;
                                i15 = (i15 + i16) & i21;
                                jArr4 = jArr2;
                                i14 = i21;
                                j6 = j4;
                            }
                            int i22 = iNumberOfTrailingZeros;
                            if (i22 >= 0) {
                                fy40Var2.h(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        ey40Var.c();
        gkx gkxVarS = s();
        int[] iArr3 = gkxVarS.b;
        Object[] objArr = gkxVarS.c;
        long[] jArr6 = gkxVarS.f11466a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            tai0 tai0Var2 = ((vai0) objArr[i26]).f37089a;
                            nai0 nai0Var = tai0Var2.d;
                            zai0 zai0Var = xai0.d;
                            if (nai0Var.f23193a.c(zai0Var) && fy40Var2.a(i27)) {
                                F(i27, 16, (String) tai0Var2.d.c(zai0Var));
                            }
                            ey40Var.j(i27, new uai0(tai0Var2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.i1 = new uai0(this.d.getSemanticsOwner().a(), s());
    }

    @Override // a.p6
    public final ok50 b(View view) {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    public final void j(int i, k7 k7Var, String str, Bundle bundle) {
        tai0 tai0Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        RectF[] rectFArr;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo2 = k7Var.f17795a;
        vai0 vai0Var = (vai0) s().b(i);
        if (vai0Var == null || (tai0Var = vai0Var.f37089a) == null) {
            return;
        }
        e7z e7zVar = tai0Var.c;
        nai0 nai0Var = tai0Var.d;
        hz40 hz40Var = nai0Var.f23193a;
        String strT = t(tai0Var);
        if (Intrinsics.d(str, this.Z)) {
            int iD = this.B.d(i);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (Intrinsics.d(str, this.f1)) {
            int iD2 = this.Y.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = hz40Var.c(mai0.f21459a);
        AndroidComposeView androidComposeView = this.d;
        if (zC && bundle != null && Intrinsics.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                    a9q0 a9q0VarF = x1x.F(nai0Var);
                    if (a9q0VarF == null) {
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        rectFArr = null;
                    } else {
                        rdx rdxVar = (rdx) e7zVar.h1.d;
                        if (!rdxVar.D1.n) {
                            rdxVar = null;
                        }
                        if (rdxVar != null) {
                            long jY = rdxVar.Y(0L);
                            jge0 jge0VarG = tai0Var.g();
                            RectF[] rectFArr2 = new RectF[i4];
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i3 + i5;
                                if (i6 >= a9q0VarF.f491a.f43981a.b.length()) {
                                    i2 = i5;
                                } else {
                                    jge0 jge0VarM = a9q0VarF.b(i6).m(jY);
                                    jge0 jge0VarI = jge0VarM.k(jge0VarG) ? jge0VarM.i(jge0VarG) : null;
                                    if (jge0VarI != null) {
                                        i2 = i5;
                                        long jR = androidComposeView.r((((long) Float.floatToRawIntBits(jge0VarI.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(jge0VarI.f16474a)) << 32));
                                        long jR2 = androidComposeView.r((((long) Float.floatToRawIntBits(jge0VarI.c)) << 32) | (((long) Float.floatToRawIntBits(jge0VarI.d)) & 4294967295L));
                                        int i7 = (int) (jR >> 32);
                                        int i8 = (int) (jR2 >> 32);
                                        int i9 = (int) (jR & 4294967295L);
                                        int i10 = (int) (jR2 & 4294967295L);
                                        rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                                    } else {
                                        i2 = i5;
                                    }
                                }
                                i5 = i2 + 1;
                                i3 = i3;
                                i4 = i4;
                                accessibilityNodeInfo2 = accessibilityNodeInfo2;
                                jge0VarG = jge0VarG;
                            }
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            rectFArr = rectFArr2;
                        } else {
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            rectFArr = null;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        zai0 zai0Var = xai0.A;
        if (hz40Var.c(zai0Var) && bundle != null && Intrinsics.d(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = hz40Var.g(zai0Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (Intrinsics.d(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, tai0Var.f);
            return;
        }
        if (Intrinsics.d(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = hz40Var.g(xai0.S);
            yjj0 yjj0Var = (yjj0) (objG2 == null ? null : objG2);
            if (yjj0Var != null) {
                Rect rect = new Rect();
                k7Var.f(rect);
                jge0 jge0VarU = u(tai0Var, rect, yjj0Var);
                float f = jge0VarU.b;
                float f2 = jge0VarU.f16474a;
                x1x x1xVarA = yjj0Var.a(jge0VarU.f(), e7zVar.A, androidComposeView.getDensity());
                if (x1xVarA instanceof oe80) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(x1xVarA, f2, f));
                    return;
                } else if (x1xVarA instanceof pe80) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(x1xVarA, f2, f));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(x1xVarA));
                    return;
                } else if (!(x1xVarA instanceof ne80)) {
                    t9f.b();
                    return;
                } else {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(x1xVarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.d(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = hz40Var.g(xai0.S);
            yjj0 yjj0Var2 = (yjj0) (objG3 == null ? null : objG3);
            if (yjj0Var2 != null) {
                Rect rect2 = new Rect();
                k7Var.f(rect2);
                jge0 jge0VarU2 = u(tai0Var, rect2, yjj0Var2);
                Rect rectL = L(yjj0Var2.a(jge0VarU2.f(), e7zVar.A, androidComposeView.getDensity()), jge0VarU2.f16474a, jge0VarU2.b);
                if (rectL != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.d(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = hz40Var.g(xai0.S);
            yjj0 yjj0Var3 = (yjj0) (objG4 == null ? null : objG4);
            if (yjj0Var3 != null) {
                Rect rect3 = new Rect();
                k7Var.f(rect3);
                float[] fArrN = N(yjj0Var3.a(u(tai0Var, rect3, yjj0Var3).f(), e7zVar.A, androidComposeView.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.d(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = hz40Var.g(xai0.S);
            yjj0 yjj0Var4 = (yjj0) (objG5 == null ? null : objG5);
            if (yjj0Var4 != null) {
                Rect rect4 = new Rect();
                k7Var.f(rect4);
                jge0 jge0VarU3 = u(tai0Var, rect4, yjj0Var4);
                Region regionO = O(yjj0Var4.a(jge0VarU3.f(), e7zVar.A, androidComposeView.getDensity()), jge0VarU3.f16474a, jge0VarU3.b);
                if (regionO != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(vai0 vai0Var) {
        mkx mkxVar = vai0Var.b;
        return M(mkxVar.f21964a, mkxVar.b, mkxVar.c, mkxVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x0092, LOOP:0: B:34:0x0081->B:35:0x0083, LOOP_END, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:52:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (a.qcc.O(r7, r0) == r1) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(a.zje r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.l(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    public final boolean m(int i, long j, boolean z) {
        zai0 zai0Var;
        int i2;
        if (Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            gkx gkxVarS = s();
            if (!ne60.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    zai0Var = xai0.w;
                } else {
                    if (z) {
                        t9f.b();
                        return false;
                    }
                    zai0Var = xai0.v;
                }
                Object[] objArr = gkxVarS.c;
                long[] jArr = gkxVarS.f11466a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j2 & 255) < 128) {
                                    vai0 vai0Var = (vai0) objArr[(i3 << 3) + i6];
                                    mkx mkxVar = vai0Var.b;
                                    i2 = i4;
                                    float f = mkxVar.f21964a;
                                    float f2 = mkxVar.b;
                                    float f3 = mkxVar.c;
                                    float f4 = mkxVar.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = vai0Var.f37089a.d.f23193a.g(zai0Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        t9h0 t9h0Var = (t9h0) objG;
                                        if (t9h0Var != null) {
                                            boolean z3 = t9h0Var.c;
                                            int i7 = z3 ? -i : i;
                                            if (i == 0 && z3) {
                                                i7 = -1;
                                            }
                                            Function0 function0 = t9h0Var.f33563a;
                                            if (i7 < 0) {
                                                if (((Number) function0.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) function0.invoke()).floatValue() < ((Number) t9h0Var.b.invoke()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.getSemanticsOwner().a(), this.i1);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        vai0 vai0Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (v() && (vai0Var = (vai0) s().b(i)) != null) {
            tai0 tai0Var = vai0Var.f37089a;
            accessibilityEventObtain.setPassword(tai0Var.d.f23193a.c(xai0.N));
            Object objG = tai0Var.d.f23193a.g(xai0.o);
            if (objG == null) {
                objG = null;
            }
            boolean zD = Intrinsics.d(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                r6.o(accessibilityEventObtain, zD);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager.isEnabled()) {
            this.i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.d.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.l1);
        AccessibilityManager accessibilityManager = this.g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(tai0 tai0Var) {
        nai0 nai0Var = tai0Var.d;
        if (!nai0Var.f23193a.c(xai0.f40557a)) {
            zai0 zai0Var = xai0.H;
            if (nai0Var.f23193a.c(zai0Var)) {
                return (int) (((o9q0) nai0Var.c(zai0Var)).f24893a & 4294967295L);
            }
        }
        return this.t;
    }

    public final int r(tai0 tai0Var) {
        nai0 nai0Var = tai0Var.d;
        if (!nai0Var.f23193a.c(xai0.f40557a)) {
            zai0 zai0Var = xai0.H;
            if (nai0Var.f23193a.c(zai0Var)) {
                return (int) (((o9q0) nai0Var.c(zai0Var)).f24893a >> 32);
            }
        }
        return this.t;
    }

    public final gkx s() {
        if (this.x) {
            this.x = false;
            AndroidComposeView androidComposeView = this.d;
            this.z = phu0.I(androidComposeView.getSemanticsOwner(), new xd2((byte) 26));
            if (v()) {
                ey40 ey40Var = this.z;
                Resources resources = androidComposeView.getContext().getResources();
                dy40 dy40Var = this.B;
                dy40Var.a();
                dy40 dy40Var2 = this.Y;
                dy40Var2.a();
                vai0 vai0Var = (vai0) ey40Var.b(-1);
                tai0 tai0Var = vai0Var != null ? vai0Var.f37089a : null;
                tai0Var.getClass();
                ArrayList arrayListB = bbi0.b(tai0Var, new m51(ey40Var, (byte) 27), new m51(resources, (byte) 28), a.c(tai0Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((tai0) arrayListB.get(i - 1)).f;
                        int i3 = ((tai0) arrayListB.get(i)).f;
                        dy40Var.f(i2, i3);
                        dy40Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.z;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final jge0 u(tai0 tai0Var, Rect rect, yjj0 yjj0Var) {
        ux2 ux2Var = new ux2(yjj0Var);
        e7z e7zVar = tai0Var.c;
        lm40 lm40Var = (lm40) e7zVar.h1.g;
        yzj yzjVar = null;
        if ((lm40Var.d & 8) != 0) {
            loop0: while (lm40Var != null) {
                if ((lm40Var.c & 8) == 0) {
                    if ((lm40Var.d & 8) != 0) {
                        break;
                        break;
                    }
                    lm40Var = lm40Var.f;
                } else {
                    lm40 lm40VarV = lm40Var;
                    xz40 xz40Var = null;
                    while (lm40VarV != null) {
                        if (lm40VarV instanceof qai0) {
                            ((qai0) lm40VarV).x0(ux2Var);
                            if (ux2Var.f36420a) {
                                yzjVar = lm40VarV;
                                break loop0;
                            }
                        } else if ((lm40VarV.c & 8) != 0 && (lm40VarV instanceof f3k)) {
                            int i = 0;
                            for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                if ((lm40Var2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lm40VarV = lm40Var2;
                                    } else {
                                        if (xz40Var == null) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (lm40VarV != null) {
                                            xz40Var.b(lm40VarV);
                                            lm40VarV = null;
                                        }
                                        xz40Var.b(lm40Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lm40VarV = vcc.V(xz40Var);
                    }
                    if ((lm40Var.d & 8) != 0) {
                        break;
                    }
                    lm40Var = lm40Var.f;
                }
            }
        }
        yzj yzjVar2 = (qai0) yzjVar;
        if (yzjVar2 == null || !((lm40) yzjVar2).f20279a.n) {
            return k7x.z((s460) e7zVar.h1.e, false);
        }
        s460 s460VarY = vcc.Y(yzjVar2);
        jge0 jge0VarW = k7x.C(s460VarY).w(s460VarY, false);
        Rect rectM = M(jge0VarW.f16474a, jge0VarW.b, jge0VarW.c, jge0VarW.d);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new jge0(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(e7z e7zVar) {
        if (this.v.add(e7zVar)) {
            this.w.f(Unit.f46060a);
        }
    }
}
