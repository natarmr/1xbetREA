.class public final La/ic4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:La/gnu;

.field public j:Z

.field public final synthetic k:La/kc4;


# direct methods
.method public constructor <init>(La/kc4;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ic4;->k:La/kc4;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/ic4;

    .line 2
    .line 3
    iget-object p0, p0, La/ic4;->k:La/kc4;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/ic4;-><init>(La/kc4;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ic4;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ic4;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/ic4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/ic4;->j:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/ic4;->k:La/kc4;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v5, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, La/ic4;->i:La/gnu;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object v2, v0

    .line 21
    move-object/from16 v0, p1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget v2, La/kc4;->Y:I

    .line 35
    .line 36
    iget-object v2, v4, La/i3t0;->i:La/ocj;

    .line 37
    .line 38
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 39
    .line 40
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-object v7, v6

    .line 48
    check-cast v7, La/mb4;

    .line 49
    .line 50
    const/16 v18, 0x0

    .line 51
    .line 52
    const/16 v19, 0x3ff7

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x1

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    const/4 v14, 0x0

    .line 61
    const/4 v15, 0x0

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    invoke-static/range {v7 .. v19}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v2, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    iget-object v2, v4, La/kc4;->r:La/gnu;

    .line 77
    .line 78
    iget-object v6, v4, La/kc4;->G:La/ali;

    .line 79
    .line 80
    iput-object v2, v0, La/ic4;->i:La/gnu;

    .line 81
    .line 82
    iput-boolean v5, v0, La/ic4;->j:Z

    .line 83
    .line 84
    invoke-virtual {v6, v3, v0}, La/ali;->r(ZLa/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-ne v0, v1, :cond_3

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    :goto_0
    check-cast v0, Ljava/util/List;

    .line 92
    .line 93
    invoke-virtual {v2, v0}, La/gnu;->c(Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, La/hb4;

    .line 97
    .line 98
    new-instance v1, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 99
    .line 100
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, La/mb4;

    .line 105
    .line 106
    iget v2, v2, La/mb4;->h:I

    .line 107
    .line 108
    new-instance v6, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-direct {v6, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v1, v6, v3, v5}, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;-><init>(Ljava/lang/Integer;ZZ)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v1}, La/hb4;-><init>(Lorg/xplatform/picker/api/presentation/PickerParams$Phone;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0
.end method
