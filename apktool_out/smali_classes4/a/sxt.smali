.class public final La/sxt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/cp;La/xcz;ZLa/i4;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/sxt;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/sxt;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/sxt;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, La/sxt;->d:Z

    .line 12
    .line 13
    iput-object p4, p0, La/sxt;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(La/kmq;Ljava/lang/Object;La/mci;ZB)V
    .locals 0

    .line 16
    iput-byte p5, p0, La/sxt;->a:B

    iput-object p1, p0, La/sxt;->b:Ljava/lang/Object;

    iput-object p2, p0, La/sxt;->e:Ljava/lang/Object;

    iput-object p3, p0, La/sxt;->c:Ljava/lang/Object;

    iput-boolean p4, p0, La/sxt;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/sxt;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/high16 v3, -0x80000000

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, La/sxt;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-boolean v6, p0, La/sxt;->d:Z

    .line 12
    .line 13
    iget-object v7, p0, La/sxt;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, p0, La/sxt;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    check-cast v8, La/cp;

    .line 23
    .line 24
    iget-object p0, v8, La/cp;->u:La/yfu0;

    .line 25
    .line 26
    check-cast p0, La/vsx;

    .line 27
    .line 28
    iget-object p0, p0, La/vsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 29
    .line 30
    check-cast v7, La/xcz;

    .line 31
    .line 32
    check-cast v5, La/i4;

    .line 33
    .line 34
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v7}, La/xcz;->j()La/mcz;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget-object p2, p2, La/mcz;->l:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/ncz;

    .line 56
    .line 57
    iget v0, v0, La/ncz;->a:I

    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, La/ncz;

    .line 64
    .line 65
    iget p2, p2, La/ncz;->a:I

    .line 66
    .line 67
    add-int/2addr p2, v4

    .line 68
    if-eqz v6, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    sub-int/2addr p1, p2

    .line 72
    if-gtz p1, :cond_2

    .line 73
    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    :goto_0
    const/16 p1, 0x8

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 80
    :goto_2
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_0
    instance-of v0, p2, La/vxt;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    move-object v0, p2

    .line 91
    check-cast v0, La/vxt;

    .line 92
    .line 93
    iget v9, v0, La/vxt;->j:I

    .line 94
    .line 95
    and-int v10, v9, v3

    .line 96
    .line 97
    if-eqz v10, :cond_3

    .line 98
    .line 99
    sub-int/2addr v9, v3

    .line 100
    iput v9, v0, La/vxt;->j:I

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    new-instance v0, La/vxt;

    .line 104
    .line 105
    invoke-direct {v0, p0, p2}, La/vxt;-><init>(La/sxt;La/yje;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    iget-object p0, v0, La/vxt;->i:Ljava/lang/Object;

    .line 109
    .line 110
    sget-object p2, La/wne;->a:La/wne;

    .line 111
    .line 112
    iget v3, v0, La/vxt;->j:I

    .line 113
    .line 114
    if-eqz v3, :cond_5

    .line 115
    .line 116
    if-ne v3, v4, :cond_4

    .line 117
    .line 118
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_5
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    check-cast v8, La/kmq;

    .line 130
    .line 131
    check-cast p1, La/z9s;

    .line 132
    .line 133
    check-cast v7, Ljava/util/List;

    .line 134
    .line 135
    new-instance p0, Ljava/util/ArrayList;

    .line 136
    .line 137
    const/16 v1, 0xa

    .line 138
    .line 139
    invoke-static {v7, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, La/zlb;

    .line 161
    .line 162
    move-object v3, v5

    .line 163
    check-cast v3, La/mci;

    .line 164
    .line 165
    iget-object v7, v2, La/zlb;->c:Ljava/util/List;

    .line 166
    .line 167
    invoke-virtual {v3, v7, p1, v6}, La/mci;->i(Ljava/util/List;La/z9s;Z)Ljava/util/ArrayList;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v2, v3}, La/zlb;->a(La/zlb;Ljava/util/ArrayList;)La/zlb;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_6
    iput v4, v0, La/vxt;->j:I

    .line 180
    .line 181
    invoke-interface {v8, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-ne p0, p2, :cond_7

    .line 186
    .line 187
    move-object v1, p2

    .line 188
    goto :goto_6

    .line 189
    :cond_7
    :goto_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    :goto_6
    return-object v1

    .line 192
    :pswitch_1
    instance-of v0, p2, La/rxt;

    .line 193
    .line 194
    if-eqz v0, :cond_8

    .line 195
    .line 196
    move-object v0, p2

    .line 197
    check-cast v0, La/rxt;

    .line 198
    .line 199
    iget v9, v0, La/rxt;->j:I

    .line 200
    .line 201
    and-int v10, v9, v3

    .line 202
    .line 203
    if-eqz v10, :cond_8

    .line 204
    .line 205
    sub-int/2addr v9, v3

    .line 206
    iput v9, v0, La/rxt;->j:I

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_8
    new-instance v0, La/rxt;

    .line 210
    .line 211
    invoke-direct {v0, p0, p2}, La/rxt;-><init>(La/sxt;La/yje;)V

    .line 212
    .line 213
    .line 214
    :goto_7
    iget-object p0, v0, La/rxt;->i:Ljava/lang/Object;

    .line 215
    .line 216
    sget-object p2, La/wne;->a:La/wne;

    .line 217
    .line 218
    iget v3, v0, La/rxt;->j:I

    .line 219
    .line 220
    if-eqz v3, :cond_a

    .line 221
    .line 222
    if-ne v3, v4, :cond_9

    .line 223
    .line 224
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    check-cast v8, La/kmq;

    .line 236
    .line 237
    check-cast p1, La/z9s;

    .line 238
    .line 239
    check-cast v7, La/knb;

    .line 240
    .line 241
    check-cast v5, La/mci;

    .line 242
    .line 243
    iget-object p0, v7, La/knb;->a:Ljava/util/List;

    .line 244
    .line 245
    invoke-virtual {v5, p0, p1, v6}, La/mci;->i(Ljava/util/List;La/z9s;Z)Ljava/util/ArrayList;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-static {v7, p0}, La/knb;->a(La/knb;Ljava/util/List;)La/knb;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    iput v4, v0, La/rxt;->j:I

    .line 254
    .line 255
    invoke-interface {v8, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    if-ne p0, p2, :cond_b

    .line 260
    .line 261
    move-object v1, p2

    .line 262
    goto :goto_9

    .line 263
    :cond_b
    :goto_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    :goto_9
    return-object v1

    .line 266
    nop

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
