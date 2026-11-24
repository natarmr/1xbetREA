.class public final La/ep90;
.super La/of80;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ep90;",
        "La/of80;",
        "<init>",
        "()V",
        "a/jh70",
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
.field public static final c2:La/jh70;

.field public static final synthetic d2:[La/iiy;

.field public static final e2:Ljava/lang/String;


# instance fields
.field public Y1:La/tni;

.field public final Z1:La/s0r;

.field public final a2:La/a8z;

.field public final b2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ep90;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/picker/impl/databinding/DialogFragmentPickerBinding;"

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
    const-string v3, "pickerParams"

    .line 16
    .line 17
    const-string v5, "getPickerParams()Lorg/xplatform/picker/api/presentation/PickerDialogParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/ep90;->d2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/jh70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ep90;->c2:La/jh70;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/ep90;->e2:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0148

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/sik;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/dp90;->a:La/dp90;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/ep90;->Z1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/kp90;

    .line 16
    .line 17
    sget-object v1, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/bp90;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/bp90;-><init>(La/ep90;B)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0xe

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/ep90;->a2:La/a8z;

    .line 37
    .line 38
    new-instance v0, La/khf0;

    .line 39
    .line 40
    const-string v1, "KEY_PARAMS"

    .line 41
    .line 42
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/ep90;->b2:La/khf0;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final K0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ep90;->a2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/of80;->V(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/af3;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    :goto_0
    const-class v2, La/fp90;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/o5d0;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v1, v3

    .line 50
    :goto_1
    instance-of v4, v1, La/fp90;

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v1

    .line 56
    :goto_2
    check-cast v3, La/fp90;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    sget-object v1, La/ep90;->d2:[La/iiy;

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    aget-object v1, v1, v2

    .line 64
    .line 65
    iget-object v2, v0, La/ep90;->b2:La/khf0;

    .line 66
    .line 67
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v6, v1

    .line 72
    check-cast v6, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 73
    .line 74
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    sget-object v16, La/ep90;->e2:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v5, v3, La/fp90;->c:La/cad;

    .line 87
    .line 88
    iget-object v7, v3, La/fp90;->b:La/ctf0;

    .line 89
    .line 90
    iget-object v8, v3, La/fp90;->d:La/pru;

    .line 91
    .line 92
    iget-object v9, v3, La/fp90;->e:La/duj;

    .line 93
    .line 94
    iget-object v10, v3, La/fp90;->f:La/yp90;

    .line 95
    .line 96
    iget-object v11, v3, La/fp90;->g:La/imb;

    .line 97
    .line 98
    iget-object v12, v3, La/fp90;->a:La/bot;

    .line 99
    .line 100
    iget-object v13, v3, La/fp90;->h:La/je;

    .line 101
    .line 102
    iget-object v14, v3, La/fp90;->i:La/kt2;

    .line 103
    .line 104
    iget-object v1, v6, Lorg/xplatform/picker/api/presentation/PickerDialogParams;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 105
    .line 106
    iget-object v2, v3, La/fp90;->j:La/bzt;

    .line 107
    .line 108
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance v4, La/v7i;

    .line 121
    .line 122
    move-object/from16 v17, v1

    .line 123
    .line 124
    move-object/from16 v18, v2

    .line 125
    .line 126
    invoke-direct/range {v4 .. v18}, La/v7i;-><init>(La/cad;Lorg/xplatform/picker/api/presentation/PickerDialogParams;La/ctf0;La/pru;La/duj;La/yp90;La/imb;La/bot;La/je;La/kt2;La/i1w0;Ljava/lang/String;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;La/bzt;)V

    .line 127
    .line 128
    .line 129
    iget-object v1, v4, La/v7i;->o:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, La/n5d0;

    .line 132
    .line 133
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, La/tni;

    .line 138
    .line 139
    iput-object v1, v0, La/ep90;->Y1:La/tni;

    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 143
    .line 144
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/of80;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    const v0, 0x7f140026

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/sik;->F0(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-super {p0}, La/sik;->Z()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/of80;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-static {p0, v0}, La/hfm0;->u(Landroid/view/Window;Landroid/view/Window;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {p1, p2}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0x30

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p1, La/ep90;->d2:[La/iiy;

    .line 24
    .line 25
    aget-object p1, p1, p2

    .line 26
    .line 27
    iget-object p2, p0, La/ep90;->Z1:La/s0r;

    .line 28
    .line 29
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p1, La/uik;

    .line 37
    .line 38
    iget-object p1, p1, La/uik;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 39
    .line 40
    sget-object p2, La/qek0;->h:La/qek0;

    .line 41
    .line 42
    new-instance v0, La/ds60;

    .line 43
    .line 44
    const/16 v1, 0x1b

    .line 45
    .line 46
    invoke-direct {v0, p0, v1}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance p0, La/ugd;

    .line 50
    .line 51
    const v1, -0x5b6a3fb6

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
