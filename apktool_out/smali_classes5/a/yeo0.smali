.class public final synthetic La/yeo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bzt;

.field public final synthetic c:La/luu;

.field public final synthetic d:I

.field public final synthetic e:La/r9u;


# direct methods
.method public synthetic constructor <init>(La/bzt;La/luu;ILa/r9u;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/yeo0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yeo0;->b:La/bzt;

    iput-object p2, p0, La/yeo0;->c:La/luu;

    iput p3, p0, La/yeo0;->d:I

    iput-object p4, p0, La/yeo0;->e:La/r9u;

    return-void
.end method

.method public synthetic constructor <init>(La/luu;La/bzt;ILa/r9u;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/yeo0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yeo0;->c:La/luu;

    iput-object p2, p0, La/yeo0;->b:La/bzt;

    iput p3, p0, La/yeo0;->d:I

    iput-object p4, p0, La/yeo0;->e:La/r9u;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yeo0;->a:B

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    const-string v4, "SPORT_ID_KEY"

    .line 8
    .line 9
    const-string v5, "EVENT_ID_KEY"

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, v0, La/yeo0;->e:La/r9u;

    .line 13
    .line 14
    iget v8, v0, La/yeo0;->d:I

    .line 15
    .line 16
    iget-object v9, v0, La/yeo0;->c:La/luu;

    .line 17
    .line 18
    iget-object v0, v0, La/yeo0;->b:La/bzt;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/vzg0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, La/bzt;->a:La/fsd;

    .line 31
    .line 32
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v9, v9, La/luu;->a:La/nok0;

    .line 37
    .line 38
    invoke-virtual {v9}, La/nok0;->a()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-eqz v10, :cond_1

    .line 51
    .line 52
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    move-object v11, v10

    .line 57
    check-cast v11, La/lok0;

    .line 58
    .line 59
    iget v11, v11, La/lok0;->a:I

    .line 60
    .line 61
    if-ne v11, v8, :cond_0

    .line 62
    .line 63
    move-object v6, v10

    .line 64
    :cond_1
    check-cast v6, La/lok0;

    .line 65
    .line 66
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-static {v1, v5, v8}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    iget-wide v2, v6, La/lok0;->f:J

    .line 83
    .line 84
    :cond_2
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v1, v4, v2}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v11

    .line 98
    new-instance v2, La/wcr0;

    .line 99
    .line 100
    const-string v3, "CURRENT_POS_KEY"

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v1, v3, v5}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    sget-object v5, La/iun;->a:La/iun;

    .line 118
    .line 119
    invoke-direct {v2, v3, v5}, La/wcr0;-><init>(ILjava/util/List;)V

    .line 120
    .line 121
    .line 122
    new-instance v3, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 123
    .line 124
    const-string v5, ""

    .line 125
    .line 126
    invoke-direct {v3, v5, v4}, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;-><init>(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    const-string v4, "SEARCH_MODEL_KEY"

    .line 130
    .line 131
    invoke-static {v1, v4, v3}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    move-object v14, v1

    .line 136
    check-cast v14, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 137
    .line 138
    new-instance v15, La/qar0;

    .line 139
    .line 140
    sget-object v1, La/par0;->a:La/par0;

    .line 141
    .line 142
    iget v0, v0, La/v8d;->r:I

    .line 143
    .line 144
    invoke-direct {v15, v1, v0}, La/qar0;-><init>(La/par0;I)V

    .line 145
    .line 146
    .line 147
    sget-object v0, La/ygp;->t:La/ygp;

    .line 148
    .line 149
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v1, v7, La/r9u;->a:La/j1q0;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 158
    .line 159
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 160
    .line 161
    .line 162
    move-result v17

    .line 163
    new-instance v8, La/dbr0;

    .line 164
    .line 165
    const/4 v10, 0x0

    .line 166
    const/4 v13, 0x1

    .line 167
    move-object/from16 v16, v2

    .line 168
    .line 169
    invoke-direct/range {v8 .. v17}, La/dbr0;-><init>(IZJZLorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;La/qar0;La/wcr0;Z)V

    .line 170
    .line 171
    .line 172
    return-object v8

    .line 173
    :pswitch_0
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, La/vzg0;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    iget-object v9, v9, La/luu;->a:La/nok0;

    .line 181
    .line 182
    invoke-virtual {v9}, La/nok0;->a()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    :cond_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-eqz v10, :cond_4

    .line 195
    .line 196
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    move-object v11, v10

    .line 201
    check-cast v11, La/lok0;

    .line 202
    .line 203
    iget v11, v11, La/lok0;->a:I

    .line 204
    .line 205
    if-ne v11, v8, :cond_3

    .line 206
    .line 207
    move-object v6, v10

    .line 208
    :cond_4
    check-cast v6, La/lok0;

    .line 209
    .line 210
    iget-object v0, v0, La/bzt;->a:La/fsd;

    .line 211
    .line 212
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v9, La/keo0;

    .line 217
    .line 218
    sget-object v11, La/iun;->a:La/iun;

    .line 219
    .line 220
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    invoke-static {v1, v5, v8}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    check-cast v5, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v16

    .line 234
    if-eqz v6, :cond_5

    .line 235
    .line 236
    iget-wide v2, v6, La/lok0;->f:J

    .line 237
    .line 238
    :cond_5
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-static {v1, v4, v2}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    check-cast v1, Ljava/lang/Number;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 249
    .line 250
    .line 251
    move-result-wide v17

    .line 252
    sget-object v1, La/ygp;->t:La/ygp;

    .line 253
    .line 254
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-object v2, v7, La/r9u;->a:La/j1q0;

    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 263
    .line 264
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 265
    .line 266
    .line 267
    move-result v19

    .line 268
    iget v0, v0, La/v8d;->r:I

    .line 269
    .line 270
    const/4 v10, -0x1

    .line 271
    const-string v13, ""

    .line 272
    .line 273
    const/4 v14, 0x1

    .line 274
    const/4 v15, 0x0

    .line 275
    move-object v12, v11

    .line 276
    move/from16 v20, v0

    .line 277
    .line 278
    invoke-direct/range {v9 .. v20}, La/keo0;-><init>(ILjava/util/List;Ljava/util/List;Ljava/lang/String;ZIIJZI)V

    .line 279
    .line 280
    .line 281
    return-object v9

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
