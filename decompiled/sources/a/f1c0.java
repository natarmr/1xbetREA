package a;

import android.gov.nist.core.Separators;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.personal.impl.presentation.edit_tj.models.EditProfileTjItemEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class f1c0 implements o1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditProfileTjItemEnum f8759a;
    public final Calendar b;

    public f1c0(EditProfileTjItemEnum editProfileTjItemEnum, Calendar calendar) {
        editProfileTjItemEnum.getClass();
        calendar.getClass();
        this.f8759a = editProfileTjItemEnum;
        this.b = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1c0)) {
            return false;
        }
        f1c0 f1c0Var = (f1c0) obj;
        return this.f8759a == f1c0Var.f8759a && Intrinsics.d(this.b, f1c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8759a.hashCode() * 31);
    }

    public final String toString() {
        return "DateDialog(type=" + this.f8759a + ", calendar=" + this.b + Separators.RPAREN;
    }
}
