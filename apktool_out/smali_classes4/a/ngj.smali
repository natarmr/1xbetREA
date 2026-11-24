.class public final La/ngj;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/rzq;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/ngj;",
        "La/stl;",
        "La/rzq;",
        "<init>",
        "()V",
        "a/usd",
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
.field public static final n2:La/usd;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final g2:La/nae0;

.field public h2:La/wdk0;

.field public i2:La/ii;

.field public j2:La/fiu0;

.field public final k2:La/kiu0;

.field public final l2:La/kiu0;

.field public final m2:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ngj;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/dayexpress/impl/databinding/FragmentDayExpressDetailBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/ngj;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/usd;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ngj;->n2:La/usd;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/lgj;->a:La/lgj;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/ngj;->g2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/jgj;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, La/jgj;-><init>(La/ngj;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/q7g;

    .line 19
    .line 20
    const/16 v2, 0x14

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/q7g;

    .line 28
    .line 29
    const/16 v4, 0x15

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v3, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    const-class v4, La/xgj;

    .line 41
    .line 42
    invoke-virtual {v3, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v5, La/r7g;

    .line 47
    .line 48
    const/16 v6, 0x16

    .line 49
    .line 50
    invoke-direct {v5, v1, v6}, La/r7g;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v7, La/r7g;

    .line 54
    .line 55
    const/16 v8, 0x17

    .line 56
    .line 57
    invoke-direct {v7, v1, v8}, La/r7g;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v4, v5, v7, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/ngj;->k2:La/kiu0;

    .line 65
    .line 66
    new-instance v0, La/jgj;

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-direct {v0, p0, v1}, La/jgj;-><init>(La/ngj;B)V

    .line 70
    .line 71
    .line 72
    new-instance v1, La/q7g;

    .line 73
    .line 74
    invoke-direct {v1, v0, v6}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-class v1, La/pgj;

    .line 82
    .line 83
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    new-instance v2, La/r7g;

    .line 88
    .line 89
    const/16 v3, 0x18

    .line 90
    .line 91
    invoke-direct {v2, v0, v3}, La/r7g;-><init>(La/a8z;B)V

    .line 92
    .line 93
    .line 94
    new-instance v3, La/r7g;

    .line 95
    .line 96
    const/16 v4, 0x19

    .line 97
    .line 98
    invoke-direct {v3, v0, v4}, La/r7g;-><init>(La/a8z;B)V

    .line 99
    .line 100
    .line 101
    new-instance v4, La/lhf;

    .line 102
    .line 103
    const/16 v5, 0xc

    .line 104
    .line 105
    invoke-direct {v4, p0, v0, v5}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {p0, v1, v2, v3, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, La/ngj;->l2:La/kiu0;

    .line 113
    .line 114
    new-instance v0, La/bmh;

    .line 115
    .line 116
    const/16 v1, 0x1c

    .line 117
    .line 118
    invoke-direct {v0, v1}, La/bmh;-><init>(B)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, La/ngj;->m2:La/n0o0;

    .line 126
    .line 127
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ngj;->V0()La/rzq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/ngj;->V0()La/rzq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/rzq;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, La/ngj;->m2:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/igj;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/ngj;->V0()La/rzq;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, La/rzq;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 35
    .line 36
    new-instance v1, La/kgj;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v1, p0, v2}, La/kgj;-><init>(La/ngj;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/ngj;->V0()La/rzq;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, La/rzq;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 50
    .line 51
    new-instance v1, La/kgj;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-direct {v1, p0, v2}, La/kgj;-><init>(La/ngj;B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final T0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/ogj;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/ogj;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/ogj;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v1, v2, La/ogj;->a:La/sue;

    .line 63
    .line 64
    iget-object v3, v2, La/ogj;->b:La/wdk0;

    .line 65
    .line 66
    iget-object v4, v2, La/ogj;->c:La/ii;

    .line 67
    .line 68
    iget-object v5, v2, La/ogj;->d:La/ouu;

    .line 69
    .line 70
    iget-object v6, v2, La/ogj;->e:La/mne;

    .line 71
    .line 72
    iget-object v2, v2, La/ogj;->f:La/ctf0;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v7, La/esg0;

    .line 87
    .line 88
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, v7, La/esg0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v5, v7, La/esg0;->b:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v1, v7, La/esg0;->c:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v6, v7, La/esg0;->d:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v2, v7, La/esg0;->e:Ljava/lang/Object;

    .line 100
    .line 101
    new-instance v0, La/yei;

    .line 102
    .line 103
    const/4 v1, 0x6

    .line 104
    invoke-direct {v0, v7, v1}, La/yei;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    iput-object v0, v7, La/esg0;->f:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v3, p0, La/ngj;->h2:La/wdk0;

    .line 110
    .line 111
    iput-object v4, p0, La/ngj;->i2:La/ii;

    .line 112
    .line 113
    new-instance v0, La/fiu0;

    .line 114
    .line 115
    iget-object v1, v7, La/esg0;->f:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, La/yei;

    .line 118
    .line 119
    const-class v2, La/xgj;

    .line 120
    .line 121
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, La/ngj;->j2:La/fiu0;

    .line 129
    .line 130
    return-void

    .line 131
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 132
    .line 133
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final U0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/ngj;->W0()La/xgj;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/xgj;->g:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/mgj;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/mgj;-><init>(La/ngj;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/g8g;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/g8g;-><init>(La/gmq;La/clz;La/mgj;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/ngj;->W0()La/xgj;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/xgj;->h:La/ol60;

    .line 42
    .line 43
    new-instance v6, La/mgj;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/mgj;-><init>(La/ngj;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v3, La/g8g;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/g8g;-><init>(La/gmq;La/clz;La/mgj;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final V0()La/rzq;
    .locals 2

    .line 1
    sget-object v0, La/ngj;->o2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ngj;->g2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/rzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, La/stl;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/jgj;

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-direct {p1, p0, v0}, La/jgj;-><init>(La/ngj;B)V

    .line 8
    .line 9
    .line 10
    const-string v1, "REQUEST_EXPRESS_DIALOG_EXPRESS"

    .line 11
    .line 12
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/ngj;->l2:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/pgj;

    .line 22
    .line 23
    iget-object p1, p1, La/pgj;->b:La/p7m0;

    .line 24
    .line 25
    sget-object v1, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    new-instance v1, La/mgj;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v1, p0, v3, v2}, La/mgj;-><init>(La/ngj;La/yje;B)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 35
    .line 36
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v4, La/g8g;

    .line 41
    .line 42
    invoke-direct {v4, p1, p0, v1, v3}, La/g8g;-><init>(La/gmq;La/ngj;La/mgj;La/yje;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3, v3, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final W0()La/xgj;
    .locals 0

    .line 1
    iget-object p0, p0, La/ngj;->k2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xgj;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    :cond_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method
