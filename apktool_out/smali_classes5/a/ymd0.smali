.class public final La/ymd0;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/r3r;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/ymd0;",
        "La/stl;",
        "La/r3r;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final o2:La/fl70;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public final g2:La/nae0;

.field public h2:La/fiu0;

.field public i2:La/wdk0;

.field public final j2:La/kiu0;

.field public final k2:La/oac;

.field public final l2:La/n0o0;

.field public final m2:La/z0i;

.field public final n2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ymd0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/quickbet/impl/databinding/FragmentQuickBetDialogBinding;"

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
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/ymd0;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/fl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ymd0;->o2:La/fl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/wmd0;->a:La/wmd0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/ymd0;->g2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/umd0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/umd0;-><init>(La/ymd0;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/f1d0;

    .line 19
    .line 20
    const/16 v2, 0x15

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/f1d0;

    .line 28
    .line 29
    const/16 v4, 0x16

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/tod0;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/ync0;

    .line 47
    .line 48
    const/16 v4, 0x18

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/ync0;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/ync0;

    .line 54
    .line 55
    const/16 v5, 0x19

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/ymd0;->j2:La/kiu0;

    .line 65
    .line 66
    new-instance v0, La/oac;

    .line 67
    .line 68
    const/4 v1, 0x5

    .line 69
    invoke-direct {v0, p0, v1}, La/oac;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/ymd0;->k2:La/oac;

    .line 73
    .line 74
    new-instance v0, La/umd0;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-direct {v0, p0, v1}, La/umd0;-><init>(La/ymd0;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/ymd0;->l2:La/n0o0;

    .line 85
    .line 86
    new-instance v0, La/z0i;

    .line 87
    .line 88
    const/4 v1, 0x3

    .line 89
    invoke-direct {v0, p0, v1}, La/z0i;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, La/ymd0;->m2:La/z0i;

    .line 93
    .line 94
    new-instance v0, La/phf0;

    .line 95
    .line 96
    const-string v1, "REQUEST_KEY"

    .line 97
    .line 98
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, La/ymd0;->n2:La/phf0;

    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 5

    .line 1
    new-instance v0, La/kp8;

    .line 2
    .line 3
    const v1, 0x7f130e8b

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v2, 0x7f1404af

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/stl;->I0(La/kp8;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 27
    .line 28
    new-instance v1, La/tjj;

    .line 29
    .line 30
    const/16 v2, 0xd

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-direct {v1, v2, v3}, La/tjj;-><init>(II)V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    new-array v3, v2, [Landroid/text/InputFilter;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v1, v3, v4

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setFilters([Landroid/text/InputFilter;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, La/r3r;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 50
    .line 51
    new-instance v1, La/tmd0;

    .line 52
    .line 53
    invoke-direct {v1, p0, v4}, La/tmd0;-><init>(La/ymd0;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/r3r;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 64
    .line 65
    iget-object v1, p0, La/ymd0;->k2:La/oac;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 75
    .line 76
    iget-object v1, p0, La/ymd0;->l2:La/n0o0;

    .line 77
    .line 78
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, La/da0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v0, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 97
    .line 98
    new-instance v1, La/qd7;

    .line 99
    .line 100
    const/4 v3, 0x4

    .line 101
    invoke-direct {v1, p0, v3}, La/qd7;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 108
    .line 109
    if-eqz v0, :cond_0

    .line 110
    .line 111
    iput-boolean v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 112
    .line 113
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    new-instance v1, La/wss;

    .line 132
    .line 133
    const/16 v2, 0x17

    .line 134
    .line 135
    invoke-direct {v1, p0, v2}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 139
    .line 140
    .line 141
    :cond_1
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    iget-object p0, p0, La/r3r;->d:Landroid/widget/LinearLayout;

    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final T0()V
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
    const-class v1, La/zmd0;

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
    instance-of v3, v0, La/zmd0;

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
    check-cast v2, La/zmd0;

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
    iget-object v4, v2, La/zmd0;->a:La/cad;

    .line 63
    .line 64
    iget-object v8, v2, La/zmd0;->b:La/ctf0;

    .line 65
    .line 66
    iget-object v9, v2, La/zmd0;->c:La/duj;

    .line 67
    .line 68
    iget-object v0, v2, La/zmd0;->h:La/vwb0;

    .line 69
    .line 70
    iget-object v7, v2, La/zmd0;->g:La/fnd0;

    .line 71
    .line 72
    iget-object v6, v2, La/zmd0;->f:La/d1p;

    .line 73
    .line 74
    iget-object v5, v2, La/zmd0;->d:La/wsf0;

    .line 75
    .line 76
    iget-object v10, v2, La/zmd0;->e:La/wdk0;

    .line 77
    .line 78
    iget-object v11, v2, La/zmd0;->i:La/s31;

    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v3, La/rrd;

    .line 96
    .line 97
    invoke-direct/range {v3 .. v11}, La/rrd;-><init>(La/cad;La/wsf0;La/d1p;La/fnd0;La/ctf0;La/duj;La/wdk0;La/s31;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, La/fiu0;

    .line 101
    .line 102
    iget-object v1, v3, La/rrd;->i:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, La/ppi;

    .line 105
    .line 106
    const-class v2, La/tod0;

    .line 107
    .line 108
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, La/ymd0;->h2:La/fiu0;

    .line 116
    .line 117
    iput-object v10, p0, La/ymd0;->i2:La/wdk0;

    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 121
    .line 122
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final V0()La/r3r;
    .locals 2

    .line 1
    sget-object v0, La/ymd0;->p2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ymd0;->g2:La/nae0;

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
    check-cast p0, La/r3r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W0(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final Y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ymd0;->p2:[La/iiy;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget-object v0, v0, v1

    .line 12
    .line 13
    iget-object v2, p0, La/ymd0;->n2:La/phf0;

    .line 14
    .line 15
    invoke-virtual {v2, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 27
    .line 28
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/r3r;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, La/ymd0;->m2:La/z0i;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 30
    .line 31
    .line 32
    invoke-super {p0}, La/stl;->Z()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/r3r;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 18
    .line 19
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 20
    .line 21
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_0
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setSelection(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 47
    .line 48
    return-void
.end method

.method public final e0()V
    .locals 10

    .line 1
    invoke-super {p0}, La/stl;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/r3r;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/ymd0;->V0()La/r3r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 21
    .line 22
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, La/ymd0;->j2:La/kiu0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/tod0;

    .line 32
    .line 33
    iget-object v1, v1, La/tod0;->n:La/ol60;

    .line 34
    .line 35
    new-instance v2, La/xmd0;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    invoke-direct {v2, p0, v8, v3}, La/xmd0;-><init>(La/ymd0;La/yje;B)V

    .line 40
    .line 41
    .line 42
    sget-object v3, La/lkz;->a:La/lkz;

    .line 43
    .line 44
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, La/fxc0;

    .line 57
    .line 58
    invoke-direct {v5, v1, v3, v2, v8}, La/fxc0;-><init>(La/gmq;La/clz;La/xmd0;La/yje;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    invoke-static {v4, v8, v8, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/tod0;

    .line 70
    .line 71
    iget-object v5, v0, La/tod0;->m:La/p7m0;

    .line 72
    .line 73
    new-instance v7, La/xmd0;

    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    invoke-direct {v7, p0, v8, v0}, La/xmd0;-><init>(La/ymd0;La/yje;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance v4, La/fxc0;

    .line 92
    .line 93
    const/4 v9, 0x0

    .line 94
    invoke-direct/range {v4 .. v9}, La/fxc0;-><init>(La/gmq;La/clz;La/xmd0;La/yje;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 98
    .line 99
    .line 100
    return-void
.end method
