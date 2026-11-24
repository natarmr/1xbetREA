.class public final La/bun0;
.super La/qw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/qw5<",
        "La/cun0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/bun0;",
        "La/qw5;",
        "La/cun0;",
        "<init>",
        "()V",
        "a/s2m0",
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
.field public static final g2:La/s2m0;

.field public static final synthetic h2:[La/iiy;


# instance fields
.field public final b2:La/nae0;

.field public c2:La/wdk0;

.field public d2:La/tvi;

.field public e2:La/ynb;

.field public final f2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/bun0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/swipex/impl/databinding/SwipexChangeBetValueDialogBinding;"

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
    sput-object v1, La/bun0;->h2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/s2m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/bun0;->g2:La/s2m0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/qw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/ztn0;->a:La/ztn0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/bun0;->b2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/xtn0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/xtn0;-><init>(La/bun0;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/fyk0;

    .line 19
    .line 20
    const/16 v2, 0x1b

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance v0, La/fyk0;

    .line 26
    .line 27
    const/16 v2, 0x1c

    .line 28
    .line 29
    invoke-direct {v0, p0, v2}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/fyk0;

    .line 35
    .line 36
    const/16 v4, 0x1d

    .line 37
    .line 38
    invoke-direct {v3, v0, v4}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-class v2, La/pun0;

    .line 46
    .line 47
    sget-object v3, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, La/cdl0;

    .line 54
    .line 55
    const/16 v4, 0x16

    .line 56
    .line 57
    invoke-direct {v3, v0, v4}, La/cdl0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/cdl0;

    .line 61
    .line 62
    const/16 v5, 0x17

    .line 63
    .line 64
    invoke-direct {v4, v0, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/bun0;->f2:La/kiu0;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic J0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final N0()V
    .locals 21

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
    const-class v2, La/wtn0;

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
    instance-of v4, v1, La/wtn0;

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
    check-cast v3, La/wtn0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v5, v3, La/wtn0;->a:La/roi0;

    .line 65
    .line 66
    iget-object v13, v3, La/wtn0;->b:La/rqt;

    .line 67
    .line 68
    iget-object v14, v3, La/wtn0;->c:La/mne;

    .line 69
    .line 70
    iget-object v15, v3, La/wtn0;->d:La/eqx;

    .line 71
    .line 72
    iget-object v1, v3, La/wtn0;->e:La/v88;

    .line 73
    .line 74
    iget-object v2, v3, La/wtn0;->f:La/duj;

    .line 75
    .line 76
    iget-object v7, v3, La/wtn0;->g:La/wsf0;

    .line 77
    .line 78
    iget-object v4, v3, La/wtn0;->i:La/vby;

    .line 79
    .line 80
    iget-object v9, v3, La/wtn0;->j:La/s31;

    .line 81
    .line 82
    iget-object v10, v3, La/wtn0;->k:La/ih5;

    .line 83
    .line 84
    iget-object v11, v3, La/wtn0;->l:La/gg5;

    .line 85
    .line 86
    iget-object v8, v3, La/wtn0;->m:La/e41;

    .line 87
    .line 88
    iget-object v6, v3, La/wtn0;->h:La/peg0;

    .line 89
    .line 90
    move-object/from16 v16, v1

    .line 91
    .line 92
    iget-object v1, v3, La/wtn0;->n:La/wdk0;

    .line 93
    .line 94
    move-object/from16 v18, v1

    .line 95
    .line 96
    iget-object v1, v3, La/wtn0;->o:La/ctf0;

    .line 97
    .line 98
    iget-object v3, v3, La/wtn0;->p:La/cmt;

    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v4, La/v7i;

    .line 110
    .line 111
    move-object/from16 v19, v1

    .line 112
    .line 113
    move-object/from16 v17, v2

    .line 114
    .line 115
    move-object/from16 v20, v3

    .line 116
    .line 117
    invoke-direct/range {v4 .. v20}, La/v7i;-><init>(La/roi0;La/peg0;La/wsf0;La/e41;La/s31;La/ih5;La/gg5;La/i1w0;La/rqt;La/mne;La/eqx;La/v88;La/duj;La/wdk0;La/ctf0;La/cmt;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v1, v18

    .line 121
    .line 122
    iput-object v1, v0, La/bun0;->c2:La/wdk0;

    .line 123
    .line 124
    iget-object v1, v4, La/v7i;->o:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, La/n5d0;

    .line 127
    .line 128
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, La/tvi;

    .line 133
    .line 134
    iput-object v1, v0, La/bun0;->d2:La/tvi;

    .line 135
    .line 136
    iget-object v1, v6, La/peg0;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La/yzn0;

    .line 139
    .line 140
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iput-object v1, v0, La/bun0;->e2:La/ynb;

    .line 148
    .line 149
    return-void

    .line 150
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 151
    .line 152
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public final O0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b09

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final P0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f13040e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final Q0()La/cun0;
    .locals 2

    .line 1
    sget-object v0, La/bun0;->h2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/bun0;->b2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/cun0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final R0()La/pun0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bun0;->f2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pun0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/qw5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/b0l0;

    .line 9
    .line 10
    const/16 v1, 0xb

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "CHANGE_BALANCE_REQUEST_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/qw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 12
    .line 13
    new-instance p2, La/tjj;

    .line 14
    .line 15
    const/16 v0, 0xd

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {p2, v0, v1}, La/tjj;-><init>(II)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    new-array v2, v0, [Landroid/text/InputFilter;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aput-object p2, v2, v3

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setFilters([Landroid/text/InputFilter;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 35
    .line 36
    new-instance p2, La/da0;

    .line 37
    .line 38
    new-instance v2, La/ttn0;

    .line 39
    .line 40
    invoke-direct {v2, p0, v0}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, v2}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p1, p1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 54
    .line 55
    new-instance p2, La/xtn0;

    .line 56
    .line 57
    const/4 v2, 0x4

    .line 58
    invoke-direct {p2, p0, v2}, La/xtn0;-><init>(La/bun0;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEndStepperMinusClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p1, p1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 69
    .line 70
    new-instance p2, La/xtn0;

    .line 71
    .line 72
    const/4 v4, 0x5

    .line 73
    invoke-direct {p2, p0, v4}, La/xtn0;-><init>(La/bun0;B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEndStepperPlusClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p1, p1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 84
    .line 85
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_0

    .line 90
    .line 91
    new-instance p2, La/qd7;

    .line 92
    .line 93
    invoke-direct {p2, p0, v4}, La/qd7;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 97
    .line 98
    .line 99
    :cond_0
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object p1, p1, La/cun0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 104
    .line 105
    new-instance p2, La/ytn0;

    .line 106
    .line 107
    invoke-direct {p2, p0, v3}, La/ytn0;-><init>(La/bun0;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object p1, p1, La/cun0;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 118
    .line 119
    new-instance p2, La/ytn0;

    .line 120
    .line 121
    invoke-direct {p2, p0, v0}, La/ytn0;-><init>(La/bun0;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p1, p1, La/cun0;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 132
    .line 133
    new-instance p2, La/ytn0;

    .line 134
    .line 135
    invoke-direct {p2, p0, v1}, La/ytn0;-><init>(La/bun0;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p1, p1, La/cun0;->g:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 146
    .line 147
    new-instance p2, La/ytn0;

    .line 148
    .line 149
    const/4 v4, 0x3

    .line 150
    invoke-direct {p2, p0, v4}, La/ytn0;-><init>(La/bun0;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p1, p1, La/cun0;->c:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 161
    .line 162
    new-instance p2, La/xtn0;

    .line 163
    .line 164
    invoke-direct {p2, p0, v0}, La/xtn0;-><init>(La/bun0;B)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1, p2, v4}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->v(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget-object p1, p1, La/cun0;->c:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 175
    .line 176
    new-instance p2, La/xtn0;

    .line 177
    .line 178
    invoke-direct {p2, p0, v1}, La/xtn0;-><init>(La/bun0;B)V

    .line 179
    .line 180
    .line 181
    sget-object v5, La/ivb0;->b:La/ymx;

    .line 182
    .line 183
    invoke-virtual {p1, v5, p2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->A(La/ymx;Lkotlin/jvm/functions/Function0;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p1, p1, La/cun0;->c:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 191
    .line 192
    new-instance p2, La/xtn0;

    .line 193
    .line 194
    invoke-direct {p2, p0, v4}, La/xtn0;-><init>(La/bun0;B)V

    .line 195
    .line 196
    .line 197
    invoke-static {p1, p2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->z(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, La/bun0;->Q0()La/cun0;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iget-object p1, p1, La/cun0;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 205
    .line 206
    new-instance p2, La/ytn0;

    .line 207
    .line 208
    invoke-direct {p2, p0, v2}, La/ytn0;-><init>(La/bun0;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, La/bun0;->R0()La/pun0;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iget-object p1, p1, La/pun0;->x:La/p7m0;

    .line 219
    .line 220
    new-instance p2, La/aun0;

    .line 221
    .line 222
    const/4 v9, 0x0

    .line 223
    invoke-direct {p2, p0, v9, v3}, La/aun0;-><init>(La/bun0;La/yje;B)V

    .line 224
    .line 225
    .line 226
    sget-object v2, La/lkz;->a:La/lkz;

    .line 227
    .line 228
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    new-instance v6, La/agn0;

    .line 241
    .line 242
    invoke-direct {v6, p1, v2, p2, v9}, La/agn0;-><init>(La/gmq;La/clz;La/aun0;La/yje;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v5, v9, v9, v6, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, La/bun0;->R0()La/pun0;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object p2, p1, La/pun0;->v:La/xae0;

    .line 253
    .line 254
    new-instance v2, La/oun0;

    .line 255
    .line 256
    invoke-direct {v2, p1, v9, v3}, La/oun0;-><init>(La/pun0;La/yje;B)V

    .line 257
    .line 258
    .line 259
    new-instance p1, La/s6n0;

    .line 260
    .line 261
    invoke-direct {p1, p2, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 262
    .line 263
    .line 264
    new-instance p2, La/aun0;

    .line 265
    .line 266
    invoke-direct {p2, p0, v9, v1}, La/aun0;-><init>(La/bun0;La/yje;B)V

    .line 267
    .line 268
    .line 269
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    new-instance v3, La/agn0;

    .line 282
    .line 283
    invoke-direct {v3, p1, v1, p2, v9}, La/agn0;-><init>(La/s6n0;La/clz;La/aun0;La/yje;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v2, v9, v9, v3, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0}, La/bun0;->R0()La/pun0;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    iget-object v6, p1, La/pun0;->w:La/ol60;

    .line 294
    .line 295
    new-instance v8, La/aun0;

    .line 296
    .line 297
    invoke-direct {v8, p0, v9, v0}, La/aun0;-><init>(La/bun0;La/yje;B)V

    .line 298
    .line 299
    .line 300
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    new-instance v5, La/agn0;

    .line 313
    .line 314
    const/4 v10, 0x0

    .line 315
    invoke-direct/range {v5 .. v10}, La/agn0;-><init>(La/gmq;La/clz;La/aun0;La/yje;B)V

    .line 316
    .line 317
    .line 318
    invoke-static {p0, v9, v9, v5, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 319
    .line 320
    .line 321
    return-void
.end method
