.class public abstract La/v4o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/v4o;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(La/t0o0;La/fet;I)V
    .locals 10

    .line 1
    const v0, -0x670eaf83

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x6

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x4

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    or-int/2addr v0, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p2

    .line 25
    :goto_1
    and-int/lit8 v4, v0, 0x3

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x1

    .line 29
    if-eq v4, v1, :cond_2

    .line 30
    .line 31
    move v4, v6

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v4, v5

    .line 34
    :goto_2
    and-int/lit8 v7, v0, 0x1

    .line 35
    .line 36
    invoke-virtual {p1, v7, v4}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_7

    .line 41
    .line 42
    sget-object v4, La/dy2;->b:La/zfn;

    .line 43
    .line 44
    invoke-virtual {p1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    sget-object v8, La/ukd;->a:La/cl5;

    .line 55
    .line 56
    if-ne v7, v8, :cond_3

    .line 57
    .line 58
    sget-object v7, La/u4o;->a:La/u4o;

    .line 59
    .line 60
    invoke-virtual {p1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    check-cast v7, La/jhy;

    .line 64
    .line 65
    check-cast v7, La/xdr;

    .line 66
    .line 67
    invoke-virtual {p1, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    and-int/lit8 v0, v0, 0xe

    .line 72
    .line 73
    if-ne v0, v2, :cond_4

    .line 74
    .line 75
    move v5, v6

    .line 76
    :cond_4
    or-int v0, v9, v5

    .line 77
    .line 78
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    if-ne v2, v8, :cond_6

    .line 85
    .line 86
    :cond_5
    new-instance v2, La/qzn;

    .line 87
    .line 88
    invoke-direct {v2, v4, p0, v1}, La/qzn;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 95
    .line 96
    const/4 v4, 0x6

    .line 97
    const/4 v5, 0x2

    .line 98
    const/4 v1, 0x0

    .line 99
    move-object v3, p1

    .line 100
    move-object v0, v7

    .line 101
    invoke-static/range {v0 .. v5}, La/y860;->f(La/xdr;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_8

    .line 113
    .line 114
    new-instance v1, La/o2l;

    .line 115
    .line 116
    const/16 v2, 0x18

    .line 117
    .line 118
    invoke-direct {v1, p0, p2, v2}, La/o2l;-><init>(Ljava/lang/Object;IB)V

    .line 119
    .line 120
    .line 121
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 122
    .line 123
    :cond_8
    return-void
.end method
