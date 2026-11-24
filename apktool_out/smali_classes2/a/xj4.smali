.class public final synthetic La/xj4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t2g0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hk4;


# direct methods
.method public synthetic constructor <init>(La/hk4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xj4;->a:B

    iput-object p1, p0, La/xj4;->b:La/hk4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/xj4;->a:B

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    iget-object v4, v0, La/xj4;->b:La/hk4;

    .line 9
    .line 10
    packed-switch v2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 17
    .line 18
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v1, v4, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    move-object v5, v0

    .line 30
    check-cast v5, La/tj4;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/16 v16, 0x0

    .line 36
    .line 37
    const v17, 0xfff7

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v15, 0x0

    .line 50
    invoke-static/range {v5 .. v17}, La/tj4;->a(La/tj4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/tj4;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    instance-of v2, v1, La/kl90;

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    move-object v2, v1

    .line 70
    check-cast v2, La/kl90;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object v2, v8

    .line 74
    :goto_0
    if-eqz v2, :cond_2

    .line 75
    .line 76
    check-cast v1, La/kl90;

    .line 77
    .line 78
    iget v6, v1, La/kl90;->a:I

    .line 79
    .line 80
    iget-boolean v7, v1, La/kl90;->b:Z

    .line 81
    .line 82
    new-instance v4, La/hc4;

    .line 83
    .line 84
    const/4 v9, 0x2

    .line 85
    iget-object v5, v0, La/xj4;->b:La/hk4;

    .line 86
    .line 87
    invoke-direct/range {v4 .. v9}, La/hc4;-><init>(La/i3t0;IZLa/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v5, v8, v8, v4, v3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void

    .line 94
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    instance-of v0, v1, Ljava/lang/Integer;

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    move-object v0, v1

    .line 103
    check-cast v0, Ljava/lang/Integer;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move-object v0, v2

    .line 107
    :goto_1
    if-eqz v0, :cond_4

    .line 108
    .line 109
    move-object v0, v1

    .line 110
    check-cast v0, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    new-instance v1, La/gc4;

    .line 117
    .line 118
    const/4 v5, 0x2

    .line 119
    invoke-direct {v1, v4, v0, v2, v5}, La/gc4;-><init>(La/i3t0;ILa/yje;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v4, v2, v2, v1, v3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 123
    .line 124
    .line 125
    :cond_4
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
