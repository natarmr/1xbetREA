package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface cy9 {
    int c();

    eoo0 f();

    default void g(jko jkoVar) {
        int i;
        String str;
        ArrayList arrayList = jkoVar.f16680a;
        int iC = c();
        if (iC == 1) {
            return;
        }
        int iE = hne.E(iC);
        if (iE == 1) {
            i = 32;
        } else if (iE == 2) {
            i = 0;
        } else {
            if (iE != 3) {
                if (iC == 1) {
                    str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                } else if (iC == 2) {
                    str = "NONE";
                } else if (iC != 3) {
                    str = iC != 4 ? "null" : "FIRED";
                } else {
                    str = "READY";
                }
                l8x.E0("ExifData", "Unknown flash state: ".concat(str));
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            jkoVar.c(arrayList, "LightSource", String.valueOf(4));
        }
        jkoVar.c(arrayList, "Flash", String.valueOf(i));
    }

    long h();

    zx9 m();

    ay9 o();

    yx9 p();
}
