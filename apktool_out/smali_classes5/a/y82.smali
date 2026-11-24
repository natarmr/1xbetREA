.class public final La/y82;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0008\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/y82;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qek0",
        "",
        "isMulti",
        "isErrorHeader",
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
.field public static final V1:La/qek0;

.field public static final synthetic W1:[La/iiy;

.field public static final X1:Ljava/lang/String;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/vrk0;

.field public M1:La/wdk0;

.field public final N1:La/zz2;

.field public final O1:La/phf0;

.field public final P1:Z

.field public final Q1:Z

.field public final R1:La/s0r;

.field public final S1:La/a8z;

.field public final U1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/y82;

    .line 4
    .line 5
    const-string v2, "specialEventId"

    .line 6
    .line 7
    const-string v3, "getSpecialEventId()I"

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
    const-string v3, "specialEventTitle"

    .line 16
    .line 17
    const-string v5, "getSpecialEventTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "viewBinding"

    .line 25
    .line 26
    const-string v6, "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentAltDesignLSpecialEventBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v5, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v5, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v5, v0

    .line 41
    .line 42
    sput-object v5, La/y82;->W1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/qek0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/y82;->V1:La/qek0;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, La/y82;->X1:Ljava/lang/String;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d01f1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/y82;->K1:La/e9o0;

    .line 23
    .line 24
    new-instance v0, La/zz2;

    .line 25
    .line 26
    const-string v1, "SPECIAL_EVENT_ID_BUNDLE_KEY"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/y82;->N1:La/zz2;

    .line 32
    .line 33
    new-instance v0, La/phf0;

    .line 34
    .line 35
    const-string v1, "SPECIAL_EVENT_TITLE_BUNDLE_KEY"

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/y82;->O1:La/phf0;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, La/y82;->P1:Z

    .line 44
    .line 45
    iput-boolean v0, p0, La/y82;->Q1:Z

    .line 46
    .line 47
    sget-object v0, La/x82;->a:La/x82;

    .line 48
    .line 49
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/y82;->R1:La/s0r;

    .line 54
    .line 55
    new-instance v0, La/m82;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-direct {v0, p0, v1}, La/m82;-><init>(La/y82;B)V

    .line 59
    .line 60
    .line 61
    sget-object v1, La/wez;->b:La/wez;

    .line 62
    .line 63
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/y82;->S1:La/a8z;

    .line 68
    .line 69
    const-class v0, La/n92;

    .line 70
    .line 71
    sget-object v1, La/sre0;->a:La/tre0;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, La/m82;

    .line 78
    .line 79
    const/4 v2, 0x3

    .line 80
    invoke-direct {v1, p0, v2}, La/m82;-><init>(La/y82;B)V

    .line 81
    .line 82
    .line 83
    const/16 v2, 0xe

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, La/y82;->U1:La/a8z;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/y82;->Q1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object p1, La/y82;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/y82;->R1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/xxq;

    .line 16
    .line 17
    iget-object p1, p1, La/xxq;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    sget-object v0, La/qek0;->h:La/qek0;

    .line 20
    .line 21
    new-instance v1, La/j82;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, La/j82;-><init>(La/y82;B)V

    .line 25
    .line 26
    .line 27
    new-instance v2, La/ugd;

    .line 28
    .line 29
    const v3, -0x40cda10d

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-direct {v2, v3, v4, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {p1, v0, v1, v2}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, La/y82;->M1:La/wdk0;

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-boolean v0, p0, La/y82;->P1:Z

    .line 45
    .line 46
    invoke-static {p1, p0, v0}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    const-string p0, "snackbarManager"

    .line 51
    .line 52
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1
.end method

.method public final C0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/y82;->G0()La/fui;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/fui;->L:La/n5d0;

    .line 6
    .line 7
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/vrk0;

    .line 12
    .line 13
    iput-object v1, p0, La/y82;->L1:La/vrk0;

    .line 14
    .line 15
    iget-object v0, v0, La/fui;->a:La/wdk0;

    .line 16
    .line 17
    iput-object v0, p0, La/y82;->M1:La/wdk0;

    .line 18
    .line 19
    sget-object v0, La/h3l;->a:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {p0}, La/y82;->G0()La/fui;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/fui;->u:La/g3l;

    .line 26
    .line 27
    invoke-virtual {p0}, La/y82;->H0()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v2}, La/h3l;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v2, La/h3l;->a:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    sget-object v0, La/tz00;->a:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-virtual {p0}, La/y82;->G0()La/fui;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/fui;->s:La/sz00;

    .line 53
    .line 54
    invoke-virtual {p0}, La/y82;->H0()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1, v2}, La/tz00;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v2, La/tz00;->a:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object v0, La/ih9;->a:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-virtual {p0}, La/y82;->G0()La/fui;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, La/fui;->t:La/hh9;

    .line 80
    .line 81
    invoke-virtual {p0}, La/y82;->H0()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v1, v2}, La/ih9;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v2, La/ih9;->a:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    sget-object v0, La/xpk0;->a:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-virtual {p0}, La/y82;->G0()La/fui;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v0, v0, La/fui;->w:La/wpk0;

    .line 107
    .line 108
    invoke-virtual {p0}, La/y82;->H0()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget-object p0, p0, La/cb50;->a:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v1, p0}, La/xpk0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    sget-object v1, La/xpk0;->a:Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final G0()La/fui;
    .locals 0

    .line 1
    iget-object p0, p0, La/y82;->S1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fui;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()I
    .locals 2

    .line 1
    sget-object v0, La/y82;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/y82;->N1:La/zz2;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final I0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y82;->U1:La/a8z;

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
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/y82;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, La/a82;->a:La/a82;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final Y()V
    .locals 3

    .line 1
    sget-object v0, La/y82;->X1:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->h0(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La/cb50;->a:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v1, La/xnk0;->a:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {p0}, La/y82;->H0()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1, v0}, La/xnk0;->a(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/xbv0;->a:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {p0}, La/y82;->H0()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1, v0}, La/xbv0;->a(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v1, La/h3l;->a:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-virtual {p0}, La/y82;->H0()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sget-object v2, La/h3l;->a:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-static {v1, v0}, La/h3l;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object v1, La/tz00;->a:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-virtual {p0}, La/y82;->H0()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    sget-object v2, La/tz00;->a:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-static {v1, v0}, La/tz00;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    sget-object v1, La/ih9;->a:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-virtual {p0}, La/y82;->H0()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    sget-object v2, La/ih9;->a:Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-static {v1, v0}, La/ih9;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    sget-object v1, La/xpk0;->a:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    invoke-virtual {p0}, La/y82;->H0()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    sget-object v2, La/xpk0;->a:Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    invoke-static {v1, v0}, La/xpk0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget-object v1, La/n8l0;->a:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-virtual {p0}, La/y82;->H0()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-static {v1, v0}, La/n8l0;->a(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_0
    const/4 v0, 0x1

    .line 103
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 104
    .line 105
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/y82;->P1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y82;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
