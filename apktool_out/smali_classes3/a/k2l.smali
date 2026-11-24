.class public final La/k2l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k2l;->a:B

    iput-object p1, p0, La/k2l;->b:La/cp;

    iput-object p2, p0, La/k2l;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/vux;

    .line 18
    .line 19
    iget-object v0, v0, La/vux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/fwr;

    .line 26
    .line 27
    iget-object v1, v1, La/fwr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/vux;

    .line 33
    .line 34
    iget-object v0, p1, La/vux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/fwr;

    .line 41
    .line 42
    iget-object v2, v1, La/fwr;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setInformation(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, La/fwr;->e:La/p5h0;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setScoreModel(La/p5h0;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, La/fwr;->f:La/zvr;

    .line 53
    .line 54
    iget-object v3, v2, La/zvr;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerName(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-object v3, v2, La/zvr;->b:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerCards(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v2, La/zvr;->c:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerCombination(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v1, La/fwr;->g:La/cwr;

    .line 70
    .line 71
    iget-object v3, v2, La/cwr;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerName(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    iget-object v3, v2, La/cwr;->b:Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerCards(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v2, La/cwr;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerCombination(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, v1, La/fwr;->h:Ljava/util/List;

    .line 87
    .line 88
    invoke-static {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->v(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    iget-object v2, v1, La/fwr;->i:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setBottomInfo(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v1, La/fwr;->j:La/fus;

    .line 97
    .line 98
    invoke-static {v0, v2}, La/obb;->J(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;La/fus;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, v1, La/fwr;->k:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setCaption(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p1, La/vux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 107
    .line 108
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, La/fwr;

    .line 113
    .line 114
    iget-object p0, p0, La/fwr;->c:La/qtr;

    .line 115
    .line 116
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_2

    .line 120
    .line 121
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_1

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    check-cast v1, Ljava/util/Collection;

    .line 144
    .line 145
    check-cast v1, Ljava/lang/Iterable;

    .line 146
    .line 147
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_e

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, La/hur;

    .line 166
    .line 167
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 168
    .line 169
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 170
    .line 171
    check-cast v1, La/vux;

    .line 172
    .line 173
    if-nez v0, :cond_3

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_3
    instance-of v2, v0, La/cur;

    .line 177
    .line 178
    if-eqz v2, :cond_4

    .line 179
    .line 180
    iget-object v1, v1, La/vux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 181
    .line 182
    check-cast v0, La/cur;

    .line 183
    .line 184
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_4
    instance-of v2, v0, La/ewr;

    .line 189
    .line 190
    if-eqz v2, :cond_d

    .line 191
    .line 192
    iget-object v1, v1, La/vux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;

    .line 193
    .line 194
    check-cast v0, La/ewr;

    .line 195
    .line 196
    instance-of v2, v0, La/wvr;

    .line 197
    .line 198
    if-eqz v2, :cond_5

    .line 199
    .line 200
    check-cast v0, La/wvr;

    .line 201
    .line 202
    iget-object v0, v0, La/wvr;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setBottomInfo(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_5
    instance-of v2, v0, La/yvr;

    .line 209
    .line 210
    if-eqz v2, :cond_6

    .line 211
    .line 212
    check-cast v0, La/yvr;

    .line 213
    .line 214
    iget-object v0, v0, La/yvr;->a:Ljava/util/List;

    .line 215
    .line 216
    invoke-static {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->v(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;Ljava/util/List;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_6
    instance-of v2, v0, La/awr;

    .line 221
    .line 222
    if-eqz v2, :cond_7

    .line 223
    .line 224
    check-cast v0, La/awr;

    .line 225
    .line 226
    iget-object v0, v0, La/awr;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setInformation(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_7
    instance-of v2, v0, La/bwr;

    .line 233
    .line 234
    if-eqz v2, :cond_8

    .line 235
    .line 236
    check-cast v0, La/bwr;

    .line 237
    .line 238
    iget-object v0, v0, La/bwr;->a:La/p5h0;

    .line 239
    .line 240
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setScoreModel(La/p5h0;)V

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_8
    instance-of v2, v0, La/zvr;

    .line 245
    .line 246
    if-eqz v2, :cond_9

    .line 247
    .line 248
    check-cast v0, La/zvr;

    .line 249
    .line 250
    iget-object v2, v0, La/zvr;->a:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerName(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    iget-object v2, v0, La/zvr;->b:Ljava/util/List;

    .line 256
    .line 257
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerCards(Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    iget-object v0, v0, La/zvr;->c:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerCombination(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_9
    instance-of v2, v0, La/cwr;

    .line 267
    .line 268
    if-eqz v2, :cond_a

    .line 269
    .line 270
    check-cast v0, La/cwr;

    .line 271
    .line 272
    iget-object v2, v0, La/cwr;->a:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerName(Ljava/lang/CharSequence;)V

    .line 275
    .line 276
    .line 277
    iget-object v2, v0, La/cwr;->b:Ljava/util/List;

    .line 278
    .line 279
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerCards(Ljava/util/List;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, v0, La/cwr;->c:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerCombination(Ljava/lang/CharSequence;)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :cond_a
    instance-of v2, v0, La/dwr;

    .line 290
    .line 291
    if-eqz v2, :cond_b

    .line 292
    .line 293
    check-cast v0, La/dwr;

    .line 294
    .line 295
    iget-object v0, v0, La/dwr;->a:La/fus;

    .line 296
    .line 297
    invoke-static {v1, v0}, La/obb;->J(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;La/fus;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_1

    .line 301
    .line 302
    :cond_b
    instance-of v2, v0, La/xvr;

    .line 303
    .line 304
    if-eqz v2, :cond_c

    .line 305
    .line 306
    check-cast v0, La/xvr;

    .line 307
    .line 308
    iget-object v0, v0, La/xvr;->a:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setCaption(Ljava/lang/CharSequence;)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 316
    .line 317
    .line 318
    const/4 p0, 0x0

    .line 319
    return-object p0

    .line 320
    :cond_d
    instance-of v2, v0, La/ptr;

    .line 321
    .line 322
    if-eqz v2, :cond_2

    .line 323
    .line 324
    iget-object v1, v1, La/vux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 325
    .line 326
    check-cast v0, La/ptr;

    .line 327
    .line 328
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_1

    .line 332
    .line 333
    :cond_e
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object p0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/wux;

    .line 18
    .line 19
    iget-object v0, v0, La/wux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/nwr;

    .line 26
    .line 27
    iget-object v1, v1, La/nwr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/wux;

    .line 33
    .line 34
    iget-object v0, p1, La/wux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/nwr;

    .line 41
    .line 42
    iget-object v2, v1, La/nwr;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setInformation(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, La/nwr;->e:La/p5h0;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setScoreModel(La/p5h0;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, La/nwr;->f:La/hwr;

    .line 53
    .line 54
    iget-object v3, v2, La/hwr;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setPlayerName(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-object v3, v2, La/hwr;->b:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setPlayer1RowCards(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v2, La/hwr;->c:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setPlayer2RowCards(Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v1, La/nwr;->g:La/lwr;

    .line 70
    .line 71
    iget-object v3, v2, La/lwr;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setDealerName(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    iget-object v3, v2, La/lwr;->b:Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setDealer1RowCards(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v2, La/lwr;->c:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setDealer2RowCards(Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v1, La/nwr;->h:La/iwr;

    .line 87
    .line 88
    iget-object v1, v1, La/iwr;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setWinInformation(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p1, La/wux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 94
    .line 95
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/nwr;

    .line 100
    .line 101
    iget-object p0, p0, La/nwr;->c:La/qtr;

    .line 102
    .line 103
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_1

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    check-cast v1, Ljava/util/Collection;

    .line 131
    .line 132
    check-cast v1, Ljava/lang/Iterable;

    .line 133
    .line 134
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_b

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, La/hur;

    .line 153
    .line 154
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 155
    .line 156
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 157
    .line 158
    check-cast v1, La/wux;

    .line 159
    .line 160
    if-nez v0, :cond_3

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    instance-of v2, v0, La/cur;

    .line 164
    .line 165
    if-eqz v2, :cond_4

    .line 166
    .line 167
    iget-object v1, v1, La/wux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 168
    .line 169
    check-cast v0, La/cur;

    .line 170
    .line 171
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_4
    instance-of v2, v0, La/mwr;

    .line 176
    .line 177
    if-eqz v2, :cond_a

    .line 178
    .line 179
    iget-object v1, v1, La/wux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;

    .line 180
    .line 181
    check-cast v0, La/mwr;

    .line 182
    .line 183
    instance-of v2, v0, La/jwr;

    .line 184
    .line 185
    if-eqz v2, :cond_5

    .line 186
    .line 187
    check-cast v0, La/jwr;

    .line 188
    .line 189
    iget-object v0, v0, La/jwr;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setInformation(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_5
    instance-of v2, v0, La/kwr;

    .line 196
    .line 197
    if-eqz v2, :cond_6

    .line 198
    .line 199
    check-cast v0, La/kwr;

    .line 200
    .line 201
    iget-object v0, v0, La/kwr;->a:La/p5h0;

    .line 202
    .line 203
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setScoreModel(La/p5h0;)V

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_6
    instance-of v2, v0, La/hwr;

    .line 208
    .line 209
    if-eqz v2, :cond_7

    .line 210
    .line 211
    check-cast v0, La/hwr;

    .line 212
    .line 213
    iget-object v2, v0, La/hwr;->a:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setPlayerName(Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    iget-object v2, v0, La/hwr;->b:Ljava/util/List;

    .line 219
    .line 220
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setPlayer1RowCards(Ljava/util/List;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v0, La/hwr;->c:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setPlayer2RowCards(Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_7
    instance-of v2, v0, La/lwr;

    .line 230
    .line 231
    if-eqz v2, :cond_8

    .line 232
    .line 233
    check-cast v0, La/lwr;

    .line 234
    .line 235
    iget-object v2, v0, La/lwr;->a:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setDealerName(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    iget-object v2, v0, La/lwr;->b:Ljava/util/List;

    .line 241
    .line 242
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setDealer1RowCards(Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    iget-object v0, v0, La/lwr;->c:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setDealer2RowCards(Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_8
    instance-of v2, v0, La/iwr;

    .line 252
    .line 253
    if-eqz v2, :cond_9

    .line 254
    .line 255
    check-cast v0, La/iwr;

    .line 256
    .line 257
    iget-object v0, v0, La/iwr;->a:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->setWinInformation(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    goto :goto_1

    .line 263
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 264
    .line 265
    .line 266
    const/4 p0, 0x0

    .line 267
    return-object p0

    .line 268
    :cond_a
    instance-of v2, v0, La/ptr;

    .line 269
    .line 270
    if-eqz v2, :cond_2

    .line 271
    .line 272
    iget-object v1, v1, La/wux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 273
    .line 274
    check-cast v0, La/ptr;

    .line 275
    .line 276
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_b
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/xux;

    .line 18
    .line 19
    iget-object v0, v0, La/xux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/vwr;

    .line 26
    .line 27
    iget-object v1, v1, La/vwr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/xux;

    .line 33
    .line 34
    iget-object v0, p1, La/xux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/vwr;

    .line 41
    .line 42
    iget-object v2, v1, La/vwr;->i:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setInformation(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, La/vwr;->e:La/p5h0;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setScoreModel(La/p5h0;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, La/vwr;->f:La/owr;

    .line 53
    .line 54
    iget-object v3, v2, La/owr;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerOneName(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-object v3, v2, La/owr;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerOneCombination(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v2, La/owr;->b:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerOneDice(Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v1, La/vwr;->g:La/swr;

    .line 70
    .line 71
    iget-object v3, v2, La/swr;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerTwoName(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    iget-object v3, v2, La/swr;->c:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerTwoCombination(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v2, La/swr;->b:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerTwoDice(Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, v1, La/vwr;->d:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setGameLabel(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, v1, La/vwr;->h:La/fus;

    .line 92
    .line 93
    invoke-static {v0, v1}, La/acb;->K(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;La/fus;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, La/xux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 97
    .line 98
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/vwr;

    .line 103
    .line 104
    iget-object p0, p0, La/vwr;->c:La/qtr;

    .line 105
    .line 106
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_2

    .line 110
    .line 111
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_1

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast v1, Ljava/util/Collection;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/Iterable;

    .line 136
    .line 137
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_c

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, La/hur;

    .line 156
    .line 157
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 158
    .line 159
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 160
    .line 161
    check-cast v1, La/xux;

    .line 162
    .line 163
    if-nez v0, :cond_3

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_3
    instance-of v2, v0, La/cur;

    .line 167
    .line 168
    if-eqz v2, :cond_4

    .line 169
    .line 170
    iget-object v1, v1, La/xux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 171
    .line 172
    check-cast v0, La/cur;

    .line 173
    .line 174
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    instance-of v2, v0, La/uwr;

    .line 179
    .line 180
    if-eqz v2, :cond_b

    .line 181
    .line 182
    iget-object v1, v1, La/xux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;

    .line 183
    .line 184
    check-cast v0, La/uwr;

    .line 185
    .line 186
    instance-of v2, v0, La/qwr;

    .line 187
    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    check-cast v0, La/qwr;

    .line 191
    .line 192
    iget-object v0, v0, La/qwr;->a:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setInformation(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_5
    instance-of v2, v0, La/rwr;

    .line 199
    .line 200
    if-eqz v2, :cond_6

    .line 201
    .line 202
    check-cast v0, La/rwr;

    .line 203
    .line 204
    iget-object v0, v0, La/rwr;->a:La/p5h0;

    .line 205
    .line 206
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setScoreModel(La/p5h0;)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_6
    instance-of v2, v0, La/owr;

    .line 211
    .line 212
    if-eqz v2, :cond_7

    .line 213
    .line 214
    check-cast v0, La/owr;

    .line 215
    .line 216
    iget-object v2, v0, La/owr;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerOneName(Ljava/lang/CharSequence;)V

    .line 219
    .line 220
    .line 221
    iget-object v2, v0, La/owr;->c:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerOneCombination(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v0, La/owr;->b:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerOneDice(Ljava/util/List;)V

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_7
    instance-of v2, v0, La/swr;

    .line 233
    .line 234
    if-eqz v2, :cond_8

    .line 235
    .line 236
    check-cast v0, La/swr;

    .line 237
    .line 238
    iget-object v2, v0, La/swr;->a:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerTwoName(Ljava/lang/CharSequence;)V

    .line 241
    .line 242
    .line 243
    iget-object v2, v0, La/swr;->c:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerTwoCombination(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v0, La/swr;->b:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setPlayerTwoDice(Ljava/util/List;)V

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_8
    instance-of v2, v0, La/pwr;

    .line 255
    .line 256
    if-eqz v2, :cond_9

    .line 257
    .line 258
    check-cast v0, La/pwr;

    .line 259
    .line 260
    iget-object v0, v0, La/pwr;->a:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->setGameLabel(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_9
    instance-of v2, v0, La/twr;

    .line 267
    .line 268
    if-eqz v2, :cond_a

    .line 269
    .line 270
    check-cast v0, La/twr;

    .line 271
    .line 272
    iget-object v0, v0, La/twr;->a:La/fus;

    .line 273
    .line 274
    invoke-static {v1, v0}, La/acb;->K(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;La/fus;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_1

    .line 278
    .line 279
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 280
    .line 281
    .line 282
    const/4 p0, 0x0

    .line 283
    return-object p0

    .line 284
    :cond_b
    instance-of v2, v0, La/ptr;

    .line 285
    .line 286
    if-eqz v2, :cond_2

    .line 287
    .line 288
    iget-object v1, v1, La/xux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 289
    .line 290
    check-cast v0, La/ptr;

    .line 291
    .line 292
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :cond_c
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object p0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/yux;

    .line 18
    .line 19
    iget-object v0, v0, La/yux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/jxr;

    .line 26
    .line 27
    iget-object v1, v1, La/jxr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/yux;

    .line 33
    .line 34
    iget-object v0, p1, La/yux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/jxr;

    .line 41
    .line 42
    iget-object v2, v1, La/jxr;->e:La/p5h0;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->setScoreModel(La/p5h0;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, La/jxr;->f:La/axr;

    .line 48
    .line 49
    invoke-static {v0, v2}, La/jcb;->L(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/axr;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, La/jxr;->g:La/fxr;

    .line 53
    .line 54
    invoke-static {v0, v2}, La/jcb;->O(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/fxr;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v1, La/jxr;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->setGameLabel(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v1, La/jxr;->h:La/ywr;

    .line 63
    .line 64
    invoke-static {v0, v2}, La/jcb;->M(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v1, La/jxr;->i:La/ywr;

    .line 68
    .line 69
    invoke-static {v0, v2}, La/jcb;->P(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, v1, La/jxr;->j:La/ywr;

    .line 73
    .line 74
    invoke-static {v0, v2}, La/jcb;->Q(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v1, La/jxr;->k:La/ywr;

    .line 78
    .line 79
    invoke-static {v0, v2}, La/jcb;->N(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v1, La/jxr;->l:La/ywr;

    .line 83
    .line 84
    invoke-static {v0, v1}, La/jcb;->K(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p1, La/yux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 88
    .line 89
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, La/jxr;

    .line 94
    .line 95
    iget-object p0, p0, La/jxr;->c:La/qtr;

    .line 96
    .line 97
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_1

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    check-cast v1, Ljava/util/Collection;

    .line 125
    .line 126
    check-cast v1, Ljava/lang/Iterable;

    .line 127
    .line 128
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_f

    .line 141
    .line 142
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, La/hur;

    .line 147
    .line 148
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 149
    .line 150
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 151
    .line 152
    check-cast v1, La/yux;

    .line 153
    .line 154
    if-nez v0, :cond_3

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    instance-of v2, v0, La/cur;

    .line 158
    .line 159
    if-eqz v2, :cond_4

    .line 160
    .line 161
    iget-object v1, v1, La/yux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 162
    .line 163
    check-cast v0, La/cur;

    .line 164
    .line 165
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    instance-of v2, v0, La/ixr;

    .line 170
    .line 171
    if-eqz v2, :cond_e

    .line 172
    .line 173
    iget-object v1, v1, La/yux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;

    .line 174
    .line 175
    check-cast v0, La/ixr;

    .line 176
    .line 177
    instance-of v2, v0, La/exr;

    .line 178
    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    check-cast v0, La/exr;

    .line 182
    .line 183
    iget-object v0, v0, La/exr;->a:La/p5h0;

    .line 184
    .line 185
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->setScoreModel(La/p5h0;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_5
    instance-of v2, v0, La/axr;

    .line 190
    .line 191
    if-eqz v2, :cond_6

    .line 192
    .line 193
    check-cast v0, La/axr;

    .line 194
    .line 195
    invoke-static {v1, v0}, La/jcb;->L(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/axr;)V

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_6
    instance-of v2, v0, La/fxr;

    .line 200
    .line 201
    if-eqz v2, :cond_7

    .line 202
    .line 203
    check-cast v0, La/fxr;

    .line 204
    .line 205
    invoke-static {v1, v0}, La/jcb;->O(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/fxr;)V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_7
    instance-of v2, v0, La/dxr;

    .line 210
    .line 211
    if-eqz v2, :cond_8

    .line 212
    .line 213
    check-cast v0, La/dxr;

    .line 214
    .line 215
    iget-object v0, v0, La/dxr;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->setGameLabel(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_8
    instance-of v2, v0, La/bxr;

    .line 222
    .line 223
    if-eqz v2, :cond_9

    .line 224
    .line 225
    check-cast v0, La/bxr;

    .line 226
    .line 227
    iget-object v0, v0, La/bxr;->a:La/ywr;

    .line 228
    .line 229
    invoke-static {v1, v0}, La/jcb;->M(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_9
    instance-of v2, v0, La/gxr;

    .line 234
    .line 235
    if-eqz v2, :cond_a

    .line 236
    .line 237
    check-cast v0, La/gxr;

    .line 238
    .line 239
    iget-object v0, v0, La/gxr;->a:La/ywr;

    .line 240
    .line 241
    invoke-static {v1, v0}, La/jcb;->P(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_a
    instance-of v2, v0, La/hxr;

    .line 246
    .line 247
    if-eqz v2, :cond_b

    .line 248
    .line 249
    check-cast v0, La/hxr;

    .line 250
    .line 251
    iget-object v0, v0, La/hxr;->a:La/ywr;

    .line 252
    .line 253
    invoke-static {v1, v0}, La/jcb;->Q(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 254
    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_b
    instance-of v2, v0, La/cxr;

    .line 258
    .line 259
    if-eqz v2, :cond_c

    .line 260
    .line 261
    check-cast v0, La/cxr;

    .line 262
    .line 263
    iget-object v0, v0, La/cxr;->a:La/ywr;

    .line 264
    .line 265
    invoke-static {v1, v0}, La/jcb;->N(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_1

    .line 269
    .line 270
    :cond_c
    instance-of v2, v0, La/zwr;

    .line 271
    .line 272
    if-eqz v2, :cond_d

    .line 273
    .line 274
    check-cast v0, La/zwr;

    .line 275
    .line 276
    iget-object v0, v0, La/zwr;->a:La/ywr;

    .line 277
    .line 278
    invoke-static {v1, v0}, La/jcb;->K(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;La/ywr;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_1

    .line 282
    .line 283
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 284
    .line 285
    .line 286
    const/4 p0, 0x0

    .line 287
    return-object p0

    .line 288
    :cond_e
    instance-of v2, v0, La/ptr;

    .line 289
    .line 290
    if-eqz v2, :cond_2

    .line 291
    .line 292
    iget-object v1, v1, La/yux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 293
    .line 294
    check-cast v0, La/ptr;

    .line 295
    .line 296
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :cond_f
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/zux;

    .line 18
    .line 19
    iget-object v0, v0, La/zux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/sxr;

    .line 26
    .line 27
    iget-object v1, v1, La/sxr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/zux;

    .line 33
    .line 34
    iget-object v0, p1, La/zux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/sxr;

    .line 41
    .line 42
    iget-object v2, v1, La/sxr;->d:La/oxr;

    .line 43
    .line 44
    iget-object v3, v2, La/oxr;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setInfoText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    iget-wide v3, v2, La/oxr;->c:J

    .line 50
    .line 51
    invoke-virtual {v0, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setGameStartTime(J)V

    .line 52
    .line 53
    .line 54
    iget-boolean v2, v2, La/oxr;->b:Z

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTimerVisible(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v1, La/sxr;->e:La/pxr;

    .line 60
    .line 61
    invoke-static {v0, v2}, La/agc;->D(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/pxr;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v1, La/sxr;->f:La/qxr;

    .line 65
    .line 66
    invoke-static {v0, v2}, La/agc;->E(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/qxr;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v1, La/sxr;->i:La/kxr;

    .line 70
    .line 71
    invoke-static {v0, v2}, La/agc;->A(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/kxr;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, v1, La/sxr;->h:La/lxr;

    .line 75
    .line 76
    invoke-static {v0, v2}, La/agc;->B(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/lxr;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, v1, La/sxr;->g:La/nxr;

    .line 80
    .line 81
    invoke-static {v0, v2}, La/agc;->C(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/nxr;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v1, La/sxr;->j:La/mxr;

    .line 85
    .line 86
    iget-boolean v2, v1, La/mxr;->a:Z

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopGameIndicator(Z)V

    .line 89
    .line 90
    .line 91
    iget-boolean v1, v1, La/mxr;->b:Z

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotGameIndicator(Z)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, La/zux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 97
    .line 98
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/sxr;

    .line 103
    .line 104
    iget-object p0, p0, La/sxr;->c:La/qtr;

    .line 105
    .line 106
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_2

    .line 110
    .line 111
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_1

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast v1, Ljava/util/Collection;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/Iterable;

    .line 136
    .line 137
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_d

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, La/hur;

    .line 156
    .line 157
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 158
    .line 159
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 160
    .line 161
    check-cast v1, La/zux;

    .line 162
    .line 163
    if-nez v0, :cond_3

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_3
    instance-of v2, v0, La/cur;

    .line 167
    .line 168
    if-eqz v2, :cond_4

    .line 169
    .line 170
    iget-object v1, v1, La/zux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 171
    .line 172
    check-cast v0, La/cur;

    .line 173
    .line 174
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    instance-of v2, v0, La/rxr;

    .line 179
    .line 180
    if-eqz v2, :cond_c

    .line 181
    .line 182
    iget-object v1, v1, La/zux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;

    .line 183
    .line 184
    check-cast v0, La/rxr;

    .line 185
    .line 186
    instance-of v2, v0, La/oxr;

    .line 187
    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    check-cast v0, La/oxr;

    .line 191
    .line 192
    iget-object v2, v0, La/oxr;->a:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setInfoText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    iget-wide v2, v0, La/oxr;->c:J

    .line 198
    .line 199
    invoke-virtual {v1, v2, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setGameStartTime(J)V

    .line 200
    .line 201
    .line 202
    iget-boolean v0, v0, La/oxr;->b:Z

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTimerVisible(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_5
    instance-of v2, v0, La/pxr;

    .line 209
    .line 210
    if-eqz v2, :cond_6

    .line 211
    .line 212
    check-cast v0, La/pxr;

    .line 213
    .line 214
    invoke-static {v1, v0}, La/agc;->D(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/pxr;)V

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_6
    instance-of v2, v0, La/qxr;

    .line 219
    .line 220
    if-eqz v2, :cond_7

    .line 221
    .line 222
    check-cast v0, La/qxr;

    .line 223
    .line 224
    invoke-static {v1, v0}, La/agc;->E(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/qxr;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_7
    instance-of v2, v0, La/kxr;

    .line 229
    .line 230
    if-eqz v2, :cond_8

    .line 231
    .line 232
    check-cast v0, La/kxr;

    .line 233
    .line 234
    invoke-static {v1, v0}, La/agc;->A(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/kxr;)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_8
    instance-of v2, v0, La/lxr;

    .line 239
    .line 240
    if-eqz v2, :cond_9

    .line 241
    .line 242
    check-cast v0, La/lxr;

    .line 243
    .line 244
    invoke-static {v1, v0}, La/agc;->B(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/lxr;)V

    .line 245
    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_9
    instance-of v2, v0, La/nxr;

    .line 249
    .line 250
    if-eqz v2, :cond_a

    .line 251
    .line 252
    check-cast v0, La/nxr;

    .line 253
    .line 254
    invoke-static {v1, v0}, La/agc;->C(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/nxr;)V

    .line 255
    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_a
    instance-of v2, v0, La/mxr;

    .line 259
    .line 260
    if-eqz v2, :cond_b

    .line 261
    .line 262
    check-cast v0, La/mxr;

    .line 263
    .line 264
    iget-boolean v2, v0, La/mxr;->a:Z

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopGameIndicator(Z)V

    .line 267
    .line 268
    .line 269
    iget-boolean v0, v0, La/mxr;->b:Z

    .line 270
    .line 271
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotGameIndicator(Z)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 277
    .line 278
    .line 279
    const/4 p0, 0x0

    .line 280
    return-object p0

    .line 281
    :cond_c
    instance-of v2, v0, La/ptr;

    .line 282
    .line 283
    if-eqz v2, :cond_2

    .line 284
    .line 285
    iget-object v1, v1, La/zux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 286
    .line 287
    check-cast v0, La/ptr;

    .line 288
    .line 289
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_1

    .line 293
    .line 294
    :cond_d
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object p0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/avx;

    .line 18
    .line 19
    iget-object v0, v0, La/avx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/zxr;

    .line 26
    .line 27
    iget-object v1, v1, La/zxr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/avx;

    .line 33
    .line 34
    iget-object v0, p1, La/avx;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/zxr;

    .line 41
    .line 42
    iget-object v2, v1, La/zxr;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setInformation(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, La/zxr;->e:La/p5h0;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setScoreModel(La/p5h0;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, La/zxr;->f:La/txr;

    .line 53
    .line 54
    iget-object v3, v2, La/txr;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setPlayerName(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v2, La/txr;->b:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setPlayerCards(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v1, La/zxr;->g:La/xxr;

    .line 65
    .line 66
    iget-object v3, v2, La/xxr;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setBankerName(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v2, La/xxr;->b:La/ah30;

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setBankerCards(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v1, La/zxr;->h:La/uxr;

    .line 77
    .line 78
    iget-object v1, v1, La/uxr;->a:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setBottomInfo(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p1, La/avx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 84
    .line 85
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/zxr;

    .line 90
    .line 91
    iget-object p0, p0, La/zxr;->c:La/qtr;

    .line 92
    .line 93
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast v1, Ljava/util/Collection;

    .line 121
    .line 122
    check-cast v1, Ljava/lang/Iterable;

    .line 123
    .line 124
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_b

    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, La/hur;

    .line 143
    .line 144
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 145
    .line 146
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 147
    .line 148
    check-cast v1, La/avx;

    .line 149
    .line 150
    if-nez v0, :cond_3

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_3
    instance-of v2, v0, La/cur;

    .line 154
    .line 155
    if-eqz v2, :cond_4

    .line 156
    .line 157
    iget-object v1, v1, La/avx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 158
    .line 159
    check-cast v0, La/cur;

    .line 160
    .line 161
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    instance-of v2, v0, La/yxr;

    .line 166
    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    iget-object v1, v1, La/avx;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;

    .line 170
    .line 171
    check-cast v0, La/yxr;

    .line 172
    .line 173
    instance-of v2, v0, La/vxr;

    .line 174
    .line 175
    if-eqz v2, :cond_5

    .line 176
    .line 177
    check-cast v0, La/vxr;

    .line 178
    .line 179
    iget-object v0, v0, La/vxr;->a:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setInformation(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    instance-of v2, v0, La/wxr;

    .line 186
    .line 187
    if-eqz v2, :cond_6

    .line 188
    .line 189
    check-cast v0, La/wxr;

    .line 190
    .line 191
    iget-object v0, v0, La/wxr;->a:La/p5h0;

    .line 192
    .line 193
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setScoreModel(La/p5h0;)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_6
    instance-of v2, v0, La/txr;

    .line 198
    .line 199
    if-eqz v2, :cond_7

    .line 200
    .line 201
    check-cast v0, La/txr;

    .line 202
    .line 203
    iget-object v2, v0, La/txr;->a:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setPlayerName(Ljava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, v0, La/txr;->b:Ljava/util/List;

    .line 209
    .line 210
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setPlayerCards(Ljava/util/List;)V

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_7
    instance-of v2, v0, La/xxr;

    .line 215
    .line 216
    if-eqz v2, :cond_8

    .line 217
    .line 218
    check-cast v0, La/xxr;

    .line 219
    .line 220
    iget-object v2, v0, La/xxr;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setBankerName(Ljava/lang/CharSequence;)V

    .line 223
    .line 224
    .line 225
    iget-object v0, v0, La/xxr;->b:La/ah30;

    .line 226
    .line 227
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setBankerCards(Ljava/util/List;)V

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_8
    instance-of v2, v0, La/uxr;

    .line 232
    .line 233
    if-eqz v2, :cond_9

    .line 234
    .line 235
    check-cast v0, La/uxr;

    .line 236
    .line 237
    iget-object v0, v0, La/uxr;->a:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleBaccarat;->setBottomInfo(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 244
    .line 245
    .line 246
    const/4 p0, 0x0

    .line 247
    return-object p0

    .line 248
    :cond_a
    instance-of v2, v0, La/ptr;

    .line 249
    .line 250
    if-eqz v2, :cond_2

    .line 251
    .line 252
    iget-object v1, v1, La/avx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 253
    .line 254
    check-cast v0, La/ptr;

    .line 255
    .line 256
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 257
    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_b
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/bvx;

    .line 18
    .line 19
    iget-object v0, v0, La/bvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/fyr;

    .line 26
    .line 27
    iget-object v1, v1, La/fyr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/bvx;

    .line 33
    .line 34
    iget-object v0, p1, La/bvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/fyr;

    .line 41
    .line 42
    iget-object v2, v1, La/fyr;->d:La/byr;

    .line 43
    .line 44
    invoke-static {v0, v2}, La/rcb;->b0(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/byr;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, La/fyr;->e:La/cyr;

    .line 48
    .line 49
    invoke-static {v0, v1}, La/rcb;->c0(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/cyr;)V

    .line 50
    .line 51
    .line 52
    const v1, 0x7f1317d3

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setScore(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/bvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 59
    .line 60
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/fyr;

    .line 65
    .line 66
    iget-object v2, v1, La/fyr;->g:La/fus;

    .line 67
    .line 68
    invoke-static {v0, v2}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v1, La/fyr;->f:La/ayr;

    .line 72
    .line 73
    iget-boolean v2, v1, La/ayr;->d:Z

    .line 74
    .line 75
    iget-object v3, v1, La/ayr;->a:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    iget-wide v1, v1, La/ayr;->b:J

    .line 80
    .line 81
    invoke-static {v0, v3, v1, v2}, La/vcc;->y(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;Ljava/lang/CharSequence;J)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;->setInfoText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    iget-object p1, p1, La/bvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 89
    .line 90
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, La/fyr;

    .line 95
    .line 96
    iget-object p0, p0, La/fyr;->c:La/qtr;

    .line 97
    .line 98
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast v1, Ljava/util/Collection;

    .line 126
    .line 127
    check-cast v1, Ljava/lang/Iterable;

    .line 128
    .line 129
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_b

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, La/hur;

    .line 148
    .line 149
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 150
    .line 151
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 152
    .line 153
    check-cast v1, La/bvx;

    .line 154
    .line 155
    if-nez v0, :cond_4

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    instance-of v2, v0, La/cur;

    .line 159
    .line 160
    if-eqz v2, :cond_5

    .line 161
    .line 162
    iget-object v1, v1, La/bvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 163
    .line 164
    check-cast v0, La/cur;

    .line 165
    .line 166
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    instance-of v2, v0, La/eyr;

    .line 171
    .line 172
    if-eqz v2, :cond_a

    .line 173
    .line 174
    check-cast v0, La/eyr;

    .line 175
    .line 176
    instance-of v2, v0, La/dyr;

    .line 177
    .line 178
    if-eqz v2, :cond_6

    .line 179
    .line 180
    iget-object v1, v1, La/bvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 181
    .line 182
    check-cast v0, La/dyr;

    .line 183
    .line 184
    iget-object v0, v0, La/dyr;->a:La/fus;

    .line 185
    .line 186
    invoke-static {v1, v0}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    instance-of v2, v0, La/ayr;

    .line 191
    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    iget-object v1, v1, La/bvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 195
    .line 196
    check-cast v0, La/ayr;

    .line 197
    .line 198
    iget-boolean v2, v0, La/ayr;->d:Z

    .line 199
    .line 200
    iget-object v3, v0, La/ayr;->a:Ljava/lang/String;

    .line 201
    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    iget-wide v4, v0, La/ayr;->b:J

    .line 205
    .line 206
    invoke-static {v1, v3, v4, v5}, La/vcc;->y(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;Ljava/lang/CharSequence;J)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_7
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;->setInfoText(Ljava/lang/CharSequence;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_8
    iget-object v1, v1, La/bvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 215
    .line 216
    instance-of v2, v0, La/byr;

    .line 217
    .line 218
    if-eqz v2, :cond_9

    .line 219
    .line 220
    check-cast v0, La/byr;

    .line 221
    .line 222
    invoke-static {v1, v0}, La/rcb;->b0(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/byr;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_9
    instance-of v2, v0, La/cyr;

    .line 227
    .line 228
    if-eqz v2, :cond_3

    .line 229
    .line 230
    check-cast v0, La/cyr;

    .line 231
    .line 232
    invoke-static {v1, v0}, La/rcb;->c0(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/cyr;)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_a
    instance-of v2, v0, La/ptr;

    .line 237
    .line 238
    if-eqz v2, :cond_3

    .line 239
    .line 240
    iget-object v1, v1, La/bvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 241
    .line 242
    check-cast v0, La/ptr;

    .line 243
    .line 244
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_b
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/cvx;

    .line 18
    .line 19
    iget-object v0, v0, La/cvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/myr;

    .line 26
    .line 27
    iget-object v1, v1, La/myr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/cvx;

    .line 33
    .line 34
    iget-object v0, p1, La/cvx;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/myr;

    .line 41
    .line 42
    iget-object v2, v1, La/myr;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;->setInformation(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, La/myr;->e:La/iyr;

    .line 48
    .line 49
    iget-object v2, v2, La/iyr;->a:La/p5h0;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;->setScoreModel(La/p5h0;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, v1, La/myr;->f:La/jyr;

    .line 55
    .line 56
    invoke-static {v0, v2}, La/vdb;->V(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;La/jyr;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v1, La/myr;->g:La/kyr;

    .line 60
    .line 61
    invoke-static {v0, v1}, La/vdb;->W(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;La/kyr;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, La/cvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 65
    .line 66
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, La/myr;

    .line 71
    .line 72
    iget-object p0, p0, La/myr;->c:La/qtr;

    .line 73
    .line 74
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast v1, Ljava/util/Collection;

    .line 102
    .line 103
    check-cast v1, Ljava/lang/Iterable;

    .line 104
    .line 105
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_a

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/hur;

    .line 124
    .line 125
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 126
    .line 127
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 128
    .line 129
    check-cast v1, La/cvx;

    .line 130
    .line 131
    if-nez v0, :cond_3

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    instance-of v2, v0, La/cur;

    .line 135
    .line 136
    if-eqz v2, :cond_4

    .line 137
    .line 138
    iget-object v1, v1, La/cvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 139
    .line 140
    check-cast v0, La/cur;

    .line 141
    .line 142
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_4
    instance-of v2, v0, La/lyr;

    .line 147
    .line 148
    if-eqz v2, :cond_9

    .line 149
    .line 150
    iget-object v1, v1, La/cvx;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;

    .line 151
    .line 152
    check-cast v0, La/lyr;

    .line 153
    .line 154
    instance-of v2, v0, La/hyr;

    .line 155
    .line 156
    if-eqz v2, :cond_5

    .line 157
    .line 158
    check-cast v0, La/hyr;

    .line 159
    .line 160
    iget-object v0, v0, La/hyr;->a:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;->setInformation(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    instance-of v2, v0, La/iyr;

    .line 167
    .line 168
    if-eqz v2, :cond_6

    .line 169
    .line 170
    check-cast v0, La/iyr;

    .line 171
    .line 172
    iget-object v0, v0, La/iyr;->a:La/p5h0;

    .line 173
    .line 174
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;->setScoreModel(La/p5h0;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_6
    instance-of v2, v0, La/jyr;

    .line 179
    .line 180
    if-eqz v2, :cond_7

    .line 181
    .line 182
    check-cast v0, La/jyr;

    .line 183
    .line 184
    invoke-static {v1, v0}, La/vdb;->V(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;La/jyr;)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_7
    instance-of v2, v0, La/kyr;

    .line 189
    .line 190
    if-eqz v2, :cond_8

    .line 191
    .line 192
    check-cast v0, La/kyr;

    .line 193
    .line 194
    invoke-static {v1, v0}, La/vdb;->W(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDice;La/kyr;)V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 199
    .line 200
    .line 201
    const/4 p0, 0x0

    .line 202
    return-object p0

    .line 203
    :cond_9
    instance-of v2, v0, La/ptr;

    .line 204
    .line 205
    if-eqz v2, :cond_2

    .line 206
    .line 207
    iget-object v1, v1, La/cvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 208
    .line 209
    check-cast v0, La/ptr;

    .line 210
    .line 211
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_a
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/dvx;

    .line 18
    .line 19
    iget-object v0, v0, La/dvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/syr;

    .line 26
    .line 27
    iget-object v1, v1, La/syr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/dvx;

    .line 33
    .line 34
    iget-object v0, p1, La/dvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSingleTeam;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/syr;

    .line 41
    .line 42
    iget-object v1, v1, La/syr;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSingleTeam;->setTeamName(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, La/dvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 48
    .line 49
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/syr;

    .line 54
    .line 55
    iget-object v2, v1, La/syr;->e:La/fus;

    .line 56
    .line 57
    invoke-static {v0, v2}, La/tdc;->D(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;La/fus;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v1, La/syr;->f:La/oyr;

    .line 61
    .line 62
    iget-object v1, v1, La/oyr;->a:La/ank0;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;->setInfoText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p1, La/dvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 79
    .line 80
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, La/syr;

    .line 85
    .line 86
    iget-object p0, p0, La/syr;->c:La/qtr;

    .line 87
    .line 88
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    check-cast v1, Ljava/util/Collection;

    .line 116
    .line 117
    check-cast v1, Ljava/lang/Iterable;

    .line 118
    .line 119
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, La/hur;

    .line 138
    .line 139
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 140
    .line 141
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 142
    .line 143
    check-cast v1, La/dvx;

    .line 144
    .line 145
    if-nez v0, :cond_3

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_3
    instance-of v2, v0, La/cur;

    .line 149
    .line 150
    if-eqz v2, :cond_4

    .line 151
    .line 152
    iget-object v1, v1, La/dvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 153
    .line 154
    check-cast v0, La/cur;

    .line 155
    .line 156
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_4
    instance-of v2, v0, La/ryr;

    .line 161
    .line 162
    if-eqz v2, :cond_7

    .line 163
    .line 164
    check-cast v0, La/ryr;

    .line 165
    .line 166
    instance-of v2, v0, La/pyr;

    .line 167
    .line 168
    if-eqz v2, :cond_5

    .line 169
    .line 170
    iget-object v1, v1, La/dvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 171
    .line 172
    check-cast v0, La/pyr;

    .line 173
    .line 174
    iget-object v0, v0, La/pyr;->a:La/fus;

    .line 175
    .line 176
    invoke-static {v1, v0}, La/tdc;->D(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;La/fus;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_5
    instance-of v2, v0, La/oyr;

    .line 181
    .line 182
    if-eqz v2, :cond_6

    .line 183
    .line 184
    iget-object v2, v1, La/dvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 185
    .line 186
    check-cast v0, La/oyr;

    .line 187
    .line 188
    iget-object v0, v0, La/oyr;->a:La/ank0;

    .line 189
    .line 190
    iget-object v1, v1, La/dvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 191
    .line 192
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;->setInfoText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_6
    iget-object v1, v1, La/dvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSingleTeam;

    .line 208
    .line 209
    instance-of v2, v0, La/qyr;

    .line 210
    .line 211
    if-eqz v2, :cond_2

    .line 212
    .line 213
    check-cast v0, La/qyr;

    .line 214
    .line 215
    iget-object v0, v0, La/qyr;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSingleTeam;->setTeamName(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_7
    instance-of v2, v0, La/ptr;

    .line 222
    .line 223
    if-eqz v2, :cond_2

    .line 224
    .line 225
    iget-object v1, v1, La/dvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 226
    .line 227
    check-cast v0, La/ptr;

    .line 228
    .line 229
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_8
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object p0
.end method

.method private final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/evx;

    .line 18
    .line 19
    iget-object v0, v0, La/evx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/azr;

    .line 26
    .line 27
    iget-object v1, v1, La/azr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/evx;

    .line 33
    .line 34
    iget-object v0, p1, La/evx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/azr;

    .line 41
    .line 42
    iget-object v2, v1, La/azr;->d:La/wyr;

    .line 43
    .line 44
    invoke-static {v0, v2}, La/hic;->t(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;La/wyr;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, La/azr;->e:La/xyr;

    .line 48
    .line 49
    invoke-static {v0, v2}, La/hic;->u(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;La/xyr;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, La/azr;->g:La/vyr;

    .line 53
    .line 54
    iget-object v1, v1, La/vyr;->a:La/p5h0;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setScoreModel(La/p5h0;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p1, La/evx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 60
    .line 61
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/azr;

    .line 66
    .line 67
    iget-object v2, v1, La/azr;->i:La/fus;

    .line 68
    .line 69
    invoke-static {v0, v2}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v1, La/azr;->f:La/uyr;

    .line 73
    .line 74
    iget-boolean v2, v1, La/uyr;->c:Z

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    iget-object v1, v1, La/uyr;->a:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;->setInfoText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    iget-wide v1, v1, La/uyr;->b:J

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/vcc;->x(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;J)V

    .line 87
    .line 88
    .line 89
    :goto_0
    iget-object p1, p1, La/evx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 90
    .line 91
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/azr;

    .line 96
    .line 97
    iget-object p0, p0, La/azr;->c:La/qtr;

    .line 98
    .line 99
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_3

    .line 103
    .line 104
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_2

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    check-cast v1, Ljava/util/Collection;

    .line 127
    .line 128
    check-cast v1, Ljava/lang/Iterable;

    .line 129
    .line 130
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_c

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, La/hur;

    .line 149
    .line 150
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 151
    .line 152
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 153
    .line 154
    check-cast v1, La/evx;

    .line 155
    .line 156
    if-nez v0, :cond_4

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    instance-of v2, v0, La/cur;

    .line 160
    .line 161
    if-eqz v2, :cond_5

    .line 162
    .line 163
    iget-object v1, v1, La/evx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 164
    .line 165
    check-cast v0, La/cur;

    .line 166
    .line 167
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    instance-of v2, v0, La/zyr;

    .line 172
    .line 173
    if-eqz v2, :cond_b

    .line 174
    .line 175
    check-cast v0, La/zyr;

    .line 176
    .line 177
    instance-of v2, v0, La/uyr;

    .line 178
    .line 179
    if-eqz v2, :cond_7

    .line 180
    .line 181
    iget-object v1, v1, La/evx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 182
    .line 183
    check-cast v0, La/uyr;

    .line 184
    .line 185
    iget-boolean v2, v0, La/uyr;->c:Z

    .line 186
    .line 187
    if-eqz v2, :cond_6

    .line 188
    .line 189
    iget-object v0, v0, La/uyr;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;->setInfoText(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_6
    iget-wide v2, v0, La/uyr;->b:J

    .line 196
    .line 197
    invoke-static {v1, v2, v3}, La/vcc;->x(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;J)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_7
    instance-of v2, v0, La/yyr;

    .line 202
    .line 203
    if-eqz v2, :cond_8

    .line 204
    .line 205
    iget-object v1, v1, La/evx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 206
    .line 207
    check-cast v0, La/yyr;

    .line 208
    .line 209
    iget-object v0, v0, La/yyr;->a:La/fus;

    .line 210
    .line 211
    invoke-static {v1, v0}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_8
    iget-object v1, v1, La/evx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;

    .line 216
    .line 217
    instance-of v2, v0, La/wyr;

    .line 218
    .line 219
    if-eqz v2, :cond_9

    .line 220
    .line 221
    check-cast v0, La/wyr;

    .line 222
    .line 223
    invoke-static {v1, v0}, La/hic;->t(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;La/wyr;)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_9
    instance-of v2, v0, La/xyr;

    .line 228
    .line 229
    if-eqz v2, :cond_a

    .line 230
    .line 231
    check-cast v0, La/xyr;

    .line 232
    .line 233
    invoke-static {v1, v0}, La/hic;->u(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;La/xyr;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_a
    instance-of v2, v0, La/vyr;

    .line 238
    .line 239
    if-eqz v2, :cond_3

    .line 240
    .line 241
    check-cast v0, La/vyr;

    .line 242
    .line 243
    iget-object v0, v0, La/vyr;->a:La/p5h0;

    .line 244
    .line 245
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setScoreModel(La/p5h0;)V

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_b
    instance-of v2, v0, La/ptr;

    .line 250
    .line 251
    if-eqz v2, :cond_3

    .line 252
    .line 253
    iget-object v1, v1, La/evx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 254
    .line 255
    check-cast v0, La/ptr;

    .line 256
    .line 257
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_c
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 14
    .line 15
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, La/fvx;

    .line 19
    .line 20
    iget-object v0, v0, La/fvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 21
    .line 22
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, La/izr;

    .line 27
    .line 28
    iget-object v2, v2, La/izr;->b:La/dur;

    .line 29
    .line 30
    invoke-static {v0, v2}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 31
    .line 32
    .line 33
    check-cast p1, La/fvx;

    .line 34
    .line 35
    iget-object v0, p1, La/fvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 36
    .line 37
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, La/izr;

    .line 42
    .line 43
    iget-object v3, v2, La/izr;->h:Ljava/lang/CharSequence;

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setScore(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, v2, La/izr;->d:La/ezr;

    .line 49
    .line 50
    iget-object v3, v3, La/ezr;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setFirstTeamName(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setFirstTeamCounter(Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v2, La/izr;->e:La/fzr;

    .line 62
    .line 63
    iget-object v2, v2, La/fzr;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setSecondTeamName(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setSecondTeamCounter(Ljava/lang/Integer;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p1, La/fvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 75
    .line 76
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/izr;

    .line 81
    .line 82
    iget-object v2, v1, La/izr;->g:La/fus;

    .line 83
    .line 84
    invoke-static {v0, v2}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v1, La/izr;->f:La/czr;

    .line 88
    .line 89
    iget-object v2, v1, La/czr;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-lez v3, :cond_0

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;->setInfoText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    iget-wide v1, v1, La/czr;->b:J

    .line 102
    .line 103
    invoke-static {v0, v1, v2}, La/vcc;->x(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;J)V

    .line 104
    .line 105
    .line 106
    :goto_0
    iget-object p1, p1, La/fvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 107
    .line 108
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, La/izr;

    .line 113
    .line 114
    iget-object p0, p0, La/izr;->c:La/qtr;

    .line 115
    .line 116
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_3

    .line 120
    .line 121
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_2

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    check-cast v2, Ljava/util/Collection;

    .line 144
    .line 145
    check-cast v2, Ljava/lang/Iterable;

    .line 146
    .line 147
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_c

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, La/hur;

    .line 166
    .line 167
    iget-object v2, p0, La/k2l;->c:La/cp;

    .line 168
    .line 169
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 170
    .line 171
    check-cast v2, La/fvx;

    .line 172
    .line 173
    if-nez v0, :cond_4

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    instance-of v3, v0, La/cur;

    .line 177
    .line 178
    if-eqz v3, :cond_5

    .line 179
    .line 180
    iget-object v2, v2, La/fvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 181
    .line 182
    check-cast v0, La/cur;

    .line 183
    .line 184
    invoke-static {v2, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    instance-of v3, v0, La/hzr;

    .line 189
    .line 190
    if-eqz v3, :cond_b

    .line 191
    .line 192
    check-cast v0, La/hzr;

    .line 193
    .line 194
    instance-of v3, v0, La/gzr;

    .line 195
    .line 196
    if-eqz v3, :cond_6

    .line 197
    .line 198
    iget-object v2, v2, La/fvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 199
    .line 200
    check-cast v0, La/gzr;

    .line 201
    .line 202
    iget-object v0, v0, La/gzr;->a:La/fus;

    .line 203
    .line 204
    invoke-static {v2, v0}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_6
    instance-of v3, v0, La/czr;

    .line 209
    .line 210
    if-eqz v3, :cond_8

    .line 211
    .line 212
    iget-object v2, v2, La/fvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 213
    .line 214
    check-cast v0, La/czr;

    .line 215
    .line 216
    iget-object v3, v0, La/czr;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-lez v4, :cond_7

    .line 223
    .line 224
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;->setInfoText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_7
    iget-wide v3, v0, La/czr;->b:J

    .line 229
    .line 230
    invoke-static {v2, v3, v4}, La/vcc;->x(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;J)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_8
    iget-object v2, v2, La/fvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 235
    .line 236
    instance-of v3, v0, La/dzr;

    .line 237
    .line 238
    if-eqz v3, :cond_9

    .line 239
    .line 240
    check-cast v0, La/dzr;

    .line 241
    .line 242
    iget-object v0, v0, La/dzr;->a:Ljava/lang/CharSequence;

    .line 243
    .line 244
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setScore(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_9
    instance-of v3, v0, La/ezr;

    .line 249
    .line 250
    if-eqz v3, :cond_a

    .line 251
    .line 252
    check-cast v0, La/ezr;

    .line 253
    .line 254
    iget-object v0, v0, La/ezr;->b:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setFirstTeamName(Ljava/lang/CharSequence;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setFirstTeamCounter(Ljava/lang/Integer;)V

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_a
    instance-of v3, v0, La/fzr;

    .line 267
    .line 268
    if-eqz v3, :cond_3

    .line 269
    .line 270
    check-cast v0, La/fzr;

    .line 271
    .line 272
    iget-object v0, v0, La/fzr;->b:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setSecondTeamName(Ljava/lang/CharSequence;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setSecondTeamCounter(Ljava/lang/Integer;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_2

    .line 284
    .line 285
    :cond_b
    instance-of v3, v0, La/ptr;

    .line 286
    .line 287
    if-eqz v3, :cond_3

    .line 288
    .line 289
    iget-object v2, v2, La/fvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 290
    .line 291
    check-cast v0, La/ptr;

    .line 292
    .line 293
    invoke-static {v2, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 294
    .line 295
    .line 296
    goto/16 :goto_2

    .line 297
    .line 298
    :cond_c
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0
.end method

.method private final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/k2l;->c:La/cp;

    .line 4
    .line 5
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 20
    .line 21
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 22
    .line 23
    move-object v0, p1

    .line 24
    check-cast v0, La/gvx;

    .line 25
    .line 26
    iget-object v0, v0, La/gvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 27
    .line 28
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/rzr;

    .line 33
    .line 34
    iget-object v1, v1, La/rzr;->b:La/dur;

    .line 35
    .line 36
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 37
    .line 38
    .line 39
    check-cast p1, La/gvx;

    .line 40
    .line 41
    iget-object v0, p1, La/gvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;

    .line 42
    .line 43
    iget-object v1, v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 44
    .line 45
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, La/rzr;

    .line 50
    .line 51
    iget-object v5, v4, La/rzr;->f:La/mzr;

    .line 52
    .line 53
    iget-object v5, v5, La/mzr;->a:La/p5h0;

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->setScoreModel(La/p5h0;)V

    .line 56
    .line 57
    .line 58
    iget-object v5, v4, La/rzr;->d:La/nzr;

    .line 59
    .line 60
    invoke-static {v0, v5}, La/mbc;->P(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;La/nzr;)V

    .line 61
    .line 62
    .line 63
    iget-object v5, v4, La/rzr;->e:La/ozr;

    .line 64
    .line 65
    invoke-static {v0, v5}, La/mbc;->Q(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;La/ozr;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v4, La/rzr;->g:La/apg;

    .line 69
    .line 70
    iget-object v5, v0, La/apg;->c:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    iget v0, v0, La/apg;->b:I

    .line 77
    .line 78
    iget-object v6, v1, La/zkk;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 81
    .line 82
    if-lez v5, :cond_0

    .line 83
    .line 84
    move v7, v3

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    move v7, v2

    .line 87
    :goto_0
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v5, v0}, La/u46;->b(II)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v4, La/rzr;->h:La/apg;

    .line 94
    .line 95
    iget-object v4, v0, La/apg;->c:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    iget v0, v0, La/apg;->b:I

    .line 102
    .line 103
    iget-object v1, v1, La/zkk;->i:Landroid/view/View;

    .line 104
    .line 105
    check-cast v1, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 106
    .line 107
    if-lez v4, :cond_1

    .line 108
    .line 109
    move v2, v3

    .line 110
    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v4, v0}, La/u46;->b(II)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/gvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 117
    .line 118
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, La/rzr;

    .line 123
    .line 124
    iget-object v1, v1, La/rzr;->c:La/qtr;

    .line 125
    .line 126
    invoke-static {v0, v1}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p1, La/gvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 130
    .line 131
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, La/rzr;

    .line 136
    .line 137
    iget-object v0, p0, La/rzr;->j:La/fus;

    .line 138
    .line 139
    invoke-static {p1, v0}, La/tdc;->D(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;La/fus;)V

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, La/rzr;->i:La/jzr;

    .line 143
    .line 144
    iget-object p0, p0, La/jzr;->a:La/aus;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v0}, La/vvw;->r(La/aus;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;->setInfoText(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_5

    .line 164
    .line 165
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_3

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    check-cast v1, Ljava/util/Collection;

    .line 188
    .line 189
    check-cast v1, Ljava/lang/Iterable;

    .line 190
    .line 191
    invoke-static {p0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-eqz p1, :cond_10

    .line 204
    .line 205
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, La/hur;

    .line 210
    .line 211
    if-nez p1, :cond_5

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    instance-of v1, p1, La/cur;

    .line 215
    .line 216
    if-eqz v1, :cond_6

    .line 217
    .line 218
    move-object v1, v0

    .line 219
    check-cast v1, La/gvx;

    .line 220
    .line 221
    iget-object v1, v1, La/gvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 222
    .line 223
    check-cast p1, La/cur;

    .line 224
    .line 225
    invoke-static {v1, p1}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_6
    instance-of v1, p1, La/qzr;

    .line 230
    .line 231
    if-eqz v1, :cond_f

    .line 232
    .line 233
    move-object v1, v0

    .line 234
    check-cast v1, La/gvx;

    .line 235
    .line 236
    check-cast p1, La/qzr;

    .line 237
    .line 238
    instance-of v4, p1, La/jzr;

    .line 239
    .line 240
    if-eqz v4, :cond_7

    .line 241
    .line 242
    iget-object v4, v1, La/gvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 243
    .line 244
    check-cast p1, La/jzr;

    .line 245
    .line 246
    iget-object p1, p1, La/jzr;->a:La/aus;

    .line 247
    .line 248
    iget-object v1, v1, La/gvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 249
    .line 250
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-static {p1, v1}, La/vvw;->r(La/aus;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, p1}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;->setInfoText(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_7
    instance-of v4, p1, La/pzr;

    .line 269
    .line 270
    if-eqz v4, :cond_8

    .line 271
    .line 272
    iget-object v1, v1, La/gvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 273
    .line 274
    check-cast p1, La/pzr;

    .line 275
    .line 276
    iget-object p1, p1, La/pzr;->a:La/fus;

    .line 277
    .line 278
    invoke-static {v1, p1}, La/tdc;->D(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;La/fus;)V

    .line 279
    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_8
    iget-object v1, v1, La/gvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;

    .line 283
    .line 284
    iget-object v4, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 285
    .line 286
    instance-of v5, p1, La/mzr;

    .line 287
    .line 288
    if-eqz v5, :cond_9

    .line 289
    .line 290
    check-cast p1, La/mzr;

    .line 291
    .line 292
    iget-object p1, p1, La/mzr;->a:La/p5h0;

    .line 293
    .line 294
    invoke-virtual {v1, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->setScoreModel(La/p5h0;)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_9
    instance-of v5, p1, La/nzr;

    .line 299
    .line 300
    if-eqz v5, :cond_a

    .line 301
    .line 302
    check-cast p1, La/nzr;

    .line 303
    .line 304
    invoke-static {v1, p1}, La/mbc;->P(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;La/nzr;)V

    .line 305
    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_a
    instance-of v5, p1, La/ozr;

    .line 309
    .line 310
    if-eqz v5, :cond_b

    .line 311
    .line 312
    check-cast p1, La/ozr;

    .line 313
    .line 314
    invoke-static {v1, p1}, La/mbc;->Q(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;La/ozr;)V

    .line 315
    .line 316
    .line 317
    goto :goto_2

    .line 318
    :cond_b
    instance-of v1, p1, La/kzr;

    .line 319
    .line 320
    if-eqz v1, :cond_d

    .line 321
    .line 322
    check-cast p1, La/kzr;

    .line 323
    .line 324
    iget-object p1, p1, La/kzr;->a:La/apg;

    .line 325
    .line 326
    iget-object v1, p1, La/apg;->c:Ljava/util/List;

    .line 327
    .line 328
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    iget p1, p1, La/apg;->b:I

    .line 333
    .line 334
    iget-object v4, v4, La/zkk;->c:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v4, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 337
    .line 338
    if-lez v1, :cond_c

    .line 339
    .line 340
    move v5, v3

    .line 341
    goto :goto_3

    .line 342
    :cond_c
    move v5, v2

    .line 343
    :goto_3
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v4, v1, p1}, La/u46;->b(II)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :cond_d
    instance-of v1, p1, La/lzr;

    .line 352
    .line 353
    if-eqz v1, :cond_4

    .line 354
    .line 355
    check-cast p1, La/lzr;

    .line 356
    .line 357
    iget-object p1, p1, La/lzr;->a:La/apg;

    .line 358
    .line 359
    iget-object v1, p1, La/apg;->c:Ljava/util/List;

    .line 360
    .line 361
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    iget p1, p1, La/apg;->b:I

    .line 366
    .line 367
    iget-object v4, v4, La/zkk;->i:Landroid/view/View;

    .line 368
    .line 369
    check-cast v4, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 370
    .line 371
    if-lez v1, :cond_e

    .line 372
    .line 373
    move v5, v3

    .line 374
    goto :goto_4

    .line 375
    :cond_e
    move v5, v2

    .line 376
    :goto_4
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4, v1, p1}, La/u46;->b(II)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_2

    .line 383
    .line 384
    :cond_f
    instance-of v1, p1, La/ptr;

    .line 385
    .line 386
    if-eqz v1, :cond_4

    .line 387
    .line 388
    move-object v1, v0

    .line 389
    check-cast v1, La/gvx;

    .line 390
    .line 391
    iget-object v1, v1, La/gvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 392
    .line 393
    check-cast p1, La/ptr;

    .line 394
    .line 395
    invoke-static {v1, p1}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_2

    .line 399
    .line 400
    :cond_10
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0
.end method

.method private final t(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/hvx;

    .line 18
    .line 19
    iget-object v0, v0, La/hvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/zzr;

    .line 26
    .line 27
    iget-object v1, v1, La/zzr;->b:La/dur;

    .line 28
    .line 29
    invoke-static {v0, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/hvx;

    .line 33
    .line 34
    iget-object v0, p1, La/hvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/zzr;

    .line 41
    .line 42
    iget-object v2, v1, La/zzr;->d:La/vzr;

    .line 43
    .line 44
    invoke-static {v0, v2}, La/plc;->v(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/vzr;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, La/zzr;->e:La/wzr;

    .line 48
    .line 49
    invoke-static {v0, v1}, La/plc;->x(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/wzr;)V

    .line 50
    .line 51
    .line 52
    const v1, 0x7f1317d3

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setScore(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/hvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 59
    .line 60
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/zzr;

    .line 65
    .line 66
    iget-object v2, v1, La/zzr;->g:La/fus;

    .line 67
    .line 68
    invoke-static {v0, v2}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v1, La/zzr;->f:La/uzr;

    .line 72
    .line 73
    iget-object v2, v1, La/uzr;->a:Ljava/lang/String;

    .line 74
    .line 75
    iget-wide v3, v1, La/uzr;->b:J

    .line 76
    .line 77
    invoke-static {v0, v2, v3, v4}, La/vcc;->y(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;Ljava/lang/CharSequence;J)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, La/hvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 81
    .line 82
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, La/zzr;

    .line 87
    .line 88
    iget-object p0, p0, La/zzr;->c:La/qtr;

    .line 89
    .line 90
    invoke-static {p1, p0}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_2

    .line 94
    .line 95
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_1

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    check-cast v1, Ljava/util/Collection;

    .line 118
    .line 119
    check-cast v1, Ljava/lang/Iterable;

    .line 120
    .line 121
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, La/hur;

    .line 140
    .line 141
    iget-object v1, p0, La/k2l;->c:La/cp;

    .line 142
    .line 143
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 144
    .line 145
    check-cast v1, La/hvx;

    .line 146
    .line 147
    if-nez v0, :cond_3

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    instance-of v2, v0, La/cur;

    .line 151
    .line 152
    if-eqz v2, :cond_4

    .line 153
    .line 154
    iget-object v1, v1, La/hvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 155
    .line 156
    check-cast v0, La/cur;

    .line 157
    .line 158
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_4
    instance-of v2, v0, La/yzr;

    .line 163
    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    check-cast v0, La/yzr;

    .line 167
    .line 168
    instance-of v2, v0, La/xzr;

    .line 169
    .line 170
    if-eqz v2, :cond_5

    .line 171
    .line 172
    iget-object v1, v1, La/hvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 173
    .line 174
    check-cast v0, La/xzr;

    .line 175
    .line 176
    iget-object v0, v0, La/xzr;->a:La/fus;

    .line 177
    .line 178
    invoke-static {v1, v0}, La/vcc;->A(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;La/fus;)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_5
    instance-of v2, v0, La/uzr;

    .line 183
    .line 184
    if-eqz v2, :cond_6

    .line 185
    .line 186
    iget-object v1, v1, La/hvx;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;

    .line 187
    .line 188
    check-cast v0, La/uzr;

    .line 189
    .line 190
    iget-object v2, v0, La/uzr;->a:Ljava/lang/String;

    .line 191
    .line 192
    iget-wide v3, v0, La/uzr;->b:J

    .line 193
    .line 194
    invoke-static {v1, v2, v3, v4}, La/vcc;->y(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLine;Ljava/lang/CharSequence;J)V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_6
    iget-object v1, v1, La/hvx;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 199
    .line 200
    instance-of v2, v0, La/vzr;

    .line 201
    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    check-cast v0, La/vzr;

    .line 205
    .line 206
    invoke-static {v1, v0}, La/plc;->v(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/vzr;)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_7
    instance-of v2, v0, La/wzr;

    .line 211
    .line 212
    if-eqz v2, :cond_2

    .line 213
    .line 214
    check-cast v0, La/wzr;

    .line 215
    .line 216
    invoke-static {v1, v0}, La/plc;->x(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/wzr;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_8
    instance-of v2, v0, La/ptr;

    .line 221
    .line 222
    if-eqz v2, :cond_2

    .line 223
    .line 224
    iget-object v1, v1, La/hvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 225
    .line 226
    check-cast v0, La/ptr;

    .line 227
    .line 228
    invoke-static {v1, v0}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_9
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0
.end method

.method private final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    check-cast p1, La/hsx;

    .line 17
    .line 18
    iget-object p1, p1, La/hsx;->b:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/g6s;

    .line 25
    .line 26
    iget v0, v0, La/g6s;->a:I

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, La/ebc;->Z(La/cp;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast v1, Ljava/util/Collection;

    .line 62
    .line 63
    check-cast v1, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, La/f6s;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    instance-of v1, v0, La/d6s;

    .line 88
    .line 89
    iget-object v2, p0, La/k2l;->c:La/cp;

    .line 90
    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 94
    .line 95
    check-cast v0, La/hsx;

    .line 96
    .line 97
    iget-object v0, v0, La/hsx;->b:Landroid/widget/TextView;

    .line 98
    .line 99
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/g6s;

    .line 104
    .line 105
    iget v1, v1, La/g6s;->a:I

    .line 106
    .line 107
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    instance-of v0, v0, La/e6s;

    .line 116
    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    invoke-static {v2}, La/ebc;->Z(La/cp;)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 124
    .line 125
    .line 126
    const/4 p0, 0x0

    .line 127
    return-object p0

    .line 128
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0
.end method

.method private final v(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/k2l;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    check-cast p1, La/oxx;

    .line 17
    .line 18
    iget-object p1, p1, La/oxx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 19
    .line 20
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/nkv;

    .line 25
    .line 26
    iget-boolean p0, p0, La/nkv;->a:Z

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast v1, Ljava/util/Collection;

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Iterable;

    .line 57
    .line 58
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/mkv;

    .line 77
    .line 78
    iget-object v0, p0, La/k2l;->c:La/cp;

    .line 79
    .line 80
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 81
    .line 82
    check-cast v1, La/oxx;

    .line 83
    .line 84
    iget-object v1, v1, La/oxx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 85
    .line 86
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/nkv;

    .line 91
    .line 92
    iget-boolean v0, v0, La/nkv;->a:Z

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0
.end method

.method private final w(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/k2l;->b:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move-object p0, v1

    .line 17
    check-cast p0, La/pxx;

    .line 18
    .line 19
    iget-object p0, p0, La/pxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 20
    .line 21
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, La/vkv;

    .line 26
    .line 27
    iget-object p1, p1, La/vkv;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    check-cast v1, La/pxx;

    .line 33
    .line 34
    iget-object p0, v1, La/pxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 35
    .line 36
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La/vkv;

    .line 41
    .line 42
    iget p1, p1, La/vkv;->b:I

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, La/bfb;->I(La/cp;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, La/bfb;->H(La/cp;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    check-cast v1, Ljava/util/Collection;

    .line 77
    .line 78
    check-cast v1, Ljava/lang/Iterable;

    .line 79
    .line 80
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, La/ukv;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    instance-of v1, v0, La/skv;

    .line 103
    .line 104
    iget-object v2, p0, La/k2l;->c:La/cp;

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    invoke-static {v2}, La/bfb;->H(La/cp;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    instance-of v0, v0, La/tkv;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-static {v2}, La/bfb;->I(La/cp;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 121
    .line 122
    .line 123
    const/4 p0, 0x0

    .line 124
    return-object p0

    .line 125
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/k2l;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/k2l;->b:La/cp;

    .line 5
    .line 6
    iget-object v3, p0, La/k2l;->c:La/cp;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 14
    .line 15
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    move-object p0, v0

    .line 27
    check-cast p0, La/xrv;

    .line 28
    .line 29
    iget-object p0, p0, La/xrv;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 30
    .line 31
    new-instance v3, La/nrv;

    .line 32
    .line 33
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, La/bsv;

    .line 38
    .line 39
    iget-object v4, p1, La/bsv;->a:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    const/16 v11, 0xfe

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-direct/range {v3 .. v11}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 53
    .line 54
    .line 55
    check-cast v0, La/xrv;

    .line 56
    .line 57
    iget-object p0, v0, La/xrv;->b:Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, La/bsv;

    .line 64
    .line 65
    iget-object p1, p1, La/bsv;->b:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast v2, Ljava/util/Collection;

    .line 94
    .line 95
    check-cast v2, Ljava/lang/Iterable;

    .line 96
    .line 97
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, La/asv;

    .line 116
    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    instance-of v2, v0, La/yrv;

    .line 120
    .line 121
    if-eqz v2, :cond_2

    .line 122
    .line 123
    move-object v0, p0

    .line 124
    check-cast v0, La/xrv;

    .line 125
    .line 126
    iget-object v0, v0, La/xrv;->b:Landroid/widget/TextView;

    .line 127
    .line 128
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, La/bsv;

    .line 133
    .line 134
    iget-object v2, v2, La/bsv;->b:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    instance-of v0, v0, La/zrv;

    .line 141
    .line 142
    if-eqz v0, :cond_3

    .line 143
    .line 144
    move-object v0, p0

    .line 145
    check-cast v0, La/xrv;

    .line 146
    .line 147
    iget-object v0, v0, La/xrv;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 148
    .line 149
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, La/bsv;

    .line 154
    .line 155
    iget-object v2, v2, La/bsv;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setLabel(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    :goto_3
    return-object v1

    .line 168
    :pswitch_0
    invoke-direct {p0, p1}, La/k2l;->w(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :pswitch_1
    invoke-direct {p0, p1}, La/k2l;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :pswitch_2
    invoke-direct {p0, p1}, La/k2l;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0

    .line 183
    :pswitch_3
    invoke-direct {p0, p1}, La/k2l;->t(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_4
    invoke-direct {p0, p1}, La/k2l;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_5
    invoke-direct {p0, p1}, La/k2l;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :pswitch_6
    invoke-direct {p0, p1}, La/k2l;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_7
    invoke-direct {p0, p1}, La/k2l;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :pswitch_8
    invoke-direct {p0, p1}, La/k2l;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :pswitch_9
    invoke-direct {p0, p1}, La/k2l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_a
    invoke-direct {p0, p1}, La/k2l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :pswitch_b
    invoke-direct {p0, p1}, La/k2l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    :pswitch_c
    invoke-direct {p0, p1}, La/k2l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_d
    invoke-direct {p0, p1}, La/k2l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    return-object p0

    .line 238
    :pswitch_e
    invoke-direct {p0, p1}, La/k2l;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :pswitch_f
    invoke-direct {p0, p1}, La/k2l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0

    .line 248
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 249
    .line 250
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_5

    .line 260
    .line 261
    iget-object p0, v2, La/cp;->u:La/yfu0;

    .line 262
    .line 263
    move-object p1, p0

    .line 264
    check-cast p1, La/uux;

    .line 265
    .line 266
    iget-object p1, p1, La/uux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 267
    .line 268
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, La/vvr;

    .line 273
    .line 274
    iget-object v0, v0, La/vvr;->b:La/dur;

    .line 275
    .line 276
    invoke-static {p1, v0}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 277
    .line 278
    .line 279
    check-cast p0, La/uux;

    .line 280
    .line 281
    iget-object p1, p0, La/uux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;

    .line 282
    .line 283
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, La/vvr;

    .line 288
    .line 289
    invoke-static {p1, v0}, La/feb;->I(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;La/vvr;)V

    .line 290
    .line 291
    .line 292
    iget-object p0, p0, La/uux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 293
    .line 294
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    check-cast p1, La/vvr;

    .line 299
    .line 300
    iget-object p1, p1, La/vvr;->c:La/qtr;

    .line 301
    .line 302
    invoke-static {p0, p1}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_6

    .line 320
    .line 321
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    check-cast v1, Ljava/util/Collection;

    .line 329
    .line 330
    check-cast v1, Ljava/lang/Iterable;

    .line 331
    .line 332
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 333
    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    :cond_7
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_b

    .line 345
    .line 346
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v0, La/hur;

    .line 351
    .line 352
    if-nez v0, :cond_8

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_8
    instance-of v1, v0, La/cur;

    .line 356
    .line 357
    if-eqz v1, :cond_9

    .line 358
    .line 359
    move-object v1, p0

    .line 360
    check-cast v1, La/uux;

    .line 361
    .line 362
    iget-object v1, v1, La/uux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 363
    .line 364
    check-cast v0, La/cur;

    .line 365
    .line 366
    invoke-static {v1, v0}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 367
    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_9
    instance-of v1, v0, La/uvr;

    .line 371
    .line 372
    if-eqz v1, :cond_a

    .line 373
    .line 374
    move-object v0, p0

    .line 375
    check-cast v0, La/uux;

    .line 376
    .line 377
    iget-object v0, v0, La/uux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;

    .line 378
    .line 379
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    check-cast v1, La/vvr;

    .line 384
    .line 385
    invoke-static {v0, v1}, La/feb;->I(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;La/vvr;)V

    .line 386
    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_a
    instance-of v0, v0, La/ptr;

    .line 390
    .line 391
    if-eqz v0, :cond_7

    .line 392
    .line 393
    move-object v0, p0

    .line 394
    check-cast v0, La/uux;

    .line 395
    .line 396
    iget-object v0, v0, La/uux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 397
    .line 398
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    check-cast v1, La/vvr;

    .line 403
    .line 404
    iget-object v1, v1, La/vvr;->c:La/qtr;

    .line 405
    .line 406
    invoke-static {v0, v1}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 407
    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_b
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object p0

    .line 413
    :pswitch_11
    check-cast p1, Ljava/util/List;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 419
    .line 420
    .line 421
    move-result p0

    .line 422
    if-eqz p0, :cond_c

    .line 423
    .line 424
    iget-object p0, v2, La/cp;->u:La/yfu0;

    .line 425
    .line 426
    move-object p1, p0

    .line 427
    check-cast p1, La/tux;

    .line 428
    .line 429
    iget-object p1, p1, La/tux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 430
    .line 431
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, La/mvr;

    .line 436
    .line 437
    iget-object v0, v0, La/mvr;->b:La/dur;

    .line 438
    .line 439
    invoke-static {p1, v0}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 440
    .line 441
    .line 442
    check-cast p0, La/tux;

    .line 443
    .line 444
    iget-object p1, p0, La/tux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;

    .line 445
    .line 446
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    check-cast v0, La/mvr;

    .line 451
    .line 452
    iget-object v1, v0, La/mvr;->d:La/ivr;

    .line 453
    .line 454
    iget-object v1, v1, La/ivr;->a:Ljava/lang/String;

    .line 455
    .line 456
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setInfoText(Ljava/lang/CharSequence;)V

    .line 457
    .line 458
    .line 459
    iget-object v1, v0, La/mvr;->e:La/gvr;

    .line 460
    .line 461
    invoke-static {p1, v1}, La/lmc;->B(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;La/gvr;)V

    .line 462
    .line 463
    .line 464
    iget-object v1, v0, La/mvr;->f:La/kvr;

    .line 465
    .line 466
    invoke-static {p1, v1}, La/lmc;->D(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;La/kvr;)V

    .line 467
    .line 468
    .line 469
    iget-object v1, v0, La/mvr;->g:La/jvr;

    .line 470
    .line 471
    iget-object v1, v1, La/jvr;->a:Ljava/util/List;

    .line 472
    .line 473
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setResults(Ljava/util/List;)V

    .line 474
    .line 475
    .line 476
    iget-object v0, v0, La/mvr;->h:La/hvr;

    .line 477
    .line 478
    invoke-static {p1, v0}, La/lmc;->C(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;La/hvr;)V

    .line 479
    .line 480
    .line 481
    iget-object p0, p0, La/tux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 482
    .line 483
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    check-cast p1, La/mvr;

    .line 488
    .line 489
    iget-object p1, p1, La/mvr;->c:La/qtr;

    .line 490
    .line 491
    invoke-static {p0, p1}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_9

    .line 495
    .line 496
    :cond_c
    new-instance p0, Ljava/util/ArrayList;

    .line 497
    .line 498
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-eqz v0, :cond_d

    .line 510
    .line 511
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    check-cast v0, Ljava/util/Collection;

    .line 519
    .line 520
    check-cast v0, Ljava/lang/Iterable;

    .line 521
    .line 522
    invoke-static {p0, v0}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 523
    .line 524
    .line 525
    goto :goto_7

    .line 526
    :cond_d
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    :cond_e
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 531
    .line 532
    .line 533
    move-result p1

    .line 534
    if-eqz p1, :cond_17

    .line 535
    .line 536
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    check-cast p1, La/hur;

    .line 541
    .line 542
    iget-object v0, v3, La/cp;->u:La/yfu0;

    .line 543
    .line 544
    check-cast v0, La/tux;

    .line 545
    .line 546
    if-nez p1, :cond_f

    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_f
    instance-of v2, p1, La/cur;

    .line 550
    .line 551
    if-eqz v2, :cond_10

    .line 552
    .line 553
    iget-object v0, v0, La/tux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 554
    .line 555
    check-cast p1, La/cur;

    .line 556
    .line 557
    invoke-static {v0, p1}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 558
    .line 559
    .line 560
    goto :goto_8

    .line 561
    :cond_10
    instance-of v2, p1, La/lvr;

    .line 562
    .line 563
    if-eqz v2, :cond_16

    .line 564
    .line 565
    iget-object v0, v0, La/tux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;

    .line 566
    .line 567
    check-cast p1, La/lvr;

    .line 568
    .line 569
    instance-of v2, p1, La/gvr;

    .line 570
    .line 571
    if-eqz v2, :cond_11

    .line 572
    .line 573
    check-cast p1, La/gvr;

    .line 574
    .line 575
    invoke-static {v0, p1}, La/lmc;->B(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;La/gvr;)V

    .line 576
    .line 577
    .line 578
    goto :goto_8

    .line 579
    :cond_11
    instance-of v2, p1, La/kvr;

    .line 580
    .line 581
    if-eqz v2, :cond_12

    .line 582
    .line 583
    check-cast p1, La/kvr;

    .line 584
    .line 585
    invoke-static {v0, p1}, La/lmc;->D(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;La/kvr;)V

    .line 586
    .line 587
    .line 588
    goto :goto_8

    .line 589
    :cond_12
    instance-of v2, p1, La/jvr;

    .line 590
    .line 591
    if-eqz v2, :cond_13

    .line 592
    .line 593
    check-cast p1, La/jvr;

    .line 594
    .line 595
    iget-object p1, p1, La/jvr;->a:Ljava/util/List;

    .line 596
    .line 597
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setResults(Ljava/util/List;)V

    .line 598
    .line 599
    .line 600
    goto :goto_8

    .line 601
    :cond_13
    instance-of v2, p1, La/ivr;

    .line 602
    .line 603
    if-eqz v2, :cond_14

    .line 604
    .line 605
    check-cast p1, La/ivr;

    .line 606
    .line 607
    iget-object p1, p1, La/ivr;->a:Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setInfoText(Ljava/lang/CharSequence;)V

    .line 610
    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_14
    instance-of v2, p1, La/hvr;

    .line 614
    .line 615
    if-eqz v2, :cond_15

    .line 616
    .line 617
    check-cast p1, La/hvr;

    .line 618
    .line 619
    invoke-static {v0, p1}, La/lmc;->C(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;La/hvr;)V

    .line 620
    .line 621
    .line 622
    goto :goto_8

    .line 623
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 624
    .line 625
    .line 626
    goto :goto_a

    .line 627
    :cond_16
    instance-of v2, p1, La/ptr;

    .line 628
    .line 629
    if-eqz v2, :cond_e

    .line 630
    .line 631
    iget-object v0, v0, La/tux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 632
    .line 633
    check-cast p1, La/ptr;

    .line 634
    .line 635
    invoke-static {v0, p1}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 636
    .line 637
    .line 638
    goto :goto_8

    .line 639
    :cond_17
    :goto_9
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    :goto_a
    return-object v1

    .line 642
    :pswitch_12
    check-cast p1, Ljava/util/List;

    .line 643
    .line 644
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 648
    .line 649
    .line 650
    move-result p0

    .line 651
    const/16 v0, 0xc

    .line 652
    .line 653
    const v4, 0x7f080e00

    .line 654
    .line 655
    .line 656
    if-eqz p0, :cond_18

    .line 657
    .line 658
    iget-object p0, v2, La/cp;->u:La/yfu0;

    .line 659
    .line 660
    move-object p1, p0

    .line 661
    check-cast p1, La/sux;

    .line 662
    .line 663
    iget-object p1, p1, La/sux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 664
    .line 665
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    check-cast v1, La/evr;

    .line 670
    .line 671
    iget-object v1, v1, La/evr;->b:La/dur;

    .line 672
    .line 673
    invoke-static {p1, v1}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 674
    .line 675
    .line 676
    check-cast p0, La/sux;

    .line 677
    .line 678
    iget-object p1, p0, La/sux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;

    .line 679
    .line 680
    iget-object v1, p1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 681
    .line 682
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    check-cast v3, La/evr;

    .line 687
    .line 688
    iget-object v5, v3, La/evr;->d:La/avr;

    .line 689
    .line 690
    iget-object v6, v5, La/avr;->a:Ljava/lang/String;

    .line 691
    .line 692
    invoke-virtual {p1, v6}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setInfoText(Ljava/lang/CharSequence;)V

    .line 693
    .line 694
    .line 695
    iget-wide v6, v5, La/avr;->c:J

    .line 696
    .line 697
    invoke-virtual {p1, v6, v7}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setGameStartTime(J)V

    .line 698
    .line 699
    .line 700
    iget-boolean v5, v5, La/avr;->b:Z

    .line 701
    .line 702
    invoke-virtual {p1, v5}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTimerVisible(Z)V

    .line 703
    .line 704
    .line 705
    iget-object v5, v3, La/evr;->e:La/bvr;

    .line 706
    .line 707
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v6, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 715
    .line 716
    .line 717
    move-result-object v6

    .line 718
    iget-object v7, v5, La/bvr;->c:Ljava/lang/String;

    .line 719
    .line 720
    iget-object v8, v1, La/dbo;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 721
    .line 722
    invoke-static {v8, v7, v6, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 723
    .line 724
    .line 725
    iget-object v5, v5, La/bvr;->b:Ljava/lang/String;

    .line 726
    .line 727
    invoke-virtual {p1, v5}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopTeamName(Ljava/lang/CharSequence;)V

    .line 728
    .line 729
    .line 730
    iget-object v5, v3, La/evr;->f:La/cvr;

    .line 731
    .line 732
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v6, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 740
    .line 741
    .line 742
    move-result-object v4

    .line 743
    iget-object v6, v5, La/cvr;->c:Ljava/lang/String;

    .line 744
    .line 745
    iget-object v1, v1, La/dbo;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 746
    .line 747
    invoke-static {v1, v6, v4, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 748
    .line 749
    .line 750
    iget-object v0, v5, La/cvr;->b:Ljava/lang/String;

    .line 751
    .line 752
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotTeamName(Ljava/lang/CharSequence;)V

    .line 753
    .line 754
    .line 755
    iget-object v0, v3, La/evr;->g:La/zur;

    .line 756
    .line 757
    invoke-static {p1, v0}, La/vfc;->D(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/zur;)V

    .line 758
    .line 759
    .line 760
    iget-object p0, p0, La/sux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 761
    .line 762
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    check-cast p1, La/evr;

    .line 767
    .line 768
    iget-object p1, p1, La/evr;->c:La/qtr;

    .line 769
    .line 770
    invoke-static {p0, p1}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 771
    .line 772
    .line 773
    goto/16 :goto_d

    .line 774
    .line 775
    :cond_18
    new-instance p0, Ljava/util/ArrayList;

    .line 776
    .line 777
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 778
    .line 779
    .line 780
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 781
    .line 782
    .line 783
    move-result-object p1

    .line 784
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    if-eqz v2, :cond_19

    .line 789
    .line 790
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    check-cast v2, Ljava/util/Collection;

    .line 798
    .line 799
    check-cast v2, Ljava/lang/Iterable;

    .line 800
    .line 801
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 802
    .line 803
    .line 804
    goto :goto_b

    .line 805
    :cond_19
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 806
    .line 807
    .line 808
    move-result-object p0

    .line 809
    :cond_1a
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 810
    .line 811
    .line 812
    move-result p1

    .line 813
    if-eqz p1, :cond_22

    .line 814
    .line 815
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object p1

    .line 819
    check-cast p1, La/hur;

    .line 820
    .line 821
    iget-object v2, v3, La/cp;->u:La/yfu0;

    .line 822
    .line 823
    check-cast v2, La/sux;

    .line 824
    .line 825
    if-nez p1, :cond_1b

    .line 826
    .line 827
    goto :goto_c

    .line 828
    :cond_1b
    instance-of v5, p1, La/cur;

    .line 829
    .line 830
    if-eqz v5, :cond_1c

    .line 831
    .line 832
    iget-object v2, v2, La/sux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 833
    .line 834
    check-cast p1, La/cur;

    .line 835
    .line 836
    invoke-static {v2, p1}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 837
    .line 838
    .line 839
    goto :goto_c

    .line 840
    :cond_1c
    instance-of v5, p1, La/dvr;

    .line 841
    .line 842
    if-eqz v5, :cond_21

    .line 843
    .line 844
    iget-object v2, v2, La/sux;->d:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;

    .line 845
    .line 846
    iget-object v5, v2, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 847
    .line 848
    check-cast p1, La/dvr;

    .line 849
    .line 850
    instance-of v6, p1, La/avr;

    .line 851
    .line 852
    if-eqz v6, :cond_1d

    .line 853
    .line 854
    check-cast p1, La/avr;

    .line 855
    .line 856
    iget-object v5, p1, La/avr;->a:Ljava/lang/String;

    .line 857
    .line 858
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setInfoText(Ljava/lang/CharSequence;)V

    .line 859
    .line 860
    .line 861
    iget-wide v5, p1, La/avr;->c:J

    .line 862
    .line 863
    invoke-virtual {v2, v5, v6}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setGameStartTime(J)V

    .line 864
    .line 865
    .line 866
    iget-boolean p1, p1, La/avr;->b:Z

    .line 867
    .line 868
    invoke-virtual {v2, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTimerVisible(Z)V

    .line 869
    .line 870
    .line 871
    goto :goto_c

    .line 872
    :cond_1d
    instance-of v6, p1, La/bvr;

    .line 873
    .line 874
    if-eqz v6, :cond_1e

    .line 875
    .line 876
    check-cast p1, La/bvr;

    .line 877
    .line 878
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 879
    .line 880
    .line 881
    move-result-object v6

    .line 882
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v6, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 886
    .line 887
    .line 888
    move-result-object v6

    .line 889
    iget-object v7, p1, La/bvr;->c:Ljava/lang/String;

    .line 890
    .line 891
    iget-object v5, v5, La/dbo;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 892
    .line 893
    invoke-static {v5, v7, v6, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 894
    .line 895
    .line 896
    iget-object p1, p1, La/bvr;->b:Ljava/lang/String;

    .line 897
    .line 898
    invoke-virtual {v2, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopTeamName(Ljava/lang/CharSequence;)V

    .line 899
    .line 900
    .line 901
    goto :goto_c

    .line 902
    :cond_1e
    instance-of v6, p1, La/cvr;

    .line 903
    .line 904
    if-eqz v6, :cond_1f

    .line 905
    .line 906
    check-cast p1, La/cvr;

    .line 907
    .line 908
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 909
    .line 910
    .line 911
    move-result-object v6

    .line 912
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v6, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 916
    .line 917
    .line 918
    move-result-object v6

    .line 919
    iget-object v7, p1, La/cvr;->c:Ljava/lang/String;

    .line 920
    .line 921
    iget-object v5, v5, La/dbo;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 922
    .line 923
    invoke-static {v5, v7, v6, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 924
    .line 925
    .line 926
    iget-object p1, p1, La/cvr;->b:Ljava/lang/String;

    .line 927
    .line 928
    invoke-virtual {v2, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotTeamName(Ljava/lang/CharSequence;)V

    .line 929
    .line 930
    .line 931
    goto :goto_c

    .line 932
    :cond_1f
    instance-of v5, p1, La/zur;

    .line 933
    .line 934
    if-eqz v5, :cond_20

    .line 935
    .line 936
    check-cast p1, La/zur;

    .line 937
    .line 938
    invoke-static {v2, p1}, La/vfc;->D(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;La/zur;)V

    .line 939
    .line 940
    .line 941
    goto/16 :goto_c

    .line 942
    .line 943
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 944
    .line 945
    .line 946
    goto :goto_e

    .line 947
    :cond_21
    instance-of v5, p1, La/ptr;

    .line 948
    .line 949
    if-eqz v5, :cond_1a

    .line 950
    .line 951
    iget-object v2, v2, La/sux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 952
    .line 953
    check-cast p1, La/ptr;

    .line 954
    .line 955
    invoke-static {v2, p1}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 956
    .line 957
    .line 958
    goto/16 :goto_c

    .line 959
    .line 960
    :cond_22
    :goto_d
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 961
    .line 962
    :goto_e
    return-object v1

    .line 963
    :pswitch_13
    check-cast p1, Ljava/util/List;

    .line 964
    .line 965
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 969
    .line 970
    .line 971
    move-result p0

    .line 972
    if-eqz p0, :cond_23

    .line 973
    .line 974
    iget-object p0, v2, La/cp;->u:La/yfu0;

    .line 975
    .line 976
    move-object p1, p0

    .line 977
    check-cast p1, La/rux;

    .line 978
    .line 979
    iget-object p1, p1, La/rux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 980
    .line 981
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    check-cast v0, La/uur;

    .line 986
    .line 987
    iget-object v0, v0, La/uur;->b:La/dur;

    .line 988
    .line 989
    invoke-static {p1, v0}, La/qcc;->H(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/dur;)V

    .line 990
    .line 991
    .line 992
    check-cast p0, La/rux;

    .line 993
    .line 994
    iget-object p1, p0, La/rux;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 995
    .line 996
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    check-cast v0, La/uur;

    .line 1001
    .line 1002
    iget-object v1, v0, La/uur;->d:La/pur;

    .line 1003
    .line 1004
    iget-object v1, v1, La/pur;->a:La/p5h0;

    .line 1005
    .line 1006
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setScoreModel(La/p5h0;)V

    .line 1007
    .line 1008
    .line 1009
    iget-object v1, v0, La/uur;->e:La/qur;

    .line 1010
    .line 1011
    invoke-static {p1, v1}, La/vic;->r(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/qur;)V

    .line 1012
    .line 1013
    .line 1014
    iget-object v0, v0, La/uur;->f:La/rur;

    .line 1015
    .line 1016
    invoke-static {p1, v0}, La/vic;->s(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/rur;)V

    .line 1017
    .line 1018
    .line 1019
    iget-object p1, p0, La/rux;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 1020
    .line 1021
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    check-cast v0, La/uur;

    .line 1026
    .line 1027
    iget-object v1, v0, La/uur;->h:La/fus;

    .line 1028
    .line 1029
    invoke-static {p1, v1}, La/tdc;->D(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;La/fus;)V

    .line 1030
    .line 1031
    .line 1032
    iget-object v0, v0, La/uur;->g:La/our;

    .line 1033
    .line 1034
    iget-object v0, v0, La/our;->a:Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;->setInfoText(Ljava/lang/CharSequence;)V

    .line 1040
    .line 1041
    .line 1042
    iget-object p0, p0, La/rux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1043
    .line 1044
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object p1

    .line 1048
    check-cast p1, La/uur;

    .line 1049
    .line 1050
    iget-object p1, p1, La/uur;->c:La/qtr;

    .line 1051
    .line 1052
    invoke-static {p0, p1}, La/ibc;->T(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/qtr;)V

    .line 1053
    .line 1054
    .line 1055
    goto/16 :goto_11

    .line 1056
    .line 1057
    :cond_23
    new-instance p0, Ljava/util/ArrayList;

    .line 1058
    .line 1059
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 1060
    .line 1061
    .line 1062
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1063
    .line 1064
    .line 1065
    move-result-object p1

    .line 1066
    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v0

    .line 1070
    if-eqz v0, :cond_24

    .line 1071
    .line 1072
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    check-cast v0, Ljava/util/Collection;

    .line 1080
    .line 1081
    check-cast v0, Ljava/lang/Iterable;

    .line 1082
    .line 1083
    invoke-static {p0, v0}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1084
    .line 1085
    .line 1086
    goto :goto_f

    .line 1087
    :cond_24
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1088
    .line 1089
    .line 1090
    move-result-object p0

    .line 1091
    :cond_25
    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1092
    .line 1093
    .line 1094
    move-result p1

    .line 1095
    if-eqz p1, :cond_2d

    .line 1096
    .line 1097
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object p1

    .line 1101
    check-cast p1, La/hur;

    .line 1102
    .line 1103
    iget-object v0, v3, La/cp;->u:La/yfu0;

    .line 1104
    .line 1105
    check-cast v0, La/rux;

    .line 1106
    .line 1107
    if-nez p1, :cond_26

    .line 1108
    .line 1109
    goto :goto_10

    .line 1110
    :cond_26
    instance-of v1, p1, La/cur;

    .line 1111
    .line 1112
    if-eqz v1, :cond_27

    .line 1113
    .line 1114
    iget-object v0, v0, La/rux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1115
    .line 1116
    check-cast p1, La/cur;

    .line 1117
    .line 1118
    invoke-static {v0, p1}, La/qcc;->J(Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;La/cur;)V

    .line 1119
    .line 1120
    .line 1121
    goto :goto_10

    .line 1122
    :cond_27
    instance-of v1, p1, La/tur;

    .line 1123
    .line 1124
    if-eqz v1, :cond_2c

    .line 1125
    .line 1126
    check-cast p1, La/tur;

    .line 1127
    .line 1128
    instance-of v1, p1, La/sur;

    .line 1129
    .line 1130
    if-eqz v1, :cond_28

    .line 1131
    .line 1132
    iget-object v0, v0, La/rux;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 1133
    .line 1134
    check-cast p1, La/sur;

    .line 1135
    .line 1136
    iget-object p1, p1, La/sur;->a:La/fus;

    .line 1137
    .line 1138
    invoke-static {v0, p1}, La/tdc;->D(Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;La/fus;)V

    .line 1139
    .line 1140
    .line 1141
    goto :goto_10

    .line 1142
    :cond_28
    instance-of v1, p1, La/our;

    .line 1143
    .line 1144
    if-eqz v1, :cond_29

    .line 1145
    .line 1146
    iget-object v0, v0, La/rux;->d:Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 1147
    .line 1148
    check-cast p1, La/our;

    .line 1149
    .line 1150
    iget-object p1, p1, La/our;->a:Ljava/lang/String;

    .line 1151
    .line 1152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;->setInfoText(Ljava/lang/CharSequence;)V

    .line 1156
    .line 1157
    .line 1158
    goto :goto_10

    .line 1159
    :cond_29
    iget-object v0, v0, La/rux;->e:Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;

    .line 1160
    .line 1161
    instance-of v1, p1, La/pur;

    .line 1162
    .line 1163
    if-eqz v1, :cond_2a

    .line 1164
    .line 1165
    check-cast p1, La/pur;

    .line 1166
    .line 1167
    iget-object p1, p1, La/pur;->a:La/p5h0;

    .line 1168
    .line 1169
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;->setScoreModel(La/p5h0;)V

    .line 1170
    .line 1171
    .line 1172
    goto :goto_10

    .line 1173
    :cond_2a
    instance-of v1, p1, La/qur;

    .line 1174
    .line 1175
    if-eqz v1, :cond_2b

    .line 1176
    .line 1177
    check-cast p1, La/qur;

    .line 1178
    .line 1179
    invoke-static {v0, p1}, La/vic;->r(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/qur;)V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_10

    .line 1183
    :cond_2b
    instance-of v1, p1, La/rur;

    .line 1184
    .line 1185
    if-eqz v1, :cond_25

    .line 1186
    .line 1187
    check-cast p1, La/rur;

    .line 1188
    .line 1189
    invoke-static {v0, p1}, La/vic;->s(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleTwoTeams;La/rur;)V

    .line 1190
    .line 1191
    .line 1192
    goto :goto_10

    .line 1193
    :cond_2c
    instance-of v1, p1, La/ptr;

    .line 1194
    .line 1195
    if-eqz v1, :cond_25

    .line 1196
    .line 1197
    iget-object v0, v0, La/rux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1198
    .line 1199
    check-cast p1, La/ptr;

    .line 1200
    .line 1201
    invoke-static {v0, p1}, La/ibc;->V(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;La/ptr;)V

    .line 1202
    .line 1203
    .line 1204
    goto :goto_10

    .line 1205
    :cond_2d
    :goto_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1206
    .line 1207
    return-object p0

    .line 1208
    :pswitch_14
    check-cast p1, Ljava/util/List;

    .line 1209
    .line 1210
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 1211
    .line 1212
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 1213
    .line 1214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1215
    .line 1216
    .line 1217
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1218
    .line 1219
    .line 1220
    move-result v4

    .line 1221
    if-eqz v4, :cond_2e

    .line 1222
    .line 1223
    invoke-static {v2}, La/kkb;->H(La/cp;)V

    .line 1224
    .line 1225
    .line 1226
    move-object p0, v0

    .line 1227
    check-cast p0, La/qux;

    .line 1228
    .line 1229
    iget-object p0, p0, La/qux;->e:Landroid/widget/TextView;

    .line 1230
    .line 1231
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object p1

    .line 1235
    check-cast p1, La/nkr;

    .line 1236
    .line 1237
    iget-object p1, p1, La/nkr;->b:Ljava/lang/String;

    .line 1238
    .line 1239
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1240
    .line 1241
    .line 1242
    check-cast v0, La/qux;

    .line 1243
    .line 1244
    iget-object p0, v0, La/qux;->d:Landroid/widget/TextView;

    .line 1245
    .line 1246
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object p1

    .line 1250
    check-cast p1, La/nkr;

    .line 1251
    .line 1252
    iget-object p1, p1, La/nkr;->c:Ljava/lang/String;

    .line 1253
    .line 1254
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1255
    .line 1256
    .line 1257
    goto :goto_14

    .line 1258
    :cond_2e
    new-instance v0, Ljava/util/ArrayList;

    .line 1259
    .line 1260
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1261
    .line 1262
    .line 1263
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1264
    .line 1265
    .line 1266
    move-result-object p1

    .line 1267
    :goto_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1268
    .line 1269
    .line 1270
    move-result v2

    .line 1271
    if-eqz v2, :cond_2f

    .line 1272
    .line 1273
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v2

    .line 1277
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1278
    .line 1279
    .line 1280
    check-cast v2, Ljava/util/Collection;

    .line 1281
    .line 1282
    check-cast v2, Ljava/lang/Iterable;

    .line 1283
    .line 1284
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1285
    .line 1286
    .line 1287
    goto :goto_12

    .line 1288
    :cond_2f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1289
    .line 1290
    .line 1291
    move-result-object p1

    .line 1292
    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1293
    .line 1294
    .line 1295
    move-result v0

    .line 1296
    if-eqz v0, :cond_33

    .line 1297
    .line 1298
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    check-cast v0, La/mkr;

    .line 1303
    .line 1304
    if-eqz v0, :cond_32

    .line 1305
    .line 1306
    instance-of v2, v0, La/lkr;

    .line 1307
    .line 1308
    if-eqz v2, :cond_30

    .line 1309
    .line 1310
    move-object v0, p0

    .line 1311
    check-cast v0, La/qux;

    .line 1312
    .line 1313
    iget-object v0, v0, La/qux;->e:Landroid/widget/TextView;

    .line 1314
    .line 1315
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v2

    .line 1319
    check-cast v2, La/nkr;

    .line 1320
    .line 1321
    iget-object v2, v2, La/nkr;->b:Ljava/lang/String;

    .line 1322
    .line 1323
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1324
    .line 1325
    .line 1326
    goto :goto_13

    .line 1327
    :cond_30
    instance-of v2, v0, La/kkr;

    .line 1328
    .line 1329
    if-eqz v2, :cond_31

    .line 1330
    .line 1331
    move-object v0, p0

    .line 1332
    check-cast v0, La/qux;

    .line 1333
    .line 1334
    iget-object v0, v0, La/qux;->d:Landroid/widget/TextView;

    .line 1335
    .line 1336
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    check-cast v2, La/nkr;

    .line 1341
    .line 1342
    iget-object v2, v2, La/nkr;->c:Ljava/lang/String;

    .line 1343
    .line 1344
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_13

    .line 1348
    :cond_31
    instance-of v0, v0, La/jkr;

    .line 1349
    .line 1350
    if-eqz v0, :cond_32

    .line 1351
    .line 1352
    invoke-static {v3}, La/kkb;->H(La/cp;)V

    .line 1353
    .line 1354
    .line 1355
    goto :goto_13

    .line 1356
    :cond_32
    invoke-static {}, La/t9f;->b()V

    .line 1357
    .line 1358
    .line 1359
    goto :goto_15

    .line 1360
    :cond_33
    :goto_14
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1361
    .line 1362
    :goto_15
    return-object v1

    .line 1363
    :pswitch_15
    check-cast p1, Ljava/util/List;

    .line 1364
    .line 1365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1366
    .line 1367
    .line 1368
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1369
    .line 1370
    .line 1371
    move-result p0

    .line 1372
    const/16 v0, 0xb

    .line 1373
    .line 1374
    const/4 v4, 0x0

    .line 1375
    if-eqz p0, :cond_36

    .line 1376
    .line 1377
    iget-object p0, v2, La/cp;->u:La/yfu0;

    .line 1378
    .line 1379
    check-cast p0, La/nux;

    .line 1380
    .line 1381
    iget-object p1, p0, La/nux;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1382
    .line 1383
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v1

    .line 1387
    check-cast v1, La/htq;

    .line 1388
    .line 1389
    iget-object v1, v1, La/htq;->b:La/ohm0;

    .line 1390
    .line 1391
    invoke-virtual {v1}, La/ohm0;->r()Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v1

    .line 1395
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1396
    .line 1397
    .line 1398
    iget-object p1, p0, La/nux;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1399
    .line 1400
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v1

    .line 1404
    check-cast v1, La/htq;

    .line 1405
    .line 1406
    iget-object v1, v1, La/htq;->b:La/ohm0;

    .line 1407
    .line 1408
    invoke-virtual {v1}, La/ohm0;->w()Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1413
    .line 1414
    .line 1415
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 1416
    .line 1417
    iget-object p1, p0, La/nux;->d:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1418
    .line 1419
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v1

    .line 1423
    check-cast v1, La/htq;

    .line 1424
    .line 1425
    iget-object v1, v1, La/htq;->b:La/ohm0;

    .line 1426
    .line 1427
    invoke-virtual {v1}, La/ohm0;->q()Ljava/lang/String;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v1

    .line 1431
    invoke-static {p1, v1, v4, v0}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1432
    .line 1433
    .line 1434
    iget-object p1, p0, La/nux;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1435
    .line 1436
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v1

    .line 1440
    check-cast v1, La/htq;

    .line 1441
    .line 1442
    iget-object v1, v1, La/htq;->b:La/ohm0;

    .line 1443
    .line 1444
    invoke-virtual {v1}, La/ohm0;->v()Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    invoke-static {p1, v1, v4, v0}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1449
    .line 1450
    .line 1451
    iget-object p1, p0, La/nux;->b:Landroid/widget/ImageView;

    .line 1452
    .line 1453
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v0

    .line 1457
    check-cast v0, La/htq;

    .line 1458
    .line 1459
    iget-object v0, v0, La/htq;->b:La/ohm0;

    .line 1460
    .line 1461
    invoke-virtual {v0}, La/ohm0;->o()I

    .line 1462
    .line 1463
    .line 1464
    move-result v0

    .line 1465
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1466
    .line 1467
    .line 1468
    iget-object p1, p0, La/nux;->c:Landroid/widget/ImageView;

    .line 1469
    .line 1470
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v0

    .line 1474
    check-cast v0, La/htq;

    .line 1475
    .line 1476
    iget-object v0, v0, La/htq;->b:La/ohm0;

    .line 1477
    .line 1478
    invoke-virtual {v0}, La/ohm0;->t()I

    .line 1479
    .line 1480
    .line 1481
    move-result v0

    .line 1482
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1483
    .line 1484
    .line 1485
    iget-object p1, p0, La/nux;->k:Landroid/widget/TextView;

    .line 1486
    .line 1487
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    check-cast v0, La/htq;

    .line 1492
    .line 1493
    iget-object v0, v0, La/htq;->c:La/ank0;

    .line 1494
    .line 1495
    iget-object v1, v2, La/cp;->w:Landroid/content/Context;

    .line 1496
    .line 1497
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v0

    .line 1501
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1502
    .line 1503
    .line 1504
    iget-object p1, p0, La/nux;->h:Landroid/widget/TextView;

    .line 1505
    .line 1506
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v0

    .line 1510
    check-cast v0, La/htq;

    .line 1511
    .line 1512
    iget-object v0, v0, La/htq;->d:La/ank0;

    .line 1513
    .line 1514
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1519
    .line 1520
    .line 1521
    iget-object p1, p0, La/nux;->f:Landroid/widget/TextView;

    .line 1522
    .line 1523
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v0

    .line 1527
    check-cast v0, La/htq;

    .line 1528
    .line 1529
    iget-object v0, v0, La/htq;->e:La/ank0;

    .line 1530
    .line 1531
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1536
    .line 1537
    .line 1538
    iget-object p1, p0, La/nux;->j:Landroid/widget/TextView;

    .line 1539
    .line 1540
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    check-cast v0, La/htq;

    .line 1545
    .line 1546
    iget-object v0, v0, La/htq;->f:La/ank0;

    .line 1547
    .line 1548
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v0

    .line 1552
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1553
    .line 1554
    .line 1555
    iget-object p1, p0, La/nux;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1556
    .line 1557
    invoke-static {p1}, La/jwb;->A(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    check-cast v0, La/htq;

    .line 1565
    .line 1566
    iget-object v0, v0, La/htq;->g:La/ank0;

    .line 1567
    .line 1568
    invoke-virtual {v0}, La/ank0;->a()Ljava/lang/String;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v0

    .line 1572
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1573
    .line 1574
    .line 1575
    move-result v0

    .line 1576
    if-lez v0, :cond_34

    .line 1577
    .line 1578
    move v0, v4

    .line 1579
    goto :goto_16

    .line 1580
    :cond_34
    const/16 v0, 0x8

    .line 1581
    .line 1582
    :goto_16
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v0

    .line 1589
    check-cast v0, La/htq;

    .line 1590
    .line 1591
    iget-object v0, v0, La/htq;->g:La/ank0;

    .line 1592
    .line 1593
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v0

    .line 1597
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1598
    .line 1599
    .line 1600
    iget-object p0, p0, La/nux;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1601
    .line 1602
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object p1

    .line 1606
    check-cast p1, La/htq;

    .line 1607
    .line 1608
    iget-boolean p1, p1, La/htq;->i:Z

    .line 1609
    .line 1610
    if-eqz p1, :cond_35

    .line 1611
    .line 1612
    const/4 v4, 0x2

    .line 1613
    :cond_35
    invoke-virtual {p0, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1614
    .line 1615
    .line 1616
    goto/16 :goto_1a

    .line 1617
    .line 1618
    :cond_36
    new-instance p0, Ljava/util/ArrayList;

    .line 1619
    .line 1620
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 1621
    .line 1622
    .line 1623
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1624
    .line 1625
    .line 1626
    move-result-object p1

    .line 1627
    :goto_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1628
    .line 1629
    .line 1630
    move-result v2

    .line 1631
    if-eqz v2, :cond_37

    .line 1632
    .line 1633
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v2

    .line 1637
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1638
    .line 1639
    .line 1640
    check-cast v2, Ljava/util/Collection;

    .line 1641
    .line 1642
    check-cast v2, Ljava/lang/Iterable;

    .line 1643
    .line 1644
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1645
    .line 1646
    .line 1647
    goto :goto_17

    .line 1648
    :cond_37
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1649
    .line 1650
    .line 1651
    move-result-object p0

    .line 1652
    :cond_38
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1653
    .line 1654
    .line 1655
    move-result p1

    .line 1656
    if-eqz p1, :cond_44

    .line 1657
    .line 1658
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object p1

    .line 1662
    check-cast p1, Ljava/util/List;

    .line 1663
    .line 1664
    new-instance v2, Ljava/util/ArrayList;

    .line 1665
    .line 1666
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1667
    .line 1668
    .line 1669
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1670
    .line 1671
    .line 1672
    move-result-object p1

    .line 1673
    :cond_39
    :goto_18
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1674
    .line 1675
    .line 1676
    move-result v5

    .line 1677
    if-eqz v5, :cond_3a

    .line 1678
    .line 1679
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v5

    .line 1683
    instance-of v6, v5, La/hfs;

    .line 1684
    .line 1685
    if-eqz v6, :cond_39

    .line 1686
    .line 1687
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1688
    .line 1689
    .line 1690
    goto :goto_18

    .line 1691
    :cond_3a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1692
    .line 1693
    .line 1694
    move-result-object p1

    .line 1695
    :goto_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1696
    .line 1697
    .line 1698
    move-result v2

    .line 1699
    if-eqz v2, :cond_38

    .line 1700
    .line 1701
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v2

    .line 1705
    check-cast v2, La/hfs;

    .line 1706
    .line 1707
    iget-object v5, v3, La/cp;->w:Landroid/content/Context;

    .line 1708
    .line 1709
    iget-object v6, v3, La/cp;->u:La/yfu0;

    .line 1710
    .line 1711
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1712
    .line 1713
    .line 1714
    instance-of v7, v2, La/dfs;

    .line 1715
    .line 1716
    if-eqz v7, :cond_3b

    .line 1717
    .line 1718
    check-cast v6, La/nux;

    .line 1719
    .line 1720
    iget-object v5, v6, La/nux;->b:Landroid/widget/ImageView;

    .line 1721
    .line 1722
    check-cast v2, La/dfs;

    .line 1723
    .line 1724
    iget v2, v2, La/dfs;->a:I

    .line 1725
    .line 1726
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1727
    .line 1728
    .line 1729
    goto :goto_19

    .line 1730
    :cond_3b
    instance-of v7, v2, La/ffs;

    .line 1731
    .line 1732
    if-eqz v7, :cond_3c

    .line 1733
    .line 1734
    check-cast v6, La/nux;

    .line 1735
    .line 1736
    iget-object v5, v6, La/nux;->c:Landroid/widget/ImageView;

    .line 1737
    .line 1738
    check-cast v2, La/ffs;

    .line 1739
    .line 1740
    iget v2, v2, La/ffs;->a:I

    .line 1741
    .line 1742
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1743
    .line 1744
    .line 1745
    goto :goto_19

    .line 1746
    :cond_3c
    instance-of v7, v2, La/efs;

    .line 1747
    .line 1748
    if-eqz v7, :cond_3d

    .line 1749
    .line 1750
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 1751
    .line 1752
    check-cast v6, La/nux;

    .line 1753
    .line 1754
    iget-object v5, v6, La/nux;->d:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1755
    .line 1756
    check-cast v2, La/efs;

    .line 1757
    .line 1758
    iget-object v2, v2, La/efs;->a:Ljava/lang/String;

    .line 1759
    .line 1760
    invoke-static {v5, v2, v4, v0}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1761
    .line 1762
    .line 1763
    goto :goto_19

    .line 1764
    :cond_3d
    instance-of v7, v2, La/gfs;

    .line 1765
    .line 1766
    if-eqz v7, :cond_3e

    .line 1767
    .line 1768
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 1769
    .line 1770
    check-cast v6, La/nux;

    .line 1771
    .line 1772
    iget-object v5, v6, La/nux;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1773
    .line 1774
    check-cast v2, La/gfs;

    .line 1775
    .line 1776
    iget-object v2, v2, La/gfs;->a:Ljava/lang/String;

    .line 1777
    .line 1778
    invoke-static {v5, v2, v4, v0}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1779
    .line 1780
    .line 1781
    goto :goto_19

    .line 1782
    :cond_3e
    instance-of v7, v2, La/zes;

    .line 1783
    .line 1784
    if-eqz v7, :cond_3f

    .line 1785
    .line 1786
    check-cast v6, La/nux;

    .line 1787
    .line 1788
    iget-object v6, v6, La/nux;->k:Landroid/widget/TextView;

    .line 1789
    .line 1790
    check-cast v2, La/zes;

    .line 1791
    .line 1792
    iget-object v2, v2, La/zes;->a:La/ank0;

    .line 1793
    .line 1794
    invoke-virtual {v2, v5}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v2

    .line 1798
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1799
    .line 1800
    .line 1801
    goto :goto_19

    .line 1802
    :cond_3f
    instance-of v7, v2, La/afs;

    .line 1803
    .line 1804
    if-eqz v7, :cond_40

    .line 1805
    .line 1806
    check-cast v6, La/nux;

    .line 1807
    .line 1808
    iget-object v6, v6, La/nux;->h:Landroid/widget/TextView;

    .line 1809
    .line 1810
    check-cast v2, La/afs;

    .line 1811
    .line 1812
    iget-object v2, v2, La/afs;->a:La/ank0;

    .line 1813
    .line 1814
    invoke-virtual {v2, v5}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v2

    .line 1818
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1819
    .line 1820
    .line 1821
    goto :goto_19

    .line 1822
    :cond_40
    instance-of v7, v2, La/yes;

    .line 1823
    .line 1824
    if-eqz v7, :cond_41

    .line 1825
    .line 1826
    check-cast v6, La/nux;

    .line 1827
    .line 1828
    iget-object v6, v6, La/nux;->f:Landroid/widget/TextView;

    .line 1829
    .line 1830
    check-cast v2, La/yes;

    .line 1831
    .line 1832
    iget-object v2, v2, La/yes;->a:La/ank0;

    .line 1833
    .line 1834
    invoke-virtual {v2, v5}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v2

    .line 1838
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1839
    .line 1840
    .line 1841
    goto/16 :goto_19

    .line 1842
    .line 1843
    :cond_41
    instance-of v7, v2, La/cfs;

    .line 1844
    .line 1845
    if-eqz v7, :cond_42

    .line 1846
    .line 1847
    check-cast v6, La/nux;

    .line 1848
    .line 1849
    iget-object v6, v6, La/nux;->j:Landroid/widget/TextView;

    .line 1850
    .line 1851
    check-cast v2, La/cfs;

    .line 1852
    .line 1853
    iget-object v2, v2, La/cfs;->a:La/ank0;

    .line 1854
    .line 1855
    invoke-virtual {v2, v5}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v2

    .line 1859
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1860
    .line 1861
    .line 1862
    goto/16 :goto_19

    .line 1863
    .line 1864
    :cond_42
    instance-of v7, v2, La/bfs;

    .line 1865
    .line 1866
    if-eqz v7, :cond_43

    .line 1867
    .line 1868
    check-cast v6, La/nux;

    .line 1869
    .line 1870
    iget-object v6, v6, La/nux;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1871
    .line 1872
    check-cast v2, La/bfs;

    .line 1873
    .line 1874
    iget-object v2, v2, La/bfs;->a:La/ank0;

    .line 1875
    .line 1876
    invoke-virtual {v2, v5}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v2

    .line 1880
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1881
    .line 1882
    .line 1883
    goto/16 :goto_19

    .line 1884
    .line 1885
    :cond_43
    invoke-static {}, La/t9f;->b()V

    .line 1886
    .line 1887
    .line 1888
    goto :goto_1b

    .line 1889
    :cond_44
    :goto_1a
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1890
    .line 1891
    :goto_1b
    return-object v1

    .line 1892
    :pswitch_16
    check-cast p1, Ljava/util/List;

    .line 1893
    .line 1894
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1895
    .line 1896
    .line 1897
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1898
    .line 1899
    .line 1900
    move-result p0

    .line 1901
    if-eqz p0, :cond_45

    .line 1902
    .line 1903
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1904
    .line 1905
    .line 1906
    move-result-object p0

    .line 1907
    iget-object p1, v2, La/cp;->w:Landroid/content/Context;

    .line 1908
    .line 1909
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 1910
    .line 1911
    check-cast p0, La/ysq;

    .line 1912
    .line 1913
    check-cast v0, La/owx;

    .line 1914
    .line 1915
    iget-object v1, v0, La/owx;->b:Landroid/widget/TextView;

    .line 1916
    .line 1917
    iget-object v2, p0, La/ysq;->a:Ljava/lang/String;

    .line 1918
    .line 1919
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1920
    .line 1921
    .line 1922
    iget-object v1, v0, La/owx;->c:Landroid/widget/TextView;

    .line 1923
    .line 1924
    iget-object v2, p0, La/ysq;->b:La/zmk0;

    .line 1925
    .line 1926
    invoke-virtual {v2, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v2

    .line 1930
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1931
    .line 1932
    .line 1933
    iget-object v0, v0, La/owx;->d:Landroid/widget/TextView;

    .line 1934
    .line 1935
    iget-object p0, p0, La/ysq;->c:La/zmk0;

    .line 1936
    .line 1937
    invoke-virtual {p0, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1938
    .line 1939
    .line 1940
    move-result-object p0

    .line 1941
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1942
    .line 1943
    .line 1944
    goto :goto_1e

    .line 1945
    :cond_45
    new-instance p0, Ljava/util/ArrayList;

    .line 1946
    .line 1947
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 1948
    .line 1949
    .line 1950
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1951
    .line 1952
    .line 1953
    move-result-object p1

    .line 1954
    :goto_1c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1955
    .line 1956
    .line 1957
    move-result v0

    .line 1958
    if-eqz v0, :cond_46

    .line 1959
    .line 1960
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v0

    .line 1964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1965
    .line 1966
    .line 1967
    check-cast v0, Ljava/util/Collection;

    .line 1968
    .line 1969
    check-cast v0, Ljava/lang/Iterable;

    .line 1970
    .line 1971
    invoke-static {p0, v0}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1972
    .line 1973
    .line 1974
    goto :goto_1c

    .line 1975
    :cond_46
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1976
    .line 1977
    .line 1978
    move-result-object p0

    .line 1979
    :goto_1d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1980
    .line 1981
    .line 1982
    move-result p1

    .line 1983
    if-eqz p1, :cond_49

    .line 1984
    .line 1985
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    move-result-object p1

    .line 1989
    check-cast p1, La/xsq;

    .line 1990
    .line 1991
    iget-object v0, v3, La/cp;->w:Landroid/content/Context;

    .line 1992
    .line 1993
    iget-object v2, v3, La/cp;->u:La/yfu0;

    .line 1994
    .line 1995
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1996
    .line 1997
    .line 1998
    instance-of v4, p1, La/vsq;

    .line 1999
    .line 2000
    if-eqz v4, :cond_47

    .line 2001
    .line 2002
    check-cast v2, La/owx;

    .line 2003
    .line 2004
    iget-object v2, v2, La/owx;->c:Landroid/widget/TextView;

    .line 2005
    .line 2006
    check-cast p1, La/vsq;

    .line 2007
    .line 2008
    iget-object p1, p1, La/vsq;->a:La/zmk0;

    .line 2009
    .line 2010
    invoke-virtual {p1, v0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2011
    .line 2012
    .line 2013
    move-result-object p1

    .line 2014
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2015
    .line 2016
    .line 2017
    goto :goto_1d

    .line 2018
    :cond_47
    instance-of v4, p1, La/wsq;

    .line 2019
    .line 2020
    if-eqz v4, :cond_48

    .line 2021
    .line 2022
    check-cast v2, La/owx;

    .line 2023
    .line 2024
    iget-object v2, v2, La/owx;->d:Landroid/widget/TextView;

    .line 2025
    .line 2026
    check-cast p1, La/wsq;

    .line 2027
    .line 2028
    iget-object p1, p1, La/wsq;->a:La/zmk0;

    .line 2029
    .line 2030
    invoke-virtual {p1, v0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2031
    .line 2032
    .line 2033
    move-result-object p1

    .line 2034
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2035
    .line 2036
    .line 2037
    goto :goto_1d

    .line 2038
    :cond_48
    invoke-static {}, La/t9f;->b()V

    .line 2039
    .line 2040
    .line 2041
    goto :goto_1f

    .line 2042
    :cond_49
    :goto_1e
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2043
    .line 2044
    :goto_1f
    return-object v1

    .line 2045
    :pswitch_17
    check-cast p1, Ljava/util/List;

    .line 2046
    .line 2047
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 2048
    .line 2049
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 2050
    .line 2051
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2052
    .line 2053
    .line 2054
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2055
    .line 2056
    .line 2057
    move-result v4

    .line 2058
    if-eqz v4, :cond_4a

    .line 2059
    .line 2060
    move-object p0, v0

    .line 2061
    check-cast p0, La/tcu0;

    .line 2062
    .line 2063
    iget-object p0, p0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2064
    .line 2065
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2066
    .line 2067
    .line 2068
    move-result-object p1

    .line 2069
    check-cast p1, La/lpo;

    .line 2070
    .line 2071
    iget-object p1, p1, La/lpo;->a:Ljava/lang/String;

    .line 2072
    .line 2073
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setTitle(Ljava/lang/CharSequence;)V

    .line 2074
    .line 2075
    .line 2076
    check-cast v0, La/tcu0;

    .line 2077
    .line 2078
    iget-object p0, v0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2079
    .line 2080
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2081
    .line 2082
    .line 2083
    move-result-object p1

    .line 2084
    check-cast p1, La/lpo;

    .line 2085
    .line 2086
    iget-object p1, p1, La/lpo;->b:Ljava/lang/String;

    .line 2087
    .line 2088
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 2089
    .line 2090
    .line 2091
    goto :goto_22

    .line 2092
    :cond_4a
    new-instance v0, Ljava/util/ArrayList;

    .line 2093
    .line 2094
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2095
    .line 2096
    .line 2097
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2098
    .line 2099
    .line 2100
    move-result-object p1

    .line 2101
    :goto_20
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2102
    .line 2103
    .line 2104
    move-result v2

    .line 2105
    if-eqz v2, :cond_4b

    .line 2106
    .line 2107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v2

    .line 2111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2112
    .line 2113
    .line 2114
    check-cast v2, Ljava/util/Collection;

    .line 2115
    .line 2116
    check-cast v2, Ljava/lang/Iterable;

    .line 2117
    .line 2118
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2119
    .line 2120
    .line 2121
    goto :goto_20

    .line 2122
    :cond_4b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2123
    .line 2124
    .line 2125
    move-result-object p1

    .line 2126
    :goto_21
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2127
    .line 2128
    .line 2129
    move-result v0

    .line 2130
    if-eqz v0, :cond_4e

    .line 2131
    .line 2132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v0

    .line 2136
    check-cast v0, La/kpo;

    .line 2137
    .line 2138
    if-eqz v0, :cond_4d

    .line 2139
    .line 2140
    instance-of v2, v0, La/jpo;

    .line 2141
    .line 2142
    if-eqz v2, :cond_4c

    .line 2143
    .line 2144
    move-object v0, p0

    .line 2145
    check-cast v0, La/tcu0;

    .line 2146
    .line 2147
    iget-object v0, v0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2148
    .line 2149
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v2

    .line 2153
    check-cast v2, La/lpo;

    .line 2154
    .line 2155
    iget-object v2, v2, La/lpo;->a:Ljava/lang/String;

    .line 2156
    .line 2157
    invoke-virtual {v0, v2}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setTitle(Ljava/lang/CharSequence;)V

    .line 2158
    .line 2159
    .line 2160
    goto :goto_21

    .line 2161
    :cond_4c
    instance-of v0, v0, La/ipo;

    .line 2162
    .line 2163
    if-eqz v0, :cond_4d

    .line 2164
    .line 2165
    move-object v0, p0

    .line 2166
    check-cast v0, La/tcu0;

    .line 2167
    .line 2168
    iget-object v0, v0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2169
    .line 2170
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v2

    .line 2174
    check-cast v2, La/lpo;

    .line 2175
    .line 2176
    iget-object v2, v2, La/lpo;->b:Ljava/lang/String;

    .line 2177
    .line 2178
    invoke-virtual {v0, v2}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 2179
    .line 2180
    .line 2181
    goto :goto_21

    .line 2182
    :cond_4d
    invoke-static {}, La/t9f;->b()V

    .line 2183
    .line 2184
    .line 2185
    goto :goto_23

    .line 2186
    :cond_4e
    :goto_22
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2187
    .line 2188
    :goto_23
    return-object v1

    .line 2189
    :pswitch_18
    check-cast p1, Ljava/util/List;

    .line 2190
    .line 2191
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 2192
    .line 2193
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 2194
    .line 2195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2196
    .line 2197
    .line 2198
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2199
    .line 2200
    .line 2201
    move-result v4

    .line 2202
    if-eqz v4, :cond_4f

    .line 2203
    .line 2204
    move-object p0, v0

    .line 2205
    check-cast p0, La/tcu0;

    .line 2206
    .line 2207
    iget-object p0, p0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2208
    .line 2209
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2210
    .line 2211
    .line 2212
    move-result-object p1

    .line 2213
    check-cast p1, La/hpo;

    .line 2214
    .line 2215
    iget-object p1, p1, La/hpo;->a:Ljava/lang/String;

    .line 2216
    .line 2217
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setTitle(Ljava/lang/CharSequence;)V

    .line 2218
    .line 2219
    .line 2220
    move-object p0, v0

    .line 2221
    check-cast p0, La/tcu0;

    .line 2222
    .line 2223
    iget-object p0, p0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2224
    .line 2225
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2226
    .line 2227
    .line 2228
    move-result-object p1

    .line 2229
    check-cast p1, La/hpo;

    .line 2230
    .line 2231
    iget-object p1, p1, La/hpo;->b:Ljava/lang/String;

    .line 2232
    .line 2233
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setCoefLabel(Ljava/lang/CharSequence;)V

    .line 2234
    .line 2235
    .line 2236
    check-cast v0, La/tcu0;

    .line 2237
    .line 2238
    iget-object p0, v0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2239
    .line 2240
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2241
    .line 2242
    .line 2243
    move-result-object p1

    .line 2244
    check-cast p1, La/hpo;

    .line 2245
    .line 2246
    iget-object p1, p1, La/hpo;->c:Ljava/lang/String;

    .line 2247
    .line 2248
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setCoefValue(Ljava/lang/CharSequence;)V

    .line 2249
    .line 2250
    .line 2251
    goto/16 :goto_26

    .line 2252
    .line 2253
    :cond_4f
    new-instance v0, Ljava/util/ArrayList;

    .line 2254
    .line 2255
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2256
    .line 2257
    .line 2258
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2259
    .line 2260
    .line 2261
    move-result-object p1

    .line 2262
    :goto_24
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2263
    .line 2264
    .line 2265
    move-result v2

    .line 2266
    if-eqz v2, :cond_50

    .line 2267
    .line 2268
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v2

    .line 2272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2273
    .line 2274
    .line 2275
    check-cast v2, Ljava/util/Collection;

    .line 2276
    .line 2277
    check-cast v2, Ljava/lang/Iterable;

    .line 2278
    .line 2279
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2280
    .line 2281
    .line 2282
    goto :goto_24

    .line 2283
    :cond_50
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2284
    .line 2285
    .line 2286
    move-result-object p1

    .line 2287
    :goto_25
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2288
    .line 2289
    .line 2290
    move-result v0

    .line 2291
    if-eqz v0, :cond_54

    .line 2292
    .line 2293
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v0

    .line 2297
    check-cast v0, La/gpo;

    .line 2298
    .line 2299
    if-eqz v0, :cond_53

    .line 2300
    .line 2301
    instance-of v2, v0, La/fpo;

    .line 2302
    .line 2303
    if-eqz v2, :cond_51

    .line 2304
    .line 2305
    move-object v0, p0

    .line 2306
    check-cast v0, La/tcu0;

    .line 2307
    .line 2308
    iget-object v0, v0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2309
    .line 2310
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v2

    .line 2314
    check-cast v2, La/hpo;

    .line 2315
    .line 2316
    iget-object v2, v2, La/hpo;->a:Ljava/lang/String;

    .line 2317
    .line 2318
    invoke-virtual {v0, v2}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setTitle(Ljava/lang/CharSequence;)V

    .line 2319
    .line 2320
    .line 2321
    goto :goto_25

    .line 2322
    :cond_51
    instance-of v2, v0, La/dpo;

    .line 2323
    .line 2324
    if-eqz v2, :cond_52

    .line 2325
    .line 2326
    move-object v0, p0

    .line 2327
    check-cast v0, La/tcu0;

    .line 2328
    .line 2329
    iget-object v0, v0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2330
    .line 2331
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v2

    .line 2335
    check-cast v2, La/hpo;

    .line 2336
    .line 2337
    iget-object v2, v2, La/hpo;->b:Ljava/lang/String;

    .line 2338
    .line 2339
    invoke-virtual {v0, v2}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setCoefLabel(Ljava/lang/CharSequence;)V

    .line 2340
    .line 2341
    .line 2342
    goto :goto_25

    .line 2343
    :cond_52
    instance-of v0, v0, La/epo;

    .line 2344
    .line 2345
    if-eqz v0, :cond_53

    .line 2346
    .line 2347
    move-object v0, p0

    .line 2348
    check-cast v0, La/tcu0;

    .line 2349
    .line 2350
    iget-object v0, v0, La/tcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 2351
    .line 2352
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v2

    .line 2356
    check-cast v2, La/hpo;

    .line 2357
    .line 2358
    iget-object v2, v2, La/hpo;->c:Ljava/lang/String;

    .line 2359
    .line 2360
    invoke-virtual {v0, v2}, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->setCoefValue(Ljava/lang/CharSequence;)V

    .line 2361
    .line 2362
    .line 2363
    goto :goto_25

    .line 2364
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 2365
    .line 2366
    .line 2367
    goto :goto_27

    .line 2368
    :cond_54
    :goto_26
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2369
    .line 2370
    :goto_27
    return-object v1

    .line 2371
    :pswitch_19
    check-cast p1, Ljava/util/List;

    .line 2372
    .line 2373
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 2374
    .line 2375
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 2376
    .line 2377
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2378
    .line 2379
    .line 2380
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2381
    .line 2382
    .line 2383
    move-result v4

    .line 2384
    if-eqz v4, :cond_55

    .line 2385
    .line 2386
    move-object p0, v0

    .line 2387
    check-cast p0, La/m9l;

    .line 2388
    .line 2389
    iget-object p0, p0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2390
    .line 2391
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2392
    .line 2393
    .line 2394
    move-result-object p1

    .line 2395
    check-cast p1, La/t9l;

    .line 2396
    .line 2397
    iget-object p1, p1, La/t9l;->b:La/q9l;

    .line 2398
    .line 2399
    iget-object p1, p1, La/q9l;->a:Ljava/lang/String;

    .line 2400
    .line 2401
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v1

    .line 2405
    check-cast v1, La/t9l;

    .line 2406
    .line 2407
    iget-object v1, v1, La/t9l;->b:La/q9l;

    .line 2408
    .line 2409
    iget-object v1, v1, La/q9l;->b:Ljava/lang/String;

    .line 2410
    .line 2411
    invoke-virtual {p0, p1, v1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2412
    .line 2413
    .line 2414
    move-object p0, v0

    .line 2415
    check-cast p0, La/m9l;

    .line 2416
    .line 2417
    iget-object p0, p0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2418
    .line 2419
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2420
    .line 2421
    .line 2422
    move-result-object p1

    .line 2423
    check-cast p1, La/t9l;

    .line 2424
    .line 2425
    iget-object p1, p1, La/t9l;->c:Ljava/lang/String;

    .line 2426
    .line 2427
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->setDate(Ljava/lang/String;)V

    .line 2428
    .line 2429
    .line 2430
    move-object p0, v0

    .line 2431
    check-cast p0, La/m9l;

    .line 2432
    .line 2433
    iget-object p0, p0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2434
    .line 2435
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2436
    .line 2437
    .line 2438
    move-result-object p1

    .line 2439
    check-cast p1, La/t9l;

    .line 2440
    .line 2441
    iget-object p1, p1, La/t9l;->e:Ljava/lang/String;

    .line 2442
    .line 2443
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->setTime(Ljava/lang/String;)V

    .line 2444
    .line 2445
    .line 2446
    move-object p0, v0

    .line 2447
    check-cast p0, La/m9l;

    .line 2448
    .line 2449
    iget-object p0, p0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2450
    .line 2451
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2452
    .line 2453
    .line 2454
    move-result-object p1

    .line 2455
    check-cast p1, La/t9l;

    .line 2456
    .line 2457
    iget-object p1, p1, La/t9l;->d:Ljava/lang/String;

    .line 2458
    .line 2459
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->setChampName(Ljava/lang/String;)V

    .line 2460
    .line 2461
    .line 2462
    check-cast v0, La/m9l;

    .line 2463
    .line 2464
    iget-object p0, v0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2465
    .line 2466
    iget-object p1, v2, La/cp;->w:Landroid/content/Context;

    .line 2467
    .line 2468
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v0

    .line 2472
    check-cast v0, La/t9l;

    .line 2473
    .line 2474
    iget v0, v0, La/t9l;->f:I

    .line 2475
    .line 2476
    invoke-static {v0, p1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2477
    .line 2478
    .line 2479
    move-result-object p1

    .line 2480
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2481
    .line 2482
    .line 2483
    goto/16 :goto_2a

    .line 2484
    .line 2485
    :cond_55
    new-instance v0, Ljava/util/ArrayList;

    .line 2486
    .line 2487
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2488
    .line 2489
    .line 2490
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2491
    .line 2492
    .line 2493
    move-result-object p1

    .line 2494
    :goto_28
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2495
    .line 2496
    .line 2497
    move-result v2

    .line 2498
    if-eqz v2, :cond_56

    .line 2499
    .line 2500
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2501
    .line 2502
    .line 2503
    move-result-object v2

    .line 2504
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2505
    .line 2506
    .line 2507
    check-cast v2, Ljava/util/Collection;

    .line 2508
    .line 2509
    check-cast v2, Ljava/lang/Iterable;

    .line 2510
    .line 2511
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2512
    .line 2513
    .line 2514
    goto :goto_28

    .line 2515
    :cond_56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2516
    .line 2517
    .line 2518
    move-result-object p1

    .line 2519
    :goto_29
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2520
    .line 2521
    .line 2522
    move-result v0

    .line 2523
    if-eqz v0, :cond_5c

    .line 2524
    .line 2525
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v0

    .line 2529
    check-cast v0, La/s9l;

    .line 2530
    .line 2531
    if-eqz v0, :cond_5b

    .line 2532
    .line 2533
    instance-of v2, v0, La/q9l;

    .line 2534
    .line 2535
    if-eqz v2, :cond_57

    .line 2536
    .line 2537
    move-object v0, p0

    .line 2538
    check-cast v0, La/m9l;

    .line 2539
    .line 2540
    iget-object v0, v0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2541
    .line 2542
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v2

    .line 2546
    check-cast v2, La/t9l;

    .line 2547
    .line 2548
    iget-object v2, v2, La/t9l;->b:La/q9l;

    .line 2549
    .line 2550
    iget-object v2, v2, La/q9l;->a:Ljava/lang/String;

    .line 2551
    .line 2552
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v4

    .line 2556
    check-cast v4, La/t9l;

    .line 2557
    .line 2558
    iget-object v4, v4, La/t9l;->b:La/q9l;

    .line 2559
    .line 2560
    iget-object v4, v4, La/q9l;->b:Ljava/lang/String;

    .line 2561
    .line 2562
    invoke-virtual {v0, v2, v4}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2563
    .line 2564
    .line 2565
    goto :goto_29

    .line 2566
    :cond_57
    instance-of v2, v0, La/p9l;

    .line 2567
    .line 2568
    if-eqz v2, :cond_58

    .line 2569
    .line 2570
    move-object v0, p0

    .line 2571
    check-cast v0, La/m9l;

    .line 2572
    .line 2573
    iget-object v0, v0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2574
    .line 2575
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2576
    .line 2577
    .line 2578
    move-result-object v2

    .line 2579
    check-cast v2, La/t9l;

    .line 2580
    .line 2581
    iget-object v2, v2, La/t9l;->c:Ljava/lang/String;

    .line 2582
    .line 2583
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->setDate(Ljava/lang/String;)V

    .line 2584
    .line 2585
    .line 2586
    goto :goto_29

    .line 2587
    :cond_58
    instance-of v2, v0, La/o9l;

    .line 2588
    .line 2589
    if-eqz v2, :cond_59

    .line 2590
    .line 2591
    move-object v0, p0

    .line 2592
    check-cast v0, La/m9l;

    .line 2593
    .line 2594
    iget-object v0, v0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2595
    .line 2596
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v2

    .line 2600
    check-cast v2, La/t9l;

    .line 2601
    .line 2602
    iget-object v2, v2, La/t9l;->d:Ljava/lang/String;

    .line 2603
    .line 2604
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->setChampName(Ljava/lang/String;)V

    .line 2605
    .line 2606
    .line 2607
    goto :goto_29

    .line 2608
    :cond_59
    instance-of v2, v0, La/r9l;

    .line 2609
    .line 2610
    if-eqz v2, :cond_5a

    .line 2611
    .line 2612
    move-object v0, p0

    .line 2613
    check-cast v0, La/m9l;

    .line 2614
    .line 2615
    iget-object v0, v0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2616
    .line 2617
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v2

    .line 2621
    check-cast v2, La/t9l;

    .line 2622
    .line 2623
    iget-object v2, v2, La/t9l;->e:Ljava/lang/String;

    .line 2624
    .line 2625
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->setTime(Ljava/lang/String;)V

    .line 2626
    .line 2627
    .line 2628
    goto :goto_29

    .line 2629
    :cond_5a
    instance-of v0, v0, La/n9l;

    .line 2630
    .line 2631
    if-eqz v0, :cond_5b

    .line 2632
    .line 2633
    move-object v0, p0

    .line 2634
    check-cast v0, La/m9l;

    .line 2635
    .line 2636
    iget-object v0, v0, La/m9l;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 2637
    .line 2638
    iget-object v2, v3, La/cp;->w:Landroid/content/Context;

    .line 2639
    .line 2640
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v4

    .line 2644
    check-cast v4, La/t9l;

    .line 2645
    .line 2646
    iget v4, v4, La/t9l;->f:I

    .line 2647
    .line 2648
    invoke-static {v4, v2}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2649
    .line 2650
    .line 2651
    move-result-object v2

    .line 2652
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2653
    .line 2654
    .line 2655
    goto/16 :goto_29

    .line 2656
    .line 2657
    :cond_5b
    invoke-static {}, La/t9f;->b()V

    .line 2658
    .line 2659
    .line 2660
    goto :goto_2b

    .line 2661
    :cond_5c
    :goto_2a
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2662
    .line 2663
    :goto_2b
    return-object v1

    .line 2664
    :pswitch_1a
    check-cast p1, Ljava/util/List;

    .line 2665
    .line 2666
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 2667
    .line 2668
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 2669
    .line 2670
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2671
    .line 2672
    .line 2673
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2674
    .line 2675
    .line 2676
    move-result v4

    .line 2677
    const/4 v5, 0x3

    .line 2678
    const v6, 0x7f080cf7

    .line 2679
    .line 2680
    .line 2681
    const v7, 0x7f0804b3

    .line 2682
    .line 2683
    .line 2684
    if-eqz v4, :cond_5d

    .line 2685
    .line 2686
    move-object p0, v0

    .line 2687
    check-cast p0, La/h9l;

    .line 2688
    .line 2689
    iget-object p0, p0, La/h9l;->a:Landroid/widget/FrameLayout;

    .line 2690
    .line 2691
    iget-object p1, v2, La/cp;->w:Landroid/content/Context;

    .line 2692
    .line 2693
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v1

    .line 2697
    check-cast v1, La/l9l;

    .line 2698
    .line 2699
    invoke-static {v7, p1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2700
    .line 2701
    .line 2702
    move-result-object p1

    .line 2703
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2704
    .line 2705
    .line 2706
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 2707
    .line 2708
    check-cast v0, La/h9l;

    .line 2709
    .line 2710
    iget-object p0, v0, La/h9l;->b:Landroid/widget/ImageView;

    .line 2711
    .line 2712
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2713
    .line 2714
    .line 2715
    move-result-object p1

    .line 2716
    check-cast p1, La/l9l;

    .line 2717
    .line 2718
    iget-object p1, p1, La/l9l;->b:Ljava/lang/String;

    .line 2719
    .line 2720
    invoke-static {p0, p1, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2721
    .line 2722
    .line 2723
    goto :goto_2e

    .line 2724
    :cond_5d
    new-instance v0, Ljava/util/ArrayList;

    .line 2725
    .line 2726
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2727
    .line 2728
    .line 2729
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2730
    .line 2731
    .line 2732
    move-result-object p1

    .line 2733
    :goto_2c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2734
    .line 2735
    .line 2736
    move-result v2

    .line 2737
    if-eqz v2, :cond_5e

    .line 2738
    .line 2739
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v2

    .line 2743
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2744
    .line 2745
    .line 2746
    check-cast v2, Ljava/util/Collection;

    .line 2747
    .line 2748
    check-cast v2, Ljava/lang/Iterable;

    .line 2749
    .line 2750
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2751
    .line 2752
    .line 2753
    goto :goto_2c

    .line 2754
    :cond_5e
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2755
    .line 2756
    .line 2757
    move-result-object p1

    .line 2758
    :goto_2d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2759
    .line 2760
    .line 2761
    move-result v0

    .line 2762
    if-eqz v0, :cond_61

    .line 2763
    .line 2764
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2765
    .line 2766
    .line 2767
    move-result-object v0

    .line 2768
    check-cast v0, La/k9l;

    .line 2769
    .line 2770
    if-eqz v0, :cond_60

    .line 2771
    .line 2772
    instance-of v2, v0, La/i9l;

    .line 2773
    .line 2774
    if-eqz v2, :cond_5f

    .line 2775
    .line 2776
    move-object v0, p0

    .line 2777
    check-cast v0, La/h9l;

    .line 2778
    .line 2779
    iget-object v0, v0, La/h9l;->a:Landroid/widget/FrameLayout;

    .line 2780
    .line 2781
    iget-object v2, v3, La/cp;->w:Landroid/content/Context;

    .line 2782
    .line 2783
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v4

    .line 2787
    check-cast v4, La/l9l;

    .line 2788
    .line 2789
    invoke-static {v7, v2}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2790
    .line 2791
    .line 2792
    move-result-object v2

    .line 2793
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2794
    .line 2795
    .line 2796
    goto :goto_2d

    .line 2797
    :cond_5f
    instance-of v0, v0, La/j9l;

    .line 2798
    .line 2799
    if-eqz v0, :cond_60

    .line 2800
    .line 2801
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2802
    .line 2803
    move-object v0, p0

    .line 2804
    check-cast v0, La/h9l;

    .line 2805
    .line 2806
    iget-object v0, v0, La/h9l;->b:Landroid/widget/ImageView;

    .line 2807
    .line 2808
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2809
    .line 2810
    .line 2811
    move-result-object v2

    .line 2812
    check-cast v2, La/l9l;

    .line 2813
    .line 2814
    iget-object v2, v2, La/l9l;->b:Ljava/lang/String;

    .line 2815
    .line 2816
    invoke-static {v0, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2817
    .line 2818
    .line 2819
    goto :goto_2d

    .line 2820
    :cond_60
    invoke-static {}, La/t9f;->b()V

    .line 2821
    .line 2822
    .line 2823
    goto :goto_2f

    .line 2824
    :cond_61
    :goto_2e
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2825
    .line 2826
    :goto_2f
    return-object v1

    .line 2827
    :pswitch_1b
    check-cast p1, Ljava/util/List;

    .line 2828
    .line 2829
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 2830
    .line 2831
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 2832
    .line 2833
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2834
    .line 2835
    .line 2836
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2837
    .line 2838
    .line 2839
    move-result v4

    .line 2840
    if-eqz v4, :cond_62

    .line 2841
    .line 2842
    move-object p0, v0

    .line 2843
    check-cast p0, La/w2l;

    .line 2844
    .line 2845
    iget-object p0, p0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 2846
    .line 2847
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2848
    .line 2849
    .line 2850
    move-result-object p1

    .line 2851
    check-cast p1, La/v2l;

    .line 2852
    .line 2853
    iget-object p1, p1, La/v2l;->b:Ljava/lang/String;

    .line 2854
    .line 2855
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setFirstTeamLogo(Ljava/lang/String;)V

    .line 2856
    .line 2857
    .line 2858
    move-object p0, v0

    .line 2859
    check-cast p0, La/w2l;

    .line 2860
    .line 2861
    iget-object p0, p0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 2862
    .line 2863
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2864
    .line 2865
    .line 2866
    move-result-object p1

    .line 2867
    check-cast p1, La/v2l;

    .line 2868
    .line 2869
    iget-object p1, p1, La/v2l;->c:Ljava/lang/String;

    .line 2870
    .line 2871
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setSecondTeamLogo(Ljava/lang/String;)V

    .line 2872
    .line 2873
    .line 2874
    move-object p0, v0

    .line 2875
    check-cast p0, La/w2l;

    .line 2876
    .line 2877
    iget-object p0, p0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 2878
    .line 2879
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2880
    .line 2881
    .line 2882
    move-result-object p1

    .line 2883
    check-cast p1, La/v2l;

    .line 2884
    .line 2885
    iget-object p1, p1, La/v2l;->d:Ljava/util/ArrayList;

    .line 2886
    .line 2887
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setHeroPick(Ljava/util/List;)V

    .line 2888
    .line 2889
    .line 2890
    check-cast v0, La/w2l;

    .line 2891
    .line 2892
    iget-object p0, v0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 2893
    .line 2894
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2895
    .line 2896
    .line 2897
    move-result-object p1

    .line 2898
    check-cast p1, La/v2l;

    .line 2899
    .line 2900
    iget-object p1, p1, La/v2l;->e:La/s2l;

    .line 2901
    .line 2902
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setScrollPosition(La/s2l;)V

    .line 2903
    .line 2904
    .line 2905
    goto/16 :goto_32

    .line 2906
    .line 2907
    :cond_62
    new-instance v0, Ljava/util/ArrayList;

    .line 2908
    .line 2909
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2910
    .line 2911
    .line 2912
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2913
    .line 2914
    .line 2915
    move-result-object p1

    .line 2916
    :goto_30
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2917
    .line 2918
    .line 2919
    move-result v2

    .line 2920
    if-eqz v2, :cond_63

    .line 2921
    .line 2922
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2923
    .line 2924
    .line 2925
    move-result-object v2

    .line 2926
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2927
    .line 2928
    .line 2929
    check-cast v2, Ljava/util/Collection;

    .line 2930
    .line 2931
    check-cast v2, Ljava/lang/Iterable;

    .line 2932
    .line 2933
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2934
    .line 2935
    .line 2936
    goto :goto_30

    .line 2937
    :cond_63
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2938
    .line 2939
    .line 2940
    move-result-object p1

    .line 2941
    :goto_31
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2942
    .line 2943
    .line 2944
    move-result v0

    .line 2945
    if-eqz v0, :cond_68

    .line 2946
    .line 2947
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2948
    .line 2949
    .line 2950
    move-result-object v0

    .line 2951
    check-cast v0, La/u2l;

    .line 2952
    .line 2953
    if-eqz v0, :cond_67

    .line 2954
    .line 2955
    instance-of v2, v0, La/q2l;

    .line 2956
    .line 2957
    if-eqz v2, :cond_64

    .line 2958
    .line 2959
    move-object v0, p0

    .line 2960
    check-cast v0, La/w2l;

    .line 2961
    .line 2962
    iget-object v0, v0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 2963
    .line 2964
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2965
    .line 2966
    .line 2967
    move-result-object v2

    .line 2968
    check-cast v2, La/v2l;

    .line 2969
    .line 2970
    iget-object v2, v2, La/v2l;->b:Ljava/lang/String;

    .line 2971
    .line 2972
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setFirstTeamLogo(Ljava/lang/String;)V

    .line 2973
    .line 2974
    .line 2975
    goto :goto_31

    .line 2976
    :cond_64
    instance-of v2, v0, La/t2l;

    .line 2977
    .line 2978
    if-eqz v2, :cond_65

    .line 2979
    .line 2980
    move-object v0, p0

    .line 2981
    check-cast v0, La/w2l;

    .line 2982
    .line 2983
    iget-object v0, v0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 2984
    .line 2985
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2986
    .line 2987
    .line 2988
    move-result-object v2

    .line 2989
    check-cast v2, La/v2l;

    .line 2990
    .line 2991
    iget-object v2, v2, La/v2l;->c:Ljava/lang/String;

    .line 2992
    .line 2993
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setSecondTeamLogo(Ljava/lang/String;)V

    .line 2994
    .line 2995
    .line 2996
    goto :goto_31

    .line 2997
    :cond_65
    instance-of v2, v0, La/r2l;

    .line 2998
    .line 2999
    if-eqz v2, :cond_66

    .line 3000
    .line 3001
    move-object v0, p0

    .line 3002
    check-cast v0, La/w2l;

    .line 3003
    .line 3004
    iget-object v0, v0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 3005
    .line 3006
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3007
    .line 3008
    .line 3009
    move-result-object v2

    .line 3010
    check-cast v2, La/v2l;

    .line 3011
    .line 3012
    iget-object v2, v2, La/v2l;->d:Ljava/util/ArrayList;

    .line 3013
    .line 3014
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setHeroPick(Ljava/util/List;)V

    .line 3015
    .line 3016
    .line 3017
    goto :goto_31

    .line 3018
    :cond_66
    instance-of v0, v0, La/s2l;

    .line 3019
    .line 3020
    if-eqz v0, :cond_67

    .line 3021
    .line 3022
    move-object v0, p0

    .line 3023
    check-cast v0, La/w2l;

    .line 3024
    .line 3025
    iget-object v0, v0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 3026
    .line 3027
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3028
    .line 3029
    .line 3030
    move-result-object v2

    .line 3031
    check-cast v2, La/v2l;

    .line 3032
    .line 3033
    iget-object v2, v2, La/v2l;->e:La/s2l;

    .line 3034
    .line 3035
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setScrollPosition(La/s2l;)V

    .line 3036
    .line 3037
    .line 3038
    goto :goto_31

    .line 3039
    :cond_67
    invoke-static {}, La/t9f;->b()V

    .line 3040
    .line 3041
    .line 3042
    goto :goto_33

    .line 3043
    :cond_68
    :goto_32
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3044
    .line 3045
    :goto_33
    return-object v1

    .line 3046
    :pswitch_1c
    check-cast p1, Ljava/util/List;

    .line 3047
    .line 3048
    iget-object p0, v3, La/cp;->u:La/yfu0;

    .line 3049
    .line 3050
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 3051
    .line 3052
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3053
    .line 3054
    .line 3055
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 3056
    .line 3057
    .line 3058
    move-result v4

    .line 3059
    if-eqz v4, :cond_69

    .line 3060
    .line 3061
    move-object p0, v0

    .line 3062
    check-cast p0, La/l2l;

    .line 3063
    .line 3064
    iget-object p0, p0, La/l2l;->c:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3065
    .line 3066
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3067
    .line 3068
    .line 3069
    move-result-object p1

    .line 3070
    check-cast p1, La/i2l;

    .line 3071
    .line 3072
    iget-object p1, p1, La/i2l;->b:Ljava/lang/String;

    .line 3073
    .line 3074
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3075
    .line 3076
    .line 3077
    move-result-object v1

    .line 3078
    check-cast v1, La/i2l;

    .line 3079
    .line 3080
    iget v1, v1, La/i2l;->h:I

    .line 3081
    .line 3082
    invoke-virtual {p0, v1, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->b(ILjava/lang/String;)V

    .line 3083
    .line 3084
    .line 3085
    move-object p0, v0

    .line 3086
    check-cast p0, La/l2l;

    .line 3087
    .line 3088
    iget-object p0, p0, La/l2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3089
    .line 3090
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3091
    .line 3092
    .line 3093
    move-result-object p1

    .line 3094
    check-cast p1, La/i2l;

    .line 3095
    .line 3096
    iget-object p1, p1, La/i2l;->c:Ljava/lang/String;

    .line 3097
    .line 3098
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3099
    .line 3100
    .line 3101
    move-result-object v1

    .line 3102
    check-cast v1, La/i2l;

    .line 3103
    .line 3104
    iget v1, v1, La/i2l;->i:I

    .line 3105
    .line 3106
    invoke-virtual {p0, v1, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->b(ILjava/lang/String;)V

    .line 3107
    .line 3108
    .line 3109
    move-object p0, v0

    .line 3110
    check-cast p0, La/l2l;

    .line 3111
    .line 3112
    iget-object p0, p0, La/l2l;->c:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3113
    .line 3114
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3115
    .line 3116
    .line 3117
    move-result-object p1

    .line 3118
    check-cast p1, La/i2l;

    .line 3119
    .line 3120
    iget-object p1, p1, La/i2l;->d:Ljava/lang/String;

    .line 3121
    .line 3122
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickNumber(Ljava/lang/String;)V

    .line 3123
    .line 3124
    .line 3125
    move-object p0, v0

    .line 3126
    check-cast p0, La/l2l;

    .line 3127
    .line 3128
    iget-object p0, p0, La/l2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3129
    .line 3130
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3131
    .line 3132
    .line 3133
    move-result-object p1

    .line 3134
    check-cast p1, La/i2l;

    .line 3135
    .line 3136
    iget-object p1, p1, La/i2l;->e:Ljava/lang/String;

    .line 3137
    .line 3138
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickNumber(Ljava/lang/String;)V

    .line 3139
    .line 3140
    .line 3141
    move-object p0, v0

    .line 3142
    check-cast p0, La/l2l;

    .line 3143
    .line 3144
    iget-object p0, p0, La/l2l;->c:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3145
    .line 3146
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3147
    .line 3148
    .line 3149
    move-result-object p1

    .line 3150
    check-cast p1, La/i2l;

    .line 3151
    .line 3152
    iget-boolean p1, p1, La/i2l;->f:Z

    .line 3153
    .line 3154
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickLabel(Z)V

    .line 3155
    .line 3156
    .line 3157
    check-cast v0, La/l2l;

    .line 3158
    .line 3159
    iget-object p0, v0, La/l2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3160
    .line 3161
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 3162
    .line 3163
    .line 3164
    move-result-object p1

    .line 3165
    check-cast p1, La/i2l;

    .line 3166
    .line 3167
    iget-boolean p1, p1, La/i2l;->g:Z

    .line 3168
    .line 3169
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickLabel(Z)V

    .line 3170
    .line 3171
    .line 3172
    goto/16 :goto_36

    .line 3173
    .line 3174
    :cond_69
    new-instance v0, Ljava/util/ArrayList;

    .line 3175
    .line 3176
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3177
    .line 3178
    .line 3179
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3180
    .line 3181
    .line 3182
    move-result-object p1

    .line 3183
    :goto_34
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 3184
    .line 3185
    .line 3186
    move-result v2

    .line 3187
    if-eqz v2, :cond_6a

    .line 3188
    .line 3189
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3190
    .line 3191
    .line 3192
    move-result-object v2

    .line 3193
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3194
    .line 3195
    .line 3196
    check-cast v2, Ljava/util/Collection;

    .line 3197
    .line 3198
    check-cast v2, Ljava/lang/Iterable;

    .line 3199
    .line 3200
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 3201
    .line 3202
    .line 3203
    goto :goto_34

    .line 3204
    :cond_6a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3205
    .line 3206
    .line 3207
    move-result-object p1

    .line 3208
    :goto_35
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 3209
    .line 3210
    .line 3211
    move-result v0

    .line 3212
    if-eqz v0, :cond_71

    .line 3213
    .line 3214
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3215
    .line 3216
    .line 3217
    move-result-object v0

    .line 3218
    check-cast v0, La/h2l;

    .line 3219
    .line 3220
    if-eqz v0, :cond_70

    .line 3221
    .line 3222
    instance-of v2, v0, La/f2l;

    .line 3223
    .line 3224
    if-eqz v2, :cond_6b

    .line 3225
    .line 3226
    move-object v0, p0

    .line 3227
    check-cast v0, La/l2l;

    .line 3228
    .line 3229
    iget-object v0, v0, La/l2l;->c:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3230
    .line 3231
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3232
    .line 3233
    .line 3234
    move-result-object v2

    .line 3235
    check-cast v2, La/i2l;

    .line 3236
    .line 3237
    iget-object v2, v2, La/i2l;->b:Ljava/lang/String;

    .line 3238
    .line 3239
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3240
    .line 3241
    .line 3242
    move-result-object v4

    .line 3243
    check-cast v4, La/i2l;

    .line 3244
    .line 3245
    iget v4, v4, La/i2l;->h:I

    .line 3246
    .line 3247
    invoke-virtual {v0, v4, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->b(ILjava/lang/String;)V

    .line 3248
    .line 3249
    .line 3250
    goto :goto_35

    .line 3251
    :cond_6b
    instance-of v2, v0, La/c2l;

    .line 3252
    .line 3253
    if-eqz v2, :cond_6c

    .line 3254
    .line 3255
    move-object v0, p0

    .line 3256
    check-cast v0, La/l2l;

    .line 3257
    .line 3258
    iget-object v0, v0, La/l2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3259
    .line 3260
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3261
    .line 3262
    .line 3263
    move-result-object v2

    .line 3264
    check-cast v2, La/i2l;

    .line 3265
    .line 3266
    iget-object v2, v2, La/i2l;->c:Ljava/lang/String;

    .line 3267
    .line 3268
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3269
    .line 3270
    .line 3271
    move-result-object v4

    .line 3272
    check-cast v4, La/i2l;

    .line 3273
    .line 3274
    iget v4, v4, La/i2l;->i:I

    .line 3275
    .line 3276
    invoke-virtual {v0, v4, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->b(ILjava/lang/String;)V

    .line 3277
    .line 3278
    .line 3279
    goto :goto_35

    .line 3280
    :cond_6c
    instance-of v2, v0, La/g2l;

    .line 3281
    .line 3282
    if-eqz v2, :cond_6d

    .line 3283
    .line 3284
    move-object v0, p0

    .line 3285
    check-cast v0, La/l2l;

    .line 3286
    .line 3287
    iget-object v0, v0, La/l2l;->c:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3288
    .line 3289
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3290
    .line 3291
    .line 3292
    move-result-object v2

    .line 3293
    check-cast v2, La/i2l;

    .line 3294
    .line 3295
    iget-object v2, v2, La/i2l;->d:Ljava/lang/String;

    .line 3296
    .line 3297
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickNumber(Ljava/lang/String;)V

    .line 3298
    .line 3299
    .line 3300
    goto :goto_35

    .line 3301
    :cond_6d
    instance-of v2, v0, La/d2l;

    .line 3302
    .line 3303
    if-eqz v2, :cond_6e

    .line 3304
    .line 3305
    move-object v0, p0

    .line 3306
    check-cast v0, La/l2l;

    .line 3307
    .line 3308
    iget-object v0, v0, La/l2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3309
    .line 3310
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3311
    .line 3312
    .line 3313
    move-result-object v2

    .line 3314
    check-cast v2, La/i2l;

    .line 3315
    .line 3316
    iget-object v2, v2, La/i2l;->e:Ljava/lang/String;

    .line 3317
    .line 3318
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickNumber(Ljava/lang/String;)V

    .line 3319
    .line 3320
    .line 3321
    goto :goto_35

    .line 3322
    :cond_6e
    instance-of v2, v0, La/e2l;

    .line 3323
    .line 3324
    if-eqz v2, :cond_6f

    .line 3325
    .line 3326
    move-object v0, p0

    .line 3327
    check-cast v0, La/l2l;

    .line 3328
    .line 3329
    iget-object v0, v0, La/l2l;->c:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3330
    .line 3331
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3332
    .line 3333
    .line 3334
    move-result-object v2

    .line 3335
    check-cast v2, La/i2l;

    .line 3336
    .line 3337
    iget-boolean v2, v2, La/i2l;->f:Z

    .line 3338
    .line 3339
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickLabel(Z)V

    .line 3340
    .line 3341
    .line 3342
    goto/16 :goto_35

    .line 3343
    .line 3344
    :cond_6f
    instance-of v0, v0, La/b2l;

    .line 3345
    .line 3346
    if-eqz v0, :cond_70

    .line 3347
    .line 3348
    move-object v0, p0

    .line 3349
    check-cast v0, La/l2l;

    .line 3350
    .line 3351
    iget-object v0, v0, La/l2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 3352
    .line 3353
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3354
    .line 3355
    .line 3356
    move-result-object v2

    .line 3357
    check-cast v2, La/i2l;

    .line 3358
    .line 3359
    iget-boolean v2, v2, La/i2l;->g:Z

    .line 3360
    .line 3361
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->setPickLabel(Z)V

    .line 3362
    .line 3363
    .line 3364
    goto/16 :goto_35

    .line 3365
    .line 3366
    :cond_70
    invoke-static {}, La/t9f;->b()V

    .line 3367
    .line 3368
    .line 3369
    goto :goto_37

    .line 3370
    :cond_71
    :goto_36
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3371
    .line 3372
    :goto_37
    return-object v1

    .line 3373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
