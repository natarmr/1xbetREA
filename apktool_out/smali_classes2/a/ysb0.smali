.class public final La/ysb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nae0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/ugf0;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:La/vne;

.field public final e:Ljava/lang/Object;

.field public volatile f:La/xsb0;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/ugf0;Lkotlin/jvm/functions/Function1;La/vne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ysb0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, La/ysb0;->b:La/ugf0;

    .line 7
    .line 8
    iput-object p3, p0, La/ysb0;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iput-object p4, p0, La/ysb0;->d:La/vne;

    .line 11
    .line 12
    new-instance p1, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/ysb0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p2, Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, La/ysb0;->f:La/xsb0;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, La/ysb0;->e:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter p1

    .line 16
    :try_start_0
    iget-object v0, p0, La/ysb0;->f:La/xsb0;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iget-object v0, p0, La/ysb0;->b:La/ugf0;

    .line 25
    .line 26
    iget-object v1, p0, La/ysb0;->c:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/util/List;

    .line 36
    .line 37
    iget-object v2, p0, La/ysb0;->d:La/vne;

    .line 38
    .line 39
    new-instance v3, La/qw80;

    .line 40
    .line 41
    const/16 v4, 0x1d

    .line 42
    .line 43
    invoke-direct {v3, p2, p0, v4}, La/qw80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance p2, La/szp;

    .line 50
    .line 51
    sget-object v4, La/gqw0;->z1:La/gqw0;

    .line 52
    .line 53
    new-instance v5, La/ssa0;

    .line 54
    .line 55
    const/16 v6, 0xb

    .line 56
    .line 57
    invoke-direct {v5, v3, v6}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    new-instance v3, La/rnp;

    .line 61
    .line 62
    const/4 v6, 0x3

    .line 63
    invoke-direct {v3, v6}, La/rnp;-><init>(B)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p2, v4, v3, v5}, La/szp;-><init>(La/mhi0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, La/xsb0;

    .line 70
    .line 71
    new-instance v4, La/b1f;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    const/16 v6, 0x12

    .line 75
    .line 76
    invoke-direct {v4, v1, v5, v6}, La/b1f;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v4, La/ncj;

    .line 84
    .line 85
    invoke-direct {v4, p2, v1, v0, v2}, La/ncj;-><init>(La/szp;Ljava/util/List;La/ugf0;La/vne;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v3, v4}, La/xsb0;-><init>(La/wbj;)V

    .line 89
    .line 90
    .line 91
    new-instance p2, La/xsb0;

    .line 92
    .line 93
    invoke-direct {p2, v3}, La/xsb0;-><init>(La/wbj;)V

    .line 94
    .line 95
    .line 96
    iput-object p2, p0, La/ysb0;->f:La/xsb0;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    move-exception p0

    .line 100
    goto :goto_1

    .line 101
    :cond_0
    :goto_0
    iget-object p0, p0, La/ysb0;->f:La/xsb0;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    monitor-exit p1

    .line 107
    return-object p0

    .line 108
    :goto_1
    monitor-exit p1

    .line 109
    throw p0

    .line 110
    :cond_1
    return-object p1
.end method
