.class public final La/q530;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n530;


# direct methods
.method public constructor <init>(La/n530;)V
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
    iput-object p1, p0, La/q530;->a:La/n530;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(J)La/gmq;
    .locals 9

    .line 1
    iget-object p0, p0, La/q530;->a:La/n530;

    .line 2
    .line 3
    iget-object v0, p0, La/n530;->c:La/qoj0;

    .line 4
    .line 5
    new-instance v1, La/l87;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, La/l87;-><init>(La/n530;JLa/yje;)V

    .line 9
    .line 10
    .line 11
    sget v5, La/aoq;->a:I

    .line 12
    .line 13
    new-instance v4, La/a1g;

    .line 14
    .line 15
    const/16 p0, 0x15

    .line 16
    .line 17
    invoke-direct {v4, v0, v1, p0}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    if-lez v5, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    if-ne v5, p1, :cond_0

    .line 24
    .line 25
    new-instance p1, La/i89;

    .line 26
    .line 27
    invoke-direct {p1, v4, p0}, La/i89;-><init>(La/gmq;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance v3, La/ptb;

    .line 32
    .line 33
    sget-object v6, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 34
    .line 35
    const/4 v7, -0x2

    .line 36
    sget-object v8, La/i99;->a:La/i99;

    .line 37
    .line 38
    invoke-direct/range {v3 .. v8}, La/ptb;-><init>(La/a1g;ILkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_1
    const-string p0, "Expected positive concurrency level, but had "

    .line 43
    .line 44
    invoke-static {v5, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v2
.end method
