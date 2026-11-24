.class public final La/h970;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/h970;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/atz",
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
.field public static final o2:La/atz;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public l2:Z

.field public m2:La/umi;

.field public final n2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/h970;

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
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/h970;->p2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/atz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/h970;->o2:La/atz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/h970;->k2:La/phf0;

    .line 12
    .line 13
    const-class v0, La/v970;

    .line 14
    .line 15
    sget-object v1, La/sre0;->a:La/tre0;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/pu50;

    .line 22
    .line 23
    const/16 v2, 0x15

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    const/16 v2, 0xe

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/h970;->n2:La/a8z;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, -0x5857226e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/h970;->n2:La/a8z;

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
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/u970;

    .line 26
    .line 27
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v3, v0

    .line 32
    check-cast v3, La/k3t0;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    sget-object v4, La/ukd;->a:La/cl5;

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    if-ne v2, v4, :cond_1

    .line 47
    .line 48
    :cond_0
    new-instance v5, La/cy60;

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/16 v12, 0xa

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    const-class v8, La/h970;

    .line 55
    .line 56
    const-string v9, "handleSideEffect"

    .line 57
    .line 58
    const-string v10, "handleSideEffect(Lorg/xplatform/web/impl/presentation/game/dialogs/disable_demo/models/OneXGamesWebGameDisableDemoDialogSideEffect;)V"

    .line 59
    .line 60
    move-object v7, p0

    .line 61
    invoke-direct/range {v5 .. v12}, La/cy60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v2, v5

    .line 68
    :cond_1
    check-cast v2, La/jhy;

    .line 69
    .line 70
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    sget-object v0, La/or00;->a:La/zfn;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/clz;

    .line 79
    .line 80
    sget-object v5, La/lkz;->a:La/lkz;

    .line 81
    .line 82
    invoke-static {v2, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {p1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    or-int/2addr v2, v6

    .line 95
    const/4 v6, 0x3

    .line 96
    invoke-virtual {p1, v6}, La/fet;->e(I)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    or-int/2addr v2, v6

    .line 101
    invoke-virtual {p1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    or-int/2addr v2, v6

    .line 106
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    if-nez v2, :cond_3

    .line 111
    .line 112
    if-ne v6, v4, :cond_2

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    move-object v4, v0

    .line 116
    goto :goto_1

    .line 117
    :cond_3
    :goto_0
    new-instance v2, La/pc;

    .line 118
    .line 119
    const/4 v6, 0x0

    .line 120
    const/16 v7, 0x1c

    .line 121
    .line 122
    move-object v4, v0

    .line 123
    invoke-direct/range {v2 .. v7}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move-object v6, v2

    .line 130
    :goto_1
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 131
    .line 132
    invoke-static {p1, v4, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    new-instance v7, La/bw5;

    .line 136
    .line 137
    const/4 v0, 0x1

    .line 138
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    new-instance v2, La/g970;

    .line 143
    .line 144
    const/4 v3, 0x0

    .line 145
    invoke-direct {v2, v1, v3}, La/g970;-><init>(La/u970;B)V

    .line 146
    .line 147
    .line 148
    const v4, -0x132d15bd

    .line 149
    .line 150
    .line 151
    invoke-static {v4, v2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    new-instance v2, La/ngz;

    .line 156
    .line 157
    const/16 v4, 0x19

    .line 158
    .line 159
    invoke-direct {v2, v1, p0, v4}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 160
    .line 161
    .line 162
    const p0, 0x530c8b7b

    .line 163
    .line 164
    .line 165
    invoke-static {p0, v2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    new-instance p0, La/g970;

    .line 170
    .line 171
    invoke-direct {p0, v1, v0}, La/g970;-><init>(La/u970;B)V

    .line 172
    .line 173
    .line 174
    const v0, 0x4da28b01    # 3.4087734E8f

    .line 175
    .line 176
    .line 177
    invoke-static {v0, p0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    const/4 v12, 0x2

    .line 182
    invoke-direct/range {v7 .. v12}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 186
    .line 187
    .line 188
    return-object v7
.end method

.method public final P0()V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v1, Lkotlin/Pair;

    .line 4
    .line 5
    const-string v2, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_RESULT_DISMISS_KEY"

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, La/h970;->Q0(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final Q0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/h970;->l2:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, La/h970;->p2:[La/iiy;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget-object v2, v0, v1

    .line 9
    .line 10
    iget-object v3, p0, La/h970;->k2:La/phf0;

    .line 11
    .line 12
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, p0, La/h970;->l2:Z

    .line 25
    .line 26
    aget-object v0, v0, v1

    .line 27
    .line 28
    invoke-virtual {v3, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
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
    const-class v0, La/e970;

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
    instance-of v2, p1, La/e970;

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
    check-cast v1, La/e970;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p1, v1, La/e970;->a:La/ctf0;

    .line 59
    .line 60
    iget-object v0, v1, La/e970;->b:La/cad;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v1, La/ali;

    .line 66
    .line 67
    invoke-direct {v1, v0, p1}, La/ali;-><init>(La/cad;La/ctf0;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, v1, La/ali;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, La/n5d0;

    .line 73
    .line 74
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, La/umi;

    .line 79
    .line 80
    iput-object p1, p0, La/h970;->m2:La/umi;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 84
    .line 85
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/h970;->P0()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
