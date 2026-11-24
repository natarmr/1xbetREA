.class public final La/v51;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/jhg0;
.implements La/cg60;
.implements La/ia50;
.implements La/e1j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "La/v51;",
        "La/yx5;",
        "La/jhg0;",
        "La/cg60;",
        "La/ia50;",
        "La/e1j;",
        "<init>",
        "()V",
        "a/qek0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a2:La/qek0;

.field public static final synthetic b2:[La/iiy;


# instance fields
.field public final K1:La/h9o0;

.field public L1:La/o7i;

.field public M1:La/fiu0;

.field public N1:La/o91;

.field public O1:La/ehf0;

.field public P1:La/ii;

.field public Q1:La/oeg0;

.field public final R1:La/yzn0;

.field public final S1:La/khf0;

.field public final U1:La/n0o0;

.field public final V1:La/n0o0;

.field public final W1:La/kiu0;

.field public final X1:La/kiu0;

.field public final Y1:La/s0r;

.field public Z1:La/q5j;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/v51;

    .line 4
    .line 5
    const-string v2, "aggregatorTabToOpen"

    .line 6
    .line 7
    const-string v3, "getAggregatorTabToOpen()Lorg/xplatform/aggregator/api/navigation/AggregatorTab;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "aggregatorScreenToOpen"

    .line 16
    .line 17
    const-string v5, "getAggregatorScreenToOpen()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "viewBinding"

    .line 25
    .line 26
    const-string v6, "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentMainAggregatorBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/v51;->b2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/qek0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/v51;->a2:La/qek0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const v0, 0x7f0d0261

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/h9o0;->a:La/h9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/v51;->K1:La/h9o0;

    .line 10
    .line 11
    new-instance v0, La/yzn0;

    .line 12
    .line 13
    const-string v1, "OPEN_AGGREGATOR_TAB"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/v51;->R1:La/yzn0;

    .line 19
    .line 20
    new-instance v0, La/khf0;

    .line 21
    .line 22
    const-string v1, "OPEN_AGGREGATOR_SCREEN_ITEM"

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La/v51;->S1:La/khf0;

    .line 28
    .line 29
    new-instance v0, La/p51;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, v1}, La/p51;-><init>(La/v51;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/v51;->U1:La/n0o0;

    .line 40
    .line 41
    new-instance v0, La/p51;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {v0, p0, v2}, La/p51;-><init>(La/v51;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, La/v51;->V1:La/n0o0;

    .line 52
    .line 53
    new-instance v0, La/p51;

    .line 54
    .line 55
    const/4 v2, 0x3

    .line 56
    invoke-direct {v0, p0, v2}, La/p51;-><init>(La/v51;B)V

    .line 57
    .line 58
    .line 59
    new-instance v2, La/s51;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v2, p0, v3}, La/s51;-><init>(La/v51;B)V

    .line 63
    .line 64
    .line 65
    sget-object v4, La/wez;->b:La/wez;

    .line 66
    .line 67
    new-instance v5, La/f80;

    .line 68
    .line 69
    const/4 v6, 0x6

    .line 70
    invoke-direct {v5, v2, v6}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sget-object v5, La/sre0;->a:La/tre0;

    .line 78
    .line 79
    const-class v6, La/yb0;

    .line 80
    .line 81
    invoke-virtual {v5, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    new-instance v7, La/k8;

    .line 86
    .line 87
    const/16 v8, 0x1c

    .line 88
    .line 89
    invoke-direct {v7, v2, v8}, La/k8;-><init>(La/a8z;B)V

    .line 90
    .line 91
    .line 92
    new-instance v8, La/k8;

    .line 93
    .line 94
    const/16 v9, 0x1d

    .line 95
    .line 96
    invoke-direct {v8, v2, v9}, La/k8;-><init>(La/a8z;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v6, v7, v8, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, La/v51;->W1:La/kiu0;

    .line 104
    .line 105
    new-instance v0, La/p51;

    .line 106
    .line 107
    const/4 v2, 0x4

    .line 108
    invoke-direct {v0, p0, v2}, La/p51;-><init>(La/v51;B)V

    .line 109
    .line 110
    .line 111
    new-instance v2, La/s51;

    .line 112
    .line 113
    invoke-direct {v2, p0, v1}, La/s51;-><init>(La/v51;B)V

    .line 114
    .line 115
    .line 116
    new-instance v6, La/f80;

    .line 117
    .line 118
    const/4 v7, 0x7

    .line 119
    invoke-direct {v6, v2, v7}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v4, v6}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-class v4, La/b61;

    .line 127
    .line 128
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    new-instance v5, La/t51;

    .line 133
    .line 134
    invoke-direct {v5, v2, v3}, La/t51;-><init>(La/a8z;B)V

    .line 135
    .line 136
    .line 137
    new-instance v3, La/t51;

    .line 138
    .line 139
    invoke-direct {v3, v2, v1}, La/t51;-><init>(La/a8z;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {p0, v4, v5, v3, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p0, La/v51;->X1:La/kiu0;

    .line 147
    .line 148
    sget-object v0, La/u51;->a:La/u51;

    .line 149
    .line 150
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, p0, La/v51;->Y1:La/s0r;

    .line 155
    .line 156
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 6

    .line 1
    iget-object v0, p0, La/v51;->V1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/q7i;

    .line 8
    .line 9
    iget-object v1, v0, La/q7i;->e0:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/o7i;

    .line 16
    .line 17
    iput-object v1, p0, La/v51;->L1:La/o7i;

    .line 18
    .line 19
    invoke-virtual {v0}, La/q7i;->c()La/fiu0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, La/v51;->M1:La/fiu0;

    .line 24
    .line 25
    iget-object v1, v0, La/q7i;->Y:La/o91;

    .line 26
    .line 27
    iput-object v1, p0, La/v51;->N1:La/o91;

    .line 28
    .line 29
    new-instance v1, La/ehf0;

    .line 30
    .line 31
    iget-object v2, v0, La/q7i;->Z:La/uf3;

    .line 32
    .line 33
    new-instance v3, La/gle0;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v4, La/q5j;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v5, v0, La/q7i;->r:La/pru;

    .line 44
    .line 45
    invoke-direct {v1, v2, v3, v4, v5}, La/ehf0;-><init>(La/uf3;La/gle0;La/q5j;La/pru;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, La/v51;->O1:La/ehf0;

    .line 49
    .line 50
    iget-object v1, v0, La/q7i;->a0:La/ii;

    .line 51
    .line 52
    iput-object v1, p0, La/v51;->P1:La/ii;

    .line 53
    .line 54
    iget-object v0, v0, La/q7i;->d:La/oeg0;

    .line 55
    .line 56
    iput-object v0, p0, La/v51;->Q1:La/oeg0;

    .line 57
    .line 58
    new-instance v0, La/q5j;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/v51;->Z1:La/q5j;

    .line 64
    .line 65
    return-void
.end method

.method public final G0()La/i1r;
    .locals 2

    .line 1
    sget-object v0, La/v51;->b2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/v51;->Y1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/i1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/b61;
    .locals 0

    .line 1
    iget-object p0, p0, La/v51;->X1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/b61;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(La/lr1;Z)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, La/v51;->O1:La/ehf0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_14

    .line 9
    .line 10
    iget-object v4, v0, La/lr1;->b:La/tm1;

    .line 11
    .line 12
    new-instance v5, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 13
    .line 14
    const/16 v17, 0x0

    .line 15
    .line 16
    const/16 v18, 0x1ff

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const-wide/16 v8, 0x0

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const-wide/16 v12, 0x0

    .line 25
    .line 26
    const-wide/16 v14, 0x0

    .line 27
    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    invoke-direct/range {v5 .. v18}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    invoke-virtual {v2, v4, v5, v6}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroidx/fragment/app/e;->S()La/m1r;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v5}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v2, v3

    .line 61
    :goto_0
    invoke-virtual {v1}, La/v51;->H0()La/b61;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v7, v5, La/b61;->k:La/ix0;

    .line 66
    .line 67
    iget-object v8, v5, La/b61;->j:La/hs60;

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    const-string v10, "option"

    .line 71
    .line 72
    if-eqz p2, :cond_4

    .line 73
    .line 74
    instance-of v4, v0, La/gr1;

    .line 75
    .line 76
    if-eqz v4, :cond_1

    .line 77
    .line 78
    sget-object v4, La/yz1;->b:La/yz1;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    instance-of v4, v0, La/hr1;

    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    sget-object v4, La/yz1;->c:La/yz1;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    instance-of v4, v0, La/fr1;

    .line 89
    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    sget-object v4, La/yz1;->d:La/yz1;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    move-object v4, v3

    .line 96
    :goto_1
    if-eqz v4, :cond_10

    .line 97
    .line 98
    iget-object v4, v4, La/yz1;->a:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v5, v8, La/hs60;->a:La/kt2;

    .line 104
    .line 105
    const-string v8, "footer_menu_virtual_call"

    .line 106
    .line 107
    invoke-static {v10, v4, v5, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v5, v7, La/ix0;->a:La/s1p;

    .line 114
    .line 115
    const-wide/16 v7, 0x2b46

    .line 116
    .line 117
    invoke-static {v4, v5, v7, v8}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :cond_4
    instance-of v11, v4, La/jm1;

    .line 123
    .line 124
    const-string v12, "my_aggregator"

    .line 125
    .line 126
    if-eqz v11, :cond_5

    .line 127
    .line 128
    iget-object v13, v5, La/b61;->h:La/b4j;

    .line 129
    .line 130
    iget-object v13, v13, La/b4j;->a:La/kt2;

    .line 131
    .line 132
    const-string v14, "promocode_page_opened"

    .line 133
    .line 134
    const-string v15, "promocode_page_type"

    .line 135
    .line 136
    invoke-static {v15, v12, v13, v14}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v5, v5, La/b61;->i:La/ix0;

    .line 140
    .line 141
    iget-object v5, v5, La/ix0;->a:La/s1p;

    .line 142
    .line 143
    const-wide/16 v13, 0xc0c

    .line 144
    .line 145
    invoke-static {v12, v5, v13, v14}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 146
    .line 147
    .line 148
    :cond_5
    iget-object v5, v8, La/hs60;->a:La/kt2;

    .line 149
    .line 150
    instance-of v8, v4, La/am1;

    .line 151
    .line 152
    const-string v13, "footer_menu_aggregator_call"

    .line 153
    .line 154
    if-eqz v8, :cond_6

    .line 155
    .line 156
    const-string v12, "category"

    .line 157
    .line 158
    invoke-static {v10, v12, v5, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    instance-of v14, v4, La/cm1;

    .line 163
    .line 164
    if-eqz v14, :cond_7

    .line 165
    .line 166
    const-string v12, "favor"

    .line 167
    .line 168
    invoke-static {v10, v12, v5, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_7
    instance-of v14, v4, La/fm1;

    .line 173
    .line 174
    if-eqz v14, :cond_8

    .line 175
    .line 176
    invoke-static {v10, v12, v5, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_8
    if-eqz v11, :cond_9

    .line 181
    .line 182
    const-string v12, "promo"

    .line 183
    .line 184
    invoke-static {v10, v12, v5, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_9
    instance-of v12, v4, La/km1;

    .line 189
    .line 190
    if-eqz v12, :cond_a

    .line 191
    .line 192
    const-string v12, "providers"

    .line 193
    .line 194
    invoke-static {v10, v12, v5, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    :goto_2
    if-eqz v8, :cond_b

    .line 198
    .line 199
    sget-object v4, La/hs0;->f:La/hs0;

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_b
    instance-of v5, v4, La/cm1;

    .line 203
    .line 204
    if-eqz v5, :cond_c

    .line 205
    .line 206
    sget-object v4, La/hs0;->c:La/hs0;

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_c
    instance-of v5, v4, La/fm1;

    .line 210
    .line 211
    if-eqz v5, :cond_d

    .line 212
    .line 213
    sget-object v4, La/hs0;->d:La/hs0;

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_d
    if-eqz v11, :cond_e

    .line 217
    .line 218
    sget-object v4, La/hs0;->b:La/hs0;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_e
    instance-of v4, v4, La/km1;

    .line 222
    .line 223
    if-eqz v4, :cond_f

    .line 224
    .line 225
    sget-object v4, La/hs0;->e:La/hs0;

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_f
    move-object v4, v3

    .line 229
    :goto_3
    if-eqz v4, :cond_10

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-object v5, v7, La/ix0;->a:La/s1p;

    .line 235
    .line 236
    new-instance v7, La/j1p;

    .line 237
    .line 238
    iget-object v4, v4, La/hs0;->a:Ljava/lang/String;

    .line 239
    .line 240
    invoke-direct {v7, v4, v9}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 241
    .line 242
    .line 243
    invoke-static {v7}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    const-wide/16 v7, 0xbfb

    .line 248
    .line 249
    invoke-virtual {v5, v4, v7, v8}, La/s1p;->a(Ljava/util/Set;J)V

    .line 250
    .line 251
    .line 252
    :cond_10
    :goto_4
    invoke-virtual {v1}, La/v51;->H0()La/b61;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-virtual {v5}, Landroidx/fragment/app/e;->P()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-gt v5, v6, :cond_13

    .line 265
    .line 266
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    const v5, 0x7f0a060f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v5}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    if-eqz v1, :cond_11

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    goto :goto_5

    .line 284
    :cond_11
    move-object v1, v3

    .line 285
    :goto_5
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-nez v1, :cond_12

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_12
    move v6, v9

    .line 293
    :cond_13
    :goto_6
    const/16 v1, 0x1c

    .line 294
    .line 295
    invoke-static {v4, v0, v6, v3, v1}, La/b61;->x(La/b61;La/lr1;ZLorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;I)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_14
    const-string v0, "aggregatorScreenUtils"

    .line 300
    .line 301
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v3
.end method

.method public final Y()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/e9s0;->a:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 7
    .line 8
    .line 9
    sget-object v0, La/uo0;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 16
    .line 17
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "DAILY_TASKS_SWITCH_TAB_REQUEST"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->Z()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/v51;->N1:La/o91;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, v0, La/o91;->a:La/ejc;

    .line 7
    .line 8
    iget-object v0, v0, La/ejc;->a:La/i1w0;

    .line 9
    .line 10
    iget-object v0, v0, La/i1w0;->a:La/cu;

    .line 11
    .line 12
    iput-object v1, v0, La/cu;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, p0, La/v51;->Q1:La/oeg0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v1, La/ehg0;->a:La/ehg0;

    .line 19
    .line 20
    iget-object v0, v0, La/oeg0;->a:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v0, v0, La/b61;->u:La/j2j;

    .line 30
    .line 31
    invoke-virtual {v0}, La/j2j;->v()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v0, La/b61;->f:La/s91;

    .line 39
    .line 40
    iget-object v2, v1, La/s91;->c:La/gx3;

    .line 41
    .line 42
    iget-object v0, v0, La/b61;->c:La/vzg0;

    .line 43
    .line 44
    new-instance v3, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v3, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 47
    .line 48
    .line 49
    const-string v2, "NAVIGATION_MAP_ITEM_KEY"

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v1, La/s91;->e:La/p7m0;

    .line 55
    .line 56
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "CURRENT_TAB_KEY"

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    const-string p0, "rootRouterHolder"

    .line 70
    .line 71
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :cond_1
    const-string p0, "aggregatorNavigationHolder"

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/v51;->Q1:La/oeg0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-object v2, La/ehg0;->a:La/ehg0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/v51;->getRouter()La/i1w0;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v0, v2, v3}, La/oeg0;->a(La/ihg0;La/i1w0;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/v51;->W1:La/kiu0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/yb0;

    .line 25
    .line 26
    invoke-virtual {v0}, La/yb0;->w()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/b61;->u:La/j2j;

    .line 34
    .line 35
    invoke-virtual {v0}, La/j2j;->x()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, La/v51;->N1:La/o91;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object v0, v0, La/o91;->a:La/ejc;

    .line 43
    .line 44
    iget-object v0, v0, La/ejc;->a:La/i1w0;

    .line 45
    .line 46
    iget-object v0, v0, La/i1w0;->a:La/cu;

    .line 47
    .line 48
    iget-object p0, p0, La/v51;->U1:La/n0o0;

    .line 49
    .line 50
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/rs3;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, La/cu;->q(La/rs3;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const-string p0, "aggregatorNavigationHolder"

    .line 61
    .line 62
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_1
    const-string p0, "rootRouterHolder"

    .line 67
    .line 68
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/b61;->B:La/c4m0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/b61;->v:La/ba50;

    .line 21
    .line 22
    iget-object v0, v0, La/ba50;->a:La/p7m0;

    .line 23
    .line 24
    new-instance v1, La/h2c;

    .line 25
    .line 26
    const/16 v2, 0x11

    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, La/h2c;-><init>(La/p7m0;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/w51;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v1, p0, v3, v2}, La/w51;-><init>(La/b61;La/yje;B)V

    .line 40
    .line 41
    .line 42
    new-instance v2, La/fnq;

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, La/b61;->o:La/mne;

    .line 53
    .line 54
    iget-object v1, v1, La/mne;->c:La/vs10;

    .line 55
    .line 56
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v1, La/foe;->h:La/foe;

    .line 61
    .line 62
    invoke-static {v2, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/b61;->B:La/c4m0;

    .line 67
    .line 68
    return-void
.end method

.method public final getRouter()La/i1w0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v51;->N1:La/o91;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/o91;->a:La/ejc;

    .line 6
    .line 7
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 8
    .line 9
    check-cast p0, La/rl1;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "aggregatorNavigationHolder"

    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/b61;->B:La/c4m0;

    .line 6
    .line 7
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance v0, La/o51;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, La/o51;-><init>(La/v51;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2, v0}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p1, p1, La/b61;->C:La/p7m0;

    .line 33
    .line 34
    new-instance p2, La/pa;

    .line 35
    .line 36
    const/16 v0, 0xf

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-direct {p2, p0, v6, v0}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 40
    .line 41
    .line 42
    sget-object v0, La/lkz;->a:La/lkz;

    .line 43
    .line 44
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, La/kz;

    .line 57
    .line 58
    invoke-direct {v3, p1, v0, p2, v6}, La/kz;-><init>(La/gmq;La/clz;La/pa;La/yje;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x3

    .line 62
    invoke-static {v2, v6, v6, v3, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iget-object p2, p2, La/b61;->A:La/p7m0;

    .line 70
    .line 71
    new-instance v0, La/r51;

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct {v0, p0, v6, v8}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v4, La/kz;

    .line 90
    .line 91
    invoke-direct {v4, p2, v2, v0, v6}, La/kz;-><init>(La/gmq;La/clz;La/r51;La/yje;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v6, v6, v4, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iget-object p2, p2, La/b61;->f:La/s91;

    .line 102
    .line 103
    iget-object p2, p2, La/s91;->d:La/qoj0;

    .line 104
    .line 105
    invoke-static {p2}, La/vtb;->M(La/mz40;)La/vae0;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    new-instance v0, La/r51;

    .line 110
    .line 111
    invoke-direct {v0, p0, v6, v1}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    new-instance v4, La/kz;

    .line 127
    .line 128
    invoke-direct {v4, p2, v2, v0, v6}, La/kz;-><init>(La/vae0;La/clz;La/r51;La/yje;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v3, v6, v6, v4, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    iget-object v3, p2, La/b61;->z:La/ol60;

    .line 139
    .line 140
    new-instance v5, La/r51;

    .line 141
    .line 142
    const/4 p2, 0x2

    .line 143
    invoke-direct {v5, p0, v6, p2}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 144
    .line 145
    .line 146
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-static {p2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    new-instance v2, La/kz;

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    invoke-direct/range {v2 .. v7}, La/kz;-><init>(La/gmq;La/clz;La/r51;La/yje;B)V

    .line 162
    .line 163
    .line 164
    invoke-static {p2, v6, v6, v2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    iget-object p2, p2, La/b61;->u:La/j2j;

    .line 172
    .line 173
    iget-object v3, p2, La/j2j;->y:La/qoj0;

    .line 174
    .line 175
    new-instance v5, La/r51;

    .line 176
    .line 177
    invoke-direct {v5, p0, v6, p1}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 178
    .line 179
    .line 180
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-static {p2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    new-instance v2, La/kz;

    .line 193
    .line 194
    invoke-direct/range {v2 .. v7}, La/kz;-><init>(La/gmq;La/clz;La/r51;La/yje;C)V

    .line 195
    .line 196
    .line 197
    invoke-static {p2, v6, v6, v2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 198
    .line 199
    .line 200
    iget-object p2, p0, La/v51;->W1:La/kiu0;

    .line 201
    .line 202
    invoke-virtual {p2}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    check-cast p2, La/yb0;

    .line 207
    .line 208
    iget-object v3, p2, La/yb0;->g:La/ol60;

    .line 209
    .line 210
    new-instance v5, La/r51;

    .line 211
    .line 212
    const/4 p2, 0x4

    .line 213
    invoke-direct {v5, p0, v6, p2}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 214
    .line 215
    .line 216
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-static {p2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    new-instance v2, La/kz;

    .line 229
    .line 230
    invoke-direct/range {v2 .. v7}, La/kz;-><init>(La/gmq;La/clz;La/r51;La/yje;I)V

    .line 231
    .line 232
    .line 233
    invoke-static {p2, v6, v6, v2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-virtual {p2}, Landroidx/fragment/app/e;->P()I

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    if-le p2, v1, :cond_0

    .line 249
    .line 250
    move p2, v1

    .line 251
    goto :goto_0

    .line 252
    :cond_0
    move p2, v8

    .line 253
    :goto_0
    iget-object v0, p1, La/b61;->c:La/vzg0;

    .line 254
    .line 255
    iget-object v2, v0, La/vzg0;->b:La/w5z;

    .line 256
    .line 257
    iget-object v2, v2, La/w5z;->a:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 260
    .line 261
    const-string v3, "NAVIGATION_MAP_ITEM_KEY"

    .line 262
    .line 263
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    if-nez v2, :cond_1

    .line 268
    .line 269
    iget-object v0, p1, La/b61;->d:La/lr1;

    .line 270
    .line 271
    iget-object v2, p1, La/b61;->e:Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 272
    .line 273
    const/16 v3, 0x18

    .line 274
    .line 275
    invoke-static {p1, v0, p2, v2, v3}, La/b61;->x(La/b61;La/lr1;ZLorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;I)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_6

    .line 279
    .line 280
    :cond_1
    const-string p2, "CURRENT_TAB_KEY"

    .line 281
    .line 282
    invoke-virtual {v0, p2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    check-cast p2, La/lr1;

    .line 287
    .line 288
    if-nez p2, :cond_2

    .line 289
    .line 290
    sget-object p2, La/ir1;->c:La/ir1;

    .line 291
    .line 292
    :cond_2
    invoke-virtual {v0, v3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, Ljava/util/HashMap;

    .line 297
    .line 298
    const/4 v2, 0x5

    .line 299
    if-nez v0, :cond_3

    .line 300
    .line 301
    new-instance v0, La/gx3;

    .line 302
    .line 303
    invoke-direct {v0, v2}, La/nuj0;-><init>(I)V

    .line 304
    .line 305
    .line 306
    goto :goto_2

    .line 307
    :cond_3
    new-instance v3, La/gx3;

    .line 308
    .line 309
    invoke-direct {v3, v2}, La/nuj0;-><init>(I)V

    .line 310
    .line 311
    .line 312
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-eqz v2, :cond_4

    .line 325
    .line 326
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, Ljava/util/Map$Entry;

    .line 331
    .line 332
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    check-cast v4, Ljava/lang/String;

    .line 337
    .line 338
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    check-cast v2, Ljava/lang/Boolean;

    .line 343
    .line 344
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v4, v2}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_4
    move-object v0, v3

    .line 352
    :goto_2
    iget-object v2, p1, La/b61;->f:La/s91;

    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object v3, v2, La/s91;->c:La/gx3;

    .line 361
    .line 362
    invoke-virtual {v3}, La/nuj0;->clear()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3, v0}, La/gx3;->putAll(Ljava/util/Map;)V

    .line 366
    .line 367
    .line 368
    iget-object v0, v2, La/s91;->e:La/p7m0;

    .line 369
    .line 370
    invoke-virtual {v0, v6, p2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    iget-boolean v0, p1, La/b61;->y:Z

    .line 374
    .line 375
    const-string v2, "AGGREGATOR_CATEGORIES_TAB_TAG"

    .line 376
    .line 377
    if-eqz v0, :cond_7

    .line 378
    .line 379
    instance-of v3, p2, La/gr1;

    .line 380
    .line 381
    if-eqz v3, :cond_5

    .line 382
    .line 383
    const-string v6, "FAVORITES_TAB_TAG"

    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_5
    instance-of v3, p2, La/hr1;

    .line 387
    .line 388
    if-eqz v3, :cond_6

    .line 389
    .line 390
    const-string v6, "MY_VIRTUAL_TAB_TAG"

    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_6
    instance-of p2, p2, La/fr1;

    .line 394
    .line 395
    if-eqz p2, :cond_d

    .line 396
    .line 397
    :goto_3
    move-object v6, v2

    .line 398
    goto :goto_5

    .line 399
    :cond_7
    instance-of v3, p2, La/jr1;

    .line 400
    .line 401
    if-eqz v3, :cond_8

    .line 402
    .line 403
    const-string v6, "PROMO_TAB_TAG"

    .line 404
    .line 405
    goto :goto_5

    .line 406
    :cond_8
    instance-of v3, p2, La/gr1;

    .line 407
    .line 408
    if-eqz v3, :cond_9

    .line 409
    .line 410
    const-string v6, "FAVORITES_AGGREGATOR_TAB_TAG"

    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_9
    instance-of v3, p2, La/hr1;

    .line 414
    .line 415
    if-eqz v3, :cond_a

    .line 416
    .line 417
    const-string v6, "MY_AGGREGATOR_TAB_TAG"

    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_a
    instance-of v3, p2, La/kr1;

    .line 421
    .line 422
    if-eqz v3, :cond_b

    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_b
    instance-of v3, p2, La/er1;

    .line 426
    .line 427
    if-eqz v3, :cond_c

    .line 428
    .line 429
    :goto_4
    const-string v6, "PROVIDERS_AGGREGATOR_TAB_TAG"

    .line 430
    .line 431
    goto :goto_5

    .line 432
    :cond_c
    instance-of p2, p2, La/fr1;

    .line 433
    .line 434
    if-eqz p2, :cond_d

    .line 435
    .line 436
    goto :goto_3

    .line 437
    :cond_d
    :goto_5
    if-nez v6, :cond_e

    .line 438
    .line 439
    goto :goto_6

    .line 440
    :cond_e
    iget-object p1, p1, La/b61;->z:La/ol60;

    .line 441
    .line 442
    new-instance p2, La/axf0;

    .line 443
    .line 444
    invoke-direct {p2, v6, v0}, La/axf0;-><init>(Ljava/lang/String;Z)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1, p2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :goto_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    check-cast p1, La/yc3;

    .line 455
    .line 456
    new-instance p2, La/p51;

    .line 457
    .line 458
    invoke-direct {p2, p0, v8}, La/p51;-><init>(La/v51;B)V

    .line 459
    .line 460
    .line 461
    invoke-static {p1, p2}, La/ccq0;->U(La/yc3;Lkotlin/jvm/functions/Function0;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    new-instance p2, La/q51;

    .line 473
    .line 474
    invoke-direct {p2, p0, v1}, La/q51;-><init>(La/v51;B)V

    .line 475
    .line 476
    .line 477
    const-string v0, "REQUEST_KEY_CLOSE_GAME"

    .line 478
    .line 479
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    new-instance p2, La/q51;

    .line 487
    .line 488
    invoke-direct {p2, p0, v8}, La/q51;-><init>(La/v51;B)V

    .line 489
    .line 490
    .line 491
    const-string v0, "DAILY_TASKS_SWITCH_TAB_REQUEST"

    .line 492
    .line 493
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 494
    .line 495
    .line 496
    return-void
.end method

.method public final j()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-gt v0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v2}, La/b61;->w(Z)V

    .line 20
    .line 21
    .line 22
    return v1
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v51;->K1:La/h9o0;

    .line 2
    .line 3
    return-object p0
.end method
