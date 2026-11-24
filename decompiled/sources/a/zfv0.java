package a;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zfv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44318a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zfv0(Object obj, Object obj2, byte b) {
        this.f44318a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Window window;
        long jM98getGreen0d7_KjU;
        long jM98getGreen0d7_KjU2;
        float f;
        Object value;
        Object g0g0Var;
        String str;
        Signature[] apkContentsSigners;
        Signature signature;
        byte b = this.f44318a;
        byte b2 = 16;
        byte b3 = 27;
        byte b4 = 9;
        final byte b5 = 0;
        byte b6 = 28;
        Long lValueOf = null;
        final byte b7 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj3;
                Integer num = (Integer) obj2;
                ((lwk) obj).getClass();
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setSoftInputMode(16);
                }
                return new pr0(activity, num, b3);
            case 1:
                ((View) obj).getClass();
                ((vft) obj3).invoke(((pgv0) ((cp) obj2).u()).e);
                return Unit.f46060a;
            case 2:
                djv0 djv0Var = (djv0) obj3;
                View view = (View) obj2;
                djv0Var.a(view);
                return new pr0(djv0Var, view, b6);
            case 3:
                w03 w03Var = (w03) obj3;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                int iOrdinal = ((ikv0) obj2).ordinal();
                if (iOrdinal == 0) {
                    pz40 pz40Var = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else if (iOrdinal == 1) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    pz40 pz40Var3 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m132getYellow0d7_KjU();
                }
                fhl.C0(fhlVar, w03Var, jM98getGreen0d7_KjU, 0.0f, l0q.f19214a, 52);
                return Unit.f46060a;
            case 4:
                w03 w03Var2 = (w03) obj3;
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                int iOrdinal2 = ((jkv0) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM98getGreen0d7_KjU2 = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else if (iOrdinal2 == 1) {
                    pz40 pz40Var5 = s6t0.f31722a;
                    jM98getGreen0d7_KjU2 = StaticColors.INSTANCE.m113getRed0d7_KjU();
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    pz40 pz40Var6 = s6t0.f31722a;
                    jM98getGreen0d7_KjU2 = StaticColors.INSTANCE.m132getYellow0d7_KjU();
                }
                fhl.C0(fhlVar2, w03Var2, jM98getGreen0d7_KjU2, 0.0f, l0q.f19214a, 52);
                return Unit.f46060a;
            case 5:
                zlv0 zlv0Var = (zlv0) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((wlv0) zlv0Var).e;
                hczVar.f(a4xVar.size(), null, new e0m0(a4xVar, (byte) 9), new ugd(2039820996, true, new zip0(a4xVar, zlv0Var, (Function1) obj2, (byte) 7)));
                return Unit.f46060a;
            case 6:
                qnv0 qnv0Var = (qnv0) obj3;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                rl70 rl70Var = qnv0Var.u;
                String str2 = ((anv0) ((cnv0) obj2)).f1174a;
                long j = qnv0Var.t;
                String str3 = qnv0Var.s;
                rl70Var.getClass();
                k0w0Var.h(rl70.d(j, str2, str3));
                return Unit.f46060a;
            case 7:
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                ((hpv0) obj3).b.U(qpg0Var, (gpv0) obj2);
                return Unit.f46060a;
            case 8:
                zov0 zov0Var = (zov0) obj3;
                String str4 = (String) obj2;
                qpg0 qpg0Var2 = (qpg0) obj;
                qpg0Var2.getClass();
                xpg0 xpg0VarZ0 = qpg0Var2.Z0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    xpg0VarZ0.o(1, dqm0.z(zov0Var));
                    xpg0VarZ0.z(2, str4);
                    xpg0VarZ0.W0();
                    return Integer.valueOf(s0x.R(qpg0Var2));
                } finally {
                    xpg0VarZ0.close();
                }
            case 9:
                maj majVar = (maj) obj3;
                String str5 = (String) obj2;
                qpg0 qpg0Var3 = (qpg0) obj;
                qpg0Var3.getClass();
                xpg0 xpg0VarZ1 = qpg0Var3.Z0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    maj majVar2 = maj.b;
                    xpg0VarZ1.i(nkb.I(majVar), 1);
                    xpg0VarZ1.z(2, str5);
                    xpg0VarZ1.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ1.close();
                }
            case 10:
                qpg0 qpg0Var4 = (qpg0) obj;
                qpg0Var4.getClass();
                ((upv0) obj3).b.U(qpg0Var4, (ppv0) obj2);
                return Unit.f46060a;
            case 11:
                qpg0 qpg0Var5 = (qpg0) obj;
                qpg0Var5.getClass();
                ((zpv0) obj3).b.U(qpg0Var5, (ypv0) obj2);
                return Unit.f46060a;
            case 12:
                yqv0 yqv0Var = (yqv0) obj3;
                ugd ugdVar = (ugd) obj2;
                skd skdVar = (skd) obj;
                if (!yqv0Var.c) {
                    clz clzVarD = skdVar.d();
                    View view2 = skdVar.f32341a;
                    glz glzVarX = clzVarD.x();
                    yqv0Var.e = ugdVar;
                    if (yqv0Var.d == null) {
                        if (Intrinsics.d(Looper.myLooper(), view2.getHandler().getLooper())) {
                            yqv0Var.d = glzVarX;
                            glzVarX.a(yqv0Var);
                        } else {
                            view2.post(new qaq0(yqv0Var, glzVarX, (byte) 21));
                        }
                    } else if (glzVarX.i.compareTo(lkz.c) >= 0) {
                        yqv0Var.b.d(new ugd(-1723985096, true, new gdr0(yqv0Var, skdVar, ugdVar, b2)));
                    }
                }
                return Unit.f46060a;
            case 13:
                hsv0 hsv0Var = (hsv0) obj3;
                u950 u950Var = (u950) obj2;
                ((lwk) obj).getClass();
                ArrayList<lwv0> arrayList = hsv0Var.d;
                jvv0 jvv0Var = hsv0Var.b;
                for (lwv0 lwv0Var : arrayList) {
                    if (!u950Var.contains(lwv0Var)) {
                        u950Var.f35267a.add(lwv0Var);
                    }
                }
                arrayList.clear();
                hsv0Var.c = u950Var;
                gsv0 gsv0Var = hsv0Var.f;
                jvv0Var.getClass();
                jvv0Var.b = gsv0Var;
                if (((gvv0) jvv0Var.f17222a.getValue()).f11994a.isEmpty() && u950Var.f35267a.size() > 1) {
                    List listL0 = CollectionsKt.L0(arrayList);
                    arrayList.clear();
                    Iterator it = listL0.iterator();
                    while (it.hasNext()) {
                        hsv0Var.b((lwv0) it.next());
                    }
                    u950 u950Var2 = hsv0Var.c;
                    if (u950Var2 != null) {
                        while (u950Var2.f35267a.size() > 1) {
                            hsv0Var.b((rb50) u950Var2.remove(q3d.i(u950Var2)));
                        }
                    }
                }
                return new ty2(hsv0Var, b3);
            case 14:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                osv0 osv0Var = (osv0) ((l7m0) obj3).getValue();
                osv0Var.getClass();
                int iOrdinal3 = ((tsv0) obj2).ordinal();
                if (iOrdinal3 == 0) {
                    f = osv0Var.f25801a;
                } else if (iOrdinal3 == 1) {
                    f = osv0Var.b;
                } else if (iOrdinal3 == 2) {
                    f = osv0Var.c;
                } else {
                    if (iOrdinal3 != 3) {
                        t9f.b();
                        return null;
                    }
                    f = osv0Var.d;
                }
                uag0Var.I(f);
                return Unit.f46060a;
            case 15:
                mwv0 mwv0Var = (mwv0) obj3;
                ywv0 ywv0Var = (ywv0) obj2;
                ((lwk) obj).getClass();
                ywv0Var.getClass();
                ((hgk0) mwv0Var.f22524a).setValue(ywv0Var);
                return new ty2(mwv0Var, b6);
            case 16:
                final gdv0 gdv0Var = (gdv0) obj3;
                final cp cpVar = (cp) obj;
                cpVar.getClass();
                azx azxVar = (azx) cpVar.u;
                dyb.O(azxVar.b, new Function1() { // from class: a.eyv0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) throws Exception {
                        byte b8 = b5;
                        cp cpVar2 = cpVar;
                        gdv0 gdv0Var2 = gdv0Var;
                        View view3 = (View) obj4;
                        switch (b8) {
                            case 0:
                                view3.getClass();
                                gdv0Var2.invoke(cpVar2.u());
                                break;
                            default:
                                view3.getClass();
                                gdv0Var2.invoke(cpVar2.u());
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                dyb.O(azxVar.e, new Function1() { // from class: a.eyv0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) throws Exception {
                        byte b8 = b7;
                        cp cpVar2 = cpVar;
                        gdv0 gdv0Var2 = gdv0Var;
                        View view3 = (View) obj4;
                        switch (b8) {
                            case 0:
                                view3.getClass();
                                gdv0Var2.invoke(cpVar2.u());
                                break;
                            default:
                                view3.getClass();
                                gdv0Var2.invoke(cpVar2.u());
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                azxVar.c.setOnItemClickListener(new gcn0((uqv0) obj2, (byte) 18));
                cpVar.t(new a8u0(cpVar, b4));
                return Unit.f46060a;
            case 17:
                rzv0 rzv0Var = (rzv0) obj3;
                ((Throwable) obj).getClass();
                if (((bzv0) rzv0Var.D()).f3492a.equals((String) obj2)) {
                    p7m0 p7m0Var = rzv0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        rzv0Var.f.getClass();
                    } while (!p7m0Var.m(value, bzv0.a((bzv0) value, null, null, null, false, null, true, 15)));
                }
                return Unit.f46060a;
            case 18:
                ((ou90) obj).g((pu90) obj3, 0, 0, ((c3w0) obj2).o);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                x7w0 x7w0Var = (x7w0) obj3;
                PackageInfo packageInfo = (PackageInfo) obj2;
                n7w0 n7w0Var = (n7w0) obj;
                n7w0Var.getClass();
                n7w0Var.a(x7w0Var.f40435a.getPackageName(), CommonConstant.ReqAccessTokenParam.PACKAGE_NAME);
                us00 us00Var = x7w0Var.b.f20325a;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    int i = Build.VERSION.SDK_INT;
                    PackageInfo packageInfo2 = i >= 28 ? us00Var.getPackageManager().getPackageInfo(us00Var.getPackageName(), 134217728) : us00Var.getPackageManager().getPackageInfo(us00Var.getPackageName(), 64);
                    if (i >= 28) {
                        SigningInfo signingInfo = packageInfo2.signingInfo;
                        apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                    } else {
                        apkContentsSigners = packageInfo2.signatures;
                    }
                    if (apkContentsSigners == null || (signature = (Signature) tx3.B(apkContentsSigners)) == null) {
                        str = "no_signature";
                    } else {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signature.toByteArray());
                        bArrDigest.getClass();
                        g0g0Var = tx3.L(bArrDigest, "", new ejv0((byte) 23), 30);
                        if (g0g0Var instanceof g0g0) {
                            g0g0Var = "error_getting_signature";
                        }
                        str = (String) g0g0Var;
                    }
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                n7w0Var.a(str, "appSignature");
                if (Build.VERSION.SDK_INT >= 28) {
                    if (packageInfo != null) {
                        lValueOf = Long.valueOf(packageInfo.getLongVersionCode());
                    }
                } else if (packageInfo != null) {
                    lValueOf = Long.valueOf(packageInfo.versionCode);
                }
                n7w0Var.a(lValueOf, "versionCode");
                return Unit.f46060a;
            default:
                DisplayMetrics displayMetrics = (DisplayMetrics) obj2;
                n7w0 n7w0Var2 = (n7w0) obj;
                n7w0Var2.getClass();
                n7w0Var2.a((List) obj3, "supportedModes");
                n7w0Var2.a(Integer.valueOf(displayMetrics.widthPixels), "width");
                n7w0Var2.a(Integer.valueOf(displayMetrics.heightPixels), "height");
                n7w0Var2.a(Float.valueOf(displayMetrics.density), "density");
                n7w0Var2.a(Integer.valueOf(displayMetrics.densityDpi), "densityDpi");
                n7w0Var2.a(Float.valueOf(displayMetrics.xdpi), "xdpi");
                n7w0Var2.a(Float.valueOf(displayMetrics.ydpi), "ydpi");
                return Unit.f46060a;
        }
    }
}
