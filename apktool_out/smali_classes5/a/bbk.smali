.class public final La/bbk;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/bbk;",
        "La/yx5;",
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
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public K1:La/jfi;

.field public L1:La/ii;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/bbk;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentConfirmDepositLimitLockScreenBinding;"

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
    sput-object v1, La/bbk;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d021d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/vak;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/vak;-><init>(La/bbk;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/v9k;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-direct {v1, p0, v2}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v3, La/v9k;

    .line 22
    .line 23
    const/4 v4, 0x3

    .line 24
    invoke-direct {v3, v1, v4}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v2, La/jbk;

    .line 32
    .line 33
    sget-object v3, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, La/b9k;

    .line 40
    .line 41
    const/4 v4, 0x4

    .line 42
    invoke-direct {v3, v1, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/b9k;

    .line 46
    .line 47
    const/4 v5, 0x5

    .line 48
    invoke-direct {v4, v1, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/bbk;->M1:La/kiu0;

    .line 56
    .line 57
    sget-object v0, La/yak;->a:La/yak;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/bbk;->N1:La/s0r;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/bbk;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/bbk;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/gzq;

    .line 16
    .line 17
    iget-object v1, p1, La/gzq;->d:Landroid/widget/ImageView;

    .line 18
    .line 19
    new-instance v2, La/wak;

    .line 20
    .line 21
    invoke-direct {v2, p0, v0}, La/wak;-><init>(La/bbk;B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p1, La/gzq;->c:Lcom/google/android/material/button/MaterialButton;

    .line 28
    .line 29
    new-instance v1, La/wak;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, p0, v2}, La/wak;-><init>(La/bbk;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p1, La/gzq;->b:Lcom/google/android/material/button/MaterialButton;

    .line 39
    .line 40
    new-instance v0, La/wak;

    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    invoke-direct {v0, p0, v1}, La/wak;-><init>(La/bbk;B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, La/vak;

    .line 50
    .line 51
    invoke-direct {p1, p0, v2}, La/vak;-><init>(La/bbk;B)V

    .line 52
    .line 53
    .line 54
    const-string v0, "ERROR_DIALOG_REQUEST_KEY"

    .line 55
    .line 56
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final C0()V
    .locals 10

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
    const-class v1, La/dbk;

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
    instance-of v3, v0, La/dbk;

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
    check-cast v2, La/dbk;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/dbk;->a:La/xio;

    .line 56
    .line 57
    iget-object v1, v2, La/dbk;->b:La/czz;

    .line 58
    .line 59
    iget-object v3, v2, La/dbk;->c:La/ctf0;

    .line 60
    .line 61
    iget-object v4, v2, La/dbk;->d:La/duj;

    .line 62
    .line 63
    iget-object v5, v2, La/dbk;->e:La/btt0;

    .line 64
    .line 65
    iget-object v6, v2, La/dbk;->g:La/gii0;

    .line 66
    .line 67
    iget-object v7, v2, La/dbk;->f:La/ii;

    .line 68
    .line 69
    iget-object v8, v2, La/dbk;->h:La/dzz;

    .line 70
    .line 71
    iget-object v2, v2, La/dbk;->i:La/knf0;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v9, La/g45;

    .line 98
    .line 99
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v3, v9, La/g45;->a:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v6, v9, La/g45;->b:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v8, v9, La/g45;->c:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v0, v9, La/g45;->d:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v1, v9, La/g45;->e:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v5, v9, La/g45;->f:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v2, v9, La/g45;->g:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v4, v9, La/g45;->h:Ljava/lang/Object;

    .line 117
    .line 118
    new-instance v0, La/yei;

    .line 119
    .line 120
    const/16 v1, 0xb

    .line 121
    .line 122
    invoke-direct {v0, v9, v1}, La/yei;-><init>(Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, v9, La/g45;->i:Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v0, v9, La/g45;->i:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, La/n5d0;

    .line 134
    .line 135
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, La/jfi;

    .line 140
    .line 141
    iput-object v0, p0, La/bbk;->K1:La/jfi;

    .line 142
    .line 143
    iput-object v7, p0, La/bbk;->L1:La/ii;

    .line 144
    .line 145
    return-void

    .line 146
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 147
    .line 148
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/bbk;->G0()La/jbk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/jbk;->g:La/ol60;

    .line 6
    .line 7
    new-instance v4, La/e9g;

    .line 8
    .line 9
    const/16 v0, 0x19

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct {v4, p0, v5, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    sget-object v0, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, La/xsj;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, La/xsj;-><init>(La/gmq;La/clz;La/e9g;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/bbk;->G0()La/jbk;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v0, v0, La/jbk;->f:La/p7m0;

    .line 44
    .line 45
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v8, La/hij;

    .line 50
    .line 51
    invoke-direct {v8, p0, v5, v2}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    move-object v9, v5

    .line 67
    new-instance v5, La/xsj;

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    invoke-direct/range {v5 .. v10}, La/xsj;-><init>(La/xae0;La/clz;La/hij;La/yje;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final G0()La/jbk;
    .locals 0

    .line 1
    iget-object p0, p0, La/bbk;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jbk;

    .line 8
    .line 9
    return-object p0
.end method
