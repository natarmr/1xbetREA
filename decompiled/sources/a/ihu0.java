package a;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class ihu0 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f14797a;

    public ihu0(ViewGroup viewGroup) {
        this.f14797a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        ViewGroup viewGroup = this.f14797a;
        viewGroup.getClass();
        return new jhu0(viewGroup);
    }
}
