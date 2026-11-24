.class public final synthetic La/m6b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u6b0;


# direct methods
.method public synthetic constructor <init>(La/u6b0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/m6b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m6b0;->b:La/u6b0;

    return-void
.end method

.method public synthetic constructor <init>(La/u6b0;Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    iput-byte p2, p0, La/m6b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m6b0;->b:La/u6b0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m6b0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/m6b0;->b:La/u6b0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/fp5;

    .line 13
    .line 14
    move-object/from16 v2, p2

    .line 15
    .line 16
    check-cast v2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    move-object/from16 v2, p3

    .line 23
    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    sget-object v3, La/u6b0;->e2:La/xi70;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, La/u6b0;->J0()La/sbb0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v3, v0, La/sbb0;->p0:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v9, 0x0

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    move-object v5, v4

    .line 53
    check-cast v5, La/lr5;

    .line 54
    .line 55
    iget v5, v5, La/lr5;->a:I

    .line 56
    .line 57
    iget v7, v1, La/fp5;->a:I

    .line 58
    .line 59
    if-ne v5, v7, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v4, v9

    .line 63
    :goto_0
    move-object v1, v4

    .line 64
    check-cast v1, La/lr5;

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    iget-object v3, v1, La/lr5;->h:Ljava/lang/String;

    .line 70
    .line 71
    iget-boolean v4, v1, La/lr5;->j:Z

    .line 72
    .line 73
    invoke-static {v3, v4}, La/c3x;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_3

    .line 82
    .line 83
    invoke-static {v3}, La/c3x;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    :cond_3
    move-object v5, v4

    .line 88
    iget-object v3, v1, La/lr5;->k:La/oo5;

    .line 89
    .line 90
    invoke-static {v3, v2}, La/ks60;->a(La/oo5;Ljava/lang/String;)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget-object v3, v0, La/sbb0;->V:La/yo4;

    .line 95
    .line 96
    iget v4, v1, La/lr5;->a:I

    .line 97
    .line 98
    const-string v8, "main_screen"

    .line 99
    .line 100
    move-object v7, v5

    .line 101
    move v5, v6

    .line 102
    move-object v6, v2

    .line 103
    invoke-virtual/range {v3 .. v8}, La/yo4;->o(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    move v6, v5

    .line 107
    move-object v5, v7

    .line 108
    iget-object v3, v0, La/sbb0;->T:La/gg5;

    .line 109
    .line 110
    iget v4, v1, La/lr5;->a:I

    .line 111
    .line 112
    sget-object v7, La/y1p;->h1:La/y1p;

    .line 113
    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    int-to-float v2, v2

    .line 121
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object v8, v2

    .line 126
    goto :goto_1

    .line 127
    :cond_4
    move-object v8, v9

    .line 128
    :goto_1
    invoke-virtual/range {v3 .. v8}, La/gg5;->e(ILjava/lang/String;ILa/y1p;Ljava/lang/Float;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    iget-object v2, v0, La/sbb0;->q:La/mne;

    .line 136
    .line 137
    iget-object v13, v2, La/mne;->b:La/dvj;

    .line 138
    .line 139
    new-instance v11, La/kma0;

    .line 140
    .line 141
    const/16 v2, 0x1a

    .line 142
    .line 143
    invoke-direct {v11, v2}, La/kma0;-><init>(B)V

    .line 144
    .line 145
    .line 146
    new-instance v14, La/gc1;

    .line 147
    .line 148
    const/16 v8, 0xd

    .line 149
    .line 150
    move-object v5, v0

    .line 151
    move-object v4, v1

    .line 152
    move-object v7, v9

    .line 153
    move-object v3, v14

    .line 154
    invoke-direct/range {v3 .. v8}, La/gc1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 155
    .line 156
    .line 157
    const/16 v15, 0xa

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 161
    .line 162
    .line 163
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_0
    move-object/from16 v2, p1

    .line 167
    .line 168
    check-cast v2, La/u4s;

    .line 169
    .line 170
    move-object/from16 v1, p2

    .line 171
    .line 172
    check-cast v1, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-object/from16 v4, p3

    .line 178
    .line 179
    check-cast v4, Ljava/lang/String;

    .line 180
    .line 181
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, La/u6b0;->J0()La/sbb0;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    sget-object v1, La/zn60;->b:La/zn60;

    .line 191
    .line 192
    iget-object v3, v0, La/sbb0;->o:La/pm60;

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-object v0, v3, La/pm60;->r:La/bby;

    .line 198
    .line 199
    if-eqz v0, :cond_5

    .line 200
    .line 201
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    const/4 v1, 0x1

    .line 206
    if-ne v0, v1, :cond_5

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_5
    invoke-virtual {v3}, La/eiu0;->s()La/diu0;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-object v1, v3, La/pm60;->h:La/mne;

    .line 218
    .line 219
    iget-object v8, v1, La/mne;->c:La/vs10;

    .line 220
    .line 221
    sget-object v7, La/mm60;->a:La/mm60;

    .line 222
    .line 223
    new-instance v1, La/ze1;

    .line 224
    .line 225
    const/4 v6, 0x0

    .line 226
    const-string v5, "WebGamesGameCollectionSection"

    .line 227
    .line 228
    invoke-direct/range {v1 .. v6}, La/ze1;-><init>(La/u4s;La/pm60;Ljava/lang/String;Ljava/lang/String;La/yje;)V

    .line 229
    .line 230
    .line 231
    const/16 v10, 0xa

    .line 232
    .line 233
    move-object v6, v7

    .line 234
    const/4 v7, 0x0

    .line 235
    move-object v5, v0

    .line 236
    move-object v9, v1

    .line 237
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    iput-object v0, v3, La/pm60;->r:La/bby;

    .line 242
    .line 243
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object v0

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
