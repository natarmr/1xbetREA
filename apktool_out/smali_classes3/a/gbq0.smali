.class public final La/gbq0;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/pjk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/gbq0;",
        "La/stl;",
        "La/pjk;",
        "<init>",
        "()V",
        "a/s2m0",
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
.field public static final m2:La/s2m0;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public g2:La/fiu0;

.field public final h2:La/nae0;

.field public final i2:La/kiu0;

.field public final j2:La/es;

.field public final k2:La/phf0;

.field public final l2:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/gbq0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/callback/impl/databinding/DialogThemeSelectorBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "items"

    .line 16
    .line 17
    const-string v5, "getItems()Ljava/util/List;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "resultKey"

    .line 25
    .line 26
    const-string v6, "getResultKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/gbq0;->n2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/s2m0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/gbq0;->m2:La/s2m0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/fbq0;->a:La/fbq0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/gbq0;->h2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/ebq0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/ebq0;-><init>(La/gbq0;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/mfo0;

    .line 19
    .line 20
    const/16 v2, 0xf

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/mfo0;

    .line 28
    .line 29
    const/16 v4, 0x10

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/nbq0;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/r5p0;

    .line 47
    .line 48
    const/16 v4, 0x8

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/r5p0;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/r5p0;

    .line 54
    .line 55
    const/16 v5, 0x9

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/gbq0;->i2:La/kiu0;

    .line 65
    .line 66
    new-instance v0, La/es;

    .line 67
    .line 68
    const-string v1, "BUNDLE_THEME_ITEMS"

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/gbq0;->j2:La/es;

    .line 74
    .line 75
    new-instance v0, La/phf0;

    .line 76
    .line 77
    const-string v1, "BUNDLE_RESULT_KEY"

    .line 78
    .line 79
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La/gbq0;->k2:La/phf0;

    .line 83
    .line 84
    new-instance v0, La/ebq0;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    invoke-direct {v0, p0, v1}, La/ebq0;-><init>(La/gbq0;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, La/gbq0;->l2:La/n0o0;

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final Q0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/gbq0;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/gbq0;->h2:La/nae0;

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
    check-cast p0, La/pjk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final S0()V
    .locals 2

    .line 1
    sget-object v0, La/gbq0;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/gbq0;->h2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/pjk;

    .line 16
    .line 17
    iget-object v0, v0, La/pjk;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iget-object p0, p0, La/gbq0;->l2:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/cbq0;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final T0()V
    .locals 4

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
    const-class v1, La/dbq0;

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
    instance-of v3, v0, La/dbq0;

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
    check-cast v2, La/dbq0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/gbq0;->n2:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/gbq0;->j2:La/es;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, La/chf0;

    .line 67
    .line 68
    invoke-direct {v1, v0}, La/chf0;-><init>(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, La/fiu0;

    .line 72
    .line 73
    iget-object v1, v1, La/chf0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, La/xvi;

    .line 76
    .line 77
    const-class v2, La/nbq0;

    .line 78
    .line 79
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, La/gbq0;->g2:La/fiu0;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 90
    .line 91
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final U0()V
    .locals 11

    .line 1
    iget-object v8, p0, La/gbq0;->i2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/nbq0;

    .line 8
    .line 9
    iget-object v0, v0, La/nbq0;->c:La/p7m0;

    .line 10
    .line 11
    new-instance v9, La/h2c;

    .line 12
    .line 13
    const/16 v1, 0x17

    .line 14
    .line 15
    invoke-direct {v9, v0, v1}, La/h2c;-><init>(La/p7m0;B)V

    .line 16
    .line 17
    .line 18
    new-instance v0, La/bdl0;

    .line 19
    .line 20
    const/4 v6, 0x4

    .line 21
    const/16 v7, 0xc

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    const-class v3, La/gbq0;

    .line 25
    .line 26
    const-string v4, "handleEvent"

    .line 27
    .line 28
    const-string v5, "handleEvent(Lorg/xplatform/callback/impl/presentation/theme_selector/model/ThemeSelectorEvent;)V"

    .line 29
    .line 30
    move-object v2, p0

    .line 31
    invoke-direct/range {v0 .. v7}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 32
    .line 33
    .line 34
    sget-object v1, La/lkz;->a:La/lkz;

    .line 35
    .line 36
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v4, La/lto0;

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    invoke-direct {v4, v9, v1, v0, v10}, La/lto0;-><init>(La/h2c;La/clz;La/bdl0;La/yje;)V

    .line 52
    .line 53
    .line 54
    const/4 v9, 0x3

    .line 55
    invoke-static {v2, v10, v10, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/nbq0;

    .line 63
    .line 64
    iget-object v8, v0, La/nbq0;->d:La/p7m0;

    .line 65
    .line 66
    new-instance v0, La/bdl0;

    .line 67
    .line 68
    const/16 v7, 0xd

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    const-string v4, "handleUiState"

    .line 72
    .line 73
    const-string v5, "handleUiState(Lorg/xplatform/callback/impl/presentation/theme_selector/model/ThemeSelectorUiState;)V"

    .line 74
    .line 75
    move-object v2, p0

    .line 76
    invoke-direct/range {v0 .. v7}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v3, La/lto0;

    .line 92
    .line 93
    invoke-direct {v3, v8, v1, v0, v10}, La/lto0;-><init>(La/p7m0;La/clz;La/bdl0;La/yje;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v2, v10, v10, v3, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/stl;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/gbq0;->U0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
