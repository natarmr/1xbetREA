.class public final synthetic La/xs8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/a4x;ZLjava/lang/String;F)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/xs8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xs8;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/xs8;->b:Z

    iput-object p3, p0, La/xs8;->e:Ljava/lang/Object;

    iput p4, p0, La/xs8;->c:F

    return-void
.end method

.method public synthetic constructor <init>(La/et8;La/vne;ZF)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/xs8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xs8;->d:Ljava/lang/Object;

    iput-object p2, p0, La/xs8;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/xs8;->b:Z

    iput p4, p0, La/xs8;->c:F

    return-void
.end method

.method public synthetic constructor <init>(La/o1e0;ZFLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/xs8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xs8;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/xs8;->b:Z

    iput p3, p0, La/xs8;->c:F

    iput-object p4, p0, La/xs8;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/xs8;->a:B

    .line 2
    .line 3
    iget v1, p0, La/xs8;->c:F

    .line 4
    .line 5
    iget-boolean v2, p0, La/xs8;->b:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, La/xs8;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, La/xs8;->d:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, La/o1e0;

    .line 16
    .line 17
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    check-cast p1, La/hcz;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, v5, La/o1e0;->a:La/a4x;

    .line 25
    .line 26
    new-instance v0, La/bod0;

    .line 27
    .line 28
    const/16 v5, 0xd

    .line 29
    .line 30
    invoke-direct {v0, v5}, La/bod0;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v0}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    new-instance v6, La/d1c0;

    .line 42
    .line 43
    const/4 v7, 0x7

    .line 44
    invoke-direct {v6, v0, v7}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 45
    .line 46
    .line 47
    new-instance v0, La/d1c0;

    .line 48
    .line 49
    const/16 v7, 0x8

    .line 50
    .line 51
    invoke-direct {v0, p0, v7}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 52
    .line 53
    .line 54
    new-instance v7, La/tiv;

    .line 55
    .line 56
    invoke-direct {v7, p0, v2, v1, v4}, La/tiv;-><init>(Ljava/util/List;ZFLkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/ugd;

    .line 60
    .line 61
    const v1, -0x4e295cff

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v1, v3, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v5, v6, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    check-cast v5, La/a4x;

    .line 74
    .line 75
    check-cast v4, Ljava/lang/String;

    .line 76
    .line 77
    check-cast p1, La/hcz;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance p0, La/s3t;

    .line 83
    .line 84
    const/16 v0, 0xb

    .line 85
    .line 86
    invoke-direct {p0, v0}, La/s3t;-><init>(B)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    new-instance v6, La/d2p;

    .line 94
    .line 95
    const/16 v7, 0x11

    .line 96
    .line 97
    invoke-direct {v6, p0, v5, v7}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    new-instance p0, La/far;

    .line 101
    .line 102
    const/16 v7, 0xc

    .line 103
    .line 104
    invoke-direct {p0, v5, v7}, La/far;-><init>(Ljava/util/List;B)V

    .line 105
    .line 106
    .line 107
    new-instance v7, La/tiv;

    .line 108
    .line 109
    invoke-direct {v7, v5, v2, v4, v1}, La/tiv;-><init>(Ljava/util/List;ZLjava/lang/String;F)V

    .line 110
    .line 111
    .line 112
    new-instance v1, La/ugd;

    .line 113
    .line 114
    const v2, 0x799532c4

    .line 115
    .line 116
    .line 117
    invoke-direct {v1, v2, v3, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0, v6, p0, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_1
    move-object v1, v5

    .line 127
    check-cast v1, La/et8;

    .line 128
    .line 129
    move-object v7, v4

    .line 130
    check-cast v7, La/vne;

    .line 131
    .line 132
    check-cast p1, La/g6u0;

    .line 133
    .line 134
    iget-wide v4, p1, La/g6u0;->a:J

    .line 135
    .line 136
    invoke-static {v4, v5}, La/g6u0;->b(J)F

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    float-to-int v0, v0

    .line 141
    iget-object v2, v1, La/et8;->b:La/zr8;

    .line 142
    .line 143
    const/4 v4, 0x0

    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    iput-boolean v5, v2, La/zr8;->J:Z

    .line 148
    .line 149
    const/16 v6, -0x384

    .line 150
    .line 151
    if-ge v0, v6, :cond_0

    .line 152
    .line 153
    iget v6, v2, La/zr8;->x:I

    .line 154
    .line 155
    add-int/2addr v6, v3

    .line 156
    goto :goto_0

    .line 157
    :cond_0
    const/16 v6, 0x384

    .line 158
    .line 159
    if-le v0, v6, :cond_1

    .line 160
    .line 161
    iget v6, v2, La/zr8;->x:I

    .line 162
    .line 163
    sub-int/2addr v6, v3

    .line 164
    goto :goto_0

    .line 165
    :cond_1
    iget v6, v2, La/zr8;->K:F

    .line 166
    .line 167
    const/high16 v8, 0x3f800000    # 1.0f

    .line 168
    .line 169
    rem-float/2addr v6, v8

    .line 170
    float-to-double v8, v6

    .line 171
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 172
    .line 173
    cmpl-double v6, v8, v10

    .line 174
    .line 175
    iget v8, v2, La/zr8;->L:I

    .line 176
    .line 177
    if-lez v6, :cond_2

    .line 178
    .line 179
    add-int/lit8 v6, v8, 0x1

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_2
    move v6, v8

    .line 183
    :goto_0
    iget-object v8, v2, La/zr8;->h:Ljava/util/TreeMap;

    .line 184
    .line 185
    invoke-virtual {v8}, Ljava/util/TreeMap;->size()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    sub-int/2addr v8, v3

    .line 190
    if-le v6, v8, :cond_3

    .line 191
    .line 192
    move v6, v8

    .line 193
    :cond_3
    if-lez v6, :cond_4

    .line 194
    .line 195
    move v5, v6

    .line 196
    :cond_4
    int-to-float v3, v5

    .line 197
    invoke-virtual {v2, v3}, La/zr8;->h(F)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    goto :goto_1

    .line 206
    :cond_5
    move-object v2, v4

    .line 207
    :goto_1
    const/4 v8, 0x3

    .line 208
    iget-boolean v3, p0, La/xs8;->b:Z

    .line 209
    .line 210
    if-eqz v2, :cond_6

    .line 211
    .line 212
    new-instance v0, La/ys8;

    .line 213
    .line 214
    const/4 v5, 0x0

    .line 215
    invoke-direct/range {v0 .. v5}, La/ys8;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 216
    .line 217
    .line 218
    move-object v9, v4

    .line 219
    invoke-static {v7, v9, v9, v0, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_6
    move v2, v0

    .line 224
    move-object v9, v4

    .line 225
    new-instance v0, La/zs8;

    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    iget p0, p0, La/xs8;->c:F

    .line 229
    .line 230
    move-object v4, v1

    .line 231
    move v1, v2

    .line 232
    move v5, v3

    .line 233
    move v2, p0

    .line 234
    move-object v3, p1

    .line 235
    invoke-direct/range {v0 .. v6}, La/zs8;-><init>(IFLa/g6u0;La/et8;ZLa/yje;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v7, v9, v9, v0, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 239
    .line 240
    .line 241
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object p0

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
