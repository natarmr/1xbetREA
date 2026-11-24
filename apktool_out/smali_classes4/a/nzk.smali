.class public final synthetic La/nzk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/szk;


# direct methods
.method public synthetic constructor <init>(La/szk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nzk;->a:B

    iput-object p1, p0, La/nzk;->b:La/szk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/nzk;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/nzk;->b:La/szk;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/szk;->J0()La/l0l;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object p0, v5, La/l0l;->r:La/bby;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-ne p0, v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object p1, v5, La/l0l;->c:La/mne;

    .line 37
    .line 38
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 39
    .line 40
    new-instance v3, La/k0l;

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x3

    .line 44
    const/4 v4, 0x1

    .line 45
    const-class v6, La/l0l;

    .line 46
    .line 47
    const-string v7, "handleGameError"

    .line 48
    .line 49
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 50
    .line 51
    invoke-direct/range {v3 .. v10}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 52
    .line 53
    .line 54
    new-instance v10, La/g0l;

    .line 55
    .line 56
    invoke-direct {v10, v5, v1, v2}, La/g0l;-><init>(La/l0l;La/yje;B)V

    .line 57
    .line 58
    .line 59
    const/16 v11, 0xa

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    move-object v6, p0

    .line 63
    move-object v9, p1

    .line 64
    move-object v7, v3

    .line 65
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iput-object p0, v5, La/l0l;->r:La/bby;

    .line 70
    .line 71
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 75
    .line 76
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    iget-object p1, p0, La/szk;->M1:La/ii;

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const v1, 0x7f130157

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const v1, 0x7f130752

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const v1, 0x7f1304cd

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const v1, 0x7f13032f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    sget-object v11, La/n12;->a:La/n12;

    .line 142
    .line 143
    const/4 v12, 0x0

    .line 144
    const/16 v13, 0x5d0

    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const-string v8, "REQUEST_CONCEDE"

    .line 148
    .line 149
    const/4 v9, 0x0

    .line 150
    const/4 v10, 0x0

    .line 151
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v2, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 162
    .line 163
    .line 164
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_2
    const-string p0, "actionDialogManager"

    .line 168
    .line 169
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v1

    .line 173
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 174
    .line 175
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, La/szk;->J0()La/l0l;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    iget-object p0, v5, La/l0l;->r:La/bby;

    .line 185
    .line 186
    if-eqz p0, :cond_3

    .line 187
    .line 188
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    if-ne p0, v2, :cond_3

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_3
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    iget-object p1, v5, La/l0l;->c:La/mne;

    .line 200
    .line 201
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 202
    .line 203
    new-instance v3, La/k0l;

    .line 204
    .line 205
    const/4 v9, 0x0

    .line 206
    const/4 v10, 0x4

    .line 207
    const/4 v4, 0x1

    .line 208
    const-class v6, La/l0l;

    .line 209
    .line 210
    const-string v7, "handleGameError"

    .line 211
    .line 212
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 213
    .line 214
    invoke-direct/range {v3 .. v10}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 215
    .line 216
    .line 217
    new-instance v10, La/g0l;

    .line 218
    .line 219
    const/4 v0, 0x2

    .line 220
    invoke-direct {v10, v5, v1, v0}, La/g0l;-><init>(La/l0l;La/yje;B)V

    .line 221
    .line 222
    .line 223
    const/16 v11, 0xa

    .line 224
    .line 225
    const/4 v8, 0x0

    .line 226
    move-object v6, p0

    .line 227
    move-object v9, p1

    .line 228
    move-object v7, v3

    .line 229
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    iput-object p0, v5, La/l0l;->r:La/bby;

    .line 234
    .line 235
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_2
    check-cast p1, Lkotlin/Pair;

    .line 239
    .line 240
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, La/szk;->J0()La/l0l;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    iget-object p0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast p0, La/qb8;

    .line 252
    .line 253
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast p1, La/nbe;

    .line 256
    .line 257
    iget-object v0, v4, La/l0l;->r:La/bby;

    .line 258
    .line 259
    if-eqz v0, :cond_4

    .line 260
    .line 261
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-ne v0, v2, :cond_4

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_4
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget-object v1, v4, La/l0l;->c:La/mne;

    .line 273
    .line 274
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 275
    .line 276
    new-instance v3, La/k0l;

    .line 277
    .line 278
    const/4 v9, 0x0

    .line 279
    const/4 v10, 0x0

    .line 280
    move-object v5, v4

    .line 281
    const/4 v4, 0x1

    .line 282
    const-class v6, La/l0l;

    .line 283
    .line 284
    const-string v7, "handleGameError"

    .line 285
    .line 286
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 287
    .line 288
    invoke-direct/range {v3 .. v10}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 289
    .line 290
    .line 291
    move-object v2, v3

    .line 292
    new-instance v3, La/atj;

    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    const/4 v8, 0x1

    .line 296
    move-object v6, p1

    .line 297
    move-object v4, v5

    .line 298
    move-object v5, p0

    .line 299
    invoke-direct/range {v3 .. v8}, La/atj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 300
    .line 301
    .line 302
    const/16 v10, 0xa

    .line 303
    .line 304
    move-object v5, v0

    .line 305
    move-object v8, v1

    .line 306
    move-object v6, v2

    .line 307
    move-object v9, v3

    .line 308
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    iput-object p0, v4, La/l0l;->r:La/bby;

    .line 313
    .line 314
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object p0

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
