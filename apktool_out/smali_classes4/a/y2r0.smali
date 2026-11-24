.class public final La/y2r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:La/acu;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:La/lie0;

.field public final synthetic e:La/hie0;

.field public final synthetic f:La/z2r0;


# direct methods
.method public constructor <init>(La/acu;Ljava/util/List;Ljava/lang/Object;La/lie0;La/hie0;La/z2r0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y2r0;->a:La/acu;

    .line 5
    .line 6
    iput-object p2, p0, La/y2r0;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, La/y2r0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/y2r0;->d:La/lie0;

    .line 11
    .line 12
    iput-object p5, p0, La/y2r0;->e:La/hie0;

    .line 13
    .line 14
    iput-object p6, p0, La/y2r0;->f:La/z2r0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/w2r0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/w2r0;

    .line 7
    .line 8
    iget v1, v0, La/w2r0;->j:I

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
    iput v1, v0, La/w2r0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/w2r0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/w2r0;-><init>(La/y2r0;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/w2r0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/w2r0;->j:I

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
    new-instance v4, La/r6d;

    .line 51
    .line 52
    iget-object v9, p0, La/y2r0;->e:La/hie0;

    .line 53
    .line 54
    iget-object v10, p0, La/y2r0;->f:La/z2r0;

    .line 55
    .line 56
    iget-object v6, p0, La/y2r0;->b:Ljava/util/List;

    .line 57
    .line 58
    iget-object v7, p0, La/y2r0;->c:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v8, p0, La/y2r0;->d:La/lie0;

    .line 61
    .line 62
    move-object v5, p1

    .line 63
    invoke-direct/range {v4 .. v10}, La/r6d;-><init>(La/kmq;Ljava/util/List;Ljava/lang/Object;La/lie0;La/hie0;La/z2r0;)V

    .line 64
    .line 65
    .line 66
    iput v3, v0, La/w2r0;->j:I

    .line 67
    .line 68
    iget-object p0, p0, La/y2r0;->a:La/acu;

    .line 69
    .line 70
    invoke-virtual {p0, v4, v0}, La/acu;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0
.end method
