package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.xplatform.rules.impl.util.ContactsWebView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vzd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38292a;

    public /* synthetic */ vzd(byte b) {
        this.f38292a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object n2fVar;
        switch (this.f38292a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 2:
                int i = ContactsWebView.m;
                ((Uri) obj).getClass();
                return Unit.f46060a;
            case 3:
                return obj;
            case 4:
                ((nea0) obj).getClass();
                return Unit.f46060a;
            case 5:
                ((nea0) obj).getClass();
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof lne) {
                    return (lne) element;
                }
                return null;
            case 8:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 9:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 10:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 11:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 12:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 14:
                ((xhe0) obj).getClass();
                return Unit.f46060a;
            case 15:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 16:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                return th2.getCause();
            case 17:
                return String.valueOf(((Long) obj).longValue());
            case 18:
                return String.valueOf(((Long) obj).longValue());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(str.length() > 0);
            case 20:
                List<k2f> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (k2f k2fVar : list) {
                    if (k2fVar != null) {
                        if (k2fVar instanceof i2f) {
                            n2fVar = new m2f(((i2f) k2fVar).f14044a);
                        } else if (k2fVar instanceof j2f) {
                            n2fVar = new n2f(((j2f) k2fVar).f15777a);
                        }
                        arrayList.add(n2fVar);
                    }
                    t9f.b();
                    return null;
                }
                return arrayList;
            case 21:
                zvh0 zvh0Var = (zvh0) obj;
                zvh0Var.getClass();
                int iOrdinal = zvh0Var.ordinal();
                if (iOrdinal == 0) {
                    return axh0.f1625a;
                }
                if (iOrdinal == 1) {
                    return zwh0.f45106a;
                }
                if (iOrdinal == 2) {
                    return cxh0.f5122a;
                }
                if (iOrdinal == 3) {
                    return bxh0.f3376a;
                }
                t9f.b();
                return null;
            case 22:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 23:
                qu6 qu6Var = (qu6) obj;
                qu6Var.getClass();
                return String.valueOf(qu6Var.x);
            case 24:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                he70 he70Var = (he70) obj;
                he70Var.getClass();
                rdj rdjVar = rdj.f30294a;
                return kng0.l(rdj.h(new ynq0(he70Var.b), ykq0.UNIQUE_1, Boolean.TRUE, null, 248), Separators.SP, he70Var.f12908a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new rn5(cpVar, (byte) 22));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new rn5(cpVar2, (byte) 23));
                return Unit.f46060a;
            default:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new rn5(cpVar3, (byte) 24));
                return Unit.f46060a;
        }
    }
}
