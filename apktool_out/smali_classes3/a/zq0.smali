.class public final La/zq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:La/kmq;

.field public final synthetic b:J

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(La/kmq;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zq0;->a:La/kmq;

    .line 5
    .line 6
    iput-wide p2, p0, La/zq0;->b:J

    .line 7
    .line 8
    iput-boolean p4, p0, La/zq0;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/yq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/yq0;

    .line 7
    .line 8
    iget v1, v0, La/yq0;->j:I

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
    iput v1, v0, La/yq0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/yq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/yq0;-><init>(La/zq0;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/yq0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/yq0;->j:I

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
    check-cast p1, La/dx5;

    .line 51
    .line 52
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, La/dp0;

    .line 57
    .line 58
    iget-object p1, p1, La/dp0;->a:Ljava/util/List;

    .line 59
    .line 60
    iget-wide v4, p0, La/zq0;->b:J

    .line 61
    .line 62
    iget-boolean p2, p0, La/zq0;->c:Z

    .line 63
    .line 64
    invoke-static {v4, v5, p1, p2}, La/oja0;->Y(JLjava/util/List;Z)La/mi1;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput v3, v0, La/yq0;->j:I

    .line 69
    .line 70
    iget-object p0, p0, La/zq0;->a:La/kmq;

    .line 71
    .line 72
    invoke-interface {p0, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v1, :cond_3

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0
.end method
