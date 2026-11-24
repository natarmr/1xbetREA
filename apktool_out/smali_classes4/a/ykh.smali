.class public final La/ykh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:J


# instance fields
.field public final a:La/yzn0;

.field public final b:La/sjh;

.field public final c:La/vby;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    sget-object v1, La/bfn;->f:La/bfn;

    .line 6
    .line 7
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sput-wide v0, La/ykh;->d:J

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/yzn0;La/sjh;La/vby;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ykh;->a:La/yzn0;

    .line 8
    .line 9
    iput-object p2, p0, La/ykh;->b:La/sjh;

    .line 10
    .line 11
    iput-object p3, p0, La/ykh;->c:La/vby;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Ljava/lang/String;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p3, La/xkh;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/xkh;

    .line 7
    .line 8
    iget v1, v0, La/xkh;->l:I

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
    iput v1, v0, La/xkh;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xkh;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/xkh;-><init>(La/ykh;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/xkh;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/xkh;->l:I

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
    iget-object p0, v0, La/xkh;->i:La/ykh;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2, p4}, La/ckb;->P(JLjava/lang/String;)La/jo20;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 57
    .line 58
    iget-object p2, p0, La/ykh;->a:La/yzn0;

    .line 59
    .line 60
    iput-object p0, v0, La/xkh;->i:La/ykh;

    .line 61
    .line 62
    iput v3, v0, La/xkh;->l:I

    .line 63
    .line 64
    invoke-virtual {p2, p1, v0}, La/yzn0;->j(La/jo20;La/zje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-ne p3, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    const/16 p2, 0xa

    .line 76
    .line 77
    invoke-static {p3, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-eqz p3, :cond_4

    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    check-cast p3, La/blh;

    .line 99
    .line 100
    iget-object p4, p0, La/ykh;->c:La/vby;

    .line 101
    .line 102
    invoke-static {p3, p4}, La/bkb;->l0(La/blh;La/vby;)La/rkh;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 115
    .line 116
    new-instance p1, La/g0g0;

    .line 117
    .line 118
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    sget-object p0, La/iun;->a:La/iun;

    .line 122
    .line 123
    instance-of p2, p1, La/g0g0;

    .line 124
    .line 125
    if-eqz p2, :cond_5

    .line 126
    .line 127
    move-object p1, p0

    .line 128
    :cond_5
    return-object p1
.end method
