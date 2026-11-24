.class public final Lorg/xplatform/login/new_place/api/navigation/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras;

    .line 29
    .line 30
    invoke-direct {p0, v0, v1, v2, p1}, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p0, p1, [Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;

    .line 2
    .line 3
    return-object p0
.end method
