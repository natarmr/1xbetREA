.class public final La/p7g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/s7g;


# direct methods
.method public synthetic constructor <init>(La/s7g;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p7g;->i:B

    iput-object p1, p0, La/p7g;->k:La/s7g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p7g;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/p7g;->k:La/s7g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/p7g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/p7g;-><init>(La/s7g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/p7g;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/p7g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/p7g;-><init>(La/s7g;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/p7g;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/p7g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/wl9;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/p7g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/p7g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/p7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/abg;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/p7g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/p7g;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/p7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/p7g;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/p7g;->k:La/s7g;

    .line 6
    .line 7
    iget-object p0, p0, La/p7g;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/wl9;

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, La/wl9;->a:Ljava/util/List;

    .line 20
    .line 21
    iget v0, p0, La/wl9;->c:I

    .line 22
    .line 23
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, La/vl9;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, La/wl9;->a:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    move-object p1, p0

    .line 38
    check-cast p1, La/vl9;

    .line 39
    .line 40
    :cond_0
    if-eqz p1, :cond_8

    .line 41
    .line 42
    iget-object p0, p1, La/vl9;->b:La/yag;

    .line 43
    .line 44
    sget-object p1, La/s7g;->U1:La/usd;

    .line 45
    .line 46
    new-instance p1, La/vef;

    .line 47
    .line 48
    invoke-direct {p1, p0, v3, v1}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object v1, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 63
    .line 64
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    move-object v5, v4

    .line 87
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 88
    .line 89
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->O()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_1

    .line 94
    .line 95
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v5, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_1

    .line 102
    .line 103
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    invoke-virtual {v0, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_3

    .line 116
    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->S()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-ne v4, v2, :cond_3

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_3
    new-instance v4, La/zb5;

    .line 127
    .line 128
    invoke-direct {v4, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 129
    .line 130
    .line 131
    const v0, 0x7f010053

    .line 132
    .line 133
    .line 134
    const v5, 0x7f010054

    .line 135
    .line 136
    .line 137
    const v6, 0x7f010051

    .line 138
    .line 139
    .line 140
    const v7, 0x7f010052

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v6, v7, v0, v5}, La/zb5;->p(IIII)V

    .line 144
    .line 145
    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->S()Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-eqz p0, :cond_4

    .line 153
    .line 154
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->O()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-eqz p0, :cond_6

    .line 159
    .line 160
    :cond_4
    sget-object p0, La/lkz;->e:La/lkz;

    .line 161
    .line 162
    invoke-virtual {v4, v1, p0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v1}, La/zb5;->r(Landroidx/fragment/app/Fragment;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    invoke-virtual {p1}, La/vef;->invoke()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 174
    .line 175
    const v0, 0x7f0a060f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v0, p1, p0, v2}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    :cond_6
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_7

    .line 190
    .line 191
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 196
    .line 197
    sget-object v0, La/lkz;->d:La/lkz;

    .line 198
    .line 199
    invoke-virtual {v4, p1, v0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, p1}, La/zb5;->m(Landroidx/fragment/app/Fragment;)V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_7
    invoke-virtual {v4}, La/zb5;->h()V

    .line 207
    .line 208
    .line 209
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_0
    check-cast p0, La/abg;

    .line 213
    .line 214
    sget-object v0, La/wne;->a:La/wne;

    .line 215
    .line 216
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    const/4 p1, 0x0

    .line 220
    if-eqz p0, :cond_b

    .line 221
    .line 222
    sget-object p0, La/s7g;->U1:La/usd;

    .line 223
    .line 224
    iget-object p0, v3, La/s7g;->N1:La/poq0;

    .line 225
    .line 226
    if-eqz p0, :cond_a

    .line 227
    .line 228
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    sget-object p1, La/fk60;->b:La/uuz;

    .line 236
    .line 237
    sget-object p1, La/ki60;->q2:La/htz;

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    const-string p1, "OnboardingBottomSheetContainerFragment"

    .line 243
    .line 244
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-nez v0, :cond_9

    .line 249
    .line 250
    new-instance v0, La/ki60;

    .line 251
    .line 252
    invoke-direct {v0}, La/ki60;-><init>()V

    .line 253
    .line 254
    .line 255
    sget-object v3, La/ki60;->r2:[La/iiy;

    .line 256
    .line 257
    aget-object v2, v3, v2

    .line 258
    .line 259
    iget-object v4, v0, La/ki60;->n2:La/zz2;

    .line 260
    .line 261
    const/16 v5, 0x19

    .line 262
    .line 263
    invoke-virtual {v4, v0, v2, v5}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 264
    .line 265
    .line 266
    iget-object v2, v0, La/ki60;->o2:La/phf0;

    .line 267
    .line 268
    aget-object v1, v3, v1

    .line 269
    .line 270
    const-string v3, ""

    .line 271
    .line 272
    invoke-virtual {v2, v0, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v0, p0, p1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_a
    const-string p0, "tipsDialogFeature"

    .line 282
    .line 283
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw p1

    .line 287
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 288
    .line 289
    .line 290
    :goto_4
    return-object p1

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
