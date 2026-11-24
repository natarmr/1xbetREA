package a;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jk8 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16654a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ jk8(Function2 function2, byte b) {
        this.f16654a = b;
        this.b = function2;
    }

    public void a() {
        Function2 function2 = this.b;
        synchronized (xfk0.c) {
            xfk0.h = CollectionsKt.m0(xfk0.h, function2);
        }
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        Object serializable;
        byte b = this.f16654a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                str.getClass();
                if (str.equals("BonusesFeature.BONUS_RESULT_KEY") && bundle.containsKey("BonusesFeature.BONUS_RESULT_DATA_KEY")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = bundle.getSerializable("BonusesFeature.BONUS_RESULT_DATA_KEY", csr.class);
                    } else {
                        Serializable serializable2 = bundle.getSerializable("BonusesFeature.BONUS_RESULT_DATA_KEY");
                        if (!(serializable2 instanceof csr)) {
                            serializable2 = null;
                        }
                        serializable = (csr) serializable2;
                    }
                    csr csrVar = (csr) serializable;
                    if (csrVar == null) {
                        csrVar = csr.e;
                    }
                    function2.invoke(csrVar, Long.valueOf(bundle.getLong("BonusesFeature.BONUS_RESULT_GAME_ID_KEY", s470.GAME_UNAVAILABLE.a())));
                }
                break;
            case 1:
                str.getClass();
                function2.invoke(str, bundle);
                break;
            default:
                str.getClass();
                function2.invoke(str, bundle);
                break;
        }
    }
}
