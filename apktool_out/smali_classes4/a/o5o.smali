.class public abstract La/o5o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:La/c4m0;

.field public static b:Ljava/lang/Long;

.field public static final c:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/urn;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, La/urn;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/o5o;->c:La/n0o0;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(La/j1h;La/fet;I)V
    .locals 12

    .line 1
    const v0, -0x20d6f88f

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
    and-int/lit8 v3, v0, 0x3

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    if-eq v3, v1, :cond_2

    .line 30
    .line 31
    move v1, v5

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v1, v4

    .line 34
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 35
    .line 36
    invoke-virtual {p1, v3, v1}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_7

    .line 41
    .line 42
    sget-object v1, La/t0h;->a:La/zfn;

    .line 43
    .line 44
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v7, v1

    .line 49
    check-cast v7, La/mm40;

    .line 50
    .line 51
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v3, La/ukd;->a:La/cl5;

    .line 56
    .line 57
    if-ne v1, v3, :cond_3

    .line 58
    .line 59
    sget-object v1, La/n5o;->a:La/n5o;

    .line 60
    .line 61
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    check-cast v1, La/jhy;

    .line 65
    .line 66
    move-object v6, v1

    .line 67
    check-cast v6, La/xdr;

    .line 68
    .line 69
    and-int/lit8 v0, v0, 0xe

    .line 70
    .line 71
    if-ne v0, v2, :cond_4

    .line 72
    .line 73
    move v4, v5

    .line 74
    :cond_4
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v4, :cond_5

    .line 79
    .line 80
    if-ne v0, v3, :cond_6

    .line 81
    .line 82
    :cond_5
    new-instance v0, La/yhn;

    .line 83
    .line 84
    const/16 v1, 0xd

    .line 85
    .line 86
    invoke-direct {v0, p0, v1}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_6
    move-object v8, v0

    .line 93
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 94
    .line 95
    const/4 v10, 0x6

    .line 96
    const/4 v11, 0x0

    .line 97
    move-object v9, p1

    .line 98
    invoke-static/range {v6 .. v11}, La/y860;->f(La/xdr;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    move-object v9, p1

    .line 103
    invoke-virtual {v9}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_3
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_8

    .line 111
    .line 112
    new-instance v0, La/z4o;

    .line 113
    .line 114
    const/4 v1, 0x7

    .line 115
    invoke-direct {v0, p0, p2, v1}, La/z4o;-><init>(La/p6t0;IB)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 119
    .line 120
    :cond_8
    return-void
.end method

.method public static final b(JLandroid/widget/TextView;)V
    .locals 4

    .line 1
    const-wide/32 v0, 0x5265c00

    .line 2
    .line 3
    .line 4
    div-long v0, p0, v0

    .line 5
    .line 6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    sub-long/2addr p0, v0

    .line 13
    const-wide/32 v0, 0x36ee80

    .line 14
    .line 15
    .line 16
    div-long v0, p0, v0

    .line 17
    .line 18
    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    sub-long/2addr p0, v0

    .line 25
    const-wide/32 v0, 0xea60

    .line 26
    .line 27
    .line 28
    div-long v0, p0, v0

    .line 29
    .line 30
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    sub-long/2addr p0, v2

    .line 37
    const-wide/16 v2, 0x3e8

    .line 38
    .line 39
    div-long/2addr p0, v2

    .line 40
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v1, p0}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string p1, " : "

    .line 58
    .line 59
    invoke-static {v0, p1, p0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {}, La/by7;->c()La/by7;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, p0}, La/by7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const v0, 0x7f130d4e

    .line 76
    .line 77
    .line 78
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method
