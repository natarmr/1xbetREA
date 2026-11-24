package org.xplatform.cyber.section.api.presentation;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;", "Landroid/os/Parcelable;", "Disciplines", "Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CyberMainDisciplinesParams implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;", "Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Disciplines extends CyberMainDisciplinesParams {
        public static final Parcelable.Creator<Disciplines> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CyberGamesPage f46560a;

        public Disciplines(CyberGamesPage cyberGamesPage) {
            cyberGamesPage.getClass();
            this.f46560a = cyberGamesPage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Disciplines) && Intrinsics.d(this.f46560a, ((Disciplines) obj).f46560a);
        }

        public final int hashCode() {
            return this.f46560a.hashCode();
        }

        public final String toString() {
            return "Disciplines(page=" + this.f46560a + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f46560a, i);
        }
    }
}
