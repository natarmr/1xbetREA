.class public final La/rtb;
.super La/qtb;
.source "SourceFile"


# direct methods
.method public constructor <init>(La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p3, -0x3

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    sget-object p4, La/i99;->a:La/i99;

    .line 17
    .line 18
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, La/qtb;-><init>(La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final j(Lkotlin/coroutines/CoroutineContext;ILa/i99;)La/ktb;
    .locals 1

    .line 1
    new-instance v0, La/rtb;

    .line 2
    .line 3
    iget-object p0, p0, La/qtb;->d:La/gmq;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, La/qtb;-><init>(La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final k()La/gmq;
    .locals 0

    .line 1
    iget-object p0, p0, La/qtb;->d:La/gmq;

    .line 2
    .line 3
    return-object p0
.end method
