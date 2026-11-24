.class public abstract La/gpw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/kdw;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/kdw;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/gpw;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/dbd;La/ugd;La/fet;I)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x414ee40c

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p2, v0}, La/fet;->e(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x2

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v1

    .line 24
    :goto_0
    or-int/2addr v0, p3

    .line 25
    and-int/lit8 v2, v0, 0x13

    .line 26
    .line 27
    const/16 v3, 0x12

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x1

    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    move v2, v5

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v2, v4

    .line 36
    :goto_1
    and-int/2addr v0, v5

    .line 37
    invoke-virtual {p2, v0, v2}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_8

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    if-eq v0, v5, :cond_3

    .line 50
    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    const v0, 0x7f080a69

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    const v0, 0x7f080a5e

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/4 v0, 0x0

    .line 74
    :goto_2
    if-nez v0, :cond_5

    .line 75
    .line 76
    const v0, -0x45e5e63

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x6

    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p1, p2, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    const v1, -0x45dd2e3

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v1}, La/fet;->e0(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {p2, v1}, La/fet;->e(I)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    sget-object v1, La/ukd;->a:La/cl5;

    .line 115
    .line 116
    if-ne v2, v1, :cond_7

    .line 117
    .line 118
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    new-instance v2, La/dmm;

    .line 123
    .line 124
    new-instance v0, La/ta50;

    .line 125
    .line 126
    new-instance v5, La/wkm;

    .line 127
    .line 128
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 129
    .line 130
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 135
    .line 136
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 137
    .line 138
    .line 139
    move-result-wide v10

    .line 140
    sget v1, La/y3d;->h:I

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    const/4 v8, 0x1

    .line 144
    sget-object v9, La/ra50;->a:La/ra50;

    .line 145
    .line 146
    invoke-direct/range {v5 .. v11}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 147
    .line 148
    .line 149
    invoke-direct {v0, v5}, La/ta50;-><init>(La/wkm;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {v2, v0}, La/dmm;-><init>(La/wa50;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    check-cast v2, La/dmm;

    .line 159
    .line 160
    sget-object v0, La/gpw;->a:La/zfn;

    .line 161
    .line 162
    invoke-virtual {v0, v2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const/16 v1, 0x38

    .line 167
    .line 168
    invoke-static {v0, p1, p2, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    invoke-virtual {p2}, La/fet;->X()V

    .line 176
    .line 177
    .line 178
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    if-eqz p2, :cond_9

    .line 183
    .line 184
    new-instance v0, La/sjs;

    .line 185
    .line 186
    const/16 v1, 0x11

    .line 187
    .line 188
    invoke-direct {v0, p0, p1, p3, v1}, La/sjs;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 189
    .line 190
    .line 191
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 192
    .line 193
    :cond_9
    return-void
.end method
