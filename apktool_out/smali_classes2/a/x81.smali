.class public final synthetic La/x81;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n91;


# direct methods
.method public synthetic constructor <init>(La/n91;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x81;->a:B

    iput-object p1, p0, La/x81;->b:La/n91;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x81;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/x81;->b:La/n91;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v18, p1

    .line 11
    .line 12
    check-cast v18, La/ax0;

    .line 13
    .line 14
    sget v1, La/n91;->f0:I

    .line 15
    .line 16
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 17
    .line 18
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-object v2, v0

    .line 28
    check-cast v2, La/u81;

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const v19, 0x17ffff

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const-wide/16 v9, 0x0

    .line 42
    .line 43
    const/4 v11, 0x0

    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v13, 0x0

    .line 46
    const/4 v14, 0x0

    .line 47
    const/4 v15, 0x0

    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    invoke-static/range {v2 .. v19}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_0
    move-object/from16 v1, p1

    .line 64
    .line 65
    check-cast v1, Ljava/lang/Throwable;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, La/n91;->V()V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_1
    move-object/from16 v1, p1

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Throwable;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    instance-of v2, v1, La/jfp;

    .line 87
    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    sget-object v1, La/d81;->a:La/d81;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    new-instance v2, La/c81;

    .line 97
    .line 98
    iget-object v3, v0, La/n91;->o:La/ctf0;

    .line 99
    .line 100
    invoke-static {v1, v3}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v2, v1}, La/c81;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_2
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, Ljava/lang/Throwable;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v1, v0, La/n91;->M:La/v88;

    .line 121
    .line 122
    iget-object v0, v0, La/n91;->r:La/i1w0;

    .line 123
    .line 124
    const-wide/16 v2, 0x0

    .line 125
    .line 126
    const/4 v4, 0x4

    .line 127
    invoke-static {v1, v0, v2, v3, v4}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_3
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, Ljava/lang/Throwable;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, La/n91;->V()V

    .line 144
    .line 145
    .line 146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_4
    move-object/from16 v1, p1

    .line 150
    .line 151
    check-cast v1, Ljava/lang/Throwable;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, La/gq80;->k0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
