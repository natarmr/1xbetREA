package a;

import java.util.Date;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params.SelectTimeFilterScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class r3i0 extends w46 {
    public final List b;

    public r3i0(SelectTimeFilterScreenParams selectTimeFilterScreenParams, sqt sqtVar, ctf0 ctf0Var, vzg0 vzg0Var) {
        long j = selectTimeFilterScreenParams.c;
        ctf0Var.getClass();
        byte b = selectTimeFilterScreenParams.f46663a.f42598a;
        long j2 = selectTimeFilterScreenParams.b;
        mfj mfjVar = kfj.f18198a;
        q7m0.a(new q3i0(b, j2 <= 0 ? mfjVar : new lfj(new Date(j2)), j > 0 ? new lfj(new Date(j)) : mfjVar));
        i99 i99Var = i99.f14377a;
        new LinkedBlockingDeque();
        maz.b(new th50((byte) 24));
        roj0.a(0, Integer.MAX_VALUE, i99Var);
        this.b = sqt.f(selectTimeFilterScreenParams.h);
    }
}
