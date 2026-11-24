.class public final La/xta;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/eja;

.field public final synthetic b:La/omv;

.field public final synthetic c:F

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/pz40;

.field public final synthetic g:La/pz40;


# direct methods
.method public constructor <init>(La/eja;La/omv;FLa/pz40;La/pz40;La/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xta;->a:La/eja;

    .line 5
    .line 6
    iput-object p2, p0, La/xta;->b:La/omv;

    .line 7
    .line 8
    iput p3, p0, La/xta;->c:F

    .line 9
    .line 10
    iput-object p4, p0, La/xta;->d:La/pz40;

    .line 11
    .line 12
    iput-object p5, p0, La/xta;->e:La/pz40;

    .line 13
    .line 14
    iput-object p6, p0, La/xta;->f:La/pz40;

    .line 15
    .line 16
    iput-object p7, p0, La/xta;->g:La/pz40;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/bvi0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    instance-of v1, p1, La/avi0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iget-object v3, p0, La/xta;->d:La/pz40;

    .line 15
    .line 16
    iget-object v4, p0, La/xta;->e:La/pz40;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, La/xta;->a:La/eja;

    .line 21
    .line 22
    iget-object p1, p1, La/eja;->a:La/dja;

    .line 23
    .line 24
    invoke-interface {v3, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v4, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/xta;->b:La/omv;

    .line 31
    .line 32
    invoke-static {p0, v2}, La/ckb;->a0(La/omv;I)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    instance-of v1, p1, La/xui0;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, La/xta;->f:La/pz40;

    .line 42
    .line 43
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, La/a4x;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    const/4 v7, -0x1

    .line 58
    if-eqz v6, :cond_2

    .line 59
    .line 60
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, La/eja;

    .line 65
    .line 66
    iget-object v6, v6, La/eja;->a:La/dja;

    .line 67
    .line 68
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, La/dja;

    .line 73
    .line 74
    if-ne v6, v8, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move v2, v7

    .line 81
    :goto_1
    if-eq v2, v7, :cond_5

    .line 82
    .line 83
    int-to-float v3, v2

    .line 84
    iget v5, p0, La/xta;->c:F

    .line 85
    .line 86
    mul-float/2addr v3, v5

    .line 87
    neg-float v3, v3

    .line 88
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    add-int/lit8 v6, v6, -0x1

    .line 93
    .line 94
    sub-int/2addr v6, v2

    .line 95
    int-to-float v6, v6

    .line 96
    mul-float/2addr v6, v5

    .line 97
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    check-cast p1, La/xui0;

    .line 108
    .line 109
    iget-wide v8, p1, La/xui0;->a:J

    .line 110
    .line 111
    const-wide v10, 0xffffffffL

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    and-long/2addr v8, v10

    .line 117
    long-to-int p1, v8

    .line 118
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    add-float/2addr p1, v7

    .line 123
    invoke-static {p1, v3, v6}, La/l1e0;->c(FFF)F

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {v4, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    div-float/2addr p1, v5

    .line 145
    invoke-static {p1}, La/si30;->b(F)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    add-int v3, v2, p1

    .line 150
    .line 151
    invoke-static {v1}, La/q3d;->h(Ljava/util/Collection;)Lkotlin/ranges/IntRange;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-static {v3, v6}, La/l1e0;->e(ILkotlin/ranges/IntRange;)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz p1, :cond_5

    .line 160
    .line 161
    if-eq v3, v2, :cond_5

    .line 162
    .line 163
    new-instance v6, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v6, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object p0, p0, La/xta;->g:La/pz40;

    .line 183
    .line 184
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 189
    .line 190
    new-instance v0, La/qta;

    .line 191
    .line 192
    invoke-direct {v0, v2, v3}, La/qta;-><init>(II)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Ljava/lang/Number;

    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    int-to-float p1, p1

    .line 209
    mul-float/2addr p1, v5

    .line 210
    sub-float/2addr p0, p1

    .line 211
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-interface {v4, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_3
    instance-of p0, p1, La/zui0;

    .line 220
    .line 221
    const/4 v1, 0x0

    .line 222
    if-eqz p0, :cond_4

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_4
    instance-of p0, p1, La/yui0;

    .line 226
    .line 227
    if-eqz p0, :cond_6

    .line 228
    .line 229
    :goto_2
    invoke-interface {v3, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v4, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 239
    .line 240
    .line 241
    return-object v1
.end method
