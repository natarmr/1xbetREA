.class public final synthetic La/hm10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/sd;

.field public final synthetic c:F

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(ZLa/sd;FZLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/hm10;->a:Z

    iput-object p2, p0, La/hm10;->b:La/sd;

    iput p3, p0, La/hm10;->c:F

    iput-boolean p4, p0, La/hm10;->d:Z

    iput-object p5, p0, La/hm10;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    move p2, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v8

    .line 20
    :goto_0
    and-int/2addr p1, v1

    .line 21
    invoke-virtual {v6, p1, p2}, La/fet;->U(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_6

    .line 26
    .line 27
    iget-boolean p1, p0, La/hm10;->a:Z

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const p0, 0x88c3730

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v8, v6}, La/km10;->c(ILa/fet;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_1
    iget-object v2, p0, La/hm10;->b:La/sd;

    .line 46
    .line 47
    if-eqz v2, :cond_5

    .line 48
    .line 49
    const p1, 0x88c41a2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, p1}, La/fet;->e0(I)V

    .line 53
    .line 54
    .line 55
    sget-object p1, La/jm40;->b:La/jm40;

    .line 56
    .line 57
    iget p2, p0, La/hm10;->c:F

    .line 58
    .line 59
    invoke-static {p1, p2}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v3, La/r2v0;

    .line 64
    .line 65
    sget-object p1, La/m8m0;->a:La/zfn;

    .line 66
    .line 67
    invoke-virtual {v6, p1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 72
    .line 73
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    new-instance p2, La/y3d;

    .line 78
    .line 79
    invoke-direct {p2, v4, v5}, La/y3d;-><init>(J)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, p1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 87
    .line 88
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 89
    .line 90
    .line 91
    move-result-wide v4

    .line 92
    new-instance v1, La/y3d;

    .line 93
    .line 94
    invoke-direct {v1, v4, v5}, La/y3d;-><init>(J)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, p1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 102
    .line 103
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    new-instance p1, La/y3d;

    .line 108
    .line 109
    invoke-direct {p1, v4, v5}, La/y3d;-><init>(J)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v3, p2, v1, p1}, La/r2v0;-><init>(La/y3d;La/y3d;La/y3d;)V

    .line 113
    .line 114
    .line 115
    iget-boolean p1, p0, La/hm10;->d:Z

    .line 116
    .line 117
    invoke-virtual {v6, p1}, La/fet;->h(Z)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget-object p0, p0, La/hm10;->e:Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    invoke-virtual {v6, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    or-int/2addr p2, v1

    .line 128
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v4, La/ukd;->a:La/cl5;

    .line 133
    .line 134
    if-nez p2, :cond_2

    .line 135
    .line 136
    if-ne v1, v4, :cond_3

    .line 137
    .line 138
    :cond_2
    new-instance v1, La/jw7;

    .line 139
    .line 140
    const/16 p2, 0xc

    .line 141
    .line 142
    invoke-direct {v1, p1, p0, p2}, La/jw7;-><init>(ZLkotlin/jvm/functions/Function0;B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 149
    .line 150
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    if-ne p0, v4, :cond_4

    .line 155
    .line 156
    new-instance p0, La/gf10;

    .line 157
    .line 158
    const/4 p1, 0x7

    .line 159
    invoke-direct {p0, p1}, La/gf10;-><init>(B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, p0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    move-object v5, p0

    .line 166
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 167
    .line 168
    const v7, 0x30030

    .line 169
    .line 170
    .line 171
    move-object v4, v1

    .line 172
    const/4 v1, 0x0

    .line 173
    invoke-static/range {v0 .. v7}, La/ozb;->w(La/mm40;ZLa/sd;La/r2v0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_5
    const p0, 0x906a8ac

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_6
    invoke-virtual {v6}, La/fet;->X()V

    .line 191
    .line 192
    .line 193
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0
.end method
