.class public final La/o960;
.super La/bnn0;

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:[Lkotlin/ranges/IntRange;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([Lkotlin/ranges/IntRange;IILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o960;->k:[Lkotlin/ranges/IntRange;

    .line 2
    .line 3
    iput p2, p0, La/o960;->l:I

    .line 4
    .line 5
    iput p3, p0, La/o960;->m:I

    .line 6
    .line 7
    iput-object p4, p0, La/o960;->n:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, La/o960;->o:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, La/o960;->p:Ljava/util/ArrayList;

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
    new-instance v0, La/o960;

    .line 2
    .line 3
    iget-object v5, p0, La/o960;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v6, p0, La/o960;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, La/o960;->k:[Lkotlin/ranges/IntRange;

    .line 8
    .line 9
    iget v2, p0, La/o960;->l:I

    .line 10
    .line 11
    iget v3, p0, La/o960;->m:I

    .line 12
    .line 13
    iget-object v4, p0, La/o960;->n:Ljava/lang/String;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, La/o960;-><init>([Lkotlin/ranges/IntRange;IILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/o960;->j:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/o960;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/o960;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/o960;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/o960;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v3, v0, La/o960;->i:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-ne v3, v5, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    iget-object v6, v0, La/o960;->k:[Lkotlin/ranges/IntRange;

    .line 33
    .line 34
    array-length v7, v6

    .line 35
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    array-length v7, v6

    .line 39
    const/4 v8, 0x0

    .line 40
    :goto_0
    if-ge v8, v7, :cond_2

    .line 41
    .line 42
    aget-object v10, v6, v8

    .line 43
    .line 44
    new-instance v9, La/sjf0;

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    iget v11, v0, La/o960;->l:I

    .line 49
    .line 50
    iget v12, v0, La/o960;->m:I

    .line 51
    .line 52
    iget-object v13, v0, La/o960;->n:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v14, v0, La/o960;->o:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v15, v0, La/o960;->p:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct/range {v9 .. v16}, La/sjf0;-><init>(Lkotlin/ranges/IntRange;IILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/yje;)V

    .line 59
    .line 60
    .line 61
    const/4 v10, 0x3

    .line 62
    invoke-static {v1, v4, v9, v10}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object v1, La/rv00;->u:La/rv00;

    .line 73
    .line 74
    iput-object v4, v0, La/o960;->j:Ljava/lang/Object;

    .line 75
    .line 76
    iput-boolean v5, v0, La/o960;->i:Z

    .line 77
    .line 78
    invoke-virtual {v1, v3, v0}, La/rv00;->i(Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-ne v0, v2, :cond_3

    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_3
    return-object v0
.end method
