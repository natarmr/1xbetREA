.class public final synthetic La/mrc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qrc0;


# direct methods
.method public synthetic constructor <init>(La/qrc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mrc0;->a:B

    iput-object p1, p0, La/mrc0;->b:La/qrc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mrc0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x19

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/mrc0;->b:La/qrc0;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of v4, v1, La/zhi0;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-object v2, v0, La/qrc0;->C:La/x20;

    .line 25
    .line 26
    iget-object v4, v0, La/qrc0;->F:La/ctf0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, La/zqc0;

    .line 33
    .line 34
    iget-object v5, v5, La/zqc0;->e:La/vrc0;

    .line 35
    .line 36
    invoke-interface {v5}, La/vrc0;->getId()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    move-object v7, v1

    .line 41
    check-cast v7, La/zhi0;

    .line 42
    .line 43
    iget v7, v7, La/zhi0;->a:I

    .line 44
    .line 45
    iget-object v2, v2, La/x20;->a:La/s1p;

    .line 46
    .line 47
    new-instance v8, La/i1p;

    .line 48
    .line 49
    const/4 v9, 0x2

    .line 50
    invoke-direct {v8, v9, v5, v6}, La/i1p;-><init>(BJ)V

    .line 51
    .line 52
    .line 53
    new-instance v5, La/i1p;

    .line 54
    .line 55
    invoke-direct {v5, v7, v3}, La/i1p;-><init>(IB)V

    .line 56
    .line 57
    .line 58
    new-array v6, v9, [La/k1p;

    .line 59
    .line 60
    aput-object v8, v6, v3

    .line 61
    .line 62
    const/4 v8, 0x1

    .line 63
    aput-object v5, v6, v8

    .line 64
    .line 65
    invoke-static {v6}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const-wide/16 v8, 0xcec

    .line 70
    .line 71
    invoke-virtual {v2, v5, v8, v9}, La/s1p;->a(Ljava/util/Set;J)V

    .line 72
    .line 73
    .line 74
    iget-object v2, v0, La/qrc0;->D:La/b4j;

    .line 75
    .line 76
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, La/zqc0;

    .line 81
    .line 82
    iget-object v5, v5, La/zqc0;->e:La/vrc0;

    .line 83
    .line 84
    invoke-interface {v5}, La/vrc0;->getId()J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    new-instance v6, Lkotlin/Pair;

    .line 96
    .line 97
    const-string v8, "promo_id"

    .line 98
    .line 99
    invoke-direct {v6, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    filled-new-array {v6}, [Lkotlin/Pair;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-static {v5}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    if-eqz v7, :cond_0

    .line 111
    .line 112
    const-string v6, "error_code"

    .line 113
    .line 114
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :cond_0
    iget-object v2, v2, La/b4j;->a:La/kt2;

    .line 122
    .line 123
    const-string v6, "promo_buy_error"

    .line 124
    .line 125
    invoke-static {v5}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v2, v6, v5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    if-eqz v9, :cond_2

    .line 137
    .line 138
    new-instance v1, La/uqc0;

    .line 139
    .line 140
    new-array v2, v3, [Ljava/lang/Object;

    .line 141
    .line 142
    iget-object v5, v4, La/ctf0;->b:La/lsm0;

    .line 143
    .line 144
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    const v6, 0x7f1307bb

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    new-array v2, v3, [Ljava/lang/Object;

    .line 156
    .line 157
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 158
    .line 159
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const v3, 0x7f130e5c

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    sget-object v16, La/n12;->b:La/n12;

    .line 171
    .line 172
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const/16 v18, 0x5d8

    .line 177
    .line 178
    const/4 v11, 0x0

    .line 179
    const/4 v12, 0x0

    .line 180
    const-string v13, "SHOW_ERROR_DIALOG_REQUEST_KEY"

    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 185
    .line 186
    .line 187
    invoke-direct {v1, v7}, La/uqc0;-><init>(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_1
    iget-object v3, v0, La/qrc0;->E:La/duj;

    .line 195
    .line 196
    new-instance v4, La/r7a0;

    .line 197
    .line 198
    invoke-direct {v4, v1, v0, v2}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    :cond_2
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_0
    move-object/from16 v1, p1

    .line 208
    .line 209
    check-cast v1, Ljava/lang/Throwable;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v2, v0, La/qrc0;->E:La/duj;

    .line 215
    .line 216
    new-instance v4, La/nrc0;

    .line 217
    .line 218
    invoke-direct {v4, v0, v3}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_1
    move-object/from16 v1, p1

    .line 228
    .line 229
    check-cast v1, Ljava/lang/Throwable;

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-object v0, v0, La/qrc0;->E:La/duj;

    .line 235
    .line 236
    new-instance v2, La/t4c0;

    .line 237
    .line 238
    const/16 v3, 0x1a

    .line 239
    .line 240
    invoke-direct {v2, v3}, La/t4c0;-><init>(B)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_2
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, Ljava/lang/Throwable;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v3, v0, La/qrc0;->E:La/duj;

    .line 257
    .line 258
    new-instance v4, La/r7a0;

    .line 259
    .line 260
    invoke-direct {v4, v1, v0, v2}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
