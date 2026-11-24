.class public final La/ifg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/jfg;


# direct methods
.method public synthetic constructor <init>(La/jfg;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ifg;->i:B

    iput-object p1, p0, La/ifg;->k:La/jfg;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ifg;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ifg;->k:La/jfg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ifg;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/ifg;-><init>(La/jfg;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/ifg;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/ifg;-><init>(La/jfg;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ifg;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/ifg;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/ifg;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/ifg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/ifg;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/ifg;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/ifg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ifg;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/ifg;->k:La/jfg;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/ifg;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v2, La/jfg;->p:La/khf0;

    .line 34
    .line 35
    iget-object v1, v2, La/jfg;->o:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 36
    .line 37
    iget-wide v5, v1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 38
    .line 39
    iget-object v1, p1, La/khf0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La/luu;

    .line 42
    .line 43
    iget-object v1, v1, La/luu;->a:La/nok0;

    .line 44
    .line 45
    invoke-virtual {v1}, La/nok0;->a()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v7, p1, La/khf0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v7, La/udg;

    .line 52
    .line 53
    iget-object v7, v7, La/udg;->b:La/tcg;

    .line 54
    .line 55
    iget-object v8, v7, La/tcg;->f:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x2

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    sget-object v10, La/i99;->b:La/i99;

    .line 70
    .line 71
    invoke-static {v4, v11, v10, v12}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_2
    check-cast v10, La/mz40;

    .line 79
    .line 80
    invoke-static {v10}, La/vtb;->M(La/mz40;)La/vae0;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    iget-object v7, v7, La/tcg;->g:Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-nez v6, :cond_3

    .line 95
    .line 96
    sget-object v6, La/i99;->b:La/i99;

    .line 97
    .line 98
    invoke-static {v4, v11, v6, v12}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_3
    check-cast v6, La/mz40;

    .line 106
    .line 107
    invoke-static {v6}, La/vtb;->M(La/mz40;)La/vae0;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object p1, p1, La/khf0;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, La/arc;

    .line 114
    .line 115
    iget-object p1, p1, La/arc;->a:La/udg;

    .line 116
    .line 117
    iget-object p1, p1, La/udg;->b:La/tcg;

    .line 118
    .line 119
    iget-object p1, p1, La/tcg;->b:La/qoj0;

    .line 120
    .line 121
    new-instance v6, La/xo1;

    .line 122
    .line 123
    const/4 v7, 0x3

    .line 124
    invoke-direct {v6, v1, v3, v7}, La/xo1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {v8, v5, p1, v6}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v1, La/rl2;

    .line 132
    .line 133
    const/4 v5, 0x6

    .line 134
    invoke-direct {v1, v7, v3, v5}, La/rl2;-><init>(ILa/yje;B)V

    .line 135
    .line 136
    .line 137
    new-instance v5, La/dnq;

    .line 138
    .line 139
    invoke-direct {v5, p1, v1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 140
    .line 141
    .line 142
    iget-object p1, v2, La/jfg;->v:La/arc;

    .line 143
    .line 144
    iget-object p1, p1, La/arc;->a:La/udg;

    .line 145
    .line 146
    iget-object p1, p1, La/udg;->b:La/tcg;

    .line 147
    .line 148
    iget-object p1, p1, La/tcg;->b:La/qoj0;

    .line 149
    .line 150
    new-instance v1, La/ko0;

    .line 151
    .line 152
    const/16 v6, 0x9

    .line 153
    .line 154
    invoke-direct {v1, v2, v3, v6}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 155
    .line 156
    .line 157
    iput-boolean v4, p0, La/ifg;->j:Z

    .line 158
    .line 159
    new-array v2, v12, [La/gmq;

    .line 160
    .line 161
    aput-object v5, v2, v11

    .line 162
    .line 163
    aput-object p1, v2, v4

    .line 164
    .line 165
    sget-object p1, La/pul;->j:La/pul;

    .line 166
    .line 167
    new-instance v4, La/kh1;

    .line 168
    .line 169
    invoke-direct {v4, v1, v3, v6}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 170
    .line 171
    .line 172
    sget-object v1, La/h660;->a:La/h660;

    .line 173
    .line 174
    invoke-static {p0, v1, v4, p1, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    if-ne p0, v0, :cond_4

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    :goto_0
    if-ne p0, v0, :cond_5

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    :goto_1
    if-ne p0, v0, :cond_6

    .line 189
    .line 190
    move-object v3, v0

    .line 191
    goto :goto_3

    .line 192
    :cond_6
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    :goto_3
    return-object v3

    .line 195
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 196
    .line 197
    iget-boolean v5, p0, La/ifg;->j:Z

    .line 198
    .line 199
    if-eqz v5, :cond_8

    .line 200
    .line 201
    if-ne v5, v4, :cond_7

    .line 202
    .line 203
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object p1, v2, La/jfg;->q:La/hjd;

    .line 215
    .line 216
    new-instance v1, La/cid;

    .line 217
    .line 218
    new-instance v3, La/jq2;

    .line 219
    .line 220
    iget-object v2, v2, La/jfg;->o:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 221
    .line 222
    iget-wide v5, v2, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 223
    .line 224
    invoke-direct {v3, v5, v6}, La/jq2;-><init>(J)V

    .line 225
    .line 226
    .line 227
    const-string v2, ""

    .line 228
    .line 229
    invoke-direct {v1, v2, v3}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 230
    .line 231
    .line 232
    iput-boolean v4, p0, La/ifg;->j:Z

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v1, p0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-ne p0, v0, :cond_9

    .line 242
    .line 243
    move-object v3, v0

    .line 244
    goto :goto_5

    .line 245
    :cond_9
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    :goto_5
    return-object v3

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
