package a;

import android.util.Base64;
import android.util.JsonReader;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t9f implements u9f, ols0, sg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33559a;

    public static /* synthetic */ void b() {
        throw new m460();
    }

    @Override // a.u9f
    public Object a(JsonReader jsonReader) throws IOException {
        byte b = 2;
        switch (this.f33559a) {
            case 0:
                jsonReader.beginObject();
                byte b2 = 0;
                int iNextInt = 0;
                String strNextString = null;
                List listB = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "frames":
                            listB = v9f.b(jsonReader, new t9f(b));
                            if (listB == null) {
                                hny.u("Null frames");
                                return null;
                            }
                            continue;
                            break;
                            break;
                        case "name":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                hny.u("Null name");
                                return null;
                            }
                            break;
                        case "importance":
                            iNextInt = jsonReader.nextInt();
                            b2 = (byte) (b2 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 1 && strNextString != null && listB != null) {
                    return new u25(strNextString, listB, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" name");
                }
                if ((b2 & 1) == 0) {
                    sb.append(" importance");
                }
                if (listB == null) {
                    sb.append(" frames");
                }
                jf4.n(vqd.o("Missing required properties:", sb));
                return null;
            case 1:
                jsonReader.beginObject();
                byte b3 = 0;
                String strNextString2 = null;
                String str = null;
                long jNextLong = 0;
                long jNextLong2 = 0;
                while (true) {
                    if (!jsonReader.hasNext()) {
                        jsonReader.endObject();
                        if (b3 == 3 && strNextString2 != null) {
                            return new r25(jNextLong, jNextLong2, strNextString2, str);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if ((b3 & 1) == 0) {
                            sb2.append(" baseAddress");
                        }
                        if ((b3 & 2) == 0) {
                            sb2.append(" size");
                        }
                        if (strNextString2 == null) {
                            sb2.append(" name");
                        }
                        jf4.n(vqd.o("Missing required properties:", sb2));
                        return null;
                    }
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "name":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                hny.u("Null name");
                                return null;
                            }
                            break;
                            break;
                        case "size":
                            b3 = (byte) (b3 | 2);
                            jNextLong2 = jsonReader.nextLong();
                            break;
                        case "uuid":
                            str = new String(Base64.decode(jsonReader.nextString(), 2), r9f.f30077a);
                            break;
                        case "baseAddress":
                            b3 = (byte) (b3 | 1);
                            jNextLong = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                break;
            default:
                return v9f.f(jsonReader);
        }
    }

    @Override // a.ols0, a.eer
    /* JADX INFO: renamed from: apply */
    public Object mo11apply(Object obj) {
        pcj.b.getClass();
        return v9f.f37032a.a((r9f) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        gt2 gt2Var = (gt2) obj;
        switch (this.f33559a) {
            case 6:
                gt2Var.getClass();
                break;
            case 7:
                gt2Var.getClass();
                break;
            case 8:
                gt2Var.getClass();
                break;
            case 9:
                gt2Var.getClass();
                break;
            case 10:
                gt2Var.getClass();
                break;
            case 11:
                gt2Var.getClass();
                break;
            case 12:
                gt2Var.getClass();
                break;
            case 13:
                gt2Var.getClass();
                break;
            case 14:
                gt2Var.getClass();
                break;
            case 15:
                gt2Var.getClass();
                break;
            case 16:
                gt2Var.getClass();
                break;
            case 17:
                gt2Var.getClass();
                break;
            case 18:
                gt2Var.getClass();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gt2Var.getClass();
                break;
            case 20:
                gt2Var.getClass();
                break;
            case 21:
                gt2Var.getClass();
                break;
            case 22:
                gt2Var.getClass();
                break;
            case 23:
                gt2Var.getClass();
                break;
            case 24:
                gt2Var.getClass();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gt2Var.getClass();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gt2Var.getClass();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gt2Var.getClass();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gt2Var.getClass();
                break;
            default:
                gt2Var.getClass();
                break;
        }
    }

    public /* synthetic */ t9f(byte b) {
        this.f33559a = b;
    }
}
