.class public final La/nkc0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/p7m0;


# direct methods
.method public constructor <init>(La/i1w0;La/tpx;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/lkc0;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p1, v0}, La/lkc0;-><init>(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/nkc0;->b:La/p7m0;

    .line 18
    .line 19
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/ljc0;

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    invoke-direct {v1, p1}, La/ljc0;-><init>(B)V

    .line 27
    .line 28
    .line 29
    new-instance v4, La/o690;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    const/16 v2, 0x15

    .line 33
    .line 34
    invoke-direct {v4, p2, p0, p1, v2}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    const/16 v5, 0xe

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 42
    .line 43
    .line 44
    return-void
.end method
