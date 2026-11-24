.class public final synthetic La/t1u0;
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
    iput-byte p2, p0, La/t1u0;->a:B

    iput-object p1, p0, La/t1u0;->b:La/bsf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/t1u0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/t1u0;->b:La/bsf;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/o9p0;

    .line 11
    .line 12
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v2, p1, La/o9p0;->i:Ljava/util/List;

    .line 17
    .line 18
    :cond_0
    if-nez v2, :cond_1

    .line 19
    .line 20
    sget-object v2, La/iun;->a:La/iun;

    .line 21
    .line 22
    :cond_1
    invoke-static {p0, v2}, La/zcm0;->g(La/ctf0;Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, La/mbp0;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p1, La/mbp0;->c:La/o9p0;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object p1, p1, La/mbp0;->n:Ljava/util/List;

    .line 37
    .line 38
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 39
    .line 40
    invoke-static {v0, p1, p0}, La/ycm0;->m(La/o9p0;Ljava/util/List;La/ctf0;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :cond_2
    if-nez v2, :cond_3

    .line 45
    .line 46
    sget-object v2, La/iun;->a:La/iun;

    .line 47
    .line 48
    :cond_3
    return-object v2

    .line 49
    :pswitch_1
    check-cast p1, La/o9p0;

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    iget-object v2, p1, La/o9p0;->j:Ljava/util/List;

    .line 54
    .line 55
    :cond_4
    if-nez v2, :cond_5

    .line 56
    .line 57
    sget-object v2, La/iun;->a:La/iun;

    .line 58
    .line 59
    :cond_5
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 60
    .line 61
    invoke-static {p0, v2}, La/iom0;->h(La/ctf0;Ljava/util/List;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_2
    check-cast p1, La/obp0;

    .line 67
    .line 68
    if-eqz p1, :cond_7

    .line 69
    .line 70
    iget-object p1, p1, La/obp0;->a:Ljava/lang/Object;

    .line 71
    .line 72
    sget-object v0, La/iun;->a:La/iun;

    .line 73
    .line 74
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 75
    .line 76
    instance-of v2, p1, La/g0g0;

    .line 77
    .line 78
    if-eqz v2, :cond_6

    .line 79
    .line 80
    move-object p1, v0

    .line 81
    :cond_6
    check-cast p1, Ljava/util/List;

    .line 82
    .line 83
    const-wide/16 v2, 0x1b

    .line 84
    .line 85
    iget-object p0, p0, La/bsf;->c:La/ctf0;

    .line 86
    .line 87
    invoke-static {p1, v2, v3, p0, v1}, La/fem0;->h(Ljava/util/List;JLa/ctf0;Z)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :cond_7
    if-nez v2, :cond_8

    .line 92
    .line 93
    sget-object v2, La/iun;->a:La/iun;

    .line 94
    .line 95
    :cond_8
    return-object v2

    .line 96
    :pswitch_3
    check-cast p1, La/mbp0;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object v0, p1, La/mbp0;->k:La/e9p0;

    .line 102
    .line 103
    if-eqz v0, :cond_a

    .line 104
    .line 105
    iget-object v0, v0, La/e9p0;->d:Ljava/lang/Object;

    .line 106
    .line 107
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 108
    .line 109
    instance-of v1, v0, La/g0g0;

    .line 110
    .line 111
    if-eqz v1, :cond_9

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_9
    move-object v2, v0

    .line 115
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 116
    .line 117
    :cond_a
    if-nez v2, :cond_b

    .line 118
    .line 119
    sget-object v2, La/iun;->a:La/iun;

    .line 120
    .line 121
    :cond_b
    move-object v3, v2

    .line 122
    iget-object v4, p1, La/mbp0;->m:Ljava/lang/Integer;

    .line 123
    .line 124
    iget-object v5, p0, La/bsf;->c:La/ctf0;

    .line 125
    .line 126
    iget-object v0, p1, La/mbp0;->f:La/sff0;

    .line 127
    .line 128
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 129
    .line 130
    iget-object v6, v0, La/mum0;->y:La/v5l0;

    .line 131
    .line 132
    iget-object v7, p0, La/bsf;->f:Ljava/util/Locale;

    .line 133
    .line 134
    iget-boolean v8, p1, La/mbp0;->o:Z

    .line 135
    .line 136
    invoke-static/range {v3 .. v8}, La/ghm0;->o(Ljava/util/List;Ljava/lang/Integer;La/ctf0;La/v5l0;Ljava/util/Locale;Z)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :pswitch_4
    check-cast p1, La/mbp0;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    invoke-virtual {p0, p1, v0}, La/bsf;->d(La/mbp0;Z)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :pswitch_5
    check-cast p1, La/mbp0;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1, v1}, La/bsf;->d(La/mbp0;Z)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :pswitch_6
    iget-object v1, p0, La/bsf;->d:La/g2v;

    .line 163
    .line 164
    check-cast p1, La/mbp0;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v0, p1, La/mbp0;->h:La/fbp0;

    .line 170
    .line 171
    iget-object v3, p1, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 172
    .line 173
    sget-object v4, La/dbp0;->c:La/dbp0;

    .line 174
    .line 175
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_c

    .line 180
    .line 181
    iget-object v0, p1, La/mbp0;->k:La/e9p0;

    .line 182
    .line 183
    iget-object v2, p1, La/mbp0;->f:La/sff0;

    .line 184
    .line 185
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 186
    .line 187
    iget-object v2, v2, La/mum0;->y:La/v5l0;

    .line 188
    .line 189
    move-object v4, v3

    .line 190
    iget-boolean v3, p1, La/mbp0;->a:Z

    .line 191
    .line 192
    iget-wide v4, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 193
    .line 194
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iget-object v6, p0, La/bsf;->j:La/n0o0;

    .line 199
    .line 200
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    check-cast v6, La/fee;

    .line 205
    .line 206
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    check-cast v6, Ljava/util/Collection;

    .line 211
    .line 212
    invoke-virtual {p1, v6}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 213
    .line 214
    .line 215
    iget-object v6, p0, La/bsf;->k:La/n0o0;

    .line 216
    .line 217
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    check-cast v6, La/fee;

    .line 222
    .line 223
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    check-cast v6, Ljava/util/Collection;

    .line 228
    .line 229
    invoke-virtual {p1, v6}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 230
    .line 231
    .line 232
    iget-object p0, p0, La/bsf;->l:La/n0o0;

    .line 233
    .line 234
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    check-cast p0, La/fee;

    .line 239
    .line 240
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    check-cast p0, Ljava/util/Collection;

    .line 245
    .line 246
    invoke-static {p1, p0, p1}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-static/range {v0 .. v6}, La/aem0;->m(La/e9p0;La/g2v;La/v5l0;ZJLa/a4x;)La/bbp0;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    goto :goto_1

    .line 255
    :cond_c
    move-object v4, v3

    .line 256
    sget-object v3, La/ebp0;->c:La/ebp0;

    .line 257
    .line 258
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_d

    .line 263
    .line 264
    iget-object v0, p1, La/mbp0;->c:La/o9p0;

    .line 265
    .line 266
    move-object v2, v1

    .line 267
    iget-object v1, p1, La/mbp0;->l:La/obp0;

    .line 268
    .line 269
    iget-boolean v3, p1, La/mbp0;->a:Z

    .line 270
    .line 271
    iget-wide v4, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 272
    .line 273
    new-instance v6, La/rbt0;

    .line 274
    .line 275
    const/4 p1, 0x6

    .line 276
    invoke-direct {v6, p0, p1}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 277
    .line 278
    .line 279
    invoke-static/range {v0 .. v6}, La/gnm0;->h(La/o9p0;La/obp0;La/g2v;ZJLkotlin/jvm/functions/Function0;)La/bbp0;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    goto :goto_1

    .line 284
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 285
    .line 286
    .line 287
    :goto_1
    return-object v2

    .line 288
    nop

    .line 289
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
