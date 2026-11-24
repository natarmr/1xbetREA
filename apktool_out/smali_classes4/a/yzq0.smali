.class public final La/yzq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vsg0;

.field public final synthetic c:La/cyu;

.field public final synthetic d:La/hie0;

.field public final synthetic e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic f:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/vsg0;La/cyu;La/hie0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/yzq0;->a:B

    iput-object p1, p0, La/yzq0;->b:La/vsg0;

    iput-object p2, p0, La/yzq0;->c:La/cyu;

    iput-object p3, p0, La/yzq0;->d:La/hie0;

    iput-object p4, p0, La/yzq0;->e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    iput-object p5, p0, La/yzq0;->f:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/yzq0;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/yzq0;->b:La/vsg0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/high16 v6, -0x80000000

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    instance-of v2, v1, La/c0r0;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, La/c0r0;

    .line 24
    .line 25
    iget v8, v2, La/c0r0;->j:I

    .line 26
    .line 27
    and-int v9, v8, v6

    .line 28
    .line 29
    if-eqz v9, :cond_0

    .line 30
    .line 31
    sub-int/2addr v8, v6

    .line 32
    iput v8, v2, La/c0r0;->j:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v2, La/c0r0;

    .line 36
    .line 37
    invoke-direct {v2, v0, v1}, La/c0r0;-><init>(La/yzq0;La/yje;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object v1, v2, La/c0r0;->i:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v6, La/wne;->a:La/wne;

    .line 43
    .line 44
    iget v8, v2, La/c0r0;->j:I

    .line 45
    .line 46
    if-eqz v8, :cond_2

    .line 47
    .line 48
    if-ne v8, v7, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v9, La/xzq0;

    .line 62
    .line 63
    iget-object v14, v0, La/yzq0;->f:Ljava/util/List;

    .line 64
    .line 65
    const/4 v15, 0x2

    .line 66
    iget-object v11, v0, La/yzq0;->c:La/cyu;

    .line 67
    .line 68
    iget-object v12, v0, La/yzq0;->d:La/hie0;

    .line 69
    .line 70
    iget-object v13, v0, La/yzq0;->e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 71
    .line 72
    move-object/from16 v10, p1

    .line 73
    .line 74
    invoke-direct/range {v9 .. v15}, La/xzq0;-><init>(La/kmq;La/cyu;La/hie0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;B)V

    .line 75
    .line 76
    .line 77
    iput v7, v2, La/c0r0;->j:I

    .line 78
    .line 79
    invoke-virtual {v3, v9, v2}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v6, :cond_3

    .line 84
    .line 85
    move-object v4, v6

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    :goto_2
    return-object v4

    .line 90
    :pswitch_0
    instance-of v2, v1, La/a0r0;

    .line 91
    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    move-object v2, v1

    .line 95
    check-cast v2, La/a0r0;

    .line 96
    .line 97
    iget v8, v2, La/a0r0;->j:I

    .line 98
    .line 99
    and-int v9, v8, v6

    .line 100
    .line 101
    if-eqz v9, :cond_4

    .line 102
    .line 103
    sub-int/2addr v8, v6

    .line 104
    iput v8, v2, La/a0r0;->j:I

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    new-instance v2, La/a0r0;

    .line 108
    .line 109
    invoke-direct {v2, v0, v1}, La/a0r0;-><init>(La/yzq0;La/yje;)V

    .line 110
    .line 111
    .line 112
    :goto_3
    iget-object v1, v2, La/a0r0;->i:Ljava/lang/Object;

    .line 113
    .line 114
    sget-object v6, La/wne;->a:La/wne;

    .line 115
    .line 116
    iget v8, v2, La/a0r0;->j:I

    .line 117
    .line 118
    if-eqz v8, :cond_6

    .line 119
    .line 120
    if-ne v8, v7, :cond_5

    .line 121
    .line 122
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    new-instance v8, La/xzq0;

    .line 134
    .line 135
    iget-object v13, v0, La/yzq0;->f:Ljava/util/List;

    .line 136
    .line 137
    const/4 v14, 0x1

    .line 138
    iget-object v10, v0, La/yzq0;->c:La/cyu;

    .line 139
    .line 140
    iget-object v11, v0, La/yzq0;->d:La/hie0;

    .line 141
    .line 142
    iget-object v12, v0, La/yzq0;->e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 143
    .line 144
    move-object/from16 v9, p1

    .line 145
    .line 146
    invoke-direct/range {v8 .. v14}, La/xzq0;-><init>(La/kmq;La/cyu;La/hie0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;B)V

    .line 147
    .line 148
    .line 149
    iput v7, v2, La/a0r0;->j:I

    .line 150
    .line 151
    invoke-virtual {v3, v8, v2}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v6, :cond_7

    .line 156
    .line 157
    move-object v4, v6

    .line 158
    goto :goto_5

    .line 159
    :cond_7
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    :goto_5
    return-object v4

    .line 162
    :pswitch_1
    instance-of v2, v1, La/vzq0;

    .line 163
    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    move-object v2, v1

    .line 167
    check-cast v2, La/vzq0;

    .line 168
    .line 169
    iget v8, v2, La/vzq0;->j:I

    .line 170
    .line 171
    and-int v9, v8, v6

    .line 172
    .line 173
    if-eqz v9, :cond_8

    .line 174
    .line 175
    sub-int/2addr v8, v6

    .line 176
    iput v8, v2, La/vzq0;->j:I

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_8
    new-instance v2, La/vzq0;

    .line 180
    .line 181
    invoke-direct {v2, v0, v1}, La/vzq0;-><init>(La/yzq0;La/yje;)V

    .line 182
    .line 183
    .line 184
    :goto_6
    iget-object v1, v2, La/vzq0;->i:Ljava/lang/Object;

    .line 185
    .line 186
    sget-object v6, La/wne;->a:La/wne;

    .line 187
    .line 188
    iget v8, v2, La/vzq0;->j:I

    .line 189
    .line 190
    if-eqz v8, :cond_a

    .line 191
    .line 192
    if-ne v8, v7, :cond_9

    .line 193
    .line 194
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_9
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_a
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    new-instance v8, La/xzq0;

    .line 206
    .line 207
    iget-object v13, v0, La/yzq0;->f:Ljava/util/List;

    .line 208
    .line 209
    const/4 v14, 0x0

    .line 210
    iget-object v10, v0, La/yzq0;->c:La/cyu;

    .line 211
    .line 212
    iget-object v11, v0, La/yzq0;->d:La/hie0;

    .line 213
    .line 214
    iget-object v12, v0, La/yzq0;->e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 215
    .line 216
    move-object/from16 v9, p1

    .line 217
    .line 218
    invoke-direct/range {v8 .. v14}, La/xzq0;-><init>(La/kmq;La/cyu;La/hie0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;B)V

    .line 219
    .line 220
    .line 221
    iput v7, v2, La/vzq0;->j:I

    .line 222
    .line 223
    invoke-virtual {v3, v8, v2}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-ne v0, v6, :cond_b

    .line 228
    .line 229
    move-object v4, v6

    .line 230
    goto :goto_8

    .line 231
    :cond_b
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    :goto_8
    return-object v4

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
