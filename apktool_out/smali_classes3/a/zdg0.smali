.class public abstract La/zdg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/sje;

.field public b:Ljava/util/concurrent/Executor;

.field public c:La/tdg0;

.field public d:La/lox;

.field public final e:La/cu;

.field public final f:Ljava/lang/ThreadLocal;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Ljava/util/LinkedHashMap;

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/cu;

    .line 5
    .line 6
    new-instance v1, La/b0c0;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/16 v8, 0x15

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-class v4, La/zdg0;

    .line 13
    .line 14
    const-string v5, "onClosed"

    .line 15
    .line 16
    const-string v6, "onClosed()V"

    .line 17
    .line 18
    move-object v3, p0

    .line 19
    invoke-direct/range {v1 .. v8}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, La/cu;-><init>(La/b0c0;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, v3, La/zdg0;->e:La/cu;

    .line 26
    .line 27
    new-instance p0, Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p0, v3, La/zdg0;->f:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p0, v3, La/zdg0;->g:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p0, v3, La/zdg0;->h:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    iput-boolean p0, v3, La/zdg0;->i:Z

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public a(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public b()La/lox;
    .locals 1

    .line 1
    new-instance p0, La/q660;

    .line 2
    .line 3
    const-string v0, "This function should be implemented by Room\'s generated database implementation."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public c()La/ke70;
    .locals 1

    .line 1
    new-instance p0, La/q660;

    .line 2
    .line 3
    const-string v0, "This function should be implemented by Room\'s generated database implementation."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final d()La/lox;
    .locals 0

    .line 1
    iget-object p0, p0, La/zdg0;->d:La/lox;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "internalTracker"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public e()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public f()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, La/lun;->a:La/lun;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public g()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, La/lun;->a:La/lun;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final h(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, La/u7x;->H(La/zdg0;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zdg0;->c:La/tdg0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3}, La/tdg0;->n(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "connectionManager"

    .line 14
    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method
