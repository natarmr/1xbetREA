.class public final La/mox;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/work/impl/WorkDatabase_Impl;

.field public final b:La/krs0;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/concurrent/locks/ReentrantLock;

.field public final e:La/qgx;

.field public final f:La/qgx;

.field public final g:La/ieu;

.field public final h:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mox;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 5
    .line 6
    new-instance v8, La/krs0;

    .line 7
    .line 8
    iget-boolean v9, p1, La/aeg0;->k:Z

    .line 9
    .line 10
    new-instance v0, La/n5w;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/16 v7, 0x1c

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-class v3, La/mox;

    .line 17
    .line 18
    const-string v4, "notifyInvalidatedObservers"

    .line 19
    .line 20
    const-string v5, "notifyInvalidatedObservers(Ljava/util/Set;)V"

    .line 21
    .line 22
    move-object v2, p0

    .line 23
    invoke-direct/range {v0 .. v7}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 24
    .line 25
    .line 26
    move-object v1, p1

    .line 27
    move-object v2, p2

    .line 28
    move-object v3, p3

    .line 29
    move-object v4, p4

    .line 30
    move-object v6, v0

    .line 31
    move-object v0, v8

    .line 32
    move v5, v9

    .line 33
    invoke-direct/range {v0 .. v6}, La/krs0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLa/n5w;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/mox;->b:La/krs0;

    .line 37
    .line 38
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, La/mox;->c:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, La/mox;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 51
    .line 52
    new-instance v2, La/qgx;

    .line 53
    .line 54
    const/4 v3, 0x6

    .line 55
    invoke-direct {v2, p0, v3}, La/qgx;-><init>(La/mox;B)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, La/mox;->e:La/qgx;

    .line 59
    .line 60
    new-instance v2, La/qgx;

    .line 61
    .line 62
    const/4 v3, 0x7

    .line 63
    invoke-direct {v2, p0, v3}, La/qgx;-><init>(La/mox;B)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, La/mox;->f:La/qgx;

    .line 67
    .line 68
    new-instance v2, La/ieu;

    .line 69
    .line 70
    invoke-direct {v2, p1}, La/ieu;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, La/mox;->g:La/ieu;

    .line 74
    .line 75
    new-instance v1, Ljava/lang/Object;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, La/mox;->h:Ljava/lang/Object;

    .line 81
    .line 82
    new-instance v1, La/y2x;

    .line 83
    .line 84
    const/16 v2, 0x9

    .line 85
    .line 86
    invoke-direct {v1, p0, v2}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    iput-object v1, v0, La/krs0;->k:Ljava/lang/Object;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final a(La/bnn0;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/mox;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 2
    .line 3
    invoke-virtual {v0}, La/aeg0;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La/aeg0;->n()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, La/mox;->b:La/krs0;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/krs0;->i(La/zje;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object p1, La/wne;->a:La/wne;

    .line 25
    .line 26
    if-ne p0, p1, :cond_1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method
