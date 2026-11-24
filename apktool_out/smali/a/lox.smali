.class public final La/lox;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/onexdatabase/OnexDatabase_Impl;

.field public final b:La/jrs0;

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final d:La/hox;

.field public final e:La/hox;

.field public final f:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Lorg/xplatform/onexdatabase/OnexDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lox;->a:Lorg/xplatform/onexdatabase/OnexDatabase_Impl;

    .line 5
    .line 6
    new-instance v0, La/jrs0;

    .line 7
    .line 8
    iget-boolean v5, p1, La/zdg0;->i:Z

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move-object v3, p3

    .line 13
    move-object v4, p4

    .line 14
    invoke-direct/range {v0 .. v5}, La/jrs0;-><init>(Lorg/xplatform/onexdatabase/OnexDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/lox;->b:La/jrs0;

    .line 18
    .line 19
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/lox;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    new-instance p1, La/hox;

    .line 28
    .line 29
    invoke-direct {p1, p0, p2}, La/hox;-><init>(La/lox;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/lox;->d:La/hox;

    .line 33
    .line 34
    new-instance p1, La/hox;

    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    invoke-direct {p1, p0, p2}, La/hox;-><init>(La/lox;B)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/lox;->e:La/hox;

    .line 41
    .line 42
    new-instance p1, Ljava/lang/Object;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, La/lox;->f:Ljava/lang/Object;

    .line 48
    .line 49
    new-instance p1, La/hox;

    .line 50
    .line 51
    const/4 p2, 0x2

    .line 52
    invoke-direct {p1, p0, p2}, La/hox;-><init>(La/lox;B)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, La/jrs0;->j:Ljava/lang/Object;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/kox;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/kox;

    .line 7
    .line 8
    iget v1, v0, La/kox;->k:I

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
    iput v1, v0, La/kox;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/kox;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/kox;-><init>(La/lox;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/kox;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/kox;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/lox;->b:La/jrs0;

    .line 51
    .line 52
    iput v3, v0, La/kox;->k:I

    .line 53
    .line 54
    invoke-virtual {p2, p1, v0}, La/jrs0;->e(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    iget-object p0, p0, La/lox;->f:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter p0

    .line 64
    monitor-exit p0

    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method
