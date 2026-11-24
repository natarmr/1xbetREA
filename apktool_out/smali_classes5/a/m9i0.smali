.class public final La/m9i0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m9i0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/eke0",
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
.field public static final S1:La/eke0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/g9i0;

.field public L1:Z

.field public M1:La/iti;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;

.field public final R1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/m9i0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsSelfBinding;"

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
    sput-object v1, La/m9i0;->U1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/eke0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/m9i0;->S1:La/eke0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0257

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/g9i0;->c:La/g9i0;

    .line 8
    .line 9
    iput-object v0, p0, La/m9i0;->K1:La/g9i0;

    .line 10
    .line 11
    new-instance v0, La/h9i0;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, v1}, La/h9i0;-><init>(La/m9i0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/yxf0;

    .line 18
    .line 19
    const/16 v2, 0x1d

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v4, La/l9i0;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v4, v1, v5}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v3, La/jai0;

    .line 37
    .line 38
    sget-object v4, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, La/fxf0;

    .line 45
    .line 46
    const/16 v5, 0x1c

    .line 47
    .line 48
    invoke-direct {v4, v1, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/fxf0;

    .line 52
    .line 53
    invoke-direct {v5, v1, v2}, La/fxf0;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/m9i0;->P1:La/kiu0;

    .line 61
    .line 62
    sget-object v0, La/j9i0;->a:La/j9i0;

    .line 63
    .line 64
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/m9i0;->Q1:La/s0r;

    .line 69
    .line 70
    new-instance v0, La/h9i0;

    .line 71
    .line 72
    const/4 v1, 0x2

    .line 73
    invoke-direct {v0, p0, v1}, La/h9i0;-><init>(La/m9i0;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, La/m9i0;->R1:La/n0o0;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/m9i0;->G0()La/b1r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/b1r;->g:La/cxx;

    .line 6
    .line 7
    iget-object v0, v0, La/cxx;->a:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, La/b1r;->e:La/cxx;

    .line 18
    .line 19
    iget-object v0, v0, La/cxx;->a:Landroid/widget/FrameLayout;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p1, La/b1r;->c:La/cxx;

    .line 28
    .line 29
    iget-object v0, v0, La/cxx;->c:Landroid/widget/TextView;

    .line 30
    .line 31
    const v1, 0x7f130aed

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/b1r;->j:La/cxx;

    .line 42
    .line 43
    iget-object v0, v0, La/cxx;->c:Landroid/widget/TextView;

    .line 44
    .line 45
    const v1, 0x7f130af0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p1, La/b1r;->d:La/cxx;

    .line 56
    .line 57
    iget-object v0, v0, La/cxx;->c:Landroid/widget/TextView;

    .line 58
    .line 59
    const v1, 0x7f130aef

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p1, La/b1r;->h:La/cxx;

    .line 70
    .line 71
    iget-object v0, v0, La/cxx;->c:Landroid/widget/TextView;

    .line 72
    .line 73
    const v1, 0x7f130af1

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p1, La/b1r;->b:Landroid/widget/Button;

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 87
    .line 88
    .line 89
    new-instance v1, La/gwg0;

    .line 90
    .line 91
    const/16 v2, 0x1b

    .line 92
    .line 93
    invoke-direct {v1, p0, v2}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, La/m9i0;->R1:La/n0o0;

    .line 100
    .line 101
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const/4 v1, 0x0

    .line 112
    move v2, v1

    .line 113
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_1

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    add-int/lit8 v4, v2, 0x1

    .line 124
    .line 125
    if-ltz v2, :cond_0

    .line 126
    .line 127
    check-cast v3, La/cxx;

    .line 128
    .line 129
    iget-object v5, v3, La/cxx;->a:Landroid/widget/FrameLayout;

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v6, La/i9i0;

    .line 135
    .line 136
    invoke-direct {v6, p0, v2, v1}, La/i9i0;-><init>(La/m9i0;IB)V

    .line 137
    .line 138
    .line 139
    invoke-static {v5, v6}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 140
    .line 141
    .line 142
    iget-object v3, v3, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 143
    .line 144
    new-instance v5, La/i9i0;

    .line 145
    .line 146
    invoke-direct {v5, p0, v2, v0}, La/i9i0;-><init>(La/m9i0;IB)V

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 150
    .line 151
    .line 152
    move v2, v4

    .line 153
    goto :goto_0

    .line 154
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 155
    .line 156
    .line 157
    const/4 p0, 0x0

    .line 158
    throw p0

    .line 159
    :cond_1
    invoke-virtual {p0}, La/m9i0;->G0()La/b1r;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object p1, p1, La/b1r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 164
    .line 165
    new-instance v0, La/jpe0;

    .line 166
    .line 167
    const/4 v2, 0x6

    .line 168
    invoke-direct {v0, p0, v2}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    new-instance p1, La/h9i0;

    .line 175
    .line 176
    invoke-direct {p1, p0, v1}, La/h9i0;-><init>(La/m9i0;B)V

    .line 177
    .line 178
    .line 179
    const-string v0, "SET_LIMIT_REQUEST_KEY"

    .line 180
    .line 181
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public final C0()V
    .locals 17

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
    const-class v2, La/n9i0;

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
    instance-of v4, v1, La/n9i0;

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
    check-cast v3, La/n9i0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v6, v3, La/n9i0;->a:La/xio;

    .line 65
    .line 66
    iget-object v7, v3, La/n9i0;->b:La/czz;

    .line 67
    .line 68
    iget-object v9, v3, La/n9i0;->c:La/duj;

    .line 69
    .line 70
    iget-object v10, v3, La/n9i0;->d:La/vd1;

    .line 71
    .line 72
    iget-object v11, v3, La/n9i0;->e:La/btt0;

    .line 73
    .line 74
    iget-object v5, v3, La/n9i0;->f:La/ii;

    .line 75
    .line 76
    iget-object v12, v3, La/n9i0;->g:La/dzz;

    .line 77
    .line 78
    iget-object v13, v3, La/n9i0;->h:La/gii0;

    .line 79
    .line 80
    iget-object v14, v3, La/n9i0;->i:La/knf0;

    .line 81
    .line 82
    iget-object v15, v3, La/n9i0;->j:La/wdk0;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v4, La/jti;

    .line 109
    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    invoke-direct/range {v4 .. v16}, La/jti;-><init>(La/ii;La/xio;La/czz;La/i1w0;La/duj;La/vd1;La/btt0;La/dzz;La/gii0;La/knf0;La/wdk0;B)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v4, La/jti;->j:La/n5d0;

    .line 116
    .line 117
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, La/iti;

    .line 122
    .line 123
    iput-object v1, v0, La/m9i0;->M1:La/iti;

    .line 124
    .line 125
    iput-object v5, v0, La/m9i0;->N1:La/ii;

    .line 126
    .line 127
    iput-object v15, v0, La/m9i0;->O1:La/wdk0;

    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 131
    .line 132
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/m9i0;->H0()La/jai0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/jai0;->i:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/k9i0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, p0, v3, v2}, La/k9i0;-><init>(La/m9i0;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, La/r7i0;

    .line 33
    .line 34
    invoke-direct {v5, v0, v2, v1, v3}, La/r7i0;-><init>(La/xae0;La/clz;La/k9i0;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/m9i0;->H0()La/jai0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/jai0;->h:La/p7m0;

    .line 46
    .line 47
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, La/yng0;

    .line 52
    .line 53
    const/16 v4, 0x9

    .line 54
    .line 55
    invoke-direct {v2, p0, v3, v4}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-instance v6, La/r7i0;

    .line 71
    .line 72
    invoke-direct {v6, v1, v4, v2, v3}, La/r7i0;-><init>(La/xae0;La/clz;La/yng0;La/yje;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v5, v3, v3, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/m9i0;->H0()La/jai0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v1, v1, La/jai0;->j:La/ol60;

    .line 83
    .line 84
    new-instance v2, La/k9i0;

    .line 85
    .line 86
    const/4 v4, 0x1

    .line 87
    invoke-direct {v2, p0, v3, v4}, La/k9i0;-><init>(La/m9i0;La/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    new-instance v5, La/r7i0;

    .line 103
    .line 104
    invoke-direct {v5, v1, p0, v2, v3}, La/r7i0;-><init>(La/gmq;La/clz;La/k9i0;La/yje;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final G0()La/b1r;
    .locals 2

    .line 1
    sget-object v0, La/m9i0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/m9i0;->Q1:La/s0r;

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
    check-cast p0, La/b1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/jai0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m9i0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jai0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Landroid/widget/RadioButton;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/m9i0;->G0()La/b1r;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/m9i0;->R1:La/n0o0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/cxx;

    .line 27
    .line 28
    iget-object v0, v0, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
