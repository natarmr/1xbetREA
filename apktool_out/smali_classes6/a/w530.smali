.class public final synthetic La/w530;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b630;


# direct methods
.method public synthetic constructor <init>(La/b630;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w530;->a:B

    iput-object p1, p0, La/w530;->b:La/b630;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w530;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-wide/16 v4, 0xc71

    .line 8
    .line 9
    const-string v6, "action"

    .line 10
    .line 11
    const-string v7, "bet_game_market_set_clear"

    .line 12
    .line 13
    iget-object v0, v0, La/w530;->b:La/b630;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v1, La/b630;->m2:La/htz;

    .line 19
    .line 20
    invoke-virtual {v0}, La/b630;->T0()La/e730;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, v0, La/e730;->k:La/s31;

    .line 25
    .line 26
    sget-object v2, La/v530;->a:[La/v530;

    .line 27
    .line 28
    iget-object v1, v1, La/s31;->a:La/kt2;

    .line 29
    .line 30
    const-string v2, "cancel"

    .line 31
    .line 32
    invoke-static {v6, v2, v1, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/e730;->n:La/zr1;

    .line 36
    .line 37
    sget-object v1, La/d630;->a:[La/d630;

    .line 38
    .line 39
    iget-object v0, v0, La/zr1;->a:La/s1p;

    .line 40
    .line 41
    invoke-static {v2, v0, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    sget-object v1, La/b630;->m2:La/htz;

    .line 48
    .line 49
    invoke-virtual {v0}, La/b630;->T0()La/e730;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, v0, La/e730;->k:La/s31;

    .line 54
    .line 55
    sget-object v8, La/v530;->a:[La/v530;

    .line 56
    .line 57
    iget-object v1, v1, La/s31;->a:La/kt2;

    .line 58
    .line 59
    const-string v8, "clear"

    .line 60
    .line 61
    invoke-static {v6, v8, v1, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, v0, La/e730;->n:La/zr1;

    .line 65
    .line 66
    sget-object v6, La/d630;->a:[La/d630;

    .line 67
    .line 68
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 69
    .line 70
    new-instance v6, La/j1p;

    .line 71
    .line 72
    invoke-direct {v6, v8, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v6}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v1, v3, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    new-instance v7, La/du20;

    .line 87
    .line 88
    iget-object v9, v0, La/e730;->j:La/duj;

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    const/16 v14, 0x11

    .line 92
    .line 93
    const/4 v8, 0x1

    .line 94
    const-class v10, La/duj;

    .line 95
    .line 96
    const-string v11, "handleError"

    .line 97
    .line 98
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 99
    .line 100
    invoke-direct/range {v7 .. v14}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 101
    .line 102
    .line 103
    new-instance v10, La/a730;

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    invoke-direct {v10, v0, v2, v1}, La/a730;-><init>(La/e730;La/yje;B)V

    .line 107
    .line 108
    .line 109
    const/16 v11, 0xe

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_1
    sget-object v1, La/b630;->m2:La/htz;

    .line 120
    .line 121
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_2
    sget-object v1, La/b630;->m2:La/htz;

    .line 134
    .line 135
    invoke-virtual {v0}, La/b630;->T0()La/e730;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, La/e730;->w()V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_3
    sget-object v1, La/b630;->m2:La/htz;

    .line 146
    .line 147
    new-instance v4, La/t530;

    .line 148
    .line 149
    new-instance v5, La/x530;

    .line 150
    .line 151
    invoke-direct {v5, v0, v3}, La/x530;-><init>(La/b630;B)V

    .line 152
    .line 153
    .line 154
    new-instance v6, La/du20;

    .line 155
    .line 156
    invoke-virtual {v0}, La/b630;->T0()La/e730;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x5

    .line 162
    const/4 v7, 0x1

    .line 163
    const-class v17, La/e730;

    .line 164
    .line 165
    const-string v10, "onActionClicked"

    .line 166
    .line 167
    const-string v11, "onActionClicked(Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/SettingActionType;)V"

    .line 168
    .line 169
    move-object/from16 v9, v17

    .line 170
    .line 171
    invoke-direct/range {v6 .. v13}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 172
    .line 173
    .line 174
    new-instance v7, La/du20;

    .line 175
    .line 176
    invoke-virtual {v0}, La/b630;->T0()La/e730;

    .line 177
    .line 178
    .line 179
    move-result-object v16

    .line 180
    const/16 v20, 0x0

    .line 181
    .line 182
    const/16 v21, 0x6

    .line 183
    .line 184
    const/4 v15, 0x1

    .line 185
    const-string v18, "onMarketClicked"

    .line 186
    .line 187
    const-string v19, "onMarketClicked(Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/MarketSettingUiModel;)V"

    .line 188
    .line 189
    move-object v14, v7

    .line 190
    invoke-direct/range {v14 .. v21}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 191
    .line 192
    .line 193
    new-instance v8, La/e000;

    .line 194
    .line 195
    invoke-virtual {v0}, La/b630;->T0()La/e730;

    .line 196
    .line 197
    .line 198
    move-result-object v16

    .line 199
    const/16 v21, 0x14

    .line 200
    .line 201
    const/4 v15, 0x2

    .line 202
    const-string v18, "onItemMoved"

    .line 203
    .line 204
    const-string v19, "onItemMoved(II)V"

    .line 205
    .line 206
    move-object v14, v8

    .line 207
    invoke-direct/range {v14 .. v21}, La/e000;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 208
    .line 209
    .line 210
    new-instance v9, La/o0t;

    .line 211
    .line 212
    invoke-virtual {v0}, La/b630;->T0()La/e730;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    const/16 v21, 0x15

    .line 217
    .line 218
    const/4 v15, 0x0

    .line 219
    const-string v18, "onMarketsPositionChanged"

    .line 220
    .line 221
    const-string v19, "onMarketsPositionChanged()V"

    .line 222
    .line 223
    move-object v14, v9

    .line 224
    invoke-direct/range {v14 .. v21}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 225
    .line 226
    .line 227
    invoke-direct/range {v4 .. v9}, La/t530;-><init>(La/x530;La/du20;La/du20;La/e000;La/o0t;)V

    .line 228
    .line 229
    .line 230
    return-object v4

    .line 231
    :pswitch_4
    sget-object v1, La/b630;->m2:La/htz;

    .line 232
    .line 233
    new-instance v1, La/wx6;

    .line 234
    .line 235
    iget-object v0, v0, La/b630;->l2:La/a8z;

    .line 236
    .line 237
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, La/t530;

    .line 242
    .line 243
    invoke-direct {v1, v0}, La/wx6;-><init>(La/t530;)V

    .line 244
    .line 245
    .line 246
    return-object v1

    .line 247
    :pswitch_5
    sget-object v1, La/b630;->m2:La/htz;

    .line 248
    .line 249
    iget-object v0, v0, La/b630;->c2:La/fiu0;

    .line 250
    .line 251
    if-eqz v0, :cond_0

    .line 252
    .line 253
    return-object v0

    .line 254
    :cond_0
    const-string v0, "viewModelFactory"

    .line 255
    .line 256
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v2

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
