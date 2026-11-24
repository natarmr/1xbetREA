.class public final La/bri0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/bri0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/lme0",
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
.field public static final V1:La/lme0;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public M1:La/pti;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;

.field public final R1:La/khf0;

.field public final S1:La/r34;

.field public final U1:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/bri0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/security/impl/databinding/FragmentSetNewPasswordBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "tokenRestoreData"

    .line 16
    .line 17
    const-string v5, "getTokenRestoreData()Lorg/xplatform/security/api/presentation/models/TokenRestoreData;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "userId"

    .line 25
    .line 26
    const-string v6, "getUserId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "navigation"

    .line 34
    .line 35
    const-string v7, "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/bri0;->W1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/lme0;

    .line 57
    .line 58
    const/16 v1, 0x13

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/lme0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/bri0;->V1:La/lme0;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02cd

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/bri0;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/bri0;->L1:La/hnm0;

    .line 20
    .line 21
    new-instance v0, La/xqi0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, La/xqi0;-><init>(La/bri0;B)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/l9i0;

    .line 28
    .line 29
    const/16 v2, 0x8

    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    sget-object v2, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v3, La/l9i0;

    .line 37
    .line 38
    const/16 v4, 0x9

    .line 39
    .line 40
    invoke-direct {v3, v1, v4}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-class v2, La/uri0;

    .line 48
    .line 49
    sget-object v3, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v3, La/s9i0;

    .line 56
    .line 57
    const/4 v4, 0x6

    .line 58
    invoke-direct {v3, v1, v4}, La/s9i0;-><init>(La/a8z;B)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/s9i0;

    .line 62
    .line 63
    const/4 v5, 0x7

    .line 64
    invoke-direct {v4, v1, v5}, La/s9i0;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/bri0;->P1:La/kiu0;

    .line 72
    .line 73
    sget-object v0, La/zqi0;->a:La/zqi0;

    .line 74
    .line 75
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/bri0;->Q1:La/s0r;

    .line 80
    .line 81
    new-instance v0, La/khf0;

    .line 82
    .line 83
    const-string v1, "TOKEN_RESTORE_DATA"

    .line 84
    .line 85
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/bri0;->R1:La/khf0;

    .line 89
    .line 90
    new-instance v0, La/r34;

    .line 91
    .line 92
    const-string v1, "USER_ID"

    .line 93
    .line 94
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, La/bri0;->S1:La/r34;

    .line 98
    .line 99
    new-instance v0, La/yzn0;

    .line 100
    .line 101
    const-string v1, "bundle_navigation"

    .line 102
    .line 103
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, La/bri0;->U1:La/yzn0;

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/bri0;->G0()La/r4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/r4r;->f:Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;

    .line 6
    .line 7
    const v0, 0x7f130f13

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->setTitle(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/bri0;->G0()La/r4r;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/r4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 22
    .line 23
    new-instance v0, La/xqi0;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, v1}, La/xqi0;-><init>(La/bri0;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/bri0;->G0()La/r4r;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, La/r4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, p0, v0}, La/uvw;->R(Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, La/xqi0;

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    invoke-direct {p1, p0, v0}, La/xqi0;-><init>(La/bri0;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/bri0;->G0()La/r4r;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p1, p1, La/r4r;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 56
    .line 57
    new-instance v0, La/xqi0;

    .line 58
    .line 59
    const/4 v2, 0x3

    .line 60
    invoke-direct {v0, p0, v2}, La/xqi0;-><init>(La/bri0;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, La/xqi0;

    .line 67
    .line 68
    const/4 v0, 0x6

    .line 69
    invoke-direct {p1, p0, v0}, La/xqi0;-><init>(La/bri0;B)V

    .line 70
    .line 71
    .line 72
    const-string v0, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY"

    .line 73
    .line 74
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, La/xqi0;

    .line 78
    .line 79
    const/4 v0, 0x7

    .line 80
    invoke-direct {p1, p0, v0}, La/xqi0;-><init>(La/bri0;B)V

    .line 81
    .line 82
    .line 83
    const-string v0, "REQUEST_BACK_DIALOG_KEY"

    .line 84
    .line 85
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, La/bri0;->G0()La/r4r;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object p1, p1, La/r4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 93
    .line 94
    new-instance v0, La/da0;

    .line 95
    .line 96
    new-instance v2, La/yqi0;

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-direct {v2, p0, v3}, La/yqi0;-><init>(La/bri0;B)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v2}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, La/bri0;->G0()La/r4r;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object p1, p1, La/r4r;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 113
    .line 114
    new-instance v0, La/da0;

    .line 115
    .line 116
    new-instance v2, La/yqi0;

    .line 117
    .line 118
    invoke-direct {v2, p0, v1}, La/yqi0;-><init>(La/bri0;B)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v0, v2}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final C0()V
    .locals 24

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
    const-class v2, La/wqi0;

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
    instance-of v4, v1, La/wqi0;

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
    check-cast v3, La/wqi0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v2, 0x1

    .line 62
    sget-object v4, La/bri0;->W1:[La/iiy;

    .line 63
    .line 64
    aget-object v2, v4, v2

    .line 65
    .line 66
    iget-object v5, v0, La/bri0;->R1:La/khf0;

    .line 67
    .line 68
    invoke-virtual {v5, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 73
    .line 74
    const/4 v5, 0x3

    .line 75
    aget-object v5, v4, v5

    .line 76
    .line 77
    iget-object v6, v0, La/bri0;->U1:La/yzn0;

    .line 78
    .line 79
    invoke-virtual {v6, v0, v5}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, La/we50;

    .line 84
    .line 85
    const/4 v6, 0x2

    .line 86
    aget-object v4, v4, v6

    .line 87
    .line 88
    iget-object v6, v0, La/bri0;->S1:La/r34;

    .line 89
    .line 90
    invoke-virtual {v6, v0, v4}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    new-instance v4, La/vqi0;

    .line 99
    .line 100
    invoke-direct {v4, v2, v6, v7, v5}, La/vqi0;-><init>(Lorg/xplatform/security/api/presentation/models/TokenRestoreData;JLa/we50;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v14, v3, La/wqi0;->f:La/qgd;

    .line 107
    .line 108
    iget-object v10, v3, La/wqi0;->g:La/onv;

    .line 109
    .line 110
    iget-object v11, v3, La/wqi0;->h:La/lef0;

    .line 111
    .line 112
    iget-object v15, v3, La/wqi0;->m:La/rjo;

    .line 113
    .line 114
    iget-object v1, v3, La/wqi0;->i:La/duj;

    .line 115
    .line 116
    iget-object v9, v3, La/wqi0;->b:La/cad;

    .line 117
    .line 118
    iget-object v2, v3, La/wqi0;->c:La/d190;

    .line 119
    .line 120
    iget-object v5, v3, La/wqi0;->d:La/ctf0;

    .line 121
    .line 122
    iget-object v13, v3, La/wqi0;->k:La/ii;

    .line 123
    .line 124
    iget-object v6, v3, La/wqi0;->e:La/gii0;

    .line 125
    .line 126
    iget-object v7, v3, La/wqi0;->j:La/je;

    .line 127
    .line 128
    iget-object v8, v3, La/wqi0;->l:La/s31;

    .line 129
    .line 130
    iget-object v12, v3, La/wqi0;->a:La/owp0;

    .line 131
    .line 132
    move-object/from16 v17, v1

    .line 133
    .line 134
    iget-object v1, v3, La/wqi0;->n:La/m1e;

    .line 135
    .line 136
    move-object/from16 v21, v1

    .line 137
    .line 138
    iget-object v1, v3, La/wqi0;->p:La/knf0;

    .line 139
    .line 140
    move-object/from16 v16, v1

    .line 141
    .line 142
    iget-object v1, v3, La/wqi0;->q:La/at4;

    .line 143
    .line 144
    move-object/from16 v18, v1

    .line 145
    .line 146
    iget-object v1, v3, La/wqi0;->r:La/btt0;

    .line 147
    .line 148
    move-object/from16 v19, v1

    .line 149
    .line 150
    iget-object v1, v3, La/wqi0;->o:La/wdk0;

    .line 151
    .line 152
    move-object/from16 v22, v1

    .line 153
    .line 154
    iget-object v1, v3, La/wqi0;->s:La/zn00;

    .line 155
    .line 156
    iget-object v3, v3, La/wqi0;->t:La/pv00;

    .line 157
    .line 158
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-object/from16 v19, v8

    .line 186
    .line 187
    new-instance v8, La/qv2;

    .line 188
    .line 189
    move-object/from16 v23, v1

    .line 190
    .line 191
    move-object/from16 v16, v4

    .line 192
    .line 193
    move-object/from16 v18, v7

    .line 194
    .line 195
    move-object/from16 v20, v12

    .line 196
    .line 197
    move-object v12, v3

    .line 198
    invoke-direct/range {v8 .. v23}, La/qv2;-><init>(La/cad;La/onv;La/lef0;La/pv00;La/ii;La/qgd;La/rjo;La/vqi0;La/duj;La/je;La/s31;La/owp0;La/m1e;La/wdk0;La/zn00;)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v1, v22

    .line 202
    .line 203
    iget-object v2, v8, La/qv2;->n:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, La/n5d0;

    .line 206
    .line 207
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, La/pti;

    .line 212
    .line 213
    iput-object v2, v0, La/bri0;->M1:La/pti;

    .line 214
    .line 215
    iput-object v13, v0, La/bri0;->N1:La/ii;

    .line 216
    .line 217
    iput-object v1, v0, La/bri0;->O1:La/wdk0;

    .line 218
    .line 219
    return-void

    .line 220
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 221
    .line 222
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/bri0;->H0()La/uri0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/uri0;->x:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/tmg0;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v2, v0, v4, v3}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    new-instance v3, La/s6n0;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/sye0;

    .line 21
    .line 22
    const/4 v2, 0x7

    .line 23
    invoke-direct {v1, v0, v4, v2}, La/sye0;-><init>(La/diu0;La/yje;B)V

    .line 24
    .line 25
    .line 26
    new-instance v0, La/dnq;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, v3, v1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 30
    .line 31
    .line 32
    new-instance v1, La/ari0;

    .line 33
    .line 34
    invoke-direct {v1, p0, v4, v2}, La/ari0;-><init>(La/bri0;La/yje;B)V

    .line 35
    .line 36
    .line 37
    sget-object v2, La/lkz;->a:La/lkz;

    .line 38
    .line 39
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v5, La/r7i0;

    .line 52
    .line 53
    invoke-direct {v5, v0, v2, v1, v4}, La/r7i0;-><init>(La/dnq;La/clz;La/ari0;La/yje;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/bri0;->H0()La/uri0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, La/uri0;->w:La/ol60;

    .line 65
    .line 66
    new-instance v2, La/ari0;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-direct {v2, p0, v4, v3}, La/ari0;-><init>(La/bri0;La/yje;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, La/r7i0;

    .line 85
    .line 86
    invoke-direct {v6, v1, v3, v2, v4}, La/r7i0;-><init>(La/gmq;La/clz;La/ari0;La/yje;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v4, v4, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/bri0;->H0()La/uri0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v1, v1, La/uri0;->y:La/p7m0;

    .line 97
    .line 98
    new-instance v2, La/yng0;

    .line 99
    .line 100
    const/16 v3, 0xd

    .line 101
    .line 102
    invoke-direct {v2, p0, v4, v3}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-instance v5, La/r7i0;

    .line 118
    .line 119
    invoke-direct {v5, v1, p0, v2, v4}, La/r7i0;-><init>(La/gmq;La/clz;La/yng0;La/yje;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final G0()La/r4r;
    .locals 2

    .line 1
    sget-object v0, La/bri0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/bri0;->Q1:La/s0r;

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
    check-cast p0, La/r4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/uri0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bri0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uri0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/xqi0;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-direct {p1, p0, v0}, La/xqi0;-><init>(La/bri0;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_REQUEST_ERROR_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/xqi0;

    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    invoke-direct {p1, p0, v0}, La/xqi0;-><init>(La/bri0;B)V

    .line 19
    .line 20
    .line 21
    const-string v0, "REQUEST_PASSWORD_CHANGED_AUTH_DIALOG_KEY"

    .line 22
    .line 23
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bri0;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bri0;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
