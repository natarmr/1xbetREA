package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class pbw implements lq80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mbw f26730a;
    public final ibw b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("SAMPLE-RATE=(\\d+)\\b");
    public static final Pattern k = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern l = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern n = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern o = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern p = Pattern.compile("SCORE=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("SERVER-URI=\"((?:.|\f)+?)\"");
    public static final Pattern r = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern s = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern t = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern u = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern v = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern w = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern x = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern z = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern A = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern B = b("CAN-SKIP-DATERANGES");
    public static final Pattern Y = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern f1 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern g1 = b("CAN-BLOCK-RELOAD");
    public static final Pattern h1 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern i1 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern j1 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern k1 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern l1 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern m1 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern n1 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern o1 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern p1 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern q1 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern r1 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern s1 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern t1 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern u1 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern v1 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern w1 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern x1 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern y1 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern z1 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern A1 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern B1 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern C1 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern D1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern E1 = b("AUTOSELECT");
    public static final Pattern F1 = b("DEFAULT");
    public static final Pattern G1 = b("FORCED");
    public static final Pattern H1 = b("INDEPENDENT");
    public static final Pattern I1 = b("GAP");
    public static final Pattern J1 = b("PRECISE");
    public static final Pattern K1 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern L1 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern M1 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern N1 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern O1 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern P1 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern Q1 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern R1 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern S1 = b("END-ON-NEXT");
    public static final Pattern U1 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern V1 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern W1 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern X1 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern Y1 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern Z1 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern a2 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern b2 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern c2 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern d2 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern e2 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern f2 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern g2 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern h2 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public pbw(mbw mbwVar, ibw ibwVar) {
        this.f26730a = mbwVar;
        this.b = ibwVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData c(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i2];
            schemeDataArr2[i2] = new DrmInitData.SchemeData(schemeData.b, schemeData.c, schemeData.d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData d(String str, String str2, HashMap map, icr icrVar) throws kq80 {
        String strK = k(str, t1, "1", map, icrVar);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = u1;
        if (zEquals) {
            String strL = l(str, pattern, map, icrVar);
            return new DrmInitData.SchemeData(tg9.d, null, "video/mp4", Base64.decode(strL.substring(strL.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = tg9.d;
            String str3 = vtt0.f38024a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strK)) {
            return null;
        }
        String strL2 = l(str, pattern, map, icrVar);
        byte[] bArrDecode = Base64.decode(strL2.substring(strL2.indexOf(44)), 0);
        UUID uuid2 = tg9.e;
        int length = (bArrDecode != null ? bArrDecode.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
        if (bArrDecode == null || bArrDecode.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArrDecode.length);
            byteBufferAllocate.put(bArrDecode);
        }
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", byteBufferAllocate.array());
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static a.ibw e(a.mbw r140, a.ibw r141, a.ywu r142, android.net.Uri r143, a.icr r144) {
        /*
            Method dump skipped, instruction units count: 4766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pbw.e(a.mbw, a.ibw, a.ywu, android.net.Uri, a.icr):a.ibw");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x0281  */
    /* JADX WARN: Code duplicated, block: B:109:0x0291  */
    /* JADX WARN: Code duplicated, block: B:112:0x029a  */
    /* JADX WARN: Code duplicated, block: B:113:0x029c  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:138:0x030c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0311  */
    /* JADX WARN: Code duplicated, block: B:142:0x031a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0342  */
    /* JADX WARN: Code duplicated, block: B:147:0x034d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0353  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:202:0x0562  */
    /* JADX WARN: Code duplicated, block: B:299:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v52 */
    public static mbw f(ywu ywuVar, Uri uri, icr icrVar) throws IOException {
        int i2;
        int i3;
        ArrayList arrayList;
        lbw lbwVar;
        String strD;
        ArrayList arrayList2;
        int i4;
        String str;
        lbw lbwVar2;
        String strD2;
        lbw lbwVar3;
        int i5;
        String str2;
        String str3;
        String strS;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c4d c4dVar;
        String[] strArrW;
        StringBuilder sb;
        int length;
        int i11;
        String string;
        String str4;
        c4d c4dVar2;
        String strK;
        int i12;
        int i13;
        String strK2;
        float f3;
        Uri uriP;
        Uri uri2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String string2 = uri.toString();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        lbu lbuVar = null;
        while (true) {
            boolean zU = ywuVar.u();
            Pattern pattern = u1;
            ArrayList arrayList13 = arrayList9;
            Pattern pattern2 = z1;
            boolean zContains = z2;
            boolean z4 = z3;
            if (!zU) {
                ArrayList arrayList14 = arrayList5;
                HashMap map3 = map;
                ArrayList arrayList15 = arrayList10;
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList6;
                ArrayList arrayList18 = arrayList7;
                ArrayList arrayList19 = arrayList8;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i14 = 0;
                while (i14 < arrayList14.size()) {
                    lbw lbwVar4 = (lbw) arrayList14.get(i14);
                    Uri uri3 = lbwVar4.f19770a;
                    androidx.media3.common.b bVar = lbwVar4.b;
                    if (hashSet.add(uri3)) {
                        x0x.K(bVar.m == null);
                        ArrayList arrayList22 = (ArrayList) map3.get(lbwVar4.f19770a);
                        arrayList22.getClass();
                        ed40 ed40Var = new ed40(new acw(arrayList22, null, null));
                        awq awqVarA = bVar.a();
                        awqVarA.l = ed40Var;
                        arrayList21.add(new lbw(lbwVar4.f19770a, new androidx.media3.common.b(awqVarA), lbwVar4.c, lbwVar4.d, lbwVar4.e, lbwVar4.f, lbwVar4.g, lbwVar4.h));
                    }
                    i14++;
                    hashSet = hashSet;
                    map3 = map3;
                }
                int i15 = 0;
                ArrayList arrayList23 = null;
                androidx.media3.common.b bVar2 = null;
                while (i15 < arrayList15.size()) {
                    ArrayList arrayList24 = arrayList15;
                    String str5 = (String) arrayList24.get(i15);
                    String strL = l(str5, B1, map2, icrVar);
                    String strL2 = l(str5, pattern2, map2, icrVar);
                    ArrayList arrayList25 = arrayList23;
                    ArrayList arrayList26 = arrayList21;
                    String strK3 = k(str5, t, null, map2, icrVar);
                    awq awqVar = new awq();
                    awqVar.f1587a = kng0.l(strL, Separators.COLON, strL2);
                    awqVar.b = strL2;
                    awqVar.n = mg40.n("application/x-mpegURL");
                    boolean zG = g(str5, F1, icrVar);
                    ?? r29 = zG;
                    if (g(str5, G1, icrVar)) {
                        r29 = (zG ? 1 : 0) | 2;
                    }
                    awqVar.e = g(str5, E1, icrVar) ? r29 | 4 : r29;
                    androidx.media3.common.b bVar3 = bVar2;
                    String strK4 = k(str5, C1, null, map2, icrVar);
                    if (TextUtils.isEmpty(strK4)) {
                        i3 = i15;
                        i2 = 0;
                    } else {
                        String str6 = vtt0.f38024a;
                        String[] strArrSplit = strK4.split(Separators.COMMA, -1);
                        i2 = vtt0.l("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        i3 = i15;
                        if (vtt0.l("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i2 |= 4096;
                        }
                        if (vtt0.l("public.accessibility.describes-music-and-sound", strArrSplit)) {
                            i2 |= 1024;
                        }
                        if (vtt0.l("public.easy-to-read", strArrSplit)) {
                            i2 |= 8192;
                        }
                    }
                    awqVar.f = i2;
                    awqVar.d = k(str5, y1, null, map2, icrVar);
                    String strK5 = k(str5, pattern, null, map2, icrVar);
                    Uri uriP2 = strK5 == null ? null : msm0.p(string2, strK5);
                    String str7 = string2;
                    ed40 ed40Var2 = new ed40(new acw(Collections.EMPTY_LIST, strL, strL2));
                    switch (l(str5, w1, map2, icrVar)) {
                        case "SUBTITLES":
                            arrayList = arrayList18;
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList14.size()) {
                                    lbw lbwVar5 = (lbw) arrayList14.get(i16);
                                    if (strL.equals(lbwVar5.e)) {
                                        lbwVar = lbwVar5;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    lbwVar = null;
                                }
                            }
                            if (lbwVar != null) {
                                String strS2 = vtt0.s(3, lbwVar.b.l);
                                awqVar.k = strS2;
                                strD = mg40.d(strS2);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = "text/vtt";
                            }
                            awqVar.o = mg40.n(strD);
                            awqVar.l = ed40Var2;
                            if (uriP2 != null) {
                                arrayList2 = arrayList19;
                                arrayList2.add(new kbw(uriP2, new androidx.media3.common.b(awqVar), strL, strL2, strK3));
                            } else {
                                arrayList2 = arrayList19;
                                f1t0.g0("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList23 = arrayList25;
                            bVar2 = bVar3;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList18;
                            String strL3 = l(str5, D1, map2, icrVar);
                            if (strL3.startsWith("CC")) {
                                i4 = Integer.parseInt(strL3.substring(2));
                                str = "application/cea-608";
                            } else {
                                i4 = Integer.parseInt(strL3.substring(7));
                                str = "application/cea-708";
                            }
                            ArrayList arrayList27 = arrayList25 == null ? new ArrayList() : arrayList25;
                            awqVar.o = mg40.n(str);
                            awqVar.O = i4;
                            arrayList27.add(new androidx.media3.common.b(awqVar));
                            arrayList23 = arrayList27;
                            arrayList2 = arrayList19;
                            bVar2 = bVar3;
                            break;
                        case "AUDIO":
                            ArrayList arrayList28 = arrayList17;
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList14.size()) {
                                    lbwVar2 = (lbw) arrayList14.get(i17);
                                    if (!strL.equals(lbwVar2.d)) {
                                        i17++;
                                    }
                                } else {
                                    lbwVar2 = null;
                                }
                            }
                            if (lbwVar2 != null) {
                                String strS3 = vtt0.s(1, lbwVar2.b.l);
                                awqVar.k = strS3;
                                strD2 = mg40.d(strS3);
                            } else {
                                strD2 = null;
                            }
                            arrayList17 = arrayList28;
                            String strK6 = k(str5, i, null, map2, icrVar);
                            if (strK6 != null) {
                                String str8 = vtt0.f38024a;
                                awqVar.I = Integer.parseInt(strK6.split(Separators.SLASH, 2)[0]);
                                if ("audio/eac3".equals(strD2) && strK6.endsWith("/JOC")) {
                                    awqVar.k = "ec+3";
                                    strD2 = "audio/eac3-joc";
                                }
                            }
                            int i18 = i(str5, j, icrVar);
                            if (i18 != -1) {
                                awqVar.K = i18;
                            }
                            awqVar.o = mg40.n(strD2);
                            if (uriP2 == null) {
                                arrayList = arrayList18;
                                if (lbwVar2 != null) {
                                    androidx.media3.common.b bVar4 = new androidx.media3.common.b(awqVar);
                                    arrayList23 = arrayList25;
                                    bVar2 = bVar4;
                                    arrayList2 = arrayList19;
                                }
                                break;
                            } else {
                                awqVar.l = ed40Var2;
                                arrayList = arrayList18;
                                arrayList.add(new kbw(uriP2, new androidx.media3.common.b(awqVar), strL, strL2, strK3));
                            }
                            arrayList2 = arrayList19;
                            arrayList23 = arrayList25;
                            bVar2 = bVar3;
                            break;
                        case "VIDEO":
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList14.size()) {
                                    lbwVar3 = (lbw) arrayList14.get(i19);
                                    if (!strL.equals(lbwVar3.c)) {
                                        i19++;
                                    }
                                } else {
                                    lbwVar3 = null;
                                }
                            }
                            if (lbwVar3 != null) {
                                androidx.media3.common.b bVar5 = lbwVar3.b;
                                String strS4 = vtt0.s(2, bVar5.l);
                                awqVar.k = strS4;
                                awqVar.o = mg40.n(mg40.d(strS4));
                                awqVar.v = bVar5.w;
                                awqVar.w = bVar5.x;
                                awqVar.a(bVar5.B);
                            }
                            if (uriP2 != null) {
                                awqVar.l = ed40Var2;
                                arrayList17.add(new kbw(uriP2, new androidx.media3.common.b(awqVar), strL, strL2, strK3));
                                break;
                            }
                        default:
                            arrayList2 = arrayList19;
                            arrayList = arrayList18;
                            arrayList23 = arrayList25;
                            bVar2 = bVar3;
                            break;
                    }
                    i15 = i3 + 1;
                    arrayList18 = arrayList;
                    arrayList15 = arrayList24;
                    arrayList19 = arrayList2;
                    arrayList21 = arrayList26;
                    string2 = str7;
                }
                return new mbw(uri.toString(), arrayList16, arrayList21, arrayList17, arrayList18, arrayList19, arrayList13, bVar2, zContains ? Collections.EMPTY_LIST : arrayList23, z4, map2, arrayList20, lbuVar);
            }
            String strX = ywuVar.x();
            ArrayList arrayList29 = arrayList8;
            if (strX.startsWith("#EXT")) {
                arrayList12.add(strX);
            }
            boolean zStartsWith = strX.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList30 = arrayList12;
            if (strX.startsWith("#EXT-X-DEFINE")) {
                String strK7 = k(strX, pattern2, null, map2, icrVar);
                if (strK7 != null) {
                    n(strK7, map2);
                    map2.put(strK7, l(strX, K1, map2, icrVar));
                } else {
                    String strL4 = l(strX, A1, map2, icrVar);
                    n(strL4, map2);
                    String queryParameter = uri.getQueryParameter(strL4);
                    if (queryParameter == null) {
                        throw kq80.b("QUERYPARAM \"" + strL4 + "\" not found in playlist URI");
                    }
                    map2.put(strL4, queryParameter);
                }
            } else {
                if (strX.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    ArrayList arrayList31 = arrayList5;
                    map = map;
                    arrayList3 = arrayList31;
                    arrayList10 = arrayList10;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList11 = arrayList11;
                    z2 = zContains;
                    z3 = true;
                } else if (strX.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strX);
                } else if (strX.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataD = d(strX, k(strX, s1, "identity", map2, icrVar), map2, icrVar);
                    if (schemeDataD != null) {
                        String strL5 = l(strX, r1, map2, icrVar);
                        arrayList11.add(new DrmInitData(("SAMPLE-AES-CENC".equals(strL5) || "SAMPLE-AES-CTR".equals(strL5)) ? "cenc" : "cbcs", true, schemeDataD));
                    }
                } else {
                    boolean zStartsWith2 = strX.startsWith("#EXT-X-CONTENT-STEERING");
                    Pattern pattern3 = r;
                    if (zStartsWith2) {
                        if (lbuVar != null) {
                            throw kq80.b("The #EXT-X-CONTENT-STEERING tag must not appear more than once in a multivariant playlist");
                        }
                        arrayList3 = arrayList5;
                        lbuVar = new lbu((Object) msm0.p(string2, l(strX, q, map2, icrVar)), (Object) k(strX, pattern3, null, map2, icrVar), (byte) 20);
                    } else if (strX.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        zContains |= strX.contains("CLOSED-CAPTIONS=NONE");
                        int i20 = zStartsWith ? 16384 : 0;
                        int i21 = Integer.parseInt(l(strX, h, Collections.EMPTY_MAP, icrVar));
                        int i22 = i(strX, c, icrVar);
                        arrayList7 = arrayList7;
                        arrayList6 = arrayList6;
                        String strK8 = k(strX, k, null, map2, icrVar);
                        arrayList10 = arrayList10;
                        String strK9 = k(strX, l, null, map2, icrVar);
                        HashMap map4 = map;
                        String strK10 = k(strX, m, null, map2, icrVar);
                        if (strK10 != null) {
                            String str9 = vtt0.f38024a;
                            String[] strArrSplit2 = strK10.split(Separators.COMMA, 2)[0].split(Separators.SLASH, -1);
                            str2 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str3 = strArrSplit2[1];
                                arrayList5 = arrayList5;
                                i5 = 2;
                            } else {
                                i5 = 2;
                            }
                            strS = vtt0.s(i5, strK9);
                            if (mg40.j(strS, str2)) {
                                if (str2 == null) {
                                    i6 = i20;
                                } else {
                                    if (strK8 != null || str3 == null) {
                                        i6 = i20;
                                    } else {
                                        i6 = i20;
                                        if ((!strK8.equals("PQ") || str3.equals("db1p")) && ((!strK8.equals("SDR") || str3.equals("db2g")) && (!strK8.equals("HLG") || str3.startsWith("db4")))) {
                                        }
                                    }
                                    c4dVar2 = null;
                                }
                                if (strK9 == null && mg40.j(strK9, str2)) {
                                    i7 = 6;
                                    if (!strK9.startsWith("dvhe") || strK9.startsWith("dvh1") || strK9.startsWith("dav1")) {
                                        i8 = 6;
                                        i9 = -1;
                                        i10 = 1;
                                    } else if (str3 == null) {
                                        i9 = -1;
                                        i7 = -1;
                                        i10 = -1;
                                        i8 = -1;
                                    } else if (str3.equals("db1p")) {
                                        i8 = 6;
                                        i9 = -1;
                                        i10 = 2;
                                    } else if (str3.startsWith("db4")) {
                                        i9 = -1;
                                        i10 = 2;
                                        i8 = 7;
                                    } else {
                                        i9 = -1;
                                        i7 = -1;
                                        i10 = -1;
                                        i8 = -1;
                                    }
                                    if (i7 == i9) {
                                        c4dVar = null;
                                    } else {
                                        c4dVar = new c4d(i7, i10, i8, null, -1, -1);
                                    }
                                } else {
                                    c4dVar = null;
                                }
                                if (str2 == null) {
                                    str2 = strS;
                                }
                                strArrW = vtt0.W(strK9);
                                if (strArrW.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrW.length;
                                    i11 = 0;
                                    while (i11 < length) {
                                        str4 = strArrW[i11];
                                        String[] strArr = strArrW;
                                        if (2 == mg40.h(mg40.d(str4))) {
                                            if (sb.length() > 0) {
                                                sb.append(Separators.COMMA);
                                            }
                                            sb.append(str4);
                                        }
                                        i11++;
                                        strArrW = strArr;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strK9 = w6x.q(str2, Separators.COMMA, string);
                                } else {
                                    strK9 = str2;
                                }
                                c4dVar2 = c4dVar;
                            } else {
                                i6 = i20;
                                c4dVar2 = null;
                            }
                            strK = k(strX, n, null, map2, icrVar);
                            if (strK != null) {
                                String[] strArrSplit3 = strK.split("x", -1);
                                i13 = Integer.parseInt(strArrSplit3[0]);
                                i12 = Integer.parseInt(strArrSplit3[1]);
                                if (i13 > 0 || i12 <= 0) {
                                    i12 = -1;
                                    i13 = -1;
                                }
                            } else {
                                i12 = -1;
                                i13 = -1;
                            }
                            strK2 = k(strX, o, null, map2, icrVar);
                            if (strK2 != null) {
                                f3 = Float.parseFloat(strK2);
                            } else {
                                f3 = -1.0f;
                            }
                            String strK11 = k(strX, p, null, map2, icrVar);
                            float f4 = strK11 != null ? Float.parseFloat(strK11) : -1.0f;
                            String strK12 = k(strX, pattern3, null, map2, icrVar);
                            String strK13 = k(strX, d, null, map2, icrVar);
                            String strK14 = k(strX, e, null, map2, icrVar);
                            String strK15 = k(strX, f, null, map2, icrVar);
                            String strK16 = k(strX, g, null, map2, icrVar);
                            String strK17 = k(strX, s, null, map2, icrVar);
                            if (zStartsWith) {
                                uriP = msm0.p(string2, l(strX, pattern, map2, icrVar));
                            } else {
                                if (ywuVar.u()) {
                                    throw kq80.b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriP = msm0.p(string2, m(ywuVar.x(), map2, icrVar));
                            }
                            uri2 = uriP;
                            awq awqVar2 = new awq();
                            awqVar2.f1587a = Integer.toString(arrayList5.size());
                            awqVar2.n = mg40.n("application/x-mpegURL");
                            awqVar2.k = strK9;
                            awqVar2.i = i22;
                            awqVar2.j = i21;
                            awqVar2.v = i13;
                            awqVar2.w = i12;
                            awqVar2.a(f3);
                            awqVar2.g = f4;
                            awqVar2.f = i6;
                            awqVar2.G = c4dVar2;
                            arrayList3 = arrayList5;
                            arrayList3.add(new lbw(uri2, new androidx.media3.common.b(awqVar2), strK13, strK14, strK15, strK16, strK12, strK17));
                            map = map4;
                            arrayList4 = (ArrayList) map.get(uri2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map.put(uri2, arrayList4);
                            }
                            arrayList4.add(new zbw(i22, i21, strK13, strK14, strK15, strK16));
                        } else {
                            i5 = 2;
                            str2 = null;
                        }
                        str3 = null;
                        strS = vtt0.s(i5, strK9);
                        if (mg40.j(strS, str2)) {
                            if (str2 == null) {
                                i6 = i20;
                            } else {
                                if (strK8 != null) {
                                    i6 = i20;
                                } else {
                                    i6 = i20;
                                }
                                c4dVar2 = null;
                            }
                            if (strK9 == null) {
                                c4dVar = null;
                            } else {
                                i7 = 6;
                                if (strK9.startsWith("dvhe")) {
                                    i8 = 6;
                                    i9 = -1;
                                    i10 = 1;
                                } else {
                                    i8 = 6;
                                    i9 = -1;
                                    i10 = 1;
                                }
                                if (i7 == i9) {
                                    c4dVar = null;
                                } else {
                                    c4dVar = new c4d(i7, i10, i8, null, -1, -1);
                                }
                            }
                            if (str2 == null) {
                                str2 = strS;
                            }
                            strArrW = vtt0.W(strK9);
                            if (strArrW.length == 0) {
                                string = null;
                            } else {
                                sb = new StringBuilder();
                                length = strArrW.length;
                                i11 = 0;
                                while (i11 < length) {
                                    str4 = strArrW[i11];
                                    String[] strArr2 = strArrW;
                                    if (2 == mg40.h(mg40.d(str4))) {
                                        if (sb.length() > 0) {
                                            sb.append(Separators.COMMA);
                                        }
                                        sb.append(str4);
                                    }
                                    i11++;
                                    strArrW = strArr2;
                                }
                                if (sb.length() > 0) {
                                    string = sb.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strK9 = w6x.q(str2, Separators.COMMA, string);
                            } else {
                                strK9 = str2;
                            }
                            c4dVar2 = c4dVar;
                        } else {
                            i6 = i20;
                            c4dVar2 = null;
                        }
                        strK = k(strX, n, null, map2, icrVar);
                        if (strK != null) {
                            String[] strArrSplit4 = strK.split("x", -1);
                            i13 = Integer.parseInt(strArrSplit4[0]);
                            i12 = Integer.parseInt(strArrSplit4[1]);
                            if (i13 > 0) {
                                i12 = -1;
                                i13 = -1;
                            } else {
                                i12 = -1;
                                i13 = -1;
                            }
                        } else {
                            i12 = -1;
                            i13 = -1;
                        }
                        strK2 = k(strX, o, null, map2, icrVar);
                        if (strK2 != null) {
                            f3 = Float.parseFloat(strK2);
                        } else {
                            f3 = -1.0f;
                        }
                        String strK18 = k(strX, p, null, map2, icrVar);
                        if (strK18 != null) {
                        }
                        String strK19 = k(strX, pattern3, null, map2, icrVar);
                        String strK110 = k(strX, d, null, map2, icrVar);
                        String strK111 = k(strX, e, null, map2, icrVar);
                        String strK112 = k(strX, f, null, map2, icrVar);
                        String strK113 = k(strX, g, null, map2, icrVar);
                        String strK114 = k(strX, s, null, map2, icrVar);
                        if (zStartsWith) {
                            uriP = msm0.p(string2, l(strX, pattern, map2, icrVar));
                        } else {
                            if (ywuVar.u()) {
                                throw kq80.b("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriP = msm0.p(string2, m(ywuVar.x(), map2, icrVar));
                        }
                        uri2 = uriP;
                        awq awqVar3 = new awq();
                        awqVar3.f1587a = Integer.toString(arrayList5.size());
                        awqVar3.n = mg40.n("application/x-mpegURL");
                        awqVar3.k = strK9;
                        awqVar3.i = i22;
                        awqVar3.j = i21;
                        awqVar3.v = i13;
                        awqVar3.w = i12;
                        awqVar3.a(f3);
                        awqVar3.g = f4;
                        awqVar3.f = i6;
                        awqVar3.G = c4dVar2;
                        arrayList3 = arrayList5;
                        arrayList3.add(new lbw(uri2, new androidx.media3.common.b(awqVar3), strK110, strK111, strK112, strK113, strK19, strK114));
                        map = map4;
                        arrayList4 = (ArrayList) map.get(uri2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uri2, arrayList4);
                        }
                        arrayList4.add(new zbw(i22, i21, strK110, strK111, strK112, strK113));
                    }
                    z2 = zContains;
                    z3 = z4;
                }
                HashMap map5 = map;
                arrayList5 = arrayList3;
                map = map5;
                arrayList9 = arrayList13;
                arrayList8 = arrayList29;
                arrayList12 = arrayList30;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList10 = arrayList10;
            }
            arrayList3 = arrayList5;
            z2 = zContains;
            z3 = z4;
            HashMap map6 = map;
            arrayList5 = arrayList3;
            map = map6;
            arrayList9 = arrayList13;
            arrayList8 = arrayList29;
            arrayList12 = arrayList30;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList10 = arrayList10;
        }
    }

    public static boolean g(String str, Pattern pattern, icr icrVar) {
        int i2 = icr.b;
        Matcher matcherA = icrVar.a(pattern, str);
        if (matcherA.find()) {
            return "YES".equals(matcherA.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d3, icr icrVar) {
        int i2 = icr.b;
        Matcher matcherA = icrVar.a(pattern, str);
        if (!matcherA.find()) {
            return d3;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static int i(String str, Pattern pattern, icr icrVar) {
        int i2 = icr.b;
        Matcher matcherA = icrVar.a(pattern, str);
        if (!matcherA.find()) {
            return -1;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Integer.parseInt(strGroup);
    }

    public static long j(String str, Pattern pattern, icr icrVar) {
        int i2 = icr.b;
        Matcher matcherA = icrVar.a(pattern, str);
        if (!matcherA.find()) {
            return -1L;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String k(String str, Pattern pattern, String str2, Map map, icr icrVar) {
        int i2 = icr.b;
        Matcher matcherA = icrVar.a(pattern, str);
        if (matcherA.find()) {
            str2 = matcherA.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m(str2, map, icrVar);
    }

    public static String l(String str, Pattern pattern, Map map, icr icrVar) throws kq80 {
        String strK = k(str, pattern, null, map, icrVar);
        if (strK != null) {
            return strK;
        }
        throw kq80.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String m(String str, Map map, icr icrVar) {
        int i2 = icr.b;
        Matcher matcherA = icrVar.a(g2, str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherA.find()) {
            String strGroup = matcherA.group(1);
            if (map.containsKey(strGroup)) {
                matcherA.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcherA.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void n(String str, HashMap map) throws kq80 {
        if (map.containsKey(str)) {
            throw kq80.b("duplicate variable name \"" + str + Separators.DOUBLE_QUOTE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:44:0x009f, B:46:0x00a7, B:48:0x00af, B:50:0x00b7, B:52:0x00bf, B:54:0x00c7, B:56:0x00cf, B:58:0x00d7, B:61:0x00e0, B:62:0x00e4, B:70:0x0106, B:71:0x010c, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:85:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x009d, LOOP:2: B:17:0x0046->B:22:0x0052, LOOP_END, TryCatch #3 {all -> 0x009d, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:44:0x009f, B:46:0x00a7, B:48:0x00af, B:50:0x00b7, B:52:0x00bf, B:54:0x00c7, B:56:0x00cf, B:58:0x00d7, B:61:0x00e0, B:62:0x00e4, B:70:0x0106, B:71:0x010c, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:85:0x0019 }] */
    @Override // a.lq80
    public final Object a(Uri uri, lbj lbjVar) throws kq80 {
        int i2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(lbjVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        icr icrVar = new icr(16, 0.75f, true, (byte) 1);
        try {
            int i3 = bufferedReader.read();
            boolean zK = false;
            if (i3 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i3 = bufferedReader.read();
                    while (i3 != -1) {
                        i3 = bufferedReader.read();
                    }
                    i2 = 0;
                    while (true) {
                        if (i2 < 7) {
                            while (i3 != -1) {
                                i3 = bufferedReader.read();
                            }
                            zK = vtt0.K(i3);
                            break;
                        }
                        if (i3 != "#EXTM3U".charAt(i2)) {
                            break;
                            break;
                        }
                        i3 = bufferedReader.read();
                        i2++;
                    }
                }
            } else {
                while (i3 != -1 && Character.isWhitespace(i3)) {
                    i3 = bufferedReader.read();
                }
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                        while (i3 != -1 && Character.isWhitespace(i3) && !vtt0.K(i3)) {
                            i3 = bufferedReader.read();
                        }
                        zK = vtt0.K(i3);
                        break;
                    }
                    if (i3 != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    i3 = bufferedReader.read();
                    i2++;
                }
            }
            if (!zK) {
                throw kq80.b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String str = vtt0.f38024a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    throw kq80.b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        mbw mbwVarF = f(new ywu(arrayDeque, bufferedReader), uri, icrVar);
                        String str2 = vtt0.f38024a;
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                        return mbwVarF;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    ibw ibwVarE = e(this.f26730a, this.b, new ywu(arrayDeque, bufferedReader), uri, icrVar);
                    String str3 = vtt0.f38024a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                    return ibwVarE;
                }
            }
        } catch (Throwable th) {
            String str4 = vtt0.f38024a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }
}
