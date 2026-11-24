package a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hln0 {
    public final m6m0 A;
    public final cgx0 B;
    public final pxv C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1a f13272a;
    public final ewn b;
    public final egp c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public m55 v;
    public final ArrayList w;
    public final erm0 x;
    public final xvk y;
    public final ugf0 z;

    /* JADX WARN: Code duplicated, block: B:51:0x03e6  */
    public hln0(Context context, c1a c1aVar, ewn ewnVar, egp egpVar) {
        List listC;
        context.getClass();
        c1aVar.getClass();
        ewnVar.getClass();
        this.f13272a = c1aVar;
        this.b = ewnVar;
        this.c = egpVar;
        ow9 ow9Var = (ow9) c1aVar;
        String str = ow9Var.f25959a;
        this.d = str;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ow9Var.c(key);
        int iIntValue = num != null ? num.intValue() : 2;
        this.e = iIntValue;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.h = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.i = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.j = arrayList5;
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        this.m = arrayList6;
        this.n = new ArrayList();
        c1a.a0.getClass();
        boolean zB = b1a.b(c1aVar);
        this.t = zB;
        this.w = new ArrayList();
        this.x = k();
        kpd0 kpd0Var = mhk.f21798a;
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) mhk.a().b(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.y = xvk.g.m(context);
        ugf0 ugf0Var = new ugf0();
        kpd0 kpd0Var2 = mhk.f21798a;
        ugf0Var.f35622a = (ExtraCroppingQuirk) mhk.a().b(ExtraCroppingQuirk.class);
        this.z = ugf0Var;
        this.A = new m6m0((byte) 12);
        cgx0 cgx0Var = new cgx0(c1aVar);
        this.B = cgx0Var;
        this.C = new pxv(c1aVar);
        CameraCharacteristics.Key key2 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key2.getClass();
        int[] iArr = (int[]) ow9Var.c(key2);
        if (iArr != null) {
            this.o = tx3.w(iArr, 3);
            this.p = tx3.w(iArr, 6);
            this.s = tx3.w(iArr, 16);
            this.u = tx3.w(iArr, 1);
        }
        boolean z = this.o;
        boolean z2 = this.p;
        n0o0 n0o0Var = piv.f27060a;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        sln0 sln0Var = new sln0();
        urm0 urm0Var = wln0.e;
        vln0 vln0Var = vln0.f37634a;
        tln0 tln0Var = tln0.MAXIMUM;
        urm0 urm0Var2 = wln0.e;
        sln0Var.a(y2m0.a(vln0Var, tln0Var, urm0Var2));
        arrayList8.add(sln0Var);
        sln0 sln0Var2 = new sln0();
        vln0 vln0Var2 = vln0.c;
        sln0Var2.a(y2m0.a(vln0Var2, tln0Var, urm0Var2));
        arrayList8.add(sln0Var2);
        sln0 sln0Var3 = new sln0();
        vln0 vln0Var3 = vln0.b;
        sln0Var3.a(y2m0.a(vln0Var3, tln0Var, urm0Var2));
        arrayList8.add(sln0Var3);
        sln0 sln0Var4 = new sln0();
        tln0 tln0Var2 = tln0.PREVIEW;
        axq.v(sln0Var4, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var2, tln0Var, urm0Var2);
        sln0 sln0VarE = axq.e(arrayList8, sln0Var4);
        axq.v(sln0VarE, y2m0.a(vln0Var3, tln0Var2, urm0Var2), vln0Var2, tln0Var, urm0Var2);
        sln0 sln0VarE2 = axq.e(arrayList8, sln0VarE);
        axq.v(sln0VarE2, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var, tln0Var2, urm0Var2);
        sln0 sln0VarE3 = axq.e(arrayList8, sln0VarE2);
        axq.v(sln0VarE3, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var3, tln0Var2, urm0Var2);
        sln0 sln0VarE4 = axq.e(arrayList8, sln0VarE3);
        axq.v(sln0VarE4, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var3, tln0Var2, urm0Var2);
        sln0VarE4.a(y2m0.a(vln0Var2, tln0Var, urm0Var2));
        arrayList8.add(sln0VarE4);
        arrayList7.addAll(arrayList8);
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 3 || iIntValue == 4) {
            ArrayList arrayList9 = new ArrayList();
            sln0 sln0Var5 = new sln0();
            sln0Var5.a(y2m0.a(vln0Var, tln0Var2, urm0Var2));
            tln0 tln0Var3 = tln0.RECORD;
            sln0Var5.a(y2m0.a(vln0Var, tln0Var3, urm0Var2));
            arrayList9.add(sln0Var5);
            sln0 sln0Var6 = new sln0();
            axq.v(sln0Var6, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var3, tln0Var3, urm0Var2);
            sln0 sln0VarE5 = axq.e(arrayList9, sln0Var6);
            axq.v(sln0VarE5, y2m0.a(vln0Var3, tln0Var2, urm0Var2), vln0Var3, tln0Var3, urm0Var2);
            sln0 sln0VarE6 = axq.e(arrayList9, sln0VarE5);
            axq.v(sln0VarE6, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var, tln0Var3, urm0Var2);
            sln0VarE6.a(y2m0.a(vln0Var2, tln0Var3, urm0Var2));
            arrayList9.add(sln0VarE6);
            sln0 sln0Var7 = new sln0();
            axq.v(sln0Var7, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var3, tln0Var3, urm0Var2);
            sln0Var7.a(y2m0.a(vln0Var2, tln0Var3, urm0Var2));
            arrayList9.add(sln0Var7);
            sln0 sln0Var8 = new sln0();
            axq.v(sln0Var8, y2m0.a(vln0Var3, tln0Var2, urm0Var2), vln0Var3, tln0Var2, urm0Var2);
            sln0Var8.a(y2m0.a(vln0Var2, tln0Var, urm0Var2));
            arrayList9.add(sln0Var8);
            arrayList7.addAll(arrayList9);
        }
        if (iIntValue == 1 || iIntValue == 3) {
            ArrayList arrayList10 = new ArrayList();
            sln0 sln0Var9 = new sln0();
            axq.v(sln0Var9, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var, tln0Var, urm0Var2);
            sln0 sln0VarE7 = axq.e(arrayList10, sln0Var9);
            axq.v(sln0VarE7, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var3, tln0Var, urm0Var2);
            sln0 sln0VarE8 = axq.e(arrayList10, sln0VarE7);
            axq.v(sln0VarE8, y2m0.a(vln0Var3, tln0Var2, urm0Var2), vln0Var3, tln0Var, urm0Var2);
            sln0 sln0VarE9 = axq.e(arrayList10, sln0VarE8);
            axq.v(sln0VarE9, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var, tln0Var2, urm0Var2);
            sln0VarE9.a(y2m0.a(vln0Var2, tln0Var, urm0Var2));
            arrayList10.add(sln0VarE9);
            sln0 sln0Var10 = new sln0();
            tln0 tln0Var4 = tln0.VGA;
            axq.v(sln0Var10, y2m0.a(vln0Var3, tln0Var4, urm0Var2), vln0Var, tln0Var2, urm0Var2);
            sln0Var10.a(y2m0.a(vln0Var3, tln0Var, urm0Var2));
            arrayList10.add(sln0Var10);
            sln0 sln0Var11 = new sln0();
            axq.v(sln0Var11, y2m0.a(vln0Var3, tln0Var4, urm0Var2), vln0Var3, tln0Var2, urm0Var2);
            sln0Var11.a(y2m0.a(vln0Var3, tln0Var, urm0Var2));
            arrayList10.add(sln0Var11);
            arrayList7.addAll(arrayList10);
        }
        if (z) {
            ArrayList arrayList11 = new ArrayList();
            sln0 sln0Var12 = new sln0();
            vln0 vln0Var4 = vln0.e;
            sln0Var12.a(y2m0.a(vln0Var4, tln0Var, urm0Var2));
            arrayList11.add(sln0Var12);
            sln0 sln0Var13 = new sln0();
            axq.v(sln0Var13, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var4, tln0Var, urm0Var2);
            sln0 sln0VarE10 = axq.e(arrayList11, sln0Var13);
            axq.v(sln0VarE10, y2m0.a(vln0Var3, tln0Var2, urm0Var2), vln0Var4, tln0Var, urm0Var2);
            sln0 sln0VarE11 = axq.e(arrayList11, sln0VarE10);
            axq.v(sln0VarE11, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var, tln0Var2, urm0Var2);
            sln0VarE11.a(y2m0.a(vln0Var4, tln0Var, urm0Var2));
            arrayList11.add(sln0VarE11);
            sln0 sln0Var14 = new sln0();
            axq.v(sln0Var14, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var3, tln0Var2, urm0Var2);
            sln0Var14.a(y2m0.a(vln0Var4, tln0Var, urm0Var2));
            arrayList11.add(sln0Var14);
            sln0 sln0Var15 = new sln0();
            axq.v(sln0Var15, y2m0.a(vln0Var3, tln0Var2, urm0Var2), vln0Var3, tln0Var2, urm0Var2);
            sln0Var15.a(y2m0.a(vln0Var4, tln0Var, urm0Var2));
            arrayList11.add(sln0Var15);
            sln0 sln0Var16 = new sln0();
            axq.v(sln0Var16, y2m0.a(vln0Var, tln0Var2, urm0Var2), vln0Var2, tln0Var, urm0Var2);
            sln0Var16.a(y2m0.a(vln0Var4, tln0Var, urm0Var2));
            arrayList11.add(sln0Var16);
            sln0 sln0Var17 = new sln0();
            sln0Var17.a(y2m0.a(vln0Var3, tln0Var2, urm0Var2));
            sln0Var17.a(y2m0.a(vln0Var2, tln0Var, wln0.e));
            sln0Var17.a(y2m0.a(vln0Var4, tln0Var, wln0.e));
            arrayList11.add(sln0Var17);
            arrayList7.addAll(arrayList11);
        }
        if (z2 && iIntValue == 0) {
            ArrayList arrayList12 = new ArrayList();
            sln0 sln0Var18 = new sln0();
            brm0.y(vln0Var, tln0Var2, sln0Var18, vln0Var, tln0Var);
            sln0 sln0VarE12 = axq.e(arrayList12, sln0Var18);
            brm0.y(vln0Var, tln0Var2, sln0VarE12, vln0Var3, tln0Var);
            sln0 sln0VarE13 = axq.e(arrayList12, sln0VarE12);
            brm0.y(vln0Var3, tln0Var2, sln0VarE13, vln0Var3, tln0Var);
            arrayList12.add(sln0VarE13);
            arrayList7.addAll(arrayList12);
        }
        if (iIntValue == 3) {
            ArrayList arrayList13 = new ArrayList();
            sln0 sln0Var19 = new sln0();
            sln0Var19.a(y2m0.a(vln0Var, tln0Var2, wln0.e));
            tln0 tln0Var5 = tln0.VGA;
            brm0.y(vln0Var, tln0Var5, sln0Var19, vln0Var3, tln0Var);
            vln0 vln0Var5 = vln0.e;
            sln0Var19.a(y2m0.a(vln0Var5, tln0Var, wln0.e));
            arrayList13.add(sln0Var19);
            sln0 sln0Var20 = new sln0();
            brm0.y(vln0Var, tln0Var2, sln0Var20, vln0Var, tln0Var5);
            brm0.y(vln0Var2, tln0Var, sln0Var20, vln0Var5, tln0Var);
            arrayList13.add(sln0Var20);
            arrayList7.addAll(arrayList13);
        }
        arrayList2.addAll(arrayList7);
        str.getClass();
        if (extraSupportedSurfaceCombinationsQuirk != null) {
            sln0 sln0Var21 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
            String str2 = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                ArrayList arrayList14 = new ArrayList();
                listC = arrayList14;
                if (Intrinsics.d(str, "1")) {
                    arrayList14.add(ExtraSupportedSurfaceCombinationsQuirk.f45310a);
                    listC = arrayList14;
                }
            } else {
                listC = (mbc.c0() || mbc.d0()) ? kotlin.collections.a.c(ExtraSupportedSurfaceCombinationsQuirk.b) : iun.f15405a;
            }
            listC = listC == null ? iun.f15405a : listC;
        }
        arrayList2.addAll(listC);
        if (this.s) {
            ArrayList arrayList15 = new ArrayList();
            sln0 sln0Var22 = new sln0();
            tln0 tln0Var6 = tln0.ULTRA_MAXIMUM;
            brm0.y(vln0Var3, tln0Var6, sln0Var22, vln0Var, tln0Var2);
            tln0 tln0Var7 = tln0.RECORD;
            sln0Var22.a(y2m0.a(vln0Var, tln0Var7, wln0.e));
            arrayList15.add(sln0Var22);
            sln0 sln0Var23 = new sln0();
            brm0.y(vln0Var2, tln0Var6, sln0Var23, vln0Var, tln0Var2);
            sln0Var23.a(y2m0.a(vln0Var, tln0Var7, wln0.e));
            arrayList15.add(sln0Var23);
            sln0 sln0Var24 = new sln0();
            vln0 vln0Var6 = vln0.e;
            brm0.y(vln0Var6, tln0Var6, sln0Var24, vln0Var, tln0Var2);
            sln0Var24.a(y2m0.a(vln0Var, tln0Var7, wln0.e));
            arrayList15.add(sln0Var24);
            sln0 sln0Var25 = new sln0();
            brm0.y(vln0Var3, tln0Var6, sln0Var25, vln0Var, tln0Var2);
            sln0Var25.a(y2m0.a(vln0Var2, tln0Var, wln0.e));
            arrayList15.add(sln0Var25);
            sln0 sln0Var26 = new sln0();
            brm0.y(vln0Var2, tln0Var6, sln0Var26, vln0Var, tln0Var2);
            sln0Var26.a(y2m0.a(vln0Var2, tln0Var, wln0.e));
            arrayList15.add(sln0Var26);
            sln0 sln0Var27 = new sln0();
            brm0.y(vln0Var6, tln0Var6, sln0Var27, vln0Var, tln0Var2);
            sln0Var27.a(y2m0.a(vln0Var2, tln0Var, wln0.e));
            arrayList15.add(sln0Var27);
            sln0 sln0Var28 = new sln0();
            brm0.y(vln0Var3, tln0Var6, sln0Var28, vln0Var, tln0Var2);
            sln0Var28.a(y2m0.a(vln0Var3, tln0Var, wln0.e));
            arrayList15.add(sln0Var28);
            sln0 sln0Var29 = new sln0();
            brm0.y(vln0Var2, tln0Var6, sln0Var29, vln0Var, tln0Var2);
            sln0Var29.a(y2m0.a(vln0Var3, tln0Var, wln0.e));
            arrayList15.add(sln0Var29);
            sln0 sln0Var30 = new sln0();
            brm0.y(vln0Var6, tln0Var6, sln0Var30, vln0Var, tln0Var2);
            sln0Var30.a(y2m0.a(vln0Var3, tln0Var, wln0.e));
            arrayList15.add(sln0Var30);
            sln0 sln0Var31 = new sln0();
            brm0.y(vln0Var3, tln0Var6, sln0Var31, vln0Var, tln0Var2);
            sln0Var31.a(y2m0.a(vln0Var6, tln0Var, wln0.e));
            arrayList15.add(sln0Var31);
            sln0 sln0Var32 = new sln0();
            brm0.y(vln0Var2, tln0Var6, sln0Var32, vln0Var, tln0Var2);
            sln0Var32.a(y2m0.a(vln0Var6, tln0Var, wln0.e));
            arrayList15.add(sln0Var32);
            sln0 sln0Var33 = new sln0();
            brm0.y(vln0Var6, tln0Var6, sln0Var33, vln0Var, tln0Var2);
            sln0Var33.a(y2m0.a(vln0Var6, tln0Var, wln0.e));
            arrayList15.add(sln0Var33);
            arrayList4.addAll(arrayList15);
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.q = zHasSystemFeature;
        if (zHasSystemFeature) {
            ArrayList arrayList16 = new ArrayList();
            sln0 sln0Var34 = new sln0();
            tln0 tln0Var8 = tln0.S1440P_4_3;
            sln0Var34.a(y2m0.a(vln0Var3, tln0Var8, wln0.e));
            arrayList16.add(sln0Var34);
            sln0 sln0Var35 = new sln0();
            sln0Var35.a(y2m0.a(vln0Var, tln0Var8, wln0.e));
            arrayList16.add(sln0Var35);
            sln0 sln0Var36 = new sln0();
            sln0Var36.a(y2m0.a(vln0Var2, tln0Var8, wln0.e));
            arrayList16.add(sln0Var36);
            sln0 sln0Var37 = new sln0();
            tln0 tln0Var9 = tln0.S720P_16_9;
            brm0.y(vln0Var3, tln0Var9, sln0Var37, vln0Var2, tln0Var8);
            sln0 sln0VarE14 = axq.e(arrayList16, sln0Var37);
            brm0.y(vln0Var, tln0Var9, sln0VarE14, vln0Var2, tln0Var8);
            sln0 sln0VarE15 = axq.e(arrayList16, sln0VarE14);
            brm0.y(vln0Var3, tln0Var9, sln0VarE15, vln0Var3, tln0Var8);
            sln0 sln0VarE16 = axq.e(arrayList16, sln0VarE15);
            brm0.y(vln0Var3, tln0Var9, sln0VarE16, vln0Var, tln0Var8);
            sln0 sln0VarE17 = axq.e(arrayList16, sln0VarE16);
            brm0.y(vln0Var, tln0Var9, sln0VarE17, vln0Var3, tln0Var8);
            sln0 sln0VarE18 = axq.e(arrayList16, sln0VarE17);
            brm0.y(vln0Var, tln0Var9, sln0VarE18, vln0Var, tln0Var8);
            arrayList16.add(sln0VarE18);
            arrayList.addAll(arrayList16);
        }
        if (cgx0Var.b) {
            sln0 sln0Var38 = new sln0();
            sln0Var38.a(y2m0.a(vln0Var, tln0Var, wln0.e));
            sln0 sln0Var39 = new sln0();
            sln0Var39.a(y2m0.a(vln0Var3, tln0Var, wln0.e));
            sln0 sln0Var40 = new sln0();
            sln0Var40.a(y2m0.a(vln0Var, tln0Var2, wln0.e));
            sln0Var40.a(y2m0.a(vln0Var2, tln0Var, wln0.e));
            sln0 sln0Var41 = new sln0();
            sln0Var41.a(y2m0.a(vln0Var, tln0Var2, wln0.e));
            sln0Var41.a(y2m0.a(vln0Var3, tln0Var, wln0.e));
            sln0 sln0Var42 = new sln0();
            sln0Var42.a(y2m0.a(vln0Var3, tln0Var2, wln0.e));
            sln0Var42.a(y2m0.a(vln0Var3, tln0Var, wln0.e));
            sln0 sln0Var43 = new sln0();
            sln0Var43.a(y2m0.a(vln0Var, tln0Var2, wln0.e));
            tln0 tln0Var10 = tln0.RECORD;
            sln0Var43.a(y2m0.a(vln0Var, tln0Var10, wln0.e));
            sln0 sln0Var44 = new sln0();
            brm0.y(vln0Var, tln0Var2, sln0Var44, vln0Var, tln0Var10);
            sln0Var44.a(y2m0.a(vln0Var3, tln0Var10, wln0.e));
            sln0 sln0Var45 = new sln0();
            brm0.y(vln0Var, tln0Var2, sln0Var45, vln0Var, tln0Var10);
            sln0Var45.a(y2m0.a(vln0Var2, tln0Var10, wln0.e));
            arrayList6.addAll(q3d.j(sln0Var38, sln0Var39, sln0Var40, sln0Var41, sln0Var42, sln0Var43, sln0Var44, sln0Var45));
        }
        if (zB) {
            ArrayList arrayList17 = new ArrayList();
            sln0 sln0Var46 = new sln0();
            tln0 tln0Var11 = tln0.S1440P_4_3;
            sln0Var46.a(y2m0.a(vln0Var, tln0Var11, wln0.e));
            arrayList17.add(sln0Var46);
            sln0 sln0Var47 = new sln0();
            sln0Var47.a(y2m0.a(vln0Var3, tln0Var11, wln0.e));
            arrayList17.add(sln0Var47);
            sln0 sln0Var48 = new sln0();
            brm0.y(vln0Var, tln0Var11, sln0Var48, vln0Var2, tln0Var);
            sln0 sln0VarE19 = axq.e(arrayList17, sln0Var48);
            brm0.y(vln0Var3, tln0Var11, sln0VarE19, vln0Var2, tln0Var);
            sln0 sln0VarE20 = axq.e(arrayList17, sln0VarE19);
            brm0.y(vln0Var, tln0Var11, sln0VarE20, vln0Var3, tln0Var);
            sln0 sln0VarE21 = axq.e(arrayList17, sln0VarE20);
            brm0.y(vln0Var3, tln0Var11, sln0VarE21, vln0Var3, tln0Var);
            sln0 sln0VarE22 = axq.e(arrayList17, sln0VarE21);
            brm0.y(vln0Var, tln0Var2, sln0VarE22, vln0Var, tln0Var11);
            sln0 sln0VarE23 = axq.e(arrayList17, sln0VarE22);
            brm0.y(vln0Var3, tln0Var2, sln0VarE23, vln0Var, tln0Var11);
            sln0 sln0VarE24 = axq.e(arrayList17, sln0VarE23);
            brm0.y(vln0Var, tln0Var2, sln0VarE24, vln0Var3, tln0Var11);
            sln0 sln0VarE25 = axq.e(arrayList17, sln0VarE24);
            brm0.y(vln0Var3, tln0Var2, sln0VarE25, vln0Var3, tln0Var11);
            arrayList17.add(sln0VarE25);
            arrayList5.addAll(arrayList17);
        }
        u15 u15Var = vrm0.f37906a;
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 33) {
            CameraCharacteristics.Key key3 = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key3.getClass();
            long[] jArr = (long[]) ow9Var.c(key3);
            if (jArr != null && jArr.length != 0) {
                z3 = true;
            }
        }
        this.r = z3;
        if (z3 && i >= 33) {
            sln0 sln0Var49 = new sln0();
            tln0 tln0Var12 = tln0.S1440P_4_3;
            urm0 urm0Var3 = urm0.PREVIEW_VIDEO_STILL;
            sln0Var49.a(y2m0.a(vln0Var, tln0Var12, urm0Var3));
            sln0 sln0Var50 = new sln0();
            sln0Var50.a(y2m0.a(vln0Var3, tln0Var12, urm0Var3));
            sln0 sln0Var51 = new sln0();
            tln0 tln0Var13 = tln0.RECORD;
            urm0 urm0Var4 = urm0.VIDEO_RECORD;
            sln0Var51.a(y2m0.a(vln0Var, tln0Var13, urm0Var4));
            sln0 sln0Var52 = new sln0();
            sln0Var52.a(y2m0.a(vln0Var3, tln0Var13, urm0Var4));
            sln0 sln0Var53 = new sln0();
            urm0 urm0Var5 = urm0.STILL_CAPTURE;
            sln0Var53.a(y2m0.a(vln0Var2, tln0Var, urm0Var5));
            sln0 sln0Var54 = new sln0();
            sln0Var54.a(y2m0.a(vln0Var3, tln0Var, urm0Var5));
            sln0 sln0Var55 = new sln0();
            urm0 urm0Var6 = urm0.PREVIEW;
            sln0Var55.a(y2m0.a(vln0Var, tln0Var2, urm0Var6));
            sln0Var55.a(y2m0.a(vln0Var2, tln0Var, urm0Var5));
            sln0 sln0Var56 = new sln0();
            sln0Var56.a(y2m0.a(vln0Var, tln0Var2, urm0Var6));
            sln0Var56.a(y2m0.a(vln0Var3, tln0Var, urm0Var5));
            sln0 sln0Var57 = new sln0();
            sln0Var57.a(y2m0.a(vln0Var, tln0Var2, urm0Var6));
            sln0Var57.a(y2m0.a(vln0Var, tln0Var13, urm0Var4));
            sln0 sln0Var58 = new sln0();
            sln0Var58.a(y2m0.a(vln0Var, tln0Var2, urm0Var6));
            sln0Var58.a(y2m0.a(vln0Var3, tln0Var13, urm0Var4));
            sln0 sln0Var59 = new sln0();
            sln0Var59.a(y2m0.a(vln0Var, tln0Var2, urm0Var6));
            sln0Var59.a(y2m0.a(vln0Var3, tln0Var2, urm0Var6));
            sln0 sln0Var60 = new sln0();
            axq.v(sln0Var60, y2m0.a(vln0Var, tln0Var2, urm0Var6), vln0Var, tln0Var13, urm0Var4);
            sln0Var60.a(y2m0.a(vln0Var2, tln0Var13, urm0Var5));
            sln0 sln0Var61 = new sln0();
            axq.v(sln0Var61, y2m0.a(vln0Var, tln0Var2, urm0Var6), vln0Var3, tln0Var13, urm0Var4);
            sln0Var61.a(y2m0.a(vln0Var2, tln0Var13, urm0Var5));
            sln0 sln0Var62 = new sln0();
            axq.v(sln0Var62, y2m0.a(vln0Var, tln0Var2, urm0Var6), vln0Var3, tln0Var2, urm0Var6);
            sln0Var62.a(y2m0.a(vln0Var2, tln0Var, urm0Var5));
            arrayList3.addAll(q3d.j(sln0Var49, sln0Var50, sln0Var51, sln0Var52, sln0Var53, sln0Var54, sln0Var55, sln0Var56, sln0Var57, sln0Var58, sln0Var59, sln0Var60, sln0Var61, sln0Var62));
        }
        c();
    }

    public static boolean b(hln0 hln0Var, gln0 gln0Var, ArrayList arrayList) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        iun iunVar = iun.f15405a;
        return hln0Var.a(gln0Var, arrayList, lunVar, iunVar, iunVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    public static Range d(Range range, int i, Range[] rangeArr) {
        Range range2 = h55.h;
        if (Intrinsics.d(range, range2)) {
            range2.getClass();
            return range2;
        }
        if (rangeArr == null) {
            range2.getClass();
            return range2;
        }
        Object lower = range.getLower();
        lower.getClass();
        Integer numValueOf = Integer.valueOf(Math.min(((Number) lower).intValue(), i));
        Object upper = range.getUpper();
        upper.getClass();
        Range range3 = new Range(numValueOf, Integer.valueOf(Math.min(((Number) upper).intValue(), i)));
        int i2 = 0;
        for (Range range4 : rangeArr) {
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (Intrinsics.d(range2, h55.h)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    range2 = range4;
                    break;
                }
                try {
                    Range rangeIntersect = range4.intersect(range3);
                    rangeIntersect.getClass();
                    int i3 = i(rangeIntersect);
                    if (i2 == 0) {
                        range2 = range4;
                        i2 = i3;
                    } else if (i3 >= i2) {
                        range2.getClass();
                        Range rangeIntersect2 = range2.intersect(range3);
                        rangeIntersect2.getClass();
                        double dI = i(rangeIntersect2);
                        Range rangeIntersect3 = range4.intersect(range3);
                        rangeIntersect3.getClass();
                        double dI2 = i(rangeIntersect3);
                        double dI3 = dI2 / ((double) i(range4));
                        double dI4 = dI / ((double) i(range2));
                        if (dI2 > dI) {
                            if (dI3 >= 0.5d || dI3 >= dI4) {
                                range2 = range4;
                            }
                        } else if (dI2 == dI) {
                            if (dI3 > dI4 || (dI3 == dI4 && ((Number) range4.getLower()).intValue() > ((Number) range2.getLower()).intValue())) {
                                range2 = range4;
                            }
                        } else if (dI4 < 0.5d && dI3 > dI4) {
                            range2 = range4;
                        }
                        Range rangeIntersect4 = range3.intersect(range2);
                        rangeIntersect4.getClass();
                        i2 = i(rangeIntersect4);
                    }
                } catch (IllegalArgumentException unused) {
                    if (i2 == 0) {
                        int iH = h(range4, range3);
                        range2.getClass();
                        if (iH < h(range2, range3) || (h(range4, range3) == h(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || i(range4) < i(range2)))) {
                            range2 = range4;
                        }
                    }
                }
            }
        }
        range2.getClass();
        return range2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public static Size f(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            if (i == 34) {
                if (streamConfigurationMap != null) {
                    g0g0Var = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                } else {
                    g0g0Var = null;
                }
            } else if (streamConfigurationMap != null) {
                g0g0Var = streamConfigurationMap.getOutputSizes(i);
            } else {
                g0g0Var = null;
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        Size[] sizeArr = (Size[]) g0g0Var;
        if (sizeArr == null) {
            sizeArr = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (ky3.a(rational, size)) {
                    arrayList.add(size);
                }
            }
            sizeArr = (Size[]) arrayList.toArray(new Size[0]);
        }
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        ycd ycdVar = new ycd(false);
        List listAsList = Arrays.asList(sizeArr);
        listAsList.getClass();
        Size size2 = (Size) Collections.max(listAsList, ycdVar);
        Size size3 = v7k0.f36930a;
        if (z) {
            Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                List listAsList2 = Arrays.asList(highResolutionOutputSizes);
                listAsList2.getClass();
                size3 = (Size) Collections.max(listAsList2, ycdVar);
            }
        }
        return (Size) Collections.max(q3d.j(size2, size3), ycdVar);
    }

    public static int h(Range range, Range range2) {
        if (range.contains(range2.getUpper()) || range.contains(range2.getLower())) {
            jf4.o("Ranges must not intersect");
            return 0;
        }
        if (((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue()) {
            int iIntValue = ((Number) range.getLower()).intValue();
            Object upper = range2.getUpper();
            upper.getClass();
            return iIntValue - ((Number) upper).intValue();
        }
        int iIntValue2 = ((Number) range2.getLower()).intValue();
        Object upper2 = range.getUpper();
        upper2.getClass();
        return iIntValue2 - ((Number) upper2).intValue();
    }

    public static int i(Range range) {
        int iIntValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        lower.getClass();
        return (iIntValue - ((Number) lower).intValue()) + 1;
    }

    public static Range o(Range range, Range range2, boolean z) {
        Range range3 = h55.h;
        if (Intrinsics.d(range2, range3) && Intrinsics.d(range, range3)) {
            range3.getClass();
            return range3;
        }
        if (Intrinsics.d(range2, range3)) {
            return range;
        }
        if (!Intrinsics.d(range, range3)) {
            if (z) {
                z1x.y("All targetFrameRate should be the same if strict fps is required", Intrinsics.d(range, range2));
                return range;
            }
            try {
                Range rangeIntersect = range2.intersect(range);
                rangeIntersect.getClass();
                return rangeIntersect;
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean a(gln0 gln0Var, ArrayList arrayList, Map map, List list, List list2) {
        boolean z;
        ArrayList arrayList2;
        List list3;
        boolean z2;
        Size size;
        Iterator it;
        upt0 upt0Var;
        Integer num;
        rfu0 rfu0Var = gln0Var.d;
        boolean z3 = gln0Var.h;
        Integer num2 = 2;
        map.getClass();
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = this.l;
        String str = "Required value was null.";
        if (linkedHashMap.containsKey(gln0Var)) {
            Object obj = linkedHashMap.get(gln0Var);
            obj.getClass();
            list3 = (List) obj;
            z3 = z3;
            num2 = num2;
            str = "Required value was null.";
            z = false;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i = gln0Var.f11501a;
            if (z3) {
                n0o0 n0o0Var = piv.f27060a;
                c1a c1aVar = this.f13272a;
                c1aVar.getClass();
                rfu0Var.getClass();
                ArrayList arrayList4 = new ArrayList();
                z = false;
                if (Build.VERSION.SDK_INT >= 35) {
                    CameraCharacteristics.Key key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
                    key.getClass();
                    Object objC = ((ow9) c1aVar).c(key);
                    if (objC == null) {
                        jf4.o("Required value was null.");
                        return false;
                    }
                    int iIntValue = ((Number) objC).intValue();
                    if (iIntValue >= 35 && rfu0Var != rfu0.d) {
                        arrayList4.addAll((List) piv.f27060a.getValue());
                    }
                    if (iIntValue >= 36 && rfu0Var != rfu0.e) {
                        arrayList4.addAll((List) piv.b.getValue());
                    }
                }
                arrayList3.addAll(arrayList4);
                z3 = z3;
                num2 = num2;
                str = "Required value was null.";
            } else {
                z = false;
                if (gln0Var.e) {
                    ArrayList arrayList5 = this.n;
                    if (arrayList5.isEmpty()) {
                        n0o0 n0o0Var2 = piv.f27060a;
                        ArrayList arrayList6 = new ArrayList();
                        sln0 sln0Var = new sln0();
                        urm0 urm0Var = wln0.e;
                        vln0 vln0Var = vln0.d;
                        tln0 tln0Var = tln0.MAXIMUM;
                        urm0 urm0Var2 = wln0.e;
                        sln0Var.a(y2m0.a(vln0Var, tln0Var, urm0Var2));
                        arrayList6.add(sln0Var);
                        sln0 sln0Var2 = new sln0();
                        axq.v(sln0Var2, y2m0.a(vln0.f37634a, tln0.PREVIEW, urm0Var2), vln0Var, tln0Var, urm0Var2);
                        arrayList6.add(sln0Var2);
                        arrayList5.addAll(arrayList6);
                    }
                    if (i == 0) {
                        arrayList3.addAll(arrayList5);
                    }
                } else {
                    z3 = z3;
                    num2 = num2;
                    str = "Required value was null.";
                    if (gln0Var.f) {
                        ArrayList arrayList7 = this.k;
                        if (arrayList7.isEmpty()) {
                            pxv pxvVar = this.C;
                            if (((Boolean) pxvVar.b.getValue()).booleanValue()) {
                                arrayList7.clear();
                                Size size2 = (Size) pxvVar.c.getValue();
                                if (size2 != null) {
                                    m55 m55VarN = n(34);
                                    n0o0 n0o0Var3 = piv.f27060a;
                                    ArrayList arrayList8 = new ArrayList();
                                    urm0 urm0Var3 = wln0.e;
                                    wln0 wln0VarD = y2m0.d(34, size2, m55VarN, 0, uln0.b, wln0.e);
                                    sln0 sln0Var3 = new sln0();
                                    sln0Var3.a(wln0VarD);
                                    arrayList8.add(sln0Var3);
                                    sln0 sln0Var4 = new sln0();
                                    sln0Var4.a(wln0VarD);
                                    sln0Var4.a(wln0VarD);
                                    arrayList8.add(sln0Var4);
                                    arrayList7.addAll(arrayList8);
                                }
                            }
                        }
                        arrayList3.addAll(arrayList7);
                    } else {
                        int i2 = gln0Var.b;
                        if (i2 == 8) {
                            if (i != 1) {
                                ArrayList arrayList9 = this.g;
                                if (i != 2) {
                                    if (rfu0Var == rfu0.e) {
                                        arrayList9 = this.j;
                                    }
                                    arrayList3.addAll(arrayList9);
                                } else {
                                    arrayList3.addAll(this.i);
                                    arrayList3.addAll(arrayList9);
                                }
                            } else {
                                arrayList2 = this.f;
                            }
                            linkedHashMap.put(gln0Var, arrayList2);
                            list3 = arrayList2;
                        } else if (i2 == 10 && i == 0) {
                            arrayList3.addAll(this.m);
                        }
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(gln0Var, arrayList2);
            list3 = arrayList2;
        }
        if (list3 != null && list3.isEmpty()) {
            z2 = z;
            break;
        }
        Iterator it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = z;
                break;
            }
            if (((sln0) it2.next()).c(arrayList) != null) {
                z2 = true;
                break;
            }
        }
        if (!z2 || !z3) {
            return z2;
        }
        wii0 wii0Var = new wii0();
        Iterator it3 = arrayList.iterator();
        ?? r7 = z;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i3 = r7 + 1;
            if (r7 < 0) {
                q3d.p();
                throw null;
            }
            wln0 wln0Var = (wln0) next;
            m55 m55VarN2 = n(wln0Var.d);
            LinkedHashMap linkedHashMap2 = m55VarN2.f;
            int i4 = wln0Var.d;
            tln0 tln0Var2 = wln0Var.b;
            int iOrdinal = tln0Var2.ordinal();
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        size = m55VarN2.e;
                        break;
                    case 10:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i4));
                        break;
                    case 11:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i4));
                        break;
                    case 12:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i4));
                        break;
                    case 13:
                        size = (Size) m55VarN2.i.get(Integer.valueOf(i4));
                        break;
                    case 14:
                        jf4.n("Not supported config size");
                        return z;
                    default:
                        size = tln0Var2.b;
                        break;
                }
            } else {
                size = m55VarN2.c;
            }
            size.getClass();
            fpt0 fpt0Var = (fpt0) list.get(((Number) list2.get(r7)).intValue());
            Object obj2 = map.get(wln0Var);
            if (obj2 == null) {
                jf4.o(str);
                return z;
            }
            agn agnVar = (agn) obj2;
            fpt0Var.getClass();
            dgp dgpVar = new dgp(fpt0Var.k(), size);
            upt0.b.getClass();
            int iOrdinal2 = fpt0Var.v().ordinal();
            if (iOrdinal2 != 0) {
                it = it3;
                if (iOrdinal2 == 1) {
                    upt0Var = upt0.c;
                } else if (iOrdinal2 == 2) {
                    upt0Var = upt0.e;
                } else if (iOrdinal2 != 3) {
                    upt0Var = iOrdinal2 != 4 ? upt0.h : upt0.g;
                } else {
                    upt0Var = upt0.f;
                }
            } else {
                it = it3;
                upt0Var = upt0.d;
            }
            Class cls = upt0Var.f36084a;
            if (cls != null) {
                dgpVar.j = cls;
            }
            tii0 tii0VarD = tii0.d(fpt0Var, size);
            ucs0 ucs0Var = tii0VarD.b;
            tii0VarD.b(dgpVar, agnVar, -1);
            Range range = gln0Var.i;
            if (Intrinsics.d(range, h55.h)) {
                range = null;
            }
            if (range == null) {
                range = rwq.d;
            }
            ((wy40) ucs0Var.d).y(t7a.h, range);
            if (rfu0Var == rfu0.e) {
                num = num2;
                ((wy40) ucs0Var.d).y(fpt0.O0, num);
            } else {
                num = num2;
                if (rfu0Var == rfu0.d) {
                    ((wy40) ucs0Var.d).y(fpt0.P0, num);
                }
            }
            wii0Var.a(tii0VarD.c());
            boolean zC = wii0Var.c();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(fpt0Var);
            sb.append(" with ");
            sb.append(wln0Var);
            sb.append(" due to [");
            sb.append(!wii0Var.m ? "Template is not set" : wii0Var.l.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(gln0Var);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            z1x.y(sb.toString(), zC);
            r7 = i3;
            num2 = num;
            it3 = it;
        }
        xii0 xii0VarB = wii0Var.b();
        boolean zL = this.c.l(xii0VarB);
        List listB = xii0VarB.b();
        listB.getClass();
        Iterator it4 = listB.iterator();
        while (it4.hasNext()) {
            ((hzj) it4.next()).a();
        }
        return zL;
    }

    public final void c() {
        Object g0g0Var;
        Size sizeJ;
        Size sizeC = this.y.c();
        try {
            Integer.parseInt(this.d);
            sizeJ = j();
            if (sizeJ == null) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.x.d.f30839a;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(MediaRecorder.class) : null;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                Size[] sizeArr = (Size[]) g0g0Var;
                if (sizeArr != null) {
                    Arrays.sort(sizeArr, new ycd(true));
                    int length = sizeArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            sizeJ = null;
                            break;
                        }
                        Size size = sizeArr[i];
                        int width = size.getWidth();
                        Size size2 = v7k0.e;
                        if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                            sizeJ = size;
                            break;
                        }
                        i++;
                    }
                } else {
                    sizeJ = null;
                    break;
                }
                if (sizeJ == null) {
                    sizeJ = v7k0.c;
                    sizeJ.getClass();
                }
            }
        } catch (NumberFormatException unused) {
        }
        this.v = new m55(v7k0.b, new LinkedHashMap(), sizeC, new LinkedHashMap(), sizeJ, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public final int e(int i, Size size, boolean z, int i2) {
        long jH;
        int iIntValue = 0;
        if (!z) {
            erm0 erm0VarK = k();
            size.getClass();
            try {
                jH = erm0VarK.d.h(i, size);
            } catch (RuntimeException e) {
                if (l8x.j0()) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                jH = 0;
            }
            if (jH > 0) {
                iIntValue = (int) (1.0E9d / jH);
            } else if (!this.u) {
                iIntValue = Integer.MAX_VALUE;
            } else if (l8x.j0()) {
                StringBuilder sbQ = brm0.q(i, jH, "minFrameDuration: ", " is invalid for imageFormat = ");
                sbQ.append(", size = ");
                sbQ.append(size);
                Log.w("CXCP", sbQ.toString());
            }
        } else {
            if (i != 34) {
                jf4.n("Check failed.");
                return 0;
            }
            pxv pxvVar = this.C;
            pxvVar.getClass();
            size.getClass();
            List listC = pxvVar.c(size);
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC == null) {
                l8x.E0("HighSpeedResolver", "No supported high speed  fps for " + size);
            } else {
                Iterator it = listC.iterator();
                if (!it.hasNext()) {
                    itt0.a();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                num.getClass();
                iIntValue = num.intValue();
            }
        }
        return Math.min(i2, iIntValue);
    }

    public final List g(gln0 gln0Var, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        List list;
        u15 u15Var = vrm0.f37906a;
        if (gln0Var.f11501a == 0 && gln0Var.b == 8 && !gln0Var.f) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List listC = ((sln0) it.next()).c(arrayList);
                if (listC != null) {
                    u15 u15Var2 = vrm0.f37906a;
                    int size = listC.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        long j = ((wln0) listC.get(i)).c.f36171a;
                        boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(i));
                        hpt0 hpt0Var = hpt0.e;
                        if (zContainsKey) {
                            l15 l15Var = (l15) linkedHashMap.get(Integer.valueOf(i));
                            l15Var.getClass();
                            List list2 = l15Var.e;
                            if (list2.size() == 1) {
                                hpt0Var = (hpt0) list2.get(0);
                            }
                            hpt0Var.getClass();
                            if (!vrm0.b(hpt0Var, j, list2)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
                                c99.l("SurfaceConfig does not map to any use case");
                                return null;
                            }
                            Object obj = linkedHashMap2.get(Integer.valueOf(i));
                            obj.getClass();
                            fpt0 fpt0Var = (fpt0) obj;
                            hpt0 hpt0VarV = fpt0Var.v();
                            hpt0VarV.getClass();
                            if (fpt0Var.v() == hpt0Var) {
                                list = (List) ((rrm0) fpt0Var).d(rrm0.b);
                                list.getClass();
                            } else {
                                list = iun.f15405a;
                            }
                            if (!vrm0.b(hpt0VarV, j, list)) {
                                break;
                            }
                            i++;
                        }
                    }
                    n0o0 n0o0VarB = maz.b(new o0k0((Object) this, (Object) listC, (byte) 19));
                    if (z && ((Boolean) n0o0VarB.getValue()).booleanValue()) {
                        return listC;
                    }
                }
            }
        }
        return null;
    }

    public final Size j() {
        n35 n35VarB;
        Iterator it = q3d.j(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ewn ewnVar = this.b;
            if (ewnVar.a(iIntValue) && (n35VarB = ewnVar.b(iIntValue)) != null) {
                List list = n35VarB.d;
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj = list.get(0);
                    obj.getClass();
                    o35 o35Var = (o35) obj;
                    return new Size(o35Var.e, o35Var.f);
                }
            }
        }
        return null;
    }

    public final erm0 k() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        c1a c1aVar = this.f13272a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ow9) c1aVar).c(key);
        if (streamConfigurationMap != null) {
            return new erm0(streamConfigurationMap, new cf80(c1aVar));
        }
        jf4.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList l(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l15 l15Var = (l15) it.next();
            arrayList3.add(l15Var.f19232a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), l15Var);
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            Size size = (Size) it2.next();
            fpt0 fpt0Var = (fpt0) list2.get(((Number) arrayList2.get(i2)).intValue());
            int iK = fpt0Var.k();
            urm0 urm0VarU = fpt0Var.u();
            urm0 urm0Var = wln0.e;
            arrayList3.add(y2m0.d(iK, size, n(iK), i, z ? uln0.f35881a : uln0.b, urm0VarU));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), fpt0Var);
            i2 = i3;
        }
        return arrayList3;
    }

    public final m55 m() {
        m55 m55Var = this.v;
        if (m55Var != null) {
            return m55Var;
        }
        Intrinsics.h("surfaceSizeDefinition");
        throw null;
    }

    public final m55 n(int i) {
        Size sizeF;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.w;
        if (!arrayList.contains(numValueOf)) {
            LinkedHashMap linkedHashMap = m().b;
            Size size = v7k0.d;
            size.getClass();
            s(linkedHashMap, size, i);
            LinkedHashMap linkedHashMap2 = m().d;
            Size size2 = v7k0.f;
            size2.getClass();
            s(linkedHashMap2, size2, i);
            r(m().f, i, null);
            r(m().g, i, ky3.f19087a);
            r(m().h, i, ky3.c);
            LinkedHashMap linkedHashMap3 = m().i;
            if (Build.VERSION.SDK_INT >= 31 && this.s) {
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                key.getClass();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ow9) this.f13272a).c(key);
                if (streamConfigurationMap != null && (sizeF = f(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap3.put(Integer.valueOf(i), sizeF);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        return m();
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0616 A[PHI: r9 r22 r24
  0x0616: PHI (r9v35 int) = (r9v34 int), (r9v34 int), (r9v38 int), (r9v39 int) binds: [B:194:0x05ea, B:196:0x05f6, B:202:0x0603, B:205:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x0616: PHI (r22v6 int) = (r22v5 int), (r22v5 int), (r22v5 int), (r22v7 int) binds: [B:194:0x05ea, B:196:0x05f6, B:202:0x0603, B:205:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x0616: PHI (r24v3 java.util.List) = (r24v2 java.util.List), (r24v2 java.util.List), (r24v5 java.util.List), (r24v6 java.util.List) binds: [B:194:0x05ea, B:196:0x05f6, B:202:0x0603, B:205:0x0611] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x061a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x0658  */
    /* JADX WARN: Code duplicated, block: B:299:0x0838  */
    /* JADX WARN: Code duplicated, block: B:302:0x084d  */
    /* JADX WARN: Code duplicated, block: B:310:0x0866  */
    /* JADX WARN: Code duplicated, block: B:312:0x0872  */
    /* JADX WARN: Code duplicated, block: B:331:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:383:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:385:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:387:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:391:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:401:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:403:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:464:0x0858 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:? A[LOOP:15: B:300:0x0847->B:465:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x087d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0879 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:? A[LOOP:16: B:308:0x0860->B:469:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0a53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0a4f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0a9d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0a95 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [int] */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r37v7 */
    public final tmn0 p(gln0 gln0Var, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        boolean z;
        c1a c1aVar;
        List list2;
        int i;
        boolean z2;
        int i2;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        c1a c1aVar2;
        String str;
        String str2;
        int i3;
        List listG;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        gln0 gln0Var2;
        ?? r37;
        List list3;
        int i4;
        List list4;
        List list5;
        int size;
        int i5;
        long j;
        LinkedHashMap linkedHashMap6;
        LinkedHashMap linkedHashMap7;
        fpt0 fpt0Var;
        h55 h55Var;
        hx9 hx9VarA;
        l15 l15Var;
        hx9 hx9VarA2;
        qgd qgdVarA;
        Range range;
        agn agnVar;
        Iterator it;
        Iterator it2;
        long[] jArr;
        int i6;
        int i7;
        Object obj;
        Range[] rangeArrB;
        int i8;
        agn agnVar2;
        List list6;
        Size size2;
        ArrayList<Size> arrayList4;
        Size sizeB;
        hln0 hln0Var = this;
        gln0 gln0Var3 = gln0Var;
        Map map2 = map;
        linkedHashMap = linkedHashMap;
        boolean z3 = gln0Var3.f;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: featureSettings = " + gln0Var3);
        }
        boolean z4 = gln0Var3.g;
        Range range2 = gln0Var3.i;
        String str3 = ". New configs: ";
        String str4 = hln0Var.d;
        String str5 = "No supported surface combination is found for camera device - Id : ";
        if (z4) {
            z = z4;
        } else {
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((l15) it3.next()).f19232a);
            }
            ycd ycdVar = new ycd(false);
            for (fpt0 fpt0Var2 : map2.keySet()) {
                boolean z5 = z4;
                List list7 = (List) map2.get(fpt0Var2);
                if (list7 == null || list7.isEmpty()) {
                    ohq.i(46, "No available output size is found for ", fpt0Var2);
                    return null;
                }
                Size size3 = (Size) Collections.min(list7, ycdVar);
                int iK = fpt0Var2.k();
                urm0 urm0VarU = fpt0Var2.u();
                urm0 urm0Var = wln0.e;
                size3.getClass();
                arrayList5.add(y2m0.d(iK, size3, hln0Var.n(iK), gln0Var3.f11501a, uln0.b, urm0VarU));
                z4 = z5;
            }
            z = z4;
            if (!b(hln0Var, gln0Var3, arrayList5)) {
                throw new IllegalArgumentException(("No supported surface combination is found for camera device - Id : " + str4 + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList + ". New configs: " + list + ". GroupableFeature settings: " + gln0Var3 + '.').toString());
            }
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        Iterator it4 = map2.keySet().iterator();
        Map map3 = map2;
        while (true) {
            Iterator it5 = it4;
            if (!it4.hasNext()) {
                break;
            }
            fpt0 fpt0Var3 = (fpt0) it5.next();
            ArrayList arrayList6 = new ArrayList();
            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
            Object obj2 = map3.get(fpt0Var3);
            obj2.getClass();
            for (Size size4 : (List) obj2) {
                int iK2 = fpt0Var3.k();
                String str6 = str4;
                int iW = fpt0Var3.w(size4);
                urm0 urm0VarU2 = fpt0Var3.u();
                urm0 urm0Var2 = wln0.e;
                String str7 = str5;
                tln0 tln0Var = y2m0.d(iK2, size4, hln0Var.n(iK2), gln0Var3.f11501a, gln0Var3.h ? uln0.f35881a : uln0.b, urm0VarU2).b;
                String str8 = str3;
                Range range3 = h55.h;
                int iE = Intrinsics.d(range2, range3) ? Integer.MAX_VALUE : hln0Var.e(iK2, size4, z3, iW);
                if (!z || (tln0Var != tln0.NOT_SUPPORT && (Intrinsics.d(range2, range3) || iE >= ((Number) range2.getUpper()).intValue()))) {
                    Set linkedHashSet = (Set) linkedHashMap9.get(tln0Var);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap9.put(tln0Var, linkedHashSet);
                    }
                    if (!linkedHashSet.contains(Integer.valueOf(iE))) {
                        arrayList6.add(size4);
                        linkedHashSet.add(Integer.valueOf(iE));
                    }
                }
                str4 = str6;
                str5 = str7;
                str3 = str8;
            }
            linkedHashMap8.put(fpt0Var3, arrayList6);
            map3 = map;
            it4 = it5;
        }
        String str9 = str4;
        String str10 = str5;
        String str11 = str3;
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it6.hasNext();
            c1aVar = hln0Var.f13272a;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Number) it6.next()).intValue();
            Object obj3 = linkedHashMap8.get(list.get(iIntValue));
            obj3.getClass();
            List<Size> list8 = (List) obj3;
            int iK3 = ((fpt0) list.get(iIntValue)).k();
            hln0Var.A.getClass();
            c1aVar.getClass();
            erm0 erm0Var = hln0Var.x;
            erm0Var.getClass();
            Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) mhk.a().b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new i2a(c1aVar, erm0Var).a().b(AspectRatioLegacyApi21Quirk.class)) == null) || (size2 = (Size) hln0Var.n(256).f.get(256)) == null) ? null : new Rational(size2.getWidth(), size2.getHeight());
            if (rational == null) {
                arrayList4 = new ArrayList(list8);
            } else {
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                for (Size size5 : list8) {
                    if (ky3.a(rational, size5)) {
                        arrayList8.add(size5);
                    } else {
                        arrayList9.add(size5);
                    }
                }
                arrayList9.addAll(0, arrayList8);
                arrayList4 = arrayList9;
            }
            urm0 urm0Var3 = wln0.e;
            vln0 vln0Var = (vln0) wln0.h.get(Integer.valueOf(iK3));
            if (vln0Var == null) {
                vln0Var = vln0.f37634a;
            }
            ugf0 ugf0Var = hln0Var.z;
            ugf0Var.getClass();
            if (((ExtraCroppingQuirk) ugf0Var.f35622a) != null && (sizeB = ExtraCroppingQuirk.b(vln0Var)) != null) {
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(sizeB);
                for (Size size6 : arrayList4) {
                    if (!Intrinsics.d(size6, sizeB)) {
                        arrayList10.add(size6);
                    }
                }
                arrayList4 = arrayList10;
            }
            arrayList7.add(arrayList4);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        pxv pxvVar = hln0Var.C;
        if (z3) {
            pxvVar.getClass();
            if (arrayList7.isEmpty()) {
                list6 = iun.f15405a;
            } else {
                List listA = pxv.a(arrayList7);
                ArrayList arrayList11 = new ArrayList(r3d.q(listA, 10));
                Iterator it7 = listA.iterator();
                while (it7.hasNext()) {
                    Size size7 = (Size) it7.next();
                    int size8 = arrayList7.size();
                    Iterator it8 = it7;
                    ArrayList arrayList12 = new ArrayList(size8);
                    for (int i9 = 0; i9 < size8; i9++) {
                        arrayList12.add(size7);
                    }
                    arrayList11.add(arrayList12);
                    it7 = it8;
                }
                list6 = arrayList11;
            }
            list2 = list6;
        } else {
            Iterator it9 = arrayList7.iterator();
            int size9 = 1;
            while (it9.hasNext()) {
                size9 *= ((List) it9.next()).size();
            }
            if (size9 == 0) {
                jf4.o("Failed to find supported resolutions.");
                return null;
            }
            ArrayList arrayList13 = new ArrayList();
            for (int i10 = 0; i10 < size9; i10++) {
                arrayList13.add(new ArrayList());
            }
            int size10 = size9 / ((List) arrayList7.get(0)).size();
            int size11 = arrayList7.size();
            int i11 = size9;
            int i12 = 0;
            while (i12 < size11) {
                int i13 = size10;
                List list9 = (List) arrayList7.get(i12);
                int i14 = size11;
                int i15 = 0;
                while (i15 < size9) {
                    ((List) arrayList13.get(i15)).add(list9.get((i15 % i11) / i13));
                    i15++;
                    arrayList13 = arrayList13;
                    size9 = size9;
                }
                ArrayList arrayList14 = arrayList13;
                int i16 = size9;
                if (i12 < arrayList7.size() - 1) {
                    size10 = i13 / ((List) arrayList7.get(i12 + 1)).size();
                    i11 = i13;
                } else {
                    size10 = i13;
                }
                i12++;
                size11 = i14;
                arrayList13 = arrayList14;
                size9 = i16;
            }
            list2 = arrayList13;
        }
        u15 u15Var = vrm0.f37906a;
        Iterator it10 = arrayList.iterator();
        while (true) {
            if (!it10.hasNext()) {
                i = 0;
                Iterator it11 = list.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        z2 = false;
                        break;
                    }
                    fpt0 fpt0Var4 = (fpt0) it11.next();
                    hpt0 hpt0VarV = fpt0Var4.v();
                    hpt0VarV.getClass();
                    if (vrm0.c(fpt0Var4, hpt0VarV)) {
                    }
                }
            } else {
                l15 l15Var2 = (l15) it10.next();
                List list10 = l15Var2.e;
                list10.getClass();
                i = 0;
                hpt0 hpt0Var = (hpt0) list10.get(0);
                drd drdVar = l15Var2.f;
                drdVar.getClass();
                hpt0Var.getClass();
                if (vrm0.c(drdVar, hpt0Var)) {
                }
            }
            z2 = true;
            break;
        }
        if (!hln0Var.r || z2) {
            i2 = i;
            linkedHashMap2 = linkedHashMap10;
            linkedHashMap3 = linkedHashMap11;
            c1aVar2 = c1aVar;
            str = str9;
            str2 = str10;
            i3 = Integer.MAX_VALUE;
            listG = null;
        } else {
            Iterator it12 = list2.iterator();
            listG = null;
            while (true) {
                if (!it12.hasNext()) {
                    i2 = i;
                    linkedHashMap2 = linkedHashMap10;
                    linkedHashMap3 = linkedHashMap11;
                    c1aVar2 = c1aVar;
                    str = str9;
                    str2 = str10;
                    i3 = Integer.MAX_VALUE;
                    break;
                }
                i2 = i;
                c1aVar2 = c1aVar;
                str = str9;
                str2 = str10;
                i3 = Integer.MAX_VALUE;
                linkedHashMap2 = linkedHashMap10;
                linkedHashMap3 = linkedHashMap11;
                listG = hln0Var.g(gln0Var3, hln0Var.l(gln0Var3.f11501a, arrayList, (List) it12.next(), list, arrayList2, linkedHashMap10, linkedHashMap11, false), linkedHashMap2, linkedHashMap3);
                if (listG != null) {
                    break;
                }
                linkedHashMap2.clear();
                linkedHashMap3.clear();
                linkedHashMap10 = linkedHashMap2;
                linkedHashMap11 = linkedHashMap3;
                i = i2;
                c1aVar = c1aVar2;
                str9 = str;
                str10 = str2;
            }
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "orderedSurfaceConfigListForStreamUseCase = " + listG);
            }
        }
        Iterator it13 = arrayList.iterator();
        int iMin = i3;
        while (it13.hasNext()) {
            l15 l15Var3 = (l15) it13.next();
            int i17 = l15Var3.b;
            Size size12 = l15Var3.c;
            size12.getClass();
            iMin = Math.min(iMin, hln0Var.e(i17, size12, z3, l15Var3.j));
        }
        Iterator it14 = list2.iterator();
        int i18 = i3;
        int i19 = i18;
        List list11 = null;
        List list12 = null;
        int i20 = i2;
        int i21 = i20;
        while (true) {
            if (!it14.hasNext()) {
                arrayList3 = arrayList2;
                linkedHashMap4 = linkedHashMap2;
                linkedHashMap5 = linkedHashMap3;
                int i22 = i18;
                gln0Var2 = gln0Var3;
                r37 = z3;
                list3 = list;
                i4 = i22;
                list4 = list11;
                list5 = list12;
                break;
            }
            List list13 = (List) it14.next();
            LinkedHashMap linkedHashMap12 = new LinkedHashMap();
            LinkedHashMap linkedHashMap13 = new LinkedHashMap();
            List list14 = listG;
            int i23 = gln0Var3.f11501a;
            int i24 = i19;
            boolean z6 = gln0Var3.h;
            linkedHashMap4 = linkedHashMap2;
            int i25 = i18;
            int i26 = iMin;
            linkedHashMap5 = linkedHashMap3;
            i19 = i24;
            List list15 = list;
            ArrayList arrayListL = hln0Var.l(i23, arrayList, list13, list15, arrayList2, linkedHashMap12, linkedHashMap13, z6);
            Iterator it15 = list13.iterator();
            int iMin2 = i26;
            int i27 = i2;
            while (it15.hasNext()) {
                int i28 = i27 + 1;
                Iterator it16 = it15;
                Size size13 = (Size) it15.next();
                fpt0 fpt0Var5 = (fpt0) list15.get(((Number) arrayList2.get(i27)).intValue());
                iMin2 = Math.min(iMin2, hln0Var.e(fpt0Var5.k(), size13, z3, fpt0Var5.w(size13)));
                list15 = list;
                i27 = i28;
                it15 = it16;
            }
            int i29 = (Intrinsics.d(range2, h55.h) || iMin2 >= i26 || iMin2 >= ((Number) range2.getUpper()).intValue()) ? 1 : i2;
            LinkedHashMap linkedHashMap14 = new LinkedHashMap();
            Iterator it17 = arrayListL.iterator();
            int i30 = i2;
            while (it17.hasNext()) {
                Object next = it17.next();
                int i31 = i30 + 1;
                if (i30 < 0) {
                    q3d.p();
                    throw null;
                }
                wln0 wln0Var = (wln0) next;
                Iterator it18 = it17;
                l15 l15Var4 = (l15) linkedHashMap12.get(Integer.valueOf(i30));
                if (l15Var4 == null || (agnVar2 = l15Var4.d) == null) {
                    Object obj4 = linkedHashMap.get(linkedHashMap13.get(Integer.valueOf(i30)));
                    if (obj4 == null) {
                        jf4.o("Required value was null.");
                        return null;
                    }
                    agnVar2 = (agn) obj4;
                }
                linkedHashMap14.put(wln0Var, agnVar2);
                it17 = it18;
                i30 = i31;
            }
            wez wezVar = wez.b;
            iMin = i26;
            boolean z7 = z3;
            i19 = iMin2;
            gln0Var2 = gln0Var;
            co0 co0Var = new co0((Object) this, (Object) gln0Var2, (Object) arrayListL, (Object) linkedHashMap14, (Object) list, (Object) arrayList2, (byte) 9);
            hln0Var = this;
            list3 = list;
            arrayList3 = arrayList2;
            a8z a8zVarA = maz.a(wezVar, co0Var);
            if (i20 == 0 && ((Boolean) a8zVarA.getValue()).booleanValue()) {
                if (i19 == Integer.MAX_VALUE || i19 < i19) {
                    i19 = i19;
                    list11 = list13;
                }
                if (i29 == 0) {
                    listG = list14;
                    if (listG == null) {
                        i8 = i25;
                        i18 = i8;
                    } else {
                        i8 = i25;
                        i18 = i8;
                    }
                    linkedHashMap3 = linkedHashMap5;
                    z3 = z7 ? 1 : 0;
                    gln0Var3 = gln0Var2;
                    linkedHashMap2 = linkedHashMap4;
                } else {
                    if (i21 != 0) {
                        list5 = list12;
                        list4 = list13;
                        i4 = i25;
                        listG = list14;
                        r37 = z7;
                        break;
                    }
                    i19 = i19;
                    i20 = 1;
                    list11 = list13;
                    listG = list14;
                    if (listG == null) {
                        i8 = i25;
                        i18 = i8;
                    } else {
                        i8 = i25;
                        i18 = i8;
                    }
                    linkedHashMap3 = linkedHashMap5;
                    z3 = z7 ? 1 : 0;
                    gln0Var3 = gln0Var2;
                    linkedHashMap2 = linkedHashMap4;
                }
            } else {
                listG = list14;
                if (listG == null && i21 == 0 && hln0Var.g(gln0Var2, arrayListL, linkedHashMap12, linkedHashMap13) != null) {
                    i8 = i25;
                    if (i8 == Integer.MAX_VALUE || i8 < i19) {
                        i8 = i19;
                        list12 = list13;
                    }
                    if (i29 != 0) {
                        if (i20 != 0) {
                            i4 = i19;
                            i19 = i19;
                            list4 = list11;
                            list5 = list13;
                            r37 = z7;
                            break;
                        }
                        i18 = i19;
                        i21 = 1;
                        list12 = list13;
                    }
                    linkedHashMap3 = linkedHashMap5;
                    z3 = z7 ? 1 : 0;
                    gln0Var3 = gln0Var2;
                    linkedHashMap2 = linkedHashMap4;
                } else {
                    i8 = i25;
                }
                i18 = i8;
                linkedHashMap3 = linkedHashMap5;
                z3 = z7 ? 1 : 0;
                gln0Var3 = gln0Var2;
                linkedHashMap2 = linkedHashMap4;
            }
        }
        eln0 eln0Var = (list4 != null && (!z || Intrinsics.d(range2, h55.h) || (i19 != Integer.MAX_VALUE && i19 >= ((Number) range2.getUpper()).intValue()))) ? new eln0(list4, list5, i19, i4, Integer.MAX_VALUE) : null;
        if (eln0Var == null) {
            StringBuilder sbT = kng0.t(str2, str, " and Hardware level: ");
            sbT.append(hln0Var.e);
            sbT.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            sbT.append(arrayList);
            sbT.append(str11);
            sbT.append(list3);
            sbT.append('.');
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i32 = eln0Var.c;
        List list16 = eln0Var.f8009a;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: bestSizesAndFps = " + eln0Var);
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        Range rangeD = h55.h;
        if (!Intrinsics.d(range2, rangeD)) {
            if (r37 != 0) {
                rangeArrB = pxvVar.b(list16);
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                key.getClass();
                rangeArrB = (Range[]) ((ow9) c1aVar2).c(key);
            }
            Range rangeD2 = d(range2, i32, rangeArrB);
            if ((z || gln0Var2.j) && !rangeD2.equals(range2)) {
                StringBuilder sb = new StringBuilder("Target FPS range ");
                sb.append(range2);
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(i32);
                sb.append(". Calculated best FPS range for device: ");
                sb.append(rangeD2);
                String string = Arrays.toString(rangeArrB);
                string.getClass();
                sb.append(". Device supported FPS ranges: ");
                sb.append(string);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            rangeD = rangeD2;
        } else if (r37 != 0) {
            rangeD = d(pxv.f, i32, pxvVar.b(list16));
        }
        Iterator it19 = list3.iterator();
        int i33 = i2;
        while (it19.hasNext()) {
            int i34 = i33 + 1;
            fpt0 fpt0Var6 = (fpt0) it19.next();
            qgd qgdVarA2 = h55.a((Size) list16.get(arrayList3.indexOf(Integer.valueOf(i33))));
            qgdVarA2.e = Integer.valueOf((int) r37);
            Object obj5 = linkedHashMap.get(fpt0Var6);
            if (obj5 == null) {
                jf4.n("Required value was null.");
                return null;
            }
            qgdVarA2.d = (agn) obj5;
            u15 u15Var2 = vrm0.f37906a;
            fpt0Var6.getClass();
            wy40 wy40VarL = wy40.l();
            u15 u15Var3 = hx9.h;
            Iterator it20 = it19;
            if (fpt0Var6.f(u15Var3)) {
                wy40VarL.y(u15Var3, fpt0Var6.d(u15Var3));
            }
            u15 u15Var4 = fpt0.L0;
            if (fpt0Var6.f(u15Var4)) {
                wy40VarL.y(u15Var4, fpt0Var6.d(u15Var4));
            }
            u15 u15Var5 = nzw.b;
            if (fpt0Var6.f(u15Var5)) {
                wy40VarL.y(u15Var5, fpt0Var6.d(u15Var5));
            }
            u15 u15Var6 = h0x.h0;
            if (fpt0Var6.f(u15Var6)) {
                wy40VarL.y(u15Var6, fpt0Var6.d(u15Var6));
            }
            qgdVarA2.g = new hx9(wy40VarL, (byte) 20);
            qgdVarA2.h = Boolean.valueOf(gln0Var2.c);
            if (!Intrinsics.d(rangeD, h55.h)) {
                if (rangeD == null) {
                    hny.u("Null expectedFrameRateRange");
                    return null;
                }
                qgdVarA2.f = rangeD;
            }
            linkedHashMap15.put(fpt0Var6, qgdVarA2.i());
            it19 = it20;
            i33 = i34;
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        if (listG != null) {
            List list17 = eln0Var.b;
            if (i32 == eln0Var.d) {
                int size14 = list16.size();
                list17.getClass();
                if (size14 == list17.size()) {
                    ArrayList<Pair> arrayListT0 = CollectionsKt.T0(list16, list17);
                    if (arrayListT0.isEmpty()) {
                        u15 u15Var7 = vrm0.f37906a;
                        c1aVar2.getClass();
                        if (Build.VERSION.SDK_INT < 33) {
                            u15 u15Var8 = vrm0.f37906a;
                            size = listG.size();
                            i5 = i2;
                            while (i5 < size) {
                                j = ((wln0) listG.get(i5)).c.f36171a;
                                linkedHashMap6 = linkedHashMap4;
                                if (linkedHashMap6.containsKey(Integer.valueOf(i5))) {
                                    l15Var = (l15) linkedHashMap6.get(Integer.valueOf(i5));
                                    l15Var.getClass();
                                    drd drdVar2 = l15Var.f;
                                    drdVar2.getClass();
                                    hx9VarA2 = vrm0.a(drdVar2, Long.valueOf(j));
                                    if (hx9VarA2 != null) {
                                        qgdVarA = h55.a(l15Var.c);
                                        qgdVarA.e = Integer.valueOf(l15Var.g);
                                        range = l15Var.h;
                                        if (range == null) {
                                            hny.u("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        qgdVarA.f = range;
                                        agnVar = l15Var.d;
                                        if (agnVar == null) {
                                            hny.u("Null dynamicRange");
                                            return null;
                                        }
                                        qgdVarA.d = agnVar;
                                        qgdVarA.g = hx9VarA2;
                                        linkedHashMap16.put(l15Var, qgdVarA.i());
                                    }
                                    linkedHashMap7 = linkedHashMap5;
                                } else {
                                    linkedHashMap7 = linkedHashMap5;
                                    if (!linkedHashMap7.containsKey(Integer.valueOf(i5))) {
                                        c99.l("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    Object obj6 = linkedHashMap7.get(Integer.valueOf(i5));
                                    obj6.getClass();
                                    fpt0Var = (fpt0) obj6;
                                    h55Var = (h55) linkedHashMap15.get(fpt0Var);
                                    h55Var.getClass();
                                    drd drdVar3 = h55Var.f;
                                    drdVar3.getClass();
                                    hx9VarA = vrm0.a(drdVar3, Long.valueOf(j));
                                    if (hx9VarA != null) {
                                        qgd qgdVarB = h55Var.b();
                                        qgdVarB.g = hx9VarA;
                                        linkedHashMap15.put(fpt0Var, qgdVarB.i());
                                    }
                                }
                                i5++;
                                linkedHashMap4 = linkedHashMap6;
                                linkedHashMap5 = linkedHashMap7;
                            }
                        } else {
                            ArrayList<fpt0> arrayList15 = new ArrayList(linkedHashMap15.keySet());
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((l15) it.next()).f != null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                            }
                            it2 = arrayList15.iterator();
                            while (it2.hasNext()) {
                                obj = linkedHashMap15.get((fpt0) it2.next());
                                if (obj != null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                                if (((h55) obj).f != null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                            }
                            CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                            key2.getClass();
                            jArr = (long[]) ((ow9) c1aVar2).c(key2);
                            if (jArr != null || jArr.length == 0) {
                                u15 u15Var9 = vrm0.f37906a;
                                size = listG.size();
                                i5 = i2;
                                while (i5 < size) {
                                    j = ((wln0) listG.get(i5)).c.f36171a;
                                    linkedHashMap6 = linkedHashMap4;
                                    if (linkedHashMap6.containsKey(Integer.valueOf(i5))) {
                                        l15Var = (l15) linkedHashMap6.get(Integer.valueOf(i5));
                                        l15Var.getClass();
                                        drd drdVar4 = l15Var.f;
                                        drdVar4.getClass();
                                        hx9VarA2 = vrm0.a(drdVar4, Long.valueOf(j));
                                        if (hx9VarA2 != null) {
                                            qgdVarA = h55.a(l15Var.c);
                                            qgdVarA.e = Integer.valueOf(l15Var.g);
                                            range = l15Var.h;
                                            if (range == null) {
                                                hny.u("Null expectedFrameRateRange");
                                                return null;
                                            }
                                            qgdVarA.f = range;
                                            agnVar = l15Var.d;
                                            if (agnVar == null) {
                                                hny.u("Null dynamicRange");
                                                return null;
                                            }
                                            qgdVarA.d = agnVar;
                                            qgdVarA.g = hx9VarA2;
                                            linkedHashMap16.put(l15Var, qgdVarA.i());
                                        }
                                        linkedHashMap7 = linkedHashMap5;
                                    } else {
                                        linkedHashMap7 = linkedHashMap5;
                                        if (!linkedHashMap7.containsKey(Integer.valueOf(i5))) {
                                            c99.l("SurfaceConfig does not map to any use case");
                                            return null;
                                        }
                                        Object obj7 = linkedHashMap7.get(Integer.valueOf(i5));
                                        obj7.getClass();
                                        fpt0Var = (fpt0) obj7;
                                        h55Var = (h55) linkedHashMap15.get(fpt0Var);
                                        h55Var.getClass();
                                        drd drdVar5 = h55Var.f;
                                        drdVar5.getClass();
                                        hx9VarA = vrm0.a(drdVar5, Long.valueOf(j));
                                        if (hx9VarA != null) {
                                            qgd qgdVarB2 = h55Var.b();
                                            qgdVarB2.g = hx9VarA;
                                            linkedHashMap15.put(fpt0Var, qgdVarB2.i());
                                        }
                                    }
                                    i5++;
                                    linkedHashMap4 = linkedHashMap6;
                                    linkedHashMap5 = linkedHashMap7;
                                }
                            } else {
                                HashSet hashSet = new HashSet();
                                int length = jArr.length;
                                for (int i35 = i2; i35 < length; i35++) {
                                    hashSet.add(Long.valueOf(jArr[i35]));
                                }
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it21 = arrayList.iterator();
                                if (it21.hasNext()) {
                                    l15 l15Var5 = (l15) it21.next();
                                    drd drdVar6 = l15Var5.f;
                                    drdVar6.getClass();
                                    u15 u15Var10 = hx9.h;
                                    if (drdVar6.f(u15Var10)) {
                                        drd drdVar7 = l15Var5.f;
                                        drdVar7.getClass();
                                        Object objD = drdVar7.d(u15Var10);
                                        objD.getClass();
                                        if (((Number) objD).longValue() == 0) {
                                            i7 = 1;
                                            i6 = i2;
                                        } else {
                                            i6 = 1;
                                            i7 = i2;
                                        }
                                    } else {
                                        i7 = 1;
                                        i6 = i2;
                                    }
                                } else {
                                    i6 = i2;
                                    i7 = i6;
                                }
                                for (fpt0 fpt0Var7 : arrayList15) {
                                    u15 u15Var11 = hx9.h;
                                    if (fpt0Var7.f(u15Var11)) {
                                        Object objD2 = fpt0Var7.d(u15Var11);
                                        objD2.getClass();
                                        long jLongValue = ((Number) objD2).longValue();
                                        if (jLongValue != 0) {
                                            if (i7 != 0) {
                                                jf4.o("Either all use cases must have non-default stream use case assigned or none should have it");
                                                return null;
                                            }
                                            linkedHashSet2.add(Long.valueOf(jLongValue));
                                            i6 = 1;
                                        } else if (i6 != 0) {
                                            jf4.o("Either all use cases must have non-default stream use case assigned or none should have it");
                                            return null;
                                        }
                                    } else if (i6 != 0) {
                                        jf4.o("Either all use cases must have non-default stream use case assigned or none should have it");
                                        return null;
                                    }
                                    i7 = 1;
                                }
                                if (i7 == 0) {
                                    Iterator it22 = linkedHashSet2.iterator();
                                    do {
                                        if (!it22.hasNext()) {
                                            Iterator it23 = arrayList.iterator();
                                            while (it23.hasNext()) {
                                                l15 l15Var6 = (l15) it23.next();
                                                drd drdVar8 = l15Var6.f;
                                                drdVar8.getClass();
                                                hx9 hx9VarA3 = vrm0.a(drdVar8, (Long) drdVar8.d(hx9.h));
                                                if (hx9VarA3 != null) {
                                                    qgd qgdVarA3 = h55.a(l15Var6.c);
                                                    qgdVarA3.e = Integer.valueOf(l15Var6.g);
                                                    Range range4 = l15Var6.h;
                                                    if (range4 == null) {
                                                        hny.u("Null expectedFrameRateRange");
                                                        return null;
                                                    }
                                                    qgdVarA3.f = range4;
                                                    agn agnVar3 = l15Var6.d;
                                                    if (agnVar3 == null) {
                                                        hny.u("Null dynamicRange");
                                                        return null;
                                                    }
                                                    qgdVarA3.d = agnVar3;
                                                    qgdVarA3.g = hx9VarA3;
                                                    linkedHashMap16.put(l15Var6, qgdVarA3.i());
                                                }
                                            }
                                            for (fpt0 fpt0Var8 : arrayList15) {
                                                h55 h55Var2 = (h55) linkedHashMap15.get(fpt0Var8);
                                                h55Var2.getClass();
                                                drd drdVar9 = h55Var2.f;
                                                drdVar9.getClass();
                                                hx9 hx9VarA4 = vrm0.a(drdVar9, (Long) drdVar9.d(hx9.h));
                                                if (hx9VarA4 != null) {
                                                    qgd qgdVarB3 = h55Var2.b();
                                                    qgdVarB3.g = hx9VarA4;
                                                    linkedHashMap15.put(fpt0Var8, qgdVarB3.i());
                                                }
                                            }
                                        }
                                    } while (hashSet.contains(Long.valueOf(((Number) it22.next()).longValue())));
                                    u15 u15Var12 = vrm0.f37906a;
                                    size = listG.size();
                                    i5 = i2;
                                    while (i5 < size) {
                                        j = ((wln0) listG.get(i5)).c.f36171a;
                                        linkedHashMap6 = linkedHashMap4;
                                        if (linkedHashMap6.containsKey(Integer.valueOf(i5))) {
                                            l15Var = (l15) linkedHashMap6.get(Integer.valueOf(i5));
                                            l15Var.getClass();
                                            drd drdVar10 = l15Var.f;
                                            drdVar10.getClass();
                                            hx9VarA2 = vrm0.a(drdVar10, Long.valueOf(j));
                                            if (hx9VarA2 != null) {
                                                qgdVarA = h55.a(l15Var.c);
                                                qgdVarA.e = Integer.valueOf(l15Var.g);
                                                range = l15Var.h;
                                                if (range == null) {
                                                    hny.u("Null expectedFrameRateRange");
                                                    return null;
                                                }
                                                qgdVarA.f = range;
                                                agnVar = l15Var.d;
                                                if (agnVar == null) {
                                                    hny.u("Null dynamicRange");
                                                    return null;
                                                }
                                                qgdVarA.d = agnVar;
                                                qgdVarA.g = hx9VarA2;
                                                linkedHashMap16.put(l15Var, qgdVarA.i());
                                            }
                                            linkedHashMap7 = linkedHashMap5;
                                        } else {
                                            linkedHashMap7 = linkedHashMap5;
                                            if (!linkedHashMap7.containsKey(Integer.valueOf(i5))) {
                                                c99.l("SurfaceConfig does not map to any use case");
                                                return null;
                                            }
                                            Object obj8 = linkedHashMap7.get(Integer.valueOf(i5));
                                            obj8.getClass();
                                            fpt0Var = (fpt0) obj8;
                                            h55Var = (h55) linkedHashMap15.get(fpt0Var);
                                            h55Var.getClass();
                                            drd drdVar11 = h55Var.f;
                                            drdVar11.getClass();
                                            hx9VarA = vrm0.a(drdVar11, Long.valueOf(j));
                                            if (hx9VarA != null) {
                                                qgd qgdVarB4 = h55Var.b();
                                                qgdVarB4.g = hx9VarA;
                                                linkedHashMap15.put(fpt0Var, qgdVarB4.i());
                                            }
                                        }
                                        i5++;
                                        linkedHashMap4 = linkedHashMap6;
                                        linkedHashMap5 = linkedHashMap7;
                                    }
                                } else {
                                    u15 u15Var13 = vrm0.f37906a;
                                    size = listG.size();
                                    i5 = i2;
                                    while (i5 < size) {
                                        j = ((wln0) listG.get(i5)).c.f36171a;
                                        linkedHashMap6 = linkedHashMap4;
                                        if (linkedHashMap6.containsKey(Integer.valueOf(i5))) {
                                            l15Var = (l15) linkedHashMap6.get(Integer.valueOf(i5));
                                            l15Var.getClass();
                                            drd drdVar12 = l15Var.f;
                                            drdVar12.getClass();
                                            hx9VarA2 = vrm0.a(drdVar12, Long.valueOf(j));
                                            if (hx9VarA2 != null) {
                                                qgdVarA = h55.a(l15Var.c);
                                                qgdVarA.e = Integer.valueOf(l15Var.g);
                                                range = l15Var.h;
                                                if (range == null) {
                                                    hny.u("Null expectedFrameRateRange");
                                                    return null;
                                                }
                                                qgdVarA.f = range;
                                                agnVar = l15Var.d;
                                                if (agnVar == null) {
                                                    hny.u("Null dynamicRange");
                                                    return null;
                                                }
                                                qgdVarA.d = agnVar;
                                                qgdVarA.g = hx9VarA2;
                                                linkedHashMap16.put(l15Var, qgdVarA.i());
                                            }
                                            linkedHashMap7 = linkedHashMap5;
                                        } else {
                                            linkedHashMap7 = linkedHashMap5;
                                            if (!linkedHashMap7.containsKey(Integer.valueOf(i5))) {
                                                c99.l("SurfaceConfig does not map to any use case");
                                                return null;
                                            }
                                            Object obj9 = linkedHashMap7.get(Integer.valueOf(i5));
                                            obj9.getClass();
                                            fpt0Var = (fpt0) obj9;
                                            h55Var = (h55) linkedHashMap15.get(fpt0Var);
                                            h55Var.getClass();
                                            drd drdVar13 = h55Var.f;
                                            drdVar13.getClass();
                                            hx9VarA = vrm0.a(drdVar13, Long.valueOf(j));
                                            if (hx9VarA != null) {
                                                qgd qgdVarB5 = h55Var.b();
                                                qgdVarB5.g = hx9VarA;
                                                linkedHashMap15.put(fpt0Var, qgdVarB5.i());
                                            }
                                        }
                                        i5++;
                                        linkedHashMap4 = linkedHashMap6;
                                        linkedHashMap5 = linkedHashMap7;
                                    }
                                }
                            }
                        }
                    } else {
                        for (Pair pair : arrayListT0) {
                            if (!Intrinsics.d(pair.f46059a, pair.b)) {
                            }
                        }
                        u15 u15Var14 = vrm0.f37906a;
                        c1aVar2.getClass();
                        if (Build.VERSION.SDK_INT < 33) {
                            u15 u15Var15 = vrm0.f37906a;
                            size = listG.size();
                            i5 = i2;
                            while (i5 < size) {
                                j = ((wln0) listG.get(i5)).c.f36171a;
                                linkedHashMap6 = linkedHashMap4;
                                if (linkedHashMap6.containsKey(Integer.valueOf(i5))) {
                                    l15Var = (l15) linkedHashMap6.get(Integer.valueOf(i5));
                                    l15Var.getClass();
                                    drd drdVar14 = l15Var.f;
                                    drdVar14.getClass();
                                    hx9VarA2 = vrm0.a(drdVar14, Long.valueOf(j));
                                    if (hx9VarA2 != null) {
                                        qgdVarA = h55.a(l15Var.c);
                                        qgdVarA.e = Integer.valueOf(l15Var.g);
                                        range = l15Var.h;
                                        if (range == null) {
                                            hny.u("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        qgdVarA.f = range;
                                        agnVar = l15Var.d;
                                        if (agnVar == null) {
                                            hny.u("Null dynamicRange");
                                            return null;
                                        }
                                        qgdVarA.d = agnVar;
                                        qgdVarA.g = hx9VarA2;
                                        linkedHashMap16.put(l15Var, qgdVarA.i());
                                    }
                                    linkedHashMap7 = linkedHashMap5;
                                } else {
                                    linkedHashMap7 = linkedHashMap5;
                                    if (!linkedHashMap7.containsKey(Integer.valueOf(i5))) {
                                        c99.l("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    Object obj10 = linkedHashMap7.get(Integer.valueOf(i5));
                                    obj10.getClass();
                                    fpt0Var = (fpt0) obj10;
                                    h55Var = (h55) linkedHashMap15.get(fpt0Var);
                                    h55Var.getClass();
                                    drd drdVar15 = h55Var.f;
                                    drdVar15.getClass();
                                    hx9VarA = vrm0.a(drdVar15, Long.valueOf(j));
                                    if (hx9VarA != null) {
                                        qgd qgdVarB6 = h55Var.b();
                                        qgdVarB6.g = hx9VarA;
                                        linkedHashMap15.put(fpt0Var, qgdVarB6.i());
                                    }
                                }
                                i5++;
                                linkedHashMap4 = linkedHashMap6;
                                linkedHashMap5 = linkedHashMap7;
                            }
                        } else {
                            ArrayList<fpt0> arrayList16 = new ArrayList(linkedHashMap15.keySet());
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((l15) it.next()).f != null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                            }
                            it2 = arrayList16.iterator();
                            while (it2.hasNext()) {
                                obj = linkedHashMap15.get((fpt0) it2.next());
                                if (obj != null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                                if (((h55) obj).f != null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                            }
                            CameraCharacteristics.Key key3 = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                            key3.getClass();
                            jArr = (long[]) ((ow9) c1aVar2).c(key3);
                            if (jArr != null) {
                                u15 u15Var16 = vrm0.f37906a;
                                size = listG.size();
                                i5 = i2;
                                while (i5 < size) {
                                    j = ((wln0) listG.get(i5)).c.f36171a;
                                    linkedHashMap6 = linkedHashMap4;
                                    if (linkedHashMap6.containsKey(Integer.valueOf(i5))) {
                                        l15Var = (l15) linkedHashMap6.get(Integer.valueOf(i5));
                                        l15Var.getClass();
                                        drd drdVar16 = l15Var.f;
                                        drdVar16.getClass();
                                        hx9VarA2 = vrm0.a(drdVar16, Long.valueOf(j));
                                        if (hx9VarA2 != null) {
                                            qgdVarA = h55.a(l15Var.c);
                                            qgdVarA.e = Integer.valueOf(l15Var.g);
                                            range = l15Var.h;
                                            if (range == null) {
                                                hny.u("Null expectedFrameRateRange");
                                                return null;
                                            }
                                            qgdVarA.f = range;
                                            agnVar = l15Var.d;
                                            if (agnVar == null) {
                                                hny.u("Null dynamicRange");
                                                return null;
                                            }
                                            qgdVarA.d = agnVar;
                                            qgdVarA.g = hx9VarA2;
                                            linkedHashMap16.put(l15Var, qgdVarA.i());
                                        }
                                        linkedHashMap7 = linkedHashMap5;
                                    } else {
                                        linkedHashMap7 = linkedHashMap5;
                                        if (!linkedHashMap7.containsKey(Integer.valueOf(i5))) {
                                            c99.l("SurfaceConfig does not map to any use case");
                                            return null;
                                        }
                                        Object obj11 = linkedHashMap7.get(Integer.valueOf(i5));
                                        obj11.getClass();
                                        fpt0Var = (fpt0) obj11;
                                        h55Var = (h55) linkedHashMap15.get(fpt0Var);
                                        h55Var.getClass();
                                        drd drdVar17 = h55Var.f;
                                        drdVar17.getClass();
                                        hx9VarA = vrm0.a(drdVar17, Long.valueOf(j));
                                        if (hx9VarA != null) {
                                            qgd qgdVarB7 = h55Var.b();
                                            qgdVarB7.g = hx9VarA;
                                            linkedHashMap15.put(fpt0Var, qgdVarB7.i());
                                        }
                                    }
                                    i5++;
                                    linkedHashMap4 = linkedHashMap6;
                                    linkedHashMap5 = linkedHashMap7;
                                }
                            } else {
                                u15 u15Var17 = vrm0.f37906a;
                                size = listG.size();
                                i5 = i2;
                                while (i5 < size) {
                                    j = ((wln0) listG.get(i5)).c.f36171a;
                                    linkedHashMap6 = linkedHashMap4;
                                    if (linkedHashMap6.containsKey(Integer.valueOf(i5))) {
                                        l15Var = (l15) linkedHashMap6.get(Integer.valueOf(i5));
                                        l15Var.getClass();
                                        drd drdVar18 = l15Var.f;
                                        drdVar18.getClass();
                                        hx9VarA2 = vrm0.a(drdVar18, Long.valueOf(j));
                                        if (hx9VarA2 != null) {
                                            qgdVarA = h55.a(l15Var.c);
                                            qgdVarA.e = Integer.valueOf(l15Var.g);
                                            range = l15Var.h;
                                            if (range == null) {
                                                hny.u("Null expectedFrameRateRange");
                                                return null;
                                            }
                                            qgdVarA.f = range;
                                            agnVar = l15Var.d;
                                            if (agnVar == null) {
                                                hny.u("Null dynamicRange");
                                                return null;
                                            }
                                            qgdVarA.d = agnVar;
                                            qgdVarA.g = hx9VarA2;
                                            linkedHashMap16.put(l15Var, qgdVarA.i());
                                        }
                                        linkedHashMap7 = linkedHashMap5;
                                    } else {
                                        linkedHashMap7 = linkedHashMap5;
                                        if (!linkedHashMap7.containsKey(Integer.valueOf(i5))) {
                                            c99.l("SurfaceConfig does not map to any use case");
                                            return null;
                                        }
                                        Object obj12 = linkedHashMap7.get(Integer.valueOf(i5));
                                        obj12.getClass();
                                        fpt0Var = (fpt0) obj12;
                                        h55Var = (h55) linkedHashMap15.get(fpt0Var);
                                        h55Var.getClass();
                                        drd drdVar19 = h55Var.f;
                                        drdVar19.getClass();
                                        hx9VarA = vrm0.a(drdVar19, Long.valueOf(j));
                                        if (hx9VarA != null) {
                                            qgd qgdVarB8 = h55Var.b();
                                            qgdVarB8.g = hx9VarA;
                                            linkedHashMap15.put(fpt0Var, qgdVarB8.i());
                                        }
                                    }
                                    i5++;
                                    linkedHashMap4 = linkedHashMap6;
                                    linkedHashMap5 = linkedHashMap7;
                                }
                            }
                        }
                    }
                }
            }
        }
        return new tmn0(linkedHashMap15, linkedHashMap16, eln0Var.e);
    }

    public final wln0 q(int i, int i2, Size size, urm0 urm0Var) {
        size.getClass();
        urm0 urm0Var2 = wln0.e;
        return y2m0.d(i2, size, n(i2), i, uln0.b, urm0Var);
    }

    public final void r(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size sizeF = f((StreamConfigurationMap) this.x.d.f30839a, i, true, rational);
        if (sizeF != null) {
            linkedHashMap.put(Integer.valueOf(i), sizeF);
        }
    }

    public final void s(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.q) {
            Size sizeF = f((StreamConfigurationMap) this.x.d.f30839a, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeF != null) {
                size = (Size) Collections.min(q3d.j(size, sizeF), new ycd(false));
            }
            linkedHashMap.put(numValueOf, size);
        }
    }

    public final void t(gln0 gln0Var) {
        int i = gln0Var.f11501a;
        boolean z = gln0Var.g;
        String str = "CONCURRENT_CAMERA";
        String str2 = this.d;
        if (i != 0 && gln0Var.e) {
            StringBuilder sbT = kng0.t("Camera device Id is ", str2, ". Ultra HDR is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            c99.s(axq.n(sbT, str, " camera mode."));
            return;
        }
        if (i != 0 && gln0Var.b == 10) {
            StringBuilder sbT2 = kng0.t("Camera device Id is ", str2, ". 10 bit dynamic range is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            c99.s(axq.n(sbT2, str, " camera mode."));
            return;
        }
        if (i != 0 && z) {
            StringBuilder sbT3 = kng0.t("Camera device Id is ", str2, ". feature combination is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            c99.s(axq.n(sbT3, str, " camera mode."));
            return;
        }
        boolean z2 = gln0Var.f;
        if (z2 && z) {
            jf4.o("High-speed session is not supported with feature combination");
        } else {
            if (!z2 || ((Boolean) this.C.b.getValue()).booleanValue()) {
                return;
            }
            jf4.o("High-speed session is not supported on this device.");
        }
    }
}
