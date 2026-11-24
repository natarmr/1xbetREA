.class public final La/ir30;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lne;

.field public final b:I

.field public final c:La/p7m0;

.field public final d:La/qoj0;

.field public final e:La/a8z;

.field public f:La/c4m0;


# direct methods
.method public constructor <init>(La/lne;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ir30;->a:La/lne;

    .line 8
    .line 9
    long-to-int p1, p2

    .line 10
    iput p1, p0, La/ir30;->b:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/ir30;->c:La/p7m0;

    .line 18
    .line 19
    sget-object p1, La/i99;->b:La/i99;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    const/4 p3, 0x1

    .line 23
    invoke-static {p2, p3, p1}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/ir30;->d:La/qoj0;

    .line 28
    .line 29
    sget-object p1, La/wez;->b:La/wez;

    .line 30
    .line 31
    new-instance p2, La/np30;

    .line 32
    .line 33
    invoke-direct {p2, p0, p3}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/ir30;->e:La/a8z;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ir30;->c:La/p7m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/ir30;->f:La/c4m0;

    .line 8
    .line 9
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ir30;->c:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/Pair;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final c()La/p6d;
    .locals 4

    .line 1
    new-instance v0, La/fhq;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, v2, v1}, La/fhq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/vsg0;

    .line 10
    .line 11
    invoke-direct {v1, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/sot;

    .line 15
    .line 16
    const/16 v3, 0x1b

    .line 17
    .line 18
    invoke-direct {v0, p0, v2, v3}, La/sot;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/p6d;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    iget-object p0, p0, La/ir30;->c:La/p7m0;

    .line 25
    .line 26
    invoke-direct {v2, p0, v1, v0, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/ir30;->f:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/Pair;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, La/ir30;->c:La/p7m0;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, La/ir30;->f:La/c4m0;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 v0, 0x1

    .line 37
    if-ne p1, v0, :cond_0

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-object p1, p0, La/ir30;->e:La/a8z;

    .line 41
    .line 42
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/vne;

    .line 47
    .line 48
    new-instance v0, La/e3p;

    .line 49
    .line 50
    const/16 v2, 0x12

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v2}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x3

    .line 56
    invoke-static {p1, v1, v1, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, La/ir30;->f:La/c4m0;

    .line 61
    .line 62
    return-void
.end method
