.class public final synthetic La/acc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:La/wdr;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/vxl;La/syl;La/jyl;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/acc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/acc;->c:Ljava/lang/Object;

    iput-object p2, p0, La/acc;->d:Ljava/lang/Object;

    iput-object p3, p0, La/acc;->e:Ljava/lang/Object;

    iput-object p4, p0, La/acc;->f:Ljava/lang/Object;

    iput-boolean p5, p0, La/acc;->b:Z

    iput-object p6, p0, La/acc;->g:La/wdr;

    iput-object p7, p0, La/acc;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/acc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/acc;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/acc;->b:Z

    iput-object p3, p0, La/acc;->d:Ljava/lang/Object;

    iput-object p4, p0, La/acc;->e:Ljava/lang/Object;

    iput-object p5, p0, La/acc;->f:Ljava/lang/Object;

    iput-object p6, p0, La/acc;->g:La/wdr;

    iput-object p7, p0, La/acc;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLa/xpj0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/vne;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/acc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/acc;->b:Z

    iput-object p2, p0, La/acc;->c:Ljava/lang/Object;

    iput-object p3, p0, La/acc;->d:Ljava/lang/Object;

    iput-object p4, p0, La/acc;->e:Ljava/lang/Object;

    iput-object p5, p0, La/acc;->f:Ljava/lang/Object;

    iput-object p6, p0, La/acc;->g:La/wdr;

    iput-object p7, p0, La/acc;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/acc;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, La/acc;->b:Z

    .line 5
    .line 6
    iget-object v3, p0, La/acc;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, La/acc;->g:La/wdr;

    .line 9
    .line 10
    iget-object v5, p0, La/acc;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, p0, La/acc;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, p0, La/acc;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, p0, La/acc;->c:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v8, La/xpj0;

    .line 22
    .line 23
    check-cast v7, Ljava/lang/String;

    .line 24
    .line 25
    check-cast v6, Ljava/lang/String;

    .line 26
    .line 27
    check-cast v5, Ljava/lang/String;

    .line 28
    .line 29
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 30
    .line 31
    check-cast v3, La/vne;

    .line 32
    .line 33
    check-cast p1, La/abi0;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    new-instance p0, La/a2z;

    .line 38
    .line 39
    const/16 v0, 0xe

    .line 40
    .line 41
    invoke-direct {p0, v4, v0}, La/a2z;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 42
    .line 43
    .line 44
    sget-object v0, La/yai0;->a:[La/iiy;

    .line 45
    .line 46
    sget-object v0, La/mai0;->v:La/zai0;

    .line 47
    .line 48
    new-instance v1, La/m6;

    .line 49
    .line 50
    invoke-direct {v1, v7, p0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8}, La/xpj0;->c()La/ypj0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object v0, La/ypj0;->c:La/ypj0;

    .line 61
    .line 62
    if-ne p0, v0, :cond_0

    .line 63
    .line 64
    new-instance p0, La/g8l;

    .line 65
    .line 66
    const/16 v0, 0x19

    .line 67
    .line 68
    invoke-direct {p0, v8, v3, v8, v0}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    sget-object v0, La/mai0;->t:La/zai0;

    .line 72
    .line 73
    new-instance v1, La/m6;

    .line 74
    .line 75
    invoke-direct {v1, v6, p0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    iget-object p0, v8, La/xpj0;->e:La/qv2;

    .line 83
    .line 84
    invoke-virtual {p0}, La/qv2;->j()La/no20;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget-object p0, p0, La/no20;->a:Ljava/util/Map;

    .line 89
    .line 90
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_1

    .line 95
    .line 96
    new-instance p0, La/vp8;

    .line 97
    .line 98
    const/4 v0, 0x4

    .line 99
    invoke-direct {p0, v8, v3, v0}, La/vp8;-><init>(La/xpj0;La/vne;B)V

    .line 100
    .line 101
    .line 102
    sget-object v0, La/mai0;->u:La/zai0;

    .line 103
    .line 104
    new-instance v1, La/m6;

    .line 105
    .line 106
    invoke-direct {v1, v5, p0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, v0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_0
    check-cast v8, Ljava/lang/String;

    .line 116
    .line 117
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 118
    .line 119
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 120
    .line 121
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 124
    .line 125
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 126
    .line 127
    check-cast p1, Landroid/content/Context;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 133
    .line 134
    const/4 v0, 0x6

    .line 135
    invoke-direct {p0, p1, v1, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v8}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->a(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setRtlSupportEnabled(Z)V

    .line 142
    .line 143
    .line 144
    if-eqz v7, :cond_2

    .line 145
    .line 146
    new-instance p1, La/cjl;

    .line 147
    .line 148
    const/16 v0, 0x12

    .line 149
    .line 150
    invoke-direct {p1, v7, v0}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setCancelButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 154
    .line 155
    .line 156
    :cond_2
    if-eqz v6, :cond_3

    .line 157
    .line 158
    new-instance p1, La/cjl;

    .line 159
    .line 160
    const/16 v0, 0x13

    .line 161
    .line 162
    invoke-direct {p1, v6, v0}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMoveButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    if-eqz v5, :cond_4

    .line 169
    .line 170
    new-instance p1, La/cjl;

    .line 171
    .line 172
    const/16 v0, 0x14

    .line 173
    .line 174
    invoke-direct {p1, v5, v0}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setAutoSubClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 178
    .line 179
    .line 180
    :cond_4
    if-eqz v4, :cond_5

    .line 181
    .line 182
    new-instance p1, La/cjl;

    .line 183
    .line 184
    const/16 v0, 0x15

    .line 185
    .line 186
    invoke-direct {p1, v4, v0}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setOptionBetClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 190
    .line 191
    .line 192
    :cond_5
    if-eqz v3, :cond_6

    .line 193
    .line 194
    new-instance p1, La/cjl;

    .line 195
    .line 196
    const/16 v0, 0x16

    .line 197
    .line 198
    invoke-direct {p1, v3, v0}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setEachWayClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 202
    .line 203
    .line 204
    :cond_6
    return-object p0

    .line 205
    :pswitch_1
    check-cast v8, La/a4x;

    .line 206
    .line 207
    check-cast v7, La/vxl;

    .line 208
    .line 209
    check-cast v6, La/syl;

    .line 210
    .line 211
    check-cast v5, La/jyl;

    .line 212
    .line 213
    move-object v10, v4

    .line 214
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    move-object v11, v3

    .line 217
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 218
    .line 219
    check-cast p1, La/hcz;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    new-instance v2, La/dx8;

    .line 229
    .line 230
    const/16 v3, 0x9

    .line 231
    .line 232
    invoke-direct {v2, v8, v3}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 233
    .line 234
    .line 235
    new-instance v4, La/hcc;

    .line 236
    .line 237
    iget-boolean v9, p0, La/acc;->b:Z

    .line 238
    .line 239
    move-object v12, v8

    .line 240
    move-object v8, v5

    .line 241
    move-object v5, v12

    .line 242
    move-object v12, v7

    .line 243
    move-object v7, v6

    .line 244
    move-object v6, v12

    .line 245
    invoke-direct/range {v4 .. v11}, La/hcc;-><init>(Ljava/util/List;La/vxl;La/syl;La/jyl;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 246
    .line 247
    .line 248
    new-instance p0, La/ugd;

    .line 249
    .line 250
    const v3, 0x2fd4df92

    .line 251
    .line 252
    .line 253
    const/4 v5, 0x1

    .line 254
    invoke-direct {p0, v3, v5, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v0, v1, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
