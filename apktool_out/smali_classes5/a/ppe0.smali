.class public final La/ppe0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ppe0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/zie0",
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
.field public static final S1:La/zie0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/ii;

.field public M1:La/fiu0;

.field public N1:La/pv00;

.field public final O1:La/khf0;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;

.field public final R1:La/mpe0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ppe0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/referral/api/presentation/ReferralsListParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "viewBinding"

    .line 16
    .line 17
    const-string v5, "getViewBinding()Lorg/xplatform/referral/impl/databinding/FragmentReferralsListBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/ppe0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/zie0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ppe0;->S1:La/zie0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02b5

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
    iput-object v0, p0, La/ppe0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/khf0;

    .line 12
    .line 13
    const-string v1, "params"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/ppe0;->O1:La/khf0;

    .line 19
    .line 20
    new-instance v0, La/kpe0;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, v1}, La/kpe0;-><init>(La/ppe0;B)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/lce0;

    .line 27
    .line 28
    const/4 v2, 0x7

    .line 29
    invoke-direct {v1, p0, v2}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/lce0;

    .line 35
    .line 36
    const/16 v4, 0x8

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/tpe0;

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
    new-instance v3, La/wbe0;

    .line 54
    .line 55
    const/16 v4, 0xa

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/wbe0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/wbe0;

    .line 61
    .line 62
    const/16 v5, 0xb

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/wbe0;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/ppe0;->P1:La/kiu0;

    .line 72
    .line 73
    sget-object v0, La/ope0;->a:La/ope0;

    .line 74
    .line 75
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/ppe0;->Q1:La/s0r;

    .line 80
    .line 81
    new-instance v0, La/mpe0;

    .line 82
    .line 83
    invoke-direct {v0, p0}, La/mpe0;-><init>(La/ppe0;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, La/ppe0;->R1:La/mpe0;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/ppe0;->G0()La/z3r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/z3r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    new-instance v0, La/jpe0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/kpe0;

    .line 17
    .line 18
    invoke-direct {p1, p0, v1}, La/kpe0;-><init>(La/ppe0;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/ppe0;->N1:La/pv00;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, La/ppe0;->G0()La/z3r;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v2, v2, La/z3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-direct {v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, La/pv00;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, La/gkz;

    .line 50
    .line 51
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x3

    .line 58
    invoke-static {v2, v1, p1}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, La/ppe0;->G0()La/z3r;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object p1, p1, La/z3r;->b:Landroid/widget/ImageButton;

    .line 66
    .line 67
    sget-object v0, La/ymx;->d:La/ymx;

    .line 68
    .line 69
    new-instance v2, La/lpe0;

    .line 70
    .line 71
    invoke-direct {v2, p0, v1}, La/lpe0;-><init>(La/ppe0;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v0, v2}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    const-string p0, "referralsRecyclerFragmentDelegate"

    .line 79
    .line 80
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public final C0()V
    .locals 11

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
    const-class v1, La/qpe0;

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
    instance-of v3, v0, La/qpe0;

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
    check-cast v2, La/qpe0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, La/ppe0;->R1:La/mpe0;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v1, v2, La/qpe0;->a:La/pzu;

    .line 61
    .line 62
    iget-object v3, v2, La/qpe0;->b:La/btt0;

    .line 63
    .line 64
    iget-object v4, v2, La/qpe0;->c:La/gst0;

    .line 65
    .line 66
    iget-object v5, v2, La/qpe0;->d:La/gii0;

    .line 67
    .line 68
    iget-object v6, v2, La/qpe0;->e:La/ii;

    .line 69
    .line 70
    iget-object v7, v2, La/qpe0;->f:La/duj;

    .line 71
    .line 72
    iget-object v8, v2, La/qpe0;->h:La/wsf0;

    .line 73
    .line 74
    iget-object v9, v2, La/qpe0;->g:La/sa10;

    .line 75
    .line 76
    iget-object v2, v2, La/qpe0;->i:La/ioe0;

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v10, La/g45;

    .line 94
    .line 95
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v2, v10, La/g45;->a:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v5, v10, La/g45;->b:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v3, v10, La/g45;->c:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v4, v10, La/g45;->d:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v8, v10, La/g45;->e:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v1, v10, La/g45;->f:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v7, v10, La/g45;->g:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v9, v10, La/g45;->h:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance v1, La/ppi;

    .line 115
    .line 116
    const/16 v2, 0x1c

    .line 117
    .line 118
    invoke-direct {v1, v10, v2}, La/ppi;-><init>(Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    iput-object v1, v10, La/g45;->i:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v6, p0, La/ppe0;->L1:La/ii;

    .line 124
    .line 125
    new-instance v1, La/fiu0;

    .line 126
    .line 127
    iget-object v2, v10, La/g45;->i:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, La/ppi;

    .line 130
    .line 131
    const-class v3, La/tpe0;

    .line 132
    .line 133
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 138
    .line 139
    .line 140
    iput-object v1, p0, La/ppe0;->M1:La/fiu0;

    .line 141
    .line 142
    new-instance v1, La/pv00;

    .line 143
    .line 144
    new-instance v2, La/gkz;

    .line 145
    .line 146
    sget-object v3, La/gkz;->h:La/pn20;

    .line 147
    .line 148
    invoke-direct {v2, v3}, La/zz3;-><init>(La/dtb;)V

    .line 149
    .line 150
    .line 151
    new-instance v3, La/k8e0;

    .line 152
    .line 153
    const/16 v4, 0xe

    .line 154
    .line 155
    invoke-direct {v3, v4}, La/k8e0;-><init>(B)V

    .line 156
    .line 157
    .line 158
    new-instance v4, La/eme0;

    .line 159
    .line 160
    const/4 v5, 0x4

    .line 161
    invoke-direct {v4, v0, v5}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 162
    .line 163
    .line 164
    new-instance v0, La/o5c0;

    .line 165
    .line 166
    const/4 v5, 0x3

    .line 167
    const/16 v6, 0xf

    .line 168
    .line 169
    invoke-direct {v0, v5, v6}, La/o5c0;-><init>(IB)V

    .line 170
    .line 171
    .line 172
    sget-object v5, La/x4c0;->r:La/x4c0;

    .line 173
    .line 174
    new-instance v6, La/gbn;

    .line 175
    .line 176
    invoke-direct {v6, v3, v0, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v2, La/zz3;->d:La/dp;

    .line 180
    .line 181
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 182
    .line 183
    .line 184
    invoke-direct {v1, v2}, La/pv00;-><init>(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iput-object v1, p0, La/ppe0;->N1:La/pv00;

    .line 188
    .line 189
    return-void

    .line 190
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 191
    .line 192
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/ppe0;->H0()La/tpe0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/tpe0;->i:La/p7m0;

    .line 6
    .line 7
    new-instance v4, La/s9c0;

    .line 8
    .line 9
    const/16 v0, 0x1c

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct {v4, p0, v5, v0}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

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
    new-instance v1, La/g4e0;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, La/g4e0;-><init>(La/gmq;La/clz;La/s9c0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/ppe0;->H0()La/tpe0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v6, v0, La/tpe0;->j:La/p7m0;

    .line 44
    .line 45
    new-instance v8, La/coc0;

    .line 46
    .line 47
    const/16 v0, 0xe

    .line 48
    .line 49
    invoke-direct {v8, p0, v5, v0}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    move-object v9, v5

    .line 65
    new-instance v5, La/g4e0;

    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    invoke-direct/range {v5 .. v10}, La/g4e0;-><init>(La/gmq;La/clz;La/coc0;La/yje;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final G0()La/z3r;
    .locals 2

    .line 1
    sget-object v0, La/ppe0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ppe0;->Q1:La/s0r;

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
    check-cast p0, La/z3r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/tpe0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ppe0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tpe0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/mpe0;

    .line 9
    .line 10
    invoke-direct {v0, p0}, La/mpe0;-><init>(La/ppe0;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST"

    .line 14
    .line 15
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, La/kpe0;

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-direct {p1, p0, v0}, La/kpe0;-><init>(La/ppe0;B)V

    .line 22
    .line 23
    .line 24
    const-string v0, "deleteReferral"

    .line 25
    .line 26
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, La/lpe0;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, v0}, La/lpe0;-><init>(La/ppe0;B)V

    .line 33
    .line 34
    .line 35
    const-string v0, "selectDateFilterDialogKey"

    .line 36
    .line 37
    invoke-static {p0, v0, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ppe0;->N1:La/pv00;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/ppe0;->G0()La/z3r;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, La/z3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "referralsRecyclerFragmentDelegate"

    .line 20
    .line 21
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ppe0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
