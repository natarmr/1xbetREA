.class public final La/b4a;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/p7m0;

.field public j:La/d4a;

.field public k:Landroid/graphics/Bitmap;

.field public l:Landroid/graphics/Rect;

.field public m:Ljava/lang/Object;

.field public n:La/wub0;

.field public o:F

.field public p:F

.field public q:Z

.field public final synthetic r:La/d4a;

.field public final synthetic s:Landroid/graphics/Bitmap;

.field public final synthetic t:Landroid/graphics/Rect;

.field public final synthetic u:F

.field public final synthetic v:F


# direct methods
.method public constructor <init>(La/d4a;Landroid/graphics/Bitmap;Landroid/graphics/Rect;FFLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/b4a;->r:La/d4a;

    .line 2
    .line 3
    iput-object p2, p0, La/b4a;->s:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, La/b4a;->t:Landroid/graphics/Rect;

    .line 6
    .line 7
    iput p4, p0, La/b4a;->u:F

    .line 8
    .line 9
    iput p5, p0, La/b4a;->v:F

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/b4a;

    .line 2
    .line 3
    iget v4, p0, La/b4a;->u:F

    .line 4
    .line 5
    iget v5, p0, La/b4a;->v:F

    .line 6
    .line 7
    iget-object v1, p0, La/b4a;->r:La/d4a;

    .line 8
    .line 9
    iget-object v2, p0, La/b4a;->s:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iget-object v3, p0, La/b4a;->t:Landroid/graphics/Rect;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/b4a;-><init>(La/d4a;Landroid/graphics/Bitmap;Landroid/graphics/Rect;FFLa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/b4a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/b4a;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/b4a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/b4a;->q:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget v1, p0, La/b4a;->p:F

    .line 11
    .line 12
    iget v3, p0, La/b4a;->o:F

    .line 13
    .line 14
    iget-object v4, p0, La/b4a;->n:La/wub0;

    .line 15
    .line 16
    iget-object v5, p0, La/b4a;->m:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v6, p0, La/b4a;->l:Landroid/graphics/Rect;

    .line 19
    .line 20
    iget-object v7, p0, La/b4a;->k:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    iget-object v8, p0, La/b4a;->j:La/d4a;

    .line 23
    .line 24
    iget-object v9, p0, La/b4a;->i:La/p7m0;

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move v11, v3

    .line 30
    move-object v10, v6

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, La/b4a;->r:La/d4a;

    .line 43
    .line 44
    iget-object v1, p1, La/d4a;->l:La/p7m0;

    .line 45
    .line 46
    iget-object v3, p0, La/b4a;->s:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    iget-object v4, p0, La/b4a;->t:Landroid/graphics/Rect;

    .line 49
    .line 50
    iget v5, p0, La/b4a;->u:F

    .line 51
    .line 52
    iget v6, p0, La/b4a;->v:F

    .line 53
    .line 54
    move-object v8, p1

    .line 55
    move-object p1, v1

    .line 56
    move-object v9, v3

    .line 57
    move-object v10, v4

    .line 58
    move v11, v5

    .line 59
    move v1, v6

    .line 60
    :goto_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    move-object v4, v5

    .line 65
    check-cast v4, La/wub0;

    .line 66
    .line 67
    iput-object p1, p0, La/b4a;->i:La/p7m0;

    .line 68
    .line 69
    iput-object v8, p0, La/b4a;->j:La/d4a;

    .line 70
    .line 71
    iput-object v9, p0, La/b4a;->k:Landroid/graphics/Bitmap;

    .line 72
    .line 73
    iput-object v10, p0, La/b4a;->l:Landroid/graphics/Rect;

    .line 74
    .line 75
    iput-object v5, p0, La/b4a;->m:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v4, p0, La/b4a;->n:La/wub0;

    .line 78
    .line 79
    iput v11, p0, La/b4a;->o:F

    .line 80
    .line 81
    iput v1, p0, La/b4a;->p:F

    .line 82
    .line 83
    iput-boolean v2, p0, La/b4a;->q:Z

    .line 84
    .line 85
    sget-object v3, La/d4a;->o:Ljava/util/List;

    .line 86
    .line 87
    iget-object v3, v8, La/d4a;->b:La/mne;

    .line 88
    .line 89
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 90
    .line 91
    new-instance v7, La/a4a;

    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    invoke-direct/range {v7 .. v12}, La/a4a;-><init>(La/d4a;Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLa/yje;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v7, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-ne v3, v0, :cond_2

    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_2
    move-object v7, v9

    .line 105
    move-object v9, p1

    .line 106
    move-object p1, v3

    .line 107
    :goto_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v3, La/wub0;

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    invoke-direct {v3, p1, v1, v2, v4}, La/wub0;-><init>(Landroid/graphics/Bitmap;FZZ)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9, v5, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_3
    move-object p1, v9

    .line 131
    move-object v9, v7

    .line 132
    goto :goto_0
.end method
