.class public final La/yv00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/p96;

.field public static final synthetic d:I


# instance fields
.field public a:Ljava/lang/String;

.field public b:La/zv00;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/kr20;->a:La/peg0;

    .line 2
    .line 3
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    const-string v1, "FATAL"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, La/p96;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, La/p96;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v3, v2, La/p96;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/p96;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    move-object v2, v0

    .line 38
    :cond_0
    sput-object v2, La/yv00;->c:La/p96;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0xa

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final b(La/p96;ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/yv00;->b:La/zv00;

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    check-cast p3, Ljava/lang/String;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    :goto_0
    if-eqz p2, :cond_5

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    if-eq p2, v0, :cond_4

    .line 17
    .line 18
    const/16 v0, 0x14

    .line 19
    .line 20
    if-eq p2, v0, :cond_3

    .line 21
    .line 22
    const/16 v0, 0x1e

    .line 23
    .line 24
    if-eq p2, v0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x28

    .line 27
    .line 28
    if-eq p2, v0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-interface {p0, p1, p3}, La/zv00;->g(La/p96;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-interface {p0, p1, p3}, La/zv00;->q(La/p96;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    invoke-interface {p0, p1, p3}, La/zv00;->k(La/p96;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_4
    invoke-interface {p0, p1, p3}, La/zv00;->h(La/p96;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_5
    invoke-interface {p0, p1, p3}, La/zv00;->o(La/p96;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
