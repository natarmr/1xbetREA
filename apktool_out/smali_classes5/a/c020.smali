.class public final La/c020;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/c020;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wsz",
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
.field public static final U1:La/wsz;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/n0o0;

.field public final M1:La/n0o0;

.field public N1:La/fiu0;

.field public O1:La/poq0;

.field public P1:La/wdk0;

.field public Q1:La/ii;

.field public final R1:La/kiu0;

.field public final S1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/c020;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/settings/impl/databinding/FragmentOfficeNewFaceliftBinding;"

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
    sput-object v1, La/c020;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/wsz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/c020;->U1:La/wsz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d026d

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
    iput-object v0, p0, La/c020;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/a020;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, v1}, La/a020;-><init>(La/c020;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/c020;->L1:La/n0o0;

    .line 22
    .line 23
    new-instance v0, La/a020;

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    invoke-direct {v0, p0, v1}, La/a020;-><init>(La/c020;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/c020;->M1:La/n0o0;

    .line 34
    .line 35
    new-instance v0, La/a020;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, p0, v1}, La/a020;-><init>(La/c020;B)V

    .line 39
    .line 40
    .line 41
    new-instance v1, La/pv10;

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    invoke-direct {v1, p0, v2}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    sget-object v2, La/wez;->b:La/wez;

    .line 48
    .line 49
    new-instance v3, La/pv10;

    .line 50
    .line 51
    const/4 v4, 0x5

    .line 52
    invoke-direct {v3, v1, v4}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-class v2, La/l020;

    .line 60
    .line 61
    sget-object v3, La/sre0;->a:La/tre0;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v3, La/j210;

    .line 68
    .line 69
    const/16 v4, 0x18

    .line 70
    .line 71
    invoke-direct {v3, v1, v4}, La/j210;-><init>(La/a8z;B)V

    .line 72
    .line 73
    .line 74
    new-instance v4, La/j210;

    .line 75
    .line 76
    const/16 v5, 0x19

    .line 77
    .line 78
    invoke-direct {v4, v1, v5}, La/j210;-><init>(La/a8z;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/c020;->R1:La/kiu0;

    .line 86
    .line 87
    sget-object v0, La/b020;->a:La/b020;

    .line 88
    .line 89
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, La/c020;->S1:La/s0r;

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/c020;->I0()La/l020;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p1, La/l020;->h:La/mne;

    .line 10
    .line 11
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 12
    .line 13
    new-instance v1, La/h020;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    invoke-direct {v1, p1, v6}, La/h020;-><init>(La/l020;B)V

    .line 17
    .line 18
    .line 19
    new-instance v4, La/i020;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-direct {v4, p1, v7, v6}, La/i020;-><init>(La/l020;La/yje;B)V

    .line 23
    .line 24
    .line 25
    const/16 v5, 0xa

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0}, La/c020;->H0()La/g2r;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, La/g2r;->c:Landroidx/fragment/app/FragmentContainerView;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    const-string v0, "SETTINGS_EVENT_KEY"

    .line 56
    .line 57
    invoke-virtual {p1, v0, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget-object p1, La/d6j0;->a:La/d6j0;

    .line 63
    .line 64
    move p1, v6

    .line 65
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v1, La/zb5;

    .line 73
    .line 74
    invoke-direct {v1, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x1

    .line 78
    iput-boolean v0, v1, La/zb5;->p:Z

    .line 79
    .line 80
    invoke-virtual {p0}, La/c020;->H0()La/g2r;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-object v2, v2, La/g2r;->c:Landroidx/fragment/app/FragmentContainerView;

    .line 85
    .line 86
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    sget-object v3, La/t1j0;->Y1:La/zie0;

    .line 91
    .line 92
    sget-object v4, La/d6j0;->g:La/c0o;

    .line 93
    .line 94
    invoke-virtual {v4, p1}, La/c0o;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, La/d6j0;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v3, La/t1j0;

    .line 107
    .line 108
    invoke-direct {v3}, La/t1j0;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance v4, Lkotlin/Pair;

    .line 120
    .line 121
    const-string v5, "KEY_SETTINGS_EVENT"

    .line 122
    .line 123
    invoke-direct {v4, v5, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2, v3, v7, v0}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, La/zb5;->f()V

    .line 141
    .line 142
    .line 143
    :cond_1
    invoke-virtual {p0}, La/c020;->H0()La/g2r;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p1, p1, La/g2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 148
    .line 149
    new-instance v0, La/a020;

    .line 150
    .line 151
    invoke-direct {v0, p0, v6}, La/a020;-><init>(La/c020;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, La/a020;

    .line 158
    .line 159
    const/4 v0, 0x4

    .line 160
    invoke-direct {p1, p0, v0}, La/a020;-><init>(La/c020;B)V

    .line 161
    .line 162
    .line 163
    const-string v0, "REQUEST_APP_INFO_DIALOG_KEY"

    .line 164
    .line 165
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final C0()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/sz10;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/sz10;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/sz10;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v5, v3, La/sz10;->d:La/cad;

    .line 65
    .line 66
    iget-object v7, v3, La/sz10;->a:La/poq0;

    .line 67
    .line 68
    iget-object v1, v3, La/sz10;->b:La/m1e;

    .line 69
    .line 70
    iget-object v8, v3, La/sz10;->c:La/jh70;

    .line 71
    .line 72
    iget-object v9, v3, La/sz10;->e:La/duj;

    .line 73
    .line 74
    iget-object v10, v3, La/sz10;->f:La/gst0;

    .line 75
    .line 76
    iget-object v2, v3, La/sz10;->g:La/btt0;

    .line 77
    .line 78
    iget-object v11, v3, La/sz10;->h:La/pru;

    .line 79
    .line 80
    iget-object v12, v3, La/sz10;->i:La/q7d0;

    .line 81
    .line 82
    iget-object v14, v3, La/sz10;->j:La/e1u;

    .line 83
    .line 84
    iget-object v15, v3, La/sz10;->k:La/wdk0;

    .line 85
    .line 86
    iget-object v4, v3, La/sz10;->l:La/v1j0;

    .line 87
    .line 88
    iget-object v6, v3, La/sz10;->m:La/qho;

    .line 89
    .line 90
    move-object/from16 v17, v6

    .line 91
    .line 92
    iget-object v6, v3, La/sz10;->n:La/d1p;

    .line 93
    .line 94
    move-object/from16 v16, v1

    .line 95
    .line 96
    iget-object v1, v3, La/sz10;->o:La/kt2;

    .line 97
    .line 98
    move-object/from16 v18, v1

    .line 99
    .line 100
    iget-object v1, v3, La/sz10;->p:La/s31;

    .line 101
    .line 102
    move-object/from16 v19, v1

    .line 103
    .line 104
    iget-object v1, v3, La/sz10;->q:La/ieu;

    .line 105
    .line 106
    move-object/from16 v20, v1

    .line 107
    .line 108
    iget-object v1, v3, La/sz10;->r:La/dzt;

    .line 109
    .line 110
    move-object/from16 v21, v1

    .line 111
    .line 112
    iget-object v1, v3, La/sz10;->s:La/ctf0;

    .line 113
    .line 114
    move-object/from16 v22, v1

    .line 115
    .line 116
    iget-object v1, v3, La/sz10;->t:La/ii;

    .line 117
    .line 118
    iget-object v3, v3, La/sz10;->u:La/peg0;

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-object/from16 v16, v4

    .line 151
    .line 152
    new-instance v4, La/f6i;

    .line 153
    .line 154
    move-object/from16 v23, v1

    .line 155
    .line 156
    move-object/from16 v24, v3

    .line 157
    .line 158
    invoke-direct/range {v4 .. v24}, La/f6i;-><init>(La/cad;La/d1p;La/poq0;La/jh70;La/duj;La/gst0;La/pru;La/q7d0;La/i1w0;La/e1u;La/wdk0;La/v1j0;La/qho;La/kt2;La/s31;La/ieu;La/dzt;La/ctf0;La/ii;La/peg0;)V

    .line 159
    .line 160
    .line 161
    new-instance v2, La/fiu0;

    .line 162
    .line 163
    iget-object v3, v4, La/f6i;->u:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v3, La/gji;

    .line 166
    .line 167
    const-class v4, La/l020;

    .line 168
    .line 169
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 174
    .line 175
    .line 176
    iput-object v2, v0, La/c020;->N1:La/fiu0;

    .line 177
    .line 178
    iput-object v7, v0, La/c020;->O1:La/poq0;

    .line 179
    .line 180
    iput-object v15, v0, La/c020;->P1:La/wdk0;

    .line 181
    .line 182
    iput-object v1, v0, La/c020;->Q1:La/ii;

    .line 183
    .line 184
    return-void

    .line 185
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 186
    .line 187
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/c020;->I0()La/l020;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/l020;->s:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/a1t;

    .line 8
    .line 9
    const/16 v2, 0x19

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, La/a1t;-><init>(La/gmq;B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/dm10;

    .line 15
    .line 16
    const/4 v9, 0x4

    .line 17
    const/16 v10, 0x17

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const-class v6, La/c020;

    .line 21
    .line 22
    const-string v7, "handleUiState"

    .line 23
    .line 24
    const-string v8, "handleUiState(Lorg/xplatform/settings/impl/presentation/models/MainSettingsUiState;)V"

    .line 25
    .line 26
    move-object/from16 v5, p0

    .line 27
    .line 28
    invoke-direct/range {v3 .. v10}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    sget-object v0, La/lkz;->a:La/lkz;

    .line 32
    .line 33
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v4, La/cm10;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-direct {v4, v1, v0, v3, v5}, La/cm10;-><init>(La/a1t;La/clz;La/dm10;La/yje;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    invoke-static {v2, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {p0 .. p0}, La/c020;->I0()La/l020;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v8, v1, La/l020;->t:La/p7m0;

    .line 60
    .line 61
    new-instance v10, La/dm10;

    .line 62
    .line 63
    const/16 v17, 0x4

    .line 64
    .line 65
    const/16 v18, 0x18

    .line 66
    .line 67
    const/4 v12, 0x2

    .line 68
    const-string v15, "handleEvent"

    .line 69
    .line 70
    const-string v16, "handleEvent(Lorg/xplatform/settings/impl/presentation/models/MainSettingsEvent;)V"

    .line 71
    .line 72
    move-object/from16 v13, p0

    .line 73
    .line 74
    move-object v14, v6

    .line 75
    move-object v11, v10

    .line 76
    invoke-direct/range {v11 .. v18}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 77
    .line 78
    .line 79
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v7, La/cm10;

    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    move-object v11, v5

    .line 95
    invoke-direct/range {v7 .. v12}, La/cm10;-><init>(La/gmq;La/clz;La/dm10;La/yje;S)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v11, v11, v7, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final G0(Ljava/lang/Integer;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, La/c020;->H0()La/g2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/bcg0;->b()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/c020;->M1:La/n0o0;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/hc50;

    .line 21
    .line 22
    iget-object v1, p0, La/c020;->L1:La/n0o0;

    .line 23
    .line 24
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/hc50;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    iget-object v3, v1, La/hc50;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, v1, La/hc50;->b:La/ybg0;

    .line 37
    .line 38
    iget-object v6, v1, La/hc50;->d:Lkotlin/jvm/functions/Function0;

    .line 39
    .line 40
    iget-boolean v7, v1, La/hc50;->e:Z

    .line 41
    .line 42
    iget-boolean v8, v1, La/hc50;->f:Z

    .line 43
    .line 44
    iget-object v9, v1, La/hc50;->g:La/vf5;

    .line 45
    .line 46
    iget-object v10, v1, La/hc50;->h:Ljava/lang/Integer;

    .line 47
    .line 48
    iget-object v11, v1, La/hc50;->i:La/r0m;

    .line 49
    .line 50
    iget-object v12, v1, La/hc50;->j:La/i8m0;

    .line 51
    .line 52
    iget-boolean v13, v1, La/hc50;->k:Z

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v2, La/hc50;

    .line 64
    .line 65
    invoke-direct/range {v2 .. v13}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;ZZLa/vf5;Ljava/lang/Integer;La/r0m;La/i8m0;Z)V

    .line 66
    .line 67
    .line 68
    filled-new-array {v0, v2}, [La/hc50;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, La/hc50;

    .line 82
    .line 83
    filled-new-array {p1}, [La/hc50;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :goto_0
    invoke-virtual {p0}, La/c020;->H0()La/g2r;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v0, v0, La/g2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/c020;->H0()La/g2r;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p1, p1, La/g2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const v0, 0x7f040b0b

    .line 111
    .line 112
    .line 113
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final H0()La/g2r;
    .locals 2

    .line 1
    sget-object v0, La/c020;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/c020;->S1:La/s0r;

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
    check-cast p0, La/g2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/l020;
    .locals 0

    .line 1
    iget-object p0, p0, La/c020;->R1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/l020;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e0()V
    .locals 9

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/c020;->I0()La/l020;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/l020;->t:La/p7m0;

    .line 9
    .line 10
    iget-object v1, p0, La/l020;->c:La/poq0;

    .line 11
    .line 12
    iget-object v1, v1, La/poq0;->a:La/jxi;

    .line 13
    .line 14
    invoke-virtual {v1}, La/jxi;->d()La/r8i;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, La/fk60;->d:La/fk60;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, La/r8i;->r(La/fk60;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object p0, La/xz10;->a:La/xz10;

    .line 31
    .line 32
    invoke-virtual {v0, v2, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v1, p0, La/l020;->f:La/phf0;

    .line 37
    .line 38
    iget-object v3, v1, La/phf0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, La/e1u;

    .line 41
    .line 42
    iget-object v3, v3, La/e1u;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, La/rrc;

    .line 45
    .line 46
    invoke-virtual {v3}, La/rrc;->H()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/16 v4, 0x1b

    .line 51
    .line 52
    if-gt v3, v4, :cond_2

    .line 53
    .line 54
    iget-object v3, v1, La/phf0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, La/peg0;

    .line 57
    .line 58
    iget-object v3, v3, La/peg0;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, La/y6j0;

    .line 61
    .line 62
    iget-object v3, v3, La/y6j0;->a:La/q7d0;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "SETTINGS_UPDATE_OS_SNACK_DATE"

    .line 72
    .line 73
    const-wide/16 v5, 0x0

    .line 74
    .line 75
    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    cmp-long v3, v7, v5

    .line 80
    .line 81
    if-nez v3, :cond_1

    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    cmp-long v3, v7, v5

    .line 92
    .line 93
    if-gtz v3, :cond_2

    .line 94
    .line 95
    iget-object v1, v1, La/phf0;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, La/pru;

    .line 98
    .line 99
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-boolean v1, v1, La/sff0;->q0:Z

    .line 104
    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    sget-object v1, La/yz10;->a:La/yz10;

    .line 111
    .line 112
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, La/l020;->e:La/dpi0;

    .line 116
    .line 117
    iget-object p0, p0, La/dpi0;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, La/y6j0;

    .line 120
    .line 121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 122
    .line 123
    .line 124
    move-result-wide v0

    .line 125
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 130
    .line 131
    .line 132
    const/4 v0, 0x6

    .line 133
    const/4 v1, 0x1

    .line 134
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 138
    .line 139
    .line 140
    move-result-wide v0

    .line 141
    iget-object p0, p0, La/y6j0;->a:La/q7d0;

    .line 142
    .line 143
    invoke-virtual {p0, v4, v0, v1}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 144
    .line 145
    .line 146
    :cond_2
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/c020;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
