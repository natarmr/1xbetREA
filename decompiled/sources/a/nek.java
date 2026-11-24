package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class nek implements tyn, d3h0 {
    public static esr f(int i) {
        Object next;
        c0o c0oVar = esr.k;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((esr) next).f8344a != i);
        esr esrVar = (esr) next;
        return esrVar == null ? esr.NOTHING : esrVar;
    }

    public static String g(File file) {
        file.getClass();
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        String strP0 = StringsKt.p0(absolutePath, Separators.SLASH, absolutePath);
        String str = new SimpleDateFormat("HHmmssS", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));
        return new StringBuilder(strP0).insert(StringsKt.r0(strP0, Separators.DOT).length(), BundleUtil.UNDERLINE_TAG + str).toString();
    }

    public static boolean h(wvq0 wvq0Var, int i) {
        char cB = wvq0Var.b(i);
        return StringsKt.P("$^`", cB) || ((1676673024 >> Character.getType(cB)) & 1) != 0;
    }

    public static boolean k(wvq0 wvq0Var, int i) {
        char cB = wvq0Var.b(i);
        return cB == 0 || Character.isSpaceChar(cB) || CharsKt.d(cB);
    }

    public static rop l(j700 j700Var, f9h0 f9h0Var, String str, Set set) {
        str.getClass();
        j700Var.getClass();
        set.getClass();
        rop ropVar = new rop();
        if (str.length() == 0) {
            str = axq.g();
        }
        iiy[] iiyVarArr = rop.b2;
        ropVar.P1.x(ropVar, iiyVarArr[3], str);
        iiy iiyVar = iiyVarArr[1];
        ropVar.N1.getClass();
        iiyVar.getClass();
        Bundle bundle = ropVar.g;
        if (bundle == null) {
            bundle = new Bundle();
            ropVar.s0(bundle);
        }
        bundle.putString("SCREEN_TYPE_KEY", j700Var.name());
        ropVar.O1.u(ropVar, iiyVarArr[2], f9h0Var);
        long[] jArrM0 = CollectionsKt.M0(set);
        ropVar.Q1.r(ropVar, iiyVarArr[4], jArrM0);
        return ropVar;
    }

    @Override // a.d3h0
    public String a() {
        return "0";
    }

    @Override // a.d3h0
    public String b() {
        return "0";
    }

    @Override // a.tyn
    public Object c(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    public void e(mm40 mm40Var, GameBroadcastingParams gameBroadcastingParams, GameVideoUiConfig gameVideoUiConfig, fet fetVar, int i) {
        mm40Var.getClass();
        fetVar.g0(-909183328);
        int i2 = (fetVar.i(gameBroadcastingParams) ? 32 : 16) | i | (fetVar.g(gameVideoUiConfig) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 145) != 144)) {
            int i3 = i2 >> 3;
            bsr0.K(gameBroadcastingParams, gameVideoUiConfig, fetVar, (i3 & 112) | (i3 & 14) | 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((Object) this, mm40Var, (Object) gameBroadcastingParams, (Object) gameVideoUiConfig, i, (byte) 4);
        }
    }

    @Override // a.d3h0
    public boolean i() {
        return false;
    }

    @Override // a.d3h0
    public boolean j() {
        return false;
    }
}
