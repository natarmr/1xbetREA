.class public final La/bpi0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;

.field public final b:La/rgs;

.field public final c:La/vrs0;


# direct methods
.method public constructor <init>(La/pbt;La/rgs;La/vrs0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/bpi0;->a:La/pbt;

    .line 11
    .line 12
    iput-object p2, p0, La/bpi0;->b:La/rgs;

    .line 13
    .line 14
    iput-object p3, p0, La/bpi0;->c:La/vrs0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(ZLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/api0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/api0;

    .line 7
    .line 8
    iget v1, v0, La/api0;->l:I

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
    iput v1, v0, La/api0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/api0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/api0;-><init>(La/bpi0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/api0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/api0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    iget-boolean p1, v0, La/api0;->i:Z

    .line 51
    .line 52
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, La/bpi0;->a:La/pbt;

    .line 60
    .line 61
    iget-object p2, p2, La/pbt;->a:La/j5t;

    .line 62
    .line 63
    iput-boolean p1, p2, La/j5t;->u:Z

    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const-string v2, "factorsLoaded"

    .line 70
    .line 71
    invoke-static {p2, v2}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    iput-boolean p1, v0, La/api0;->i:Z

    .line 77
    .line 78
    iput v4, v0, La/api0;->l:I

    .line 79
    .line 80
    iget-object p2, p0, La/bpi0;->b:La/rgs;

    .line 81
    .line 82
    invoke-virtual {p2, v0}, La/rgs;->a(La/zje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-ne p2, v1, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    :goto_1
    iput-boolean p1, v0, La/api0;->i:Z

    .line 90
    .line 91
    iput v3, v0, La/api0;->l:I

    .line 92
    .line 93
    iget-object p0, p0, La/bpi0;->c:La/vrs0;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, La/vrs0;->a(La/zje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v1, :cond_5

    .line 100
    .line 101
    :goto_2
    return-object v1

    .line 102
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0
.end method
