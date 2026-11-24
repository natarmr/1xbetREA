package a;

import android.animation.Animator;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneGameView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33004a;

    public /* synthetic */ sy2(byte b) {
        this.f33004a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33004a) {
            case 0:
                iiy[] iiyVarArr = yai0.f42300a;
                zai0 zai0Var = xai0.y;
                Unit unit = Unit.f46060a;
                ((abi0) obj).b(zai0Var, unit);
                return unit;
            case 1:
                return AndroidExtensionsKt.bytesToUpperHexString$lambda$0(((Byte) obj).byteValue());
            case 2:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 3:
                iiy[] iiyVarArr2 = yai0.f42300a;
                zai0 zai0Var2 = xai0.x;
                Unit unit2 = Unit.f46060a;
                ((abi0) obj).b(zai0Var2, unit2);
                return unit2;
            case 4:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                k33 k33Var = (k33) obj;
                k33Var.getHandler().post(new fx2(k33Var.r, (byte) 4));
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                ((Animator) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((Animator) obj).getClass();
                return Unit.f46060a;
            case 14:
                ((Animator) obj).getClass();
                return Unit.f46060a;
            case 15:
                ((Animator) obj).getClass();
                return Unit.f46060a;
            case 16:
                return Boolean.valueOf(!(((f83) obj) instanceof eo80));
            case 17:
                s93 s93Var = (s93) obj;
                s93Var.getClass();
                return new db2(s93Var);
            case 18:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(((File) obj).isFile());
            case 20:
                bcy bcyVar = (bcy) obj;
                bcyVar.getClass();
                bcyVar.b = true;
                bcyVar.d = true;
                bcyVar.c = true;
                bcyVar.e = true;
                bcyVar.f2375a = true;
                return Unit.f46060a;
            case 21:
                jh3 jh3Var = (jh3) obj;
                jh3Var.getClass();
                return jh3Var.h;
            case 22:
                jh3 jh3Var2 = (jh3) obj;
                jh3Var2.getClass();
                return Boolean.valueOf(jh3Var2.k);
            case 23:
                jh3 jh3Var3 = (jh3) obj;
                jh3Var3.getClass();
                return new Pair(jh3Var3.b, jh3Var3.f);
            case 24:
                jh3 jh3Var4 = (jh3) obj;
                jh3Var4.getClass();
                return jh3Var4.g;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new j9(cpVar, (byte) 17));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                um3 um3Var = (um3) obj;
                um3Var.getClass();
                return new Pair(um3Var.f35902a, um3Var.d);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                um3 um3Var2 = (um3) obj;
                um3Var2.getClass();
                return Boolean.valueOf(um3Var2.n && um3Var2.o);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new j9(cpVar2, (byte) 18));
                return Unit.f46060a;
            default:
                ((Integer) obj).getClass();
                int i = AppleFortuneGameView.t;
                return Boolean.FALSE;
        }
    }
}
