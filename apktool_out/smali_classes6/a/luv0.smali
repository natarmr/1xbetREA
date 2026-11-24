.class public abstract La/luv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ago;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ago;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/luv0;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/ywv0;La/fet;I)V
    .locals 11

    .line 1
    iget-object v0, p1, La/ywv0;->b:La/h0q0;

    .line 2
    .line 3
    const v1, -0x50c2a3c5

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v1}, La/fet;->g0(I)La/fet;

    .line 7
    .line 8
    .line 9
    or-int/lit8 v1, p3, 0x6

    .line 10
    .line 11
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v3, 0x20

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v2, 0x10

    .line 22
    .line 23
    :goto_0
    or-int/2addr v1, v2

    .line 24
    and-int/lit8 v2, v1, 0x13

    .line 25
    .line 26
    const/16 v4, 0x12

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x1

    .line 30
    if-eq v2, v4, :cond_1

    .line 31
    .line 32
    move v2, v6

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v5

    .line 35
    :goto_1
    and-int/lit8 v4, v1, 0x1

    .line 36
    .line 37
    invoke-virtual {p2, v4, v2}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_7

    .line 42
    .line 43
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object p0, p0, La/bxv0;->c:La/lsv0;

    .line 48
    .line 49
    instance-of p0, p0, La/isv0;

    .line 50
    .line 51
    if-nez p0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_8

    .line 58
    .line 59
    new-instance p2, La/uqv0;

    .line 60
    .line 61
    invoke-direct {p2, p1, p3}, La/uqv0;-><init>(La/ywv0;I)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-wide v7, p0, La/bxv0;->d:J

    .line 72
    .line 73
    const-wide/16 v9, 0x10

    .line 74
    .line 75
    cmp-long p0, v7, v9

    .line 76
    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 81
    .line 82
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 83
    .line 84
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getOverlayBackground40-0d7_KjU()J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    :goto_2
    sget-object p0, La/bmd;->h:La/zfn;

    .line 89
    .line 90
    invoke-virtual {p2, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, La/w6k;

    .line 95
    .line 96
    sget-object v0, La/qmk;->a:La/zcl;

    .line 97
    .line 98
    const/high16 v0, 0x42f00000    # 120.0f

    .line 99
    .line 100
    invoke-interface {p0, v0}, La/w6k;->w0(F)F

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 105
    .line 106
    and-int/lit8 v1, v1, 0x70

    .line 107
    .line 108
    if-ne v1, v3, :cond_4

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    move v6, v5

    .line 112
    :goto_3
    invoke-virtual {p2, p0}, La/fet;->d(F)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    or-int/2addr v1, v6

    .line 117
    invoke-virtual {p2, v7, v8}, La/fet;->f(J)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    or-int/2addr v1, v2

    .line 122
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-nez v1, :cond_5

    .line 127
    .line 128
    sget-object v1, La/ukd;->a:La/cl5;

    .line 129
    .line 130
    if-ne v2, v1, :cond_6

    .line 131
    .line 132
    :cond_5
    new-instance v2, La/c63;

    .line 133
    .line 134
    invoke-direct {v2, p1, p0, v7, v8}, La/c63;-><init>(La/ywv0;FJ)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 141
    .line 142
    invoke-static {v0, v2}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {v5, p2, p0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 147
    .line 148
    .line 149
    sget-object p0, La/jm40;->b:La/jm40;

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 153
    .line 154
    .line 155
    :goto_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    if-eqz p2, :cond_8

    .line 160
    .line 161
    new-instance v0, La/onu0;

    .line 162
    .line 163
    const/16 v1, 0x9

    .line 164
    .line 165
    invoke-direct {v0, p0, p1, p3, v1}, La/onu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 166
    .line 167
    .line 168
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 169
    .line 170
    :cond_8
    return-void
.end method
