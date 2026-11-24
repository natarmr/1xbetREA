.class public final La/utb;
.super La/qtb;
.source "SourceFile"


# instance fields
.field public final e:La/xdr;


# direct methods
.method public constructor <init>(La/xdr;La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4, p5}, La/qtb;-><init>(La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/utb;->e:La/xdr;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Lkotlin/coroutines/CoroutineContext;ILa/i99;)La/ktb;
    .locals 6

    .line 1
    new-instance v0, La/utb;

    .line 2
    .line 3
    iget-object v1, p0, La/utb;->e:La/xdr;

    .line 4
    .line 5
    iget-object v2, p0, La/qtb;->d:La/gmq;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, La/utb;-><init>(La/xdr;La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final m(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La/stb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, La/stb;-><init>(La/utb;La/kmq;La/yje;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/wne;->a:La/wne;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method
