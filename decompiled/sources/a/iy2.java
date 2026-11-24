package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iy2 implements qvj, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f15568a;
    public final f8 b;
    public chf0 c;
    public final ArrayList d = new ArrayList();
    public ey2 e = ey2.f8605a;
    public boolean f = true;
    public final q99 g = vtb.d(1, null, null, 6);
    public ey40 h;
    public long i;
    public final ey40 j;
    public uai0 k;
    public boolean l;
    public final w1 m;

    public iy2(AndroidComposeView androidComposeView, f8 f8Var) {
        this.f15568a = androidComposeView;
        this.b = f8Var;
        new Handler(Looper.getMainLooper());
        ey40 ey40Var = hkx.f13229a;
        ey40Var.getClass();
        this.h = ey40Var;
        this.j = new ey40();
        this.k = new uai0(androidComposeView.getSemanticsOwner().a(), ey40Var);
        this.m = new w1((Object) this, (byte) 3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (a.qcc.O(100, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.hy2
            if (r0 == 0) goto L13
            r0 = r9
            a.hy2 r0 = (a.hy2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.hy2 r0 = new a.hy2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            a.j99 r2 = r0.i
            a.z1x.P(r9)
        L2b:
            r9 = r2
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L34:
            a.j99 r2 = r0.i
            a.z1x.P(r9)
            goto L52
        L3a:
            a.z1x.P(r9)
            a.j99 r9 = new a.j99
            a.q99 r2 = r8.g
            r9.<init>(r2)
        L44:
            r0.i = r9
            r0.l = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 != r1) goto L4f
            goto L85
        L4f:
            r7 = r2
            r2 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r2.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L66
            r8.e()
        L66:
            androidx.compose.ui.platform.AndroidComposeView r9 = r8.f15568a
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.l
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.l = r4
            a.w1 r5 = r8.m
            r9.post(r5)
        L79:
            r0.i = r2
            r0.l = r3
            r5 = 100
            java.lang.Object r9 = a.qcc.O(r5, r0)
            if (r9 != r1) goto L2b
        L85:
            return r1
        L86:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iy2.a(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void b(gkx gkxVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        gkx gkxVar2 = gkxVar;
        int[] iArr3 = gkxVar2.b;
        long[] jArr = gkxVar2.f11466a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        uai0 uai0Var = (uai0) this.j.b(i7);
                        vai0 vai0Var = (vai0) gkxVar2.b(i7);
                        tai0 tai0Var = vai0Var != null ? vai0Var.f37089a : null;
                        if (tai0Var == null) {
                            throw cs0.g("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = tai0Var.f;
                        hz40 hz40Var = tai0Var.d.f23193a;
                        if (uai0Var == null) {
                            Object[] objArr = hz40Var.b;
                            long[] jArr2 = hz40Var.f13891a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                zai0 zai0Var = (zai0) objArr[(i10 << 3) + i12];
                                                zai0 zai0Var2 = xai0.C;
                                                if (Intrinsics.d(zai0Var, zai0Var2)) {
                                                    Object objG = hz40Var.g(zai0Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    g(i8, String.valueOf(list != null ? (j83) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = hz40Var.b;
                            long[] jArr3 = hz40Var.f13891a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                zai0 zai0Var3 = (zai0) objArr2[(i13 << 3) + i15];
                                                zai0 zai0Var4 = xai0.C;
                                                if (Intrinsics.d(zai0Var3, zai0Var4)) {
                                                    Object objG2 = uai0Var.f35330a.f23193a.g(zai0Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    j83 j83Var = list2 != null ? (j83) CollectionsKt.firstOrNull(list2) : null;
                                                    Object objG3 = hz40Var.g(zai0Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    j83 j83Var2 = list3 != null ? (j83) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.d(j83Var, j83Var2)) {
                                                        g(i8, String.valueOf(j83Var2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    gkxVar2 = gkxVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            gkxVar2 = gkxVar;
            iArr3 = iArr;
        }
    }

    public final gkx c() {
        if (this.f) {
            this.f = false;
            this.h = phu0.I(this.f15568a.getSemanticsOwner(), new xd2((byte) 29));
            this.i = System.currentTimeMillis();
        }
        return this.h;
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void e() {
        chf0 chf0Var = this.c;
        if (chf0Var == null) {
            return;
        }
        Object obj = chf0Var.b;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wde wdeVar = (wde) arrayList.get(i);
            int iOrdinal = wdeVar.c.ordinal();
            if (iOrdinal == 0) {
                rkt0 rkt0Var = wdeVar.d;
                if (rkt0Var != null) {
                    ViewStructure viewStructure = (ViewStructure) rkt0Var.b;
                    if (Build.VERSION.SDK_INT >= 29) {
                        sf3.n(y5a.i(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                AutofillId autofillIdX = chf0Var.X(wdeVar.f38968a);
                if (autofillIdX != null && Build.VERSION.SDK_INT >= 29) {
                    sf3.o(y5a.i(obj), autofillIdX);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionI = y5a.i(obj);
            i7 i7VarG = cvm0.g((View) chf0Var.c);
            Objects.requireNonNull(i7VarG);
            sf3.q(contentCaptureSessionI, y24.c(i7VarG.f14266a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void f(tai0 tai0Var, uai0 uai0Var) {
        sr1 sr1Var = new sr1(uai0Var, this, (byte) 10);
        tai0Var.getClass();
        List listI = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listI.get(i2);
            if (c().a(((tai0) obj).f)) {
                sr1Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listI2 = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tai0 tai0Var2 = (tai0) listI2.get(i3);
            gkx gkxVarC = c();
            int i4 = tai0Var2.f;
            if (gkxVarC.a(i4)) {
                ey40 ey40Var = this.j;
                if (ey40Var.a(i4)) {
                    Object objB = ey40Var.b(i4);
                    if (objB == null) {
                        throw cs0.g("node not present in pruned tree before this change");
                    }
                    f(tai0Var2, (uai0) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i, String str) {
        chf0 chf0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (chf0Var = this.c) != null) {
            AutofillId autofillIdX = chf0Var.X(i);
            if (autofillIdX == null) {
                throw cs0.g("Invalid content capture ID");
            }
            if (i2 >= 29) {
                sf3.p(y5a.i(chf0Var.b), autofillIdX, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void h(int i, tai0 tai0Var) {
        Function1 function1;
        int i2;
        i7 i7VarG;
        AutofillId autofillIdC;
        jge0 jge0VarA;
        rkt0 rkt0Var;
        String strO;
        Function1 function2;
        if (d()) {
            hz40 hz40Var = tai0Var.d.f23193a;
            Object objG = hz40Var.g(xai0.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.e == ey2.f8605a && Intrinsics.d(bool, Boolean.TRUE)) {
                Object objG2 = hz40Var.g(mai0.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                m6 m6Var = (m6) objG2;
                if (m6Var != null && (function2 = (Function1) m6Var.b) != null) {
                }
            } else if (this.e == ey2.b && Intrinsics.d(bool, Boolean.FALSE)) {
                Object objG3 = hz40Var.g(mai0.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                m6 m6Var2 = (m6) objG3;
                if (m6Var2 != null && (function1 = (Function1) m6Var2.b) != null) {
                }
            }
            int i3 = tai0Var.f;
            chf0 chf0Var = this.c;
            if (chf0Var == null || (i2 = Build.VERSION.SDK_INT) < 29 || (i7VarG = cvm0.g(this.f15568a)) == null) {
                rkt0Var = null;
            } else {
                tai0 tai0VarL = tai0Var.l();
                int i4 = tai0Var.f;
                if (tai0VarL != null) {
                    autofillIdC = chf0Var.X(tai0VarL.f);
                    if (autofillIdC == null) {
                        rkt0Var = null;
                    }
                } else {
                    autofillIdC = y24.c(i7VarG.f14266a);
                }
                rkt0 rkt0Var2 = i2 >= 29 ? new rkt0(sf3.m(y5a.i(chf0Var.b), autofillIdC, i4), (byte) 7) : null;
                if (rkt0Var2 == null) {
                    rkt0Var = null;
                } else {
                    ViewStructure viewStructure = (ViewStructure) rkt0Var2.b;
                    nai0 nai0Var = tai0Var.d;
                    zai0 zai0Var = xai0.N;
                    hz40 hz40Var2 = nai0Var.f23193a;
                    if (hz40Var2.c(zai0Var)) {
                        rkt0Var = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.i);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objG4 = hz40Var2.g(xai0.A);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructure.setId(i4, null, null, str);
                        }
                        Object objG5 = hz40Var2.g(xai0.n);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = hz40Var2.g(xai0.C);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(qf00.a(list, Separators.RETURN, null, 62));
                        }
                        Object objG7 = hz40Var2.g(xai0.G);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        j83 j83Var = (j83) objG7;
                        if (j83Var != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(j83Var);
                        }
                        Object objG8 = hz40Var2.g(xai0.f40557a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(qf00.a(list2, Separators.RETURN, null, 62));
                        }
                        Object objG9 = hz40Var2.g(xai0.z);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        ucg0 ucg0Var = (ucg0) objG9;
                        if (ucg0Var != null && (strO = x1x.O(ucg0Var.f35427a)) != null) {
                            viewStructure.setClassName(strO);
                        }
                        a9q0 a9q0VarF = x1x.F(nai0Var);
                        if (a9q0VarF != null) {
                            z8q0 z8q0Var = a9q0VarF.f491a;
                            y9q0 y9q0Var = z8q0Var.b;
                            w6k w6kVar = z8q0Var.g;
                            viewStructure.setTextStyle(w6kVar.v0() * w6kVar.getDensity() * daq0.c(y9q0Var.f42262a.b), 0, 0, 0);
                        }
                        s460 s460VarD = tai0Var.d();
                        if (s460VarD == null) {
                            jge0VarA = jge0.e;
                        } else {
                            s460 s460Var = s460VarD.g1().n ? s460VarD : null;
                            if (s460Var != null) {
                                jge0VarA = tai0Var.a(s460Var);
                            } else {
                                jge0VarA = jge0.e;
                            }
                        }
                        float f = jge0VarA.f16474a;
                        float f2 = jge0VarA.b;
                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (jge0VarA.c - f), (int) (jge0VarA.d - f2));
                        rkt0Var = rkt0Var2;
                    }
                }
            }
            if (rkt0Var != null) {
                this.d.add(new wde(i3, this.i, xde.f40689a, rkt0Var));
            }
            List listI = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listI.get(i6);
                if (c().a(((tai0) obj).f)) {
                    h(i5, (tai0) obj);
                    i5++;
                }
            }
        }
    }

    public final void i(tai0 tai0Var) {
        if (d()) {
            this.d.add(new wde(tai0Var.f, this.i, xde.b, null));
            List listI = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                i((tai0) listI.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void j() {
        ey40 ey40Var = this.j;
        ey40Var.c();
        gkx gkxVarC = c();
        int[] iArr = gkxVarC.b;
        Object[] objArr = gkxVarC.c;
        long[] jArr = gkxVarC.f11466a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            ey40Var.j(iArr[i4], new uai0(((vai0) objArr[i4]).f37089a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.k = new uai0(this.f15568a.getSemanticsOwner().a(), c());
    }

    @Override // a.qvj
    public final void onStart(clz clzVar) {
        this.c = (chf0) this.b.invoke();
        h(-1, this.f15568a.getSemanticsOwner().a());
        e();
    }

    @Override // a.qvj
    public final void onStop(clz clzVar) {
        i(this.f15568a.getSemanticsOwner().a());
        e();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f15568a.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.m);
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
