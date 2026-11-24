.class public final La/e5c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dhu;

.field public final b:La/wsf0;


# direct methods
.method public constructor <init>(La/dhu;La/wsf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/e5c;->a:La/dhu;

    .line 5
    .line 6
    iput-object p2, p0, La/e5c;->b:La/wsf0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/e5c;->a:La/dhu;

    .line 5
    .line 6
    iget-object v0, v0, La/dhu;->a:La/pbt;

    .line 7
    .line 8
    iget-object v0, v0, La/pbt;->b:La/lsn;

    .line 9
    .line 10
    iget-object v0, v0, La/lsn;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/SharedPreferences;

    .line 13
    .line 14
    const-string v1, "OneXGamesBalanceLocalDataSource.BALANCE_ID_KEY"

    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    const/16 v5, 0xa

    .line 25
    .line 26
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, La/ql5;

    .line 48
    .line 49
    iget-wide v5, v5, La/ql5;->a:J

    .line 50
    .line 51
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    cmp-long p1, v0, v2

    .line 60
    .line 61
    if-lez p1, :cond_1

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_1

    .line 72
    .line 73
    iget-object p0, p0, La/e5c;->b:La/wsf0;

    .line 74
    .line 75
    iget-object p0, p0, La/wsf0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, La/g45;

    .line 78
    .line 79
    invoke-virtual {p0}, La/g45;->F()La/xru;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    sget-object p1, La/bm5;->d:La/bm5;

    .line 84
    .line 85
    iget-object p0, p0, La/xru;->a:La/rrd;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, La/rrd;->p(La/bm5;)J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    xor-int/lit8 p0, p0, 0x1

    .line 100
    .line 101
    return p0

    .line 102
    :cond_1
    const/4 p0, 0x0

    .line 103
    return p0
.end method
