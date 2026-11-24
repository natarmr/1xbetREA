.class public final synthetic La/vbz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/u8z;

.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:La/jie0;

.field public final synthetic e:La/hie0;

.field public final synthetic f:Z

.field public final synthetic g:F

.field public final synthetic h:La/kie0;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:La/mie0;


# direct methods
.method public synthetic constructor <init>(La/u8z;IFLa/jie0;La/hie0;ZFLa/kie0;IILa/mie0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vbz;->a:La/u8z;

    iput p2, p0, La/vbz;->b:I

    iput p3, p0, La/vbz;->c:F

    iput-object p4, p0, La/vbz;->d:La/jie0;

    iput-object p5, p0, La/vbz;->e:La/hie0;

    iput-boolean p6, p0, La/vbz;->f:Z

    iput p7, p0, La/vbz;->g:F

    iput-object p8, p0, La/vbz;->h:La/kie0;

    iput p9, p0, La/vbz;->i:I

    iput p10, p0, La/vbz;->j:I

    iput-object p11, p0, La/vbz;->k:La/mie0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/i73;

    .line 2
    .line 3
    iget-object v0, p0, La/vbz;->a:La/u8z;

    .line 4
    .line 5
    iget v1, p0, La/vbz;->b:I

    .line 6
    .line 7
    invoke-static {v0, v1}, La/kcx;->M(La/u8z;I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p0, La/vbz;->e:La/hie0;

    .line 12
    .line 13
    iget-boolean v4, p0, La/vbz;->f:Z

    .line 14
    .line 15
    iget v5, p0, La/vbz;->j:I

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-nez v2, :cond_7

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iget v7, p0, La/vbz;->c:F

    .line 22
    .line 23
    cmpl-float v2, v7, v2

    .line 24
    .line 25
    if-lez v2, :cond_1

    .line 26
    .line 27
    iget-object v2, p1, La/i73;->e:La/pz40;

    .line 28
    .line 29
    check-cast v2, La/hgk0;

    .line 30
    .line 31
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    cmpl-float v8, v2, v7

    .line 42
    .line 43
    if-lez v8, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v7, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v2, p1, La/i73;->e:La/pz40;

    .line 49
    .line 50
    check-cast v2, La/hgk0;

    .line 51
    .line 52
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    cmpg-float v8, v2, v7

    .line 63
    .line 64
    if-gez v8, :cond_0

    .line 65
    .line 66
    :goto_0
    iget-object v2, p0, La/vbz;->d:La/jie0;

    .line 67
    .line 68
    iget v8, v2, La/jie0;->a:F

    .line 69
    .line 70
    sub-float/2addr v7, v8

    .line 71
    invoke-interface {v0, v7}, La/qah0;->a(F)F

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-static {v0, v1}, La/kcx;->M(La/u8z;I)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_2

    .line 80
    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :cond_2
    invoke-static {v4, v0, v1, v5}, La/kcx;->y(ZLa/u8z;II)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-nez v9, :cond_7

    .line 88
    .line 89
    cmpg-float v8, v7, v8

    .line 90
    .line 91
    if-nez v8, :cond_6

    .line 92
    .line 93
    iget v8, v2, La/jie0;->a:F

    .line 94
    .line 95
    add-float/2addr v8, v7

    .line 96
    iput v8, v2, La/jie0;->a:F

    .line 97
    .line 98
    iget v2, p0, La/vbz;->g:F

    .line 99
    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    iget-object v7, p1, La/i73;->e:La/pz40;

    .line 103
    .line 104
    check-cast v7, La/hgk0;

    .line 105
    .line 106
    invoke-virtual {v7}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    cmpl-float v2, v7, v2

    .line 117
    .line 118
    if-lez v2, :cond_4

    .line 119
    .line 120
    invoke-virtual {p1}, La/i73;->a()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    iget-object v7, p1, La/i73;->e:La/pz40;

    .line 125
    .line 126
    check-cast v7, La/hgk0;

    .line 127
    .line 128
    invoke-virtual {v7}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    check-cast v7, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    neg-float v2, v2

    .line 139
    cmpg-float v2, v7, v2

    .line 140
    .line 141
    if-gez v2, :cond_4

    .line 142
    .line 143
    invoke-virtual {p1}, La/i73;->a()V

    .line 144
    .line 145
    .line 146
    :cond_4
    :goto_1
    iget-object v2, p0, La/vbz;->h:La/kie0;

    .line 147
    .line 148
    iget v2, v2, La/kie0;->a:I

    .line 149
    .line 150
    iget v7, p0, La/vbz;->i:I

    .line 151
    .line 152
    const/4 v8, 0x2

    .line 153
    if-eqz v4, :cond_5

    .line 154
    .line 155
    if-lt v2, v8, :cond_7

    .line 156
    .line 157
    invoke-virtual {v0}, La/u8z;->e()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    sub-int v2, v1, v2

    .line 162
    .line 163
    if-le v2, v7, :cond_7

    .line 164
    .line 165
    sub-int v2, v1, v7

    .line 166
    .line 167
    invoke-virtual {v0, v2, v6}, La/u8z;->f(II)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    if-lt v2, v8, :cond_7

    .line 172
    .line 173
    invoke-virtual {v0}, La/u8z;->c()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    sub-int/2addr v2, v1

    .line 178
    if-le v2, v7, :cond_7

    .line 179
    .line 180
    add-int/2addr v7, v1

    .line 181
    invoke-virtual {v0, v7, v6}, La/u8z;->f(II)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_6
    invoke-virtual {p1}, La/i73;->a()V

    .line 186
    .line 187
    .line 188
    iput-boolean v6, v3, La/hie0;->a:Z

    .line 189
    .line 190
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object p0

    .line 193
    :cond_7
    :goto_2
    invoke-static {v4, v0, v1, v5}, La/kcx;->y(ZLa/u8z;II)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_8

    .line 198
    .line 199
    invoke-virtual {v0, v1, v5}, La/u8z;->f(II)V

    .line 200
    .line 201
    .line 202
    iput-boolean v6, v3, La/hie0;->a:Z

    .line 203
    .line 204
    invoke-virtual {p1}, La/i73;->a()V

    .line 205
    .line 206
    .line 207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :cond_8
    invoke-static {v0, v1}, La/kcx;->M(La/u8z;I)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-nez p1, :cond_9

    .line 215
    .line 216
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0

    .line 219
    :cond_9
    invoke-virtual {v0, v1}, La/u8z;->b(I)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    new-instance v0, La/oux;

    .line 224
    .line 225
    iget-object p0, p0, La/vbz;->k:La/mie0;

    .line 226
    .line 227
    iget-object p0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p0, La/l73;

    .line 230
    .line 231
    invoke-direct {v0, p1, p0}, La/oux;-><init>(ILa/l73;)V

    .line 232
    .line 233
    .line 234
    throw v0
.end method
