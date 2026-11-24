.class public final La/jne0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/jne0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gne0",
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
.field public static final S1:La/gne0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/ljf0;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/khf0;

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/jne0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;"

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
    const-string v5, "getViewBinding()Lorg/xplatform/referral/impl/databinding/FragmentReferralNetworkBinding;"

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
    sput-object v1, La/jne0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gne0;

    .line 33
    .line 34
    invoke-direct {v0, v4}, La/gne0;-><init>(B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/jne0;->S1:La/gne0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02b2

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
    iput-object v0, p0, La/jne0;->K1:La/hnm0;

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
    iput-object v0, p0, La/jne0;->P1:La/khf0;

    .line 19
    .line 20
    new-instance v0, La/dne0;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, v1}, La/dne0;-><init>(La/jne0;B)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/lce0;

    .line 27
    .line 28
    const/4 v2, 0x3

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
    const/4 v4, 0x4

    .line 37
    invoke-direct {v3, v1, v4}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-class v2, La/xne0;

    .line 45
    .line 46
    sget-object v3, La/sre0;->a:La/tre0;

    .line 47
    .line 48
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, La/wbe0;

    .line 53
    .line 54
    const/4 v4, 0x6

    .line 55
    invoke-direct {v3, v1, v4}, La/wbe0;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    new-instance v4, La/wbe0;

    .line 59
    .line 60
    const/4 v5, 0x7

    .line 61
    invoke-direct {v4, v1, v5}, La/wbe0;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/jne0;->Q1:La/kiu0;

    .line 69
    .line 70
    sget-object v0, La/ine0;->a:La/ine0;

    .line 71
    .line 72
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/jne0;->R1:La/s0r;

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    new-instance p1, La/dne0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/dne0;-><init>(La/jne0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/jne0;->G0()La/w3r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p1, La/w3r;->b:La/zkk;

    .line 15
    .line 16
    iget-object v2, v1, La/zkk;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/widget/LinearLayout;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v2, v3}, La/knm0;->h(Landroid/view/View;Z)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, La/jne0;->M1:La/ljf0;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v5, v1, La/zkk;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    new-instance v6, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 34
    .line 35
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-direct {v6, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v2, La/ljf0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, La/gkz;

    .line 48
    .line 49
    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x3

    .line 53
    invoke-static {v5, v3, v2}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    iget-object v2, p1, La/w3r;->c:La/zkk;

    .line 63
    .line 64
    iget-object v4, v2, La/zkk;->i:Landroid/view/View;

    .line 65
    .line 66
    check-cast v4, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 67
    .line 68
    new-instance v5, La/l910;

    .line 69
    .line 70
    const/16 v6, 0x1c

    .line 71
    .line 72
    invoke-direct {v5, p0, v6}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    .line 77
    .line 78
    iget-object v4, v2, La/zkk;->g:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 81
    .line 82
    new-instance v5, La/ene0;

    .line 83
    .line 84
    invoke-direct {v5, p0, v3}, La/ene0;-><init>(La/jne0;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v4, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 88
    .line 89
    .line 90
    iget-object v4, v1, La/zkk;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 93
    .line 94
    new-instance v5, La/fne0;

    .line 95
    .line 96
    invoke-direct {v5, p0, p1, v3}, La/fne0;-><init>(La/jne0;La/w3r;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v4, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 100
    .line 101
    .line 102
    iget-object v3, v1, La/zkk;->e:Landroid/view/View;

    .line 103
    .line 104
    check-cast v3, Landroid/widget/TextView;

    .line 105
    .line 106
    new-instance v4, La/ene0;

    .line 107
    .line 108
    invoke-direct {v4, p0, v0}, La/ene0;-><init>(La/jne0;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {v3, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 112
    .line 113
    .line 114
    iget-object v1, v1, La/zkk;->i:Landroid/view/View;

    .line 115
    .line 116
    check-cast v1, Landroid/widget/LinearLayout;

    .line 117
    .line 118
    new-instance v3, La/fne0;

    .line 119
    .line 120
    invoke-direct {v3, p0, p1, v0}, La/fne0;-><init>(La/jne0;La/w3r;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 124
    .line 125
    .line 126
    iget-object p1, v2, La/zkk;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p1, Landroid/widget/ImageView;

    .line 129
    .line 130
    new-instance v0, La/ene0;

    .line 131
    .line 132
    const/4 v1, 0x2

    .line 133
    invoke-direct {v0, p0, v1}, La/ene0;-><init>(La/jne0;B)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 137
    .line 138
    .line 139
    new-instance p1, La/dne0;

    .line 140
    .line 141
    invoke-direct {p1, p0, v1}, La/dne0;-><init>(La/jne0;B)V

    .line 142
    .line 143
    .line 144
    const-string v0, "approveMoveMoney"

    .line 145
    .line 146
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_0
    const-string p0, "shortReferralRecyclerFragmentDelegate"

    .line 151
    .line 152
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v4
.end method

.method public final C0()V
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
    const-class v1, La/kne0;

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
    instance-of v3, v0, La/kne0;

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
    check-cast v2, La/kne0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/jne0;->U1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/jne0;->P1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;

    .line 67
    .line 68
    iget-object v1, v2, La/kne0;->b:La/btt0;

    .line 69
    .line 70
    iget-object v3, v2, La/kne0;->c:La/gst0;

    .line 71
    .line 72
    iget-object v4, v2, La/kne0;->d:La/gii0;

    .line 73
    .line 74
    iget-object v5, v2, La/kne0;->g:La/wsf0;

    .line 75
    .line 76
    iget-object v6, v2, La/kne0;->e:La/ii;

    .line 77
    .line 78
    iget-object v7, v2, La/kne0;->a:La/pzu;

    .line 79
    .line 80
    iget-object v8, v2, La/kne0;->f:La/duj;

    .line 81
    .line 82
    iget-object v9, v2, La/kne0;->h:La/zpu;

    .line 83
    .line 84
    iget-object v10, v2, La/kne0;->i:La/ioe0;

    .line 85
    .line 86
    iget-object v2, v2, La/kne0;->j:La/wdk0;

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v11, La/ru;

    .line 107
    .line 108
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v0, v11, La/ru;->a:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v10, v11, La/ru;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v4, v11, La/ru;->d:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v1, v11, La/ru;->e:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v3, v11, La/ru;->f:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v5, v11, La/ru;->g:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v7, v11, La/ru;->h:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v8, v11, La/ru;->b:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v9, v11, La/ru;->i:Ljava/lang/Object;

    .line 128
    .line 129
    new-instance v0, La/ppi;

    .line 130
    .line 131
    const/16 v1, 0x19

    .line 132
    .line 133
    invoke-direct {v0, v11, v1}, La/ppi;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    iput-object v0, v11, La/ru;->j:Ljava/lang/Object;

    .line 137
    .line 138
    new-instance v0, La/fiu0;

    .line 139
    .line 140
    iget-object v1, v11, La/ru;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, La/ppi;

    .line 143
    .line 144
    const-class v3, La/xne0;

    .line 145
    .line 146
    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, La/jne0;->L1:La/fiu0;

    .line 154
    .line 155
    new-instance v0, La/ljf0;

    .line 156
    .line 157
    new-instance v1, La/gkz;

    .line 158
    .line 159
    sget-object v3, La/gkz;->i:La/pn20;

    .line 160
    .line 161
    invoke-direct {v1, v3}, La/zz3;-><init>(La/dtb;)V

    .line 162
    .line 163
    .line 164
    new-instance v3, La/ogj0;

    .line 165
    .line 166
    const/16 v4, 0x10

    .line 167
    .line 168
    invoke-direct {v3, v4}, La/ogj0;-><init>(B)V

    .line 169
    .line 170
    .line 171
    new-instance v4, La/thj0;

    .line 172
    .line 173
    const/16 v5, 0xa

    .line 174
    .line 175
    invoke-direct {v4, v5}, La/thj0;-><init>(B)V

    .line 176
    .line 177
    .line 178
    new-instance v5, La/gsh0;

    .line 179
    .line 180
    const/4 v7, 0x3

    .line 181
    const/16 v8, 0x1d

    .line 182
    .line 183
    invoke-direct {v5, v7, v8}, La/gsh0;-><init>(IB)V

    .line 184
    .line 185
    .line 186
    sget-object v7, La/wjj0;->f:La/wjj0;

    .line 187
    .line 188
    new-instance v8, La/gbn;

    .line 189
    .line 190
    invoke-direct {v8, v3, v5, v4, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 191
    .line 192
    .line 193
    iget-object v3, v1, La/zz3;->d:La/dp;

    .line 194
    .line 195
    invoke-virtual {v3, v8}, La/dp;->b(La/gbn;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v0, v1}, La/ljf0;-><init>(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iput-object v0, p0, La/jne0;->M1:La/ljf0;

    .line 202
    .line 203
    iput-object v6, p0, La/jne0;->N1:La/ii;

    .line 204
    .line 205
    iput-object v2, p0, La/jne0;->O1:La/wdk0;

    .line 206
    .line 207
    return-void

    .line 208
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 209
    .line 210
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/jne0;->H0()La/xne0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/xne0;->j:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/hne0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/hne0;-><init>(La/jne0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/g4e0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/g4e0;-><init>(La/gmq;La/clz;La/hne0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/jne0;->H0()La/xne0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/xne0;->k:La/qoj0;

    .line 42
    .line 43
    new-instance v6, La/hne0;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/hne0;-><init>(La/jne0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v3, La/g4e0;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/g4e0;-><init>(La/gmq;La/clz;La/hne0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final G0()La/w3r;
    .locals 2

    .line 1
    sget-object v0, La/jne0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/jne0;->R1:La/s0r;

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
    check-cast p0, La/w3r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/xne0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jne0;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xne0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/jne0;->M1:La/ljf0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/jne0;->G0()La/w3r;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, La/w3r;->b:La/zkk;

    .line 14
    .line 15
    iget-object p0, p0, La/zkk;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "shortReferralRecyclerFragmentDelegate"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jne0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
