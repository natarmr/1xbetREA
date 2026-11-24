package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f3095a;

    public static ArrayList a(sff0 sff0Var, List list) {
        s9b0 s9b0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bmb0 bmb0Var = (bmb0) it.next();
            if (bmb0Var == bmb0.LIVE) {
                s9b0Var = s9b0.LIVE_GAMES;
            } else if (bmb0Var == bmb0.LINE) {
                s9b0Var = s9b0.LINE_GAMES;
            } else {
                ech echVar = sff0Var.c;
                hl1 hl1Var = sff0Var.b;
                if (echVar.f7565a.f12870a && bmb0Var == bmb0.ESPORTS) {
                    s9b0Var = s9b0.CYBER;
                } else if (sff0Var.d.f27973a.f6914a && bmb0Var == bmb0.XGAMES) {
                    s9b0Var = s9b0.ONE_X_GAMES;
                } else if (bmb0Var == bmb0.AGGREGATOR && hl1Var.f13233a.b) {
                    s9b0Var = s9b0.AGGREGATOR;
                } else if (bmb0Var == bmb0.VIRTUAL && hl1Var.C) {
                    s9b0Var = s9b0.AGGREGATOR;
                } else if (bmb0Var == bmb0.EXPRESS) {
                    s9b0Var = s9b0.DAY_EXPRESS;
                } else if (bmb0Var == bmb0.CHAMPSLIVE) {
                    s9b0Var = s9b0.LIVE_CHAMPS;
                } else {
                    s9b0Var = bmb0Var == bmb0.CHAMPSLINE ? s9b0.LINE_CHAMPS : null;
                }
            }
            if (s9b0Var != null) {
                arrayList.add(s9b0Var);
            }
        }
        return arrayList;
    }
}
