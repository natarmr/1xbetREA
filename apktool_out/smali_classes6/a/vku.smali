.class public final La/vku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:La/i89;

.field public final synthetic b:La/dgu;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z

.field public final synthetic g:Z


# direct methods
.method public constructor <init>(La/i89;La/dgu;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vku;->a:La/i89;

    .line 5
    .line 6
    iput-object p2, p0, La/vku;->b:La/dgu;

    .line 7
    .line 8
    iput-object p3, p0, La/vku;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, La/vku;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, La/vku;->e:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p6, p0, La/vku;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, La/vku;->g:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, La/sku;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/sku;

    .line 7
    .line 8
    iget v1, v0, La/sku;->j:I

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
    iput v1, v0, La/sku;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/sku;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/sku;-><init>(La/vku;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/sku;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/sku;->j:I

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
    new-instance v4, La/uku;

    .line 51
    .line 52
    iget-boolean v10, p0, La/vku;->f:Z

    .line 53
    .line 54
    iget-boolean v11, p0, La/vku;->g:Z

    .line 55
    .line 56
    iget-object v6, p0, La/vku;->b:La/dgu;

    .line 57
    .line 58
    iget-object v7, p0, La/vku;->c:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v8, p0, La/vku;->d:Ljava/util/List;

    .line 61
    .line 62
    iget-object v9, p0, La/vku;->e:Ljava/util/List;

    .line 63
    .line 64
    move-object v5, p1

    .line 65
    invoke-direct/range {v4 .. v11}, La/uku;-><init>(La/kmq;La/dgu;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V

    .line 66
    .line 67
    .line 68
    iput v3, v0, La/sku;->j:I

    .line 69
    .line 70
    iget-object p0, p0, La/vku;->a:La/i89;

    .line 71
    .line 72
    invoke-virtual {p0, v4, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

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
