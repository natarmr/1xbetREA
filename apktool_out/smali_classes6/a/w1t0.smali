.class public final La/w1t0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/a4x;

.field public final synthetic k:La/pz40;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:La/w6k;

.field public final synthetic n:F

.field public final synthetic o:La/pz40;


# direct methods
.method public constructor <init>(La/a4x;La/pz40;Landroid/content/Context;La/w6k;FLa/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/w1t0;->j:La/a4x;

    .line 2
    .line 3
    iput-object p2, p0, La/w1t0;->k:La/pz40;

    .line 4
    .line 5
    iput-object p3, p0, La/w1t0;->l:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, La/w1t0;->m:La/w6k;

    .line 8
    .line 9
    iput p5, p0, La/w1t0;->n:F

    .line 10
    .line 11
    iput-object p6, p0, La/w1t0;->o:La/pz40;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/w1t0;

    .line 2
    .line 3
    iget v5, p0, La/w1t0;->n:F

    .line 4
    .line 5
    iget-object v6, p0, La/w1t0;->o:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/w1t0;->j:La/a4x;

    .line 8
    .line 9
    iget-object v2, p0, La/w1t0;->k:La/pz40;

    .line 10
    .line 11
    iget-object v3, p0, La/w1t0;->l:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v4, p0, La/w1t0;->m:La/w6k;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, La/w1t0;-><init>(La/a4x;La/pz40;Landroid/content/Context;La/w6k;FLa/pz40;La/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/w1t0;->i:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/w1t0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/w1t0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/w1t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/w1t0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v11, v0, La/w1t0;->j:La/a4x;

    .line 13
    .line 14
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    iget-object v2, v0, La/w1t0;->k:La/pz40;

    .line 21
    .line 22
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v10, La/kie0;

    .line 41
    .line 42
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/4 v3, 0x0

    .line 50
    move v9, v3

    .line 51
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    add-int/lit8 v15, v9, 0x1

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-ltz v9, :cond_1

    .line 65
    .line 66
    check-cast v3, La/o0x;

    .line 67
    .line 68
    sget-object v5, La/tvk;->a:La/rwj;

    .line 69
    .line 70
    sget-object v5, La/dvj;->c:La/dvj;

    .line 71
    .line 72
    move-object v6, v4

    .line 73
    move-object v4, v3

    .line 74
    new-instance v3, La/v1t0;

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    move-object v7, v5

    .line 78
    iget-object v5, v0, La/w1t0;->l:Landroid/content/Context;

    .line 79
    .line 80
    move-object v12, v6

    .line 81
    iget-object v6, v0, La/w1t0;->m:La/w6k;

    .line 82
    .line 83
    move-object v13, v7

    .line 84
    iget v7, v0, La/w1t0;->n:F

    .line 85
    .line 86
    move-object/from16 v16, v12

    .line 87
    .line 88
    iget-object v12, v0, La/w1t0;->o:La/pz40;

    .line 89
    .line 90
    move-object/from16 v17, v13

    .line 91
    .line 92
    iget-object v13, v0, La/w1t0;->k:La/pz40;

    .line 93
    .line 94
    move-object/from16 p1, v2

    .line 95
    .line 96
    move-object/from16 v2, v16

    .line 97
    .line 98
    move-object/from16 v0, v17

    .line 99
    .line 100
    invoke-direct/range {v3 .. v14}, La/v1t0;-><init>(La/o0x;Landroid/content/Context;La/w6k;FLjava/util/LinkedHashMap;ILa/kie0;La/a4x;La/pz40;La/pz40;La/yje;)V

    .line 101
    .line 102
    .line 103
    const/4 v4, 0x2

    .line 104
    invoke-static {v1, v0, v2, v3, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 105
    .line 106
    .line 107
    move-object/from16 v0, p0

    .line 108
    .line 109
    move-object/from16 v2, p1

    .line 110
    .line 111
    move v9, v15

    .line 112
    goto :goto_0

    .line 113
    :cond_1
    move-object v2, v4

    .line 114
    invoke-static {}, La/q3d;->p()V

    .line 115
    .line 116
    .line 117
    throw v2

    .line 118
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0
.end method
