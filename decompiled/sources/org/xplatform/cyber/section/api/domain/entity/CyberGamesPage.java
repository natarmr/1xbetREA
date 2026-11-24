package org.xplatform.cyber.section.api.domain.entity;

import a.a8z;
import a.ahi0;
import a.jiy;
import a.maz;
import a.wez;
import a.xng;
import a.zzg;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;", "Landroid/os/Parcelable;", "Companion", "Real", "Virtual", "OneXCyber", "a/zzg", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CyberGamesPage implements Parcelable {
    public static final zzg Companion = new zzg();
    public static final a8z b = maz.a(wez.f39042a, new xng(8));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f46556a;

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OneXCyber extends CyberGamesPage {
        public static final OneXCyber INSTANCE = new OneXCyber(2);
        public static final Parcelable.Creator<OneXCyber> CREATOR = new a();
        public static final /* synthetic */ a8z c = maz.a(wez.f39042a, new xng(9));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OneXCyber);
        }

        public final int hashCode() {
            return 1495028304;
        }

        public final jiy serializer() {
            return (jiy) c.getValue();
        }

        public final String toString() {
            return "OneXCyber";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Real extends CyberGamesPage {
        public static final Real INSTANCE = new Real(0);
        public static final Parcelable.Creator<Real> CREATOR = new b();
        public static final /* synthetic */ a8z c = maz.a(wez.f39042a, new xng(10));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Real);
        }

        public final int hashCode() {
            return 511761013;
        }

        public final jiy serializer() {
            return (jiy) c.getValue();
        }

        public final String toString() {
            return "Real";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Virtual extends CyberGamesPage {
        public static final Virtual INSTANCE = new Virtual(1);
        public static final Parcelable.Creator<Virtual> CREATOR = new c();
        public static final /* synthetic */ a8z c = maz.a(wez.f39042a, new xng(11));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Virtual);
        }

        public final int hashCode() {
            return -1875944748;
        }

        public final jiy serializer() {
            return (jiy) c.getValue();
        }

        public final String toString() {
            return "Virtual";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CyberGamesPage(int i) {
        this.f46556a = i;
    }
}
