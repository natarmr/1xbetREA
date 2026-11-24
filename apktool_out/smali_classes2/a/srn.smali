.class public final La/srn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# static fields
.field public static final e:[J


# instance fields
.field public a:J

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [J

    .line 3
    .line 4
    sput-object v0, La/srn;->e:[J

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(La/srn;)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iget-object v0, p1, La/srn;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La/srn;->b:Ljava/lang/Object;

    .line 64
    iget-object v0, p1, La/srn;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La/srn;->c:Ljava/lang/Object;

    .line 65
    iget-object v0, p1, La/srn;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La/srn;->d:Ljava/lang/Object;

    .line 66
    iget-wide v0, p1, La/srn;->a:J

    iput-wide v0, p0, La/srn;->a:J

    return-void
.end method

.method public constructor <init>(La/ugi0;La/ens;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/srn;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/srn;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {p1}, La/ugi0;->d()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-wide/16 v0, -0x1

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    const/16 p2, 0x40

    .line 20
    .line 21
    if-gt p1, p2, :cond_1

    .line 22
    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    shl-long v2, v0, p1

    .line 27
    .line 28
    :goto_0
    iput-wide v2, p0, La/srn;->a:J

    .line 29
    .line 30
    sget-object p1, La/srn;->e:[J

    .line 31
    .line 32
    iput-object p1, p0, La/srn;->d:Ljava/lang/Object;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iput-wide v2, p0, La/srn;->a:J

    .line 36
    .line 37
    add-int/lit8 p2, p1, -0x1

    .line 38
    .line 39
    ushr-int/lit8 p2, p2, 0x6

    .line 40
    .line 41
    and-int/lit8 v2, p1, 0x3f

    .line 42
    .line 43
    new-array v3, p2, [J

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    add-int/lit8 p2, p2, -0x1

    .line 48
    .line 49
    shl-long/2addr v0, p1

    .line 50
    aput-wide v0, v3, p2

    .line 51
    .line 52
    :cond_2
    iput-object v3, p0, La/srn;->d:Ljava/lang/Object;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(La/wd40;)V
    .locals 3

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/srn;->b:Ljava/lang/Object;

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, La/srn;->c:Ljava/lang/Object;

    .line 70
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, La/srn;->d:Ljava/lang/Object;

    const-wide/16 v1, 0x1388

    .line 71
    iput-wide v1, p0, La/srn;->a:J

    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic constructor <init>(La/ydw0;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/srn;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lokhttp3/Callback;La/dps0;Lcom/google/firebase/perf/util/Timer;J)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, La/srn;->b:Ljava/lang/Object;

    .line 58
    new-instance p1, La/ml50;

    invoke-direct {p1, p2}, La/ml50;-><init>(La/dps0;)V

    .line 59
    iput-object p1, p0, La/srn;->c:Ljava/lang/Object;

    .line 60
    iput-wide p4, p0, La/srn;->a:J

    .line 61
    iput-object p3, p0, La/srn;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(La/sww0;Ljava/lang/String;)La/sww0;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-virtual {v5}, La/sww0;->w()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    invoke-virtual {v5}, La/sww0;->t()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v12

    .line 15
    iget-object v0, v1, La/srn;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/ydw0;

    .line 18
    .line 19
    iget-object v2, v0, La/k5x0;->c:La/m6x0;

    .line 20
    .line 21
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v3, v0

    .line 24
    check-cast v3, La/kxw0;

    .line 25
    .line 26
    invoke-virtual {v2}, La/m6x0;->j0()La/r6x0;

    .line 27
    .line 28
    .line 29
    const-string v4, "_eid"

    .line 30
    .line 31
    invoke-static {v5, v4}, La/r6x0;->w1(La/sww0;Ljava/lang/String;)La/yww0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v8, 0x0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    move-object v0, v8

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {v0}, La/r6x0;->E1(La/yww0;)Ljava/io/Serializable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    move-object v9, v0

    .line 45
    check-cast v9, Ljava/lang/Long;

    .line 46
    .line 47
    if-eqz v9, :cond_12

    .line 48
    .line 49
    const-string v0, "_ep"

    .line 50
    .line 51
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_e

    .line 56
    .line 57
    invoke-virtual {v2}, La/m6x0;->j0()La/r6x0;

    .line 58
    .line 59
    .line 60
    const-string v0, "_en"

    .line 61
    .line 62
    invoke-static {v5, v0}, La/r6x0;->w1(La/sww0;Ljava/lang/String;)La/yww0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-object v0, v8

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-static {v0}, La/r6x0;->E1(La/yww0;)Ljava/io/Serializable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_1
    move-object v13, v0

    .line 75
    check-cast v13, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 84
    .line 85
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, La/uuw0;->h:La/quw0;

    .line 89
    .line 90
    const-string v1, "Extra parameter without an event name. eventId"

    .line 91
    .line 92
    invoke-virtual {v0, v9, v1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v8

    .line 96
    :cond_2
    iget-object v0, v1, La/srn;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/sww0;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, v1, La/srn;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/lang/Long;

    .line 105
    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v14

    .line 112
    iget-object v0, v1, La/srn;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Ljava/lang/Long;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v16

    .line 120
    cmp-long v0, v14, v16

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    const-wide/16 v17, 0x0

    .line 126
    .line 127
    goto/16 :goto_b

    .line 128
    .line 129
    :cond_4
    :goto_2
    iget-object v0, v2, La/m6x0;->c:La/zlw0;

    .line 130
    .line 131
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 132
    .line 133
    .line 134
    iget-object v6, v0, La/p4;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v6, La/kxw0;

    .line 137
    .line 138
    invoke-virtual {v0}, La/p4;->m1()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, La/u5x0;->n1()V

    .line 142
    .line 143
    .line 144
    :try_start_0
    invoke-virtual {v0}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v14, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    .line 149
    .line 150
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    filled-new-array {v7, v15}, [Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    invoke-virtual {v0, v14, v15}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 159
    .line 160
    .line 161
    move-result-object v14
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 162
    :try_start_1
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_5

    .line 167
    .line 168
    iget-object v0, v6, La/kxw0;->f:La/uuw0;

    .line 169
    .line 170
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 171
    .line 172
    .line 173
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 174
    .line 175
    const-string v15, "Main event not found"

    .line 176
    .line 177
    invoke-virtual {v0, v15}, La/quw0;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    .line 179
    .line 180
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 181
    .line 182
    .line 183
    move-object v0, v8

    .line 184
    move-object/from16 v16, v0

    .line 185
    .line 186
    :goto_3
    const-wide/16 v17, 0x0

    .line 187
    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :catchall_0
    move-exception v0

    .line 191
    goto :goto_6

    .line 192
    :catch_0
    move-exception v0

    .line 193
    move-object/from16 v16, v8

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_5
    const/4 v0, 0x0

    .line 197
    :try_start_2
    invoke-interface {v14, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const/4 v15, 0x1

    .line 202
    invoke-interface {v14, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v15

    .line 206
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 207
    .line 208
    .line 209
    move-result-object v15
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    move-object/from16 v16, v8

    .line 211
    .line 212
    :try_start_3
    invoke-static {}, La/sww0;->H()La/qww0;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-static {v8, v0}, La/r6x0;->X1(La/iew0;[B)La/iew0;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, La/qww0;

    .line 221
    .line 222
    invoke-virtual {v0}, La/iew0;->e()La/mew0;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/sww0;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 227
    .line 228
    :try_start_4
    invoke-static {v0, v15}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 229
    .line 230
    .line 231
    move-result-object v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 232
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :catch_1
    move-exception v0

    .line 237
    :try_start_5
    iget-object v8, v6, La/kxw0;->f:La/uuw0;

    .line 238
    .line 239
    invoke-static {v8}, La/kxw0;->g(La/ryw0;)V

    .line 240
    .line 241
    .line 242
    iget-object v8, v8, La/uuw0;->g:La/quw0;

    .line 243
    .line 244
    const-string v15, "Failed to merge main event. appId, eventId"
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 245
    .line 246
    const-wide/16 v17, 0x0

    .line 247
    .line 248
    :try_start_6
    invoke-static {v7}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    invoke-virtual {v8, v15, v10, v9, v0}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 253
    .line 254
    .line 255
    :goto_4
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 256
    .line 257
    .line 258
    :cond_6
    move-object/from16 v0, v16

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :catch_2
    move-exception v0

    .line 262
    goto :goto_9

    .line 263
    :catch_3
    move-exception v0

    .line 264
    :goto_5
    const-wide/16 v17, 0x0

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :goto_6
    move-object v8, v14

    .line 268
    goto/16 :goto_10

    .line 269
    .line 270
    :catchall_1
    move-exception v0

    .line 271
    move-object/from16 v16, v8

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :catch_4
    move-exception v0

    .line 275
    move-object/from16 v16, v8

    .line 276
    .line 277
    const-wide/16 v17, 0x0

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :goto_7
    move-object/from16 v8, v16

    .line 281
    .line 282
    goto/16 :goto_10

    .line 283
    .line 284
    :goto_8
    move-object/from16 v14, v16

    .line 285
    .line 286
    :goto_9
    :try_start_7
    iget-object v6, v6, La/kxw0;->f:La/uuw0;

    .line 287
    .line 288
    invoke-static {v6}, La/kxw0;->g(La/ryw0;)V

    .line 289
    .line 290
    .line 291
    iget-object v6, v6, La/uuw0;->g:La/quw0;

    .line 292
    .line 293
    const-string v8, "Error selecting main event"

    .line 294
    .line 295
    invoke-virtual {v6, v0, v8}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 296
    .line 297
    .line 298
    if-eqz v14, :cond_6

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :goto_a
    if-eqz v0, :cond_7

    .line 302
    .line 303
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 304
    .line 305
    if-nez v6, :cond_8

    .line 306
    .line 307
    :cond_7
    move-object v8, v9

    .line 308
    goto/16 :goto_f

    .line 309
    .line 310
    :cond_8
    check-cast v6, La/sww0;

    .line 311
    .line 312
    iput-object v6, v1, La/srn;->b:Ljava/lang/Object;

    .line 313
    .line 314
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Ljava/lang/Long;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 319
    .line 320
    .line 321
    move-result-wide v10

    .line 322
    iput-wide v10, v1, La/srn;->a:J

    .line 323
    .line 324
    invoke-virtual {v2}, La/m6x0;->j0()La/r6x0;

    .line 325
    .line 326
    .line 327
    iget-object v0, v1, La/srn;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, La/sww0;

    .line 330
    .line 331
    invoke-static {v0, v4}, La/r6x0;->y1(La/sww0;Ljava/lang/String;)Ljava/io/Serializable;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    check-cast v0, Ljava/lang/Long;

    .line 336
    .line 337
    iput-object v0, v1, La/srn;->c:Ljava/lang/Object;

    .line 338
    .line 339
    :goto_b
    iget-wide v10, v1, La/srn;->a:J

    .line 340
    .line 341
    const-wide/16 v14, -0x1

    .line 342
    .line 343
    add-long/2addr v10, v14

    .line 344
    iput-wide v10, v1, La/srn;->a:J

    .line 345
    .line 346
    cmp-long v0, v10, v17

    .line 347
    .line 348
    if-gtz v0, :cond_9

    .line 349
    .line 350
    iget-object v0, v2, La/m6x0;->c:La/zlw0;

    .line 351
    .line 352
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 353
    .line 354
    .line 355
    iget-object v4, v0, La/p4;->b:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v4, La/kxw0;

    .line 358
    .line 359
    invoke-virtual {v0}, La/p4;->m1()V

    .line 360
    .line 361
    .line 362
    iget-object v6, v4, La/kxw0;->f:La/uuw0;

    .line 363
    .line 364
    invoke-static {v6}, La/kxw0;->g(La/ryw0;)V

    .line 365
    .line 366
    .line 367
    iget-object v6, v6, La/uuw0;->o:La/quw0;

    .line 368
    .line 369
    const-string v8, "Clearing complex main event info. appId"

    .line 370
    .line 371
    invoke-virtual {v6, v7, v8}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :try_start_8
    invoke-virtual {v0}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const-string v6, "delete from main_event_params where app_id=?"

    .line 379
    .line 380
    filled-new-array {v7}, [Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-virtual {v0, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_5

    .line 385
    .line 386
    .line 387
    goto :goto_c

    .line 388
    :catch_5
    move-exception v0

    .line 389
    iget-object v4, v4, La/kxw0;->f:La/uuw0;

    .line 390
    .line 391
    invoke-static {v4}, La/kxw0;->g(La/ryw0;)V

    .line 392
    .line 393
    .line 394
    iget-object v4, v4, La/uuw0;->g:La/quw0;

    .line 395
    .line 396
    const-string v6, "Error clearing complex main event"

    .line 397
    .line 398
    invoke-virtual {v4, v0, v6}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    goto :goto_c

    .line 402
    :cond_9
    iget-object v6, v2, La/m6x0;->c:La/zlw0;

    .line 403
    .line 404
    invoke-static {v6}, La/m6x0;->T(La/u5x0;)V

    .line 405
    .line 406
    .line 407
    move-object v8, v9

    .line 408
    iget-wide v9, v1, La/srn;->a:J

    .line 409
    .line 410
    iget-object v0, v1, La/srn;->b:Ljava/lang/Object;

    .line 411
    .line 412
    move-object v11, v0

    .line 413
    check-cast v11, La/sww0;

    .line 414
    .line 415
    invoke-virtual/range {v6 .. v11}, La/zlw0;->E1(Ljava/lang/String;Ljava/lang/Long;JLa/sww0;)V

    .line 416
    .line 417
    .line 418
    :goto_c
    new-instance v0, Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 421
    .line 422
    .line 423
    iget-object v1, v1, La/srn;->b:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v1, La/sww0;

    .line 426
    .line 427
    invoke-virtual {v1}, La/sww0;->t()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    :cond_a
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-eqz v4, :cond_b

    .line 440
    .line 441
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    check-cast v4, La/yww0;

    .line 446
    .line 447
    invoke-virtual {v2}, La/m6x0;->j0()La/r6x0;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v4}, La/yww0;->s()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    invoke-static {v5, v6}, La/r6x0;->w1(La/sww0;Ljava/lang/String;)La/yww0;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    if-nez v6, :cond_a

    .line 459
    .line 460
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    goto :goto_d

    .line 464
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    if-nez v1, :cond_c

    .line 469
    .line 470
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 471
    .line 472
    .line 473
    move-object v12, v0

    .line 474
    goto :goto_e

    .line 475
    :cond_c
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 476
    .line 477
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 478
    .line 479
    .line 480
    iget-object v0, v0, La/uuw0;->h:La/quw0;

    .line 481
    .line 482
    const-string v1, "No unique parameters in main event. eventName"

    .line 483
    .line 484
    invoke-virtual {v0, v13, v1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    :goto_e
    move-object v6, v13

    .line 488
    goto :goto_13

    .line 489
    :goto_f
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 490
    .line 491
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 492
    .line 493
    .line 494
    iget-object v0, v0, La/uuw0;->h:La/quw0;

    .line 495
    .line 496
    const-string v1, "Extra parameter without existing main event. eventName, eventId"

    .line 497
    .line 498
    invoke-virtual {v0, v13, v8, v1}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    return-object v16

    .line 502
    :goto_10
    if-eqz v8, :cond_d

    .line 503
    .line 504
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 505
    .line 506
    .line 507
    :cond_d
    throw v0

    .line 508
    :cond_e
    move-object/from16 v16, v8

    .line 509
    .line 510
    move-object v8, v9

    .line 511
    const-wide/16 v17, 0x0

    .line 512
    .line 513
    iput-object v8, v1, La/srn;->c:Ljava/lang/Object;

    .line 514
    .line 515
    iput-object v5, v1, La/srn;->b:Ljava/lang/Object;

    .line 516
    .line 517
    invoke-virtual {v2}, La/m6x0;->j0()La/r6x0;

    .line 518
    .line 519
    .line 520
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    const-string v4, "_epc"

    .line 525
    .line 526
    invoke-static {v5, v4}, La/r6x0;->w1(La/sww0;Ljava/lang/String;)La/yww0;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    if-nez v4, :cond_f

    .line 531
    .line 532
    goto :goto_11

    .line 533
    :cond_f
    invoke-static {v4}, La/r6x0;->E1(La/yww0;)Ljava/io/Serializable;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    move-object/from16 v16, v4

    .line 538
    .line 539
    :goto_11
    if-nez v16, :cond_10

    .line 540
    .line 541
    goto :goto_12

    .line 542
    :cond_10
    move-object/from16 v0, v16

    .line 543
    .line 544
    :goto_12
    check-cast v0, Ljava/lang/Long;

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 547
    .line 548
    .line 549
    move-result-wide v9

    .line 550
    iput-wide v9, v1, La/srn;->a:J

    .line 551
    .line 552
    cmp-long v0, v9, v17

    .line 553
    .line 554
    if-gtz v0, :cond_11

    .line 555
    .line 556
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 557
    .line 558
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 559
    .line 560
    .line 561
    iget-object v0, v0, La/uuw0;->h:La/quw0;

    .line 562
    .line 563
    const-string v1, "Complex event with zero extra param count. eventName"

    .line 564
    .line 565
    invoke-virtual {v0, v6, v1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    goto :goto_13

    .line 569
    :cond_11
    iget-object v0, v2, La/m6x0;->c:La/zlw0;

    .line 570
    .line 571
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 572
    .line 573
    .line 574
    iget-wide v3, v1, La/srn;->a:J

    .line 575
    .line 576
    move-object/from16 v1, p2

    .line 577
    .line 578
    move-object v2, v8

    .line 579
    invoke-virtual/range {v0 .. v5}, La/zlw0;->E1(Ljava/lang/String;Ljava/lang/Long;JLa/sww0;)V

    .line 580
    .line 581
    .line 582
    :cond_12
    :goto_13
    invoke-virtual/range {p1 .. p1}, La/mew0;->i()La/iew0;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    check-cast v0, La/qww0;

    .line 587
    .line 588
    invoke-virtual {v0, v6}, La/qww0;->r(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0}, La/iew0;->c()V

    .line 592
    .line 593
    .line 594
    iget-object v1, v0, La/iew0;->b:La/mew0;

    .line 595
    .line 596
    check-cast v1, La/sww0;

    .line 597
    .line 598
    invoke-virtual {v1}, La/sww0;->L()V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v0}, La/iew0;->c()V

    .line 602
    .line 603
    .line 604
    iget-object v1, v0, La/iew0;->b:La/mew0;

    .line 605
    .line 606
    check-cast v1, La/sww0;

    .line 607
    .line 608
    invoke-virtual {v1, v12}, La/sww0;->K(Ljava/lang/Iterable;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0}, La/iew0;->e()La/mew0;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    check-cast v0, La/sww0;

    .line 616
    .line 617
    return-object v0
.end method

.method public b(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/srn;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ml50;

    .line 4
    .line 5
    invoke-interface {p1}, Lokhttp3/Call;->l()Lokhttp3/Request;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v2, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->j()Ljava/net/URL;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, La/ml50;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v1}, La/ml50;->d(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-wide v1, p0, La/srn;->a:J

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, La/ml50;->i(J)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/srn;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lcom/google/firebase/perf/util/Timer;

    .line 41
    .line 42
    invoke-static {v1, v0, v0}, La/twn;->y(Lcom/google/firebase/perf/util/Timer;La/ml50;La/ml50;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, La/srn;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lokhttp3/Callback;

    .line 48
    .line 49
    invoke-interface {p0, p1, p2}, Lokhttp3/Callback;->b(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public h(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/srn;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/firebase/perf/util/Timer;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/firebase/perf/util/Timer;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v5

    .line 9
    iget-object v0, p0, La/srn;->c:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v0

    .line 12
    check-cast v2, La/ml50;

    .line 13
    .line 14
    iget-wide v3, p0, La/srn;->a:J

    .line 15
    .line 16
    move-object v1, p2

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->a(Lokhttp3/Response;La/ml50;JJ)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/srn;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lokhttp3/Callback;

    .line 23
    .line 24
    invoke-interface {p0, p1, v1}, Lokhttp3/Callback;->h(Lokhttp3/Call;Lokhttp3/Response;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
