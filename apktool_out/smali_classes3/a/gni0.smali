.class public final La/gni0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fq;

.field public final b:La/pbt;


# direct methods
.method public constructor <init>(La/fq;La/pbt;)V
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
    iput-object p1, p0, La/gni0;->a:La/fq;

    .line 8
    .line 9
    iput-object p2, p0, La/gni0;->b:La/pbt;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/w05;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/fni0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/fni0;

    .line 7
    .line 8
    iget v1, v0, La/fni0;->k:I

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
    iput v1, v0, La/fni0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fni0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/fni0;-><init>(La/gni0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/fni0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fni0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/gni0;->b:La/pbt;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, La/pbt;->v(La/w05;)V

    .line 53
    .line 54
    .line 55
    new-instance p2, La/ele;

    .line 56
    .line 57
    invoke-direct {p2, p1}, La/ele;-><init>(La/w05;)V

    .line 58
    .line 59
    .line 60
    iput v3, v0, La/fni0;->k:I

    .line 61
    .line 62
    iget-object p0, p0, La/gni0;->a:La/fq;

    .line 63
    .line 64
    invoke-virtual {p0, p2, v0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-ne p0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0
.end method
