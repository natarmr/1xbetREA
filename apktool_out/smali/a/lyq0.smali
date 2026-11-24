.class public abstract La/lyq0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/cc3;->a:La/i1t0;

    .line 2
    .line 3
    const/high16 v0, 0x42800000    # 64.0f

    .line 4
    .line 5
    sput v0, La/lyq0;->a:F

    .line 6
    .line 7
    sget v0, La/ac3;->a:I

    .line 8
    .line 9
    sget v0, La/zb3;->a:I

    .line 10
    .line 11
    sget v0, La/qb3;->a:I

    .line 12
    .line 13
    sget v0, La/pb3;->a:I

    .line 14
    .line 15
    return-void
.end method

.method public static a(La/oyq0;Lkotlin/jvm/functions/Function0;La/fet;II)La/zyn;
    .locals 7

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x7

    .line 7
    invoke-static {v1, p0, p2}, La/ob3;->d(IILa/fet;)La/oyq0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 12
    .line 13
    sget-object v0, La/ukd;->a:La/cl5;

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    new-instance p1, La/zxb;

    .line 24
    .line 25
    const/16 p4, 0x1c

    .line 26
    .line 27
    invoke-direct {p1, p4}, La/zxb;-><init>(B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    :cond_2
    sget-object p4, La/yt40;->c:La/yt40;

    .line 36
    .line 37
    invoke-static {p4, p2}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    invoke-static {p2}, La/wzk0;->a(La/fet;)La/sjj;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    and-int/lit8 v3, p3, 0xe

    .line 46
    .line 47
    xor-int/lit8 v3, v3, 0x6

    .line 48
    .line 49
    const/4 v4, 0x4

    .line 50
    const/4 v5, 0x1

    .line 51
    if-le v3, v4, :cond_3

    .line 52
    .line 53
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_4

    .line 58
    .line 59
    :cond_3
    and-int/lit8 v3, p3, 0x6

    .line 60
    .line 61
    if-ne v3, v4, :cond_5

    .line 62
    .line 63
    :cond_4
    move v3, v5

    .line 64
    goto :goto_0

    .line 65
    :cond_5
    move v3, v1

    .line 66
    :goto_0
    and-int/lit8 v4, p3, 0x70

    .line 67
    .line 68
    xor-int/lit8 v4, v4, 0x30

    .line 69
    .line 70
    const/16 v6, 0x20

    .line 71
    .line 72
    if-le v4, v6, :cond_6

    .line 73
    .line 74
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_7

    .line 79
    .line 80
    :cond_6
    and-int/lit8 v4, p3, 0x30

    .line 81
    .line 82
    if-ne v4, v6, :cond_8

    .line 83
    .line 84
    :cond_7
    move v4, v5

    .line 85
    goto :goto_1

    .line 86
    :cond_8
    move v4, v1

    .line 87
    :goto_1
    or-int/2addr v3, v4

    .line 88
    invoke-virtual {p2, p4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    or-int/2addr v3, v4

    .line 93
    invoke-virtual {p2, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    or-int/2addr v3, v4

    .line 98
    const v4, 0xe000

    .line 99
    .line 100
    .line 101
    and-int/2addr v4, p3

    .line 102
    xor-int/lit16 v4, v4, 0x6000

    .line 103
    .line 104
    const/16 v6, 0x4000

    .line 105
    .line 106
    if-le v4, v6, :cond_9

    .line 107
    .line 108
    invoke-virtual {p2, v1}, La/fet;->h(Z)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_a

    .line 113
    .line 114
    :cond_9
    and-int/lit16 p3, p3, 0x6000

    .line 115
    .line 116
    if-ne p3, v6, :cond_b

    .line 117
    .line 118
    :cond_a
    move v1, v5

    .line 119
    :cond_b
    or-int p3, v3, v1

    .line 120
    .line 121
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-nez p3, :cond_c

    .line 126
    .line 127
    if-ne v1, v0, :cond_d

    .line 128
    .line 129
    :cond_c
    new-instance v1, La/zyn;

    .line 130
    .line 131
    invoke-direct {v1, v2, p4, p0, p1}, La/zyn;-><init>(La/sjj;La/nul0;La/oyq0;Lkotlin/jvm/functions/Function0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_d
    check-cast v1, La/zyn;

    .line 138
    .line 139
    return-object v1
.end method

.method public static b(La/oyq0;La/fet;I)La/clo;
    .locals 9

    .line 1
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, La/zxb;

    .line 10
    .line 11
    const/16 v2, 0x1c

    .line 12
    .line 13
    invoke-direct {v0, v2}, La/zxb;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    sget-object v2, La/yt40;->c:La/yt40;

    .line 22
    .line 23
    invoke-static {v2, p1}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {p1}, La/wzk0;->a(La/fet;)La/sjj;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    and-int/lit8 v4, p2, 0xe

    .line 32
    .line 33
    xor-int/lit8 v4, v4, 0x6

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x4

    .line 37
    const/4 v7, 0x1

    .line 38
    if-le v4, v6, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    :cond_1
    and-int/lit8 v4, p2, 0x6

    .line 47
    .line 48
    if-ne v4, v6, :cond_3

    .line 49
    .line 50
    :cond_2
    move v4, v7

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    move v4, v5

    .line 53
    :goto_0
    and-int/lit8 v6, p2, 0x70

    .line 54
    .line 55
    xor-int/lit8 v6, v6, 0x30

    .line 56
    .line 57
    const/16 v8, 0x20

    .line 58
    .line 59
    if-le v6, v8, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_5

    .line 66
    .line 67
    :cond_4
    and-int/lit8 p2, p2, 0x30

    .line 68
    .line 69
    if-ne p2, v8, :cond_6

    .line 70
    .line 71
    :cond_5
    move v5, v7

    .line 72
    :cond_6
    or-int p2, v4, v5

    .line 73
    .line 74
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    or-int/2addr p2, v4

    .line 79
    invoke-virtual {p1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    or-int/2addr p2, v4

    .line 84
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-nez p2, :cond_7

    .line 89
    .line 90
    if-ne v4, v1, :cond_8

    .line 91
    .line 92
    :cond_7
    new-instance v4, La/clo;

    .line 93
    .line 94
    invoke-direct {v4, v3, v2, p0, v0}, La/clo;-><init>(La/sjj;La/nul0;La/oyq0;Lkotlin/jvm/functions/Function0;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_8
    check-cast v4, La/clo;

    .line 101
    .line 102
    return-object v4
.end method
