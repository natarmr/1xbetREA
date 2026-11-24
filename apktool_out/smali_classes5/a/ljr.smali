.class public final La/ljr;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/ljr;",
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/khi;

.field public L1:La/ii;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ljr;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentGamblingExamBinding;"

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
    sput-object v1, La/ljr;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d023a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/hjr;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/hjr;-><init>(La/ljr;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/jfl;

    .line 14
    .line 15
    const/16 v2, 0x15

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/jfl;

    .line 23
    .line 24
    const/16 v4, 0x16

    .line 25
    .line 26
    invoke-direct {v3, v1, v4}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v2, La/vkr;

    .line 34
    .line 35
    sget-object v3, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, La/r6p;

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/r6p;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/r6p;

    .line 49
    .line 50
    const/16 v5, 0x9

    .line 51
    .line 52
    invoke-direct {v4, v1, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/ljr;->N1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/ijr;->a:La/ijr;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/ljr;->O1:La/s0r;

    .line 68
    .line 69
    new-instance v0, La/hjr;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-direct {v0, p0, v1}, La/hjr;-><init>(La/ljr;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/ljr;->P1:La/n0o0;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ljr;->G0()La/a0r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/a0r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v0, p0, La/ljr;->P1:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/cjr;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/ljr;->G0()La/a0r;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/a0r;->b:Landroid/widget/Button;

    .line 23
    .line 24
    new-instance v0, La/g7p;

    .line 25
    .line 26
    const/16 v1, 0xd

    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/ljr;->G0()La/a0r;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p1, p1, La/a0r;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 39
    .line 40
    new-instance v0, La/q10;

    .line 41
    .line 42
    const/16 v1, 0x16

    .line 43
    .line 44
    invoke-direct {v0, p0, v1}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, La/hjr;

    .line 51
    .line 52
    const/4 v0, 0x2

    .line 53
    invoke-direct {p1, p0, v0}, La/hjr;-><init>(La/ljr;B)V

    .line 54
    .line 55
    .line 56
    const-string v0, "EVENT_DIALOG_REQUEST_KEY"

    .line 57
    .line 58
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final C0()V
    .locals 8

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
    const-class v1, La/mjr;

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
    instance-of v3, v0, La/mjr;

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
    check-cast v2, La/mjr;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, v2, La/mjr;->a:La/xio;

    .line 63
    .line 64
    iget-object v1, v2, La/mjr;->b:La/czz;

    .line 65
    .line 66
    iget-object v3, v2, La/mjr;->c:La/btt0;

    .line 67
    .line 68
    iget-object v4, v2, La/mjr;->d:La/gii0;

    .line 69
    .line 70
    iget-object v5, v2, La/mjr;->f:La/ii;

    .line 71
    .line 72
    iget-object v6, v2, La/mjr;->e:La/duj;

    .line 73
    .line 74
    iget-object v7, v2, La/mjr;->g:La/knf0;

    .line 75
    .line 76
    iget-object v2, v2, La/mjr;->h:La/wdk0;

    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v1, La/esg0;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v4, v1, La/esg0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v0, v1, La/esg0;->b:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v3, v1, La/esg0;->c:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v7, v1, La/esg0;->d:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v6, v1, La/esg0;->e:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance v0, La/ugi;

    .line 115
    .line 116
    const/16 v3, 0xb

    .line 117
    .line 118
    invoke-direct {v0, v1, v3}, La/ugi;-><init>(Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, v1, La/esg0;->f:Ljava/lang/Object;

    .line 126
    .line 127
    iget-object v0, v1, La/esg0;->f:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, La/n5d0;

    .line 130
    .line 131
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, La/khi;

    .line 136
    .line 137
    iput-object v0, p0, La/ljr;->K1:La/khi;

    .line 138
    .line 139
    iput-object v5, p0, La/ljr;->L1:La/ii;

    .line 140
    .line 141
    iput-object v2, p0, La/ljr;->M1:La/wdk0;

    .line 142
    .line 143
    return-void

    .line 144
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 145
    .line 146
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/ljr;->H0()La/vkr;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vkr;->g:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/jjr;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v6, v2}, La/jjr;-><init>(La/ljr;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v3, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v3}, La/clz;->x()La/glz;

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
    new-instance v5, La/g6q;

    .line 33
    .line 34
    invoke-direct {v5, v0, v3, v1, v6}, La/g6q;-><init>(La/xae0;La/clz;La/jjr;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    invoke-static {v4, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/ljr;->H0()La/vkr;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/vkr;->h:La/p7m0;

    .line 46
    .line 47
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v3, La/kjr;

    .line 52
    .line 53
    invoke-direct {v3, p0, v6, v2}, La/kjr;-><init>(La/ljr;La/yje;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    new-instance v5, La/g6q;

    .line 69
    .line 70
    invoke-direct {v5, v1, v2, v3, v6}, La/g6q;-><init>(La/xae0;La/clz;La/kjr;La/yje;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, La/ljr;->H0()La/vkr;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v1, v1, La/vkr;->i:La/p7m0;

    .line 81
    .line 82
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    new-instance v5, La/jjr;

    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    invoke-direct {v5, p0, v6, v1}, La/jjr;-><init>(La/ljr;La/yje;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    new-instance v2, La/g6q;

    .line 105
    .line 106
    const/4 v7, 0x0

    .line 107
    invoke-direct/range {v2 .. v7}, La/g6q;-><init>(La/xae0;La/clz;La/jjr;La/yje;B)V

    .line 108
    .line 109
    .line 110
    invoke-static {v8, v6, v6, v2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, La/ljr;->H0()La/vkr;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v2, v2, La/vkr;->j:La/ol60;

    .line 118
    .line 119
    new-instance v3, La/kjr;

    .line 120
    .line 121
    invoke-direct {v3, p0, v6, v1}, La/kjr;-><init>(La/ljr;La/yje;B)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    new-instance v4, La/g6q;

    .line 137
    .line 138
    invoke-direct {v4, v2, p0, v3, v6}, La/g6q;-><init>(La/gmq;La/clz;La/kjr;La/yje;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v6, v6, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final G0()La/a0r;
    .locals 2

    .line 1
    sget-object v0, La/ljr;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ljr;->O1:La/s0r;

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
    check-cast p0, La/a0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/vkr;
    .locals 0

    .line 1
    iget-object p0, p0, La/ljr;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vkr;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/ljr;->L1:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f130162

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f130e5d

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v10, La/n12;->a:La/n12;

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/16 v12, 0x5d8

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const-string v7, "EVENT_DIALOG_REQUEST_KEY"

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    move-object v3, p1

    .line 36
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    const-string p0, "actionDialogManager"

    .line 51
    .line 52
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    throw p0
.end method
