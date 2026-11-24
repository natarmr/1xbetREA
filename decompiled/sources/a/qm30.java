package a;

import android.gov.nist.core.Separators;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class qm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f28964a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((jm30) arrayList.get(0)).f16746a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(jm30.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false));
            }
            Collections.sort(arrayList, new gi2(new hny((byte) 9), (byte) 6));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((jm30) arrayList.get(0)).f16746a)) {
            return;
        }
        arrayList.add((jm30) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(androidx.media3.common.b bVar) {
        iyc iycVarD;
        boolean z;
        String str = bVar.p;
        if ("audio/eac3-joc".equals(str)) {
            if (Objects.equals(Build.MANUFACTURER, "Google")) {
                return null;
            }
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (iycVarD = jyc.d(bVar)) != null && (z = iycVarD.c)) {
            x0x.K(z);
            int i = iycVarD.f15582a;
            if (i == 16 || i == 256) {
                return "video/hevc";
            }
            if (i == 512) {
                return "video/avc";
            }
            if (i == 1024) {
                c4d c4dVar = bVar.H;
                if (c4dVar != null && c4dVar.c == 6 && c4dVar.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            nm30 nm30Var = new nm30(str, z, z2);
            HashMap map = f28964a;
            List list = (List) map.get(nm30Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(nm30Var, new y78(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListF.isEmpty();
            }
            a(str, arrayListF);
            b4x b4xVarO = b4x.o(arrayListF);
            map.put(nm30Var, b4xVarO);
            return b4xVarO;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public static ArrayList f(nm30 nm30Var, y78 y78Var) throws om30 {
        String strD;
        String str;
        int i;
        nm30 nm30Var2 = nm30Var;
        int i2 = y78Var.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = nm30Var2.f23754a;
            boolean z = nm30Var2.b;
            MediaCodecInfo[] codecInfos = (MediaCodecInfo[]) y78Var.c;
            if (codecInfos == null) {
                codecInfos = new MediaCodecList(i2).getCodecInfos();
                y78Var.c = codecInfos;
            }
            int length = codecInfos.length;
            int i3 = 0;
            while (i3 < length) {
                MediaCodecInfo[] codecInfos2 = (MediaCodecInfo[]) y78Var.c;
                if (codecInfos2 == null) {
                    codecInfos2 = new MediaCodecList(i2).getCodecInfos();
                    y78Var.c = codecInfos2;
                }
                MediaCodecInfo mediaCodecInfo = codecInfos2[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfo.isAlias()) {
                    int i5 = i3;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder() || (strD = d(mediaCodecInfo, name, str2)) == null) {
                        i = i5;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strD);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = nm30Var2.c;
                            if ((z2 || !zIsFeatureRequired) && (!z2 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z || !zIsFeatureRequired2) && (!z || zIsFeatureSupported2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !h(mediaCodecInfo, str2);
                                    i = i5;
                                    boolean zH = h(mediaCodecInfo, str2);
                                    boolean z3 = zIsHardwareAccelerated;
                                    if (i4 >= 29) {
                                        zIsVendor = mediaCodecInfo.isVendor();
                                    } else {
                                        String strH0 = j47.H0(mediaCodecInfo.getName());
                                        if (strH0.startsWith("omx.google.") || strH0.startsWith("c2.android.") || strH0.startsWith("c2.google.")) {
                                            zIsVendor = false;
                                        }
                                    }
                                    if (z != zIsFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = strD;
                                        try {
                                            arrayList.add(jm30.i(name, str2, str, capabilitiesForType, z3, zH, zIsVendor));
                                        } catch (Exception e) {
                                            e = e;
                                            f1t0.Q("MediaCodecUtil", "Failed to query codec " + name + " (" + str + Separators.RPAREN);
                                            throw e;
                                        }
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strD;
                        }
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
                nm30Var2 = nm30Var;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new om30("Failed to query underlying media codecs", e3);
        }
    }

    public static rcf0 g(androidx.media3.common.b bVar, boolean z, boolean z2) {
        Iterable iterableE;
        List listE = e(bVar.p, z, z2);
        String strC = c(bVar);
        if (strC == null) {
            v3x v3xVar = b4x.b;
            iterableE = rcf0.e;
        } else {
            iterableE = e(strC, z, z2);
        }
        u3x u3xVarL = b4x.l();
        u3xVarL.c(listE);
        u3xVarL.c(iterableE);
        return u3xVarL.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (mg40.i(str)) {
            return true;
        }
        String strH0 = j47.H0(mediaCodecInfo.getName());
        if (strH0.startsWith("arc.")) {
            return false;
        }
        if (strH0.startsWith("omx.google.") || strH0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strH0.startsWith("omx.sec.") && strH0.contains(".sw.")) || strH0.equals("omx.qcom.video.decoder.hevcswvdec") || strH0.startsWith("c2.android.") || strH0.startsWith("c2.google.")) {
            return true;
        }
        return (strH0.startsWith("omx.") || strH0.startsWith("c2.")) ? false : true;
    }
}
