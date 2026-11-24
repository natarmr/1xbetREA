.class public final La/h8g;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/i8g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/h8g;",
        "La/stl;",
        "La/i8g;",
        "<init>",
        "()V",
        "a/kud",
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
.field public static final l2:La/kud;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public g2:La/aei;

.field public h2:La/g2v;

.field public final i2:La/khf0;

.field public final j2:La/kiu0;

.field public final k2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/h8g;

    .line 4
    .line 5
    const-string v2, "screenParams"

    .line 6
    .line 7
    const-string v3, "getScreenParams()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;"

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
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarMonthPickerDialogBinding;"

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
    sput-object v1, La/h8g;->m2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kud;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/h8g;->l2:La/kud;

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
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "PARAMS_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/h8g;->i2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/e8g;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/q7g;

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    invoke-direct {v1, p0, v2}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v3, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v4, La/q7g;

    .line 28
    .line 29
    const/4 v5, 0x5

    .line 30
    invoke-direct {v4, v1, v5}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v3, La/k8g;

    .line 38
    .line 39
    sget-object v4, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, La/r7g;

    .line 46
    .line 47
    invoke-direct {v4, v1, v2}, La/r7g;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v2, La/r7g;

    .line 51
    .line 52
    invoke-direct {v2, v1, v5}, La/r7g;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v3, v4, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/h8g;->j2:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/f8g;->a:La/f8g;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/h8g;->k2:La/nae0;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/h8g;->V0()La/i8g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final T0()V
    .locals 5

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
    const-class v1, La/c8g;

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
    instance-of v3, v0, La/c8g;

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
    check-cast v2, La/c8g;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    sget-object v0, La/h8g;->m2:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/h8g;->i2:La/khf0;

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
    iget-object v1, v2, La/c8g;->a:La/cad;

    .line 69
    .line 70
    iget-object v3, v2, La/c8g;->b:La/duj;

    .line 71
    .line 72
    iget-object v4, v2, La/c8g;->c:La/g2v;

    .line 73
    .line 74
    iget-boolean v0, v0, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    iget-object v0, v2, La/c8g;->e:La/ul9;

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    iget-object v0, v2, La/c8g;->d:La/ul9;

    .line 82
    .line 83
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v2, La/nhf0;

    .line 87
    .line 88
    invoke-direct {v2, v1, v3, v4, v0}, La/nhf0;-><init>(La/cad;La/duj;La/g2v;La/ul9;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, v2, La/nhf0;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, La/n5d0;

    .line 94
    .line 95
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/aei;

    .line 100
    .line 101
    iput-object v0, p0, La/h8g;->g2:La/aei;

    .line 102
    .line 103
    iput-object v4, p0, La/h8g;->h2:La/g2v;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 107
    .line 108
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final U0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/h8g;->j2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/k8g;

    .line 8
    .line 9
    iget-object v2, v1, La/k8g;->h:La/p7m0;

    .line 10
    .line 11
    new-instance v3, La/wib;

    .line 12
    .line 13
    const/16 v4, 0x10

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v3, v1, v5, v4}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    new-instance v4, La/s6n0;

    .line 20
    .line 21
    invoke-direct {v4, v2, v3}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/e00;

    .line 25
    .line 26
    const/16 v3, 0x13

    .line 27
    .line 28
    invoke-direct {v2, v1, v5, v3}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    new-instance v1, La/dnq;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v1, v4, v2, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, La/ulb;->H(La/gmq;)La/p5a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v2, La/lkz;->a:La/lkz;

    .line 42
    .line 43
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, La/b5g;

    .line 56
    .line 57
    const/4 v6, 0x6

    .line 58
    invoke-direct {v4, v1, v2, v5, v6}, La/b5g;-><init>(La/p5a;La/clz;La/yje;B)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    invoke-static {v3, v5, v5, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/k8g;

    .line 70
    .line 71
    iget-object v0, v0, La/k8g;->i:La/p7m0;

    .line 72
    .line 73
    new-instance v2, La/fob;

    .line 74
    .line 75
    const/16 v3, 0x1c

    .line 76
    .line 77
    invoke-direct {v2, p0, v5, v3}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    sget-object v3, La/lkz;->a:La/lkz;

    .line 81
    .line 82
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v4, La/g8g;

    .line 95
    .line 96
    invoke-direct {v4, v0, p0, v2, v5}, La/g8g;-><init>(La/gmq;La/clz;La/fob;La/yje;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v5, v5, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final V0()La/i8g;
    .locals 2

    .line 1
    sget-object v0, La/h8g;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/h8g;->k2:La/nae0;

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
    check-cast p0, La/i8g;

    .line 16
    .line 17
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/stl;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/h8g;->V0()La/i8g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/i8g;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 12
    .line 13
    new-instance p2, La/d8g;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p2, p0, v0}, La/d8g;-><init>(La/h8g;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/h8g;->V0()La/i8g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, La/i8g;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 27
    .line 28
    new-instance p2, La/d8g;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p2, p0, v0}, La/d8g;-><init>(La/h8g;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/h8g;->V0()La/i8g;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p1, p1, La/i8g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/container/monthpicker/numberpicker/CyberCalendarMonthPicker;

    .line 42
    .line 43
    new-instance p2, La/cnc;

    .line 44
    .line 45
    const/16 v0, 0x1b

    .line 46
    .line 47
    invoke-direct {p2, p0, v0}, La/cnc;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lorg/xplatform/cyber/calendar/impl/presentation/container/monthpicker/numberpicker/CyberCalendarMonthPicker;->setOnValueChangedListener(Lkotlin/jvm/functions/Function2;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
