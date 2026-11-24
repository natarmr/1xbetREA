.class public abstract La/oy2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x41c80000    # 25.0f

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    const v1, 0x401a827a

    .line 7
    .line 8
    .line 9
    div-float/2addr v0, v1

    .line 10
    sput v0, La/oy2;->a:F

    .line 11
    .line 12
    return-void
.end method

.method public static final a(La/ye60;La/mm40;JLa/fet;I)V
    .locals 10

    .line 1
    const v0, 0x69deb1cb

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p5

    .line 18
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v2, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v2

    .line 30
    or-int/lit16 v0, v0, 0x80

    .line 31
    .line 32
    and-int/lit16 v2, v0, 0x93

    .line 33
    .line 34
    const/16 v3, 0x92

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    move v2, v5

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v2, v4

    .line 43
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {p4, v3, v2}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_8

    .line 50
    .line 51
    invoke-virtual {p4}, La/fet;->Z()V

    .line 52
    .line 53
    .line 54
    and-int/lit8 v2, p5, 0x1

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {p4}, La/fet;->B()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {p4}, La/fet;->X()V

    .line 66
    .line 67
    .line 68
    and-int/lit16 v0, v0, -0x381

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_4
    :goto_3
    and-int/lit16 v0, v0, -0x381

    .line 72
    .line 73
    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :goto_4
    invoke-virtual {p4}, La/fet;->s()V

    .line 79
    .line 80
    .line 81
    and-int/lit8 v0, v0, 0xe

    .line 82
    .line 83
    if-eq v0, v1, :cond_5

    .line 84
    .line 85
    move v5, v4

    .line 86
    :cond_5
    invoke-virtual {p4}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-nez v5, :cond_6

    .line 91
    .line 92
    sget-object v2, La/ukd;->a:La/cl5;

    .line 93
    .line 94
    if-ne v1, v2, :cond_7

    .line 95
    .line 96
    :cond_6
    new-instance v1, La/m51;

    .line 97
    .line 98
    const/16 v2, 0x1d

    .line 99
    .line 100
    invoke-direct {v1, p0, v2}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 107
    .line 108
    invoke-static {p1, v4, v1}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    sget-object v2, La/gqw0;->b:La/zx7;

    .line 113
    .line 114
    new-instance v3, La/ly2;

    .line 115
    .line 116
    invoke-direct {v3, p2, p3, v1}, La/ly2;-><init>(JLa/mm40;)V

    .line 117
    .line 118
    .line 119
    const v1, -0x628ed1fe

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v3, p4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    or-int/lit16 v0, v0, 0x1b0

    .line 127
    .line 128
    invoke-static {p0, v2, v1, p4, v0}, La/eeq;->x(La/ye60;La/u12;La/ugd;La/fet;I)V

    .line 129
    .line 130
    .line 131
    :goto_5
    move-wide v6, p2

    .line 132
    goto :goto_6

    .line 133
    :cond_8
    invoke-virtual {p4}, La/fet;->X()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :goto_6
    invoke-virtual {p4}, La/fet;->u()La/yfe0;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    if-eqz p2, :cond_9

    .line 142
    .line 143
    new-instance v3, La/my2;

    .line 144
    .line 145
    const/4 v9, 0x0

    .line 146
    move-object v4, p0

    .line 147
    move-object v5, p1

    .line 148
    move v8, p5

    .line 149
    invoke-direct/range {v3 .. v9}, La/my2;-><init>(Ljava/lang/Object;Ljava/lang/Object;JIB)V

    .line 150
    .line 151
    .line 152
    iput-object v3, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 153
    .line 154
    :cond_9
    return-void
.end method

.method public static final b(IILa/fet;La/mm40;)V
    .locals 6

    .line 1
    const v0, 0x29616e63

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p1, 0x1

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x2

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    or-int/lit8 v3, p0, 0x6

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p2, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    move v3, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v3, v2

    .line 25
    :goto_0
    or-int/2addr v3, p0

    .line 26
    :goto_1
    and-int/lit8 v4, v3, 0x3

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-eq v4, v2, :cond_2

    .line 30
    .line 31
    move v4, v5

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const/4 v4, 0x0

    .line 34
    :goto_2
    and-int/2addr v3, v5

    .line 35
    invoke-virtual {p2, v3, v4}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    sget-object p3, La/jm40;->b:La/jm40;

    .line 44
    .line 45
    :cond_3
    sget v0, La/oy2;->a:F

    .line 46
    .line 47
    const/high16 v3, 0x41c80000    # 25.0f

    .line 48
    .line 49
    invoke-static {p3, v0, v3}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v3, La/t9q0;->a:La/zfn;

    .line 54
    .line 55
    invoke-virtual {p2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, La/s9q0;

    .line 60
    .line 61
    iget-wide v3, v3, La/s9q0;->a:J

    .line 62
    .line 63
    new-instance v5, La/bx;

    .line 64
    .line 65
    invoke-direct {v5, v1, v3, v4}, La/bx;-><init>(BJ)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v5}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p2, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 77
    .line 78
    .line 79
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    new-instance v0, La/i00;

    .line 86
    .line 87
    invoke-direct {v0, p3, p0, p1, v2}, La/i00;-><init>(La/mm40;IIB)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 91
    .line 92
    :cond_5
    return-void
.end method
