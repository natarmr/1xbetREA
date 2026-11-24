.class public final La/fxt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/z220;


# direct methods
.method public synthetic constructor <init>(La/z220;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fxt;->a:La/z220;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/ext;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ext;

    .line 7
    .line 8
    iget v1, v0, La/ext;->k:I

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
    iput v1, v0, La/ext;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ext;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ext;-><init>(La/fxt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ext;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ext;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/ext;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/fxt;->a:La/z220;

    .line 53
    .line 54
    iget-object p2, p0, La/z220;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, La/mne;

    .line 57
    .line 58
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 59
    .line 60
    new-instance v2, La/u52;

    .line 61
    .line 62
    const/16 v4, 0x1a

    .line 63
    .line 64
    invoke-direct {v2, p0, p1, v3, v4}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p2, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p2, La/kgb;

    .line 75
    .line 76
    invoke-static {p2}, La/l8x;->v0(La/kgb;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const/4 p1, 0x5

    .line 81
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method
