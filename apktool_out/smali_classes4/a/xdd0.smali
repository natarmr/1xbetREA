.class public final synthetic La/xdd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bed0;


# direct methods
.method public synthetic constructor <init>(La/bed0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xdd0;->a:B

    iput-object p1, p0, La/xdd0;->b:La/bed0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xdd0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/xdd0;->b:La/bed0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/bed0;->U1:La/fl70;

    .line 10
    .line 11
    invoke-virtual {p0}, La/bed0;->G0()La/f2r;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/f2r;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object p0, p0, La/bed0;->S1:La/ywq;

    .line 24
    .line 25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_1
    sget-object v0, La/bed0;->U1:La/fl70;

    .line 32
    .line 33
    invoke-virtual {p0}, La/bed0;->G0()La/f2r;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, La/f2r;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    iget-object p0, p0, La/bed0;->R1:La/ywq;

    .line 46
    .line 47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_3
    sget-object v0, La/bed0;->U1:La/fl70;

    .line 54
    .line 55
    new-instance v0, La/ry3;

    .line 56
    .line 57
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object p0, p0, La/bed0;->L1:La/kqi;

    .line 62
    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_0
    const-string p0, "pushNotifySettingsViewModelFactory"

    .line 70
    .line 71
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    throw p0

    .line 76
    :pswitch_4
    sget-object v0, La/bed0;->U1:La/fl70;

    .line 77
    .line 78
    invoke-virtual {p0}, La/bed0;->H0()La/ned0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, La/ned0;->w()V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_5
    sget-object v0, La/bed0;->U1:La/fl70;

    .line 89
    .line 90
    invoke-virtual {p0}, La/bed0;->H0()La/ned0;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, La/ned0;->w()V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
