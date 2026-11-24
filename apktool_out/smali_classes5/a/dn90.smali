.class public final La/dn90;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/dn90;",
        "La/iw5;",
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
.field public static final synthetic m2:I


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/jn90;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/pl70;

    .line 13
    .line 14
    const/16 v2, 0x13

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, La/pl70;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/dn90;->l2:La/a8z;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, 0x2becaf27

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/dn90;->l2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/k3t0;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v7, p0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    new-instance v5, La/yi90;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x1

    .line 36
    const/4 v6, 0x1

    .line 37
    const-class v8, La/dn90;

    .line 38
    .line 39
    const-string v9, "handleSideEffect"

    .line 40
    .line 41
    const-string v10, "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/dialogs/pick_sub_game/PickDuelSubGameSideEffect;)V"

    .line 42
    .line 43
    move-object v7, p0

    .line 44
    invoke-direct/range {v5 .. v12}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v3, v5

    .line 51
    :goto_1
    check-cast v3, La/jhy;

    .line 52
    .line 53
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    sget-object p0, La/lkz;->a:La/lkz;

    .line 56
    .line 57
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    or-int/2addr v2, v3

    .line 70
    const/4 v3, 0x3

    .line 71
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    or-int/2addr v2, v3

    .line 76
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    or-int/2addr v2, v3

    .line 81
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-nez v2, :cond_2

    .line 86
    .line 87
    if-ne v3, v4, :cond_3

    .line 88
    .line 89
    :cond_2
    new-instance v3, La/khx;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-direct {v3, v1, v7, p0, v2}, La/khx;-><init>(La/k3t0;La/dn90;La/pz40;La/yje;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 99
    .line 100
    invoke-static {p1, v7, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, La/k3t0;

    .line 108
    .line 109
    check-cast p0, La/i3t0;

    .line 110
    .line 111
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    new-instance v0, La/bw5;

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    move v2, v1

    .line 119
    invoke-static {v2, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move v3, v2

    .line 124
    sget-object v2, La/o050;->e:La/ugd;

    .line 125
    .line 126
    new-instance v4, La/in80;

    .line 127
    .line 128
    invoke-direct {v4, p0, v7, v3}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    const p0, 0x39044d56

    .line 132
    .line 133
    .line 134
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    const/16 v5, 0xa

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    invoke-direct/range {v0 .. v5}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 142
    .line 143
    .line 144
    const/4 p0, 0x0

    .line 145
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 146
    .line 147
    .line 148
    return-object v0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/en90;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/en90;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/en90;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    move-object p1, p0

    .line 59
    :goto_3
    if-eqz p1, :cond_4

    .line 60
    .line 61
    instance-of v0, p1, La/ka9;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    check-cast p1, La/ka9;

    .line 66
    .line 67
    invoke-virtual {p1}, La/ka9;->H0()La/ioi;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object v0, v1, La/en90;->a:La/cad;

    .line 72
    .line 73
    iget-object v1, v1, La/en90;->b:La/o8f;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v2, La/ali;

    .line 79
    .line 80
    invoke-direct {v2, v0, p1, v1}, La/ali;-><init>(La/cad;La/ioi;La/o8f;)V

    .line 81
    .line 82
    .line 83
    new-instance p1, La/fiu0;

    .line 84
    .line 85
    iget-object v0, v2, La/ali;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/eni;

    .line 88
    .line 89
    const-class v1, La/jn90;

    .line 90
    .line 91
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, La/dn90;->k2:La/fiu0;

    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    const-string p0, "Can\'t find feature provider!"

    .line 105
    .line 106
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 111
    .line 112
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
