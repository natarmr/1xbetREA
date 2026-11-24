.class public final synthetic La/b29;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/b29;->a:B

    iput-object p4, p0, La/b29;->c:Ljava/lang/Object;

    iput-object p5, p0, La/b29;->d:Ljava/lang/Object;

    iput-object p6, p0, La/b29;->e:Ljava/lang/Object;

    iput-object p7, p0, La/b29;->f:Ljava/lang/Object;

    iput-object p8, p0, La/b29;->g:Ljava/lang/Object;

    iput-wide p2, p0, La/b29;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/fhj;Ljava/lang/String;JLa/wyu;La/qzt;La/pru;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/b29;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b29;->d:Ljava/lang/Object;

    iput-object p2, p0, La/b29;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/b29;->b:J

    iput-object p5, p0, La/b29;->f:Ljava/lang/Object;

    iput-object p6, p0, La/b29;->g:Ljava/lang/Object;

    iput-object p7, p0, La/b29;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/qzt;La/ctf0;La/fhj;Ljava/lang/String;JLa/wyu;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/b29;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b29;->c:Ljava/lang/Object;

    iput-object p2, p0, La/b29;->d:Ljava/lang/Object;

    iput-object p3, p0, La/b29;->e:Ljava/lang/Object;

    iput-object p4, p0, La/b29;->f:Ljava/lang/Object;

    iput-wide p5, p0, La/b29;->b:J

    iput-object p7, p0, La/b29;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b29;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    iget-object v4, v0, La/b29;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, v0, La/b29;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/b29;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/b29;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, La/b29;->d:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v9, v8

    .line 21
    check-cast v9, La/fhj;

    .line 22
    .line 23
    move-object/from16 v21, v7

    .line 24
    .line 25
    check-cast v21, Ljava/lang/String;

    .line 26
    .line 27
    check-cast v6, La/wyu;

    .line 28
    .line 29
    check-cast v5, La/qzt;

    .line 30
    .line 31
    check-cast v4, La/pru;

    .line 32
    .line 33
    invoke-virtual {v6}, La/wyu;->a()La/uaq0;

    .line 34
    .line 35
    .line 36
    move-result-object v13

    .line 37
    const-wide/16 v14, 0x0

    .line 38
    .line 39
    iget-wide v11, v0, La/b29;->b:J

    .line 40
    .line 41
    move-object/from16 v10, v21

    .line 42
    .line 43
    invoke-virtual/range {v9 .. v15}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 44
    .line 45
    .line 46
    move-result-object v15

    .line 47
    invoke-virtual {v5}, La/qzt;->a()La/eme;

    .line 48
    .line 49
    .line 50
    move-result-object v14

    .line 51
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 56
    .line 57
    iget-object v0, v0, La/mum0;->t:La/llm0;

    .line 58
    .line 59
    sget-object v25, La/iun;->a:La/iun;

    .line 60
    .line 61
    new-instance v10, La/vlv0;

    .line 62
    .line 63
    new-instance v13, La/edm0;

    .line 64
    .line 65
    invoke-direct {v13, v2, v3}, La/edm0;-><init>(J)V

    .line 66
    .line 67
    .line 68
    const-string v23, ""

    .line 69
    .line 70
    const-string v24, ""

    .line 71
    .line 72
    const/16 v16, 0x1

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    const/16 v18, 0x0

    .line 77
    .line 78
    const-string v20, ""

    .line 79
    .line 80
    const-string v22, ""

    .line 81
    .line 82
    move-object/from16 v19, v0

    .line 83
    .line 84
    invoke-direct/range {v10 .. v25}, La/vlv0;-><init>(JLa/hdm0;La/eme;La/nc5;ZZZLa/llm0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    return-object v10

    .line 88
    :pswitch_0
    check-cast v4, La/weu;

    .line 89
    .line 90
    move-object v10, v8

    .line 91
    check-cast v10, Ljava/lang/String;

    .line 92
    .line 93
    check-cast v7, La/qzt;

    .line 94
    .line 95
    check-cast v6, La/ctf0;

    .line 96
    .line 97
    move-object v9, v5

    .line 98
    check-cast v9, La/fhj;

    .line 99
    .line 100
    new-instance v1, La/w7g0;

    .line 101
    .line 102
    invoke-virtual {v4, v10}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v7}, La/qzt;->a()La/eme;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v2, v3, v6}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 111
    .line 112
    .line 113
    move-result-object v16

    .line 114
    sget-object v13, La/uaq0;->b:La/uaq0;

    .line 115
    .line 116
    const-wide/16 v14, 0x0

    .line 117
    .line 118
    iget-wide v11, v0, La/b29;->b:J

    .line 119
    .line 120
    invoke-virtual/range {v9 .. v15}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 121
    .line 122
    .line 123
    move-result-object v17

    .line 124
    const/4 v12, 0x1

    .line 125
    const/4 v13, 0x0

    .line 126
    const/4 v14, 0x0

    .line 127
    const/4 v15, 0x0

    .line 128
    move-object v11, v1

    .line 129
    invoke-direct/range {v11 .. v17}, La/w7g0;-><init>(ZZZLa/l7g0;La/zdm0;La/nc5;)V

    .line 130
    .line 131
    .line 132
    return-object v11

    .line 133
    :pswitch_1
    check-cast v4, La/qzt;

    .line 134
    .line 135
    check-cast v8, La/ctf0;

    .line 136
    .line 137
    move-object v9, v7

    .line 138
    check-cast v9, La/fhj;

    .line 139
    .line 140
    move-object v10, v6

    .line 141
    check-cast v10, Ljava/lang/String;

    .line 142
    .line 143
    check-cast v5, La/wyu;

    .line 144
    .line 145
    sget-object v18, La/lak0;->c:La/lak0;

    .line 146
    .line 147
    new-instance v1, La/edm0;

    .line 148
    .line 149
    invoke-direct {v1, v2, v3}, La/edm0;-><init>(J)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, La/qzt;->a()La/eme;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v1, v2, v8}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 157
    .line 158
    .line 159
    move-result-object v19

    .line 160
    invoke-virtual {v5}, La/wyu;->a()La/uaq0;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    const-wide/16 v14, 0x0

    .line 165
    .line 166
    iget-wide v11, v0, La/b29;->b:J

    .line 167
    .line 168
    invoke-virtual/range {v9 .. v15}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 169
    .line 170
    .line 171
    move-result-object v20

    .line 172
    new-instance v0, La/dqw;

    .line 173
    .line 174
    const-string v16, ""

    .line 175
    .line 176
    const-string v17, ""

    .line 177
    .line 178
    const/4 v11, 0x1

    .line 179
    const/4 v12, 0x0

    .line 180
    const/4 v13, 0x0

    .line 181
    const-string v15, ""

    .line 182
    .line 183
    move-object v14, v10

    .line 184
    move-object v10, v0

    .line 185
    invoke-direct/range {v10 .. v20}, La/dqw;-><init>(ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;La/zdm0;La/nc5;)V

    .line 186
    .line 187
    .line 188
    return-object v10

    .line 189
    :pswitch_2
    check-cast v4, La/pru;

    .line 190
    .line 191
    check-cast v8, La/vzg0;

    .line 192
    .line 193
    check-cast v7, La/iqt;

    .line 194
    .line 195
    check-cast v6, La/dmt;

    .line 196
    .line 197
    check-cast v5, La/bzt;

    .line 198
    .line 199
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 204
    .line 205
    const-string v2, "SEARCH_QUERY_KEY"

    .line 206
    .line 207
    invoke-virtual {v8, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, Ljava/lang/String;

    .line 212
    .line 213
    const-string v3, ""

    .line 214
    .line 215
    if-nez v2, :cond_0

    .line 216
    .line 217
    move-object v2, v3

    .line 218
    :cond_0
    const-string v4, "FILTER_QUERY_KEY"

    .line 219
    .line 220
    invoke-virtual {v8, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Ljava/lang/String;

    .line 225
    .line 226
    if-nez v4, :cond_1

    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_1
    move-object v3, v4

    .line 230
    :goto_0
    const-string v4, "SORT_TYPE_KEY"

    .line 231
    .line 232
    invoke-virtual {v8, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    check-cast v4, La/uzb0;

    .line 237
    .line 238
    if-nez v4, :cond_2

    .line 239
    .line 240
    sget-object v4, La/uzb0;->a:La/uzb0;

    .line 241
    .line 242
    :cond_2
    move-object v15, v4

    .line 243
    new-instance v8, La/u19;

    .line 244
    .line 245
    iget-object v13, v1, La/hl1;->e:La/hr10;

    .line 246
    .line 247
    const/4 v10, 0x0

    .line 248
    const/4 v11, 0x0

    .line 249
    const/4 v9, 0x0

    .line 250
    const/4 v12, 0x0

    .line 251
    invoke-direct/range {v8 .. v13}, La/u19;-><init>(ZZZLjava/util/List;La/hr10;)V

    .line 252
    .line 253
    .line 254
    new-instance v9, La/v19;

    .line 255
    .line 256
    iget-object v14, v1, La/hl1;->v:La/th1;

    .line 257
    .line 258
    const/4 v12, 0x0

    .line 259
    sget-object v13, La/iun;->a:La/iun;

    .line 260
    .line 261
    invoke-direct/range {v9 .. v14}, La/v19;-><init>(ZZZLjava/util/List;La/th1;)V

    .line 262
    .line 263
    .line 264
    iget-object v1, v7, La/iqt;->a:La/gst0;

    .line 265
    .line 266
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    invoke-virtual {v6}, La/dmt;->b()La/kg;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    iget-object v1, v5, La/bzt;->a:La/fsd;

    .line 275
    .line 276
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    iget v1, v1, La/v8d;->r:I

    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-lez v4, :cond_3

    .line 287
    .line 288
    const/4 v4, 0x1

    .line 289
    :goto_1
    move-object v11, v9

    .line 290
    goto :goto_2

    .line 291
    :cond_3
    const/4 v4, 0x0

    .line 292
    goto :goto_1

    .line 293
    :goto_2
    new-instance v9, La/w19;

    .line 294
    .line 295
    invoke-direct {v9, v4, v2, v3}, La/w19;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    move-object v10, v8

    .line 299
    new-instance v8, La/x19;

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    iget-wide v2, v0, La/b29;->b:J

    .line 303
    .line 304
    move/from16 v16, v1

    .line 305
    .line 306
    move-wide/from16 v17, v2

    .line 307
    .line 308
    invoke-direct/range {v8 .. v18}, La/x19;-><init>(La/w19;La/u19;La/v19;ZLa/ql5;La/kg;La/uzb0;IJ)V

    .line 309
    .line 310
    .line 311
    return-object v8

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
