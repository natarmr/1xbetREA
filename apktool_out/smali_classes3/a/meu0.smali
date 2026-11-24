.class public final La/meu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/tkz;

.field public b:La/bby;

.field public final c:La/p7m0;


# direct methods
.method public constructor <init>(La/tkz;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/meu0;->a:La/tkz;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/meu0;->c:La/p7m0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, La/meu0;->c:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0xb4

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/meu0;->b:La/bby;

    .line 21
    .line 22
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 23
    .line 24
    .line 25
    new-instance v5, La/npt0;

    .line 26
    .line 27
    const/16 v0, 0x9

    .line 28
    .line 29
    invoke-direct {v5, p0, v0}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    new-instance v6, La/wup0;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    const/16 v1, 0xc

    .line 36
    .line 37
    invoke-direct {v6, p0, v0, v1}, La/wup0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    const/4 v7, 0x4

    .line 41
    iget-object v1, p0, La/meu0;->a:La/tkz;

    .line 42
    .line 43
    const-wide/16 v2, 0x1

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static/range {v1 .. v7}, La/sac;->Y(La/vne;JLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/meu0;->b:La/bby;

    .line 51
    .line 52
    return-void
.end method
