.class public final La/stc;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/stc;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public final N1:La/s0r;

.field public final O1:La/kiu0;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/stc;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/office/test_section/impl/databinding/FragmentClientConfigBinding;"

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
    sput-object v1, La/stc;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0218

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/stc;->K1:La/hnm0;

    .line 10
    .line 11
    sget-object v0, La/rtc;->a:La/rtc;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/stc;->N1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/qtc;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/qtc;-><init>(La/stc;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/h79;

    .line 26
    .line 27
    const/16 v2, 0x1b

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/h79;

    .line 35
    .line 36
    const/16 v4, 0x1c

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v3, La/wtc;

    .line 46
    .line 47
    sget-object v4, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, La/wpb;

    .line 54
    .line 55
    const/16 v5, 0x8

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/wpb;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v5, La/wpb;

    .line 61
    .line 62
    const/16 v6, 0x9

    .line 63
    .line 64
    invoke-direct {v5, v1, v6}, La/wpb;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/stc;->O1:La/kiu0;

    .line 72
    .line 73
    new-instance v0, La/qtc;

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    invoke-direct {v0, p0, v1}, La/qtc;-><init>(La/stc;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/stc;->P1:La/a8z;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f05000f

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const v0, 0x7f070725

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const v0, 0x7f0706ea

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0}, La/stc;->G0()La/czq;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p1, La/czq;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/16 v6, 0xa

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    move v4, v2

    .line 44
    invoke-static/range {v1 .. v6}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, La/stc;->G0()La/czq;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p1, p1, La/czq;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    iget-object v0, p0, La/stc;->P1:La/a8z;

    .line 54
    .line 55
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/k1q0;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/stc;->G0()La/czq;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p1, p1, La/czq;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    const/4 v0, 0x3

    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-static {p1, v1, v0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/stc;->G0()La/czq;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, La/czq;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 80
    .line 81
    new-instance v0, La/qtc;

    .line 82
    .line 83
    const/4 v1, 0x2

    .line 84
    invoke-direct {v0, p0, v1}, La/qtc;-><init>(La/stc;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/ttc;

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
    instance-of v3, v0, La/ttc;

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
    check-cast v2, La/ttc;

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
    iget-object v1, v2, La/ttc;->a:La/fhj;

    .line 63
    .line 64
    iget-object v3, v2, La/ttc;->b:La/ctf0;

    .line 65
    .line 66
    iget-object v2, v2, La/ttc;->c:La/wdk0;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v4, La/nhf0;

    .line 75
    .line 76
    invoke-direct {v4, v1, v3, v0, v2}, La/nhf0;-><init>(La/fhj;La/ctf0;La/i1w0;La/wdk0;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/fiu0;

    .line 80
    .line 81
    iget-object v1, v4, La/nhf0;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, La/pai;

    .line 84
    .line 85
    const-class v3, La/wtc;

    .line 86
    .line 87
    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/stc;->L1:La/fiu0;

    .line 95
    .line 96
    iput-object v2, p0, La/stc;->M1:La/wdk0;

    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 100
    .line 101
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final D0()V
    .locals 14

    .line 1
    iget-object v0, p0, La/stc;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/wtc;

    .line 8
    .line 9
    iget-object v1, v1, La/wtc;->d:La/p7m0;

    .line 10
    .line 11
    new-instance v3, La/c48;

    .line 12
    .line 13
    iget-object v4, p0, La/stc;->P1:La/a8z;

    .line 14
    .line 15
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    move-object v5, v4

    .line 20
    check-cast v5, La/k1q0;

    .line 21
    .line 22
    const/4 v9, 0x4

    .line 23
    const/16 v10, 0x18

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const-class v6, La/k1q0;

    .line 27
    .line 28
    const-string v7, "setItems"

    .line 29
    .line 30
    const-string v8, "setItems(Ljava/util/List;)V"

    .line 31
    .line 32
    invoke-direct/range {v3 .. v10}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 33
    .line 34
    .line 35
    sget-object v4, La/lkz;->a:La/lkz;

    .line 36
    .line 37
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    new-instance v6, La/vxb;

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    invoke-direct {v6, v1, v4, v3, v11}, La/vxb;-><init>(La/gmq;La/clz;La/c48;La/yje;)V

    .line 53
    .line 54
    .line 55
    const/4 v13, 0x3

    .line 56
    invoke-static {v5, v11, v11, v6, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/wtc;

    .line 64
    .line 65
    iget-object v8, v0, La/wtc;->e:La/ol60;

    .line 66
    .line 67
    new-instance v0, La/c48;

    .line 68
    .line 69
    const/4 v6, 0x4

    .line 70
    const/16 v7, 0x19

    .line 71
    .line 72
    const/4 v1, 0x2

    .line 73
    const-class v3, La/stc;

    .line 74
    .line 75
    const-string v4, "handleCopyAction"

    .line 76
    .line 77
    const-string v5, "handleCopyAction(Lorg/xplatform/feature/office/test_section/impl/presentation/ClientConfigViewModel$CopyUiAction;)V"

    .line 78
    .line 79
    move-object v2, p0

    .line 80
    invoke-direct/range {v0 .. v7}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v7, La/vxb;

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    move-object v10, v0

    .line 99
    invoke-direct/range {v7 .. v12}, La/vxb;-><init>(La/gmq;La/clz;La/c48;La/yje;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v11, v11, v7, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final G0()La/czq;
    .locals 2

    .line 1
    sget-object v0, La/stc;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/stc;->N1:La/s0r;

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
    check-cast p0, La/czq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/stc;->G0()La/czq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/czq;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/stc;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
