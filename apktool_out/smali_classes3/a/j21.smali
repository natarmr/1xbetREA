.class public final La/j21;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BJJLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/j21;->i:B

    iput-object p7, p0, La/j21;->m:Ljava/lang/Object;

    iput-wide p2, p0, La/j21;->k:J

    iput-wide p4, p0, La/j21;->l:J

    iput-object p8, p0, La/j21;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;JJLa/yje;B)V
    .locals 0

    .line 2
    iput-byte p8, p0, La/j21;->i:B

    iput-object p1, p0, La/j21;->m:Ljava/lang/Object;

    iput-object p2, p0, La/j21;->j:Ljava/lang/Object;

    iput-wide p3, p0, La/j21;->k:J

    iput-wide p5, p0, La/j21;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    iget-byte p1, p0, La/j21;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/j21;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/j21;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/j21;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, La/q5w;

    .line 14
    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    iget-wide v7, p0, La/j21;->l:J

    .line 19
    .line 20
    const/4 v10, 0x3

    .line 21
    iget-wide v5, p0, La/j21;->k:J

    .line 22
    .line 23
    move-object v9, p2

    .line 24
    invoke-direct/range {v2 .. v10}, La/j21;-><init>(Ljava/lang/Object;Ljava/lang/String;JJLa/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_0
    move-object v9, p2

    .line 29
    new-instance v3, La/j21;

    .line 30
    .line 31
    move-object v10, v1

    .line 32
    check-cast v10, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 33
    .line 34
    move-object v11, v0

    .line 35
    check-cast v11, Ljava/util/List;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    iget-wide v5, p0, La/j21;->k:J

    .line 39
    .line 40
    iget-wide v7, p0, La/j21;->l:J

    .line 41
    .line 42
    invoke-direct/range {v3 .. v11}, La/j21;-><init>(BJJLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :pswitch_1
    move-object v9, p2

    .line 47
    new-instance v3, La/j21;

    .line 48
    .line 49
    move-object v4, v1

    .line 50
    check-cast v4, La/kd7;

    .line 51
    .line 52
    move-object v5, v0

    .line 53
    check-cast v5, Ljava/lang/String;

    .line 54
    .line 55
    move-object v10, v9

    .line 56
    iget-wide v8, p0, La/j21;->l:J

    .line 57
    .line 58
    const/4 v11, 0x1

    .line 59
    iget-wide v6, p0, La/j21;->k:J

    .line 60
    .line 61
    invoke-direct/range {v3 .. v11}, La/j21;-><init>(Ljava/lang/Object;Ljava/lang/String;JJLa/yje;B)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :pswitch_2
    move-object v9, p2

    .line 66
    new-instance v3, La/j21;

    .line 67
    .line 68
    move-object v10, v1

    .line 69
    check-cast v10, La/n21;

    .line 70
    .line 71
    move-object v11, v0

    .line 72
    check-cast v11, Ljava/lang/String;

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    iget-wide v5, p0, La/j21;->k:J

    .line 76
    .line 77
    iget-wide v7, p0, La/j21;->l:J

    .line 78
    .line 79
    invoke-direct/range {v3 .. v11}, La/j21;-><init>(BJJLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object v3

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j21;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/j21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/j21;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/j21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/j21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/j21;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/j21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/j21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/j21;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/j21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/j21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/j21;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/j21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j21;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/j21;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/j21;->m:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    check-cast v3, La/q5w;

    .line 18
    .line 19
    iget-object v1, v3, La/q5w;->l:La/vqc;

    .line 20
    .line 21
    move-object v4, v2

    .line 22
    check-cast v4, Ljava/lang/String;

    .line 23
    .line 24
    new-instance v3, La/id7;

    .line 25
    .line 26
    const/4 v9, 0x1

    .line 27
    iget-wide v5, v0, La/j21;->k:J

    .line 28
    .line 29
    iget-wide v7, v0, La/j21;->l:J

    .line 30
    .line 31
    invoke-direct/range {v3 .. v9}, La/id7;-><init>(Ljava/lang/String;JJB)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1, v0}, La/vqc;->k(La/m1g;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v4, v3

    .line 50
    check-cast v4, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 51
    .line 52
    move-object v9, v2

    .line 53
    check-cast v9, Ljava/util/List;

    .line 54
    .line 55
    sget v1, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->p:I

    .line 56
    .line 57
    iget-wide v5, v0, La/j21;->k:J

    .line 58
    .line 59
    iget-wide v7, v0, La/j21;->l:J

    .line 60
    .line 61
    invoke-virtual/range {v4 .. v9}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->c(JJLjava/util/List;)La/q9g;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 67
    .line 68
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    check-cast v3, La/kd7;

    .line 72
    .line 73
    iget-object v1, v3, La/kd7;->W:La/vqc;

    .line 74
    .line 75
    move-object v4, v2

    .line 76
    check-cast v4, Ljava/lang/String;

    .line 77
    .line 78
    new-instance v3, La/id7;

    .line 79
    .line 80
    const/4 v9, 0x0

    .line 81
    iget-wide v5, v0, La/j21;->k:J

    .line 82
    .line 83
    iget-wide v7, v0, La/j21;->l:J

    .line 84
    .line 85
    invoke-direct/range {v3 .. v9}, La/id7;-><init>(Ljava/lang/String;JJB)V

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v1, v0}, La/vqc;->k(La/m1g;)V

    .line 93
    .line 94
    .line 95
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 99
    .line 100
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    check-cast v3, La/n21;

    .line 104
    .line 105
    iget-object v1, v3, La/n21;->x:La/ctf0;

    .line 106
    .line 107
    iget-object v3, v3, La/n21;->F:La/r7v;

    .line 108
    .line 109
    sget-object v4, La/s0s;->b:La/s0s;

    .line 110
    .line 111
    iget-wide v4, v0, La/j21;->k:J

    .line 112
    .line 113
    const-wide/16 v6, -0x1

    .line 114
    .line 115
    cmp-long v8, v4, v6

    .line 116
    .line 117
    iget-wide v9, v0, La/j21;->l:J

    .line 118
    .line 119
    if-nez v8, :cond_0

    .line 120
    .line 121
    move-wide/from16 v20, v4

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    move-wide/from16 v20, v9

    .line 125
    .line 126
    :goto_0
    const-wide/16 v11, 0x25

    .line 127
    .line 128
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    const-wide/16 v13, 0x1

    .line 133
    .line 134
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v15

    .line 138
    filled-new-array {v8, v15}, [Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v15

    .line 150
    invoke-interface {v8, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-eqz v8, :cond_1

    .line 155
    .line 156
    move-wide v9, v4

    .line 157
    :cond_1
    cmp-long v8, v9, v11

    .line 158
    .line 159
    const/4 v15, 0x0

    .line 160
    if-nez v8, :cond_2

    .line 161
    .line 162
    const v8, 0x7f130b3c

    .line 163
    .line 164
    .line 165
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    goto :goto_1

    .line 170
    :cond_2
    cmp-long v8, v9, v13

    .line 171
    .line 172
    if-nez v8, :cond_3

    .line 173
    .line 174
    const v8, 0x7f13015a

    .line 175
    .line 176
    .line 177
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    goto :goto_1

    .line 182
    :cond_3
    move-object v8, v15

    .line 183
    :goto_1
    const/4 v9, 0x0

    .line 184
    if-eqz v8, :cond_4

    .line 185
    .line 186
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    new-array v8, v9, [Ljava/lang/Object;

    .line 191
    .line 192
    iget-object v10, v1, La/ctf0;->b:La/lsm0;

    .line 193
    .line 194
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v10, v2, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :goto_2
    move-object/from16 v23, v2

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_4
    check-cast v2, Ljava/lang/String;

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :goto_3
    new-array v2, v9, [Ljava/lang/Object;

    .line 209
    .line 210
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 211
    .line 212
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const v8, 0x7f1303d0

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v8, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    cmp-long v1, v4, v11

    .line 224
    .line 225
    if-nez v1, :cond_5

    .line 226
    .line 227
    const-wide/16 v4, 0x11

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_5
    const-wide/16 v1, -0x2

    .line 231
    .line 232
    cmp-long v1, v4, v1

    .line 233
    .line 234
    if-nez v1, :cond_6

    .line 235
    .line 236
    const-wide v4, 0x7fffffffffffffffL

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    :cond_6
    :goto_4
    invoke-static {v4, v5}, La/cs0;->u(J)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    iget-object v2, v3, La/r7v;->a:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v2, La/s91;

    .line 248
    .line 249
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    cmp-long v4, v20, v6

    .line 256
    .line 257
    if-nez v4, :cond_7

    .line 258
    .line 259
    new-instance v24, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 260
    .line 261
    new-instance v29, La/lm1;

    .line 262
    .line 263
    invoke-direct/range {v29 .. v29}, La/lm1;-><init>()V

    .line 264
    .line 265
    .line 266
    const/16 v36, 0x0

    .line 267
    .line 268
    const/16 v37, 0x1f7

    .line 269
    .line 270
    const/16 v25, 0x0

    .line 271
    .line 272
    const/16 v26, 0x0

    .line 273
    .line 274
    const-wide/16 v27, 0x0

    .line 275
    .line 276
    const/16 v30, 0x0

    .line 277
    .line 278
    const-wide/16 v31, 0x0

    .line 279
    .line 280
    const-wide/16 v33, 0x0

    .line 281
    .line 282
    const/16 v35, 0x0

    .line 283
    .line 284
    invoke-direct/range {v24 .. v37}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 285
    .line 286
    .line 287
    move-object/from16 v0, v24

    .line 288
    .line 289
    invoke-virtual {v2, v0}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_7
    const-wide/16 v4, 0x2

    .line 294
    .line 295
    cmp-long v4, v20, v4

    .line 296
    .line 297
    iget-wide v5, v0, La/j21;->l:J

    .line 298
    .line 299
    if-eqz v4, :cond_8

    .line 300
    .line 301
    const-wide/16 v7, 0x0

    .line 302
    .line 303
    cmp-long v4, v20, v7

    .line 304
    .line 305
    if-eqz v4, :cond_8

    .line 306
    .line 307
    const-wide/16 v7, 0x3

    .line 308
    .line 309
    cmp-long v4, v20, v7

    .line 310
    .line 311
    if-nez v4, :cond_9

    .line 312
    .line 313
    :cond_8
    move-wide v14, v5

    .line 314
    move-object/from16 v12, v23

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_9
    new-instance v11, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 318
    .line 319
    new-instance v3, La/hm1;

    .line 320
    .line 321
    const/4 v4, 0x2

    .line 322
    invoke-direct {v3, v4, v1, v15}, La/hm1;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    move-object/from16 v12, v23

    .line 326
    .line 327
    const/16 v23, 0x0

    .line 328
    .line 329
    const/16 v24, 0x190

    .line 330
    .line 331
    const/16 v17, 0x0

    .line 332
    .line 333
    iget-wide v0, v0, La/j21;->k:J

    .line 334
    .line 335
    const/16 v22, 0x0

    .line 336
    .line 337
    move-wide/from16 v18, v0

    .line 338
    .line 339
    move-object/from16 v16, v3

    .line 340
    .line 341
    move-wide v14, v5

    .line 342
    invoke-direct/range {v11 .. v24}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v11}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 346
    .line 347
    .line 348
    goto :goto_6

    .line 349
    :goto_5
    iget-object v0, v3, La/r7v;->a:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, La/s91;

    .line 352
    .line 353
    new-instance v22, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 354
    .line 355
    new-instance v1, La/im1;

    .line 356
    .line 357
    const/4 v2, 0x1

    .line 358
    invoke-direct {v1, v9, v2}, La/im1;-><init>(ZZ)V

    .line 359
    .line 360
    .line 361
    const/16 v34, 0x0

    .line 362
    .line 363
    const/16 v35, 0x172

    .line 364
    .line 365
    const/16 v24, 0x0

    .line 366
    .line 367
    const/16 v28, 0x0

    .line 368
    .line 369
    const-wide/16 v29, 0x0

    .line 370
    .line 371
    const-wide/16 v31, 0x0

    .line 372
    .line 373
    const-string v33, ""

    .line 374
    .line 375
    move-object/from16 v27, v1

    .line 376
    .line 377
    move-object/from16 v23, v12

    .line 378
    .line 379
    move-wide/from16 v25, v14

    .line 380
    .line 381
    invoke-direct/range {v22 .. v35}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v1, v22

    .line 385
    .line 386
    invoke-virtual {v0, v1}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 387
    .line 388
    .line 389
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    nop

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
