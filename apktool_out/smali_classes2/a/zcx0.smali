.class public final La/zcx0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/zcx0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, La/zcx0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    move-object v2, v1

    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v3, p0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    int-to-char v4, v3

    .line 24
    const/4 v5, 0x1

    .line 25
    if-eq v4, v5, :cond_2

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    if-eq v4, v5, :cond_1

    .line 29
    .line 30
    const/4 v5, 0x3

    .line 31
    if-eq v4, v5, :cond_0

    .line 32
    .line 33
    invoke-static {p1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {p1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {p1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-static {p1, p0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Lcom/google/firebase/auth/internal/zzv;

    .line 56
    .line 57
    invoke-direct {p0, v1, v2, v0}, Lcom/google/firebase/auth/internal/zzv;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_0
    invoke-static {p1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    move v3, v0

    .line 66
    move-object v4, v1

    .line 67
    move-object v5, v4

    .line 68
    move-object v6, v5

    .line 69
    move-object v7, v6

    .line 70
    move-object v8, v7

    .line 71
    move-object v9, v8

    .line 72
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v0, p0, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    int-to-char v1, v0

    .line 83
    packed-switch v1, :pswitch_data_1

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_1
    invoke-static {p1, v0}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    goto :goto_1

    .line 95
    :pswitch_2
    invoke-static {p1, v0}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    goto :goto_1

    .line 100
    :pswitch_3
    invoke-static {p1, v0}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    goto :goto_1

    .line 105
    :pswitch_4
    invoke-static {p1, v0}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    goto :goto_1

    .line 110
    :pswitch_5
    invoke-static {p1, v0}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    goto :goto_1

    .line 115
    :pswitch_6
    invoke-static {p1, v0}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    goto :goto_1

    .line 120
    :pswitch_7
    invoke-static {p1, v0}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-static {p1, p0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 126
    .line 127
    .line 128
    new-instance v2, Lcom/google/android/gms/cloudmessaging/RegisterRequest;

    .line 129
    .line 130
    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/cloudmessaging/RegisterRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v2

    .line 134
    :pswitch_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;->a(I)Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;

    .line 139
    .line 140
    .line 141
    move-result-object p0
    :try_end_0
    .catch La/t0o; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    return-object p0

    .line 143
    :catch_0
    move-exception v0

    .line 144
    move-object p0, v0

    .line 145
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 146
    .line 147
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_0
    .end packed-switch

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/zcx0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzv;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/cloudmessaging/RegisterRequest;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
