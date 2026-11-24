.class public final synthetic La/l6x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s4u0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/s4u0;La/cms0;Ljava/lang/Object;La/cms0;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/l6x;->a:B

    iput-object p1, p0, La/l6x;->b:La/s4u0;

    iput-object p2, p0, La/l6x;->c:La/l7m0;

    iput-object p4, p0, La/l6x;->d:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/l6x;->a:B

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iget-object v4, p0, La/l6x;->d:La/l7m0;

    .line 11
    .line 12
    iget-object v5, p0, La/l6x;->c:La/l7m0;

    .line 13
    .line 14
    iget-object p0, p0, La/l6x;->b:La/s4u0;

    .line 15
    .line 16
    check-cast p1, La/fhl;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/ycl;

    .line 29
    .line 30
    iget v0, v0, La/ycl;->a:F

    .line 31
    .line 32
    invoke-interface {p1, v0}, La/w6k;->w0(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sget-object v5, La/j6x;->a:La/j6x;

    .line 37
    .line 38
    invoke-interface {p1}, La/fhl;->d()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    and-long/2addr v5, v2

    .line 43
    long-to-int v5, v5

    .line 44
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/high16 v6, 0x40000000    # 2.0f

    .line 49
    .line 50
    invoke-interface {p1, v6}, La/w6k;->w0(F)F

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    sub-float/2addr v5, v7

    .line 55
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget-object v7, v7, La/nr;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, La/fvt0;

    .line 62
    .line 63
    invoke-virtual {v7, v0, v5}, La/fvt0;->A(FF)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, La/ycl;

    .line 71
    .line 72
    iget v4, v4, La/ycl;->a:F

    .line 73
    .line 74
    invoke-interface {p1, v4}, La/w6k;->w0(F)F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-interface {p1, v6}, La/w6k;->w0(F)F

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    int-to-long v7, v4

    .line 87
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    int-to-long v9, v4

    .line 92
    shl-long v6, v7, v1

    .line 93
    .line 94
    and-long v1, v9, v2

    .line 95
    .line 96
    or-long/2addr v1, v6

    .line 97
    invoke-static {p0, p1, v1, v2}, La/pm80;->h(La/pm80;La/fhl;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget-object p0, p0, La/nr;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, La/fvt0;

    .line 107
    .line 108
    neg-float p1, v0

    .line 109
    neg-float v0, v5

    .line 110
    invoke-virtual {p0, p1, v0}, La/fvt0;->A(FF)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object p1, p1, La/nr;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, La/fvt0;

    .line 124
    .line 125
    neg-float v0, v0

    .line 126
    neg-float v1, v5

    .line 127
    invoke-virtual {p1, v0, v1}, La/fvt0;->A(FF)V

    .line 128
    .line 129
    .line 130
    throw p0

    .line 131
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, La/ycl;

    .line 139
    .line 140
    iget v0, v0, La/ycl;->a:F

    .line 141
    .line 142
    invoke-interface {p1, v0}, La/w6k;->w0(F)F

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    sget-object v5, La/i6x;->a:La/i6x;

    .line 147
    .line 148
    invoke-interface {p1}, La/fhl;->d()J

    .line 149
    .line 150
    .line 151
    move-result-wide v5

    .line 152
    and-long/2addr v5, v2

    .line 153
    long-to-int v5, v5

    .line 154
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    const/high16 v6, 0x40400000    # 3.0f

    .line 159
    .line 160
    invoke-interface {p1, v6}, La/w6k;->w0(F)F

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    sub-float/2addr v5, v7

    .line 165
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    iget-object v7, v7, La/nr;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v7, La/fvt0;

    .line 172
    .line 173
    invoke-virtual {v7, v0, v5}, La/fvt0;->A(FF)V

    .line 174
    .line 175
    .line 176
    :try_start_1
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    check-cast v4, La/ycl;

    .line 181
    .line 182
    iget v4, v4, La/ycl;->a:F

    .line 183
    .line 184
    invoke-interface {p1, v4}, La/w6k;->w0(F)F

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    invoke-interface {p1, v6}, La/w6k;->w0(F)F

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    int-to-long v7, v4

    .line 197
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    int-to-long v9, v4

    .line 202
    shl-long v6, v7, v1

    .line 203
    .line 204
    and-long v1, v9, v2

    .line 205
    .line 206
    or-long/2addr v1, v6

    .line 207
    invoke-static {p0, p1, v1, v2}, La/pm80;->h(La/pm80;La/fhl;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 208
    .line 209
    .line 210
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    iget-object p0, p0, La/nr;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p0, La/fvt0;

    .line 217
    .line 218
    neg-float p1, v0

    .line 219
    neg-float v0, v5

    .line 220
    invoke-virtual {p0, p1, v0}, La/fvt0;->A(FF)V

    .line 221
    .line 222
    .line 223
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    :catchall_1
    move-exception p0

    .line 227
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iget-object p1, p1, La/nr;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p1, La/fvt0;

    .line 234
    .line 235
    neg-float v0, v0

    .line 236
    neg-float v1, v5

    .line 237
    invoke-virtual {p1, v0, v1}, La/fvt0;->A(FF)V

    .line 238
    .line 239
    .line 240
    throw p0

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
