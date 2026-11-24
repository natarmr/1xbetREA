package a;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.JsonReader;
import android.util.JsonToken;
import android.view.Surface;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import org.xbet.client1.R;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;
import org.xplatform.swipex.impl.navigation.SwipexInternalScreenFactory$getSwipexFilterScreen$1;

/* JADX INFO: loaded from: classes.dex */
public final class m6m0 implements lpj0, lq80, cm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21278a;

    public /* synthetic */ m6m0(byte b) {
        this.f21278a = b;
    }

    public static MediaCodec d(pzu pzuVar) throws IOException {
        String str = ((jm30) pzuVar.f27863a).f16746a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static TennisSurfaceType e(String str) {
        Object next;
        str.getClass();
        c0o c0oVar = TennisSurfaceType.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((TennisSurfaceType) next).f47098a.equalsIgnoreCase(str));
        TennisSurfaceType tennisSurfaceType = (TennisSurfaceType) next;
        return tennisSurfaceType == null ? TennisSurfaceType.UNKNOWN : tennisSurfaceType;
    }

    public static String f(long j) {
        Object next;
        c0o c0oVar = cus0.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((cus0) next).f5001a != j);
        cus0 cus0Var = (cus0) next;
        String strL = cus0Var != null ? kng0.l("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Heroes/", cus0Var.b, ".png") : null;
        return strL == null ? "" : strL;
    }

    public static int g(long j) {
        Object next;
        c0o c0oVar = cus0.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((cus0) next).f5001a != j);
        cus0 cus0Var = (cus0) next;
        return cus0Var != null ? cus0Var.c : R.string.empty_str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static rem0 h(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1928100394:
                if (str.equals("Team2Scores")) {
                    return rem0.g;
                }
                break;
            case -1897171800:
                if (str.equals("statDay")) {
                    return rem0.i;
                }
                break;
            case -1843684639:
                if (str.equals("statHomeAway")) {
                    return rem0.k;
                }
                break;
            case -567394020:
                if (str.equals("CentralActionZones")) {
                    return rem0.t;
                }
                break;
            case -370306359:
                if (str.equals("AltCaptionsByTeams")) {
                    return rem0.h;
                }
                break;
            case 80204861:
                if (str.equals("Stat1")) {
                    return rem0.d;
                }
                break;
            case 80204862:
                if (str.equals("Stat2")) {
                    return rem0.e;
                }
                break;
            case 266246922:
                if (str.equals("LeftActionZones")) {
                    return rem0.s;
                }
                break;
            case 452721785:
                if (str.equals("IRedCard1")) {
                    return rem0.l;
                }
                break;
            case 452721786:
                if (str.equals("IRedCard2")) {
                    return rem0.m;
                }
                break;
            case 516071150:
                if (str.equals("AddTime")) {
                    return rem0.c;
                }
                break;
            case 523523605:
                if (str.equals("RightActionZones")) {
                    return rem0.u;
                }
                break;
            case 995834867:
                if (str.equals("ICorner1")) {
                    return rem0.p;
                }
                break;
            case 995834868:
                if (str.equals("ICorner2")) {
                    return rem0.q;
                }
                break;
            case 1479363221:
                if (str.equals("Team1Scores")) {
                    return rem0.f;
                }
                break;
            case 1849133301:
                if (str.equals("InnsStats")) {
                    return rem0.r;
                }
                break;
            case 1959004932:
                if (str.equals("IYellowCard1")) {
                    return rem0.n;
                }
                break;
            case 1959004933:
                if (str.equals("IYellowCard2")) {
                    return rem0.o;
                }
                break;
            case 1964170342:
                if (str.equals("AltOpp")) {
                    return rem0.j;
                }
                break;
        }
        return rem0.b;
    }

    public static SwipexInternalScreenFactory$getSwipexFilterScreen$1 i(m6m0 m6m0Var) {
        m6m0Var.getClass();
        return new SwipexInternalScreenFactory$getSwipexFilterScreen$1(-1L, -1L);
    }

    public static bop0 j(int i) {
        bop0 bop0Var = bop0.FIRST;
        if (i == 1) {
            return bop0Var;
        }
        return i == 2 ? bop0.SECOND : bop0.UNDEFINED;
    }

    public static void k(JsonReader jsonReader, u3x u3xVar) throws IOException {
        jsonReader.beginArray();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                tom0 tom0Var = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if (strNextName.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        strNextString2 = jsonReader.nextString();
                    } else if (strNextName.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                        jsonReader.beginObject();
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        HashMap map3 = new HashMap();
                        String strNextString3 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            if (strNextName2.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                strNextString3 = jsonReader.nextString();
                                if (strNextString3.isEmpty()) {
                                    throw kq80.d("The HOST string is present but empty");
                                }
                            } else if (strNextName2.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName3 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map.put(strNextName3, jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (strNextName2.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map2.put(strNextName4, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (strNextName2.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map3.put(strNextName5, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        tom0Var = new tom0(strNextString3, map, map2, map3);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString == null) {
                    throw kq80.d("BASE-ID field is missing in a PATHWAY-CLONE object");
                }
                if (strNextString2 == null) {
                    throw kq80.d("ID field is missing in a PATHWAY-CLONE object");
                }
                if (tom0Var == null) {
                    throw kq80.d("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object");
                }
                u3xVar.b(new som0(strNextString, strNextString2, tom0Var));
                z = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z) {
            throw kq80.d("The PATHWAY-CLONES array is present but empty");
        }
    }

    public static void l(JsonReader jsonReader, u3x u3xVar) throws IOException {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String strNextString = jsonReader.nextString();
                if (!hashSet.add(strNextString)) {
                    throw kq80.d("The pathway ID (" + strNextString + ") appears more than once in the PATHWAY-PRIORITY array");
                }
                u3xVar.b(strNextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw kq80.d("The PATHWAY-PRIORITY array is present but empty");
        }
    }

    public static void m(androidx.fragment.app.e eVar, String str, String str2, boolean z) {
        eVar.getClass();
        str2.getClass();
        if (eVar.J("TotoBetMakeBetBottomSheetDialog") != null) {
            return;
        }
        ikr0 ikr0Var = new ikr0();
        iiy[] iiyVarArr = ikr0.m2;
        ikr0Var.g2.x(ikr0Var, iiyVarArr[0], str);
        ikr0Var.h2.x(ikr0Var, iiyVarArr[1], str2);
        ikr0Var.i2.v(ikr0Var, iiyVarArr[2], z);
        ikr0Var.H0(eVar, "TotoBetMakeBetBottomSheetDialog");
    }

    @Override // a.lq80
    public Object a(Uri uri, lbj lbjVar) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(lbjVar));
        try {
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw kq80.d("Steering manifest JSON should be an object at root");
            }
            u3x u3xVar = new u3x(4);
            u3x u3xVar2 = new u3x(4);
            jsonReader.beginObject();
            Uri uri2 = null;
            int iNextInt = 1;
            long jNextInt = -9223372036854775807L;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    iNextInt = jsonReader.nextInt();
                } else if (strNextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    jNextInt = ((long) jsonReader.nextInt()) * 1000;
                } else if (strNextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                    uri2 = Uri.parse(jsonReader.nextString());
                } else if (strNextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    l(jsonReader, u3xVar);
                } else if (strNextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    k(jsonReader, u3xVar2);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            rcf0 rcf0VarG = u3xVar.g();
            if (rcf0VarG.isEmpty()) {
                throw kq80.d("PATHWAY-PRIORITY field is missing");
            }
            uom0 uom0Var = new uom0(iNextInt, jNextInt, uri2, rcf0VarG, u3xVar2.g());
            jsonReader.close();
            return uom0Var;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // a.lpj0
    public gmq b(w6n0 w6n0Var) {
        return new eu4(w6n0Var, (byte) 28);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // a.cm30
    public dm30 c(pzu pzuVar) throws Throwable {
        MediaCodec mediaCodecD = null;
        try {
            mediaCodecD = d(pzuVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) pzuVar.d;
            mediaCodecD.configure((MediaFormat) pzuVar.b, surface, (MediaCrypto) pzuVar.e, (surface == null && ((jm30) pzuVar.f27863a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecD.start();
            Trace.endSection();
            return new kd30(mediaCodecD, (dq00) pzuVar.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodecD != null) {
                mediaCodecD.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecD != null) {
                mediaCodecD.release();
            }
            throw e;
        }
    }

    public String toString() {
        switch (this.f21278a) {
            case 0:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
