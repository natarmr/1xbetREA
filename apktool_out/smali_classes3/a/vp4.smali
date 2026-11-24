.class public final La/vp4;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vp4;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/jdk0",
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
.field public static final n2:La/jdk0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/n0o0;

.field public final l2:La/kiu0;

.field public final m2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vp4;

    .line 4
    .line 5
    const-string v2, "settings"

    .line 6
    .line 7
    const-string v3, "getSettings()Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/vp4;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/jdk0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/vp4;->n2:La/jdk0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/up4;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/up4;-><init>(La/vp4;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/vp4;->k2:La/n0o0;

    .line 15
    .line 16
    new-instance v0, La/up4;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, La/up4;-><init>(La/vp4;B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/pp4;

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    invoke-direct {v1, v0, v2}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v0, La/pp4;

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    invoke-direct {v0, p0, v2}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    sget-object v2, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v3, La/pp4;

    .line 37
    .line 38
    const/4 v4, 0x5

    .line 39
    invoke-direct {v3, v0, v4}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-class v2, La/cq4;

    .line 47
    .line 48
    sget-object v3, La/sre0;->a:La/tre0;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    new-instance v3, La/t51;

    .line 55
    .line 56
    const/16 v4, 0x18

    .line 57
    .line 58
    invoke-direct {v3, v0, v4}, La/t51;-><init>(La/a8z;B)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/t51;

    .line 62
    .line 63
    const/16 v5, 0x19

    .line 64
    .line 65
    invoke-direct {v4, v0, v5}, La/t51;-><init>(La/a8z;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/vp4;->l2:La/kiu0;

    .line 73
    .line 74
    new-instance v0, La/khf0;

    .line 75
    .line 76
    const-string v1, "SETTINGS_EXTRA"

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/vp4;->m2:La/khf0;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 9

    .line 1
    const v0, -0x1653067f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 13
    .line 14
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x3

    .line 19
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/bw5;

    .line 23
    .line 24
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v0, La/un6;

    .line 29
    .line 30
    const/16 v1, 0x17

    .line 31
    .line 32
    invoke-direct {v0, p0, v1}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    const p0, 0x7ccc2532

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const/16 v8, 0xe

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-direct/range {v3 .. v8}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 51
    .line 52
    .line 53
    return-object v3
.end method

.method public final N0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/vp4;->P0()La/cq4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/cq4;->d:La/ol60;

    .line 6
    .line 7
    new-instance v4, La/cm3;

    .line 8
    .line 9
    const/16 v0, 0xd

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct {v4, p0, v5, v0}, La/cm3;-><init>(Ljava/lang/Object;La/yje;B)V

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
    move-result-object p0

    .line 25
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v1, La/ac4;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, La/ac4;-><init>(La/gmq;La/clz;La/cm3;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final P0()La/cq4;
    .locals 0

    .line 1
    iget-object p0, p0, La/vp4;->l2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cq4;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/j94;

    .line 5
    .line 6
    invoke-virtual {p0}, La/vp4;->P0()La/cq4;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v6, 0x0

    .line 11
    const/16 v7, 0xd

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const-class v3, La/cq4;

    .line 15
    .line 16
    const-string v4, "onDatePickerDialogResult"

    .line 17
    .line 18
    const-string v5, "onDatePickerDialogResult(Landroid/os/Bundle;)V"

    .line 19
    .line 20
    invoke-direct/range {v0 .. v7}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    const-string p1, "REQUEST_DATA_HISTORY_DIALOG_KEY"

    .line 24
    .line 25
    invoke-static {p0, p1, v0}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
