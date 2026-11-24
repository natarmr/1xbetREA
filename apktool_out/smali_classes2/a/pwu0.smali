.class public final La/pwu0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/pwu0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/svs0",
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
.field public static final q2:La/svs0;

.field public static final synthetic r2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/r34;

.field public final m2:La/r34;

.field public final n2:La/phf0;

.field public o2:Lkotlin/jvm/functions/Function0;

.field public final p2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/pwu0;

    .line 4
    .line 5
    const-string v2, "balanceId"

    .line 6
    .line 7
    const-string v3, "getBalanceId()J"

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
    const-string v3, "productId"

    .line 16
    .line 17
    const-string v5, "getProductId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "requestKey"

    .line 25
    .line 26
    const-string v6, "getRequestKey()Ljava/lang/String;"

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
    sput-object v1, La/pwu0;->r2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/svs0;

    .line 45
    .line 46
    const/16 v1, 0xb

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/svs0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/pwu0;->q2:La/svs0;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/r34;

    .line 5
    .line 6
    const-string v1, "balance_id"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/pwu0;->l2:La/r34;

    .line 12
    .line 13
    new-instance v0, La/r34;

    .line 14
    .line 15
    const-string v1, "product_id"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/pwu0;->m2:La/r34;

    .line 21
    .line 22
    new-instance v0, La/phf0;

    .line 23
    .line 24
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/pwu0;->n2:La/phf0;

    .line 30
    .line 31
    new-instance v0, La/o1u0;

    .line 32
    .line 33
    const/16 v1, 0x17

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/o1u0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/pwu0;->o2:Lkotlin/jvm/functions/Function0;

    .line 39
    .line 40
    const-class v0, La/vwu0;

    .line 41
    .line 42
    sget-object v1, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, La/nwu0;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v1, p0, v2}, La/nwu0;-><init>(La/pwu0;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/pwu0;->p2:La/a8z;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    new-instance v0, La/nwu0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, La/nwu0;-><init>(La/pwu0;B)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, La/pwu0;->o2:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    invoke-super {p0, p1}, La/iw5;->C0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final J0(La/fet;)La/bw5;
    .locals 12

    .line 1
    const v0, -0x6ca1dd96

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/pwu0;->p2:La/a8z;

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
    check-cast v1, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/k3t0;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, La/ukd;->a:La/cl5;

    .line 36
    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    :cond_0
    new-instance v3, La/npt0;

    .line 42
    .line 43
    const/16 v2, 0x13

    .line 44
    .line 45
    invoke-direct {v3, p0, v2}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    sget-object v2, La/lkz;->a:La/lkz;

    .line 54
    .line 55
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    or-int/2addr v3, v5

    .line 68
    const/4 v5, 0x3

    .line 69
    invoke-virtual {p1, v5}, La/fet;->e(I)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    or-int/2addr v3, v5

    .line 74
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    or-int/2addr v3, v5

    .line 79
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-nez v3, :cond_2

    .line 84
    .line 85
    if-ne v5, v4, :cond_3

    .line 86
    .line 87
    :cond_2
    new-instance v5, La/otp0;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-direct {v5, v0, p0, v2, v3}, La/otp0;-><init>(La/k3t0;La/pwu0;La/pz40;La/yje;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 97
    .line 98
    invoke-static {p1, p0, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    new-instance v6, La/bw5;

    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    new-instance v0, La/qjr0;

    .line 109
    .line 110
    const/4 v2, 0x4

    .line 111
    invoke-direct {v0, v1, v2}, La/qjr0;-><init>(La/l7m0;B)V

    .line 112
    .line 113
    .line 114
    const v2, 0x1f1648d9

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    new-instance v0, La/wis0;

    .line 122
    .line 123
    const/4 v2, 0x2

    .line 124
    invoke-direct {v0, v1, p0, v2}, La/wis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    const p0, -0x249eda25

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    const/16 v11, 0xa

    .line 135
    .line 136
    const/4 v9, 0x0

    .line 137
    invoke-direct/range {v6 .. v11}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    return-object v6
.end method

.method public final W(Landroid/os/Bundle;)V
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
    const-class v1, La/qwu0;

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
    instance-of v3, v0, La/qwu0;

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
    check-cast v2, La/qwu0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/qwu0;->a:La/cad;

    .line 56
    .line 57
    iget-object v1, v2, La/qwu0;->b:La/r9u;

    .line 58
    .line 59
    iget-object v3, v2, La/qwu0;->c:La/duj;

    .line 60
    .line 61
    iget-object v2, v2, La/qwu0;->d:La/ctf0;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v1, La/ali;

    .line 70
    .line 71
    invoke-direct {v1, v0, v3, v2}, La/ali;-><init>(La/cad;La/duj;La/ctf0;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, La/fiu0;

    .line 75
    .line 76
    iget-object v1, v1, La/ali;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/yxi;

    .line 79
    .line 80
    const-class v2, La/vwu0;

    .line 81
    .line 82
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, La/pwu0;->k2:La/fiu0;

    .line 90
    .line 91
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 96
    .line 97
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->g0()V

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

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/pwu0;->o2:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
