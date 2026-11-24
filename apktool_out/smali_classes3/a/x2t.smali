.class public final synthetic La/x2t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z2t;


# direct methods
.method public synthetic constructor <init>(La/z2t;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x2t;->a:B

    iput-object p1, p0, La/x2t;->b:La/z2t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/x2t;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x2t;->b:La/z2t;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/z2t;->h2:[La/iiy;

    .line 9
    .line 10
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/gxo;->c:La/gxo;

    .line 15
    .line 16
    new-instance v1, La/g3t;

    .line 17
    .line 18
    invoke-direct {v1, v0}, La/g3t;-><init>(La/gxo;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, La/q3t;->C(La/l3t;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/z2t;->h2:[La/iiy;

    .line 28
    .line 29
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v0, La/gxo;->b:La/gxo;

    .line 34
    .line 35
    new-instance v1, La/g3t;

    .line 36
    .line 37
    invoke-direct {v1, v0}, La/g3t;-><init>(La/gxo;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, La/q3t;->C(La/l3t;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    sget-object v0, La/z2t;->h2:[La/iiy;

    .line 47
    .line 48
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v0, La/gxo;->a:La/gxo;

    .line 53
    .line 54
    new-instance v1, La/g3t;

    .line 55
    .line 56
    invoke-direct {v1, v0}, La/g3t;-><init>(La/gxo;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1}, La/q3t;->C(La/l3t;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    sget-object v0, La/z2t;->h2:[La/iiy;

    .line 66
    .line 67
    new-instance v0, La/ry3;

    .line 68
    .line 69
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object p0, p0, La/z2t;->e2:La/z6i;

    .line 74
    .line 75
    if-eqz p0, :cond_0

    .line 76
    .line 77
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_0
    const-string p0, "gamesBetSettingsViewModelFactory"

    .line 82
    .line 83
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    throw p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
