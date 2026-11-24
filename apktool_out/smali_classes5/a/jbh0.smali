.class public final synthetic La/jbh0;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/jbh0;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/py30;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v2, p0

    .line 8
    check-cast v2, La/gbl0;

    .line 9
    .line 10
    sget-object p0, La/gbl0;->c2:La/lme0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object p0, La/ny30;->a:La/ny30;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    instance-of p0, p1, La/oy30;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    iget-object p0, v2, La/gbl0;->O1:La/gfk0;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    check-cast p1, La/oy30;

    .line 42
    .line 43
    iget-object p1, p1, La/oy30;->a:Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 44
    .line 45
    invoke-static {p0, p1}, La/gfk0;->h(Landroidx/fragment/app/e;Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string p0, "actionMenuDialogFactory"

    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p2

    .line 55
    :cond_2
    sget-object p0, La/ny30;->b:La/ny30;

    .line 56
    .line 57
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    iget-object p0, v2, La/gbl0;->R1:La/xi70;

    .line 64
    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const-string p0, "quickBetDialogNavigator"

    .line 79
    .line 80
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p2

    .line 84
    :cond_4
    sget-object p0, La/ny30;->c:La/ny30;

    .line 85
    .line 86
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_6

    .line 91
    .line 92
    iget-object v0, v2, La/gbl0;->S1:La/wdk0;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    new-instance v1, La/xdk0;

    .line 97
    .line 98
    sget-object v4, La/qek0;->a:La/qek0;

    .line 99
    .line 100
    const p0, 0x7f130e86

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    const/16 v10, 0x7c

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x0

    .line 116
    move-object v3, v1

    .line 117
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 118
    .line 119
    .line 120
    const/16 v7, 0x3fc

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 126
    .line 127
    .line 128
    :goto_0
    invoke-virtual {v2}, La/gbl0;->J0()La/ncl0;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    iget-object p0, p0, La/ncl0;->t:La/f3j;

    .line 133
    .line 134
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-object p1, p0, La/f3j;->d:La/mne;

    .line 143
    .line 144
    iget-object v3, p1, La/mne;->c:La/vs10;

    .line 145
    .line 146
    sget-object v1, La/svs;->a:La/svs;

    .line 147
    .line 148
    new-instance v4, La/lvs;

    .line 149
    .line 150
    const/4 p1, 0x4

    .line 151
    invoke-direct {v4, p0, p2, p1}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 152
    .line 153
    .line 154
    const/16 v5, 0xa

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 158
    .line 159
    .line 160
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_5
    const-string p0, "snackbarManager"

    .line 164
    .line 165
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p2

    .line 169
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 170
    .line 171
    .line 172
    return-object p2
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jbh0;->h:B

    .line 4
    .line 5
    const-string v2, "snackbarManager"

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x1

    .line 10
    const/16 v6, 0x8

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v9, v0, La/xo;->a:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, La/g4z;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, La/yje;

    .line 25
    .line 26
    move-object v10, v9

    .line 27
    check-cast v10, La/ncl0;

    .line 28
    .line 29
    iget-object v1, v10, La/ncl0;->R:La/p7m0;

    .line 30
    .line 31
    invoke-virtual {v10, v7}, La/ncl0;->D(Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    sget-object v12, La/sbl0;->a:La/sbl0;

    .line 39
    .line 40
    iget-object v2, v10, La/ncl0;->o:La/mne;

    .line 41
    .line 42
    iget-object v14, v2, La/mne;->c:La/vs10;

    .line 43
    .line 44
    new-instance v15, La/pnd0;

    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-direct {v15, v10, v0, v5, v2}, La/pnd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    const/16 v16, 0xa

    .line 53
    .line 54
    const/4 v13, 0x0

    .line 55
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 56
    .line 57
    .line 58
    if-eqz v0, :cond_7

    .line 59
    .line 60
    instance-of v2, v0, La/v3z;

    .line 61
    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    iget-object v0, v10, La/ncl0;->c:La/vzg0;

    .line 65
    .line 66
    const-string v2, "KEY_SHOW_BETTING"

    .line 67
    .line 68
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, La/yal0;

    .line 74
    .line 75
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, La/p7m0;

    .line 80
    .line 81
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, La/zqs;

    .line 86
    .line 87
    iget-boolean v12, v2, La/zqs;->f:Z

    .line 88
    .line 89
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, La/p7m0;

    .line 94
    .line 95
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, La/zqs;

    .line 100
    .line 101
    iget-wide v13, v2, La/zqs;->b:J

    .line 102
    .line 103
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, La/p7m0;

    .line 108
    .line 109
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, La/zqs;

    .line 114
    .line 115
    iget-wide v2, v2, La/zqs;->d:J

    .line 116
    .line 117
    sget-object v21, La/tef0;->a:La/tef0;

    .line 118
    .line 119
    sget-object v4, La/pb10;->c:La/xuz;

    .line 120
    .line 121
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, La/p7m0;

    .line 126
    .line 127
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, La/zqs;

    .line 132
    .line 133
    iget-wide v6, v4, La/zqs;->c:J

    .line 134
    .line 135
    new-instance v11, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 136
    .line 137
    const-wide/16 v17, -0x1

    .line 138
    .line 139
    move-wide/from16 v19, v2

    .line 140
    .line 141
    move-wide v15, v6

    .line 142
    invoke-direct/range {v11 .. v21}, Lorg/xplatform/related/api/presentation/RelatedParams;-><init>(ZJJJJLa/tef0;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {v0, v11}, La/yal0;-><init>(Lorg/xplatform/related/api/presentation/RelatedParams;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, La/p7m0;

    .line 163
    .line 164
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    move-object v6, v1

    .line 169
    check-cast v6, La/zqs;

    .line 170
    .line 171
    const/16 v18, 0x0

    .line 172
    .line 173
    const/16 v19, 0x3be

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const-wide/16 v8, 0x0

    .line 177
    .line 178
    const-wide/16 v10, 0x0

    .line 179
    .line 180
    const-wide/16 v12, 0x0

    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x1

    .line 184
    const-wide/16 v16, 0x0

    .line 185
    .line 186
    invoke-static/range {v6 .. v19}, La/zqs;->a(La/zqs;ZJJJZZJLa/vzj0;I)La/zqs;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v0, La/p7m0;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_0
    instance-of v2, v0, La/w3z;

    .line 201
    .line 202
    if-eqz v2, :cond_1

    .line 203
    .line 204
    check-cast v0, La/w3z;

    .line 205
    .line 206
    iget-object v0, v0, La/w3z;->a:La/k9s;

    .line 207
    .line 208
    iget-wide v11, v0, La/k9s;->a:J

    .line 209
    .line 210
    iget-boolean v13, v0, La/k9s;->z:Z

    .line 211
    .line 212
    iget-wide v14, v0, La/k9s;->H:J

    .line 213
    .line 214
    iget-wide v1, v0, La/k9s;->s:J

    .line 215
    .line 216
    iget-wide v3, v0, La/k9s;->B:J

    .line 217
    .line 218
    iget-object v5, v0, La/k9s;->Z:La/vzj0;

    .line 219
    .line 220
    iget-object v0, v0, La/k9s;->l:Ljava/lang/String;

    .line 221
    .line 222
    move-object/from16 v21, v0

    .line 223
    .line 224
    move-wide/from16 v16, v1

    .line 225
    .line 226
    move-wide/from16 v18, v3

    .line 227
    .line 228
    move-object/from16 v20, v5

    .line 229
    .line 230
    invoke-virtual/range {v10 .. v21}, La/ncl0;->y(JZJJJLa/vzj0;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_1
    instance-of v2, v0, La/y3z;

    .line 236
    .line 237
    if-eqz v2, :cond_2

    .line 238
    .line 239
    check-cast v0, La/y3z;

    .line 240
    .line 241
    iget-wide v12, v0, La/y3z;->a:J

    .line 242
    .line 243
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sget-object v1, La/tbl0;->a:La/tbl0;

    .line 248
    .line 249
    new-instance v18, La/wn10;

    .line 250
    .line 251
    const/16 v15, 0x13

    .line 252
    .line 253
    move-object v14, v5

    .line 254
    move-object v11, v10

    .line 255
    move-object/from16 v10, v18

    .line 256
    .line 257
    invoke-direct/range {v10 .. v15}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 258
    .line 259
    .line 260
    const/16 v19, 0xe

    .line 261
    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    move-object v14, v0

    .line 267
    move-object v15, v1

    .line 268
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 269
    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_2
    move-object v14, v5

    .line 274
    instance-of v2, v0, La/z3z;

    .line 275
    .line 276
    if-eqz v2, :cond_3

    .line 277
    .line 278
    check-cast v0, La/z3z;

    .line 279
    .line 280
    iget-wide v2, v0, La/z3z;->a:J

    .line 281
    .line 282
    new-instance v0, La/zal0;

    .line 283
    .line 284
    invoke-direct {v0, v2, v3}, La/zal0;-><init>(J)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v14, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_3
    instance-of v1, v0, La/a4z;

    .line 296
    .line 297
    if-eqz v1, :cond_4

    .line 298
    .line 299
    check-cast v0, La/a4z;

    .line 300
    .line 301
    iget-object v0, v0, La/a4z;->a:La/k9s;

    .line 302
    .line 303
    iget-wide v11, v0, La/k9s;->a:J

    .line 304
    .line 305
    iget-boolean v13, v0, La/k9s;->z:Z

    .line 306
    .line 307
    iget-wide v14, v0, La/k9s;->H:J

    .line 308
    .line 309
    iget-wide v1, v0, La/k9s;->s:J

    .line 310
    .line 311
    iget-wide v3, v0, La/k9s;->B:J

    .line 312
    .line 313
    iget-object v5, v0, La/k9s;->Z:La/vzj0;

    .line 314
    .line 315
    iget-object v0, v0, La/k9s;->l:Ljava/lang/String;

    .line 316
    .line 317
    move-object/from16 v21, v0

    .line 318
    .line 319
    move-wide/from16 v16, v1

    .line 320
    .line 321
    move-wide/from16 v18, v3

    .line 322
    .line 323
    move-object/from16 v20, v5

    .line 324
    .line 325
    invoke-virtual/range {v10 .. v21}, La/ncl0;->y(JZJJJLa/vzj0;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_4
    instance-of v1, v0, La/c4z;

    .line 331
    .line 332
    if-eqz v1, :cond_5

    .line 333
    .line 334
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    check-cast v2, La/p7m0;

    .line 343
    .line 344
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    move-object v15, v2

    .line 349
    check-cast v15, La/zqs;

    .line 350
    .line 351
    check-cast v0, La/c4z;

    .line 352
    .line 353
    iget-wide v2, v0, La/c4z;->b:J

    .line 354
    .line 355
    const/16 v27, 0x0

    .line 356
    .line 357
    const/16 v28, 0x23f

    .line 358
    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const-wide/16 v17, 0x0

    .line 362
    .line 363
    const-wide/16 v19, 0x0

    .line 364
    .line 365
    const-wide/16 v21, 0x0

    .line 366
    .line 367
    const/16 v23, 0x0

    .line 368
    .line 369
    const/16 v24, 0x1

    .line 370
    .line 371
    move-wide/from16 v25, v2

    .line 372
    .line 373
    invoke-static/range {v15 .. v28}, La/zqs;->a(La/zqs;ZJJJZZJLa/vzj0;I)La/zqs;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v1, La/p7m0;

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v14, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    goto :goto_0

    .line 386
    :cond_5
    instance-of v1, v0, La/d4z;

    .line 387
    .line 388
    if-eqz v1, :cond_6

    .line 389
    .line 390
    check-cast v0, La/d4z;

    .line 391
    .line 392
    iget-wide v12, v0, La/d4z;->a:J

    .line 393
    .line 394
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    sget-object v1, La/tbl0;->a:La/tbl0;

    .line 399
    .line 400
    new-instance v4, La/wn10;

    .line 401
    .line 402
    const/16 v15, 0x13

    .line 403
    .line 404
    move-object v11, v10

    .line 405
    move-object v10, v4

    .line 406
    invoke-direct/range {v10 .. v15}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 407
    .line 408
    .line 409
    const/16 v5, 0xe

    .line 410
    .line 411
    const/4 v2, 0x0

    .line 412
    const/4 v3, 0x0

    .line 413
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 414
    .line 415
    .line 416
    goto :goto_0

    .line 417
    :cond_6
    instance-of v0, v0, La/e4z;

    .line 418
    .line 419
    if-eqz v0, :cond_7

    .line 420
    .line 421
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v10}, La/ncl0;->w()La/qz40;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    check-cast v1, La/p7m0;

    .line 430
    .line 431
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    move-object v15, v1

    .line 436
    check-cast v15, La/zqs;

    .line 437
    .line 438
    const/16 v27, 0x0

    .line 439
    .line 440
    const/16 v28, 0x23f

    .line 441
    .line 442
    const/16 v16, 0x0

    .line 443
    .line 444
    const-wide/16 v17, 0x0

    .line 445
    .line 446
    const-wide/16 v19, 0x0

    .line 447
    .line 448
    const-wide/16 v21, 0x0

    .line 449
    .line 450
    const/16 v23, 0x0

    .line 451
    .line 452
    const/16 v24, 0x0

    .line 453
    .line 454
    const-wide/16 v25, 0x0

    .line 455
    .line 456
    invoke-static/range {v15 .. v28}, La/zqs;->a(La/zqs;ZJJJZZJLa/vzj0;I)La/zqs;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    check-cast v0, La/p7m0;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v14, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    iget-object v0, v10, La/ncl0;->N:La/p7m0;

    .line 469
    .line 470
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    check-cast v1, La/wqs;

    .line 475
    .line 476
    new-instance v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 477
    .line 478
    sget-object v5, La/dja;->c:La/dja;

    .line 479
    .line 480
    invoke-direct {v2, v5, v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 481
    .line 482
    .line 483
    invoke-static {v1, v14, v7, v2, v4}, La/wqs;->a(La/wqs;La/xqs;ILorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;I)La/wqs;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-virtual {v0, v14, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 491
    .line 492
    goto :goto_1

    .line 493
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 494
    .line 495
    .line 496
    const/4 v8, 0x0

    .line 497
    :goto_1
    return-object v8

    .line 498
    :pswitch_0
    invoke-direct/range {p0 .. p2}, La/jbh0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    return-object v0

    .line 503
    :pswitch_1
    move-object/from16 v0, p1

    .line 504
    .line 505
    check-cast v0, La/zus;

    .line 506
    .line 507
    move-object/from16 v1, p2

    .line 508
    .line 509
    check-cast v1, La/yje;

    .line 510
    .line 511
    check-cast v9, La/gbl0;

    .line 512
    .line 513
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 514
    .line 515
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    iget-object v1, v1, La/z4r;->e:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;

    .line 520
    .line 521
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->v(La/zus;)V

    .line 522
    .line 523
    .line 524
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_2
    move-object/from16 v0, p1

    .line 528
    .line 529
    check-cast v0, La/crs;

    .line 530
    .line 531
    move-object/from16 v1, p2

    .line 532
    .line 533
    check-cast v1, La/yje;

    .line 534
    .line 535
    check-cast v9, La/gbl0;

    .line 536
    .line 537
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 538
    .line 539
    instance-of v1, v0, La/brs;

    .line 540
    .line 541
    if-eqz v1, :cond_a

    .line 542
    .line 543
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    iget-object v1, v1, La/z4r;->d:Lorg/xplatform/sportgame/core/presentation/GameScreenRelatedContainerView;

    .line 548
    .line 549
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    iget-object v1, v1, La/z4r;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;

    .line 557
    .line 558
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    iget-object v1, v1, La/z4r;->d:Lorg/xplatform/sportgame/core/presentation/GameScreenRelatedContainerView;

    .line 566
    .line 567
    check-cast v0, La/brs;

    .line 568
    .line 569
    iget-object v0, v0, La/brs;->a:La/xef0;

    .line 570
    .line 571
    instance-of v2, v0, La/vef0;

    .line 572
    .line 573
    if-eqz v2, :cond_8

    .line 574
    .line 575
    check-cast v0, La/vef0;

    .line 576
    .line 577
    invoke-virtual {v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    iget-object v2, v2, La/hku0;->c:Landroidx/constraintlayout/widget/Group;

    .line 582
    .line 583
    invoke-virtual {v2, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    iget-object v2, v2, La/hku0;->d:Landroid/widget/TextView;

    .line 591
    .line 592
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    iget-object v1, v1, La/hku0;->d:Landroid/widget/TextView;

    .line 600
    .line 601
    iget-object v0, v0, La/vef0;->a:Ljava/lang/String;

    .line 602
    .line 603
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 604
    .line 605
    .line 606
    goto :goto_3

    .line 607
    :cond_8
    instance-of v2, v0, La/wef0;

    .line 608
    .line 609
    if-eqz v2, :cond_9

    .line 610
    .line 611
    check-cast v0, La/wef0;

    .line 612
    .line 613
    invoke-virtual {v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    iget-object v2, v2, La/hku0;->c:Landroidx/constraintlayout/widget/Group;

    .line 618
    .line 619
    invoke-virtual {v2, v7}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    iget-object v2, v2, La/hku0;->d:Landroid/widget/TextView;

    .line 627
    .line 628
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    iget-object v2, v2, La/hku0;->e:Landroid/widget/TextView;

    .line 636
    .line 637
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    iget-object v1, v1, La/hku0;->e:Landroid/widget/TextView;

    .line 645
    .line 646
    iget-object v0, v0, La/wef0;->b:Ljava/lang/String;

    .line 647
    .line 648
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 649
    .line 650
    .line 651
    goto :goto_3

    .line 652
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 653
    .line 654
    .line 655
    :goto_2
    const/4 v8, 0x0

    .line 656
    goto :goto_4

    .line 657
    :cond_a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    sget-object v1, La/ars;->a:La/ars;

    .line 661
    .line 662
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    if-eqz v0, :cond_b

    .line 667
    .line 668
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    iget-object v0, v0, La/z4r;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;

    .line 673
    .line 674
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    iget-object v0, v0, La/z4r;->d:Lorg/xplatform/sportgame/core/presentation/GameScreenRelatedContainerView;

    .line 682
    .line 683
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 684
    .line 685
    .line 686
    :goto_3
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    goto :goto_4

    .line 689
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 690
    .line 691
    .line 692
    goto :goto_2

    .line 693
    :goto_4
    return-object v8

    .line 694
    :pswitch_3
    move-object/from16 v0, p1

    .line 695
    .line 696
    check-cast v0, La/abl0;

    .line 697
    .line 698
    move-object/from16 v1, p2

    .line 699
    .line 700
    check-cast v1, La/yje;

    .line 701
    .line 702
    move-object v12, v9

    .line 703
    check-cast v12, La/gbl0;

    .line 704
    .line 705
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 706
    .line 707
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    sget-object v1, La/ual0;->a:La/ual0;

    .line 711
    .line 712
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    if-eqz v3, :cond_c

    .line 717
    .line 718
    goto/16 :goto_9

    .line 719
    .line 720
    :cond_c
    instance-of v3, v0, La/val0;

    .line 721
    .line 722
    const-string v4, "subGamesFragmentFactory"

    .line 723
    .line 724
    const-string v9, "SUB_GAME_FRAGMENT_TAG"

    .line 725
    .line 726
    if-eqz v3, :cond_12

    .line 727
    .line 728
    check-cast v0, La/val0;

    .line 729
    .line 730
    iget-wide v14, v0, La/val0;->a:J

    .line 731
    .line 732
    iget-wide v2, v0, La/val0;->b:J

    .line 733
    .line 734
    iget-boolean v6, v0, La/val0;->c:Z

    .line 735
    .line 736
    iget-object v10, v0, La/val0;->d:Ljava/lang/String;

    .line 737
    .line 738
    move v11, v7

    .line 739
    const/16 v23, 0x0

    .line 740
    .line 741
    iget-wide v7, v0, La/val0;->e:J

    .line 742
    .line 743
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    iget-object v13, v12, La/gbl0;->N1:La/s9m0;

    .line 748
    .line 749
    if-eqz v13, :cond_11

    .line 750
    .line 751
    invoke-virtual {v0, v9}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    if-nez v0, :cond_10

    .line 756
    .line 757
    iget-object v0, v12, La/gbl0;->N1:La/s9m0;

    .line 758
    .line 759
    if-eqz v0, :cond_f

    .line 760
    .line 761
    invoke-virtual {v12}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    iget-boolean v0, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->g:Z

    .line 766
    .line 767
    if-eqz v0, :cond_d

    .line 768
    .line 769
    new-instance v0, La/lq2;

    .line 770
    .line 771
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 772
    .line 773
    .line 774
    :goto_5
    move-object/from16 v20, v0

    .line 775
    .line 776
    goto :goto_6

    .line 777
    :cond_d
    new-instance v0, La/zq2;

    .line 778
    .line 779
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 780
    .line 781
    .line 782
    goto :goto_5

    .line 783
    :goto_6
    new-instance v13, Lorg/xplatform/sportgame/subgames/api/SubGamesParams;

    .line 784
    .line 785
    move-wide/from16 v16, v2

    .line 786
    .line 787
    move/from16 v22, v6

    .line 788
    .line 789
    move-wide/from16 v18, v7

    .line 790
    .line 791
    move-object/from16 v21, v10

    .line 792
    .line 793
    invoke-direct/range {v13 .. v22}, Lorg/xplatform/sportgame/subgames/api/SubGamesParams;-><init>(JJJLa/ms2;Ljava/lang/String;Z)V

    .line 794
    .line 795
    .line 796
    sget-object v0, La/eym0;->S1:La/g9m0;

    .line 797
    .line 798
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    new-instance v0, La/eym0;

    .line 802
    .line 803
    invoke-direct {v0}, La/eym0;-><init>()V

    .line 804
    .line 805
    .line 806
    sget-object v2, La/eym0;->U1:[La/iiy;

    .line 807
    .line 808
    aget-object v2, v2, v11

    .line 809
    .line 810
    iget-object v3, v0, La/eym0;->P1:La/khf0;

    .line 811
    .line 812
    invoke-virtual {v3, v0, v2, v13}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    new-instance v3, La/zb5;

    .line 823
    .line 824
    invoke-direct {v3, v2}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12}, La/gbl0;->I0()La/z4r;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    iget-object v2, v2, La/z4r;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;

    .line 832
    .line 833
    invoke-virtual {v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->getFragmentContainerId()I

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    iget-object v6, v12, La/gbl0;->N1:La/s9m0;

    .line 838
    .line 839
    if-eqz v6, :cond_e

    .line 840
    .line 841
    invoke-virtual {v3, v2, v0, v9, v5}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v3}, La/zb5;->f()V

    .line 845
    .line 846
    .line 847
    goto :goto_7

    .line 848
    :cond_e
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    throw v23

    .line 852
    :cond_f
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    throw v23

    .line 856
    :cond_10
    :goto_7
    invoke-virtual {v12}, La/gbl0;->I0()La/z4r;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    iget-object v0, v0, La/z4r;->d:Lorg/xplatform/sportgame/core/presentation/GameScreenRelatedContainerView;

    .line 861
    .line 862
    invoke-virtual {v0}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getRelatedGamesList()Landroidx/compose/ui/platform/ComposeView;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    invoke-virtual {v0}, La/x1;->e()V

    .line 867
    .line 868
    .line 869
    goto/16 :goto_8

    .line 870
    .line 871
    :cond_11
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v23

    .line 875
    :cond_12
    const/16 v23, 0x0

    .line 876
    .line 877
    instance-of v3, v0, La/yal0;

    .line 878
    .line 879
    if-eqz v3, :cond_15

    .line 880
    .line 881
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    iget-object v3, v12, La/gbl0;->N1:La/s9m0;

    .line 886
    .line 887
    if-eqz v3, :cond_14

    .line 888
    .line 889
    invoke-virtual {v2, v9}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    if-eqz v2, :cond_13

    .line 894
    .line 895
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    new-instance v4, La/zb5;

    .line 903
    .line 904
    invoke-direct {v4, v3}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v4, v2}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v4}, La/zb5;->f()V

    .line 911
    .line 912
    .line 913
    :cond_13
    check-cast v0, La/yal0;

    .line 914
    .line 915
    iget-object v0, v0, La/yal0;->a:Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 916
    .line 917
    invoke-virtual {v12}, La/gbl0;->I0()La/z4r;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    iget-object v2, v2, La/z4r;->d:Lorg/xplatform/sportgame/core/presentation/GameScreenRelatedContainerView;

    .line 922
    .line 923
    invoke-virtual {v2}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getRelatedGamesList()Landroidx/compose/ui/platform/ComposeView;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    new-instance v3, La/mz7;

    .line 928
    .line 929
    invoke-direct {v3, v12, v0, v6}, La/mz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 930
    .line 931
    .line 932
    new-instance v0, La/ugd;

    .line 933
    .line 934
    const v4, -0x61b05945

    .line 935
    .line 936
    .line 937
    invoke-direct {v0, v4, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    move-object/from16 v3, v23

    .line 941
    .line 942
    invoke-static {v2, v3, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 943
    .line 944
    .line 945
    goto/16 :goto_8

    .line 946
    .line 947
    :cond_14
    move-object/from16 v3, v23

    .line 948
    .line 949
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    throw v3

    .line 953
    :cond_15
    instance-of v3, v0, La/wal0;

    .line 954
    .line 955
    if-eqz v3, :cond_17

    .line 956
    .line 957
    iget-object v10, v12, La/gbl0;->S1:La/wdk0;

    .line 958
    .line 959
    if-eqz v10, :cond_16

    .line 960
    .line 961
    new-instance v13, La/xdk0;

    .line 962
    .line 963
    sget-object v14, La/rek0;->b:La/rek0;

    .line 964
    .line 965
    check-cast v0, La/wal0;

    .line 966
    .line 967
    iget v0, v0, La/wal0;->a:I

    .line 968
    .line 969
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v15

    .line 973
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    const/16 v19, 0x0

    .line 977
    .line 978
    const/16 v20, 0x7c

    .line 979
    .line 980
    const/16 v16, 0x0

    .line 981
    .line 982
    const/16 v17, 0x0

    .line 983
    .line 984
    const/16 v18, 0x0

    .line 985
    .line 986
    invoke-direct/range {v13 .. v20}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 987
    .line 988
    .line 989
    const/16 v17, 0x3fc

    .line 990
    .line 991
    move-object v11, v13

    .line 992
    const/4 v13, 0x0

    .line 993
    const/4 v14, 0x0

    .line 994
    const/4 v15, 0x0

    .line 995
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 996
    .line 997
    .line 998
    goto :goto_8

    .line 999
    :cond_16
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    const/16 v23, 0x0

    .line 1003
    .line 1004
    throw v23

    .line 1005
    :cond_17
    instance-of v2, v0, La/xal0;

    .line 1006
    .line 1007
    if-eqz v2, :cond_18

    .line 1008
    .line 1009
    check-cast v0, La/xal0;

    .line 1010
    .line 1011
    iget v2, v0, La/xal0;->a:I

    .line 1012
    .line 1013
    iget-object v0, v0, La/xal0;->b:Ljava/util/List;

    .line 1014
    .line 1015
    new-instance v3, La/c0x;

    .line 1016
    .line 1017
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v4

    .line 1021
    invoke-direct {v3, v2, v4, v0}, La/c0x;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_8

    .line 1028
    :cond_18
    instance-of v2, v0, La/zal0;

    .line 1029
    .line 1030
    if-eqz v2, :cond_19

    .line 1031
    .line 1032
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v2

    .line 1036
    check-cast v0, La/zal0;

    .line 1037
    .line 1038
    iget-wide v3, v0, La/zal0;->a:J

    .line 1039
    .line 1040
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    new-instance v3, Lkotlin/Pair;

    .line 1045
    .line 1046
    const-string v4, "BUNDLE_KEY_GAME_ID"

    .line 1047
    .line 1048
    invoke-direct {v3, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    const-string v3, "REQUEST_KEY_UPDATE_GAME_ID"

    .line 1060
    .line 1061
    invoke-virtual {v2, v0, v3}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_8

    .line 1065
    :cond_19
    sget-object v2, La/tal0;->a:La/tal0;

    .line 1066
    .line 1067
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v0

    .line 1071
    if-eqz v0, :cond_1a

    .line 1072
    .line 1073
    invoke-virtual {v12}, La/gbl0;->I0()La/z4r;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    iget-object v0, v0, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1078
    .line 1079
    invoke-virtual {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->B()V

    .line 1080
    .line 1081
    .line 1082
    :goto_8
    invoke-virtual {v12}, La/gbl0;->J0()La/ncl0;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    iget-object v0, v0, La/ncl0;->R:La/p7m0;

    .line 1087
    .line 1088
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    const/4 v3, 0x0

    .line 1092
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    :goto_9
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1096
    .line 1097
    goto :goto_a

    .line 1098
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 1099
    .line 1100
    .line 1101
    const/4 v8, 0x0

    .line 1102
    :goto_a
    return-object v8

    .line 1103
    :pswitch_4
    move-object/from16 v0, p1

    .line 1104
    .line 1105
    check-cast v0, La/gsr;

    .line 1106
    .line 1107
    move-object/from16 v1, p2

    .line 1108
    .line 1109
    check-cast v1, La/yje;

    .line 1110
    .line 1111
    check-cast v9, La/gbl0;

    .line 1112
    .line 1113
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 1114
    .line 1115
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1120
    .line 1121
    iget-object v2, v0, La/gsr;->a:Ljava/util/ArrayList;

    .line 1122
    .line 1123
    iput-object v2, v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->o1:Ljava/util/List;

    .line 1124
    .line 1125
    iget-object v1, v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->B:La/hsr;

    .line 1126
    .line 1127
    if-eqz v1, :cond_1c

    .line 1128
    .line 1129
    iget-object v1, v1, La/zx5;->n:Ljava/lang/Object;

    .line 1130
    .line 1131
    check-cast v1, La/yz3;

    .line 1132
    .line 1133
    iget-object v3, v1, La/yz3;->f:Ljava/util/List;

    .line 1134
    .line 1135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1139
    .line 1140
    .line 1141
    move-result v3

    .line 1142
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1143
    .line 1144
    .line 1145
    move-result v4

    .line 1146
    if-ne v3, v4, :cond_1b

    .line 1147
    .line 1148
    goto :goto_b

    .line 1149
    :cond_1b
    const/4 v3, 0x0

    .line 1150
    invoke-virtual {v1, v2, v3}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 1151
    .line 1152
    .line 1153
    :cond_1c
    :goto_b
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1158
    .line 1159
    iget-boolean v0, v0, La/gsr;->b:Z

    .line 1160
    .line 1161
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->setTabsVisibility(Z)V

    .line 1162
    .line 1163
    .line 1164
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1165
    .line 1166
    return-object v0

    .line 1167
    :pswitch_5
    move-object/from16 v0, p1

    .line 1168
    .line 1169
    check-cast v0, La/prs;

    .line 1170
    .line 1171
    move-object/from16 v1, p2

    .line 1172
    .line 1173
    check-cast v1, La/yje;

    .line 1174
    .line 1175
    check-cast v9, La/gbl0;

    .line 1176
    .line 1177
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 1178
    .line 1179
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v1

    .line 1183
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1184
    .line 1185
    iget-object v2, v0, La/prs;->a:La/r0s;

    .line 1186
    .line 1187
    iget-object v2, v2, La/r0s;->a:Ljava/util/ArrayList;

    .line 1188
    .line 1189
    invoke-virtual {v1, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->P(Ljava/util/ArrayList;)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v1

    .line 1196
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1197
    .line 1198
    iget-object v2, v0, La/prs;->b:La/d0k0;

    .line 1199
    .line 1200
    invoke-virtual {v1, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->R(La/d0k0;)V

    .line 1201
    .line 1202
    .line 1203
    iget-object v1, v9, La/gbl0;->a2:La/n0o0;

    .line 1204
    .line 1205
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v1

    .line 1209
    check-cast v1, La/lnd;

    .line 1210
    .line 1211
    iget-object v0, v0, La/prs;->a:La/r0s;

    .line 1212
    .line 1213
    iget-object v0, v0, La/r0s;->b:Ljava/util/ArrayList;

    .line 1214
    .line 1215
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 1216
    .line 1217
    .line 1218
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1219
    .line 1220
    return-object v0

    .line 1221
    :pswitch_6
    move-object/from16 v0, p1

    .line 1222
    .line 1223
    check-cast v0, La/dus;

    .line 1224
    .line 1225
    move-object/from16 v1, p2

    .line 1226
    .line 1227
    check-cast v1, La/yje;

    .line 1228
    .line 1229
    check-cast v9, La/gbl0;

    .line 1230
    .line 1231
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 1232
    .line 1233
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1234
    .line 1235
    .line 1236
    if-eqz v0, :cond_1e

    .line 1237
    .line 1238
    instance-of v1, v0, La/cus;

    .line 1239
    .line 1240
    if-eqz v1, :cond_1d

    .line 1241
    .line 1242
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v1

    .line 1246
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1247
    .line 1248
    check-cast v0, La/cus;

    .line 1249
    .line 1250
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->J(La/cus;)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_c

    .line 1254
    :cond_1d
    instance-of v1, v0, La/bus;

    .line 1255
    .line 1256
    if-eqz v1, :cond_1e

    .line 1257
    .line 1258
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v1

    .line 1262
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1263
    .line 1264
    check-cast v0, La/bus;

    .line 1265
    .line 1266
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->H(La/bus;)V

    .line 1267
    .line 1268
    .line 1269
    :goto_c
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1270
    .line 1271
    goto :goto_d

    .line 1272
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 1273
    .line 1274
    .line 1275
    const/4 v8, 0x0

    .line 1276
    :goto_d
    return-object v8

    .line 1277
    :pswitch_7
    move-object/from16 v0, p1

    .line 1278
    .line 1279
    check-cast v0, Ljava/lang/Boolean;

    .line 1280
    .line 1281
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1282
    .line 1283
    .line 1284
    move-result v0

    .line 1285
    move-object/from16 v1, p2

    .line 1286
    .line 1287
    check-cast v1, La/yje;

    .line 1288
    .line 1289
    check-cast v9, La/gbl0;

    .line 1290
    .line 1291
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 1292
    .line 1293
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v1

    .line 1297
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1298
    .line 1299
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->O(Z)V

    .line 1300
    .line 1301
    .line 1302
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1303
    .line 1304
    return-object v0

    .line 1305
    :pswitch_8
    move v11, v7

    .line 1306
    move-object/from16 v0, p1

    .line 1307
    .line 1308
    check-cast v0, La/ucs;

    .line 1309
    .line 1310
    move-object/from16 v1, p2

    .line 1311
    .line 1312
    check-cast v1, La/yje;

    .line 1313
    .line 1314
    check-cast v9, La/gbl0;

    .line 1315
    .line 1316
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 1317
    .line 1318
    invoke-virtual {v9}, La/gbl0;->I0()La/z4r;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1323
    .line 1324
    invoke-virtual {v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBackgroundView()Landroid/widget/ImageView;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    invoke-virtual {v9, v0, v1, v11}, La/gbl0;->K0(La/ucs;Landroid/widget/ImageView;I)V

    .line 1329
    .line 1330
    .line 1331
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1332
    .line 1333
    return-object v0

    .line 1334
    :pswitch_9
    move-object/from16 v0, p1

    .line 1335
    .line 1336
    check-cast v0, La/zy5;

    .line 1337
    .line 1338
    move-object/from16 v1, p2

    .line 1339
    .line 1340
    check-cast v1, La/yje;

    .line 1341
    .line 1342
    move-object v14, v9

    .line 1343
    check-cast v14, La/tyk0;

    .line 1344
    .line 1345
    iget-object v1, v14, La/tyk0;->v:La/mne;

    .line 1346
    .line 1347
    if-nez v0, :cond_1f

    .line 1348
    .line 1349
    goto/16 :goto_e

    .line 1350
    .line 1351
    :cond_1f
    instance-of v2, v0, La/qy5;

    .line 1352
    .line 1353
    if-eqz v2, :cond_20

    .line 1354
    .line 1355
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    new-instance v16, La/gvj0;

    .line 1360
    .line 1361
    const/16 v18, 0x0

    .line 1362
    .line 1363
    const/16 v19, 0x14

    .line 1364
    .line 1365
    const/4 v13, 0x1

    .line 1366
    const-class v15, La/tyk0;

    .line 1367
    .line 1368
    move-object/from16 v12, v16

    .line 1369
    .line 1370
    const-string v16, "handleGameError"

    .line 1371
    .line 1372
    const-string v17, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1373
    .line 1374
    invoke-direct/range {v12 .. v19}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1375
    .line 1376
    .line 1377
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 1378
    .line 1379
    new-instance v2, La/oyk0;

    .line 1380
    .line 1381
    const/4 v3, 0x0

    .line 1382
    invoke-direct {v2, v14, v3, v5}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 1383
    .line 1384
    .line 1385
    const/16 v20, 0xa

    .line 1386
    .line 1387
    const/16 v17, 0x0

    .line 1388
    .line 1389
    move-object v15, v0

    .line 1390
    move-object/from16 v18, v1

    .line 1391
    .line 1392
    move-object/from16 v19, v2

    .line 1393
    .line 1394
    move-object/from16 v16, v12

    .line 1395
    .line 1396
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1397
    .line 1398
    .line 1399
    iget-object v0, v14, La/tyk0;->x:La/itt;

    .line 1400
    .line 1401
    invoke-virtual {v0}, La/itt;->a()D

    .line 1402
    .line 1403
    .line 1404
    move-result-wide v0

    .line 1405
    invoke-virtual {v14, v0, v1}, La/tyk0;->y(D)V

    .line 1406
    .line 1407
    .line 1408
    goto/16 :goto_e

    .line 1409
    .line 1410
    :cond_20
    instance-of v2, v0, La/yy5;

    .line 1411
    .line 1412
    if-eqz v2, :cond_22

    .line 1413
    .line 1414
    iget-object v0, v14, La/tyk0;->B:La/bby;

    .line 1415
    .line 1416
    if-eqz v0, :cond_21

    .line 1417
    .line 1418
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 1419
    .line 1420
    .line 1421
    move-result v0

    .line 1422
    if-ne v0, v5, :cond_21

    .line 1423
    .line 1424
    goto/16 :goto_e

    .line 1425
    .line 1426
    :cond_21
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v0

    .line 1430
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 1431
    .line 1432
    new-instance v16, La/gvj0;

    .line 1433
    .line 1434
    const/16 v18, 0x0

    .line 1435
    .line 1436
    const/16 v19, 0x18

    .line 1437
    .line 1438
    const/4 v13, 0x1

    .line 1439
    const-class v15, La/tyk0;

    .line 1440
    .line 1441
    move-object/from16 v12, v16

    .line 1442
    .line 1443
    const-string v16, "handleGameError"

    .line 1444
    .line 1445
    const-string v17, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1446
    .line 1447
    invoke-direct/range {v12 .. v19}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1448
    .line 1449
    .line 1450
    new-instance v2, La/syk0;

    .line 1451
    .line 1452
    const/4 v3, 0x0

    .line 1453
    const/4 v11, 0x0

    .line 1454
    invoke-direct {v2, v14, v3, v11}, La/syk0;-><init>(La/tyk0;La/yje;B)V

    .line 1455
    .line 1456
    .line 1457
    const/16 v20, 0xa

    .line 1458
    .line 1459
    const/16 v17, 0x0

    .line 1460
    .line 1461
    move-object v15, v0

    .line 1462
    move-object/from16 v18, v1

    .line 1463
    .line 1464
    move-object/from16 v19, v2

    .line 1465
    .line 1466
    move-object/from16 v16, v12

    .line 1467
    .line 1468
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v0

    .line 1472
    iput-object v0, v14, La/tyk0;->B:La/bby;

    .line 1473
    .line 1474
    goto :goto_e

    .line 1475
    :cond_22
    instance-of v2, v0, La/ry5;

    .line 1476
    .line 1477
    if-eqz v2, :cond_23

    .line 1478
    .line 1479
    invoke-virtual {v14}, La/tyk0;->B()V

    .line 1480
    .line 1481
    .line 1482
    goto :goto_e

    .line 1483
    :cond_23
    instance-of v2, v0, La/iy5;

    .line 1484
    .line 1485
    if-eqz v2, :cond_24

    .line 1486
    .line 1487
    check-cast v0, La/iy5;

    .line 1488
    .line 1489
    iget-object v0, v0, La/iy5;->a:La/csr;

    .line 1490
    .line 1491
    iget-object v0, v0, La/csr;->a:La/bsr;

    .line 1492
    .line 1493
    iget-object v0, v0, La/bsr;->a:La/esr;

    .line 1494
    .line 1495
    sget-object v1, La/esr;->c:La/esr;

    .line 1496
    .line 1497
    if-eq v0, v1, :cond_27

    .line 1498
    .line 1499
    invoke-virtual {v14}, La/tyk0;->B()V

    .line 1500
    .line 1501
    .line 1502
    goto :goto_e

    .line 1503
    :cond_24
    instance-of v2, v0, La/ty5;

    .line 1504
    .line 1505
    if-eqz v2, :cond_25

    .line 1506
    .line 1507
    check-cast v0, La/ty5;

    .line 1508
    .line 1509
    iget-object v0, v0, La/ty5;->a:La/csr;

    .line 1510
    .line 1511
    iget-object v0, v0, La/csr;->a:La/bsr;

    .line 1512
    .line 1513
    iget-object v0, v0, La/bsr;->a:La/esr;

    .line 1514
    .line 1515
    invoke-virtual {v0}, La/esr;->a()Z

    .line 1516
    .line 1517
    .line 1518
    move-result v0

    .line 1519
    if-nez v0, :cond_27

    .line 1520
    .line 1521
    invoke-virtual {v14}, La/tyk0;->B()V

    .line 1522
    .line 1523
    .line 1524
    goto :goto_e

    .line 1525
    :cond_25
    instance-of v2, v0, La/ly5;

    .line 1526
    .line 1527
    if-eqz v2, :cond_26

    .line 1528
    .line 1529
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v3

    .line 1533
    new-instance v4, La/gvj0;

    .line 1534
    .line 1535
    const/16 v18, 0x0

    .line 1536
    .line 1537
    const/16 v19, 0x15

    .line 1538
    .line 1539
    const/4 v13, 0x1

    .line 1540
    const-class v15, La/tyk0;

    .line 1541
    .line 1542
    const-string v16, "handleGameError"

    .line 1543
    .line 1544
    const-string v17, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1545
    .line 1546
    move-object v12, v4

    .line 1547
    invoke-direct/range {v12 .. v19}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1548
    .line 1549
    .line 1550
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 1551
    .line 1552
    new-instance v7, La/kbh0;

    .line 1553
    .line 1554
    const/16 v0, 0x16

    .line 1555
    .line 1556
    const/4 v1, 0x0

    .line 1557
    invoke-direct {v7, v14, v1, v0}, La/kbh0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1558
    .line 1559
    .line 1560
    const/16 v8, 0xa

    .line 1561
    .line 1562
    const/4 v5, 0x0

    .line 1563
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1564
    .line 1565
    .line 1566
    goto :goto_e

    .line 1567
    :cond_26
    instance-of v1, v0, La/ole;

    .line 1568
    .line 1569
    if-eqz v1, :cond_27

    .line 1570
    .line 1571
    check-cast v0, La/ole;

    .line 1572
    .line 1573
    iget-boolean v0, v0, La/ole;->a:Z

    .line 1574
    .line 1575
    invoke-virtual {v14, v0}, La/tyk0;->G(Z)V

    .line 1576
    .line 1577
    .line 1578
    :cond_27
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1579
    .line 1580
    return-object v0

    .line 1581
    :pswitch_a
    move-object/from16 v0, p1

    .line 1582
    .line 1583
    check-cast v0, La/zik0;

    .line 1584
    .line 1585
    move-object/from16 v1, p2

    .line 1586
    .line 1587
    check-cast v1, La/yje;

    .line 1588
    .line 1589
    move-object v12, v9

    .line 1590
    check-cast v12, La/tik0;

    .line 1591
    .line 1592
    sget-object v1, La/tik0;->Q1:[La/iiy;

    .line 1593
    .line 1594
    instance-of v1, v0, La/xik0;

    .line 1595
    .line 1596
    sget-object v3, La/wik0;->a:La/wik0;

    .line 1597
    .line 1598
    if-eqz v1, :cond_29

    .line 1599
    .line 1600
    check-cast v0, La/xik0;

    .line 1601
    .line 1602
    iget-object v6, v0, La/xik0;->a:Ljava/lang/String;

    .line 1603
    .line 1604
    iget-object v0, v12, La/tik0;->M1:La/wdk0;

    .line 1605
    .line 1606
    if-eqz v0, :cond_28

    .line 1607
    .line 1608
    new-instance v4, La/xdk0;

    .line 1609
    .line 1610
    sget-object v5, La/rek0;->b:La/rek0;

    .line 1611
    .line 1612
    const/4 v10, 0x0

    .line 1613
    const/16 v11, 0x7c

    .line 1614
    .line 1615
    const/4 v7, 0x0

    .line 1616
    const/4 v8, 0x0

    .line 1617
    const/4 v9, 0x0

    .line 1618
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1619
    .line 1620
    .line 1621
    const/16 v16, 0x0

    .line 1622
    .line 1623
    const/16 v17, 0x3fc

    .line 1624
    .line 1625
    const/4 v13, 0x0

    .line 1626
    const/4 v14, 0x0

    .line 1627
    const/4 v15, 0x0

    .line 1628
    move-object v10, v0

    .line 1629
    move-object v11, v4

    .line 1630
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1631
    .line 1632
    .line 1633
    invoke-virtual {v12}, La/tik0;->I0()La/cjk0;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v0

    .line 1637
    iget-object v0, v0, La/cjk0;->n:La/p7m0;

    .line 1638
    .line 1639
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1640
    .line 1641
    .line 1642
    const/4 v1, 0x0

    .line 1643
    invoke-virtual {v0, v1, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1644
    .line 1645
    .line 1646
    goto :goto_f

    .line 1647
    :cond_28
    const/4 v1, 0x0

    .line 1648
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1649
    .line 1650
    .line 1651
    throw v1

    .line 1652
    :cond_29
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1653
    .line 1654
    .line 1655
    sget-object v1, La/yik0;->a:La/yik0;

    .line 1656
    .line 1657
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1658
    .line 1659
    .line 1660
    move-result v1

    .line 1661
    if-eqz v1, :cond_2b

    .line 1662
    .line 1663
    iget-object v10, v12, La/tik0;->M1:La/wdk0;

    .line 1664
    .line 1665
    if-eqz v10, :cond_2a

    .line 1666
    .line 1667
    new-instance v13, La/xdk0;

    .line 1668
    .line 1669
    sget-object v14, La/qek0;->a:La/qek0;

    .line 1670
    .line 1671
    const v0, 0x7f131414

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v15

    .line 1678
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1679
    .line 1680
    .line 1681
    const/16 v19, 0x0

    .line 1682
    .line 1683
    const/16 v20, 0x7c

    .line 1684
    .line 1685
    const/16 v16, 0x0

    .line 1686
    .line 1687
    const/16 v17, 0x0

    .line 1688
    .line 1689
    const/16 v18, 0x0

    .line 1690
    .line 1691
    invoke-direct/range {v13 .. v20}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1692
    .line 1693
    .line 1694
    const/16 v17, 0x3fc

    .line 1695
    .line 1696
    move-object v11, v13

    .line 1697
    const/4 v13, 0x0

    .line 1698
    const/4 v14, 0x0

    .line 1699
    const/4 v15, 0x0

    .line 1700
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v12}, La/tik0;->I0()La/cjk0;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    iget-object v0, v0, La/cjk0;->n:La/p7m0;

    .line 1708
    .line 1709
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1710
    .line 1711
    .line 1712
    const/4 v1, 0x0

    .line 1713
    invoke-virtual {v0, v1, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1714
    .line 1715
    .line 1716
    goto :goto_f

    .line 1717
    :cond_2a
    const/4 v1, 0x0

    .line 1718
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1719
    .line 1720
    .line 1721
    throw v1

    .line 1722
    :cond_2b
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v0

    .line 1726
    if-eqz v0, :cond_2c

    .line 1727
    .line 1728
    :goto_f
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1729
    .line 1730
    goto :goto_10

    .line 1731
    :cond_2c
    invoke-static {}, La/t9f;->b()V

    .line 1732
    .line 1733
    .line 1734
    const/4 v8, 0x0

    .line 1735
    :goto_10
    return-object v8

    .line 1736
    :pswitch_b
    move-object/from16 v0, p1

    .line 1737
    .line 1738
    check-cast v0, La/pik0;

    .line 1739
    .line 1740
    move-object/from16 v1, p2

    .line 1741
    .line 1742
    check-cast v1, La/yje;

    .line 1743
    .line 1744
    move-object v12, v9

    .line 1745
    check-cast v12, La/tik0;

    .line 1746
    .line 1747
    sget-object v1, La/tik0;->Q1:[La/iiy;

    .line 1748
    .line 1749
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1750
    .line 1751
    .line 1752
    if-eqz v0, :cond_44

    .line 1753
    .line 1754
    instance-of v1, v0, La/nik0;

    .line 1755
    .line 1756
    if-eqz v1, :cond_2e

    .line 1757
    .line 1758
    check-cast v0, La/nik0;

    .line 1759
    .line 1760
    iget-boolean v0, v0, La/nik0;->a:Z

    .line 1761
    .line 1762
    if-eqz v0, :cond_2d

    .line 1763
    .line 1764
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v0

    .line 1768
    iget-object v0, v0, La/v4r;->t:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1769
    .line 1770
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1771
    .line 1772
    .line 1773
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v0

    .line 1777
    iget-object v0, v0, La/v4r;->u:Landroid/widget/FrameLayout;

    .line 1778
    .line 1779
    const/4 v11, 0x0

    .line 1780
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1781
    .line 1782
    .line 1783
    goto/16 :goto_1b

    .line 1784
    .line 1785
    :cond_2d
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v0

    .line 1789
    iget-object v0, v0, La/v4r;->u:Landroid/widget/FrameLayout;

    .line 1790
    .line 1791
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1792
    .line 1793
    .line 1794
    goto/16 :goto_1b

    .line 1795
    .line 1796
    :cond_2e
    const/4 v11, 0x0

    .line 1797
    instance-of v1, v0, La/oik0;

    .line 1798
    .line 1799
    if-eqz v1, :cond_42

    .line 1800
    .line 1801
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v1

    .line 1805
    iget-object v1, v1, La/v4r;->D:Landroid/widget/ScrollView;

    .line 1806
    .line 1807
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1808
    .line 1809
    .line 1810
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v1

    .line 1814
    iget-object v1, v1, La/v4r;->O:Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 1815
    .line 1816
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v1

    .line 1823
    iget-object v1, v1, La/v4r;->t:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1824
    .line 1825
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1826
    .line 1827
    .line 1828
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v1

    .line 1832
    iget-object v1, v1, La/v4r;->u:Landroid/widget/FrameLayout;

    .line 1833
    .line 1834
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1835
    .line 1836
    .line 1837
    check-cast v0, La/oik0;

    .line 1838
    .line 1839
    iget-object v0, v0, La/oik0;->a:Ljava/util/ArrayList;

    .line 1840
    .line 1841
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v1

    .line 1845
    check-cast v1, La/ijk0;

    .line 1846
    .line 1847
    if-eqz v1, :cond_2f

    .line 1848
    .line 1849
    iget-byte v3, v1, La/ijk0;->b:B

    .line 1850
    .line 1851
    :cond_2f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v0

    .line 1855
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1856
    .line 1857
    .line 1858
    move-result v1

    .line 1859
    if-eqz v1, :cond_43

    .line 1860
    .line 1861
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v1

    .line 1865
    check-cast v1, La/ijk0;

    .line 1866
    .line 1867
    iget-byte v2, v1, La/ijk0;->b:B

    .line 1868
    .line 1869
    if-ne v2, v3, :cond_30

    .line 1870
    .line 1871
    move v4, v5

    .line 1872
    goto :goto_12

    .line 1873
    :cond_30
    const/4 v4, 0x0

    .line 1874
    :goto_12
    if-eq v2, v5, :cond_40

    .line 1875
    .line 1876
    const/4 v7, 0x5

    .line 1877
    if-eq v2, v7, :cond_3e

    .line 1878
    .line 1879
    const/4 v7, 0x7

    .line 1880
    if-eq v2, v7, :cond_3c

    .line 1881
    .line 1882
    const/16 v7, 0x9

    .line 1883
    .line 1884
    if-eq v2, v7, :cond_3a

    .line 1885
    .line 1886
    const/16 v7, 0xb

    .line 1887
    .line 1888
    if-eq v2, v7, :cond_38

    .line 1889
    .line 1890
    const/16 v7, 0xd

    .line 1891
    .line 1892
    if-eq v2, v7, :cond_36

    .line 1893
    .line 1894
    const/16 v7, 0x11

    .line 1895
    .line 1896
    if-eq v2, v7, :cond_34

    .line 1897
    .line 1898
    const/16 v7, 0x13

    .line 1899
    .line 1900
    if-eq v2, v7, :cond_33

    .line 1901
    .line 1902
    const/16 v7, 0x1f

    .line 1903
    .line 1904
    if-eq v2, v7, :cond_31

    .line 1905
    .line 1906
    goto :goto_11

    .line 1907
    :cond_31
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v2

    .line 1911
    iget-object v2, v2, La/v4r;->v:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1912
    .line 1913
    if-nez v4, :cond_32

    .line 1914
    .line 1915
    const/4 v4, 0x0

    .line 1916
    goto :goto_13

    .line 1917
    :cond_32
    move v4, v6

    .line 1918
    :goto_13
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1919
    .line 1920
    .line 1921
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 1922
    .line 1923
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v2

    .line 1927
    iget-object v14, v2, La/v4r;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1928
    .line 1929
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v2

    .line 1933
    iget-object v15, v2, La/v4r;->l:Landroid/widget/FrameLayout;

    .line 1934
    .line 1935
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v2

    .line 1939
    iget-object v2, v2, La/v4r;->G:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 1940
    .line 1941
    iget-byte v1, v1, La/ijk0;->b:B

    .line 1942
    .line 1943
    move/from16 v17, v1

    .line 1944
    .line 1945
    move-object/from16 v16, v2

    .line 1946
    .line 1947
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 1948
    .line 1949
    .line 1950
    goto :goto_11

    .line 1951
    :cond_33
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 1952
    .line 1953
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v2

    .line 1957
    iget-object v14, v2, La/v4r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1958
    .line 1959
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v2

    .line 1963
    iget-object v15, v2, La/v4r;->k:Landroid/widget/FrameLayout;

    .line 1964
    .line 1965
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v2

    .line 1969
    iget-object v2, v2, La/v4r;->F:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 1970
    .line 1971
    iget-byte v1, v1, La/ijk0;->b:B

    .line 1972
    .line 1973
    move/from16 v17, v1

    .line 1974
    .line 1975
    move-object/from16 v16, v2

    .line 1976
    .line 1977
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 1978
    .line 1979
    .line 1980
    goto :goto_11

    .line 1981
    :cond_34
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v2

    .line 1985
    iget-object v2, v2, La/v4r;->z:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1986
    .line 1987
    if-nez v4, :cond_35

    .line 1988
    .line 1989
    const/4 v4, 0x0

    .line 1990
    goto :goto_14

    .line 1991
    :cond_35
    move v4, v6

    .line 1992
    :goto_14
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1993
    .line 1994
    .line 1995
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 1996
    .line 1997
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v2

    .line 2001
    iget-object v14, v2, La/v4r;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2002
    .line 2003
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v2

    .line 2007
    iget-object v15, v2, La/v4r;->p:Landroid/widget/FrameLayout;

    .line 2008
    .line 2009
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v2

    .line 2013
    iget-object v2, v2, La/v4r;->K:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2014
    .line 2015
    iget-byte v1, v1, La/ijk0;->b:B

    .line 2016
    .line 2017
    move/from16 v17, v1

    .line 2018
    .line 2019
    move-object/from16 v16, v2

    .line 2020
    .line 2021
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 2022
    .line 2023
    .line 2024
    goto/16 :goto_11

    .line 2025
    .line 2026
    :cond_36
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v2

    .line 2030
    iget-object v2, v2, La/v4r;->B:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 2031
    .line 2032
    if-nez v4, :cond_37

    .line 2033
    .line 2034
    const/4 v4, 0x0

    .line 2035
    goto :goto_15

    .line 2036
    :cond_37
    move v4, v6

    .line 2037
    :goto_15
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2038
    .line 2039
    .line 2040
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 2041
    .line 2042
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v2

    .line 2046
    iget-object v14, v2, La/v4r;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2047
    .line 2048
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v2

    .line 2052
    iget-object v15, v2, La/v4r;->r:Landroid/widget/FrameLayout;

    .line 2053
    .line 2054
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v2

    .line 2058
    iget-object v2, v2, La/v4r;->M:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2059
    .line 2060
    iget-byte v1, v1, La/ijk0;->b:B

    .line 2061
    .line 2062
    move/from16 v17, v1

    .line 2063
    .line 2064
    move-object/from16 v16, v2

    .line 2065
    .line 2066
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 2067
    .line 2068
    .line 2069
    goto/16 :goto_11

    .line 2070
    .line 2071
    :cond_38
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v2

    .line 2075
    iget-object v2, v2, La/v4r;->w:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 2076
    .line 2077
    if-nez v4, :cond_39

    .line 2078
    .line 2079
    const/4 v4, 0x0

    .line 2080
    goto :goto_16

    .line 2081
    :cond_39
    move v4, v6

    .line 2082
    :goto_16
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2083
    .line 2084
    .line 2085
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 2086
    .line 2087
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v2

    .line 2091
    iget-object v14, v2, La/v4r;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2092
    .line 2093
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v2

    .line 2097
    iget-object v15, v2, La/v4r;->m:Landroid/widget/FrameLayout;

    .line 2098
    .line 2099
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v2

    .line 2103
    iget-object v2, v2, La/v4r;->H:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2104
    .line 2105
    iget-byte v1, v1, La/ijk0;->b:B

    .line 2106
    .line 2107
    move/from16 v17, v1

    .line 2108
    .line 2109
    move-object/from16 v16, v2

    .line 2110
    .line 2111
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 2112
    .line 2113
    .line 2114
    goto/16 :goto_11

    .line 2115
    .line 2116
    :cond_3a
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v2

    .line 2120
    iget-object v2, v2, La/v4r;->x:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 2121
    .line 2122
    if-nez v4, :cond_3b

    .line 2123
    .line 2124
    const/4 v4, 0x0

    .line 2125
    goto :goto_17

    .line 2126
    :cond_3b
    move v4, v6

    .line 2127
    :goto_17
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2128
    .line 2129
    .line 2130
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 2131
    .line 2132
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v2

    .line 2136
    iget-object v14, v2, La/v4r;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2137
    .line 2138
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v2

    .line 2142
    iget-object v15, v2, La/v4r;->n:Landroid/widget/FrameLayout;

    .line 2143
    .line 2144
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v2

    .line 2148
    iget-object v2, v2, La/v4r;->I:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2149
    .line 2150
    iget-byte v1, v1, La/ijk0;->b:B

    .line 2151
    .line 2152
    move/from16 v17, v1

    .line 2153
    .line 2154
    move-object/from16 v16, v2

    .line 2155
    .line 2156
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 2157
    .line 2158
    .line 2159
    goto/16 :goto_11

    .line 2160
    .line 2161
    :cond_3c
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v2

    .line 2165
    iget-object v2, v2, La/v4r;->C:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 2166
    .line 2167
    if-nez v4, :cond_3d

    .line 2168
    .line 2169
    const/4 v4, 0x0

    .line 2170
    goto :goto_18

    .line 2171
    :cond_3d
    move v4, v6

    .line 2172
    :goto_18
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2173
    .line 2174
    .line 2175
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 2176
    .line 2177
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v2

    .line 2181
    iget-object v14, v2, La/v4r;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2182
    .line 2183
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v2

    .line 2187
    iget-object v15, v2, La/v4r;->s:Landroid/widget/FrameLayout;

    .line 2188
    .line 2189
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v2

    .line 2193
    iget-object v2, v2, La/v4r;->N:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2194
    .line 2195
    iget-byte v1, v1, La/ijk0;->b:B

    .line 2196
    .line 2197
    move/from16 v17, v1

    .line 2198
    .line 2199
    move-object/from16 v16, v2

    .line 2200
    .line 2201
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 2202
    .line 2203
    .line 2204
    goto/16 :goto_11

    .line 2205
    .line 2206
    :cond_3e
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v2

    .line 2210
    iget-object v2, v2, La/v4r;->y:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 2211
    .line 2212
    if-nez v4, :cond_3f

    .line 2213
    .line 2214
    const/4 v4, 0x0

    .line 2215
    goto :goto_19

    .line 2216
    :cond_3f
    move v4, v6

    .line 2217
    :goto_19
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2218
    .line 2219
    .line 2220
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 2221
    .line 2222
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v2

    .line 2226
    iget-object v14, v2, La/v4r;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2227
    .line 2228
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2229
    .line 2230
    .line 2231
    move-result-object v2

    .line 2232
    iget-object v15, v2, La/v4r;->o:Landroid/widget/FrameLayout;

    .line 2233
    .line 2234
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v2

    .line 2238
    iget-object v2, v2, La/v4r;->J:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2239
    .line 2240
    iget-byte v1, v1, La/ijk0;->b:B

    .line 2241
    .line 2242
    move/from16 v17, v1

    .line 2243
    .line 2244
    move-object/from16 v16, v2

    .line 2245
    .line 2246
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 2247
    .line 2248
    .line 2249
    goto/16 :goto_11

    .line 2250
    .line 2251
    :cond_40
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v2

    .line 2255
    iget-object v2, v2, La/v4r;->A:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 2256
    .line 2257
    if-nez v4, :cond_41

    .line 2258
    .line 2259
    const/4 v4, 0x0

    .line 2260
    goto :goto_1a

    .line 2261
    :cond_41
    move v4, v6

    .line 2262
    :goto_1a
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2263
    .line 2264
    .line 2265
    iget-boolean v13, v1, La/ijk0;->a:Z

    .line 2266
    .line 2267
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v2

    .line 2271
    iget-object v14, v2, La/v4r;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2272
    .line 2273
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v2

    .line 2277
    iget-object v15, v2, La/v4r;->q:Landroid/widget/FrameLayout;

    .line 2278
    .line 2279
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v2

    .line 2283
    iget-object v2, v2, La/v4r;->L:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2284
    .line 2285
    iget-byte v1, v1, La/ijk0;->b:B

    .line 2286
    .line 2287
    move/from16 v17, v1

    .line 2288
    .line 2289
    move-object/from16 v16, v2

    .line 2290
    .line 2291
    invoke-virtual/range {v12 .. v17}, La/tik0;->G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V

    .line 2292
    .line 2293
    .line 2294
    goto/16 :goto_11

    .line 2295
    .line 2296
    :cond_42
    instance-of v1, v0, La/mik0;

    .line 2297
    .line 2298
    if-eqz v1, :cond_44

    .line 2299
    .line 2300
    check-cast v0, La/mik0;

    .line 2301
    .line 2302
    iget-object v0, v0, La/mik0;->a:La/ra10;

    .line 2303
    .line 2304
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v1

    .line 2308
    iget-object v1, v1, La/v4r;->D:Landroid/widget/ScrollView;

    .line 2309
    .line 2310
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2311
    .line 2312
    .line 2313
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v1

    .line 2317
    iget-object v1, v1, La/v4r;->O:Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 2318
    .line 2319
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2320
    .line 2321
    .line 2322
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v1

    .line 2326
    iget-object v1, v1, La/v4r;->u:Landroid/widget/FrameLayout;

    .line 2327
    .line 2328
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v12}, La/tik0;->H0()La/v4r;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v1

    .line 2335
    iget-object v1, v1, La/v4r;->t:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 2336
    .line 2337
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 2338
    .line 2339
    .line 2340
    const/4 v11, 0x0

    .line 2341
    invoke-virtual {v1, v11}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 2342
    .line 2343
    .line 2344
    :cond_43
    :goto_1b
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2345
    .line 2346
    goto :goto_1c

    .line 2347
    :cond_44
    invoke-static {}, La/t9f;->b()V

    .line 2348
    .line 2349
    .line 2350
    const/4 v8, 0x0

    .line 2351
    :goto_1c
    return-object v8

    .line 2352
    :pswitch_c
    move-object/from16 v0, p1

    .line 2353
    .line 2354
    check-cast v0, Ljava/lang/Throwable;

    .line 2355
    .line 2356
    move-object/from16 v1, p2

    .line 2357
    .line 2358
    check-cast v1, La/yje;

    .line 2359
    .line 2360
    check-cast v9, La/duj;

    .line 2361
    .line 2362
    invoke-virtual {v9, v0}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 2363
    .line 2364
    .line 2365
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2366
    .line 2367
    return-object v0

    .line 2368
    :pswitch_d
    move-object/from16 v0, p1

    .line 2369
    .line 2370
    check-cast v0, Ljava/lang/Throwable;

    .line 2371
    .line 2372
    move-object/from16 v1, p2

    .line 2373
    .line 2374
    check-cast v1, La/yje;

    .line 2375
    .line 2376
    check-cast v9, La/xxj0;

    .line 2377
    .line 2378
    invoke-virtual {v9, v0}, La/xxj0;->C(Ljava/lang/Throwable;)V

    .line 2379
    .line 2380
    .line 2381
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2382
    .line 2383
    return-object v0

    .line 2384
    :pswitch_e
    move-object/from16 v0, p1

    .line 2385
    .line 2386
    check-cast v0, Ljava/lang/Throwable;

    .line 2387
    .line 2388
    move-object/from16 v1, p2

    .line 2389
    .line 2390
    check-cast v1, La/yje;

    .line 2391
    .line 2392
    check-cast v9, La/yxj0;

    .line 2393
    .line 2394
    invoke-virtual {v9, v0}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 2395
    .line 2396
    .line 2397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2398
    .line 2399
    return-object v0

    .line 2400
    :pswitch_f
    move-object/from16 v0, p1

    .line 2401
    .line 2402
    check-cast v0, Ljava/lang/Throwable;

    .line 2403
    .line 2404
    move-object/from16 v1, p2

    .line 2405
    .line 2406
    check-cast v1, La/yje;

    .line 2407
    .line 2408
    check-cast v9, La/yxj0;

    .line 2409
    .line 2410
    invoke-virtual {v9, v0}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 2411
    .line 2412
    .line 2413
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2414
    .line 2415
    return-object v0

    .line 2416
    :pswitch_10
    move-object/from16 v0, p1

    .line 2417
    .line 2418
    check-cast v0, La/ch5;

    .line 2419
    .line 2420
    move-object/from16 v1, p2

    .line 2421
    .line 2422
    check-cast v1, La/yje;

    .line 2423
    .line 2424
    check-cast v9, La/kvj0;

    .line 2425
    .line 2426
    sget-object v1, La/kvj0;->S1:La/eke0;

    .line 2427
    .line 2428
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2429
    .line 2430
    .line 2431
    sget-object v1, La/ug5;->a:La/ug5;

    .line 2432
    .line 2433
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2434
    .line 2435
    .line 2436
    move-result v1

    .line 2437
    if-eqz v1, :cond_45

    .line 2438
    .line 2439
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v0

    .line 2443
    iget-object v0, v0, La/m6q;->c:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 2444
    .line 2445
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->u()V

    .line 2446
    .line 2447
    .line 2448
    goto :goto_1d

    .line 2449
    :cond_45
    sget-object v1, La/yg5;->a:La/yg5;

    .line 2450
    .line 2451
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2452
    .line 2453
    .line 2454
    move-result v0

    .line 2455
    if-eqz v0, :cond_46

    .line 2456
    .line 2457
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v0

    .line 2461
    iget-object v0, v0, La/m6q;->c:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 2462
    .line 2463
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->w()V

    .line 2464
    .line 2465
    .line 2466
    :cond_46
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2467
    .line 2468
    return-object v0

    .line 2469
    :pswitch_11
    move-object/from16 v0, p1

    .line 2470
    .line 2471
    check-cast v0, La/r0o;

    .line 2472
    .line 2473
    move-object/from16 v1, p2

    .line 2474
    .line 2475
    check-cast v1, La/yje;

    .line 2476
    .line 2477
    check-cast v9, La/kvj0;

    .line 2478
    .line 2479
    invoke-virtual {v9, v0}, La/kvj0;->J0(La/r0o;)V

    .line 2480
    .line 2481
    .line 2482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2483
    .line 2484
    return-object v0

    .line 2485
    :pswitch_12
    move-object/from16 v0, p1

    .line 2486
    .line 2487
    check-cast v0, La/enb0;

    .line 2488
    .line 2489
    move-object/from16 v1, p2

    .line 2490
    .line 2491
    check-cast v1, La/yje;

    .line 2492
    .line 2493
    check-cast v9, La/kvj0;

    .line 2494
    .line 2495
    sget-object v1, La/kvj0;->S1:La/eke0;

    .line 2496
    .line 2497
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2498
    .line 2499
    .line 2500
    sget-object v1, La/cnb0;->a:La/cnb0;

    .line 2501
    .line 2502
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2503
    .line 2504
    .line 2505
    move-result v1

    .line 2506
    if-eqz v1, :cond_47

    .line 2507
    .line 2508
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v0

    .line 2512
    iget-object v0, v0, La/m6q;->d:Landroid/widget/TextView;

    .line 2513
    .line 2514
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2515
    .line 2516
    .line 2517
    goto :goto_1e

    .line 2518
    :cond_47
    instance-of v1, v0, La/dnb0;

    .line 2519
    .line 2520
    if-eqz v1, :cond_48

    .line 2521
    .line 2522
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v1

    .line 2526
    iget-object v1, v1, La/m6q;->d:Landroid/widget/TextView;

    .line 2527
    .line 2528
    const/4 v11, 0x0

    .line 2529
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2530
    .line 2531
    .line 2532
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2533
    .line 2534
    .line 2535
    move-result-object v1

    .line 2536
    iget-object v1, v1, La/m6q;->d:Landroid/widget/TextView;

    .line 2537
    .line 2538
    check-cast v0, La/dnb0;

    .line 2539
    .line 2540
    iget-object v0, v0, La/dnb0;->a:La/ank0;

    .line 2541
    .line 2542
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v2

    .line 2546
    invoke-virtual {v0, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2547
    .line 2548
    .line 2549
    move-result-object v0

    .line 2550
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2551
    .line 2552
    .line 2553
    :goto_1e
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2554
    .line 2555
    goto :goto_1f

    .line 2556
    :cond_48
    invoke-static {}, La/t9f;->b()V

    .line 2557
    .line 2558
    .line 2559
    const/4 v8, 0x0

    .line 2560
    :goto_1f
    return-object v8

    .line 2561
    :pswitch_13
    move-object/from16 v0, p1

    .line 2562
    .line 2563
    check-cast v0, La/k520;

    .line 2564
    .line 2565
    move-object/from16 v1, p2

    .line 2566
    .line 2567
    check-cast v1, La/yje;

    .line 2568
    .line 2569
    check-cast v9, La/kvj0;

    .line 2570
    .line 2571
    invoke-virtual {v9, v0}, La/zz5;->K0(La/k520;)V

    .line 2572
    .line 2573
    .line 2574
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2575
    .line 2576
    return-object v0

    .line 2577
    :pswitch_14
    move-object/from16 v0, p1

    .line 2578
    .line 2579
    check-cast v0, La/zb50;

    .line 2580
    .line 2581
    move-object/from16 v1, p2

    .line 2582
    .line 2583
    check-cast v1, La/yje;

    .line 2584
    .line 2585
    check-cast v9, La/kvj0;

    .line 2586
    .line 2587
    sget-object v1, La/kvj0;->S1:La/eke0;

    .line 2588
    .line 2589
    instance-of v1, v0, La/vb50;

    .line 2590
    .line 2591
    if-eqz v1, :cond_4a

    .line 2592
    .line 2593
    check-cast v0, La/vb50;

    .line 2594
    .line 2595
    iget-object v2, v0, La/vb50;->a:La/bm5;

    .line 2596
    .line 2597
    iget-object v1, v9, La/kvj0;->M1:La/ynb;

    .line 2598
    .line 2599
    if-eqz v1, :cond_49

    .line 2600
    .line 2601
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v4

    .line 2605
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2606
    .line 2607
    .line 2608
    const-string v6, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 2609
    .line 2610
    const/16 v7, 0x1ee

    .line 2611
    .line 2612
    const/4 v3, 0x0

    .line 2613
    const/4 v5, 0x0

    .line 2614
    invoke-static/range {v1 .. v7}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 2615
    .line 2616
    .line 2617
    invoke-virtual {v9}, La/kvj0;->M0()La/yxj0;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v0

    .line 2621
    iget-object v0, v0, La/yxj0;->Y:La/p7m0;

    .line 2622
    .line 2623
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2624
    .line 2625
    .line 2626
    sget-object v1, La/wb50;->a:La/wb50;

    .line 2627
    .line 2628
    const/4 v3, 0x0

    .line 2629
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2630
    .line 2631
    .line 2632
    goto :goto_20

    .line 2633
    :cond_49
    const/4 v3, 0x0

    .line 2634
    const-string v0, "changeBalanceDialogProvider"

    .line 2635
    .line 2636
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2637
    .line 2638
    .line 2639
    throw v3

    .line 2640
    :cond_4a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2641
    .line 2642
    .line 2643
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2644
    .line 2645
    return-object v0

    .line 2646
    :pswitch_15
    move-object/from16 v0, p1

    .line 2647
    .line 2648
    check-cast v0, La/fpm0;

    .line 2649
    .line 2650
    move-object/from16 v1, p2

    .line 2651
    .line 2652
    check-cast v1, La/yje;

    .line 2653
    .line 2654
    check-cast v9, La/kvj0;

    .line 2655
    .line 2656
    sget-object v1, La/kvj0;->S1:La/eke0;

    .line 2657
    .line 2658
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2659
    .line 2660
    .line 2661
    sget-object v1, La/bpm0;->a:La/bpm0;

    .line 2662
    .line 2663
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2664
    .line 2665
    .line 2666
    move-result v1

    .line 2667
    if-eqz v1, :cond_4b

    .line 2668
    .line 2669
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v0

    .line 2673
    iget-object v0, v0, La/m6q;->b:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 2674
    .line 2675
    invoke-virtual {v0, v5}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->y(Z)V

    .line 2676
    .line 2677
    .line 2678
    goto :goto_21

    .line 2679
    :cond_4b
    instance-of v1, v0, La/cpm0;

    .line 2680
    .line 2681
    if-eqz v1, :cond_4d

    .line 2682
    .line 2683
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2684
    .line 2685
    .line 2686
    move-result-object v1

    .line 2687
    iget-object v1, v1, La/m6q;->b:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 2688
    .line 2689
    const/4 v11, 0x0

    .line 2690
    invoke-virtual {v1, v11}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->y(Z)V

    .line 2691
    .line 2692
    .line 2693
    check-cast v0, La/cpm0;

    .line 2694
    .line 2695
    iget-boolean v2, v0, La/cpm0;->d:Z

    .line 2696
    .line 2697
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setVisibilityStepButtons(Z)V

    .line 2698
    .line 2699
    .line 2700
    iget-object v2, v0, La/cpm0;->c:La/ank0;

    .line 2701
    .line 2702
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2703
    .line 2704
    .line 2705
    move-result-object v3

    .line 2706
    invoke-virtual {v2, v3}, La/ank0;->c(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v2

    .line 2710
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setBetLimitsText(Landroid/text/Spannable;)V

    .line 2711
    .line 2712
    .line 2713
    iget-boolean v3, v0, La/cpm0;->b:Z

    .line 2714
    .line 2715
    if-nez v3, :cond_4c

    .line 2716
    .line 2717
    iget-object v3, v0, La/cpm0;->a:Ljava/lang/String;

    .line 2718
    .line 2719
    const/4 v4, 0x0

    .line 2720
    invoke-virtual {v1, v4, v3}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->w(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 2721
    .line 2722
    .line 2723
    :cond_4c
    iget-boolean v3, v0, La/cpm0;->g:Z

    .line 2724
    .line 2725
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 2726
    .line 2727
    .line 2728
    iget-boolean v3, v0, La/cpm0;->e:Z

    .line 2729
    .line 2730
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setPlusButtonEnabled(Z)V

    .line 2731
    .line 2732
    .line 2733
    iget-boolean v3, v0, La/cpm0;->f:Z

    .line 2734
    .line 2735
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMinusButtonEnabled(Z)V

    .line 2736
    .line 2737
    .line 2738
    iget-boolean v0, v0, La/cpm0;->h:Z

    .line 2739
    .line 2740
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v2

    .line 2744
    invoke-virtual {v1, v2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->x(Ljava/lang/String;Z)V

    .line 2745
    .line 2746
    .line 2747
    :goto_21
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2748
    .line 2749
    goto :goto_22

    .line 2750
    :cond_4d
    invoke-static {}, La/t9f;->b()V

    .line 2751
    .line 2752
    .line 2753
    const/4 v8, 0x0

    .line 2754
    :goto_22
    return-object v8

    .line 2755
    :pswitch_16
    move-object/from16 v0, p1

    .line 2756
    .line 2757
    check-cast v0, La/fwo0;

    .line 2758
    .line 2759
    move-object/from16 v1, p2

    .line 2760
    .line 2761
    check-cast v1, La/yje;

    .line 2762
    .line 2763
    check-cast v9, La/kvj0;

    .line 2764
    .line 2765
    sget-object v1, La/kvj0;->S1:La/eke0;

    .line 2766
    .line 2767
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2768
    .line 2769
    .line 2770
    move-result-object v1

    .line 2771
    iget-object v1, v1, La/m6q;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 2772
    .line 2773
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e()V

    .line 2774
    .line 2775
    .line 2776
    sget-object v1, La/vvo0;->a:La/vvo0;

    .line 2777
    .line 2778
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2779
    .line 2780
    .line 2781
    move-result v1

    .line 2782
    if-eqz v1, :cond_4e

    .line 2783
    .line 2784
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v0

    .line 2788
    iget-object v0, v0, La/m6q;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 2789
    .line 2790
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2791
    .line 2792
    .line 2793
    goto :goto_23

    .line 2794
    :cond_4e
    instance-of v0, v0, La/yvo0;

    .line 2795
    .line 2796
    if-eqz v0, :cond_4f

    .line 2797
    .line 2798
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v0

    .line 2802
    iget-object v0, v0, La/m6q;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 2803
    .line 2804
    const/4 v11, 0x0

    .line 2805
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2806
    .line 2807
    .line 2808
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2809
    .line 2810
    .line 2811
    move-result-object v0

    .line 2812
    iget-object v0, v0, La/m6q;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 2813
    .line 2814
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->f()V

    .line 2815
    .line 2816
    .line 2817
    :goto_23
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2818
    .line 2819
    goto :goto_24

    .line 2820
    :cond_4f
    invoke-static {}, La/t9f;->b()V

    .line 2821
    .line 2822
    .line 2823
    const/4 v8, 0x0

    .line 2824
    :goto_24
    return-object v8

    .line 2825
    :pswitch_17
    move-object/from16 v0, p1

    .line 2826
    .line 2827
    check-cast v0, La/pm5;

    .line 2828
    .line 2829
    move-object/from16 v1, p2

    .line 2830
    .line 2831
    check-cast v1, La/yje;

    .line 2832
    .line 2833
    check-cast v9, La/kvj0;

    .line 2834
    .line 2835
    sget-object v1, La/kvj0;->S1:La/eke0;

    .line 2836
    .line 2837
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2838
    .line 2839
    .line 2840
    move-result-object v1

    .line 2841
    iget-object v1, v1, La/m6q;->c:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 2842
    .line 2843
    instance-of v2, v0, La/em5;

    .line 2844
    .line 2845
    if-nez v2, :cond_50

    .line 2846
    .line 2847
    const/4 v6, 0x0

    .line 2848
    :cond_50
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2849
    .line 2850
    .line 2851
    instance-of v1, v0, La/im5;

    .line 2852
    .line 2853
    if-eqz v1, :cond_51

    .line 2854
    .line 2855
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2856
    .line 2857
    .line 2858
    move-result-object v1

    .line 2859
    iget-object v1, v1, La/m6q;->c:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 2860
    .line 2861
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->v()V

    .line 2862
    .line 2863
    .line 2864
    goto :goto_25

    .line 2865
    :cond_51
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2866
    .line 2867
    .line 2868
    move-result-object v1

    .line 2869
    iget-object v1, v1, La/m6q;->c:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 2870
    .line 2871
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->x()V

    .line 2872
    .line 2873
    .line 2874
    :goto_25
    sget-object v1, La/im5;->a:La/im5;

    .line 2875
    .line 2876
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2877
    .line 2878
    .line 2879
    move-result v1

    .line 2880
    if-nez v1, :cond_54

    .line 2881
    .line 2882
    sget-object v1, La/em5;->a:La/em5;

    .line 2883
    .line 2884
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2885
    .line 2886
    .line 2887
    move-result v1

    .line 2888
    if-nez v1, :cond_54

    .line 2889
    .line 2890
    instance-of v1, v0, La/lm5;

    .line 2891
    .line 2892
    if-eqz v1, :cond_53

    .line 2893
    .line 2894
    check-cast v0, La/lm5;

    .line 2895
    .line 2896
    iget-object v1, v0, La/lm5;->b:La/ke;

    .line 2897
    .line 2898
    iget-boolean v0, v0, La/lm5;->c:Z

    .line 2899
    .line 2900
    invoke-virtual {v9}, La/kvj0;->L0()La/m6q;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v2

    .line 2904
    iget-object v2, v2, La/m6q;->c:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 2905
    .line 2906
    invoke-virtual {v2, v1}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setModel(La/ke;)V

    .line 2907
    .line 2908
    .line 2909
    if-eqz v0, :cond_52

    .line 2910
    .line 2911
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2912
    .line 2913
    .line 2914
    move-result-object v0

    .line 2915
    const v1, 0x7f13040a

    .line 2916
    .line 2917
    .line 2918
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v0

    .line 2922
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2923
    .line 2924
    .line 2925
    invoke-virtual {v2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceBtnText(Ljava/lang/String;)V

    .line 2926
    .line 2927
    .line 2928
    new-instance v0, La/bvj0;

    .line 2929
    .line 2930
    invoke-direct {v0, v9, v2}, La/bvj0;-><init>(La/kvj0;Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;)V

    .line 2931
    .line 2932
    .line 2933
    invoke-virtual {v2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceClickListener(Landroid/view/View$OnClickListener;)V

    .line 2934
    .line 2935
    .line 2936
    goto :goto_26

    .line 2937
    :cond_52
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2938
    .line 2939
    .line 2940
    move-result-object v0

    .line 2941
    const v1, 0x7f13110f

    .line 2942
    .line 2943
    .line 2944
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v0

    .line 2948
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2949
    .line 2950
    .line 2951
    invoke-virtual {v2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceBtnText(Ljava/lang/String;)V

    .line 2952
    .line 2953
    .line 2954
    new-instance v0, La/bvj0;

    .line 2955
    .line 2956
    invoke-direct {v0, v9}, La/bvj0;-><init>(La/kvj0;)V

    .line 2957
    .line 2958
    .line 2959
    invoke-virtual {v2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceClickListener(Landroid/view/View$OnClickListener;)V

    .line 2960
    .line 2961
    .line 2962
    goto :goto_26

    .line 2963
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 2964
    .line 2965
    .line 2966
    const/4 v8, 0x0

    .line 2967
    goto :goto_27

    .line 2968
    :cond_54
    :goto_26
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2969
    .line 2970
    :goto_27
    return-object v8

    .line 2971
    :pswitch_18
    move-object/from16 v0, p1

    .line 2972
    .line 2973
    check-cast v0, La/j5j0;

    .line 2974
    .line 2975
    move-object/from16 v1, p2

    .line 2976
    .line 2977
    check-cast v1, La/yje;

    .line 2978
    .line 2979
    move-object v12, v9

    .line 2980
    check-cast v12, La/d4j0;

    .line 2981
    .line 2982
    sget-object v1, La/d4j0;->S1:La/eke0;

    .line 2983
    .line 2984
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2985
    .line 2986
    .line 2987
    sget-object v1, La/c5j0;->a:La/c5j0;

    .line 2988
    .line 2989
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2990
    .line 2991
    .line 2992
    move-result v2

    .line 2993
    if-eqz v2, :cond_55

    .line 2994
    .line 2995
    goto/16 :goto_29

    .line 2996
    .line 2997
    :cond_55
    sget-object v2, La/e5j0;->a:La/e5j0;

    .line 2998
    .line 2999
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3000
    .line 3001
    .line 3002
    move-result v2

    .line 3003
    const v3, 0x7f1304dc

    .line 3004
    .line 3005
    .line 3006
    if-eqz v2, :cond_56

    .line 3007
    .line 3008
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3009
    .line 3010
    .line 3011
    move-result-object v13

    .line 3012
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3013
    .line 3014
    .line 3015
    const v0, 0x7f131087

    .line 3016
    .line 3017
    .line 3018
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v14

    .line 3022
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3023
    .line 3024
    .line 3025
    const v0, 0x7f130042

    .line 3026
    .line 3027
    .line 3028
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3029
    .line 3030
    .line 3031
    move-result-object v16

    .line 3032
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3033
    .line 3034
    .line 3035
    const/16 v17, 0x10

    .line 3036
    .line 3037
    const-string v15, "APP_NOTIFICATION_SETTINGS_REQUEST_KEY"

    .line 3038
    .line 3039
    invoke-static/range {v12 .. v17}, La/d4j0;->K0(La/d4j0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 3040
    .line 3041
    .line 3042
    goto/16 :goto_28

    .line 3043
    .line 3044
    :cond_56
    sget-object v2, La/g5j0;->a:La/g5j0;

    .line 3045
    .line 3046
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3047
    .line 3048
    .line 3049
    move-result v2

    .line 3050
    if-eqz v2, :cond_57

    .line 3051
    .line 3052
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3053
    .line 3054
    .line 3055
    move-result-object v13

    .line 3056
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3057
    .line 3058
    .line 3059
    const v0, 0x7f131477

    .line 3060
    .line 3061
    .line 3062
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3063
    .line 3064
    .line 3065
    move-result-object v14

    .line 3066
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3067
    .line 3068
    .line 3069
    const v0, 0x7f130ec2

    .line 3070
    .line 3071
    .line 3072
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3073
    .line 3074
    .line 3075
    move-result-object v16

    .line 3076
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3077
    .line 3078
    .line 3079
    const v0, 0x7f13032f

    .line 3080
    .line 3081
    .line 3082
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3083
    .line 3084
    .line 3085
    move-result-object v17

    .line 3086
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3087
    .line 3088
    .line 3089
    const-string v15, "SYSTEM_NOTIFICATION_SETTINGS_REQUEST_KEY"

    .line 3090
    .line 3091
    invoke-virtual/range {v12 .. v17}, La/d4j0;->J0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3092
    .line 3093
    .line 3094
    goto/16 :goto_28

    .line 3095
    .line 3096
    :cond_57
    sget-object v2, La/f5j0;->a:La/f5j0;

    .line 3097
    .line 3098
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3099
    .line 3100
    .line 3101
    move-result v2

    .line 3102
    const v3, 0x7f1303fb

    .line 3103
    .line 3104
    .line 3105
    if-eqz v2, :cond_58

    .line 3106
    .line 3107
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3108
    .line 3109
    .line 3110
    move-result-object v13

    .line 3111
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3112
    .line 3113
    .line 3114
    const v0, 0x7f1301b6

    .line 3115
    .line 3116
    .line 3117
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3118
    .line 3119
    .line 3120
    move-result-object v14

    .line 3121
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3122
    .line 3123
    .line 3124
    const/16 v16, 0x0

    .line 3125
    .line 3126
    const/16 v17, 0x18

    .line 3127
    .line 3128
    const-string v15, "AUTO_MAX_ACTIVATE_DIALOG_REQUEST_KEY"

    .line 3129
    .line 3130
    invoke-static/range {v12 .. v17}, La/d4j0;->K0(La/d4j0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 3131
    .line 3132
    .line 3133
    goto/16 :goto_28

    .line 3134
    .line 3135
    :cond_58
    sget-object v2, La/h5j0;->a:La/h5j0;

    .line 3136
    .line 3137
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3138
    .line 3139
    .line 3140
    move-result v2

    .line 3141
    if-eqz v2, :cond_59

    .line 3142
    .line 3143
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3144
    .line 3145
    .line 3146
    move-result-object v13

    .line 3147
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3148
    .line 3149
    .line 3150
    const v0, 0x7f1317a0

    .line 3151
    .line 3152
    .line 3153
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3154
    .line 3155
    .line 3156
    move-result-object v14

    .line 3157
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3158
    .line 3159
    .line 3160
    const/16 v16, 0x0

    .line 3161
    .line 3162
    const/16 v17, 0x18

    .line 3163
    .line 3164
    const-string v15, "VIP_ACTIVATE_DIALOG_REQUEST_KEY"

    .line 3165
    .line 3166
    invoke-static/range {v12 .. v17}, La/d4j0;->K0(La/d4j0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 3167
    .line 3168
    .line 3169
    goto :goto_28

    .line 3170
    :cond_59
    instance-of v2, v0, La/d5j0;

    .line 3171
    .line 3172
    if-eqz v2, :cond_5b

    .line 3173
    .line 3174
    sget-object v0, La/ysj;->m2:La/qud;

    .line 3175
    .line 3176
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3177
    .line 3178
    .line 3179
    move-result-object v2

    .line 3180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3181
    .line 3182
    .line 3183
    invoke-virtual {v12}, La/d4j0;->H0()La/bm5;

    .line 3184
    .line 3185
    .line 3186
    move-result-object v3

    .line 3187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3188
    .line 3189
    .line 3190
    const-string v0, "DefaultBetSumEditorBottomSheetFragmentTag"

    .line 3191
    .line 3192
    invoke-virtual {v2, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 3193
    .line 3194
    .line 3195
    move-result-object v4

    .line 3196
    if-eqz v4, :cond_5a

    .line 3197
    .line 3198
    goto :goto_28

    .line 3199
    :cond_5a
    new-instance v4, La/ysj;

    .line 3200
    .line 3201
    invoke-direct {v4}, La/ysj;-><init>()V

    .line 3202
    .line 3203
    .line 3204
    sget-object v5, La/ysj;->n2:[La/iiy;

    .line 3205
    .line 3206
    const/4 v11, 0x0

    .line 3207
    aget-object v5, v5, v11

    .line 3208
    .line 3209
    iget-object v6, v4, La/ysj;->g2:La/yzn0;

    .line 3210
    .line 3211
    invoke-virtual {v6, v4, v5, v3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 3212
    .line 3213
    .line 3214
    invoke-virtual {v4, v2, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 3215
    .line 3216
    .line 3217
    goto :goto_28

    .line 3218
    :cond_5b
    instance-of v2, v0, La/i5j0;

    .line 3219
    .line 3220
    if-eqz v2, :cond_5d

    .line 3221
    .line 3222
    check-cast v0, La/i5j0;

    .line 3223
    .line 3224
    iget-object v0, v0, La/i5j0;->a:La/h4j0;

    .line 3225
    .line 3226
    sget-object v2, La/snd0;->n2:La/rl70;

    .line 3227
    .line 3228
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3229
    .line 3230
    .line 3231
    move-result-object v3

    .line 3232
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3233
    .line 3234
    .line 3235
    invoke-virtual {v12}, La/d4j0;->H0()La/bm5;

    .line 3236
    .line 3237
    .line 3238
    move-result-object v4

    .line 3239
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3240
    .line 3241
    .line 3242
    const-string v2, "QuickBetSumEditorBottomSheetFragmentTag"

    .line 3243
    .line 3244
    invoke-virtual {v3, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 3245
    .line 3246
    .line 3247
    move-result-object v6

    .line 3248
    if-eqz v6, :cond_5c

    .line 3249
    .line 3250
    goto :goto_28

    .line 3251
    :cond_5c
    new-instance v6, La/snd0;

    .line 3252
    .line 3253
    invoke-direct {v6}, La/snd0;-><init>()V

    .line 3254
    .line 3255
    .line 3256
    sget-object v7, La/snd0;->o2:[La/iiy;

    .line 3257
    .line 3258
    const/4 v11, 0x0

    .line 3259
    aget-object v8, v7, v11

    .line 3260
    .line 3261
    iget-object v9, v6, La/snd0;->g2:La/yzn0;

    .line 3262
    .line 3263
    invoke-virtual {v9, v6, v8, v4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 3264
    .line 3265
    .line 3266
    iget-object v4, v6, La/snd0;->h2:La/yzn0;

    .line 3267
    .line 3268
    aget-object v5, v7, v5

    .line 3269
    .line 3270
    invoke-virtual {v4, v6, v5, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 3271
    .line 3272
    .line 3273
    invoke-virtual {v6, v3, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 3274
    .line 3275
    .line 3276
    :goto_28
    invoke-virtual {v12}, La/d4j0;->I0()La/w5j0;

    .line 3277
    .line 3278
    .line 3279
    move-result-object v0

    .line 3280
    iget-object v0, v0, La/w5j0;->B:La/p7m0;

    .line 3281
    .line 3282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3283
    .line 3284
    .line 3285
    const/4 v3, 0x0

    .line 3286
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3287
    .line 3288
    .line 3289
    :goto_29
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3290
    .line 3291
    goto :goto_2a

    .line 3292
    :cond_5d
    const/4 v3, 0x0

    .line 3293
    invoke-static {}, La/t9f;->b()V

    .line 3294
    .line 3295
    .line 3296
    move-object v8, v3

    .line 3297
    :goto_2a
    return-object v8

    .line 3298
    :pswitch_19
    const/4 v3, 0x0

    .line 3299
    move-object/from16 v0, p1

    .line 3300
    .line 3301
    check-cast v0, La/m5j0;

    .line 3302
    .line 3303
    move-object/from16 v1, p2

    .line 3304
    .line 3305
    check-cast v1, La/yje;

    .line 3306
    .line 3307
    check-cast v9, La/d4j0;

    .line 3308
    .line 3309
    sget-object v1, La/d4j0;->S1:La/eke0;

    .line 3310
    .line 3311
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3312
    .line 3313
    .line 3314
    if-eqz v0, :cond_5f

    .line 3315
    .line 3316
    instance-of v1, v0, La/l5j0;

    .line 3317
    .line 3318
    if-eqz v1, :cond_5e

    .line 3319
    .line 3320
    invoke-virtual {v9}, La/d4j0;->G0()La/t4r;

    .line 3321
    .line 3322
    .line 3323
    move-result-object v0

    .line 3324
    iget-object v1, v0, La/t4r;->b:Landroid/widget/ProgressBar;

    .line 3325
    .line 3326
    const/4 v11, 0x0

    .line 3327
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 3328
    .line 3329
    .line 3330
    iget-object v0, v0, La/t4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 3331
    .line 3332
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3333
    .line 3334
    .line 3335
    goto :goto_2b

    .line 3336
    :cond_5e
    instance-of v1, v0, La/k5j0;

    .line 3337
    .line 3338
    if-eqz v1, :cond_5f

    .line 3339
    .line 3340
    check-cast v0, La/k5j0;

    .line 3341
    .line 3342
    iget-object v0, v0, La/k5j0;->a:Ljava/util/List;

    .line 3343
    .line 3344
    invoke-virtual {v9}, La/d4j0;->G0()La/t4r;

    .line 3345
    .line 3346
    .line 3347
    move-result-object v1

    .line 3348
    iget-object v2, v1, La/t4r;->b:Landroid/widget/ProgressBar;

    .line 3349
    .line 3350
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3351
    .line 3352
    .line 3353
    iget-object v2, v9, La/d4j0;->Q1:La/n0o0;

    .line 3354
    .line 3355
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3356
    .line 3357
    .line 3358
    move-result-object v2

    .line 3359
    check-cast v2, La/y1j0;

    .line 3360
    .line 3361
    invoke-virtual {v2, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 3362
    .line 3363
    .line 3364
    iget-object v0, v1, La/t4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 3365
    .line 3366
    const/4 v11, 0x0

    .line 3367
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 3368
    .line 3369
    .line 3370
    :goto_2b
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3371
    .line 3372
    goto :goto_2c

    .line 3373
    :cond_5f
    invoke-static {}, La/t9f;->b()V

    .line 3374
    .line 3375
    .line 3376
    move-object v8, v3

    .line 3377
    :goto_2c
    return-object v8

    .line 3378
    :pswitch_1a
    move-object/from16 v0, p1

    .line 3379
    .line 3380
    check-cast v0, Ljava/lang/Throwable;

    .line 3381
    .line 3382
    move-object/from16 v1, p2

    .line 3383
    .line 3384
    check-cast v1, La/yje;

    .line 3385
    .line 3386
    check-cast v9, La/ldi0;

    .line 3387
    .line 3388
    invoke-virtual {v9, v0}, La/ldi0;->C(Ljava/lang/Throwable;)V

    .line 3389
    .line 3390
    .line 3391
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3392
    .line 3393
    return-object v0

    .line 3394
    :pswitch_1b
    move-object/from16 v0, p1

    .line 3395
    .line 3396
    check-cast v0, La/g6u0;

    .line 3397
    .line 3398
    iget-wide v12, v0, La/g6u0;->a:J

    .line 3399
    .line 3400
    move-object/from16 v0, p2

    .line 3401
    .line 3402
    check-cast v0, La/yje;

    .line 3403
    .line 3404
    move-object v11, v9

    .line 3405
    check-cast v11, La/lbh0;

    .line 3406
    .line 3407
    iget-object v0, v11, La/lbh0;->k1:La/yj50;

    .line 3408
    .line 3409
    invoke-virtual {v0}, La/yj50;->c()La/vne;

    .line 3410
    .line 3411
    .line 3412
    move-result-object v0

    .line 3413
    new-instance v10, La/a5;

    .line 3414
    .line 3415
    const/4 v15, 0x3

    .line 3416
    const/4 v14, 0x0

    .line 3417
    invoke-direct/range {v10 .. v15}, La/a5;-><init>(La/lbh0;JLa/yje;B)V

    .line 3418
    .line 3419
    .line 3420
    invoke-static {v0, v14, v14, v10, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 3421
    .line 3422
    .line 3423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3424
    .line 3425
    return-object v0

    .line 3426
    :pswitch_1c
    move-object/from16 v0, p1

    .line 3427
    .line 3428
    check-cast v0, La/g6u0;

    .line 3429
    .line 3430
    iget-wide v12, v0, La/g6u0;->a:J

    .line 3431
    .line 3432
    move-object/from16 v0, p2

    .line 3433
    .line 3434
    check-cast v0, La/yje;

    .line 3435
    .line 3436
    move-object v11, v9

    .line 3437
    check-cast v11, La/lbh0;

    .line 3438
    .line 3439
    iget-object v0, v11, La/lbh0;->k1:La/yj50;

    .line 3440
    .line 3441
    invoke-virtual {v0}, La/yj50;->c()La/vne;

    .line 3442
    .line 3443
    .line 3444
    move-result-object v0

    .line 3445
    new-instance v10, La/a5;

    .line 3446
    .line 3447
    const/4 v15, 0x2

    .line 3448
    const/4 v14, 0x0

    .line 3449
    invoke-direct/range {v10 .. v15}, La/a5;-><init>(La/lbh0;JLa/yje;B)V

    .line 3450
    .line 3451
    .line 3452
    invoke-static {v0, v14, v14, v10, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 3453
    .line 3454
    .line 3455
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3456
    .line 3457
    return-object v0

    .line 3458
    nop

    .line 3459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
