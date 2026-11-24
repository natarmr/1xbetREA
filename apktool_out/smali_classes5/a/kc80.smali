.class public final La/kc80;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/tah0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/kc80;",
        "La/yx5;",
        "La/tah0;",
        "<init>",
        "()V",
        "a/nh70",
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
.field public static final O1:La/nh70;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/kiu0;

.field public final N1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/kc80;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentOtherGridSectionBinding;"

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
    sput-object v1, La/kc80;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nh70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/kc80;->O1:La/nh70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const v0, 0x7f0d0279

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/kc80;->K1:Z

    .line 9
    .line 10
    sget-object v0, La/jc80;->a:La/jc80;

    .line 11
    .line 12
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/kc80;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/cz60;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/16 v8, 0x9

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const-class v4, La/kc80;

    .line 25
    .line 26
    const-string v5, "requireParentFragment"

    .line 27
    .line 28
    const-string v6, "requireParentFragment()Landroidx/fragment/app/Fragment;"

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    invoke-direct/range {v1 .. v8}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 32
    .line 33
    .line 34
    sget-object p0, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v0, La/gg70;

    .line 37
    .line 38
    const/16 v2, 0x18

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-class v0, La/fho0;

    .line 48
    .line 49
    sget-object v1, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, La/ph70;

    .line 56
    .line 57
    const/16 v2, 0x14

    .line 58
    .line 59
    invoke-direct {v1, p0, v2}, La/ph70;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    new-instance v2, La/ph70;

    .line 63
    .line 64
    const/16 v4, 0x15

    .line 65
    .line 66
    invoke-direct {v2, p0, v4}, La/ph70;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    new-instance v4, La/ha30;

    .line 70
    .line 71
    const/16 v5, 0x11

    .line 72
    .line 73
    invoke-direct {v4, v3, p0, v5}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v3, v0, v1, v2, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iput-object p0, v3, La/kc80;->M1:La/kiu0;

    .line 81
    .line 82
    new-instance p0, La/pl70;

    .line 83
    .line 84
    const/4 v0, 0x7

    .line 85
    invoke-direct {p0, v3, v0}, La/pl70;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iput-object p0, v3, La/kc80;->N1:La/n0o0;

    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v0, p0, La/kc80;->N1:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/ic80;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/ic80;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v2, La/l5g;

    .line 34
    .line 35
    const/4 v3, 0x6

    .line 36
    invoke-direct {v2, p1, v3}, La/l5g;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v3, La/j14;

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    invoke-direct {v3, v1, v2, v4}, La/j14;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p1, p1, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p1, p1, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    invoke-static {p1, v1}, La/knm0;->i(Landroid/view/View;Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p1, p1, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const v3, 0x7f07072d

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const v3, 0x7f0701bb

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-static {}, La/cy7;->c()Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    sget-object v12, La/iun;->a:La/iun;

    .line 100
    .line 101
    new-instance v5, La/fvl;

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    move v8, v7

    .line 105
    move v10, v6

    .line 106
    invoke-direct/range {v5 .. v12}, La/fvl;-><init>(IIIIIZLjava/util/List;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object p1, p1, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    iget-object p0, p0, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    sget-object p1, La/sre0;->a:La/tre0;

    .line 129
    .line 130
    const-class v2, La/w140;

    .line 131
    .line 132
    invoke-virtual {p1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    const-class v3, La/a240;

    .line 137
    .line 138
    invoke-virtual {p1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const-class v5, La/h140;

    .line 143
    .line 144
    invoke-virtual {p1, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    const-class v6, La/g140;

    .line 149
    .line 150
    invoke-virtual {p1, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const/4 v6, 0x4

    .line 155
    new-array v6, v6, [La/sgy;

    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    aput-object v2, v6, v7

    .line 159
    .line 160
    aput-object v3, v6, v1

    .line 161
    .line 162
    const/4 v1, 0x2

    .line 163
    aput-object v5, v6, v1

    .line 164
    .line 165
    aput-object p1, v6, v4

    .line 166
    .line 167
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, La/ic80;

    .line 176
    .line 177
    invoke-static {p0, p1, v0}, La/dtb;->u(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;La/qv5;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/kc80;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/fho0;

    .line 8
    .line 9
    sget-object v1, La/r040;->i:La/r040;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, La/fho0;->y(La/r040;)La/gmq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    new-instance v2, La/hi70;

    .line 18
    .line 19
    iget-object v1, p0, La/kc80;->N1:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v4, v1

    .line 26
    check-cast v4, La/ic80;

    .line 27
    .line 28
    const/4 v8, 0x4

    .line 29
    const/16 v9, 0xb

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const-class v5, La/ic80;

    .line 33
    .line 34
    const-string v6, "setItems"

    .line 35
    .line 36
    const-string v7, "setItems(Ljava/util/List;)V"

    .line 37
    .line 38
    invoke-direct/range {v2 .. v9}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 42
    .line 43
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v3, La/zm70;

    .line 48
    .line 49
    check-cast v0, La/utb;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v0, p0, v2, v4}, La/zm70;-><init>(La/utb;La/kc80;La/hi70;La/yje;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x3

    .line 56
    invoke-static {v1, v4, v4, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final G0()La/n2r;
    .locals 2

    .line 1
    sget-object v0, La/kc80;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/kc80;->L1:La/s0r;

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
    check-cast p0, La/n2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/ex60;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    const-string v1, "UPDATED_BALANCE_KEY"

    .line 15
    .line 16
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/kc80;->M1:La/kiu0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/fho0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/fho0;->B()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/kc80;->G0()La/n2r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/n2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0}, La/kcx;->G(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/kc80;->K1:Z

    .line 2
    .line 3
    return p0
.end method
