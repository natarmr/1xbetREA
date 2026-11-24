.class public final La/ptb;
.super La/ktb;
.source "SourceFile"


# instance fields
.field public final d:La/a1g;

.field public final e:I


# direct methods
.method public constructor <init>(La/a1g;ILkotlin/coroutines/CoroutineContext;ILa/i99;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p4, p5}, La/ktb;-><init>(Lkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ptb;->d:La/a1g;

    .line 5
    .line 6
    iput p2, p0, La/ptb;->e:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "concurrency="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, La/ptb;->e:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final h(La/hzb0;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget v0, La/hbi0;->a:I

    .line 2
    .line 3
    new-instance v3, La/gbi0;

    .line 4
    .line 5
    iget v0, p0, La/ptb;->e:I

    .line 6
    .line 7
    invoke-direct {v3, v0}, La/fbi0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v5, La/mfi0;

    .line 11
    .line 12
    invoke-direct {v5, p1}, La/mfi0;-><init>(La/hzb0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, La/gqw0;->o1:La/gqw0;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v2, v0

    .line 26
    check-cast v2, La/bby;

    .line 27
    .line 28
    new-instance v1, La/y38;

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    move-object v4, p1

    .line 32
    invoke-direct/range {v1 .. v6}, La/y38;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/ptb;->d:La/a1g;

    .line 36
    .line 37
    invoke-virtual {p0, v1, p2}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object p0, La/wne;->a:La/wne;

    .line 41
    .line 42
    return-object p0
.end method

.method public final j(Lkotlin/coroutines/CoroutineContext;ILa/i99;)La/ktb;
    .locals 6

    .line 1
    new-instance v0, La/ptb;

    .line 2
    .line 3
    iget-object v1, p0, La/ptb;->d:La/a1g;

    .line 4
    .line 5
    iget v2, p0, La/ptb;->e:I

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, La/ptb;-><init>(La/a1g;ILkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final l(La/vne;)La/htb;
    .locals 6

    .line 1
    new-instance v0, La/jtb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v2, v1}, La/jtb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/i99;->a:La/i99;

    .line 9
    .line 10
    sget-object v3, La/yne;->a:La/yne;

    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    iget v5, p0, La/ktb;->b:I

    .line 14
    .line 15
    invoke-static {v5, v1, v2, v4}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object p0, p0, La/ktb;->a:Lkotlin/coroutines/CoroutineContext;

    .line 20
    .line 21
    invoke-static {p1, p0}, La/jne;->b(La/vne;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, La/hzb0;

    .line 26
    .line 27
    invoke-direct {p1, p0, v1}, La/hzb0;-><init>(Lkotlin/coroutines/CoroutineContext;La/q99;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v3, p1, v0}, La/a2;->d0(La/yne;La/a2;Lkotlin/jvm/functions/Function2;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method
