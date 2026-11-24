.class public final synthetic La/sa4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sa4;->a:B

    iput-object p1, p0, La/sa4;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/kb00;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/sa4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sa4;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p1, La/jb00;

    .line 12
    .line 13
    iget-object p1, p1, La/jb00;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast p1, La/jb00;

    .line 23
    .line 24
    iget-object p1, p1, La/jb00;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p1, La/jb00;

    .line 34
    .line 35
    iget-object p1, p1, La/jb00;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p1, La/jb00;

    .line 45
    .line 46
    iget-object p1, p1, La/jb00;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/sa4;->a:B

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    iget-object p0, p0, La/sa4;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "WildFreeBetFeature.FRAGMENT_RESULT_KEY"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p2, "WildFreeBetFeature.GAME_SELECT_KEY"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void

    .line 42
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string v0, "REQUEST_ACTION_SELECTOR_DIALOG_KEY"

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-nez p2, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const-string p2, "CHANGE_FAVORITE_STATUS_KEY"

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    new-instance p1, La/an60;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    return-void

    .line 71
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const v1, -0x7de06280

    .line 79
    .line 80
    .line 81
    if-eq v0, v1, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    const-string v0, "KEY_SUB_GAME_FILTER_MODEL_REQUEST"

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_5

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_5
    :goto_2
    return-void

    .line 104
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 108
    .line 109
    if-lt p2, v1, :cond_6

    .line 110
    .line 111
    invoke-static {p1}, La/uq6;->D(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const-string p2, "KEY_BUNDLE_CONFIRMATION_NEW_PLACE"

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;

    .line 125
    .line 126
    :goto_3
    if-eqz p1, :cond_7

    .line 127
    .line 128
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_7
    return-void

    .line 132
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const-string v0, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 136
    .line 137
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-nez p2, :cond_8

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    const-string p2, "KEY_LOGIN_QR_SCANNER_BUNDLE"

    .line 145
    .line 146
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_a

    .line 151
    .line 152
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-eqz p1, :cond_a

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-nez p2, :cond_9

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    new-instance p2, La/ia4;

    .line 166
    .line 167
    invoke-direct {p2, p1}, La/ia4;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_a
    :goto_4
    return-void

    .line 174
    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 178
    .line 179
    const/4 v2, 0x0

    .line 180
    if-lt v0, v1, :cond_b

    .line 181
    .line 182
    invoke-static {p1, p2}, La/c7;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    goto :goto_5

    .line 187
    :cond_b
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    instance-of p2, p1, La/rvs0;

    .line 192
    .line 193
    if-nez p2, :cond_c

    .line 194
    .line 195
    move-object p1, v2

    .line 196
    :cond_c
    check-cast p1, La/rvs0;

    .line 197
    .line 198
    :goto_5
    instance-of p2, p1, La/rvs0;

    .line 199
    .line 200
    if-eqz p2, :cond_d

    .line 201
    .line 202
    move-object v2, p1

    .line 203
    check-cast v2, La/rvs0;

    .line 204
    .line 205
    :cond_d
    if-eqz v2, :cond_e

    .line 206
    .line 207
    new-instance p1, La/oa4;

    .line 208
    .line 209
    invoke-direct {p1, v2}, La/oa4;-><init>(La/rvs0;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    :cond_e
    return-void

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
