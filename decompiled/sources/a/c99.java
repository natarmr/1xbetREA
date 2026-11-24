package a;

import android.graphics.SurfaceTexture;
import android.util.Base64;
import android.util.JsonReader;
import android.view.Surface;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.EOFException;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c99 implements nub0, s5a, sky, ybo0, qbl, xbf, u9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3952a;

    public /* synthetic */ c99(usd usdVar) {
        this.f3952a = (byte) 22;
    }

    public static /* synthetic */ void f() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void h(int i) {
        throw new AssertionError(i);
    }

    public static /* synthetic */ void i(int i, int i2) {
        throw new IllegalArgumentException("Callable expects " + i + ((Object) " arguments, but ") + i2 + ((Object) " were provided."));
    }

    public static /* synthetic */ void j(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void k(int i, String str, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void l(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void r(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void s(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new poe(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void v(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    @Override // a.u9f
    public Object a(JsonReader jsonReader) throws IOException {
        switch (this.f3952a) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                hny.u("Null libraryName");
                                return null;
                            }
                            break;
                            break;
                        case "arch":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                hny.u("Null arch");
                                return null;
                            }
                            break;
                            break;
                        case "buildId":
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                hny.u("Null buildId");
                                return null;
                            }
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (strNextString != null && strNextString2 != null && strNextString3 != null) {
                    return new a25(strNextString, strNextString2, strNextString3);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" arch");
                }
                if (strNextString2 == null) {
                    sb.append(" libraryName");
                }
                if (strNextString3 == null) {
                    sb.append(" buildId");
                }
                jf4.n(vqd.o("Missing required properties:", sb));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                jsonReader.beginObject();
                String strNextString4 = null;
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString4 = jsonReader.nextString();
                        if (strNextString4 == null) {
                            hny.u("Null filename");
                            return null;
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            hny.u("Null contents");
                            return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString4 != null && bArrDecode != null) {
                    return new d25(strNextString4, bArrDecode);
                }
                StringBuilder sb2 = new StringBuilder();
                if (strNextString4 == null) {
                    sb2.append(" filename");
                }
                if (bArrDecode == null) {
                    sb2.append(" contents");
                }
                jf4.n(vqd.o("Missing required properties:", sb2));
                return null;
            default:
                b35 b35Var = new b35();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "parameterKey":
                            String strNextString5 = jsonReader.nextString();
                            if (strNextString5 == null) {
                                hny.u("Null parameterKey");
                                return null;
                            }
                            b35Var.b = strNextString5;
                            break;
                            break;
                        case "templateVersion":
                            b35Var.d = jsonReader.nextLong();
                            b35Var.e = (byte) (b35Var.e | 1);
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String strNextString6 = null;
                            String strNextString7 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName4 = jsonReader.nextName();
                                strNextName4.getClass();
                                if (strNextName4.equals("variantId")) {
                                    strNextString7 = jsonReader.nextString();
                                    if (strNextString7 == null) {
                                        hny.u("Null variantId");
                                        return null;
                                    }
                                } else if (strNextName4.equals("rolloutId")) {
                                    strNextString6 = jsonReader.nextString();
                                    if (strNextString6 == null) {
                                        hny.u("Null rolloutId");
                                        return null;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString6 != null && strNextString7 != null) {
                                b35Var.f1885a = new d35(strNextString6, strNextString7);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (strNextString6 == null) {
                                    sb3.append(" rolloutId");
                                }
                                if (strNextString7 == null) {
                                    sb3.append(" variantId");
                                }
                                jf4.n(vqd.o("Missing required properties:", sb3));
                                return null;
                            }
                            break;
                        case "parameterValue":
                            String strNextString8 = jsonReader.nextString();
                            if (strNextString8 == null) {
                                hny.u("Null parameterValue");
                                return null;
                            }
                            b35Var.c = strNextString8;
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return b35Var.a();
        }
    }

    @Override // a.sky
    public l7x b(dhi0 dhi0Var) throws GeneralSecurityException {
        hbb hbbVar;
        w4d0 w4d0Var = (w4d0) dhi0Var;
        if (!w4d0Var.f38538a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            jf4.o("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            dbb dbbVarA = dbb.A(w4d0Var.c, qso.a());
            if (dbbVarA.y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            af80 af80Var = w4d0Var.e;
            int iOrdinal = af80Var.ordinal();
            if (iOrdinal == 1) {
                hbbVar = hbb.c;
            } else if (iOrdinal == 2) {
                hbbVar = hbb.d;
            } else if (iOrdinal == 3) {
                hbbVar = hbb.e;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + af80Var.b());
                }
                hbbVar = hbb.d;
            }
            return ebb.h0(hbbVar, new iw20(sg9.a(dbbVarA.x().h())), w4d0Var.f);
        } catch (ynx unused) {
            hny.o("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // a.xbf
    public Object c(Object obj) {
        ((m1r) obj).getClass();
        e7e.d2.getClass();
        return new e7e();
    }

    @Override // a.s5a
    public void cancel() {
    }

    @Override // a.nub0
    public void d(pmn0 pmn0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(pmn0Var.b.getWidth(), pmn0Var.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        pmn0Var.a(surface, bnk.a(), new m3a(surface, surfaceTexture, (byte) 0));
    }

    @Override // a.qbl
    public double e(double d) {
        switch (this.f3952a) {
            case 15:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 16:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 17:
                float[] fArr = a5d.f266a;
                return a5d.b(a5d.c, d);
            case 18:
                float[] fArr2 = a5d.f266a;
                return a5d.a(a5d.c, d);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                float[] fArr3 = a5d.f266a;
                return a5d.d(a5d.d, d);
            default:
                float[] fArr4 = a5d.f266a;
                return a5d.c(a5d.d, d);
        }
    }

    @Override // a.ybo0
    public void g(tbo0 tbo0Var, int i) {
        kl5 kl5Var = ywc.W1;
        tbo0Var.e.setClickable(false);
    }

    public /* synthetic */ c99(byte b) {
        this.f3952a = b;
    }
}
