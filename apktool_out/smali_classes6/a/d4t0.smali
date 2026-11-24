.class public final La/d4t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/iqi;

.field public final b:La/jtj;

.field public c:Lkotlin/Pair;

.field public d:Lkotlin/Pair;


# direct methods
.method public constructor <init>(La/iqi;La/jtj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d4t0;->a:La/iqi;

    .line 5
    .line 6
    iput-object p2, p0, La/d4t0;->b:La/jtj;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(JJJLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p5

    .line 4
    .line 5
    move-object/from16 v3, p7

    .line 6
    .line 7
    instance-of v4, v3, La/a4t0;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/a4t0;

    .line 13
    .line 14
    iget v5, v4, La/a4t0;->o:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v5, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v5, v6

    .line 23
    iput v5, v4, La/a4t0;->o:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, La/a4t0;

    .line 27
    .line 28
    invoke-direct {v4, v0, v3}, La/a4t0;-><init>(La/d4t0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v3, v4, La/a4t0;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v6, v4, La/a4t0;->o:I

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    if-ne v6, v8, :cond_1

    .line 42
    .line 43
    iget-wide v1, v4, La/a4t0;->k:J

    .line 44
    .line 45
    iget-wide v9, v4, La/a4t0;->j:J

    .line 46
    .line 47
    iget-wide v11, v4, La/a4t0;->i:J

    .line 48
    .line 49
    iget-object v6, v4, La/a4t0;->l:Ljava/util/Iterator;

    .line 50
    .line 51
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-wide/from16 v17, v11

    .line 55
    .line 56
    move-wide v11, v1

    .line 57
    move-wide/from16 v1, v17

    .line 58
    .line 59
    move-object/from16 v16, v6

    .line 60
    .line 61
    move-object v6, v4

    .line 62
    move-object/from16 v4, v16

    .line 63
    .line 64
    move-object/from16 v16, v7

    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v7

    .line 74
    :cond_2
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v3, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 80
    .line 81
    .line 82
    const-wide/32 v9, 0x15180

    .line 83
    .line 84
    .line 85
    sub-long v9, v1, v9

    .line 86
    .line 87
    new-instance v6, Ljava/lang/Long;

    .line 88
    .line 89
    invoke-direct {v6, v9, v10}, Ljava/lang/Long;-><init>(J)V

    .line 90
    .line 91
    .line 92
    filled-new-array {v3, v6}, [Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-wide v9, v1

    .line 105
    move-object v11, v3

    .line 106
    move-object v6, v4

    .line 107
    move-wide/from16 v1, p1

    .line 108
    .line 109
    move-wide/from16 v3, p3

    .line 110
    .line 111
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    if-eqz v12, :cond_6

    .line 116
    .line 117
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    check-cast v12, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v12

    .line 127
    new-instance v14, La/znq0;

    .line 128
    .line 129
    invoke-direct {v14, v12, v13}, La/znq0;-><init>(J)V

    .line 130
    .line 131
    .line 132
    sget-object v12, La/dfj;->b:La/dfj;

    .line 133
    .line 134
    const-string v12, "UTC"

    .line 135
    .line 136
    invoke-static {v12}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    sget-object v13, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v15, Ljava/text/SimpleDateFormat;

    .line 149
    .line 150
    move-object/from16 v16, v7

    .line 151
    .line 152
    const-string v7, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    .line 153
    .line 154
    invoke-direct {v15, v7, v13}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v15, v12}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 158
    .line 159
    .line 160
    new-instance v7, Ljava/util/GregorianCalendar;

    .line 161
    .line 162
    invoke-direct {v7}, Ljava/util/GregorianCalendar;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/util/Calendar;->clear()V

    .line 166
    .line 167
    .line 168
    invoke-interface {v14}, La/aoq0;->c()J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    invoke-virtual {v7, v12, v13}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v15, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iput-object v11, v6, La/a4t0;->l:Ljava/util/Iterator;

    .line 190
    .line 191
    iput-wide v1, v6, La/a4t0;->i:J

    .line 192
    .line 193
    iput-wide v3, v6, La/a4t0;->j:J

    .line 194
    .line 195
    iput-wide v9, v6, La/a4t0;->k:J

    .line 196
    .line 197
    iput v8, v6, La/a4t0;->o:I

    .line 198
    .line 199
    iget-object v12, v0, La/d4t0;->b:La/jtj;

    .line 200
    .line 201
    iget-object v12, v12, La/jtj;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v12, La/yip;

    .line 204
    .line 205
    invoke-virtual {v12}, La/yip;->invoke()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    check-cast v12, La/csp;

    .line 210
    .line 211
    move-wide/from16 p2, v1

    .line 212
    .line 213
    move-wide/from16 p4, v3

    .line 214
    .line 215
    move-object/from16 p7, v6

    .line 216
    .line 217
    move-object/from16 p6, v7

    .line 218
    .line 219
    move-object/from16 p1, v12

    .line 220
    .line 221
    invoke-interface/range {p1 .. p7}, La/csp;->a(JJLjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    move-wide/from16 v6, p4

    .line 226
    .line 227
    move-object/from16 v4, p7

    .line 228
    .line 229
    if-ne v3, v5, :cond_3

    .line 230
    .line 231
    return-object v5

    .line 232
    :cond_3
    move-wide/from16 v17, v6

    .line 233
    .line 234
    move-object v6, v4

    .line 235
    move-object v4, v11

    .line 236
    move-wide v11, v9

    .line 237
    move-wide/from16 v9, v17

    .line 238
    .line 239
    :goto_2
    check-cast v3, La/dx5;

    .line 240
    .line 241
    iget-object v7, v3, La/dx5;->a:La/uhi0;

    .line 242
    .line 243
    if-nez v7, :cond_5

    .line 244
    .line 245
    iget-object v3, v3, La/dx5;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v3, La/vsp;

    .line 248
    .line 249
    if-eqz v3, :cond_4

    .line 250
    .line 251
    return-object v3

    .line 252
    :cond_4
    move-wide/from16 v17, v11

    .line 253
    .line 254
    move-object v11, v4

    .line 255
    move-wide v3, v9

    .line 256
    move-wide/from16 v9, v17

    .line 257
    .line 258
    move-object/from16 v7, v16

    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_5
    new-instance v0, La/zhi0;

    .line 263
    .line 264
    invoke-direct {v0, v7}, La/zhi0;-><init>(La/uhi0;)V

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_6
    move-object/from16 v16, v7

    .line 269
    .line 270
    return-object v16
.end method

.method public final b(JJJLa/zje;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p7

    .line 4
    .line 5
    instance-of v2, v0, La/b4t0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/b4t0;

    .line 11
    .line 12
    iget v3, v2, La/b4t0;->w:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/b4t0;->w:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/b4t0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/b4t0;-><init>(La/d4t0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/b4t0;->u:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/b4t0;->w:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v8, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v8, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/b4t0;->t:I

    .line 47
    .line 48
    iget v10, v2, La/b4t0;->s:I

    .line 49
    .line 50
    iget v11, v2, La/b4t0;->r:I

    .line 51
    .line 52
    iget-wide v12, v2, La/b4t0;->m:J

    .line 53
    .line 54
    iget-wide v14, v2, La/b4t0;->l:J

    .line 55
    .line 56
    iget-wide v5, v2, La/b4t0;->k:J

    .line 57
    .line 58
    move/from16 p1, v10

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    iget-wide v9, v2, La/b4t0;->j:J

    .line 63
    .line 64
    iget-wide v7, v2, La/b4t0;->i:J

    .line 65
    .line 66
    move-object/from16 v18, v0

    .line 67
    .line 68
    iget-object v0, v2, La/b4t0;->q:Ljava/lang/Throwable;

    .line 69
    .line 70
    move-object/from16 p2, v0

    .line 71
    .line 72
    iget-object v0, v2, La/b4t0;->p:La/b4t0;

    .line 73
    .line 74
    move-object/from16 p3, v0

    .line 75
    .line 76
    iget-object v0, v2, La/b4t0;->o:La/d4t0;

    .line 77
    .line 78
    move/from16 p4, v4

    .line 79
    .line 80
    iget-object v4, v2, La/b4t0;->n:La/z3t0;

    .line 81
    .line 82
    :try_start_0
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    move-object/from16 v1, p2

    .line 86
    .line 87
    move-object/from16 v20, v0

    .line 88
    .line 89
    move-wide/from16 v18, v14

    .line 90
    .line 91
    const/16 v16, 0x2

    .line 92
    .line 93
    move/from16 v0, p4

    .line 94
    .line 95
    move-wide v14, v7

    .line 96
    move-wide/from16 v26, v5

    .line 97
    .line 98
    move/from16 v5, p1

    .line 99
    .line 100
    move-wide v6, v9

    .line 101
    move-object/from16 v10, p3

    .line 102
    .line 103
    move-wide/from16 v8, v26

    .line 104
    .line 105
    goto/16 :goto_12

    .line 106
    .line 107
    :catchall_0
    move-exception v0

    .line 108
    goto/16 :goto_14

    .line 109
    .line 110
    :cond_1
    const/16 v17, 0x0

    .line 111
    .line 112
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 113
    .line 114
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v17

    .line 118
    :cond_2
    move-object/from16 v18, v0

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    iget v0, v2, La/b4t0;->t:I

    .line 123
    .line 124
    iget v4, v2, La/b4t0;->s:I

    .line 125
    .line 126
    iget v5, v2, La/b4t0;->r:I

    .line 127
    .line 128
    iget-wide v6, v2, La/b4t0;->m:J

    .line 129
    .line 130
    iget-wide v8, v2, La/b4t0;->l:J

    .line 131
    .line 132
    iget-wide v10, v2, La/b4t0;->k:J

    .line 133
    .line 134
    iget-wide v12, v2, La/b4t0;->j:J

    .line 135
    .line 136
    iget-wide v14, v2, La/b4t0;->i:J

    .line 137
    .line 138
    move/from16 p1, v0

    .line 139
    .line 140
    iget-object v0, v2, La/b4t0;->q:Ljava/lang/Throwable;

    .line 141
    .line 142
    move-object/from16 p2, v0

    .line 143
    .line 144
    iget-object v0, v2, La/b4t0;->p:La/b4t0;

    .line 145
    .line 146
    move-object/from16 p3, v0

    .line 147
    .line 148
    iget-object v0, v2, La/b4t0;->o:La/d4t0;

    .line 149
    .line 150
    move/from16 p4, v4

    .line 151
    .line 152
    iget-object v4, v2, La/b4t0;->n:La/z3t0;

    .line 153
    .line 154
    :try_start_1
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    .line 156
    .line 157
    move-object/from16 v1, p3

    .line 158
    .line 159
    move-object/from16 v20, v0

    .line 160
    .line 161
    move-wide/from16 v18, v8

    .line 162
    .line 163
    move-wide v8, v10

    .line 164
    move/from16 v0, p4

    .line 165
    .line 166
    move-wide v10, v6

    .line 167
    move/from16 v6, p1

    .line 168
    .line 169
    move-object v7, v4

    .line 170
    move-object/from16 v4, p2

    .line 171
    .line 172
    goto/16 :goto_e

    .line 173
    .line 174
    :cond_3
    move-object/from16 v18, v0

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    iget v4, v2, La/b4t0;->s:I

    .line 179
    .line 180
    iget v5, v2, La/b4t0;->r:I

    .line 181
    .line 182
    iget-wide v6, v2, La/b4t0;->m:J

    .line 183
    .line 184
    iget-wide v8, v2, La/b4t0;->l:J

    .line 185
    .line 186
    iget-wide v10, v2, La/b4t0;->k:J

    .line 187
    .line 188
    iget-wide v12, v2, La/b4t0;->j:J

    .line 189
    .line 190
    iget-wide v14, v2, La/b4t0;->i:J

    .line 191
    .line 192
    move/from16 p1, v4

    .line 193
    .line 194
    iget-object v4, v2, La/b4t0;->q:Ljava/lang/Throwable;

    .line 195
    .line 196
    move-object/from16 p2, v4

    .line 197
    .line 198
    iget-object v4, v2, La/b4t0;->p:La/b4t0;

    .line 199
    .line 200
    move-object/from16 p3, v4

    .line 201
    .line 202
    iget-object v4, v2, La/b4t0;->o:La/d4t0;

    .line 203
    .line 204
    move-object/from16 p4, v4

    .line 205
    .line 206
    iget-object v4, v2, La/b4t0;->n:La/z3t0;

    .line 207
    .line 208
    :try_start_2
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 209
    .line 210
    .line 211
    move-wide/from16 v23, v10

    .line 212
    .line 213
    move-wide/from16 v21, v12

    .line 214
    .line 215
    move-wide/from16 v19, v14

    .line 216
    .line 217
    move-object/from16 v0, v18

    .line 218
    .line 219
    move-object/from16 v11, p2

    .line 220
    .line 221
    move-object/from16 v10, p3

    .line 222
    .line 223
    move-object/from16 v18, p4

    .line 224
    .line 225
    move-object v12, v4

    .line 226
    move-wide v13, v8

    .line 227
    const/4 v4, 0x1

    .line 228
    move-wide v7, v6

    .line 229
    move v6, v5

    .line 230
    move/from16 v5, p1

    .line 231
    .line 232
    goto/16 :goto_4

    .line 233
    .line 234
    :catchall_1
    move-exception v0

    .line 235
    move/from16 v18, v5

    .line 236
    .line 237
    move/from16 v5, p1

    .line 238
    .line 239
    move-object/from16 p1, v0

    .line 240
    .line 241
    move-object/from16 v0, p2

    .line 242
    .line 243
    move/from16 p2, v18

    .line 244
    .line 245
    move-wide/from16 v18, v6

    .line 246
    .line 247
    move-wide v6, v8

    .line 248
    move-object/from16 v9, p3

    .line 249
    .line 250
    move-object/from16 v8, p4

    .line 251
    .line 252
    goto/16 :goto_c

    .line 253
    .line 254
    :cond_4
    move-object/from16 v18, v0

    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    new-instance v18, La/z3t0;

    .line 262
    .line 263
    move-wide/from16 v19, p1

    .line 264
    .line 265
    move-wide/from16 v21, p3

    .line 266
    .line 267
    move-wide/from16 v23, p5

    .line 268
    .line 269
    invoke-direct/range {v18 .. v24}, La/z3t0;-><init>(JJJ)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v4, v18

    .line 273
    .line 274
    iget-object v0, v1, La/d4t0;->d:Lkotlin/Pair;

    .line 275
    .line 276
    if-eqz v0, :cond_6

    .line 277
    .line 278
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 279
    .line 280
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_5

    .line 285
    .line 286
    iget-object v5, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v5, La/j0g0;

    .line 289
    .line 290
    iget-object v5, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 291
    .line 292
    instance-of v5, v5, La/g0g0;

    .line 293
    .line 294
    if-nez v5, :cond_5

    .line 295
    .line 296
    goto :goto_1

    .line 297
    :cond_5
    move-object/from16 v0, v17

    .line 298
    .line 299
    :goto_1
    if-eqz v0, :cond_6

    .line 300
    .line 301
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, La/j0g0;

    .line 304
    .line 305
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 306
    .line 307
    return-object v0

    .line 308
    :cond_6
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 309
    .line 310
    sget-wide v5, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 311
    .line 312
    const-wide/16 v7, 0x3

    .line 313
    .line 314
    move-object v15, v1

    .line 315
    move-object v10, v2

    .line 316
    move-object v12, v4

    .line 317
    move-wide v13, v7

    .line 318
    move-object/from16 v11, v17

    .line 319
    .line 320
    const/4 v0, 0x1

    .line 321
    move-wide/from16 v8, p5

    .line 322
    .line 323
    move-wide/from16 v26, p1

    .line 324
    .line 325
    const/16 p1, 0x0

    .line 326
    .line 327
    move-wide/from16 v28, p3

    .line 328
    .line 329
    const/16 p4, 0x0

    .line 330
    .line 331
    move-wide/from16 p2, v5

    .line 332
    .line 333
    move-wide/from16 v4, v26

    .line 334
    .line 335
    :goto_2
    move-wide/from16 v6, v28

    .line 336
    .line 337
    :goto_3
    if-eqz v0, :cond_12

    .line 338
    .line 339
    :try_start_4
    iput-object v12, v2, La/b4t0;->n:La/z3t0;

    .line 340
    .line 341
    iput-object v15, v2, La/b4t0;->o:La/d4t0;

    .line 342
    .line 343
    iput-object v10, v2, La/b4t0;->p:La/b4t0;

    .line 344
    .line 345
    iput-object v11, v2, La/b4t0;->q:Ljava/lang/Throwable;

    .line 346
    .line 347
    iput-wide v4, v2, La/b4t0;->i:J

    .line 348
    .line 349
    iput-wide v6, v2, La/b4t0;->j:J

    .line 350
    .line 351
    iput-wide v8, v2, La/b4t0;->k:J

    .line 352
    .line 353
    iput-wide v13, v2, La/b4t0;->l:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    .line 354
    .line 355
    move-wide/from16 v19, v4

    .line 356
    .line 357
    move-wide/from16 v4, p2

    .line 358
    .line 359
    :try_start_5
    iput-wide v4, v2, La/b4t0;->m:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    .line 360
    .line 361
    move-wide/from16 p2, v4

    .line 362
    .line 363
    move/from16 v4, p1

    .line 364
    .line 365
    :try_start_6
    iput v4, v2, La/b4t0;->r:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 366
    .line 367
    move/from16 v5, p4

    .line 368
    .line 369
    :try_start_7
    iput v5, v2, La/b4t0;->s:I

    .line 370
    .line 371
    iput v0, v2, La/b4t0;->t:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 372
    .line 373
    move/from16 p1, v4

    .line 374
    .line 375
    const/4 v4, 0x1

    .line 376
    :try_start_8
    iput v4, v2, La/b4t0;->w:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 377
    .line 378
    move-object/from16 v25, v2

    .line 379
    .line 380
    move-wide/from16 v21, v6

    .line 381
    .line 382
    move-wide/from16 v23, v8

    .line 383
    .line 384
    move-object/from16 v18, v15

    .line 385
    .line 386
    :try_start_9
    invoke-virtual/range {v18 .. v25}, La/d4t0;->a(JJJLa/zje;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 390
    if-ne v0, v3, :cond_7

    .line 391
    .line 392
    goto/16 :goto_11

    .line 393
    .line 394
    :cond_7
    move/from16 v6, p1

    .line 395
    .line 396
    move-wide/from16 v7, p2

    .line 397
    .line 398
    move-object/from16 v2, v25

    .line 399
    .line 400
    :goto_4
    :try_start_a
    check-cast v0, La/vsp;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 401
    .line 402
    if-eqz v0, :cond_8

    .line 403
    .line 404
    :try_start_b
    invoke-static {v0}, La/dub;->s0(La/vsp;)La/rsp;

    .line 405
    .line 406
    .line 407
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 408
    goto :goto_6

    .line 409
    :catchall_2
    move-exception v0

    .line 410
    :goto_5
    move-object/from16 p1, v0

    .line 411
    .line 412
    move/from16 p2, v6

    .line 413
    .line 414
    move-object v9, v10

    .line 415
    move-object v0, v11

    .line 416
    move-object v4, v12

    .line 417
    move-wide/from16 v10, v23

    .line 418
    .line 419
    move-wide/from16 v26, v7

    .line 420
    .line 421
    move-object/from16 v8, v18

    .line 422
    .line 423
    move-wide v6, v13

    .line 424
    move-wide/from16 v14, v19

    .line 425
    .line 426
    move-wide/from16 v12, v21

    .line 427
    .line 428
    move-wide/from16 v18, v26

    .line 429
    .line 430
    goto/16 :goto_c

    .line 431
    .line 432
    :cond_8
    :try_start_c
    new-instance v0, La/rsp;

    .line 433
    .line 434
    sget-object v9, La/f7v0;->a:La/f7v0;

    .line 435
    .line 436
    sget-object v15, La/iun;->a:La/iun;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 437
    .line 438
    move-object/from16 v4, v17

    .line 439
    .line 440
    :try_start_d
    invoke-direct {v0, v9, v4, v15}, La/rsp;-><init>(La/f7v0;La/xsp;Ljava/util/List;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 441
    .line 442
    .line 443
    :goto_6
    :try_start_e
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 444
    .line 445
    goto/16 :goto_15

    .line 446
    .line 447
    :catchall_3
    move-exception v0

    .line 448
    move-object v4, v12

    .line 449
    goto/16 :goto_14

    .line 450
    .line 451
    :catchall_4
    move-exception v0

    .line 452
    move-object/from16 v4, v17

    .line 453
    .line 454
    goto :goto_5

    .line 455
    :catchall_5
    move-exception v0

    .line 456
    move-object/from16 v4, v17

    .line 457
    .line 458
    move-object v9, v10

    .line 459
    move-object v4, v12

    .line 460
    move-wide v6, v13

    .line 461
    move-object/from16 v8, v18

    .line 462
    .line 463
    move-wide/from16 v14, v19

    .line 464
    .line 465
    move-wide/from16 v12, v21

    .line 466
    .line 467
    move-object/from16 v2, v25

    .line 468
    .line 469
    :goto_7
    move-wide/from16 v18, p2

    .line 470
    .line 471
    move/from16 p2, p1

    .line 472
    .line 473
    move-object/from16 p1, v0

    .line 474
    .line 475
    move-object v0, v11

    .line 476
    move-wide/from16 v10, v23

    .line 477
    .line 478
    goto :goto_c

    .line 479
    :catchall_6
    move-exception v0

    .line 480
    move-object/from16 v25, v2

    .line 481
    .line 482
    :goto_8
    move-wide/from16 v21, v6

    .line 483
    .line 484
    move-wide/from16 v23, v8

    .line 485
    .line 486
    move-object/from16 v18, v15

    .line 487
    .line 488
    move-object/from16 v4, v17

    .line 489
    .line 490
    :goto_9
    move-object v9, v10

    .line 491
    move-object v4, v12

    .line 492
    move-wide v6, v13

    .line 493
    move-object/from16 v8, v18

    .line 494
    .line 495
    move-wide/from16 v14, v19

    .line 496
    .line 497
    move-wide/from16 v12, v21

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :catchall_7
    move-exception v0

    .line 501
    :goto_a
    move-object/from16 v25, v2

    .line 502
    .line 503
    move/from16 p1, v4

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :catchall_8
    move-exception v0

    .line 507
    move/from16 v5, p4

    .line 508
    .line 509
    goto :goto_a

    .line 510
    :catchall_9
    move-exception v0

    .line 511
    move-object/from16 v25, v2

    .line 512
    .line 513
    move-wide/from16 p2, v4

    .line 514
    .line 515
    :goto_b
    move-wide/from16 v21, v6

    .line 516
    .line 517
    move-wide/from16 v23, v8

    .line 518
    .line 519
    move-object/from16 v18, v15

    .line 520
    .line 521
    move-object/from16 v4, v17

    .line 522
    .line 523
    move/from16 v5, p4

    .line 524
    .line 525
    goto :goto_9

    .line 526
    :catchall_a
    move-exception v0

    .line 527
    move-object/from16 v25, v2

    .line 528
    .line 529
    move-wide/from16 v19, v4

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :goto_c
    :try_start_f
    invoke-static/range {p1 .. p1}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 533
    .line 534
    .line 535
    move-result v20
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    .line 536
    if-eqz v20, :cond_d

    .line 537
    .line 538
    if-nez p2, :cond_9

    .line 539
    .line 540
    :try_start_10
    new-instance v0, La/el50;

    .line 541
    .line 542
    move-object/from16 v1, p1

    .line 543
    .line 544
    invoke-direct {v0, v1}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    move/from16 p1, p2

    .line 548
    .line 549
    move/from16 p4, v5

    .line 550
    .line 551
    move-wide/from16 p2, v18

    .line 552
    .line 553
    const/16 v17, 0x0

    .line 554
    .line 555
    move-object/from16 v1, p0

    .line 556
    .line 557
    move-wide/from16 v26, v10

    .line 558
    .line 559
    move-object v11, v0

    .line 560
    move-object v10, v9

    .line 561
    const/4 v0, 0x0

    .line 562
    move-wide/from16 v28, v12

    .line 563
    .line 564
    move-object v12, v4

    .line 565
    move-wide v4, v14

    .line 566
    move-wide v13, v6

    .line 567
    move-object v15, v8

    .line 568
    move-wide/from16 v8, v26

    .line 569
    .line 570
    goto/16 :goto_2

    .line 571
    .line 572
    :cond_9
    move-object/from16 v1, p1

    .line 573
    .line 574
    move-wide/from16 p3, v6

    .line 575
    .line 576
    int-to-long v6, v5

    .line 577
    cmp-long v6, v6, p3

    .line 578
    .line 579
    if-gez v6, :cond_a

    .line 580
    .line 581
    const/4 v6, 0x1

    .line 582
    goto :goto_d

    .line 583
    :cond_a
    const/4 v6, 0x0

    .line 584
    :goto_d
    add-int/lit8 v5, v5, 0x1

    .line 585
    .line 586
    if-eqz v6, :cond_c

    .line 587
    .line 588
    iput-object v4, v2, La/b4t0;->n:La/z3t0;

    .line 589
    .line 590
    iput-object v8, v2, La/b4t0;->o:La/d4t0;

    .line 591
    .line 592
    iput-object v9, v2, La/b4t0;->p:La/b4t0;

    .line 593
    .line 594
    iput-object v0, v2, La/b4t0;->q:Ljava/lang/Throwable;

    .line 595
    .line 596
    iput-wide v14, v2, La/b4t0;->i:J

    .line 597
    .line 598
    iput-wide v12, v2, La/b4t0;->j:J

    .line 599
    .line 600
    iput-wide v10, v2, La/b4t0;->k:J

    .line 601
    .line 602
    move-wide/from16 v20, v10

    .line 603
    .line 604
    move-wide/from16 v10, p3

    .line 605
    .line 606
    iput-wide v10, v2, La/b4t0;->l:J

    .line 607
    .line 608
    move-wide/from16 p3, v10

    .line 609
    .line 610
    move-wide/from16 v10, v18

    .line 611
    .line 612
    iput-wide v10, v2, La/b4t0;->m:J

    .line 613
    .line 614
    move/from16 v7, p2

    .line 615
    .line 616
    iput v7, v2, La/b4t0;->r:I

    .line 617
    .line 618
    iput v5, v2, La/b4t0;->s:I

    .line 619
    .line 620
    iput v6, v2, La/b4t0;->t:I

    .line 621
    .line 622
    const/4 v1, 0x2

    .line 623
    iput v1, v2, La/b4t0;->w:I

    .line 624
    .line 625
    invoke-static {v10, v11, v9}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    if-ne v1, v3, :cond_b

    .line 630
    .line 631
    goto/16 :goto_11

    .line 632
    .line 633
    :cond_b
    move-object v1, v4

    .line 634
    move-object v4, v0

    .line 635
    move v0, v5

    .line 636
    move v5, v7

    .line 637
    move-object v7, v1

    .line 638
    move-wide/from16 v18, p3

    .line 639
    .line 640
    move-object v1, v9

    .line 641
    move-wide/from16 v26, v20

    .line 642
    .line 643
    move-object/from16 v20, v8

    .line 644
    .line 645
    move-wide/from16 v8, v26

    .line 646
    .line 647
    :goto_e
    const/16 v17, 0x0

    .line 648
    .line 649
    move/from16 p4, v0

    .line 650
    .line 651
    move/from16 p1, v5

    .line 652
    .line 653
    move v0, v6

    .line 654
    move-wide/from16 p2, v10

    .line 655
    .line 656
    move-object v10, v1

    .line 657
    move-object v11, v4

    .line 658
    move-wide v4, v14

    .line 659
    move-object/from16 v15, v20

    .line 660
    .line 661
    move-object/from16 v1, p0

    .line 662
    .line 663
    move-wide/from16 v26, v12

    .line 664
    .line 665
    move-object v12, v7

    .line 666
    move-wide/from16 v6, v26

    .line 667
    .line 668
    move-wide/from16 v13, v18

    .line 669
    .line 670
    goto/16 :goto_3

    .line 671
    .line 672
    :cond_c
    move/from16 v7, p2

    .line 673
    .line 674
    move-wide/from16 v20, v10

    .line 675
    .line 676
    move-wide/from16 v10, v18

    .line 677
    .line 678
    const/16 v16, 0x2

    .line 679
    .line 680
    new-instance v0, La/el50;

    .line 681
    .line 682
    invoke-direct {v0, v1}, La/el50;-><init>(Ljava/lang/Throwable;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 683
    .line 684
    .line 685
    const/16 v17, 0x0

    .line 686
    .line 687
    move-object/from16 v1, p0

    .line 688
    .line 689
    move/from16 p1, v7

    .line 690
    .line 691
    move-wide/from16 v26, v10

    .line 692
    .line 693
    move-object v11, v0

    .line 694
    move v0, v6

    .line 695
    move-object v10, v9

    .line 696
    move-wide v6, v12

    .line 697
    move-object v12, v4

    .line 698
    move-wide/from16 v28, p3

    .line 699
    .line 700
    move/from16 p4, v5

    .line 701
    .line 702
    move-wide/from16 p2, v26

    .line 703
    .line 704
    move-wide v4, v14

    .line 705
    move-wide/from16 v13, v28

    .line 706
    .line 707
    move-object v15, v8

    .line 708
    :goto_f
    move-wide/from16 v8, v20

    .line 709
    .line 710
    goto/16 :goto_3

    .line 711
    .line 712
    :cond_d
    move-object/from16 v1, p1

    .line 713
    .line 714
    move-wide/from16 p3, v6

    .line 715
    .line 716
    move-wide/from16 v20, v10

    .line 717
    .line 718
    move-wide/from16 v10, v18

    .line 719
    .line 720
    const/16 v16, 0x2

    .line 721
    .line 722
    move/from16 v7, p2

    .line 723
    .line 724
    :try_start_11
    invoke-static {v1}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 725
    .line 726
    .line 727
    move-result v6

    .line 728
    if-eqz v6, :cond_11

    .line 729
    .line 730
    move/from16 v18, v7

    .line 731
    .line 732
    int-to-long v6, v5

    .line 733
    cmp-long v6, v6, p3

    .line 734
    .line 735
    if-gez v6, :cond_e

    .line 736
    .line 737
    const/4 v6, 0x1

    .line 738
    goto :goto_10

    .line 739
    :cond_e
    const/4 v6, 0x0

    .line 740
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 741
    .line 742
    if-eqz v6, :cond_10

    .line 743
    .line 744
    iput-object v4, v2, La/b4t0;->n:La/z3t0;

    .line 745
    .line 746
    iput-object v8, v2, La/b4t0;->o:La/d4t0;

    .line 747
    .line 748
    iput-object v9, v2, La/b4t0;->p:La/b4t0;

    .line 749
    .line 750
    iput-object v0, v2, La/b4t0;->q:Ljava/lang/Throwable;

    .line 751
    .line 752
    iput-wide v14, v2, La/b4t0;->i:J

    .line 753
    .line 754
    iput-wide v12, v2, La/b4t0;->j:J

    .line 755
    .line 756
    move-object/from16 v19, v8

    .line 757
    .line 758
    move-wide/from16 v7, v20

    .line 759
    .line 760
    iput-wide v7, v2, La/b4t0;->k:J

    .line 761
    .line 762
    move-wide/from16 v20, v7

    .line 763
    .line 764
    move-wide/from16 v7, p3

    .line 765
    .line 766
    iput-wide v7, v2, La/b4t0;->l:J

    .line 767
    .line 768
    iput-wide v10, v2, La/b4t0;->m:J

    .line 769
    .line 770
    move/from16 v1, v18

    .line 771
    .line 772
    iput v1, v2, La/b4t0;->r:I

    .line 773
    .line 774
    iput v5, v2, La/b4t0;->s:I

    .line 775
    .line 776
    iput v6, v2, La/b4t0;->t:I
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 777
    .line 778
    move-object/from16 v18, v4

    .line 779
    .line 780
    const/4 v4, 0x3

    .line 781
    :try_start_12
    iput v4, v2, La/b4t0;->w:I

    .line 782
    .line 783
    invoke-static {v10, v11, v9}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v4

    .line 787
    if-ne v4, v3, :cond_f

    .line 788
    .line 789
    :goto_11
    return-object v3

    .line 790
    :cond_f
    move-object/from16 v4, v18

    .line 791
    .line 792
    move/from16 v26, v1

    .line 793
    .line 794
    move-object v1, v0

    .line 795
    move v0, v6

    .line 796
    move-wide/from16 v27, v10

    .line 797
    .line 798
    move/from16 v11, v26

    .line 799
    .line 800
    move-object v10, v9

    .line 801
    move-wide/from16 v29, v20

    .line 802
    .line 803
    move-object/from16 v20, v19

    .line 804
    .line 805
    move-wide/from16 v18, v7

    .line 806
    .line 807
    move-wide v6, v12

    .line 808
    move-wide/from16 v8, v29

    .line 809
    .line 810
    move-wide/from16 v12, v27

    .line 811
    .line 812
    :goto_12
    const/16 v17, 0x0

    .line 813
    .line 814
    move/from16 p4, v5

    .line 815
    .line 816
    move/from16 p1, v11

    .line 817
    .line 818
    move-wide/from16 p2, v12

    .line 819
    .line 820
    move-object v11, v1

    .line 821
    move-object v12, v4

    .line 822
    move-wide v4, v14

    .line 823
    move-wide/from16 v13, v18

    .line 824
    .line 825
    move-object/from16 v15, v20

    .line 826
    .line 827
    move-object/from16 v1, p0

    .line 828
    .line 829
    goto/16 :goto_3

    .line 830
    .line 831
    :catchall_b
    move-exception v0

    .line 832
    move-object/from16 v4, v18

    .line 833
    .line 834
    goto/16 :goto_14

    .line 835
    .line 836
    :catchall_c
    move-exception v0

    .line 837
    move-object/from16 v18, v4

    .line 838
    .line 839
    goto :goto_14

    .line 840
    :cond_10
    move-object/from16 v19, v8

    .line 841
    .line 842
    move/from16 v0, v18

    .line 843
    .line 844
    move-wide/from16 v7, p3

    .line 845
    .line 846
    move-object/from16 v18, v4

    .line 847
    .line 848
    new-instance v4, La/dag0;

    .line 849
    .line 850
    invoke-direct {v4, v1}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 851
    .line 852
    .line 853
    const/16 v17, 0x0

    .line 854
    .line 855
    move-object/from16 v1, p0

    .line 856
    .line 857
    move/from16 p1, v0

    .line 858
    .line 859
    move/from16 p4, v5

    .line 860
    .line 861
    move v0, v6

    .line 862
    move-wide/from16 p2, v10

    .line 863
    .line 864
    move-object v11, v4

    .line 865
    move-object v10, v9

    .line 866
    move-wide v4, v14

    .line 867
    move-object/from16 v15, v19

    .line 868
    .line 869
    :goto_13
    move-wide/from16 v26, v12

    .line 870
    .line 871
    move-object/from16 v12, v18

    .line 872
    .line 873
    move-wide v13, v7

    .line 874
    move-wide/from16 v6, v26

    .line 875
    .line 876
    goto/16 :goto_f

    .line 877
    .line 878
    :cond_11
    move-object/from16 v18, v4

    .line 879
    .line 880
    move v0, v7

    .line 881
    move-object/from16 v19, v8

    .line 882
    .line 883
    move-wide/from16 v7, p3

    .line 884
    .line 885
    invoke-static {v1}, La/agc;->L(Ljava/lang/Throwable;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 886
    .line 887
    .line 888
    move/from16 p1, v0

    .line 889
    .line 890
    move/from16 p4, v5

    .line 891
    .line 892
    move-wide/from16 p2, v10

    .line 893
    .line 894
    move-wide v4, v14

    .line 895
    move-object/from16 v15, v19

    .line 896
    .line 897
    const/4 v0, 0x0

    .line 898
    const/16 v17, 0x0

    .line 899
    .line 900
    move-object v11, v1

    .line 901
    move-object v10, v9

    .line 902
    move-object/from16 v1, p0

    .line 903
    .line 904
    goto :goto_13

    .line 905
    :cond_12
    if-nez v11, :cond_13

    .line 906
    .line 907
    :try_start_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 908
    .line 909
    const-string v1, "Unexpected error"

    .line 910
    .line 911
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    throw v0

    .line 915
    :cond_13
    throw v11
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 916
    :goto_14
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 917
    .line 918
    new-instance v1, La/g0g0;

    .line 919
    .line 920
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 921
    .line 922
    .line 923
    move-object v0, v1

    .line 924
    move-object v12, v4

    .line 925
    :goto_15
    new-instance v1, La/j0g0;

    .line 926
    .line 927
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    new-instance v2, Lkotlin/Pair;

    .line 931
    .line 932
    invoke-direct {v2, v12, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    move-object/from16 v1, p0

    .line 936
    .line 937
    iput-object v2, v1, La/d4t0;->d:Lkotlin/Pair;

    .line 938
    .line 939
    return-object v0
.end method

.method public final c(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/c4t0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/c4t0;

    .line 11
    .line 12
    iget v3, v2, La/c4t0;->t:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/c4t0;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/c4t0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/c4t0;-><init>(La/d4t0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/c4t0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/c4t0;->t:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/c4t0;->q:I

    .line 47
    .line 48
    iget v10, v2, La/c4t0;->p:I

    .line 49
    .line 50
    iget v11, v2, La/c4t0;->o:I

    .line 51
    .line 52
    iget-wide v12, v2, La/c4t0;->n:J

    .line 53
    .line 54
    iget-wide v14, v2, La/c4t0;->m:J

    .line 55
    .line 56
    iget-object v7, v2, La/c4t0;->l:Ljava/lang/Throwable;

    .line 57
    .line 58
    iget-object v5, v2, La/c4t0;->k:La/c4t0;

    .line 59
    .line 60
    iget-object v6, v2, La/c4t0;->j:La/d4t0;

    .line 61
    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    iget-object v8, v2, La/c4t0;->i:Ljava/util/List;

    .line 65
    .line 66
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    move v0, v4

    .line 70
    move-object v4, v5

    .line 71
    move-object v5, v8

    .line 72
    const/4 v1, 0x3

    .line 73
    move-object v8, v7

    .line 74
    move v7, v11

    .line 75
    move-wide/from16 v20, v14

    .line 76
    .line 77
    move-object v14, v6

    .line 78
    move v6, v10

    .line 79
    move-wide v10, v12

    .line 80
    move-wide/from16 v12, v20

    .line 81
    .line 82
    const/4 v15, 0x2

    .line 83
    goto/16 :goto_c

    .line 84
    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object v5, v8

    .line 87
    goto/16 :goto_d

    .line 88
    .line 89
    :cond_1
    const/16 v16, 0x0

    .line 90
    .line 91
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v16

    .line 97
    :cond_2
    const/16 v16, 0x0

    .line 98
    .line 99
    iget v4, v2, La/c4t0;->q:I

    .line 100
    .line 101
    iget v5, v2, La/c4t0;->p:I

    .line 102
    .line 103
    iget v6, v2, La/c4t0;->o:I

    .line 104
    .line 105
    iget-wide v7, v2, La/c4t0;->n:J

    .line 106
    .line 107
    iget-wide v10, v2, La/c4t0;->m:J

    .line 108
    .line 109
    iget-object v12, v2, La/c4t0;->l:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v13, v2, La/c4t0;->k:La/c4t0;

    .line 112
    .line 113
    iget-object v14, v2, La/c4t0;->j:La/d4t0;

    .line 114
    .line 115
    iget-object v15, v2, La/c4t0;->i:Ljava/util/List;

    .line 116
    .line 117
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    .line 119
    .line 120
    move v0, v4

    .line 121
    move-object v4, v13

    .line 122
    move/from16 v20, v6

    .line 123
    .line 124
    move v6, v5

    .line 125
    move-object v5, v15

    .line 126
    const/4 v15, 0x2

    .line 127
    move-wide/from16 v21, v7

    .line 128
    .line 129
    move/from16 v7, v20

    .line 130
    .line 131
    move-object v8, v12

    .line 132
    move-wide v12, v10

    .line 133
    move-wide/from16 v10, v21

    .line 134
    .line 135
    goto/16 :goto_9

    .line 136
    .line 137
    :catchall_1
    move-exception v0

    .line 138
    move-object v5, v15

    .line 139
    goto/16 :goto_d

    .line 140
    .line 141
    :cond_3
    const/16 v16, 0x0

    .line 142
    .line 143
    iget v4, v2, La/c4t0;->p:I

    .line 144
    .line 145
    iget v5, v2, La/c4t0;->o:I

    .line 146
    .line 147
    iget-wide v6, v2, La/c4t0;->n:J

    .line 148
    .line 149
    iget-wide v10, v2, La/c4t0;->m:J

    .line 150
    .line 151
    iget-object v8, v2, La/c4t0;->l:Ljava/lang/Throwable;

    .line 152
    .line 153
    iget-object v12, v2, La/c4t0;->k:La/c4t0;

    .line 154
    .line 155
    iget-object v13, v2, La/c4t0;->j:La/d4t0;

    .line 156
    .line 157
    iget-object v14, v2, La/c4t0;->i:Ljava/util/List;

    .line 158
    .line 159
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 160
    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :catchall_2
    move-exception v0

    .line 165
    move-object/from16 v9, v16

    .line 166
    .line 167
    :goto_1
    move-wide/from16 v20, v6

    .line 168
    .line 169
    move v6, v4

    .line 170
    move v7, v5

    .line 171
    move-object v4, v12

    .line 172
    move-object v5, v14

    .line 173
    move-object v14, v13

    .line 174
    move-wide v12, v10

    .line 175
    move-wide/from16 v10, v20

    .line 176
    .line 177
    goto/16 :goto_7

    .line 178
    .line 179
    :cond_4
    const/16 v16, 0x0

    .line 180
    .line 181
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, v1, La/d4t0;->c:Lkotlin/Pair;

    .line 185
    .line 186
    if-eqz v0, :cond_6

    .line 187
    .line 188
    iget-object v4, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 189
    .line 190
    move-object/from16 v5, p1

    .line 191
    .line 192
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_5

    .line 197
    .line 198
    iget-object v4, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v4, La/j0g0;

    .line 201
    .line 202
    iget-object v4, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 203
    .line 204
    instance-of v4, v4, La/g0g0;

    .line 205
    .line 206
    if-nez v4, :cond_5

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    move-object/from16 v0, v16

    .line 210
    .line 211
    :goto_2
    if-eqz v0, :cond_7

    .line 212
    .line 213
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, La/j0g0;

    .line 216
    .line 217
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 218
    .line 219
    return-object v0

    .line 220
    :cond_6
    move-object/from16 v5, p1

    .line 221
    .line 222
    :cond_7
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 223
    .line 224
    sget-wide v6, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 225
    .line 226
    const-wide/16 v10, 0x3

    .line 227
    .line 228
    move-object v14, v1

    .line 229
    move-object v4, v2

    .line 230
    move v0, v9

    .line 231
    move-wide v12, v10

    .line 232
    move-object/from16 v8, v16

    .line 233
    .line 234
    move-wide v10, v6

    .line 235
    const/4 v6, 0x0

    .line 236
    const/4 v7, 0x0

    .line 237
    :goto_3
    if-eqz v0, :cond_17

    .line 238
    .line 239
    :try_start_4
    iget-object v15, v14, La/d4t0;->a:La/iqi;

    .line 240
    .line 241
    iput-object v5, v2, La/c4t0;->i:Ljava/util/List;

    .line 242
    .line 243
    iput-object v14, v2, La/c4t0;->j:La/d4t0;

    .line 244
    .line 245
    iput-object v4, v2, La/c4t0;->k:La/c4t0;

    .line 246
    .line 247
    iput-object v8, v2, La/c4t0;->l:Ljava/lang/Throwable;

    .line 248
    .line 249
    iput-wide v12, v2, La/c4t0;->m:J

    .line 250
    .line 251
    iput-wide v10, v2, La/c4t0;->n:J

    .line 252
    .line 253
    iput v7, v2, La/c4t0;->o:I

    .line 254
    .line 255
    iput v6, v2, La/c4t0;->p:I

    .line 256
    .line 257
    iput v0, v2, La/c4t0;->q:I

    .line 258
    .line 259
    iput v9, v2, La/c4t0;->t:I

    .line 260
    .line 261
    iget-object v0, v15, La/iqi;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, La/yip;

    .line 264
    .line 265
    invoke-virtual {v0}, La/yip;->invoke()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, La/jyp;

    .line 270
    .line 271
    invoke-interface {v0, v5, v2}, La/jyp;->a(Ljava/util/List;La/yje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 275
    if-ne v0, v3, :cond_8

    .line 276
    .line 277
    goto/16 :goto_b

    .line 278
    .line 279
    :cond_8
    move-wide/from16 v20, v12

    .line 280
    .line 281
    move-object v12, v4

    .line 282
    move v4, v6

    .line 283
    move-object v13, v14

    .line 284
    move-object v14, v5

    .line 285
    move v5, v7

    .line 286
    move-wide v6, v10

    .line 287
    move-wide/from16 v10, v20

    .line 288
    .line 289
    :goto_4
    :try_start_5
    check-cast v0, La/myp;

    .line 290
    .line 291
    iget-object v15, v0, La/myp;->a:La/uhi0;

    .line 292
    .line 293
    if-nez v15, :cond_d

    .line 294
    .line 295
    iget-object v0, v0, La/myp;->b:Ljava/util/List;

    .line 296
    .line 297
    if-eqz v0, :cond_c

    .line 298
    .line 299
    new-instance v15, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v17

    .line 312
    if-eqz v17, :cond_b

    .line 313
    .line 314
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v17

    .line 318
    check-cast v17, La/qxp;

    .line 319
    .line 320
    if-eqz v17, :cond_9

    .line 321
    .line 322
    invoke-static/range {v17 .. v17}, La/uzb;->I0(La/qxp;)La/mxp;

    .line 323
    .line 324
    .line 325
    move-result-object v17

    .line 326
    move-object/from16 v9, v17

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_9
    move-object/from16 v9, v16

    .line 330
    .line 331
    :goto_6
    if-eqz v9, :cond_a

    .line 332
    .line 333
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 334
    .line 335
    .line 336
    :cond_a
    const/4 v9, 0x1

    .line 337
    goto :goto_5

    .line 338
    :cond_b
    :try_start_6
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 339
    .line 340
    goto/16 :goto_e

    .line 341
    .line 342
    :catchall_3
    move-exception v0

    .line 343
    move-object v5, v14

    .line 344
    goto/16 :goto_d

    .line 345
    .line 346
    :cond_c
    :try_start_7
    new-instance v0, La/ff5;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 347
    .line 348
    move-object/from16 v9, v16

    .line 349
    .line 350
    :try_start_8
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :catchall_4
    move-exception v0

    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :cond_d
    move-object/from16 v9, v16

    .line 358
    .line 359
    new-instance v0, La/zhi0;

    .line 360
    .line 361
    invoke-direct {v0, v15}, La/zhi0;-><init>(La/uhi0;)V

    .line 362
    .line 363
    .line 364
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 365
    :catchall_5
    move-exception v0

    .line 366
    move-object/from16 v9, v16

    .line 367
    .line 368
    :goto_7
    :try_start_9
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 369
    .line 370
    .line 371
    move-result v15

    .line 372
    if-eqz v15, :cond_12

    .line 373
    .line 374
    if-nez v7, :cond_e

    .line 375
    .line 376
    new-instance v8, La/el50;

    .line 377
    .line 378
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    move-object/from16 v16, v9

    .line 382
    .line 383
    const/4 v0, 0x0

    .line 384
    const/4 v9, 0x1

    .line 385
    goto/16 :goto_3

    .line 386
    .line 387
    :catchall_6
    move-exception v0

    .line 388
    goto/16 :goto_d

    .line 389
    .line 390
    :cond_e
    move-wide/from16 v18, v10

    .line 391
    .line 392
    int-to-long v9, v6

    .line 393
    cmp-long v9, v9, v12

    .line 394
    .line 395
    if-gez v9, :cond_f

    .line 396
    .line 397
    const/4 v9, 0x1

    .line 398
    goto :goto_8

    .line 399
    :cond_f
    const/4 v9, 0x0

    .line 400
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 401
    .line 402
    if-eqz v9, :cond_10

    .line 403
    .line 404
    iput-object v5, v2, La/c4t0;->i:Ljava/util/List;

    .line 405
    .line 406
    iput-object v14, v2, La/c4t0;->j:La/d4t0;

    .line 407
    .line 408
    iput-object v4, v2, La/c4t0;->k:La/c4t0;

    .line 409
    .line 410
    iput-object v8, v2, La/c4t0;->l:Ljava/lang/Throwable;

    .line 411
    .line 412
    iput-wide v12, v2, La/c4t0;->m:J

    .line 413
    .line 414
    move-wide/from16 v10, v18

    .line 415
    .line 416
    iput-wide v10, v2, La/c4t0;->n:J

    .line 417
    .line 418
    iput v7, v2, La/c4t0;->o:I

    .line 419
    .line 420
    iput v6, v2, La/c4t0;->p:I

    .line 421
    .line 422
    iput v9, v2, La/c4t0;->q:I

    .line 423
    .line 424
    const/4 v15, 0x2

    .line 425
    iput v15, v2, La/c4t0;->t:I

    .line 426
    .line 427
    invoke-static {v10, v11, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    if-ne v0, v3, :cond_11

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :goto_9
    const/4 v9, 0x1

    .line 435
    const/16 v16, 0x0

    .line 436
    .line 437
    goto/16 :goto_3

    .line 438
    .line 439
    :cond_10
    move-wide/from16 v10, v18

    .line 440
    .line 441
    const/4 v15, 0x2

    .line 442
    new-instance v8, La/el50;

    .line 443
    .line 444
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 445
    .line 446
    .line 447
    :cond_11
    move v0, v9

    .line 448
    goto :goto_9

    .line 449
    :cond_12
    const/4 v15, 0x2

    .line 450
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 451
    .line 452
    .line 453
    move-result v9

    .line 454
    if-eqz v9, :cond_16

    .line 455
    .line 456
    move-object/from16 p1, v0

    .line 457
    .line 458
    int-to-long v0, v6

    .line 459
    cmp-long v0, v0, v12

    .line 460
    .line 461
    if-gez v0, :cond_13

    .line 462
    .line 463
    const/4 v0, 0x1

    .line 464
    goto :goto_a

    .line 465
    :cond_13
    const/4 v0, 0x0

    .line 466
    :goto_a
    add-int/lit8 v6, v6, 0x1

    .line 467
    .line 468
    if-eqz v0, :cond_15

    .line 469
    .line 470
    iput-object v5, v2, La/c4t0;->i:Ljava/util/List;

    .line 471
    .line 472
    iput-object v14, v2, La/c4t0;->j:La/d4t0;

    .line 473
    .line 474
    iput-object v4, v2, La/c4t0;->k:La/c4t0;

    .line 475
    .line 476
    iput-object v8, v2, La/c4t0;->l:Ljava/lang/Throwable;

    .line 477
    .line 478
    iput-wide v12, v2, La/c4t0;->m:J

    .line 479
    .line 480
    iput-wide v10, v2, La/c4t0;->n:J

    .line 481
    .line 482
    iput v7, v2, La/c4t0;->o:I

    .line 483
    .line 484
    iput v6, v2, La/c4t0;->p:I

    .line 485
    .line 486
    iput v0, v2, La/c4t0;->q:I

    .line 487
    .line 488
    const/4 v1, 0x3

    .line 489
    iput v1, v2, La/c4t0;->t:I

    .line 490
    .line 491
    invoke-static {v10, v11, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v9

    .line 495
    if-ne v9, v3, :cond_14

    .line 496
    .line 497
    :goto_b
    return-object v3

    .line 498
    :cond_14
    :goto_c
    const/4 v9, 0x1

    .line 499
    const/16 v16, 0x0

    .line 500
    .line 501
    move-object/from16 v1, p0

    .line 502
    .line 503
    goto/16 :goto_3

    .line 504
    .line 505
    :cond_15
    const/4 v1, 0x3

    .line 506
    new-instance v8, La/dag0;

    .line 507
    .line 508
    move-object/from16 v9, p1

    .line 509
    .line 510
    invoke-direct {v8, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 511
    .line 512
    .line 513
    goto :goto_c

    .line 514
    :cond_16
    move-object v9, v0

    .line 515
    const/4 v1, 0x3

    .line 516
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 517
    .line 518
    .line 519
    move-object v8, v9

    .line 520
    const/4 v0, 0x0

    .line 521
    goto :goto_c

    .line 522
    :cond_17
    if-nez v8, :cond_18

    .line 523
    .line 524
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 525
    .line 526
    const-string v1, "Unexpected error"

    .line 527
    .line 528
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    throw v0

    .line 532
    :cond_18
    throw v8
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 533
    :goto_d
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 534
    .line 535
    new-instance v15, La/g0g0;

    .line 536
    .line 537
    invoke-direct {v15, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 538
    .line 539
    .line 540
    move-object v14, v5

    .line 541
    :goto_e
    new-instance v0, La/j0g0;

    .line 542
    .line 543
    invoke-direct {v0, v15}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    new-instance v1, Lkotlin/Pair;

    .line 547
    .line 548
    invoke-direct {v1, v14, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    move-object/from16 v2, p0

    .line 552
    .line 553
    iput-object v1, v2, La/d4t0;->c:Lkotlin/Pair;

    .line 554
    .line 555
    return-object v15
.end method
