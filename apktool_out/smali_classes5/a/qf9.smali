.class public final La/qf9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/pzu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qf9;->a:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IJLa/zje;Z)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La/mpu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/mpu;

    .line 7
    .line 8
    iget v1, v0, La/mpu;->k:I

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
    iput v1, v0, La/mpu;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/mpu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, La/mpu;-><init>(La/qf9;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p4, La/mpu;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p4, La/mpu;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

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
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput v3, p4, La/mpu;->k:I

    .line 53
    .line 54
    iget-object p0, p0, La/qf9;->a:La/pzu;

    .line 55
    .line 56
    invoke-virtual/range {p0 .. p5}, La/pzu;->X(IJLa/zje;Z)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    .line 64
    .line 65
    new-instance p0, La/vvt;

    .line 66
    .line 67
    const/16 p1, 0x15

    .line 68
    .line 69
    invoke-direct {p0, p1}, La/vvt;-><init>(B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method
