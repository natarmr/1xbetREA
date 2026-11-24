.class public final La/dbv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;


# direct methods
.method public synthetic constructor <init>(La/us00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dbv;->a:La/us00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/cbv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/cbv;

    .line 7
    .line 8
    iget v1, v0, La/cbv;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cbv;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cbv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/cbv;-><init>(La/dbv;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/cbv;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/cbv;->k:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, La/tvk;->a:La/rwj;

    .line 51
    .line 52
    sget-object p0, La/dvj;->c:La/dvj;

    .line 53
    .line 54
    new-instance v1, La/b04;

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    const/4 v5, 0x6

    .line 58
    invoke-direct {v1, v4, v2, v5}, La/b04;-><init>(ILa/yje;B)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, La/cbv;->k:I

    .line 62
    .line 63
    invoke-static {p0, v1, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, p1, :cond_3

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    return-object p0
.end method
