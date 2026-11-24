.class public abstract La/fbh0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/dbh0;

.field public static final b:La/cbh0;

.field public static final c:La/yk80;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/dbh0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/fbh0;->a:La/dbh0;

    .line 7
    .line 8
    new-instance v0, La/cbh0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/fbh0;->b:La/cbh0;

    .line 14
    .line 15
    new-instance v0, La/yk80;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, v1}, La/yk80;-><init>(B)V

    .line 19
    .line 20
    .line 21
    sput-object v0, La/fbh0;->c:La/yk80;

    .line 22
    .line 23
    return-void
.end method

.method public static a(La/mm40;La/bch0;La/ma80;ZLa/qkq;I)La/mm40;
    .locals 8

    .line 1
    and-int/lit8 v0, p5, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    move v4, p3

    .line 7
    and-int/lit8 p3, p5, 0x10

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    :cond_1
    move-object v5, p4

    .line 13
    const/16 v7, 0x80

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    move-object v2, p2

    .line 20
    invoke-static/range {v0 .. v7}, La/fbh0;->b(La/mm40;La/bch0;La/ma80;ZZLa/qkq;La/gy40;I)La/mm40;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static b(La/mm40;La/bch0;La/ma80;ZZLa/qkq;La/gy40;I)La/mm40;
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p5, 0x0

    .line 6
    :cond_0
    move-object v5, p5

    .line 7
    new-instance v0, La/bbh0;

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move v3, p3

    .line 12
    move v4, p4

    .line 13
    move-object v6, p6

    .line 14
    invoke-direct/range {v0 .. v6}, La/bbh0;-><init>(La/bch0;La/ma80;ZZLa/qkq;La/gy40;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final c(La/sch0;JLa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, La/ebh0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/ebh0;

    .line 7
    .line 8
    iget v1, v0, La/ebh0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ebh0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ebh0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/ebh0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ebh0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, La/ebh0;->j:La/jie0;

    .line 37
    .line 38
    iget-object p1, v0, La/ebh0;->i:La/sch0;

    .line 39
    .line 40
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v8, p0

    .line 44
    move-object p0, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v8, La/jie0;

    .line 57
    .line 58
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sget-object p3, La/c050;->a:La/c050;

    .line 62
    .line 63
    new-instance v4, La/fl3;

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    move-object v5, p0

    .line 67
    move-wide v6, p1

    .line 68
    invoke-direct/range {v4 .. v9}, La/fl3;-><init>(La/sch0;JLa/jie0;La/yje;)V

    .line 69
    .line 70
    .line 71
    iput-object v5, v0, La/ebh0;->i:La/sch0;

    .line 72
    .line 73
    iput-object v8, v0, La/ebh0;->j:La/jie0;

    .line 74
    .line 75
    iput v3, v0, La/ebh0;->l:I

    .line 76
    .line 77
    invoke-virtual {v5, p3, v4, v0}, La/sch0;->g(La/c050;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    move-object p0, v5

    .line 85
    :goto_1
    iget p1, v8, La/jie0;->a:F

    .line 86
    .line 87
    invoke-virtual {p0, p1}, La/sch0;->i(F)J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    new-instance p2, La/ne60;

    .line 92
    .line 93
    invoke-direct {p2, p0, p1}, La/ne60;-><init>(J)V

    .line 94
    .line 95
    .line 96
    return-object p2
.end method
