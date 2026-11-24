.class public final La/acu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:La/gmq;

.field public final synthetic b:La/mie0;

.field public final synthetic c:La/hie0;

.field public final synthetic d:La/v7i;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(La/gmq;La/mie0;La/hie0;La/v7i;Ljava/util/List;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/acu;->a:La/gmq;

    .line 5
    .line 6
    iput-object p2, p0, La/acu;->b:La/mie0;

    .line 7
    .line 8
    iput-object p3, p0, La/acu;->c:La/hie0;

    .line 9
    .line 10
    iput-object p4, p0, La/acu;->d:La/v7i;

    .line 11
    .line 12
    iput-object p5, p0, La/acu;->e:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p6, p0, La/acu;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, La/acu;->g:Z

    .line 17
    .line 18
    iput-boolean p8, p0, La/acu;->h:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/xbu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/xbu;

    .line 7
    .line 8
    iget v1, v0, La/xbu;->j:I

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
    iput v1, v0, La/xbu;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xbu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/xbu;-><init>(La/acu;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/xbu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/xbu;->j:I

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
    new-instance v4, La/zbu;

    .line 51
    .line 52
    iget-boolean v11, p0, La/acu;->g:Z

    .line 53
    .line 54
    iget-boolean v12, p0, La/acu;->h:Z

    .line 55
    .line 56
    iget-object v6, p0, La/acu;->b:La/mie0;

    .line 57
    .line 58
    iget-object v7, p0, La/acu;->c:La/hie0;

    .line 59
    .line 60
    iget-object v8, p0, La/acu;->d:La/v7i;

    .line 61
    .line 62
    iget-object v9, p0, La/acu;->e:Ljava/util/List;

    .line 63
    .line 64
    iget-boolean v10, p0, La/acu;->f:Z

    .line 65
    .line 66
    move-object v5, p1

    .line 67
    invoke-direct/range {v4 .. v12}, La/zbu;-><init>(La/kmq;La/mie0;La/hie0;La/v7i;Ljava/util/List;ZZZ)V

    .line 68
    .line 69
    .line 70
    iput v3, v0, La/xbu;->j:I

    .line 71
    .line 72
    iget-object p0, p0, La/acu;->a:La/gmq;

    .line 73
    .line 74
    invoke-interface {p0, v4, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method
