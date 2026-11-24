.class public final synthetic La/jkv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lkv;


# direct methods
.method public synthetic constructor <init>(La/lkv;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jkv;->a:B

    iput-object p1, p0, La/jkv;->b:La/lkv;

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
    iget-byte v1, v0, La/jkv;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/jkv;->b:La/lkv;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/lkv;->Q1:La/rqt;

    .line 11
    .line 12
    iget-object v0, v0, La/lkv;->M1:La/kiu0;

    .line 13
    .line 14
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/xkv;

    .line 19
    .line 20
    invoke-virtual {v0}, La/xkv;->w()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    sget-object v1, La/lkv;->Q1:La/rqt;

    .line 27
    .line 28
    new-instance v1, La/hkv;

    .line 29
    .line 30
    new-instance v2, La/vft;

    .line 31
    .line 32
    iget-object v0, v0, La/lkv;->M1:La/kiu0;

    .line 33
    .line 34
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    move-object v4, v3

    .line 39
    check-cast v4, La/xkv;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/16 v9, 0xa

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    const-class v5, La/xkv;

    .line 46
    .line 47
    const-string v6, "onHandShakeToggleClicked"

    .line 48
    .line 49
    const-string v7, "onHandShakeToggleClicked(Lorg/xplatform/shake/impl/presentation/models/HandShakeSettingsHeaderUiModel;)V"

    .line 50
    .line 51
    invoke-direct/range {v2 .. v9}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 52
    .line 53
    .line 54
    new-instance v10, La/vft;

    .line 55
    .line 56
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v12, v0

    .line 61
    check-cast v12, La/xkv;

    .line 62
    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v17, 0xb

    .line 66
    .line 67
    const/4 v11, 0x1

    .line 68
    const-string v14, "onScreenItemClicked"

    .line 69
    .line 70
    const-string v15, "onScreenItemClicked(Lorg/xplatform/shake/impl/presentation/models/HandShakeSettingsScreenUiModel;)V"

    .line 71
    .line 72
    move-object v13, v5

    .line 73
    invoke-direct/range {v10 .. v17}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/s3t;

    .line 80
    .line 81
    const/16 v3, 0xc

    .line 82
    .line 83
    invoke-direct {v0, v3}, La/s3t;-><init>(B)V

    .line 84
    .line 85
    .line 86
    new-instance v3, La/t3t;

    .line 87
    .line 88
    const/16 v4, 0x13

    .line 89
    .line 90
    invoke-direct {v3, v2, v4}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    new-instance v2, La/pkv;

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x3

    .line 97
    invoke-direct {v2, v5, v4}, La/pkv;-><init>(IB)V

    .line 98
    .line 99
    .line 100
    sget-object v4, La/fvr;->z:La/fvr;

    .line 101
    .line 102
    new-instance v6, La/gbn;

    .line 103
    .line 104
    invoke-direct {v6, v0, v2, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 108
    .line 109
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 110
    .line 111
    .line 112
    new-instance v2, La/s3t;

    .line 113
    .line 114
    const/16 v3, 0xd

    .line 115
    .line 116
    invoke-direct {v2, v3}, La/s3t;-><init>(B)V

    .line 117
    .line 118
    .line 119
    new-instance v3, La/t3t;

    .line 120
    .line 121
    const/16 v4, 0x14

    .line 122
    .line 123
    invoke-direct {v3, v10, v4}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    new-instance v4, La/pkv;

    .line 127
    .line 128
    const/4 v6, 0x1

    .line 129
    invoke-direct {v4, v5, v6}, La/pkv;-><init>(IB)V

    .line 130
    .line 131
    .line 132
    sget-object v5, La/fvr;->A:La/fvr;

    .line 133
    .line 134
    new-instance v6, La/gbn;

    .line 135
    .line 136
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :pswitch_1
    sget-object v1, La/lkv;->Q1:La/rqt;

    .line 144
    .line 145
    new-instance v1, La/ry3;

    .line 146
    .line 147
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iget-object v0, v0, La/lkv;->L1:La/mii;

    .line 152
    .line 153
    if-eqz v0, :cond_0

    .line 154
    .line 155
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :cond_0
    const-string v0, "viewModelFactory"

    .line 160
    .line 161
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    throw v0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
