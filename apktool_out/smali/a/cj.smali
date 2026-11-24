.class public final synthetic La/cj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;ZZ)V
    .locals 0

    .line 3
    iput-byte p1, p0, La/cj;->a:B

    iput-object p2, p0, La/cj;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/cj;->b:Z

    iput-boolean p4, p0, La/cj;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/github/terrakok/cicerone/androidx/FragmentScreen;ZB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/cj;->a:B

    iput-boolean p1, p0, La/cj;->b:Z

    iput-object p2, p0, La/cj;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/cj;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/cj;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/cj;->b:Z

    iput-boolean p2, p0, La/cj;->c:Z

    iput-object p3, p0, La/cj;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/cj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-boolean v4, p0, La/cj;->c:Z

    .line 7
    .line 8
    iget-boolean v5, p0, La/cj;->b:Z

    .line 9
    .line 10
    iget-object v6, p0, La/cj;->d:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v6, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 16
    .line 17
    check-cast p1, La/k0w0;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v2}, La/k0w0;->c(La/m7h0;)V

    .line 23
    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v6}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/c8d;

    .line 34
    .line 35
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 36
    .line 37
    new-instance v0, La/nqd;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-direct {v0, v1}, La/nqd;-><init>(B)V

    .line 41
    .line 42
    .line 43
    iput-boolean v4, v0, La/nqd;->b:Z

    .line 44
    .line 45
    invoke-virtual {v0}, La/nqd;->d()La/bjk;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, La/v7d;

    .line 50
    .line 51
    invoke-direct {v1, v3, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p1, v6}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 58
    .line 59
    .line 60
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    check-cast v6, La/k6z;

    .line 64
    .line 65
    check-cast p1, La/uag0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object p0, La/k6z;->a:La/k6z;

    .line 71
    .line 72
    const/high16 v0, 0x3f800000    # 1.0f

    .line 73
    .line 74
    const/high16 v1, -0x40800000    # -1.0f

    .line 75
    .line 76
    if-ne v6, p0, :cond_3

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    :cond_1
    move p0, v1

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    :goto_1
    move p0, v0

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    if-eqz v5, :cond_1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_2
    invoke-virtual {p1, p0}, La/uag0;->w(F)V

    .line 88
    .line 89
    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    move v0, v1

    .line 93
    :cond_4
    invoke-virtual {p1, v0}, La/uag0;->y(F)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1
    check-cast v6, La/ba50;

    .line 100
    .line 101
    check-cast p1, La/nlz;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v5}, La/ba50;->a(Z)V

    .line 107
    .line 108
    .line 109
    new-instance p0, La/gb50;

    .line 110
    .line 111
    invoke-direct {p0, p1, v6, v4}, La/gb50;-><init>(La/nlz;La/ba50;Z)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_2
    move-object v9, v6

    .line 116
    check-cast v9, Landroid/view/View;

    .line 117
    .line 118
    check-cast p1, La/ilz;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    :goto_3
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 131
    .line 132
    if-eqz v1, :cond_6

    .line 133
    .line 134
    instance-of v1, v0, Landroid/app/Activity;

    .line 135
    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    check-cast v0, Landroid/app/Activity;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_5
    check-cast v0, Landroid/content/ContextWrapper;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    move-object v0, v2

    .line 152
    :goto_4
    if-eqz v0, :cond_7

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    :cond_7
    move-object v8, v2

    .line 159
    new-instance v7, La/q7y;

    .line 160
    .line 161
    const/4 v12, 0x0

    .line 162
    iget-boolean v10, p0, La/cj;->b:Z

    .line 163
    .line 164
    iget-boolean v11, p0, La/cj;->c:Z

    .line 165
    .line 166
    invoke-direct/range {v7 .. v12}, La/q7y;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZB)V

    .line 167
    .line 168
    .line 169
    new-instance p0, La/llo;

    .line 170
    .line 171
    const/16 v0, 0xb

    .line 172
    .line 173
    invoke-direct {p0, v8, v7, v0}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, La/q7y;->run()V

    .line 177
    .line 178
    .line 179
    if-eqz v8, :cond_8

    .line 180
    .line 181
    invoke-virtual {v8}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_8

    .line 186
    .line 187
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 188
    .line 189
    .line 190
    :cond_8
    new-instance v0, La/s7y;

    .line 191
    .line 192
    invoke-direct {v0, p1, v8, p0, v7}, La/s7y;-><init>(La/ilz;Landroid/view/Window;La/llo;La/q7y;)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    check-cast p1, Landroid/view/MotionEvent;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-eqz p0, :cond_b

    .line 208
    .line 209
    if-eq p0, v3, :cond_9

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    if-eqz v4, :cond_a

    .line 213
    .line 214
    sget-object p0, La/u5q0;->a:La/u5q0;

    .line 215
    .line 216
    invoke-interface {v6, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    :cond_a
    move v1, v3

    .line 220
    goto :goto_5

    .line 221
    :cond_b
    move v1, v5

    .line 222
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_4
    check-cast v6, La/ye60;

    .line 228
    .line 229
    check-cast p1, La/abi0;

    .line 230
    .line 231
    invoke-interface {v6}, La/ye60;->a()J

    .line 232
    .line 233
    .line 234
    move-result-wide v9

    .line 235
    sget-object p0, La/h5i0;->a:La/zai0;

    .line 236
    .line 237
    new-instance v7, La/g5i0;

    .line 238
    .line 239
    if-eqz v5, :cond_c

    .line 240
    .line 241
    sget-object v0, La/blv;->b:La/blv;

    .line 242
    .line 243
    :goto_6
    move-object v8, v0

    .line 244
    goto :goto_7

    .line 245
    :cond_c
    sget-object v0, La/blv;->c:La/blv;

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :goto_7
    if-eqz v4, :cond_d

    .line 249
    .line 250
    sget-object v0, La/f5i0;->a:La/f5i0;

    .line 251
    .line 252
    :goto_8
    move-object v11, v0

    .line 253
    goto :goto_9

    .line 254
    :cond_d
    sget-object v0, La/f5i0;->c:La/f5i0;

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :goto_9
    const-wide v4, 0x7fffffff7fffffffL

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    and-long/2addr v4, v9

    .line 263
    const-wide v12, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    cmp-long v0, v4, v12

    .line 269
    .line 270
    if-eqz v0, :cond_e

    .line 271
    .line 272
    move v12, v3

    .line 273
    goto :goto_a

    .line 274
    :cond_e
    move v12, v1

    .line 275
    :goto_a
    invoke-direct/range {v7 .. v12}, La/g5i0;-><init>(La/blv;JLa/f5i0;Z)V

    .line 276
    .line 277
    .line 278
    invoke-interface {p1, p0, v7}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_5
    sget-object p0, La/cfx0;->o:La/bjk;

    .line 285
    .line 286
    check-cast v6, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 287
    .line 288
    check-cast p1, La/k0w0;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    if-eqz v5, :cond_f

    .line 294
    .line 295
    invoke-virtual {p1, v6}, La/k0w0;->m(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)La/ikt0;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p1, La/c8d;

    .line 302
    .line 303
    new-instance v0, La/v7d;

    .line 304
    .line 305
    invoke-direct {v0, v4, p0, p0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 306
    .line 307
    .line 308
    iput-object v0, p1, La/c8d;->a:La/w7d;

    .line 309
    .line 310
    goto :goto_b

    .line 311
    :cond_f
    invoke-virtual {p1, v6}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast p1, La/c8d;

    .line 318
    .line 319
    new-instance v0, La/v7d;

    .line 320
    .line 321
    invoke-direct {v0, v4, p0, p0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 322
    .line 323
    .line 324
    iput-object v0, p1, La/c8d;->a:La/w7d;

    .line 325
    .line 326
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    return-object p0

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
