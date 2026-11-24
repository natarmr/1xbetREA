.class public final La/tx00;
.super La/u0i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/tx00;",
        "La/u0i;",
        "<init>",
        "()V",
        "a/evz",
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
.field public static final l2:La/evz;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public f2:La/fiu0;

.field public final g2:La/a8z;

.field public final h2:La/cgx0;

.field public final i2:La/cgx0;

.field public final j2:La/cgx0;

.field public final k2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/tx00;

    .line 4
    .line 5
    const-string v2, "isInvisibleDialog"

    .line 6
    .line 7
    const-string v3, "isInvisibleDialog()Z"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "showDefaultMessage"

    .line 16
    .line 17
    const-string v5, "getShowDefaultMessage()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "reverseNeutralButton"

    .line 25
    .line 26
    const-string v6, "getReverseNeutralButton()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "requestKey"

    .line 34
    .line 35
    const-string v7, "getRequestKey()Ljava/lang/String;"

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
    sput-object v1, La/tx00;->m2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/evz;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/tx00;->l2:La/evz;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/u0i;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/wx00;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/rx00;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/rx00;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/tx00;->g2:La/a8z;

    .line 23
    .line 24
    new-instance v0, La/cgx0;

    .line 25
    .line 26
    const-string v1, "INVISIBLE"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/tx00;->h2:La/cgx0;

    .line 32
    .line 33
    new-instance v0, La/cgx0;

    .line 34
    .line 35
    const-string v1, "SHOW_DEFAULT_MESSAGE"

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/tx00;->i2:La/cgx0;

    .line 41
    .line 42
    new-instance v0, La/cgx0;

    .line 43
    .line 44
    const-string v1, "REVERSE_BUTTON"

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, La/tx00;->j2:La/cgx0;

    .line 50
    .line 51
    new-instance v0, La/phf0;

    .line 52
    .line 53
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 54
    .line 55
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/tx00;->k2:La/phf0;

    .line 59
    .line 60
    return-void
.end method

.method public static final synthetic T0(La/tx00;)V
    .locals 0

    .line 1
    invoke-super {p0}, La/u0i;->O0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/u0i;->C0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, La/tx00;->m2:[La/iiy;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget-object v0, v0, v1

    .line 9
    .line 10
    iget-object v1, p0, La/tx00;->h2:La/cgx0;

    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-object p1
.end method

.method public final L0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/tx00;->U0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/k3t0;->w()La/gmq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/sx00;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, p0, v3, v2}, La/sx00;-><init>(La/tx00;La/yje;B)V

    .line 14
    .line 15
    .line 16
    sget-object v2, La/lkz;->a:La/lkz;

    .line 17
    .line 18
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    new-instance v5, La/zd00;

    .line 31
    .line 32
    invoke-direct {v5, v0, v2, v1, v3}, La/zd00;-><init>(La/gmq;La/clz;La/sx00;La/yje;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/tx00;->U0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/i3t0;

    .line 44
    .line 45
    invoke-virtual {v1}, La/i3t0;->C()La/gmq;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v2, La/sx00;

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    invoke-direct {v2, p0, v3, v4}, La/sx00;-><init>(La/tx00;La/yje;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    new-instance v5, La/zd00;

    .line 68
    .line 69
    check-cast v1, La/i89;

    .line 70
    .line 71
    invoke-direct {v5, v1, p0, v2, v3}, La/zd00;-><init>(La/i89;La/clz;La/sx00;La/yje;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final M0()V
    .locals 2

    .line 1
    sget-object v0, La/tx00;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/tx00;->j2:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/tx00;->U0()La/k3t0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, La/lx00;->a:La/lx00;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-super {p0}, La/u0i;->M0()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0}, La/tx00;->U0()La/k3t0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object v0, La/mx00;->a:La/mx00;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final N0()V
    .locals 2

    .line 1
    sget-object v0, La/tx00;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/tx00;->j2:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/tx00;->U0()La/k3t0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, La/lx00;->a:La/lx00;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-super {p0}, La/u0i;->N0()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0}, La/tx00;->U0()La/k3t0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object v0, La/mx00;->a:La/mx00;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final O0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/tx00;->U0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/nx00;->a:La/nx00;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final U0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tx00;->g2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/u0i;->W(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/af3;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    :goto_0
    const-class v2, La/qx00;

    .line 27
    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/o5d0;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v1, v3

    .line 50
    :goto_1
    instance-of v4, v1, La/qx00;

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v1

    .line 56
    :goto_2
    check-cast v3, La/qx00;

    .line 57
    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    sget-object v2, La/tx00;->m2:[La/iiy;

    .line 62
    .line 63
    aget-object v1, v2, v1

    .line 64
    .line 65
    iget-object v4, v0, La/tx00;->h2:La/cgx0;

    .line 66
    .line 67
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    const/4 v1, 0x1

    .line 72
    aget-object v1, v2, v1

    .line 73
    .line 74
    iget-object v2, v0, La/tx00;->i2:La/cgx0;

    .line 75
    .line 76
    invoke-virtual {v2, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    const-string v1, ""

    .line 87
    .line 88
    :goto_3
    move-object v15, v1

    .line 89
    goto :goto_4

    .line 90
    :cond_3
    invoke-virtual {v0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v1, v1, Lorg/xplatform/uikit/components/dialog/DialogFields;->b:Ljava/lang/CharSequence;

    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    goto :goto_3

    .line 101
    :goto_4
    iget-object v9, v3, La/qx00;->o:La/pv00;

    .line 102
    .line 103
    iget-object v6, v3, La/qx00;->d:La/mne;

    .line 104
    .line 105
    iget-object v1, v3, La/qx00;->f:La/duj;

    .line 106
    .line 107
    iget-object v2, v3, La/qx00;->k:La/ctf0;

    .line 108
    .line 109
    iget-object v4, v3, La/qx00;->g:La/sv3;

    .line 110
    .line 111
    iget-object v5, v3, La/qx00;->h:La/gii0;

    .line 112
    .line 113
    iget-object v7, v3, La/qx00;->a:La/nr;

    .line 114
    .line 115
    iget-object v8, v3, La/qx00;->c:La/rqj0;

    .line 116
    .line 117
    iget-object v10, v3, La/qx00;->j:La/aqt;

    .line 118
    .line 119
    iget-object v11, v3, La/qx00;->n:La/zsr;

    .line 120
    .line 121
    iget-object v12, v3, La/qx00;->l:La/kt2;

    .line 122
    .line 123
    iget-object v13, v3, La/qx00;->m:La/rv3;

    .line 124
    .line 125
    move-object/from16 v20, v8

    .line 126
    .line 127
    iget-object v8, v3, La/qx00;->i:La/v6k;

    .line 128
    .line 129
    move-object/from16 v19, v1

    .line 130
    .line 131
    iget-object v1, v3, La/qx00;->p:La/btt0;

    .line 132
    .line 133
    move-object/from16 v21, v1

    .line 134
    .line 135
    iget-object v1, v3, La/qx00;->q:La/b3c0;

    .line 136
    .line 137
    move-object/from16 v16, v7

    .line 138
    .line 139
    iget-object v7, v3, La/qx00;->e:La/iw20;

    .line 140
    .line 141
    move-object/from16 v17, v1

    .line 142
    .line 143
    iget-object v1, v3, La/qx00;->b:La/s64;

    .line 144
    .line 145
    move-object/from16 v18, v10

    .line 146
    .line 147
    iget-object v10, v3, La/qx00;->r:La/kib0;

    .line 148
    .line 149
    move-object/from16 v22, v1

    .line 150
    .line 151
    iget-object v1, v3, La/qx00;->s:La/psc;

    .line 152
    .line 153
    move-object/from16 v24, v11

    .line 154
    .line 155
    iget-object v11, v3, La/qx00;->t:La/sue;

    .line 156
    .line 157
    move-object/from16 v23, v12

    .line 158
    .line 159
    iget-object v12, v3, La/qx00;->u:La/epi0;

    .line 160
    .line 161
    move-object/from16 v25, v13

    .line 162
    .line 163
    iget-object v13, v3, La/qx00;->v:La/ok50;

    .line 164
    .line 165
    iget-object v3, v3, La/qx00;->w:La/sqx;

    .line 166
    .line 167
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-object/from16 v18, v5

    .line 201
    .line 202
    new-instance v5, La/v5i;

    .line 203
    .line 204
    move-object/from16 v25, v1

    .line 205
    .line 206
    move-object/from16 v23, v2

    .line 207
    .line 208
    move-object/from16 v26, v3

    .line 209
    .line 210
    move-object/from16 v17, v22

    .line 211
    .line 212
    move-object/from16 v22, v4

    .line 213
    .line 214
    invoke-direct/range {v5 .. v26}, La/v5i;-><init>(La/mne;La/iw20;La/v6k;La/pv00;La/kib0;La/sue;La/epi0;La/ok50;Ljava/lang/Boolean;Ljava/lang/String;La/nr;La/s64;La/gii0;La/duj;La/rqj0;La/btt0;La/sv3;La/ctf0;La/zsr;La/psc;La/sqx;)V

    .line 215
    .line 216
    .line 217
    new-instance v1, La/fiu0;

    .line 218
    .line 219
    iget-object v2, v5, La/v5i;->v:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v2, La/tii;

    .line 222
    .line 223
    const-class v3, La/wx00;

    .line 224
    .line 225
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 230
    .line 231
    .line 232
    iput-object v1, v0, La/tx00;->f2:La/fiu0;

    .line 233
    .line 234
    return-void

    .line 235
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 236
    .line 237
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-void
.end method
