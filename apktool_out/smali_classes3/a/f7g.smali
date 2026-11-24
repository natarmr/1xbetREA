.class public final La/f7g;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/b7g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/f7g;",
        "La/stl;",
        "La/b7g;",
        "<init>",
        "()V",
        "a/nwd",
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
.field public static final o2:La/nwd;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public g2:La/xdi;

.field public h2:La/ii;

.field public i2:La/g2v;

.field public final j2:La/nae0;

.field public final k2:La/kiu0;

.field public final l2:La/a8z;

.field public final m2:La/khf0;

.field public n2:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/f7g;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDisciplinesDialogBinding;"

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
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;"

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
    sput-object v1, La/f7g;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/nwd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/f7g;->o2:La/nwd;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/d7g;->a:La/d7g;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/f7g;->j2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/c7g;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, La/c7g;-><init>(La/f7g;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/aqe;

    .line 19
    .line 20
    const/16 v2, 0x1c

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v3, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v4, La/aqe;

    .line 28
    .line 29
    const/16 v5, 0x1d

    .line 30
    .line 31
    invoke-direct {v4, v1, v5}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v4, La/j7g;

    .line 39
    .line 40
    sget-object v6, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v6, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v6, La/cce;

    .line 47
    .line 48
    invoke-direct {v6, v1, v2}, La/cce;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v2, La/cce;

    .line 52
    .line 53
    invoke-direct {v2, v1, v5}, La/cce;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v4, v6, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/f7g;->k2:La/kiu0;

    .line 61
    .line 62
    new-instance v0, La/c7g;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-direct {v0, p0, v1}, La/c7g;-><init>(La/f7g;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/f7g;->l2:La/a8z;

    .line 73
    .line 74
    new-instance v0, La/khf0;

    .line 75
    .line 76
    const-string v1, "PARAMS_KEY"

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/f7g;->m2:La/khf0;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final T0()V
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
    const-class v1, La/y6g;

    .line 22
    .line 23
    if-eqz v0, :cond_4

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
    instance-of v3, v0, La/y6g;

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
    check-cast v2, La/y6g;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    sget-object v0, La/f7g;->p2:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/f7g;->m2:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 67
    .line 68
    iget-object v5, v2, La/y6g;->a:La/sjl0;

    .line 69
    .line 70
    iget-object v6, v2, La/y6g;->b:La/g2v;

    .line 71
    .line 72
    iget-object v4, v2, La/y6g;->e:La/ii;

    .line 73
    .line 74
    iget-object v7, v2, La/y6g;->c:La/mne;

    .line 75
    .line 76
    iget-object v8, v2, La/y6g;->d:La/ctf0;

    .line 77
    .line 78
    iget-object v9, v2, La/y6g;->f:La/duj;

    .line 79
    .line 80
    iget-boolean v0, v0, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    iget-object v0, v2, La/y6g;->h:La/ul9;

    .line 85
    .line 86
    :goto_3
    move-object v10, v0

    .line 87
    goto :goto_4

    .line 88
    :cond_3
    iget-object v0, v2, La/y6g;->g:La/ul9;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :goto_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v3, La/qgd;

    .line 104
    .line 105
    invoke-direct/range {v3 .. v10}, La/qgd;-><init>(La/ii;La/sjl0;La/g2v;La/mne;La/ctf0;La/duj;La/ul9;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v3, La/qgd;->h:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, La/n5d0;

    .line 111
    .line 112
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/xdi;

    .line 117
    .line 118
    iput-object v0, p0, La/f7g;->g2:La/xdi;

    .line 119
    .line 120
    iput-object v4, p0, La/f7g;->h2:La/ii;

    .line 121
    .line 122
    iput-object v6, p0, La/f7g;->i2:La/g2v;

    .line 123
    .line 124
    return-void

    .line 125
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 126
    .line 127
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final U0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/f7g;->W0()La/j7g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/j7g;->j:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/wib;

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v2, v0, v4, v3}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

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
    new-instance v1, La/e00;

    .line 21
    .line 22
    const/16 v2, 0x12

    .line 23
    .line 24
    invoke-direct {v1, v0, v4, v2}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/dnq;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, v3, v1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, La/ulb;->H(La/gmq;)La/p5a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, La/lkz;->a:La/lkz;

    .line 38
    .line 39
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, La/clz;->x()La/glz;

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
    new-instance v5, La/b5g;

    .line 52
    .line 53
    const/4 v6, 0x3

    .line 54
    invoke-direct {v5, v0, v1, v4, v6}, La/b5g;-><init>(La/p5a;La/clz;La/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4, v4, v5, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/f7g;->W0()La/j7g;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, La/j7g;->n:La/ol60;

    .line 65
    .line 66
    new-instance v1, La/e7g;

    .line 67
    .line 68
    invoke-direct {v1, p0, v4, v2}, La/e7g;-><init>(La/f7g;La/yje;B)V

    .line 69
    .line 70
    .line 71
    sget-object v2, La/lkz;->a:La/lkz;

    .line 72
    .line 73
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v3, La/fze;

    .line 86
    .line 87
    invoke-direct {v3, v0, p0, v1, v4}, La/fze;-><init>(La/gmq;La/clz;La/e7g;La/yje;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v4, v4, v3, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final V0()La/b7g;
    .locals 2

    .line 1
    sget-object v0, La/f7g;->p2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/f7g;->j2:La/nae0;

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
    check-cast p0, La/b7g;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W0()La/j7g;
    .locals 0

    .line 1
    iget-object p0, p0, La/f7g;->k2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j7g;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g0()V
    .locals 5

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/f7g;->n2:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/b7g;->e:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 13
    .line 14
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/b7g;->e:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 30
    .line 31
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v1, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    new-instance v2, La/fy2;

    .line 48
    .line 49
    const/4 v3, 0x2

    .line 50
    invoke-direct {v2, v0, p0, v3}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v3, 0x1f4

    .line 54
    .line 55
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/b7g;->e:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput-boolean v0, p0, La/f7g;->n2:Z

    .line 16
    .line 17
    invoke-super {p0}, La/sik;->h0()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/stl;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/16 p2, 0x20

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iput-boolean p2, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 28
    .line 29
    :cond_1
    const/4 v0, 0x3

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p1, p1, La/b7g;->e:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 40
    .line 41
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p1, p1, La/b7g;->e:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 53
    .line 54
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v1, La/c7g;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-direct {v1, p0, v2}, La/c7g;-><init>(La/f7g;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v1}, La/hxm0;->y(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p1, p1, La/b7g;->e:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 72
    .line 73
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v1, La/jt6;

    .line 78
    .line 79
    invoke-direct {v1, p0, v0}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object p1, p1, La/b7g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 90
    .line 91
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 92
    .line 93
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget-object v3, v3, La/b7g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-direct {v1, v3, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object p1, p1, La/b7g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 114
    .line 115
    iget-object v1, p0, La/f7g;->l2:La/a8z;

    .line 116
    .line 117
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, La/x6g;

    .line 122
    .line 123
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object p1, p1, La/b7g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 131
    .line 132
    new-instance v1, La/wn8;

    .line 133
    .line 134
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const v3, 0x7f0803ab

    .line 139
    .line 140
    .line 141
    invoke-static {v3, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-direct {v1, v2, p2}, La/wn8;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, La/f7g;->W0()La/j7g;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iget-object v2, p1, La/j7g;->k:La/p7m0;

    .line 156
    .line 157
    new-instance v4, La/e7g;

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    invoke-direct {v4, p0, v5, p2}, La/e7g;-><init>(La/f7g;La/yje;B)V

    .line 161
    .line 162
    .line 163
    sget-object p1, La/lkz;->a:La/lkz;

    .line 164
    .line 165
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance v1, La/fze;

    .line 178
    .line 179
    const/4 v6, 0x0

    .line 180
    invoke-direct/range {v1 .. v6}, La/fze;-><init>(La/gmq;La/clz;La/e7g;La/yje;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {p1, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p1, p1, La/b7g;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 191
    .line 192
    new-instance p2, La/q10;

    .line 193
    .line 194
    const/16 v0, 0xc

    .line 195
    .line 196
    invoke-direct {p2, p0, v0}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method
