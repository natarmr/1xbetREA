.class public abstract La/d660;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/sch0;

.field public final b:Lkotlin/jvm/functions/Function2;

.field public c:La/w6k;

.field public d:Z

.field public final e:La/zri;


# direct methods
.method public constructor <init>(La/sch0;Lkotlin/jvm/functions/Function2;La/w6k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d660;->a:La/sch0;

    .line 5
    .line 6
    iput-object p2, p0, La/d660;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    iput-object p3, p0, La/d660;->c:La/w6k;

    .line 9
    .line 10
    new-instance p1, La/zri;

    .line 11
    .line 12
    invoke-direct {p1}, La/zri;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/d660;->e:La/zri;

    .line 16
    .line 17
    return-void
.end method

.method public static a(La/woa0;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/woa0;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/dpa0;

    .line 15
    .line 16
    invoke-virtual {v2}, La/dpa0;->a()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/c660;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/c660;

    .line 7
    .line 8
    iget v1, v0, La/c660;->k:I

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
    iput v1, v0, La/c660;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/c660;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/c660;-><init>(La/d660;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/c660;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/c660;->k:I

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
    iput-boolean v4, p0, La/d660;->d:Z

    .line 51
    .line 52
    new-instance p2, La/j940;

    .line 53
    .line 54
    const/16 v2, 0x16

    .line 55
    .line 56
    invoke-direct {p2, p0, p1, v3, v2}, La/j940;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput v4, v0, La/c660;->k:I

    .line 60
    .line 61
    invoke-static {p2, v0}, La/qem0;->s(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 69
    iput-boolean p1, p0, La/d660;->d:Z

    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0
.end method
