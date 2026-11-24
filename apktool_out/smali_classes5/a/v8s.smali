.class public final synthetic La/v8s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9s;

.field public final synthetic c:La/fsr;


# direct methods
.method public synthetic constructor <init>(La/fsr;La/g9s;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/v8s;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v8s;->c:La/fsr;

    iput-object p2, p0, La/v8s;->b:La/g9s;

    return-void
.end method

.method public synthetic constructor <init>(La/g9s;La/fsr;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/v8s;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v8s;->b:La/g9s;

    iput-object p2, p0, La/v8s;->c:La/fsr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/v8s;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_BROADCASTING_INDEX"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/v8s;->b:La/g9s;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/oyg0;

    .line 16
    .line 17
    move-object/from16 v5, p2

    .line 18
    .line 19
    check-cast v5, La/r7s;

    .line 20
    .line 21
    iget-object v1, v4, La/g9s;->p:Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;

    .line 22
    .line 23
    iget-object v6, v1, Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;->d:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    iget-object v0, v0, La/v8s;->c:La/fsr;

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    if-eq v6, v7, :cond_1

    .line 35
    .line 36
    const/4 v8, 0x2

    .line 37
    const/4 v9, 0x0

    .line 38
    if-ne v6, v8, :cond_0

    .line 39
    .line 40
    :goto_0
    move-object/from16 v38, v9

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    iget-boolean v6, v0, La/fsr;->b:Z

    .line 49
    .line 50
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    goto :goto_0

    .line 60
    :goto_1
    iget-object v1, v1, Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;->d:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 61
    .line 62
    sget-object v6, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->a:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 63
    .line 64
    if-ne v1, v6, :cond_3

    .line 65
    .line 66
    move/from16 v34, v7

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move/from16 v34, v3

    .line 70
    .line 71
    :goto_2
    sget-object v6, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->b:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 72
    .line 73
    if-ne v1, v6, :cond_4

    .line 74
    .line 75
    move/from16 v35, v7

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move/from16 v35, v3

    .line 79
    .line 80
    :goto_3
    const v56, 0x66ffffff

    .line 81
    .line 82
    .line 83
    const v57, 0xfffff

    .line 84
    .line 85
    .line 86
    const-wide/16 v6, 0x0

    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    const-wide/16 v13, 0x0

    .line 94
    .line 95
    const/4 v15, 0x0

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/16 v18, 0x0

    .line 101
    .line 102
    const/16 v19, 0x0

    .line 103
    .line 104
    const/16 v20, 0x0

    .line 105
    .line 106
    const/16 v21, 0x0

    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const/16 v23, 0x0

    .line 111
    .line 112
    const/16 v24, 0x0

    .line 113
    .line 114
    const/16 v25, 0x0

    .line 115
    .line 116
    const/16 v26, 0x0

    .line 117
    .line 118
    const/16 v27, 0x0

    .line 119
    .line 120
    const/16 v28, 0x0

    .line 121
    .line 122
    const/16 v29, 0x0

    .line 123
    .line 124
    const/16 v30, 0x0

    .line 125
    .line 126
    const/16 v32, 0x0

    .line 127
    .line 128
    const/16 v33, 0x0

    .line 129
    .line 130
    const/16 v36, 0x0

    .line 131
    .line 132
    const/16 v37, 0x0

    .line 133
    .line 134
    const/16 v39, 0x0

    .line 135
    .line 136
    const/16 v40, 0x0

    .line 137
    .line 138
    const/16 v41, 0x0

    .line 139
    .line 140
    const/16 v42, 0x0

    .line 141
    .line 142
    const/16 v43, 0x0

    .line 143
    .line 144
    const/16 v44, 0x0

    .line 145
    .line 146
    const/16 v45, 0x0

    .line 147
    .line 148
    const/16 v46, 0x0

    .line 149
    .line 150
    const/16 v47, 0x0

    .line 151
    .line 152
    const/16 v48, 0x0

    .line 153
    .line 154
    const/16 v49, 0x0

    .line 155
    .line 156
    const/16 v50, 0x0

    .line 157
    .line 158
    const/16 v51, 0x0

    .line 159
    .line 160
    const/16 v52, 0x0

    .line 161
    .line 162
    const/16 v53, 0x0

    .line 163
    .line 164
    const/16 v54, 0x0

    .line 165
    .line 166
    const/16 v55, 0x0

    .line 167
    .line 168
    move-object/from16 v31, v0

    .line 169
    .line 170
    invoke-static/range {v5 .. v57}, La/r7s;->a(La/r7s;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;Ljava/util/LinkedHashSet;La/py20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;La/fsr;ZZZZZZLjava/lang/Integer;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;ZII)La/r7s;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    iget-object v0, v4, La/g9s;->o:La/vzg0;

    .line 175
    .line 176
    iget-object v1, v9, La/r7s;->F:Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {v0, v2, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :goto_4
    return-object v9

    .line 182
    :pswitch_0
    move-object/from16 v1, p1

    .line 183
    .line 184
    check-cast v1, La/oyg0;

    .line 185
    .line 186
    move-object/from16 v5, p2

    .line 187
    .line 188
    check-cast v5, La/r7s;

    .line 189
    .line 190
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v38

    .line 194
    const v56, 0x76ffffff

    .line 195
    .line 196
    .line 197
    const v57, 0xfffff

    .line 198
    .line 199
    .line 200
    const-wide/16 v6, 0x0

    .line 201
    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v9, 0x0

    .line 204
    const/4 v10, 0x0

    .line 205
    const-wide/16 v11, 0x0

    .line 206
    .line 207
    const-wide/16 v13, 0x0

    .line 208
    .line 209
    const/4 v15, 0x0

    .line 210
    const/16 v16, 0x0

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/16 v18, 0x0

    .line 215
    .line 216
    const/16 v19, 0x0

    .line 217
    .line 218
    const/16 v20, 0x0

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    const/16 v23, 0x0

    .line 225
    .line 226
    const/16 v24, 0x0

    .line 227
    .line 228
    const/16 v25, 0x0

    .line 229
    .line 230
    const/16 v26, 0x0

    .line 231
    .line 232
    const/16 v27, 0x0

    .line 233
    .line 234
    const/16 v28, 0x0

    .line 235
    .line 236
    const/16 v29, 0x0

    .line 237
    .line 238
    const/16 v30, 0x0

    .line 239
    .line 240
    iget-object v0, v0, La/v8s;->c:La/fsr;

    .line 241
    .line 242
    const/16 v32, 0x0

    .line 243
    .line 244
    const/16 v33, 0x0

    .line 245
    .line 246
    const/16 v34, 0x1

    .line 247
    .line 248
    const/16 v35, 0x0

    .line 249
    .line 250
    const/16 v36, 0x0

    .line 251
    .line 252
    const/16 v37, 0x0

    .line 253
    .line 254
    const/16 v39, 0x0

    .line 255
    .line 256
    const/16 v40, 0x0

    .line 257
    .line 258
    const/16 v41, 0x0

    .line 259
    .line 260
    const/16 v42, 0x0

    .line 261
    .line 262
    const/16 v43, 0x0

    .line 263
    .line 264
    const/16 v44, 0x0

    .line 265
    .line 266
    const/16 v45, 0x0

    .line 267
    .line 268
    const/16 v46, 0x0

    .line 269
    .line 270
    const/16 v47, 0x0

    .line 271
    .line 272
    const/16 v48, 0x0

    .line 273
    .line 274
    const/16 v49, 0x0

    .line 275
    .line 276
    const/16 v50, 0x0

    .line 277
    .line 278
    const/16 v51, 0x0

    .line 279
    .line 280
    const/16 v52, 0x0

    .line 281
    .line 282
    const/16 v53, 0x0

    .line 283
    .line 284
    const/16 v54, 0x0

    .line 285
    .line 286
    const/16 v55, 0x0

    .line 287
    .line 288
    move-object/from16 v31, v0

    .line 289
    .line 290
    invoke-static/range {v5 .. v57}, La/r7s;->a(La/r7s;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;Ljava/util/LinkedHashSet;La/py20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;La/fsr;ZZZZZZLjava/lang/Integer;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;ZII)La/r7s;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    iget-object v1, v4, La/g9s;->o:La/vzg0;

    .line 295
    .line 296
    iget-object v3, v0, La/r7s;->F:Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    return-object v0

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
