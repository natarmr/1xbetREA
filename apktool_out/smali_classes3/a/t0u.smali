.class public final La/t0u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wsf0;

.field public final b:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;La/wsf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/t0u;->a:La/wsf0;

    .line 5
    .line 6
    iput-object p1, p0, La/t0u;->b:La/pbt;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/yje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/s0u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/s0u;

    .line 7
    .line 8
    iget v1, v0, La/s0u;->k:I

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
    iput v1, v0, La/s0u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/s0u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/s0u;-><init>(La/t0u;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/s0u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/s0u;->k:I

    .line 30
    .line 31
    iget-object v3, p0, La/t0u;->a:La/wsf0;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

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
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/t0u;->b:La/pbt;

    .line 53
    .line 54
    iget-object p0, p0, La/pbt;->a:La/j5t;

    .line 55
    .line 56
    iget-object p0, p0, La/j5t;->q:La/ql5;

    .line 57
    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    iget-object p0, p0, La/ql5;->f:Ljava/lang/String;

    .line 61
    .line 62
    if-nez p0, :cond_4

    .line 63
    .line 64
    :cond_3
    const-string p0, ""

    .line 65
    .line 66
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    iget-object p0, v3, La/wsf0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, La/g45;

    .line 75
    .line 76
    invoke-virtual {p0}, La/g45;->G()La/khf0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    sget-object p1, La/bm5;->d:La/bm5;

    .line 81
    .line 82
    iput v4, v0, La/s0u;->k:I

    .line 83
    .line 84
    sget-object v2, La/tl5;->c:La/tl5;

    .line 85
    .line 86
    invoke-virtual {p0, p1, v2, v0}, La/khf0;->A(La/bm5;La/tl5;La/yje;)Ljava/io/Serializable;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_5

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_5
    :goto_1
    check-cast p1, La/ql5;

    .line 94
    .line 95
    invoke-virtual {v3}, La/wsf0;->s()La/trm0;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    sget-object v0, La/bm5;->d:La/bm5;

    .line 100
    .line 101
    invoke-virtual {p0, v0, p1}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p1, La/ql5;->f:Ljava/lang/String;

    .line 105
    .line 106
    :cond_6
    return-object p0
.end method
