package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Point;
import android.javax.sip.message.Response;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jm30 {
    public static final lin0 m = hfm0.z(new m44(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16746a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public jm30(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f16746a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = mg40.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(vtt0.g(i, widthAlignment) * widthAlignment, vtt0.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    public static jm30 i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            Integer num = (Integer) m.get();
            if (num != null && num.intValue() <= 202604) {
                String str4 = Build.MANUFACTURER;
                if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO") || str4.equals("Fairphone")) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        return new jm30(str, str2, str3, codecCapabilities, z, z2, z3, z5, z6, z4);
    }

    public final alj b(androidx.media3.common.b bVar, androidx.media3.common.b bVar2) {
        androidx.media3.common.b bVar3;
        androidx.media3.common.b bVar4;
        int i;
        String str = bVar.p;
        c4d c4dVar = bVar.H;
        String str2 = bVar2.p;
        c4d c4dVar2 = bVar2.H;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (bVar.C != bVar2.C) {
                i2 |= 1024;
            }
            boolean z = (bVar.w == bVar2.w && bVar.x == bVar2.x) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!c4d.e(c4dVar) || !c4d.e(c4dVar2)) && !Objects.equals(c4dVar, c4dVar2)) {
                i2 |= 2048;
            }
            HashSet hashSet = hn30.f13332a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f16746a) && !bVar.b(bVar2)) {
                i2 |= 2;
            }
            int i3 = bVar.z;
            if (i3 != -1 && (i = bVar.A) != -1 && i3 == bVar2.z && i == bVar2.A && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(bVar2.p, "video/dolby-vision")) {
                Pair pairB = jyc.b(bVar);
                Pair pairB2 = jyc.b(bVar2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new alj(this.f16746a, bVar, bVar2, bVar.b(bVar2) ? 3 : 2, 0);
            }
            bVar3 = bVar;
            bVar4 = bVar2;
        } else {
            bVar3 = bVar;
            bVar4 = bVar2;
            if (bVar3.J != bVar4.J) {
                i2 |= 4096;
            }
            if (bVar3.L != bVar4.L) {
                i2 |= 8192;
            }
            if (bVar3.M != bVar4.M) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = jyc.b(bVar3);
                Pair pairB4 = jyc.b(bVar4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new alj(this.f16746a, bVar3, bVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new alj(this.f16746a, bVar3, bVar4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new alj(this.f16746a, bVar3, bVar4, 3, 0);
            }
            if (!bVar3.b(bVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new alj(this.f16746a, bVar3, bVar4, 1, 0);
            }
        }
        return new alj(this.f16746a, bVar3, bVar4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0054, please report this as an issue */
    public final boolean c(Context context, androidx.media3.common.b bVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        boolean zEquals;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i3;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        int maxInputChannelCount;
        int i4;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        iyc iycVarD = jyc.d(bVar);
        String str2 = bVar.p;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strN = mg40.n(str3);
            if (!strN.equals("video/mv-hevc")) {
                if (strN.equals("video/hevc")) {
                    HashMap map = qm30.f28964a;
                    String strB0 = ntr.b0(bVar.s);
                    if (strB0 == null) {
                        iycVarD = null;
                    } else {
                        String strTrim = strB0.trim();
                        String str4 = vtt0.f38024a;
                        iycVarD = jyc.c(strB0, strTrim.split("\\.", -1), bVar.H);
                    }
                }
                if (iycVarD != null) {
                    z2 = iycVarD.c;
                    if (!z2) {
                        return false;
                    }
                    x0x.K(z2);
                    i = iycVarD.f15582a;
                    x0x.K(z2);
                    i2 = iycVarD.b;
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.b;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                i2 = 0;
                                i = 2;
                                break;
                            case "video/avc":
                                i = 8;
                                i2 = 0;
                                break;
                        }
                    }
                    if (this.i) {
                        codecCapabilities = this.d;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            if (codecCapabilities != null) {
                                maxInputChannelCount = 2;
                            } else {
                                maxInputChannelCount = 2;
                            }
                            if (maxInputChannelCount > 18) {
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{qm30.b(1026, i4)};
                            } else {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{qm30.b(257, i4), qm30.b(Response.MESSAGE_TOO_LARGE, i4), qm30.b(514, i4), qm30.b(1026, i4), qm30.b(1028, i4)};
                            }
                            codecProfileLevelArr = codecProfileLevelArr2;
                        }
                        length = codecProfileLevelArr.length;
                        for (i3 = 0; i3 < length; i3++) {
                            codecProfileLevel = codecProfileLevelArr[i3];
                            if (codecProfileLevel.profile != i) {
                            }
                        }
                        h("codec.profileLevel, " + bVar.l + ", " + str3);
                        return false;
                    }
                    codecCapabilities = this.d;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        if (codecCapabilities != null) {
                            maxInputChannelCount = 2;
                        } else {
                            maxInputChannelCount = 2;
                        }
                        if (maxInputChannelCount > 18) {
                        }
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{qm30.b(1026, i4)};
                        } else {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{qm30.b(257, i4), qm30.b(Response.MESSAGE_TOO_LARGE, i4), qm30.b(514, i4), qm30.b(1026, i4), qm30.b(1028, i4)};
                        }
                        codecProfileLevelArr = codecProfileLevelArr2;
                    }
                    length = codecProfileLevelArr.length;
                    while (i3 < length) {
                        codecProfileLevel = codecProfileLevelArr[i3];
                        if (codecProfileLevel.profile != i) {
                        }
                    }
                    h("codec.profileLevel, " + bVar.l + ", " + str3);
                    return false;
                }
            }
        } else if (iycVarD != null) {
            z2 = iycVarD.c;
            if (!z2) {
                return false;
            }
            x0x.K(z2);
            i = iycVarD.f15582a;
            x0x.K(z2);
            i2 = iycVarD.b;
            zEquals = "video/dolby-vision".equals(str2);
            str = this.b;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                    */
                /*
                    Method dump skipped, instruction units count: 372
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.jm30.c(android.content.Context, androidx.media3.common.b, boolean):boolean");
            }

            public final boolean d(androidx.media3.common.b bVar) {
                return (Objects.equals(bVar.p, "audio/flac") && bVar.M == 22 && Build.VERSION.SDK_INT < 34 && this.f16746a.equals("c2.android.flac.decoder")) ? false : true;
            }

            public final boolean e(Context context, androidx.media3.common.b bVar) {
                int i;
                int i2;
                String str = bVar.p;
                String str2 = this.b;
                if ((!str2.equals(str) && !str2.equals(qm30.c(bVar))) || !c(context, bVar, true) || !d(bVar)) {
                    return false;
                }
                if (this.i) {
                    int i3 = bVar.w;
                    if (i3 > 0 && (i2 = bVar.x) > 0) {
                        return g(bVar.B, i3, i2);
                    }
                } else {
                    int i4 = bVar.L;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (i4 != -1) {
                        if (codecCapabilities == null) {
                            h("sampleRate.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            h("sampleRate.aCaps");
                            return false;
                        }
                        if (!audioCapabilities.isSampleRateSupported(i4)) {
                            h("sampleRate.support, " + i4);
                            return false;
                        }
                    }
                    int i5 = bVar.J;
                    if (i5 != -1) {
                        if (codecCapabilities == null) {
                            h("channelCount.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            h("channelCount.aCaps");
                            return false;
                        }
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            StringBuilder sbP = kng0.p(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f16746a, ", [", " to ");
                            sbP.append(i);
                            sbP.append("]");
                            f1t0.g0("MediaCodecInfo", sbP.toString());
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i5) {
                            h("channelCount.support, " + i5);
                            return false;
                        }
                    }
                }
                return true;
            }

            public final boolean f(androidx.media3.common.b bVar) {
                boolean z;
                if (this.i) {
                    return this.e;
                }
                iyc iycVarD = jyc.d(bVar);
                if (iycVarD == null || !(z = iycVarD.c)) {
                    return false;
                }
                x0x.K(z);
                return iycVarD.f15582a == 42;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:29:0x0055  */
            public final boolean g(double d, int i, int i2) {
                String str;
                Boolean bool;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null) {
                    h("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    h("sizeAndRate.vCaps");
                    return false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    int iA = (i3 < 29 || ((bool = r8x.f30049a) != null && bool.booleanValue())) ? 0 : sf3.a(videoCapabilities, i, i2, d);
                    if (iA != 2) {
                        if (iA == 1) {
                            StringBuilder sbT = dw9.t("sizeAndRate.cover, ", i, "x", Separators.AT, i2);
                            sbT.append(d);
                            h(sbT.toString());
                            return false;
                        }
                        if (!a(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                HashSet hashSet = hn30.f13332a;
                                str = this.f16746a;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbT2 = dw9.t("sizeAndRate.rotated, ", i, "x", Separators.AT, i2);
                                    sbT2.append(d);
                                    StringBuilder sbN = b1j.n("AssumedSupport [", sbT2.toString(), "] [", str, ", ");
                                    sbN.append(this.b);
                                    sbN.append("] [");
                                    sbN.append(vtt0.f38024a);
                                    sbN.append("]");
                                    f1t0.P("MediaCodecInfo", sbN.toString());
                                    return true;
                                }
                                StringBuilder sbT3 = dw9.t("sizeAndRate.rotated, ", i, "x", Separators.AT, i2);
                                sbT3.append(d);
                                StringBuilder sbN2 = b1j.n("AssumedSupport [", sbT3.toString(), "] [", str, ", ");
                                sbN2.append(this.b);
                                sbN2.append("] [");
                                sbN2.append(vtt0.f38024a);
                                sbN2.append("]");
                                f1t0.P("MediaCodecInfo", sbN2.toString());
                                return true;
                            }
                            StringBuilder sbT4 = dw9.t("sizeAndRate.support, ", i, "x", Separators.AT, i2);
                            sbT4.append(d);
                            h(sbT4.toString());
                            return false;
                        }
                    }
                } else if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        HashSet hashSet2 = hn30.f13332a;
                        str = this.f16746a;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                            StringBuilder sbT5 = dw9.t("sizeAndRate.rotated, ", i, "x", Separators.AT, i2);
                            sbT5.append(d);
                            StringBuilder sbN3 = b1j.n("AssumedSupport [", sbT5.toString(), "] [", str, ", ");
                            sbN3.append(this.b);
                            sbN3.append("] [");
                            sbN3.append(vtt0.f38024a);
                            sbN3.append("]");
                            f1t0.P("MediaCodecInfo", sbN3.toString());
                            return true;
                        }
                    }
                    StringBuilder sbT6 = dw9.t("sizeAndRate.support, ", i, "x", Separators.AT, i2);
                    sbT6.append(d);
                    h(sbT6.toString());
                    return false;
                }
                return true;
            }

            public final void h(String str) {
                StringBuilder sbT = kng0.t("NoSupport [", str, "] [");
                sbT.append(this.f16746a);
                sbT.append(", ");
                sbT.append(this.b);
                sbT.append("] [");
                sbT.append(vtt0.f38024a);
                sbT.append("]");
                f1t0.P("MediaCodecInfo", sbT.toString());
            }

            public final String toString() {
                return this.f16746a;
            }
        }
