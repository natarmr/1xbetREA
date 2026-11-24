package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.action.CyberActionDialogParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ntb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f24089a;

    public static final void A(mm40 mm40Var, q6n q6nVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-345703129);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(q6nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.g, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 56.0f);
            zfn zfnVar = m8m0.f21378a;
            long jM126getWhite200d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m126getWhite200d7_KjU();
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN2, jM126getWhite200d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            boolean zG = fetVar2.g(q6nVar.b);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.STATIC_WHITE60, w6n.g, q6nVar.b);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(true);
            mm40 mm40VarN3 = s5x0.N(new x7z(1.0f, true), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = q6nVar.f28207a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN3, jM123getWhite0d7_KjU, new n05(qmk.u, qmk.w, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, g1t0.p(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 18, i, mm40Var, q6nVar);
        }
    }

    public static final skm B(int i, int i2, fet fetVar) {
        zfn zfnVar = m8m0.f21378a;
        return new skm(i, i2, true, new y3d(((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU()), new y3d(((StaticColors) fetVar.k(zfnVar)).m73getBlack400d7_KjU()));
    }

    public static final void C(cp cpVar) {
        List list = u0d.f34849a;
        ImageView imageView = ((ith) cpVar.u).c;
        String str = ((kov) cpVar.u()).f18648a.f9902a;
        u0d.n(imageView, str, R.drawable.icon_globe_empty, 3);
    }

    public static final void D(cp cpVar) {
        List list = u0d.f34849a;
        ImageView imageView = ((ith) cpVar.u).d;
        String str = ((kov) cpVar.u()).c.f13412a;
        u0d.n(imageView, str, R.drawable.icon_globe_empty, 3);
    }

    public static int E(wcd wcdVar, wcd wcdVar2) {
        wcdVar2.getClass();
        long jG = wcdVar.g(wcdVar2);
        wen.b.getClass();
        return wen.c(jG, 0L);
    }

    public static final g0o F(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        zzn zznVar = new zzn(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) tx3.G(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            zznVar.j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) tx3.G(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    zznVar.k(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        g0o g0oVar = new g0o(str, enumArr);
        g0oVar.c = zznVar;
        return g0oVar;
    }

    public static e0u G(String str, String str2) {
        Exception excQ;
        str.getClass();
        try {
            rpu rpuVar = new rpu(new s((byte) 26), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excQ = feb.Q(new s((byte) 0), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excQ = feb.Q(new s((byte) 1), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excQ = feb.Q(new s((byte) 2), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excQ = feb.Q(new s((byte) 3), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excQ = feb.Q(new s((byte) 4), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excQ = feb.Q(new s((byte) 5), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excQ = feb.Q(new s((byte) 6), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excQ = feb.Q(new s((byte) 7), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excQ = feb.Q(new s((byte) 8), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excQ = feb.Q(new s((byte) 9), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excQ = feb.Q(new s((byte) 10), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excQ = feb.Q(new s((byte) 11), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excQ = feb.Q(new s((byte) 12), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excQ = feb.Q(new s((byte) 13), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excQ = feb.Q(new s((byte) 14), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excQ = feb.Q(new s((byte) 15), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excQ = feb.Q(new s((byte) 16), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excQ = feb.Q(new s((byte) 17), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excQ = feb.Q(new s((byte) 18), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excQ = feb.Q(new s((byte) 19), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excQ = feb.Q(new s((byte) 20), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excQ = feb.Q(new s((byte) 21), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excQ = feb.Q(new s((byte) 22), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excQ = feb.Q(new s((byte) 23), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excQ = feb.Q(new s((byte) 24), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excQ = feb.Q(new s((byte) 25), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excQ = feb.Q(new s((byte) 26), str2, rpuVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excQ = feb.Q(new s((byte) 27), str2, rpuVar);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new t7r();
                }
                excQ = feb.Q(new s((byte) 28), str2, rpuVar);
            }
            return (e0u) excQ;
        } catch (t7r unused) {
            return new d0u(str2, str);
        }
    }

    public static Object H(Collection collection, syh syhVar, dtb dtbVar) {
        if (collection == null) {
            a(4);
            throw null;
        }
        lrc lrcVar = new lrc();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            I(it.next(), syhVar, lrcVar, dtbVar);
        }
        return dtbVar.Q();
    }

    public static void I(Object obj, syh syhVar, lrc lrcVar, dtb dtbVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (((HashSet) lrcVar.b).add(obj) && dtbVar.y(obj)) {
            Iterator it = syhVar.h(obj).iterator();
            while (it.hasNext()) {
                I(it.next(), syhVar, lrcVar, dtbVar);
            }
            dtbVar.v(obj);
        }
    }

    public static final boolean J(Pair pair, int i) {
        return ((Calendar) pair.f46059a).get(i) == ((Calendar) pair.b).get(i);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object K(gmq gmqVar, yje yjeVar) {
        eoq eoqVar;
        mie0 mie0Var;
        t e;
        boq boqVar;
        if (yjeVar instanceof eoq) {
            eoqVar = (eoq) yjeVar;
            int i = eoqVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                eoqVar.l = i - Integer.MIN_VALUE;
            } else {
                eoqVar = new eoq(yjeVar);
            }
        } else {
            eoqVar = new eoq(yjeVar);
        }
        Object obj = eoqVar.k;
        Object obj2 = wne.f39444a;
        int i2 = eoqVar.l;
        pfw pfwVar = k860.f17859a;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            mie0VarJ.f21842a = pfwVar;
            boq boqVar2 = new boq(mie0VarJ, (byte) 0);
            try {
                eoqVar.i = mie0VarJ;
                eoqVar.j = boqVar2;
                eoqVar.l = 1;
                if (gmqVar.c(boqVar2, eoqVar) == obj2) {
                    return obj2;
                }
                mie0Var = mie0VarJ;
            } catch (t e2) {
                mie0Var = mie0VarJ;
                e = e2;
                boqVar = boqVar2;
                if (e.f33092a == boqVar) {
                    throw e;
                }
                zvw.O(eoqVar.getContext());
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boqVar = eoqVar.j;
            mie0Var = eoqVar.i;
            try {
                z1x.P(obj);
            } catch (t e3) {
                e = e3;
                if (e.f33092a == boqVar) {
                    throw e;
                }
                zvw.O(eoqVar.getContext());
            }
        }
        Object obj3 = mie0Var.f21842a;
        if (obj3 != pfwVar) {
            return obj3;
        }
        v4i0.o("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object L(gmq gmqVar, Function2 function2, yje yjeVar) {
        foq foqVar;
        mie0 mie0Var;
        t e;
        doq doqVar;
        if (yjeVar instanceof foq) {
            foqVar = (foq) yjeVar;
            int i = foqVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                foqVar.l = i - Integer.MIN_VALUE;
            } else {
                foqVar = new foq(yjeVar);
            }
        } else {
            foqVar = new foq(yjeVar);
        }
        Object obj = foqVar.k;
        Object obj2 = wne.f39444a;
        int i2 = foqVar.l;
        pfw pfwVar = k860.f17859a;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            mie0VarJ.f21842a = pfwVar;
            doq doqVar2 = new doq(function2, mie0VarJ, (byte) 0);
            try {
                foqVar.i = mie0VarJ;
                foqVar.j = doqVar2;
                foqVar.l = 1;
                if (gmqVar.c(doqVar2, foqVar) == obj2) {
                    return obj2;
                }
                mie0Var = mie0VarJ;
            } catch (t e2) {
                mie0Var = mie0VarJ;
                e = e2;
                doqVar = doqVar2;
                if (e.f33092a == doqVar) {
                    throw e;
                }
                zvw.O(foqVar.getContext());
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            doqVar = foqVar.j;
            mie0Var = foqVar.i;
            try {
                z1x.P(obj);
            } catch (t e3) {
                e = e3;
                if (e.f33092a == doqVar) {
                    throw e;
                }
                zvw.O(foqVar.getContext());
            }
        }
        Object obj3 = mie0Var.f21842a;
        if (obj3 != pfwVar) {
            return obj3;
        }
        v4i0.o("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object M(gmq gmqVar, yje yjeVar) {
        hoq hoqVar;
        mie0 mie0Var;
        t e;
        boq boqVar;
        if (yjeVar instanceof hoq) {
            hoqVar = (hoq) yjeVar;
            int i = hoqVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoqVar.l = i - Integer.MIN_VALUE;
            } else {
                hoqVar = new hoq(yjeVar);
            }
        } else {
            hoqVar = new hoq(yjeVar);
        }
        Object obj = hoqVar.k;
        Object obj2 = wne.f39444a;
        int i2 = hoqVar.l;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            boq boqVar2 = new boq(mie0VarJ, (byte) 1);
            try {
                hoqVar.i = mie0VarJ;
                hoqVar.j = boqVar2;
                hoqVar.l = 1;
                if (gmqVar.c(boqVar2, hoqVar) == obj2) {
                    return obj2;
                }
                mie0Var = mie0VarJ;
            } catch (t e2) {
                mie0Var = mie0VarJ;
                e = e2;
                boqVar = boqVar2;
                if (e.f33092a == boqVar) {
                    throw e;
                }
                zvw.O(hoqVar.getContext());
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boqVar = hoqVar.j;
            mie0Var = hoqVar.i;
            try {
                z1x.P(obj);
            } catch (t e3) {
                e = e3;
                if (e.f33092a == boqVar) {
                    throw e;
                }
                zvw.O(hoqVar.getContext());
            }
        }
        return mie0Var.f21842a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object N(gmq gmqVar, Function2 function2, zje zjeVar) {
        ioq ioqVar;
        mie0 mie0Var;
        t e;
        doq doqVar;
        if (zjeVar instanceof ioq) {
            ioqVar = (ioq) zjeVar;
            int i = ioqVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ioqVar.l = i - Integer.MIN_VALUE;
            } else {
                ioqVar = new ioq(zjeVar);
            }
        } else {
            ioqVar = new ioq(zjeVar);
        }
        Object obj = ioqVar.k;
        Object obj2 = wne.f39444a;
        int i2 = ioqVar.l;
        byte b = 1;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            doq doqVar2 = new doq(function2, mie0VarJ, b);
            try {
                ioqVar.i = mie0VarJ;
                ioqVar.j = doqVar2;
                ioqVar.l = 1;
                if (gmqVar.c(doqVar2, ioqVar) == obj2) {
                    return obj2;
                }
                mie0Var = mie0VarJ;
            } catch (t e2) {
                mie0Var = mie0VarJ;
                e = e2;
                doqVar = doqVar2;
                if (e.f33092a == doqVar) {
                    throw e;
                }
                zvw.O(ioqVar.getContext());
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            doqVar = ioqVar.j;
            mie0Var = ioqVar.i;
            try {
                z1x.P(obj);
            } catch (t e3) {
                e = e3;
                if (e.f33092a == doqVar) {
                    throw e;
                }
                zvw.O(ioqVar.getContext());
            }
        }
        return mie0Var.f21842a;
    }

    public static String O(String str, double d) {
        String str2;
        if (Math.signum(d) < 0.0d) {
            str2 = "-";
        } else {
            str2 = Math.signum(d) > 0.0d ? "+" : "";
        }
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(Math.abs(d), p3u0.c);
        return (!cy7.c() || str.equals("A$")) ? str2.concat(strC) : "\u200e".concat(str2.concat(CollectionsKt.b0(CollectionsKt.t0(StringsKt__StringsKt.split$default(strC, new String[]{Separators.SP}, false, 0, 6, null)), Separators.SP, null, null, null, 62)));
    }

    public static final String P(String str, String str2, boolean z) {
        List listT0;
        if (!cy7.c() || !z) {
            String strL = str2 != null ? kng0.l(Separators.LPAREN, str2, " ov)") : null;
            return ohs0.n(str, strL != null ? strL : "");
        }
        String strL2 = str2 != null ? kng0.l("(ov ", str2, Separators.RPAREN) : null;
        String str3 = strL2 != null ? strL2 : "";
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{" & "}, false, 0, 6, null);
        List list = listSplit$default.size() == 2 ? listSplit$default : null;
        if (list != null && (listT0 = CollectionsKt.t0(list)) != null) {
            str = CollectionsKt.b0(listT0, " & ", null, null, null, 62);
        }
        return kng0.k(str3, str);
    }

    public static final Date Q(Date date) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    public static final String R(f9h0 f9h0Var, ctf0 ctf0Var) {
        if (f9h0Var instanceof d8h0) {
            return ctf0Var.b.a(((d8h0) f9h0Var).b ? R.string.top_champs : R.string.champs, Arrays.copyOf(new Object[0], 0));
        }
        if (f9h0Var instanceof y8h0) {
            return ctf0Var.b.a(R.string.kind_sports, Arrays.copyOf(new Object[0], 0));
        }
        if (f9h0Var instanceof z8h0) {
            return ctf0Var.b.a(R.string.bets_on_yours, Arrays.copyOf(new Object[0], 0));
        }
        if (f9h0Var instanceof m8h0) {
            String str = ((m8h0) f9h0Var).f21370a;
            return StringsKt.W(str) ? ctf0Var.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0)) : str;
        }
        if (f9h0Var instanceof p8h0) {
            return ((p8h0) f9h0Var).c;
        }
        t9f.b();
        return null;
    }

    public static final void S(Fragment fragment, wus wusVar, xi70 xi70Var, wdk0 wdk0Var, Function1 function1) {
        fragment.getClass();
        xi70Var.getClass();
        if (!(wusVar instanceof tus)) {
            if (wusVar instanceof uus) {
                androidx.fragment.app.e eVarC = fragment.C();
                eVarC.getClass();
                xi70.h(eVarC);
                return;
            } else {
                if (wusVar instanceof vus) {
                    qek0 qek0Var = qek0.f28589a;
                    String strH = fragment.H(R.string.one_click_bet_disabled_message);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), fragment, null, null, false, null, 1020);
                    return;
                }
                if (wusVar instanceof sus) {
                    function1.invoke(mus.f22427a);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
        }
        tus tusVar = (tus) wusVar;
        long j = tusVar.h;
        long j2 = tusVar.i;
        boolean z = tusVar.j;
        long j3 = tusVar.f34565a;
        long j4 = tusVar.b;
        boolean z2 = tusVar.k;
        CyberActionDialogParams cyberActionDialogParams = new CyberActionDialogParams(tusVar.n, j, j2, j3, j4, tusVar.l, tusVar.m, tusVar.o, tusVar.c, tusVar.g, tusVar.p, tusVar.d, tusVar.e, z, z2, tusVar.f);
        usd usdVar = o0g.k2;
        androidx.fragment.app.e eVarC2 = fragment.C();
        eVarC2.getClass();
        usdVar.getClass();
        String str = o0g.m2;
        Fragment fragmentJ = eVarC2.J(str);
        if ((fragmentJ instanceof o0g ? (o0g) fragmentJ : null) != null) {
            return;
        }
        o0g o0gVar = new o0g();
        o0gVar.j2.J(o0gVar, o0g.l2[1], cyberActionDialogParams);
        o0gVar.H0(eVarC2, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean T(List list, syh syhVar, Function1 function1) {
        if (list != null) {
            return (Boolean) H(list, syhVar, new ryh(function1, new boolean[1], (byte) 0));
        }
        a(7);
        throw null;
    }

    public static final boolean U(Date date) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return J(new Pair(calendar2, calendar), 1);
    }

    public static final boolean V(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        Pair pair = new Pair(calendar, calendar2);
        return J(pair, 1) && J(pair, 2) && J(pair, 5);
    }

    public static final boolean W(Date date) {
        date.getClass();
        return V(date, new Date());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object X(gmq gmqVar, zje zjeVar) {
        joq joqVar;
        mie0 mie0Var;
        if (zjeVar instanceof joq) {
            joqVar = (joq) zjeVar;
            int i = joqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                joqVar.k = i - Integer.MIN_VALUE;
            } else {
                joqVar = new joq(zjeVar);
            }
        } else {
            joqVar = new joq(zjeVar);
        }
        Object obj = joqVar.j;
        Object obj2 = wne.f39444a;
        int i2 = joqVar.k;
        pfw pfwVar = k860.f17859a;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            mie0VarJ.f21842a = pfwVar;
            kmq boqVar = new boq(mie0VarJ, (byte) 2);
            joqVar.i = mie0VarJ;
            joqVar.k = 1;
            if (gmqVar.c(boqVar, joqVar) == obj2) {
                return obj2;
            }
            mie0Var = mie0VarJ;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = joqVar.i;
            z1x.P(obj);
        }
        Object obj3 = mie0Var.f21842a;
        if (obj3 != pfwVar) {
            return obj3;
        }
        v4i0.o("Expected at least one element");
        return null;
    }

    public static final boolean Y(String str) {
        str.getClass();
        return str.length() < 3;
    }

    public static final String Z(d3h0 d3h0Var, boolean z) {
        if (d3h0Var instanceof lz10) {
            lz10 lz10Var = (lz10) d3h0Var;
            return P(lz10Var.g, lz10Var.j, z);
        }
        if (!(d3h0Var instanceof hzm0)) {
            return d3h0Var.a();
        }
        hzm0 hzm0Var = (hzm0) d3h0Var;
        return P(hzm0Var.g, hzm0Var.i, z);
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final String a0(d3h0 d3h0Var, boolean z) {
        if (d3h0Var instanceof lz10) {
            lz10 lz10Var = (lz10) d3h0Var;
            return P(lz10Var.h, lz10Var.k, z);
        }
        if (!(d3h0Var instanceof hzm0)) {
            return d3h0Var.b();
        }
        hzm0 hzm0Var = (hzm0) d3h0Var;
        return P(hzm0Var.h, hzm0Var.j, z);
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1009488697);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 6.0f), 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40.b, 6.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), vgg0.a(3.0f));
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 19);
        }
    }

    public static final v5l b0(y5l y5lVar) {
        y5lVar.getClass();
        String str = y5lVar.f42053a;
        if (str == null) {
            str = "";
        }
        Integer num = y5lVar.b;
        int iIntValue = num != null ? num.intValue() : 0;
        String str2 = y5lVar.c;
        if (str2 == null) {
            str2 = "";
        }
        String strE = lmc.E(y5lVar.d);
        Long l = y5lVar.e;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str3 = y5lVar.f;
        return new v5l(str, iIntValue, str2, strE, jLongValue, str3 != null ? str3 : "", lmc.E(y5lVar.g));
    }

    public static final void c(mm40 mm40Var, q6n q6nVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1192856777);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(q6nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            mm40 mm40VarX = yyw.X(i120.Q(mm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), null, fetVar, 1);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarX);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            pz40 pz40Var = s6t0.f31722a;
            ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
            plm plmVar = new plm(q6nVar.f28207a, s6t0.b().f33626a.getSecondary(), fa50.f9191a);
            boolean z = q6nVar.d;
            int i3 = q6nVar.e ? R.drawable.ic_glyph_notification_active : R.drawable.ic_glyph_notification_inactive;
            long secondary = s6t0.b().f33626a.getSecondary();
            ra50 ra50Var = ra50.f30118a;
            imm immVar = new imm(ilmVar, plmVar, new dmm(new va50(new wkm(0, i3, true, ra50Var, secondary), new wkm(1, z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, true, ra50Var, s6t0.b().f33626a.getSecondary()))), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ylm(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new btm(function1, b);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6n(mm40Var, q6nVar, function1, i, (byte) 0);
        }
    }

    public static final mim0 c0(long j, cys0 cys0Var, kbo kboVar, v5l0 v5l0Var, pim0 pim0Var) {
        xim0 vim0Var;
        zjm0 xjm0Var;
        sjm0 qjm0Var;
        ljm0 jjm0Var;
        ejm0 cjm0Var;
        String str = kboVar.f;
        String str2 = kboVar.c;
        String str3 = kboVar.e;
        String str4 = kboVar.f18023a;
        String str5 = kboVar.d;
        String str6 = kboVar.b;
        String str7 = kboVar.k;
        String str8 = kboVar.j;
        boolean z = kboVar.n;
        long j2 = kboVar.l;
        cys0Var.getClass();
        v5l0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = cys0Var.ordinal();
            opm opmVar = opm.f25648a;
            switch (iOrdinal2) {
                case 0:
                    String strP = idm0.p(z, j2);
                    String str9 = kboVar.f18023a;
                    String str10 = kboVar.c;
                    c280 c280Var = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var2 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    lpm lpmVar = new lpm(opmVar, new hpm(0L, 3));
                    x0m x0mVar = x0m.f40076a;
                    vim0Var = new vim0(str9, str10, c280Var, c280Var2, lpmVar, strP, str8, str7);
                    break;
                case 1:
                    String strP2 = idm0.p(z, j2);
                    String str11 = kboVar.f18023a;
                    String str12 = kboVar.c;
                    c280 c280Var3 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var4 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    lpm lpmVar2 = new lpm(opmVar, new hpm(0L, 3));
                    x0m x0mVar2 = x0m.f40076a;
                    vim0Var = new sim0(str11, str12, c280Var3, c280Var4, lpmVar2, strP2, str8, str7);
                    break;
                case 2:
                    vim0Var = new wim0(new r3i(str4, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str3, R.drawable.ic_glyph_placeholder_player)), new r3i(str2, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player)), kboVar.i ? p3i.f26301a : new o3i(kboVar.g, kboVar.h), idm0.p(z, j2), str8, str7);
                    break;
                case 3:
                    String strP3 = idm0.p(z, j2);
                    String str13 = kboVar.f18023a;
                    String str14 = kboVar.c;
                    c280 c280Var5 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var6 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    lpm lpmVar3 = new lpm(opmVar, new hpm(0L, 3));
                    x0m x0mVar3 = x0m.f40076a;
                    vim0Var = new rim0(str13, str14, c280Var5, c280Var6, lpmVar3, strP3, str8, str7);
                    break;
                case 4:
                    String strP4 = idm0.p(z, j2);
                    String str15 = kboVar.f18023a;
                    String str16 = kboVar.c;
                    c280 c280Var7 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var8 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    lpm lpmVar4 = new lpm(opmVar, new hpm(0L, 3));
                    x0m x0mVar4 = x0m.f40076a;
                    vim0Var = new uim0(str15, str16, c280Var7, c280Var8, lpmVar4, strP4, str8, str7);
                    break;
                case 5:
                    vim0Var = new tim0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z, j2), str8, str7);
                    break;
                case 6:
                    vim0Var = null;
                    break;
                default:
                    t9f.b();
                    return null;
            }
            return vim0Var != null ? new thm0(j, vim0Var, pim0Var) : new shm0();
        }
        if (iOrdinal == 1) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP5 = idm0.p(z, j2);
                    String str17 = kboVar.f18023a;
                    String str18 = kboVar.c;
                    x0m x0mVar5 = x0m.f40076a;
                    xjm0Var = new xjm0(str17, str18, strP5, str8, str7);
                    break;
                case 1:
                    String strP6 = idm0.p(z, j2);
                    String str19 = kboVar.f18023a;
                    String str20 = kboVar.c;
                    x0m x0mVar6 = x0m.f40076a;
                    xjm0Var = new ujm0(str19, str20, strP6, str8, str7);
                    break;
                case 2:
                    String strP7 = idm0.p(z, j2);
                    String str21 = kboVar.f18023a;
                    String str22 = kboVar.c;
                    x0m x0mVar7 = x0m.f40076a;
                    xjm0Var = new yjm0(str21, str22, strP7, str8, str7);
                    break;
                case 3:
                    String strP8 = idm0.p(z, j2);
                    String str23 = kboVar.f18023a;
                    String str24 = kboVar.c;
                    x0m x0mVar8 = x0m.f40076a;
                    xjm0Var = new tjm0(str23, str24, strP8, str8, str7);
                    break;
                case 4:
                    String strP9 = idm0.p(z, j2);
                    String str25 = kboVar.f18023a;
                    String str26 = kboVar.c;
                    x0m x0mVar9 = x0m.f40076a;
                    xjm0Var = new wjm0(str25, str26, strP9, str8, str7);
                    break;
                case 5:
                    xjm0Var = new vjm0(jwb.L(kboVar), idm0.p(z, j2), str8, str7);
                    break;
                case 6:
                    xjm0Var = null;
                    break;
                default:
                    t9f.b();
                    return null;
            }
            return xjm0Var != null ? new xhm0(j, xjm0Var, pim0Var) : new shm0();
        }
        if (iOrdinal == 2) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP10 = idm0.p(z, j2);
                    String str27 = kboVar.f18023a;
                    String str28 = kboVar.c;
                    c280 c280Var9 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var10 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    x0m x0mVar10 = x0m.f40076a;
                    qjm0Var = new qjm0(str27, str28, c280Var9, c280Var10, strP10, str8, str7);
                    break;
                case 1:
                    String strP11 = idm0.p(z, j2);
                    String str29 = kboVar.f18023a;
                    String str30 = kboVar.c;
                    c280 c280Var11 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var12 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    x0m x0mVar11 = x0m.f40076a;
                    qjm0Var = new njm0(str29, str30, c280Var11, c280Var12, strP11, str8, str7);
                    break;
                case 2:
                    String strP12 = idm0.p(z, j2);
                    String str31 = kboVar.f18023a;
                    String str32 = kboVar.c;
                    x0m x0mVar12 = x0m.f40076a;
                    qjm0Var = new rjm0(str31, str32, strP12, str8, str7);
                    break;
                case 3:
                    String strP13 = idm0.p(z, j2);
                    String str33 = kboVar.f18023a;
                    String str34 = kboVar.c;
                    c280 c280Var13 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var14 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    x0m x0mVar13 = x0m.f40076a;
                    qjm0Var = new mjm0(str33, str34, c280Var13, c280Var14, strP13, str8, str7);
                    break;
                case 4:
                    String strP14 = idm0.p(z, j2);
                    String str35 = kboVar.f18023a;
                    String str36 = kboVar.c;
                    c280 c280Var15 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var16 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    x0m x0mVar14 = x0m.f40076a;
                    qjm0Var = new pjm0(str35, str36, c280Var15, c280Var16, strP14, str8, str7);
                    break;
                case 5:
                    qjm0Var = new ojm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z, j2), str8, str7);
                    break;
                case 6:
                    qjm0Var = null;
                    break;
                default:
                    t9f.b();
                    return null;
            }
            return qjm0Var != null ? new whm0(j, qjm0Var, pim0Var) : new shm0();
        }
        c2m c2mVar = c2m.f3631a;
        b2m b2mVar = b2m.f1858a;
        if (iOrdinal == 3) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP15 = idm0.p(z, j2);
                    String str37 = kboVar.f18023a;
                    String str38 = kboVar.c;
                    c280 c280Var17 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var18 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    z1m z1mVar = new z1m(c2mVar);
                    x0m x0mVar15 = x0m.f40076a;
                    jjm0Var = new jjm0(str37, str38, c280Var17, c280Var18, z1mVar, strP15, str8, str7);
                    break;
                case 1:
                    String strP16 = idm0.p(z, j2);
                    String str39 = kboVar.f18023a;
                    String str40 = kboVar.c;
                    c280 c280Var19 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var20 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    z1m z1mVar2 = new z1m(b2mVar);
                    x0m x0mVar16 = x0m.f40076a;
                    jjm0Var = new gjm0(str39, str40, c280Var19, c280Var20, z1mVar2, strP16, str8, str7);
                    break;
                case 2:
                    jjm0Var = new kjm0(new bzm(str4, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str3, R.drawable.ic_glyph_placeholder_player)), new bzm(str2, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player)), idm0.p(z, j2), str8, str7);
                    break;
                case 3:
                    String strP17 = idm0.p(z, j2);
                    String str41 = kboVar.f18023a;
                    String str42 = kboVar.c;
                    c280 c280Var21 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var22 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    z1m z1mVar3 = new z1m(b2mVar);
                    x0m x0mVar17 = x0m.f40076a;
                    jjm0Var = new fjm0(str41, str42, c280Var21, c280Var22, z1mVar3, strP17, str8, str7);
                    break;
                case 4:
                    String strP18 = idm0.p(z, j2);
                    String str43 = kboVar.f18023a;
                    String str44 = kboVar.c;
                    c280 c280Var23 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    c280 c280Var24 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    z1m z1mVar4 = new z1m(b2mVar);
                    x0m x0mVar18 = x0m.f40076a;
                    jjm0Var = new ijm0(str43, str44, c280Var23, c280Var24, z1mVar4, strP18, str8, str7);
                    break;
                case 5:
                    jjm0Var = new hjm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z, j2), str8, str7);
                    break;
                case 6:
                    jjm0Var = null;
                    break;
                default:
                    t9f.b();
                    return null;
            }
            return jjm0Var != null ? new vhm0(j, jjm0Var, pim0Var) : new shm0();
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        switch (cys0Var.ordinal()) {
            case 0:
                String strP19 = idm0.p(z, j2);
                String str45 = kboVar.f18023a;
                String str46 = kboVar.c;
                c280 c280Var25 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                c280 c280Var26 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                z1m z1mVar5 = new z1m(c2mVar);
                x0m x0mVar19 = x0m.f40076a;
                cjm0Var = new cjm0(str45, str46, c280Var25, c280Var26, z1mVar5, strP19, str8, str7);
                break;
            case 1:
                String strP20 = idm0.p(z, j2);
                String str47 = kboVar.f18023a;
                String str48 = kboVar.c;
                c280 c280Var27 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                c280 c280Var28 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                z1m z1mVar6 = new z1m(b2mVar);
                x0m x0mVar20 = x0m.f40076a;
                cjm0Var = new zim0(str47, str48, c280Var27, c280Var28, z1mVar6, strP20, str8, str7);
                break;
            case 2:
                cjm0Var = new djm0(new bzm(str4, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str3, R.drawable.ic_glyph_placeholder_player)), new bzm(str2, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player)), idm0.p(z, j2), str8, str7);
                break;
            case 3:
                String strP21 = idm0.p(z, j2);
                String str49 = kboVar.f18023a;
                String str50 = kboVar.c;
                c280 c280Var29 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                c280 c280Var30 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                z1m z1mVar7 = new z1m(b2mVar);
                x0m x0mVar21 = x0m.f40076a;
                cjm0Var = new yim0(str49, str50, c280Var29, c280Var30, z1mVar7, strP21, str8, str7);
                break;
            case 4:
                String strP22 = idm0.p(z, j2);
                String str51 = kboVar.f18023a;
                String str52 = kboVar.c;
                c280 c280Var31 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                c280 c280Var32 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                z1m z1mVar8 = new z1m(b2mVar);
                x0m x0mVar22 = x0m.f40076a;
                cjm0Var = new bjm0(str51, str52, c280Var31, c280Var32, z1mVar8, strP22, str8, str7);
                break;
            case 5:
                cjm0Var = new ajm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z, j2), str8, str7);
                break;
            case 6:
                cjm0Var = null;
                break;
            default:
                t9f.b();
                return null;
        }
        return cjm0Var != null ? new uhm0(j, cjm0Var, pim0Var) : new shm0();
    }

    public static final void d(mm40 mm40Var, l7m0 l7m0Var, float f, f3d f3dVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(566399964);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(f3dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function2 = function1;
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        } else {
            function2 = function1;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 7168;
            boolean z = ((i2 & 896) == 256) | (i3 == 2048);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new q82(f3dVar, f);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new s82(f3dVar, b);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj) {
                objP3 = new sd8(f3dVar, (byte) 12);
                fetVar.o0(objP3);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP3);
            boolean zG = fetVar.g(l7m0VarY);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new x1d(l7m0VarY, (byte) 0);
                fetVar.o0(objP4);
            }
            mm40 mm40VarT = i4w0.T(mm40VarQ, (Function1) objP4);
            boolean zG2 = fetVar.g(l7m0VarY);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == obj) {
                objP5 = new x1d(l7m0VarY, b);
                fetVar.o0(objP5);
            }
            mm40 mm40VarL = rq8.L(mm40VarT, (Function1) objP5);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            hyl hylVar = (hyl) l7m0Var.getValue();
            if (hylVar == null) {
                fetVar.e0(1347546607);
                fetVar.r(false);
            } else {
                fetVar.e0(1347546608);
                boolean zG3 = fetVar.g(l7m0VarY);
                Object objP6 = fetVar.P();
                if (zG3 || objP6 == obj) {
                    objP6 = new x1d(l7m0VarY, (byte) 2);
                    fetVar.o0(objP6);
                }
                ebc.r(i4w0.T(jm40.b, (Function1) objP6), hylVar, (vxl) l7m0VarY2.getValue(), function2, null, fetVar, i2 & 57344, 40);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, l7m0Var, f, f3dVar, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d0(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, yje yjeVar) throws Throwable {
        mtb mtbVar;
        Object objC;
        Object objInvoke;
        if (yjeVar instanceof mtb) {
            mtbVar = (mtb) yjeVar;
            int i = mtbVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtbVar.n = i - Integer.MIN_VALUE;
            } else {
                mtbVar = new mtb(yjeVar);
            }
        } else {
            mtbVar = new mtb(yjeVar);
        }
        Object obj3 = mtbVar.m;
        Object obj4 = wne.f39444a;
        int i2 = mtbVar.n;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj5 = mtbVar.l;
            CoroutineContext coroutineContext2 = mtbVar.k;
            try {
                z1x.P(obj3);
                objC = obj5;
                coroutineContext = coroutineContext2;
                ecq0.a(coroutineContext, objC);
                return obj3;
            } catch (Throwable th) {
                objC = obj5;
                coroutineContext = coroutineContext2;
                th = th;
                ecq0.a(coroutineContext, objC);
                throw th;
            }
        }
        z1x.P(obj3);
        objC = ecq0.c(coroutineContext, obj2);
        try {
            mtbVar.i = coroutineContext;
            mtbVar.j = obj;
            mtbVar.k = coroutineContext;
            mtbVar.l = objC;
            mtbVar.n = 1;
            xul0 xul0Var = new xul0(mtbVar, coroutineContext);
            if (function2 == null) {
                objInvoke = pnx.c(function2, obj, xul0Var);
            } else {
                zys0.e(2, function2);
                objInvoke = function2.invoke(obj, xul0Var);
            }
            obj3 = objInvoke;
            if (obj3 == obj4) {
                return obj4;
            }
            ecq0.a(coroutineContext, objC);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            ecq0.a(coroutineContext, objC);
            throw th;
        }
    }

    public static final void e(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1235889350);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var2 = mm40Var;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 44.0f, 4.0f);
            long separator = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarP, separator, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40Var = mm40Var2;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 5);
        }
    }

    public static final Exception e0(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            tjo.a(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new xmk(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final void f(int i, fet fetVar) {
        fetVar.g0(-1515690156);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 128.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 22);
        }
    }

    public static final void g(mm40 mm40Var, gol golVar, sh1 sh1Var, Function0 function0, Function1 function1, fet fetVar, int i) {
        int i2;
        golVar.getClass();
        fetVar.g0(-337496570);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(golVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(sh1Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (golVar instanceof eol) {
            fetVar.e0(158494882);
            int iOrdinal = sh1Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(158622292);
                j(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(158919954);
                h(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw b1j.f(2083322720, fetVar, false);
                }
                fetVar.e0(158622292);
                j(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else {
                fetVar.e0(159220003);
                l(mm40Var, (eol) golVar, function1, fetVar, ((i2 >> 6) & 896) | (i2 & 126));
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!golVar.equals(fol.f9886a)) {
                throw b1j.f(2083320801, fetVar, false);
            }
            fetVar.e0(159567916);
            int iOrdinal2 = sh1Var.ordinal();
            if (iOrdinal2 == 0) {
                fetVar.e0(159703634);
                k(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 == 1) {
                fetVar.e0(159876304);
                i(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    throw b1j.f(2083357334, fetVar, false);
                }
                fetVar.e0(159703634);
                k(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                fetVar.e0(160050865);
                m(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnl(mm40Var, golVar, sh1Var, function0, function1, i, (byte) 1);
        }
    }

    public static final void h(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(665035464);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarE0 = o2e.e0(mm40Var, "AggregatorProviderImage");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40VarE0, 128.0f), 72.0f);
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new tnl(eolVar, pz40Var, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE, false, (Function1) objP2);
            boolean z2 = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new b1i(function0, (byte) 27);
                fetVar.o0(objP3);
            }
            mm40 mm40VarJ = lgb.J(s5x0.J(i120.Q(lgb.J(y860.W(mm40VarA, null, null, false, null, (Function0) objP3, 28), vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f), vgg0.a(8.0f));
            n0x n0xVar = eolVar.b;
            o0x o0xVar = eolVar.g;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new cml(pz40Var, (byte) 6);
                fetVar.o0(objP4);
            }
            Function0 function1 = (Function0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 7);
                fetVar.o0(objP5);
            }
            j0x.b(lv00.T(n0xVar, o0xVar, function1, (Function0) objP5, fetVar, 3456, 0), null, mm40VarJ, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar, function0, i, (byte) 3);
        }
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-698668080);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 128.0f), 72.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 9);
        }
    }

    public static final void j(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(659398262);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        int i3 = i2;
        byte b = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean z = (i3 & 896) == 256;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new b1i(function0, (byte) 28);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40Var2, null, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(mm40VarW, vgg0.a(16.0f)), afn0.m(fetVar2).getBackgroundContent(), jd8.n), 4.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = ny9.O(2.0f, o2e.e0(jm40Var, "AggregatorProviderImage"), false);
            boolean z3 = (i3 & 112) == 32;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new tnl(eolVar, pz40Var, b);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarJ2 = lgb.J(pai0.a(mm40VarO, false, (Function1) objP3), vgg0.a(12.0f));
            n0x n0xVar = eolVar.b;
            o0x o0xVar = eolVar.g;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new cml(pz40Var, (byte) 2);
                fetVar2.o0(objP4);
            }
            Function0 function1 = (Function0) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 3);
                fetVar2.o0(objP5);
            }
            j0x.b(lv00.T(n0xVar, o0xVar, function1, (Function0) objP5, fetVar2, 3456, 0), null, mm40VarJ2, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            mm40 mm40VarL = s5x0.L(i120.Q(o7k0.e(o7k0.d(jm40Var, 1.0f), 40.0f), afn0.m(fetVar).getBackground(), vgg0.a(12.0f)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_cards, 0, fetVar), null, s5x0.J(i120.Q(o7k0.n(jm40Var, 24.0f), afn0.m(fetVar).getBackgroundContent(), vgg0.f37379a), 4.0f), afn0.m(fetVar).getSecondary(), fetVar, 56, 0);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), true);
            String str = eolVar.f;
            afn0.v(fetVar).getClass();
            v8q0.a(str, mm40VarH, afn0.m(fetVar).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 44.0f, 1);
            String strL = ttm0.L(4, eolVar.e);
            afn0.v(fetVar).getClass();
            v8q0.a(strL, mm40VarU, afn0.m(fetVar).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.j(), fetVar, 0, 24576, 114680);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar, function0, i, (byte) 2);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-2124828446);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thd((byte) 14);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarQ), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 10);
        }
    }

    public static final void l(mm40 mm40Var, eol eolVar, Function1 function1, fet fetVar, int i) {
        int i2;
        h4d h4dVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(45198620);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new nk1(function1, eolVar, b);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(mm40VarW, vgg0.a(16.0f)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 4.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarQ = ffb0.Q(new wkw(gqw0.o), 4.0f, -4.0f);
            boolean z2 = eolVar.c;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ynk(function1, (byte) 16);
                fetVar2.o0(objP3);
            }
            f7k.k(mm40VarQ, tc00.f33696a, z2, false, (Function1) objP3, fetVar, 48, 8);
            mm40 mm40VarO = ny9.O(2.0f, o2e.e0(jm40.b, "AggregatorProviderImage"), false);
            boolean z4 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new tnl(eolVar, pz40Var, (byte) 1);
                fetVar.o0(objP4);
            }
            mm40 mm40VarJ2 = lgb.J(pai0.a(mm40VarO, false, (Function1) objP4), vgg0.a(12.0f));
            n0x n0xVar = eolVar.b;
            o0x o0xVar = eolVar.g;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 4);
                fetVar.o0(objP5);
            }
            Function0 function0 = (Function0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = new cml(pz40Var, (byte) 5);
                fetVar.o0(objP6);
            }
            mz3 mz3VarT = lv00.T(n0xVar, o0xVar, function0, (Function0) objP6, fetVar, 3456, 0);
            pge pgeVar = gqw0.A;
            if (eolVar.c) {
                h4dVar = null;
            } else {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                h4dVar2.b = fArrA;
                h4dVar = h4dVar2;
            }
            fetVar2 = fetVar;
            j0x.b(mz3VarT, null, mm40VarJ2, null, pgeVar, 0.0f, h4dVar, fetVar2, 24624, 40);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new snl(mm40Var, eolVar, function1, i, (byte) 1);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-470131555);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thd((byte) 13);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarQ), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0145  */
    /* JADX WARN: Code duplicated, block: B:98:0x0153  */
    public static final void n(mm40 mm40Var, a4x a4xVar, hxh0 hxh0Var, dxh0 dxh0Var, ycl yclVar, long j, Function0 function0, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        dxh0 dxh0Var2;
        ycl yclVar2;
        long backgroundContent;
        Function1 function2;
        boolean z;
        hxh0 hxh0Var2;
        mm40 mm40Var3;
        ycl yclVar3;
        long j2;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        int i4;
        hxh0 hxh0Var3;
        long j3;
        mm40 mm40Var5;
        ycl yclVar4;
        float f;
        int i5;
        int i6;
        int i7;
        function0.getClass();
        function1.getClass();
        fetVar.g0(946331308);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        int i9 = i3 | 384;
        if ((i & 3072) == 0) {
            dxh0Var2 = dxh0Var;
            i9 |= fetVar.g(dxh0Var2) ? 2048 : 1024;
        } else {
            dxh0Var2 = dxh0Var;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                yclVar2 = yclVar;
                i9 |= fetVar.g(yclVar2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                backgroundContent = j;
                if ((i2 & 32) == 0 || !fetVar.f(backgroundContent)) {
                    i7 = 65536;
                } else {
                    i7 = 131072;
                }
                i9 |= i7;
            } else {
                backgroundContent = j;
            }
            if ((1572864 & i) != 0) {
                if (fetVar.i(function0)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i9 |= i6;
            }
            if ((12582912 & i) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i9 |= i5;
            } else {
                function2 = function1;
            }
            if ((4793491 & i9) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i9 & 1, z)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if (i8 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i10 != 0) {
                        yclVar2 = null;
                    }
                    i4 = i2 & 32;
                    gxh0 gxh0Var = gxh0.f12078a;
                    if (i4 != 0) {
                        backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                        i9 &= -458753;
                    }
                    hxh0Var3 = gxh0Var;
                    j3 = backgroundContent;
                    mm40Var5 = mm40Var4;
                    yclVar4 = yclVar2;
                } else {
                    fetVar.X();
                    if ((i2 & 32) != 0) {
                        i9 &= -458753;
                    }
                    j3 = backgroundContent;
                    mm40Var5 = mm40Var2;
                    yclVar4 = yclVar2;
                    hxh0Var3 = hxh0Var;
                }
                fetVar.s();
                if (yclVar4 != null) {
                    f = yclVar4.f42389a;
                } else {
                    zcl zclVar = qmk.f28987a;
                    f = 16.0f;
                }
                int i11 = i9 & 8176;
                int i12 = i9 >> 3;
                ibc.n(s5x0.L(i120.Q(mm40Var5, j3, jd8.n), f, 0.0f, 2), a4xVar, hxh0Var3, dxh0Var2, false, function0, function2, fetVar, i11 | (458752 & i12) | (i12 & 3670016), 16);
                hxh0Var2 = hxh0Var3;
                mm40Var3 = mm40Var5;
                yclVar3 = yclVar4;
                j2 = j3;
            } else {
                fetVar.X();
                hxh0Var2 = hxh0Var;
                mm40Var3 = mm40Var2;
                yclVar3 = yclVar2;
                j2 = backgroundContent;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new krh(mm40Var3, a4xVar, hxh0Var2, dxh0Var, yclVar3, j2, function0, function1, i, i2);
            }
        }
        i9 |= 24576;
        yclVar2 = yclVar;
        if ((196608 & i) == 0) {
            backgroundContent = j;
            if ((i2 & 32) == 0) {
                i7 = 65536;
            } else {
                i7 = 65536;
            }
            i9 |= i7;
        } else {
            backgroundContent = j;
        }
        if ((1572864 & i) != 0) {
            if (fetVar.i(function0)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i9 |= i6;
        }
        if ((12582912 & i) == 0) {
            function2 = function1;
            if (fetVar.i(function2)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i9 |= i5;
        } else {
            function2 = function1;
        }
        if ((4793491 & i9) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i9 & 1, z)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i10 != 0) {
                    yclVar2 = null;
                }
                i4 = i2 & 32;
                gxh0 gxh0Var2 = gxh0.f12078a;
                if (i4 != 0) {
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    i9 &= -458753;
                }
                hxh0Var3 = gxh0Var2;
                j3 = backgroundContent;
                mm40Var5 = mm40Var4;
                yclVar4 = yclVar2;
            } else {
                if (i8 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i10 != 0) {
                    yclVar2 = null;
                }
                i4 = i2 & 32;
                gxh0 gxh0Var3 = gxh0.f12078a;
                if (i4 != 0) {
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    i9 &= -458753;
                }
                hxh0Var3 = gxh0Var3;
                j3 = backgroundContent;
                mm40Var5 = mm40Var4;
                yclVar4 = yclVar2;
            }
            fetVar.s();
            if (yclVar4 != null) {
                f = yclVar4.f42389a;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 16.0f;
            }
            int i13 = i9 & 8176;
            int i14 = i9 >> 3;
            ibc.n(s5x0.L(i120.Q(mm40Var5, j3, jd8.n), f, 0.0f, 2), a4xVar, hxh0Var3, dxh0Var2, false, function0, function2, fetVar, i13 | (458752 & i14) | (i14 & 3670016), 16);
            hxh0Var2 = hxh0Var3;
            mm40Var3 = mm40Var5;
            yclVar3 = yclVar4;
            j2 = j3;
        } else {
            fetVar.X();
            hxh0Var2 = hxh0Var;
            mm40Var3 = mm40Var2;
            yclVar3 = yclVar2;
            j2 = backgroundContent;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new krh(mm40Var3, a4xVar, hxh0Var2, dxh0Var, yclVar3, j2, function0, function1, i, i2);
        }
    }

    public static final void o(mm40 mm40Var, wqg wqgVar, fet fetVar, int i, int i2) {
        wqgVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if (wqgVar instanceof q7m) {
            fetVar.e0(-236427715);
            jwb.k(0, i & 14, fetVar, mm40Var, ((q7m) wqgVar).f28257a);
            fetVar.r(false);
            return;
        }
        if (wqgVar instanceof l8m) {
            fetVar.e0(-236424550);
            vzb.g(mm40Var, (l8m) wqgVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (wqgVar instanceof l9m) {
            fetVar.e0(-236421544);
            k9m.a(mm40Var, (l9m) wqgVar, fetVar, i & 126, 0);
            fetVar.r(false);
        } else if (!(wqgVar instanceof lbm)) {
            fetVar.e0(1261012895);
            fetVar.r(false);
        } else {
            fetVar.e0(-236418633);
            kbm.a(mm40Var, (lbm) wqgVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final void p(j240 j240Var, Function1 function1, mm40 mm40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        j240Var.getClass();
        function1.getClass();
        fetVar.g0(284440730);
        int i2 = (fetVar.g(j240Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new edl(j240Var, (byte) 19);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dpl((byte) 13, (Object) j240Var, function1);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            mm40Var2 = jm40.b;
            dwi0.b(function2, mm40Var2, function3, fetVar, 48, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(j240Var, function1, mm40Var2, i);
        }
    }

    public static final void q(mm40 mm40Var, fvm fvmVar, fet fetVar, int i) {
        if (fvmVar instanceof avm) {
            fetVar.e0(582646582);
            avm avmVar = (avm) fvmVar;
            ohq0.B(mm40Var, avmVar.f1533a, avmVar.b, avmVar.c, avmVar.d, avmVar.e, avmVar.f, avmVar.g, avmVar.h, avmVar.i, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (fvmVar instanceof bvm) {
            fetVar.e0(583256228);
            bvm bvmVar = (bvm) fvmVar;
            vtb.w(mm40Var, bvmVar.f3284a, bvmVar.b, bvmVar.c, bvmVar.d, bvmVar.e, bvmVar.g, bvmVar.f, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (fvmVar instanceof cvm) {
            fetVar.e0(583820490);
            cvm cvmVar = (cvm) fvmVar;
            dub.A(mm40Var, cvmVar.f5037a, cvmVar.b, cvmVar.c, cvmVar.d, cvmVar.e, cvmVar.f, cvmVar.g, cvmVar.h, cvmVar.i, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (fvmVar instanceof dvm) {
            fetVar.e0(584455680);
            dvm dvmVar = (dvm) fvmVar;
            wvb.r(mm40Var, dvmVar.f6750a, dvmVar.b, dvmVar.c, dvmVar.d, dvmVar.e, dvmVar.f, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (!(fvmVar instanceof evm)) {
            throw b1j.f(1127173717, fetVar, false);
        }
        fetVar.e0(584921362);
        evm evmVar = (evm) fvmVar;
        jwb.m(mm40Var, evmVar.f8476a, evmVar.b, evmVar.c, evmVar.d, evmVar.e, evmVar.f, evmVar.g, evmVar.h, evmVar.i, fetVar, i & 14);
        fetVar.r(false);
    }

    public static final void r(mm40 mm40Var, izm izmVar, fet fetVar, int i) {
        boolean z;
        fetVar.g0(926891803);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(izmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            mm40 mm40VarN2 = s5x0.N(ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true), 0.0f, 0.0f, 2.0f, 0.0f, 11);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            y(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 4.0f, 5), izmVar.f15641a, fetVar, 0, 0);
            y(null, izmVar.b, fetVar, 0, 1);
            fetVar.r(true);
            p6x p6xVar = izmVar.f;
            if (p6xVar == null) {
                fetVar.e0(-1009711173);
                fetVar.r(false);
            } else {
                fetVar.e0(-1009711172);
                x(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), p6xVar, fetVar, 0);
                fetVar.r(false);
            }
            tym tymVar = izmVar.c;
            if (tymVar == null) {
                fetVar.e0(-1009483788);
                fetVar.r(false);
            } else {
                fetVar.e0(-1009483787);
                z(null, tymVar, false, fetVar, 384);
                fetVar.r(false);
            }
            tym tymVar2 = izmVar.d;
            if (tymVar2 == null) {
                fetVar.e0(-1009311180);
                fetVar.r(false);
            } else {
                fetVar.e0(-1009311179);
                z(null, tymVar2, false, fetVar, 384);
                fetVar.r(false);
            }
            tym tymVar3 = izmVar.e;
            if (tymVar3 == null) {
                fetVar.e0(-1009140587);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(-1009140586);
                z = true;
                z(null, tymVar3, true, fetVar, 384);
                fetVar.r(false);
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, izmVar, i, (byte) 26);
        }
    }

    public static final void s(mm40 mm40Var, q6n q6nVar, e2d e2dVar, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        q6n q6nVar2;
        mm40 mm40Var2;
        pcy pcyVar;
        e2d e2dVar2;
        int i2;
        int i3;
        cl5 cl5Var;
        fet fetVar2 = fetVar;
        q6nVar.getClass();
        e2dVar.getClass();
        fetVar2.g0(-552961340);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= fetVar2.g(q6nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= fetVar2.g(e2dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            pm80 pm80VarF = a8k0.F(R.drawable.teambet_bg_01, 0, fetVar2);
            pm80 pm80VarF2 = a8k0.F(R.drawable.teambet_bg_02, 0, fetVar2);
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                h4d h4dVar = new h4d(new ColorMatrixColorFilter(fArrA));
                h4dVar.b = fArrA;
                fetVar2.o0(h4dVar);
                objP = h4dVar;
            }
            a4d a4dVar = (a4d) objP;
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var2) {
                objP2 = jgk0.b(new c2d(e2dVar, (byte) 5));
                fetVar2.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            boolean z2 = i5 == 256;
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var2) {
                objP3 = jgk0.b(new c2d(e2dVar, (byte) 6));
                fetVar2.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            jm40 jm40Var = jm40.b;
            int i6 = i4 >> 3;
            mm40 mm40VarC = nip.c(lgb.K(o7k0.d(jm40Var, 1.0f)), e2dVar, fetVar2, i6 & 112);
            zx7 zx7Var = gqw0.f11754a;
            int i7 = i4;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            boolean zI = (i5 == 256) | fetVar2.i(pm80VarF) | fetVar2.i(pm80VarF2);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var2) {
                objP4 = new f8m((Object) e2dVar, (Object) pm80VarF, (Object) pm80VarF2, (byte) 3);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarM = rq8.M(mm40VarA, (Function1) objP4);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.i);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(ffb0.R(mm40VarB, 22.0f, 0.0f, 2), 132.0f);
            byte b = 1;
            k7x.a(q6nVar.c.a(), null, mm40VarN, null, a4dVar, fetVar2, 100663344, 1784);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                fetVar2.e0(998703085);
                i2 = i5;
                boolean z4 = i2 == 256;
                Object objP5 = fetVar2.P();
                cl5Var = cl5Var2;
                if (z4 || objP5 == cl5Var) {
                    e2dVar2 = e2dVar;
                    objP5 = new o6n(e2dVar2, b);
                    fetVar2.o0(objP5);
                } else {
                    e2dVar2 = e2dVar;
                }
                i3 = i6;
                q6nVar2 = q6nVar;
                function2 = function1;
                c(i4w0.T(jm40Var, (Function1) objP5), q6nVar2, function2, fetVar2, (i7 & 112) | (i3 & 896));
                fetVar2.r(false);
            } else {
                q6nVar2 = q6nVar;
                e2dVar2 = e2dVar;
                function2 = function1;
                i2 = i5;
                i3 = i6;
                cl5Var = cl5Var2;
                fetVar2.e0(999055772);
                fetVar2.r(false);
            }
            if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                fetVar2.e0(999110611);
                mm40 mm40VarX = yyw.X(jm40Var, null, fetVar2, 1);
                boolean z5 = i2 == 256;
                Object objP6 = fetVar2.P();
                if (z5 || objP6 == cl5Var) {
                    objP6 = new o6n(e2dVar2, (byte) 2);
                    fetVar2.o0(objP6);
                }
                t(i4w0.T(mm40VarX, (Function1) objP6), q6nVar2, function2, fetVar2, (i7 & 112) | (i3 & 896));
                fetVar2.r(false);
            } else {
                fetVar2.e0(999519036);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            nip.a(92.0f, ((StaticColors) fetVar2.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), e2dVar2, u1c.M(289311976, new d0n((Object) e2dVar2, (Object) q6nVar2, (byte) 19), fetVar2), fetVar2, i2 | 3072);
            qxw.o(fetVar2, o7k0.e(jm40Var, 24.0f));
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            function2 = function1;
            q6nVar2 = q6nVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 26, i, (Object) mm40Var2, (Object) q6nVar2, (Object) e2dVar, (Object) function2);
        }
    }

    public static final void t(mm40 mm40Var, q6n q6nVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(967563513);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(q6nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            q6nVar.getClass();
            imm immVar = new imm(jlm.f16723a, mlm.f21997a, new emm(new na50(B(0, q6nVar.e ? R.drawable.ic_glyph_notification_active : R.drawable.ic_glyph_notification_inactive, fetVar), B(1, q6nVar.d ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, fetVar))), ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), false, null);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            byte b = 5;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ylm(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new btm(function1, b);
                fetVar.o0(objP2);
            }
            hlm.c(mm40Var2, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, i2 & 14, 0, 4052);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6n(mm40Var, q6nVar, function1, i, (byte) 1);
        }
    }

    public static final void u(mm40 mm40Var, final jqr jqrVar, fet fetVar, int i) {
        fetVar.g0(-756286902);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(jqrVar) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long jM73getBlack400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40Var, jM73getBlack400d7_KjU, vgg0.a(12.0f)), 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zfn zfnVar = bmd.n;
            k6z k6zVar = k6z.f17794a;
            obc.d(zfnVar.a(k6zVar), u1c.M(1592306854, new Function2() { // from class: a.fqr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b;
                    final jqr jqrVar2 = jqrVar;
                    Object[] objArr = 0;
                    final byte b4 = 1;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar2 = qmk.f28987a;
                                jwb.p(x7zVar, new qw3(2.0f, true, new gne(gqw0.n, (byte) 12)), new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(-1575568351, new xdr() { // from class: a.hqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        byte b5 = b4;
                                        jqr jqrVar3 = jqrVar2;
                                        fet fetVar3 = (fet) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue2 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar3.U(iIntValue2 & 1, i3 != 16)) {
                                                    Iterator<E> it = jqrVar3.d.iterator();
                                                    while (it.hasNext()) {
                                                        fww.h(null, (mc90) it.next(), fetVar3, 0);
                                                    }
                                                } else {
                                                    fetVar3.X();
                                                }
                                                break;
                                            default:
                                                if (fetVar3.U(iIntValue2 & 1, i3 != 16)) {
                                                    Iterator<E> it2 = jqrVar3.c.iterator();
                                                    while (it2.hasNext()) {
                                                        fww.h(null, (mc90) it2.next(), fetVar3, 0);
                                                    }
                                                } else {
                                                    fetVar3.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2), fetVar2, 1572864, 56);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar2 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar3 = qmk.f28987a;
                                qw3 qw3Var = new qw3(2.0f, true, new gne(gqw0.n, (byte) 12));
                                qw3 qw3Var2 = new qw3(2.0f, true, new jf4((byte) 14));
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                jwb.p(x7zVar2, qw3Var, qw3Var2, null, 0, 0, u1c.M(1332166922, new xdr() { // from class: a.hqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        byte b5 = objArr2;
                                        jqr jqrVar3 = jqrVar2;
                                        fet fetVar4 = (fet) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue3 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    Iterator<E> it = jqrVar3.d.iterator();
                                                    while (it.hasNext()) {
                                                        fww.h(null, (mc90) it.next(), fetVar4, 0);
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                            default:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    Iterator<E> it2 = jqrVar3.c.iterator();
                                                    while (it2.hasNext()) {
                                                        fww.h(null, (mc90) it2.next(), fetVar4, 0);
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar3), fetVar3, 1572864, 56);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
            s0x.o(0, fetVar, null, jqrVar.f16968a, jqrVar.b);
            obc.d(zfnVar.a(k6zVar), u1c.M(528426063, new Function2() { // from class: a.fqr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    final jqr jqrVar2 = jqrVar;
                    Object[] objArr = 0;
                    final byte b4 = 1;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar2 = qmk.f28987a;
                                jwb.p(x7zVar, new qw3(2.0f, true, new gne(gqw0.n, (byte) 12)), new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(-1575568351, new xdr() { // from class: a.hqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        byte b5 = b4;
                                        jqr jqrVar3 = jqrVar2;
                                        fet fetVar4 = (fet) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue3 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    Iterator<E> it = jqrVar3.d.iterator();
                                                    while (it.hasNext()) {
                                                        fww.h(null, (mc90) it.next(), fetVar4, 0);
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                            default:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    Iterator<E> it2 = jqrVar3.c.iterator();
                                                    while (it2.hasNext()) {
                                                        fww.h(null, (mc90) it2.next(), fetVar4, 0);
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2), fetVar2, 1572864, 56);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar2 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar3 = qmk.f28987a;
                                qw3 qw3Var = new qw3(2.0f, true, new gne(gqw0.n, (byte) 12));
                                qw3 qw3Var2 = new qw3(2.0f, true, new jf4((byte) 14));
                                final byte objArr2 = objArr == true ? 1 : 0;
                                jwb.p(x7zVar2, qw3Var, qw3Var2, null, 0, 0, u1c.M(1332166922, new xdr() { // from class: a.hqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        byte b5 = objArr2;
                                        jqr jqrVar3 = jqrVar2;
                                        fet fetVar4 = (fet) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue3 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    Iterator<E> it = jqrVar3.d.iterator();
                                                    while (it.hasNext()) {
                                                        fww.h(null, (mc90) it.next(), fetVar4, 0);
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                            default:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    Iterator<E> it2 = jqrVar3.c.iterator();
                                                    while (it2.hasNext()) {
                                                        fww.h(null, (mc90) it2.next(), fetVar4, 0);
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar3), fetVar3, 1572864, 56);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, jqrVar, i, (byte) 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void v(mm40 mm40Var, final o2s o2sVar, l7m0 l7m0Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        ugd ugdVar5;
        ugd ugdVar6;
        ugd ugdVar7;
        o2s o2sVar2;
        int dimensionPixelSize;
        Object atjVar;
        pz40 pz40Var;
        int i2;
        o2s o2sVar3;
        boolean z;
        ugd ugdVar8 = y860.c;
        ugd ugdVar9 = y860.d;
        o2sVar.getClass();
        l7m0Var.getClass();
        fetVar.g0(25416384);
        byte b = 2;
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o2sVar) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            androidx.compose.runtime.d dVar = dy2.b;
            Activity activityS = j120.S((Context) fetVar.k(dVar));
            int iU = activityS != null ? j120.U(activityS) : 0;
            Activity activityS2 = j120.S((Context) fetVar.k(dVar));
            if (activityS2 != null) {
                int identifier = activityS2.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
                dimensionPixelSize = identifier > 0 ? activityS2.getResources().getDimensionPixelSize(identifier) : 0;
            } else {
                dimensionPixelSize = 0;
            }
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(8.0f, fetVar);
            float fB2 = pkd.b(24.0f, fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = jgk0.b(new fx8(o2sVar, fB, fB2));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var2 = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = jgk0.b(new k2s(o2sVar, b));
                fetVar.o0(objP3);
            }
            final l7m0 l7m0Var3 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                final byte b2 = 0;
                objP4 = jgk0.b(new Function0() { // from class: a.m2s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        l7m0 l7m0Var4 = l7m0Var3;
                        o2s o2sVar4 = o2sVar;
                        switch (b3) {
                            case 0:
                                return Float.valueOf(((Boolean) o2sVar4.h.getValue()).booleanValue() ? 0.0f : ((Number) l7m0Var4.getValue()).floatValue());
                            default:
                                return Float.valueOf(((Boolean) o2sVar4.h.getValue()).booleanValue() ? ((Number) l7m0Var4.getValue()).floatValue() : 0.0f);
                        }
                    }
                });
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var4 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                final byte b3 = 1;
                objP5 = jgk0.b(new Function0() { // from class: a.m2s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        l7m0 l7m0Var5 = l7m0Var3;
                        o2s o2sVar4 = o2sVar;
                        switch (b4) {
                            case 0:
                                return Float.valueOf(((Boolean) o2sVar4.h.getValue()).booleanValue() ? 0.0f : ((Number) l7m0Var5.getValue()).floatValue());
                            default:
                                return Float.valueOf(((Boolean) o2sVar4.h.getValue()).booleanValue() ? ((Number) l7m0Var5.getValue()).floatValue() : 0.0f);
                        }
                    }
                });
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var5 = (l7m0) objP5;
            Object objP6 = fetVar.P();
            byte b4 = 3;
            if (objP6 == obj) {
                objP6 = jgk0.b(new k2s(o2sVar, b4));
                fetVar.o0(objP6);
            }
            l7m0 l7m0Var6 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = jgk0.b(new k2s(o2sVar, (byte) 4));
                fetVar.o0(objP7);
            }
            l7m0 l7m0Var7 = (l7m0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = jgk0.b(new k2s(o2sVar, (byte) 5));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var8 = (l7m0) objP8;
            long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU();
            Object value = l7m0Var.getValue();
            int i4 = i3 & 112;
            boolean z2 = ((i3 & 896) == 256) | (i4 == 32);
            Object objP9 = fetVar.P();
            yje yjeVar = null;
            if (z2 || objP9 == obj) {
                pz40Var = pz40Var2;
                i2 = i4;
                o2sVar3 = o2sVar;
                atjVar = new atj(o2sVar3, l7m0Var, pz40Var, yjeVar, (byte) 8);
                fetVar.o0(atjVar);
            } else {
                atjVar = objP9;
                pz40Var = pz40Var2;
                o2sVar3 = o2sVar;
                i2 = i4;
            }
            m0x0.t(fetVar, value, (Function2) atjVar);
            Object value2 = o2sVar3.h.getValue();
            boolean z3 = i2 == 32;
            Object objP10 = fetVar.P();
            if (z3 || objP10 == obj) {
                objP10 = new cin(o2sVar3, yjeVar, (byte) 9);
                fetVar.o0(objP10);
            }
            m0x0.t(fetVar, value2, (Function2) objP10);
            Unit unit = Unit.f46060a;
            boolean z4 = i2 == 32;
            Object objP11 = fetVar.P();
            if (z4 || objP11 == obj) {
                objP11 = new cbq((Object) o2sVar3, yjeVar, (byte) 11);
                fetVar.o0(objP11);
            }
            m0x0.t(fetVar, unit, (Function2) objP11);
            agk0 agk0Var = o2sVar3.i;
            float f = o2sVar3.j;
            t33 t33Var = o2sVar3.c;
            t33 t33Var2 = o2sVar3.d;
            pz40 pz40Var3 = o2sVar3.h;
            boolean zE = fetVar.e(iU) | fetVar.g(agk0Var) | fetVar.d(f);
            Object objP12 = fetVar.P();
            if (zE || objP12 == obj) {
                objP12 = new n2s(t33Var, t33Var2, pz40Var3, agk0Var, iU, dimensionPixelSize, f, l7m0Var2);
                fetVar.o0(objP12);
            }
            tj30 tj30Var = (tj30) objP12;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z5) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            coc cocVar = new coc("CARD_BACKGROUND_ID");
            boolean zF = fetVar.f(r19);
            Object objP13 = fetVar.P();
            if (zF || objP13 == obj) {
                objP13 = new nme((byte) 29, jM75getBlack600d7_KjU);
                fetVar.o0(objP13);
            }
            zq8.a(0, fetVar, rq8.K(cocVar, (Function1) objP13));
            ugdVar5 = ugdVar;
            ugdVar5.F(epv0.N(new coc("TAB_ID"), ((Number) l7m0Var8.getValue()).floatValue()), fetVar, 48);
            mm40 mm40VarK = lgb.K(epv0.N(new coc("COMPRESSED_CARD_ID"), ((Number) l7m0Var7.getValue()).floatValue()));
            boolean z6 = i2 == 32;
            Object objP14 = fetVar.P();
            if (z6 || objP14 == obj) {
                objP14 = new k2s(o2sVar3, (byte) 0);
                fetVar.o0(objP14);
            }
            ugdVar6 = ugdVar3;
            ugdVar6.F(knx.Q(mm40VarK, new ftc((Function0) objP14, (byte) 3)), fetVar, 48);
            mm40 mm40VarK2 = lgb.K(epv0.N(new coc("CARDS_ID"), ((Number) l7m0Var6.getValue()).floatValue()));
            boolean z7 = i2 == 32;
            Object objP15 = fetVar.P();
            if (z7 || objP15 == obj) {
                objP15 = new k2s(o2sVar3, (byte) 1);
                fetVar.o0(objP15);
            }
            mm40 mm40VarQ = knx.Q(mm40VarK2, new ftc((Function0) objP15, (byte) 3));
            xcz xczVar = o2sVar3.f24547a;
            xcz xczVar2 = o2sVar3.b;
            Object objP16 = fetVar.P();
            if (objP16 == obj) {
                objP16 = new rip(pz40Var, (byte) 2);
                fetVar.o0(objP16);
            }
            Function0 function1 = (Function0) objP16;
            boolean z8 = i2 == 32;
            Object objP17 = fetVar.P();
            if (z8 || objP17 == obj) {
                z = false;
                objP17 = new l2s(o2sVar3, null == true ? 1 : 0);
                fetVar.o0(objP17);
            } else {
                z = false;
            }
            o2sVar2 = o2sVar3;
            ugdVar2.q(mm40VarQ, xczVar, xczVar2, function1, (Function1) objP17, fetVar, 199680);
            coc cocVar2 = new coc("INDICATOR_ID");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, cocVar2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            ugdVar8.j(epv0.N(jr8Var.a(jm40Var), ((Number) l7m0Var4.getValue()).floatValue()), o2sVar2.f24547a, fetVar, 384);
            ugdVar9.j(epv0.N(jr8Var.a(jm40Var), ((Number) l7m0Var5.getValue()).floatValue()), o2sVar2.b, fetVar, 384);
            fetVar.r(true);
            ugdVar7 = ugdVar4;
            ugdVar7.F(new coc("SIMULATION"), fetVar, 48);
            fetVar.r(true);
        } else {
            ugdVar5 = ugdVar;
            ugdVar6 = ugdVar3;
            ugdVar7 = ugdVar4;
            o2sVar2 = o2sVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0(mm40Var, o2sVar2, l7m0Var, ugdVar5, ugdVar2, ugdVar6, ugdVar7, i);
        }
    }

    public static final void w(int i, long j, fet fetVar, mm40 mm40Var, y9q0 y9q0Var, String str) {
        str.getClass();
        tj30 tj30VarC = zq8.c(gqw0.e, false);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
        mkd.c0.getClass();
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(e7z.u1);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, tj30VarC, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        v8q0.a(str, null, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i >> 3) & 910, ((i << 15) & 29360128) | 24960, 109562);
        fetVar.r(true);
    }

    public static final void x(mm40 mm40Var, p6x p6xVar, fet fetVar, int i) {
        Object objN;
        fetVar.g0(-954233770);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(p6xVar.ordinal()) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.s(mm40Var, 10.0f), 2.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                int iOrdinal = p6xVar.ordinal();
                jm40 jm40Var = jm40.b;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        objN = s5x0.N(jm40Var, 0.0f, 28.0f, 0.0f, 0.0f, 13);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        objN = null;
                    }
                    objP = objN;
                } else {
                    objP = jm40Var;
                }
                fetVar.o0(objP);
            }
            mm40 mm40Var2 = (mm40) objP;
            if (mm40Var2 == null) {
                fetVar.e0(154858719);
                fetVar.r(false);
            } else {
                fetVar.e0(154858720);
                b(0, fetVar, mm40Var2);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qym(mm40Var, p6xVar, i, b);
        }
    }

    public static final void y(mm40 mm40Var, czm czmVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fetVar.g0(-1110970330);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(czmVar) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var4, 24.0f), 1.0f);
            yx7 yx7Var = gqw0.k;
            byte b = 14;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4(b)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            d280 d280Var = czmVar.b;
            d280 d280Var2 = czmVar.c;
            float f = (d280Var == null && d280Var2 == null) ? 0.0f : 2.0f;
            mm40 mm40Var5 = mm40Var4;
            thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4(b)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            Object obj = ukd.f35823a;
            if (d280Var != null) {
                fetVar.e0(-949807591);
                boolean zG = fetVar.g(d280Var);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                    fetVar.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                boolean zG2 = fetVar.g(u6nVar);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new d1n(u6nVar, (byte) 1);
                    fetVar.o0(objP2);
                }
                kkb.p(1, fetVar, null, (Function0) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(-949412620);
                fetVar.r(false);
            }
            if (d280Var2 != null) {
                fetVar.e0(-949361191);
                boolean zG3 = fetVar.g(d280Var2);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == obj) {
                    objP3 = new u6n(d4d.SECONDARY60, w6n.j, d280Var2);
                    fetVar.o0(objP3);
                }
                u6n u6nVar2 = (u6n) objP3;
                boolean zG4 = fetVar.g(u6nVar2);
                Object objP4 = fetVar.P();
                if (zG4 || objP4 == obj) {
                    objP4 = new d1n(u6nVar2, (byte) 1);
                    fetVar.o0(objP4);
                }
                kkb.p(1, fetVar, null, (Function0) objP4);
                fetVar.r(false);
            } else {
                fetVar.e0(-948966220);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, f, 0.0f, 0.0f, 0.0f, 14);
            String str = czmVar.f5231a;
            androidx.compose.runtime.d dVar = j1t0.e;
            ((g1t0) fetVar.k(dVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            long j = qmk.p;
            ((g1t0) fetVar.k(dVar)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(j, g1t0.d().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, y9q0VarD, fetVar, 0, 24960, 108528);
            fetVar.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lzm(mm40Var3, czmVar, i, i2, (byte) 0);
        }
    }

    public static final void z(mm40 mm40Var, tym tymVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        y3d y3dVarF;
        y3d y3dVarF2;
        jm40 jm40Var;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1355054653);
        int i2 = i | 6 | (fetVar2.g(tymVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var2, 32.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), 12.0f), 1.0f);
            String str = tymVar.f34762a;
            String str2 = tymVar.c;
            String str3 = tymVar.b;
            long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            fet fetVar3 = fetVar;
            if (tymVar.d) {
                fetVar3.e0(2027134240);
                y3dVarF = dw9.f(fetVar3, false, ((StaticColors) fetVar3.k(m8m0.f21378a)).m98getGreen0d7_KjU());
            } else {
                fetVar3.e0(2027191993);
                fetVar3.r(false);
                y3dVarF = null;
            }
            if (tymVar.e) {
                fetVar3.e0(2027280064);
                y3dVarF2 = dw9.f(fetVar3, false, ((StaticColors) fetVar3.k(m8m0.f21378a)).m98getGreen0d7_KjU());
            } else {
                fetVar3.e0(2027337817);
                fetVar3.r(false);
                y3dVarF2 = null;
            }
            if (z) {
                fetVar3.e0(2027393090);
                jm40Var = jm40Var2;
                pzb.n(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), ulb.Z(str3, fetVar3), y3dVarF, fetVar3, 0, 0);
                fetVar3 = fetVar3;
                fetVar3.r(false);
            } else {
                fetVar3.e0(2027642857);
                jm40Var = jm40Var2;
                sac.p(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), new dqm(ulb.Z(str3, fetVar3), y3dVarF), fetVar3, 0, 0);
                fetVar3.r(false);
            }
            if (z) {
                fetVar3.e0(2027988166);
                fetVar2 = fetVar;
                pzb.n(null, ulb.Z(str2, fetVar3), y3dVarF2, fetVar2, 0, 1);
                fetVar2.r(false);
                z2 = true;
            } else {
                fetVar2 = fetVar3;
                fetVar2.e0(2028170477);
                z2 = true;
                sac.p(null, new dqm(ulb.Z(str2, fetVar2), y3dVarF2), fetVar2, 0, 1);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mzm(mm40Var2, tymVar, z, i, (byte) 0);
        }
    }
}
