.class public final synthetic La/epr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fsr;

.field public final synthetic c:La/spr;


# direct methods
.method public synthetic constructor <init>(La/fsr;La/spr;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/epr;->a:B

    iput-object p1, p0, La/epr;->b:La/fsr;

    iput-object p2, p0, La/epr;->c:La/spr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/epr;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_CURRENT_CARD_TYPE"

    .line 6
    .line 7
    iget-object v3, v0, La/epr;->c:La/spr;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/oyg0;

    .line 15
    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    check-cast v4, La/qnr;

    .line 19
    .line 20
    iget-object v1, v3, La/spr;->p:Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 21
    .line 22
    iget-object v1, v1, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;->d:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-eq v1, v5, :cond_1

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x0

    .line 35
    if-ne v1, v5, :cond_0

    .line 36
    .line 37
    :goto_0
    move-object/from16 v44, v6

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    sget-object v6, La/dja;->g:La/dja;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object v6, La/dja;->f:La/dja;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :goto_1
    const/16 v53, -0x1

    .line 51
    .line 52
    const v54, 0x7fdbf

    .line 53
    .line 54
    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const-wide/16 v10, 0x0

    .line 61
    .line 62
    const-wide/16 v12, 0x0

    .line 63
    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v15, 0x0

    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    const/16 v19, 0x0

    .line 73
    .line 74
    const/16 v20, 0x0

    .line 75
    .line 76
    const/16 v21, 0x0

    .line 77
    .line 78
    const/16 v22, 0x0

    .line 79
    .line 80
    const/16 v23, 0x0

    .line 81
    .line 82
    const/16 v24, 0x0

    .line 83
    .line 84
    const/16 v25, 0x0

    .line 85
    .line 86
    const/16 v26, 0x0

    .line 87
    .line 88
    const/16 v27, 0x0

    .line 89
    .line 90
    const/16 v28, 0x0

    .line 91
    .line 92
    const/16 v29, 0x0

    .line 93
    .line 94
    const/16 v30, 0x0

    .line 95
    .line 96
    const/16 v31, 0x0

    .line 97
    .line 98
    const/16 v32, 0x0

    .line 99
    .line 100
    const/16 v33, 0x0

    .line 101
    .line 102
    const/16 v34, 0x0

    .line 103
    .line 104
    const/16 v35, 0x0

    .line 105
    .line 106
    const/16 v36, 0x0

    .line 107
    .line 108
    const/16 v37, 0x0

    .line 109
    .line 110
    const/16 v38, 0x0

    .line 111
    .line 112
    const/16 v39, 0x0

    .line 113
    .line 114
    const/16 v40, 0x0

    .line 115
    .line 116
    iget-object v0, v0, La/epr;->b:La/fsr;

    .line 117
    .line 118
    const/16 v42, 0x0

    .line 119
    .line 120
    const/16 v43, 0x0

    .line 121
    .line 122
    const/16 v45, 0x0

    .line 123
    .line 124
    const/16 v46, 0x0

    .line 125
    .line 126
    const/16 v47, 0x0

    .line 127
    .line 128
    const/16 v48, 0x0

    .line 129
    .line 130
    const/16 v49, 0x0

    .line 131
    .line 132
    const/16 v50, 0x0

    .line 133
    .line 134
    const/16 v51, 0x0

    .line 135
    .line 136
    const/16 v52, 0x0

    .line 137
    .line 138
    move-object/from16 v41, v0

    .line 139
    .line 140
    invoke-static/range {v4 .. v54}, La/qnr;->a(La/qnr;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;ZII)La/qnr;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    iget-object v0, v3, La/spr;->o:La/vzg0;

    .line 145
    .line 146
    iget-object v1, v6, La/qnr;->P:La/dja;

    .line 147
    .line 148
    invoke-virtual {v0, v2, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :goto_2
    return-object v6

    .line 152
    :pswitch_0
    move-object/from16 v1, p1

    .line 153
    .line 154
    check-cast v1, La/oyg0;

    .line 155
    .line 156
    move-object/from16 v4, p2

    .line 157
    .line 158
    check-cast v4, La/qnr;

    .line 159
    .line 160
    sget-object v44, La/dja;->f:La/dja;

    .line 161
    .line 162
    const v53, -0x2000001

    .line 163
    .line 164
    .line 165
    const v54, 0x7fdbf

    .line 166
    .line 167
    .line 168
    const-wide/16 v5, 0x0

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    const/4 v8, 0x0

    .line 172
    const/4 v9, 0x0

    .line 173
    const-wide/16 v10, 0x0

    .line 174
    .line 175
    const-wide/16 v12, 0x0

    .line 176
    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const/16 v18, 0x0

    .line 184
    .line 185
    const/16 v19, 0x0

    .line 186
    .line 187
    const/16 v20, 0x0

    .line 188
    .line 189
    const/16 v21, 0x0

    .line 190
    .line 191
    const/16 v22, 0x0

    .line 192
    .line 193
    const/16 v23, 0x0

    .line 194
    .line 195
    const/16 v24, 0x0

    .line 196
    .line 197
    const/16 v25, 0x0

    .line 198
    .line 199
    const/16 v26, 0x0

    .line 200
    .line 201
    const/16 v27, 0x0

    .line 202
    .line 203
    const/16 v28, 0x0

    .line 204
    .line 205
    const/16 v29, 0x0

    .line 206
    .line 207
    const/16 v30, 0x1

    .line 208
    .line 209
    const/16 v31, 0x0

    .line 210
    .line 211
    const/16 v32, 0x0

    .line 212
    .line 213
    const/16 v33, 0x0

    .line 214
    .line 215
    const/16 v34, 0x0

    .line 216
    .line 217
    const/16 v35, 0x0

    .line 218
    .line 219
    const/16 v36, 0x0

    .line 220
    .line 221
    const/16 v37, 0x0

    .line 222
    .line 223
    const/16 v38, 0x0

    .line 224
    .line 225
    const/16 v39, 0x0

    .line 226
    .line 227
    const/16 v40, 0x0

    .line 228
    .line 229
    iget-object v0, v0, La/epr;->b:La/fsr;

    .line 230
    .line 231
    const/16 v42, 0x0

    .line 232
    .line 233
    const/16 v43, 0x0

    .line 234
    .line 235
    const/16 v45, 0x0

    .line 236
    .line 237
    const/16 v46, 0x0

    .line 238
    .line 239
    const/16 v47, 0x0

    .line 240
    .line 241
    const/16 v48, 0x0

    .line 242
    .line 243
    const/16 v49, 0x0

    .line 244
    .line 245
    const/16 v50, 0x0

    .line 246
    .line 247
    const/16 v51, 0x0

    .line 248
    .line 249
    const/16 v52, 0x0

    .line 250
    .line 251
    move-object/from16 v41, v0

    .line 252
    .line 253
    invoke-static/range {v4 .. v54}, La/qnr;->a(La/qnr;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;ZII)La/qnr;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget-object v1, v3, La/spr;->o:La/vzg0;

    .line 258
    .line 259
    iget-object v3, v0, La/qnr;->P:La/dja;

    .line 260
    .line 261
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
