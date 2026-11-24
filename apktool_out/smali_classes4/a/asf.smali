.class public final synthetic La/asf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bsf;


# direct methods
.method public synthetic constructor <init>(La/bsf;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/asf;->a:B

    iput-object p1, p0, La/asf;->b:La/bsf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/asf;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/asf;->b:La/bsf;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/o9p0;

    .line 12
    .line 13
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v3, p1, La/o9p0;->i:Ljava/util/List;

    .line 18
    .line 19
    :cond_0
    if-nez v3, :cond_1

    .line 20
    .line 21
    sget-object v3, La/iun;->a:La/iun;

    .line 22
    .line 23
    :cond_1
    invoke-static {p0, v3}, La/zcm0;->g(La/ctf0;Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/mbp0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p1, La/mbp0;->c:La/o9p0;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object p1, p1, La/mbp0;->n:Ljava/util/List;

    .line 38
    .line 39
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 40
    .line 41
    invoke-static {v0, p1, p0}, La/ycm0;->m(La/o9p0;Ljava/util/List;La/ctf0;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :cond_2
    if-nez v3, :cond_3

    .line 46
    .line 47
    sget-object v3, La/iun;->a:La/iun;

    .line 48
    .line 49
    :cond_3
    return-object v3

    .line 50
    :pswitch_1
    check-cast p1, La/o9p0;

    .line 51
    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object v3, p1, La/o9p0;->j:Ljava/util/List;

    .line 55
    .line 56
    :cond_4
    if-nez v3, :cond_5

    .line 57
    .line 58
    sget-object v3, La/iun;->a:La/iun;

    .line 59
    .line 60
    :cond_5
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 61
    .line 62
    invoke-static {p0, v3}, La/iom0;->h(La/ctf0;Ljava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_2
    check-cast p1, La/mbp0;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, p1, La/mbp0;->l:La/obp0;

    .line 73
    .line 74
    if-eqz v0, :cond_8

    .line 75
    .line 76
    iget-object v0, v0, La/obp0;->a:Ljava/lang/Object;

    .line 77
    .line 78
    sget-object v3, La/iun;->a:La/iun;

    .line 79
    .line 80
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 81
    .line 82
    instance-of v4, v0, La/g0g0;

    .line 83
    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    move-object v0, v3

    .line 87
    :cond_6
    check-cast v0, Ljava/util/List;

    .line 88
    .line 89
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 90
    .line 91
    iget-object p1, p1, La/mbp0;->c:La/o9p0;

    .line 92
    .line 93
    if-eqz p1, :cond_7

    .line 94
    .line 95
    iget-object p1, p1, La/o9p0;->i:Ljava/util/List;

    .line 96
    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, La/eh;

    .line 104
    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    iget-boolean p1, p1, La/eh;->g:Z

    .line 108
    .line 109
    if-ne p1, v1, :cond_7

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_7
    move v1, v2

    .line 113
    :goto_0
    const-wide/16 v2, 0x2e

    .line 114
    .line 115
    invoke-static {v0, v2, v3, p0, v1}, La/fem0;->h(Ljava/util/List;JLa/ctf0;Z)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    :cond_8
    if-nez v3, :cond_9

    .line 120
    .line 121
    sget-object v3, La/iun;->a:La/iun;

    .line 122
    .line 123
    :cond_9
    return-object v3

    .line 124
    :pswitch_3
    check-cast p1, La/mbp0;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v0, p1, La/mbp0;->k:La/e9p0;

    .line 130
    .line 131
    if-eqz v0, :cond_b

    .line 132
    .line 133
    iget-object v0, v0, La/e9p0;->d:Ljava/lang/Object;

    .line 134
    .line 135
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 136
    .line 137
    instance-of v1, v0, La/g0g0;

    .line 138
    .line 139
    if-eqz v1, :cond_a

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_a
    move-object v3, v0

    .line 143
    :goto_1
    check-cast v3, Ljava/util/List;

    .line 144
    .line 145
    :cond_b
    if-nez v3, :cond_c

    .line 146
    .line 147
    sget-object v3, La/iun;->a:La/iun;

    .line 148
    .line 149
    :cond_c
    move-object v4, v3

    .line 150
    iget-object v5, p1, La/mbp0;->m:Ljava/lang/Integer;

    .line 151
    .line 152
    iget-object v6, p0, La/bsf;->c:La/ctf0;

    .line 153
    .line 154
    iget-object v0, p1, La/mbp0;->f:La/sff0;

    .line 155
    .line 156
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 157
    .line 158
    iget-object v7, v0, La/mum0;->y:La/v5l0;

    .line 159
    .line 160
    iget-object v8, p0, La/bsf;->f:Ljava/util/Locale;

    .line 161
    .line 162
    iget-boolean v9, p1, La/mbp0;->o:Z

    .line 163
    .line 164
    invoke-static/range {v4 .. v9}, La/ghm0;->o(Ljava/util/List;Ljava/lang/Integer;La/ctf0;La/v5l0;Ljava/util/Locale;Z)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :pswitch_4
    check-cast p1, La/mbp0;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, p1, v2}, La/bsf;->a(La/mbp0;Z)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :pswitch_5
    check-cast p1, La/mbp0;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1, v1}, La/bsf;->a(La/mbp0;Z)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :pswitch_6
    iget-object v1, p0, La/bsf;->d:La/g2v;

    .line 190
    .line 191
    check-cast p1, La/mbp0;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v0, p1, La/mbp0;->h:La/fbp0;

    .line 197
    .line 198
    iget-object v2, p1, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 199
    .line 200
    sget-object v4, La/dbp0;->c:La/dbp0;

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_d

    .line 207
    .line 208
    iget-object v0, p1, La/mbp0;->k:La/e9p0;

    .line 209
    .line 210
    iget-object v3, p1, La/mbp0;->f:La/sff0;

    .line 211
    .line 212
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 213
    .line 214
    iget-object v3, v3, La/mum0;->y:La/v5l0;

    .line 215
    .line 216
    move-object v4, v2

    .line 217
    move-object v2, v3

    .line 218
    iget-boolean v3, p1, La/mbp0;->a:Z

    .line 219
    .line 220
    iget-wide v4, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 221
    .line 222
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    iget-object v6, p0, La/bsf;->j:La/n0o0;

    .line 227
    .line 228
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    check-cast v6, La/fee;

    .line 233
    .line 234
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    check-cast v6, Ljava/util/Collection;

    .line 239
    .line 240
    invoke-virtual {p1, v6}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 241
    .line 242
    .line 243
    iget-object v6, p0, La/bsf;->k:La/n0o0;

    .line 244
    .line 245
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    check-cast v6, La/fee;

    .line 250
    .line 251
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    check-cast v6, Ljava/util/Collection;

    .line 256
    .line 257
    invoke-virtual {p1, v6}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 258
    .line 259
    .line 260
    iget-object p0, p0, La/bsf;->l:La/n0o0;

    .line 261
    .line 262
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    check-cast p0, La/fee;

    .line 267
    .line 268
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    check-cast p0, Ljava/util/Collection;

    .line 273
    .line 274
    invoke-static {p1, p0, p1}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-static/range {v0 .. v6}, La/aem0;->m(La/e9p0;La/g2v;La/v5l0;ZJLa/a4x;)La/bbp0;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    goto :goto_2

    .line 283
    :cond_d
    move-object v4, v2

    .line 284
    sget-object v2, La/ebp0;->c:La/ebp0;

    .line 285
    .line 286
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_e

    .line 291
    .line 292
    iget-object v0, p1, La/mbp0;->c:La/o9p0;

    .line 293
    .line 294
    move-object v2, v1

    .line 295
    iget-object v1, p1, La/mbp0;->l:La/obp0;

    .line 296
    .line 297
    iget-boolean v3, p1, La/mbp0;->a:Z

    .line 298
    .line 299
    iget-wide v4, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 300
    .line 301
    new-instance v6, La/jwd;

    .line 302
    .line 303
    const/16 p1, 0x16

    .line 304
    .line 305
    invoke-direct {v6, p0, p1}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 306
    .line 307
    .line 308
    invoke-static/range {v0 .. v6}, La/gnm0;->h(La/o9p0;La/obp0;La/g2v;ZJLkotlin/jvm/functions/Function0;)La/bbp0;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    goto :goto_2

    .line 313
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 314
    .line 315
    .line 316
    :goto_2
    return-object v3

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
