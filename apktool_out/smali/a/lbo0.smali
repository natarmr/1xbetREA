.class public final La/lbo0;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public o:La/l7m0;

.field public p:I

.field public q:Z

.field public r:La/nul0;

.field public s:La/t33;

.field public t:La/t33;

.field public u:La/ycl;

.field public v:La/ycl;


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 19

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    sget-object v7, La/hp4;->l:La/lxs0;

    .line 6
    .line 7
    iget-object v0, v3, La/lbo0;->o:La/l7m0;

    .line 8
    .line 9
    check-cast v0, La/hgk0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, La/rgn0;

    .line 24
    .line 25
    const/16 v1, 0x19

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/rgn0;-><init>(B)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v6, v1, v1, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :cond_0
    iget-boolean v0, v3, La/lbo0;->q:Z

    .line 37
    .line 38
    iget-object v1, v3, La/lbo0;->o:La/l7m0;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    check-cast v1, La/hgk0;

    .line 43
    .line 44
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/util/List;

    .line 49
    .line 50
    iget v1, v3, La/lbo0;->p:I

    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/ado0;

    .line 57
    .line 58
    iget v0, v0, La/ado0;->c:F

    .line 59
    .line 60
    :goto_0
    move v2, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    check-cast v1, La/hgk0;

    .line 63
    .line 64
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/util/List;

    .line 69
    .line 70
    iget v1, v3, La/lbo0;->p:I

    .line 71
    .line 72
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/ado0;

    .line 77
    .line 78
    iget v0, v0, La/ado0;->b:F

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :goto_1
    iget-object v0, v3, La/lbo0;->v:La/ycl;

    .line 82
    .line 83
    const/4 v8, 0x3

    .line 84
    const/16 v9, 0xc

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    iget-object v1, v3, La/lbo0;->t:La/t33;

    .line 90
    .line 91
    if-nez v1, :cond_2

    .line 92
    .line 93
    new-instance v1, La/t33;

    .line 94
    .line 95
    invoke-direct {v1, v0, v7, v4, v9}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    iput-object v1, v3, La/lbo0;->t:La/t33;

    .line 99
    .line 100
    :cond_2
    iget-object v0, v1, La/t33;->e:La/pz40;

    .line 101
    .line 102
    check-cast v0, La/hgk0;

    .line 103
    .line 104
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/ycl;

    .line 109
    .line 110
    iget v0, v0, La/ycl;->a:F

    .line 111
    .line 112
    invoke-static {v2, v0}, La/ycl;->b(FF)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    invoke-virtual {v3}, La/lm40;->N0()La/vne;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    new-instance v0, La/kbo0;

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    invoke-direct/range {v0 .. v5}, La/kbo0;-><init>(La/t33;FLa/lbo0;La/yje;B)V

    .line 126
    .line 127
    .line 128
    move v11, v2

    .line 129
    invoke-static {v10, v4, v4, v0, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    move v11, v2

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    move v11, v2

    .line 136
    new-instance v0, La/ycl;

    .line 137
    .line 138
    invoke-direct {v0, v11}, La/ycl;-><init>(F)V

    .line 139
    .line 140
    .line 141
    iput-object v0, v3, La/lbo0;->v:La/ycl;

    .line 142
    .line 143
    :goto_2
    iget-object v0, v3, La/lbo0;->o:La/l7m0;

    .line 144
    .line 145
    check-cast v0, La/hgk0;

    .line 146
    .line 147
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/util/List;

    .line 152
    .line 153
    iget v1, v3, La/lbo0;->p:I

    .line 154
    .line 155
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, La/ado0;

    .line 160
    .line 161
    iget v2, v0, La/ado0;->a:F

    .line 162
    .line 163
    iget-object v0, v3, La/lbo0;->u:La/ycl;

    .line 164
    .line 165
    if-eqz v0, :cond_6

    .line 166
    .line 167
    iget-object v1, v3, La/lbo0;->s:La/t33;

    .line 168
    .line 169
    if-nez v1, :cond_5

    .line 170
    .line 171
    new-instance v1, La/t33;

    .line 172
    .line 173
    invoke-direct {v1, v0, v7, v4, v9}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 174
    .line 175
    .line 176
    iput-object v1, v3, La/lbo0;->s:La/t33;

    .line 177
    .line 178
    :cond_5
    iget-object v0, v1, La/t33;->e:La/pz40;

    .line 179
    .line 180
    check-cast v0, La/hgk0;

    .line 181
    .line 182
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, La/ycl;

    .line 187
    .line 188
    iget v0, v0, La/ycl;->a:F

    .line 189
    .line 190
    invoke-static {v2, v0}, La/ycl;->b(FF)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v0, :cond_7

    .line 195
    .line 196
    invoke-virtual {v3}, La/lm40;->N0()La/vne;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    new-instance v0, La/kbo0;

    .line 201
    .line 202
    const/4 v5, 0x1

    .line 203
    invoke-direct/range {v0 .. v5}, La/kbo0;-><init>(La/t33;FLa/lbo0;La/yje;B)V

    .line 204
    .line 205
    .line 206
    invoke-static {v7, v4, v4, v0, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_6
    new-instance v0, La/ycl;

    .line 211
    .line 212
    invoke-direct {v0, v2}, La/ycl;-><init>(F)V

    .line 213
    .line 214
    .line 215
    iput-object v0, v3, La/lbo0;->u:La/ycl;

    .line 216
    .line 217
    :cond_7
    :goto_3
    invoke-interface {v6}, La/cnx;->getLayoutDirection()La/k6z;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sget-object v1, La/k6z;->a:La/k6z;

    .line 222
    .line 223
    iget-object v4, v3, La/lbo0;->s:La/t33;

    .line 224
    .line 225
    if-ne v0, v1, :cond_8

    .line 226
    .line 227
    if-eqz v4, :cond_a

    .line 228
    .line 229
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, La/ycl;

    .line 234
    .line 235
    iget v2, v0, La/ycl;->a:F

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_8
    if-eqz v4, :cond_9

    .line 239
    .line 240
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, La/ycl;

    .line 245
    .line 246
    iget v2, v0, La/ycl;->a:F

    .line 247
    .line 248
    :cond_9
    neg-float v2, v2

    .line 249
    :cond_a
    :goto_4
    iget-object v0, v3, La/lbo0;->t:La/t33;

    .line 250
    .line 251
    if-eqz v0, :cond_b

    .line 252
    .line 253
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, La/ycl;

    .line 258
    .line 259
    iget v0, v0, La/ycl;->a:F

    .line 260
    .line 261
    move v11, v0

    .line 262
    :cond_b
    invoke-interface {v6, v11}, La/w6k;->T(F)I

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    invoke-interface {v6, v11}, La/w6k;->T(F)I

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const/16 v18, 0xc

    .line 273
    .line 274
    const/16 v16, 0x0

    .line 275
    .line 276
    move-wide/from16 v12, p3

    .line 277
    .line 278
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 279
    .line 280
    .line 281
    move-result-wide v0

    .line 282
    move-object/from16 v3, p2

    .line 283
    .line 284
    invoke-interface {v3, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget v1, v0, La/pu90;->a:I

    .line 289
    .line 290
    iget v3, v0, La/pu90;->b:I

    .line 291
    .line 292
    new-instance v4, La/ny2;

    .line 293
    .line 294
    const/16 v5, 0x10

    .line 295
    .line 296
    invoke-direct {v4, v0, v6, v2, v5}, La/ny2;-><init>(Ljava/lang/Object;Ljava/lang/Object;FB)V

    .line 297
    .line 298
    .line 299
    invoke-static {v6, v1, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0
.end method
