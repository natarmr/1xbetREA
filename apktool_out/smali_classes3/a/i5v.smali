.class public final La/i5v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:La/nnt;

.field public final synthetic b:La/j5v;

.field public final synthetic c:La/qmu0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(La/nnt;La/j5v;La/qmu0;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i5v;->a:La/nnt;

    .line 5
    .line 6
    iput-object p2, p0, La/i5v;->b:La/j5v;

    .line 7
    .line 8
    iput-object p3, p0, La/i5v;->c:La/qmu0;

    .line 9
    .line 10
    iput-object p4, p0, La/i5v;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, La/i5v;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/f5v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/f5v;

    .line 7
    .line 8
    iget v1, v0, La/f5v;->j:I

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
    iput v1, v0, La/f5v;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f5v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/f5v;-><init>(La/i5v;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/f5v;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f5v;->j:I

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
    new-instance v4, La/h5v;

    .line 51
    .line 52
    iget-object v8, p0, La/i5v;->d:Ljava/lang/String;

    .line 53
    .line 54
    iget-boolean v9, p0, La/i5v;->e:Z

    .line 55
    .line 56
    iget-object v6, p0, La/i5v;->b:La/j5v;

    .line 57
    .line 58
    iget-object v7, p0, La/i5v;->c:La/qmu0;

    .line 59
    .line 60
    move-object v5, p1

    .line 61
    invoke-direct/range {v4 .. v9}, La/h5v;-><init>(La/kmq;La/j5v;La/qmu0;Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    iput v3, v0, La/f5v;->j:I

    .line 65
    .line 66
    iget-object p0, p0, La/i5v;->a:La/nnt;

    .line 67
    .line 68
    invoke-virtual {p0, v4, v0}, La/nnt;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0
.end method
