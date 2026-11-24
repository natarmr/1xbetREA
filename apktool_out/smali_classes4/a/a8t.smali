.class public final La/a8t;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/b8t;


# direct methods
.method public synthetic constructor <init>(La/b8t;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a8t;->i:B

    iput-object p1, p0, La/a8t;->k:La/b8t;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a8t;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a8t;->k:La/b8t;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/a8t;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/a8t;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/a8t;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/a8t;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/a8t;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/a8t;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/a8t;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/a8t;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/a8t;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/a8t;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/a8t;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/v8t;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/a8t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a8t;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a8t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/m8t;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/a8t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/a8t;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/a8t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/r8t;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/a8t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/a8t;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/a8t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/l8t;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/a8t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/a8t;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/a8t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/g8t;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/a8t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/a8t;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/a8t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/a8t;->i:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/16 v3, 0x8

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/a8t;->k:La/b8t;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/a8t;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/v8t;

    .line 18
    .line 19
    sget-object v0, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    instance-of p1, p0, La/u8t;

    .line 25
    .line 26
    sget-object v0, La/t8t;->a:La/t8t;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    check-cast p0, La/u8t;

    .line 31
    .line 32
    iget-object p1, p0, La/u8t;->a:La/k7t;

    .line 33
    .line 34
    iget-object v1, p0, La/u8t;->b:Ljava/util/List;

    .line 35
    .line 36
    iget-boolean p0, p0, La/u8t;->c:Z

    .line 37
    .line 38
    sget-object v2, La/b8t;->Q1:[La/iiy;

    .line 39
    .line 40
    invoke-virtual {v5, p1, v1, p0}, La/b8t;->G0(La/k7t;Ljava/util/List;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, La/b8t;->I0()La/a9t;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iput-boolean v4, p0, La/a9t;->B:Z

    .line 48
    .line 49
    iget-object p1, p0, La/a9t;->r:La/p7m0;

    .line 50
    .line 51
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    move-object v1, p0

    .line 56
    check-cast v1, La/v8t;

    .line 57
    .line 58
    invoke-virtual {p1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    instance-of p1, p0, La/s8t;

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    check-cast p0, La/s8t;

    .line 70
    .line 71
    iget-object p1, p0, La/s8t;->a:La/k7t;

    .line 72
    .line 73
    sget-object v1, La/k7t;->g:La/k7t;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, La/k7t;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_2

    .line 80
    .line 81
    new-instance v1, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    sget-object v2, La/b8t;->Q1:[La/iiy;

    .line 87
    .line 88
    invoke-virtual {v5, p1, v1, v6}, La/b8t;->G0(La/k7t;Ljava/util/List;Z)V

    .line 89
    .line 90
    .line 91
    :cond_2
    iget-object p1, p0, La/s8t;->b:La/k7t;

    .line 92
    .line 93
    iget-object v1, p0, La/s8t;->c:La/k7t;

    .line 94
    .line 95
    iget-object p0, p0, La/s8t;->d:Ljava/lang/String;

    .line 96
    .line 97
    sget-object v2, La/b8t;->Q1:[La/iiy;

    .line 98
    .line 99
    invoke-virtual {v5}, La/b8t;->I0()La/a9t;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, La/a9t;->y()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v2, v2, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 111
    .line 112
    invoke-virtual {v2, p1, v1, p0, v6}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->b(La/k7t;La/k7t;Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    iget-object p0, p0, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, La/b8t;->I0()La/a9t;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iput-boolean v4, p0, La/a9t;->B:Z

    .line 129
    .line 130
    iget-object p1, p0, La/a9t;->r:La/p7m0;

    .line 131
    .line 132
    :cond_3
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    move-object v1, p0

    .line 137
    check-cast v1, La/v8t;

    .line 138
    .line 139
    invoke-virtual {p1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-eqz p0, :cond_3

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_5

    .line 151
    .line 152
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 156
    .line 157
    .line 158
    :goto_1
    return-object v7

    .line 159
    :pswitch_0
    iget-object p0, p0, La/a8t;->j:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, La/m8t;

    .line 162
    .line 163
    sget-object v0, La/wne;->a:La/wne;

    .line 164
    .line 165
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-boolean p1, p0, La/m8t;->a:Z

    .line 169
    .line 170
    iget-object v0, p0, La/m8t;->b:Ljava/util/List;

    .line 171
    .line 172
    iget-boolean p0, p0, La/m8t;->c:Z

    .line 173
    .line 174
    sget-object v4, La/b8t;->Q1:[La/iiy;

    .line 175
    .line 176
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    const v8, 0x7f0a0ad9

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v8}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    instance-of v8, v4, La/hg70;

    .line 190
    .line 191
    if-eqz v8, :cond_7

    .line 192
    .line 193
    check-cast v4, La/hg70;

    .line 194
    .line 195
    invoke-virtual {v4}, La/hg70;->H0()La/eg70;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    iget-object v4, v4, La/eg70;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 200
    .line 201
    if-nez p1, :cond_6

    .line 202
    .line 203
    move v3, v6

    .line 204
    :cond_6
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 205
    .line 206
    .line 207
    :cond_7
    if-eqz p1, :cond_c

    .line 208
    .line 209
    if-eqz p0, :cond_8

    .line 210
    .line 211
    invoke-virtual {v5}, La/b8t;->I0()La/a9t;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    const p1, 0x7f130955

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-boolean v3, p0, La/a9t;->z:Z

    .line 226
    .line 227
    if-eqz v3, :cond_8

    .line 228
    .line 229
    new-instance v3, La/wy5;

    .line 230
    .line 231
    invoke-direct {v3, p1}, La/wy5;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    iget-object p1, p0, La/a9t;->k:La/mne;

    .line 239
    .line 240
    iget-object v11, p1, La/mne;->a:La/rwj;

    .line 241
    .line 242
    sget-object v9, La/w8t;->a:La/w8t;

    .line 243
    .line 244
    new-instance v12, La/cbq;

    .line 245
    .line 246
    const/16 p1, 0x17

    .line 247
    .line 248
    invoke-direct {v12, p0, v3, v7, p1}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 249
    .line 250
    .line 251
    const/16 v13, 0xa

    .line 252
    .line 253
    const/4 v10, 0x0

    .line 254
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 255
    .line 256
    .line 257
    iput-boolean v6, p0, La/a9t;->z:Z

    .line 258
    .line 259
    :cond_8
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    new-instance v3, La/t32;

    .line 272
    .line 273
    const/16 v4, 0x1c

    .line 274
    .line 275
    invoke-direct {v3, v4}, La/t32;-><init>(B)V

    .line 276
    .line 277
    .line 278
    if-nez p1, :cond_9

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    new-instance v4, Landroid/os/Handler;

    .line 286
    .line 287
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    invoke-direct {v4, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 292
    .line 293
    .line 294
    new-instance v8, La/b1;

    .line 295
    .line 296
    const/4 v9, 0x2

    .line 297
    invoke-direct {v8, p0, p1, v3, v9}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v8, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 301
    .line 302
    .line 303
    :goto_2
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    iget-object p0, p0, La/c8t;->k:La/jbo;

    .line 308
    .line 309
    iget-object p0, p0, La/jbo;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 310
    .line 311
    invoke-virtual {p0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    iget-object p0, p0, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 319
    .line 320
    invoke-virtual {p0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->getPuzzleList$games_mania()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    if-eqz p1, :cond_a

    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_a
    move-object v0, p0

    .line 332
    :goto_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-eqz p1, :cond_d

    .line 341
    .line 342
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    add-int/lit8 v0, v6, 0x1

    .line 347
    .line 348
    if-ltz v6, :cond_b

    .line 349
    .line 350
    check-cast p1, Ljava/lang/Number;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 353
    .line 354
    .line 355
    iget-object p1, v5, La/b8t;->O1:Ljava/util/List;

    .line 356
    .line 357
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    check-cast p1, Landroid/widget/ImageView;

    .line 362
    .line 363
    const/high16 v1, 0x3f800000    # 1.0f

    .line 364
    .line 365
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 366
    .line 367
    .line 368
    move v6, v0

    .line 369
    goto :goto_4

    .line 370
    :cond_b
    invoke-static {}, La/q3d;->p()V

    .line 371
    .line 372
    .line 373
    throw v7

    .line 374
    :cond_c
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    iget-object p0, p0, La/c8t;->k:La/jbo;

    .line 379
    .line 380
    iget-object p0, p0, La/jbo;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 381
    .line 382
    const/4 p1, 0x4

    .line 383
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 384
    .line 385
    .line 386
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object p0

    .line 389
    :pswitch_1
    iget-object p0, p0, La/a8t;->j:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast p0, La/r8t;

    .line 392
    .line 393
    sget-object v0, La/wne;->a:La/wne;

    .line 394
    .line 395
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    instance-of p1, p0, La/p8t;

    .line 399
    .line 400
    if-eqz p1, :cond_e

    .line 401
    .line 402
    check-cast p0, La/p8t;

    .line 403
    .line 404
    iget-object p1, p0, La/p8t;->a:Ljava/lang/String;

    .line 405
    .line 406
    iget-object v0, p0, La/p8t;->b:Ljava/lang/String;

    .line 407
    .line 408
    iget-object v1, p0, La/p8t;->c:Landroid/graphics/Bitmap;

    .line 409
    .line 410
    iget v2, p0, La/p8t;->d:I

    .line 411
    .line 412
    iget v3, p0, La/p8t;->e:I

    .line 413
    .line 414
    iget v4, p0, La/p8t;->f:I

    .line 415
    .line 416
    iget p0, p0, La/p8t;->g:I

    .line 417
    .line 418
    sget-object v7, La/b8t;->Q1:[La/iiy;

    .line 419
    .line 420
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 421
    .line 422
    invoke-direct {v7, v4, p0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 423
    .line 424
    .line 425
    iput v3, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 426
    .line 427
    iput v2, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 428
    .line 429
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    iget-object p0, p0, La/c8t;->c:Landroid/widget/LinearLayout;

    .line 434
    .line 435
    invoke-virtual {p0, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    iget-object p0, p0, La/c8t;->m:Landroid/widget/TextView;

    .line 443
    .line 444
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    iget-object p0, p0, La/c8t;->h:Landroid/widget/ImageView;

    .line 452
    .line 453
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    iget-object p0, p0, La/c8t;->b:Landroid/widget/TextView;

    .line 461
    .line 462
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    iget-object p0, p0, La/c8t;->c:Landroid/widget/LinearLayout;

    .line 470
    .line 471
    new-instance p1, La/w7t;

    .line 472
    .line 473
    invoke-direct {p1, v5, v6}, La/w7t;-><init>(La/b8t;B)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    iget-object p0, p0, La/c8t;->c:Landroid/widget/LinearLayout;

    .line 484
    .line 485
    invoke-virtual {p0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 486
    .line 487
    .line 488
    goto :goto_5

    .line 489
    :cond_e
    instance-of p1, p0, La/q8t;

    .line 490
    .line 491
    if-eqz p1, :cond_f

    .line 492
    .line 493
    check-cast p0, La/q8t;

    .line 494
    .line 495
    iget-object p1, p0, La/q8t;->a:Ljava/lang/String;

    .line 496
    .line 497
    iget v0, p0, La/q8t;->b:I

    .line 498
    .line 499
    iget v1, p0, La/q8t;->c:I

    .line 500
    .line 501
    iget v2, p0, La/q8t;->d:I

    .line 502
    .line 503
    iget p0, p0, La/q8t;->e:I

    .line 504
    .line 505
    sget-object v3, La/b8t;->Q1:[La/iiy;

    .line 506
    .line 507
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 508
    .line 509
    invoke-direct {v3, v2, p0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 510
    .line 511
    .line 512
    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 513
    .line 514
    iput v0, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 515
    .line 516
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    iget-object p0, p0, La/c8t;->e:Landroid/widget/FrameLayout;

    .line 521
    .line 522
    invoke-virtual {p0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    iget-object p0, p0, La/c8t;->l:Landroid/widget/TextView;

    .line 530
    .line 531
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 535
    .line 536
    .line 537
    move-result-object p0

    .line 538
    iget-object p0, p0, La/c8t;->e:Landroid/widget/FrameLayout;

    .line 539
    .line 540
    new-instance p1, La/w7t;

    .line 541
    .line 542
    invoke-direct {p1, v5, v4}, La/w7t;-><init>(La/b8t;B)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    iget-object p0, p0, La/c8t;->e:Landroid/widget/FrameLayout;

    .line 553
    .line 554
    invoke-virtual {p0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 555
    .line 556
    .line 557
    goto :goto_5

    .line 558
    :cond_f
    instance-of p1, p0, La/o8t;

    .line 559
    .line 560
    if-eqz p1, :cond_10

    .line 561
    .line 562
    sget-object p0, La/b8t;->Q1:[La/iiy;

    .line 563
    .line 564
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    iget-object p0, p0, La/c8t;->c:Landroid/widget/LinearLayout;

    .line 569
    .line 570
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    iget-object p0, p0, La/c8t;->e:Landroid/widget/FrameLayout;

    .line 578
    .line 579
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 583
    .line 584
    .line 585
    goto :goto_5

    .line 586
    :cond_10
    sget-object p1, La/n8t;->a:La/n8t;

    .line 587
    .line 588
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result p0

    .line 592
    if-eqz p0, :cond_11

    .line 593
    .line 594
    :goto_5
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    goto :goto_6

    .line 597
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 598
    .line 599
    .line 600
    :goto_6
    return-object v7

    .line 601
    :pswitch_2
    iget-object p0, p0, La/a8t;->j:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast p0, La/l8t;

    .line 604
    .line 605
    sget-object v0, La/wne;->a:La/wne;

    .line 606
    .line 607
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    instance-of p1, p0, La/i8t;

    .line 611
    .line 612
    if-eqz p1, :cond_12

    .line 613
    .line 614
    sget-object p1, La/b8t;->Q1:[La/iiy;

    .line 615
    .line 616
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    iget-object p1, p1, La/c8t;->f:Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 621
    .line 622
    check-cast p0, La/i8t;

    .line 623
    .line 624
    iget-object p0, p0, La/i8t;->a:Ljava/util/List;

    .line 625
    .line 626
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-virtual {p1, v1, v2, p0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a(JLjava/util/List;)V

    .line 630
    .line 631
    .line 632
    goto/16 :goto_7

    .line 633
    .line 634
    :cond_12
    instance-of p1, p0, La/j8t;

    .line 635
    .line 636
    if-eqz p1, :cond_13

    .line 637
    .line 638
    check-cast p0, La/j8t;

    .line 639
    .line 640
    iget-object p0, p0, La/j8t;->a:Ljava/util/ArrayList;

    .line 641
    .line 642
    sget-object p1, La/b8t;->Q1:[La/iiy;

    .line 643
    .line 644
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    iget-object p1, p1, La/c8t;->f:Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 649
    .line 650
    const-wide/16 v0, 0x258

    .line 651
    .line 652
    invoke-virtual {p1, v0, v1, p0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->b(JLjava/util/List;)V

    .line 653
    .line 654
    .line 655
    goto :goto_7

    .line 656
    :cond_13
    instance-of p1, p0, La/k8t;

    .line 657
    .line 658
    if-eqz p1, :cond_14

    .line 659
    .line 660
    sget-object p0, La/b8t;->Q1:[La/iiy;

    .line 661
    .line 662
    invoke-virtual {v5}, La/b8t;->H0()La/c8t;

    .line 663
    .line 664
    .line 665
    move-result-object p0

    .line 666
    iget-object p0, p0, La/c8t;->f:Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 667
    .line 668
    new-instance p1, Landroid/graphics/Point;

    .line 669
    .line 670
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    int-to-double v3, v0

    .line 675
    const-wide v5, 0x3fc851eb851eb852L    # 0.19

    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    mul-double/2addr v3, v5

    .line 681
    double-to-int v0, v3

    .line 682
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    int-to-double v3, v3

    .line 687
    const-wide v5, 0x3fc47ae147ae147bL    # 0.16

    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    mul-double/2addr v3, v5

    .line 693
    double-to-int v3, v3

    .line 694
    invoke-direct {p1, v0, v3}, Landroid/graphics/Point;-><init>(II)V

    .line 695
    .line 696
    .line 697
    new-instance v0, Landroid/graphics/Point;

    .line 698
    .line 699
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    int-to-double v3, v3

    .line 704
    const-wide v5, 0x3fda3d70a3d70a3dL    # 0.41

    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    mul-double/2addr v3, v5

    .line 710
    double-to-int v3, v3

    .line 711
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    int-to-double v4, v4

    .line 716
    const-wide v6, 0x3fe4cccccccccccdL    # 0.65

    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    mul-double/2addr v4, v6

    .line 722
    double-to-int v4, v4

    .line 723
    invoke-direct {v0, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    .line 724
    .line 725
    .line 726
    new-instance v3, La/j7t;

    .line 727
    .line 728
    const/4 v4, 0x6

    .line 729
    const/4 v5, 0x0

    .line 730
    invoke-direct {v3, p1, v4, v5}, La/j7t;-><init>(Landroid/graphics/Point;IF)V

    .line 731
    .line 732
    .line 733
    new-instance p1, La/j7t;

    .line 734
    .line 735
    invoke-direct {p1, v0, v4, v5}, La/j7t;-><init>(Landroid/graphics/Point;IF)V

    .line 736
    .line 737
    .line 738
    filled-new-array {v3, p1}, [La/j7t;

    .line 739
    .line 740
    .line 741
    move-result-object p1

    .line 742
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object p1

    .line 746
    invoke-virtual {p0, v1, v2, p1}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a(JLjava/util/List;)V

    .line 747
    .line 748
    .line 749
    goto :goto_7

    .line 750
    :cond_14
    sget-object p1, La/h8t;->a:La/h8t;

    .line 751
    .line 752
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result p0

    .line 756
    if-eqz p0, :cond_15

    .line 757
    .line 758
    :goto_7
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 759
    .line 760
    goto :goto_8

    .line 761
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 762
    .line 763
    .line 764
    :goto_8
    return-object v7

    .line 765
    :pswitch_3
    iget-object v0, p0, La/a8t;->j:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v0, La/g8t;

    .line 768
    .line 769
    sget-object v1, La/wne;->a:La/wne;

    .line 770
    .line 771
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    instance-of p1, v0, La/e8t;

    .line 775
    .line 776
    sget-object v1, La/f8t;->a:La/f8t;

    .line 777
    .line 778
    if-eqz p1, :cond_17

    .line 779
    .line 780
    check-cast v0, La/e8t;

    .line 781
    .line 782
    iget-object v5, v0, La/e8t;->a:Ljava/util/ArrayList;

    .line 783
    .line 784
    iget-object v6, v0, La/e8t;->b:Ljava/util/ArrayList;

    .line 785
    .line 786
    iget-object v8, v0, La/e8t;->c:Ljava/lang/String;

    .line 787
    .line 788
    sget-object p1, La/b8t;->Q1:[La/iiy;

    .line 789
    .line 790
    new-instance v4, La/kie0;

    .line 791
    .line 792
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 793
    .line 794
    .line 795
    iget-object v3, p0, La/a8t;->k:La/b8t;

    .line 796
    .line 797
    invoke-virtual {v3}, La/b8t;->I0()La/a9t;

    .line 798
    .line 799
    .line 800
    move-result-object p0

    .line 801
    invoke-virtual {p0}, La/a9t;->y()V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v3}, La/b8t;->H0()La/c8t;

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    iget-object v7, p0, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 809
    .line 810
    new-instance v2, La/co0;

    .line 811
    .line 812
    const/4 v9, 0x6

    .line 813
    invoke-direct/range {v2 .. v9}, La/co0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v7, v2}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->setBonusDiceListener$games_mania(Lkotlin/jvm/functions/Function0;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v3}, La/b8t;->I0()La/a9t;

    .line 820
    .line 821
    .line 822
    move-result-object p0

    .line 823
    iget-object p0, p0, La/a9t;->s:La/p7m0;

    .line 824
    .line 825
    :cond_16
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object p1

    .line 829
    move-object v0, p1

    .line 830
    check-cast v0, La/g8t;

    .line 831
    .line 832
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result p1

    .line 836
    if-eqz p1, :cond_16

    .line 837
    .line 838
    goto :goto_9

    .line 839
    :cond_17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    move-result p0

    .line 843
    if-eqz p0, :cond_18

    .line 844
    .line 845
    :goto_9
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 846
    .line 847
    goto :goto_a

    .line 848
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 849
    .line 850
    .line 851
    :goto_a
    return-object v7

    .line 852
    nop

    .line 853
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
