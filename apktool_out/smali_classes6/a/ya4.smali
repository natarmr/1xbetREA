.class public final synthetic La/ya4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ya4;->a:B

    iput-object p1, p0, La/ya4;->c:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, La/ya4;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/ya4;->a:B

    iput-object p1, p0, La/ya4;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ya4;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ya4;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/ya4;->c:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    iget-object p0, p0, La/ya4;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/x5q0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v0, p1, La/w5q0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/w5q0;

    .line 21
    .line 22
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    instance-of p0, p1, La/v5q0;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, La/cp;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 44
    .line 45
    check-cast v0, La/t2k;

    .line 46
    .line 47
    iget-object v1, v0, La/t2k;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 48
    .line 49
    new-instance v3, La/nc40;

    .line 50
    .line 51
    const/16 v4, 0xb

    .line 52
    .line 53
    invoke-direct {v3, p0, v4}, La/nc40;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->setOnItemClickListener(La/xdr;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, v0, La/t2k;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 60
    .line 61
    new-instance v0, La/c0;

    .line 62
    .line 63
    const/16 v1, 0xd

    .line 64
    .line 65
    invoke-direct {v0, v2, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, La/ctv;

    .line 72
    .line 73
    const/16 v0, 0x12

    .line 74
    .line 75
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    check-cast p1, La/kim;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    instance-of v0, p1, La/eim;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_2
    instance-of v0, p1, La/iim;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    new-instance v0, La/jjp;

    .line 103
    .line 104
    check-cast p1, La/iim;

    .line 105
    .line 106
    iget-object p1, p1, La/iim;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-direct {v0, p1}, La/jjp;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    instance-of v0, p1, La/jim;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    new-instance v0, La/mjp;

    .line 120
    .line 121
    check-cast p1, La/jim;

    .line 122
    .line 123
    iget p1, p1, La/jim;->a:I

    .line 124
    .line 125
    invoke-direct {v0, p1}, La/mjp;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    instance-of v0, p1, La/him;

    .line 133
    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    new-instance v0, La/ljp;

    .line 137
    .line 138
    check-cast p1, La/him;

    .line 139
    .line 140
    iget-boolean p1, p1, La/him;->a:Z

    .line 141
    .line 142
    invoke-direct {v0, p1}, La/ljp;-><init>(Z)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    instance-of v0, p1, La/gim;

    .line 150
    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    sget-object p1, La/ijp;->a:La/ijp;

    .line 154
    .line 155
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_6
    instance-of v0, p1, La/fim;

    .line 160
    .line 161
    if-eqz v0, :cond_c

    .line 162
    .line 163
    check-cast p1, La/fim;

    .line 164
    .line 165
    iget p1, p1, La/fim;->a:I

    .line 166
    .line 167
    if-eqz p1, :cond_b

    .line 168
    .line 169
    if-eq p1, v1, :cond_a

    .line 170
    .line 171
    const/4 v0, 0x2

    .line 172
    if-eq p1, v0, :cond_9

    .line 173
    .line 174
    const/4 v0, 0x3

    .line 175
    if-eq p1, v0, :cond_8

    .line 176
    .line 177
    const/4 v0, 0x4

    .line 178
    if-eq p1, v0, :cond_7

    .line 179
    .line 180
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_7
    sget-object p1, La/ejp;->a:La/ejp;

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_8
    sget-object p1, La/bjp;->a:La/bjp;

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_9
    sget-object p1, La/fjp;->a:La/fjp;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_a
    sget-object p1, La/cjp;->a:La/cjp;

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_b
    sget-object p1, La/djp;->a:La/djp;

    .line 196
    .line 197
    :goto_1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 204
    .line 205
    .line 206
    const/4 p0, 0x0

    .line 207
    :goto_3
    return-object p0

    .line 208
    :pswitch_2
    check-cast p1, La/cp;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v0, La/sw8;

    .line 214
    .line 215
    invoke-direct {v0, p1, p0, v2, v1}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 219
    .line 220
    .line 221
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_e

    .line 231
    .line 232
    if-eq p1, v1, :cond_d

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_d
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_e
    sget-object p1, La/k17;->a:La/k17;

    .line 240
    .line 241
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    new-instance v0, La/t94;

    .line 257
    .line 258
    invoke-direct {v0, p1}, La/t94;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
