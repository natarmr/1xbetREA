package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.Image;
import android.view.View;
import android.view.Window;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class wsf0 implements b040, hg5, zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39689a;
    public final Object b;

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r10
  0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public wsf0(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.f39689a = (byte) 8;
        int i2 = 1;
        int length = fArr.length - 1;
        dw3[][] dw3VarArr = new dw3[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            dw3[] dw3VarArr2 = new dw3[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                dw3VarArr2[i11] = new dw3(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            dw3VarArr[i5] = dw3VarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.b = dw3VarArr;
    }

    public static wsf0 d(int i, Context context) {
        z1x.t("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, rpd0.B);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = g7x.A(4, context, typedArrayObtainStyledAttributes);
        ColorStateList colorStateListA2 = g7x.A(9, context, typedArrayObtainStyledAttributes);
        ColorStateList colorStateListA3 = g7x.A(7, context, typedArrayObtainStyledAttributes);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        akj0 akj0VarC = akj0.g(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).c();
        typedArrayObtainStyledAttributes.recycle();
        return new wsf0(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, akj0VarC, rect);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int r(androidx.media3.common.b r5) {
        /*
            java.lang.String r0 = r5.p
            r1 = 0
            if (r0 == 0) goto L86
            boolean r0 = a.mg40.k(r0)
            if (r0 != 0) goto Ld
            goto L86
        Ld:
            java.lang.String r5 = r5.p
            java.lang.String r0 = a.vtt0.f38024a
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                default: goto L6e;
            }
        L6e:
            goto L81
        L6f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L81
            goto L7c
        L76:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L81
        L7c:
            int r5 = a.j16.f(r2, r1, r1, r1)
            return r5
        L81:
            int r5 = a.j16.f(r3, r1, r1, r1)
            return r5
        L86:
            int r5 = a.j16.f(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wsf0.r(androidx.media3.common.b):int");
    }

    @Override // a.hg5
    public ilt0 a() {
        return new ilt0(((g45) this.b).e());
    }

    public ot b() {
        return new ot(((g45) this.b).d0());
    }

    @Override // a.b040
    public void c(ox30 ox30Var, boolean z) {
        ((pd3) this.b).I(ox30Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(long j, zje zjeVar) {
        an anVar;
        if (zjeVar instanceof an) {
            anVar = (an) zjeVar;
            int i = anVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                anVar.k = i - Integer.MIN_VALUE;
            } else {
                anVar = new an(this, zjeVar);
            }
        } else {
            anVar = new an(this, zjeVar);
        }
        Object objA = anVar.i;
        wne wneVar = wne.f39444a;
        int i2 = anVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            sm smVar = (sm) ((zm) this.b).invoke();
            anVar.k = 1;
            objA = smVar.a(j, anVar);
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
        return ((dx5) objA).a();
    }

    @Override // a.b040
    public boolean f(ox30 ox30Var) {
        Window.Callback callback = ((pd3) this.b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, ox30Var);
        return true;
    }

    public urt g() {
        return new urt(((g45) this.b).e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 == r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(a.sip r7, a.jo20 r8, a.zje r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            a.zm r0 = (a.zm) r0
            boolean r1 = r9 instanceof a.pb6
            if (r1 == 0) goto L17
            r1 = r9
            a.pb6 r1 = (a.pb6) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.pb6 r1 = new a.pb6
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r9 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L53
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L69
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5a
            if (r6 != r5) goto L56
            java.lang.Object r6 = r0.invoke()
            a.mb6 r6 = (a.mb6) r6
            r1.k = r4
            java.lang.Object r6 = r6.a(r8, r1)
            if (r6 != r9) goto L53
            goto L68
        L53:
            a.dx5 r6 = (a.dx5) r6
            goto L6b
        L56:
            a.t9f.b()
            return r3
        L5a:
            java.lang.Object r6 = r0.invoke()
            a.mb6 r6 = (a.mb6) r6
            r1.k = r5
            java.lang.Object r6 = r6.b(r8, r1)
            if (r6 != r9) goto L69
        L68:
            return r9
        L69:
            a.dx5 r6 = (a.dx5) r6
        L6b:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wsf0.h(a.sip, a.jo20, a.zje):java.lang.Object");
    }

    public ByteBuffer i() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public int j() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public int k() {
        return ((Image.Plane) this.b).getRowStride();
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        by5 by5Var = (by5) this.b;
        View viewQ0 = by5Var.q0();
        uiv0 uiv0Var = xiv0Var.f40966a;
        viewQ0.setPadding(viewQ0.getPaddingLeft(), uiv0Var.i(1).b, viewQ0.getPaddingRight(), viewQ0.getPaddingBottom());
        sj3.L0(by5Var.q0(), 0, 0, 0, uiv0Var.i(2).d, 7);
        return xiv0.b;
    }

    public Object m(i16 i16Var, zje zjeVar) {
        Object objA = ((tnc0) this.b).f34227a.f32487a.a(i16Var, zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r5 == r6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(a.zje r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            a.do20 r0 = (a.do20) r0
            java.lang.Object r0 = r0.f6397a
            a.gw8 r0 = (a.gw8) r0
            boolean r1 = r6 instanceof a.qpc
            if (r1 == 0) goto L1b
            r1 = r6
            a.qpc r1 = (a.qpc) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1b
            int r2 = r2 - r3
            r1.k = r2
            goto L20
        L1b:
            a.qpc r1 = new a.qpc
            r1.<init>(r5, r6)
        L20:
            java.lang.Object r5 = r1.i
            a.wne r6 = a.wne.f39444a
            int r2 = r1.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            a.z1x.P(r5)
            goto L5c
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L39:
            a.z1x.P(r5)
            goto L4e
        L3d:
            a.z1x.P(r5)
            r1.k = r4
            java.lang.Object r5 = r0.a(r1)
            if (r5 != r6) goto L49
            goto L4b
        L49:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L4b:
            if (r5 != r6) goto L4e
            goto L5b
        L4e:
            r1.k = r3
            java.lang.Object r5 = r0.b(r1)
            if (r5 != r6) goto L57
            goto L59
        L57:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L59:
            if (r5 != r6) goto L5c
        L5b:
            return r6
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wsf0.n(a.zje):java.lang.Object");
    }

    public Unit o(zje zjeVar) {
        xk0 xk0Var = ((dn0) this.b).c;
        xk0Var.d.clear();
        xk0Var.c();
        xk0Var.f41010a = false;
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }

    public void p() {
        gs6 gs6Var = (gs6) ((mii0) this.b).c;
        gs6Var.f11814a.clear();
        gs6Var.b.clear();
        gs6Var.c.clear();
        gs6Var.d.i();
        gs6Var.e.clear();
        gs6Var.g = gio.d;
    }

    public jyg0 q() {
        return new jyg0(((g45) this.b).e());
    }

    public trm0 s() {
        g45 g45Var = (g45) this.b;
        return new trm0(new ot(g45Var.d0()), new jyg0(g45Var.e()), (byte) 11);
    }

    public String toString() {
        switch (this.f39689a) {
            case 0:
                return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.b) + ')';
            default:
                return super.toString();
        }
    }

    public wsf0(sv3 sv3Var) {
        this.f39689a = (byte) 9;
        sv3Var.getClass();
        this.b = sv3Var;
    }

    public wsf0(dn0 dn0Var) {
        this.f39689a = (byte) 26;
        dn0Var.getClass();
        this.b = dn0Var;
    }

    public wsf0(j400 j400Var) {
        this.f39689a = (byte) 28;
        j400Var.getClass();
        this.b = j400Var;
    }

    public wsf0(tnc0 tnc0Var) {
        this.f39689a = (byte) 2;
        tnc0Var.getClass();
        this.b = tnc0Var;
    }

    public wsf0(q7d0 q7d0Var) {
        this.f39689a = (byte) 5;
        q7d0Var.getClass();
        this.b = q7d0Var;
    }

    public wsf0(gii0 gii0Var, byte b) {
        this.f39689a = b;
        gii0Var.getClass();
        switch (b) {
            case 12:
                this.b = new zm(gii0Var, (byte) 14);
                break;
            case 15:
                this.b = new zm(gii0Var, (byte) 24);
                break;
            case 23:
                this.b = new sza(gii0Var, (byte) 10);
                break;
            default:
                this.b = new zm(gii0Var, (byte) 0);
                break;
        }
    }

    public wsf0(h03 h03Var) {
        this.f39689a = (byte) 3;
        ku0 ku0Var = (ku0) h03Var.b;
        ku0Var.getClass();
        this.b = new rrc(ku0Var, (byte) 10);
    }

    public wsf0(ctf0 ctf0Var) {
        this.f39689a = (byte) 4;
        ctf0Var.getClass();
        this.b = ctf0Var;
    }

    public wsf0(q7d0 q7d0Var, zvf zvfVar, kta ktaVar, mne mneVar) {
        this.f39689a = (byte) 19;
        q7d0Var.getClass();
        zvfVar.getClass();
        ktaVar.getClass();
        gr00 gr00Var = new gr00();
        gr00Var.f11760a = q7d0Var;
        gr00Var.b = zvfVar;
        gr00Var.c = ktaVar;
        gr00Var.d = mneVar;
        gr00Var.e = mbl.b(new pai(gr00Var, (byte) 6));
        this.b = gr00Var;
    }

    public wsf0(mne mneVar, knf0 knf0Var, btt0 btt0Var, gii0 gii0Var, ev7 ev7Var) {
        this.f39689a = (byte) 13;
        knf0Var.getClass();
        btt0Var.getClass();
        gii0Var.getClass();
        ev7Var.getClass();
        this.b = new mii0(mneVar, btt0Var, gii0Var, ev7Var);
    }

    public wsf0(gst0 gst0Var, btt0 btt0Var, xwb0 xwb0Var, cad cadVar, o7h0 o7h0Var, knf0 knf0Var, tg5 tg5Var, rrc rrcVar, gii0 gii0Var, vwb0 vwb0Var, vwb0 vwb0Var2) {
        this.f39689a = (byte) 10;
        gst0Var.getClass();
        btt0Var.getClass();
        xwb0Var.getClass();
        o7h0Var.getClass();
        knf0Var.getClass();
        tg5Var.getClass();
        gii0Var.getClass();
        vwb0Var.getClass();
        vwb0Var2.getClass();
        g45 g45Var = new g45();
        g45Var.f10647a = tg5Var;
        g45Var.b = gii0Var;
        g45Var.c = knf0Var;
        g45Var.d = gst0Var;
        g45Var.e = vwb0Var2;
        g45Var.f = btt0Var;
        g45Var.g = cadVar;
        g45Var.h = rrcVar;
        g45Var.i = o7h0Var;
        this.b = g45Var;
    }

    public /* synthetic */ wsf0(Object obj, byte b) {
        this.f39689a = b;
        this.b = obj;
    }

    public wsf0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, akj0 akj0Var, Rect rect) {
        this.f39689a = (byte) 16;
        z1x.w(rect.left);
        z1x.w(rect.top);
        z1x.w(rect.right);
        z1x.w(rect.bottom);
        this.b = akj0Var;
    }

    public wsf0(Context context) {
        this.f39689a = (byte) 14;
        context.getClass();
        this.b = context;
    }
}
