package a;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.AbsSeekBar;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.HuaweiApiAvailability;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.bet_history.history.presentation.BetHistoryScreen;
import org.xplatform.bethistory.coupon_scanner.presentation.CouponScannerScreen;
import org.xplatform.bethistory.history.presentation.HistoryScreen;

/* JADX INFO: loaded from: classes.dex */
public class xr implements uto0, n1x, nhi0, SuccessContinuation {
    public static final int[] c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final int[] d = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f41344a;
    public Object b;

    public xr(gii0 gii0Var, byte b) {
        byte b2 = 18;
        gii0Var.getClass();
        switch (b) {
            case 11:
                this.f41344a = gii0Var;
                this.b = new zo4(this, b2);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.f41344a = gii0Var;
                this.b = new e8g(this, (byte) 11);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f41344a = gii0Var;
                this.b = new e8g(this, b2);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.f41344a = gii0Var;
                this.b = new ucj(this, (byte) 4);
                break;
            default:
                this.f41344a = gii0Var;
                this.b = new nc((Object) this, (byte) 16);
                break;
        }
    }

    public static void o(xr xrVar, c3e c3eVar, float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        xrVar.n(c3eVar, f);
    }

    public static CouponScannerScreen s() {
        return new CouponScannerScreen(-1);
    }

    @Override // a.nhi0
    public jiy a(sgy sgyVar) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class clsG = azw.G(sgyVar);
        Object qi9Var = concurrentHashMap.get(clsG);
        if (qi9Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsG, (qi9Var = new qi9((jiy) ((Function1) this.f41344a).invoke(sgyVar))))) != null) {
            qi9Var = objPutIfAbsent;
        }
        return ((qi9) qi9Var).f28780a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, zje zjeVar) {
        avf avfVar;
        if (zjeVar instanceof avf) {
            avfVar = (avf) zjeVar;
            int i = avfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                avfVar.k = i - Integer.MIN_VALUE;
            } else {
                avfVar = new avf(this, zjeVar);
            }
        } else {
            avfVar = new avf(this, zjeVar);
        }
        Object objW0 = avfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = avfVar.k;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objW0);
            ruf rufVar = (ruf) this.b;
            avfVar.k = 1;
            objW0 = sj3.w0(avfVar, rufVar.f31125a, new tj3(str, yjeVar, b), true, false);
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
        return ulb.d0((tuf) objW0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(long j, yje yjeVar) {
        bvf bvfVar;
        if (yjeVar instanceof bvf) {
            bvfVar = (bvf) yjeVar;
            int i = bvfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bvfVar.k = i - Integer.MIN_VALUE;
            } else {
                bvfVar = new bvf(this, yjeVar);
            }
        } else {
            bvfVar = new bvf(this, yjeVar);
        }
        Object objW0 = bvfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = bvfVar.k;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(objW0);
            ruf rufVar = (ruf) this.b;
            bvfVar.k = 1;
            objW0 = sj3.w0(bvfVar, rufVar.f31125a, new hu6(j, yjeVar2, (byte) 3), true, false);
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
        return ulb.d0((tuf) objW0);
    }

    public boolean d(int i) {
        return ((jjq) this.f41344a).f16630a.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    public i0g0 e(int i, p68 p68Var, int[] iArr) throws o660 {
        String str;
        String str2;
        EnumMap enumMap;
        StringBuilder sb = (StringBuilder) this.b;
        sb.setLength(0);
        int[] iArr2 = (int[]) this.f41344a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        byte b = 2;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i2 = p68Var.b;
        int iF = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 5 && iF < i2; i4++) {
            int iH = n2t0.h(p68Var, iArr2, iF, n2t0.g);
            sb.append((char) ((iH % 10) + 48));
            for (int i5 : iArr2) {
                iF += i5;
            }
            if (iH >= 10) {
                i3 |= 1 << (4 - i4);
            }
            if (i4 != 4) {
                iF = p68Var.f(p68Var.e(iF));
            }
        }
        if (sb.length() != 5) {
            throw o660.a();
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (i3 == d[i6]) {
                String string = sb.toString();
                int length = string.length();
                int iCharAt = 0;
                for (int i7 = length - 2; i7 >= 0; i7 -= 2) {
                    iCharAt += string.charAt(i7) - '0';
                }
                int iCharAt2 = iCharAt * 3;
                for (int i8 = length - 1; i8 >= 0; i8 -= 2) {
                    iCharAt2 += string.charAt(i8) - '0';
                }
                if ((iCharAt2 * 3) % 10 != i6) {
                    throw o660.a();
                }
                String string2 = sb.toString();
                if (string2.length() == 5) {
                    char cCharAt = string2.charAt(0);
                    if (cCharAt == '0') {
                        str = "£";
                    } else if (cCharAt != '5') {
                        str = "";
                        if (cCharAt == '9') {
                            switch (string2.hashCode()) {
                                case 54118329:
                                    b = string2.equals("90000") ? (byte) 0 : (byte) -1;
                                    break;
                                case 54395376:
                                    b = string2.equals("99990") ? (byte) 1 : (byte) -1;
                                    break;
                                case 54395377:
                                    if (!string2.equals("99991")) {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    str2 = null;
                                    break;
                                case 1:
                                    str2 = "Used";
                                    break;
                                case 2:
                                    str2 = "0.00";
                                    break;
                            }
                        }
                        if (str2 == null) {
                            enumMap = null;
                        } else {
                            enumMap = new EnumMap(a3g0.class);
                            enumMap.put(a3g0.g, str2);
                        }
                    } else {
                        str = "$";
                    }
                    int i9 = Integer.parseInt(string2.substring(1));
                    String strValueOf = String.valueOf(i9 / 100);
                    int i10 = i9 % 100;
                    str2 = str + strValueOf + '.' + (i10 < 10 ? twn.m(i10, "0") : String.valueOf(i10));
                    if (str2 == null) {
                        enumMap = null;
                    } else {
                        enumMap = new EnumMap(a3g0.class);
                        enumMap.put(a3g0.g, str2);
                    }
                } else {
                    enumMap = null;
                }
                float f = i;
                i0g0 i0g0Var = new i0g0(string2, null, new d3g0[]{new d3g0((iArr[0] + iArr[1]) / 2.0f, f), new d3g0(iF, f)}, ju5.q);
                if (enumMap != null) {
                    i0g0Var.a(enumMap);
                }
                return i0g0Var;
            }
        }
        throw o660.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable f(zje zjeVar) {
        cvf cvfVar;
        if (zjeVar instanceof cvf) {
            cvfVar = (cvf) zjeVar;
            int i = cvfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvfVar.k = i - Integer.MIN_VALUE;
            } else {
                cvfVar = new cvf(this, zjeVar);
            }
        } else {
            cvfVar = new cvf(this, zjeVar);
        }
        Object objW0 = cvfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cvfVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            ruf rufVar = (ruf) this.b;
            cvfVar.k = 1;
            objW0 = sj3.w0(cvfVar, rufVar.f31125a, new f1e(2, yjeVar, (byte) 9), true, false);
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
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ulb.d0((tuf) it.next()));
        }
        return arrayList;
    }

    public bzu g() {
        return new bzu((n660) this.b, (byte) 11);
    }

    public rl40 i() {
        bb6 bb6Var = (bb6) this.f41344a;
        oav oavVar = oav.e;
        us00 us00Var = bb6Var.f2293a;
        boolean z = true;
        boolean z2 = oavVar.c(us00Var, pav.f26674a) == 0;
        if (!z2) {
            try {
                PackageManager packageManager = us00Var.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            return rl40.GMS;
        }
        if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(((m73) this.b).f21299a) == 0) {
            return rl40.HMS;
        }
        Log.e("/log/Android", "Unsupported mobile service type");
        return rl40.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(zje zjeVar) {
        dvf dvfVar;
        if (zjeVar instanceof dvf) {
            dvfVar = (dvf) zjeVar;
            int i = dvfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvfVar.k = i - Integer.MIN_VALUE;
            } else {
                dvfVar = new dvf(this, zjeVar);
            }
        } else {
            dvfVar = new dvf(this, zjeVar);
        }
        Object objW0 = dvfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dvfVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            ruf rufVar = (ruf) this.b;
            dvfVar.k = 1;
            objW0 = sj3.w0(dvfVar, rufVar.f31125a, new f1e(2, yjeVar, (byte) 8), true, false);
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
        return Boolean.valueOf(((Number) objW0).longValue() != 0);
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        List list = u0d.f34849a;
        Context context = ((ImageView) this.f41344a).getContext();
        context.getClass();
        u0d.r(context, (String) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:44:0x0167  */
    /* JADX WARN: Code duplicated, block: B:49:0x016f  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0169, code lost:
    
        if (r0 == r12) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a8, code lost:
    
        if (r0 == r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(long r20, long r22, a.xvs r24, a.h9n0 r25, a.zje r26) throws a.n7p {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xr.l(long, long, a.xvs, a.h9n0, a.zje):java.lang.Object");
    }

    public Object m(mlr mlrVar, boolean z, int i, String str, yje yjeVar) {
        Object objQ;
        wne wneVar = wne.f39444a;
        cpb cpbVar = (cpb) this.f41344a;
        lu0 lu0VarG = ((uyn) this.b).g(str);
        dn0 dn0Var = cpbVar.f4737a;
        if (z) {
            objQ = dn0Var.a(mlrVar, i, lu0VarG, yjeVar);
            if (objQ != wneVar) {
                objQ = Unit.f46060a;
            }
        } else {
            objQ = dn0Var.q(mlrVar.f22006a, i, lu0VarG, yjeVar);
            if (objQ != wneVar) {
                objQ = Unit.f46060a;
            }
        }
        return objQ == wneVar ? objQ : Unit.f46060a;
    }

    public void n(c3e c3eVar, float f) {
        int i = c3eVar.b;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = "end";
            } else if (i == 0) {
                str = "left";
            } else if (i != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = "right";
            }
        }
        vg9 vg9Var = new vg9(new char[0]);
        vg9Var.i(eh9.i(c3eVar.f3670a.toString()));
        vg9Var.i(eh9.i(str));
        vg9Var.i(new zg9(f));
        vg9Var.i(new zg9(0.0f));
        ((bh9) this.f41344a).F((String) this.b, vg9Var);
    }

    @Override // a.uto0
    public void onStart(dyw dywVar) {
        pm80 pm80VarK;
        o1x o1xVar = (o1x) this.f41344a;
        mz3 mz3Var = (mz3) this.b;
        pm80 pm80VarR = dywVar != null ? x0x.r(dywVar, o1xVar.f24504a, mz3Var.p ? 1 : 0) : null;
        if (pm80VarR == null && ((Boolean) qbc.P(o1xVar, r1x.f29704a)).booleanValue() && (pm80VarK = mz3Var.k()) != null) {
            pm80VarR = pm80VarK;
        }
        mz3Var.p(new jz3(pm80VarR));
    }

    public void p(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.f41344a;
        ywu ywuVarY = ywu.y(i, 0, absSeekBar.getContext(), attributeSet, c);
        Drawable drawableO = ywuVarY.o(0);
        if (drawableO != null) {
            if (drawableO instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableO;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableU = u(animationDrawable.getFrame(i2), true);
                    drawableU.setLevel(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                    animationDrawable2.addFrame(drawableU, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                drawableO = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableO);
        }
        Drawable drawableO2 = ywuVarY.o(1);
        if (drawableO2 != null) {
            absSeekBar.setProgressDrawable(u(drawableO2, false));
        }
        ywuVarY.A();
    }

    public void q(bsq bsqVar) {
        xz3 xz3Var = (xz3) this.b;
        owp0 owp0Var = (owp0) this.f41344a;
        int i = bsqVar.b;
        if (i == 0) {
            xz3Var.execute(new lfr((Object) owp0Var, (Object) bsqVar.f3143a, (byte) 4));
        } else {
            xz3Var.execute(new y63(owp0Var, i, (byte) 1));
        }
    }

    public FragmentScreen r(p57 p57Var, sys0 sys0Var) {
        k77 k77VarD = ((vjp) this.f41344a).d();
        r9u r9uVar = (r9u) this.b;
        ygp ygpVar = ygp.v;
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return (k77VarD != k77.OLD_HISTORY || j1q0Var.f15748a.d(ygpVar)) ? new BetHistoryScreen(p57Var, k77VarD) : new HistoryScreen(p57Var, sys0Var);
    }

    public void t(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.b;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        f8f f8fVar = (f8f) this.b;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            qaj qajVar = f8fVar.b;
            if (zBooleanValue) {
                ((TaskCompletionSource) qajVar.e).trySetResult(null);
                return ((Task) this.f41344a).onSuccessTask((aaf) f8fVar.e.b, new prc((Object) this, (byte) 8));
            }
            jf4.n("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        xzp xzpVar = f8fVar.g;
        Iterator it = xzp.V(((File) xzpVar.c).listFiles(f8f.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        xzp xzpVar2 = ((x9f) f8fVar.m.b).b;
        x9f.b(xzp.V(((File) xzpVar2.e).listFiles()));
        x9f.b(xzp.V(((File) xzpVar2.f).listFiles()));
        x9f.b(xzp.V(((File) xzpVar2.g).listFiles()));
        f8fVar.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public Drawable u(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.b) == null) {
                this.b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = u(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public void v(long j, String str) {
        ((bn6) this.f41344a).b.a("bet_gameview_point_call", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("point", str)));
        ((je) this.b).f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(str, (byte) 0)}), 3176L);
    }

    @Override // a.uto0
    public void onError(dyw dywVar) {
    }

    @Override // a.uto0
    public void onSuccess(dyw dywVar) {
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
    }

    public /* synthetic */ xr(Object obj, Object obj2) {
        this.f41344a = obj;
        this.b = obj2;
    }

    public xr(byte b) {
        switch (b) {
            case 8:
                this.f41344a = new Rect();
                this.b = new Rect();
                break;
            case 13:
                this.b = new LinkedHashMap();
                break;
            default:
                this.f41344a = new int[4];
                this.b = new StringBuilder();
                break;
        }
    }

    public xr(AbsSeekBar absSeekBar) {
        this.f41344a = absSeekBar;
    }

    public xr(bh9 bh9Var, int i) {
        this.f41344a = bh9Var;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = "end";
            } else if (i == 0) {
                str = "left";
            } else if (i != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = "right";
            }
        }
        this.b = str;
    }

    public xr(Function1 function1) {
        this.f41344a = function1;
        this.b = new ConcurrentHashMap();
    }
}
