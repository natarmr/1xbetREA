.class public final La/o2e0;
.super La/sik;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/o2e0;",
        "La/sik;",
        "<init>",
        "()V",
        "a/mi70",
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
.field public static final b2:La/mi70;

.field public static final synthetic c2:[La/iiy;


# instance fields
.field public Y1:La/fiu0;

.field public final Z1:La/nae0;

.field public final a2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/o2e0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/rate_app/impl/databinding/DialogRateAppBinding;"

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
    sput-object v1, La/o2e0;->c2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/mi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/o2e0;->b2:La/mi70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/sik;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/n2e0;->a:La/n2e0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/o2e0;->Z1:La/nae0;

    .line 11
    .line 12
    const-class v0, La/q2e0;

    .line 13
    .line 14
    sget-object v1, La/sre0;->a:La/tre0;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/p7d0;

    .line 21
    .line 22
    const/16 v2, 0xe

    .line 23
    .line 24
    invoke-direct {v1, p0, v2}, La/p7d0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/o2e0;->a2:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    new-instance p1, La/hgd;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget p0, p0, La/sik;->M1:I

    .line 8
    .line 9
    invoke-direct {p1, v0, p0}, La/hgd;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    invoke-virtual {p0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 12

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
    const-class v1, La/m2e0;

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
    instance-of v3, v0, La/m2e0;

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
    check-cast v2, La/m2e0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v4, v2, La/m2e0;->c:La/mne;

    .line 63
    .line 64
    iget-object v8, v2, La/m2e0;->d:La/ctf0;

    .line 65
    .line 66
    iget-object v5, v2, La/m2e0;->a:La/iw20;

    .line 67
    .line 68
    iget-object v6, v2, La/m2e0;->b:La/m6m0;

    .line 69
    .line 70
    iget-object v9, v2, La/m2e0;->e:La/vwb0;

    .line 71
    .line 72
    iget-object v10, v2, La/m2e0;->f:La/q7d0;

    .line 73
    .line 74
    iget-object v11, v2, La/m2e0;->g:La/us00;

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v3, La/rrd;

    .line 86
    .line 87
    invoke-direct/range {v3 .. v11}, La/rrd;-><init>(La/mne;La/iw20;La/m6m0;La/i1w0;La/ctf0;La/vwb0;La/q7d0;La/us00;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, La/fiu0;

    .line 91
    .line 92
    iget-object v1, v3, La/rrd;->i:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, La/ppi;

    .line 95
    .line 96
    const-class v2, La/q2e0;

    .line 97
    .line 98
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, La/o2e0;->Y1:La/fiu0;

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    const v1, 0x7f140289

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0, v1}, La/sik;->F0(II)V

    .line 112
    .line 113
    .line 114
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 119
    .line 120
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/o2e0;->c2:[La/iiy;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    aget-object p1, p1, p2

    .line 8
    .line 9
    iget-object p2, p0, La/o2e0;->Z1:La/nae0;

    .line 10
    .line 11
    invoke-interface {p2, p1, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, La/ijk;

    .line 19
    .line 20
    iget-object p0, p0, La/ijk;->a:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final e0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x1010451

    .line 16
    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    const v4, 0x7f040b5d

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1, v4, v2, v3}, La/ofm0;->z(Landroid/view/Window;Landroid/content/Context;III)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 28
    .line 29
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of p2, p1, Landroid/view/View;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    check-cast p1, Landroid/view/View;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, v0

    .line 21
    :goto_0
    if-eqz p1, :cond_1

    .line 22
    .line 23
    new-instance p2, La/nv20;

    .line 24
    .line 25
    invoke-direct {p2, p0}, La/nv20;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-static {p1, p2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    sget-object p1, La/o2e0;->c2:[La/iiy;

    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    aget-object p1, p1, p2

    .line 37
    .line 38
    iget-object p2, p0, La/o2e0;->Z1:La/nae0;

    .line 39
    .line 40
    invoke-interface {p2, p1, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast p1, La/ijk;

    .line 48
    .line 49
    iget-object p1, p1, La/ijk;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 50
    .line 51
    new-instance p2, La/nrc0;

    .line 52
    .line 53
    const/16 v1, 0xf

    .line 54
    .line 55
    invoke-direct {p2, p0, v1}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance p0, La/ugd;

    .line 59
    .line 60
    const v1, -0x2c17170e    # -2.0006812E12f

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    invoke-direct {p0, v1, v2, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
