.class public final La/fj50;
.super La/u0i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/fj50;",
        "La/u0i;",
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
.field public static final synthetic i2:I


# instance fields
.field public f2:La/fiu0;

.field public final g2:La/kiu0;

.field public h2:La/r12;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/u0i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/np30;

    .line 5
    .line 6
    const/16 v1, 0x11

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/pv10;

    .line 12
    .line 13
    const/16 v2, 0x1d

    .line 14
    .line 15
    invoke-direct {v1, p0, v2}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/wez;->b:La/wez;

    .line 19
    .line 20
    new-instance v3, La/ej50;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-direct {v3, v1, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v2, La/gj50;

    .line 31
    .line 32
    sget-object v3, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, La/y620;

    .line 39
    .line 40
    const/16 v4, 0x14

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/y620;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/y620;

    .line 46
    .line 47
    const/16 v5, 0x15

    .line 48
    .line 49
    invoke-direct {v4, v1, v5}, La/y620;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/fj50;->g2:La/kiu0;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final O0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/fj50;->g2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/gj50;

    .line 8
    .line 9
    iget-object v1, v0, La/gj50;->b:La/i1w0;

    .line 10
    .line 11
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v0, v0, La/gj50;->c:La/drm0;

    .line 16
    .line 17
    invoke-static {v0}, La/drm0;->e(La/drm0;)Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    new-instance v3, La/e1w0;

    .line 26
    .line 27
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 28
    .line 29
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, La/c8d;

    .line 33
    .line 34
    sget-object v4, La/y7d;->a:La/v7d;

    .line 35
    .line 36
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v3, La/w0w0;

    .line 44
    .line 45
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, La/c8d;

    .line 49
    .line 50
    sget-object v4, La/y7d;->a:La/v7d;

    .line 51
    .line 52
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :goto_0
    const/4 v0, 0x0

    .line 59
    invoke-static {v1, v2, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    move-object v2, v0

    .line 64
    check-cast v2, La/paw;

    .line 65
    .line 66
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, La/oe50;

    .line 77
    .line 78
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-super {p0}, La/u0i;->O0()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/u0i;->W(Landroid/os/Bundle;)V

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
    const-class v0, La/pty;

    .line 25
    .line 26
    if-eqz p1, :cond_3

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
    instance-of v2, p1, La/pty;

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
    check-cast v1, La/pty;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, La/pty;->a:La/p12;

    .line 66
    .line 67
    iget-object v1, v1, La/pty;->b:La/ilp0;

    .line 68
    .line 69
    new-instance v2, La/oif0;

    .line 70
    .line 71
    invoke-direct {v2, v0, v1, p1}, La/oif0;-><init>(La/p12;La/ilp0;La/i1w0;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, La/fiu0;

    .line 75
    .line 76
    iget-object v1, v2, La/oif0;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/tii;

    .line 79
    .line 80
    const-class v2, La/gj50;

    .line 81
    .line 82
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {p1, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, La/fj50;->f2:La/fiu0;

    .line 90
    .line 91
    iget-object p1, v0, La/p12;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, La/p12;

    .line 94
    .line 95
    iget-object p1, p1, La/p12;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, La/r12;

    .line 98
    .line 99
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, La/fj50;->h2:La/r12;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v1, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$NotIdentifiedKzAlert;

    .line 109
    .line 110
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    iget-object p0, p0, Lorg/xplatform/uikit/components/dialog/DialogFields;->a:Ljava/lang/CharSequence;

    .line 115
    .line 116
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-direct {v1, p0}, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$NotIdentifiedKzAlert;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    check-cast p1, La/s12;

    .line 124
    .line 125
    iput-object v0, p1, La/s12;->g:Landroidx/fragment/app/e;

    .line 126
    .line 127
    iput-object v1, p1, La/s12;->f:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;

    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 131
    .line 132
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/fj50;->h2:La/r12;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast v0, La/s12;

    .line 9
    .line 10
    invoke-virtual {v0}, La/s12;->b()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "alertsPipeReceiver"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method
