.class public final synthetic La/kld0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nld0;


# direct methods
.method public synthetic constructor <init>(La/nld0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kld0;->a:B

    iput-object p1, p0, La/kld0;->b:La/nld0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kld0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/kld0;->b:La/nld0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/nld0;->S1:La/mi70;

    .line 11
    .line 12
    invoke-virtual {v0}, La/nld0;->H0()La/sld0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, La/sld0;->w()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    sget-object v1, La/nld0;->S1:La/mi70;

    .line 23
    .line 24
    invoke-virtual {v0}, La/nld0;->H0()La/sld0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, La/sld0;->w()V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    sget-object v1, La/nld0;->S1:La/mi70;

    .line 35
    .line 36
    new-instance v1, La/jev0;

    .line 37
    .line 38
    new-instance v2, La/yn90;

    .line 39
    .line 40
    invoke-virtual {v0}, La/nld0;->H0()La/sld0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v8, 0x0

    .line 45
    const/16 v9, 0x18

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    const-class v5, La/sld0;

    .line 49
    .line 50
    const-string v6, "onMovedItem"

    .line 51
    .line 52
    const-string v7, "onMovedItem(II)V"

    .line 53
    .line 54
    invoke-direct/range {v2 .. v9}, La/yn90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 55
    .line 56
    .line 57
    new-instance v10, La/b0c0;

    .line 58
    .line 59
    invoke-virtual {v0}, La/nld0;->H0()La/sld0;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v17, 0x10

    .line 66
    .line 67
    const/4 v11, 0x0

    .line 68
    const-string v14, "onUpdatedPositionsFinished"

    .line 69
    .line 70
    const-string v15, "onUpdatedPositionsFinished()V"

    .line 71
    .line 72
    move-object v13, v5

    .line 73
    invoke-direct/range {v10 .. v17}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v1, v2, v10}, La/jev0;-><init>(La/yn90;La/b0c0;)V

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :pswitch_2
    sget-object v1, La/nld0;->S1:La/mi70;

    .line 81
    .line 82
    new-instance v1, La/ry3;

    .line 83
    .line 84
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget-object v0, v0, La/nld0;->L1:La/uqi;

    .line 89
    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_0
    const-string v0, "viewModelFactory"

    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    throw v0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
