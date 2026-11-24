package org.xplatform.cyber.section.impl.meta_heroes.presentation.dialog;

import a.cs0;
import a.imw;
import a.xb40;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MetaHeroesRoleModelParams implements Parcelable {
    public static final Parcelable.Creator<MetaHeroesRoleModelParams> CREATOR = new imw(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb40 f46584a;
    public final List b;

    public MetaHeroesRoleModelParams(xb40 xb40Var, List list) {
        xb40Var.getClass();
        list.getClass();
        this.f46584a = xb40Var;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaHeroesRoleModelParams)) {
            return false;
        }
        MetaHeroesRoleModelParams metaHeroesRoleModelParams = (MetaHeroesRoleModelParams) obj;
        return this.f46584a == metaHeroesRoleModelParams.f46584a && Intrinsics.d(this.b, metaHeroesRoleModelParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46584a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaHeroesRoleModelParams(selectedRole=" + this.f46584a + ", availablePositions=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46584a.name());
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            parcel.writeString(((xb40) itT.next()).name());
        }
    }
}
