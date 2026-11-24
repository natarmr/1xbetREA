.class public final La/kwd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jfn0;


# direct methods
.method public static g(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/fragment/app/e;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, La/n4f;->m2:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p3, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v1, La/n4f;

    .line 20
    .line 21
    invoke-direct {v1}, La/n4f;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/n4f;->l2:[La/iiy;

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    aget-object v3, v2, v3

    .line 28
    .line 29
    iget-object v4, v1, La/n4f;->j2:La/phf0;

    .line 30
    .line 31
    invoke-virtual {v4, v1, v3, p0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    aget-object p0, v2, p0

    .line 36
    .line 37
    iget-object v3, v1, La/n4f;->h2:La/es;

    .line 38
    .line 39
    invoke-virtual {v3, v1, p0, p1}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x2

    .line 43
    aget-object p0, v2, p0

    .line 44
    .line 45
    iget-object p1, v1, La/n4f;->i2:La/phf0;

    .line 46
    .line 47
    invoke-virtual {p1, v1, p0, p2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p3, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static h(Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;Landroidx/fragment/app/e;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/dej;->n2:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, La/dej;

    .line 14
    .line 15
    invoke-direct {v1}, La/dej;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/dej;->m2:[La/iiy;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aget-object v2, v2, v3

    .line 22
    .line 23
    iget-object v3, v1, La/dej;->k2:La/khf0;

    .line 24
    .line 25
    invoke-virtual {v3, v1, v2, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a(Landroidx/media3/common/b;)I
    .locals 4

    .line 1
    iget-object p0, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    if-eqz p0, :cond_9

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, -0x1

    .line 13
    sparse-switch v0, :sswitch_data_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :sswitch_0
    const-string v0, "application/ttml+xml"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    const/16 v3, 0x8

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :sswitch_1
    const-string v0, "application/x-subrip"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v3, 0x7

    .line 42
    goto :goto_0

    .line 43
    :sswitch_2
    const-string v0, "application/vobsub"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v3, 0x6

    .line 53
    goto :goto_0

    .line 54
    :sswitch_3
    const-string v0, "text/x-ssa"

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 v3, 0x5

    .line 64
    goto :goto_0

    .line 65
    :sswitch_4
    const-string v0, "application/x-quicktime-tx3g"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const/4 v3, 0x4

    .line 75
    goto :goto_0

    .line 76
    :sswitch_5
    const-string v0, "text/vtt"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    const/4 v3, 0x3

    .line 86
    goto :goto_0

    .line 87
    :sswitch_6
    const-string v0, "application/x-mp4-vtt"

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    move v3, v2

    .line 97
    goto :goto_0

    .line 98
    :sswitch_7
    const-string v0, "application/pgs"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_7

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_7
    move v3, v1

    .line 108
    goto :goto_0

    .line 109
    :sswitch_8
    const-string v0, "application/dvbsubs"

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_8

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_8
    move v3, p1

    .line 119
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :pswitch_0
    return v1

    .line 124
    :pswitch_1
    return v2

    .line 125
    :pswitch_2
    return v1

    .line 126
    :pswitch_3
    return v2

    .line 127
    :pswitch_4
    return v1

    .line 128
    :pswitch_5
    return v2

    .line 129
    :cond_9
    :goto_1
    const-string v0, "Unsupported MIME type: "

    .line 130
    .line 131
    invoke-static {v0, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return p1

    .line 139
    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_8
        -0x4a6813e3 -> :sswitch_7
        -0x3d28a9ba -> :sswitch_6
        -0x3be2f26c -> :sswitch_5
        0x2935f49f -> :sswitch_4
        0x310bebca -> :sswitch_3
        0x45059676 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Landroidx/media3/common/b;)La/lfn0;
    .locals 9

    .line 1
    iget-object p0, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 4
    .line 5
    if-eqz p0, :cond_e

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x5

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, -0x1

    .line 15
    const/16 v5, 0x8

    .line 16
    .line 17
    sparse-switch v0, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    :goto_0
    move v0, v4

    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :sswitch_0
    const-string v0, "application/ttml+xml"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v5

    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :sswitch_1
    const-string v0, "application/x-subrip"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x7

    .line 45
    goto :goto_1

    .line 46
    :sswitch_2
    const-string v0, "application/vobsub"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 v0, 0x6

    .line 56
    goto :goto_1

    .line 57
    :sswitch_3
    const-string v0, "text/x-ssa"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    move v0, v1

    .line 67
    goto :goto_1

    .line 68
    :sswitch_4
    const-string v0, "application/x-quicktime-tx3g"

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    const/4 v0, 0x4

    .line 78
    goto :goto_1

    .line 79
    :sswitch_5
    const-string v0, "text/vtt"

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    const/4 v0, 0x3

    .line 89
    goto :goto_1

    .line 90
    :sswitch_6
    const-string v0, "application/x-mp4-vtt"

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_6

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    const/4 v0, 0x2

    .line 100
    goto :goto_1

    .line 101
    :sswitch_7
    const-string v0, "application/pgs"

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_7

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_7
    move v0, v2

    .line 111
    goto :goto_1

    .line 112
    :sswitch_8
    const-string v0, "application/dvbsubs"

    .line 113
    .line 114
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_8
    move v0, v3

    .line 122
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 123
    .line 124
    .line 125
    goto/16 :goto_4

    .line 126
    .line 127
    :pswitch_0
    new-instance p0, La/css0;

    .line 128
    .line 129
    invoke-direct {p0}, La/css0;-><init>()V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_1
    new-instance p0, La/u5n0;

    .line 134
    .line 135
    invoke-direct {p0}, La/u5n0;-><init>()V

    .line 136
    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_2
    new-instance p0, La/cvu0;

    .line 140
    .line 141
    invoke-direct {p0, p1}, La/cvu0;-><init>(Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_3
    new-instance p0, La/pul0;

    .line 146
    .line 147
    invoke-direct {p0, p1}, La/pul0;-><init>(Ljava/util/List;)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_4
    new-instance p0, La/tmk;

    .line 152
    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    new-instance v0, La/fq80;

    .line 157
    .line 158
    invoke-direct {v0}, La/fq80;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object v0, p0, La/tmk;->g:Ljava/lang/Object;

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const v1, 0x3f59999a    # 0.85f

    .line 168
    .line 169
    .line 170
    const-string v6, "sans-serif"

    .line 171
    .line 172
    if-ne v0, v2, :cond_d

    .line 173
    .line 174
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, [B

    .line 179
    .line 180
    array-length v0, v0

    .line 181
    const/16 v7, 0x30

    .line 182
    .line 183
    if-eq v0, v7, :cond_9

    .line 184
    .line 185
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, [B

    .line 190
    .line 191
    array-length v0, v0

    .line 192
    const/16 v7, 0x35

    .line 193
    .line 194
    if-ne v0, v7, :cond_d

    .line 195
    .line 196
    :cond_9
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    check-cast p1, [B

    .line 201
    .line 202
    const/16 v0, 0x18

    .line 203
    .line 204
    aget-byte v4, p1, v0

    .line 205
    .line 206
    iput v4, p0, La/tmk;->b:I

    .line 207
    .line 208
    const/16 v4, 0x1a

    .line 209
    .line 210
    aget-byte v4, p1, v4

    .line 211
    .line 212
    and-int/lit16 v4, v4, 0xff

    .line 213
    .line 214
    shl-int/lit8 v0, v4, 0x18

    .line 215
    .line 216
    const/16 v4, 0x1b

    .line 217
    .line 218
    aget-byte v4, p1, v4

    .line 219
    .line 220
    and-int/lit16 v4, v4, 0xff

    .line 221
    .line 222
    shl-int/lit8 v4, v4, 0x10

    .line 223
    .line 224
    or-int/2addr v0, v4

    .line 225
    const/16 v4, 0x1c

    .line 226
    .line 227
    aget-byte v4, p1, v4

    .line 228
    .line 229
    and-int/lit16 v4, v4, 0xff

    .line 230
    .line 231
    shl-int/2addr v4, v5

    .line 232
    or-int/2addr v0, v4

    .line 233
    const/16 v4, 0x1d

    .line 234
    .line 235
    aget-byte v4, p1, v4

    .line 236
    .line 237
    and-int/lit16 v4, v4, 0xff

    .line 238
    .line 239
    or-int/2addr v0, v4

    .line 240
    iput v0, p0, La/tmk;->c:I

    .line 241
    .line 242
    array-length v0, p1

    .line 243
    const/16 v4, 0x2b

    .line 244
    .line 245
    sub-int/2addr v0, v4

    .line 246
    new-instance v7, Ljava/lang/String;

    .line 247
    .line 248
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 249
    .line 250
    invoke-direct {v7, p1, v4, v0, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 251
    .line 252
    .line 253
    const-string v0, "Serif"

    .line 254
    .line 255
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_a

    .line 260
    .line 261
    const-string v6, "serif"

    .line 262
    .line 263
    :cond_a
    iput-object v6, p0, La/tmk;->d:Ljava/lang/String;

    .line 264
    .line 265
    const/16 v0, 0x19

    .line 266
    .line 267
    aget-byte v0, p1, v0

    .line 268
    .line 269
    mul-int/lit8 v0, v0, 0x14

    .line 270
    .line 271
    iput v0, p0, La/tmk;->f:I

    .line 272
    .line 273
    aget-byte v4, p1, v3

    .line 274
    .line 275
    and-int/lit8 v4, v4, 0x20

    .line 276
    .line 277
    if-eqz v4, :cond_b

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_b
    move v2, v3

    .line 281
    :goto_2
    iput-boolean v2, p0, La/tmk;->a:Z

    .line 282
    .line 283
    if-eqz v2, :cond_c

    .line 284
    .line 285
    const/16 v1, 0xa

    .line 286
    .line 287
    aget-byte v1, p1, v1

    .line 288
    .line 289
    and-int/lit16 v1, v1, 0xff

    .line 290
    .line 291
    shl-int/2addr v1, v5

    .line 292
    const/16 v2, 0xb

    .line 293
    .line 294
    aget-byte p1, p1, v2

    .line 295
    .line 296
    and-int/lit16 p1, p1, 0xff

    .line 297
    .line 298
    or-int/2addr p1, v1

    .line 299
    int-to-float p1, p1

    .line 300
    int-to-float v0, v0

    .line 301
    div-float/2addr p1, v0

    .line 302
    const/4 v0, 0x0

    .line 303
    const v1, 0x3f733333    # 0.95f

    .line 304
    .line 305
    .line 306
    invoke-static {p1, v0, v1}, La/vtt0;->h(FFF)F

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    iput p1, p0, La/tmk;->e:F

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_c
    iput v1, p0, La/tmk;->e:F

    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_d
    iput v3, p0, La/tmk;->b:I

    .line 317
    .line 318
    iput v4, p0, La/tmk;->c:I

    .line 319
    .line 320
    iput-object v6, p0, La/tmk;->d:Ljava/lang/String;

    .line 321
    .line 322
    iput-boolean v3, p0, La/tmk;->a:Z

    .line 323
    .line 324
    iput v1, p0, La/tmk;->e:F

    .line 325
    .line 326
    iput v4, p0, La/tmk;->f:I

    .line 327
    .line 328
    :goto_3
    return-object p0

    .line 329
    :pswitch_5
    new-instance p0, La/fuj0;

    .line 330
    .line 331
    const/16 p1, 0x13

    .line 332
    .line 333
    invoke-direct {p0, p1}, La/fuj0;-><init>(B)V

    .line 334
    .line 335
    .line 336
    return-object p0

    .line 337
    :pswitch_6
    new-instance p0, La/jw20;

    .line 338
    .line 339
    invoke-direct {p0, v1}, La/jw20;-><init>(B)V

    .line 340
    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_7
    new-instance p0, La/z220;

    .line 344
    .line 345
    invoke-direct {p0, v5}, La/z220;-><init>(B)V

    .line 346
    .line 347
    .line 348
    return-object p0

    .line 349
    :pswitch_8
    new-instance p0, La/qgd;

    .line 350
    .line 351
    invoke-direct {p0, p1}, La/qgd;-><init>(Ljava/util/List;)V

    .line 352
    .line 353
    .line 354
    return-object p0

    .line 355
    :cond_e
    :goto_4
    const-string p1, "Unsupported MIME type: "

    .line 356
    .line 357
    invoke-static {p1, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    const/4 p0, 0x0

    .line 365
    return-object p0

    .line 366
    nop

    .line 367
    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_8
        -0x4a6813e3 -> :sswitch_7
        -0x3d28a9ba -> :sswitch_6
        -0x3be2f26c -> :sswitch_5
        0x2935f49f -> :sswitch_4
        0x310bebca -> :sswitch_3
        0x45059676 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroidx/media3/common/b;)Z
    .locals 0

    .line 1
    iget-object p0, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 2
    .line 3
    const-string p1, "text/x-ssa"

    .line 4
    .line 5
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    const-string p1, "text/vtt"

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-string p1, "application/x-mp4-vtt"

    .line 20
    .line 21
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-string p1, "application/x-subrip"

    .line 28
    .line 29
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    const-string p1, "application/x-quicktime-tx3g"

    .line 36
    .line 37
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    const-string p1, "application/pgs"

    .line 44
    .line 45
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    const-string p1, "application/vobsub"

    .line 52
    .line 53
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    const-string p1, "application/dvbsubs"

    .line 60
    .line 61
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    const-string p1, "application/ttml+xml"

    .line 68
    .line 69
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 79
    return p0
.end method

.method public d(La/s7g;La/hbg;ZLa/fet;I)V
    .locals 33

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    move/from16 v8, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-object v7, v6, La/hbg;->c:La/tag;

    .line 10
    .line 11
    const v0, 0x5a68655e

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x2

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v1

    .line 27
    :goto_0
    or-int v0, p5, v0

    .line 28
    .line 29
    invoke-virtual {v3, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    const/16 v4, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v4, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v4

    .line 41
    invoke-virtual {v3, v8}, La/fet;->h(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    const/16 v4, 0x100

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v4, 0x80

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v4

    .line 53
    move-object/from16 v10, p0

    .line 54
    .line 55
    invoke-virtual {v3, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    const/16 v4, 0x800

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v4, 0x400

    .line 65
    .line 66
    :goto_3
    or-int v11, v0, v4

    .line 67
    .line 68
    and-int/lit16 v0, v11, 0x493

    .line 69
    .line 70
    const/16 v4, 0x492

    .line 71
    .line 72
    const/4 v12, 0x1

    .line 73
    const/4 v13, 0x0

    .line 74
    if-eq v0, v4, :cond_4

    .line 75
    .line 76
    move v0, v12

    .line 77
    goto :goto_4

    .line 78
    :cond_4
    move v0, v13

    .line 79
    :goto_4
    and-int/lit8 v4, v11, 0x1

    .line 80
    .line 81
    invoke-virtual {v3, v4, v0}, La/fet;->U(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_15

    .line 86
    .line 87
    iget-object v0, v7, La/tag;->i:La/p7m0;

    .line 88
    .line 89
    new-instance v4, La/h2c;

    .line 90
    .line 91
    invoke-direct {v4, v0, v1}, La/h2c;-><init>(La/p7m0;B)V

    .line 92
    .line 93
    .line 94
    shl-int/lit8 v0, v11, 0x6

    .line 95
    .line 96
    and-int/lit16 v0, v0, 0x380

    .line 97
    .line 98
    or-int/lit8 v0, v0, 0x30

    .line 99
    .line 100
    const/16 v5, 0xc

    .line 101
    .line 102
    const-string v1, ""

    .line 103
    .line 104
    move-object/from16 v32, v4

    .line 105
    .line 106
    move v4, v0

    .line 107
    move-object/from16 v0, v32

    .line 108
    .line 109
    invoke-static/range {v0 .. v5}, La/gkb;->O(La/gmq;Ljava/lang/Object;La/s7g;La/fet;II)La/pz40;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    iget-object v0, v7, La/tag;->h:La/p7m0;

    .line 114
    .line 115
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 116
    .line 117
    move-object/from16 v2, p1

    .line 118
    .line 119
    move-object/from16 v3, p4

    .line 120
    .line 121
    invoke-static/range {v0 .. v5}, La/gkb;->O(La/gmq;Ljava/lang/Object;La/s7g;La/fet;II)La/pz40;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v15, v2

    .line 126
    move-object v1, v3

    .line 127
    iget-object v2, v6, La/hbg;->u:La/p7m0;

    .line 128
    .line 129
    shl-int/lit8 v3, v11, 0x3

    .line 130
    .line 131
    and-int/lit8 v3, v3, 0x70

    .line 132
    .line 133
    const/4 v4, 0x6

    .line 134
    invoke-static {v2, v15, v1, v3, v4}, La/gkb;->Q(La/n7m0;La/clz;La/fet;II)La/pz40;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    sget-object v3, La/jm40;->b:La/jm40;

    .line 139
    .line 140
    const/high16 v4, 0x3f800000    # 1.0f

    .line 141
    .line 142
    invoke-static {v3, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object v16

    .line 146
    new-instance v17, La/imm;

    .line 147
    .line 148
    new-instance v3, La/ilm;

    .line 149
    .line 150
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 151
    .line 152
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 157
    .line 158
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 159
    .line 160
    .line 161
    move-result-wide v9

    .line 162
    invoke-direct {v3, v9, v10}, La/ilm;-><init>(J)V

    .line 163
    .line 164
    .line 165
    new-instance v5, La/plm;

    .line 166
    .line 167
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    check-cast v7, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    check-cast v9, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 178
    .line 179
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 180
    .line 181
    .line 182
    move-result-wide v9

    .line 183
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    instance-of v14, v14, La/u9g;

    .line 188
    .line 189
    if-eqz v14, :cond_5

    .line 190
    .line 191
    const v14, -0x25434d44

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v14}, La/fet;->e0(I)V

    .line 195
    .line 196
    .line 197
    new-instance v14, La/ea50;

    .line 198
    .line 199
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v18

    .line 203
    check-cast v18, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 204
    .line 205
    move-object/from16 v19, v2

    .line 206
    .line 207
    move-object/from16 v20, v3

    .line 208
    .line 209
    invoke-virtual/range {v18 .. v18}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 210
    .line 211
    .line 212
    move-result-wide v2

    .line 213
    invoke-direct {v14, v2, v3}, La/ea50;-><init>(J)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_5
    move-object/from16 v19, v2

    .line 221
    .line 222
    move-object/from16 v20, v3

    .line 223
    .line 224
    const v2, -0x2541a6e4

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 231
    .line 232
    .line 233
    sget-object v14, La/fa50;->a:La/fa50;

    .line 234
    .line 235
    :goto_5
    invoke-direct {v5, v7, v9, v10, v14}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 236
    .line 237
    .line 238
    invoke-interface/range {v19 .. v19}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, La/x9g;

    .line 243
    .line 244
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    instance-of v2, v2, La/u9g;

    .line 255
    .line 256
    if-eqz v2, :cond_8

    .line 257
    .line 258
    if-nez v8, :cond_8

    .line 259
    .line 260
    const v2, -0xbdfdc68

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 264
    .line 265
    .line 266
    new-instance v2, La/dmm;

    .line 267
    .line 268
    new-instance v3, La/ta50;

    .line 269
    .line 270
    if-eqz v0, :cond_6

    .line 271
    .line 272
    const v7, 0x7f08079a

    .line 273
    .line 274
    .line 275
    :goto_6
    move/from16 v27, v7

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_6
    const v7, 0x7f0807a0

    .line 279
    .line 280
    .line 281
    goto :goto_6

    .line 282
    :goto_7
    if-eqz v0, :cond_7

    .line 283
    .line 284
    const v0, -0xbd704ae

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 295
    .line 296
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 297
    .line 298
    .line 299
    move-result-wide v9

    .line 300
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 301
    .line 302
    .line 303
    :goto_8
    move-wide/from16 v30, v9

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_7
    const v0, -0xbd5b350

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 317
    .line 318
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 319
    .line 320
    .line 321
    move-result-wide v9

    .line 322
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 323
    .line 324
    .line 325
    goto :goto_8

    .line 326
    :goto_9
    new-instance v25, La/wkm;

    .line 327
    .line 328
    const/16 v26, 0x1

    .line 329
    .line 330
    const/16 v28, 0x1

    .line 331
    .line 332
    sget-object v29, La/ra50;->a:La/ra50;

    .line 333
    .line 334
    invoke-direct/range {v25 .. v31}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 335
    .line 336
    .line 337
    move-object/from16 v0, v25

    .line 338
    .line 339
    invoke-direct {v3, v0}, La/ta50;-><init>(La/wkm;)V

    .line 340
    .line 341
    .line 342
    invoke-direct {v2, v3}, La/dmm;-><init>(La/wa50;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 346
    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_8
    const v0, -0xbd36213

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 356
    .line 357
    .line 358
    sget-object v2, La/fmm;->a:La/fmm;

    .line 359
    .line 360
    :goto_a
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 365
    .line 366
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 367
    .line 368
    .line 369
    move-result-wide v21

    .line 370
    const/16 v23, 0x0

    .line 371
    .line 372
    const/16 v24, 0x0

    .line 373
    .line 374
    move-object/from16 v19, v5

    .line 375
    .line 376
    move-object/from16 v18, v20

    .line 377
    .line 378
    move-object/from16 v20, v2

    .line 379
    .line 380
    invoke-direct/range {v17 .. v24}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 381
    .line 382
    .line 383
    move-object/from16 v10, v17

    .line 384
    .line 385
    and-int/lit8 v9, v11, 0x70

    .line 386
    .line 387
    const/16 v0, 0x20

    .line 388
    .line 389
    if-eq v9, v0, :cond_a

    .line 390
    .line 391
    invoke-virtual {v1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_9

    .line 396
    .line 397
    goto :goto_b

    .line 398
    :cond_9
    move v0, v13

    .line 399
    goto :goto_c

    .line 400
    :cond_a
    :goto_b
    move v0, v12

    .line 401
    :goto_c
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    sget-object v11, La/ukd;->a:La/cl5;

    .line 406
    .line 407
    if-nez v0, :cond_c

    .line 408
    .line 409
    if-ne v2, v11, :cond_b

    .line 410
    .line 411
    goto :goto_d

    .line 412
    :cond_b
    move-object v14, v1

    .line 413
    move-object v0, v2

    .line 414
    move-object v2, v6

    .line 415
    goto :goto_e

    .line 416
    :cond_c
    :goto_d
    new-instance v0, La/oye;

    .line 417
    .line 418
    const/4 v6, 0x0

    .line 419
    const/16 v7, 0x13

    .line 420
    .line 421
    const/4 v1, 0x0

    .line 422
    const-class v3, La/hbg;

    .line 423
    .line 424
    const-string v4, "onBackClicked"

    .line 425
    .line 426
    const-string v5, "onBackClicked()V"

    .line 427
    .line 428
    move-object/from16 v2, p2

    .line 429
    .line 430
    move-object/from16 v14, p4

    .line 431
    .line 432
    invoke-direct/range {v0 .. v7}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v14, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    :goto_e
    move-object/from16 v17, v0

    .line 439
    .line 440
    check-cast v17, La/jhy;

    .line 441
    .line 442
    const/16 v0, 0x20

    .line 443
    .line 444
    if-eq v9, v0, :cond_e

    .line 445
    .line 446
    invoke-virtual {v14, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_d

    .line 451
    .line 452
    goto :goto_f

    .line 453
    :cond_d
    move v0, v13

    .line 454
    goto :goto_10

    .line 455
    :cond_e
    :goto_f
    move v0, v12

    .line 456
    :goto_10
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    if-nez v0, :cond_f

    .line 461
    .line 462
    if-ne v1, v11, :cond_10

    .line 463
    .line 464
    :cond_f
    new-instance v0, La/oye;

    .line 465
    .line 466
    const/4 v6, 0x0

    .line 467
    const/16 v7, 0x14

    .line 468
    .line 469
    const/4 v1, 0x0

    .line 470
    const-class v3, La/hbg;

    .line 471
    .line 472
    const-string v4, "onTitleClicked"

    .line 473
    .line 474
    const-string v5, "onTitleClicked()V"

    .line 475
    .line 476
    invoke-direct/range {v0 .. v7}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v14, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    move-object v1, v0

    .line 483
    :cond_10
    check-cast v1, La/jhy;

    .line 484
    .line 485
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 486
    .line 487
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 488
    .line 489
    const/16 v0, 0x20

    .line 490
    .line 491
    if-eq v9, v0, :cond_12

    .line 492
    .line 493
    invoke-virtual {v14, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_11

    .line 498
    .line 499
    goto :goto_11

    .line 500
    :cond_11
    move v12, v13

    .line 501
    :cond_12
    :goto_11
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    if-nez v12, :cond_13

    .line 506
    .line 507
    if-ne v0, v11, :cond_14

    .line 508
    .line 509
    :cond_13
    new-instance v0, La/aag;

    .line 510
    .line 511
    invoke-direct {v0, v2, v13}, La/aag;-><init>(La/hbg;B)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v14, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    :cond_14
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 518
    .line 519
    const/16 v23, 0x0

    .line 520
    .line 521
    const/16 v24, 0xfc4

    .line 522
    .line 523
    const/4 v11, 0x0

    .line 524
    const/4 v15, 0x0

    .line 525
    move-object/from16 v9, v16

    .line 526
    .line 527
    const/16 v16, 0x0

    .line 528
    .line 529
    move-object/from16 v12, v17

    .line 530
    .line 531
    const/16 v17, 0x0

    .line 532
    .line 533
    const/16 v18, 0x0

    .line 534
    .line 535
    const/16 v19, 0x0

    .line 536
    .line 537
    const/16 v20, 0x0

    .line 538
    .line 539
    const/16 v22, 0x6

    .line 540
    .line 541
    move-object v13, v1

    .line 542
    move-object/from16 v21, v14

    .line 543
    .line 544
    move-object v14, v0

    .line 545
    invoke-static/range {v9 .. v24}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 546
    .line 547
    .line 548
    goto :goto_12

    .line 549
    :cond_15
    move-object v2, v6

    .line 550
    invoke-virtual/range {p4 .. p4}, La/fet;->X()V

    .line 551
    .line 552
    .line 553
    :goto_12
    invoke-virtual/range {p4 .. p4}, La/fet;->u()La/yfe0;

    .line 554
    .line 555
    .line 556
    move-result-object v6

    .line 557
    if-eqz v6, :cond_16

    .line 558
    .line 559
    new-instance v0, La/z9g;

    .line 560
    .line 561
    move-object/from16 v1, p0

    .line 562
    .line 563
    move/from16 v5, p5

    .line 564
    .line 565
    move-object v3, v2

    .line 566
    move v4, v8

    .line 567
    move-object/from16 v2, p1

    .line 568
    .line 569
    invoke-direct/range {v0 .. v5}, La/z9g;-><init>(La/kwd;La/s7g;La/hbg;ZI)V

    .line 570
    .line 571
    .line 572
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 573
    .line 574
    :cond_16
    return-void
.end method

.method public e(La/s7g;La/hbg;La/fet;I)V
    .locals 20

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    const v0, -0x5b4038d6

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    or-int v0, p4, v0

    .line 24
    .line 25
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/16 v5, 0x20

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    move v4, v5

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v4, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v4

    .line 38
    and-int/lit8 v4, v0, 0x13

    .line 39
    .line 40
    const/16 v6, 0x12

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v7, 0x1

    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    move v4, v7

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v4, v10

    .line 49
    :goto_2
    and-int/lit8 v6, v0, 0x1

    .line 50
    .line 51
    invoke-virtual {v8, v6, v4}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_a

    .line 56
    .line 57
    iget-object v4, v3, La/hbg;->s:La/p7m0;

    .line 58
    .line 59
    shl-int/lit8 v6, v0, 0x3

    .line 60
    .line 61
    and-int/lit8 v6, v6, 0x70

    .line 62
    .line 63
    const/4 v9, 0x6

    .line 64
    invoke-static {v4, v2, v8, v6, v9}, La/gkb;->Q(La/n7m0;La/clz;La/fet;II)La/pz40;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget-object v11, v3, La/hbg;->u:La/p7m0;

    .line 69
    .line 70
    invoke-static {v11, v2, v8, v6, v9}, La/gkb;->Q(La/n7m0;La/clz;La/fet;II)La/pz40;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, La/wl9;

    .line 79
    .line 80
    iget-object v9, v9, La/wl9;->a:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-ge v9, v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-eqz v6, :cond_b

    .line 93
    .line 94
    new-instance v0, La/bag;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    move-object/from16 v1, p0

    .line 98
    .line 99
    move/from16 v4, p4

    .line 100
    .line 101
    invoke-direct/range {v0 .. v5}, La/bag;-><init>(La/kwd;La/s7g;La/hbg;IB)V

    .line 102
    .line 103
    .line 104
    :goto_3
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    sget-object v2, La/u9g;->a:La/u9g;

    .line 112
    .line 113
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_9

    .line 118
    .line 119
    const v1, 0x970efef

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 123
    .line 124
    .line 125
    sget-object v1, La/jm40;->b:La/jm40;

    .line 126
    .line 127
    const/high16 v2, 0x3f800000    # 1.0f

    .line 128
    .line 129
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    sget-object v2, La/qmk;->a:La/zcl;

    .line 134
    .line 135
    const/high16 v2, 0x41000000    # 8.0f

    .line 136
    .line 137
    invoke-static {v1, v2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, La/wl9;

    .line 146
    .line 147
    iget-object v1, v1, La/wl9;->a:Ljava/util/List;

    .line 148
    .line 149
    new-instance v2, Ljava/util/ArrayList;

    .line 150
    .line 151
    const/16 v6, 0xa

    .line 152
    .line 153
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_4

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    check-cast v6, La/vl9;

    .line 175
    .line 176
    new-instance v11, La/yvh0;

    .line 177
    .line 178
    iget-object v6, v6, La/vl9;->a:Ljava/lang/String;

    .line 179
    .line 180
    sget-object v12, La/bwh0;->a:La/bwh0;

    .line 181
    .line 182
    invoke-direct {v11, v6, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_4
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    check-cast v1, La/wl9;

    .line 198
    .line 199
    iget-object v12, v1, La/wl9;->b:La/dxh0;

    .line 200
    .line 201
    new-instance v13, La/a6g;

    .line 202
    .line 203
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    const/16 v18, 0x0

    .line 208
    .line 209
    const/16 v19, 0x1

    .line 210
    .line 211
    const-class v15, La/wl9;

    .line 212
    .line 213
    const-string v16, "currentPageIndex"

    .line 214
    .line 215
    const-string v17, "getCurrentPageIndex()I"

    .line 216
    .line 217
    invoke-direct/range {v13 .. v19}, La/a6g;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 218
    .line 219
    .line 220
    and-int/lit8 v0, v0, 0x70

    .line 221
    .line 222
    if-eq v0, v5, :cond_6

    .line 223
    .line 224
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_5

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_5
    move v7, v10

    .line 232
    :cond_6
    :goto_5
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-nez v7, :cond_7

    .line 237
    .line 238
    sget-object v1, La/ukd;->a:La/cl5;

    .line 239
    .line 240
    if-ne v0, v1, :cond_8

    .line 241
    .line 242
    :cond_7
    new-instance v0, La/x6f;

    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    const/16 v7, 0xa

    .line 246
    .line 247
    const/4 v1, 0x1

    .line 248
    const-class v3, La/hbg;

    .line 249
    .line 250
    const-string v4, "onSegmentSelected"

    .line 251
    .line 252
    const-string v5, "onSegmentSelected(I)V"

    .line 253
    .line 254
    move-object/from16 v2, p2

    .line 255
    .line 256
    invoke-direct/range {v0 .. v7}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_8
    check-cast v0, La/jhy;

    .line 263
    .line 264
    move-object v6, v0

    .line 265
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 266
    .line 267
    const/16 v8, 0x180

    .line 268
    .line 269
    move-object v0, v9

    .line 270
    const/16 v9, 0x10

    .line 271
    .line 272
    sget-object v2, La/gxh0;->a:La/gxh0;

    .line 273
    .line 274
    const/4 v4, 0x0

    .line 275
    move-object/from16 v7, p3

    .line 276
    .line 277
    move-object v1, v11

    .line 278
    move-object v3, v12

    .line 279
    move-object v5, v13

    .line 280
    invoke-static/range {v0 .. v9}, La/ibc;->n(La/mm40;La/a4x;La/hxh0;La/dxh0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_9
    move-object v7, v8

    .line 288
    const v0, 0x97a9af8

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_a
    move-object v7, v8

    .line 299
    invoke-virtual {v7}, La/fet;->X()V

    .line 300
    .line 301
    .line 302
    :goto_6
    invoke-virtual {v7}, La/fet;->u()La/yfe0;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    if-eqz v6, :cond_b

    .line 307
    .line 308
    new-instance v0, La/bag;

    .line 309
    .line 310
    const/4 v5, 0x1

    .line 311
    move-object/from16 v1, p0

    .line 312
    .line 313
    move-object/from16 v2, p1

    .line 314
    .line 315
    move-object/from16 v3, p2

    .line 316
    .line 317
    move/from16 v4, p4

    .line 318
    .line 319
    invoke-direct/range {v0 .. v5}, La/bag;-><init>(La/kwd;La/s7g;La/hbg;IB)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_b
    return-void
.end method

.method public f(Ljava/util/List;La/acj;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/xaj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/xaj;

    .line 7
    .line 8
    iget v1, v0, La/xaj;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/xaj;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xaj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/xaj;-><init>(La/kwd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/xaj;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p3, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/xaj;->m:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, La/xaj;->j:Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object p2, v0, La/xaj;->i:Ljava/io/Serializable;

    .line 43
    .line 44
    check-cast p2, La/mie0;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_4

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_2
    iget-object p1, v0, La/xaj;->i:Ljava/io/Serializable;

    .line 59
    .line 60
    check-cast p1, Ljava/util/List;

    .line 61
    .line 62
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p0}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance v1, La/uu3;

    .line 71
    .line 72
    invoke-direct {v1, p1, p0, v2, v3}, La/uu3;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    iput-object p0, v0, La/xaj;->i:Ljava/io/Serializable;

    .line 76
    .line 77
    iput v4, v0, La/xaj;->m:I

    .line 78
    .line 79
    invoke-virtual {p2, v1, v0}, La/acj;->a(La/uu3;La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, p3, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move-object p1, p0

    .line 87
    :goto_1
    new-instance p0, La/mie0;

    .line 88
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    move-object p2, p0

    .line 97
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_7

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    :try_start_1
    iput-object p2, v0, La/xaj;->i:Ljava/io/Serializable;

    .line 110
    .line 111
    iput-object p1, v0, La/xaj;->j:Ljava/util/Iterator;

    .line 112
    .line 113
    iput v3, v0, La/xaj;->m:I

    .line 114
    .line 115
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    if-ne p0, p3, :cond_5

    .line 120
    .line 121
    :goto_3
    return-object p3

    .line 122
    :goto_4
    iget-object v1, p2, La/mie0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    if-nez v1, :cond_6

    .line 125
    .line 126
    iput-object p0, p2, La/mie0;->a:Ljava/lang/Object;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    .line 130
    .line 131
    invoke-static {v1, p0}, La/tjo;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    iget-object p0, p2, La/mie0;->a:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Ljava/lang/Throwable;

    .line 138
    .line 139
    if-nez p0, :cond_8

    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :cond_8
    throw p0
.end method
