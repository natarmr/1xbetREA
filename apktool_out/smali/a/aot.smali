.class public final La/aot;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/chf0;


# direct methods
.method public synthetic constructor <init>(La/chf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/aot;->a:La/chf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/qu6;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/nfx;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/nfx;

    .line 7
    .line 8
    iget v1, v0, La/nfx;->k:I

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
    iput v1, v0, La/nfx;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nfx;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/nfx;-><init>(La/aot;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/nfx;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nfx;->k:I

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
    iput v4, v0, La/nfx;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/aot;->a:La/chf0;

    .line 53
    .line 54
    iget-object p2, p0, La/chf0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, La/ou6;

    .line 57
    .line 58
    iget-object p0, p0, La/chf0;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, La/vby;

    .line 61
    .line 62
    invoke-static {p1, p0}, La/i120;->f0(La/qu6;La/vby;)La/pu6;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object p1, p2, La/ou6;->a:La/zdg0;

    .line 67
    .line 68
    new-instance v2, La/mu6;

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-direct {v2, p2, p0, v3, v5}, La/mu6;-><init>(La/ou6;La/pu6;La/yje;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, p1, v2, v5, v4}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method
