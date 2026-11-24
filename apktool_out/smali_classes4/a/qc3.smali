.class public final La/qc3;
.super La/eiu0;
.source "SourceFile"

# interfaces
.implements La/lc3;


# instance fields
.field public final c:La/rc3;

.field public final d:La/fxu;

.field public final e:La/oeg0;

.field public final f:La/p7m0;

.field public final g:La/p7m0;


# direct methods
.method public constructor <init>(La/rc3;La/svu;La/fxu;La/oeg0;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/qc3;->c:La/rc3;

    .line 8
    .line 9
    iput-object p3, p0, La/qc3;->d:La/fxu;

    .line 10
    .line 11
    iput-object p4, p0, La/qc3;->e:La/oeg0;

    .line 12
    .line 13
    new-instance p3, La/mc3;

    .line 14
    .line 15
    iget p1, p1, La/rc3;->a:I

    .line 16
    .line 17
    sget-object p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 18
    .line 19
    iget-byte p4, p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-ne p1, p4, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v0

    .line 27
    :goto_0
    invoke-direct {p3, p1, v0}, La/mc3;-><init>(ZZ)V

    .line 28
    .line 29
    .line 30
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/qc3;->f:La/p7m0;

    .line 35
    .line 36
    invoke-virtual {p2}, La/svu;->l()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    new-instance p2, La/kc3;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    const p1, 0x7f08045e

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const p1, 0x7f080459

    .line 49
    .line 50
    .line 51
    :goto_1
    new-instance p3, La/jc3;

    .line 52
    .line 53
    const-string p4, ""

    .line 54
    .line 55
    invoke-direct {p3, p4}, La/jc3;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p2, p4, p1, p3}, La/kc3;-><init>(Ljava/lang/String;ILa/jc3;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, La/qc3;->g:La/p7m0;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object p0, p0, La/qc3;->e:La/oeg0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/c8d;

    .line 12
    .line 13
    sget-object v2, La/y7d;->a:La/v7d;

    .line 14
    .line 15
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    move-object v1, v0

    .line 26
    check-cast v1, La/paw;

    .line 27
    .line 28
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/oe50;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/pc3;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, p0, v3, v2}, La/pc3;-><init>(La/qc3;La/yje;B)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x3

    .line 17
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final u(La/diu0;La/vzg0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eiu0;->a:La/diu0;

    .line 5
    .line 6
    iput-object p2, p0, La/eiu0;->b:La/vzg0;

    .line 7
    .line 8
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, La/pc3;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {p2, p0, v1, v0}, La/pc3;-><init>(La/qc3;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    invoke-static {p1, v1, v1, p2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 21
    .line 22
    .line 23
    return-void
.end method
