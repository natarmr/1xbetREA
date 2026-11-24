.class public final synthetic La/glw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:F

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FJJZLa/t33;La/t33;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/glw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/glw;->c:F

    iput-wide p2, p0, La/glw;->d:J

    iput-wide p4, p0, La/glw;->e:J

    iput-boolean p6, p0, La/glw;->b:Z

    iput-object p7, p0, La/glw;->f:Ljava/lang/Object;

    iput-object p8, p0, La/glw;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IFLkotlin/jvm/functions/Function0;JJLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/glw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/glw;->b:Z

    iput p2, p0, La/glw;->c:F

    iput-object p3, p0, La/glw;->f:Ljava/lang/Object;

    iput-wide p4, p0, La/glw;->d:J

    iput-wide p6, p0, La/glw;->e:J

    iput-object p8, p0, La/glw;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/glw;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/glw;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/glw;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, La/glw;->c:F

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    move-object v4, p1

    .line 17
    check-cast v4, La/fhl;

    .line 18
    .line 19
    invoke-interface {v4}, La/fhl;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    const-wide v7, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v5, v7

    .line 29
    long-to-int p1, v5

    .line 30
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    iget-boolean v10, p0, La/glw;->b:Z

    .line 35
    .line 36
    const/16 p1, 0x20

    .line 37
    .line 38
    if-nez v10, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-interface {v4}, La/fhl;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    and-long/2addr v5, v7

    .line 46
    long-to-int v0, v5

    .line 47
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-interface {v4}, La/fhl;->d()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    shr-long/2addr v5, p1

    .line 56
    long-to-int v5, v5

    .line 57
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    cmpl-float v0, v0, v5

    .line 62
    .line 63
    if-lez v0, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-interface {v4, v9}, La/w6k;->s0(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-float/2addr v3, v0

    .line 71
    :goto_0
    invoke-interface {v4}, La/fhl;->d()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    shr-long/2addr v5, p1

    .line 76
    long-to-int p1, v5

    .line 77
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-interface {v4, p1}, La/w6k;->s0(F)F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    div-float/2addr v3, p1

    .line 86
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-static {p1, v3}, Ljava/lang/Math;->min(FF)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    add-float v5, v0, p1

    .line 101
    .line 102
    const/high16 v0, 0x3f800000    # 1.0f

    .line 103
    .line 104
    cmpg-float v0, v5, v0

    .line 105
    .line 106
    if-gtz v0, :cond_2

    .line 107
    .line 108
    const/high16 v6, 0x3f800000    # 1.0f

    .line 109
    .line 110
    iget-wide v7, p0, La/glw;->d:J

    .line 111
    .line 112
    invoke-static/range {v4 .. v10}, La/p3c0;->e(La/fhl;FFJFI)V

    .line 113
    .line 114
    .line 115
    :cond_2
    const/4 v5, 0x0

    .line 116
    iget-wide v7, p0, La/glw;->e:J

    .line 117
    .line 118
    move v6, p1

    .line 119
    invoke-static/range {v4 .. v10}, La/p3c0;->e(La/fhl;FFJFI)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_0
    move-object v4, v2

    .line 129
    check-cast v4, La/t33;

    .line 130
    .line 131
    move-object v6, v1

    .line 132
    check-cast v6, La/t33;

    .line 133
    .line 134
    check-cast p1, La/pi9;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, La/pi9;->getDensity()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    mul-float/2addr v3, v0

    .line 144
    new-instance v0, La/y3d;

    .line 145
    .line 146
    iget-wide v1, p0, La/glw;->d:J

    .line 147
    .line 148
    invoke-direct {v0, v1, v2}, La/y3d;-><init>(J)V

    .line 149
    .line 150
    .line 151
    new-instance v5, La/y3d;

    .line 152
    .line 153
    iget-wide v7, p0, La/glw;->e:J

    .line 154
    .line 155
    invoke-direct {v5, v7, v8}, La/y3d;-><init>(J)V

    .line 156
    .line 157
    .line 158
    filled-new-array {v0, v5}, [La/y3d;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v5, La/y3d;

    .line 167
    .line 168
    invoke-direct {v5, v7, v8}, La/y3d;-><init>(J)V

    .line 169
    .line 170
    .line 171
    new-instance v7, La/y3d;

    .line 172
    .line 173
    invoke-direct {v7, v1, v2}, La/y3d;-><init>(J)V

    .line 174
    .line 175
    .line 176
    filled-new-array {v5, v7}, [La/y3d;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    move-object v1, v0

    .line 185
    new-instance v0, La/ilw;

    .line 186
    .line 187
    iget-boolean v2, p0, La/glw;->b:Z

    .line 188
    .line 189
    invoke-direct/range {v0 .. v6}, La/ilw;-><init>(Ljava/util/List;ZFLa/t33;Ljava/util/List;La/t33;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
