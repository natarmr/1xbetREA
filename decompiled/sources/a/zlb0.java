package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrConfirmSecretQuestionScreen$1;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zlb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44572a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zlb0(Fragment fragment, nsi nsiVar, i3t0 i3t0Var) {
        this.f44572a = (byte) 21;
        this.d = fragment;
        this.b = nsiVar;
        this.c = i3t0Var;
    }

    private final Object a(Object obj) {
        PhoneStateModel phoneStateModel;
        dq00 dq00Var = (dq00) this.b;
        u0f0 u0f0Var = (u0f0) this.c;
        String str = (String) this.d;
        aye0 aye0Var = (aye0) obj;
        aye0Var.getClass();
        q1f0 q1f0Var = aye0Var.h;
        Map mapD = dq00.d(aye0Var, kotlin.collections.a.c(u0f0Var));
        vzg0 vzg0Var = (vzg0) dq00Var.b;
        int iOrdinal = u0f0Var.ordinal();
        if (iOrdinal == 0) {
            q1f0 q1f0VarA = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -4097, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA.m);
            return new Pair(q1f0VarA, mapD);
        }
        if (iOrdinal == 1) {
            q1f0 q1f0VarA2 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, str, false, false, false, null, null, null, false, false, null, null, false, false, null, -33554433, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA2.z);
            return new Pair(q1f0VarA2, mapD);
        }
        if (iOrdinal == 2) {
            q1f0 q1f0VarA3 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2049, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA3.l);
            return new Pair(q1f0VarA3, mapD);
        }
        if (iOrdinal == 7) {
            PhoneStateModel phoneStateModel2 = q1f0Var.r;
            if (phoneStateModel2 != null) {
                String str2 = phoneStateModel2.b;
                String str3 = phoneStateModel2.c;
                Integer num = phoneStateModel2.d;
                str.getClass();
                str2.getClass();
                str3.getClass();
                phoneStateModel = new PhoneStateModel(str, str2, str3, num);
            } else {
                phoneStateModel = null;
            }
            q1f0 q1f0VarA4 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -131073, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA4.r);
            return new Pair(q1f0VarA4, mapD);
        }
        if (iOrdinal == 13) {
            q1f0 q1f0VarA5 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -4194305, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA5.w);
            return new Pair(q1f0VarA5, mapD);
        }
        if (iOrdinal == 16) {
            q1f0 q1f0VarA6 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -32769, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA6.p);
            return new Pair(q1f0VarA6, mapD);
        }
        if (iOrdinal == 28) {
            q1f0 q1f0VarA7 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -8193, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA7.n);
            return new Pair(q1f0VarA7, mapD);
        }
        if (iOrdinal == 10) {
            q1f0 q1f0VarA8 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1025, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA8.k);
            return new Pair(q1f0VarA8, mapD);
        }
        if (iOrdinal == 11) {
            q1f0 q1f0VarA9 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -65537, 127);
            vzg0Var.e(u0f0Var.name(), q1f0VarA9.q);
            return new Pair(q1f0VarA9, mapD);
        }
        switch (iOrdinal) {
            case 18:
                q1f0 q1f0VarA10 = q1f0.a(q1f0Var, str, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2, 127);
                vzg0Var.e(u0f0Var.name(), q1f0VarA10.f27950a);
                return new Pair(q1f0VarA10, mapD);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                q1f0 q1f0VarA11 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -524289, 127);
                vzg0Var.e(u0f0Var.name(), q1f0VarA11.t);
                return new Pair(q1f0VarA11, mapD);
            case 20:
                q1f0 q1f0VarA12 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1048577, 127);
                vzg0Var.e(u0f0Var.name(), q1f0VarA12.u);
                return new Pair(q1f0VarA12, mapD);
            default:
                return new Pair(q1f0Var, aye0Var.f);
        }
    }

    private final Object b(Object obj) {
        org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel;
        g090 g090Var = (g090) this.b;
        u0f0 u0f0Var = (u0f0) this.c;
        String str = (String) this.d;
        u4f0 u4f0Var = (u4f0) obj;
        u4f0Var.getClass();
        r1f0 r1f0Var = u4f0Var.g;
        Map mapF = g090.f(u4f0Var, kotlin.collections.a.c(u0f0Var));
        vzg0 vzg0Var = (vzg0) g090Var.f10448a;
        int iOrdinal = u0f0Var.ordinal();
        if (iOrdinal == 0) {
            r1f0 r1f0VarA = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -4097, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA.m);
            return new Pair(r1f0VarA, mapF);
        }
        if (iOrdinal == 1) {
            r1f0 r1f0VarA2 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, str, false, false, false, null, null, null, false, null, null, null, false, false, null, -33554433, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA2.z);
            return new Pair(r1f0VarA2, mapF);
        }
        if (iOrdinal == 2) {
            r1f0 r1f0VarA3 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -2049, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA3.l);
            return new Pair(r1f0VarA3, mapF);
        }
        if (iOrdinal == 7) {
            org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel2 = r1f0Var.r;
            if (phoneStateModel2 != null) {
                String str2 = phoneStateModel2.b;
                String str3 = phoneStateModel2.c;
                str.getClass();
                str2.getClass();
                str3.getClass();
                phoneStateModel = new org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel(str, str2, str3);
            } else {
                phoneStateModel = null;
            }
            r1f0 r1f0VarA4 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -131073, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA4.r);
            return new Pair(r1f0VarA4, mapF);
        }
        if (iOrdinal == 13) {
            r1f0 r1f0VarA5 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -4194305, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA5.w);
            return new Pair(r1f0VarA5, mapF);
        }
        if (iOrdinal == 16) {
            r1f0 r1f0VarA6 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -32769, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA6.p);
            return new Pair(r1f0VarA6, mapF);
        }
        if (iOrdinal == 28) {
            r1f0 r1f0VarA7 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -8193, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA7.n);
            return new Pair(r1f0VarA7, mapF);
        }
        if (iOrdinal == 10) {
            r1f0 r1f0VarA8 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -1025, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA8.k);
            return new Pair(r1f0VarA8, mapF);
        }
        if (iOrdinal == 11) {
            r1f0 r1f0VarA9 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -65537, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA9.q);
            return new Pair(r1f0VarA9, mapF);
        }
        switch (iOrdinal) {
            case 18:
                r1f0 r1f0VarA10 = r1f0.a(r1f0Var, str, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -2, 127);
                vzg0Var.e(u0f0Var.name(), r1f0VarA10.f29678a);
                return new Pair(r1f0VarA10, mapF);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                r1f0 r1f0VarA11 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -524289, 127);
                vzg0Var.e(u0f0Var.name(), r1f0VarA11.t);
                return new Pair(r1f0VarA11, mapF);
            case 20:
                r1f0 r1f0VarA12 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -1048577, 127);
                vzg0Var.e(u0f0Var.name(), r1f0VarA12.u);
                return new Pair(r1f0VarA12, mapF);
            default:
                return new Pair(r1f0Var, u4f0Var.e);
        }
    }

    private final Object c(Object obj) {
        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel;
        j910 j910Var = (j910) this.b;
        u0f0 u0f0Var = (u0f0) this.c;
        String str = (String) this.d;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0Var = mbf0Var.g;
        Map mapE = j910.e(mbf0Var, kotlin.collections.a.c(u0f0Var));
        vzg0 vzg0Var = (vzg0) j910Var.b;
        int iOrdinal = u0f0Var.ordinal();
        if (iOrdinal == 0) {
            p1f0 p1f0VarA = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -4097, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA.m);
            return new Pair(p1f0VarA, mapE);
        }
        if (iOrdinal == 1) {
            p1f0 p1f0VarA2 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, str, false, false, false, null, null, null, false, false, null, null, false, false, null, -33554433, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA2.z);
            return new Pair(p1f0VarA2, mapE);
        }
        if (iOrdinal == 2) {
            p1f0 p1f0VarA3 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2049, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA3.l);
            return new Pair(p1f0VarA3, mapE);
        }
        if (iOrdinal == 7) {
            org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel2 = p1f0Var.r;
            if (phoneStateModel2 != null) {
                String str2 = phoneStateModel2.b;
                String str3 = phoneStateModel2.c;
                Integer num = phoneStateModel2.d;
                str.getClass();
                str2.getClass();
                str3.getClass();
                phoneStateModel = new org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel(str, str2, str3, num);
            } else {
                phoneStateModel = null;
            }
            p1f0 p1f0VarA4 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -131073, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA4.r);
            return new Pair(p1f0VarA4, mapE);
        }
        if (iOrdinal == 13) {
            p1f0 p1f0VarA5 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -4194305, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA5.w);
            return new Pair(p1f0VarA5, mapE);
        }
        if (iOrdinal == 16) {
            p1f0 p1f0VarA6 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -32769, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA6.p);
            return new Pair(p1f0VarA6, mapE);
        }
        if (iOrdinal == 28) {
            p1f0 p1f0VarA7 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -8193, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA7.n);
            return new Pair(p1f0VarA7, mapE);
        }
        if (iOrdinal == 10) {
            p1f0 p1f0VarA8 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1025, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA8.k);
            return new Pair(p1f0VarA8, mapE);
        }
        if (iOrdinal == 11) {
            p1f0 p1f0VarA9 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -65537, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA9.q);
            return new Pair(p1f0VarA9, mapE);
        }
        switch (iOrdinal) {
            case 18:
                p1f0 p1f0VarA10 = p1f0.a(p1f0Var, str, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2, 127);
                vzg0Var.e(u0f0Var.name(), p1f0VarA10.f26199a);
                return new Pair(p1f0VarA10, mapE);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p1f0 p1f0VarA11 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -524289, 127);
                vzg0Var.e(u0f0Var.name(), p1f0VarA11.t);
                return new Pair(p1f0VarA11, mapE);
            case 20:
                p1f0 p1f0VarA12 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1048577, 127);
                vzg0Var.e(u0f0Var.name(), p1f0VarA12.u);
                return new Pair(p1f0VarA12, mapE);
            default:
                return new Pair(p1f0Var, mbf0Var.e);
        }
    }

    private final Object g(Object obj) {
        byte b;
        ocf0 ocf0Var = (ocf0) this.b;
        qu4 qu4Var = (qu4) this.c;
        String str = (String) this.d;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        mi70 mi70Var = ocf0Var.k0;
        swp0 swp0Var = new swp0(qu4Var.f29330a, qu4Var.b, false);
        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel = ((mbf0) ocf0Var.D()).g.r;
        String str2 = phoneStateModel != null ? phoneStateModel.b : null;
        if (str2 == null) {
            str2 = "";
        }
        String strG0 = sj3.G0(str2);
        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel2 = ((mbf0) ocf0Var.D()).g.r;
        String str3 = phoneStateModel2 != null ? phoneStateModel2.f46866a : null;
        if (str3 == null) {
            str3 = "";
        }
        String strG1 = sj3.G0(str3);
        List list = qu4Var.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            obk0 obk0VarT = t9x.T((cl) it.next());
            if (obk0VarT != null) {
                arrayList.add(obk0VarT);
            }
        }
        List list2 = qu4Var.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            obk0 obk0VarT2 = t9x.T((cl) it2.next());
            if (obk0VarT2 != null) {
                arrayList2.add(obk0VarT2);
            }
        }
        q7f0 q7f0Var = ((mbf0) ocf0Var.D()).g.M;
        if (q7f0Var != null) {
            b = q7f0Var.f28247a;
        } else {
            gne0 gne0Var = q7f0.b;
            b = 1;
        }
        CountryStateModel countryStateModel = ((mbf0) ocf0Var.D()).g.g;
        long j = countryStateModel != null ? countryStateModel.f46863a : -1;
        CountryStateModel countryStateModel2 = ((mbf0) ocf0Var.D()).g.g;
        String str4 = countryStateModel2 != null ? countryStateModel2.b : null;
        if (str4 == null) {
            str4 = "";
        }
        CurrencyStateModel currencyStateModel = ((mbf0) ocf0Var.D()).g.h;
        String str5 = currencyStateModel != null ? currencyStateModel.b : null;
        if (str5 == null) {
            str5 = "";
        }
        BonusStateModel bonusStateModel = ((mbf0) ocf0Var.D()).g.c;
        String str6 = bonusStateModel != null ? bonusStateModel.b : null;
        String str7 = str6 == null ? "" : str6;
        String str8 = ((mbf0) ocf0Var.D()).g.u;
        String str9 = str8 == null ? "" : str8;
        CountryStateModel countryStateModel3 = ((mbf0) ocf0Var.D()).g.g;
        String str10 = countryStateModel3 != null ? countryStateModel3.e : null;
        zbi0 zbi0Var = new zbi0(str, swp0Var, arrayList, arrayList2, false, strG0, strG1, b, j, str4, str5, str7, str9, str10 == null ? "" : str10, ((mbf0) ocf0Var.D()).A.f4650a);
        mi70Var.getClass();
        k0w0Var.h(new SendConfirmationSMSScreen(zbi0Var));
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        Fragment fragment = (Fragment) this.d;
        nsi nsiVar = (nsi) this.b;
        i3t0 i3t0Var = (i3t0) this.c;
        ing0 ing0Var = (ing0) obj;
        ing0Var.getClass();
        if (ing0Var instanceof eng0) {
            String str = ((eng0) ing0Var).f8093a;
            Context contextD = fragment.D();
            if (contextD != null) {
                j120.c0(contextD, str);
            }
        } else if (ing0Var instanceof fng0) {
            fragment.w0(new Intent("android.intent.action.DIAL", ((fng0) ing0Var).f9836a));
        } else if (ing0Var instanceof gng0) {
            String str2 = ((gng0) ing0Var).f11585a;
            n6x.u0(fragment.n0(), nsiVar.i, str2);
        } else {
            if (!(ing0Var instanceof hng0)) {
                t9f.b();
                return null;
            }
            String str3 = ((hng0) ing0Var).f13351a;
            wdk0 wdk0Var = nsiVar.i;
            try {
                fragment.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str3)));
            } catch (Exception unused) {
                if (fragment.N()) {
                    rek0 rek0Var = rek0.b;
                    String strH = fragment.H(R.string.intent_app_not_installed);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), fragment, null, null, false, null, 1020);
                }
            }
        }
        i3t0Var.x(jlg0.f16716a);
        return Unit.f46060a;
    }

    private final Object i(Object obj) {
        List list = (List) this.b;
        Function0 function0 = (Function0) this.c;
        Function1 function1 = (Function1) this.d;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        hczVar.f(list.size(), null, new d1c0(list, (byte) 23), new ugd(2039820996, true, new gq4(list, (Object) list, (Object) function0, function1, (byte) 10)));
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        l7m0 l7m0Var = (l7m0) this.b;
        xcz xczVar = (xcz) this.c;
        Function1 function1 = (Function1) this.d;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        a4x a4xVar = (a4x) ((hgk0) l7m0Var).getValue();
        hczVar.f(a4xVar.size(), new pwe0(new x0h0((byte) 25), a4xVar, (byte) 18), new ubn(a4xVar, (byte) 28), new ugd(2039820996, true, new gq4((List) a4xVar, (Object) a4xVar, (Object) xczVar, function1, (byte) 11)));
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        a4x a4xVar = (a4x) this.b;
        d3i0 d3i0Var = (d3i0) this.c;
        Function1 function1 = (Function1) this.d;
        hcz hczVar = (hcz) obj;
        gle0 gle0Var = d3i0.n2;
        hczVar.getClass();
        eoh0 eoh0Var = new eoh0((byte) 12);
        eoh0 eoh0Var2 = new eoh0((byte) 11);
        hczVar.f(a4xVar.size(), new d1c0(xdx.E(a4xVar, eoh0Var), (byte) 25), new pwe0(eoh0Var2, a4xVar, (byte) 23), new ugd(-1311333631, true, new h8w((List) a4xVar, (Object) d3i0Var, function1, (byte) 22)));
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        boolean z;
        djz djzVar;
        cgx0 cgx0Var = (cgx0) this.b;
        w4i0 w4i0Var = (w4i0) this.c;
        hie0 hie0Var = (hie0) this.d;
        dpa0 dpa0Var = (dpa0) obj;
        long j = dpa0Var.c;
        k7q0 k7q0Var = (k7q0) cgx0Var.d;
        if (!k7q0Var.i() || k7q0Var.l().f440a.b.length() == 0 || (djzVar = k7q0Var.d) == null || djzVar.d() == null) {
            z = false;
        } else {
            cgx0Var.x(k7q0Var.l(), j, false, w4i0Var);
            z = true;
        }
        if (z) {
            dpa0Var.a();
            hie0Var.f13108a = true;
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj) {
        xxi0 xxi0Var = (xxi0) this.b;
        swp0 swp0Var = (swp0) this.c;
        hkd0 hkd0Var = (hkd0) this.d;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        nh70 nh70Var = xxi0Var.V;
        String str = hkd0Var.g;
        String strValueOf = String.valueOf(hkd0Var.c);
        nh70Var.getClass();
        strValueOf.getClass();
        k0w0Var.h(new QrAuthScreenFactoryImpl$qrConfirmSecretQuestionScreen$1(swp0Var, str, strValueOf));
        return Unit.f46060a;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r69) {
        /*
            Method dump skipped, instruction units count: 2934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zlb0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ zlb0(Object obj, Object obj2, Object obj3, byte b) {
        this.f44572a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
