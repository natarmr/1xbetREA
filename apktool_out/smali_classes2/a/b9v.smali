.class public abstract La/b9v;
.super La/hz5;
.source "SourceFile"


# static fields
.field public static volatile A:La/haw0;


# instance fields
.field public final z:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILa/qgd;La/qav;La/rav;)V
    .locals 9

    .line 1
    invoke-static {p1}, La/d7x0;->a(Landroid/content/Context;)La/d7x0;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    sget-object v4, La/oav;->e:La/oav;

    .line 6
    .line 7
    invoke-static {p5}, La/s0x;->H(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p6}, La/s0x;->H(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v6, La/zas0;

    .line 14
    .line 15
    const/16 v0, 0xe

    .line 16
    .line 17
    invoke-direct {v6, p5, v0}, La/zas0;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance v7, La/rkt0;

    .line 21
    .line 22
    const/16 p5, 0xa

    .line 23
    .line 24
    invoke-direct {v7, p6, p5}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    iget-object p5, p4, La/qgd;->f:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v8, p5

    .line 30
    check-cast v8, Ljava/lang/String;

    .line 31
    .line 32
    move-object v0, p0

    .line 33
    move-object v1, p1

    .line 34
    move-object v2, p2

    .line 35
    move v5, p3

    .line 36
    invoke-direct/range {v0 .. v8}, La/hz5;-><init>(Landroid/content/Context;Landroid/os/Looper;La/d7x0;La/pav;ILa/ez5;La/fz5;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p4, La/qgd;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ljava/util/Set;

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    .line 58
    .line 59
    invoke-interface {p0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const-string p0, "Expanding scopes is not permitted, use implied scopes instead"

    .line 67
    .line 68
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_1
    iput-object p0, v0, La/b9v;->z:Ljava/util/Set;

    .line 74
    .line 75
    sget-object p0, La/b9v;->A:La/haw0;

    .line 76
    .line 77
    if-nez p0, :cond_3

    .line 78
    .line 79
    const-class p0, La/b9v;

    .line 80
    .line 81
    monitor-enter p0

    .line 82
    :try_start_0
    sget-object p1, La/b9v;->A:La/haw0;

    .line 83
    .line 84
    if-nez p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, La/haw0;->a(Landroid/content/Context;)La/haw0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sput-object p1, La/b9v;->A:La/haw0;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    :goto_1
    monitor-exit p0

    .line 100
    return-void

    .line 101
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    throw p1

    .line 103
    :cond_3
    return-void
.end method


# virtual methods
.method public final e()Landroid/accounts/Account;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final g()Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    sget-object p0, La/b9v;->A:La/haw0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, La/b9v;->z:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method
