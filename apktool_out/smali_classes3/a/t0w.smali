.class public final La/t0w;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/a47;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/t0w;",
        "La/nw5;",
        "La/a47;",
        "<init>",
        "()V",
        "a/art",
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
.field public static final l2:La/art;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public e2:La/fiu0;

.field public final f2:La/kiu0;

.field public final g2:La/phf0;

.field public final h2:La/cgx0;

.field public final i2:La/cgx0;

.field public final j2:La/nae0;

.field public final k2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/t0w;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

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
    const-string v3, "customFilter"

    .line 16
    .line 17
    const-string v5, "getCustomFilter()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "sendMail"

    .line 25
    .line 26
    const-string v6, "getSendMail()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/bethistory/impl/databinding/BetHistoryDateFilterTypeDialogBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/t0w;->m2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/art;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/t0w;->l2:La/art;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/r0w;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/r0w;-><init>(La/t0w;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/t7t;

    .line 11
    .line 12
    const/16 v2, 0x16

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v3, La/t7t;

    .line 20
    .line 21
    const/16 v4, 0x17

    .line 22
    .line 23
    invoke-direct {v3, v1, v4}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v3, La/v0w;

    .line 31
    .line 32
    sget-object v4, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, La/qwv;

    .line 39
    .line 40
    const/4 v5, 0x6

    .line 41
    invoke-direct {v4, v1, v5}, La/qwv;-><init>(La/a8z;B)V

    .line 42
    .line 43
    .line 44
    new-instance v5, La/qwv;

    .line 45
    .line 46
    const/4 v6, 0x7

    .line 47
    invoke-direct {v5, v1, v6}, La/qwv;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/t0w;->f2:La/kiu0;

    .line 55
    .line 56
    new-instance v0, La/phf0;

    .line 57
    .line 58
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/t0w;->g2:La/phf0;

    .line 64
    .line 65
    new-instance v0, La/cgx0;

    .line 66
    .line 67
    const-string v1, "EXTRA_CUSTOM_FILTER"

    .line 68
    .line 69
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/t0w;->h2:La/cgx0;

    .line 73
    .line 74
    new-instance v0, La/cgx0;

    .line 75
    .line 76
    const-string v1, "EXTRA_SEND_MAIL"

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/t0w;->i2:La/cgx0;

    .line 82
    .line 83
    sget-object v0, La/s0w;->a:La/s0w;

    .line 84
    .line 85
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, La/t0w;->j2:La/nae0;

    .line 90
    .line 91
    new-instance v0, La/r0w;

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    invoke-direct {v0, p0, v1}, La/r0w;-><init>(La/t0w;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, La/t0w;->k2:La/a8z;

    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final L0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/t0w;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/t0w;->j2:La/nae0;

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
    check-cast p0, La/a47;

    .line 16
    .line 17
    return-object p0
.end method

.method public final O0()V
    .locals 8

    .line 1
    sget-object v0, La/t0w;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/t0w;->j2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v3, v2, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v2, La/a47;

    .line 16
    .line 17
    iget-object v2, v2, La/a47;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iget-object v4, p0, La/t0w;->k2:La/a8z;

    .line 20
    .line 21
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, La/o0w;

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, La/wn8;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const v5, 0x7f080488

    .line 37
    .line 38
    .line 39
    invoke-static {v5, v4}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const/4 v5, 0x1

    .line 44
    invoke-direct {v2, v4, v5}, La/wn8;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 45
    .line 46
    .line 47
    aget-object v0, v0, v1

    .line 48
    .line 49
    invoke-interface {v3, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast v0, La/a47;

    .line 57
    .line 58
    iget-object v0, v0, La/a47;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, La/t0w;->f2:La/kiu0;

    .line 64
    .line 65
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/v0w;

    .line 70
    .line 71
    iget-object v0, v0, La/v0w;->d:La/p7m0;

    .line 72
    .line 73
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    new-instance v5, La/j0s;

    .line 78
    .line 79
    const/16 v0, 0x19

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-direct {v5, p0, v6, v0}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 83
    .line 84
    .line 85
    sget-object v0, La/lkz;->a:La/lkz;

    .line 86
    .line 87
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    new-instance v2, La/hgv;

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    invoke-direct/range {v2 .. v7}, La/hgv;-><init>(La/xae0;La/clz;La/j0s;La/yje;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v6, v6, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final P0()V
    .locals 6

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
    const-class v1, La/ndj;

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
    instance-of v3, v0, La/ndj;

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
    check-cast v2, La/ndj;

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
    const/4 v1, 0x1

    .line 60
    sget-object v3, La/t0w;->m2:[La/iiy;

    .line 61
    .line 62
    aget-object v1, v3, v1

    .line 63
    .line 64
    iget-object v4, p0, La/t0w;->h2:La/cgx0;

    .line 65
    .line 66
    invoke-virtual {v4, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/4 v4, 0x2

    .line 71
    aget-object v3, v3, v4

    .line 72
    .line 73
    iget-object v4, p0, La/t0w;->i2:La/cgx0;

    .line 74
    .line 75
    invoke-virtual {v4, p0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, v2, La/ndj;->b:La/cad;

    .line 83
    .line 84
    iget-object v4, v2, La/ndj;->c:La/duj;

    .line 85
    .line 86
    iget-object v2, v2, La/ndj;->a:La/odj;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v5, La/esg0;

    .line 92
    .line 93
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v2, v5, La/esg0;->a:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v0, v5, La/esg0;->b:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v1, v5, La/esg0;->c:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v3, v5, La/esg0;->d:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v4, v5, La/esg0;->e:Ljava/lang/Object;

    .line 105
    .line 106
    new-instance v0, La/yei;

    .line 107
    .line 108
    const/4 v1, 0x5

    .line 109
    invoke-direct {v0, v5, v1}, La/yei;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    iput-object v0, v5, La/esg0;->f:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance v0, La/fiu0;

    .line 115
    .line 116
    iget-object v1, v5, La/esg0;->f:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, La/yei;

    .line 119
    .line 120
    const-class v2, La/v0w;

    .line 121
    .line 122
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p0, La/t0w;->e2:La/fiu0;

    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 133
    .line 134
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b09

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f130451

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method
