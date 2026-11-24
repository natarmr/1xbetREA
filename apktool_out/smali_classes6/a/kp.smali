.class public final synthetic La/kp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/ranges/IntRange;

.field public final synthetic b:La/w6k;

.field public final synthetic c:La/ycl;

.field public final synthetic d:La/k6z;

.field public final synthetic e:J

.field public final synthetic f:F

.field public final synthetic g:F


# direct methods
.method public synthetic constructor <init>(Lkotlin/ranges/IntRange;La/w6k;La/ycl;La/k6z;JFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kp;->a:Lkotlin/ranges/IntRange;

    iput-object p2, p0, La/kp;->b:La/w6k;

    iput-object p3, p0, La/kp;->c:La/ycl;

    iput-object p4, p0, La/kp;->d:La/k6z;

    iput-wide p5, p0, La/kp;->e:J

    iput p7, p0, La/kp;->f:F

    iput p8, p0, La/kp;->g:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/fhl;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/kp;->a:Lkotlin/ranges/IntRange;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v1, p0, La/kp;->b:La/w6k;

    .line 15
    .line 16
    iget v2, p0, La/kp;->f:F

    .line 17
    .line 18
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget v3, p0, La/kp;->g:F

    .line 23
    .line 24
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-interface {v0}, La/fhl;->d()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    const-wide v8, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v6, v8

    .line 43
    long-to-int v6, v6

    .line 44
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    iget-object v7, p0, La/kp;->c:La/ycl;

    .line 49
    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    iget v7, v7, La/ycl;->a:F

    .line 53
    .line 54
    invoke-interface {v1, v7}, La/w6k;->w0(F)F

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v7, v6

    .line 60
    :goto_0
    sub-float/2addr v6, v7

    .line 61
    const/high16 v10, 0x40000000    # 2.0f

    .line 62
    .line 63
    div-float/2addr v6, v10

    .line 64
    cmpg-float v11, v6, v4

    .line 65
    .line 66
    if-gez v11, :cond_2

    .line 67
    .line 68
    move v6, v4

    .line 69
    :cond_2
    iget v11, p1, Lkotlin/ranges/a;->a:I

    .line 70
    .line 71
    int-to-float v11, v11

    .line 72
    add-float/2addr v3, v2

    .line 73
    mul-float/2addr v11, v3

    .line 74
    sub-float/2addr v11, v5

    .line 75
    iget p1, p1, Lkotlin/ranges/a;->b:I

    .line 76
    .line 77
    int-to-float p1, p1

    .line 78
    mul-float/2addr p1, v3

    .line 79
    add-float/2addr p1, v2

    .line 80
    add-float/2addr p1, v5

    .line 81
    sget-object v2, La/k6z;->a:La/k6z;

    .line 82
    .line 83
    iget-object v3, p0, La/kp;->d:La/k6z;

    .line 84
    .line 85
    const/16 v5, 0x20

    .line 86
    .line 87
    if-ne v3, v2, :cond_3

    .line 88
    .line 89
    move v12, v11

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-interface {v0}, La/fhl;->d()J

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    shr-long/2addr v12, v5

    .line 96
    long-to-int v12, v12

    .line 97
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    sub-float/2addr v12, p1

    .line 102
    :goto_1
    if-ne v3, v2, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-interface {v0}, La/fhl;->d()J

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    shr-long/2addr v2, v5

    .line 110
    long-to-int p1, v2

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    sub-float/2addr p1, v11

    .line 116
    :goto_2
    sub-float/2addr p1, v12

    .line 117
    cmpg-float v2, p1, v4

    .line 118
    .line 119
    if-gez v2, :cond_5

    .line 120
    .line 121
    move p1, v4

    .line 122
    :cond_5
    const/high16 v2, 0x41400000    # 12.0f

    .line 123
    .line 124
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    div-float v2, v7, v10

    .line 129
    .line 130
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    cmpg-float v2, v12, v4

    .line 135
    .line 136
    if-gez v2, :cond_6

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    move v4, v12

    .line 140
    :goto_3
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    int-to-long v2, v2

    .line 145
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    int-to-long v10, v4

    .line 150
    shl-long/2addr v2, v5

    .line 151
    and-long/2addr v10, v8

    .line 152
    or-long v3, v2, v10

    .line 153
    .line 154
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    int-to-long v10, p1

    .line 159
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    int-to-long v6, p1

    .line 164
    shl-long/2addr v10, v5

    .line 165
    and-long/2addr v6, v8

    .line 166
    or-long/2addr v6, v10

    .line 167
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    int-to-long v10, p1

    .line 172
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    int-to-long v1, p1

    .line 177
    shl-long/2addr v10, v5

    .line 178
    and-long/2addr v1, v8

    .line 179
    or-long/2addr v1, v10

    .line 180
    const/4 v9, 0x0

    .line 181
    const/16 v10, 0xf0

    .line 182
    .line 183
    iget-wide p0, p0, La/kp;->e:J

    .line 184
    .line 185
    move-wide v5, v6

    .line 186
    move-wide v7, v1

    .line 187
    move-wide v1, p0

    .line 188
    invoke-static/range {v0 .. v10}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 189
    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0
.end method
