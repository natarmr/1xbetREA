.class public final La/ps90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/xcz;

.field public final synthetic k:La/pz40;

.field public final synthetic l:La/pz40;

.field public final synthetic m:La/pz40;

.field public final synthetic n:La/pz40;

.field public final synthetic o:Z

.field public final synthetic p:La/j73;

.field public final synthetic q:La/pz40;

.field public final synthetic r:F

.field public final synthetic s:La/vne;

.field public final synthetic t:La/a8x;

.field public final synthetic u:La/l7m0;

.field public final synthetic v:La/pz40;

.field public final synthetic w:La/cgk0;

.field public final synthetic x:La/pz40;


# direct methods
.method public constructor <init>(FLa/j73;La/yje;La/vne;La/a8x;La/xcz;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/cgk0;La/l7m0;Z)V
    .locals 0

    .line 1
    iput-object p6, p0, La/ps90;->j:La/xcz;

    .line 2
    .line 3
    iput-object p7, p0, La/ps90;->k:La/pz40;

    .line 4
    .line 5
    iput-object p8, p0, La/ps90;->l:La/pz40;

    .line 6
    .line 7
    iput-object p9, p0, La/ps90;->m:La/pz40;

    .line 8
    .line 9
    iput-object p10, p0, La/ps90;->n:La/pz40;

    .line 10
    .line 11
    move/from16 p6, p16

    .line 12
    .line 13
    iput-boolean p6, p0, La/ps90;->o:Z

    .line 14
    .line 15
    iput-object p2, p0, La/ps90;->p:La/j73;

    .line 16
    .line 17
    iput-object p11, p0, La/ps90;->q:La/pz40;

    .line 18
    .line 19
    iput p1, p0, La/ps90;->r:F

    .line 20
    .line 21
    iput-object p4, p0, La/ps90;->s:La/vne;

    .line 22
    .line 23
    iput-object p5, p0, La/ps90;->t:La/a8x;

    .line 24
    .line 25
    iput-object p15, p0, La/ps90;->u:La/l7m0;

    .line 26
    .line 27
    iput-object p12, p0, La/ps90;->v:La/pz40;

    .line 28
    .line 29
    iput-object p14, p0, La/ps90;->w:La/cgk0;

    .line 30
    .line 31
    iput-object p13, p0, La/ps90;->x:La/pz40;

    .line 32
    .line 33
    const/4 p1, 0x2

    .line 34
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/ps90;

    .line 4
    .line 5
    iget-object v14, v0, La/ps90;->w:La/cgk0;

    .line 6
    .line 7
    iget-object v13, v0, La/ps90;->x:La/pz40;

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    iget v1, v0, La/ps90;->r:F

    .line 11
    .line 12
    move-object v3, v2

    .line 13
    iget-object v2, v0, La/ps90;->p:La/j73;

    .line 14
    .line 15
    iget-object v4, v0, La/ps90;->s:La/vne;

    .line 16
    .line 17
    iget-object v5, v0, La/ps90;->t:La/a8x;

    .line 18
    .line 19
    iget-object v6, v0, La/ps90;->j:La/xcz;

    .line 20
    .line 21
    iget-object v7, v0, La/ps90;->k:La/pz40;

    .line 22
    .line 23
    iget-object v8, v0, La/ps90;->l:La/pz40;

    .line 24
    .line 25
    iget-object v9, v0, La/ps90;->m:La/pz40;

    .line 26
    .line 27
    iget-object v10, v0, La/ps90;->n:La/pz40;

    .line 28
    .line 29
    iget-object v11, v0, La/ps90;->q:La/pz40;

    .line 30
    .line 31
    iget-object v12, v0, La/ps90;->v:La/pz40;

    .line 32
    .line 33
    iget-object v15, v0, La/ps90;->u:La/l7m0;

    .line 34
    .line 35
    iget-boolean v0, v0, La/ps90;->o:Z

    .line 36
    .line 37
    move/from16 v16, v0

    .line 38
    .line 39
    move-object v0, v3

    .line 40
    move-object/from16 v3, p2

    .line 41
    .line 42
    invoke-direct/range {v0 .. v16}, La/ps90;-><init>(FLa/j73;La/yje;La/vne;La/a8x;La/xcz;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/cgk0;La/l7m0;Z)V

    .line 43
    .line 44
    .line 45
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
    invoke-virtual {p0, p1, p2}, La/ps90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ps90;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ps90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/ps90;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/ps90;->j:La/xcz;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, La/gg90;

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-direct {p1, v3, v1}, La/gg90;-><init>(La/xcz;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v1, La/wk30;

    .line 41
    .line 42
    const/16 v2, 0xf

    .line 43
    .line 44
    invoke-direct {v1, p1, v2}, La/wk30;-><init>(La/gmq;B)V

    .line 45
    .line 46
    .line 47
    iput-boolean v4, p0, La/ps90;->i:Z

    .line 48
    .line 49
    invoke-static {v1, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    :goto_0
    sget p1, La/ys90;->a:F

    .line 57
    .line 58
    iget-object p1, p0, La/ps90;->k:La/pz40;

    .line 59
    .line 60
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-interface {p1, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, v3, La/xcz;->j:La/ywj;

    .line 81
    .line 82
    invoke-virtual {p1}, La/ywj;->a()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_4

    .line 87
    .line 88
    iget-object p1, p0, La/ps90;->l:La/pz40;

    .line 89
    .line 90
    invoke-static {p1}, La/ys90;->c(La/pz40;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    iget-object v12, p0, La/ps90;->v:La/pz40;

    .line 97
    .line 98
    iget-object v13, p0, La/ps90;->w:La/cgk0;

    .line 99
    .line 100
    iget-object v1, p0, La/ps90;->m:La/pz40;

    .line 101
    .line 102
    iget-object v2, p0, La/ps90;->n:La/pz40;

    .line 103
    .line 104
    iget-boolean v3, p0, La/ps90;->o:Z

    .line 105
    .line 106
    iget-object v4, p0, La/ps90;->p:La/j73;

    .line 107
    .line 108
    iget-object v5, p0, La/ps90;->q:La/pz40;

    .line 109
    .line 110
    iget-object v6, p0, La/ps90;->j:La/xcz;

    .line 111
    .line 112
    iget v7, p0, La/ps90;->r:F

    .line 113
    .line 114
    iget-object v8, p0, La/ps90;->s:La/vne;

    .line 115
    .line 116
    iget-object v9, p0, La/ps90;->l:La/pz40;

    .line 117
    .line 118
    iget-object v10, p0, La/ps90;->t:La/a8x;

    .line 119
    .line 120
    iget-object v11, p0, La/ps90;->u:La/l7m0;

    .line 121
    .line 122
    invoke-static/range {v1 .. v13}, La/ys90;->b(La/pz40;La/pz40;ZLa/j73;La/pz40;La/xcz;FLa/vne;La/pz40;La/a8x;La/l7m0;La/pz40;La/cgk0;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    iget-object p0, p0, La/ps90;->x:La/pz40;

    .line 127
    .line 128
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0
.end method
