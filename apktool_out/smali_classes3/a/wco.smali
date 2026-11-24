.class public final La/wco;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/onexdatabase/OnexDatabase;

.field public final b:La/n0o0;


# direct methods
.method public constructor <init>(Lorg/xplatform/onexdatabase/OnexDatabase;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wco;->a:Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 5
    .line 6
    new-instance p1, La/ntl;

    .line 7
    .line 8
    const/16 v0, 0x11

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/wco;->b:La/n0o0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/vco;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/vco;

    .line 7
    .line 8
    iget v1, v0, La/vco;->k:I

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
    iput v1, v0, La/vco;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/vco;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/vco;-><init>(La/wco;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/vco;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/vco;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/wco;->b:La/n0o0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/qco;

    .line 58
    .line 59
    iput v5, v0, La/vco;->k:I

    .line 60
    .line 61
    iget-object p0, p0, La/qco;->a:La/zdg0;

    .line 62
    .line 63
    new-instance p1, La/f1e;

    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    const/16 v6, 0x17

    .line 67
    .line 68
    invoke-direct {p1, v2, v3, v6}, La/f1e;-><init>(ILa/yje;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p0, p1, v5, v4}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide p0

    .line 84
    const-wide/16 v0, 0x0

    .line 85
    .line 86
    cmp-long p0, p0, v0

    .line 87
    .line 88
    if-eqz p0, :cond_4

    .line 89
    .line 90
    move v4, v5

    .line 91
    :cond_4
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method
