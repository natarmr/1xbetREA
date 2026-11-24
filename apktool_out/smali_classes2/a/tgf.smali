.class public final La/tgf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gii0;

.field public final b:La/jwd;


# direct methods
.method public constructor <init>(La/gii0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tgf;->a:La/gii0;

    .line 5
    .line 6
    new-instance p1, La/jwd;

    .line 7
    .line 8
    const/16 v0, 0x12

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/tgf;->b:La/jwd;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(DJLa/zje;La/csr;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/sgf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/sgf;

    .line 7
    .line 8
    iget v1, v0, La/sgf;->k:I

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
    iput v1, v0, La/sgf;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/sgf;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/sgf;-><init>(La/tgf;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/sgf;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/sgf;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/tgf;->b:La/jwd;

    .line 51
    .line 52
    invoke-virtual {p0}, La/jwd;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/tef;

    .line 57
    .line 58
    new-instance p5, Ljava/lang/Double;

    .line 59
    .line 60
    invoke-direct {p5, p1, p2}, Ljava/lang/Double;-><init>(D)V

    .line 61
    .line 62
    .line 63
    if-eqz p6, :cond_3

    .line 64
    .line 65
    iget-object p1, p6, La/csr;->a:La/bsr;

    .line 66
    .line 67
    iget-object p1, p1, La/bsr;->a:La/esr;

    .line 68
    .line 69
    invoke-virtual {p1}, La/esr;->a()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move-object p5, v4

    .line 77
    :goto_1
    if-eqz p6, :cond_4

    .line 78
    .line 79
    sget-object p1, La/bg8;->Companion:La/ag8;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {p6}, La/ag8;->a(La/csr;)La/bg8;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    :cond_4
    new-instance p1, La/fff;

    .line 89
    .line 90
    invoke-direct {p1, p3, p4, v4, p5}, La/fff;-><init>(JLa/bg8;Ljava/lang/Double;)V

    .line 91
    .line 92
    .line 93
    iput v3, v0, La/sgf;->k:I

    .line 94
    .line 95
    invoke-interface {p0, p7, p1, v0}, La/tef;->a(Ljava/lang/String;La/fff;La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p5

    .line 99
    if-ne p5, v1, :cond_5

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_5
    :goto_2
    check-cast p5, La/nz5;

    .line 103
    .line 104
    invoke-virtual {p5}, La/nz5;->a()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method
