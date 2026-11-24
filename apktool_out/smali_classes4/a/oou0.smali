.class public final La/oou0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/hzg;

.field public final p:La/mne;

.field public final q:La/r2u;

.field public final r:La/m1e;

.field public final s:La/duj;

.field public final t:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

.field public u:La/c4m0;

.field public v:La/bby;


# direct methods
.method public constructor <init>(La/hzg;La/g2v;La/ctf0;La/mne;La/r2u;La/m1e;La/duj;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p4, La/mne;->c:La/vs10;

    .line 8
    .line 9
    iget-object v1, p4, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/o1u0;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    invoke-direct {v1, v2}, La/o1u0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v2, La/cls0;

    .line 23
    .line 24
    const/16 v3, 0x8

    .line 25
    .line 26
    invoke-direct {v2, p3, p2, v3}, La/cls0;-><init>(La/ctf0;La/g2v;B)V

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-direct {p0, v1, v0, v2, p2}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/oou0;->o:La/hzg;

    .line 34
    .line 35
    iput-object p4, p0, La/oou0;->p:La/mne;

    .line 36
    .line 37
    iput-object p5, p0, La/oou0;->q:La/r2u;

    .line 38
    .line 39
    iput-object p6, p0, La/oou0;->r:La/m1e;

    .line 40
    .line 41
    iput-object p7, p0, La/oou0;->s:La/duj;

    .line 42
    .line 43
    iput-object p8, p0, La/oou0;->t:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 4

    .line 1
    iget-object v0, p0, La/oou0;->u:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/oou0;->r:La/m1e;

    .line 7
    .line 8
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/nou0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v1, p0, v2, v3}, La/nou0;-><init>(La/oou0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/fnq;

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, La/oou0;->p:La/mne;

    .line 34
    .line 35
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 36
    .line 37
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, La/foe;->h:La/foe;

    .line 42
    .line 43
    invoke-static {v2, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, La/oou0;->u:La/c4m0;

    .line 48
    .line 49
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 10

    .line 1
    check-cast p1, La/dou0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/cou0;

    .line 10
    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    check-cast p1, La/cou0;

    .line 14
    .line 15
    instance-of v0, p1, La/aou0;

    .line 16
    .line 17
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 18
    .line 19
    iget-object v2, p0, La/i3t0;->i:La/ocj;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    check-cast p1, La/aou0;

    .line 24
    .line 25
    iget-boolean v6, p1, La/aou0;->a:Z

    .line 26
    .line 27
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-object v3, p0

    .line 37
    check-cast v3, La/kou0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    const/16 v8, 0xa

    .line 46
    .line 47
    const-string v4, ""

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-static/range {v3 .. v8}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v7, 0x0

    .line 56
    const/16 v8, 0xb

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-static/range {v3 .. v8}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :cond_2
    instance-of v0, p1, La/xnu0;

    .line 73
    .line 74
    iget-object v3, p0, La/oou0;->o:La/hzg;

    .line 75
    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 79
    .line 80
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-object v4, p1

    .line 88
    check-cast v4, La/kou0;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    const/16 v9, 0xe

    .line 95
    .line 96
    const-string v5, ""

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    invoke-static/range {v4 .. v9}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v0, p1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, La/kou0;

    .line 115
    .line 116
    iget-boolean p0, p0, La/kou0;->c:Z

    .line 117
    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    iget-object p0, v2, La/ocj;->a:La/p7m0;

    .line 121
    .line 122
    :cond_4
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-object v2, p1

    .line 130
    check-cast v2, La/kou0;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    const/16 v7, 0xa

    .line 137
    .line 138
    const-string v3, ""

    .line 139
    .line 140
    const/4 v4, 0x0

    .line 141
    const/4 v5, 0x0

    .line 142
    invoke-static/range {v2 .. v7}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_4

    .line 151
    .line 152
    goto/16 :goto_1

    .line 153
    .line 154
    :cond_5
    check-cast v3, La/uzg;

    .line 155
    .line 156
    invoke-virtual {v3}, La/uzg;->a()V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_6
    instance-of v0, p1, La/bou0;

    .line 161
    .line 162
    if-eqz v0, :cond_8

    .line 163
    .line 164
    check-cast p1, La/bou0;

    .line 165
    .line 166
    iget-object v4, p1, La/bou0;->a:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 169
    .line 170
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-object v3, p0

    .line 178
    check-cast v3, La/kou0;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    const/4 v7, 0x0

    .line 184
    const/16 v8, 0xe

    .line 185
    .line 186
    const/4 v5, 0x0

    .line 187
    const/4 v6, 0x0

    .line 188
    invoke-static/range {v3 .. v8}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    if-eqz p0, :cond_7

    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :cond_8
    instance-of v0, p1, La/ynu0;

    .line 201
    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    check-cast p1, La/ynu0;

    .line 205
    .line 206
    iget-wide p0, p1, La/ynu0;->a:J

    .line 207
    .line 208
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 209
    .line 210
    sget-object v1, La/k1g;->b:La/k1g;

    .line 211
    .line 212
    check-cast v3, La/uzg;

    .line 213
    .line 214
    invoke-virtual {v3, p0, p1, v0, v1}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_9
    instance-of v0, p1, La/wnu0;

    .line 219
    .line 220
    if-eqz v0, :cond_c

    .line 221
    .line 222
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    check-cast p0, La/kou0;

    .line 227
    .line 228
    iget-boolean p0, p0, La/kou0;->c:Z

    .line 229
    .line 230
    if-eqz p0, :cond_b

    .line 231
    .line 232
    iget-object p0, v2, La/ocj;->a:La/p7m0;

    .line 233
    .line 234
    :cond_a
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-object v2, p1

    .line 242
    check-cast v2, La/kou0;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    const/4 v6, 0x0

    .line 248
    const/16 v7, 0xa

    .line 249
    .line 250
    const-string v3, ""

    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    const/4 v5, 0x0

    .line 254
    invoke-static/range {v2 .. v7}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_a

    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_b
    check-cast v3, La/uzg;

    .line 266
    .line 267
    invoke-virtual {v3}, La/uzg;->a()V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_c
    instance-of p1, p1, La/znu0;

    .line 272
    .line 273
    if-eqz p1, :cond_d

    .line 274
    .line 275
    invoke-virtual {p0}, La/oou0;->M()V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_e
    instance-of v0, p1, La/vnu0;

    .line 284
    .line 285
    if-eqz v0, :cond_12

    .line 286
    .line 287
    check-cast p1, La/vnu0;

    .line 288
    .line 289
    instance-of v0, p1, La/unu0;

    .line 290
    .line 291
    if-eqz v0, :cond_f

    .line 292
    .line 293
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    check-cast p1, La/kou0;

    .line 298
    .line 299
    iget-object p1, p1, La/kou0;->b:La/j0g0;

    .line 300
    .line 301
    if-nez p1, :cond_10

    .line 302
    .line 303
    invoke-virtual {p0}, La/oou0;->M()V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_f
    instance-of p1, p1, La/tnu0;

    .line 308
    .line 309
    if-eqz p1, :cond_11

    .line 310
    .line 311
    iget-object p0, p0, La/oou0;->u:La/c4m0;

    .line 312
    .line 313
    if-eqz p0, :cond_10

    .line 314
    .line 315
    const/4 p1, 0x0

    .line 316
    invoke-virtual {p0, p1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 317
    .line 318
    .line 319
    :cond_10
    :goto_1
    return-void

    .line 320
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 325
    .line 326
    .line 327
    return-void
.end method
