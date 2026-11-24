.class public abstract La/zwp0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/mhp0;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/mhp0;-><init>(B)V

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
    sput-object v1, La/zwp0;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/v0q0;La/ugd;La/fet;I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x7acdf16

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v0, p3, 0x6

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x2

    .line 23
    :goto_0
    or-int/2addr v0, p3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p3

    .line 26
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    const/16 v1, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v1, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v1

    .line 42
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 43
    .line 44
    const/16 v2, 0x12

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    if-eq v1, v2, :cond_4

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    move v1, v3

    .line 52
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 53
    .line 54
    invoke-virtual {p2, v2, v1}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_6

    .line 59
    .line 60
    instance-of v1, p0, La/r0q0;

    .line 61
    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    const v1, -0x2e3a7121

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v1}, La/fet;->e0(I)V

    .line 68
    .line 69
    .line 70
    shr-int/lit8 v0, v0, 0x3

    .line 71
    .line 72
    and-int/lit8 v0, v0, 0xe

    .line 73
    .line 74
    invoke-static {v0, p1, p2, v3}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 75
    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    const v1, -0x2e39dd65

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v1}, La/fet;->e0(I)V

    .line 82
    .line 83
    .line 84
    move-object v1, p0

    .line 85
    check-cast v1, La/r0q0;

    .line 86
    .line 87
    iget v6, v1, La/r0q0;->b:I

    .line 88
    .line 89
    iget-wide v9, v1, La/r0q0;->c:J

    .line 90
    .line 91
    new-instance v1, La/dmm;

    .line 92
    .line 93
    new-instance v2, La/ta50;

    .line 94
    .line 95
    new-instance v4, La/wkm;

    .line 96
    .line 97
    const/4 v7, 0x1

    .line 98
    sget-object v8, La/ra50;->a:La/ra50;

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-direct/range {v4 .. v10}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v2, v4}, La/ta50;-><init>(La/wkm;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, v2}, La/dmm;-><init>(La/wa50;)V

    .line 108
    .line 109
    .line 110
    sget-object v2, La/zwp0;->a:La/zfn;

    .line 111
    .line 112
    invoke-virtual {v2, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    and-int/lit8 v0, v0, 0x70

    .line 117
    .line 118
    const/16 v2, 0x8

    .line 119
    .line 120
    or-int/2addr v0, v2

    .line 121
    invoke-static {v1, p1, p2, v0}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v3}, La/fet;->r(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    invoke-virtual {p2}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    if-eqz p2, :cond_7

    .line 136
    .line 137
    new-instance v0, La/o1l0;

    .line 138
    .line 139
    const/16 v1, 0x18

    .line 140
    .line 141
    invoke-direct {v0, p0, p1, p3, v1}, La/o1l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 145
    .line 146
    :cond_7
    return-void
.end method
